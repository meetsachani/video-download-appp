package o;

import android.view.Surface;

/* renamed from: o.b22  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5231b22 extends D10 {
    public final Surface p;
    public final int q;

    public C5231b22(Surface surface, int i) {
        this.p = surface;
        this.q = i;
    }

    @Override // o.D10
    public InterfaceFutureC8411o11<Surface> p() {
        return C7221jC0.h(this.p);
    }

    public int r() {
        return this.q;
    }
}
