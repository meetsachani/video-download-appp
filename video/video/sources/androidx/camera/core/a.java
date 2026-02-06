package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.g;
import java.nio.ByteBuffer;
import o.C4133Rk2;
import o.YM0;
import o.ZN0;

/* loaded from: classes.dex */
public final class a implements g {
    public final Image X;
    public final C0013a[] Y;
    public final YM0 Z;

    /* renamed from: androidx.camera.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0013a implements g.a {
        public final Image.Plane a;

        public C0013a(Image.Plane plane) {
            this.a = plane;
        }

        @Override // androidx.camera.core.g.a
        public ByteBuffer B() {
            return this.a.getBuffer();
        }

        @Override // androidx.camera.core.g.a
        public int C() {
            return this.a.getRowStride();
        }

        @Override // androidx.camera.core.g.a
        public int D() {
            return this.a.getPixelStride();
        }
    }

    public a(Image image) {
        this.X = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.Y = new C0013a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.Y[i] = new C0013a(planes[i]);
            }
        } else {
            this.Y = new C0013a[0];
        }
        this.Z = ZN0.f(C4133Rk2.b(), image.getTimestamp(), 0, new Matrix());
    }

    @Override // androidx.camera.core.g
    public YM0 I4() {
        return this.Z;
    }

    @Override // androidx.camera.core.g
    public Rect L3() {
        return this.X.getCropRect();
    }

    @Override // androidx.camera.core.g
    public Image X4() {
        return this.X;
    }

    @Override // androidx.camera.core.g
    public void b2(Rect rect) {
        this.X.setCropRect(rect);
    }

    @Override // androidx.camera.core.g, java.lang.AutoCloseable
    public void close() {
        this.X.close();
    }

    @Override // androidx.camera.core.g
    public g.a[] f3() {
        return this.Y;
    }

    @Override // androidx.camera.core.g
    public int getFormat() {
        return this.X.getFormat();
    }

    @Override // androidx.camera.core.g
    public int getHeight() {
        return this.X.getHeight();
    }

    @Override // androidx.camera.core.g
    public int getWidth() {
        return this.X.getWidth();
    }
}
