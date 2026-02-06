package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class zzgdy extends zzgdg {
    public final /* synthetic */ zzgdz Y0;
    public final Callable Z;

    public zzgdy(zzgdz zzgdzVar, Callable callable) {
        this.Y0 = zzgdzVar;
        callable.getClass();
        this.Z = callable;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Object a() throws Exception {
        return this.Z.call();
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
    public final void e(Object obj) {
        this.Y0.l(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final boolean f() {
        return this.Y0.isDone();
    }
}
