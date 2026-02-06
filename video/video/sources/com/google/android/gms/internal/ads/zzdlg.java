package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdlg implements zzgcu {
    public final /* synthetic */ zzdrl a;
    public final /* synthetic */ zzdlh b;

    public zzdlg(zzdlh zzdlhVar, zzdrl zzdrlVar) {
        this.a = zzdrlVar;
        this.b = zzdlhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void c(Object obj) {
        zzdrx zzdrxVar;
        zzdrxVar = this.b.d;
        zzdrxVar.a().putLong(this.a.e(), com.google.android.gms.ads.internal.zzv.d().a());
    }
}
