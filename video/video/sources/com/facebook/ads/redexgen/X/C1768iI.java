package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAdListener;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.iI  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1768iI implements T5 {
    public int A00 = -1;
    public long A01 = -1;
    public AdExperienceType A02;
    public RewardData A03;
    public RewardedVideoAdListener A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public com.facebook.ads.Ad A09;
    public WeakReference<com.facebook.ads.Ad> A0A;
    public final C1673gi A0B;
    public final U3 A0C;
    public final String A0D;

    public C1768iI(C1673gi c1673gi, String str, com.facebook.ads.Ad ad, U3 u3) {
        this.A0B = c1673gi;
        this.A0D = str;
        this.A09 = ad;
        this.A0A = new WeakReference<>(ad);
        this.A0C = u3;
        c1673gi.A0N(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.T5
    /* renamed from: A00 */
    public final RewardedVideoAdListener A6o() {
        return this.A04;
    }

    public final C1673gi A01() {
        return this.A0B;
    }

    public final void A02(com.facebook.ads.Ad ad) {
        if (ad == null && !C1123Up.A0u(this.A0B)) {
            return;
        }
        this.A09 = ad;
    }

    @Override // com.facebook.ads.redexgen.X.T5
    public final com.facebook.ads.Ad A6k() {
        return this.A09 != null ? this.A09 : this.A0A.get();
    }
}
