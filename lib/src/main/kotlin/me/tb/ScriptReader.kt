/*
 * Copyright 2022-2024 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE.txt file.
 */

package me.tb

public class ScriptReader(private var rawScript: UByteArray) {
    public fun get(): UByteArray {
        return rawScript
    }

    fun getNext(length: Int): UByteArray {
        if (length > rawScript.size) {
            throw IllegalArgumentException("Requested length $length exceeds remaining transaction data ${rawScript.size}")
        }
        val data = rawScript.copyOfRange(0, length)
        rawScript = rawScript.copyOfRange(length, rawScript.size)
        return data
    }

    fun getNextByte(): UByte {
        return getNext(1).first()
    }

    public fun isEmpty(): Boolean {
        return rawScript.isEmpty()
    }
}
