package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzehe implements zzhfv {
    public final zzehd a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;
    public final zzhge e;

    public zzehe(zzehd zzehdVar, zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzehdVar;
        this.b = zzhgeVar;
        this.c = zzhgeVar2;
        this.d = zzhgeVar3;
        this.e = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* synthetic */ Object b() {
        return this.a.a((Clock) this.b.b(), ((zzegx) this.c).b(), (zzedk) this.d.b(), (zzfjr) this.e.b());
    }
}
