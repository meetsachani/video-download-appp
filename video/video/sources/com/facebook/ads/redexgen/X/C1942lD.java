package com.facebook.ads.redexgen.X;

import java.io.IOException;
import o.C10323vs;

/* renamed from: com.facebook.ads.redexgen.X.lD  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1942lD implements H1 {
    public static String[] A02 = {"icMuAGNUwG3qooMsLkIelsXOgqR", "wZwGdqwzUfLFhHeDnVqZXfrekI2t19Nm", "6NjHclQwJEhKen4shQzzT38fKShvFJl3", "cwvHChui6ScrilPVLNLxDwwq1RZibmTM", "KGSyfhH5I6lVnEy0NkdKQy5Ija", "JgLMaajFBM7mBqcCk", "W9ygPHkeZ", ""};
    public final C04774v A00;
    public final AnonymousClass53 A01;

    public C1942lD(AnonymousClass53 anonymousClass53) {
        this.A01 = anonymousClass53;
        this.A00 = new C04774v();
    }

    private C0776Gz A00(C04774v c04774v, long scrValue, long scrTimeUs) {
        int A00;
        int i = -1;
        int i2 = -1;
        long j = C10323vs.b;
        while (c04774v.A07() >= 4) {
            A00 = C1941lC.A00(c04774v.A0l(), c04774v.A09());
            if (A00 != 442) {
                c04774v.A0g(1);
            } else {
                c04774v.A0g(4);
                long A06 = L6.A06(c04774v);
                if (A06 != C10323vs.b) {
                    long A062 = this.A01.A06(A06);
                    if (A062 > scrValue) {
                        if (j == C10323vs.b) {
                            return C0776Gz.A04(A062, scrTimeUs);
                        }
                        return C0776Gz.A03(i + scrTimeUs);
                    }
                    int startOfLastPacketPosition = A02[1].charAt(26);
                    if (startOfLastPacketPosition == 113) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A02;
                    strArr[3] = "JRu5yfiOOmZm3e1j9KGmxzziCqUEhgmX";
                    strArr[2] = "rPvZuTIICj36zhJU166yjphfEhohU7nm";
                    long lastScrTimeUsInRange = 100000 + A062;
                    if (lastScrTimeUsInRange > scrValue) {
                        return C0776Gz.A03(c04774v.A09() + scrTimeUs);
                    }
                    j = A062;
                    i = c04774v.A09();
                }
                A01(c04774v);
                i2 = c04774v.A09();
            }
        }
        if (j != C10323vs.b) {
            return C0776Gz.A05(j, i2 + scrTimeUs);
        }
        return C0776Gz.A03;
    }

    /* JADX WARN: Incorrect condition in loop: B:22:0x005b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A01(C04774v c04774v) {
        int packStuffingLength;
        int packStuffingLength2;
        int systemHeaderLength = c04774v.A0A();
        if (c04774v.A07() < 10) {
            c04774v.A0f(systemHeaderLength);
            return;
        }
        c04774v.A0g(9);
        int limit = c04774v.A0I();
        int packStuffingLength3 = limit & 7;
        int limit2 = c04774v.A07();
        if (limit2 < packStuffingLength3) {
            c04774v.A0f(systemHeaderLength);
            return;
        }
        c04774v.A0g(packStuffingLength3);
        int limit3 = c04774v.A07();
        if (limit3 < 4) {
            c04774v.A0f(systemHeaderLength);
            return;
        }
        byte[] A0l = c04774v.A0l();
        int limit4 = c04774v.A09();
        packStuffingLength = C1941lC.A00(A0l, limit4);
        if (packStuffingLength == 443) {
            c04774v.A0g(4);
            int packStuffingLength4 = c04774v.A0M();
            int limit5 = c04774v.A07();
            if (limit5 < packStuffingLength4) {
                c04774v.A0f(systemHeaderLength);
                return;
            }
            c04774v.A0g(packStuffingLength4);
        }
        while (limit >= 4) {
            byte[] A0l2 = c04774v.A0l();
            int limit6 = c04774v.A09();
            packStuffingLength2 = C1941lC.A00(A0l2, limit6);
            if (packStuffingLength2 == 442 || packStuffingLength2 == 441 || (packStuffingLength2 >>> 8) != 1) {
                return;
            }
            c04774v.A0g(4);
            if (c04774v.A07() < 2) {
                c04774v.A0f(systemHeaderLength);
                return;
            }
            int nextStartCode = c04774v.A0M();
            int packStuffingLength5 = c04774v.A0A();
            int limit7 = c04774v.A09();
            c04774v.A0f(Math.min(packStuffingLength5, limit7 + nextStartCode));
        }
    }

    @Override // com.facebook.ads.redexgen.X.H1
    public final void AFs() {
        this.A00.A0i(C5C.A07);
    }

    @Override // com.facebook.ads.redexgen.X.H1
    public final C0776Gz AIw(InterfaceC2033ms interfaceC2033ms, long j) throws IOException {
        long A8n = interfaceC2033ms.A8n();
        int min = (int) Math.min(20000L, interfaceC2033ms.A8O() - A8n);
        this.A00.A0d(min);
        interfaceC2033ms.AGt(this.A00.A0l(), 0, min);
        return A00(this.A00, j, A8n);
    }
}
