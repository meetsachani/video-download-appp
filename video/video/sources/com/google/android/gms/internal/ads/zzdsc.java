package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.C9755tW1;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzdsc {
    public final Map a = new ConcurrentHashMap();
    public final /* synthetic */ zzdsd b;

    @InterfaceC5056aJ2
    public zzdsc(zzdsd zzdsdVar) {
        this.b = zzdsdVar;
    }

    public static /* bridge */ /* synthetic */ zzdsc a(zzdsc zzdscVar) {
        zzdscVar.a.putAll(zzdsd.c(zzdscVar.b));
        return zzdscVar;
    }

    public final zzdsc b(String str, @InterfaceC11300zs1 String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.a.put(str, str2);
        }
        return this;
    }

    public final zzdsc c(zzfbu zzfbuVar) {
        b("aai", zzfbuVar.w);
        b(C9755tW1.f875o, zzfbuVar.n0);
        b(FirebaseAnalytics.Param.b, zzfbu.a(zzfbuVar.b));
        return this;
    }

    public final zzdsc d(zzfbx zzfbxVar) {
        b("gqi", zzfbxVar.b);
        return this;
    }

    public final String e() {
        return zzdsd.b(this.b).b(this.a);
    }

    public final void i() {
        zzdsd.d(this.b).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsb
            @Override // java.lang.Runnable
            public final void run() {
                zzdsd.b(r0.b).e(zzdsc.this.a);
            }
        });
    }

    public final void j() {
        zzdsd.d(this.b).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrz
            @Override // java.lang.Runnable
            public final void run() {
                zzdsd.b(r0.b).g(zzdsc.this.a);
            }
        });
    }

    public final void k() {
        zzdsd.d(this.b).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsa
            @Override // java.lang.Runnable
            public final void run() {
                zzdsd.b(r0.b).f(zzdsc.this.a);
            }
        });
    }
}
