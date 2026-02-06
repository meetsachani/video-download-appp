package o;

import java.util.Collection;

/* renamed from: o.ir1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7138ir1<T> extends I2<T> {
    private static final long serialVersionUID = 2007613066565892961L;

    public C7138ir1(KF1<? super T>... kf1Arr) {
        super(kf1Arr);
    }

    public static <T> KF1<T> b(Collection<? extends KF1<? super T>> collection) {
        KF1[] j = RB0.j(collection);
        if (j.length == 0) {
            return Fu2.b();
        }
        return new C7138ir1(j);
    }

    public static <T> KF1<T> c(KF1<? super T>... kf1Arr) {
        RB0.h(kf1Arr);
        if (kf1Arr.length == 0) {
            return Fu2.b();
        }
        return new C7138ir1(RB0.e(kf1Arr));
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        for (KF1<? super T> kf1 : this.X) {
            if (kf1.evaluate(t)) {
                return false;
            }
        }
        return true;
    }
}
