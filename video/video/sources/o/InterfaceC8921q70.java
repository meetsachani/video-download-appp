package o;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceC7583kh1;
import o.InterfaceC8921q70;

@Deprecated
/* renamed from: o.q70 */
/* loaded from: classes2.dex */
public interface InterfaceC8921q70 {

    /* renamed from: o.q70$a */
    /* loaded from: classes2.dex */
    public static class a {
        public final int a;
        @InterfaceC11300zs1
        public final InterfaceC7583kh1.b b;
        public final CopyOnWriteArrayList<C0325a> c;

        /* renamed from: o.q70$a$a */
        /* loaded from: classes2.dex */
        public static final class C0325a {
            public Handler a;
            public InterfaceC8921q70 b;

            public C0325a(Handler handler, InterfaceC8921q70 interfaceC8921q70) {
                this.a = handler;
                this.b = interfaceC8921q70;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public static /* synthetic */ void a(a aVar, InterfaceC8921q70 interfaceC8921q70) {
            interfaceC8921q70.d0(aVar.a, aVar.b);
        }

        public static /* synthetic */ void b(a aVar, InterfaceC8921q70 interfaceC8921q70) {
            interfaceC8921q70.e(aVar.a, aVar.b);
        }

        public static /* synthetic */ void c(a aVar, InterfaceC8921q70 interfaceC8921q70) {
            interfaceC8921q70.u0(aVar.a, aVar.b);
        }

        public static /* synthetic */ void d(a aVar, InterfaceC8921q70 interfaceC8921q70, int i) {
            interfaceC8921q70.j(aVar.a, aVar.b);
            interfaceC8921q70.l(aVar.a, aVar.b, i);
        }

        public static /* synthetic */ void e(a aVar, InterfaceC8921q70 interfaceC8921q70, Exception exc) {
            interfaceC8921q70.n(aVar.a, aVar.b, exc);
        }

        public static /* synthetic */ void f(a aVar, InterfaceC8921q70 interfaceC8921q70) {
            interfaceC8921q70.n0(aVar.a, aVar.b);
        }

        public void g(Handler handler, InterfaceC8921q70 interfaceC8921q70) {
            C9542sf.g(handler);
            C9542sf.g(interfaceC8921q70);
            this.c.add(new C0325a(handler, interfaceC8921q70));
        }

        public void h() {
            Iterator<C0325a> it = this.c.iterator();
            while (it.hasNext()) {
                C0325a next = it.next();
                final InterfaceC8921q70 interfaceC8921q70 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.n70
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC8921q70.a.a(InterfaceC8921q70.a.this, interfaceC8921q70);
                    }
                });
            }
        }

        public void i() {
            Iterator<C0325a> it = this.c.iterator();
            while (it.hasNext()) {
                C0325a next = it.next();
                final InterfaceC8921q70 interfaceC8921q70 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.k70
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC8921q70.a.b(InterfaceC8921q70.a.this, interfaceC8921q70);
                    }
                });
            }
        }

        public void j() {
            Iterator<C0325a> it = this.c.iterator();
            while (it.hasNext()) {
                C0325a next = it.next();
                final InterfaceC8921q70 interfaceC8921q70 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.l70
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC8921q70.a.c(InterfaceC8921q70.a.this, interfaceC8921q70);
                    }
                });
            }
        }

        public void k(final int i) {
            Iterator<C0325a> it = this.c.iterator();
            while (it.hasNext()) {
                C0325a next = it.next();
                final InterfaceC8921q70 interfaceC8921q70 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.p70
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC8921q70.a.d(InterfaceC8921q70.a.this, interfaceC8921q70, i);
                    }
                });
            }
        }

        public void l(final Exception exc) {
            Iterator<C0325a> it = this.c.iterator();
            while (it.hasNext()) {
                C0325a next = it.next();
                final InterfaceC8921q70 interfaceC8921q70 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.m70
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC8921q70.a.e(InterfaceC8921q70.a.this, interfaceC8921q70, exc);
                    }
                });
            }
        }

        public void m() {
            Iterator<C0325a> it = this.c.iterator();
            while (it.hasNext()) {
                C0325a next = it.next();
                final InterfaceC8921q70 interfaceC8921q70 = next.b;
                TD2.u1(next.a, new Runnable() { // from class: o.o70
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC8921q70.a.f(InterfaceC8921q70.a.this, interfaceC8921q70);
                    }
                });
            }
        }

        public void n(InterfaceC8921q70 interfaceC8921q70) {
            Iterator<C0325a> it = this.c.iterator();
            while (it.hasNext()) {
                C0325a next = it.next();
                if (next.b == interfaceC8921q70) {
                    this.c.remove(next);
                }
            }
        }

        @OB
        public a o(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            return new a(this.c, i, bVar);
        }

        public a(CopyOnWriteArrayList<C0325a> copyOnWriteArrayList, int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = bVar;
        }
    }

    default void d0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
    }

    default void e(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
    }

    @Deprecated
    default void j(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
    }

    default void n0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
    }

    default void u0(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar) {
    }

    default void l(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, int i2) {
    }

    default void n(int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, Exception exc) {
    }
}
