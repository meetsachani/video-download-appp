package o;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class OF1<T> implements InterfaceC3287Is2<T, Boolean>, Serializable {
    private static final long serialVersionUID = 5278818408044349346L;
    public final KF1<? super T> X;

    public OF1(KF1<? super T> kf1) {
        this.X = kf1;
    }

    public static <T> InterfaceC3287Is2<T, Boolean> c(KF1<? super T> kf1) {
        if (kf1 != null) {
            return new OF1(kf1);
        }
        throw new IllegalArgumentException("Predicate must not be null");
    }

    public KF1<? super T> b() {
        return this.X;
    }

    @Override // o.InterfaceC3287Is2
    /* renamed from: d */
    public Boolean a(T t) {
        return Boolean.valueOf(this.X.evaluate(t));
    }
}
