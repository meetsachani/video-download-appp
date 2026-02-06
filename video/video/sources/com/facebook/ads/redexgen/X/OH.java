package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;

/* loaded from: assets/audience_network/classes2.dex */
public class OH implements InterstitialAdListener {
    public final /* synthetic */ AbstractC1847jd A00;
    public final /* synthetic */ Cif A01;

    public OH(Cif cif, AbstractC1847jd abstractC1847jd) {
        this.A01 = cif;
        this.A00 = abstractC1847jd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1783iY c1783iY;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1783iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1783iY.A6k());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad, AdError adError) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1783iY c1783iY;
        this.A01.A00.A01 = null;
        this.A00.A2J(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1783iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1783iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(com.facebook.ads.Ad ad) {
        C05437j c05437j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1783iY c1783iY;
        C05437j c05437j2;
        C05437j c05437j3;
        C05437j c05437j4;
        this.A01.A00.A04 = false;
        c05437j = this.A01.A00.A03;
        if (c05437j != null) {
            c05437j2 = this.A01.A00.A03;
            c05437j2.A0S(new C1791ih(this));
            c05437j3 = this.A01.A00.A03;
            c05437j3.A0N();
            c05437j4 = this.A01.A00.A03;
            c05437j4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1783iY = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1783iY.A6k());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(com.facebook.ads.Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
    }
}
