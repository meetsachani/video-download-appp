package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import o.C2638Cg0;
import o.C3503Kz;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.gL  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1650gL {
    A09(A00(C3503Kz.i0, 13, 123), EnumC1652gN.A03, true),
    A08(A00(128, 17, 124), EnumC1652gN.A04, true),
    A07(A00(114, 14, 33), EnumC1652gN.A04, false),
    A0A(A00(171, 23, 15), EnumC1652gN.A04, false),
    A0B(A00(C3503Kz.r0, 13, 28), EnumC1652gN.A04, true),
    A06(A00(97, 17, 115), EnumC1652gN.A04, false);
    
    public static byte[] A03;
    public static String[] A04 = {"ycwuSagCCCN4l2dI41z3qVhXiq7PFx6V", "eCechoSCzkY2xErzr1Uj4eXJDYPAMm21", "Tj2V", "5PPeuyR1XhCZ68o08D3eM2L3nt7", "QkjbeLtEXK6xGgNvZ4ng7fB3y1rOF3bp", "NI4HGGG8cjGbKqK", "UN1b1Vv9e1ysvCUt5x8q6t9LXfdcX8lO", "wYekL4qvcaeL43S"};
    public EnumC1652gN A00;
    public String A01;
    public boolean A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[1].charAt(7) != strArr[0].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[6] = "1sEbNeEn9yAQIM08pYF4gKbNN1PUoHvf";
            strArr2[4] = "yyBbFHXEa0Kbel6c5iwsjMz13YxOyOJd";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{-68, C2638Cg0.r7, -66, -66, -65, -52, C2638Cg0.E7, C2638Cg0.z7, C2638Cg0.v7, C2638Cg0.s7, -65, -56, C2638Cg0.E7, C2638Cg0.r7, -56, C2638Cg0.o7, C2638Cg0.v7, -70, -71, -75, -56, C2638Cg0.v7, C2638Cg0.t7, -71, -45, -73, C2638Cg0.r7, C2638Cg0.q7, -70, -67, -69, -34, C2638Cg0.B7, C2638Cg0.A7, -47, -45, -37, -45, -36, -30, -19, -44, -35, -32, -37, C2638Cg0.A7, -30, C2638Cg0.C7, -78, -82, -93, -91, -89, -81, -89, -80, -74, C2638Cg0.p7, -85, -90, -75, -107, -105, -118, -117, -118, -103, -120, -115, -118, -119, -92, -122, -119, -92, -105, -118, -104, -107, -108, -109, -104, -118, -104, 105, 107, 94, 95, 94, 109, 92, 97, QC1.w, 110, 107, 101, 108, -22, -15, -20, -20, -19, -6, -25, -4, -9, -13, -19, -10, -25, -15, -10, -18, -9, -100, -101, -105, -86, -85, -88, -101, -107, -103, -91, -92, -100, -97, -99, 1, -3, -14, -12, -10, -2, -10, -1, 5, -66, -9, 0, 3, -2, -14, 5, 4, 0, -4, -15, -13, -11, -3, -11, -2, 4, -67, -7, -12, 3, -95, -93, -106, -105, -106, -91, -108, -103, -112, -90, -93, -99, -92, -108, -106, -119, -118, -119, -104, -121, -116, -119, -120, 81, -123, -120, 81, -106, -119, -105, -108, -109, -110, -105, -119, -105};
    }

    static {
        A01();
    }

    EnumC1650gL(String str, EnumC1652gN enumC1652gN, boolean z) {
        this.A01 = str;
        this.A00 = enumC1652gN;
        this.A02 = z;
    }

    public final EnumC1652gN A03() {
        return this.A00;
    }

    public final String A04() {
        return this.A01;
    }

    public final boolean A05() {
        return this.A02;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC1650gL[] valuesCustom() {
        EnumC1650gL[] valuesCustom = values();
        String[] strArr = A04;
        if (strArr[7].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[1] = "AD9B2u3CpUm8RcifiDyOxQh6hnzeqyLc";
        strArr2[0] = "O9mPnP3CfsWUFNDjzVqrQcoADApw1Amm";
        return (EnumC1650gL[]) valuesCustom.clone();
    }
}
