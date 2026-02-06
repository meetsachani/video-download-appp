package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.Surface;
import java.util.Arrays;
import o.C2638Cg0;
import o.C3307Iz;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.fX  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1600fX {
    public static byte[] A02;
    public final AA A00;
    public final C2050nA A01 = new C2050nA();

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{C2638Cg0.o7, C2638Cg0.w7, -66, C2638Cg0.o7, 1, -1, 19, 17, 3, C2638Cg0.o7, -66, C2638Cg0.n7, -66, C2638Cg0.o7, -74, C2638Cg0.o7, -76, -74, 6, -7, 2, -8, -7, 6, -7, 6, -35, 2, -8, -7, C8077mf.n, -74, -76, C2638Cg0.z7, -76, -74, C2638Cg0.w7, C3307Iz.X, -9, -6, 9, C8077mf.r, -73, 2, -6, 8, 8, -10, -4, -6, -73, -75, C2638Cg0.A7, -75, -73, -75, 92, -82, -77, -86, -97, 92, 90, 116, 90, 92};
    }

    public C1600fX(C1673gi c1673gi) {
        InterfaceC0712Em trackSelectionFactory = new C2067nR(this.A01);
        C05879h c05879h = new C05879h(trackSelectionFactory);
        AnonymousClass74 loadControl = new C2160ox();
        this.A00 = AbstractC05096b.A00(new C2157ou(c1673gi), c05879h, loadControl, this.A01);
    }

    public static String A01(C2223pz c2223pz) {
        boolean z = c2223pz instanceof AD;
        String A00 = A00(36, 2, 118);
        String A002 = A00(0, 14, 108);
        if (z) {
            AD ad = (AD) c2223pz;
            return A00(55, 11, 8) + ad.A03 + A00(14, 22, 98) + ad.A02 + A002 + ad.getCause() + A00;
        }
        return A00(41, 14, 99) + c2223pz.getMessage() + A002 + c2223pz.getCause() + A00;
    }

    public static boolean A03() {
        return true;
    }

    public final int A04() {
        return this.A00.A0I();
    }

    public final int A05() {
        return this.A00.A00();
    }

    public final long A06() {
        return this.A00.A7e();
    }

    public final long A07() {
        return this.A00.A7s();
    }

    public final C1598fV A08() {
        C2242qI vf = this.A00.A0K();
        if (vf == null) {
            return null;
        }
        return new C1598fV(vf.A0L, vf.A0A);
    }

    public final void A09() {
        this.A00.A0L();
    }

    public final void A0A() {
        this.A00.A02();
    }

    public final void A0B() {
        this.A00.A01();
    }

    public final void A0C(float f) {
        this.A00.A0M(f);
    }

    public final void A0D(long j) {
        this.A00.A04(j);
    }

    public final void A0E(Surface surface) {
        this.A00.A0N(surface);
    }

    public final void A0F(C1669ge c1669ge, Uri uri) {
        if (C1123Up.A2z(c1669ge, A03())) {
            C1604fb cacheManager = C1604fb.A06(c1669ge);
            C5Y cachedDataSourceFactory = cacheManager.A0H(c1669ge);
            this.A00.A0Q(new C05929o(cachedDataSourceFactory).A04(uri));
            return;
        }
        InterfaceC0671Cx mediaSource = new C05929o(new C2177pE(c1669ge, C5C.A0j(c1669ge, A00(38, 3, 100)), this.A01)).A04(uri);
        this.A00.A0Q(mediaSource);
    }

    public final void A0G(InterfaceC1597fU interfaceC1597fU) {
        this.A00.A0O(new D6(this, interfaceC1597fU));
    }

    public final void A0H(final InterfaceC1599fW interfaceC1599fW) {
        this.A00.A0P(new InterfaceC2148ol() { // from class: com.facebook.ads.redexgen.X.2s
            @Override // com.facebook.ads.redexgen.X.C5L
            public final void AGa(int i, int i2, int i3, float f) {
                interfaceC1599fW.AGa(i, i2, i3, f);
            }
        });
    }

    public final void A0I(boolean z) {
        this.A00.A0S(z);
    }

    public final boolean A0J() {
        return this.A00.A0T();
    }

    public final boolean A0K() {
        return this.A00.A0J() != null;
    }
}
