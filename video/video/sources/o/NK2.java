package o;

/* loaded from: classes4.dex */
public class NK2<E> implements InterfaceC8705pE<E> {
    public final KF1<? super E> X;
    public final InterfaceC8705pE<? super E> Y;
    public final boolean Z;

    public NK2(KF1<? super E> kf1, InterfaceC8705pE<? super E> interfaceC8705pE, boolean z) {
        this.X = kf1;
        this.Y = interfaceC8705pE;
        this.Z = z;
    }

    public static <E> InterfaceC8705pE<E> e(KF1<? super E> kf1, InterfaceC8705pE<? super E> interfaceC8705pE, boolean z) {
        if (kf1 != null) {
            if (interfaceC8705pE != null) {
                return new NK2(kf1, interfaceC8705pE, z);
            }
            throw new NullPointerException("Closure must not be null");
        }
        throw new NullPointerException("Predicate must not be null");
    }

    @Override // o.InterfaceC8705pE
    public void a(E e) {
        if (this.Z) {
            this.Y.a(e);
        }
        while (this.X.evaluate(e)) {
            this.Y.a(e);
        }
    }

    public InterfaceC8705pE<? super E> b() {
        return this.Y;
    }

    public KF1<? super E> c() {
        return this.X;
    }

    public boolean d() {
        return this.Z;
    }
}
