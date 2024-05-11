package me.tb.opcodes

import me.tb.BitcoinScript

fun BitcoinScript.executeOpTrue() {
    this.script = script.copyOfRange(1, script.size)
    this.stack.add(ubyteArrayOf(0x01u))
}

fun BitcoinScript.executeOpFalse() {
    println("Executing OP_FALSE")
    println("The script is ${this.script.toHexString()}")
    this.script = script.copyOfRange(1, script.size)
    // this.script.drop(1).toUByteArray()
    println("The script is now ${this.script.toHexString()}")
    this.stack.add(ubyteArrayOf())
}
