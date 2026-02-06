package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcjb implements zzdto {
    public final Context a;
    public final zzbkv b;
    public final zzcil c;
    public final zzcjb d = this;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;
    public final zzhge h;

    public zzcjb(zzcil zzcilVar, Context context, zzbkv zzbkvVar) {
        this.c = zzcilVar;
        this.a = context;
        this.b = zzbkvVar;
        zzhfv a = zzhfw.a(this);
        this.e = a;
        zzhfv a2 = zzhfw.a(zzbkvVar);
        this.f = a2;
        zzdtk zzdtkVar = new zzdtk(a2);
        this.g = zzdtkVar;
        this.h = zzhfu.c(new zzdtm(a, zzdtkVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final zzdtf b() {
        return new zzciy(this.c, this.d, null);
    }

    public final zzdtj c() {
        return zzdtk.c(this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzdto
    public final zzdtl f() {
        return (zzdtl) this.h.b();
    }
}
