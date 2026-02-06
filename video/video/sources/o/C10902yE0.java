package o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: o.yE0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10902yE0 extends AbstractC3647Ml {
    public static final int B = 32;
    public CE2 A;
    public final String q;
    public final boolean r;
    public final C5484c51<LinearGradient> s;
    public final C5484c51<RadialGradient> t;
    public final RectF u;
    public final AE0 v;
    public final int w;
    public final AbstractC7840ll<C8706pE0, C8706pE0> x;
    public final AbstractC7840ll<PointF, PointF> y;
    public final AbstractC7840ll<PointF, PointF> z;

    public C10902yE0(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, C10659xE0 c10659xE0) {
        super(c8431o61, abstractC8588ol, c10659xE0.b().g(), c10659xE0.g().g(), c10659xE0.i(), c10659xE0.k(), c10659xE0.m(), c10659xE0.h(), c10659xE0.c());
        this.s = new C5484c51<>();
        this.t = new C5484c51<>();
        this.u = new RectF();
        this.q = c10659xE0.j();
        this.v = c10659xE0.f();
        this.r = c10659xE0.n();
        this.w = (int) (c8431o61.V().d() / 32.0f);
        AbstractC7840ll<C8706pE0, C8706pE0> a = c10659xE0.e().a();
        this.x = a;
        a.a(this);
        abstractC8588ol.j(a);
        AbstractC7840ll<PointF, PointF> a2 = c10659xE0.l().a();
        this.y = a2;
        a2.a(this);
        abstractC8588ol.j(a2);
        AbstractC7840ll<PointF, PointF> a3 = c10659xE0.d().a();
        this.z = a3;
        a3.a(this);
        abstractC8588ol.j(a3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC3647Ml, o.BX0
    public <T> void d(T t, O61<T> o61) {
        super.d(t, o61);
        if (t == D61.O) {
            CE2 ce2 = this.A;
            if (ce2 != null) {
                this.f.H(ce2);
            }
            if (o61 == null) {
                this.A = null;
                return;
            }
            CE2 ce22 = new CE2(o61);
            this.A = ce22;
            ce22.a(this);
            this.f.j(this.A);
        }
    }

    @Override // o.AbstractC3647Ml, o.InterfaceC6474g70
    public void e(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        Shader n;
        if (this.r) {
            return;
        }
        h(this.u, matrix, false);
        if (this.v == AE0.LINEAR) {
            n = m();
        } else {
            n = n();
        }
        this.i.setShader(n);
        super.e(canvas, matrix, i, c10874y70);
    }

    @Override // o.DL
    public String getName() {
        return this.q;
    }

    public final int[] k(int[] iArr) {
        CE2 ce2 = this.A;
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

    public final int l() {
        int i;
        int round = Math.round(this.y.f() * this.w);
        int round2 = Math.round(this.z.f() * this.w);
        int round3 = Math.round(this.x.f() * this.w);
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

    public final LinearGradient m() {
        long l = l();
        LinearGradient h = this.s.h(l);
        if (h != null) {
            return h;
        }
        PointF h2 = this.y.h();
        PointF h3 = this.z.h();
        C8706pE0 h4 = this.x.h();
        LinearGradient linearGradient = new LinearGradient(h2.x, h2.y, h3.x, h3.y, k(h4.d()), h4.e(), Shader.TileMode.CLAMP);
        this.s.n(l, linearGradient);
        return linearGradient;
    }

    public final RadialGradient n() {
        float f;
        float f2;
        long l = l();
        RadialGradient h = this.t.h(l);
        if (h != null) {
            return h;
        }
        PointF h2 = this.y.h();
        PointF h3 = this.z.h();
        C8706pE0 h4 = this.x.h();
        int[] k = k(h4.d());
        float[] e = h4.e();
        RadialGradient radialGradient = new RadialGradient(h2.x, h2.y, (float) Math.hypot(h3.x - f, h3.y - f2), k, e, Shader.TileMode.CLAMP);
        this.t.n(l, radialGradient);
        return radialGradient;
    }
}
