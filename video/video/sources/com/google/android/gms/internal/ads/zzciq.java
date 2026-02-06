package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzciq implements zzewv {
    public final zzcil a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;

    public zzciq(zzcil zzcilVar, Context context, String str) {
        this.a = zzcilVar;
        zzhfv a = zzhfw.a(context);
        this.b = a;
        zzhfv a2 = zzhfw.a(str);
        this.c = a2;
        zzhge zzhgeVar = zzcilVar.i1;
        zzezn zzeznVar = new zzezn(a, zzhgeVar, zzcilVar.j1);
        this.d = zzeznVar;
        zzhge c = zzhfu.c(new zzext(zzhgeVar));
        this.e = c;
        zzhge zzhgeVar2 = zzcilVar.d;
        zzhge zzhgeVar3 = zzcilVar.T;
        zzfcr a3 = zzfcr.a();
        zzhge zzhgeVar4 = zzcilVar.m;
        zzhge c2 = zzhfu.c(new zzexv(a, zzhgeVar2, zzhgeVar3, zzeznVar, c, a3, zzhgeVar4));
        this.f = c2;
        this.g = zzhfu.c(new zzeyb(zzhgeVar3, a, a2, c2, c, zzhgeVar4, zzcilVar.N));
    }

    @Override // com.google.android.gms.internal.ads.zzewv
    public final zzeya a() {
        return (zzeya) this.g.b();
    }
}
