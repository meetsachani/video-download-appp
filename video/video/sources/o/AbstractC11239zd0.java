package o;

/* renamed from: o.zd0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11239zd0<T> extends AbstractC6950i42 {
    public AbstractC11239zd0(VU1 vu1) {
        super(vu1);
    }

    @Override // o.AbstractC6950i42
    public abstract String d();

    public abstract void g(InterfaceC2546Bh2 interfaceC2546Bh2, T t);

    public final int h(T t) {
        InterfaceC2546Bh2 a = a();
        try {
            g(a, t);
            return a.T0();
        } finally {
            f(a);
        }
    }

    public final int i(Iterable<? extends T> iterable) {
        InterfaceC2546Bh2 a = a();
        try {
            int i = 0;
            for (T t : iterable) {
                g(a, t);
                i += a.T0();
            }
            return i;
        } finally {
            f(a);
        }
    }

    public final int j(T[] tArr) {
        InterfaceC2546Bh2 a = a();
        try {
            int i = 0;
            for (T t : tArr) {
                g(a, t);
                i += a.T0();
            }
            return i;
        } finally {
            f(a);
        }
    }
}
