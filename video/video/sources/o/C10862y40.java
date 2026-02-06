package o;

import android.graphics.PointF;
import android.view.Display;

/* renamed from: o.y40  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10862y40 extends AbstractC8825pj1 {
    public final float b;
    public final float c;
    public final Display d;
    public final InterfaceC6420fx e;

    public C10862y40(Display display, InterfaceC6420fx interfaceC6420fx, float f, float f2) {
        this.b = f;
        this.c = f2;
        this.d = display;
        this.e = interfaceC6420fx;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    @Override // o.AbstractC8825pj1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PointF a(float f, float f2) {
        boolean z;
        float f3 = this.b;
        float f4 = this.c;
        if (this.e.g() == 0) {
            z = true;
        } else {
            z = false;
        }
        int e = e(z);
        if (e != 90 && e != 270) {
            f2 = f;
            f = f2;
            f4 = f3;
            f3 = f4;
        }
        if (e != 90) {
            if (e != 180) {
                if (e == 270) {
                    f2 = f4 - f2;
                }
                if (z) {
                    f2 = f4 - f2;
                }
                return new PointF(f2 / f4, f / f3);
            }
            f2 = f4 - f2;
        }
        f = f3 - f;
        if (z) {
        }
        return new PointF(f2 / f4, f / f3);
    }

    public final int e(boolean z) {
        try {
            int t = this.e.t(this.d.getRotation());
            if (z) {
                return (360 - t) % 360;
            }
            return t;
        } catch (Exception unused) {
            return 0;
        }
    }
}
