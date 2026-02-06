package o;

import android.os.Handler;
import android.os.SystemClock;
import o.NG2;

@Deprecated
/* loaded from: classes2.dex */
public interface NG2 {

    /* loaded from: classes2.dex */
    public static final class a {
        @InterfaceC11300zs1
        public final Handler a;
        @InterfaceC11300zs1
        public final NG2 b;

        public a(@InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 NG2 ng2) {
            Handler handler2;
            if (ng2 != null) {
                handler2 = (Handler) C9542sf.g(handler);
            } else {
                handler2 = null;
            }
            this.a = handler2;
            this.b = ng2;
        }

        public static /* synthetic */ void c(a aVar, C8775pW c8775pW) {
            aVar.getClass();
            c8775pW.c();
            ((NG2) TD2.o(aVar.b)).E(c8775pW);
        }

        public static /* synthetic */ void i(a aVar, C10833xx0 c10833xx0, C9996uW c9996uW) {
            ((NG2) TD2.o(aVar.b)).l(c10833xx0);
            ((NG2) TD2.o(aVar.b)).B(c10833xx0, c9996uW);
        }

        public void k(final String str, final long j, final long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.JG2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((NG2) TD2.o(NG2.a.this.b)).d(str, j, j2);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.GG2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((NG2) TD2.o(NG2.a.this.b)).c(str);
                    }
                });
            }
        }

        public void m(final C8775pW c8775pW) {
            c8775pW.c();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.HG2
                    @Override // java.lang.Runnable
                    public final void run() {
                        NG2.a.c(NG2.a.this, c8775pW);
                    }
                });
            }
        }

        public void n(final int i, final long j) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.EG2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((NG2) TD2.o(NG2.a.this.b)).C(i, j);
                    }
                });
            }
        }

        public void o(final C8775pW c8775pW) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.KG2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((NG2) TD2.o(NG2.a.this.b)).z(c8775pW);
                    }
                });
            }
        }

        public void p(final C10833xx0 c10833xx0, @InterfaceC11300zs1 final C9996uW c9996uW) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.LG2
                    @Override // java.lang.Runnable
                    public final void run() {
                        NG2.a.i(NG2.a.this, c10833xx0, c9996uW);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.a != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                this.a.post(new Runnable() { // from class: o.FG2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((NG2) TD2.o(NG2.a.this.b)).F(obj, elapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j, final int i) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.MG2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((NG2) TD2.o(NG2.a.this.b)).J(j, i);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.IG2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((NG2) TD2.o(NG2.a.this.b)).w(exc);
                    }
                });
            }
        }

        public void t(final PG2 pg2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.DG2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((NG2) TD2.o(NG2.a.this.b)).t(pg2);
                    }
                });
            }
        }
    }

    default void E(C8775pW c8775pW) {
    }

    default void c(String str) {
    }

    @Deprecated
    default void l(C10833xx0 c10833xx0) {
    }

    default void t(PG2 pg2) {
    }

    default void w(Exception exc) {
    }

    default void z(C8775pW c8775pW) {
    }

    default void B(C10833xx0 c10833xx0, @InterfaceC11300zs1 C9996uW c9996uW) {
    }

    default void C(int i, long j) {
    }

    default void F(Object obj, long j) {
    }

    default void J(long j, int i) {
    }

    default void d(String str, long j, long j2) {
    }
}
