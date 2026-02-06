package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzcfi implements com.google.android.gms.ads.internal.overlay.zzr {
    public final zzcfb X;
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.overlay.zzr Y;

    public zzcfi(zzcfb zzcfbVar, @InterfaceC11300zs1 com.google.android.gms.ads.internal.overlay.zzr zzrVar) {
        this.X = zzcfbVar;
        this.Y = zzrVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void S7() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void V3() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.Y;
        if (zzrVar != null) {
            zzrVar.V3();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void h5(int i) {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.Y;
        if (zzrVar != null) {
            zzrVar.h5(i);
        }
        this.X.l0();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void o1() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.Y;
        if (zzrVar != null) {
            zzrVar.o1();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void r4() {
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.Y;
        if (zzrVar != null) {
            zzrVar.r4();
        }
        this.X.c0();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void s7() {
    }
}
