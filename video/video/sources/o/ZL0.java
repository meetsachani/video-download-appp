package o;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class ZL0<I, O> implements InterfaceC3287Is2<I, O>, Serializable {
    private static final long serialVersionUID = 8069309411242014252L;
    public final KF1<? super I> X;
    public final InterfaceC3287Is2<? super I, ? extends O> Y;
    public final InterfaceC3287Is2<? super I, ? extends O> Z;

    public ZL0(KF1<? super I> kf1, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is22) {
        this.X = kf1;
        this.Y = interfaceC3287Is2;
        this.Z = interfaceC3287Is22;
    }

    public static <T> InterfaceC3287Is2<T, T> e(KF1<? super T> kf1, InterfaceC3287Is2<? super T, ? extends T> interfaceC3287Is2) {
        if (kf1 != null) {
            if (interfaceC3287Is2 != null) {
                return new ZL0(kf1, interfaceC3287Is2, C8602oo1.b());
            }
            throw new NullPointerException("Transformer must not be null");
        }
        throw new NullPointerException("Predicate must not be null");
    }

    public static <I, O> InterfaceC3287Is2<I, O> f(KF1<? super I> kf1, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is2, InterfaceC3287Is2<? super I, ? extends O> interfaceC3287Is22) {
        if (kf1 != null) {
            if (interfaceC3287Is2 != null && interfaceC3287Is22 != null) {
                return new ZL0(kf1, interfaceC3287Is2, interfaceC3287Is22);
            }
            throw new NullPointerException("Transformers must not be null");
        }
        throw new NullPointerException("Predicate must not be null");
    }

    @Override // o.InterfaceC3287Is2
    public O a(I i) {
        if (this.X.evaluate(i)) {
            return this.Y.a(i);
        }
        return this.Z.a(i);
    }

    public InterfaceC3287Is2<? super I, ? extends O> b() {
        return this.Z;
    }

    public KF1<? super I> c() {
        return this.X;
    }

    public InterfaceC3287Is2<? super I, ? extends O> d() {
        return this.Y;
    }
}
