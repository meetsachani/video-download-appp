package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class zzcna implements zzhfv {
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
    public final zzhge k;
    public final zzhge l;
    public final zzhge m;
    public final zzhge n;

    public zzcna(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5, zzhge zzhgeVar6, zzhge zzhgeVar7, zzhge zzhgeVar8, zzhge zzhgeVar9, zzhge zzhgeVar10, zzhge zzhgeVar11, zzhge zzhgeVar12, zzhge zzhgeVar13, zzhge zzhgeVar14, zzhge zzhgeVar15, zzhge zzhgeVar16) {
        this.a = zzhgeVar;
        this.b = zzhgeVar3;
        this.c = zzhgeVar4;
        this.d = zzhgeVar5;
        this.e = zzhgeVar6;
        this.f = zzhgeVar7;
        this.g = zzhgeVar8;
        this.h = zzhgeVar9;
        this.i = zzhgeVar10;
        this.j = zzhgeVar11;
        this.k = zzhgeVar12;
        this.l = zzhgeVar14;
        this.m = zzhgeVar15;
        this.n = zzhgeVar16;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzcmz(((zzchi) this.a).a(), zzffn.c(), (Executor) this.b.b(), (ScheduledExecutorService) this.c.b(), ((zzcrr) this.d).a(), ((zzcro) this.e).a(), (zzfjn) this.f.b(), (zzfdb) this.g.b(), (View) this.h.b(), (zzcfb) this.i.b(), (zzavl) this.j.b(), (zzbec) this.k.b(), zzcjs.a(), (zzfhn) this.l.b(), ((zzcvg) this.m).a(), (zzcyd) this.n.b());
    }
}
