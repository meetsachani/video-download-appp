package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* loaded from: classes2.dex */
public final class zzchh implements zzhfv {
    public final zzhge a;

    public zzchh(zzhge zzhgeVar) {
        this.a = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    public final /* bridge */ /* synthetic */ Object b() {
        ApplicationInfo applicationInfo = ((zzchi) this.a).a().getApplicationInfo();
        zzhgd.b(applicationInfo);
        return applicationInfo;
    }
}
