package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes2.dex */
public class zzcam {
    public final zzcaf a;
    public final AtomicInteger b;

    public zzcam() {
        zzcaf zzcafVar = new zzcaf();
        this.a = zzcafVar;
        this.b = new AtomicInteger(0);
        zzgcy.r(zzcafVar, new zzcak(this), zzcaa.g);
    }

    @Deprecated
    public final int a() {
        return this.b.get();
    }

    @Deprecated
    public final void c() {
        this.a.d(new Exception());
    }

    @Deprecated
    public final void d(Throwable th, String str) {
        this.a.d(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.V7)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.t().w(th, str);
        }
    }

    @Deprecated
    public final void e(Object obj) {
        this.a.c(obj);
    }

    @Deprecated
    public final void f(zzcaj zzcajVar, zzcah zzcahVar) {
        zzgcy.r(this.a, new zzcal(this, zzcajVar, zzcahVar), zzcaa.g);
    }
}
