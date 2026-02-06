package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdmq implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;
    public final zzhge h;
    public final zzhge i;

    public zzdmq(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5, zzhge zzhgeVar6, zzhge zzhgeVar7, zzhge zzhgeVar8, zzhge zzhgeVar9) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
        this.e = zzhgeVar5;
        this.f = zzhgeVar6;
        this.g = zzhgeVar7;
        this.h = zzhgeVar8;
        this.i = zzhgeVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzdmo(((zzcvk) this.a).a(), (Executor) this.b.b(), (zzdpd) this.c.b(), (Context) this.d.b(), (zzdsd) this.e.b(), (zzfjr) this.f.b(), (zzebt) this.g.b(), (zzdny) this.h.b(), (zzdrx) this.i.b());
    }
}
