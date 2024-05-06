package org.example

import org.example.exceptions.OpCodeNotSupported
import org.example.opcodes.executeOpFalse
import org.example.opcodes.executeOpTrue

@OptIn(ExperimentalUnsignedTypes::class)
class BitcoinScript(var script: UByteArray) {
    val stack = mutableListOf<UByteArray>()

    fun validate(): ScriptResult {
        while (script.isNotEmpty()) {
            interpretNextOpcode()
        }

        val stackIs0 = stack.first().contentEquals(ubyteArrayOf(0x00u))
        val stackIsEmpty = stack.first().contentEquals(ubyteArrayOf())

        return if (stackIs0 || stackIsEmpty) {
            ScriptResult.Failure("Script failed")
        } else {
            ScriptResult.Success
        }
    }

    @OptIn(ExperimentalStdlibApi::class)
    private fun interpretNextOpcode() {
        println("Script: ${script.size}")
        println("Stack size: ${stack.size}")
        println("Script hex: ${script.toHexString()}")
        val opCode: OpCode = script.first().toOpCode()

        when (opCode) {
            OpCode.OP_TRUE  -> executeOpTrue()
            OpCode.OP_FALSE -> executeOpFalse()
            else            -> throw OpCodeNotSupported(opCode.value)
        }
    }
}
