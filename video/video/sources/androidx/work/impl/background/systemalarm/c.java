package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import java.util.Collections;
import java.util.List;
import o.AbstractC6949i41;
import o.C10192vJ2;
import o.C8501oN2;
import o.C9965uN2;
import o.InterfaceC5625cg0;
import o.MM2;
import o.NM2;

/* loaded from: classes.dex */
public class c implements MM2, InterfaceC5625cg0, C9965uN2.b {
    public static final String e1 = AbstractC6949i41.f("DelayMetCommandHandler");
    public static final int f1 = 0;
    public static final int g1 = 1;
    public static final int h1 = 2;
    public final Context X;
    public final int Y;
    public final d Y0;
    public final String Z;
    public final NM2 Z0;
    public PowerManager.WakeLock c1;
    public boolean d1 = false;
    public int b1 = 0;
    public final Object a1 = new Object();

    public c(Context context, int startId, String workSpecId, d dispatcher) {
        this.X = context;
        this.Y = startId;
        this.Y0 = dispatcher;
        this.Z = workSpecId;
        this.Z0 = new NM2(context, dispatcher.f(), this);
    }

    @Override // o.C9965uN2.b
    public void a(String workSpecId) {
        AbstractC6949i41.c().a(e1, String.format("Exceeded time limits on execution for %s", workSpecId), new Throwable[0]);
        g();
    }

    @Override // o.MM2
    public void b(List<String> workSpecIds) {
        g();
    }

    public final void c() {
        synchronized (this.a1) {
            try {
                this.Z0.e();
                this.Y0.h().f(this.Z);
                PowerManager.WakeLock wakeLock = this.c1;
                if (wakeLock != null && wakeLock.isHeld()) {
                    AbstractC6949i41.c().a(e1, String.format("Releasing wakelock %s for WorkSpec %s", this.c1, this.Z), new Throwable[0]);
                    this.c1.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        this.c1 = C10192vJ2.b(this.X, String.format("%s (%s)", this.Z, Integer.valueOf(this.Y)));
        AbstractC6949i41 c = AbstractC6949i41.c();
        String str = e1;
        c.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.c1, this.Z), new Throwable[0]);
        this.c1.acquire();
        C8501oN2 j = this.Y0.g().M().L().j(this.Z);
        if (j == null) {
            g();
            return;
        }
        boolean b = j.b();
        this.d1 = b;
        if (!b) {
            AbstractC6949i41.c().a(str, String.format("No constraints for %s", this.Z), new Throwable[0]);
            f(Collections.singletonList(this.Z));
            return;
        }
        this.Z0.d(Collections.singletonList(j));
    }

    @Override // o.InterfaceC5625cg0
    public void e(String workSpecId, boolean needsReschedule) {
        AbstractC6949i41.c().a(e1, String.format("onExecuted %s, %s", workSpecId, Boolean.valueOf(needsReschedule)), new Throwable[0]);
        c();
        if (needsReschedule) {
            Intent f = a.f(this.X, this.Z);
            d dVar = this.Y0;
            dVar.k(new d.b(dVar, f, this.Y));
        }
        if (this.d1) {
            Intent a = a.a(this.X);
            d dVar2 = this.Y0;
            dVar2.k(new d.b(dVar2, a, this.Y));
        }
    }

    @Override // o.MM2
    public void f(List<String> workSpecIds) {
        if (!workSpecIds.contains(this.Z)) {
            return;
        }
        synchronized (this.a1) {
            try {
                if (this.b1 == 0) {
                    this.b1 = 1;
                    AbstractC6949i41.c().a(e1, String.format("onAllConstraintsMet for %s", this.Z), new Throwable[0]);
                    if (this.Y0.d().k(this.Z)) {
                        this.Y0.h().e(this.Z, 600000L, this);
                    } else {
                        c();
                    }
                } else {
                    AbstractC6949i41.c().a(e1, String.format("Already started work for %s", this.Z), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.a1) {
            try {
                if (this.b1 < 2) {
                    this.b1 = 2;
                    AbstractC6949i41 c = AbstractC6949i41.c();
                    String str = e1;
                    c.a(str, String.format("Stopping work for WorkSpec %s", this.Z), new Throwable[0]);
                    Intent g = a.g(this.X, this.Z);
                    d dVar = this.Y0;
                    dVar.k(new d.b(dVar, g, this.Y));
                    if (this.Y0.d().h(this.Z)) {
                        AbstractC6949i41.c().a(str, String.format("WorkSpec %s needs to be rescheduled", this.Z), new Throwable[0]);
                        Intent f = a.f(this.X, this.Z);
                        d dVar2 = this.Y0;
                        dVar2.k(new d.b(dVar2, f, this.Y));
                    } else {
                        AbstractC6949i41.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.Z), new Throwable[0]);
                    }
                } else {
                    AbstractC6949i41.c().a(e1, String.format("Already stopped work for %s", this.Z), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
