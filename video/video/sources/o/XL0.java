package o;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class XL0<E> implements InterfaceC8705pE<E>, Serializable {
    private static final long serialVersionUID = 3518477308466486130L;
    public final KF1<? super E> X;
    public final InterfaceC8705pE<? super E> Y;
    public final InterfaceC8705pE<? super E> Z;

    public XL0(KF1<? super E> kf1, InterfaceC8705pE<? super E> interfaceC8705pE) {
        this(kf1, interfaceC8705pE, C8115mo1.b());
    }

    public static <E> InterfaceC8705pE<E> e(KF1<? super E> kf1, InterfaceC8705pE<? super E> interfaceC8705pE) {
        return f(kf1, interfaceC8705pE, C8115mo1.b());
    }

    public static <E> InterfaceC8705pE<E> f(KF1<? super E> kf1, InterfaceC8705pE<? super E> interfaceC8705pE, InterfaceC8705pE<? super E> interfaceC8705pE2) {
        if (kf1 != null) {
            if (interfaceC8705pE != null && interfaceC8705pE2 != null) {
                return new XL0(kf1, interfaceC8705pE, interfaceC8705pE2);
            }
            throw new NullPointerException("Closures must not be null");
        }
        throw new NullPointerException("Predicate must not be null");
    }

    @Override // o.InterfaceC8705pE
    public void a(E e) {
        if (this.X.evaluate(e)) {
            this.Y.a(e);
        } else {
            this.Z.a(e);
        }
    }

    public InterfaceC8705pE<? super E> b() {
        return this.Z;
    }

    public KF1<? super E> c() {
        return this.X;
    }

    public InterfaceC8705pE<? super E> d() {
        return this.Y;
    }

    public XL0(KF1<? super E> kf1, InterfaceC8705pE<? super E> interfaceC8705pE, InterfaceC8705pE<? super E> interfaceC8705pE2) {
        this.X = kf1;
        this.Y = interfaceC8705pE;
        this.Z = interfaceC8705pE2;
    }
}
