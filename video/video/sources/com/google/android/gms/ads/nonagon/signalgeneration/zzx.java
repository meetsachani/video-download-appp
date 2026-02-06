package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdrx;
import com.google.android.gms.internal.ads.zzhfv;
import com.google.android.gms.internal.ads.zzhge;

/* loaded from: classes2.dex */
public final class zzx implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;
    public final zzhge d;

    public zzx(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
        this.d = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzw((zzdrx) this.a.b(), (zzv) this.b.b(), (String) this.c.b(), ((Integer) this.d.b()).intValue());
    }
}
