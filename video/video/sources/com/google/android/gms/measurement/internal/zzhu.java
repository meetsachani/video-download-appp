package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class zzhu implements Callable<zzam> {
    public final /* synthetic */ zzo a;
    public final /* synthetic */ zzhj b;

    public zzhu(zzhj zzhjVar, zzo zzoVar) {
        this.b = zzhjVar;
        this.a = zzoVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ zzam call() throws Exception {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        zzmpVar = this.b.Y;
        zzmpVar.o0();
        zzmpVar2 = this.b.Y;
        return new zzam(zzmpVar2.d(this.a.X));
    }
}
