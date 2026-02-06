package o;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceC7583kh1;
import o.InterfaceC9309rh1;

@Deprecated
/* renamed from: o.rh1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9309rh1 {

    /* renamed from: o.rh1$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final int a;
        @InterfaceC11300zs1
        public final InterfaceC7583kh1.b b;
        public final CopyOnWriteArrayList<C0338a> c;

        /* renamed from: o.rh1$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0338a {
            public Handler a;
            public InterfaceC9309rh1 b;

            public C0338a(Handler handler, InterfaceC9309rh1 interfaceC9309rh1) {
                this.a = handler;
                this.b = interfaceC9309rh1;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public void g(Handler handler, InterfaceC9309rh1 interfaceC9309rh1) {
            C9542sf.g(handler);
            C9542sf.g(interfaceC9309rh1);
            this.c.add(new C0338a(handler, interfaceC9309rh1));
        }

        public void h(int i, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i2, @InterfaceC11300zs1 Object obj, long j) {
            i(new C10519wf1(1, i, c10833xx0, i2, obj, TD2.b2(j), C10323vs.b));
        }

        public void i(final C10519wf1 c10519wf1) {
            Iterator<C0338a> it = this.c.iterator();
            while (it.hasNext()) {
                C0338a next = it.next();
                final InterfaceC9309rh1 interfaceC9309rh1 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.qh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC9309rh1.p(r0.a, InterfaceC9309rh1.a.this.b, c10519wf1);
                    }
                });
            }
        }

        public void j(N11 n11, int i) {
            k(n11, i, -1, null, 0, null, C10323vs.b, C10323vs.b);
        }

        public void k(N11 n11, int i, int i2, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i3, @InterfaceC11300zs1 Object obj, long j, long j2) {
            l(n11, new C10519wf1(i, i2, c10833xx0, i3, obj, TD2.b2(j), TD2.b2(j2)));
        }

        public void l(final N11 n11, final C10519wf1 c10519wf1) {
            Iterator<C0338a> it = this.c.iterator();
            while (it.hasNext()) {
                C0338a next = it.next();
                final InterfaceC9309rh1 interfaceC9309rh1 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.nh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC9309rh1.m0(r0.a, InterfaceC9309rh1.a.this.b, n11, c10519wf1);
                    }
                });
            }
        }

        public void m(N11 n11, int i) {
            n(n11, i, -1, null, 0, null, C10323vs.b, C10323vs.b);
        }

        public void n(N11 n11, int i, int i2, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i3, @InterfaceC11300zs1 Object obj, long j, long j2) {
            o(n11, new C10519wf1(i, i2, c10833xx0, i3, obj, TD2.b2(j), TD2.b2(j2)));
        }

        public void o(final N11 n11, final C10519wf1 c10519wf1) {
            Iterator<C0338a> it = this.c.iterator();
            while (it.hasNext()) {
                C0338a next = it.next();
                final InterfaceC9309rh1 interfaceC9309rh1 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.lh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC9309rh1.y(r0.a, InterfaceC9309rh1.a.this.b, n11, c10519wf1);
                    }
                });
            }
        }

        public void p(N11 n11, int i, int i2, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i3, @InterfaceC11300zs1 Object obj, long j, long j2, IOException iOException, boolean z) {
            r(n11, new C10519wf1(i, i2, c10833xx0, i3, obj, TD2.b2(j), TD2.b2(j2)), iOException, z);
        }

        public void q(N11 n11, int i, IOException iOException, boolean z) {
            p(n11, i, -1, null, 0, null, C10323vs.b, C10323vs.b, iOException, z);
        }

        public void r(final N11 n11, final C10519wf1 c10519wf1, final IOException iOException, final boolean z) {
            Iterator<C0338a> it = this.c.iterator();
            while (it.hasNext()) {
                C0338a next = it.next();
                final InterfaceC9309rh1 interfaceC9309rh1 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.mh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC9309rh1.h0(r0.a, InterfaceC9309rh1.a.this.b, n11, c10519wf1, iOException, z);
                    }
                });
            }
        }

        public void s(N11 n11, int i) {
            t(n11, i, -1, null, 0, null, C10323vs.b, C10323vs.b);
        }

        public void t(N11 n11, int i, int i2, @InterfaceC11300zs1 C10833xx0 c10833xx0, int i3, @InterfaceC11300zs1 Object obj, long j, long j2) {
            u(n11, new C10519wf1(i, i2, c10833xx0, i3, obj, TD2.b2(j), TD2.b2(j2)));
        }

        public void u(final N11 n11, final C10519wf1 c10519wf1) {
            Iterator<C0338a> it = this.c.iterator();
            while (it.hasNext()) {
                C0338a next = it.next();
                final InterfaceC9309rh1 interfaceC9309rh1 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.oh1
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC9309rh1.f0(r0.a, InterfaceC9309rh1.a.this.b, n11, c10519wf1);
                    }
                });
            }
        }

        public void v(InterfaceC9309rh1 interfaceC9309rh1) {
            Iterator<C0338a> it = this.c.iterator();
            while (it.hasNext()) {
                C0338a next = it.next();
                if (next.b == interfaceC9309rh1) {
                    this.c.remove(next);
                }
            }
        }

        public void w(int i, long j, long j2) {
            x(new C10519wf1(1, i, null, 3, null, TD2.b2(j), TD2.b2(j2)));
        }

        public void x(final C10519wf1 c10519wf1) {
            final InterfaceC7583kh1.b bVar = (InterfaceC7583kh1.b) C9542sf.g(this.b);
            Iterator<C0338a> it = this.c.iterator();
            while (it.hasNext()) {
                C0338a next = it.next();
                final InterfaceC9309rh1 interfaceC9309rh1 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.ph1
                    @Override // java.lang.Runnable
                    public final void run() {
                        interfaceC9309rh1.i(InterfaceC9309rh1.a.this.a, bVar, c10519wf1);
                    }
                });
            }
        }

        @OB
        public a y(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            return new a(this.c, i, bVar);
        }

        @Deprecated
        @OB
        public a z(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, long j) {
            return new a(this.c, i, bVar);
        }

        public a(CopyOnWriteArrayList<C0338a> copyOnWriteArrayList, int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    default void i(int i, InterfaceC7583kh1.b bVar, C10519wf1 c10519wf1) {
    }

    default void p(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, C10519wf1 c10519wf1) {
    }

    default void f0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1) {
    }

    default void m0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1) {
    }

    default void y(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1) {
    }

    default void h0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, N11 n11, C10519wf1 c10519wf1, IOException iOException, boolean z) {
    }
}
