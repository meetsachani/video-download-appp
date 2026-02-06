package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzmt implements Callable<String> {
    public final /* synthetic */ zzo a;
    public final /* synthetic */ zzmp b;

    public zzmt(zzmp zzmpVar, zzo zzoVar) {
        this.b = zzmpVar;
        this.a = zzoVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        if (this.b.Q((String) Preconditions.r(this.a.X)).y() && zzih.e(this.a.q1).y()) {
            zzh g = this.b.g(this.a);
            if (g == null) {
                this.b.j().L().a("App info was null when attempting to get app instance id");
                return null;
            }
            return g.u0();
        }
        this.b.j().K().a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
