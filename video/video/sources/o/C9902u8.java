package o;

import java.util.Collection;

/* renamed from: o.u8  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9902u8<T> extends I2<T> {
    private static final long serialVersionUID = -3094696765038308799L;

    public C9902u8(KF1<? super T>... kf1Arr) {
        super(kf1Arr);
    }

    public static <T> KF1<T> b(Collection<? extends KF1<? super T>> collection) {
        KF1[] j = RB0.j(collection);
        if (j.length == 0) {
            return Fu2.b();
        }
        if (j.length == 1) {
            return RB0.b(j[0]);
        }
        return new C9902u8(j);
    }

    public static <T> KF1<T> c(KF1<? super T>... kf1Arr) {
        RB0.h(kf1Arr);
        if (kf1Arr.length == 0) {
            return Fu2.b();
        }
        if (kf1Arr.length == 1) {
            return RB0.b(kf1Arr[0]);
        }
        return new C9902u8(RB0.e(kf1Arr));
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        for (KF1<? super T> kf1 : this.X) {
            if (!kf1.evaluate(t)) {
                return false;
            }
        }
        return true;
    }
}
