package o;

import java.util.Collection;

/* renamed from: o.vv1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C10340vv1<T> extends I2<T> {
    private static final long serialVersionUID = -8125389089924745785L;

    public C10340vv1(KF1<? super T>... kf1Arr) {
        super(kf1Arr);
    }

    public static <T> KF1<T> b(Collection<? extends KF1<? super T>> collection) {
        return new C10340vv1(RB0.j(collection));
    }

    public static <T> KF1<T> c(KF1<? super T>... kf1Arr) {
        RB0.h(kf1Arr);
        if (kf1Arr.length == 0) {
            return C7849ln0.b();
        }
        if (kf1Arr.length == 1) {
            return (KF1<T>) kf1Arr[0];
        }
        return new C10340vv1(RB0.e(kf1Arr));
    }

    @Override // o.KF1
    public boolean evaluate(T t) {
        boolean z = false;
        for (KF1<? super T> kf1 : this.X) {
            if (kf1.evaluate(t)) {
                if (z) {
                    return false;
                }
                z = true;
            }
        }
        return z;
    }
}
