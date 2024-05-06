package org.example.exceptions

class OpCodeNotSupported(byte: UByte) : Exception("Opcode not supported: $byte")
