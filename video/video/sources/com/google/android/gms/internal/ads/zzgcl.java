package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgcl extends zzgby {
    public zzgck k1;

    public zzgcl(zzfxx zzfxxVar, boolean z, Executor executor, Callable callable) {
        super(zzfxxVar, z, false);
        this.k1 = new zzgcj(this, callable, executor);
        O();
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final void D(int i) {
        super.D(i);
        if (i == 1) {
            this.k1 = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final void M(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgby
    public final void N() {
        zzgck zzgckVar = this.k1;
        if (zzgckVar != null) {
            zzgckVar.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final void s() {
        zzgck zzgckVar = this.k1;
        if (zzgckVar != null) {
            zzgckVar.g();
        }
    }
}
