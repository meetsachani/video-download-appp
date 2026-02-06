package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import o.C6665gu1;

/* renamed from: o.bN0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5313bN0 extends AbstractC8588ol {
    public final Paint I;
    public final Rect J;
    public final Rect K;
    public final RectF L;
    public final C9653t61 M;
    public AbstractC7840ll<ColorFilter, ColorFilter> N;
    public AbstractC7840ll<Bitmap, Bitmap> O;
    public B70 P;
    public C6665gu1 Q;
    public C6665gu1.b R;

    public C5313bN0(C8431o61 c8431o61, C9760tY0 c9760tY0) {
        super(c8431o61, c9760tY0);
        this.I = new C5353bY0(3);
        this.J = new Rect();
        this.K = new Rect();
        this.L = new RectF();
        this.M = c8431o61.c0(c9760tY0.n());
        if (z() != null) {
            this.P = new B70(this, this, z());
        }
    }

    public final Bitmap P() {
        Bitmap h;
        AbstractC7840ll<Bitmap, Bitmap> abstractC7840ll = this.O;
        if (abstractC7840ll != null && (h = abstractC7840ll.h()) != null) {
            return h;
        }
        Bitmap S = this.p.S(this.q.n());
        if (S != null) {
            return S;
        }
        C9653t61 c9653t61 = this.M;
        if (c9653t61 != null) {
            return c9653t61.b();
        }
        return null;
    }

    @Override // o.AbstractC8588ol, o.BX0
    public <T> void d(T t, O61<T> o61) {
        B70 b70;
        B70 b702;
        B70 b703;
        B70 b704;
        B70 b705;
        super.d(t, o61);
        if (t == D61.N) {
            if (o61 == null) {
                this.N = null;
            } else {
                this.N = new CE2(o61);
            }
        } else if (t == D61.Q) {
            if (o61 == null) {
                this.O = null;
            } else {
                this.O = new CE2(o61);
            }
        } else if (t == D61.e && (b705 = this.P) != null) {
            b705.c(o61);
        } else if (t == D61.J && (b704 = this.P) != null) {
            b704.f(o61);
        } else if (t == D61.K && (b703 = this.P) != null) {
            b703.d(o61);
        } else if (t == D61.L && (b702 = this.P) != null) {
            b702.e(o61);
        } else if (t == D61.M && (b70 = this.P) != null) {
            b70.g(o61);
        }
    }

    @Override // o.AbstractC8588ol, o.InterfaceC6474g70
    public void h(RectF rectF, Matrix matrix, boolean z) {
        super.h(rectF, matrix, z);
        if (this.M != null) {
            float e = C6006eE2.e();
            if (this.p.d0()) {
                rectF.set(0.0f, 0.0f, this.M.g() * e, this.M.e() * e);
            } else {
                Bitmap P = P();
                if (P != null) {
                    rectF.set(0.0f, 0.0f, P.getWidth() * e, P.getHeight() * e);
                } else {
                    rectF.set(0.0f, 0.0f, this.M.g() * e, this.M.e() * e);
                }
            }
            this.f829o.mapRect(rectF);
        }
    }

    @Override // o.AbstractC8588ol
    public void u(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        Bitmap P = P();
        if (P != null && !P.isRecycled() && this.M != null) {
            float e = C6006eE2.e();
            this.I.setAlpha(i);
            AbstractC7840ll<ColorFilter, ColorFilter> abstractC7840ll = this.N;
            if (abstractC7840ll != null) {
                this.I.setColorFilter(abstractC7840ll.h());
            }
            B70 b70 = this.P;
            if (b70 != null) {
                c10874y70 = b70.b(matrix, i);
            }
            boolean z = false;
            this.J.set(0, 0, P.getWidth(), P.getHeight());
            if (this.p.d0()) {
                this.K.set(0, 0, (int) (this.M.g() * e), (int) (this.M.e() * e));
            } else {
                this.K.set(0, 0, (int) (P.getWidth() * e), (int) (P.getHeight() * e));
            }
            if (c10874y70 != null) {
                z = true;
            }
            if (z) {
                if (this.Q == null) {
                    this.Q = new C6665gu1();
                }
                if (this.R == null) {
                    this.R = new C6665gu1.b();
                }
                this.R.f();
                c10874y70.d(i, this.R);
                RectF rectF = this.L;
                Rect rect = this.K;
                rectF.set(rect.left, rect.top, rect.right, rect.bottom);
                matrix.mapRect(this.L);
                canvas = this.Q.j(canvas, this.L, this.R);
            }
            canvas.save();
            canvas.concat(matrix);
            canvas.drawBitmap(P, this.J, this.K, this.I);
            if (z) {
                this.Q.e();
                if (this.Q.f()) {
                    return;
                }
            }
            canvas.restore();
        }
    }
}
