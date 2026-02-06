package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.BlockingQueue;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.gk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1675gk implements InterfaceC1603fa {
    public static byte[] A04;
    public static String[] A05 = {"5xwnqBcSwQdKZIKpCxhEhIB1ehz5rbXz", "SVnny4sMHrVxDT0mCWgznsGyNwA0K29Q", "WSedDxIDZVsWQqxlis9Ww20KqcWIyEnI", "k4ruqDXMLqmQWww9EukWiXBxmglEjOwQ", "qeuUn3ZO1g9cCLbTYKy8rfCeNqsjP", "lwrAvEwGJvKZaAaN19YZU8UxJCWRUSKU", "KAMWqSOuX5oAD", "9nA6fjXGqk7Q6o3drz3rA7fb0omaCvC"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ CallableC1074Ss A02;
    public final /* synthetic */ C1075St A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
            if (A05[5].charAt(12) == 'F') {
                throw new RuntimeException();
            }
            A05[5] = "k7DX94ZUmS6mjbqg2Uqpnt5MM6ksEeAZ";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A05[5].charAt(12) == 'F') {
            throw new RuntimeException();
        }
        A05[4] = "84A19LE3N5skcLW3UxwckiEcHwoNq";
        A04 = new byte[]{C8077mf.u, C8077mf.m, 8, C8077mf.m, C8077mf.n, C8077mf.x, C8077mf.m, -9, -22, -27, -26, -16};
    }

    static {
        A01();
    }

    public C1675gk(CallableC1074Ss callableC1074Ss, C1075St c1075St, long j, long j2) {
        this.A02 = callableC1074Ss;
        this.A03 = c1075St;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1603fa
    public final void ADj(boolean z) {
        T8 t8;
        BlockingQueue blockingQueue;
        T8 t82;
        T8 t83;
        t8 = this.A02.A01.A04;
        if (T0.A06(t8)) {
            C1081Sz c1081Sz = new C1081Sz(this.A03.A06, this.A03.A07, A00(7, 5, 81), this.A03.A02, this.A03.A08);
            t82 = this.A02.A01.A04;
            T0.A04(t82, c1081Sz, z);
            if (!z) {
                t83 = this.A02.A01.A04;
                T0.A05(t83, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            C1079Sx.A0A().put(c1081Sz.A04, c1081Sz);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1603fa
    public final void ADr(Throwable th) {
        T8 t8;
        BlockingQueue blockingQueue;
        T8 t82;
        t8 = this.A02.A01.A04;
        if (T0.A06(t8)) {
            t82 = this.A02.A01.A04;
            T0.A05(t82, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 81), this.A03.A02, 2119, th != null ? th.toString() : A00(0, 7, 109), null, Long.valueOf(System.currentTimeMillis() - this.A01), null);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
