package o;

import java.util.Collection;

/* renamed from: o.ra  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9279ra<T> extends I2<T> {
    private static final long serialVersionUID = 7429999530934647542L;

    public C9279ra(KF1<? super T>... kf1Arr) {
        super(kf1Arr);
    }

    public static <T> KF1<T> b(Collection<? extends KF1<? super T>> collection) {
        KF1<T>[] j = RB0.j(collection);
        if (j.length == 0) {
            return C7849ln0.b();
        }
        if (j.length == 1) {
            return j[0];
        }
        return new C9279ra(j);
    }

    public static <T> KF1<T> c(KF1<? super T>... kf1Arr) {
        RB0.h(kf1Arr);
        if (kf1Arr.length == 0) {
            return C7849ln0.b();
        }
        if (kf1Arr.length == 1) {
            return (KF1<T>) kf1Arr[0];
        }
        return new C9279ra(RB0.e(kf1Arr));
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        for (KF1<? super T> kf1 : this.X) {
            if (kf1.evaluate(t)) {
                return true;
            }
        }
        return false;
    }
}
