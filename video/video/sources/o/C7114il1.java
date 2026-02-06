package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.f;
import androidx.constraintlayout.widget.j;
import com.google.firebase.crashlytics.internal.persistence.CrashlyticsReportPersistence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import o.C8590ol1;
import o.MK;
import o.TD0;
import o.UK;

/* renamed from: o.il1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7114il1 extends ConstraintLayout implements InterfaceC10070up1 {
    public static final int g3 = 0;
    public static final int h3 = 1;
    public static final int i3 = 2;
    public static final int j3 = 3;
    public static final int k3 = 4;
    public static final int l3 = 5;
    public static final int m3 = 6;
    public static final int n3 = 7;
    public static final String o3 = "MotionLayout";
    public static final boolean p3 = false;
    public static boolean q3 = false;
    public static final int r3 = 0;
    public static final int s3 = 1;
    public static final int t3 = 2;
    public static final int u3 = 50;
    public static final int v3 = 0;
    public static final int w3 = 1;
    public static final int x3 = 2;
    public static final int y3 = 3;
    public static final float z3 = 1.0E-5f;
    public int A2;
    public float B2;
    public boolean C2;
    public boolean D2;
    public int E2;
    public C8590ol1 F1;
    public int F2;
    public Interpolator G1;
    public int G2;
    public Interpolator H1;
    public int H2;
    public float I1;
    public int I2;
    public int J1;
    public int J2;
    public int K1;
    public float K2;
    public int L1;
    public C8049mX0 L2;
    public int M1;
    public boolean M2;
    public int N1;
    public j N2;
    public boolean O1;
    public Runnable O2;
    public HashMap<View, C4523Vk1> P1;
    public int[] P2;
    public long Q1;
    public int Q2;
    public float R1;
    public boolean R2;
    public float S1;
    public int S2;
    public float T1;
    public HashMap<View, C6520gI2> T2;
    public long U1;
    public int U2;
    public float V1;
    public int V2;
    public boolean W1;
    public int W2;
    public boolean X1;
    public Rect X2;
    public boolean Y1;
    public boolean Y2;
    public k Z1;
    public l Z2;
    public float a2;
    public g a3;
    public float b2;
    public boolean b3;
    public int c2;
    public RectF c3;
    public f d2;
    public View d3;
    public boolean e2;
    public Matrix e3;
    public C5130ad2 f2;
    public ArrayList<Integer> f3;
    public e g2;
    public A20 h2;
    public boolean i2;
    public int j2;
    public int k2;
    public int l2;
    public int m2;
    public boolean n2;
    public float o2;
    public float p2;
    public long q2;
    public float r2;
    public boolean s2;
    public ArrayList<C4814Yk1> t2;
    public ArrayList<C4814Yk1> u2;
    public ArrayList<C4814Yk1> v2;
    public CopyOnWriteArrayList<k> w2;
    public int x2;
    public long y2;
    public float z2;

    /* renamed from: o.il1$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7114il1.this.N2.a();
        }
    }

    /* renamed from: o.il1$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7114il1.this.R2 = false;
        }
    }

    /* renamed from: o.il1$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ View X;

        public c(View view) {
            this.X = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.setNestedScrollingEnabled(true);
        }
    }

    /* renamed from: o.il1$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7114il1.this.N2.a();
        }
    }

    /* renamed from: o.il1$e */
    /* loaded from: classes.dex */
    public class e extends Abstractanimation.InterpolatorC5161al1 {
        public float a = 0.0f;
        public float b = 0.0f;
        public float c;

        public e() {
        }

        @Override // o.Abstractanimation.InterpolatorC5161al1
        public float a() {
            return C7114il1.this.I1;
        }

        public void b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        @Override // o.Abstractanimation.InterpolatorC5161al1, android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            float f3;
            float f4 = this.a;
            if (f4 > 0.0f) {
                float f5 = this.c;
                if (f4 / f5 < f) {
                    f = f4 / f5;
                }
                C7114il1.this.I1 = f4 - (f5 * f);
                f2 = (f4 * f) - (((f5 * f) * f) / 2.0f);
                f3 = this.b;
            } else {
                float f6 = this.c;
                if ((-f4) / f6 < f) {
                    f = (-f4) / f6;
                }
                C7114il1.this.I1 = (f6 * f) + f4;
                f2 = (f4 * f) + (((f6 * f) * f) / 2.0f);
                f3 = this.b;
            }
            return f2 + f3;
        }
    }

    /* renamed from: o.il1$f */
    /* loaded from: classes.dex */
    public class f {
        public static final int v = 16;
        public float[] a;
        public int[] b;
        public float[] c;
        public Path d;
        public Paint e;
        public Paint f;
        public Paint g;
        public Paint h;
        public Paint i;
        public float[] j;
        public DashPathEffect p;
        public int q;
        public int t;
        public final int k = -21965;
        public final int l = -2067046;
        public final int m = -13391360;
        public final int n = 1996488704;

        /* renamed from: o  reason: collision with root package name */
        public final int f770o = 10;
        public Rect r = new Rect();
        public boolean s = false;

        public f() {
            this.t = 1;
            Paint paint = new Paint();
            this.e = paint;
            paint.setAntiAlias(true);
            this.e.setColor(-21965);
            this.e.setStrokeWidth(2.0f);
            Paint paint2 = this.e;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            this.f = paint3;
            paint3.setAntiAlias(true);
            this.f.setColor(-2067046);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(style);
            Paint paint4 = new Paint();
            this.g = paint4;
            paint4.setAntiAlias(true);
            this.g.setColor(-13391360);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(style);
            Paint paint5 = new Paint();
            this.h = paint5;
            paint5.setAntiAlias(true);
            this.h.setColor(-13391360);
            this.h.setTextSize(C7114il1.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            Paint paint6 = new Paint();
            this.i = paint6;
            paint6.setAntiAlias(true);
            DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
            this.p = dashPathEffect;
            this.g.setPathEffect(dashPathEffect);
            this.c = new float[100];
            this.b = new int[50];
            if (this.s) {
                this.e.setStrokeWidth(8.0f);
                this.i.setStrokeWidth(8.0f);
                this.f.setStrokeWidth(8.0f);
                this.t = 4;
            }
        }

        public void a(Canvas canvas, HashMap<View, C4523Vk1> hashMap, int i, int i2) {
            if (hashMap != null && hashMap.size() != 0) {
                canvas.save();
                if (!C7114il1.this.isInEditMode() && (i2 & 1) == 2) {
                    String str = C7114il1.this.getContext().getResources().getResourceName(C7114il1.this.L1) + ":" + C7114il1.this.getProgress();
                    canvas.drawText(str, 10.0f, C7114il1.this.getHeight() - 30, this.h);
                    canvas.drawText(str, 11.0f, C7114il1.this.getHeight() - 29, this.e);
                }
                for (C4523Vk1 c4523Vk1 : hashMap.values()) {
                    int q = c4523Vk1.q();
                    if (i2 > 0 && q == 0) {
                        q = 1;
                    }
                    if (q != 0) {
                        this.q = c4523Vk1.e(this.c, this.b);
                        if (q >= 1) {
                            int i3 = i / 16;
                            float[] fArr = this.a;
                            if (fArr == null || fArr.length != i3 * 2) {
                                this.a = new float[i3 * 2];
                                this.d = new Path();
                            }
                            int i4 = this.t;
                            canvas.translate(i4, i4);
                            this.e.setColor(1996488704);
                            this.i.setColor(1996488704);
                            this.f.setColor(1996488704);
                            this.g.setColor(1996488704);
                            c4523Vk1.f(this.a, i3);
                            b(canvas, q, this.q, c4523Vk1);
                            this.e.setColor(-21965);
                            this.f.setColor(-2067046);
                            this.i.setColor(-2067046);
                            this.g.setColor(-13391360);
                            int i5 = this.t;
                            canvas.translate(-i5, -i5);
                            b(canvas, q, this.q, c4523Vk1);
                            if (q == 5) {
                                j(canvas, c4523Vk1);
                            }
                        }
                    }
                }
                canvas.restore();
            }
        }

        public void b(Canvas canvas, int i, int i2, C4523Vk1 c4523Vk1) {
            if (i == 4) {
                d(canvas);
            }
            if (i == 2) {
                g(canvas);
            }
            if (i == 3) {
                e(canvas);
            }
            c(canvas);
            k(canvas, i, i2, c4523Vk1);
        }

        public final void c(Canvas canvas) {
            canvas.drawLines(this.a, this.e);
        }

        public final void d(Canvas canvas) {
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.q; i++) {
                int i2 = this.b[i];
                if (i2 == 1) {
                    z = true;
                }
                if (i2 == 0) {
                    z2 = true;
                }
            }
            if (z) {
                g(canvas);
            }
            if (z2) {
                e(canvas);
            }
        }

        public final void e(Canvas canvas) {
            float[] fArr = this.a;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[fArr.length - 2];
            float f4 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f, f3), Math.max(f2, f4), Math.max(f, f3), Math.max(f2, f4), this.g);
            canvas.drawLine(Math.min(f, f3), Math.min(f2, f4), Math.min(f, f3), Math.max(f2, f4), this.g);
        }

        public final void f(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float min = Math.min(f3, f5);
            float max = Math.max(f4, f6);
            float min2 = f - Math.min(f3, f5);
            float max2 = Math.max(f4, f6) - f2;
            String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f5 - f3)) + 0.5d)) / 100.0f);
            m(str, this.h);
            canvas.drawText(str, ((min2 / 2.0f) - (this.r.width() / 2)) + min, f2 - 20.0f, this.h);
            canvas.drawLine(f, f2, Math.min(f3, f5), f2, this.g);
            String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f6 - f4)) + 0.5d)) / 100.0f);
            m(str2, this.h);
            canvas.drawText(str2, f + 5.0f, max - ((max2 / 2.0f) - (this.r.height() / 2)), this.h);
            canvas.drawLine(f, f2, f, Math.max(f4, f6), this.g);
        }

        public final void g(Canvas canvas) {
            float[] fArr = this.a;
            canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.g);
        }

        public final void h(Canvas canvas, float f, float f2) {
            float[] fArr = this.a;
            float f3 = fArr[0];
            float f4 = fArr[1];
            float f5 = fArr[fArr.length - 2];
            float f6 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot(f3 - f5, f4 - f6);
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            float f9 = (((f - f3) * f7) + ((f2 - f4) * f8)) / (hypot * hypot);
            float f10 = f3 + (f7 * f9);
            float f11 = f4 + (f9 * f8);
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f10, f11);
            float hypot2 = (float) Math.hypot(f10 - f, f11 - f2);
            String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
            m(str, this.h);
            canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.r.width() / 2), -20.0f, this.h);
            canvas.drawLine(f, f2, f10, f11, this.g);
        }

        public final void i(Canvas canvas, float f, float f2, int i, int i2) {
            String str = "" + (((int) ((((f - (i / 2)) * 100.0f) / (C7114il1.this.getWidth() - i)) + 0.5d)) / 100.0f);
            m(str, this.h);
            canvas.drawText(str, ((f / 2.0f) - (this.r.width() / 2)) + 0.0f, f2 - 20.0f, this.h);
            canvas.drawLine(f, f2, Math.min(0.0f, 1.0f), f2, this.g);
            String str2 = "" + (((int) ((((f2 - (i2 / 2)) * 100.0f) / (C7114il1.this.getHeight() - i2)) + 0.5d)) / 100.0f);
            m(str2, this.h);
            canvas.drawText(str2, 5.0f + f, 0.0f - ((f2 / 2.0f) - (this.r.height() / 2)), this.h);
            canvas.drawLine(f, f2, f, Math.max(0.0f, 1.0f), this.g);
        }

        public final void j(Canvas canvas, C4523Vk1 c4523Vk1) {
            this.d.reset();
            for (int i = 0; i <= 50; i++) {
                c4523Vk1.g(i / 50, this.j, 0);
                Path path = this.d;
                float[] fArr = this.j;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.d;
                float[] fArr2 = this.j;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.d;
                float[] fArr3 = this.j;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.d;
                float[] fArr4 = this.j;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.d.close();
            }
            this.e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.d, this.e);
            canvas.translate(-2.0f, -2.0f);
            this.e.setColor(InterfaceMenuC9553sh2.c);
            canvas.drawPath(this.d, this.e);
        }

        public final void k(Canvas canvas, int i, int i2, C4523Vk1 c4523Vk1) {
            int i3;
            int i4;
            View view = c4523Vk1.b;
            if (view != null) {
                i3 = view.getWidth();
                i4 = c4523Vk1.b.getHeight();
            } else {
                i3 = 0;
                i4 = 0;
            }
            for (int i5 = 1; i5 < i2 - 1; i5++) {
                if (i != 4 || this.b[i5 - 1] != 0) {
                    float[] fArr = this.c;
                    int i6 = i5 * 2;
                    float f = fArr[i6];
                    float f2 = fArr[i6 + 1];
                    this.d.reset();
                    this.d.moveTo(f, f2 + 10.0f);
                    this.d.lineTo(f + 10.0f, f2);
                    this.d.lineTo(f, f2 - 10.0f);
                    this.d.lineTo(f - 10.0f, f2);
                    this.d.close();
                    int i7 = i5 - 1;
                    c4523Vk1.w(i7);
                    if (i == 4) {
                        int i8 = this.b[i7];
                        if (i8 == 1) {
                            h(canvas, f - 0.0f, f2 - 0.0f);
                        } else if (i8 == 0) {
                            f(canvas, f - 0.0f, f2 - 0.0f);
                        } else if (i8 == 2) {
                            i(canvas, f - 0.0f, f2 - 0.0f, i3, i4);
                        }
                        canvas.drawPath(this.d, this.i);
                    }
                    if (i == 2) {
                        h(canvas, f - 0.0f, f2 - 0.0f);
                    }
                    if (i == 3) {
                        f(canvas, f - 0.0f, f2 - 0.0f);
                    }
                    if (i == 6) {
                        i(canvas, f - 0.0f, f2 - 0.0f, i3, i4);
                    }
                    canvas.drawPath(this.d, this.i);
                }
            }
            float[] fArr2 = this.a;
            if (fArr2.length > 1) {
                canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.f);
                float[] fArr3 = this.a;
                canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.f);
            }
        }

        public final void l(Canvas canvas, float f, float f2, float f3, float f4) {
            canvas.drawRect(f, f2, f3, f4, this.g);
            canvas.drawLine(f, f2, f3, f4, this.g);
        }

        public void m(String str, Paint paint) {
            paint.getTextBounds(str, 0, str.length(), this.r);
        }
    }

    /* renamed from: o.il1$g */
    /* loaded from: classes.dex */
    public class g {
        public VK a = new VK();
        public VK b = new VK();
        public androidx.constraintlayout.widget.e c = null;
        public androidx.constraintlayout.widget.e d = null;
        public int e;
        public int f;

        public g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0133 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a() {
            String str;
            int childCount = C7114il1.this.getChildCount();
            C7114il1.this.P1.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i = 0; i < childCount; i++) {
                View childAt = C7114il1.this.getChildAt(i);
                C4523Vk1 c4523Vk1 = new C4523Vk1(childAt);
                int id = childAt.getId();
                iArr[i] = id;
                sparseArray.put(id, c4523Vk1);
                C7114il1.this.P1.put(childAt, c4523Vk1);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt2 = C7114il1.this.getChildAt(i2);
                C4523Vk1 c4523Vk12 = C7114il1.this.P1.get(childAt2);
                if (c4523Vk12 != null) {
                    if (this.c != null) {
                        UK g = g(this.a, childAt2);
                        if (g != null) {
                            c4523Vk12.W(C7114il1.this.e1(g), this.c, C7114il1.this.getWidth(), C7114il1.this.getHeight());
                        } else if (C7114il1.this.c2 != 0) {
                            Log.e(C7114il1.o3, AV.g() + "no widget for  " + AV.k(childAt2) + " (" + childAt2.getClass().getName() + C9811tl1.d);
                        }
                    } else if (C7114il1.this.R2) {
                        C6520gI2 c6520gI2 = C7114il1.this.T2.get(childAt2);
                        C7114il1 c7114il1 = C7114il1.this;
                        int i3 = c7114il1.S2;
                        int i4 = c7114il1.U2;
                        int i5 = C7114il1.this.V2;
                        str = C7114il1.o3;
                        c4523Vk12.X(c6520gI2, childAt2, i3, i4, i5);
                        if (this.d != null) {
                            UK g2 = g(this.b, childAt2);
                            if (g2 != null) {
                                c4523Vk12.T(C7114il1.this.e1(g2), this.d, C7114il1.this.getWidth(), C7114il1.this.getHeight());
                            } else if (C7114il1.this.c2 != 0) {
                                Log.e(str, AV.g() + "no widget for  " + AV.k(childAt2) + " (" + childAt2.getClass().getName() + C9811tl1.d);
                            }
                        }
                    }
                    str = C7114il1.o3;
                    if (this.d != null) {
                    }
                }
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                C4523Vk1 c4523Vk13 = (C4523Vk1) sparseArray.get(iArr[i6]);
                int k = c4523Vk13.k();
                if (k != -1) {
                    c4523Vk13.b0((C4523Vk1) sparseArray.get(k));
                }
            }
        }

        public final void b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int optimizationLevel = C7114il1.this.getOptimizationLevel();
            C7114il1 c7114il1 = C7114il1.this;
            if (c7114il1.K1 == c7114il1.getStartState()) {
                C7114il1 c7114il12 = C7114il1.this;
                VK vk = this.b;
                androidx.constraintlayout.widget.e eVar = this.d;
                if (eVar != null && eVar.e != 0) {
                    i6 = i2;
                } else {
                    i6 = i;
                }
                if (eVar != null && eVar.e != 0) {
                    i7 = i;
                } else {
                    i7 = i2;
                }
                c7114il12.F(vk, optimizationLevel, i6, i7);
                androidx.constraintlayout.widget.e eVar2 = this.c;
                if (eVar2 != null) {
                    C7114il1 c7114il13 = C7114il1.this;
                    VK vk2 = this.a;
                    int i9 = eVar2.e;
                    if (i9 == 0) {
                        i8 = i;
                    } else {
                        i8 = i2;
                    }
                    if (i9 == 0) {
                        i = i2;
                    }
                    c7114il13.F(vk2, optimizationLevel, i8, i);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.e eVar3 = this.c;
            if (eVar3 != null) {
                C7114il1 c7114il14 = C7114il1.this;
                VK vk3 = this.a;
                int i10 = eVar3.e;
                if (i10 == 0) {
                    i4 = i;
                } else {
                    i4 = i2;
                }
                if (i10 == 0) {
                    i5 = i2;
                } else {
                    i5 = i;
                }
                c7114il14.F(vk3, optimizationLevel, i4, i5);
            }
            C7114il1 c7114il15 = C7114il1.this;
            VK vk4 = this.b;
            androidx.constraintlayout.widget.e eVar4 = this.d;
            if (eVar4 != null && eVar4.e != 0) {
                i3 = i2;
            } else {
                i3 = i;
            }
            if (eVar4 == null || eVar4.e == 0) {
                i = i2;
            }
            c7114il15.F(vk4, optimizationLevel, i3, i);
        }

        public void c(VK vk, VK vk2) {
            UK uk;
            ArrayList<UK> m2 = vk.m2();
            HashMap<UK, UK> hashMap = new HashMap<>();
            hashMap.put(vk, vk2);
            vk2.m2().clear();
            vk2.n(vk, hashMap);
            Iterator<UK> it = m2.iterator();
            while (it.hasNext()) {
                UK next = it.next();
                if (next instanceof C4327Tk) {
                    uk = new C4327Tk();
                } else if (next instanceof C9445sF0) {
                    uk = new C9445sF0();
                } else if (next instanceof C3785Nv0) {
                    uk = new C3785Nv0();
                } else if (next instanceof C6001eD1) {
                    uk = new C6001eD1();
                } else if (next instanceof InterfaceC8961qH0) {
                    uk = new C9696tH0();
                } else {
                    uk = new UK();
                }
                vk2.a(uk);
                hashMap.put(next, uk);
            }
            Iterator<UK> it2 = m2.iterator();
            while (it2.hasNext()) {
                UK next2 = it2.next();
                hashMap.get(next2).n(next2, hashMap);
            }
        }

        public final void d(String str, VK vk) {
            String str2;
            String str3;
            String str4;
            String str5 = str + C4500Ve2.b + AV.k((View) vk.w());
            Log.v(C7114il1.o3, str5 + "  ========= " + vk);
            int size = vk.m2().size();
            for (int i = 0; i < size; i++) {
                String str6 = str5 + C6566gU0.f + i + "] ";
                UK uk = vk.m2().get(i);
                StringBuilder sb = new StringBuilder();
                sb.append("");
                MK mk = uk.R.f;
                String str7 = CrashlyticsReportPersistence.m;
                if (mk != null) {
                    str2 = "T";
                } else {
                    str2 = CrashlyticsReportPersistence.m;
                }
                sb.append(str2);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                if (uk.T.f != null) {
                    str3 = "B";
                } else {
                    str3 = CrashlyticsReportPersistence.m;
                }
                sb3.append(str3);
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                if (uk.Q.f != null) {
                    str4 = "L";
                } else {
                    str4 = CrashlyticsReportPersistence.m;
                }
                sb5.append(str4);
                String sb6 = sb5.toString();
                StringBuilder sb7 = new StringBuilder();
                sb7.append(sb6);
                if (uk.S.f != null) {
                    str7 = "R";
                }
                sb7.append(str7);
                String sb8 = sb7.toString();
                View view = (View) uk.w();
                String k = AV.k(view);
                if (view instanceof TextView) {
                    k = k + C9811tl1.c + ((Object) ((TextView) view).getText()) + C9811tl1.d;
                }
                Log.v(C7114il1.o3, str6 + TD0.a.Y0 + k + C4500Ve2.b + uk + C4500Ve2.b + sb8);
            }
            Log.v(C7114il1.o3, str5 + " done. ");
        }

        public final void e(String str, ConstraintLayout.b bVar) {
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            StringBuilder sb = new StringBuilder();
            sb.append(C4500Ve2.b);
            if (bVar.t != -1) {
                str2 = "SS";
            } else {
                str2 = "__";
            }
            sb.append(str2);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            String str13 = "|__";
            if (bVar.s == -1) {
                str3 = "|__";
            } else {
                str3 = "|SE";
            }
            sb3.append(str3);
            String sb4 = sb3.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb4);
            if (bVar.u == -1) {
                str4 = "|__";
            } else {
                str4 = "|ES";
            }
            sb5.append(str4);
            String sb6 = sb5.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            if (bVar.v == -1) {
                str5 = "|__";
            } else {
                str5 = "|EE";
            }
            sb7.append(str5);
            String sb8 = sb7.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(sb8);
            if (bVar.e == -1) {
                str6 = "|__";
            } else {
                str6 = "|LL";
            }
            sb9.append(str6);
            String sb10 = sb9.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(sb10);
            if (bVar.f == -1) {
                str7 = "|__";
            } else {
                str7 = "|LR";
            }
            sb11.append(str7);
            String sb12 = sb11.toString();
            StringBuilder sb13 = new StringBuilder();
            sb13.append(sb12);
            if (bVar.g == -1) {
                str8 = "|__";
            } else {
                str8 = "|RL";
            }
            sb13.append(str8);
            String sb14 = sb13.toString();
            StringBuilder sb15 = new StringBuilder();
            sb15.append(sb14);
            if (bVar.h == -1) {
                str9 = "|__";
            } else {
                str9 = "|RR";
            }
            sb15.append(str9);
            String sb16 = sb15.toString();
            StringBuilder sb17 = new StringBuilder();
            sb17.append(sb16);
            if (bVar.i == -1) {
                str10 = "|__";
            } else {
                str10 = "|TT";
            }
            sb17.append(str10);
            String sb18 = sb17.toString();
            StringBuilder sb19 = new StringBuilder();
            sb19.append(sb18);
            if (bVar.j == -1) {
                str11 = "|__";
            } else {
                str11 = "|TB";
            }
            sb19.append(str11);
            String sb20 = sb19.toString();
            StringBuilder sb21 = new StringBuilder();
            sb21.append(sb20);
            if (bVar.k == -1) {
                str12 = "|__";
            } else {
                str12 = "|BT";
            }
            sb21.append(str12);
            String sb22 = sb21.toString();
            StringBuilder sb23 = new StringBuilder();
            sb23.append(sb22);
            if (bVar.l != -1) {
                str13 = "|BB";
            }
            sb23.append(str13);
            String sb24 = sb23.toString();
            Log.v(C7114il1.o3, str + sb24);
        }

        public final void f(String str, UK uk) {
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            StringBuilder sb = new StringBuilder();
            sb.append(C4500Ve2.b);
            String str7 = "B";
            String str8 = "__";
            if (uk.R.f == null) {
                str2 = "__";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("T");
                if (uk.R.f.e != MK.a.TOP) {
                    str6 = "B";
                } else {
                    str6 = "T";
                }
                sb2.append(str6);
                str2 = sb2.toString();
            }
            sb.append(str2);
            String sb3 = sb.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb3);
            if (uk.T.f == null) {
                str3 = "__";
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("B");
                if (uk.T.f.e == MK.a.TOP) {
                    str7 = "T";
                }
                sb5.append(str7);
                str3 = sb5.toString();
            }
            sb4.append(str3);
            String sb6 = sb4.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            String str9 = "R";
            if (uk.Q.f == null) {
                str4 = "__";
            } else {
                StringBuilder sb8 = new StringBuilder();
                sb8.append("L");
                if (uk.Q.f.e != MK.a.LEFT) {
                    str5 = "R";
                } else {
                    str5 = "L";
                }
                sb8.append(str5);
                str4 = sb8.toString();
            }
            sb7.append(str4);
            String sb9 = sb7.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(sb9);
            if (uk.S.f != null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append("R");
                if (uk.S.f.e == MK.a.LEFT) {
                    str9 = "L";
                }
                sb11.append(str9);
                str8 = sb11.toString();
            }
            sb10.append(str8);
            String sb12 = sb10.toString();
            Log.v(C7114il1.o3, str + sb12 + " ---  " + uk);
        }

        public UK g(VK vk, View view) {
            if (vk.w() == view) {
                return vk;
            }
            ArrayList<UK> m2 = vk.m2();
            int size = m2.size();
            for (int i = 0; i < size; i++) {
                UK uk = m2.get(i);
                if (uk.w() == view) {
                    return uk;
                }
            }
            return null;
        }

        public void h(VK vk, androidx.constraintlayout.widget.e eVar, androidx.constraintlayout.widget.e eVar2) {
            this.c = eVar;
            this.d = eVar2;
            this.a = new VK();
            this.b = new VK();
            this.a.V2(C7114il1.this.a1.H2());
            this.b.V2(C7114il1.this.a1.H2());
            this.a.q2();
            this.b.q2();
            c(C7114il1.this.a1, this.a);
            c(C7114il1.this.a1, this.b);
            if (C7114il1.this.T1 > 0.5d) {
                if (eVar != null) {
                    m(this.a, eVar);
                }
                m(this.b, eVar2);
            } else {
                m(this.b, eVar2);
                if (eVar != null) {
                    m(this.a, eVar);
                }
            }
            this.a.Z2(C7114il1.this.z());
            this.a.b3();
            this.b.Z2(C7114il1.this.z());
            this.b.b3();
            ViewGroup.LayoutParams layoutParams = C7114il1.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    VK vk2 = this.a;
                    UK.b bVar = UK.b.WRAP_CONTENT;
                    vk2.E1(bVar);
                    this.b.E1(bVar);
                }
                if (layoutParams.height == -2) {
                    VK vk3 = this.a;
                    UK.b bVar2 = UK.b.WRAP_CONTENT;
                    vk3.Z1(bVar2);
                    this.b.Z1(bVar2);
                }
            }
        }

        public boolean i(int i, int i2) {
            if (i == this.e && i2 == this.f) {
                return false;
            }
            return true;
        }

        public void j(int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            C7114il1 c7114il1 = C7114il1.this;
            c7114il1.I2 = mode;
            c7114il1.J2 = mode2;
            b(i, i2);
            if (!(C7114il1.this.getParent() instanceof C7114il1) || mode != 1073741824 || mode2 != 1073741824) {
                b(i, i2);
                C7114il1.this.E2 = this.a.m0();
                C7114il1.this.F2 = this.a.D();
                C7114il1.this.G2 = this.b.m0();
                C7114il1.this.H2 = this.b.D();
                C7114il1 c7114il12 = C7114il1.this;
                if (c7114il12.E2 == c7114il12.G2 && c7114il12.F2 == c7114il12.H2) {
                    z = false;
                } else {
                    z = true;
                }
                c7114il12.D2 = z;
            }
            C7114il1 c7114il13 = C7114il1.this;
            int i3 = c7114il13.E2;
            int i4 = c7114il13.F2;
            int i5 = c7114il13.I2;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                i3 = (int) (i3 + (c7114il13.K2 * (c7114il13.G2 - i3)));
            }
            int i6 = i3;
            int i7 = c7114il13.J2;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                i4 = (int) (i4 + (c7114il13.K2 * (c7114il13.H2 - i4)));
            }
            int i8 = i4;
            if (!this.a.Q2() && !this.b.Q2()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!this.a.O2() && !this.b.O2()) {
                z3 = false;
            } else {
                z3 = true;
            }
            C7114il1.this.E(i, i2, i6, i8, z2, z3);
        }

        public void k() {
            j(C7114il1.this.M1, C7114il1.this.N1);
            C7114il1.this.d1();
        }

        public void l(int i, int i2) {
            this.e = i;
            this.f = i2;
        }

        public final void m(VK vk, androidx.constraintlayout.widget.e eVar) {
            SparseArray<UK> sparseArray = new SparseArray<>();
            f.a aVar = new f.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, vk);
            sparseArray.put(C7114il1.this.getId(), vk);
            if (eVar != null && eVar.e != 0) {
                C7114il1 c7114il1 = C7114il1.this;
                c7114il1.F(this.b, c7114il1.getOptimizationLevel(), View.MeasureSpec.makeMeasureSpec(C7114il1.this.getHeight(), 1073741824), View.MeasureSpec.makeMeasureSpec(C7114il1.this.getWidth(), 1073741824));
            }
            Iterator<UK> it = vk.m2().iterator();
            while (it.hasNext()) {
                UK next = it.next();
                next.g1(true);
                sparseArray.put(((View) next.w()).getId(), next);
            }
            Iterator<UK> it2 = vk.m2().iterator();
            while (it2.hasNext()) {
                UK next2 = it2.next();
                View view = (View) next2.w();
                eVar.u(view.getId(), aVar);
                next2.d2(eVar.v0(view.getId()));
                next2.z1(eVar.n0(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.b) {
                    eVar.s((androidx.constraintlayout.widget.b) view, next2, aVar, sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier) view).K();
                    }
                }
                aVar.resolveLayoutDirection(C7114il1.this.getLayoutDirection());
                C7114il1.this.j(false, view, next2, aVar, sparseArray);
                if (eVar.u0(view.getId()) == 1) {
                    next2.c2(view.getVisibility());
                } else {
                    next2.c2(eVar.t0(view.getId()));
                }
            }
            Iterator<UK> it3 = vk.m2().iterator();
            while (it3.hasNext()) {
                UK next3 = it3.next();
                if (next3 instanceof UI2) {
                    InterfaceC8961qH0 interfaceC8961qH0 = (InterfaceC8961qH0) next3;
                    ((androidx.constraintlayout.widget.b) next3.w()).J(vk, interfaceC8961qH0, sparseArray);
                    ((UI2) interfaceC8961qH0).o2();
                }
            }
        }
    }

    /* renamed from: o.il1$h */
    /* loaded from: classes.dex */
    public interface h {
        void a();

        float b(int i);

        void c(MotionEvent motionEvent);

        void clear();

        float d();

        float e();

        void f(int i, float f);

        float g(int i);

        void h(int i);
    }

    /* renamed from: o.il1$i */
    /* loaded from: classes.dex */
    public static class i implements h {
        public static i b = new i();
        public VelocityTracker a;

        public static i i() {
            b.a = VelocityTracker.obtain();
            return b;
        }

        @Override // o.C7114il1.h
        public void a() {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.a = null;
            }
        }

        @Override // o.C7114il1.h
        public float b(int i) {
            if (this.a != null) {
                return b(i);
            }
            return 0.0f;
        }

        @Override // o.C7114il1.h
        public void c(MotionEvent motionEvent) {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
        }

        @Override // o.C7114il1.h
        public void clear() {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }

        @Override // o.C7114il1.h
        public float d() {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                return velocityTracker.getYVelocity();
            }
            return 0.0f;
        }

        @Override // o.C7114il1.h
        public float e() {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity();
            }
            return 0.0f;
        }

        @Override // o.C7114il1.h
        public void f(int i, float f) {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i, f);
            }
        }

        @Override // o.C7114il1.h
        public float g(int i) {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                return velocityTracker.getXVelocity(i);
            }
            return 0.0f;
        }

        @Override // o.C7114il1.h
        public void h(int i) {
            VelocityTracker velocityTracker = this.a;
            if (velocityTracker != null) {
                velocityTracker.computeCurrentVelocity(i);
            }
        }
    }

    /* renamed from: o.il1$j */
    /* loaded from: classes.dex */
    public class j {
        public float a = Float.NaN;
        public float b = Float.NaN;
        public int c = -1;
        public int d = -1;
        public final String e = "motion.progress";
        public final String f = "motion.velocity";
        public final String g = "motion.StartState";
        public final String h = "motion.EndState";

        public j() {
        }

        public void a() {
            int i = this.c;
            if (i != -1 || this.d != -1) {
                if (i == -1) {
                    C7114il1.this.l1(this.d);
                } else {
                    int i2 = this.d;
                    if (i2 == -1) {
                        C7114il1.this.J(i, -1, -1);
                    } else {
                        C7114il1.this.c1(i, i2);
                    }
                }
                C7114il1.this.setState(l.SETUP);
            }
            if (Float.isNaN(this.b)) {
                if (Float.isNaN(this.a)) {
                    return;
                }
                C7114il1.this.setProgress(this.a);
                return;
            }
            C7114il1.this.b1(this.a, this.b);
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.a);
            bundle.putFloat("motion.velocity", this.b);
            bundle.putInt("motion.StartState", this.c);
            bundle.putInt("motion.EndState", this.d);
            return bundle;
        }

        public void c() {
            this.d = C7114il1.this.L1;
            this.c = C7114il1.this.J1;
            this.b = C7114il1.this.getVelocity();
            this.a = C7114il1.this.getProgress();
        }

        public void d(int i) {
            this.d = i;
        }

        public void e(float f) {
            this.a = f;
        }

        public void f(int i) {
            this.c = i;
        }

        public void g(Bundle bundle) {
            this.a = bundle.getFloat("motion.progress");
            this.b = bundle.getFloat("motion.velocity");
            this.c = bundle.getInt("motion.StartState");
            this.d = bundle.getInt("motion.EndState");
        }

        public void h(float f) {
            this.b = f;
        }
    }

    /* renamed from: o.il1$k */
    /* loaded from: classes.dex */
    public interface k {
        void a(C7114il1 c7114il1, int i, int i2);

        void d(C7114il1 c7114il1, int i);

        void e(C7114il1 c7114il1, int i, boolean z, float f);

        void i(C7114il1 c7114il1, int i, int i2, float f);
    }

    /* renamed from: o.il1$l */
    /* loaded from: classes.dex */
    public enum l {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public C7114il1(Context context) {
        super(context);
        this.H1 = null;
        this.I1 = 0.0f;
        this.J1 = -1;
        this.K1 = -1;
        this.L1 = -1;
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = true;
        this.P1 = new HashMap<>();
        this.Q1 = 0L;
        this.R1 = 1.0f;
        this.S1 = 0.0f;
        this.T1 = 0.0f;
        this.V1 = 0.0f;
        this.X1 = false;
        this.Y1 = false;
        this.c2 = 0;
        this.e2 = false;
        this.f2 = new C5130ad2();
        this.g2 = new e();
        this.i2 = true;
        this.n2 = false;
        this.s2 = false;
        this.t2 = null;
        this.u2 = null;
        this.v2 = null;
        this.w2 = null;
        this.x2 = 0;
        this.y2 = -1L;
        this.z2 = 0.0f;
        this.A2 = 0;
        this.B2 = 0.0f;
        this.C2 = false;
        this.D2 = false;
        this.L2 = new C8049mX0();
        this.M2 = false;
        this.O2 = null;
        this.P2 = null;
        this.Q2 = 0;
        this.R2 = false;
        this.S2 = 0;
        this.T2 = new HashMap<>();
        this.X2 = new Rect();
        this.Y2 = false;
        this.Z2 = l.UNDEFINED;
        this.a3 = new g();
        this.b3 = false;
        this.c3 = new RectF();
        this.d3 = null;
        this.e3 = null;
        this.f3 = new ArrayList<>();
        M0(null);
    }

    public static boolean t1(float f2, float f3, float f4) {
        if (f2 > 0.0f) {
            float f5 = f2 / f4;
            if (f3 + ((f2 * f5) - (((f4 * f5) * f5) / 2.0f)) <= 1.0f) {
                return false;
            }
            return true;
        }
        float f6 = (-f2) / f4;
        if (f3 + (f2 * f6) + (((f4 * f6) * f6) / 2.0f) >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void A(int i2) {
        int rotation;
        C8590ol1.b bVar;
        if (i2 != 0) {
            try {
                C8590ol1 c8590ol1 = new C8590ol1(getContext(), this, i2);
                this.F1 = c8590ol1;
                if (this.K1 == -1) {
                    this.K1 = c8590ol1.O();
                    this.J1 = this.F1.O();
                    this.L1 = this.F1.u();
                }
                if (isAttachedToWindow()) {
                    try {
                        Display display = getDisplay();
                        if (display == null) {
                            rotation = 0;
                        } else {
                            rotation = display.getRotation();
                        }
                        this.W2 = rotation;
                        C8590ol1 c8590ol12 = this.F1;
                        if (c8590ol12 != null) {
                            androidx.constraintlayout.widget.e o2 = c8590ol12.o(this.K1);
                            this.F1.i0(this);
                            ArrayList<C4814Yk1> arrayList = this.v2;
                            if (arrayList != null) {
                                Iterator<C4814Yk1> it = arrayList.iterator();
                                while (it.hasNext()) {
                                    it.next().j(this);
                                }
                            }
                            if (o2 != null) {
                                o2.r(this);
                            }
                            this.J1 = this.K1;
                        }
                        U0();
                        j jVar = this.N2;
                        if (jVar != null) {
                            if (this.Y2) {
                                post(new a());
                                return;
                            } else {
                                jVar.a();
                                return;
                            }
                        }
                        C8590ol1 c8590ol13 = this.F1;
                        if (c8590ol13 != null && (bVar = c8590ol13.c) != null && bVar.z() == 4) {
                            h1();
                            setState(l.SETUP);
                            setState(l.MOVING);
                            return;
                        }
                        return;
                    } catch (Exception e2) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", e2);
                    }
                }
                this.F1 = null;
                return;
            } catch (Exception e3) {
                throw new IllegalArgumentException("unable to parse MotionScene file", e3);
            }
        }
        this.F1 = null;
    }

    public final void A0() {
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if ((this.Z1 != null || ((copyOnWriteArrayList = this.w2) != null && !copyOnWriteArrayList.isEmpty())) && this.B2 != this.S1) {
            if (this.A2 != -1) {
                C0();
                this.C2 = true;
            }
            this.A2 = -1;
            float f2 = this.S1;
            this.B2 = f2;
            k kVar = this.Z1;
            if (kVar != null) {
                kVar.i(this, this.J1, this.L1, f2);
            }
            CopyOnWriteArrayList<k> copyOnWriteArrayList2 = this.w2;
            if (copyOnWriteArrayList2 != null) {
                Iterator<k> it = copyOnWriteArrayList2.iterator();
                while (it.hasNext()) {
                    it.next().i(this, this.J1, this.L1, this.S1);
                }
            }
            this.C2 = true;
        }
    }

    public void B0() {
        int i2;
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if ((this.Z1 != null || ((copyOnWriteArrayList = this.w2) != null && !copyOnWriteArrayList.isEmpty())) && this.A2 == -1) {
            this.A2 = this.K1;
            if (!this.f3.isEmpty()) {
                ArrayList<Integer> arrayList = this.f3;
                i2 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i2 = -1;
            }
            int i4 = this.K1;
            if (i2 != i4 && i4 != -1) {
                this.f3.add(Integer.valueOf(i4));
            }
        }
        V0();
        Runnable runnable = this.O2;
        if (runnable != null) {
            runnable.run();
            this.O2 = null;
        }
        int[] iArr = this.P2;
        if (iArr != null && this.Q2 > 0) {
            l1(iArr[0]);
            int[] iArr2 = this.P2;
            System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
            this.Q2--;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void C(int i2) {
        this.i1 = null;
    }

    public final void C0() {
        k kVar = this.Z1;
        if (kVar != null) {
            kVar.a(this, this.J1, this.L1);
        }
        CopyOnWriteArrayList<k> copyOnWriteArrayList = this.w2;
        if (copyOnWriteArrayList != null) {
            Iterator<k> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.J1, this.L1);
            }
        }
    }

    public void D0(int i2, boolean z, float f2) {
        k kVar = this.Z1;
        if (kVar != null) {
            kVar.e(this, i2, z, f2);
        }
        CopyOnWriteArrayList<k> copyOnWriteArrayList = this.w2;
        if (copyOnWriteArrayList != null) {
            Iterator<k> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().e(this, i2, z, f2);
            }
        }
    }

    public void E0(int i2, float f2, float f3, float f4, float[] fArr) {
        String resourceName;
        HashMap<View, C4523Vk1> hashMap = this.P1;
        View w = w(i2);
        C4523Vk1 c4523Vk1 = hashMap.get(w);
        if (c4523Vk1 != null) {
            c4523Vk1.p(f2, f3, f4, fArr);
            float y = w.getY();
            this.a2 = f2;
            this.b2 = y;
            return;
        }
        if (w == null) {
            resourceName = "" + i2;
        } else {
            resourceName = w.getContext().getResources().getResourceName(i2);
        }
        Log.w(o3, "WARNING could not find view id " + resourceName);
    }

    public androidx.constraintlayout.widget.e F0(int i2) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 == null) {
            return null;
        }
        return c8590ol1.o(i2);
    }

    public String G0(int i2) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 == null) {
            return null;
        }
        return c8590ol1.Y(i2);
    }

    public int[] H0(String... strArr) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 == null) {
            return null;
        }
        return c8590ol1.B(strArr);
    }

    public C4523Vk1 I0(int i2) {
        return this.P1.get(findViewById(i2));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public void J(int i2, int i4, int i5) {
        setState(l.SETUP);
        this.K1 = i2;
        this.J1 = -1;
        this.L1 = -1;
        androidx.constraintlayout.widget.c cVar = this.i1;
        if (cVar != null) {
            cVar.e(i2, i4, i5);
            return;
        }
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            c8590ol1.o(i2).r(this);
        }
    }

    public C8590ol1.b J0(int i2) {
        return this.F1.P(i2);
    }

    public void K0(View view, float f2, float f3, float[] fArr, int i2) {
        float f4;
        float[] fArr2;
        float f5 = this.I1;
        float f6 = this.T1;
        if (this.G1 != null) {
            float signum = Math.signum(this.V1 - f6);
            float interpolation = this.G1.getInterpolation(this.T1 + 1.0E-5f);
            f4 = this.G1.getInterpolation(this.T1);
            f5 = (signum * ((interpolation - f4) / 1.0E-5f)) / this.R1;
        } else {
            f4 = f6;
        }
        Interpolator interpolator = this.G1;
        if (interpolator instanceof Abstractanimation.InterpolatorC5161al1) {
            f5 = ((Abstractanimation.InterpolatorC5161al1) interpolator).a();
        }
        C4523Vk1 c4523Vk1 = this.P1.get(view);
        if ((i2 & 1) == 0) {
            fArr2 = fArr;
            c4523Vk1.C(f4, view.getWidth(), view.getHeight(), f2, f3, fArr2);
        } else {
            fArr2 = fArr;
            c4523Vk1.p(f4, f2, f3, fArr2);
        }
        if (i2 < 2) {
            fArr2[0] = fArr2[0] * f5;
            fArr2[1] = fArr2[1] * f5;
        }
    }

    public final boolean L0(float f2, float f3, View view, MotionEvent motionEvent) {
        boolean z;
        View childAt;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                if (L0((childAt.getLeft() + f2) - view.getScrollX(), (childAt.getTop() + f3) - view.getScrollY(), viewGroup.getChildAt(childCount), motionEvent)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            this.c3.set(f2, f3, (view.getRight() + f2) - view.getLeft(), (view.getBottom() + f3) - view.getTop());
            if ((motionEvent.getAction() != 0 || this.c3.contains(motionEvent.getX(), motionEvent.getY())) && n0(view, motionEvent, -f2, -f3)) {
                return true;
            }
        }
        return z;
    }

    public final void M0(AttributeSet attributeSet) {
        C8590ol1 c8590ol1;
        int i2;
        q3 = isInEditMode();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.c.Gd);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z = true;
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == j.c.Jd) {
                    this.F1 = new C8590ol1(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == j.c.Id) {
                    this.K1 = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == j.c.Ld) {
                    this.V1 = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.X1 = true;
                } else if (index == j.c.Hd) {
                    z = obtainStyledAttributes.getBoolean(index, z);
                } else if (index == j.c.Md) {
                    if (this.c2 == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i2 = 2;
                        } else {
                            i2 = 0;
                        }
                        this.c2 = i2;
                    }
                } else if (index == j.c.Kd) {
                    this.c2 = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (this.F1 == null) {
                Log.e(o3, "WARNING NO app:layoutDescription tag");
            }
            if (!z) {
                this.F1 = null;
            }
        }
        if (this.c2 != 0) {
            o0();
        }
        if (this.K1 == -1 && (c8590ol1 = this.F1) != null) {
            this.K1 = c8590ol1.O();
            this.J1 = this.F1.O();
            this.L1 = this.F1.u();
        }
    }

    public boolean N0() {
        return this.Y2;
    }

    public boolean O0() {
        return this.R2;
    }

    public boolean P0() {
        return this.O1;
    }

    public boolean Q0(int i2) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            return c8590ol1.V(i2);
        }
        return false;
    }

    public void R0(int i2) {
        if (!isAttachedToWindow()) {
            this.K1 = i2;
        }
        if (this.J1 == i2) {
            setProgress(0.0f);
        } else if (this.L1 == i2) {
            setProgress(1.0f);
        } else {
            c1(i2, i2);
        }
    }

    public int S0(String str) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 == null) {
            return 0;
        }
        return c8590ol1.X(str);
    }

    public h T0() {
        return i.i();
    }

    public void U0() {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            if (c8590ol1.i(this, this.K1)) {
                requestLayout();
                return;
            }
            int i2 = this.K1;
            if (i2 != -1) {
                this.F1.f(this, i2);
            }
            if (this.F1.s0()) {
                this.F1.q0();
            }
        }
    }

    public final void V0() {
        CopyOnWriteArrayList<k> copyOnWriteArrayList;
        if (this.Z1 == null && ((copyOnWriteArrayList = this.w2) == null || copyOnWriteArrayList.isEmpty())) {
            return;
        }
        this.C2 = false;
        Iterator<Integer> it = this.f3.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            k kVar = this.Z1;
            if (kVar != null) {
                kVar.d(this, next.intValue());
            }
            CopyOnWriteArrayList<k> copyOnWriteArrayList2 = this.w2;
            if (copyOnWriteArrayList2 != null) {
                Iterator<k> it2 = copyOnWriteArrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().d(this, next.intValue());
                }
            }
        }
        this.f3.clear();
    }

    @Deprecated
    public void W0() {
        Log.e(o3, "This method is deprecated. Please call rebuildScene() instead.");
        X0();
    }

    public void X0() {
        this.a3.k();
        invalidate();
    }

    public boolean Y0(k kVar) {
        CopyOnWriteArrayList<k> copyOnWriteArrayList = this.w2;
        if (copyOnWriteArrayList == null) {
            return false;
        }
        return copyOnWriteArrayList.remove(kVar);
    }

    public void Z0(int i2, int i4) {
        int i5 = 1;
        this.R2 = true;
        this.U2 = getWidth();
        this.V2 = getHeight();
        int rotation = getDisplay().getRotation();
        if ((rotation + 1) % 4 <= (this.W2 + 1) % 4) {
            i5 = 2;
        }
        this.S2 = i5;
        this.W2 = rotation;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            C6520gI2 c6520gI2 = this.T2.get(childAt);
            if (c6520gI2 == null) {
                c6520gI2 = new C6520gI2();
                this.T2.put(childAt, c6520gI2);
            }
            c6520gI2.a(childAt);
        }
        this.J1 = -1;
        this.L1 = i2;
        this.F1.o0(-1, i2);
        this.a3.h(this.a1, null, this.F1.o(this.L1));
        this.S1 = 0.0f;
        this.T1 = 0.0f;
        invalidate();
        i1(new b());
        if (i4 > 0) {
            this.R1 = i4 / 1000.0f;
        }
    }

    public void a1(int i2) {
        if (getCurrentState() == -1) {
            l1(i2);
            return;
        }
        int[] iArr = this.P2;
        if (iArr == null) {
            this.P2 = new int[4];
        } else if (iArr.length <= this.Q2) {
            this.P2 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.P2;
        int i4 = this.Q2;
        this.Q2 = i4 + 1;
        iArr2[i4] = i2;
    }

    public void b1(float f2, float f3) {
        if (!isAttachedToWindow()) {
            if (this.N2 == null) {
                this.N2 = new j();
            }
            this.N2.e(f2);
            this.N2.h(f3);
            return;
        }
        setProgress(f2);
        setState(l.MOVING);
        this.I1 = f3;
        float f4 = 0.0f;
        int i2 = (f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            if (i2 > 0) {
                f4 = 1.0f;
            }
            l0(f4);
        } else if (f2 != 0.0f && f2 != 1.0f) {
            if (f2 > 0.5f) {
                f4 = 1.0f;
            }
            l0(f4);
        }
    }

    public void c1(int i2, int i4) {
        if (!isAttachedToWindow()) {
            if (this.N2 == null) {
                this.N2 = new j();
            }
            this.N2.f(i2);
            this.N2.d(i4);
            return;
        }
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            this.J1 = i2;
            this.L1 = i4;
            c8590ol1.o0(i2, i4);
            this.a3.h(this.a1, this.F1.o(i2), this.F1.o(i4));
            X0();
            this.T1 = 0.0f;
            j1();
        }
    }

    public final void d1() {
        float f2;
        float f3;
        int childCount = getChildCount();
        this.a3.a();
        boolean z = true;
        this.X1 = true;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            sparseArray.put(childAt.getId(), this.P1.get(childAt));
        }
        int width = getWidth();
        int height = getHeight();
        int m = this.F1.m();
        if (m != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                C4523Vk1 c4523Vk1 = this.P1.get(getChildAt(i5));
                if (c4523Vk1 != null) {
                    c4523Vk1.U(m);
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[this.P1.size()];
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            C4523Vk1 c4523Vk12 = this.P1.get(getChildAt(i7));
            if (c4523Vk12.k() != -1) {
                sparseBooleanArray.put(c4523Vk12.k(), true);
                iArr[i6] = c4523Vk12.k();
                i6++;
            }
        }
        if (this.v2 != null) {
            for (int i8 = 0; i8 < i6; i8++) {
                C4523Vk1 c4523Vk13 = this.P1.get(findViewById(iArr[i8]));
                if (c4523Vk13 != null) {
                    this.F1.z(c4523Vk13);
                }
            }
            Iterator<C4814Yk1> it = this.v2.iterator();
            while (it.hasNext()) {
                it.next().f(this, this.P1);
            }
            for (int i9 = 0; i9 < i6; i9++) {
                C4523Vk1 c4523Vk14 = this.P1.get(findViewById(iArr[i9]));
                if (c4523Vk14 != null) {
                    c4523Vk14.a0(width, height, this.R1, getNanoTime());
                }
            }
        } else {
            for (int i10 = 0; i10 < i6; i10++) {
                C4523Vk1 c4523Vk15 = this.P1.get(findViewById(iArr[i10]));
                if (c4523Vk15 != null) {
                    this.F1.z(c4523Vk15);
                    c4523Vk15.a0(width, height, this.R1, getNanoTime());
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            C4523Vk1 c4523Vk16 = this.P1.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && c4523Vk16 != null) {
                this.F1.z(c4523Vk16);
                c4523Vk16.a0(width, height, this.R1, getNanoTime());
            }
        }
        float N = this.F1.N();
        if (N != 0.0f) {
            if (N >= 0.0d) {
                z = false;
            }
            float abs = Math.abs(N);
            float f4 = -3.4028235E38f;
            float f5 = Float.MAX_VALUE;
            float f6 = -3.4028235E38f;
            float f7 = Float.MAX_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                C4523Vk1 c4523Vk17 = this.P1.get(getChildAt(i12));
                if (!Float.isNaN(c4523Vk17.m)) {
                    for (int i13 = 0; i13 < childCount; i13++) {
                        C4523Vk1 c4523Vk18 = this.P1.get(getChildAt(i13));
                        if (!Float.isNaN(c4523Vk18.m)) {
                            f5 = Math.min(f5, c4523Vk18.m);
                            f4 = Math.max(f4, c4523Vk18.m);
                        }
                    }
                    while (i2 < childCount) {
                        C4523Vk1 c4523Vk19 = this.P1.get(getChildAt(i2));
                        if (!Float.isNaN(c4523Vk19.m)) {
                            c4523Vk19.f648o = 1.0f / (1.0f - abs);
                            if (z) {
                                c4523Vk19.n = abs - (((f4 - c4523Vk19.m) / (f4 - f5)) * abs);
                            } else {
                                c4523Vk19.n = abs - (((c4523Vk19.m - f5) * abs) / (f4 - f5));
                            }
                        }
                        i2++;
                    }
                    return;
                }
                float t = c4523Vk17.t();
                float u = c4523Vk17.u();
                if (z) {
                    f3 = u - t;
                } else {
                    f3 = u + t;
                }
                f7 = Math.min(f7, f3);
                f6 = Math.max(f6, f3);
            }
            while (i2 < childCount) {
                C4523Vk1 c4523Vk110 = this.P1.get(getChildAt(i2));
                float t2 = c4523Vk110.t();
                float u2 = c4523Vk110.u();
                if (z) {
                    f2 = u2 - t2;
                } else {
                    f2 = u2 + t2;
                }
                c4523Vk110.f648o = 1.0f / (1.0f - abs);
                c4523Vk110.n = abs - (((f2 - f7) * abs) / (f6 - f7));
                i2++;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        String l2;
        long j2;
        C8481oI2 c8481oI2;
        ArrayList<C4814Yk1> arrayList = this.v2;
        if (arrayList != null) {
            Iterator<C4814Yk1> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b(canvas);
            }
        }
        y0(false);
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null && (c8481oI2 = c8590ol1.r) != null) {
            c8481oI2.d();
        }
        super.dispatchDraw(canvas);
        if (this.F1 != null) {
            if ((this.c2 & 1) == 1 && !isInEditMode()) {
                this.x2++;
                long nanoTime = getNanoTime();
                long j4 = this.y2;
                if (j4 != -1) {
                    if (nanoTime - j4 > 200000000) {
                        this.z2 = ((int) ((this.x2 / (((float) j2) * 1.0E-9f)) * 100.0f)) / 100.0f;
                        this.x2 = 0;
                        this.y2 = nanoTime;
                    }
                } else {
                    this.y2 = nanoTime;
                }
                Paint paint = new Paint();
                paint.setTextSize(42.0f);
                StringBuilder sb = new StringBuilder();
                sb.append(this.z2 + " fps " + AV.l(this, this.J1) + B8.d);
                sb.append(AV.l(this, this.L1));
                sb.append(" (progress: ");
                sb.append(((int) (getProgress() * 1000.0f)) / 10.0f);
                sb.append(" ) state=");
                int i2 = this.K1;
                if (i2 == -1) {
                    l2 = "undefined";
                } else {
                    l2 = AV.l(this, i2);
                }
                sb.append(l2);
                String sb2 = sb.toString();
                paint.setColor(-16777216);
                canvas.drawText(sb2, 11.0f, getHeight() - 29, paint);
                paint.setColor(-7864184);
                canvas.drawText(sb2, 10.0f, getHeight() - 30, paint);
            }
            if (this.c2 > 1) {
                if (this.d2 == null) {
                    this.d2 = new f();
                }
                this.d2.a(canvas, this.P1, this.F1.t(), this.c2);
            }
            ArrayList<C4814Yk1> arrayList2 = this.v2;
            if (arrayList2 != null) {
                Iterator<C4814Yk1> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().c(canvas);
                }
            }
        }
    }

    public final Rect e1(UK uk) {
        this.X2.top = uk.p0();
        this.X2.left = uk.o0();
        Rect rect = this.X2;
        int m0 = uk.m0();
        Rect rect2 = this.X2;
        rect.right = m0 + rect2.left;
        int D = uk.D();
        Rect rect3 = this.X2;
        rect2.bottom = D + rect3.top;
        return rect3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r10 != 7) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f1(int i2, float f2, float f3) {
        float f4;
        if (this.F1 == null || this.T1 == f2) {
            return;
        }
        this.e2 = true;
        this.Q1 = getNanoTime();
        this.R1 = this.F1.t() / 1000.0f;
        this.V1 = f2;
        this.X1 = true;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 != 6) {
                    }
                } else if (t1(f3, this.T1, this.F1.C())) {
                    this.g2.b(f3, this.T1, this.F1.C());
                    this.G1 = this.g2;
                } else {
                    this.f2.b(this.T1, f2, f3, this.R1, this.F1.C(), this.F1.D());
                    this.I1 = 0.0f;
                    int i4 = this.K1;
                    this.V1 = f2;
                    this.K1 = i4;
                    this.G1 = this.f2;
                }
            } else {
                this.g2.b(f3, this.T1, this.F1.C());
                this.G1 = this.g2;
            }
            this.W1 = false;
            this.Q1 = getNanoTime();
            invalidate();
        }
        if (i2 != 1 && i2 != 7) {
            f4 = (i2 == 2 || i2 == 6) ? 1.0f : 1.0f;
        } else {
            f4 = 0.0f;
        }
        if (this.F1.n() == 0) {
            this.f2.b(this.T1, f4, f3, this.R1, this.F1.C(), this.F1.D());
        } else {
            this.f2.f(this.T1, f4, f3, this.F1.K(), this.F1.L(), this.F1.J(), this.F1.M(), this.F1.I());
        }
        int i5 = this.K1;
        this.V1 = f4;
        this.K1 = i5;
        this.G1 = this.f2;
        this.W1 = false;
        this.Q1 = getNanoTime();
        invalidate();
    }

    public void g1(float f2, float f3) {
        if (this.F1 == null || this.T1 == f2) {
            return;
        }
        this.e2 = true;
        this.Q1 = getNanoTime();
        this.R1 = this.F1.t() / 1000.0f;
        this.V1 = f2;
        this.X1 = true;
        this.f2.f(this.T1, f2, f3, this.F1.K(), this.F1.L(), this.F1.J(), this.F1.M(), this.F1.I());
        int i2 = this.K1;
        this.V1 = f2;
        this.K1 = i2;
        this.G1 = this.f2;
        this.W1 = false;
        this.Q1 = getNanoTime();
        invalidate();
    }

    public int[] getConstraintSetIds() {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 == null) {
            return null;
        }
        return c8590ol1.r();
    }

    public int getCurrentState() {
        return this.K1;
    }

    public ArrayList<C8590ol1.b> getDefinedTransitions() {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 == null) {
            return null;
        }
        return c8590ol1.s();
    }

    public A20 getDesignTool() {
        if (this.h2 == null) {
            this.h2 = new A20(this);
        }
        return this.h2;
    }

    public int getEndState() {
        return this.L1;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.T1;
    }

    public C8590ol1 getScene() {
        return this.F1;
    }

    public int getStartState() {
        return this.J1;
    }

    public float getTargetPosition() {
        return this.V1;
    }

    public Bundle getTransitionState() {
        if (this.N2 == null) {
            this.N2 = new j();
        }
        this.N2.c();
        return this.N2.b();
    }

    public long getTransitionTimeMs() {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            this.R1 = c8590ol1.t() / 1000.0f;
        }
        return this.R1 * 1000.0f;
    }

    public float getVelocity() {
        return this.I1;
    }

    public void h1() {
        l0(1.0f);
        this.O2 = null;
    }

    public void i1(Runnable runnable) {
        l0(1.0f);
        this.O2 = runnable;
    }

    public void j1() {
        l0(0.0f);
    }

    public void k0(k kVar) {
        if (this.w2 == null) {
            this.w2 = new CopyOnWriteArrayList<>();
        }
        this.w2.add(kVar);
    }

    public void k1(Runnable runnable) {
        l0(0.0f);
        this.O2 = runnable;
    }

    public void l0(float f2) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            float f3 = this.T1;
            float f4 = this.S1;
            if (f3 != f4 && this.W1) {
                this.T1 = f4;
            }
            float f5 = this.T1;
            if (f5 == f2) {
                return;
            }
            this.e2 = false;
            this.V1 = f2;
            this.R1 = c8590ol1.t() / 1000.0f;
            setProgress(this.V1);
            this.G1 = null;
            this.H1 = this.F1.x();
            this.W1 = false;
            this.Q1 = getNanoTime();
            this.X1 = true;
            this.S1 = f5;
            this.T1 = f5;
            invalidate();
        }
    }

    public void l1(int i2) {
        if (!isAttachedToWindow()) {
            if (this.N2 == null) {
                this.N2 = new j();
            }
            this.N2.d(i2);
            return;
        }
        n1(i2, -1, -1);
    }

    public boolean m0(int i2, C4523Vk1 c4523Vk1) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            return c8590ol1.h(i2, c4523Vk1);
        }
        return false;
    }

    public void m1(int i2, int i4) {
        if (!isAttachedToWindow()) {
            if (this.N2 == null) {
                this.N2 = new j();
            }
            this.N2.d(i2);
            return;
        }
        o1(i2, -1, -1, i4);
    }

    @Override // o.InterfaceC9827tp1
    public void n(View view, View view2, int i2, int i4) {
        this.q2 = getNanoTime();
        this.r2 = 0.0f;
        this.o2 = 0.0f;
        this.p2 = 0.0f;
    }

    public final boolean n0(View view, MotionEvent motionEvent, float f2, float f3) {
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            motionEvent.offsetLocation(f2, f3);
            boolean onTouchEvent = view.onTouchEvent(motionEvent);
            motionEvent.offsetLocation(-f2, -f3);
            return onTouchEvent;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(f2, f3);
        if (this.e3 == null) {
            this.e3 = new Matrix();
        }
        matrix.invert(this.e3);
        obtain.transform(this.e3);
        boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }

    public void n1(int i2, int i4, int i5) {
        o1(i2, i4, i5, -1);
    }

    @Override // o.InterfaceC9827tp1
    public void o(View view, int i2) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            float f2 = this.r2;
            if (f2 != 0.0f) {
                c8590ol1.f0(this.o2 / f2, this.p2 / f2);
            }
        }
    }

    public final void o0() {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 == null) {
            Log.e(o3, "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        int O = c8590ol1.O();
        C8590ol1 c8590ol12 = this.F1;
        p0(O, c8590ol12.o(c8590ol12.O()));
        SparseIntArray sparseIntArray = new SparseIntArray();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        Iterator<C8590ol1.b> it = this.F1.s().iterator();
        while (it.hasNext()) {
            C8590ol1.b next = it.next();
            if (next == this.F1.c) {
                Log.v(o3, "CHECK: CURRENT");
            }
            q0(next);
            int I = next.I();
            int B = next.B();
            String i2 = AV.i(getContext(), I);
            String i4 = AV.i(getContext(), B);
            if (sparseIntArray.get(I) == B) {
                Log.e(o3, "CHECK: two transitions with the same start and end " + i2 + "->" + i4);
            }
            if (sparseIntArray2.get(B) == I) {
                Log.e(o3, "CHECK: you can't have reverse transitions" + i2 + "->" + i4);
            }
            sparseIntArray.put(I, B);
            sparseIntArray2.put(B, I);
            if (this.F1.o(I) == null) {
                Log.e(o3, " no such constraintSetStart " + i2);
            }
            if (this.F1.o(B) == null) {
                Log.e(o3, " no such constraintSetEnd " + i2);
            }
        }
    }

    public void o1(int i2, int i4, int i5, int i6) {
        androidx.constraintlayout.widget.m mVar;
        int a2;
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null && (mVar = c8590ol1.b) != null && (a2 = mVar.a(this.K1, i2, i4, i5)) != -1) {
            i2 = a2;
        }
        int i7 = this.K1;
        if (i7 != i2) {
            if (this.J1 == i2) {
                l0(0.0f);
                if (i6 > 0) {
                    this.R1 = i6 / 1000.0f;
                }
            } else if (this.L1 == i2) {
                l0(1.0f);
                if (i6 > 0) {
                    this.R1 = i6 / 1000.0f;
                }
            } else {
                this.L1 = i2;
                if (i7 != -1) {
                    c1(i7, i2);
                    l0(1.0f);
                    this.T1 = 0.0f;
                    h1();
                    if (i6 > 0) {
                        this.R1 = i6 / 1000.0f;
                        return;
                    }
                    return;
                }
                this.e2 = false;
                this.V1 = 1.0f;
                this.S1 = 0.0f;
                this.T1 = 0.0f;
                this.U1 = getNanoTime();
                this.Q1 = getNanoTime();
                this.W1 = false;
                this.G1 = null;
                if (i6 == -1) {
                    this.R1 = this.F1.t() / 1000.0f;
                }
                this.J1 = -1;
                this.F1.o0(-1, this.L1);
                SparseArray sparseArray = new SparseArray();
                if (i6 == 0) {
                    this.R1 = this.F1.t() / 1000.0f;
                } else if (i6 > 0) {
                    this.R1 = i6 / 1000.0f;
                }
                int childCount = getChildCount();
                this.P1.clear();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    this.P1.put(childAt, new C4523Vk1(childAt));
                    sparseArray.put(childAt.getId(), this.P1.get(childAt));
                }
                this.X1 = true;
                this.a3.h(this.a1, null, this.F1.o(i2));
                X0();
                this.a3.a();
                s0();
                int width = getWidth();
                int height = getHeight();
                if (this.v2 != null) {
                    for (int i9 = 0; i9 < childCount; i9++) {
                        C4523Vk1 c4523Vk1 = this.P1.get(getChildAt(i9));
                        if (c4523Vk1 != null) {
                            this.F1.z(c4523Vk1);
                        }
                    }
                    Iterator<C4814Yk1> it = this.v2.iterator();
                    while (it.hasNext()) {
                        it.next().f(this, this.P1);
                    }
                    for (int i10 = 0; i10 < childCount; i10++) {
                        C4523Vk1 c4523Vk12 = this.P1.get(getChildAt(i10));
                        if (c4523Vk12 != null) {
                            c4523Vk12.a0(width, height, this.R1, getNanoTime());
                        }
                    }
                } else {
                    for (int i11 = 0; i11 < childCount; i11++) {
                        C4523Vk1 c4523Vk13 = this.P1.get(getChildAt(i11));
                        if (c4523Vk13 != null) {
                            this.F1.z(c4523Vk13);
                            c4523Vk13.a0(width, height, this.R1, getNanoTime());
                        }
                    }
                }
                float N = this.F1.N();
                if (N != 0.0f) {
                    float f2 = Float.MAX_VALUE;
                    float f3 = -3.4028235E38f;
                    for (int i12 = 0; i12 < childCount; i12++) {
                        C4523Vk1 c4523Vk14 = this.P1.get(getChildAt(i12));
                        float u = c4523Vk14.u() + c4523Vk14.t();
                        f2 = Math.min(f2, u);
                        f3 = Math.max(f3, u);
                    }
                    for (int i13 = 0; i13 < childCount; i13++) {
                        C4523Vk1 c4523Vk15 = this.P1.get(getChildAt(i13));
                        float t = c4523Vk15.t();
                        float u2 = c4523Vk15.u();
                        c4523Vk15.f648o = 1.0f / (1.0f - N);
                        c4523Vk15.n = N - ((((t + u2) - f2) * N) / (f3 - f2));
                    }
                }
                this.S1 = 0.0f;
                this.T1 = 0.0f;
                this.X1 = true;
                invalidate();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C8590ol1.b bVar;
        int i2;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.W2 = display.getRotation();
        }
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null && (i2 = this.K1) != -1) {
            androidx.constraintlayout.widget.e o2 = c8590ol1.o(i2);
            this.F1.i0(this);
            ArrayList<C4814Yk1> arrayList = this.v2;
            if (arrayList != null) {
                Iterator<C4814Yk1> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().j(this);
                }
            }
            if (o2 != null) {
                o2.r(this);
            }
            this.J1 = this.K1;
        }
        U0();
        j jVar = this.N2;
        if (jVar != null) {
            if (this.Y2) {
                post(new d());
                return;
            } else {
                jVar.a();
                return;
            }
        }
        C8590ol1 c8590ol12 = this.F1;
        if (c8590ol12 != null && (bVar = c8590ol12.c) != null && bVar.z() == 4) {
            h1();
            setState(l.SETUP);
            setState(l.MOVING);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C4742Xq2 J;
        int s;
        RectF r;
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null && this.O1) {
            C8481oI2 c8481oI2 = c8590ol1.r;
            if (c8481oI2 != null) {
                c8481oI2.l(motionEvent);
            }
            C8590ol1.b bVar = this.F1.c;
            if (bVar != null && bVar.K() && (J = bVar.J()) != null && ((motionEvent.getAction() != 0 || (r = J.r(this, new RectF())) == null || r.contains(motionEvent.getX(), motionEvent.getY())) && (s = J.s()) != -1)) {
                View view = this.d3;
                if (view == null || view.getId() != s) {
                    this.d3 = findViewById(s);
                }
                View view2 = this.d3;
                if (view2 != null) {
                    this.c3.set(view2.getLeft(), this.d3.getTop(), this.d3.getRight(), this.d3.getBottom());
                    if (this.c3.contains(motionEvent.getX(), motionEvent.getY()) && !L0(this.d3.getLeft(), this.d3.getTop(), this.d3, motionEvent)) {
                        return onTouchEvent(motionEvent);
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i4, int i5, int i6) {
        C7114il1 c7114il1;
        this.M2 = true;
        try {
            if (this.F1 == null) {
                super.onLayout(z, i2, i4, i5, i6);
                this.M2 = false;
                return;
            }
            c7114il1 = this;
            int i7 = i5 - i2;
            int i8 = i6 - i4;
            try {
                if (c7114il1.l2 == i7) {
                    if (c7114il1.m2 != i8) {
                    }
                    c7114il1.l2 = i7;
                    c7114il1.m2 = i8;
                    c7114il1.j2 = i7;
                    c7114il1.k2 = i8;
                    c7114il1.M2 = false;
                }
                X0();
                y0(true);
                c7114il1.l2 = i7;
                c7114il1.m2 = i8;
                c7114il1.j2 = i7;
                c7114il1.k2 = i8;
                c7114il1.M2 = false;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                c7114il1.M2 = false;
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            c7114il1 = this;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i2, int i4) {
        boolean z;
        int i5;
        int i6;
        if (this.F1 == null) {
            super.onMeasure(i2, i4);
            return;
        }
        boolean z2 = false;
        if (this.M1 == i2 && this.N1 == i4) {
            z = false;
        } else {
            z = true;
        }
        if (this.b3) {
            this.b3 = false;
            U0();
            V0();
            z = true;
        }
        if (this.f1) {
            z = true;
        }
        this.M1 = i2;
        this.N1 = i4;
        int O = this.F1.O();
        int u = this.F1.u();
        if ((z || this.a3.i(O, u)) && this.J1 != -1) {
            super.onMeasure(i2, i4);
            this.a3.h(this.a1, this.F1.o(O), this.F1.o(u));
            this.a3.k();
            this.a3.l(O, u);
        } else {
            if (z) {
                super.onMeasure(i2, i4);
            }
            z2 = true;
        }
        if (this.D2 || z2) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int m0 = this.a1.m0() + getPaddingLeft() + getPaddingRight();
            int D = this.a1.D() + paddingTop;
            int i7 = this.I2;
            if (i7 == Integer.MIN_VALUE || i7 == 0) {
                m0 = (int) (this.E2 + (this.K2 * (this.G2 - i5)));
                requestLayout();
            }
            int i8 = this.J2;
            if (i8 == Integer.MIN_VALUE || i8 == 0) {
                D = (int) (this.F2 + (this.K2 * (this.H2 - i6)));
                requestLayout();
            }
            setMeasuredDimension(m0, D);
        }
        z0();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onNestedFling(View view, float f2, float f3, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, o.InterfaceC10313vp1
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            c8590ol1.n0(z());
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null && this.O1 && c8590ol1.s0()) {
            C8590ol1.b bVar = this.F1.c;
            if (bVar != null && !bVar.K()) {
                return super.onTouchEvent(motionEvent);
            }
            this.F1.g0(motionEvent, getCurrentState(), this);
            if (this.F1.c.L(4)) {
                return this.F1.c.J().t();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof C4814Yk1) {
            C4814Yk1 c4814Yk1 = (C4814Yk1) view;
            if (this.w2 == null) {
                this.w2 = new CopyOnWriteArrayList<>();
            }
            this.w2.add(c4814Yk1);
            if (c4814Yk1.g()) {
                if (this.t2 == null) {
                    this.t2 = new ArrayList<>();
                }
                this.t2.add(c4814Yk1);
            }
            if (c4814Yk1.h()) {
                if (this.u2 == null) {
                    this.u2 = new ArrayList<>();
                }
                this.u2.add(c4814Yk1);
            }
            if (c4814Yk1.k()) {
                if (this.v2 == null) {
                    this.v2 = new ArrayList<>();
                }
                this.v2.add(c4814Yk1);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<C4814Yk1> arrayList = this.t2;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<C4814Yk1> arrayList2 = this.u2;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // o.InterfaceC9827tp1
    public void p(View view, int i2, int i4, int[] iArr, int i5) {
        C8590ol1.b bVar;
        C4742Xq2 J;
        int s;
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null && (bVar = c8590ol1.c) != null && bVar.K()) {
            int i6 = -1;
            if (!bVar.K() || (J = bVar.J()) == null || (s = J.s()) == -1 || view.getId() == s) {
                if (c8590ol1.E()) {
                    C4742Xq2 J2 = bVar.J();
                    if (J2 != null && (J2.f() & 4) != 0) {
                        i6 = i4;
                    }
                    float f2 = this.S1;
                    if ((f2 == 1.0f || f2 == 0.0f) && view.canScrollVertically(i6)) {
                        return;
                    }
                }
                if (bVar.J() != null && (bVar.J().f() & 1) != 0) {
                    float G = c8590ol1.G(i2, i4);
                    float f3 = this.T1;
                    if ((f3 <= 0.0f && G < 0.0f) || (f3 >= 1.0f && G > 0.0f)) {
                        view.setNestedScrollingEnabled(false);
                        view.post(new c(view));
                        return;
                    }
                }
                float f4 = this.S1;
                long nanoTime = getNanoTime();
                float f5 = i2;
                this.o2 = f5;
                float f6 = i4;
                this.p2 = f6;
                this.r2 = (float) ((nanoTime - this.q2) * 1.0E-9d);
                this.q2 = nanoTime;
                c8590ol1.e0(f5, f6);
                if (f4 != this.S1) {
                    iArr[0] = i2;
                    iArr[1] = i4;
                }
                y0(false);
                if (iArr[0] != 0 || iArr[1] != 0) {
                    this.n2 = true;
                }
            }
        }
    }

    public final void p0(int i2, androidx.constraintlayout.widget.e eVar) {
        View childAt;
        String i4 = AV.i(getContext(), i2);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            int id = getChildAt(i5).getId();
            if (id == -1) {
                Log.w(o3, "CHECK: " + i4 + " ALL VIEWS SHOULD HAVE ID's " + childAt.getClass().getName() + " does not!");
            }
            if (eVar.k0(id) == null) {
                Log.w(o3, "CHECK: " + i4 + " NO CONSTRAINTS for " + AV.k(childAt));
            }
        }
        int[] o0 = eVar.o0();
        for (int i6 = 0; i6 < o0.length; i6++) {
            int i7 = o0[i6];
            String i8 = AV.i(getContext(), i7);
            if (findViewById(o0[i6]) == null) {
                Log.w(o3, "CHECK: " + i4 + " NO View matches id " + i8);
            }
            if (eVar.n0(i7) == -1) {
                Log.w(o3, "CHECK: " + i4 + C9811tl1.c + i8 + ") no LAYOUT_HEIGHT");
            }
            if (eVar.v0(i7) == -1) {
                Log.w(o3, "CHECK: " + i4 + C9811tl1.c + i8 + ") no LAYOUT_HEIGHT");
            }
        }
    }

    public void p1() {
        this.a3.h(this.a1, this.F1.o(this.J1), this.F1.o(this.L1));
        X0();
    }

    public final void q0(C8590ol1.b bVar) {
        if (bVar.I() == bVar.B()) {
            Log.e(o3, "CHECK: start and end constraint set should not be the same!");
        }
    }

    public void q1(int i2, androidx.constraintlayout.widget.e eVar) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            c8590ol1.k0(i2, eVar);
        }
        p1();
        if (this.K1 == i2) {
            eVar.r(this);
        }
    }

    public androidx.constraintlayout.widget.e r0(int i2) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 == null) {
            return null;
        }
        androidx.constraintlayout.widget.e o2 = c8590ol1.o(i2);
        androidx.constraintlayout.widget.e eVar = new androidx.constraintlayout.widget.e();
        eVar.I(o2);
        return eVar;
    }

    public void r1(int i2, androidx.constraintlayout.widget.e eVar, int i4) {
        if (this.F1 != null && this.K1 == i2) {
            int i5 = j.b.view_transition;
            q1(i5, F0(i2));
            J(i5, -1, -1);
            q1(i2, eVar);
            C8590ol1.b bVar = new C8590ol1.b(-1, this.F1, i5, i2);
            bVar.O(i4);
            setTransition(bVar);
            h1();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        C8590ol1 c8590ol1;
        C8590ol1.b bVar;
        if (!this.D2 && this.K1 == -1 && (c8590ol1 = this.F1) != null && (bVar = c8590ol1.c) != null) {
            int E = bVar.E();
            if (E != 0) {
                if (E == 2) {
                    int childCount = getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        this.P1.get(getChildAt(i2)).P();
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    @Override // o.InterfaceC10070up1
    public void s(View view, int i2, int i4, int i5, int i6, int i7, int[] iArr) {
        if (this.n2 || i2 != 0 || i4 != 0) {
            iArr[0] = iArr[0] + i5;
            iArr[1] = iArr[1] + i6;
        }
        this.n2 = false;
    }

    public final void s0() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C4523Vk1 c4523Vk1 = this.P1.get(childAt);
            if (c4523Vk1 != null) {
                c4523Vk1.V(childAt);
            }
        }
    }

    public void s1(int i2, View... viewArr) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            c8590ol1.u0(i2, viewArr);
        } else {
            Log.e(o3, " no motionScene");
        }
    }

    public void setDebugMode(int i2) {
        this.c2 = i2;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z) {
        this.Y2 = z;
    }

    public void setInteractionEnabled(boolean z) {
        this.O1 = z;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.F1 != null) {
            setState(l.MOVING);
            Interpolator x = this.F1.x();
            if (x != null) {
                setProgress(x.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<C4814Yk1> arrayList = this.u2;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.u2.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<C4814Yk1> arrayList = this.t2;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.t2.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i2 < 0 || f2 > 1.0f) {
            Log.w(o3, "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.N2 == null) {
                this.N2 = new j();
            }
            this.N2.e(f2);
            return;
        }
        if (i2 <= 0) {
            if (this.T1 == 1.0f && this.K1 == this.L1) {
                setState(l.MOVING);
            }
            this.K1 = this.J1;
            if (this.T1 == 0.0f) {
                setState(l.FINISHED);
            }
        } else if (f2 >= 1.0f) {
            if (this.T1 == 0.0f && this.K1 == this.J1) {
                setState(l.MOVING);
            }
            this.K1 = this.L1;
            if (this.T1 == 1.0f) {
                setState(l.FINISHED);
            }
        } else {
            this.K1 = -1;
            setState(l.MOVING);
        }
        if (this.F1 == null) {
            return;
        }
        this.W1 = true;
        this.V1 = f2;
        this.S1 = f2;
        this.U1 = -1L;
        this.Q1 = -1L;
        this.G1 = null;
        this.X1 = true;
        invalidate();
    }

    public void setScene(C8590ol1 c8590ol1) {
        this.F1 = c8590ol1;
        c8590ol1.n0(z());
        X0();
    }

    public void setStartState(int i2) {
        if (!isAttachedToWindow()) {
            if (this.N2 == null) {
                this.N2 = new j();
            }
            this.N2.f(i2);
            this.N2.d(i2);
            return;
        }
        this.K1 = i2;
    }

    public void setState(l lVar) {
        l lVar2 = l.FINISHED;
        if (lVar != lVar2 || this.K1 != -1) {
            l lVar3 = this.Z2;
            this.Z2 = lVar;
            l lVar4 = l.MOVING;
            if (lVar3 == lVar4 && lVar == lVar4) {
                A0();
            }
            int ordinal = lVar3.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal == 2 && lVar == lVar2) {
                    B0();
                    return;
                }
                return;
            }
            if (lVar == lVar4) {
                A0();
            }
            if (lVar == lVar2) {
                B0();
            }
        }
    }

    public void setTransition(int i2) {
        float f2;
        if (this.F1 != null) {
            C8590ol1.b J0 = J0(i2);
            this.J1 = J0.I();
            this.L1 = J0.B();
            if (!isAttachedToWindow()) {
                if (this.N2 == null) {
                    this.N2 = new j();
                }
                this.N2.f(this.J1);
                this.N2.d(this.L1);
                return;
            }
            int i4 = this.K1;
            if (i4 == this.J1) {
                f2 = 0.0f;
            } else {
                f2 = i4 == this.L1 ? 1.0f : Float.NaN;
            }
            this.F1.p0(J0);
            this.a3.h(this.a1, this.F1.o(this.J1), this.F1.o(this.L1));
            X0();
            if (this.T1 != f2) {
                if (f2 == 0.0f) {
                    x0(true);
                    this.F1.o(this.J1).r(this);
                } else if (f2 == 1.0f) {
                    x0(false);
                    this.F1.o(this.L1).r(this);
                }
            }
            this.T1 = Float.isNaN(f2) ? 0.0f : f2;
            if (Float.isNaN(f2)) {
                Log.v(o3, AV.g() + " transitionToStart ");
                j1();
                return;
            }
            setProgress(f2);
        }
    }

    public void setTransitionDuration(int i2) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 == null) {
            Log.e(o3, "MotionScene not defined");
        } else {
            c8590ol1.l0(i2);
        }
    }

    public void setTransitionListener(k kVar) {
        this.Z1 = kVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.N2 == null) {
            this.N2 = new j();
        }
        this.N2.g(bundle);
        if (isAttachedToWindow()) {
            this.N2.a();
        }
    }

    public final void t0() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            Log.v(o3, C4500Ve2.b + AV.g() + C4500Ve2.b + AV.k(this) + C4500Ve2.b + AV.i(getContext(), this.K1) + C4500Ve2.b + AV.k(childAt) + childAt.getLeft() + C4500Ve2.b + childAt.getTop());
        }
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return AV.i(context, this.J1) + "->" + AV.i(context, this.L1) + " (pos:" + this.T1 + " Dpos/Dt:" + this.I1;
    }

    @Override // o.InterfaceC9827tp1
    public boolean u(View view, View view2, int i2, int i4) {
        C8590ol1.b bVar;
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null && (bVar = c8590ol1.c) != null && bVar.J() != null && (this.F1.c.J().f() & 2) == 0) {
            return true;
        }
        return false;
    }

    public void u0(boolean z) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 == null) {
            return;
        }
        c8590ol1.k(z);
    }

    public void v0(int i2, boolean z) {
        C8590ol1.b J0 = J0(i2);
        if (z) {
            J0.P(true);
            return;
        }
        C8590ol1 c8590ol1 = this.F1;
        if (J0 == c8590ol1.c) {
            Iterator<C8590ol1.b> it = c8590ol1.R(this.K1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C8590ol1.b next = it.next();
                if (next.K()) {
                    this.F1.c = next;
                    break;
                }
            }
        }
        J0.P(false);
    }

    public void w0(int i2, boolean z) {
        C8590ol1 c8590ol1 = this.F1;
        if (c8590ol1 != null) {
            c8590ol1.l(i2, z);
        }
    }

    public void x0(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C4523Vk1 c4523Vk1 = this.P1.get(getChildAt(i2));
            if (c4523Vk1 != null) {
                c4523Vk1.i(z);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y0(boolean z) {
        float f2;
        boolean z2;
        boolean z4;
        int childCount;
        Interpolator interpolator;
        float interpolation;
        Interpolator interpolator2;
        int i2;
        boolean z5;
        int i4;
        if (this.U1 == -1) {
            this.U1 = getNanoTime();
        }
        float f3 = this.T1;
        if (f3 > 0.0f && f3 < 1.0f) {
            this.K1 = -1;
        }
        boolean z6 = true;
        boolean z7 = false;
        if (this.s2 || (this.X1 && (z || this.V1 != f3))) {
            float signum = Math.signum(this.V1 - f3);
            long nanoTime = getNanoTime();
            Interpolator interpolator3 = this.G1;
            if (!(interpolator3 instanceof Abstractanimation.InterpolatorC5161al1)) {
                f2 = ((((float) (nanoTime - this.U1)) * signum) * 1.0E-9f) / this.R1;
            } else {
                f2 = 0.0f;
            }
            float f4 = this.T1 + f2;
            if (this.W1) {
                f4 = this.V1;
            }
            int i5 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
            if ((i5 > 0 && f4 >= this.V1) || (signum <= 0.0f && f4 <= this.V1)) {
                f4 = this.V1;
                this.X1 = false;
                z2 = true;
            } else {
                z2 = false;
            }
            this.T1 = f4;
            this.S1 = f4;
            this.U1 = nanoTime;
            if (interpolator3 != null && !z2) {
                if (this.e2) {
                    float interpolation2 = interpolator3.getInterpolation(((float) (nanoTime - this.Q1)) * 1.0E-9f);
                    Interpolator interpolator4 = this.G1;
                    C5130ad2 c5130ad2 = this.f2;
                    if (interpolator4 == c5130ad2) {
                        if (c5130ad2.e()) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                    } else {
                        z4 = false;
                    }
                    this.T1 = interpolation2;
                    this.U1 = nanoTime;
                    Interpolator interpolator5 = this.G1;
                    if (interpolator5 instanceof Abstractanimation.InterpolatorC5161al1) {
                        float a2 = ((Abstractanimation.InterpolatorC5161al1) interpolator5).a();
                        this.I1 = a2;
                        if (Math.abs(a2) * this.R1 <= 1.0E-5f && z4) {
                            this.X1 = false;
                        }
                        if (a2 > 0.0f && interpolation2 >= 1.0f) {
                            this.T1 = 1.0f;
                            this.X1 = false;
                            interpolation2 = 1.0f;
                        }
                        if (a2 < 0.0f && interpolation2 <= 0.0f) {
                            this.T1 = 0.0f;
                            this.X1 = false;
                            f4 = 0.0f;
                            if (Math.abs(this.I1) > 1.0E-5f) {
                                setState(l.MOVING);
                            }
                            if (!z4) {
                                if ((i5 > 0 && f4 >= this.V1) || (signum <= 0.0f && f4 <= this.V1)) {
                                    f4 = this.V1;
                                    this.X1 = false;
                                }
                                if (f4 >= 1.0f || f4 <= 0.0f) {
                                    this.X1 = false;
                                    setState(l.FINISHED);
                                }
                            }
                            childCount = getChildCount();
                            this.s2 = false;
                            long nanoTime2 = getNanoTime();
                            this.K2 = f4;
                            interpolator = this.H1;
                            if (interpolator == null) {
                                interpolation = f4;
                            } else {
                                interpolation = interpolator.getInterpolation(f4);
                            }
                            interpolator2 = this.H1;
                            if (interpolator2 != null) {
                                float interpolation3 = interpolator2.getInterpolation((signum / this.R1) + f4);
                                this.I1 = interpolation3;
                                this.I1 = interpolation3 - this.H1.getInterpolation(f4);
                            }
                            for (i2 = 0; i2 < childCount; i2++) {
                                View childAt = getChildAt(i2);
                                C4523Vk1 c4523Vk1 = this.P1.get(childAt);
                                if (c4523Vk1 != null) {
                                    this.s2 |= c4523Vk1.L(childAt, interpolation, nanoTime2, this.L2);
                                }
                            }
                            if ((i5 <= 0 && f4 >= this.V1) || (signum <= 0.0f && f4 <= this.V1)) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (!this.s2 && !this.X1 && z5) {
                                setState(l.FINISHED);
                            }
                            if (this.D2) {
                                requestLayout();
                            }
                            this.s2 = (!z5) | this.s2;
                            if (f4 <= 0.0f && (i4 = this.J1) != -1 && this.K1 != i4) {
                                this.K1 = i4;
                                this.F1.o(i4).p(this);
                                setState(l.FINISHED);
                                z7 = true;
                            }
                            if (f4 >= 1.0d) {
                                int i6 = this.K1;
                                int i7 = this.L1;
                                if (i6 != i7) {
                                    this.K1 = i7;
                                    this.F1.o(i7).p(this);
                                    setState(l.FINISHED);
                                    z7 = true;
                                }
                            }
                            if (this.s2 && !this.X1) {
                                if ((i5 > 0 && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f)) {
                                    setState(l.FINISHED);
                                }
                            } else {
                                invalidate();
                            }
                            if (!this.s2 && !this.X1 && ((i5 > 0 && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f))) {
                                U0();
                            }
                        }
                    }
                    f4 = interpolation2;
                    if (Math.abs(this.I1) > 1.0E-5f) {
                    }
                    if (!z4) {
                    }
                    childCount = getChildCount();
                    this.s2 = false;
                    long nanoTime22 = getNanoTime();
                    this.K2 = f4;
                    interpolator = this.H1;
                    if (interpolator == null) {
                    }
                    interpolator2 = this.H1;
                    if (interpolator2 != null) {
                    }
                    while (i2 < childCount) {
                    }
                    if (i5 <= 0) {
                    }
                    z5 = false;
                    if (!this.s2) {
                        setState(l.FINISHED);
                    }
                    if (this.D2) {
                    }
                    this.s2 = (!z5) | this.s2;
                    if (f4 <= 0.0f) {
                        this.K1 = i4;
                        this.F1.o(i4).p(this);
                        setState(l.FINISHED);
                        z7 = true;
                    }
                    if (f4 >= 1.0d) {
                    }
                    if (this.s2) {
                    }
                    invalidate();
                    if (!this.s2) {
                        U0();
                    }
                } else {
                    float interpolation4 = interpolator3.getInterpolation(f4);
                    Interpolator interpolator6 = this.G1;
                    if (interpolator6 instanceof Abstractanimation.InterpolatorC5161al1) {
                        this.I1 = ((Abstractanimation.InterpolatorC5161al1) interpolator6).a();
                    } else {
                        this.I1 = ((interpolator6.getInterpolation(f4 + f2) - interpolation4) * signum) / f2;
                    }
                    f4 = interpolation4;
                }
            } else {
                this.I1 = f2;
            }
            z4 = false;
            if (Math.abs(this.I1) > 1.0E-5f) {
            }
            if (!z4) {
            }
            childCount = getChildCount();
            this.s2 = false;
            long nanoTime222 = getNanoTime();
            this.K2 = f4;
            interpolator = this.H1;
            if (interpolator == null) {
            }
            interpolator2 = this.H1;
            if (interpolator2 != null) {
            }
            while (i2 < childCount) {
            }
            if (i5 <= 0) {
            }
            z5 = false;
            if (!this.s2) {
            }
            if (this.D2) {
            }
            this.s2 = (!z5) | this.s2;
            if (f4 <= 0.0f) {
            }
            if (f4 >= 1.0d) {
            }
            if (this.s2) {
            }
            invalidate();
            if (!this.s2) {
            }
        }
        float f5 = this.T1;
        if (f5 >= 1.0f) {
            int i8 = this.K1;
            int i9 = this.L1;
            if (i8 == i9) {
                z6 = z7;
            }
            this.K1 = i9;
        } else {
            if (f5 <= 0.0f) {
                int i10 = this.K1;
                int i11 = this.J1;
                if (i10 == i11) {
                    z6 = z7;
                }
                this.K1 = i11;
            }
            this.b3 |= z7;
            if (z7 && !this.M2) {
                requestLayout();
            }
            this.S1 = this.T1;
        }
        z7 = z6;
        this.b3 |= z7;
        if (z7) {
            requestLayout();
        }
        this.S1 = this.T1;
    }

    public final void z0() {
        float f2;
        boolean z;
        float signum = Math.signum(this.V1 - this.T1);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.G1;
        if (!(interpolator instanceof C5130ad2)) {
            f2 = ((((float) (nanoTime - this.U1)) * signum) * 1.0E-9f) / this.R1;
        } else {
            f2 = 0.0f;
        }
        float f3 = this.T1 + f2;
        if (this.W1) {
            f3 = this.V1;
        }
        int i2 = (signum > 0.0f ? 1 : (signum == 0.0f ? 0 : -1));
        if ((i2 > 0 && f3 >= this.V1) || (signum <= 0.0f && f3 <= this.V1)) {
            f3 = this.V1;
            z = true;
        } else {
            z = false;
        }
        if (interpolator != null && !z) {
            if (this.e2) {
                f3 = interpolator.getInterpolation(((float) (nanoTime - this.Q1)) * 1.0E-9f);
            } else {
                f3 = interpolator.getInterpolation(f3);
            }
        }
        if ((i2 > 0 && f3 >= this.V1) || (signum <= 0.0f && f3 <= this.V1)) {
            f3 = this.V1;
        }
        this.K2 = f3;
        int childCount = getChildCount();
        long nanoTime2 = getNanoTime();
        Interpolator interpolator2 = this.H1;
        if (interpolator2 != null) {
            f3 = interpolator2.getInterpolation(f3);
        }
        float f4 = f3;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            C4523Vk1 c4523Vk1 = this.P1.get(childAt);
            if (c4523Vk1 != null) {
                c4523Vk1.L(childAt, f4, nanoTime2, this.L2);
            }
        }
        if (this.D2) {
            requestLayout();
        }
    }

    public void setTransition(C8590ol1.b bVar) {
        this.F1.p0(bVar);
        setState(l.SETUP);
        if (this.K1 == this.F1.u()) {
            this.T1 = 1.0f;
            this.S1 = 1.0f;
            this.V1 = 1.0f;
        } else {
            this.T1 = 0.0f;
            this.S1 = 0.0f;
            this.V1 = 0.0f;
        }
        this.U1 = bVar.L(1) ? -1L : getNanoTime();
        int O = this.F1.O();
        int u = this.F1.u();
        if (O == this.J1 && u == this.L1) {
            return;
        }
        this.J1 = O;
        this.L1 = u;
        this.F1.o0(O, u);
        this.a3.h(this.a1, this.F1.o(this.J1), this.F1.o(this.L1));
        this.a3.l(this.J1, this.L1);
        this.a3.k();
        X0();
    }

    public C7114il1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H1 = null;
        this.I1 = 0.0f;
        this.J1 = -1;
        this.K1 = -1;
        this.L1 = -1;
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = true;
        this.P1 = new HashMap<>();
        this.Q1 = 0L;
        this.R1 = 1.0f;
        this.S1 = 0.0f;
        this.T1 = 0.0f;
        this.V1 = 0.0f;
        this.X1 = false;
        this.Y1 = false;
        this.c2 = 0;
        this.e2 = false;
        this.f2 = new C5130ad2();
        this.g2 = new e();
        this.i2 = true;
        this.n2 = false;
        this.s2 = false;
        this.t2 = null;
        this.u2 = null;
        this.v2 = null;
        this.w2 = null;
        this.x2 = 0;
        this.y2 = -1L;
        this.z2 = 0.0f;
        this.A2 = 0;
        this.B2 = 0.0f;
        this.C2 = false;
        this.D2 = false;
        this.L2 = new C8049mX0();
        this.M2 = false;
        this.O2 = null;
        this.P2 = null;
        this.Q2 = 0;
        this.R2 = false;
        this.S2 = 0;
        this.T2 = new HashMap<>();
        this.X2 = new Rect();
        this.Y2 = false;
        this.Z2 = l.UNDEFINED;
        this.a3 = new g();
        this.b3 = false;
        this.c3 = new RectF();
        this.d3 = null;
        this.e3 = null;
        this.f3 = new ArrayList<>();
        M0(attributeSet);
    }

    public C7114il1(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.H1 = null;
        this.I1 = 0.0f;
        this.J1 = -1;
        this.K1 = -1;
        this.L1 = -1;
        this.M1 = 0;
        this.N1 = 0;
        this.O1 = true;
        this.P1 = new HashMap<>();
        this.Q1 = 0L;
        this.R1 = 1.0f;
        this.S1 = 0.0f;
        this.T1 = 0.0f;
        this.V1 = 0.0f;
        this.X1 = false;
        this.Y1 = false;
        this.c2 = 0;
        this.e2 = false;
        this.f2 = new C5130ad2();
        this.g2 = new e();
        this.i2 = true;
        this.n2 = false;
        this.s2 = false;
        this.t2 = null;
        this.u2 = null;
        this.v2 = null;
        this.w2 = null;
        this.x2 = 0;
        this.y2 = -1L;
        this.z2 = 0.0f;
        this.A2 = 0;
        this.B2 = 0.0f;
        this.C2 = false;
        this.D2 = false;
        this.L2 = new C8049mX0();
        this.M2 = false;
        this.O2 = null;
        this.P2 = null;
        this.Q2 = 0;
        this.R2 = false;
        this.S2 = 0;
        this.T2 = new HashMap<>();
        this.X2 = new Rect();
        this.Y2 = false;
        this.Z2 = l.UNDEFINED;
        this.a3 = new g();
        this.b3 = false;
        this.c3 = new RectF();
        this.d3 = null;
        this.e3 = null;
        this.f3 = new ArrayList<>();
        M0(attributeSet);
    }

    @Override // o.InterfaceC9827tp1
    public void t(View view, int i2, int i4, int i5, int i6, int i7) {
    }
}
