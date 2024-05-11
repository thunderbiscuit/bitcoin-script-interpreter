package me.tb.exceptions

class OpCodeNotSupported(byte: UByte) : Exception("Opcode not supported: $byte")
