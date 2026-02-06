package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class zzciz implements zzdtg {
    public final Long a;
    public final String b;
    public final zzcil c;
    public final zzcjb d;

    public zzciz(zzcil zzcilVar, zzcjb zzcjbVar, Long l, String str) {
        this.c = zzcilVar;
        this.d = zzcjbVar;
        this.a = l;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdtg
    public final zzdtq a() {
        Context context;
        zzcjb zzcjbVar = this.d;
        long longValue = this.a.longValue();
        context = zzcjbVar.a;
        return zzdtr.a(longValue, context, zzcjbVar.c(), this.c, this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzdtg
    public final zzdtu b() {
        Context context;
        zzcjb zzcjbVar = this.d;
        long longValue = this.a.longValue();
        context = zzcjbVar.a;
        return zzdtv.a(longValue, context, zzcjbVar.c(), this.c, this.b);
    }
}
