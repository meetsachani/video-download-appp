package o;

import java.io.Serializable;

/* renamed from: o.fs1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6402fs1<T> implements MF1<T>, Serializable {
    private static final long serialVersionUID = 3243449850504576071L;
    public final KF1<? super T> X;

    public C6402fs1(KF1<? super T> kf1) {
        this.X = kf1;
    }

    public static <T> KF1<T> b(KF1<? super T> kf1) {
        if (kf1 != null) {
            return new C6402fs1(kf1);
        }
        throw new NullPointerException("Predicate must not be null");
    }

    @Override // o.MF1
    public KF1<? super T>[] a() {
        return new KF1[]{this.X};
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        if (t != null) {
            return this.X.evaluate(t);
        }
        throw new OB0("Input Object must not be null");
    }
}
