package o;

import java.util.HashMap;
import java.util.Map;

/* renamed from: o.wB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC10403wB {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, OA.d, "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, C7193j50.f}, OA.b),
    Big5(28),
    GB18030(29, C4597We2.c, "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");
    
    public static final Map<Integer, EnumC10403wB> y1 = new HashMap();
    public static final Map<String, EnumC10403wB> z1 = new HashMap();
    public final int[] X;
    public final String[] Y;

    static {
        EnumC10403wB[] values;
        for (EnumC10403wB enumC10403wB : values()) {
            for (int i : enumC10403wB.X) {
                y1.put(Integer.valueOf(i), enumC10403wB);
            }
            z1.put(enumC10403wB.name(), enumC10403wB);
            for (String str : enumC10403wB.Y) {
                z1.put(str, enumC10403wB);
            }
        }
    }

    EnumC10403wB(int i) {
        this(new int[]{i}, new String[0]);
    }

    public static EnumC10403wB e(String str) {
        return z1.get(str);
    }

    public static EnumC10403wB g(int i) throws C2605Bx0 {
        if (i >= 0 && i < 900) {
            return y1.get(Integer.valueOf(i));
        }
        throw C2605Bx0.a();
    }

    public int h() {
        return this.X[0];
    }

    EnumC10403wB(int i, String... strArr) {
        this.X = new int[]{i};
        this.Y = strArr;
    }

    EnumC10403wB(int[] iArr, String... strArr) {
        this.X = iArr;
        this.Y = strArr;
    }
}
