package me.tb.opcodes

public sealed interface ScriptElement

public enum class OpCode(public val value: UByte) : ScriptElement {
    OP_FALSE(0x00u),
    OP_PUSHBYTES_1(0x01u),
    OP_PUSHBYTES_2(0x02u),
    OP_PUSHBYTES_3(0x03u),
    OP_PUSHBYTES_4(0x04u),
    OP_PUSHBYTES_5(0x05u),
    OP_PUSHBYTES_6(0x06u),
    OP_PUSHBYTES_7(0x07u),
    OP_PUSHBYTES_8(0x08u),
    OP_PUSHBYTES_9(0x09u),
    OP_PUSHBYTES_10(0x0au),
    OP_PUSHBYTES_11(0x0bu),
    OP_PUSHBYTES_12(0x0cu),
    OP_PUSHBYTES_13(0x0du),
    OP_PUSHBYTES_14(0x0eu),
    OP_PUSHBYTES_15(0x0fu),
    OP_PUSHBYTES_16(0x10u),
    OP_PUSHBYTES_17(0x11u),
    OP_PUSHBYTES_18(0x12u),
    OP_PUSHBYTES_19(0x13u),
    OP_PUSHBYTES_20(0x14u),
    OP_PUSHBYTES_21(0x15u),
    OP_PUSHBYTES_22(0x16u),
    OP_PUSHBYTES_23(0x17u),
    OP_PUSHBYTES_24(0x18u),
    OP_PUSHBYTES_25(0x19u),
    OP_PUSHBYTES_26(0x1au),
    OP_PUSHBYTES_27(0x1bu),
    OP_PUSHBYTES_28(0x1cu),
    OP_PUSHBYTES_29(0x1du),
    OP_PUSHBYTES_30(0x1eu),
    OP_PUSHBYTES_31(0x1fu),
    OP_PUSHBYTES_32(0x20u),
    OP_PUSHBYTES_33(0x21u),
    OP_PUSHBYTES_34(0x22u),
    OP_PUSHBYTES_35(0x23u),
    OP_PUSHBYTES_36(0x24u),
    OP_PUSHBYTES_37(0x25u),
    OP_PUSHBYTES_38(0x26u),
    OP_PUSHBYTES_39(0x27u),
    OP_PUSHBYTES_40(0x28u),
    OP_PUSHBYTES_41(0x29u),
    OP_PUSHBYTES_42(0x2au),
    OP_PUSHBYTES_43(0x2bu),
    OP_PUSHBYTES_44(0x2cu),
    OP_PUSHBYTES_45(0x2du),
    OP_PUSHBYTES_46(0x2eu),
    OP_PUSHBYTES_47(0x2fu),
    OP_PUSHBYTES_48(0x30u),
    OP_PUSHBYTES_49(0x31u),
    OP_PUSHBYTES_50(0x32u),
    OP_PUSHBYTES_51(0x33u),
    OP_PUSHBYTES_52(0x34u),
    OP_PUSHBYTES_53(0x35u),
    OP_PUSHBYTES_54(0x36u),
    OP_PUSHBYTES_55(0x37u),
    OP_PUSHBYTES_56(0x38u),
    OP_PUSHBYTES_57(0x39u),
    OP_PUSHBYTES_58(0x3au),
    OP_PUSHBYTES_59(0x3bu),
    OP_PUSHBYTES_60(0x3cu),
    OP_PUSHBYTES_61(0x3du),
    OP_PUSHBYTES_62(0x3eu),
    OP_PUSHBYTES_63(0x3fu),
    OP_PUSHBYTES_64(0x40u),
    OP_PUSHBYTES_65(0x41u),
    OP_PUSHBYTES_66(0x42u),
    OP_PUSHBYTES_67(0x43u),
    OP_PUSHBYTES_68(0x44u),
    OP_PUSHBYTES_69(0x45u),
    OP_PUSHBYTES_70(0x46u),
    OP_PUSHBYTES_71(0x47u),
    OP_PUSHBYTES_72(0x48u),
    OP_PUSHBYTES_73(0x49u),
    OP_PUSHBYTES_74(0x4au),
    OP_PUSHBYTES_75(0x4bu),
    OP_PUSHDATA1(0x4cu),
    OP_PUSHDATA2(0x4du),
    OP_PUSHDATA4(0x4eu),
    OP_TRUE(0x51u),
    OTHER(0xffu);
}

public data class ScriptData(val data: UByteArray) : ScriptElement

public data class PushDataNumber(val number: UInt) : ScriptElement
