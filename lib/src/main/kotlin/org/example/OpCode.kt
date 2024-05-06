package org.example

enum class OpCode(val value: UByte) {
    OP_FALSE(0x00u),
    OP_TRUE(0x01u),
    OTHER(0xffu)
}

fun UByte.toOpCode(): OpCode {
    return OpCode.entries.firstOrNull { it.value == this } ?: OpCode.OTHER
}
