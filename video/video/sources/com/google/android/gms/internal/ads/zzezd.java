package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzezd implements zzfur {
    public final /* synthetic */ zzezh a;

    public zzezd(zzezh zzezhVar) {
        this.a = zzezhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfur
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfem e;
        zzezf zzezfVar;
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.e("", (zzdyq) obj);
        com.google.android.gms.ads.internal.util.zze.k("Failed to get a cache key, reverting to legacy flow.");
        zzezh zzezhVar = this.a;
        e = zzezhVar.e();
        zzezhVar.d = new zzezf(null, e, null);
        zzezfVar = zzezhVar.d;
        return zzezfVar;
    }
}
