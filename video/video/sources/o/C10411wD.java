package o;

import android.os.Handler;
import android.os.Looper;
import o.AbstractC5091aS1;

/* renamed from: o.wD  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10411wD extends AbstractC5091aS1<Object> {
    public final InterfaceC4747Xs n1;
    public final Runnable o1;

    public C10411wD(InterfaceC4747Xs interfaceC4747Xs, Runnable runnable) {
        super(0, null, null);
        this.n1 = interfaceC4747Xs;
        this.o1 = runnable;
    }

    @Override // o.AbstractC5091aS1
    public AbstractC5091aS1.d C() {
        return AbstractC5091aS1.d.IMMEDIATE;
    }

    @Override // o.AbstractC5091aS1
    public boolean K() {
        this.n1.clear();
        if (this.o1 != null) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.o1);
            return true;
        }
        return true;
    }

    @Override // o.AbstractC5091aS1
    public DT1<Object> P(C3470Kp1 c3470Kp1) {
        return null;
    }

    @Override // o.AbstractC5091aS1
    public void l(Object obj) {
    }
}
