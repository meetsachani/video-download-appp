package o;

import java.io.Serializable;

/* renamed from: o.vs2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10329vs2<T> implements MF1<T>, Serializable {
    private static final long serialVersionUID = -5596090919668315834L;
    public final InterfaceC3287Is2<? super T, ? extends T> X;
    public final KF1<? super T> Y;

    public C10329vs2(InterfaceC3287Is2<? super T, ? extends T> interfaceC3287Is2, KF1<? super T> kf1) {
        this.X = interfaceC3287Is2;
        this.Y = kf1;
    }

    public static <T> KF1<T> c(InterfaceC3287Is2<? super T, ? extends T> interfaceC3287Is2, KF1<? super T> kf1) {
        if (interfaceC3287Is2 != null) {
            if (kf1 != null) {
                return new C10329vs2(interfaceC3287Is2, kf1);
            }
            throw new NullPointerException("The predicate to call must not be null");
        }
        throw new NullPointerException("The transformer to call must not be null");
    }

    @Override // o.MF1
    public KF1<? super T>[] a() {
        return new KF1[]{this.Y};
    }

    public InterfaceC3287Is2<? super T, ? extends T> b() {
        return this.X;
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        return this.Y.evaluate(this.X.a(t));
    }
}
