package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
final class zzb implements CustomEventInterstitialListener {
    public final CustomEventAdapter a;
    public final MediationInterstitialListener b;
    public final /* synthetic */ CustomEventAdapter c;

    public zzb(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.c = customEventAdapter;
        this.a = customEventAdapter2;
        this.b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void a() {
        zzo.b("Custom event adapter called onAdLeftApplication.");
        this.b.c(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void d() {
        zzo.b("Custom event adapter called onAdOpened.");
        this.b.z(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void e(AdError adError) {
        zzo.b("Custom event adapter called onFailedToReceiveAd.");
        this.b.u(this.a, adError);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void f(int i) {
        zzo.b("Custom event adapter called onFailedToReceiveAd.");
        this.b.d(this.a, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public final void h() {
        zzo.b("Custom event adapter called onReceivedAd.");
        this.b.v(this.c);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.b("Custom event adapter called onAdClosed.");
        this.b.x(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void y() {
        zzo.b("Custom event adapter called onAdClicked.");
        this.b.i(this.a);
    }
}
