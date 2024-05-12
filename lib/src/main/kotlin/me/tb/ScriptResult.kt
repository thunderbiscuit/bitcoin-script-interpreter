package me.tb

public sealed class ScriptResult {
    public data object Success : ScriptResult()
    public data class Failure(val error: String) : ScriptResult()
}
