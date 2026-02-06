package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzcjg implements zzfaa {
    public final zzcil a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;
    public final zzhge h;

    public zzcjg(zzcil zzcilVar, Context context, String str, com.google.android.gms.ads.internal.client.zzr zzrVar) {
        this.a = zzcilVar;
        zzhfv a = zzhfw.a(context);
        this.b = a;
        zzhfv a2 = zzhfw.a(zzrVar);
        this.c = a2;
        zzhfv a3 = zzhfw.a(str);
        this.d = a3;
        zzhge zzhgeVar = zzcilVar.N;
        zzhge c = zzhfu.c(new zzeks(zzhgeVar));
        this.e = c;
        zzhge c2 = zzhfu.c(new zzfay(zzcilVar.i1));
        this.f = c2;
        zzhge c3 = zzhfu.c(new zzezy(a, zzcilVar.d, zzcilVar.T, c, c2, zzfcr.a()));
        this.g = c3;
        this.h = zzhfu.c(new zzela(a, a2, a3, c3, c, c2, zzcilVar.m, zzcilVar.V, zzhgeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzfaa
    public final zzekz a() {
        return (zzekz) this.h.b();
    }
}
