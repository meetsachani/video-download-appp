package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzewp implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;

    public zzewp(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5, zzhge zzhgeVar6, zzhge zzhgeVar7, zzhge zzhgeVar8, zzhge zzhgeVar9) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar6;
        this.e = zzhgeVar7;
        this.f = zzhgeVar8;
        this.g = zzhgeVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzewn((zzbzn) this.a.b(), ((zzewf) this.b).b().booleanValue(), ((zzewg) this.c).b().booleanValue(), zzcky.a(), zzffn.c(), ((zzewc) this.d).a(), (ScheduledExecutorService) this.e.b(), ((zzewi) this.f).b().intValue(), ((zzewj) this.g).b().intValue());
    }
}
