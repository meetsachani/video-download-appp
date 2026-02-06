package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import o.C10453wN1;
import o.C10861y4;
import o.C3220Ic;
import o.C4297Tc1;
import o.C6516gH2;
import o.C7025iN1;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;
import o.InterfaceC3329Je2;
import o.InterfaceC5670cr1;
import o.Q3;

/* loaded from: classes3.dex */
class ClockFaceView extends C10453wN1 implements ClockHandView.c {
    public static final float b2 = 0.001f;
    public static final int c2 = 12;
    public static final String d2 = "";
    public final ClockHandView M1;
    public final Rect N1;
    public final RectF O1;
    public final Rect P1;
    public final SparseArray<TextView> Q1;
    public final Q3 R1;
    public final int[] S1;
    public final float[] T1;
    public final int U1;
    public final int V1;
    public final int W1;
    public final int X1;
    public String[] Y1;
    public float Z1;
    public final ColorStateList a2;

    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.Q(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.M1.j()) - ClockFaceView.this.U1);
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public class b extends Q3 {
        public b() {
        }

        @Override // o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            int intValue = ((Integer) view.getTag(C7025iN1.h.material_value_index)).intValue();
            if (intValue > 0) {
                c10861y4.l2((View) ClockFaceView.this.Q1.get(intValue - 1));
            }
            c10861y4.n1(C10861y4.g.j(0, 1, intValue, 1, false, view.isSelected()));
            c10861y4.l1(true);
            c10861y4.b(C10861y4.a.j);
        }

        @Override // o.Q3
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                view.getHitRect(ClockFaceView.this.N1);
                float centerX = ClockFaceView.this.N1.centerX();
                float centerY = ClockFaceView.this.N1.centerY();
                ClockFaceView.this.M1.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
                ClockFaceView.this.M1.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
                return true;
            }
            return super.j(view, i, bundle);
        }
    }

    public ClockFaceView(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static float c0(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    @Override // o.C10453wN1
    public void Q(int i) {
        if (i != P()) {
            super.Q(i);
            this.M1.o(P());
        }
    }

    @Override // o.C10453wN1
    public void S() {
        super.S();
        for (int i = 0; i < this.Q1.size(); i++) {
            this.Q1.get(i).setVisibility(0);
        }
    }

    public final void Y() {
        boolean z;
        RectF f = this.M1.f();
        TextView b0 = b0(f);
        for (int i = 0; i < this.Q1.size(); i++) {
            TextView textView = this.Q1.get(i);
            if (textView != null) {
                if (textView == b0) {
                    z = true;
                } else {
                    z = false;
                }
                textView.setSelected(z);
                textView.getPaint().setShader(a0(f, textView));
                textView.invalidate();
            }
        }
    }

    public int Z() {
        return this.M1.e();
    }

    @InterfaceC11300zs1
    public final RadialGradient a0(RectF rectF, TextView textView) {
        textView.getHitRect(this.N1);
        this.O1.set(this.N1);
        textView.getLineBounds(0, this.P1);
        RectF rectF2 = this.O1;
        Rect rect = this.P1;
        rectF2.inset(rect.left, rect.top);
        if (!RectF.intersects(rectF, this.O1)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.O1.left, rectF.centerY() - this.O1.top, rectF.width() * 0.5f, this.S1, this.T1, Shader.TileMode.CLAMP);
    }

    @InterfaceC11300zs1
    public final TextView b0(RectF rectF) {
        float f = Float.MAX_VALUE;
        TextView textView = null;
        for (int i = 0; i < this.Q1.size(); i++) {
            TextView textView2 = this.Q1.get(i);
            if (textView2 != null) {
                textView2.getHitRect(this.N1);
                this.O1.set(this.N1);
                this.O1.union(rectF);
                float width = this.O1.width() * this.O1.height();
                if (width < f) {
                    textView = textView2;
                    f = width;
                }
            }
        }
        return textView;
    }

    public void c(String[] strArr, @InterfaceC3329Je2 int i) {
        this.Y1 = strArr;
        e0(i);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void d(float f, boolean z) {
        if (Math.abs(this.Z1 - f) > 0.001f) {
            this.Z1 = f;
            Y();
        }
    }

    public void d0(int i) {
        this.M1.p(i);
    }

    public void e(@InterfaceC2501Av0(from = 0.0d, to = 360.0d) float f) {
        this.M1.q(f);
        Y();
    }

    public final void e0(@InterfaceC3329Je2 int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.Q1.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.Y1.length, size); i2++) {
            TextView textView = this.Q1.get(i2);
            if (i2 >= this.Y1.length) {
                removeView(textView);
                this.Q1.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C7025iN1.k.material_clockface_textview, (ViewGroup) this, false);
                    this.Q1.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.Y1[i2]);
                textView.setTag(C7025iN1.h.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(C7025iN1.h.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                C6516gH2.I1(textView, this.R1);
                textView.setTextColor(this.a2);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.Y1[i2]));
                }
            }
        }
        this.M1.t(z);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC5670cr1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C10861y4.t2(accessibilityNodeInfo).m1(C10861y4.f.h(1, this.Y1.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Y();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int c0 = (int) (this.X1 / c0(this.V1 / displayMetrics.heightPixels, this.W1 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0, 1073741824);
        setMeasuredDimension(c0, c0);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public ClockFaceView(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.N1 = new Rect();
        this.O1 = new RectF();
        this.P1 = new Rect();
        this.Q1 = new SparseArray<>();
        this.T1 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7025iN1.o.C2, i, C7025iN1.n.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a2 = C4297Tc1.a(context, obtainStyledAttributes, C7025iN1.o.E2);
        this.a2 = a2;
        LayoutInflater.from(context).inflate(C7025iN1.k.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C7025iN1.h.material_clock_hand);
        this.M1 = clockHandView;
        this.U1 = resources.getDimensionPixelSize(C7025iN1.f.material_clock_hand_padding);
        int colorForState = a2.getColorForState(new int[]{16842913}, a2.getDefaultColor());
        this.S1 = new int[]{colorForState, colorForState, a2.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = C3220Ic.a(context, C7025iN1.e.material_timepicker_clockface).getDefaultColor();
        ColorStateList a3 = C4297Tc1.a(context, obtainStyledAttributes, C7025iN1.o.D2);
        setBackgroundColor(a3 != null ? a3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(false);
        obtainStyledAttributes.recycle();
        this.R1 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        c(strArr, 0);
        this.V1 = resources.getDimensionPixelSize(C7025iN1.f.material_time_picker_minimum_screen_height);
        this.W1 = resources.getDimensionPixelSize(C7025iN1.f.material_time_picker_minimum_screen_width);
        this.X1 = resources.getDimensionPixelSize(C7025iN1.f.material_clock_size);
    }
}
