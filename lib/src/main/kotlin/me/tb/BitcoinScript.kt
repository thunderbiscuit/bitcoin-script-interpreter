package me.tb

import me.tb.exceptions.OpCodeNotSupported
import me.tb.opcodes.executeOpFalse
import me.tb.opcodes.executeOpTrue

@OptIn(ExperimentalUnsignedTypes::class, ExperimentalStdlibApi::class)
class BitcoinScript(var script: UByteArray) {
    val scriptReader = ScriptReader(script)
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
