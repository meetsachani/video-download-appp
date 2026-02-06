package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlb extends zzaw {
    public final /* synthetic */ zzkp e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzlb(zzkp zzkpVar, zzif zzifVar) {
        super(zzifVar);
        this.e = zzkpVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzaw
    public final void d() {
        this.e.j().L().a("Tasks have been queued for a long time");
    }
}
