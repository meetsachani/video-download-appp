package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzcot implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;
    public final zzhge h;
    public final zzhge i;
    public final zzhge j;

    public zzcot(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5, zzhge zzhgeVar6, zzhge zzhgeVar7, zzhge zzhgeVar8, zzhge zzhgeVar9, zzhge zzhgeVar10) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
        this.e = zzhgeVar5;
        this.f = zzhgeVar6;
        this.g = zzhgeVar7;
        this.h = zzhgeVar8;
        this.i = zzhgeVar9;
        this.j = zzhgeVar10;
    }

    public static zzcos c(zzcqw zzcqwVar, Context context, zzfbv zzfbvVar, View view, @InterfaceC11300zs1 zzcfb zzcfbVar, zzcqv zzcqvVar, zzdiz zzdizVar, zzdea zzdeaVar, zzhfp zzhfpVar, Executor executor) {
        return new zzcos(zzcqwVar, context, zzfbvVar, view, zzcfbVar, zzcqvVar, zzdizVar, zzdeaVar, zzhfpVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzcos b() {
        return new zzcos(((zzcte) this.a).b(), (Context) this.b.b(), ((zzcoz) this.c).a(), ((zzcoy) this.d).a(), ((zzcpn) this.e).a(), ((zzcpa) this.f).a(), ((zzdgu) this.g).a(), (zzdea) this.h.b(), zzhfu.a(this.i), (Executor) this.j.b());
    }
}
