package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes2.dex */
public final class zzesb implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzesb(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3, zzhge zzhgeVar4) {
        this.a = zzhgeVar2;
        this.b = zzhgeVar3;
        this.c = zzhgeVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        return new zzerz(zzffn.c(), ((zzcvk) this.a).a(), (PackageInfo) this.b.b(), ((zzchf) this.c).b());
    }
}
