package o;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes.dex */
public final class F22 extends androidx.camera.core.b {
    public final Object Y0;
    public final YM0 Z0;
    public Rect a1;
    public final int b1;
    public final int c1;

    public F22(androidx.camera.core.g gVar, YM0 ym0) {
        this(gVar, null, ym0);
    }

    @Override // androidx.camera.core.b, androidx.camera.core.g
    public YM0 I4() {
        return this.Z0;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.g
    public Rect L3() {
        synchronized (this.Y0) {
            try {
                if (this.a1 == null) {
                    return new Rect(0, 0, getWidth(), getHeight());
                }
                return new Rect(this.a1);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.b, androidx.camera.core.g
    public void b2(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.Y0) {
            this.a1 = rect;
        }
    }

    @Override // androidx.camera.core.b, androidx.camera.core.g
    public int getHeight() {
        return this.c1;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.g
    public int getWidth() {
        return this.b1;
    }

    public F22(androidx.camera.core.g gVar, Size size, YM0 ym0) {
        super(gVar);
        this.Y0 = new Object();
        if (size == null) {
            this.b1 = super.getWidth();
            this.c1 = super.getHeight();
        } else {
            this.b1 = size.getWidth();
            this.c1 = size.getHeight();
        }
        this.Z0 = ym0;
    }
}
