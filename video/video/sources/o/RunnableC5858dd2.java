package o;

import androidx.work.impl.WorkDatabase;
import o.TM2;

/* renamed from: o.dd2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC5858dd2 implements Runnable {
    public static final String Y0 = AbstractC6949i41.f("StopWorkRunnable");
    public final ZM2 X;
    public final String Y;
    public final boolean Z;

    public RunnableC5858dd2(ZM2 workManagerImpl, String workSpecId, boolean stopInForeground) {
        this.X = workManagerImpl;
        this.Y = workSpecId;
        this.Z = stopInForeground;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean p;
        WorkDatabase M = this.X.M();
        C10187vI1 J = this.X.J();
        InterfaceC8744pN2 L = M.L();
        M.c();
        try {
            boolean i = J.i(this.Y);
            if (this.Z) {
                p = this.X.J().o(this.Y);
            } else {
                if (!i && L.i(this.Y) == TM2.a.RUNNING) {
                    L.t(TM2.a.ENQUEUED, this.Y);
                }
                p = this.X.J().p(this.Y);
            }
            AbstractC6949i41.c().a(Y0, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.Y, Boolean.valueOf(p)), new Throwable[0]);
            M.A();
            M.i();
        } catch (Throwable th) {
            M.i();
            throw th;
        }
    }
}
