package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzdvx implements zzgcu {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzdvz b;

    public zzdvx(zzdvz zzdvzVar, String str) {
        this.a = str;
        this.b = zzdvzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final void a(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzdvn zzdvnVar;
        ((zzduq) obj).c();
        zzdvnVar = this.b.Y0;
        zzdvnVar.f(this.a);
    }
}
