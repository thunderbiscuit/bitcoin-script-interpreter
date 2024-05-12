/*
 * Copyright 2022-2024 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE.txt file.
 */

package me.tb

public class ScriptReader(private var rawScript: UByteArray) {
    public fun get(): UByteArray {
        return rawScript
    }

    public fun getNext(length: UInt): UByteArray {
        if (length > rawScript.size.toUInt()) {
            throw IllegalArgumentException("Requested length $length exceeds remaining transaction data ${rawScript.size}")
        }
        if (length > Int.MAX_VALUE.toUInt()) {
            throw IllegalArgumentException("Known bug of this library: requested length $length exceeds maximum Int value")
        }
        val data = rawScript.copyOfRange(0, length.toInt())
        rawScript = rawScript.copyOfRange(length.toInt(), rawScript.size)
        return data
    }

    public fun getNextByte(): UByte {
        return getNext(1u).first()
    }

    public fun isEmpty(): Boolean {
        return rawScript.isEmpty()
    }
}
