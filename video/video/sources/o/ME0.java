package o;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.TM2;

/* loaded from: classes.dex */
public class ME0 implements InterfaceC6579gY1, MM2, InterfaceC5625cg0 {
    public static final String d1 = AbstractC6949i41.f("GreedyScheduler");
    public final Context X;
    public final ZM2 Y;
    public final NM2 Z;
    public R10 Z0;
    public boolean a1;
    public Boolean c1;
    public final Set<C8501oN2> Y0 = new HashSet();
    public final Object b1 = new Object();

    public ME0(Context context, androidx.work.a configuration, InterfaceC3748Nl2 taskExecutor, ZM2 workManagerImpl) {
        this.X = context;
        this.Y = workManagerImpl;
        this.Z = new NM2(context, taskExecutor, this);
        this.Z0 = new R10(this, configuration.k());
    }

    @Override // o.InterfaceC6579gY1
    public void a(C8501oN2... workSpecs) {
        if (this.c1 == null) {
            g();
        }
        if (!this.c1.booleanValue()) {
            AbstractC6949i41.c().d(d1, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C8501oN2 c8501oN2 : workSpecs) {
            long a = c8501oN2.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (c8501oN2.b == TM2.a.ENQUEUED) {
                if (currentTimeMillis < a) {
                    R10 r10 = this.Z0;
                    if (r10 != null) {
                        r10.a(c8501oN2);
                    }
                } else if (c8501oN2.b()) {
                    if (c8501oN2.j.h()) {
                        AbstractC6949i41.c().a(d1, String.format("Ignoring WorkSpec %s, Requires device idle.", c8501oN2), new Throwable[0]);
                    } else if (c8501oN2.j.e()) {
                        AbstractC6949i41.c().a(d1, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", c8501oN2), new Throwable[0]);
                    } else {
                        hashSet.add(c8501oN2);
                        hashSet2.add(c8501oN2.a);
                    }
                } else {
                    AbstractC6949i41.c().a(d1, String.format("Starting work for %s", c8501oN2.a), new Throwable[0]);
                    this.Y.U(c8501oN2.a);
                }
            }
        }
        synchronized (this.b1) {
            try {
                if (!hashSet.isEmpty()) {
                    AbstractC6949i41.c().a(d1, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.Y0.addAll(hashSet);
                    this.Z.d(this.Y0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.MM2
    public void b(List<String> workSpecIds) {
        for (String str : workSpecIds) {
            AbstractC6949i41.c().a(d1, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.Y.X(str);
        }
    }

    @Override // o.InterfaceC6579gY1
    public void c(String workSpecId) {
        if (this.c1 == null) {
            g();
        }
        if (!this.c1.booleanValue()) {
            AbstractC6949i41.c().d(d1, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        AbstractC6949i41.c().a(d1, String.format("Cancelling work ID %s", workSpecId), new Throwable[0]);
        R10 r10 = this.Z0;
        if (r10 != null) {
            r10.b(workSpecId);
        }
        this.Y.X(workSpecId);
    }

    @Override // o.InterfaceC6579gY1
    public boolean d() {
        return false;
    }

    @Override // o.InterfaceC5625cg0
    public void e(String workSpecId, boolean needsReschedule) {
        i(workSpecId);
    }

    @Override // o.MM2
    public void f(List<String> workSpecIds) {
        for (String str : workSpecIds) {
            AbstractC6949i41.c().a(d1, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.Y.U(str);
        }
    }

    public final void g() {
        this.c1 = Boolean.valueOf(C5294bI1.b(this.X, this.Y.F()));
    }

    public final void h() {
        if (!this.a1) {
            this.Y.J().c(this);
            this.a1 = true;
        }
    }

    public final void i(String workSpecId) {
        synchronized (this.b1) {
            try {
                Iterator<C8501oN2> it = this.Y0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C8501oN2 next = it.next();
                    if (next.a.equals(workSpecId)) {
                        AbstractC6949i41.c().a(d1, String.format("Stopping tracking for %s", workSpecId), new Throwable[0]);
                        this.Y0.remove(next);
                        this.Z.d(this.Y0);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(R10 delayedWorkTracker) {
        this.Z0 = delayedWorkTracker;
    }

    public ME0(Context context, ZM2 workManagerImpl, NM2 workConstraintsTracker) {
        this.X = context;
        this.Y = workManagerImpl;
        this.Z = workConstraintsTracker;
    }
}
