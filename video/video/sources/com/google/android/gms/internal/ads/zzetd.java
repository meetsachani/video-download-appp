package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzetd implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;
    public final zzhge h;
    public final zzhge i;

    public zzetd(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5, zzhge zzhgeVar6, zzhge zzhgeVar7, zzhge zzhgeVar8, zzhge zzhgeVar9, zzhge zzhgeVar10) {
        this.a = zzhgeVar2;
        this.b = zzhgeVar3;
        this.c = zzhgeVar4;
        this.d = zzhgeVar5;
        this.e = zzhgeVar6;
        this.f = zzhgeVar7;
        this.g = zzhgeVar8;
        this.h = zzhgeVar9;
        this.i = zzhgeVar10;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzetb(zzffn.c(), (ScheduledExecutorService) this.a.b(), (String) this.b.b(), (zzejn) this.c.b(), (Context) this.d.b(), ((zzcvk) this.e).a(), (zzejj) this.f.b(), (zzdpt) this.g.b(), (zzduj) this.h.b(), ((Integer) this.i.b()).intValue());
    }
}
