package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import java.util.Arrays;
import o.AbstractC2755Dl;

/* renamed from: o.h70  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6717h70<S extends AbstractC2755Dl> {
    public static final float f = 0.48f;
    public S a;
    public final Path b;
    public final Path c;
    public final PathMeasure d;
    public final Matrix e;

    /* renamed from: o.h70$a */
    /* loaded from: classes3.dex */
    public static class a {
        @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
        public float a;
        @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
        public float b;
        @JF
        public int c;
        @PK1
        public int d;
        @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
        public float e = 1.0f;
        @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
        public float f;
        public float g;
        public boolean h;
    }

    public AbstractC6717h70(S s) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.a = s;
        this.e = new Matrix();
    }

    public abstract void a(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect, @InterfaceC2501Av0(from = -1.0d, to = 1.0d) float f2, boolean z, boolean z2);

    public abstract void b(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @JF int i, @BR0(from = 0, to = 255) int i2);

    public abstract void c(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @InterfaceC5670cr1 a aVar, @BR0(from = 0, to = 255) int i);

    public abstract void d(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f3, @JF int i, @BR0(from = 0, to = 255) int i2, @PK1 int i3);

    public abstract int e();

    public abstract int f();

    public abstract void g();

    public void h(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2, boolean z, boolean z2) {
        this.a.h();
        a(canvas, rect, f2, z, z2);
    }

    public float i(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    /* renamed from: o.h70$b */
    /* loaded from: classes3.dex */
    public class b {
        public float[] a;
        public float[] b;
        public final Matrix c;

        public b() {
            this.a = new float[2];
            this.b = r3;
            float[] fArr = {1.0f};
            this.c = new Matrix();
        }

        public float a(AbstractC6717h70<S>.b bVar) {
            float[] fArr = bVar.a;
            float f = fArr[0];
            float[] fArr2 = this.a;
            return (float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1]);
        }

        public void b(float f) {
            float[] fArr;
            float[] fArr2;
            float[] fArr3 = this.b;
            float atan2 = (float) (Math.atan2(fArr3[1], fArr3[0]) + 1.5707963267948966d);
            double d = f;
            double d2 = atan2;
            this.a[0] = (float) (fArr[0] + (Math.cos(d2) * d));
            this.a[1] = (float) (fArr2[1] + (d * Math.sin(d2)));
        }

        public void c(float f) {
            float[] fArr;
            float[] fArr2;
            float[] fArr3 = this.b;
            float atan2 = (float) Math.atan2(fArr3[1], fArr3[0]);
            double d = f;
            double d2 = atan2;
            this.a[0] = (float) (fArr[0] + (Math.cos(d2) * d));
            this.a[1] = (float) (fArr2[1] + (d * Math.sin(d2)));
        }

        public void d() {
            Arrays.fill(this.a, 0.0f);
            Arrays.fill(this.b, 0.0f);
            this.b[0] = 1.0f;
            this.c.reset();
        }

        public void e(float f) {
            this.c.reset();
            this.c.setRotate(f);
            this.c.mapPoints(this.a);
            this.c.mapPoints(this.b);
        }

        public void f(float f, float f2) {
            float[] fArr = this.a;
            fArr[0] = fArr[0] * f;
            fArr[1] = fArr[1] * f2;
            float[] fArr2 = this.b;
            fArr2[0] = fArr2[0] * f;
            fArr2[1] = fArr2[1] * f2;
        }

        public void g(float f, float f2) {
            float[] fArr = this.a;
            fArr[0] = fArr[0] + f;
            fArr[1] = fArr[1] + f2;
        }

        public b(AbstractC6717h70 abstractC6717h70, AbstractC6717h70<S>.b bVar) {
            this(bVar.a, bVar.b);
        }

        public b(float[] fArr, float[] fArr2) {
            float[] fArr3 = new float[2];
            this.a = fArr3;
            this.b = new float[2];
            System.arraycopy(fArr, 0, fArr3, 0, 2);
            System.arraycopy(fArr2, 0, this.b, 0, 2);
            this.c = new Matrix();
        }
    }
}
