package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.Gv  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0772Gv {
    public static byte[] A06;
    public static String[] A07 = {"f", "7N0kip4m3flPJ4wRylUb66l3ycty4bLO", "ZrqOCWQk631j6sxAoqisBRdwge9gr5QF", "2DRaKiCosA9Zs551XHqRbpaUmywwD6L7", "dzNr4lbarI8PqRX9M2ICRMrM1SnLdD", "nBYqh81NM1tC", "zWHuac", "46iX5XNzwkY5yhjGLtKEm3XHMbBVctSm"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List<byte[]> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static C0772Gv A00(C04774v c04774v) throws C3K {
        try {
            c04774v.A0g(4);
            int A0I = (c04774v.A0I() & 3) + 1;
            if (A0I != 3) {
                ArrayList arrayList = new ArrayList();
                int A0I2 = c04774v.A0I() & 31;
                for (int i = 0; i < A0I2; i++) {
                    arrayList.add(A03(c04774v));
                }
                int A0I3 = c04774v.A0I();
                String[] strArr = A07;
                if (strArr[4].length() != strArr[5].length()) {
                    A07[1] = "rQ6g8gs4UtzNEdd6WIb5nHQ3c92ce055";
                    for (int i2 = 0; i2 < A0I3; i2++) {
                        arrayList.add(A03(c04774v));
                    }
                    int i3 = -1;
                    int i4 = -1;
                    float f = 1.0f;
                    String str = null;
                    if (A0I2 > 0) {
                        HR A09 = HS.A09((byte[]) arrayList.get(0), A0I, ((byte[]) arrayList.get(0)).length);
                        i3 = A09.A0A;
                        i4 = A09.A03;
                        f = A09.A00;
                        str = AnonymousClass46.A01(A09.A08, A09.A01, A09.A04);
                    }
                    return new C0772Gv(arrayList, A0I, i3, i4, f, str);
                }
                throw new RuntimeException();
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C3K.A01(A01(0, 24, 51), e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 30);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-106, C2638Cg0.r7, C2638Cg0.r7, C2638Cg0.o7, C2638Cg0.r7, 113, C2638Cg0.p7, -78, C2638Cg0.r7, -60, -70, -65, -72, 113, -110, -89, -108, 113, -76, C2638Cg0.o7, -65, -73, -70, -72};
    }

    static {
        A02();
    }

    public C0772Gv(List<byte[]> initializationData, int i, int i2, int i3, float f, String str) {
        this.A05 = initializationData;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = f;
        this.A04 = str;
    }

    public static byte[] A03(C04774v c04774v) {
        int A0M = c04774v.A0M();
        int offset = c04774v.A09();
        c04774v.A0g(A0M);
        return AnonymousClass46.A07(c04774v.A0l(), offset, A0M);
    }
}
