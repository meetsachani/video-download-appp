package com.facebook.ads.redexgen.X;

import java.io.IOException;
import o.C10323vs;
import o.Xu2;

/* renamed from: com.facebook.ads.redexgen.X.l8  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1937l8 implements H1 {
    public static String[] A04 = {"sdKdmhexVnrlWGhX9TH5KtuHBxlX2", "B98Zkm438dg3YkwTFsWcwjYsIqopE2cW", "q7DFl2FydsE0DWNk8QJk98tFdBPGU17r", "uw89PlDwsU5CTp5ALy1o", "HmpI", "x0Unc4LQNUVImDERNKiE", "Klo4tVDdc3zNBBgsT3eAMryjwXw3w", "mmy2vPNb8zCZX"};
    public final int A00;
    public final int A01;
    public final C04774v A02 = new C04774v();
    public final AnonymousClass53 A03;

    public C1937l8(int i, AnonymousClass53 anonymousClass53, int i2) {
        this.A00 = i;
        this.A03 = anonymousClass53;
        this.A01 = i2;
    }

    private C0776Gz A00(C04774v c04774v, long j, long j2) {
        int A00;
        int A002;
        int A0A = c04774v.A0A();
        long j3 = -1;
        long j4 = -1;
        long lastPcrTimeUsInRange = C10323vs.b;
        while (c04774v.A07() >= 188 && (A002 = (A00 = LI.A00(c04774v.A0l(), c04774v.A09(), A0A)) + Xu2.A) <= A0A) {
            long A01 = LI.A01(c04774v, A00, this.A00);
            if (A01 != C10323vs.b) {
                long A06 = this.A03.A06(A01);
                if (A06 > j) {
                    String[] strArr = A04;
                    if (strArr[1].charAt(12) != strArr[2].charAt(12)) {
                        String[] strArr2 = A04;
                        strArr2[3] = "aExFpEIrb6zE8t35yvld";
                        strArr2[5] = "jMLoot3yN0lnttWSwPI3";
                        if (lastPcrTimeUsInRange == C10323vs.b) {
                            return C0776Gz.A04(A06, j2);
                        }
                        return C0776Gz.A03(j2 + j3);
                    }
                    throw new RuntimeException();
                }
                int i = ((A06 + 100000) > j ? 1 : ((A06 + 100000) == j ? 0 : -1));
                String[] strArr3 = A04;
                if (strArr3[1].charAt(12) != strArr3[2].charAt(12)) {
                    String[] strArr4 = A04;
                    strArr4[3] = "ZHgwZuqrkfLn2FTfbKUV";
                    strArr4[5] = "99YI6qOyfmrUQVvNk1ZB";
                    if (i > 0) {
                        return C0776Gz.A03(A00 + j2);
                    }
                    j3 = A00;
                    lastPcrTimeUsInRange = A06;
                } else {
                    A04[4] = "5ynNf";
                    if (i > 0) {
                        return C0776Gz.A03(A00 + j2);
                    }
                    j3 = A00;
                    lastPcrTimeUsInRange = A06;
                }
            }
            c04774v.A0f(A002);
            j4 = A002;
        }
        if (lastPcrTimeUsInRange != C10323vs.b) {
            return C0776Gz.A05(lastPcrTimeUsInRange, j2 + j4);
        }
        return C0776Gz.A03;
    }

    @Override // com.facebook.ads.redexgen.X.H1
    public final void AFs() {
        this.A02.A0i(C5C.A07);
    }

    @Override // com.facebook.ads.redexgen.X.H1
    public final C0776Gz AIw(InterfaceC2033ms interfaceC2033ms, long j) throws IOException {
        long A8n = interfaceC2033ms.A8n();
        int min = (int) Math.min(this.A01, interfaceC2033ms.A8O() - A8n);
        this.A02.A0d(min);
        interfaceC2033ms.AGt(this.A02.A0l(), 0, min);
        return A00(this.A02, j, A8n);
    }
}
