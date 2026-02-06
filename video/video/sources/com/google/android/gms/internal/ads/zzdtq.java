package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzdtq implements zzdte {
    public final long a;
    public final zzekz b;

    public zzdtq(long j, Context context, zzdtj zzdtjVar, zzchb zzchbVar, String str) {
        this.a = j;
        zzezz y = zzchbVar.y();
        y.b(context);
        y.a(new com.google.android.gms.ads.internal.client.zzr());
        y.I(str);
        zzekz a = y.f().a();
        this.b = a;
        a.n6(new zzdtp(this, zzdtjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final void a() {
        this.b.y();
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final void b(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        this.b.C3(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdte
    public final void c() {
        this.b.Q5(ObjectWrapper.V3(null));
    }
}
