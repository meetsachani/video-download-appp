package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfhl implements zzgcu {
    public final /* synthetic */ zzfhn a;
    public final /* synthetic */ zzfhc b;

    public zzfhl(zzfhn zzfhnVar, zzfhc zzfhcVar) {
        this.a = zzfhnVar;
        this.b = zzfhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzfhc zzfhcVar = this.b;
        zzfhcVar.f(th);
        zzfhcVar.c(false);
        this.a.a(zzfhcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void c(Object obj) {
    }
}
