package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
final class zzc implements CustomEventNativeListener {
    public final CustomEventAdapter a;
    public final MediationNativeListener b;

    public zzc(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
        this.a = customEventAdapter;
        this.b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void a() {
        zzo.b("Custom event adapter called onAdLeftApplication.");
        this.b.j(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void b(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        zzo.b("Custom event adapter called onAdLoaded.");
        this.b.y(this.a, unifiedNativeAdMapper);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void c() {
        zzo.b("Custom event adapter called onAdImpression.");
        this.b.m(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void d() {
        zzo.b("Custom event adapter called onAdOpened.");
        this.b.a(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void e(AdError adError) {
        zzo.b("Custom event adapter called onAdFailedToLoad.");
        this.b.b(this.a, adError);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void f(int i) {
        zzo.b("Custom event adapter called onAdFailedToLoad.");
        this.b.r(this.a, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.b("Custom event adapter called onAdClosed.");
        this.b.g(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void y() {
        zzo.b("Custom event adapter called onAdClicked.");
        this.b.s(this.a);
    }
}
