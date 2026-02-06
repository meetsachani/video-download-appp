package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmm extends zzaw {
    public final /* synthetic */ zzmj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmm(zzmj zzmjVar, zzif zzifVar) {
        super(zzifVar);
        this.e = zzmjVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaw
    public final void d() {
        this.e.z();
        this.e.j().K().a("Starting upload from DelayedRunnable");
        this.e.b.t0();
    }
}
