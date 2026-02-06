package o;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.InterfaceC3643Mk;

@Deprecated
/* renamed from: o.Mk */
/* loaded from: classes2.dex */
public interface InterfaceC3643Mk {

    /* renamed from: o.Mk$a */
    /* loaded from: classes2.dex */
    public interface a {

        /* renamed from: o.Mk$a$a */
        /* loaded from: classes2.dex */
        public static final class C0205a {
            public final CopyOnWriteArrayList<C0206a> a = new CopyOnWriteArrayList<>();

            /* renamed from: o.Mk$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0206a {
                public final Handler a;
                public final a b;
                public boolean c;

                public C0206a(Handler handler, a aVar) {
                    this.a = handler;
                    this.b = aVar;
                }

                public void d() {
                    this.c = true;
                }
            }

            public static /* synthetic */ void a(C0206a c0206a, int i, long j, long j2) {
                c0206a.b.h(i, j, j2);
            }

            public void b(Handler handler, a aVar) {
                C9542sf.g(handler);
                C9542sf.g(aVar);
                d(aVar);
                this.a.add(new C0206a(handler, aVar));
            }

            public void c(int i, long j, long j2) {
                final int i2;
                final long j3;
                final long j4;
                Iterator<C0206a> it = this.a.iterator();
                while (it.hasNext()) {
                    final C0206a next = it.next();
                    if (!next.c) {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                        next.a.post(new Runnable() { // from class: o.Lk
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC3643Mk.a.C0205a.a(InterfaceC3643Mk.a.C0205a.C0206a.this, i2, j3, j4);
                            }
                        });
                    } else {
                        i2 = i;
                        j3 = j;
                        j4 = j2;
                    }
                    i = i2;
                    j = j3;
                    j2 = j4;
                }
            }

            public void d(a aVar) {
                Iterator<C0206a> it = this.a.iterator();
                while (it.hasNext()) {
                    C0206a next = it.next();
                    if (next.b == aVar) {
                        next.d();
                        this.a.remove(next);
                    }
                }
            }
        }

        void h(int i, long j, long j2);
    }

    void a(Handler handler, a aVar);

    default long b() {
        return C10323vs.b;
    }

    void c(a aVar);

    @InterfaceC11300zs1
    InterfaceC4261Sr2 e();

    long g();
}
