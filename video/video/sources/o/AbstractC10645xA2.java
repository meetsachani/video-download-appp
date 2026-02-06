package o;

import java.io.IOException;

/* renamed from: o.xA2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10645xA2<T, B> {
    public abstract void a(B b, int i, int i2);

    public abstract void b(B b, int i, long j);

    public abstract void c(B b, int i, T t);

    public abstract void d(B b, int i, AbstractC8616os abstractC8616os);

    public abstract void e(B b, int i, long j);

    public abstract B f(Object obj);

    public abstract T g(Object obj);

    public abstract int h(T t);

    public abstract int i(T t);

    public abstract void j(Object obj);

    public abstract T k(T t, T t2);

    public final void l(B b, EO1 eo1) throws IOException {
        while (eo1.I() != Integer.MAX_VALUE && m(b, eo1)) {
        }
    }

    public final boolean m(B b, EO1 eo1) throws IOException {
        int i0 = eo1.i0();
        int a = IM2.a(i0);
        int b2 = IM2.b(i0);
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 != 4) {
                            if (b2 == 5) {
                                a(b, a, eo1.B());
                                return true;
                            }
                            throw C9258rT0.e();
                        }
                        return false;
                    }
                    B n = n();
                    int c = IM2.c(a, 4);
                    l(n, eo1);
                    if (c == eo1.i0()) {
                        c(b, a, r(n));
                        return true;
                    }
                    throw C9258rT0.b();
                }
                d(b, a, eo1.t());
                return true;
            }
            b(b, a, eo1.c());
            return true;
        }
        e(b, a, eo1.Q());
        return true;
    }

    public abstract B n();

    public abstract void o(Object obj, B b);

    public abstract void p(Object obj, T t);

    public abstract boolean q(EO1 eo1);

    public abstract T r(B b);

    public abstract void s(T t, NN2 nn2) throws IOException;

    public abstract void t(T t, NN2 nn2) throws IOException;
}
