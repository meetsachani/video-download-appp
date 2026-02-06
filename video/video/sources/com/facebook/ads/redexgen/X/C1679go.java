package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.go  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1679go extends AbstractRunnableC1160Wc {
    public static byte[] A02;
    public final /* synthetic */ C1678gn A00;
    public final /* synthetic */ AtomicBoolean A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{C8077mf.p, C3307Iz.d0, C3307Iz.f0, 51, 48, -21, 49, C3307Iz.d0, 52, 55, -7, -110, -80, -78, -73, -76, 111, C2638Cg0.q7, -60, -78, -78, -76, C2638Cg0.q7, C2638Cg0.q7, 125};
    }

    public C1679go(C1678gn c1678gn, AtomicBoolean atomicBoolean) {
        this.A00 = c1678gn;
        this.A01 = atomicBoolean;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC1160Wc
    public final void A07() {
        T8 t8;
        long j;
        T8 t82;
        long j2;
        if (this.A00.A00 != null) {
            if (this.A01.get()) {
                this.A00.A02.A0I(VH.A0H);
                t82 = this.A00.A02.A04;
                C1072Sq c1072Sq = this.A00.A01;
                int i = T0.A00;
                j2 = this.A00.A02.A00;
                T0.A02(t82, c1072Sq, i, A00(11, 14, 1), j2);
                this.A00.A02.A0U();
                this.A00.A00.ADT();
                return;
            }
            this.A00.A02.A0I(VH.A0G);
            t8 = this.A00.A02.A04;
            C1072Sq c1072Sq2 = this.A00.A01;
            int i2 = T0.A04;
            j = this.A00.A02.A00;
            T0.A02(t8, c1072Sq2, i2, A00(0, 11, 125), j);
            this.A00.A02.A0V();
            this.A00.A00.ADL();
        }
    }
}
