package me.tb

import org.junit.jupiter.api.Nested
import kotlin.test.Test
import kotlin.test.assertEquals

class BitcoinScriptTest {
    @Nested
    inner class Success {
        @Test
        fun `Script succeeds when final stack is TRUE`() {
            val script = BitcoinScript(ubyteArrayOf(0x51u))
            val result = script.validate()
            assert(result is ScriptResult.Success)
        }

        @Test
        fun `Script fails when final stack is FALSE`() {
            val script = BitcoinScript(ubyteArrayOf(0x00u))
            val result = script.validate()
            assertEquals(
                expected = ScriptResult.Failure("Script failed"),
                actual = result
            )
        }
        // Taken from Learn Me A Bitcoin
        // https://learnmeabitcoin.com/technical/script/p2pkh/
        @Test
        fun `Scripts can be added together`() {
            val script1 = BitcoinScript("483045022100c233c3a8a510e03ad18b0a24694ef00c78101bfd5ac075b8c1037952ce26e91e02205aa5f8f88f29bb4ad5808ebc12abfd26bd791256f367b04c6d955f01f28a7724012103f0609c81a45f8cab67fc2d050c21b1acd3d37c7acfd54041be6601ab4cef4f31".hexToUByteArray())
            val script2 = BitcoinScript("76a91455ae51684c43435da751ac8d2173b2652eb6410588ac".hexToUByteArray())
            val finalScript = script1 + script2
            val combinedAsm = finalScript.parseAsm().toAsmDisplay()
            assertEquals(
                expected = "OP_DUP OP_HASH160 OP_PUSHBYTES_20 55ae51684c43435da751ac8d2173b2652eb64105 OP_EQUALVERIFY OP_CHECKSIG OP_PUSHBYTES_72 3045022100c233c3a8a510e03ad18b0a24694ef00c78101bfd5ac075b8c1037952ce26e91e02205aa5f8f88f29bb4ad5808ebc12abfd26bd791256f367b04c6d955f01f28a772401 OP_PUSHBYTES_33 03f0609c81a45f8cab67fc2d050c21b1acd3d37c7acfd54041be6601ab4cef4f31",
                actual = combinedAsm
            )
        }
    }
}
