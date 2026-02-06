package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbnr implements zzcaj {
    public final /* synthetic */ zzbnt a;

    public zzbnr(zzbnt zzbntVar) {
        this.a = zzbntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        zzbny zzbnyVar;
        zzboa zzboaVar = (zzboa) obj;
        com.google.android.gms.ads.internal.util.zze.k("Releasing engine reference.");
        zzbnyVar = this.a.d;
        zzbnyVar.j();
    }
}
