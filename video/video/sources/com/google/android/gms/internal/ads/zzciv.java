package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzciv implements zzeyj {
    public final Context a;
    public final com.google.android.gms.ads.internal.client.zzr b;
    public final String c;
    public final zzcil d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;
    public final zzhge h;
    public final zzhge i;
    public final zzhge j;

    public zzciv(zzcil zzcilVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.d = zzcilVar;
        this.a = context;
        this.b = zzrVar;
        this.c = str;
        zzhfv a = zzhfw.a(context);
        this.e = a;
        zzhfv a2 = zzhfw.a(zzrVar);
        this.f = a2;
        zzhge c = zzhfu.c(new zzeks(zzcilVar.N));
        this.g = c;
        zzhge c2 = zzhfu.c(zzekx.a());
        this.h = c2;
        zzhge c3 = zzhfu.c(zzday.a());
        this.i = c3;
        this.j = zzhfu.c(new zzeyh(a, zzcilVar.d, a2, zzcilVar.T, c, c2, zzfcr.a(), c3));
    }

    @Override // com.google.android.gms.internal.ads.zzeyj
    public final zzejx a() {
        zzche zzcheVar;
        zzeyg zzeygVar = (zzeyg) this.j.b();
        zzekr zzekrVar = (zzekr) this.g.b();
        zzcil zzcilVar = this.d;
        zzcheVar = zzcilVar.b;
        return new zzejx(this.a, this.b, this.c, zzeygVar, zzekrVar, zzchw.c(zzcheVar), (zzdsd) zzcilVar.N.b());
    }
}
