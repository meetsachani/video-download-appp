package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.id  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1788id implements OG {
    public static byte[] A09;
    public static final String A0A;
    public long A00 = -1;
    public InterstitialAd A01;
    public NQ A02;
    public C05437j A03;
    public boolean A04;
    public boolean A05;
    public final C1673gi A06;
    public final InterstitialAdExtendedListener A07;
    public final C1783iY A08;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A09 = new byte[]{-88, -43, -121, -56, C2638Cg0.x7, -121, -45, -42, -56, C2638Cg0.x7, -121, -48, C2638Cg0.B7, -121, -56, -45, C2638Cg0.E7, -52, -56, C2638Cg0.x7, -32, -121, -48, -43, -121, -41, C2638Cg0.E7, -42, C2638Cg0.z7, C2638Cg0.E7, -52, C2638Cg0.B7, C2638Cg0.B7, -107, -121, C2638Cg0.o7, -42, -36, -121, C2638Cg0.B7, C2638Cg0.A7, -42, -36, -45, C2638Cg0.x7, -121, -34, -56, -48, -37, -121, C2638Cg0.y7, -42, C2638Cg0.E7, -121, -56, C2638Cg0.x7, -77, -42, -56, C2638Cg0.x7, -52, C2638Cg0.x7, -113, -112, -121, -37, -42, -121, C2638Cg0.v7, -52, -121, C2638Cg0.w7, -56, -45, -45, -52, C2638Cg0.x7, -103, -66, -60, -75, C2638Cg0.q7, C2638Cg0.r7, -60, -71, -60, -71, -79, -68, 112, -68, -65, -79, -76, 112, -77, -79, -68, -68, -75, -76, 112, C2638Cg0.u7, -72, -71, -68, -75, 112, C2638Cg0.r7, -72, -65, C2638Cg0.u7, -71, -66, -73, 112, -71, -66, -60, -75, C2638Cg0.q7, C2638Cg0.r7, -60, -71, -60, -71, -79, -68, 126, -33, -18, -25};
    }

    static {
        A0A();
        A0A = C1788id.class.getSimpleName();
    }

    public C1788id(C1783iY c1783iY, OW ow, String str) {
        this.A08 = c1783iY;
        this.A06 = c1783iY.A05();
        this.A07 = new C1766iG(str, ow, this);
    }

    public final long A0D() {
        if (this.A03 != null) {
            return this.A03.A0G();
        }
        return -1L;
    }

    public final C1783iY A0E() {
        return this.A08;
    }

    public final C1673gi A0F() {
        return this.A06;
    }

    public final void A0G(EnumSet<CacheFlag> cacheFlags, String str) {
        String A02;
        this.A00 = System.currentTimeMillis();
        if (!this.A05 && this.A03 != null) {
            Log.w(A0A, A09(0, 78, 45));
        }
        this.A05 = false;
        if (this.A04 && !C1123Up.A0i(this.A06)) {
            this.A06.A08().ABC(A09(130, 3, 68), AbstractC1085Td.A0L, new C1086Te(A09(78, 52, 22)));
            AdErrorType adErrorType = AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A06.A0F().A3N(Y1.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A07.onError(this.A08.A6k(), new AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        if (this.A03 != null) {
            this.A03.A0S(new C1792ii(this));
            this.A03.A0N();
            this.A03.A0K();
            this.A03 = null;
        }
        O7 o7 = new O7(this.A08.A0A(), AbstractC1150Vs.A00(this.A06.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, EnumC1147Vp.A08, 1, cacheFlags, this.A08.A06());
        if (C1123Up.A2g(this.A06) && (A02 = XC.A02(this.A06, this.A08.A08())) != null) {
            this.A08.A0I(A02);
        }
        o7.A06(this.A08.A08());
        o7.A07(this.A08.A09());
        o7.A04(this.A08.A03());
        this.A03 = new C05437j(this.A06, o7);
        this.A03.A0S(new Cif(this));
        this.A03.A0W(str);
    }

    public final boolean A0H() {
        return this.A03 == null || this.A03.A0Z();
    }

    public final boolean A0I() {
        return this.A05;
    }

    public final boolean A0J() {
        AdError adError = AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A05) {
            this.A06.A0F().A3N(Y1.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A6k(), adError);
            return false;
        } else if (this.A03 == null) {
            this.A06.A08().ABC(A09(130, 3, 68), AbstractC1085Td.A0S, new C1086Te(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A06.A0F().A3N(Y1.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A6k(), adError);
            return false;
        } else {
            this.A03.A0M();
            this.A04 = true;
            this.A05 = false;
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.OG
    public final void destroy() {
        if (this.A03 != null) {
            this.A03.A0S(new C1789ie(this));
            this.A03.A0Y(true);
            this.A03.A0K();
            this.A03 = null;
            this.A05 = false;
            this.A04 = false;
        }
    }
}
