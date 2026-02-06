package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;
import o.AD1;
import o.C2638Cg0;

/* renamed from: com.facebook.ads.redexgen.X.iF  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1765iF extends OU implements S2SRewardedVideoAdExtendedListener {
    public static byte[] A02;
    public final C1784iZ A00;
    public final C1768iI A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{C2638Cg0.u7, -52, -46, -35, C2638Cg0.r7, -48, -48, C2638Cg0.y7, -48, -35, C2638Cg0.p7, C2638Cg0.y7, C2638Cg0.q7, C2638Cg0.r7, -35, C2638Cg0.v7, C2638Cg0.r7, -41, -73, -68, C2638Cg0.q7, C2638Cg0.y7, C2638Cg0.o7, -60, C2638Cg0.y7, -60, -73, -78, -77, -67, C2638Cg0.y7, -78, C2638Cg0.r7, C2638Cg0.o7, -81, C2638Cg0.q7, -73, -67, -68, C2638Cg0.y7, -71, -77, C2638Cg0.u7, 114, 117, 116, 109, -123, 111, 116, 124, 103, 114, 111, 106, 103, 122, 111, 117, 116, -123, 122, 111, 115, 107, -123, 113, 107, Byte.MAX_VALUE, -107, -106, -108, -95, -121, -108, -108, -111, -108, -95, -113, -121, -107, -107, -125, -119, -121, -95, -115, -121, -101};
    }

    public C1765iF(String str, OW ow, C1784iZ c1784iZ, C1768iI c1768iI) {
        super(str, ow);
        this.A00 = c1784iZ;
        this.A01 = c1768iI;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad) {
        super.A00.AEs(2104, super.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(43, 26, 34), this.A00.A0F());
        bundle.putInt(A00(18, 25, 106), this.A01.A00);
        super.A00.AEs(AdError.BROKEN_MEDIA_ERROR_CODE, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(69, 21, 62), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 122), adError.getErrorCode());
        super.A00.AEs(2103, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
        super.A00.AEs(2105, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        super.A00.AEs(AD1.m1, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        super.A00.AEs(3001, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        super.A00.AEs(2106, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        super.A00.AEs(2110, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        super.A00.AEs(3000, super.A01, null);
    }
}
