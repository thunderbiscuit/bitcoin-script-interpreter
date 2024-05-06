package org.example

sealed class ScriptResult {
    data object Success : ScriptResult()
    data class Failure(val error: String) : ScriptResult()
}
