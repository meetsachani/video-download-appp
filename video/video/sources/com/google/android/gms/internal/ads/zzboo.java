package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzboo implements zzcaj {
    public final /* synthetic */ zzbnt a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ zzcaf c;
    public final /* synthetic */ zzbor d;

    public zzboo(zzbor zzborVar, zzbnt zzbntVar, Object obj, zzcaf zzcafVar) {
        this.a = zzbntVar;
        this.b = obj;
        this.c = zzcafVar;
        this.d = zzborVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        com.google.android.gms.ads.internal.util.zze.k("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.b;
        zzcaf zzcafVar = this.c;
        zzbor.d(this.d, this.a, (zzboa) obj, obj2, zzcafVar);
    }
}
