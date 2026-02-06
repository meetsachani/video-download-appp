package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznp;

/* loaded from: classes3.dex */
final class zzhv implements Runnable {
    public final /* synthetic */ zzo X;
    public final /* synthetic */ zzhj Y;

    public zzhv(zzhj zzhjVar, zzo zzoVar) {
        this.Y = zzhjVar;
        this.X = zzoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzmp zzmpVar;
        zzmp zzmpVar2;
        int i;
        zzmpVar = this.Y.Y;
        zzmpVar.o0();
        zzmpVar2 = this.Y.Y;
        zzo zzoVar = this.X;
        zzmpVar2.l().n();
        zzmpVar2.p0();
        Preconditions.l(zzoVar.X);
        if (zznp.a() && zzmpVar2.c0().s(zzbi.T0)) {
            i = zzoVar.v1;
        } else {
            i = 100;
        }
        zzih f = zzih.f(zzoVar.q1, i);
        zzih Q = zzmpVar2.Q(zzoVar.X);
        zzmpVar2.j().K().c("Setting consent, package, consent", zzoVar.X, f);
        zzmpVar2.C(zzoVar.X, f);
        if (f.t(Q)) {
            zzmpVar2.b0(zzoVar);
        }
        if (zznp.a() && zzmpVar2.c0().s(zzbi.T0)) {
            zzay c = zzay.c(zzoVar.w1);
            if (!zzay.f.equals(c)) {
                zzmpVar2.j().K().c("Setting DMA consent. package, consent", zzoVar.X, c);
                zzmpVar2.B(zzoVar.X, c);
            }
        }
    }
}
