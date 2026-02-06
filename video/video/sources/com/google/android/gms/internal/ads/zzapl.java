package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzapl {
    public final Executor a;

    public zzapl(Handler handler) {
        this.a = new zzapj(this, handler);
    }

    public final void a(zzapu zzapuVar, zzaqd zzaqdVar) {
        zzapuVar.r("post-error");
        ((zzapj) this.a).X.post(new zzapk(zzapuVar, zzaqa.a(zzaqdVar), null));
    }

    public final void b(zzapu zzapuVar, zzaqa zzaqaVar, Runnable runnable) {
        zzapuVar.v();
        zzapuVar.r("post-response");
        ((zzapj) this.a).X.post(new zzapk(zzapuVar, zzaqaVar, runnable));
    }
}
