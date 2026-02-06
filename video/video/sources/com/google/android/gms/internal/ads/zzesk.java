package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes2.dex */
public final class zzesk implements zzhfv {
    public final zzhge a;
    public final zzhge b;
    public final zzhge c;

    public zzesk(zzhge zzhgeVar, zzhge zzhgeVar2, zzhge zzhgeVar3) {
        this.a = zzhgeVar;
        this.b = zzhgeVar2;
        this.c = zzhgeVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final zzesi b() {
        return new zzesi((ApplicationInfo) this.a.b(), (PackageInfo) this.b.b(), ((zzchi) this.c).a());
    }
}
