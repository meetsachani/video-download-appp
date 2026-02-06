package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C3307Iz;
import o.C8077mf;
import o.ED2;

/* renamed from: com.facebook.ads.redexgen.X.Mq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC0922Mq {
    A09,
    A04,
    A05,
    A0A,
    A03,
    A08,
    A07,
    A06;
    
    public static byte[] A00;
    public static String[] A01 = {"lOzuqd9TjXHlivepUaRJZyovV0XRZz3Q", "3CmPFRqqfEz1KNHoTaFI9Gq9W7MdJSat", "haORrB9MD96pjJjEM3VH9Mkp1W5ocbVO", "NmjzB0Xtr3isEon9bZHWRNmwidAWwXHD", "sUTNp2nMxY0O1vbAqz8mD0UyRSKVk6HB", "U2dhTMN4g5dnFjvsoCGatnesuvXNv1a4", "4yC8jy8D2py2trVgka4ywqiYEdNiB8JC", "oszw9hdc4eixLtuswncqLzcYbbEIixDe"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{C3307Iz.a0, 56, 56, 55, 59, 60, C3307Iz.Z, 58, C3307Iz.e0, 40, 42, C3307Iz.X, C3307Iz.X, 36, ED2.a, 52, 36, 59, C3307Iz.f0, C3307Iz.X, 118, 116, 123, 123, 122, 97, 106, 97, 103, 116, 118, 126, 32, 54, C3307Iz.c0, 52, 52, C3307Iz.V, 32, 28, 1, 13, 28, C8077mf.m, C8077mf.A, C8077mf.B, C8077mf.y, 6, C8077mf.E, C8077mf.m, C8077mf.z, C8077mf.p, 10, 28, C8077mf.m, 98, 106, 105, 81, 80, 81, 90, 115, 100, 101, 104, 115, 100, 98, 117, 126, 117, 110, 126, 96, 113, 113};
    }

    static {
        A01();
    }

    public static boolean A02(EnumC0922Mq enumC0922Mq) {
        return A04.equals(enumC0922Mq) || A05.equals(enumC0922Mq);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC0922Mq[] valuesCustom() {
        EnumC0922Mq[] enumC0922MqArr = (EnumC0922Mq[]) values().clone();
        String[] strArr = A01;
        if (strArr[6].charAt(17) != strArr[0].charAt(17)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "RzvFYuFX7ttNqzVxDa22HEjRW3DLLGXn";
        strArr2[0] = "i0gT3y5gW8KzD6GAKa0KnQ1HdBIZCzpI";
        return enumC0922MqArr;
    }
}
