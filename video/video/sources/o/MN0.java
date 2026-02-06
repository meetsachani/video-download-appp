package o;

import android.util.Size;
import android.view.Surface;

/* loaded from: classes.dex */
public final class MN0 extends D10 {
    public final Surface p;

    public MN0(Surface surface, Size size, int i) {
        super(size, i);
        this.p = surface;
    }

    @Override // o.D10
    public InterfaceFutureC8411o11<Surface> p() {
        return C7221jC0.h(this.p);
    }

    public MN0(Surface surface) {
        this.p = surface;
    }
}
