/*
 * Copyright 2022-2024 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE.txt file.
 */

package me.tb

import me.tb.exceptions.OpCodeNotSupported
import me.tb.opcodes.OpCode
import me.tb.opcodes.executeOpFalse
import me.tb.opcodes.executeOpTrue
import me.tb.opcodes.OpCode.*
import me.tb.opcodes.PushDataNumber
import me.tb.opcodes.ScriptData
import me.tb.opcodes.ScriptElement
import me.tb.opcodes.executeOpPushBytes
import me.tb.opcodes.executeOpPushData

public class BitcoinScript(public var script: UByteArray) {
    private val scriptReader: ScriptReader = ScriptReader(script)
    public val stack: MutableList<UByteArray> = mutableListOf<UByteArray>()

    public fun parseAsm(
        explicitAsm: Boolean = true
    ): List<ScriptElement> {
        val asm = mutableListOf<ScriptElement>()

        while (!scriptReader.isEmpty()) {
            val opCode: OpCode = scriptReader.getNextByte().toOpCode()

            when (opCode) {
                OP_FALSE               -> asm.add(OP_FALSE)
                OP_PUSHBYTES_1         -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_1)
                    val data = scriptReader.getNext(1u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_2         -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_2)
                    val data = scriptReader.getNext(2u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_3         -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_3)
                    val data = scriptReader.getNext(3u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_4         -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_4)
                    val data = scriptReader.getNext(4u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_5         -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_5)
                    val data = scriptReader.getNext(5u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_6         -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_6)
                    val data = scriptReader.getNext(6u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_7         -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_7)
                    val data = scriptReader.getNext(7u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_8         -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_8)
                    val data = scriptReader.getNext(8u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_9         -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_9)
                    val data = scriptReader.getNext(9u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_10        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_10)
                    val data = scriptReader.getNext(10u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_11        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_11)
                    val data = scriptReader.getNext(11u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_12        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_12)
                    val data = scriptReader.getNext(12u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_13        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_13)
                    val data = scriptReader.getNext(13u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_14        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_14)
                    val data = scriptReader.getNext(14u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_15        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_15)
                    val data = scriptReader.getNext(15u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_16        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_16)
                    val data = scriptReader.getNext(16u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_17        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_17)
                    val data = scriptReader.getNext(17u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_18        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_18)
                    val data = scriptReader.getNext(18u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_19        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_19)
                    val data = scriptReader.getNext(19u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_20        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_20)
                    val data = scriptReader.getNext(20u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_21        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_21)
                    val data = scriptReader.getNext(21u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_22        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_22)
                    val data = scriptReader.getNext(22u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_23        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_23)
                    val data = scriptReader.getNext(23u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_24        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_24)
                    val data = scriptReader.getNext(24u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_25        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_25)
                    val data = scriptReader.getNext(25u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_26        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_26)
                    val data = scriptReader.getNext(26u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_27        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_27)
                    val data = scriptReader.getNext(27u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_28        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_28)
                    val data = scriptReader.getNext(28u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_29        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_29)
                    val data = scriptReader.getNext(29u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_30        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_30)
                    val data = scriptReader.getNext(30u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_31        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_31)
                    val data = scriptReader.getNext(31u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_32        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_32)
                    val data = scriptReader.getNext(32u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_33        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_33)
                    val data = scriptReader.getNext(33u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_34        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_34)
                    val data = scriptReader.getNext(34u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_35        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_35)
                    val data = scriptReader.getNext(35u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_36        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_36)
                    val data = scriptReader.getNext(36u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_37        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_37)
                    val data = scriptReader.getNext(37u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_38        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_38)
                    val data = scriptReader.getNext(38u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_39        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_39)
                    val data = scriptReader.getNext(39u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_40        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_40)
                    val data = scriptReader.getNext(40u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_41        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_41)
                    val data = scriptReader.getNext(41u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_42        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_42)
                    val data = scriptReader.getNext(42u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_43        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_43)
                    val data = scriptReader.getNext(43u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_44        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_44)
                    val data = scriptReader.getNext(44u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_45        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_45)
                    val data = scriptReader.getNext(45u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_46        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_46)
                    val data = scriptReader.getNext(46u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_47        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_47)
                    val data = scriptReader.getNext(47u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_48        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_48)
                    val data = scriptReader.getNext(48u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_49        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_49)
                    val data = scriptReader.getNext(49u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_50        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_50)
                    val data = scriptReader.getNext(50u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_51        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_51)
                    val data = scriptReader.getNext(51u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_52        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_52)
                    val data = scriptReader.getNext(52u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_53        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_53)
                    val data = scriptReader.getNext(53u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_54        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_54)
                    val data = scriptReader.getNext(54u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_55        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_55)
                    val data = scriptReader.getNext(55u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_56        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_56)
                    val data = scriptReader.getNext(56u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_57        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_57)
                    val data = scriptReader.getNext(57u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_58        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_58)
                    val data = scriptReader.getNext(58u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_59        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_59)
                    val data = scriptReader.getNext(59u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_60        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_60)
                    val data = scriptReader.getNext(60u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_61        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_61)
                    val data = scriptReader.getNext(61u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_62        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_62)
                    val data = scriptReader.getNext(62u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_63        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_63)
                    val data = scriptReader.getNext(63u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_64        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_64)
                    val data = scriptReader.getNext(64u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_65        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_65)
                    val data = scriptReader.getNext(65u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_66        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_66)
                    val data = scriptReader.getNext(66u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_67        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_67)
                    val data = scriptReader.getNext(67u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_68        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_68)
                    val data = scriptReader.getNext(68u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_69        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_69)
                    val data = scriptReader.getNext(69u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_70        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_70)
                    val data = scriptReader.getNext(70u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_71        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_71)
                    val data = scriptReader.getNext(71u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_72        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_72)
                    val data = scriptReader.getNext(72u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_73        -> {
                    if (explicitAsm)asm.add(OP_PUSHBYTES_73)
                    val data = scriptReader.getNext(73u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_74        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_74)
                    val data = scriptReader.getNext(74u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHBYTES_75        -> {
                    if (explicitAsm) asm.add(OP_PUSHBYTES_75)
                    val data = scriptReader.getNext(75u)
                    asm.add(ScriptData(data))
                }
                OP_PUSHDATA1           -> {
                    if (explicitAsm) asm.add(OP_PUSHDATA1)
                    val dataLength = scriptReader.getNext(1u).littleEndianToUInt()
                    if (explicitAsm) asm.add(PushDataNumber(dataLength))
                    val data = scriptReader.getNext(dataLength)
                    asm.add(ScriptData(data))
                }
                OP_PUSHDATA2           -> {
                    if (explicitAsm) asm.add(OP_PUSHDATA2)
                    val dataLength = scriptReader.getNext(2u).littleEndianToUInt()
                    if (explicitAsm) asm.add(PushDataNumber(dataLength))
                    val data = scriptReader.getNext(dataLength)
                    asm.add(ScriptData(data))
                }
                OP_PUSHDATA4           -> {
                    if (explicitAsm) asm.add(OP_PUSHDATA4)
                    val dataLength = scriptReader.getNext(4u).littleEndianToUInt()
                    if (explicitAsm) asm.add(PushDataNumber(dataLength))
                    val data = scriptReader.getNext(dataLength)
                    asm.add(ScriptData(data))
                }
                OP_1NEGATE             -> asm.add(OP_1NEGATE)
                OP_RESERVED            -> asm.add(OP_RESERVED)
                OP_TRUE                -> asm.add(OP_TRUE)
                OP_2                   -> asm.add(OP_2)
                OP_3                   -> asm.add(OP_3)
                OP_4                   -> asm.add(OP_4)
                OP_5                   -> asm.add(OP_5)
                OP_6                   -> asm.add(OP_6)
                OP_7                   -> asm.add(OP_7)
                OP_8                   -> asm.add(OP_8)
                OP_9                   -> asm.add(OP_9)
                OP_10                  -> asm.add(OP_10)
                OP_11                  -> asm.add(OP_11)
                OP_12                  -> asm.add(OP_12)
                OP_13                  -> asm.add(OP_13)
                OP_14                  -> asm.add(OP_14)
                OP_15                  -> asm.add(OP_15)
                OP_16                  -> asm.add(OP_16)
                OP_NOP                 -> asm.add(OP_NOP)
                OP_VER                 -> asm.add(OP_VER)
                OP_IF                  -> asm.add(OP_IF)
                OP_NOTIF               -> asm.add(OP_NOTIF)
                OP_VERIF               -> asm.add(OP_VERIF)
                OP_VERNOTIF            -> asm.add(OP_VERNOTIF)
                OP_ELSE                -> asm.add(OP_ELSE)
                OP_ENDIF               -> asm.add(OP_ENDIF)
                OP_VERIFY              -> asm.add(OP_VERIFY)
                OP_RETURN              -> asm.add(OP_RETURN)
                OP_TOALTSTACK          -> asm.add(OP_TOALTSTACK)
                OP_FROMALTSTACK        -> asm.add(OP_FROMALTSTACK)
                OP_2DROP               -> asm.add(OP_2DROP)
                OP_2DUP                -> asm.add(OP_2DUP)
                OP_3DUP                -> asm.add(OP_3DUP)
                OP_2OVER               -> asm.add(OP_2OVER)
                OP_2ROT                -> asm.add(OP_2ROT)
                OP_2SWAP               -> asm.add(OP_2SWAP)
                OP_IFDUP               -> asm.add(OP_IFDUP)
                OP_DEPTH               -> asm.add(OP_DEPTH)
                OP_DROP                -> asm.add(OP_DROP)
                OP_DUP                 -> asm.add(OP_DUP)
                OP_NIP                 -> asm.add(OP_NIP)
                OP_OVER                -> asm.add(OP_OVER)
                OP_PICK                -> asm.add(OP_PICK)
                OP_ROLL                -> asm.add(OP_ROLL)
                OP_ROT                 -> asm.add(OP_ROT)
                OP_SWAP                -> asm.add(OP_SWAP)
                OP_TUCK                -> asm.add(OP_TUCK)
                OP_CAT                 -> asm.add(OP_CAT)
                OP_SUBSTR              -> asm.add(OP_SUBSTR)
                OP_LEFT                -> asm.add(OP_LEFT)
                OP_RIGHT               -> asm.add(OP_RIGHT)
                OP_SIZE                -> asm.add(OP_SIZE)
                OP_INVERT              -> asm.add(OP_INVERT)
                OP_AND                 -> asm.add(OP_AND)
                OP_OR                  -> asm.add(OP_OR)
                OP_XOR                 -> asm.add(OP_XOR)
                OP_EQUAL               -> asm.add(OP_EQUAL)
                OP_EQUALVERIFY         -> asm.add(OP_EQUALVERIFY)
                OP_RESERVED1           -> asm.add(OP_RESERVED1)
                OP_RESERVED2           -> asm.add(OP_RESERVED2)
                OP_1ADD                -> asm.add(OP_1ADD)
                OP_1SUB                -> asm.add(OP_1SUB)
                OP_2MUL                -> asm.add(OP_2MUL)
                OP_2DIV                -> asm.add(OP_2DIV)
                OP_NEGATE              -> asm.add(OP_NEGATE)
                OP_ABS                 -> asm.add(OP_ABS)
                OP_NOT                 -> asm.add(OP_NOT)
                OP_0NOTEQUAL           -> asm.add(OP_0NOTEQUAL)
                OP_ADD                 -> asm.add(OP_ADD)
                OP_SUB                 -> asm.add(OP_SUB)
                OP_MUL                 -> asm.add(OP_MUL)
                OP_DIV                 -> asm.add(OP_DIV)
                OP_MOD                 -> asm.add(OP_MOD)
                OP_LSHIFT              -> asm.add(OP_LSHIFT)
                OP_RSHIFT              -> asm.add(OP_RSHIFT)
                OP_BOOLAND             -> asm.add(OP_BOOLAND)
                OP_BOOLOR              -> asm.add(OP_BOOLOR)
                OP_NUMEQUAL            -> asm.add(OP_NUMEQUAL)
                OP_NUMEQUALVERIFY      -> asm.add(OP_NUMEQUALVERIFY)
                OP_NUMNOTEQUAL         -> asm.add(OP_NUMNOTEQUAL)
                OP_LESSTHAN            -> asm.add(OP_LESSTHAN)
                OP_GREATERTHAN         -> asm.add(OP_GREATERTHAN)
                OP_LESSTHANOREQUAL     -> asm.add(OP_LESSTHANOREQUAL)
                OP_GREATERTHANOREQUAL  -> asm.add(OP_GREATERTHANOREQUAL)
                OP_MIN                 -> asm.add(OP_MIN)
                OP_MAX                 -> asm.add(OP_MAX)
                OP_WITHIN              -> asm.add(OP_WITHIN)
                OP_RIPEMD160           -> asm.add(OP_RIPEMD160)
                OP_SHA1                -> asm.add(OP_SHA1)
                OP_SHA256              -> asm.add(OP_SHA256)
                OP_HASH160             -> asm.add(OP_HASH160)
                OP_HASH256             -> asm.add(OP_HASH256)
                OP_CODESEPARATOR       -> asm.add(OP_CODESEPARATOR)
                OP_CHECKSIG            -> asm.add(OP_CHECKSIG)
                OP_CHECKSIGVERIFY      -> asm.add(OP_CHECKSIGVERIFY)
                OP_CHECKMULTISIG       -> asm.add(OP_CHECKMULTISIG)
                OP_CHECKMULTISIGVERIFY -> asm.add(OP_CHECKMULTISIGVERIFY)
                OP_NOP1                -> asm.add(OP_NOP1)
                OP_CLTV                -> asm.add(OP_CLTV)
                OP_CSV                 -> asm.add(OP_CSV)
                OP_NOP4                -> asm.add(OP_NOP4)
                OP_NOP5                -> asm.add(OP_NOP5)
                OP_NOP6                -> asm.add(OP_NOP6)
                OP_NOP7                -> asm.add(OP_NOP7)
                OP_NOP8                -> asm.add(OP_NOP8)
                OP_NOP9                -> asm.add(OP_NOP9)
                OP_NOP10               -> asm.add(OP_NOP10)
                OP_CHECKSIGADD         -> asm.add(OP_CHECKSIGADD)
                OP_RETURN_187          -> asm.add(OP_RETURN_187)
                OP_RETURN_188          -> asm.add(OP_RETURN_188)
                OP_RETURN_189          -> asm.add(OP_RETURN_189)
                OP_RETURN_190          -> asm.add(OP_RETURN_190)
                OP_RETURN_191          -> asm.add(OP_RETURN_191)
                OP_RETURN_192          -> asm.add(OP_RETURN_192)
                OP_RETURN_193          -> asm.add(OP_RETURN_193)
                OP_RETURN_194          -> asm.add(OP_RETURN_194)
                OP_RETURN_195          -> asm.add(OP_RETURN_195)
                OP_RETURN_196          -> asm.add(OP_RETURN_196)
                OP_RETURN_197          -> asm.add(OP_RETURN_197)
                OP_RETURN_198          -> asm.add(OP_RETURN_198)
                OP_RETURN_199          -> asm.add(OP_RETURN_199)
                OP_RETURN_200          -> asm.add(OP_RETURN_200)
                OP_RETURN_201          -> asm.add(OP_RETURN_201)
                OP_RETURN_202          -> asm.add(OP_RETURN_202)
                OP_RETURN_203          -> asm.add(OP_RETURN_203)
                OP_RETURN_204          -> asm.add(OP_RETURN_204)
                OP_RETURN_205          -> asm.add(OP_RETURN_205)
                OP_RETURN_206          -> asm.add(OP_RETURN_206)
                OP_RETURN_207          -> asm.add(OP_RETURN_207)
                OP_RETURN_208          -> asm.add(OP_RETURN_208)
                OP_RETURN_209          -> asm.add(OP_RETURN_209)
                OP_RETURN_210          -> asm.add(OP_RETURN_210)
                OP_RETURN_211          -> asm.add(OP_RETURN_211)
                OP_RETURN_212          -> asm.add(OP_RETURN_212)
                OP_RETURN_213          -> asm.add(OP_RETURN_213)
                OP_RETURN_214          -> asm.add(OP_RETURN_214)
                OP_RETURN_215          -> asm.add(OP_RETURN_215)
                OP_RETURN_216          -> asm.add(OP_RETURN_216)
                OP_RETURN_217          -> asm.add(OP_RETURN_217)
                OP_RETURN_218          -> asm.add(OP_RETURN_218)
                OP_RETURN_219          -> asm.add(OP_RETURN_219)
                OP_RETURN_220          -> asm.add(OP_RETURN_220)
                OP_RETURN_221          -> asm.add(OP_RETURN_221)
                OP_RETURN_222          -> asm.add(OP_RETURN_222)
                OP_RETURN_223          -> asm.add(OP_RETURN_223)
                OP_RETURN_224          -> asm.add(OP_RETURN_224)
                OP_RETURN_225          -> asm.add(OP_RETURN_225)
                OP_RETURN_226          -> asm.add(OP_RETURN_226)
                OP_RETURN_227          -> asm.add(OP_RETURN_227)
                OP_RETURN_228          -> asm.add(OP_RETURN_228)
                OP_RETURN_229          -> asm.add(OP_RETURN_229)
                OP_RETURN_230          -> asm.add(OP_RETURN_230)
                OP_RETURN_231          -> asm.add(OP_RETURN_231)
                OP_RETURN_232          -> asm.add(OP_RETURN_232)
                OP_RETURN_233          -> asm.add(OP_RETURN_233)
                OP_RETURN_234          -> asm.add(OP_RETURN_234)
                OP_RETURN_235          -> asm.add(OP_RETURN_235)
                OP_RETURN_236          -> asm.add(OP_RETURN_236)
                OP_RETURN_237          -> asm.add(OP_RETURN_237)
                OP_RETURN_238          -> asm.add(OP_RETURN_238)
                OP_RETURN_239          -> asm.add(OP_RETURN_239)
                OP_RETURN_240          -> asm.add(OP_RETURN_240)
                OP_RETURN_241          -> asm.add(OP_RETURN_241)
                OP_RETURN_242          -> asm.add(OP_RETURN_242)
                OP_RETURN_243          -> asm.add(OP_RETURN_243)
                OP_RETURN_244          -> asm.add(OP_RETURN_244)
                OP_RETURN_245          -> asm.add(OP_RETURN_245)
                OP_RETURN_246          -> asm.add(OP_RETURN_246)
                OP_RETURN_247          -> asm.add(OP_RETURN_247)
                OP_RETURN_248          -> asm.add(OP_RETURN_248)
                OP_RETURN_249          -> asm.add(OP_RETURN_249)
                OP_RETURN_250          -> asm.add(OP_RETURN_250)
                OP_RETURN_251          -> asm.add(OP_RETURN_251)
                OP_RETURN_252          -> asm.add(OP_RETURN_252)
                OP_RETURN_253          -> asm.add(OP_RETURN_253)
                OP_RETURN_254          -> asm.add(OP_RETURN_254)
                OP_INVALIDOPCODE       -> asm.add(OP_INVALIDOPCODE)
            }
        }
        return asm
    }

    public fun validate(): ScriptResult {
        val asm = parseAsm(explicitAsm = false)
        val asmReader = AsmReader(asm.toMutableList())

        while (!asmReader.isEmpty()) {
            val nextElement: ScriptElement = asmReader.next()
            interpretNextElement(nextElement)
        }

        val stackIsEmpty: Boolean = stack.firstOrNull()?.contentEquals(ubyteArrayOf()) ?: true
        val stackIs0: Boolean = stack.firstOrNull()?.contentEquals(ubyteArrayOf(0x00u)) ?: false

        return if (stackIs0 || stackIsEmpty) {
            ScriptResult.Failure("Script failed")
        } else {
            ScriptResult.Success
        }
    }

    private fun interpretNextElement(element: ScriptElement) {
        when (element) {
            is OpCode -> interpretOpCode(element)
            is ScriptData -> stack.add(element.data)
            is PushDataNumber -> throw UnsupportedOperationException("PushDataNumber should not be here")
        }
    }

    private fun interpretOpCode(opCode: OpCode, assumeSigValid: Boolean = false) {
        println("Interpreting OpCode: $opCode")
        when (opCode) {
            OP_FALSE        -> executeOpFalse()
            OP_PUSHBYTES_1  -> executeOpPushBytes()
            OP_PUSHBYTES_2  -> executeOpPushBytes()
            OP_PUSHBYTES_3  -> executeOpPushBytes()
            OP_PUSHBYTES_4  -> executeOpPushBytes()
            OP_PUSHBYTES_5  -> executeOpPushBytes()
            OP_PUSHBYTES_6  -> executeOpPushBytes()
            OP_PUSHBYTES_7  -> executeOpPushBytes()
            OP_PUSHBYTES_8  -> executeOpPushBytes()
            OP_PUSHBYTES_9  -> executeOpPushBytes()
            OP_PUSHBYTES_10 -> executeOpPushBytes()
            OP_PUSHBYTES_11 -> executeOpPushBytes()
            OP_PUSHBYTES_12 -> executeOpPushBytes()
            OP_PUSHBYTES_13 -> executeOpPushBytes()
            OP_PUSHBYTES_14 -> executeOpPushBytes()
            OP_PUSHBYTES_15 -> executeOpPushBytes()
            OP_PUSHBYTES_16 -> executeOpPushBytes()
            OP_PUSHBYTES_17 -> executeOpPushBytes()
            OP_PUSHBYTES_18 -> executeOpPushBytes()
            OP_PUSHBYTES_19 -> executeOpPushBytes()
            OP_PUSHBYTES_20 -> executeOpPushBytes()
            OP_PUSHBYTES_21 -> executeOpPushBytes()
            OP_PUSHBYTES_22 -> executeOpPushBytes()
            OP_PUSHBYTES_23 -> executeOpPushBytes()
            OP_PUSHBYTES_24 -> executeOpPushBytes()
            OP_PUSHBYTES_25 -> executeOpPushBytes()
            OP_PUSHBYTES_26 -> executeOpPushBytes()
            OP_PUSHBYTES_27 -> executeOpPushBytes()
            OP_PUSHBYTES_28 -> executeOpPushBytes()
            OP_PUSHBYTES_29 -> executeOpPushBytes()
            OP_PUSHBYTES_30 -> executeOpPushBytes()
            OP_PUSHBYTES_31 -> executeOpPushBytes()
            OP_PUSHBYTES_32 -> executeOpPushBytes()
            OP_PUSHBYTES_33 -> executeOpPushBytes()
            OP_PUSHBYTES_34 -> executeOpPushBytes()
            OP_PUSHBYTES_35 -> executeOpPushBytes()
            OP_PUSHBYTES_36 -> executeOpPushBytes()
            OP_PUSHBYTES_37 -> executeOpPushBytes()
            OP_PUSHBYTES_38 -> executeOpPushBytes()
            OP_PUSHBYTES_39 -> executeOpPushBytes()
            OP_PUSHBYTES_40 -> executeOpPushBytes()
            OP_PUSHBYTES_41 -> executeOpPushBytes()
            OP_PUSHBYTES_42 -> executeOpPushBytes()
            OP_PUSHBYTES_43 -> executeOpPushBytes()
            OP_PUSHBYTES_44 -> executeOpPushBytes()
            OP_PUSHBYTES_45 -> executeOpPushBytes()
            OP_PUSHBYTES_46 -> executeOpPushBytes()
            OP_PUSHBYTES_47 -> executeOpPushBytes()
            OP_PUSHBYTES_48 -> executeOpPushBytes()
            OP_PUSHBYTES_49 -> executeOpPushBytes()
            OP_PUSHBYTES_50 -> executeOpPushBytes()
            OP_PUSHBYTES_51 -> executeOpPushBytes()
            OP_PUSHBYTES_52 -> executeOpPushBytes()
            OP_PUSHBYTES_53 -> executeOpPushBytes()
            OP_PUSHBYTES_54 -> executeOpPushBytes()
            OP_PUSHBYTES_55 -> executeOpPushBytes()
            OP_PUSHBYTES_56 -> executeOpPushBytes()
            OP_PUSHBYTES_57 -> executeOpPushBytes()
            OP_PUSHBYTES_58 -> executeOpPushBytes()
            OP_PUSHBYTES_59 -> executeOpPushBytes()
            OP_PUSHBYTES_60 -> executeOpPushBytes()
            OP_PUSHBYTES_61 -> executeOpPushBytes()
            OP_PUSHBYTES_62 -> executeOpPushBytes()
            OP_PUSHBYTES_63 -> executeOpPushBytes()
            OP_PUSHBYTES_64 -> executeOpPushBytes()
            OP_PUSHBYTES_65 -> executeOpPushBytes()
            OP_PUSHBYTES_66 -> executeOpPushBytes()
            OP_PUSHBYTES_67 -> executeOpPushBytes()
            OP_PUSHBYTES_68 -> executeOpPushBytes()
            OP_PUSHBYTES_69 -> executeOpPushBytes()
            OP_PUSHBYTES_70 -> executeOpPushBytes()
            OP_PUSHBYTES_71 -> executeOpPushBytes()
            OP_PUSHBYTES_72 -> executeOpPushBytes()
            OP_PUSHBYTES_73 -> executeOpPushBytes()
            OP_PUSHBYTES_74 -> executeOpPushBytes()
            OP_PUSHBYTES_75 -> executeOpPushBytes()
            OP_PUSHDATA1    -> executeOpPushData()
            OP_PUSHDATA2    -> executeOpPushData()
            OP_PUSHDATA4    -> executeOpPushData()
            OP_TRUE         -> executeOpTrue()
            else -> throw OpCodeNotSupported(opCode.value)
        }
    }

    public operator fun plus(other: BitcoinScript): BitcoinScript {
        val newScript = script + other.script
        return BitcoinScript(newScript)
    }
}
