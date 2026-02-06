package com.google.android.gms.measurement.internal;

/* loaded from: classes3.dex */
final class zzjb implements Runnable {
    public final /* synthetic */ boolean X;
    public final /* synthetic */ zziq Y;

    public zzjb(zziq zziqVar, boolean z) {
        this.Y = zziqVar;
        this.X = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean p = this.Y.a.p();
        boolean o2 = this.Y.a.o();
        this.Y.a.m(this.X);
        if (o2 == this.X) {
            this.Y.a.j().K().b("Default data collection state already set to", Boolean.valueOf(this.X));
        }
        if (this.Y.a.p() == p || this.Y.a.p() != this.Y.a.o()) {
            this.Y.a.j().M().c("Default data collection is different than actual status", Boolean.valueOf(this.X), Boolean.valueOf(p));
        }
        this.Y.u0();
    }
}
