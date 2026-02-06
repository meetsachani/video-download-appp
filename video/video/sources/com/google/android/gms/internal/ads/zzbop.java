package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzbop implements zzcah {
    public final /* synthetic */ zzcaf a;
    public final /* synthetic */ zzbnt b;

    public zzbop(zzbor zzborVar, zzcaf zzcafVar, zzbnt zzbntVar) {
        this.a = zzcafVar;
        this.b = zzbntVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcah
    public final void a() {
        com.google.android.gms.ads.internal.util.zze.k("callJs > getEngine: Promise rejected");
        this.a.d(new zzboc("Unable to obtain a JavascriptEngine."));
        this.b.h();
    }
}
