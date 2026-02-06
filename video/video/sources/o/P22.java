package o;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import o.HT1;

/* loaded from: classes3.dex */
public class P22 {
    public static final int m = 0;
    public static final int n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f580o = 2;
    public static final int p = 3;
    public final C4992a32[] a = new C4992a32[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final C4992a32 g = new C4992a32();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public boolean l = true;

    /* loaded from: classes3.dex */
    public static class a {
        public static final P22 a = new P22();
    }

    @HT1({HT1.a.Y})
    /* loaded from: classes3.dex */
    public interface b {
        void a(C4992a32 c4992a32, Matrix matrix, int i);

        void b(C4992a32 c4992a32, Matrix matrix, int i);
    }

    /* loaded from: classes3.dex */
    public static final class c {
        @InterfaceC5670cr1
        public final O22 a;
        @InterfaceC5670cr1
        public final Path b;
        @InterfaceC5670cr1
        public final RectF c;
        @InterfaceC11300zs1
        public final b d;
        public final float e;

        public c(@InterfaceC5670cr1 O22 o22, float f, RectF rectF, @InterfaceC11300zs1 b bVar, Path path) {
            this.d = bVar;
            this.a = o22;
            this.e = f;
            this.c = rectF;
            this.b = path;
        }
    }

    public P22() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new C4992a32();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    @InterfaceC6184ey2
    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public static P22 l() {
        return a.a;
    }

    public final float a(int i) {
        return ((i + 1) % 4) * 90;
    }

    public final void b(@InterfaceC5670cr1 c cVar, int i) {
        this.h[0] = this.a[i].l();
        this.h[1] = this.a[i].m();
        this.b[i].mapPoints(this.h);
        if (i == 0) {
            Path path = cVar.b;
            float[] fArr = this.h;
            path.moveTo(fArr[0], fArr[1]);
        } else {
            Path path2 = cVar.b;
            float[] fArr2 = this.h;
            path2.lineTo(fArr2[0], fArr2[1]);
        }
        this.a[i].d(this.b[i], cVar.b);
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.a(this.a[i], this.b[i], i);
        }
    }

    public final void c(@InterfaceC5670cr1 c cVar, int i) {
        int i2 = (i + 1) % 4;
        this.h[0] = this.a[i].j();
        this.h[1] = this.a[i].k();
        this.b[i].mapPoints(this.h);
        this.i[0] = this.a[i2].l();
        this.i[1] = this.a[i2].m();
        this.b[i2].mapPoints(this.i);
        float[] fArr = this.h;
        float f = fArr[0];
        float[] fArr2 = this.i;
        float max = Math.max(((float) Math.hypot(f - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float j = j(cVar.c, i);
        this.g.q(0.0f, 0.0f);
        A90 k = k(i, cVar.a);
        k.c(max, j, cVar.e, this.g);
        this.j.reset();
        this.g.d(this.c[i], this.j);
        if (this.l && (k.b() || m(this.j, i) || m(this.j, i2))) {
            Path path = this.j;
            path.op(path, this.f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.l();
            this.h[1] = this.g.m();
            this.c[i].mapPoints(this.h);
            Path path2 = this.e;
            float[] fArr3 = this.h;
            path2.moveTo(fArr3[0], fArr3[1]);
            this.g.d(this.c[i], this.e);
        } else {
            this.g.d(this.c[i], cVar.b);
        }
        b bVar = cVar.d;
        if (bVar != null) {
            bVar.b(this.g, this.c[i], i);
        }
    }

    public void d(O22 o22, float f, RectF rectF, @InterfaceC5670cr1 Path path) {
        e(o22, f, rectF, null, path);
    }

    @HT1({HT1.a.Y})
    public void e(O22 o22, float f, RectF rectF, b bVar, @InterfaceC5670cr1 Path path) {
        f(o22, null, f, rectF, bVar, path);
    }

    @HT1({HT1.a.Y})
    public void f(@InterfaceC5670cr1 O22 o22, @InterfaceC11300zs1 float[] fArr, float f, RectF rectF, b bVar, @InterfaceC5670cr1 Path path) {
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(o22, f, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            n(cVar, i, fArr);
            p(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(cVar, i2);
            c(cVar, i2);
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path.op(this.e, Path.Op.UNION);
        }
    }

    public final void g(int i, @InterfaceC5670cr1 RectF rectF, @InterfaceC5670cr1 PointF pointF) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    pointF.set(rectF.right, rectF.top);
                    return;
                } else {
                    pointF.set(rectF.left, rectF.top);
                    return;
                }
            }
            pointF.set(rectF.left, rectF.bottom);
            return;
        }
        pointF.set(rectF.right, rectF.bottom);
    }

    @InterfaceC5670cr1
    public YP h(int i, @InterfaceC5670cr1 O22 o22) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return o22.t();
                }
                return o22.r();
            }
            return o22.j();
        }
        return o22.l();
    }

    public final ZP i(int i, @InterfaceC5670cr1 O22 o22) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return o22.s();
                }
                return o22.q();
            }
            return o22.i();
        }
        return o22.k();
    }

    public final float j(@InterfaceC5670cr1 RectF rectF, int i) {
        float[] fArr = this.h;
        C4992a32 c4992a32 = this.a[i];
        fArr[0] = c4992a32.c;
        fArr[1] = c4992a32.d;
        this.b[i].mapPoints(fArr);
        if (i != 1 && i != 3) {
            return Math.abs(rectF.centerY() - this.h[1]);
        }
        return Math.abs(rectF.centerX() - this.h[0]);
    }

    public final A90 k(int i, @InterfaceC5670cr1 O22 o22) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return o22.o();
                }
                return o22.p();
            }
            return o22.n();
        }
        return o22.h();
    }

    public final boolean m(Path path, int i) {
        this.k.reset();
        this.a[i].d(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f)) {
            return true;
        }
        return false;
    }

    public final void n(@InterfaceC5670cr1 c cVar, int i, @InterfaceC11300zs1 float[] fArr) {
        VC vc;
        if (fArr == null) {
            vc = h(i, cVar.a);
        } else {
            vc = new VC(fArr[i]);
        }
        i(i, cVar.a).c(this.a[i], 90.0f, cVar.e, cVar.c, vc);
        float a2 = a(i);
        this.b[i].reset();
        g(i, cVar.c, this.d);
        Matrix matrix = this.b[i];
        PointF pointF = this.d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.b[i].preRotate(a2);
    }

    public void o(boolean z) {
        this.l = z;
    }

    public final void p(int i) {
        this.h[0] = this.a[i].j();
        this.h[1] = this.a[i].k();
        this.b[i].mapPoints(this.h);
        float a2 = a(i);
        this.c[i].reset();
        Matrix matrix = this.c[i];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.c[i].preRotate(a2);
    }
}
