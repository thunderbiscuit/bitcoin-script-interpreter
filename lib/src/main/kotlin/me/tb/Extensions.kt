/*
 * Copyright 2022-2024 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE.txt file.
 */

package me.tb

import me.tb.opcodes.OpCode
import me.tb.opcodes.PushDataNumber
import me.tb.opcodes.ScriptData
import me.tb.opcodes.ScriptElement
import java.nio.ByteBuffer
import java.nio.ByteOrder

public fun List<ScriptElement>.toAsmDisplay(): String {
    return this.joinToString(" ") {
        when (it) {
            is OpCode         -> it.name
            is ScriptData     -> it.data.toHexString()
            is PushDataNumber -> it.number.toString()
        }
    }
}

public fun UByte.toOpCode(): OpCode {
    return OpCode.entries.firstOrNull { it.value == this } ?: throw IllegalArgumentException("Invalid OpCode")
}

public fun UByteArray.littleEndianToUInt(): UInt {
    require(this.size <= 4) { "UByteArray must be 4 bytes or less to return UInt" }
    val buffer = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN)
    buffer.put(this.toByteArray())
    buffer.rewind()
    val number = buffer.int.toUInt()
    return number
}
