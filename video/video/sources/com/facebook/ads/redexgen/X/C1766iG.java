package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;
import o.AD1;
import o.C2638Cg0;
import o.QC1;

/* renamed from: com.facebook.ads.redexgen.X.iG  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1766iG extends OU implements InterstitialAdExtendedListener {
    public static byte[] A01;
    public final C1788id A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 27);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C2638Cg0.q7, C2638Cg0.u7, C2638Cg0.y7, C2638Cg0.n7, -66, C2638Cg0.x7, C2638Cg0.x7, -56, C2638Cg0.x7, C2638Cg0.n7, -68, -56, -67, -66, C2638Cg0.n7, -60, -66, -46, 117, QC1.w, 119, 112, -120, 114, 119, Byte.MAX_VALUE, 106, 117, 114, 109, 106, 125, 114, QC1.w, 119, -120, 125, 114, 118, 110, -120, 116, 110, -126, -66, -65, -67, C2638Cg0.w7, -80, -67, -67, -70, -67, C2638Cg0.w7, -72, -80, -66, -66, -84, -78, -80, C2638Cg0.w7, -74, -80, -60};
    }

    public C1766iG(String str, OW ow, C1788id c1788id) {
        super(str, ow);
        this.A00 = c1788id;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad) {
        super.A00.AEs(1024, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(18, 26, 14), this.A00.A0D());
        super.A00.AEs(1020, this.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(44, 21, 80), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 94), adError.getErrorCode());
        super.A00.AEs(1023, this.A01, bundle);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        super.A00.AEs(o.J8.f0, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(com.facebook.ads.Ad ad) {
        super.A00.AEs(o.J8.b0, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
        super.A00.AEs(1021, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
        super.A00.AEs(1025, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
        super.A00.AEs(3000, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
        super.A00.AEs(AD1.m1, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
        super.A00.AEs(3001, this.A01, null);
    }
}
