package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.So  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1070So {
    public static byte[] A03;
    public static final AtomicBoolean A04;
    public C1669ge A00;
    public String A01;
    public final C1192Xl A02 = new C1192Xl(300000000000L, new C1680gp(this));

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-56, -43, -56, -45, -42, C2638Cg0.z7, -86, -95, -80, -77, -85, -82, -89, -69, -80, -75, -84, -95, C2638Cg0.o7, -78, C2638Cg0.o7, C2638Cg0.o7, -74, -68, -69, -52, C2638Cg0.p7, -74, -70, -78};
    }

    static {
        A04();
        A04 = new AtomicBoolean(false);
    }

    public static UD A00(C1669ge c1669ge) {
        if (C1123Up.A1B(c1669ge)) {
            return UE.A01(A01(0, 6, 55), A01(18, 12, 29), A01(6, 12, 12));
        }
        return UE.A00();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1669ge c1669ge;
        synchronized (this) {
            c1669ge = this.A00;
        }
        if (c1669ge == null) {
            return;
        }
        String A05 = UG.A00().A01(c1669ge, true).A05(A00(c1669ge));
        synchronized (this) {
            this.A01 = A05;
        }
    }

    public static void A03() {
        A04.set(true);
    }

    public final synchronized String A06(C1669ge c1669ge) {
        this.A00 = c1669ge;
        this.A00.A08().ACP();
        this.A00.A04().ADI(c1669ge);
        if (this.A00.A07().AJw() || ((A04.get() && C1123Up.A21(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A04.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
