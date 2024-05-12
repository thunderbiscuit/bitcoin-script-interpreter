package me.tb

import org.junit.jupiter.api.Nested
import kotlin.test.Test
import kotlin.test.assertEquals

class BitcoinScriptTest {
    @Nested
    inner class Success {
        @Test
        fun `Script succeeds when final stack is TRUE`() {
            val script = BitcoinScript(ubyteArrayOf(0x01u))
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
    }

    @Nested
    inner class PrintOuts {
        @Test
        fun `Print out simple script in ASM`() {
            val script = BitcoinScript(ubyteArrayOf(0x51u, 0x00u, 0x51u, 0x00u))
            println(script.parseAsm().toAsmDisplay())
        }

        @Test
        fun `Print out simple script in ASM 2`() {
            val script = BitcoinScript(ubyteArrayOf(0x51u, 0x01u, 0xaeu, 0x00u))
            println(script.parseAsm().toAsmDisplay())
        }

        @Test
        fun `Print out simple script in ASM 4`() {
            val script = BitcoinScript("3ea4b5c6d7e8f90a1b2c3d4e5fa0b1c2d3e4f56a7b8c9da0b1c2d3e4f57a8b9c0d1e2fa3b4c5d6e7f89a0b1c2d3e4fa5b6c7d8e9f01a2b3c4d5e6fa7b8c90d".hexToUByteArray())
            println(script.parseAsm().toAsmDisplay())
        }

        @Test
        fun `Print out simple script in ASM 7`() {
            val bytes = "4d9001a4b5c6d7e8f90a1b2c3d4e5fa0b1c2d3e4f56a7b8c9da0b1c2d3e4f57a8b9c0d1e2fa3b4c5d6e7f89a0b1c2d3e4fa5b6c7d8e9f01a2b3c4d5e6fa7b8c90d1e2fa4b5c6d7e8f92a3b4c5d2ea4b5c6d7e8f90a1b2c3d4e5fa0b1c2d3e4f56a7b8c9da0b1c2d3e4f57a8b9c0d1e2fa3b4c5d6e7f89a0b1c2d3e4fa5b6c7d8e9f01a2b3c4d5e6fa7b8c90d1e2fa4b5c6d7e8f92a3b4c5d2ea4b5c6d7e8f90a1b2c3d4e5fa0b1c2d3e4f56a7b8c9da0b1c2d3e4f57a8b9c0d1e2fa3b4c5d6e7f89a0b1c2d3e4fa5b6c7d8e9f01a2b3c4d5e6fa7b8c90d1e2fa4b5c6d7e8f92a3b4c5d2ea4b5c6d7e8f90a1b2c3d4e5fa0b1c2d3e4f56a7b8c9da0b1c2d3e4f57a8b9c0d1e2fa3b4c5d6e7f89a0b1c2d3e4fa5b6c7d8e9f01a2b3c4d5e6fa7b8c90d1e2fa4b5c6d7e8f92a3b4c5d2ea4b5c6d7e8f90a1b2c3d4e5fa0b1c2d3e4f56a7b8c9da0b1c2d3e4f57a8b9c0d1e2fa3b4c5d6e7f89a0b1c2d3e4fa5b6c7d8e9f01a2b3c4d5e6fa7b8c90d1e2fa4b5c6d7e8f92a3b4c5d2ea4b5c6d7e8f90a1b2c3d4e5fa0b1c2d3e4f56a7b8c9da0b1c2".hexToUByteArray()
            val script = BitcoinScript(bytes)
            println(script.parseAsm().toAsmDisplay())
        }
    }
}
