package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
final class zzeyv implements zzgcu {
    public zzeyv(zzeyx zzeyxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.k("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* synthetic */ void c(@NullableDecl Object obj) {
        Void r1 = (Void) obj;
        com.google.android.gms.ads.internal.util.zze.k("Notification of cache hit successful.");
    }
}
