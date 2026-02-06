package com.google.android.gms.tasks;

import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzb extends CancellationToken {
    public final zzw a = new zzw();

    @Override // com.google.android.gms.tasks.CancellationToken
    public final boolean a() {
        return this.a.u();
    }

    @Override // com.google.android.gms.tasks.CancellationToken
    public final CancellationToken b(@InterfaceC5670cr1 OnTokenCanceledListener onTokenCanceledListener) {
        this.a.l(TaskExecutors.a, new zza(this, onTokenCanceledListener));
        return this;
    }

    public final void c() {
        this.a.C(null);
    }
}
