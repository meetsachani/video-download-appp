package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzeeh implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;
    public final zzhge f;
    public final zzhge g;

    public zzeeh(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4, zzhge zzhgeVar5, zzhge zzhgeVar6, zzhge zzhgeVar7) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
        this.e = zzhgeVar5;
        this.f = zzhgeVar6;
        this.g = zzhgeVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzeeg b() {
        return new zzeeg((zzcpu) this.a.b(), (Context) this.b.b(), (Executor) this.c.b(), (zzdpd) this.d.b(), ((zzcvk) this.e).a(), (zzfur) this.f.b(), (zzdrx) this.g.b());
    }
}
