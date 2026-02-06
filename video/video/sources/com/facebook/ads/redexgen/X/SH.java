package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.UUID;
import o.C3307Iz;
import o.C3503Kz;
import o.C8077mf;
import o.QC1;

/* loaded from: assets/audience_network/classes2.dex */
public final class SH implements RewardedVideoAdApi, Repairable {
    public static byte[] A04;
    public static String[] A05 = {"k8yEFjaDDmJNEMKVrce3vEWkKDhb9GrD", "5HJZEEaowyWiZ6x5JcW91LnqKILZK9iv", "JCdbC5zohUOjfclxz", "cbOkRGwJ0he66t85Zev39Ck1DLyP", "QnWh1EoQaEskbAIVlUx7Y0ywxM6b", "GMmjAnpO", "8CCIVLGxcMAoQXrfALv1hDyohO9DfryR", "UYxyoZ6BjjTfNK3ar4eEie7WMpDsFwCV"};
    public final com.facebook.ads.Ad A00;
    public final C1768iI A01;
    public final C7X A02;
    public final C1673gi A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 9);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{QC1.w, 124, 121, 121, C3307Iz.d0, 40, 113, C3307Iz.e0, C8077mf.E, 74, C8077mf.D, C8077mf.z, 74, 76, C8077mf.G, 75, 102, 48, 50, 97, 53, 97, 48, 55, 32, 117, 34, 113, C3307Iz.X, C3307Iz.f0, C3307Iz.f0, 34, 52, 19, 9, C8077mf.B, C8077mf.q, 19, 28, 17, 93, C8077mf.B, C8077mf.q, C8077mf.q, C8077mf.u, C8077mf.q, 83, 119, 105, 94, 76, 90, 73, 95, 94, 95, C8077mf.E, 77, 82, 95, 94, 84, C8077mf.E, 90, 95, C8077mf.E, 95, 94, 72, 79, 73, 84, 66, 94, 95, 59, C8077mf.n, C8077mf.H, 8, C8077mf.E, 13, C8077mf.n, 13, 73, 31, 0, 13, C8077mf.n, 6, 73, 8, 13, 73, 5, 6, 8, 13, 73, C8077mf.E, C8077mf.n, C8077mf.B, 28, C8077mf.n, C8077mf.D, C8077mf.G, C8077mf.n, 13, C3307Iz.V, C8077mf.z, 4, C8077mf.u, 1, C8077mf.A, C8077mf.z, C8077mf.A, 83, 5, C8077mf.D, C8077mf.A, C8077mf.z, 28, 83, C8077mf.u, C8077mf.A, 83, 0, C8077mf.E, 28, 4, 83, C8077mf.r, C8077mf.u, 31, 31, C8077mf.z, C8077mf.A, 66, 67, 85, 82, 84, 73, 95, 73, 74, 68, 65, 100, 65, C8077mf.z, 13, 10, C8077mf.u};
    }

    static {
        A01();
    }

    public SH(Context context, String str, com.facebook.ads.Ad ad) {
        String uuid;
        this.A00 = ad;
        if (context instanceof C1673gi) {
            this.A03 = (C1673gi) context;
            uuid = this.A03.A0F().getId();
        } else {
            uuid = UUID.randomUUID().toString();
            this.A03 = C1046Rp.A07(context, uuid);
        }
        InterfaceC0899Lt A0F = this.A03.A0F();
        String adId = AdPlacementType.REWARDED_VIDEO.toString();
        A0F.A3T(adId, str);
        this.A01 = new C1768iI(this.A03, str, this.A00, new C1793ij());
        this.A03.A0O(this);
        this.A02 = new C7X(this.A01, uuid);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A02 */
    public final SI buildLoadAdConfig() {
        return new SI(this);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A03 */
    public final SJ buildShowAdConfig() {
        return new SJ();
    }

    public final void A04() {
        if (C1123Up.A2M(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0F().A3U();
    }

    public final void A05(RewardData rewardData) {
        this.A02.A0G(rewardData);
    }

    public final void A06(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A04 = rewardedVideoAdListener;
        this.A03.A0F().A3M(rewardedVideoAdListener != null);
        String[] strArr = A05;
        if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
            throw new RuntimeException();
        }
        A05[6] = "1SRpemADNZd8xb9i9fuLSYNF0AwY2Tu2";
    }

    public final void A07(String str, AdExperienceType adExperienceType, boolean z) {
        if (str == null) {
            this.A03.A0F().A3Q();
        } else {
            C1673gi c1673gi = this.A03;
            if (A05[6].charAt(25) == 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[3] = "67CWYk6q7caxeYWX3cgidRuGJDEH";
            strArr[4] = "JzT9b8y5FiDfchRrDecE58hhFV9F";
            c1673gi.A0F().A3P();
        }
        this.A02.A0F(this.A00, str, adExperienceType, z);
        this.A03.A0F().A3O();
    }

    public final boolean A08(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        this.A03.A0F().A3Z();
        boolean A0J = this.A02.A0J(this.A00, rewardedVideoShowAdConfig);
        this.A03.A0F().A3Y(A0J);
        return A0J;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void destroy() {
        AbstractC1156Vy.A05(A00(136, 7, 47), A00(48, 27, 50), A00(0, 8, 64));
        A04();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final String getPlacementId() {
        return this.A01.A0D;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.Ad
    public final boolean isAdInvalidated() {
        boolean A0H = this.A02.A0H();
        this.A03.A0F().A5f(A0H);
        return A0H;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0I();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    public final void loadAd() {
        AbstractC1156Vy.A05(A00(C3503Kz.g0, 6, 44), A00(75, 32, 96), A00(24, 8, 30));
        A07(null, null, true);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((SI) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A01.A04 != null) {
            this.A01.A04.onError(this.A00, new AdError(2001, A00(32, 16, 116) + AbstractC1200Xt.A03(this.A01.A0B, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A06 = extraHints.getHints();
        this.A01.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        AbstractC1156Vy.A05(A00(149, 4, 108), A00(107, 29, 122), A00(8, 8, 38));
        return A08(new SJ().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        AbstractC1156Vy.A05(A00(149, 4, 108), A00(107, 29, 122), A00(16, 8, 88));
        return A08(rewardedVideoShowAdConfig);
    }
}
