package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzdui implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;
    public final zzhge h;
    public final zzhge i;

    public zzdui(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5, zzhge zzhgeVar6, zzhge zzhgeVar7, zzhge zzhgeVar8, zzhge zzhgeVar9, zzhge zzhgeVar10) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar5;
        this.e = zzhgeVar6;
        this.f = zzhgeVar7;
        this.g = zzhgeVar8;
        this.h = zzhgeVar9;
        this.i = zzhgeVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzduh((Executor) this.a.b(), ((zzchi) this.b).a(), ((zzchj) this.c).a(), zzffn.c(), (zzdpt) this.d.b(), (ScheduledExecutorService) this.e.b(), (zzdso) this.f.b(), ((zzchw) this.g).a(), ((zzdcy) this.h).b(), (zzfhq) this.i.b());
    }
}
