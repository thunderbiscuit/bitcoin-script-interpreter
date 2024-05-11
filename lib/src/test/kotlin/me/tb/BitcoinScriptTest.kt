/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package me.tb

import org.junit.jupiter.api.Nested
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalUnsignedTypes::class)
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
}