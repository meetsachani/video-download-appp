package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.j;
import java.util.HashMap;

/* loaded from: classes.dex */
public class EX0 extends FX0 {
    public static final String R = "KeyPosition";
    public static final String S = "KeyPosition";
    public static final int T = 3;
    public static final int U = 2;
    public static final int V = 1;
    public static final int W = 0;
    public static final String X = "transitionEasing";
    public static final String Y = "drawPath";
    public static final String Z = "percentWidth";
    public static final String a0 = "percentHeight";
    public static final String b0 = "sizePercent";
    public static final String c0 = "percentX";
    public static final String d0 = "percentY";
    public static final int e0 = 2;
    public String F = null;
    public int G = AbstractC6818hX0.f;
    public int H = 0;
    public float I = Float.NaN;
    public float J = Float.NaN;
    public float K = Float.NaN;
    public float L = Float.NaN;
    public float M = Float.NaN;
    public float N = Float.NaN;
    public int O = 0;
    public float P = Float.NaN;
    public float Q = Float.NaN;

    /* loaded from: classes.dex */
    public static class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        public static final int h = 8;
        public static final int i = 9;
        public static final int j = 10;
        public static final int k = 11;
        public static final int l = 12;
        public static SparseIntArray m;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            m = sparseIntArray;
            sparseIntArray.append(j.c.la, 1);
            m.append(j.c.ja, 2);
            m.append(j.c.sa, 3);
            m.append(j.c.ha, 4);
            m.append(j.c.ia, 5);
            m.append(j.c.pa, 6);
            m.append(j.c.qa, 7);
            m.append(j.c.ka, 9);
            m.append(j.c.ra, 8);
            m.append(j.c.oa, 11);
            m.append(j.c.na, 12);
            m.append(j.c.ma, 10);
        }

        public static void b(EX0 ex0, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                switch (m.get(index)) {
                    case 1:
                        if (C7114il1.q3) {
                            int resourceId = typedArray.getResourceId(index, ex0.b);
                            ex0.b = resourceId;
                            if (resourceId == -1) {
                                ex0.c = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            ex0.c = typedArray.getString(index);
                            break;
                        } else {
                            ex0.b = typedArray.getResourceId(index, ex0.b);
                            break;
                        }
                    case 2:
                        ex0.a = typedArray.getInt(index, ex0.a);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            ex0.F = typedArray.getString(index);
                            break;
                        } else {
                            ex0.F = C6725h90.f755o[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        ex0.D = typedArray.getInteger(index, ex0.D);
                        break;
                    case 5:
                        ex0.H = typedArray.getInt(index, ex0.H);
                        break;
                    case 6:
                        ex0.K = typedArray.getFloat(index, ex0.K);
                        break;
                    case 7:
                        ex0.L = typedArray.getFloat(index, ex0.L);
                        break;
                    case 8:
                        float f2 = typedArray.getFloat(index, ex0.J);
                        ex0.I = f2;
                        ex0.J = f2;
                        break;
                    case 9:
                        ex0.O = typedArray.getInt(index, ex0.O);
                        break;
                    case 10:
                        ex0.G = typedArray.getInt(index, ex0.G);
                        break;
                    case 11:
                        ex0.I = typedArray.getFloat(index, ex0.I);
                        break;
                    case 12:
                        ex0.J = typedArray.getFloat(index, ex0.J);
                        break;
                    default:
                        Log.e("KeyPosition", "unused attribute 0x" + Integer.toHexString(index) + "   " + m.get(index));
                        break;
                }
            }
            if (ex0.a == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    public EX0() {
        this.d = 2;
    }

    public void A(int i) {
        this.O = i;
    }

    @Override // o.AbstractC6818hX0
    /* renamed from: b */
    public AbstractC6818hX0 clone() {
        return new EX0().c(this);
    }

    @Override // o.AbstractC6818hX0
    public AbstractC6818hX0 c(AbstractC6818hX0 abstractC6818hX0) {
        super.c(abstractC6818hX0);
        EX0 ex0 = (EX0) abstractC6818hX0;
        this.F = ex0.F;
        this.G = ex0.G;
        this.H = ex0.H;
        this.I = ex0.I;
        this.J = Float.NaN;
        this.K = ex0.K;
        this.L = ex0.L;
        this.M = ex0.M;
        this.N = ex0.N;
        this.P = ex0.P;
        this.Q = ex0.Q;
        return this;
    }

    @Override // o.AbstractC6818hX0
    public void f(Context context, AttributeSet attributeSet) {
        a.b(this, context.obtainStyledAttributes(attributeSet, j.c.ga));
    }

    @Override // o.AbstractC6818hX0
    public void j(String str, Object obj) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1812823328:
                if (str.equals("transitionEasing")) {
                    c = 0;
                    break;
                }
                break;
            case -1127236479:
                if (str.equals("percentWidth")) {
                    c = 1;
                    break;
                }
                break;
            case -1017587252:
                if (str.equals("percentHeight")) {
                    c = 2;
                    break;
                }
                break;
            case -827014263:
                if (str.equals("drawPath")) {
                    c = 3;
                    break;
                }
                break;
            case -200259324:
                if (str.equals("sizePercent")) {
                    c = 4;
                    break;
                }
                break;
            case 428090547:
                if (str.equals("percentX")) {
                    c = 5;
                    break;
                }
                break;
            case 428090548:
                if (str.equals("percentY")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.F = obj.toString();
                return;
            case 1:
                this.I = m(obj);
                return;
            case 2:
                this.J = m(obj);
                return;
            case 3:
                this.H = n(obj);
                return;
            case 4:
                float m = m(obj);
                this.I = m;
                this.J = m;
                return;
            case 5:
                this.K = m(obj);
                return;
            case 6:
                this.L = m(obj);
                return;
            default:
                return;
        }
    }

    @Override // o.FX0
    public void o(int i, int i2, float f, float f2, float f3, float f4) {
        int i3 = this.O;
        if (i3 != 1) {
            if (i3 != 2) {
                t(f, f2, f3, f4);
                return;
            } else {
                v(i, i2);
                return;
            }
        }
        u(f, f2, f3, f4);
    }

    @Override // o.FX0
    public float p() {
        return this.P;
    }

    @Override // o.FX0
    public float q() {
        return this.Q;
    }

    @Override // o.FX0
    public boolean r(int i, int i2, RectF rectF, RectF rectF2, float f, float f2) {
        o(i, i2, rectF.centerX(), rectF.centerY(), rectF2.centerX(), rectF2.centerY());
        if (Math.abs(f - this.P) < 20.0f && Math.abs(f2 - this.Q) < 20.0f) {
            return true;
        }
        return false;
    }

    @Override // o.FX0
    public void s(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        int i = this.O;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    x(rectF, rectF2, f, f2, strArr, fArr);
                    return;
                } else {
                    w(rectF, rectF2, f, f2, strArr, fArr);
                    return;
                }
            }
            z(view, rectF, rectF2, f, f2, strArr, fArr);
            return;
        }
        y(rectF, rectF2, f, f2, strArr, fArr);
    }

    public final void t(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = 0.0f;
        if (Float.isNaN(this.K)) {
            f5 = 0.0f;
        } else {
            f5 = this.K;
        }
        if (Float.isNaN(this.N)) {
            f6 = 0.0f;
        } else {
            f6 = this.N;
        }
        if (Float.isNaN(this.L)) {
            f7 = 0.0f;
        } else {
            f7 = this.L;
        }
        if (!Float.isNaN(this.M)) {
            f10 = this.M;
        }
        this.P = (int) (f + (f5 * f8) + (f10 * f9));
        this.Q = (int) (f2 + (f8 * f6) + (f9 * f7));
    }

    public final void u(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = this.K;
        float f8 = this.L;
        this.P = f + (f5 * f7) + ((-f6) * f8);
        this.Q = f2 + (f6 * f7) + (f5 * f8);
    }

    public final void v(int i, int i2) {
        float f = this.K;
        float f2 = 0;
        this.P = (i * f) + f2;
        this.Q = (i2 * f) + f2;
    }

    public void w(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX();
        float centerY2 = rectF2.centerY();
        if (centerX > centerX2) {
            centerX2 = centerX;
            centerX = centerX2;
        }
        if (centerY <= centerY2) {
            centerY2 = centerY;
            centerY = centerY2;
        }
        float f3 = centerX2 - centerX;
        float f4 = centerY - centerY2;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = (f - centerX) / f3;
                fArr[1] = (f2 - centerY2) / f4;
                return;
            }
            fArr[1] = (f - centerX) / f3;
            fArr[0] = (f2 - centerY2) / f4;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = (f - centerX) / f3;
        strArr[1] = "percentY";
        fArr[1] = (f2 - centerY2) / f4;
    }

    public void x(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = (f - centerX) / centerX2;
                fArr[1] = (f2 - centerY) / centerY2;
                return;
            }
            fArr[1] = (f - centerX) / centerX2;
            fArr[0] = (f2 - centerY) / centerY2;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = (f - centerX) / centerX2;
        strArr[1] = "percentY";
        fArr[1] = (f2 - centerY) / centerY2;
    }

    public void y(RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float centerX2 = rectF2.centerX() - centerX;
        float centerY2 = rectF2.centerY() - centerY;
        float hypot = (float) Math.hypot(centerX2, centerY2);
        if (hypot < 1.0E-4d) {
            System.out.println("distance ~ 0");
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            return;
        }
        float f3 = centerX2 / hypot;
        float f4 = centerY2 / hypot;
        float f5 = f2 - centerY;
        float f6 = f - centerX;
        float f7 = ((f3 * f5) - (f6 * f4)) / hypot;
        float f8 = ((f3 * f6) + (f4 * f5)) / hypot;
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f8;
                fArr[1] = f7;
                return;
            }
            return;
        }
        strArr[0] = "percentX";
        strArr[1] = "percentY";
        fArr[0] = f8;
        fArr[1] = f7;
    }

    public void z(View view, RectF rectF, RectF rectF2, float f, float f2, String[] strArr, float[] fArr) {
        rectF.centerX();
        rectF.centerY();
        rectF2.centerX();
        rectF2.centerY();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int width = viewGroup.getWidth();
        int height = viewGroup.getHeight();
        String str = strArr[0];
        if (str != null) {
            if ("percentX".equals(str)) {
                fArr[0] = f / width;
                fArr[1] = f2 / height;
                return;
            }
            fArr[1] = f / width;
            fArr[0] = f2 / height;
            return;
        }
        strArr[0] = "percentX";
        fArr[0] = f / width;
        strArr[1] = "percentY";
        fArr[1] = f2 / height;
    }

    @Override // o.AbstractC6818hX0
    public void a(HashMap<String, AbstractC6265fI2> hashMap) {
    }
}
