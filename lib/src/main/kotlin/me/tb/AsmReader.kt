/*
 * Copyright 2022-2024 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE.txt file.
 */

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
