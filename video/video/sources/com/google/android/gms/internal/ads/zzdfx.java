package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdfx implements com.google.android.gms.ads.internal.overlay.zzr {
    public final zzcxz X;
    public final zzddk Y;

    public zzdfx(zzcxz zzcxzVar, zzddk zzddkVar) {
        this.X = zzcxzVar;
        this.Y = zzddkVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void S7() {
        this.X.S7();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void V3() {
        this.X.V3();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void h5(int i) {
        this.X.h5(i);
        this.Y.a();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void o1() {
        this.X.o1();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void r4() {
        this.X.r4();
        this.Y.b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void s7() {
        this.X.s7();
    }
}
