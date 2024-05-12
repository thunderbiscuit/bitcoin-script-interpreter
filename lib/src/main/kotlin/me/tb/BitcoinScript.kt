package me.tb

import me.tb.exceptions.OpCodeNotSupported
import me.tb.opcodes.OpCode
import me.tb.opcodes.executeOpFalse
import me.tb.opcodes.executeOpTrue
import me.tb.opcodes.OpCode.*
import me.tb.opcodes.PushDataNumber
import me.tb.opcodes.ScriptData
import me.tb.opcodes.ScriptElement

public class BitcoinScript(public var script: UByteArray) {
    public val scriptReader: ScriptReader = ScriptReader(script)
    public val stack: MutableList<UByteArray> = mutableListOf<UByteArray>()

    public fun parseAsm(): List<ScriptElement> {
        val asm = mutableListOf<ScriptElement>()

        while (!scriptReader.isEmpty()) {
            val opCode: OpCode = scriptReader.getNextByte().toOpCode()

            when (opCode) {
                OP_FALSE -> asm.add(OP_FALSE)
                OP_PUSHBYTES_1 -> {
                    asm.add(OP_PUSHBYTES_1)
                    val data = scriptReader.getNext(1u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_2 -> {
                    asm.add(OP_PUSHBYTES_2)
                    val data = scriptReader.getNext(2u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_3 -> {
                    asm.add(OP_PUSHBYTES_3)
                    val data = scriptReader.getNext(3u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_4 -> {
                    asm.add(OP_PUSHBYTES_4)
                    val data = scriptReader.getNext(4u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_5 -> {
                    asm.add(OP_PUSHBYTES_5)
                    val data = scriptReader.getNext(5u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_6 -> {
                    asm.add(OP_PUSHBYTES_6)
                    val data = scriptReader.getNext(6u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_7 -> {
                    asm.add(OP_PUSHBYTES_7)
                    val data = scriptReader.getNext(7u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_8 -> {
                    asm.add(OP_PUSHBYTES_8)
                    val data = scriptReader.getNext(8u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_9 -> {
                    asm.add(OP_PUSHBYTES_9)
                    val data = scriptReader.getNext(9u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_10 -> {
                    asm.add(OP_PUSHBYTES_10)
                    val data = scriptReader.getNext(10u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_11 -> {
                    asm.add(OP_PUSHBYTES_11)
                    val data = scriptReader.getNext(11u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_12 -> {
                    asm.add(OP_PUSHBYTES_12)
                    val data = scriptReader.getNext(12u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_13 -> {
                    asm.add(OP_PUSHBYTES_13)
                    val data = scriptReader.getNext(13u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_14 -> {
                    asm.add(OP_PUSHBYTES_14)
                    val data = scriptReader.getNext(14u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_15 -> {
                    asm.add(OP_PUSHBYTES_15)
                    val data = scriptReader.getNext(15u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_16 -> {
                    asm.add(OP_PUSHBYTES_16)
                    val data = scriptReader.getNext(16u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_17 -> {
                    asm.add(OP_PUSHBYTES_17)
                    val data = scriptReader.getNext(17u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_18 -> {
                    asm.add(OP_PUSHBYTES_18)
                    val data = scriptReader.getNext(18u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_19 -> {
                    asm.add(OP_PUSHBYTES_19)
                    val data = scriptReader.getNext(19u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_20 -> {
                    asm.add(OP_PUSHBYTES_20)
                    val data = scriptReader.getNext(20u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_21 -> {
                    asm.add(OP_PUSHBYTES_21)
                    val data = scriptReader.getNext(21u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_22 -> {
                    asm.add(OP_PUSHBYTES_22)
                    val data = scriptReader.getNext(22u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_23 -> {
                    asm.add(OP_PUSHBYTES_23)
                    val data = scriptReader.getNext(23u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_24 -> {
                    asm.add(OP_PUSHBYTES_24)
                    val data = scriptReader.getNext(24u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_25 -> {
                    asm.add(OP_PUSHBYTES_25)
                    val data = scriptReader.getNext(25u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_26 -> {
                    asm.add(OP_PUSHBYTES_26)
                    val data = scriptReader.getNext(26u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_27 -> {
                    asm.add(OP_PUSHBYTES_27)
                    val data = scriptReader.getNext(27u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_28 -> {
                    asm.add(OP_PUSHBYTES_28)
                    val data = scriptReader.getNext(28u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_29 -> {
                    asm.add(OP_PUSHBYTES_29)
                    val data = scriptReader.getNext(29u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_30 -> {
                    asm.add(OP_PUSHBYTES_30)
                    val data = scriptReader.getNext(30u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_31 -> {
                    asm.add(OP_PUSHBYTES_31)
                    val data = scriptReader.getNext(31u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_32 -> {
                    asm.add(OP_PUSHBYTES_32)
                    val data = scriptReader.getNext(32u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_33 -> {
                    asm.add(OP_PUSHBYTES_33)
                    val data = scriptReader.getNext(33u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_34 -> {
                    asm.add(OP_PUSHBYTES_34)
                    val data = scriptReader.getNext(34u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_35 -> {
                    asm.add(OP_PUSHBYTES_35)
                    val data = scriptReader.getNext(35u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_36 -> {
                    asm.add(OP_PUSHBYTES_36)
                    val data = scriptReader.getNext(36u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_37 -> {
                    asm.add(OP_PUSHBYTES_37)
                    val data = scriptReader.getNext(37u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_38 -> {
                    asm.add(OP_PUSHBYTES_38)
                    val data = scriptReader.getNext(38u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_39 -> {
                    asm.add(OP_PUSHBYTES_39)
                    val data = scriptReader.getNext(39u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_40 -> {
                    asm.add(OP_PUSHBYTES_40)
                    val data = scriptReader.getNext(40u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_41 -> {
                    asm.add(OP_PUSHBYTES_41)
                    val data = scriptReader.getNext(41u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_42 -> {
                    asm.add(OP_PUSHBYTES_42)
                    val data = scriptReader.getNext(42u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_43 -> {
                    asm.add(OP_PUSHBYTES_43)
                    val data = scriptReader.getNext(43u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_44 -> {
                    asm.add(OP_PUSHBYTES_44)
                    val data = scriptReader.getNext(44u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_45 -> {
                    asm.add(OP_PUSHBYTES_45)
                    val data = scriptReader.getNext(45u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_46 -> {
                    asm.add(OP_PUSHBYTES_46)
                    val data = scriptReader.getNext(46u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_47 -> {
                    asm.add(OP_PUSHBYTES_47)
                    val data = scriptReader.getNext(47u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_48 -> {
                    asm.add(OP_PUSHBYTES_48)
                    val data = scriptReader.getNext(48u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_49 -> {
                    asm.add(OP_PUSHBYTES_49)
                    val data = scriptReader.getNext(49u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_50 -> {
                    asm.add(OP_PUSHBYTES_50)
                    val data = scriptReader.getNext(50u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_51 -> {
                    asm.add(OP_PUSHBYTES_51)
                    val data = scriptReader.getNext(51u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_52 -> {
                    asm.add(OP_PUSHBYTES_52)
                    val data = scriptReader.getNext(52u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_53 -> {
                    asm.add(OP_PUSHBYTES_53)
                    val data = scriptReader.getNext(53u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_54 -> {
                    asm.add(OP_PUSHBYTES_54)
                    val data = scriptReader.getNext(54u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_55 -> {
                    asm.add(OP_PUSHBYTES_55)
                    val data = scriptReader.getNext(55u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_56 -> {
                    asm.add(OP_PUSHBYTES_56)
                    val data = scriptReader.getNext(56u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_57 -> {
                    asm.add(OP_PUSHBYTES_57)
                    val data = scriptReader.getNext(57u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_58 -> {
                    asm.add(OP_PUSHBYTES_58)
                    val data = scriptReader.getNext(58u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_59 -> {
                    asm.add(OP_PUSHBYTES_59)
                    val data = scriptReader.getNext(59u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_60 -> {
                    asm.add(OP_PUSHBYTES_60)
                    val data = scriptReader.getNext(60u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_61 -> {
                    asm.add(OP_PUSHBYTES_61)
                    val data = scriptReader.getNext(61u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_62 -> {
                    asm.add(OP_PUSHBYTES_62)
                    val data = scriptReader.getNext(62u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_63 -> {
                    asm.add(OP_PUSHBYTES_63)
                    val data = scriptReader.getNext(63u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_64 -> {
                    asm.add(OP_PUSHBYTES_64)
                    val data = scriptReader.getNext(64u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_65 -> {
                    asm.add(OP_PUSHBYTES_65)
                    val data = scriptReader.getNext(65u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_66 -> {
                    asm.add(OP_PUSHBYTES_66)
                    val data = scriptReader.getNext(66u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_67 -> {
                    asm.add(OP_PUSHBYTES_67)
                    val data = scriptReader.getNext(67u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_68 -> {
                    asm.add(OP_PUSHBYTES_68)
                    val data = scriptReader.getNext(68u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_69 -> {
                    asm.add(OP_PUSHBYTES_69)
                    val data = scriptReader.getNext(69u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_70 -> {
                    asm.add(OP_PUSHBYTES_70)
                    val data = scriptReader.getNext(70u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_71 -> {
                    asm.add(OP_PUSHBYTES_71)
                    val data = scriptReader.getNext(71u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_72 -> {
                    asm.add(OP_PUSHBYTES_72)
                    val data = scriptReader.getNext(72u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_73 -> {
                    asm.add(OP_PUSHBYTES_73)
                    val data = scriptReader.getNext(73u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_74 -> {
                    asm.add(OP_PUSHBYTES_74)
                    val data = scriptReader.getNext(74u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_75 -> {
                    asm.add(OP_PUSHBYTES_75)
                    val data = scriptReader.getNext(75u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHDATA1 -> {
                    asm.add(OP_PUSHDATA1)
                    val dataLength = scriptReader.getNext(1u).littleEndianToUInt()
                    asm.add(PushDataNumber(dataLength))
                    val data = scriptReader.getNext(dataLength)
                    asm.add(ScriptData(data))
                }
                OP_PUSHDATA2 -> {
                    asm.add(OP_PUSHDATA2)
                    val dataLength = scriptReader.getNext(2u).littleEndianToUInt()
                    asm.add(PushDataNumber(dataLength))
                    val data = scriptReader.getNext(dataLength)
                    asm.add(ScriptData(data))
                }
                OP_PUSHDATA4 -> {
                    asm.add(OP_PUSHDATA4)
                    val dataLength = scriptReader.getNext(4u).littleEndianToUInt()
                    asm.add(PushDataNumber(dataLength))
                    val data = scriptReader.getNext(dataLength)
                    asm.add(ScriptData(data))
                }
                OP_TRUE  -> asm.add(OP_TRUE)
                else     -> throw OpCodeNotSupported(opCode.value)
            }
        }
        return asm
    }

    public fun validate(): ScriptResult {
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
