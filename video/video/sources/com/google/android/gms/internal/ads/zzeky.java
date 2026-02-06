package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeky implements zzelg {
    public final /* synthetic */ zzekz a;

    public zzeky(zzekz zzekzVar) {
        this.a = zzekzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final void a() {
        zzekz zzekzVar = this.a;
        synchronized (zzekzVar) {
            zzekzVar.e1 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelg
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzdew zzdewVar;
        zzekz zzekzVar = this.a;
        zzdew zzdewVar2 = (zzdew) obj;
        synchronized (zzekzVar) {
            zzekzVar.e1 = zzdewVar2;
            zzdewVar = zzekzVar.e1;
            zzdewVar.b();
        }
    }
}
