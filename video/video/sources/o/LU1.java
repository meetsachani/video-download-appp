package o;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.Image;
import androidx.camera.core.g;
import java.nio.ByteBuffer;
import java.util.Objects;
import o.C2540Bg0;

/* loaded from: classes.dex */
public final class LU1 implements androidx.camera.core.g {
    public final Object X;
    public final int Y;
    public final Rect Y0;
    public final int Z;
    public g.a[] Z0;
    public final YM0 a1;

    /* loaded from: classes.dex */
    public class a implements g.a {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ ByteBuffer c;

        public a(int i, int i2, ByteBuffer byteBuffer) {
            this.a = i;
            this.b = i2;
            this.c = byteBuffer;
        }

        @Override // androidx.camera.core.g.a
        public ByteBuffer B() {
            return this.c;
        }

        @Override // androidx.camera.core.g.a
        public int C() {
            return this.a;
        }

        @Override // androidx.camera.core.g.a
        public int D() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public class b implements YM0 {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Matrix c;

        public b(long j, int i, Matrix matrix) {
            this.a = j;
            this.b = i;
            this.c = matrix;
        }

        @Override // o.YM0
        public C4133Rk2 a() {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain TagBundle");
        }

        @Override // o.YM0
        public void b(C2540Bg0.b bVar) {
            throw new UnsupportedOperationException("Custom ImageProxy does not contain Exif data.");
        }

        @Override // o.YM0
        public long c() {
            return this.a;
        }

        @Override // o.YM0
        public Matrix d() {
            return new Matrix(this.c);
        }

        @Override // o.YM0
        public int e() {
            return this.b;
        }
    }

    public LU1(AbstractC3401Jx1<Bitmap> abstractC3401Jx1) {
        this(abstractC3401Jx1.c(), abstractC3401Jx1.b(), abstractC3401Jx1.f(), abstractC3401Jx1.g(), abstractC3401Jx1.a().c());
    }

    public static YM0 f(long j, int i, Matrix matrix) {
        return new b(j, i, matrix);
    }

    public static g.a h(ByteBuffer byteBuffer, int i, int i2) {
        return new a(i, i2, byteBuffer);
    }

    @Override // androidx.camera.core.g
    public YM0 I4() {
        YM0 ym0;
        synchronized (this.X) {
            a();
            ym0 = this.a1;
        }
        return ym0;
    }

    @Override // androidx.camera.core.g
    public Rect L3() {
        Rect rect;
        synchronized (this.X) {
            a();
            rect = this.Y0;
        }
        return rect;
    }

    @Override // androidx.camera.core.g
    public Image X4() {
        synchronized (this.X) {
            a();
        }
        return null;
    }

    public final void a() {
        boolean z;
        synchronized (this.X) {
            if (this.Z0 != null) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.o(z, "The image is closed.");
        }
    }

    @Override // androidx.camera.core.g
    public void b2(Rect rect) {
        synchronized (this.X) {
            try {
                a();
                if (rect != null) {
                    this.Y0.set(rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.g, java.lang.AutoCloseable
    public void close() {
        synchronized (this.X) {
            a();
            this.Z0 = null;
        }
    }

    public Bitmap d() {
        Bitmap e;
        synchronized (this.X) {
            a();
            e = C10206vN0.e(f3(), getWidth(), getHeight());
        }
        return e;
    }

    @Override // androidx.camera.core.g
    public g.a[] f3() {
        g.a[] aVarArr;
        synchronized (this.X) {
            a();
            g.a[] aVarArr2 = this.Z0;
            Objects.requireNonNull(aVarArr2);
            aVarArr = aVarArr2;
        }
        return aVarArr;
    }

    @Override // androidx.camera.core.g
    public int getFormat() {
        synchronized (this.X) {
            a();
        }
        return 1;
    }

    @Override // androidx.camera.core.g
    public int getHeight() {
        int i;
        synchronized (this.X) {
            a();
            i = this.Z;
        }
        return i;
    }

    @Override // androidx.camera.core.g
    public int getWidth() {
        int i;
        synchronized (this.X) {
            a();
            i = this.Y;
        }
        return i;
    }

    public LU1(Bitmap bitmap, Rect rect, int i, Matrix matrix, long j) {
        this(C10206vN0.g(bitmap), 4, bitmap.getWidth(), bitmap.getHeight(), rect, i, matrix, j);
    }

    public LU1(ByteBuffer byteBuffer, int i, int i2, int i3, Rect rect, int i4, Matrix matrix, long j) {
        this.X = new Object();
        this.Y = i2;
        this.Z = i3;
        this.Y0 = rect;
        this.a1 = f(j, i4, matrix);
        byteBuffer.rewind();
        this.Z0 = new g.a[]{h(byteBuffer, i2 * i, i)};
    }
}
