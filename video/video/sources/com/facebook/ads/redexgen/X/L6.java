package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import o.C10323vs;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;
import o.ED2;

/* loaded from: assets/audience_network/classes2.dex */
public final class L6 {
    public static byte[] A08;
    public static String[] A09 = {"voRQ6Eoiy", "dM5sUr3BWW4nkGo5nRVfbphD0FkiLgeI", "t4ngtozvUcRON5qFCPMw9NZHviWOcz8N", "2o", "HR4o0SgaegzvmEvMyBsSV3cy", "Fxd3YqblXENYapC", "iFe6DhKEBr1iW4qwRCto7Lk6hMgexe67", "drzzj9o5hc6Li6ZR2JGiBSJ"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AnonymousClass53 A07 = new AnonymousClass53(0);
    public long A01 = C10323vs.b;
    public long A02 = C10323vs.b;
    public long A00 = C10323vs.b;
    public final C04774v A06 = new C04774v();

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A08 = new byte[]{-19, -33, C8077mf.x, 50, 40, C3307Iz.e0, C3307Iz.Y, -33, 19, 8, C8077mf.n, 4, C8077mf.H, C8077mf.x, 13, C8077mf.u, 4, 19, -33, 40, C3307Iz.e0, 50, 51, 36, 32, 35, -19, C8077mf.u, 55, ED2.a, 42, 53, 50, C3307Iz.e0, -23, C3307Iz.e0, 62, 59, 42, C4715Xk.i, 50, 56, 55, 3, -23, C8077mf.z, 57, 10, 59, 56, C3307Iz.Z, 58, 47, 53, 52, C8077mf.B, C3307Iz.c0, C3307Iz.Z, 42, C3307Iz.c0, 56};
    }

    static {
        A09();
    }

    private int A00(InterfaceC2033ms interfaceC2033ms) {
        this.A06.A0i(C5C.A07);
        this.A03 = true;
        interfaceC2033ms.AIl();
        return 0;
    }

    private int A01(InterfaceC2033ms interfaceC2033ms, HV hv) throws IOException {
        int min = (int) Math.min(20000L, interfaceC2033ms.A8O());
        if (interfaceC2033ms.A8n() != 0) {
            hv.A00 = 0;
            return 1;
        }
        C04774v c04774v = this.A06;
        int bytesToSearch = A09[6].length();
        if (bytesToSearch != 30) {
            A09[6] = "JjjcAHcIe3bphcpehmdhx0lOvmd2";
            c04774v.A0d(min);
            interfaceC2033ms.AIl();
            interfaceC2033ms.AGt(this.A06.A0l(), 0, min);
            this.A01 = A04(this.A06);
            this.A04 = true;
            return 0;
        }
        throw new RuntimeException();
    }

    private int A02(InterfaceC2033ms interfaceC2033ms, HV hv) throws IOException {
        long A8O = interfaceC2033ms.A8O();
        int min = (int) Math.min(20000L, A8O);
        long j = A8O - min;
        long searchStartPosition = interfaceC2033ms.A8n();
        if (searchStartPosition != j) {
            hv.A00 = j;
            return 1;
        }
        this.A06.A0d(min);
        interfaceC2033ms.AIl();
        interfaceC2033ms.AGt(this.A06.A0l(), 0, min);
        long inputLength = A05(this.A06);
        this.A02 = inputLength;
        this.A05 = true;
        return 0;
    }

    private int A03(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long A04(C04774v c04774v) {
        int A0A = c04774v.A0A();
        for (int A092 = c04774v.A09(); A092 < searchStartPosition; A092++) {
            int searchEndPosition = A03(c04774v.A0l(), A092);
            if (searchEndPosition == 442) {
                int searchStartPosition = A092 + 4;
                c04774v.A0f(searchStartPosition);
                long A06 = A06(c04774v);
                int searchStartPosition2 = (A06 > C10323vs.b ? 1 : (A06 == C10323vs.b ? 0 : -1));
                if (searchStartPosition2 != 0) {
                    return A06;
                }
            }
        }
        return C10323vs.b;
    }

    private long A05(C04774v c04774v) {
        int A092 = c04774v.A09();
        int searchStartPosition = c04774v.A0A();
        for (int nextStartCode = searchStartPosition - 4; nextStartCode >= A092; nextStartCode--) {
            int searchEndPosition = A03(c04774v.A0l(), nextStartCode);
            if (searchEndPosition == 442) {
                int searchStartPosition2 = nextStartCode + 4;
                c04774v.A0f(searchStartPosition2);
                long A06 = A06(c04774v);
                int searchEndPosition2 = A09[1].charAt(26);
                if (searchEndPosition2 != 107) {
                    throw new RuntimeException();
                }
                A09[6] = "fZ";
                int searchStartPosition3 = (A06 > C10323vs.b ? 1 : (A06 == C10323vs.b ? 0 : -1));
                if (searchStartPosition3 != 0) {
                    return A06;
                }
            }
        }
        return C10323vs.b;
    }

    public static long A06(C04774v c04774v) {
        int A092 = c04774v.A09();
        if (c04774v.A07() < 9) {
            return C10323vs.b;
        }
        byte[] bArr = new byte[9];
        int originalPosition = bArr.length;
        c04774v.A0k(bArr, 0, originalPosition);
        c04774v.A0f(A092);
        return !A0A(bArr) ? C10323vs.b : A07(bArr);
    }

    public static long A07(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public static boolean A0A(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    public final int A0B(InterfaceC2033ms interfaceC2033ms, HV hv) throws IOException {
        if (!this.A05) {
            return A02(interfaceC2033ms, hv);
        }
        if (this.A02 == C10323vs.b) {
            return A00(interfaceC2033ms);
        }
        if (!this.A04) {
            return A01(interfaceC2033ms, hv);
        }
        if (this.A01 == C10323vs.b) {
            return A00(interfaceC2033ms);
        }
        this.A00 = this.A07.A06(this.A02) - this.A07.A06(this.A01);
        if (this.A00 < 0) {
            AbstractC04624g.A07(A08(45, 16, 119), A08(27, 18, 122) + this.A00 + A08(0, 27, 112));
            this.A00 = C10323vs.b;
        }
        return A00(interfaceC2033ms);
    }

    public final long A0C() {
        return this.A00;
    }

    public final AnonymousClass53 A0D() {
        return this.A07;
    }

    public final boolean A0E() {
        return this.A03;
    }
}
