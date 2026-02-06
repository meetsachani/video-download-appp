package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzeux implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;

    public zzeux(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5, zzhge zzhgeVar6, zzhge zzhgeVar7) {
        this.a = zzhgeVar2;
        this.b = zzhgeVar3;
        this.c = zzhgeVar5;
        this.d = zzhgeVar6;
        this.e = zzhgeVar7;
    }

    public static zzeuv a(zzbze zzbzeVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new zzeuv(zzbzeVar, context, scheduledExecutorService, executor, i, z, z2);
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzeuv(zzckw.a(), ((zzchi) this.a).a(), (ScheduledExecutorService) this.b.b(), zzffn.c(), ((zzewd) this.c).b().intValue(), ((zzewe) this.d).b().booleanValue(), ((zzewg) this.e).b().booleanValue());
    }
}
