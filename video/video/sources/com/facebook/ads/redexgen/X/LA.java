package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import o.C10323vs;
import o.C2638Cg0;

/* loaded from: assets/audience_network/classes2.dex */
public final class LA {
    public static byte[] A09;
    public static String[] A0A = {"YKrx4tQL3HFlbX0m6cI7YSMmMtJDnVWt", "EhNKRydGslBNjHwz4Qke8RkUgCBaonuc", "lVt1vjccWtobRJMyEDSjQomkweVugX5V", "X5vaF2wJa8umjlLI", "q53FR06vPOBUDZ08SG0Q3HmIsvEwqM01", "eDYPuZuNQVkkkUOb40HZTr2GxKWyUyQ4", "7DZ3geXrHcZNODb56yin0lXQD6ovjT1O", "oKDHpDD8v386AT9biWd"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass53 A08 = new AnonymousClass53(0);
    public long A01 = C10323vs.b;
    public long A02 = C10323vs.b;
    public long A00 = C10323vs.b;
    public final C04774v A07 = new C04774v();

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-89, -103, C2638Cg0.z7, -20, -30, -25, -32, -103, C2638Cg0.y7, C2638Cg0.q7, C2638Cg0.t7, -66, C2638Cg0.n7, C2638Cg0.z7, C2638Cg0.u7, -52, -66, C2638Cg0.y7, -103, -30, -25, -20, -19, -34, C2638Cg0.B7, -35, -89, -119, -82, -74, -95, -84, -87, -92, 96, -92, -75, -78, -95, -76, -87, -81, -82, 122, 96, -95, C2638Cg0.o7, -111, C2638Cg0.q7, -65, -82, C2638Cg0.p7, -74, -68, -69, -97, -78, -82, -79, -78, -65};
    }

    static {
        A06();
    }

    public LA(int i) {
        this.A06 = i;
    }

    private int A00(InterfaceC2033ms interfaceC2033ms) {
        this.A07.A0i(C5C.A07);
        this.A03 = true;
        interfaceC2033ms.AIl();
        return 0;
    }

    private int A01(InterfaceC2033ms interfaceC2033ms, HV hv, int i) throws IOException {
        int min = (int) Math.min(this.A06, interfaceC2033ms.A8O());
        if (interfaceC2033ms.A8n() != 0) {
            hv.A00 = 0;
            return 1;
        }
        this.A07.A0d(min);
        interfaceC2033ms.AIl();
        interfaceC2033ms.AGt(this.A07.A0l(), 0, min);
        this.A01 = A03(this.A07, i);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC2033ms interfaceC2033ms, HV hv, int i) throws IOException {
        long inputLength = interfaceC2033ms.A8O();
        int min = (int) Math.min(this.A06, inputLength);
        long inputLength2 = inputLength - min;
        if (interfaceC2033ms.A8n() != inputLength2) {
            hv.A00 = inputLength2;
            return 1;
        }
        this.A07.A0d(min);
        interfaceC2033ms.AIl();
        interfaceC2033ms.AGt(this.A07.A0l(), 0, min);
        this.A02 = A04(this.A07, i);
        this.A05 = true;
        return 0;
    }

    private long A03(C04774v c04774v, int i) {
        int A0A2 = c04774v.A0A();
        for (int A092 = c04774v.A09(); A092 < A0A2; A092++) {
            int searchEndPosition = c04774v.A0l()[A092];
            if (searchEndPosition == 71) {
                long A01 = LI.A01(c04774v, A092, i);
                int searchStartPosition = (A01 > C10323vs.b ? 1 : (A01 == C10323vs.b ? 0 : -1));
                if (searchStartPosition != 0) {
                    return A01;
                }
            }
        }
        return C10323vs.b;
    }

    private long A04(C04774v c04774v, int i) {
        int A092 = c04774v.A09();
        int A0A2 = c04774v.A0A();
        for (int i2 = A0A2 - 188; i2 >= A092; i2--) {
            if (LI.A03(c04774v.A0l(), A092, A0A2, i2)) {
                long A01 = LI.A01(c04774v, i2, i);
                int searchStartPosition = (A01 > C10323vs.b ? 1 : (A01 == C10323vs.b ? 0 : -1));
                if (searchStartPosition != 0) {
                    return A01;
                }
            }
        }
        return C10323vs.b;
    }

    public final int A07(InterfaceC2033ms interfaceC2033ms, HV hv, int i) throws IOException {
        if (i <= 0) {
            return A00(interfaceC2033ms);
        }
        if (!this.A05) {
            return A02(interfaceC2033ms, hv, i);
        }
        if (this.A02 == C10323vs.b) {
            return A00(interfaceC2033ms);
        }
        if (!this.A04) {
            int A01 = A01(interfaceC2033ms, hv, i);
            if (A0A[0].charAt(2) != 'O') {
                A0A[0] = "U4EwafF7WjzJM20D4nSEnM6oLnkPTMDI";
                return A01;
            }
            throw new RuntimeException();
        } else if (this.A01 == C10323vs.b) {
            return A00(interfaceC2033ms);
        } else {
            this.A00 = this.A08.A06(this.A02) - this.A08.A06(this.A01);
            if (this.A00 < 0) {
                AbstractC04624g.A07(A05(45, 16, 60), A05(27, 18, 47) + this.A00 + A05(0, 27, 104));
                this.A00 = C10323vs.b;
            }
            return A00(interfaceC2033ms);
        }
    }

    public final long A08() {
        return this.A00;
    }

    public final AnonymousClass53 A09() {
        return this.A08;
    }

    public final boolean A0A() {
        return this.A03;
    }
}
