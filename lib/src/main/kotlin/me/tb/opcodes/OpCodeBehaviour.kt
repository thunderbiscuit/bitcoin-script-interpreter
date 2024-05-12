package me.tb.opcodes

import me.tb.BitcoinScript

public fun BitcoinScript.executeOpTrue() {
    this.script = script.copyOfRange(1, script.size)
    this.stack.add(ubyteArrayOf(0x01u))
}

public fun BitcoinScript.executeOpFalse() {
    this.script = script.copyOfRange(1, script.size)
    this.stack.add(ubyteArrayOf())
}
