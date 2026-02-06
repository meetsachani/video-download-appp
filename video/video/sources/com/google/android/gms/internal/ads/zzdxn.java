package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzdxn implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;

    public zzdxn(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5, zzhge zzhgeVar6, zzhge zzhgeVar7) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar5;
        this.e = zzhgeVar6;
        this.f = zzhgeVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzdxm(((zzchi) this.a).a(), ((zzcvk) this.b).a(), ((zzdwo) this.c).b(), zzffn.c(), (ScheduledExecutorService) this.d.b(), (zzeap) this.e.b(), (zzfhn) this.f.b());
    }
}
