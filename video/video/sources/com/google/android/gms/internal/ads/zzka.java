package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzka implements zzlb {
    public final Object a;
    public zzbl b;

    public zzka(Object obj, zzuw zzuwVar) {
        this.a = obj;
        this.b = zzuwVar.H();
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final zzbl a() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzlb
    public final Object b() {
        return this.a;
    }

    public final void c(zzbl zzblVar) {
        this.b = zzblVar;
    }
}
