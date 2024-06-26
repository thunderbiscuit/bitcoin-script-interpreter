/*
 * Copyright 2022-2024 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE.txt file.
 */

package me.tb

public sealed class ScriptResult {
    public data object Success : ScriptResult()
    public data class Failure(val error: String) : ScriptResult()
}
