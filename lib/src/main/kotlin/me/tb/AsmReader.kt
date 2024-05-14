package me.tb

import me.tb.opcodes.ScriptElement

public class AsmReader(private var asm: MutableList<ScriptElement>) {
    public fun next(): ScriptElement {
        return asm.removeAt(0)
    }

    public fun isEmpty(): Boolean {
        return asm.isEmpty()
    }
}
