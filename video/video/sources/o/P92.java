package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class P92 extends AbstractC8588ol {
    public final RectF I;
    public final Paint J;
    public final float[] K;
    public final Path L;
    public final C9760tY0 M;
    public AbstractC7840ll<ColorFilter, ColorFilter> N;
    public AbstractC7840ll<Integer, Integer> O;

    public P92(C8431o61 c8431o61, C9760tY0 c9760tY0) {
        super(c8431o61, c9760tY0);
        this.I = new RectF();
        C5353bY0 c5353bY0 = new C5353bY0();
        this.J = c5353bY0;
        this.K = new float[8];
        this.L = new Path();
        this.M = c9760tY0;
        c5353bY0.setAlpha(0);
        c5353bY0.setStyle(Paint.Style.FILL);
        c5353bY0.setColor(c9760tY0.p());
    }

    @Override // o.AbstractC8588ol, o.BX0
    public <T> void d(T t, O61<T> o61) {
        super.d(t, o61);
        if (t == D61.N) {
            if (o61 == null) {
                this.N = null;
            } else {
                this.N = new CE2(o61);
            }
        } else if (t == D61.a) {
            if (o61 == null) {
                this.O = null;
                this.J.setColor(this.M.p());
                return;
            }
            this.O = new CE2(o61);
        }
    }

    @Override // o.AbstractC8588ol, o.InterfaceC6474g70
    public void h(RectF rectF, Matrix matrix, boolean z) {
        super.h(rectF, matrix, z);
        this.I.set(0.0f, 0.0f, this.M.r(), this.M.q());
        this.f829o.mapRect(this.I);
        rectF.set(this.I);
    }

    @Override // o.AbstractC8588ol
    public void u(Canvas canvas, Matrix matrix, int i, C10874y70 c10874y70) {
        Integer h;
        int intValue;
        int alpha = Color.alpha(this.M.p());
        if (alpha != 0) {
            AbstractC7840ll<Integer, Integer> abstractC7840ll = this.O;
            if (abstractC7840ll == null) {
                h = null;
            } else {
                h = abstractC7840ll.h();
            }
            if (h != null) {
                this.J.setColor(h.intValue());
            } else {
                this.J.setColor(this.M.p());
            }
            if (this.x.k() == null) {
                intValue = 100;
            } else {
                intValue = this.x.k().h().intValue();
            }
            int i2 = (int) ((i / 255.0f) * (((alpha / 255.0f) * intValue) / 100.0f) * 255.0f);
            this.J.setAlpha(i2);
            if (c10874y70 != null) {
                c10874y70.a(this.J);
            } else {
                this.J.clearShadowLayer();
            }
            AbstractC7840ll<ColorFilter, ColorFilter> abstractC7840ll2 = this.N;
            if (abstractC7840ll2 != null) {
                this.J.setColorFilter(abstractC7840ll2.h());
            }
            if (i2 > 0) {
                float[] fArr = this.K;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = this.M.r();
                float[] fArr2 = this.K;
                fArr2[3] = 0.0f;
                fArr2[4] = this.M.r();
                this.K[5] = this.M.q();
                float[] fArr3 = this.K;
                fArr3[6] = 0.0f;
                fArr3[7] = this.M.q();
                matrix.mapPoints(this.K);
                this.L.reset();
                Path path = this.L;
                float[] fArr4 = this.K;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.L;
                float[] fArr5 = this.K;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.L;
                float[] fArr6 = this.K;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.L;
                float[] fArr7 = this.K;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.L;
                float[] fArr8 = this.K;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.L.close();
                canvas.drawPath(this.L, this.J);
            }
        }
    }
}
