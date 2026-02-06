package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzcrs implements com.google.android.gms.ads.internal.overlay.zzr {
    public final zzcxa X;
    public final AtomicBoolean Y = new AtomicBoolean(false);
    public final AtomicBoolean Z = new AtomicBoolean(false);

    public zzcrs(zzcxa zzcxaVar) {
        this.X = zzcxaVar;
    }

    private final void b() {
        AtomicBoolean atomicBoolean = this.Z;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            this.X.a();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void S7() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void V3() {
        b();
    }

    public final boolean a() {
        return this.Y.get();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void h5(int i) {
        this.Y.set(true);
        b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void o1() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void r4() {
        this.X.c();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void s7() {
    }
}
