package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzere implements zzetu {
    public final boolean a;

    public zzere(boolean z) {
        this.a = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((zzcuv) obj).b.putBoolean("is_gbid", this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        ((zzcuv) obj).a.putBoolean("is_gbid", this.a);
    }
}
