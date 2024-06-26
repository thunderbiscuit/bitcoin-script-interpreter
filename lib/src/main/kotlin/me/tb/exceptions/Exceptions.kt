/*
 * Copyright 2022-2024 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE.txt file.
 */

package me.tb.exceptions

public class OpCodeNotSupported(byte: UByte) : Exception("Opcode not supported: $byte")
public class DataPushException(message: String) : Exception(message)