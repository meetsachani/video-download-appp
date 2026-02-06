package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;
import o.C10920yI2;
import o.C5600ca;
import o.C7025iN1;
import o.C8801pd1;
import o.C9811tl1;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;
import o.InterfaceC5670cr1;
import o.InterfaceC9397s30;
import o.PK1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ClockHandView extends View {
    public static final int t1 = 200;
    public final int Y0;
    public final TimeInterpolator Z0;
    @InterfaceC5670cr1
    public final ValueAnimator a1;
    public boolean b1;
    public float c1;
    public float d1;
    public boolean e1;
    public final int f1;
    public boolean g1;
    public final List<c> h1;
    public final int i1;
    public final float j1;
    public final Paint k1;
    public final RectF l1;
    @PK1
    public final int m1;
    public float n1;
    public boolean o1;
    public b p1;
    public double q1;
    public int r1;
    public int s1;

    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(@InterfaceC2501Av0(from = 0.0d, to = 360.0d) float f, boolean z);
    }

    /* loaded from: classes3.dex */
    public interface c {
        void d(@InterfaceC2501Av0(from = 0.0d, to = 360.0d) float f, boolean z);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.s(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void b(c cVar) {
        this.h1.add(cVar);
    }

    public final void c(float f, float f2) {
        int i = 2;
        if (C8801pd1.b(getWidth() / 2, getHeight() / 2, f, f2) > i(2) + C10920yI2.i(getContext(), 12)) {
            i = 1;
        }
        this.s1 = i;
    }

    public final void d(Canvas canvas) {
        int i;
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float i2 = i(this.s1);
        float cos = (((float) Math.cos(this.q1)) * i2) + f;
        float f2 = height;
        this.k1.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, (i2 * ((float) Math.sin(this.q1))) + f2, this.i1, this.k1);
        double sin = Math.sin(this.q1);
        double cos2 = Math.cos(this.q1);
        this.k1.setStrokeWidth(this.m1);
        canvas.drawLine(f, f2, width + ((int) (cos2 * r2)), height + ((int) (r2 * sin)), this.k1);
        canvas.drawCircle(f, f2, this.j1, this.k1);
    }

    public int e() {
        return this.s1;
    }

    public RectF f() {
        return this.l1;
    }

    public final int g(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            return degrees + 450;
        }
        return i;
    }

    @InterfaceC2501Av0(from = 0.0d, to = 360.0d)
    public float h() {
        return this.n1;
    }

    @InterfaceC9397s30
    public final int i(int i) {
        if (i == 2) {
            return Math.round(this.r1 * 0.66f);
        }
        return this.r1;
    }

    public int j() {
        return this.i1;
    }

    public final Pair<Float, Float> k(float f) {
        float h = h();
        if (Math.abs(h - f) > 180.0f) {
            if (h > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (h < 180.0f && f > 180.0f) {
                h += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(h), Float.valueOf(f));
    }

    public final boolean l(float f, float f2, boolean z, boolean z2, boolean z3) {
        boolean z4;
        float g = g(f, f2);
        boolean z5 = false;
        if (h() != g) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z2 && z4) {
            return true;
        }
        if (!z4 && !z) {
            return false;
        }
        if (z3 && this.b1) {
            z5 = true;
        }
        r(g, z5);
        return true;
    }

    public final void m() {
        this.a1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ClockHandView.a(ClockHandView.this, valueAnimator);
            }
        });
        this.a1.addListener(new a());
    }

    public void n(boolean z) {
        this.b1 = z;
    }

    public void o(@InterfaceC9397s30 int i) {
        this.r1 = i;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.a1.isRunning()) {
            q(h());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        b bVar;
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z2 = false;
                z = false;
                z3 = false;
            } else {
                int i = (int) (x - this.c1);
                int i2 = (int) (y - this.d1);
                if ((i * i) + (i2 * i2) > this.f1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.e1 = z4;
                z2 = this.o1;
                if (actionMasked == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (this.g1) {
                    c(x, y);
                }
                z3 = z5;
                z = false;
            }
        } else {
            this.c1 = x;
            this.d1 = y;
            this.e1 = true;
            this.o1 = false;
            z = true;
            z2 = false;
            z3 = false;
        }
        boolean l = this.o1 | l(x, y, z2, z, z3);
        this.o1 = l;
        if (l && z3 && (bVar = this.p1) != null) {
            bVar.a(g(x, y), this.e1);
        }
        return true;
    }

    public void p(int i) {
        this.s1 = i;
        invalidate();
    }

    public void q(@InterfaceC2501Av0(from = 0.0d, to = 360.0d) float f) {
        r(f, false);
    }

    public void r(@InterfaceC2501Av0(from = 0.0d, to = 360.0d) float f, boolean z) {
        this.a1.cancel();
        if (!z) {
            s(f, false);
            return;
        }
        Pair<Float, Float> k = k(f);
        this.a1.setFloatValues(((Float) k.first).floatValue(), ((Float) k.second).floatValue());
        this.a1.setDuration(this.Y0);
        this.a1.setInterpolator(this.Z0);
        this.a1.start();
    }

    public final void s(@InterfaceC2501Av0(from = 0.0d, to = 360.0d) float f, boolean z) {
        float f2 = f % 360.0f;
        this.n1 = f2;
        this.q1 = Math.toRadians(f2 - 90.0f);
        float i = i(this.s1);
        float width = (getWidth() / 2) + (((float) Math.cos(this.q1)) * i);
        float height = (getHeight() / 2) + (i * ((float) Math.sin(this.q1)));
        RectF rectF = this.l1;
        int i2 = this.i1;
        rectF.set(width - i2, height - i2, width + i2, height + i2);
        for (c cVar : this.h1) {
            cVar.d(f2, z);
        }
        invalidate();
    }

    public void t(boolean z) {
        if (this.g1 && !z) {
            this.s1 = 1;
        }
        this.g1 = z;
        invalidate();
    }

    public void u(b bVar) {
        this.p1 = bVar;
    }

    public ClockHandView(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.materialClockStyle);
    }

    public ClockHandView(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a1 = new ValueAnimator();
        this.h1 = new ArrayList();
        Paint paint = new Paint();
        this.k1 = paint;
        this.l1 = new RectF();
        this.s1 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.F2, i, C7025iN1.n.Widget_MaterialComponents_TimePicker_Clock);
        this.Y0 = C9811tl1.f(context, C7025iN1.c.motionDurationLong2, 200);
        this.Z0 = C9811tl1.g(context, C7025iN1.c.motionEasingEmphasizedInterpolator, C5600ca.b);
        this.r1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.H2, 0);
        this.i1 = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.I2, 0);
        Resources resources = getResources();
        this.m1 = resources.getDimensionPixelSize(C7025iN1.f.material_clock_hand_stroke_width);
        this.j1 = resources.getDimensionPixelSize(C7025iN1.f.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(C7025iN1.o.G2, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        q(0.0f);
        this.f1 = ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
        m();
    }
}
