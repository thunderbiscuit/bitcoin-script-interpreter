/*
 * Copyright 2022-2024 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE.txt file.
 */

package me.tb.opcodes

import me.tb.BitcoinScript
import me.tb.exceptions.DataPushException

public fun BitcoinScript.executeOpFalse() {
    this.script = script.copyOfRange(1, script.size)
    this.stack.add(ubyteArrayOf())
}

public fun BitcoinScript.executeOpPushBytes() {
    throw DataPushException("Data push opcode should not be part of ASM when explicitAsm = false")
}

public fun BitcoinScript.executeOpPushData() {
    throw DataPushException("Data push opcode should not be part of ASM when explicitAsm = false")
}

public fun BitcoinScript.executeOpTrue() {
    this.script = script.copyOfRange(1, script.size)
    this.stack.add(ubyteArrayOf(0x01u))
}
