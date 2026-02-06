package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;

/* loaded from: assets/audience_network/classes2.dex */
public class OI implements RewardedVideoAdListener {
    public final /* synthetic */ C1786ib A00;

    public OI(C1786ib c1786ib) {
        this.A00 = c1786ib;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1768iI c1768iI;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        c1768iI = this.A00.A00.A08;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(c1768iI.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad, AdError adError) {
        NQ nq;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1768iI c1768iI;
        this.A00.A00.A02 = null;
        nq = this.A00.A00.A03;
        ((AbstractC1847jd) nq).A2J(false);
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        c1768iI = this.A00.A00.A08;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(c1768iI.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A07;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
    }
}
