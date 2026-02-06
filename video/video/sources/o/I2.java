package o;

import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class I2<T> implements MF1<T>, Serializable {
    private static final long serialVersionUID = -3094696765038308799L;
    public final KF1<? super T>[] X;

    public I2(KF1<? super T>... kf1Arr) {
        this.X = kf1Arr;
    }

    @Override // o.MF1
    public KF1<? super T>[] a() {
        return RB0.e(this.X);
    }
}
