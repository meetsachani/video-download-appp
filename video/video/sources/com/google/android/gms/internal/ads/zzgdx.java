package com.google.android.gms.internal.ads;

import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
final class zzgdx extends zzgdg {
    public final /* synthetic */ zzgdz Y0;
    public final zzgce Z;

    public zzgdx(zzgdz zzgdzVar, zzgce zzgceVar) {
        this.Y0 = zzgdzVar;
        this.Z = zzgceVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* bridge */ /* synthetic */ Object a() throws Exception {
        zzgce zzgceVar = this.Z;
        InterfaceFutureC8411o11 a = zzgceVar.a();
        zzfvc.d(a, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgceVar);
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final String b() {
        return this.Z.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final void d(Throwable th) {
        this.Y0.m(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final /* synthetic */ void e(Object obj) {
        this.Y0.v((InterfaceFutureC8411o11) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final boolean f() {
        return this.Y0.isDone();
    }
}
