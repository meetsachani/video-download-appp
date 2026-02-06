package o;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import o.AbstractC7840ll;

/* renamed from: o.uE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9927uE0 implements InterfaceC6474g70, AbstractC7840ll.b, CX0 {
    public static final int u = 32;
    public final String a;
    public final boolean b;
    public final AbstractC8588ol c;
    public final C5484c51<LinearGradient> d = new C5484c51<>();
    public final C5484c51<RadialGradient> e = new C5484c51<>();
    public final Path f;
    public final Paint g;
    public final RectF h;
    public final List<InterfaceC5702cz1> i;
    public final AE0 j;
    public final AbstractC7840ll<C8706pE0, C8706pE0> k;
    public final AbstractC7840ll<Integer, Integer> l;
    public final AbstractC7840ll<PointF, PointF> m;
    public final AbstractC7840ll<PointF, PointF> n;

    /* renamed from: o  reason: collision with root package name */
    public AbstractC7840ll<ColorFilter, ColorFilter> f883o;
    public CE2 p;
    public final C8431o61 q;
    public final int r;
    public AbstractC7840ll<Float, Float> s;
    public float t;

    public C9927uE0(C8431o61 c8431o61, C10624x51 c10624x51, AbstractC8588ol abstractC8588ol, C9684tE0 c9684tE0) {
        Path path = new Path();
        this.f = path;
        this.g = new C5353bY0(1);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = abstractC8588ol;
        this.a = c9684tE0.f();
        this.b = c9684tE0.i();
        this.q = c8431o61;
        this.j = c9684tE0.e();
        path.setFillType(c9684tE0.c());
        this.r = (int) (c10624x51.d() / 32.0f);
        AbstractC7840ll<C8706pE0, C8706pE0> a = c9684tE0.d().a();
        this.k = a;
        a.a(this);
        abstractC8588ol.j(a);
        AbstractC7840ll<Integer, Integer> a2 = c9684tE0.g().a();
        this.l = a2;
        a2.a(this);
        abstractC8588ol.j(a2);
        AbstractC7840ll<PointF, PointF> a3 = c9684tE0.h().a();
        this.m = a3;
        a3.a(this);
        abstractC8588ol.j(a3);
        AbstractC7840ll<PointF, PointF> a4 = c9684tE0.b().a();
        this.n = a4;
        a4.a(this);
        abstractC8588ol.j(a4);
        if (abstractC8588ol.x() != null) {
            C8629ov0 a5 = abstractC8588ol.x().a().a();
            this.s = a5;
            a5.a(this);
            abstractC8588ol.j(this.s);
        }
    }

    private int[] i(int[] iArr) {
        CE2 ce2 = this.p;
        if (ce2 != null) {
            Integer[] numArr = (Integer[]) ce2.h();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    private int j() {
        int i;
        int round = Math.round(this.m.f() * this.r);
        int round2 = Math.round(this.n.f() * this.r);
        int round3 = Math.round(this.k.f() * this.r);
        if (round != 0) {
            i = 527 * round;
        } else {
            i = 17;
        }
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        if (round3 != 0) {
            return i * 31 * round3;
        }
        return i;
    }

    private LinearGradient k() {
        float[] fArr;
        int[] iArr;
        long j = j();
        LinearGradient h = this.d.h(j);
        if (h != null) {
            return h;
        }
        PointF h2 = this.m.h();
        PointF h3 = this.n.h();
        C8706pE0 h4 = this.k.h();
        int[] i = i(h4.d());
        float[] e = h4.e();
        if (i.length < 2) {
            iArr = new int[]{i[0], i[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = e;
            iArr = i;
        }
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.d.n(j, linearGradient);
        return linearGradient;
    }

    private RadialGradient l() {
        float[] fArr;
        int[] iArr;
        long j = j();
        RadialGradient h = this.e.h(j);
        if (h != null) {
            return h;
        }
        PointF h2 = this.m.h();
        PointF h3 = this.n.h();
        C8706pE0 h4 = this.k.h();
        int[] i = i(h4.d());
        float[] e = h4.e();
        if (i.length < 2) {
            iArr = new int[]{i[0], i[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = e;
            iArr = i;
        }
        float f = h2.x;
        float f2 = h2.y;
        float hypot = (float) Math.hypot(h3.x - f, h3.y - f2);
        if (hypot <= 0.0f) {
            hypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f, f2, hypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.e.n(j, radialGradient);
        return radialGradient;
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        this.q.invalidateSelf();
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
        for (int i = 0; i < list2.size(); i++) {
            DL dl = list2.get(i);
            if (dl instanceof InterfaceC5702cz1) {
                this.i.add((InterfaceC5702cz1) dl);
            }
        }
    }

    @Override // o.BX0
    public void c(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
        C4713Xj1.m(ax0, i, list, ax02, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.BX0
    public <T> void d(T t, O61<T> o61) {
        if (t == D61.d) {
            this.l.o(o61);
        } else if (t == D61.N) {
            AbstractC7840ll<ColorFilter, ColorFilter> abstractC7840ll = this.f883o;
            if (abstractC7840ll != null) {
                this.c.H(abstractC7840ll);
            }
            if (o61 == null) {
                this.f883o = null;
                return;
            }
            CE2 ce2 = new CE2(o61);
            this.f883o = ce2;
            ce2.a(this);
            this.c.j(this.f883o);
        } else if (t == D61.O) {
            CE2 ce22 = this.p;
            if (ce22 != null) {
                this.c.H(ce22);
            }
            if (o61 == null) {
                this.p = null;
                return;
            }
            this.d.c();
            this.e.c();
            CE2 ce23 = new CE2(o61);
            this.p = ce23;
            ce23.a(this);
            this.c.j(this.p);
        } else if (t == D61.j) {
            AbstractC7840ll<Float, Float> abstractC7840ll2 = this.s;
            if (abstractC7840ll2 != null) {
                abstractC7840ll2.o(o61);
                return;
            }
            CE2 ce24 = new CE2(o61);
            this.s = ce24;
            ce24.a(this);
            this.c.j(this.s);
        }
    }

    @Override // o.InterfaceC6474g70
    public void e(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        Shader l;
        if (!this.b) {
            if (ZX0.h()) {
                ZX0.b("GradientFillContent#draw");
            }
            this.f.reset();
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                this.f.addPath(this.i.get(i2).Y(), matrix);
            }
            this.f.computeBounds(this.h, false);
            if (this.j == AE0.LINEAR) {
                l = k();
            } else {
                l = l();
            }
            l.setLocalMatrix(matrix);
            this.g.setShader(l);
            AbstractC7840ll<ColorFilter, ColorFilter> abstractC7840ll = this.f883o;
            if (abstractC7840ll != null) {
                this.g.setColorFilter(abstractC7840ll.h());
            }
            AbstractC7840ll<Float, Float> abstractC7840ll2 = this.s;
            if (abstractC7840ll2 != null) {
                float floatValue = abstractC7840ll2.h().floatValue();
                if (floatValue == 0.0f) {
                    this.g.setMaskFilter(null);
                } else if (floatValue != this.t) {
                    this.g.setMaskFilter(new BlurMaskFilter(floatValue, BlurMaskFilter.Blur.NORMAL));
                }
                this.t = floatValue;
            }
            float intValue = this.l.h().intValue() / 100.0f;
            this.g.setAlpha(C4713Xj1.d((int) (i * intValue), 0, 255));
            if (c10874y70 != null) {
                c10874y70.c((int) (intValue * 255.0f), this.g);
            }
            canvas.drawPath(this.f, this.g);
            if (ZX0.h()) {
                ZX0.c("GradientFillContent#draw");
            }
        }
    }

    @Override // o.DL
    public String getName() {
        return this.a;
    }

    @Override // o.InterfaceC6474g70
    public void h(RectF rectF, Matrix matrix, boolean z) {
        this.f.reset();
        for (int i = 0; i < this.i.size(); i++) {
            this.f.addPath(this.i.get(i).Y(), matrix);
        }
        this.f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
