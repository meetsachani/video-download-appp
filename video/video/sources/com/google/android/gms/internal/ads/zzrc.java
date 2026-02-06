package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzrc {
    @InterfaceC11300zs1
    public Exception a;
    public long b = C10323vs.b;
    public long c = C10323vs.b;

    public final void a() {
        this.a = null;
        this.b = C10323vs.b;
        this.c = C10323vs.b;
    }

    public final void b(Exception exc) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
        }
        if (this.b == C10323vs.b && !zzri.I()) {
            this.b = 200 + elapsedRealtime;
        }
        long j = this.b;
        if (j != C10323vs.b && elapsedRealtime >= j) {
            Exception exc2 = this.a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.a;
            a();
            throw exc3;
        }
        this.c = elapsedRealtime + 50;
    }

    public final boolean c() {
        if (this.a == null) {
            return false;
        }
        if (!zzri.I() && SystemClock.elapsedRealtime() >= this.c) {
            return false;
        }
        return true;
    }
}
