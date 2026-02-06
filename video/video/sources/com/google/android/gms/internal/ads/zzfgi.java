package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfgi implements zzgcu {
    public final /* synthetic */ zzffz a;
    public final /* synthetic */ zzfgj b;

    public zzfgi(zzfgj zzfgjVar, zzffz zzffzVar) {
        this.a = zzffzVar;
        this.b = zzfgjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzfgm zzfgmVar;
        zzfgmVar = this.b.f.c;
        zzfgmVar.M0(this.a, th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void c(Object obj) {
        zzfgm zzfgmVar;
        zzfgmVar = this.b.f.c;
        zzfgmVar.n(this.a);
    }
}
