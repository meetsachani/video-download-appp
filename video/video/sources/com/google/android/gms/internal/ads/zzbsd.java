package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import o.C10229vT;

/* loaded from: classes2.dex */
public final class zzbsd implements MediationInterstitialAdapter {
    public Activity a;
    public MediationInterstitialListener b;
    public Uri c;

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onDestroy() {
        com.google.android.gms.ads.internal.util.client.zzo.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onPause() {
        com.google.android.gms.ads.internal.util.client.zzo.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public final void onResume() {
        com.google.android.gms.ads.internal.util.client.zzo.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.b = mediationInterstitialListener;
        if (mediationInterstitialListener == null) {
            com.google.android.gms.ads.internal.util.client.zzo.g("Listener not set for mediation. Returning.");
        } else if (context instanceof Activity) {
            if (!zzbdw.g(context)) {
                com.google.android.gms.ads.internal.util.client.zzo.g("Default browser does not support custom tabs. Bailing out.");
                this.b.d(this, 0);
                return;
            }
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                com.google.android.gms.ads.internal.util.client.zzo.g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.b.d(this, 0);
                return;
            }
            this.a = (Activity) context;
            this.c = Uri.parse(string);
            this.b.v(this);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.b.d(this, 0);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        C10229vT d = new C10229vT.i().d();
        d.a.setData(this.c);
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzbsc(this, new AdOverlayInfoParcel(new com.google.android.gms.ads.internal.overlay.zzc(d.a, null), null, new zzbsb(this), null, new VersionInfoParcel(0, 0, false), null, null, "")));
        com.google.android.gms.ads.internal.zzv.t().r();
    }
}
