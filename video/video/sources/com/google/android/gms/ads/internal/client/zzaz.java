package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzbwq;
import com.google.android.gms.internal.ads.zzbxc;
import com.google.android.gms.internal.ads.zzbyv;
import java.util.HashMap;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaz {
    public final zzk a;
    public final zzi b;
    public final zzfa c;
    public final zzbic d;
    public final zzbti e;
    public final zzbid f;
    public zzbuk g;
    public final zzl h;

    public zzaz(zzk zzkVar, zzi zziVar, zzfa zzfaVar, zzbic zzbicVar, zzbxc zzbxcVar, zzbti zzbtiVar, zzbid zzbidVar, zzl zzlVar) {
        this.a = zzkVar;
        this.b = zziVar;
        this.c = zzfaVar;
        this.d = zzbicVar;
        this.e = zzbtiVar;
        this.f = zzbidVar;
        this.h = zzlVar;
    }

    public static /* bridge */ /* synthetic */ void v(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzbb.b().t(context, zzbb.c().X, "gmob-apps", bundle, true);
    }

    public final zzbt d(Context context, String str, zzbpl zzbplVar) {
        return (zzbt) new zzaq(this, context, str, zzbplVar).d(context, false);
    }

    public final zzbx e(Context context, zzr zzrVar, String str, zzbpl zzbplVar) {
        return (zzbx) new zzam(this, context, zzrVar, str, zzbplVar).d(context, false);
    }

    public final zzbx f(Context context, zzr zzrVar, String str, zzbpl zzbplVar) {
        return (zzbx) new zzao(this, context, zzrVar, str, zzbplVar).d(context, false);
    }

    public final zzch g(Context context, zzbpl zzbplVar) {
        return (zzch) new zzas(this, context, zzbplVar).d(context, false);
    }

    @InterfaceC11300zs1
    public final zzdt h(Context context, zzbpl zzbplVar) {
        return (zzdt) new zzae(this, context, zzbplVar).d(context, false);
    }

    public final zzbgk j(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbgk) new zzaw(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final zzbgq k(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbgq) new zzay(this, view, hashMap, hashMap2).d(view.getContext(), false);
    }

    public final zzbky n(Context context, zzbpl zzbplVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbky) new zzak(this, context, zzbplVar, onH5AdsEventListener).d(context, false);
    }

    @InterfaceC11300zs1
    public final zzbte o(Context context, zzbpl zzbplVar) {
        return (zzbte) new zzai(this, context, zzbplVar).d(context, false);
    }

    @InterfaceC11300zs1
    public final zzbtl q(Activity activity) {
        zzac zzacVar = new zzac(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            com.google.android.gms.ads.internal.util.client.zzo.d("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbtl) zzacVar.d(activity, z);
    }

    public final zzbwq s(Context context, String str, zzbpl zzbplVar) {
        return (zzbwq) new zzaa(this, context, str, zzbplVar).d(context, false);
    }

    @InterfaceC11300zs1
    public final zzbyv t(Context context, zzbpl zzbplVar) {
        return (zzbyv) new zzag(this, context, zzbplVar).d(context, false);
    }
}
