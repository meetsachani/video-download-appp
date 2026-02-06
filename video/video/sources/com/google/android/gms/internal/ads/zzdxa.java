package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdxa implements zzhfv {
    public final zzhge a;

    public zzdxa(zzhge zzhgeVar) {
        this.a = zzhgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhgk, com.google.android.gms.internal.ads.zzhgj
    /* renamed from: a */
    public final String b() {
        String packageName = ((zzchi) this.a).a().getPackageName();
        zzhgd.b(packageName);
        return packageName;
    }
}
