package me.tb

fun List<ScriptElement>.toAsmDisplay(): String {
    return this.joinToString(" ") {
        when (it) {
            is OpCode -> it.name
            is ScriptData -> it.data.toHexString()
        }
    }
}

public fun UByte.toOpCode(): OpCode {
    return OpCode.entries.firstOrNull { it.value == this } ?: OpCode.OTHER
}
