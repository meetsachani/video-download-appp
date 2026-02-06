package com.google.android.gms.internal.ads;

import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzeac {
    public final zzbvf a;

    public zzeac(zzbvf zzbvfVar) {
        this.a = zzbvfVar;
    }

    public final void a() {
        InterfaceFutureC8411o11 a = this.a.a();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.W7)).booleanValue()) {
            zzcad.b(a, "persistFlags");
        } else {
            zzcad.a(a, "persistFlags");
        }
    }
}
