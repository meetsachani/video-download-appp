package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcji implements zzfbo {
    public final zzcil a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;
    public final zzhge h;
    public final zzhge i;

    public zzcji(zzcil zzcilVar, Context context, String str) {
        this.a = zzcilVar;
        zzhfv a = zzhfw.a(context);
        this.b = a;
        zzhge zzhgeVar = zzcilVar.i1;
        zzezo zzezoVar = new zzezo(a, zzhgeVar, zzcilVar.j1);
        this.c = zzezoVar;
        zzhge c = zzhfu.c(new zzfay(zzhgeVar));
        this.d = c;
        zzhge c2 = zzhfu.c(zzfcm.a());
        this.e = c2;
        zzhge c3 = zzhfu.c(new zzfbi(a, zzcilVar.d, zzcilVar.T, zzezoVar, c, zzfcr.a(), c2));
        this.f = c3;
        this.g = zzhfu.c(new zzfbs(c3, c, c2));
        zzhfv c4 = zzhfw.c(str);
        this.h = c4;
        this.i = zzhfu.c(new zzfbm(c4, c3, a, c, c2, zzcilVar.m, zzcilVar.V, zzcilVar.N));
    }

    @Override // com.google.android.gms.internal.ads.zzfbo
    public final zzfbl a() {
        return (zzfbl) this.i.b();
    }

    @Override // com.google.android.gms.internal.ads.zzfbo
    public final zzfbr b() {
        return (zzfbr) this.g.b();
    }
}
