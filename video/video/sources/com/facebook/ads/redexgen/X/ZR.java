package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import o.C3307Iz;
import o.C4715Xk;
import o.C8077mf;

/* loaded from: assets/audience_network/classes2.dex */
public final class ZR implements TA {
    public static ZR A07;
    public static byte[] A08;
    public InterfaceC0903Lx A00;
    public T1 A01;
    public T9 A02;
    public TP A03;
    public U7 A04;
    public VM A05;
    public CY A06;

    static {
        A07();
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A08 = new byte[]{C3307Iz.d0, 62, 76, 76, 66, 72, 71, -7, C4715Xk.i, 58, 77, 58, -7, 66, 71, 66, 77, 66, 58, 69, 66, 83, 62, C4715Xk.i, 28, -13, -19, 32, C8077mf.E, -15, 28, C8077mf.q, C8077mf.D, C8077mf.C, 28, C8077mf.H, -3, C8077mf.q, C8077mf.G, C8077mf.G, 19, C8077mf.C, C8077mf.B, -18, C8077mf.m, C8077mf.H, C8077mf.m, -13, C8077mf.B, 19, C8077mf.H, 19, C8077mf.m, C8077mf.z, 19, 36, C8077mf.q, C8077mf.p};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C1669ge c1669ge) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1669ge);
        this.A06 = A05(c1669ge, this.A03, A03(c1669ge));
        A09(c1669ge, A00(c1669ge, this.A06));
        A0A(c1669ge, this.A06);
        A0B(c1669ge, this.A06);
        if (this.A06 != null) {
            this.A06.A6d();
        }
    }

    public static SR A00(C1669ge c1669ge, CY cy) {
        if (!C1123Up.A1r(c1669ge) || cy == null) {
            return null;
        }
        return SS.A00().A00(cy);
    }

    public static TP A01(C1669ge c1669ge) {
        return TQ.A00().A00(c1669ge, new C1372bp());
    }

    public static synchronized ZR A02() {
        ZR zr;
        synchronized (ZR.class) {
            if (A07 == null) {
                A07 = new ZR();
            }
            zr = A07;
        }
        return zr;
    }

    public static InterfaceC1624fv A03(C1669ge c1669ge) {
        if (!C1123Up.A1n(c1669ge)) {
            return null;
        }
        return C1642gD.A01(c1669ge);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.TA
    /* renamed from: A04 */
    public final synchronized CY A9F() {
        return this.A06;
    }

    public static CY A05(C1669ge c1669ge, TP tp, InterfaceC1624fv interfaceC1624fv) {
        if (!C1123Up.A2m(c1669ge) || interfaceC1624fv == null || ProcessUtils.isRemoteRenderingProcess()) {
            return null;
        }
        return AbstractC1665ga.A00().A00(c1669ge, tp, interfaceC1624fv, WI.A04(c1669ge), new ZW(new WA(c1669ge, A06(0, 0, 9), null, EnumC1148Vq.A08, 0, new C1152Vu(), AbstractC1200Xt.A01(C1123Up.A0N(c1669ge)), null, null, new C1793ij()), c1669ge), C1663gY.A00().A00());
    }

    public static void A08() {
        AbstractC1156Vy.A05(A06(30, 28, 52), A06(0, 24, 99), A06(24, 6, 68));
    }

    public static void A09(C1669ge c1669ge, SR sr) {
        if (!C1123Up.A1r(c1669ge) || sr == null) {
            return;
        }
        SP.A00().A00(sr, c1669ge);
    }

    public static void A0A(C1669ge c1669ge, CY cy) {
        if (!C1123Up.A0m(c1669ge) || cy == null) {
            return;
        }
        new C1068Sm(c1669ge, cy, new C1069Sn(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1669ge c1669ge, CY cy) {
        if (cy == null) {
            return;
        }
        AbstractC1127Ut.A00(c1669ge, cy);
    }

    @Override // com.facebook.ads.redexgen.X.TA
    public final VA A6n(C1669ge c1669ge) {
        return WW.A01(c1669ge);
    }

    @Override // com.facebook.ads.redexgen.X.TA
    public final synchronized T9 A74(T8 t8) {
        if (this.A02 == null) {
            this.A02 = new C1239Zg(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.TA
    public final synchronized T1 A7G() {
        if (this.A01 == null) {
            this.A01 = new C1674gj();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.TA
    public final synchronized TP A7l(T8 t8) {
        if (this.A03 == null) {
            this.A03 = A01(t8.A02());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.TA
    public final synchronized InterfaceC1084Tc A7n(T8 t8) {
        return new C1567f0(t8);
    }

    @Override // com.facebook.ads.redexgen.X.TA
    public final synchronized TB A7x(final T8 t8) {
        return new AbstractC1371bo(t8) { // from class: com.facebook.ads.redexgen.X.72
            @Override // com.facebook.ads.redexgen.X.TB
            public final boolean A9m() {
                return TextureView$SurfaceTextureListenerC0673Cz.A09();
            }

            @Override // com.facebook.ads.redexgen.X.TB
            public final void ACP() {
                U2.A06(C1046Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.X.TB
            public final void ACn() {
                U2.A07(C1046Rp.A09(super.A00));
            }

            @Override // com.facebook.ads.redexgen.X.TB
            public final void ADI(C1669ge c1669ge) {
                OP.A01(c1669ge);
            }
        };
    }

    @Override // com.facebook.ads.redexgen.X.TA
    public final synchronized InterfaceC0903Lx A8C(T8 t8) {
        if (C1123Up.A13(t8)) {
            if (this.A00 == null) {
                this.A00 = AbstractC0904Ly.A00().A00(new C1335bE(t8));
            }
            return this.A00;
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.TA
    public final synchronized TD A8y(T8 t8) {
        return new C1309ao(t8);
    }

    @Override // com.facebook.ads.redexgen.X.TA
    public final C1669ge A8z(Context context) {
        C1669ge sdkContext = T7.A00();
        if (sdkContext == null) {
            C1669ge sdkContext2 = new C1669ge(context, this);
            T7.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.X.TA
    public final synchronized VM A90(C1669ge c1669ge) {
        if (this.A05 == null) {
            this.A05 = new XP(c1669ge);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.TA
    public final synchronized U7 A96() {
        if (this.A04 == null) {
            this.A04 = new U7();
            A08();
        }
        return this.A04;
    }
}
