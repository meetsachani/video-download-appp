package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcrz implements zzgcu {
    public final /* synthetic */ zzcsb a;

    public zzcrz(zzcsb zzcsbVar) {
        this.a = zzcsbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
        zzdbf zzdbfVar;
        zzdbfVar = this.a.f;
        zzdbfVar.a0(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(@NullableDecl Object obj) {
        zzdbf zzdbfVar;
        zzbvl zzbvlVar = (zzbvl) obj;
        zzdbfVar = this.a.f;
        zzdbfVar.a0(true);
    }
}
