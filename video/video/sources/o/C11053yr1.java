package o;

import java.io.Serializable;

/* renamed from: o.yr1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C11053yr1<T> implements MF1<T>, Serializable {
    private static final long serialVersionUID = -2654603322338049674L;
    public final KF1<? super T> X;

    public C11053yr1(KF1<? super T> kf1) {
        this.X = kf1;
    }

    public static <T> KF1<T> b(KF1<? super T> kf1) {
        if (kf1 != null) {
            return new C11053yr1(kf1);
        }
        throw new NullPointerException("Predicate must not be null");
    }

    @Override // o.MF1
    public KF1<? super T>[] a() {
        return new KF1[]{this.X};
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        return !this.X.evaluate(t);
    }
}
