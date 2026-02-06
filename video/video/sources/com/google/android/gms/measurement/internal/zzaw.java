package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzaw {
    public static volatile Handler d;
    public final zzif a;
    public final Runnable b;
    public volatile long c;

    public zzaw(zzif zzifVar) {
        Preconditions.r(zzifVar);
        this.a = zzifVar;
        this.b = new zzav(this, zzifVar);
    }

    public final void a() {
        this.c = 0L;
        f().removeCallbacks(this.b);
    }

    public final void b(long j) {
        a();
        if (j >= 0) {
            this.c = this.a.b().a();
            if (!f().postDelayed(this.b, j)) {
                this.a.j().G().b("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public abstract void d();

    public final boolean e() {
        if (this.c != 0) {
            return true;
        }
        return false;
    }

    public final Handler f() {
        Handler handler;
        if (d != null) {
            return d;
        }
        synchronized (zzaw.class) {
            try {
                if (d == null) {
                    d = new com.google.android.gms.internal.measurement.zzcp(this.a.a().getMainLooper());
                }
                handler = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
