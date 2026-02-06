package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.j;
import androidx.core.widget.NestedScrollView;
import o.C7114il1;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: o.Xq2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4742Xq2 {
    public static final String G = "TouchResponse";
    public static final boolean H = false;
    public static final int I = 1000;
    public static final float J = 1.0E-7f;
    public static final float[][] K = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    public static final float[][] L = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
    public static final int M = 0;
    public static final int N = 1;
    public static final int O = 2;
    public static final int P = 3;
    public static final int Q = 4;
    public static final int R = 5;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = 4;
    public static final int X = 5;
    public static final int Y = 6;
    public static final int Z = 1;
    public static final int a0 = 2;
    public static final int b0 = 4;
    public static final int c0 = 0;
    public static final int d0 = 1;
    public float A;
    public float B;
    public float C;
    public float D;
    public int E;
    public int F;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public float i;
    public float j;
    public int k;
    public boolean l;
    public float m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f665o;
    public float[] p;
    public int[] q;
    public float r;
    public float s;
    public final C7114il1 t;
    public float u;
    public float v;
    public boolean w;
    public float x;
    public int y;
    public float z;

    /* renamed from: o.Xq2$a */
    /* loaded from: classes.dex */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    public C4742Xq2(Context context, C7114il1 c7114il1, XmlPullParser xmlPullParser) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = -1;
        this.l = false;
        this.m = 0.0f;
        this.n = 1.0f;
        this.f665o = false;
        this.p = new float[2];
        this.q = new int[2];
        this.u = 4.0f;
        this.v = 1.2f;
        this.w = true;
        this.x = 1.0f;
        this.y = 0;
        this.z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.t = c7114il1;
        c(context, Xml.asAttributeSet(xmlPullParser));
    }

    public void A(float f, float f2) {
        this.r = f;
        this.s = f2;
    }

    public void B(float f) {
        this.v = f;
    }

    public void C(float f) {
        this.u = f;
    }

    public void D(boolean z) {
        if (z) {
            float[][] fArr = L;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = K;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = L;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = K;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[] fArr5 = K[this.a];
        this.h = fArr5[0];
        this.g = fArr5[1];
        int i = this.b;
        float[][] fArr6 = L;
        if (i >= fArr6.length) {
            return;
        }
        float[] fArr7 = fArr6[i];
        this.m = fArr7[0];
        this.n = fArr7[1];
    }

    public void E(float f, float f2) {
        this.h = f;
        this.g = f2;
    }

    public void F(int i) {
        this.c = i;
    }

    public void G(float f, float f2) {
        this.r = f;
        this.s = f2;
        this.f665o = false;
    }

    public void H() {
        View view;
        int i = this.d;
        if (i != -1) {
            view = this.t.findViewById(i);
            if (view == null) {
                Log.e(G, "cannot find TouchAnchorId @id/" + AV.i(this.t.getContext(), this.d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new a());
            nestedScrollView.setOnScrollChangeListener(new b());
        }
    }

    public float a(float f, float f2) {
        return (f * this.m) + (f2 * this.n);
    }

    public final void b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == j.c.oe) {
                this.d = typedArray.getResourceId(index, this.d);
            } else if (index == j.c.pe) {
                int i2 = typedArray.getInt(index, this.a);
                this.a = i2;
                float[] fArr = K[i2];
                this.h = fArr[0];
                this.g = fArr[1];
            } else if (index == j.c.Zd) {
                int i3 = typedArray.getInt(index, this.b);
                this.b = i3;
                float[][] fArr2 = L;
                if (i3 < fArr2.length) {
                    float[] fArr3 = fArr2[i3];
                    this.m = fArr3[0];
                    this.n = fArr3[1];
                } else {
                    this.n = Float.NaN;
                    this.m = Float.NaN;
                    this.l = true;
                }
            } else if (index == j.c.ee) {
                this.u = typedArray.getFloat(index, this.u);
            } else if (index == j.c.de) {
                this.v = typedArray.getFloat(index, this.v);
            } else if (index == j.c.fe) {
                this.w = typedArray.getBoolean(index, this.w);
            } else if (index == j.c.ae) {
                this.x = typedArray.getFloat(index, this.x);
            } else if (index == j.c.be) {
                this.z = typedArray.getFloat(index, this.z);
            } else if (index == j.c.qe) {
                this.e = typedArray.getResourceId(index, this.e);
            } else if (index == j.c.he) {
                this.c = typedArray.getInt(index, this.c);
            } else if (index == j.c.ge) {
                this.y = typedArray.getInteger(index, 0);
            } else if (index == j.c.ce) {
                this.f = typedArray.getResourceId(index, 0);
            } else if (index == j.c.ie) {
                this.k = typedArray.getResourceId(index, this.k);
            } else if (index == j.c.ke) {
                this.A = typedArray.getFloat(index, this.A);
            } else if (index == j.c.le) {
                this.B = typedArray.getFloat(index, this.B);
            } else if (index == j.c.me) {
                this.C = typedArray.getFloat(index, this.C);
            } else if (index == j.c.ne) {
                this.D = typedArray.getFloat(index, this.D);
            } else if (index == j.c.je) {
                this.E = typedArray.getInt(index, this.E);
            } else if (index == j.c.Yd) {
                this.F = typedArray.getInt(index, this.F);
            }
        }
    }

    public final void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.c.Xd);
        b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.F;
    }

    public int f() {
        return this.y;
    }

    public RectF g(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public int h() {
        return this.f;
    }

    public float i() {
        return this.v;
    }

    public float j() {
        return this.u;
    }

    public boolean k() {
        return this.w;
    }

    public float l(float f, float f2) {
        this.t.E0(this.d, this.t.getProgress(), this.h, this.g, this.p);
        float f3 = this.m;
        if (f3 != 0.0f) {
            float[] fArr = this.p;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.p;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.n) / fArr2[1];
    }

    public int m() {
        return this.E;
    }

    public float n() {
        return this.A;
    }

    public float o() {
        return this.B;
    }

    public float p() {
        return this.C;
    }

    public float q() {
        return this.D;
    }

    public RectF r(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set(findViewById.getLeft(), findViewById.getTop(), findViewById.getRight(), findViewById.getBottom());
        return rectF;
    }

    public int s() {
        return this.e;
    }

    public boolean t() {
        return this.f665o;
    }

    public String toString() {
        if (Float.isNaN(this.m)) {
            return AbstractC6818hX0.i;
        }
        return this.m + " , " + this.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    public void u(MotionEvent motionEvent, C7114il1.h hVar, int i, C8590ol1 c8590ol1) {
        char c;
        float f;
        float f2;
        int i2;
        float f3;
        ?? r23;
        float f4;
        ?? r24;
        float f5;
        boolean z;
        float f6;
        if (this.l) {
            v(motionEvent, hVar, i, c8590ol1);
            return;
        }
        hVar.c(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float rawY = motionEvent.getRawY() - this.s;
                    float rawX = motionEvent.getRawX() - this.r;
                    if (Math.abs((this.m * rawX) + (this.n * rawY)) > this.z || this.f665o) {
                        float progress = this.t.getProgress();
                        if (!this.f665o) {
                            this.f665o = true;
                            this.t.setProgress(progress);
                        }
                        int i3 = this.d;
                        if (i3 != -1) {
                            r23 = 1;
                            r24 = 0;
                            f4 = progress;
                            this.t.E0(i3, f4, this.h, this.g, this.p);
                        } else {
                            r23 = 1;
                            f4 = progress;
                            r24 = 0;
                            float min = Math.min(this.t.getWidth(), this.t.getHeight());
                            float[] fArr = this.p;
                            fArr[1] = this.n * min;
                            fArr[0] = min * this.m;
                        }
                        float f7 = this.m;
                        float[] fArr2 = this.p;
                        if (Math.abs(((f7 * fArr2[r24]) + (this.n * fArr2[r23])) * this.x) < 0.01d) {
                            float[] fArr3 = this.p;
                            fArr3[r24] = 0.01f;
                            fArr3[r23] = 0.01f;
                        }
                        if (this.m != 0.0f) {
                            f5 = rawX / this.p[r24];
                        } else {
                            f5 = rawY / this.p[r23];
                        }
                        float max = Math.max(Math.min(f4 + f5, 1.0f), 0.0f);
                        if (this.c == 6) {
                            max = Math.max(max, 0.01f);
                        }
                        if (this.c == 7) {
                            max = Math.min(max, 0.99f);
                        }
                        float progress2 = this.t.getProgress();
                        if (max != progress2) {
                            int i4 = (progress2 > 0.0f ? 1 : (progress2 == 0.0f ? 0 : -1));
                            if (i4 == 0 || progress2 == 1.0f) {
                                C7114il1 c7114il1 = this.t;
                                if (i4 == 0) {
                                    z = r23;
                                } else {
                                    z = r24;
                                }
                                c7114il1.x0(z);
                            }
                            this.t.setProgress(max);
                            hVar.h(1000);
                            float e = hVar.e();
                            float d = hVar.d();
                            if (this.m != 0.0f) {
                                f6 = e / this.p[r24];
                            } else {
                                f6 = d / this.p[r23];
                            }
                            this.t.I1 = f6;
                        } else {
                            this.t.I1 = 0.0f;
                        }
                        this.r = motionEvent.getRawX();
                        this.s = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f665o = false;
            hVar.h(1000);
            float e2 = hVar.e();
            float d2 = hVar.d();
            float progress3 = this.t.getProgress();
            int i5 = this.d;
            if (i5 != -1) {
                this.t.E0(i5, progress3, this.h, this.g, this.p);
                c = 0;
            } else {
                float min2 = Math.min(this.t.getWidth(), this.t.getHeight());
                float[] fArr4 = this.p;
                fArr4[1] = this.n * min2;
                c = 0;
                fArr4[0] = min2 * this.m;
            }
            float f8 = this.m;
            float[] fArr5 = this.p;
            float f9 = fArr5[c];
            float f10 = fArr5[1];
            if (f8 != 0.0f) {
                f = e2 / f9;
            } else {
                f = d2 / f10;
            }
            if (!Float.isNaN(f)) {
                f2 = (f / 3.0f) + progress3;
            } else {
                f2 = progress3;
            }
            if (f2 != 0.0f && f2 != 1.0f && (i2 = this.c) != 3) {
                if (f2 < 0.5d) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                if (i2 == 6) {
                    if (progress3 + f < 0.0f) {
                        f = Math.abs(f);
                    }
                    f3 = 1.0f;
                }
                if (this.c == 7) {
                    if (progress3 + f > 1.0f) {
                        f = -Math.abs(f);
                    }
                    f3 = 0.0f;
                }
                this.t.f1(this.c, f3, f);
                if (0.0f >= progress3 || 1.0f <= progress3) {
                    this.t.setState(C7114il1.l.FINISHED);
                    return;
                }
                return;
            } else if (0.0f < f2 && 1.0f > f2) {
                return;
            } else {
                this.t.setState(C7114il1.l.FINISHED);
                return;
            }
        }
        this.r = motionEvent.getRawX();
        this.s = motionEvent.getRawY();
        this.f665o = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(MotionEvent motionEvent, C7114il1.h hVar, int i, C8590ol1 c8590ol1) {
        float left;
        float f;
        int top;
        int bottom;
        float rawY;
        int i2;
        float degrees;
        float f2;
        int i3;
        float f3;
        float[] fArr;
        View findViewById;
        double atan2;
        float f4;
        float[] fArr2;
        hVar.c(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            boolean z = true;
            if (action != 1) {
                if (action == 2) {
                    motionEvent.getRawY();
                    motionEvent.getRawX();
                    float width = this.t.getWidth() / 2.0f;
                    float height = this.t.getHeight() / 2.0f;
                    int i4 = this.k;
                    if (i4 != -1) {
                        View findViewById2 = this.t.findViewById(i4);
                        this.t.getLocationOnScreen(this.q);
                        height = ((findViewById2.getTop() + findViewById2.getBottom()) / 2.0f) + this.q[1];
                        width = this.q[0] + ((findViewById2.getLeft() + findViewById2.getRight()) / 2.0f);
                    } else {
                        int i5 = this.d;
                        if (i5 != -1) {
                            if (this.t.findViewById(this.t.I0(i5).k()) == null) {
                                Log.e(G, "could not find view to animate to");
                            } else {
                                this.t.getLocationOnScreen(this.q);
                                width = this.q[0] + ((findViewById.getLeft() + findViewById.getRight()) / 2.0f);
                                height = this.q[1] + ((findViewById.getTop() + findViewById.getBottom()) / 2.0f);
                            }
                        }
                    }
                    float rawX = motionEvent.getRawX() - width;
                    float rawY2 = motionEvent.getRawY() - height;
                    float atan22 = (float) (((Math.atan2(motionEvent.getRawY() - height, motionEvent.getRawX() - width) - Math.atan2(this.s - height, this.r - width)) * 180.0d) / 3.141592653589793d);
                    if (atan22 > 330.0f) {
                        atan22 -= 360.0f;
                    } else if (atan22 < -330.0f) {
                        atan22 += 360.0f;
                    }
                    if (Math.abs(atan22) > 0.01d || this.f665o) {
                        float progress = this.t.getProgress();
                        if (!this.f665o) {
                            this.f665o = true;
                            this.t.setProgress(progress);
                        }
                        int i6 = this.d;
                        if (i6 != -1) {
                            f4 = progress;
                            this.t.E0(i6, f4, this.h, this.g, this.p);
                            this.p[1] = (float) Math.toDegrees(fArr2[1]);
                        } else {
                            f4 = progress;
                            this.p[1] = 360.0f;
                        }
                        float max = Math.max(Math.min(f4 + ((atan22 * this.x) / this.p[1]), 1.0f), 0.0f);
                        float progress2 = this.t.getProgress();
                        if (max != progress2) {
                            int i7 = (progress2 > 0.0f ? 1 : (progress2 == 0.0f ? 0 : -1));
                            if (i7 == 0 || progress2 == 1.0f) {
                                C7114il1 c7114il1 = this.t;
                                if (i7 != 0) {
                                    z = false;
                                }
                                c7114il1.x0(z);
                            }
                            this.t.setProgress(max);
                            hVar.h(1000);
                            float e = hVar.e();
                            double d = hVar.d();
                            double d2 = e;
                            this.t.I1 = (float) Math.toDegrees((float) ((Math.hypot(d, d2) * Math.sin(Math.atan2(d, d2) - atan2)) / Math.hypot(rawX, rawY2)));
                        } else {
                            this.t.I1 = 0.0f;
                        }
                        this.r = motionEvent.getRawX();
                        this.s = motionEvent.getRawY();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f665o = false;
            hVar.h(16);
            float e2 = hVar.e();
            float d3 = hVar.d();
            float progress3 = this.t.getProgress();
            float width2 = this.t.getWidth() / 2.0f;
            float height2 = this.t.getHeight() / 2.0f;
            int i8 = this.k;
            if (i8 != -1) {
                View findViewById3 = this.t.findViewById(i8);
                this.t.getLocationOnScreen(this.q);
                left = this.q[0] + ((findViewById3.getLeft() + findViewById3.getRight()) / 2.0f);
                f = this.q[1];
                top = findViewById3.getTop();
                bottom = findViewById3.getBottom();
            } else {
                int i9 = this.d;
                if (i9 != -1) {
                    View findViewById4 = this.t.findViewById(this.t.I0(i9).k());
                    this.t.getLocationOnScreen(this.q);
                    left = this.q[0] + ((findViewById4.getLeft() + findViewById4.getRight()) / 2.0f);
                    f = this.q[1];
                    top = findViewById4.getTop();
                    bottom = findViewById4.getBottom();
                }
                float rawX2 = motionEvent.getRawX() - width2;
                double degrees2 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX2));
                i2 = this.d;
                if (i2 == -1) {
                    this.t.E0(i2, progress3, this.h, this.g, this.p);
                    this.p[1] = (float) Math.toDegrees(fArr[1]);
                } else {
                    this.p[1] = 360.0f;
                }
                degrees = ((float) (Math.toDegrees(Math.atan2(d3 + rawY, e2 + rawX2)) - degrees2)) * 62.5f;
                if (Float.isNaN(degrees)) {
                    f2 = (((degrees * 3.0f) * this.x) / this.p[1]) + progress3;
                } else {
                    f2 = progress3;
                }
                if (f2 == 0.0f && f2 != 1.0f && (i3 = this.c) != 3) {
                    float f5 = (degrees * this.x) / this.p[1];
                    if (f2 < 0.5d) {
                        f3 = 0.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    if (i3 == 6) {
                        if (progress3 + f5 < 0.0f) {
                            f5 = Math.abs(f5);
                        }
                        f3 = 1.0f;
                    }
                    if (this.c == 7) {
                        if (progress3 + f5 > 1.0f) {
                            f5 = -Math.abs(f5);
                        }
                        f3 = 0.0f;
                    }
                    this.t.f1(this.c, f3, f5 * 3.0f);
                    if (0.0f >= progress3 || 1.0f <= progress3) {
                        this.t.setState(C7114il1.l.FINISHED);
                        return;
                    }
                    return;
                } else if (0.0f >= f2 && 1.0f > f2) {
                    return;
                } else {
                    this.t.setState(C7114il1.l.FINISHED);
                    return;
                }
            }
            float f6 = left;
            height2 = ((top + bottom) / 2.0f) + f;
            width2 = f6;
            float rawX22 = motionEvent.getRawX() - width2;
            double degrees22 = Math.toDegrees(Math.atan2(motionEvent.getRawY() - height2, rawX22));
            i2 = this.d;
            if (i2 == -1) {
            }
            degrees = ((float) (Math.toDegrees(Math.atan2(d3 + rawY, e2 + rawX22)) - degrees22)) * 62.5f;
            if (Float.isNaN(degrees)) {
            }
            if (f2 == 0.0f) {
            }
            if (0.0f >= f2) {
            }
            this.t.setState(C7114il1.l.FINISHED);
            return;
        }
        this.r = motionEvent.getRawX();
        this.s = motionEvent.getRawY();
        this.f665o = false;
    }

    public void w(float f, float f2) {
        float f3;
        float progress = this.t.getProgress();
        if (!this.f665o) {
            this.f665o = true;
            this.t.setProgress(progress);
        }
        this.t.E0(this.d, progress, this.h, this.g, this.p);
        float f4 = this.m;
        float[] fArr = this.p;
        if (Math.abs((f4 * fArr[0]) + (this.n * fArr[1])) < 0.01d) {
            float[] fArr2 = this.p;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.m;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.p[0];
        } else {
            f3 = (f2 * this.n) / this.p[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), 0.0f);
        if (max != this.t.getProgress()) {
            this.t.setProgress(max);
        }
    }

    public void x(float f, float f2) {
        float f3;
        int i;
        this.f665o = false;
        float progress = this.t.getProgress();
        this.t.E0(this.d, progress, this.h, this.g, this.p);
        float f4 = this.m;
        float[] fArr = this.p;
        float f5 = fArr[0];
        float f6 = this.n;
        float f7 = fArr[1];
        float f8 = 0.0f;
        if (f4 != 0.0f) {
            f3 = (f * f4) / f5;
        } else {
            f3 = (f2 * f6) / f7;
        }
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != 0.0f && progress != 1.0f && (i = this.c) != 3) {
            C7114il1 c7114il1 = this.t;
            if (progress >= 0.5d) {
                f8 = 1.0f;
            }
            c7114il1.f1(i, f8, f3);
        }
    }

    public void y(int i) {
        this.d = i;
    }

    public void z(int i) {
        this.F = i;
    }

    public C4742Xq2(C7114il1 c7114il1, C7639kv1 c7639kv1) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = 0.5f;
        this.h = 0.5f;
        this.i = 0.5f;
        this.j = 0.5f;
        this.k = -1;
        this.l = false;
        this.m = 0.0f;
        this.n = 1.0f;
        this.f665o = false;
        this.p = new float[2];
        this.q = new int[2];
        this.u = 4.0f;
        this.v = 1.2f;
        this.w = true;
        this.x = 1.0f;
        this.y = 0;
        this.z = 10.0f;
        this.A = 10.0f;
        this.B = 1.0f;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = 0;
        this.F = 0;
        this.t = c7114il1;
        this.d = c7639kv1.q();
        int r = c7639kv1.r();
        this.a = r;
        if (r != -1) {
            float[] fArr = K[r];
            this.h = fArr[0];
            this.g = fArr[1];
        }
        int b2 = c7639kv1.b();
        this.b = b2;
        float[][] fArr2 = L;
        if (b2 < fArr2.length) {
            float[] fArr3 = fArr2[b2];
            this.m = fArr3[0];
            this.n = fArr3[1];
        } else {
            this.n = Float.NaN;
            this.m = Float.NaN;
            this.l = true;
        }
        this.u = c7639kv1.g();
        this.v = c7639kv1.f();
        this.w = c7639kv1.h();
        this.x = c7639kv1.c();
        this.z = c7639kv1.d();
        this.e = c7639kv1.s();
        this.c = c7639kv1.j();
        this.y = c7639kv1.i();
        this.f = c7639kv1.e();
        this.k = c7639kv1.k();
        this.E = c7639kv1.l();
        this.A = c7639kv1.m();
        this.B = c7639kv1.n();
        this.C = c7639kv1.o();
        this.D = c7639kv1.p();
        this.F = c7639kv1.a();
    }

    /* renamed from: o.Xq2$b */
    /* loaded from: classes.dex */
    public class b implements NestedScrollView.e {
        public b() {
        }

        @Override // androidx.core.widget.NestedScrollView.e
        public void a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }
}
