package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfhk implements zzgcu {
    public final /* synthetic */ zzfhn a;
    public final /* synthetic */ zzfhc b;
    public final /* synthetic */ boolean c;

    public zzfhk(zzfhn zzfhnVar, zzfhc zzfhcVar, boolean z) {
        this.a = zzfhnVar;
        this.b = zzfhcVar;
        this.c = z;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzfhc zzfhcVar = this.b;
        if (zzfhcVar.k()) {
            zzfhn zzfhnVar = this.a;
            zzfhcVar.f(th);
            zzfhcVar.c(false);
            zzfhnVar.a(zzfhcVar);
            if (this.c) {
                zzfhnVar.h();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void c(Object obj) {
        zzfhc zzfhcVar = this.b;
        zzfhcVar.c(true);
        zzfhn zzfhnVar = this.a;
        zzfhnVar.a(zzfhcVar);
        if (this.c) {
            zzfhnVar.h();
        }
    }
}
