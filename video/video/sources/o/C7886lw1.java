package o;

import java.io.Serializable;

/* renamed from: o.lw1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7886lw1<T> implements MF1<T>, Serializable {
    private static final long serialVersionUID = -8791518325735182855L;
    public final KF1<? super T> X;
    public final KF1<? super T> Y;

    public C7886lw1(KF1<? super T> kf1, KF1<? super T> kf12) {
        this.X = kf1;
        this.Y = kf12;
    }

    public static <T> KF1<T> b(KF1<? super T> kf1, KF1<? super T> kf12) {
        if (kf1 != null && kf12 != null) {
            return new C7886lw1(kf1, kf12);
        }
        throw new NullPointerException("Predicate must not be null");
    }

    @Override // o.MF1
    public KF1<? super T>[] a() {
        return new KF1[]{this.X, this.Y};
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        if (!this.X.evaluate(t) && !this.Y.evaluate(t)) {
            return false;
        }
        return true;
    }
}
