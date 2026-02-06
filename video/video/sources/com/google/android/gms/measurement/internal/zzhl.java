package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzhl implements Runnable {
    public final /* synthetic */ zzo X;
    public final /* synthetic */ zzhj Y;

    public zzhl(zzhj zzhjVar, zzo zzoVar) {
        this.Y = zzhjVar;
        this.X = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.Y.Y;
        zzmpVar.o0();
        zzmpVar2 = this.Y.Y;
        zzo zzoVar = this.X;
        zzmpVar2.l().n();
        zzmpVar2.p0();
        Preconditions.l(zzoVar.X);
        zzmpVar2.g(zzoVar);
    }
}
