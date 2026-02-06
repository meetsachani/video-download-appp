package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
final class zza implements CustomEventBannerListener {
    public final CustomEventAdapter a;
    public final MediationBannerListener b;

    public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.a = customEventAdapter;
        this.b = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void a() {
        zzo.b("Custom event adapter called onAdLeftApplication.");
        this.b.t(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void d() {
        zzo.b("Custom event adapter called onAdOpened.");
        this.b.l(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void e(AdError adError) {
        zzo.b("Custom event adapter called onAdFailedToLoad.");
        this.b.e(this.a, adError);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void f(int i) {
        zzo.b("Custom event adapter called onAdFailedToLoad.");
        this.b.n(this.a, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
    public final void g(View view) {
        zzo.b("Custom event adapter called onAdLoaded.");
        CustomEventAdapter customEventAdapter = this.a;
        customEventAdapter.a = view;
        this.b.h(customEventAdapter);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzo.b("Custom event adapter called onAdClosed.");
        this.b.o(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void y() {
        zzo.b("Custom event adapter called onAdClicked.");
        this.b.f(this.a);
    }
}
