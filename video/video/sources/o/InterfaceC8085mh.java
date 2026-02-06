package o;

import android.os.Handler;
import o.InterfaceC8085mh;

@Deprecated
/* renamed from: o.mh  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC8085mh {

    /* renamed from: o.mh$a */
    /* loaded from: classes2.dex */
    public static final class a {
        @InterfaceC11300zs1
        public final Handler a;
        @InterfaceC11300zs1
        public final InterfaceC8085mh b;

        public a(@InterfaceC11300zs1 Handler handler, @InterfaceC11300zs1 InterfaceC8085mh interfaceC8085mh) {
            Handler handler2;
            if (interfaceC8085mh != null) {
                handler2 = (Handler) C9542sf.g(handler);
            } else {
                handler2 = null;
            }
            this.a = handler2;
            this.b = interfaceC8085mh;
        }

        public static /* synthetic */ void d(a aVar, C10833xx0 c10833xx0, C9996uW c9996uW) {
            ((InterfaceC8085mh) TD2.o(aVar.b)).p(c10833xx0);
            ((InterfaceC8085mh) TD2.o(aVar.b)).D(c10833xx0, c9996uW);
        }

        public static /* synthetic */ void i(a aVar, C8775pW c8775pW) {
            aVar.getClass();
            c8775pW.c();
            ((InterfaceC8085mh) TD2.o(aVar.b)).x(c8775pW);
        }

        public void k(final Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.gh
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC8085mh) TD2.o(InterfaceC8085mh.a.this.b)).H(exc);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.lh
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC8085mh) TD2.o(InterfaceC8085mh.a.this.b)).b(exc);
                    }
                });
            }
        }

        public void m(final String str, final long j, final long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.fh
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC8085mh) TD2.o(InterfaceC8085mh.a.this.b)).r(str, j, j2);
                    }
                });
            }
        }

        public void n(final String str) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.ch
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC8085mh) TD2.o(InterfaceC8085mh.a.this.b)).q(str);
                    }
                });
            }
        }

        public void o(final C8775pW c8775pW) {
            c8775pW.c();
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.jh
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC8085mh.a.i(InterfaceC8085mh.a.this, c8775pW);
                    }
                });
            }
        }

        public void p(final C8775pW c8775pW) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.ih
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC8085mh) TD2.o(InterfaceC8085mh.a.this.b)).f(c8775pW);
                    }
                });
            }
        }

        public void q(final C10833xx0 c10833xx0, @InterfaceC11300zs1 final C9996uW c9996uW) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.kh
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC8085mh.a.d(InterfaceC8085mh.a.this, c10833xx0, c9996uW);
                    }
                });
            }
        }

        public void r(final long j) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.hh
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC8085mh) TD2.o(InterfaceC8085mh.a.this.b)).v(j);
                    }
                });
            }
        }

        public void s(final boolean z) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.eh
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC8085mh) TD2.o(InterfaceC8085mh.a.this.b)).a(z);
                    }
                });
            }
        }

        public void t(final int i, final long j, final long j2) {
            Handler handler = this.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: o.dh
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((InterfaceC8085mh) TD2.o(InterfaceC8085mh.a.this.b)).I(i, j, j2);
                    }
                });
            }
        }
    }

    default void H(Exception exc) {
    }

    default void a(boolean z) {
    }

    default void b(Exception exc) {
    }

    default void f(C8775pW c8775pW) {
    }

    @Deprecated
    default void p(C10833xx0 c10833xx0) {
    }

    default void q(String str) {
    }

    default void v(long j) {
    }

    default void x(C8775pW c8775pW) {
    }

    default void D(C10833xx0 c10833xx0, @InterfaceC11300zs1 C9996uW c9996uW) {
    }

    default void I(int i, long j, long j2) {
    }

    default void r(String str, long j, long j2) {
    }
}
