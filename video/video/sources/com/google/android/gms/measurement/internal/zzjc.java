package com.google.android.gms.measurement.internal;

import o.WB0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzjc implements WB0<Object> {
    public final /* synthetic */ zzmh a;
    public final /* synthetic */ zziq b;

    public zzjc(zziq zziqVar, zzmh zzmhVar) {
        this.b = zziqVar;
        this.a = zzmhVar;
    }

    @Override // o.WB0
    public final void a(Object obj) {
        this.b.n();
        this.b.i = false;
        this.b.s0();
        this.b.j().F().b("registerTriggerAsync ran. uri", this.a.X);
    }

    @Override // o.WB0
    public final void b(Throwable th) {
        this.b.n();
        this.b.i = false;
        this.b.s0();
        this.b.j().G().b("registerTriggerAsync failed with throwable", th);
    }
}
