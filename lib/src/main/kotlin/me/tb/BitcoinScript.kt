package me.tb

import me.tb.exceptions.OpCodeNotSupported
import me.tb.opcodes.executeOpFalse
import me.tb.opcodes.executeOpTrue
import me.tb.OpCode.*

class BitcoinScript(var script: UByteArray) {
    val scriptReader = ScriptReader(script)
    val stack = mutableListOf<UByteArray>()

    fun parseAsm(): List<ScriptElement> {
        val asm = mutableListOf<ScriptElement>()

        while (!scriptReader.isEmpty()) {
            val opCode: OpCode = scriptReader.getNextByte().toOpCode()

            when (opCode) {
                OP_FALSE -> asm.add(OP_FALSE)
                OP_PUSHBYTES_1 -> {
                    asm.add(OP_PUSHBYTES_1)
                    val data = scriptReader.getNext(1)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_2 -> {
                    asm.add(OP_PUSHBYTES_2)
                    val data = scriptReader.getNext(2)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_3 -> {
                    asm.add(OP_PUSHBYTES_3)
                    val data = scriptReader.getNext(3)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_4 -> {
                    asm.add(OP_PUSHBYTES_4)
                    val data = scriptReader.getNext(4)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_5 -> {
                    asm.add(OP_PUSHBYTES_5)
                    val data = scriptReader.getNext(5)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_6 -> {
                    asm.add(OP_PUSHBYTES_6)
                    val data = scriptReader.getNext(6)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_7 -> {
                    asm.add(OP_PUSHBYTES_7)
                    val data = scriptReader.getNext(7)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_8 -> {
                    asm.add(OP_PUSHBYTES_8)
                    val data = scriptReader.getNext(8)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_9 -> {
                    asm.add(OP_PUSHBYTES_9)
                    val data = scriptReader.getNext(9)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_10 -> {
                    asm.add(OP_PUSHBYTES_10)
                    val data = scriptReader.getNext(10)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_11 -> {
                    asm.add(OP_PUSHBYTES_11)
                    val data = scriptReader.getNext(11)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_12 -> {
                    asm.add(OP_PUSHBYTES_12)
                    val data = scriptReader.getNext(12)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_13 -> {
                    asm.add(OP_PUSHBYTES_13)
                    val data = scriptReader.getNext(13)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_14 -> {
                    asm.add(OP_PUSHBYTES_14)
                    val data = scriptReader.getNext(14)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_15 -> {
                    asm.add(OP_PUSHBYTES_15)
                    val data = scriptReader.getNext(15)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_16 -> {
                    asm.add(OP_PUSHBYTES_16)
                    val data = scriptReader.getNext(16)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_17 -> {
                    asm.add(OP_PUSHBYTES_17)
                    val data = scriptReader.getNext(17)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_18 -> {
                    asm.add(OP_PUSHBYTES_18)
                    val data = scriptReader.getNext(18)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_19 -> {
                    asm.add(OP_PUSHBYTES_19)
                    val data = scriptReader.getNext(19)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_20 -> {
                    asm.add(OP_PUSHBYTES_20)
                    val data = scriptReader.getNext(20)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_21 -> {
                    asm.add(OP_PUSHBYTES_21)
                    val data = scriptReader.getNext(21)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_22 -> {
                    asm.add(OP_PUSHBYTES_22)
                    val data = scriptReader.getNext(22)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_23 -> {
                    asm.add(OP_PUSHBYTES_23)
                    val data = scriptReader.getNext(23)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_24 -> {
                    asm.add(OP_PUSHBYTES_24)
                    val data = scriptReader.getNext(24)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_25 -> {
                    asm.add(OP_PUSHBYTES_25)
                    val data = scriptReader.getNext(25)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_26 -> {
                    asm.add(OP_PUSHBYTES_26)
                    val data = scriptReader.getNext(26)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_27 -> {
                    asm.add(OP_PUSHBYTES_27)
                    val data = scriptReader.getNext(27)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_28 -> {
                    asm.add(OP_PUSHBYTES_28)
                    val data = scriptReader.getNext(28)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_29 -> {
                    asm.add(OP_PUSHBYTES_29)
                    val data = scriptReader.getNext(29)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_30 -> {
                    asm.add(OP_PUSHBYTES_30)
                    val data = scriptReader.getNext(30)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_31 -> {
                    asm.add(OP_PUSHBYTES_31)
                    val data = scriptReader.getNext(31)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_32 -> {
                    asm.add(OP_PUSHBYTES_32)
                    val data = scriptReader.getNext(32)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_33 -> {
                    asm.add(OP_PUSHBYTES_33)
                    val data = scriptReader.getNext(33)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_34 -> {
                    asm.add(OP_PUSHBYTES_34)
                    val data = scriptReader.getNext(34)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_35 -> {
                    asm.add(OP_PUSHBYTES_35)
                    val data = scriptReader.getNext(35)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_36 -> {
                    asm.add(OP_PUSHBYTES_36)
                    val data = scriptReader.getNext(36)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_37 -> {
                    asm.add(OP_PUSHBYTES_37)
                    val data = scriptReader.getNext(37)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_38 -> {
                    asm.add(OP_PUSHBYTES_38)
                    val data = scriptReader.getNext(38)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_39 -> {
                    asm.add(OP_PUSHBYTES_39)
                    val data = scriptReader.getNext(39)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_40 -> {
                    asm.add(OP_PUSHBYTES_40)
                    val data = scriptReader.getNext(40)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_41 -> {
                    asm.add(OP_PUSHBYTES_41)
                    val data = scriptReader.getNext(41)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_42 -> {
                    asm.add(OP_PUSHBYTES_42)
                    val data = scriptReader.getNext(42)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_43 -> {
                    asm.add(OP_PUSHBYTES_43)
                    val data = scriptReader.getNext(43)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_44 -> {
                    asm.add(OP_PUSHBYTES_44)
                    val data = scriptReader.getNext(44)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_45 -> {
                    asm.add(OP_PUSHBYTES_45)
                    val data = scriptReader.getNext(45)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_46 -> {
                    asm.add(OP_PUSHBYTES_46)
                    val data = scriptReader.getNext(46)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_47 -> {
                    asm.add(OP_PUSHBYTES_47)
                    val data = scriptReader.getNext(47)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_48 -> {
                    asm.add(OP_PUSHBYTES_48)
                    val data = scriptReader.getNext(48)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_49 -> {
                    asm.add(OP_PUSHBYTES_49)
                    val data = scriptReader.getNext(49)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_50 -> {
                    asm.add(OP_PUSHBYTES_50)
                    val data = scriptReader.getNext(50)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_51 -> {
                    asm.add(OP_PUSHBYTES_51)
                    val data = scriptReader.getNext(51)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_52 -> {
                    asm.add(OP_PUSHBYTES_52)
                    val data = scriptReader.getNext(52)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_53 -> {
                    asm.add(OP_PUSHBYTES_53)
                    val data = scriptReader.getNext(53)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_54 -> {
                    asm.add(OP_PUSHBYTES_54)
                    val data = scriptReader.getNext(54)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_55 -> {
                    asm.add(OP_PUSHBYTES_55)
                    val data = scriptReader.getNext(55)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_56 -> {
                    asm.add(OP_PUSHBYTES_56)
                    val data = scriptReader.getNext(56)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_57 -> {
                    asm.add(OP_PUSHBYTES_57)
                    val data = scriptReader.getNext(57)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_58 -> {
                    asm.add(OP_PUSHBYTES_58)
                    val data = scriptReader.getNext(58)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_59 -> {
                    asm.add(OP_PUSHBYTES_59)
                    val data = scriptReader.getNext(59)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_60 -> {
                    asm.add(OP_PUSHBYTES_60)
                    val data = scriptReader.getNext(60)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_61 -> {
                    asm.add(OP_PUSHBYTES_61)
                    val data = scriptReader.getNext(61)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_62 -> {
                    asm.add(OP_PUSHBYTES_62)
                    val data = scriptReader.getNext(62)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_63 -> {
                    asm.add(OP_PUSHBYTES_63)
                    val data = scriptReader.getNext(63)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_64 -> {
                    asm.add(OP_PUSHBYTES_64)
                    val data = scriptReader.getNext(64)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_65 -> {
                    asm.add(OP_PUSHBYTES_65)
                    val data = scriptReader.getNext(65)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_66 -> {
                    asm.add(OP_PUSHBYTES_66)
                    val data = scriptReader.getNext(66)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_67 -> {
                    asm.add(OP_PUSHBYTES_67)
                    val data = scriptReader.getNext(67)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_68 -> {
                    asm.add(OP_PUSHBYTES_68)
                    val data = scriptReader.getNext(68)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_69 -> {
                    asm.add(OP_PUSHBYTES_69)
                    val data = scriptReader.getNext(69)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_70 -> {
                    asm.add(OP_PUSHBYTES_70)
                    val data = scriptReader.getNext(70)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_71 -> {
                    asm.add(OP_PUSHBYTES_71)
                    val data = scriptReader.getNext(71)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_72 -> {
                    asm.add(OP_PUSHBYTES_72)
                    val data = scriptReader.getNext(72)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_73 -> {
                    asm.add(OP_PUSHBYTES_73)
                    val data = scriptReader.getNext(73)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_74 -> {
                    asm.add(OP_PUSHBYTES_74)
                    val data = scriptReader.getNext(74)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_75 -> {
                    asm.add(OP_PUSHBYTES_75)
                    val data = scriptReader.getNext(75)
                    asm.add(ScriptData(data))
                }
                OP_TRUE  -> asm.add(OP_TRUE)
                else     -> throw OpCodeNotSupported(opCode.value)
            }
        }
        return asm
    }

    fun validate(): ScriptResult {
        while (script.isNotEmpty()) {
            interpretNextOpcode()
        }

        val stackIs0 = stack.first().contentEquals(ubyteArrayOf(0x00u))
        val stackIsEmpty = stack.first().contentEquals(ubyteArrayOf())

        return if (stackIs0 || stackIsEmpty) {
            ScriptResult.Failure("Script failed")
        } else {
            ScriptResult.Success
        }
    }

    private fun interpretNextOpcode() {
        println("Script: ${script.size}")
        println("Stack size: ${stack.size}")
        println("Script hex: ${script.toHexString()}")
        val opCode: OpCode = script.first().toOpCode()

        when (opCode) {
            OP_TRUE  -> executeOpTrue()
            OP_FALSE -> executeOpFalse()
            else     -> throw OpCodeNotSupported(opCode.value)
        }
    }
}
