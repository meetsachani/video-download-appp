package com.facebook.ads.redexgen.X;

import android.util.SparseArray;

/* renamed from: com.facebook.ads.redexgen.X.l5  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1934l5 implements L8 {
    public final C04764u A00 = new C04764u(new byte[4]);
    public final /* synthetic */ C1932l3 A01;

    public C1934l5(C1932l3 c1932l3) {
        this.A01 = c1932l3;
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void A5A(C04774v c04774v) {
        int secondHeaderByte;
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int tableId = c04774v.A0I();
        if (tableId != 0) {
            return;
        }
        int tableId2 = c04774v.A0I();
        if ((tableId2 & 128) == 0) {
            return;
        }
        c04774v.A0g(6);
        int A07 = c04774v.A07() / 4;
        for (int i = 0; i < A07; i++) {
            c04774v.A0h(this.A00, 4);
            int programCount = this.A00.A04(16);
            this.A00.A09(3);
            if (programCount == 0) {
                this.A00.A09(13);
            } else {
                int A04 = this.A00.A04(13);
                sparseArray2 = this.A01.A0B;
                if (sparseArray2.get(A04) == null) {
                    sparseArray3 = this.A01.A0B;
                    sparseArray3.put(A04, new C1938l9(new C1933l4(this.A01, A04)));
                    C1932l3.A02(this.A01);
                }
            }
        }
        secondHeaderByte = this.A01.A09;
        if (secondHeaderByte != 2) {
            sparseArray = this.A01.A0B;
            sparseArray.remove(0);
        }
    }

    @Override // com.facebook.ads.redexgen.X.L8
    public final void AAA(AnonymousClass53 anonymousClass53, HA ha, LG lg) {
    }
}
