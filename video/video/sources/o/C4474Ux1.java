package o;

import android.util.Pair;

/* renamed from: o.Ux1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4474Ux1 {
    public static final <F, S> F a(Pair<F, S> pair) {
        return (F) pair.first;
    }

    public static final <F, S> F b(C4377Tx1<F, S> c4377Tx1) {
        return c4377Tx1.a;
    }

    public static final <F, S> S c(Pair<F, S> pair) {
        return (S) pair.second;
    }

    public static final <F, S> S d(C4377Tx1<F, S> c4377Tx1) {
        return c4377Tx1.b;
    }

    public static final <F, S> Pair<F, S> e(C4180Rx1<? extends F, ? extends S> c4180Rx1) {
        return new Pair<>(c4180Rx1.e(), c4180Rx1.f());
    }

    public static final <F, S> C4377Tx1<F, S> f(C4180Rx1<? extends F, ? extends S> c4180Rx1) {
        return new C4377Tx1<>(c4180Rx1.e(), c4180Rx1.f());
    }

    public static final <F, S> C4180Rx1<F, S> g(Pair<F, S> pair) {
        return new C4180Rx1<>(pair.first, pair.second);
    }

    public static final <F, S> C4180Rx1<F, S> h(C4377Tx1<F, S> c4377Tx1) {
        return new C4180Rx1<>(c4377Tx1.a, c4377Tx1.b);
    }
}
