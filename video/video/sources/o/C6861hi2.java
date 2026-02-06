package o;

import android.view.Surface;

@Deprecated
/* renamed from: o.hi2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6861hi2 {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;

    public C6861hi2(Surface surface, int i, int i2) {
        this(surface, i, i2, 0);
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6861hi2)) {
            return false;
        }
        C6861hi2 c6861hi2 = (C6861hi2) obj;
        if (this.b == c6861hi2.b && this.c == c6861hi2.c && this.d == c6861hi2.d && this.a.equals(c6861hi2.a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public C6861hi2(Surface surface, int i, int i2, int i3) {
        C9542sf.b(i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }
}
