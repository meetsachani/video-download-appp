package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o.AbstractC3550Ll;
import o.C10861y4;
import o.C7025iN1;
import o.InterfaceC11270zl;
import o.InterfaceC2461Al;

/* renamed from: o.Ll  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3550Ll<S extends AbstractC3550Ll<S, L, T>, L extends InterfaceC11270zl<S>, T extends InterfaceC2461Al<S>> extends View {
    public static final String R2 = "Ll";
    public static final String S2 = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    public static final String T2 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    public static final String U2 = "valueFrom(%s) must be smaller than valueTo(%s)";
    public static final String V2 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    public static final String W2 = "minSeparation(%s) must be greater or equal to 0";
    public static final String X2 = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    public static final String Y2 = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    public static final String Z2 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    public static final String a3 = "Error parsing value(%s), valueFrom(%s), and valueTo(%s) into a float.";
    public static final int b3 = 200;
    public static final int c3 = 10000;
    public static final int d3 = 120000;
    public static final int e3 = 63;
    public static final double f3 = 1.0E-4d;
    public static final float g3 = 0.5f;
    public static final int h3 = -1;
    public static final float i3 = 0.8f;
    public static final int k3 = 1;
    public static final int l3 = 0;
    public static final int m3 = 83;
    public static final int n3 = 117;
    public static final float s3 = 0.5f;
    public static final float t3 = 1.2f;
    public static final float u3 = 1.2f;
    public static final float v3 = 0.5f;
    public static final float w3 = -0.2f;
    public static final float x3 = 0.5f;
    public int A1;
    @InterfaceC5670cr1
    public final RectF A2;
    public int B1;
    @InterfaceC5670cr1
    public final RectF B2;
    public int C1;
    @InterfaceC5670cr1
    public final RectF C2;
    public int D1;
    @InterfaceC5670cr1
    public final Rect D2;
    public int E1;
    @InterfaceC5670cr1
    public final RectF E2;
    public int F1;
    @InterfaceC5670cr1
    public final Rect F2;
    public int G1;
    @InterfaceC5670cr1
    public final Matrix G2;
    public int H1;
    @InterfaceC5670cr1
    public final C4394Uc1 H2;
    public int I1;
    @InterfaceC11300zs1
    public Drawable I2;
    public int J1;
    @InterfaceC5670cr1
    public List<Drawable> J2;
    public int K1;
    public float K2;
    public int L1;
    public int L2;
    public boolean M1;
    public final int M2;
    @InterfaceC11300zs1
    public Drawable N1;
    @InterfaceC5670cr1
    public final ViewTreeObserver.OnScrollChangedListener N2;
    public boolean O1;
    @InterfaceC5670cr1
    public final ViewTreeObserver.OnGlobalLayoutListener O2;
    @InterfaceC11300zs1
    public Drawable P1;
    @InterfaceC5670cr1
    public final Runnable P2;
    public boolean Q1;
    public boolean Q2;
    @InterfaceC11300zs1
    public ColorStateList R1;
    @InterfaceC11300zs1
    public Drawable S1;
    public boolean T1;
    @InterfaceC11300zs1
    public Drawable U1;
    public boolean V1;
    @InterfaceC11300zs1
    public ColorStateList W1;
    @PK1
    public int X1;
    @InterfaceC5670cr1
    public final Paint Y0;
    @PK1
    public int Y1;
    @InterfaceC5670cr1
    public final Paint Z0;
    public int Z1;
    @InterfaceC5670cr1
    public final Paint a1;
    public float a2;
    @InterfaceC5670cr1
    public final Paint b1;
    public float b2;
    @InterfaceC5670cr1
    public final Paint c1;
    public MotionEvent c2;
    @InterfaceC5670cr1
    public final Paint d1;
    public InterfaceC7064iY0 d2;
    @InterfaceC5670cr1
    public final Paint e1;
    public boolean e2;
    @InterfaceC5670cr1
    public final c f1;
    public float f2;
    public final AccessibilityManager g1;
    public float g2;
    public AbstractC3550Ll<S, L, T>.b h1;
    public ArrayList<Float> h2;
    public int i1;
    public int i2;
    @InterfaceC5670cr1
    public final List<C10075uq2> j1;
    public int j2;
    @InterfaceC5670cr1
    public final List<L> k1;
    public float k2;
    @InterfaceC5670cr1
    public final List<T> l1;
    public float[] l2;
    public boolean m1;
    public int m2;
    public ValueAnimator n1;
    public int n2;
    public ValueAnimator o1;
    public int o2;
    public final int p1;
    public int p2;
    public int q1;
    public boolean q2;
    public int r1;
    public boolean r2;
    public int s1;
    public boolean s2;
    public int t1;
    @InterfaceC5670cr1
    public ColorStateList t2;
    public int u1;
    @InterfaceC5670cr1
    public ColorStateList u2;
    public int v1;
    @InterfaceC5670cr1
    public ColorStateList v2;
    @PK1
    public int w1;
    @InterfaceC5670cr1
    public ColorStateList w2;
    public int x1;
    @InterfaceC5670cr1
    public ColorStateList x2;
    public int y1;
    @InterfaceC5670cr1
    public final Path y2;
    public int z1;
    @InterfaceC5670cr1
    public final RectF z2;
    public static final int j3 = C7025iN1.n.Widget_MaterialComponents_Slider;
    public static final int o3 = C7025iN1.c.motionDurationMedium4;
    public static final int p3 = C7025iN1.c.motionDurationShort3;
    public static final int q3 = C7025iN1.c.motionEasingEmphasizedInterpolator;
    public static final int r3 = C7025iN1.c.motionEasingEmphasizedAccelerateInterpolator;

    /* renamed from: o.Ll$a */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ViewOverlay a0 = AbstractC3550Ll.this.a0();
            if (a0 != null) {
                for (C10075uq2 c10075uq2 : AbstractC3550Ll.this.j1) {
                    a0.remove(c10075uq2);
                }
            }
        }
    }

    /* renamed from: o.Ll$c */
    /* loaded from: classes3.dex */
    public static class c extends AbstractC7347jj0 {
        public final AbstractC3550Ll<?, ?, ?> t;
        public final Rect u;

        public c(AbstractC3550Ll<?, ?, ?> abstractC3550Ll) {
            super(abstractC3550Ll);
            this.u = new Rect();
            this.t = abstractC3550Ll;
        }

        @Override // o.AbstractC7347jj0
        public int C(float f, float f2) {
            for (int i = 0; i < this.t.getValues().size(); i++) {
                this.t.a1(i, this.u);
                if (this.u.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // o.AbstractC7347jj0
        public void D(@InterfaceC5670cr1 List<Integer> list) {
            for (int i = 0; i < this.t.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // o.AbstractC7347jj0
        public boolean N(int i, int i2, @InterfaceC11300zs1 Bundle bundle) {
            if (!this.t.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float w = this.t.w(20);
                if (i2 == 8192) {
                    w = -w;
                }
                if (this.t.u0()) {
                    w = -w;
                }
                if (!this.t.Y0(i, C9293rd1.d(this.t.getValues().get(i).floatValue() + w, this.t.getValueFrom(), this.t.getValueTo()))) {
                    return false;
                }
                this.t.setActiveThumbIndex(i);
                this.t.R0();
                this.t.b1();
                this.t.postInvalidate();
                G(i);
                return true;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey(C10861y4.f0)) {
                if (this.t.Y0(i, bundle.getFloat(C10861y4.f0))) {
                    this.t.b1();
                    this.t.postInvalidate();
                    G(i);
                    return true;
                }
            }
            return false;
        }

        @Override // o.AbstractC7347jj0
        public void R(int i, @InterfaceC5670cr1 C10861y4 c10861y4) {
            c10861y4.b(C10861y4.a.M);
            List<Float> values = this.t.getValues();
            Float f = values.get(i);
            float floatValue = f.floatValue();
            float valueFrom = this.t.getValueFrom();
            float valueTo = this.t.getValueTo();
            if (this.t.isEnabled()) {
                if (floatValue > valueFrom) {
                    c10861y4.a(8192);
                }
                if (floatValue < valueTo) {
                    c10861y4.a(4096);
                }
            }
            NumberFormat numberInstance = NumberFormat.getNumberInstance();
            numberInstance.setMaximumFractionDigits(2);
            try {
                valueFrom = numberInstance.parse(numberInstance.format(valueFrom)).floatValue();
                valueTo = numberInstance.parse(numberInstance.format(valueTo)).floatValue();
                floatValue = numberInstance.parse(numberInstance.format(floatValue)).floatValue();
            } catch (ParseException unused) {
                Log.w(AbstractC3550Ll.R2, String.format(AbstractC3550Ll.a3, f, Float.valueOf(valueFrom), Float.valueOf(valueTo)));
            }
            c10861y4.V1(C10861y4.h.e(1, valueFrom, valueTo, floatValue));
            c10861y4.k1(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.t.getContentDescription() != null) {
                sb.append(this.t.getContentDescription());
                sb.append(",");
            }
            String V = this.t.V(floatValue);
            String string = this.t.getContext().getString(C7025iN1.m.material_slider_value);
            if (values.size() > 1) {
                string = a0(i);
            }
            CharSequence A0 = C6516gH2.A0(this.t);
            if (!TextUtils.isEmpty(A0)) {
                c10861y4.e2(A0);
            } else {
                sb.append(String.format(Locale.getDefault(), "%s, %s", string, V));
            }
            c10861y4.p1(sb.toString());
            this.t.a1(i, this.u);
            c10861y4.e1(this.u);
        }

        @InterfaceC5670cr1
        public final String a0(int i) {
            if (i == this.t.getValues().size() - 1) {
                return this.t.getContext().getString(C7025iN1.m.material_slider_range_end);
            }
            if (i == 0) {
                return this.t.getContext().getString(C7025iN1.m.material_slider_range_start);
            }
            return "";
        }
    }

    /* renamed from: o.Ll$d */
    /* loaded from: classes3.dex */
    public enum d {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Ll$e */
    /* loaded from: classes3.dex */
    public @interface e {
    }

    /* renamed from: o.Ll$f */
    /* loaded from: classes3.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();
        public float X;
        public float Y;
        public float Y0;
        public ArrayList<Float> Z;
        public boolean Z0;

        /* renamed from: o.Ll$f$a */
        /* loaded from: classes3.dex */
        public class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: a */
            public f createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: b */
            public f[] newArray(int i) {
                return new f[i];
            }
        }

        public /* synthetic */ f(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.X);
            parcel.writeFloat(this.Y);
            parcel.writeList(this.Z);
            parcel.writeFloat(this.Y0);
            parcel.writeBooleanArray(new boolean[]{this.Z0});
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        public f(@InterfaceC5670cr1 Parcel parcel) {
            super(parcel);
            this.X = parcel.readFloat();
            this.Y = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.Z = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.Y0 = parcel.readFloat();
            this.Z0 = parcel.createBooleanArray()[0];
        }
    }

    public AbstractC3550Ll(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static float X(ValueAnimator valueAnimator, float f2) {
        if (valueAnimator != null && valueAnimator.isRunning()) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
            return floatValue;
        }
        return f2;
    }

    public static /* synthetic */ void a(AbstractC3550Ll abstractC3550Ll) {
        abstractC3550Ll.setActiveThumbIndex(-1);
        abstractC3550Ll.invalidate();
    }

    public static /* synthetic */ void b(AbstractC3550Ll abstractC3550Ll, ValueAnimator valueAnimator) {
        abstractC3550Ll.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (C10075uq2 c10075uq2 : abstractC3550Ll.j1) {
            c10075uq2.B1(floatValue);
        }
        abstractC3550Ll.postInvalidateOnAnimation();
    }

    public static boolean o0(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            return false;
        }
        return true;
    }

    public void A() {
        this.l1.clear();
    }

    public final void A0(@InterfaceC5670cr1 Canvas canvas, int i, int i2) {
        Canvas canvas2;
        if (V0()) {
            float[] fArr = {this.C1 + (H0(this.h2.get(this.j2).floatValue()) * i), i2};
            if (y0()) {
                this.G2.mapPoints(fArr);
            }
            if (Build.VERSION.SDK_INT < 28) {
                float f2 = fArr[0];
                int i4 = this.F1;
                float f4 = fArr[1];
                canvas2 = canvas;
                canvas2.clipRect(f2 - i4, f4 - i4, f2 + i4, f4 + i4, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(fArr[0], fArr[1], this.F1, this.b1);
        }
    }

    public final int B(boolean z) {
        if (z) {
            return 0;
        }
        return 2;
    }

    public final void B0(@InterfaceC5670cr1 Canvas canvas, int i) {
        if (this.J1 > 0 && !this.h2.isEmpty()) {
            ArrayList<Float> arrayList = this.h2;
            float floatValue = arrayList.get(arrayList.size() - 1).floatValue();
            float f2 = this.g2;
            if (floatValue < f2) {
                L(canvas, u1(f2), i);
            }
            if (l0() || (this.h2.size() > 1 && this.h2.get(0).floatValue() > this.f2)) {
                L(canvas, u1(this.f2), i);
            }
        }
    }

    public final ValueAnimator C(boolean z) {
        float f2;
        ValueAnimator valueAnimator;
        int f4;
        TimeInterpolator g;
        float f5 = 1.0f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        if (z) {
            valueAnimator = this.o1;
        } else {
            valueAnimator = this.n1;
        }
        float X = X(valueAnimator, f2);
        if (!z) {
            f5 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(X, f5);
        if (z) {
            f4 = C9811tl1.f(getContext(), o3, 83);
            g = C9811tl1.g(getContext(), q3, C5600ca.e);
        } else {
            f4 = C9811tl1.f(getContext(), p3, 117);
            g = C9811tl1.g(getContext(), r3, C5600ca.c);
        }
        ofFloat.setDuration(f4);
        ofFloat.setInterpolator(g);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.Hl
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                AbstractC3550Ll.b(AbstractC3550Ll.this, valueAnimator2);
            }
        });
        return ofFloat;
    }

    public final void C0(@InterfaceC5670cr1 Canvas canvas) {
        float[] fArr = this.l2;
        if (fArr != null && fArr.length != 0) {
            float[] W = W();
            int ceil = (int) Math.ceil(W[0] * ((this.l2.length / 2.0f) - 1.0f));
            int floor = (int) Math.floor(W[1] * ((this.l2.length / 2.0f) - 1.0f));
            if (ceil > 0) {
                O(0, ceil * 2, canvas, this.c1);
            }
            if (ceil <= floor) {
                O(ceil * 2, (floor + 1) * 2, canvas, this.d1);
            }
            int i = (floor + 1) * 2;
            float[] fArr2 = this.l2;
            if (i < fArr2.length) {
                O(i, fArr2.length, canvas, this.c1);
            }
        }
    }

    public final void D() {
        int i;
        if (this.j1.size() > this.h2.size()) {
            List<C10075uq2> subList = this.j1.subList(this.h2.size(), this.j1.size());
            for (C10075uq2 c10075uq2 : subList) {
                if (isAttachedToWindow()) {
                    E(c10075uq2);
                }
            }
            subList.clear();
        }
        while (true) {
            i = 0;
            if (this.j1.size() >= this.h2.size()) {
                break;
            }
            C10075uq2 k1 = C10075uq2.k1(getContext(), null, 0, this.i1);
            this.j1.add(k1);
            if (isAttachedToWindow()) {
                p(k1);
            }
        }
        if (this.j1.size() != 1) {
            i = 1;
        }
        for (C10075uq2 c10075uq22 : this.j1) {
            c10075uq22.U0(i);
        }
    }

    public final boolean D0() {
        int width;
        int max = this.q1 + Math.max(Math.max(Math.max((this.D1 / 2) - this.r1, 0), Math.max((this.B1 - this.s1) / 2, 0)), Math.max(Math.max(this.n2 - this.t1, 0), Math.max(this.o2 - this.u1, 0)));
        if (this.C1 == max) {
            return false;
        }
        this.C1 = max;
        if (isLaidOut()) {
            if (y0()) {
                width = getHeight();
            } else {
                width = getWidth();
            }
            n1(width);
            return true;
        }
        return true;
    }

    public final void E(C10075uq2 c10075uq2) {
        ViewGroup l = C10920yI2.l(this);
        if (l == null) {
            return;
        }
        l.getOverlay().remove(c10075uq2);
        c10075uq2.m1(l);
    }

    public final boolean E0() {
        int paddingTop;
        int paddingBottom;
        if (y0()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingTop + paddingBottom;
        int max = Math.max(this.y1, Math.max(this.B1 + i, this.E1 + i));
        if (max == this.z1) {
            return false;
        }
        this.z1 = max;
        return true;
    }

    public final float F(float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        float f4 = (f2 - this.C1) / this.p2;
        float f5 = this.f2;
        return (f4 * (f5 - this.g2)) + f5;
    }

    public final boolean F0(int i) {
        int i2 = this.j2;
        int f2 = (int) C9293rd1.f(i2 + i, 0L, this.h2.size() - 1);
        this.j2 = f2;
        if (f2 == i2) {
            return false;
        }
        if (this.i2 != -1) {
            this.i2 = f2;
        }
        b1();
        postInvalidate();
        return true;
    }

    public final void G(int i) {
        for (L l : this.k1) {
            l.a(this, this.h2.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.g1;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Q0(i);
        }
    }

    public final boolean G0(int i) {
        if (u0() || y0()) {
            if (i == Integer.MIN_VALUE) {
                i = Integer.MAX_VALUE;
            } else {
                i = -i;
            }
        }
        return F0(i);
    }

    public final void H() {
        for (L l : this.k1) {
            Iterator<Float> it = this.h2.iterator();
            while (it.hasNext()) {
                l.a(this, it.next().floatValue(), false);
            }
        }
    }

    public final float H0(float f2) {
        float f4 = this.f2;
        float f5 = (f2 - f4) / (this.g2 - f4);
        if (!u0() && !y0()) {
            return f5;
        }
        return 1.0f - f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I(@InterfaceC5670cr1 Canvas canvas, int i, int i2) {
        int i4;
        float f2;
        float f4;
        AbstractC3550Ll<S, L, T> abstractC3550Ll = this;
        float[] W = abstractC3550Ll.W();
        int i5 = abstractC3550Ll.C1;
        float f5 = i;
        float f6 = i5 + (W[1] * f5);
        float f7 = i5 + (W[0] * f5);
        if (f7 >= f6) {
            abstractC3550Ll.z2.setEmpty();
            return;
        }
        d dVar = d.NONE;
        if (abstractC3550Ll.h2.size() == 1 && !abstractC3550Ll.l0()) {
            dVar = (abstractC3550Ll.u0() || abstractC3550Ll.y0()) ? d.RIGHT : d.LEFT;
        }
        d dVar2 = dVar;
        int i6 = 0;
        while (i6 < abstractC3550Ll.h2.size()) {
            if (abstractC3550Ll.h2.size() > 1) {
                if (i6 > 0) {
                    f7 = abstractC3550Ll.u1(abstractC3550Ll.h2.get(i6 - 1).floatValue());
                }
                f6 = abstractC3550Ll.u1(abstractC3550Ll.h2.get(i6).floatValue());
                if (abstractC3550Ll.u0() || abstractC3550Ll.y0()) {
                    f6 = f7;
                    f7 = f6;
                }
            }
            int trackCornerSize = abstractC3550Ll.getTrackCornerSize();
            int ordinal = dVar2.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!abstractC3550Ll.l0()) {
                            i4 = abstractC3550Ll.G1;
                            f7 += i4;
                        } else if (W[1] == 0.5f) {
                            f7 += abstractC3550Ll.G1;
                        } else if (W[0] == 0.5f) {
                            i4 = abstractC3550Ll.G1;
                        }
                    }
                } else {
                    f7 += abstractC3550Ll.G1;
                    f6 += trackCornerSize;
                }
                f2 = f7;
                f4 = f6;
                if (f2 < f4) {
                    abstractC3550Ll.z2.setEmpty();
                } else {
                    RectF rectF = abstractC3550Ll.z2;
                    float f8 = i2;
                    int i7 = abstractC3550Ll.B1;
                    rectF.set(f2, f8 - (i7 / 2.0f), f4, f8 + (i7 / 2.0f));
                    abstractC3550Ll.i1(canvas, abstractC3550Ll.Z0, abstractC3550Ll.z2, trackCornerSize, dVar2);
                }
                i6++;
                abstractC3550Ll = this;
                f7 = f2;
                f6 = f4;
            } else {
                f7 -= trackCornerSize;
                i4 = abstractC3550Ll.G1;
            }
            f6 -= i4;
            f2 = f7;
            f4 = f6;
            if (f2 < f4) {
            }
            i6++;
            abstractC3550Ll = this;
            f7 = f2;
            f6 = f4;
        }
    }

    @InterfaceC11300zs1
    public final Boolean I0(int i, @InterfaceC5670cr1 KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i != 69) {
                        if (i != 70) {
                            switch (i) {
                                case 21:
                                    G0(-1);
                                    return Boolean.TRUE;
                                case 22:
                                    G0(1);
                                    return Boolean.TRUE;
                                case 23:
                                    break;
                                default:
                                    return null;
                            }
                        }
                    } else {
                        F0(-1);
                        return Boolean.TRUE;
                    }
                }
                F0(1);
                return Boolean.TRUE;
            }
            this.i2 = this.j2;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(F0(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(F0(-1));
            }
            return Boolean.FALSE;
        }
    }

    public final void J(float f2, float f4, float f5, float f6, @InterfaceC5670cr1 Canvas canvas, RectF rectF, d dVar) {
        if (f4 - f2 > getTrackCornerSize() - this.G1) {
            rectF.set(f2, f5, f4, f6);
        } else {
            rectF.setEmpty();
        }
        i1(canvas, this.Y0, rectF, getTrackCornerSize(), dVar);
    }

    public final void J0() {
        for (T t : this.l1) {
            t.a(this);
        }
    }

    public final void K(@InterfaceC5670cr1 Canvas canvas, int i, int i2) {
        int i4;
        float[] W = W();
        float f2 = i2;
        int i5 = this.B1;
        float f4 = f2 - (i5 / 2.0f);
        float f5 = f2 + (i5 / 2.0f);
        float f6 = i;
        J(this.C1 - getTrackCornerSize(), (this.C1 + (W[0] * f6)) - this.G1, f4, f5, canvas, this.A2, d.LEFT);
        J(this.C1 + (W[1] * f6) + this.G1, i4 + i + getTrackCornerSize(), f4, f5, canvas, this.B2, d.RIGHT);
    }

    public final void K0() {
        for (T t : this.l1) {
            t.b(this);
        }
    }

    public final void L(@InterfaceC5670cr1 Canvas canvas, float f2, float f4) {
        Iterator<Float> it = this.h2.iterator();
        while (it.hasNext()) {
            float u1 = u1(it.next().floatValue());
            float f5 = this.G1 + (this.D1 / 2.0f);
            if (f2 >= u1 - f5 && f2 <= u1 + f5) {
                return;
            }
        }
        if (y0()) {
            canvas.drawPoint(f4, f2, this.e1);
        } else {
            canvas.drawPoint(f2, f4, this.e1);
        }
    }

    public boolean L0() {
        boolean z;
        if (this.i2 != -1) {
            return true;
        }
        float f0 = f0();
        float u1 = u1(f0);
        this.i2 = 0;
        float abs = Math.abs(this.h2.get(0).floatValue() - f0);
        for (int i = 1; i < this.h2.size(); i++) {
            float abs2 = Math.abs(this.h2.get(i).floatValue() - f0);
            float u12 = u1(this.h2.get(i).floatValue());
            if (Float.compare(abs2, abs) > 0) {
                break;
            }
            if (u0() || y0() ? u12 - u1 > 0.0f : u12 - u1 < 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (Float.compare(abs2, abs) < 0) {
                this.i2 = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(u12 - u1) < this.p1) {
                    this.i2 = -1;
                    return false;
                } else if (z) {
                    this.i2 = i;
                }
            }
            abs = abs2;
        }
        if (this.i2 != -1) {
            return true;
        }
        return false;
    }

    public final void M(@InterfaceC5670cr1 Canvas canvas, int i, int i2, float f2, @InterfaceC5670cr1 Drawable drawable) {
        canvas.save();
        if (y0()) {
            canvas.concat(this.G2);
        }
        canvas.translate((this.C1 + ((int) (H0(f2) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void M0(C10075uq2 c10075uq2, float f2) {
        t(c10075uq2, f2);
        if (y0()) {
            RectF rectF = new RectF(this.D2);
            this.G2.mapRect(rectF);
            rectF.round(this.D2);
        }
        C10122v20.c(C10920yI2.l(this), this, this.D2);
        c10075uq2.setBounds(this.D2);
    }

    public final void N(@InterfaceC5670cr1 Canvas canvas, int i, int i2) {
        Canvas canvas2;
        int i4;
        int i5;
        int i6 = 0;
        while (i6 < this.h2.size()) {
            float floatValue = this.h2.get(i6).floatValue();
            Drawable drawable = this.I2;
            if (drawable != null) {
                canvas2 = canvas;
                i4 = i;
                i5 = i2;
                M(canvas2, i4, i5, floatValue, drawable);
            } else {
                canvas2 = canvas;
                i4 = i;
                i5 = i2;
                if (i6 < this.J2.size()) {
                    M(canvas2, i4, i5, floatValue, this.J2.get(i6));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle(this.C1 + (H0(floatValue) * i4), i5, getThumbRadius(), this.a1);
                    }
                    M(canvas2, i4, i5, floatValue, this.H2);
                }
            }
            i6++;
            canvas = canvas2;
            i = i4;
            i2 = i5;
        }
    }

    public final void N0(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int B;
        int i4;
        TypedArray k = C7608kn2.k(context, attributeSet, C7025iN1.o.qb, i, j3, new int[0]);
        setOrientation(k.getInt(C7025iN1.o.tb, 0));
        this.i1 = k.getResourceId(C7025iN1.o.Bb, C7025iN1.n.Widget_MaterialComponents_Tooltip);
        this.f2 = k.getFloat(C7025iN1.o.vb, 0.0f);
        this.g2 = k.getFloat(C7025iN1.o.wb, 1.0f);
        setValues(Float.valueOf(this.f2));
        setCentered(k.getBoolean(C7025iN1.o.xb, false));
        this.k2 = k.getFloat(C7025iN1.o.ub, 0.0f);
        this.w1 = (int) Math.ceil(k.getDimension(C7025iN1.o.Cb, X81.f(context)));
        int i5 = C7025iN1.o.Sb;
        boolean hasValue = k.hasValue(i5);
        if (hasValue) {
            i2 = i5;
        } else {
            i2 = C7025iN1.o.Ub;
        }
        if (!hasValue) {
            i5 = C7025iN1.o.Tb;
        }
        ColorStateList a2 = C4297Tc1.a(context, k, i2);
        if (a2 == null) {
            a2 = C3220Ic.a(context, C7025iN1.e.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a2);
        ColorStateList a4 = C4297Tc1.a(context, k, i5);
        if (a4 == null) {
            a4 = C3220Ic.a(context, C7025iN1.e.material_slider_active_track_color);
        }
        setTrackActiveTintList(a4);
        this.H2.y0(C4297Tc1.a(context, k, C7025iN1.o.Db));
        int i6 = C7025iN1.o.Hb;
        if (k.hasValue(i6)) {
            setThumbStrokeColor(C4297Tc1.a(context, k, i6));
        }
        setThumbStrokeWidth(k.getDimension(C7025iN1.o.Ib, 0.0f));
        ColorStateList a5 = C4297Tc1.a(context, k, C7025iN1.o.yb);
        if (a5 == null) {
            a5 = C3220Ic.a(context, C7025iN1.e.material_slider_halo_color);
        }
        setHaloTintList(a5);
        int i7 = C7025iN1.o.Qb;
        if (k.hasValue(i7)) {
            B = k.getInt(i7, -1);
        } else {
            B = B(k.getBoolean(C7025iN1.o.Rb, true));
        }
        this.m2 = B;
        int i8 = C7025iN1.o.Lb;
        boolean hasValue2 = k.hasValue(i8);
        if (hasValue2) {
            i4 = i8;
        } else {
            i4 = C7025iN1.o.Nb;
        }
        if (!hasValue2) {
            i8 = C7025iN1.o.Mb;
        }
        ColorStateList a6 = C4297Tc1.a(context, k, i4);
        if (a6 == null) {
            a6 = C3220Ic.a(context, C7025iN1.e.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a6);
        ColorStateList a7 = C4297Tc1.a(context, k, i8);
        if (a7 == null) {
            a7 = C3220Ic.a(context, C7025iN1.e.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a7);
        setThumbTrackGapSize(k.getDimensionPixelSize(C7025iN1.o.Jb, 0));
        setTrackStopIndicatorSize(k.getDimensionPixelSize(C7025iN1.o.fc, 0));
        setTrackCornerSize(k.getDimensionPixelSize(C7025iN1.o.Vb, -1));
        setTrackInsideCornerSize(k.getDimensionPixelSize(C7025iN1.o.ec, 0));
        setTrackIconActiveStart(C4297Tc1.e(context, k, C7025iN1.o.Zb));
        setTrackIconActiveEnd(C4297Tc1.e(context, k, C7025iN1.o.Yb));
        setTrackIconActiveColor(C4297Tc1.a(context, k, C7025iN1.o.Xb));
        setTrackIconInactiveStart(C4297Tc1.e(context, k, C7025iN1.o.cc));
        setTrackIconInactiveEnd(C4297Tc1.e(context, k, C7025iN1.o.bc));
        setTrackIconInactiveColor(C4297Tc1.a(context, k, C7025iN1.o.ac));
        setTrackIconSize(k.getDimensionPixelSize(C7025iN1.o.dc, 0));
        int dimensionPixelSize = k.getDimensionPixelSize(C7025iN1.o.Gb, 0) * 2;
        int dimensionPixelSize2 = k.getDimensionPixelSize(C7025iN1.o.Kb, dimensionPixelSize);
        int dimensionPixelSize3 = k.getDimensionPixelSize(C7025iN1.o.Fb, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(k.getDimensionPixelSize(C7025iN1.o.zb, 0));
        setThumbElevation(k.getDimension(C7025iN1.o.Eb, 0.0f));
        setTrackHeight(k.getDimensionPixelSize(C7025iN1.o.Wb, 0));
        setTickActiveRadius(k.getDimensionPixelSize(C7025iN1.o.Ob, this.J1 / 2));
        setTickInactiveRadius(k.getDimensionPixelSize(C7025iN1.o.Pb, this.J1 / 2));
        setLabelBehavior(k.getInt(C7025iN1.o.Ab, 0));
        if (!k.getBoolean(C7025iN1.o.rb, true)) {
            setEnabled(false);
        }
        k.recycle();
    }

    public final void O(int i, int i2, Canvas canvas, Paint paint) {
        float f2;
        while (i < i2) {
            if (y0()) {
                f2 = this.l2[i + 1];
            } else {
                f2 = this.l2[i];
            }
            if (!r0(f2) && (!l0() || !q0(f2))) {
                float[] fArr = this.l2;
                canvas.drawPoint(fArr[i], fArr[i + 1], paint);
            }
            i += 2;
        }
    }

    public void O0(@InterfaceC5670cr1 L l) {
        this.k1.remove(l);
    }

    public final void P(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 RectF rectF, @InterfaceC5670cr1 Drawable drawable) {
        if (y0()) {
            this.G2.mapRect(rectF);
        }
        rectF.round(this.F2);
        drawable.setBounds(this.F2);
        drawable.draw(canvas);
    }

    public void P0(@InterfaceC5670cr1 T t) {
        this.l1.remove(t);
    }

    public final void Q(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 RectF rectF, @InterfaceC5670cr1 RectF rectF2) {
        if (!i0()) {
            return;
        }
        if (this.h2.size() > 1) {
            Log.w(R2, "Track icons can only be used when only 1 thumb is present.");
        }
        q(canvas, rectF, this.N1, true);
        q(canvas, rectF2, this.S1, true);
        q(canvas, rectF, this.P1, false);
        q(canvas, rectF2, this.U1, false);
    }

    public final void Q0(int i) {
        AbstractC3550Ll<S, L, T>.b bVar = this.h1;
        if (bVar == null) {
            this.h1 = new b(this, null);
        } else {
            removeCallbacks(bVar);
        }
        this.h1.a(i);
        postDelayed(this.h1, 200L);
    }

    public final void R() {
        if (!this.m1) {
            this.m1 = true;
            ValueAnimator C = C(true);
            this.n1 = C;
            this.o1 = null;
            C.start();
        }
        Iterator<C10075uq2> it = this.j1.iterator();
        for (int i = 0; i < this.h2.size() && it.hasNext(); i++) {
            if (i != this.j2) {
                S0(it.next(), this.h2.get(i).floatValue());
            }
        }
        if (it.hasNext()) {
            S0(it.next(), this.h2.get(this.j2).floatValue());
            return;
        }
        throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.j1.size()), Integer.valueOf(this.h2.size())));
    }

    public void R0() {
        removeCallbacks(this.P2);
        postDelayed(this.P2, this.M2);
    }

    public final void S() {
        if (this.m1) {
            this.m1 = false;
            ValueAnimator C = C(false);
            this.o1 = C;
            this.n1 = null;
            C.addListener(new a());
            this.o1.start();
        }
    }

    public final void S0(C10075uq2 c10075uq2, float f2) {
        c10075uq2.C1(V(f2));
        M0(c10075uq2, f2);
        ViewOverlay a0 = a0();
        if (a0 == null) {
            return;
        }
        a0.add(c10075uq2);
    }

    public final void T(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 66) {
                        return;
                    }
                    G0(Integer.MIN_VALUE);
                    return;
                }
                G0(Integer.MAX_VALUE);
                return;
            }
            F0(Integer.MIN_VALUE);
            return;
        }
        F0(Integer.MAX_VALUE);
    }

    public final void T0(@InterfaceC5670cr1 ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.h2.size() == arrayList.size() && this.h2.equals(arrayList)) {
                return;
            }
            this.h2 = arrayList;
            this.s2 = true;
            this.j2 = 0;
            b1();
            D();
            H();
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    @InterfaceC5056aJ2
    public void U(boolean z) {
        this.q2 = z;
    }

    public final boolean U0() {
        if (this.A1 == 3) {
            return true;
        }
        return false;
    }

    public final String V(float f2) {
        String str;
        if (h0()) {
            return this.d2.a(f2);
        }
        if (((int) f2) == f2) {
            str = "%.0f";
        } else {
            str = "%.2f";
        }
        return String.format(str, Float.valueOf(f2));
    }

    public final boolean V0() {
        if (!this.q2 && (getBackground() instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    public final float[] W() {
        float floatValue = this.h2.get(0).floatValue();
        ArrayList<Float> arrayList = this.h2;
        float floatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (this.h2.size() == 1) {
            floatValue = this.f2;
        }
        float H0 = H0(floatValue);
        float H02 = H0(floatValue2);
        if (l0()) {
            float min = Math.min(0.5f, H02);
            H02 = Math.max(0.5f, H02);
            H0 = min;
        }
        return (l0() || !(u0() || y0())) ? new float[]{H0, H02} : new float[]{H02, H0};
    }

    public final boolean W0(float f2) {
        return Y0(this.i2, f2);
    }

    public final double X0(float f2) {
        float f4 = this.k2;
        if (f4 > 0.0f) {
            int i = (int) ((this.g2 - this.f2) / f4);
            return Math.round(f2 * i) / i;
        }
        return f2;
    }

    public final float Y(int i, float f2) {
        float floatValue;
        float floatValue2;
        float minSeparation = getMinSeparation();
        if (this.L2 == 0) {
            minSeparation = F(minSeparation);
        }
        if (u0() || y0()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        if (i2 >= this.h2.size()) {
            floatValue = this.g2;
        } else {
            floatValue = this.h2.get(i2).floatValue() - minSeparation;
        }
        int i4 = i - 1;
        if (i4 < 0) {
            floatValue2 = this.f2;
        } else {
            floatValue2 = this.h2.get(i4).floatValue() + minSeparation;
        }
        return C9293rd1.d(f2, floatValue2, floatValue);
    }

    public final boolean Y0(int i, float f2) {
        this.j2 = i;
        if (Math.abs(f2 - this.h2.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.h2.set(i, Float.valueOf(Y(i, f2)));
        G(i);
        return true;
    }

    @JF
    public final int Z(@InterfaceC5670cr1 ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean Z0() {
        return W0(e0());
    }

    @InterfaceC11300zs1
    public final ViewOverlay a0() {
        ViewGroup l = C10920yI2.l(this);
        if (l == null) {
            return null;
        }
        return l.getOverlay();
    }

    public void a1(int i, Rect rect) {
        int H0 = this.C1 + ((int) (H0(getValues().get(i).floatValue()) * this.p2));
        int x = x();
        int max = Math.max(this.D1 / 2, this.w1 / 2);
        int max2 = Math.max(this.E1 / 2, this.w1 / 2);
        RectF rectF = new RectF(H0 - max, x - max2, H0 + max, x + max2);
        if (y0()) {
            this.G2.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final float[] b0(float f2, float f4) {
        return y0() ? new float[]{f2, f2, f2, f2, f4, f4, f4, f4} : new float[]{f2, f2, f4, f4, f4, f4, f2, f2};
    }

    public final void b1() {
        if (!V0() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                float H0 = (H0(this.h2.get(this.j2).floatValue()) * this.p2) + this.C1;
                int x = x();
                int i = this.F1;
                float[] fArr = {H0 - i, x - i, H0 + i, x + i};
                if (y0()) {
                    this.G2.mapPoints(fArr);
                }
                background.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
            }
        }
    }

    public final int c0() {
        return (int) (((this.g2 - this.f2) / this.k2) + 1.0f);
    }

    public final void c1() {
        float f2;
        boolean y0 = y0();
        boolean u0 = u0();
        float f4 = 0.5f;
        if (y0 && u0) {
            f2 = 0.5f;
            f4 = -0.2f;
        } else {
            f2 = 1.2f;
            if (y0) {
                f4 = 1.2f;
                f2 = 0.5f;
            }
        }
        for (C10075uq2 c10075uq2 : this.j1) {
            c10075uq2.z1(f4, f2);
        }
    }

    public final int d0() {
        return (this.p2 / this.v1) + 1;
    }

    public final void d1() {
        c1();
        int i = this.A1;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (isEnabled() && v0()) {
                        R();
                        return;
                    } else {
                        S();
                        return;
                    }
                }
                throw new IllegalArgumentException("Unexpected labelBehavior: " + this.A1);
            }
            S();
        } else if (this.i2 != -1 && isEnabled()) {
            R();
        } else {
            S();
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@InterfaceC5670cr1 MotionEvent motionEvent) {
        if (!this.f1.v(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@InterfaceC5670cr1 KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.Y0.setColor(Z(this.x2));
        this.Z0.setColor(Z(this.w2));
        this.c1.setColor(Z(this.v2));
        this.d1.setColor(Z(this.u2));
        this.e1.setColor(Z(this.v2));
        for (C10075uq2 c10075uq2 : this.j1) {
            if (c10075uq2.isStateful()) {
                c10075uq2.setState(getDrawableState());
            }
        }
        if (this.H2.isStateful()) {
            this.H2.setState(getDrawableState());
        }
        this.b1.setColor(Z(this.t2));
        this.b1.setAlpha(63);
    }

    public final float e0() {
        double X0 = X0(this.K2);
        if (u0() || y0()) {
            X0 = 1.0d - X0;
        }
        float f2 = this.g2;
        float f4 = this.f2;
        return (float) ((X0 * (f2 - f4)) + f4);
    }

    public final void e1() {
        float x = x();
        this.G2.reset();
        this.G2.setRotate(90.0f, x, x);
    }

    public final float f0() {
        float f2 = this.K2;
        if (u0() || y0()) {
            f2 = 1.0f - f2;
        }
        float f4 = this.g2;
        float f5 = this.f2;
        return (f2 * (f4 - f5)) + f5;
    }

    public final void f1() {
        if (g0()) {
            int i = this.D1;
            this.H1 = i;
            this.I1 = this.G1;
            int round = Math.round(i * 0.5f);
            int i2 = this.D1 - round;
            setThumbWidth(round);
            setThumbTrackGapSize(this.G1 - (i2 / 2));
        }
    }

    public final boolean g0() {
        if (this.G1 > 0) {
            return true;
        }
        return false;
    }

    public final void g1() {
        p1();
        int i = 0;
        if (this.k2 <= 0.0f) {
            h1(0);
            return;
        }
        int i2 = this.m2;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.m2);
                }
            } else {
                int c0 = c0();
                if (c0 <= d0()) {
                    i = c0;
                }
            }
        } else {
            i = Math.min(c0(), d0());
        }
        h1(i);
    }

    @Override // android.view.View
    @InterfaceC5670cr1
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @InterfaceC5056aJ2
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f1.x();
    }

    public int getActiveThumbIndex() {
        return this.i2;
    }

    public int getFocusedThumbIndex() {
        return this.j2;
    }

    @PK1
    public int getHaloRadius() {
        return this.F1;
    }

    @InterfaceC5670cr1
    public ColorStateList getHaloTintList() {
        return this.t2;
    }

    public int getLabelBehavior() {
        return this.A1;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.k2;
    }

    public float getThumbElevation() {
        return this.H2.F();
    }

    @PK1
    public int getThumbHeight() {
        return this.E1;
    }

    @PK1
    public int getThumbRadius() {
        return this.D1 / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.H2.W();
    }

    public float getThumbStrokeWidth() {
        return this.H2.Z();
    }

    @InterfaceC5670cr1
    public ColorStateList getThumbTintList() {
        return this.H2.G();
    }

    public int getThumbTrackGapSize() {
        return this.G1;
    }

    @PK1
    public int getThumbWidth() {
        return this.D1;
    }

    @PK1
    public int getTickActiveRadius() {
        return this.n2;
    }

    @InterfaceC5670cr1
    public ColorStateList getTickActiveTintList() {
        return this.u2;
    }

    @PK1
    public int getTickInactiveRadius() {
        return this.o2;
    }

    @InterfaceC5670cr1
    public ColorStateList getTickInactiveTintList() {
        return this.v2;
    }

    @InterfaceC5670cr1
    public ColorStateList getTickTintList() {
        if (this.v2.equals(this.u2)) {
            return this.u2;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.m2;
    }

    @InterfaceC5670cr1
    public ColorStateList getTrackActiveTintList() {
        return this.w2;
    }

    @PK1
    public int getTrackCornerSize() {
        int i = this.K1;
        if (i == -1) {
            return this.B1 / 2;
        }
        return i;
    }

    @PK1
    public int getTrackHeight() {
        return this.B1;
    }

    @InterfaceC11300zs1
    public ColorStateList getTrackIconActiveColor() {
        return this.R1;
    }

    @InterfaceC11300zs1
    public Drawable getTrackIconActiveEnd() {
        return this.P1;
    }

    @InterfaceC11300zs1
    public Drawable getTrackIconActiveStart() {
        return this.N1;
    }

    @InterfaceC11300zs1
    public ColorStateList getTrackIconInactiveColor() {
        return this.W1;
    }

    @InterfaceC11300zs1
    public Drawable getTrackIconInactiveEnd() {
        return this.U1;
    }

    @InterfaceC11300zs1
    public Drawable getTrackIconInactiveStart() {
        return this.S1;
    }

    public int getTrackIconSize() {
        return this.X1;
    }

    @InterfaceC5670cr1
    public ColorStateList getTrackInactiveTintList() {
        return this.x2;
    }

    public int getTrackInsideCornerSize() {
        return this.L1;
    }

    @PK1
    public int getTrackSidePadding() {
        return this.C1;
    }

    public int getTrackStopIndicatorSize() {
        return this.J1;
    }

    @InterfaceC5670cr1
    public ColorStateList getTrackTintList() {
        if (this.x2.equals(this.w2)) {
            return this.w2;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @PK1
    public int getTrackWidth() {
        return this.p2;
    }

    public float getValueFrom() {
        return this.f2;
    }

    public float getValueTo() {
        return this.g2;
    }

    @InterfaceC5670cr1
    public List<Float> getValues() {
        return new ArrayList(this.h2);
    }

    public boolean h0() {
        if (this.d2 != null) {
            return true;
        }
        return false;
    }

    public final void h1(int i) {
        if (i == 0) {
            this.l2 = null;
            return;
        }
        float[] fArr = this.l2;
        if (fArr == null || fArr.length != i * 2) {
            this.l2 = new float[i * 2];
        }
        float f2 = this.p2 / (i - 1);
        float x = x();
        for (int i2 = 0; i2 < i * 2; i2 += 2) {
            float[] fArr2 = this.l2;
            fArr2[i2] = this.C1 + ((i2 / 2.0f) * f2);
            fArr2[i2 + 1] = x;
        }
        if (y0()) {
            this.G2.mapPoints(this.l2);
        }
    }

    public final boolean i0() {
        if (this.N1 == null && this.P1 == null && this.S1 == null && this.U1 == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i1(Canvas canvas, Paint paint, RectF rectF, float f2, d dVar) {
        int i;
        if (rectF.isEmpty()) {
            return;
        }
        float u = u(f2);
        float r = r(f2);
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    i = this.L1;
                    u = i;
                }
            } else {
                u = this.L1;
            }
            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeCap(Paint.Cap.BUTT);
            if (g0()) {
                paint.setAntiAlias(true);
            }
            RectF rectF2 = new RectF(rectF);
            if (y0()) {
                this.G2.mapRect(rectF2);
            }
            this.y2.reset();
            if (rectF.width() < u + r) {
                this.y2.addRoundRect(rectF2, b0(u, r), Path.Direction.CW);
                canvas.drawPath(this.y2, paint);
                return;
            }
            float min = Math.min(u, r);
            float max = Math.max(u, r);
            canvas.save();
            this.y2.addRoundRect(rectF2, min, min, Path.Direction.CW);
            canvas.clipPath(this.y2);
            int ordinal2 = dVar.ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    this.C2.set(rectF.centerX() - max, rectF.top, rectF.centerX() + max, rectF.bottom);
                } else {
                    RectF rectF3 = this.C2;
                    float f4 = rectF.right;
                    rectF3.set(f4 - (2.0f * max), rectF.top, f4, rectF.bottom);
                }
            } else {
                RectF rectF4 = this.C2;
                float f5 = rectF.left;
                rectF4.set(f5, rectF.top, (2.0f * max) + f5, rectF.bottom);
            }
            if (y0()) {
                this.G2.mapRect(this.C2);
            }
            canvas.drawRoundRect(this.C2, max, max, paint);
            canvas.restore();
            return;
        }
        i = this.L1;
        r = i;
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.BUTT);
        if (g0()) {
        }
        RectF rectF22 = new RectF(rectF);
        if (y0()) {
        }
        this.y2.reset();
        if (rectF.width() < u + r) {
        }
    }

    public final Drawable j0(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        o(newDrawable);
        return newDrawable;
    }

    public final void j1() {
        Drawable drawable = this.P1;
        if (drawable != null) {
            if (!this.Q1 && this.R1 != null) {
                this.P1 = D60.r(drawable).mutate();
                this.Q1 = true;
            }
            if (this.Q1) {
                this.P1.setTintList(this.R1);
            }
        }
    }

    public final void k0() {
        this.Y0.setStrokeWidth(this.B1);
        this.Z0.setStrokeWidth(this.B1);
    }

    public final void k1() {
        Drawable drawable = this.N1;
        if (drawable != null) {
            if (!this.O1 && this.R1 != null) {
                this.N1 = D60.r(drawable).mutate();
                this.O1 = true;
            }
            if (this.O1) {
                this.N1.setTintList(this.R1);
            }
        }
    }

    public boolean l0() {
        return this.M1;
    }

    public final void l1() {
        Drawable drawable = this.U1;
        if (drawable != null) {
            if (!this.V1 && this.W1 != null) {
                this.U1 = D60.r(drawable).mutate();
                this.V1 = true;
            }
            if (this.V1) {
                this.U1.setTintList(this.W1);
            }
        }
    }

    public void m(@InterfaceC5670cr1 L l) {
        this.k1.add(l);
    }

    public final boolean m0() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final void m1() {
        Drawable drawable = this.S1;
        if (drawable != null) {
            if (!this.T1 && this.W1 != null) {
                this.S1 = D60.r(drawable).mutate();
                this.T1 = true;
            }
            if (this.T1) {
                this.S1.setTintList(this.W1);
            }
        }
    }

    public void n(@InterfaceC5670cr1 T t) {
        this.l1.add(t);
    }

    public final boolean n0() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final void n1(int i) {
        this.p2 = Math.max(i - (this.C1 * 2), 0);
        g1();
    }

    public final void o(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.D1, this.E1);
            return;
        }
        float max = Math.max(this.D1, this.E1) / Math.max(intrinsicWidth, intrinsicHeight);
        drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
    }

    public final void o1(boolean z) {
        boolean E0 = E0();
        boolean D0 = D0();
        if (y0()) {
            e1();
        }
        if (!E0 && !z) {
            if (D0) {
                postInvalidate();
                return;
            }
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q2 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.N2);
        getViewTreeObserver().addOnGlobalLayoutListener(this.O2);
        for (C10075uq2 c10075uq2 : this.j1) {
            p(c10075uq2);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        AbstractC3550Ll<S, L, T>.b bVar = this.h1;
        if (bVar != null) {
            removeCallbacks(bVar);
        }
        this.m1 = false;
        for (C10075uq2 c10075uq2 : this.j1) {
            E(c10075uq2);
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.N2);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.O2);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@InterfaceC5670cr1 Canvas canvas) {
        if (this.s2) {
            p1();
            g1();
        }
        super.onDraw(canvas);
        int x = x();
        K(canvas, this.p2, x);
        I(canvas, this.p2, x);
        if (!u0() && !y0()) {
            Q(canvas, this.z2, this.B2);
        } else {
            Q(canvas, this.z2, this.A2);
        }
        C0(canvas);
        B0(canvas, x);
        if ((this.e2 || isFocused()) && isEnabled()) {
            A0(canvas, this.p2, x);
        }
        d1();
        N(canvas, this.p2, x);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, @InterfaceC11300zs1 Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.i2 = -1;
            this.f1.o(this.j2);
            return;
        }
        T(i);
        this.f1.X(this.j2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, @InterfaceC5670cr1 KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.h2.size() == 1) {
            this.i2 = 0;
        }
        if (this.i2 == -1) {
            Boolean I0 = I0(i, keyEvent);
            if (I0 != null) {
                return I0.booleanValue();
            }
            return super.onKeyDown(i, keyEvent);
        }
        this.r2 |= keyEvent.isLongPress();
        Float s = s(i);
        if (s != null) {
            if (W0(this.h2.get(this.i2).floatValue() + s.floatValue())) {
                b1();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return F0(1);
            } else {
                if (!keyEvent.isShiftPressed()) {
                    return false;
                }
                return F0(-1);
            }
        }
        this.i2 = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, @InterfaceC5670cr1 KeyEvent keyEvent) {
        this.r2 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i4 = 0;
        if (this.A1 == 1 || U0()) {
            i4 = this.j1.get(0).getIntrinsicHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.z1 + i4, 1073741824);
        if (y0()) {
            super.onMeasure(makeMeasureSpec, i2);
        } else {
            super.onMeasure(i, makeMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        this.f2 = fVar.X;
        this.g2 = fVar.Y;
        T0(fVar.Z);
        this.k2 = fVar.Y0;
        if (fVar.Z0) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.X = this.f2;
        fVar.Y = this.g2;
        fVar.Z = new ArrayList<>(this.h2);
        fVar.Y0 = this.k2;
        fVar.Z0 = hasFocus();
        return fVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i4, int i5) {
        if (y0()) {
            i = i2;
        }
        n1(i);
        b1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
        if (r3 != 3) goto L18;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@InterfaceC5670cr1 MotionEvent motionEvent) {
        float x;
        float y;
        int i;
        if (!isEnabled()) {
            return false;
        }
        if (y0()) {
            x = motionEvent.getY();
        } else {
            x = motionEvent.getX();
        }
        if (y0()) {
            y = motionEvent.getX();
        } else {
            y = motionEvent.getY();
        }
        float f2 = (x - this.C1) / this.p2;
        this.K2 = f2;
        float max = Math.max(0.0f, f2);
        this.K2 = max;
        this.K2 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!this.e2) {
                        if (!y0() && t0(motionEvent) && Math.abs(x - this.a2) < this.p1) {
                            return false;
                        }
                        if (y0() && s0(motionEvent) && Math.abs(y - this.b2) < this.p1 * 0.8f) {
                            return false;
                        }
                        getParent().requestDisallowInterceptTouchEvent(true);
                        if (L0()) {
                            this.e2 = true;
                            f1();
                            J0();
                        }
                    }
                    Z0();
                    b1();
                    invalidate();
                }
            }
            this.e2 = false;
            MotionEvent motionEvent2 = this.c2;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.c2.getX() - motionEvent.getX()) <= this.p1 && Math.abs(this.c2.getY() - motionEvent.getY()) <= this.p1 && L0()) {
                J0();
            }
            if (this.i2 != -1) {
                Z0();
                b1();
                if (g0() && (i = this.H1) != -1 && this.I1 != -1) {
                    setThumbWidth(i);
                    setThumbTrackGapSize(this.I1);
                }
                this.i2 = -1;
                K0();
            }
            invalidate();
        } else {
            this.a2 = x;
            this.b2 = y;
            if ((y0() || !t0(motionEvent)) && (!y0() || !s0(motionEvent))) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (L0()) {
                    requestFocus();
                    this.e2 = true;
                    f1();
                    J0();
                    Z0();
                    b1();
                    invalidate();
                }
            }
        }
        setPressed(this.e2);
        this.c2 = MotionEvent.obtain(motionEvent);
        return true;
    }

    @Override // android.view.View
    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.Q2 = z;
    }

    @Override // android.view.View
    public void onVisibilityChanged(@InterfaceC5670cr1 View view, int i) {
        ViewOverlay a0;
        super.onVisibilityChanged(view, i);
        if (i != 0 && (a0 = a0()) != null) {
            for (C10075uq2 c10075uq2 : this.j1) {
                a0.remove(c10075uq2);
            }
        }
    }

    public final void p(C10075uq2 c10075uq2) {
        c10075uq2.A1(C10920yI2.l(this));
    }

    public final boolean p0(double d2) {
        double doubleValue = new BigDecimal(Double.toString(d2)).divide(new BigDecimal(Float.toString(this.k2)), MathContext.DECIMAL64).doubleValue();
        if (Math.abs(Math.round(doubleValue) - doubleValue) < 1.0E-4d) {
            return true;
        }
        return false;
    }

    public final void p1() {
        if (this.s2) {
            s1();
            r1();
            q1();
            v1();
            this.s2 = false;
        }
    }

    public final void q(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 RectF rectF, @InterfaceC11300zs1 Drawable drawable, boolean z) {
        if (drawable != null) {
            y(rectF, this.E2, this.X1, this.Y1, z);
            if (!this.E2.isEmpty()) {
                P(canvas, this.E2, drawable);
            }
        }
    }

    public final boolean q0(float f2) {
        float f4 = this.G1 + (this.D1 / 2.0f);
        float f5 = (this.p2 + (this.C1 * 2)) / 2.0f;
        if (f2 >= f5 - f4 && f2 <= f5 + f4) {
            return true;
        }
        return false;
    }

    public final void q1() {
        float minSeparation = getMinSeparation();
        if (minSeparation >= 0.0f) {
            float f2 = this.k2;
            if (f2 > 0.0f && minSeparation > 0.0f) {
                if (this.L2 == 1) {
                    if (minSeparation < f2 || !p0(minSeparation)) {
                        throw new IllegalStateException(String.format(Y2, Float.valueOf(minSeparation), Float.valueOf(this.k2), Float.valueOf(this.k2)));
                    }
                    return;
                }
                throw new IllegalStateException(String.format(X2, Float.valueOf(minSeparation), Float.valueOf(this.k2)));
            }
            return;
        }
        throw new IllegalStateException(String.format(W2, Float.valueOf(minSeparation)));
    }

    public final float r(float f2) {
        int i;
        if (!this.h2.isEmpty() && g0()) {
            if (!u0() && !y0()) {
                i = this.h2.size() - 1;
            } else {
                i = 0;
            }
            float u1 = u1(this.h2.get(i).floatValue()) - this.C1;
            int i2 = this.p2;
            if (u1 > i2 - f2) {
                return Math.max(i2 - u1, this.L1);
            }
            return f2;
        }
        return f2;
    }

    public final boolean r0(float f2) {
        float f4 = this.G1 + (this.D1 / 2.0f);
        Iterator<Float> it = this.h2.iterator();
        if (it.hasNext()) {
            float u1 = u1(it.next().floatValue());
            if (f2 >= u1 - f4 && f2 <= u1 + f4) {
                return true;
            }
        }
        return false;
    }

    public final void r1() {
        if (this.k2 > 0.0f && !t1(this.g2)) {
            throw new IllegalStateException(String.format(V2, Float.valueOf(this.k2), Float.valueOf(this.f2), Float.valueOf(this.g2)));
        }
    }

    @InterfaceC11300zs1
    public final Float s(int i) {
        float v;
        if (this.r2) {
            v = w(20);
        } else {
            v = v();
        }
        if (i != 69) {
            if (i != 70 && i != 81) {
                switch (i) {
                    case 19:
                        if (!y0()) {
                            return null;
                        }
                        return Float.valueOf(v);
                    case 20:
                        if (!y0()) {
                            return null;
                        }
                        return Float.valueOf(-v);
                    case 21:
                        if (!u0()) {
                            v = -v;
                        }
                        return Float.valueOf(v);
                    case 22:
                        if (u0()) {
                            v = -v;
                        }
                        return Float.valueOf(v);
                    default:
                        return null;
                }
            }
            return Float.valueOf(v);
        }
        return Float.valueOf(-v);
    }

    public final boolean s0(MotionEvent motionEvent) {
        if (!o0(motionEvent) && m0()) {
            return true;
        }
        return false;
    }

    public final void s1() {
        if (this.f2 < this.g2) {
            Iterator<Float> it = this.h2.iterator();
            while (it.hasNext()) {
                Float next = it.next();
                if (next.floatValue() >= this.f2 && next.floatValue() <= this.g2) {
                    if (this.k2 > 0.0f && !t1(next.floatValue())) {
                        throw new IllegalStateException(String.format(T2, next, Float.valueOf(this.f2), Float.valueOf(this.k2), Float.valueOf(this.k2)));
                    }
                } else {
                    throw new IllegalStateException(String.format(S2, next, Float.valueOf(this.f2), Float.valueOf(this.g2)));
                }
            }
            return;
        }
        throw new IllegalStateException(String.format(U2, Float.valueOf(this.f2), Float.valueOf(this.g2)));
    }

    public void setActiveThumbIndex(int i) {
        this.i2 = i;
    }

    public void setCentered(boolean z) {
        if (this.M1 == z) {
            return;
        }
        this.M1 = z;
        if (z) {
            setValues(Float.valueOf((this.f2 + this.g2) / 2.0f));
        } else {
            setValues(Float.valueOf(this.f2));
        }
        o1(true);
    }

    public void setCustomThumbDrawable(@K60 int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setCustomThumbDrawablesForValues(@InterfaceC5670cr1 @K60 int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 2;
        }
        setLayerType(i, null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i >= 0 && i < this.h2.size()) {
            this.j2 = i;
            this.f1.X(i);
            postInvalidate();
            return;
        }
        throw new IllegalArgumentException("index out of range");
    }

    public void setHaloRadius(@BR0(from = 0) @PK1 int i) {
        if (i == this.F1) {
            return;
        }
        this.F1 = i;
        Drawable background = getBackground();
        if (!V0() && (background instanceof RippleDrawable)) {
            Z60.m((RippleDrawable) background, this.F1);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(@InterfaceC9154r30 int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.t2)) {
            return;
        }
        this.t2 = colorStateList;
        Drawable background = getBackground();
        if (!V0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.b1.setColor(Z(colorStateList));
        this.b1.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i) {
        if (this.A1 != i) {
            this.A1 = i;
            o1(true);
        }
    }

    public void setLabelFormatter(@InterfaceC11300zs1 InterfaceC7064iY0 interfaceC7064iY0) {
        this.d2 = interfaceC7064iY0;
    }

    public void setOrientation(int i) {
        if (this.x1 == i) {
            return;
        }
        this.x1 = i;
        o1(true);
    }

    public void setSeparationUnit(int i) {
        this.L2 = i;
        this.s2 = true;
        postInvalidate();
    }

    public void setStepSize(float f2) {
        if (f2 >= 0.0f) {
            if (this.k2 != f2) {
                this.k2 = f2;
                this.s2 = true;
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(String.format(V2, Float.valueOf(f2), Float.valueOf(this.f2), Float.valueOf(this.g2)));
    }

    public void setThumbElevation(float f2) {
        this.H2.x0(f2);
    }

    public void setThumbElevationResource(@InterfaceC9154r30 int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbHeight(@BR0(from = 0) @PK1 int i) {
        if (i == this.E1) {
            return;
        }
        this.E1 = i;
        this.H2.setBounds(0, 0, this.D1, i);
        Drawable drawable = this.I2;
        if (drawable != null) {
            o(drawable);
        }
        for (Drawable drawable2 : this.J2) {
            o(drawable2);
        }
        o1(false);
    }

    public void setThumbHeightResource(@InterfaceC9154r30 int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    public void setThumbRadius(@BR0(from = 0) @PK1 int i) {
        int i2 = i * 2;
        setThumbWidth(i2);
        setThumbHeight(i2);
    }

    public void setThumbRadiusResource(@InterfaceC9154r30 int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.H2.R0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@InterfaceC6509gG int i) {
        if (i != 0) {
            setThumbStrokeColor(C3220Ic.a(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f2) {
        this.H2.U0(f2);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@InterfaceC9154r30 int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.H2.G())) {
            return;
        }
        this.H2.y0(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(@PK1 int i) {
        if (this.G1 == i) {
            return;
        }
        this.G1 = i;
        invalidate();
    }

    public void setThumbWidth(@BR0(from = 0) @PK1 int i) {
        if (i == this.D1) {
            return;
        }
        this.D1 = i;
        this.H2.setShapeAppearanceModel(O22.a().q(0, this.D1 / 2.0f).m());
        this.H2.setBounds(0, 0, this.D1, this.E1);
        Drawable drawable = this.I2;
        if (drawable != null) {
            o(drawable);
        }
        for (Drawable drawable2 : this.J2) {
            o(drawable2);
        }
        o1(false);
    }

    public void setThumbWidthResource(@InterfaceC9154r30 int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    public void setTickActiveRadius(@BR0(from = 0) @PK1 int i) {
        if (this.n2 != i) {
            this.n2 = i;
            this.d1.setStrokeWidth(i * 2);
            o1(false);
        }
    }

    public void setTickActiveTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.u2)) {
            return;
        }
        this.u2 = colorStateList;
        this.d1.setColor(Z(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@BR0(from = 0) @PK1 int i) {
        if (this.o2 != i) {
            this.o2 = i;
            this.c1.setStrokeWidth(i * 2);
            o1(false);
        }
    }

    public void setTickInactiveTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.v2)) {
            return;
        }
        this.v2 = colorStateList;
        this.c1.setColor(Z(colorStateList));
        invalidate();
    }

    public void setTickTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisibilityMode(int i) {
        if (this.m2 != i) {
            this.m2 = i;
            postInvalidate();
        }
    }

    @Deprecated
    public void setTickVisible(boolean z) {
        setTickVisibilityMode(B(z));
    }

    public void setTrackActiveTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.w2)) {
            return;
        }
        this.w2 = colorStateList;
        this.Z0.setColor(Z(colorStateList));
        invalidate();
    }

    public void setTrackCornerSize(@PK1 int i) {
        if (this.K1 == i) {
            return;
        }
        this.K1 = i;
        invalidate();
    }

    public void setTrackHeight(@BR0(from = 0) @PK1 int i) {
        if (this.B1 != i) {
            this.B1 = i;
            k0();
            o1(false);
        }
    }

    public void setTrackIconActiveColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (colorStateList == this.R1) {
            return;
        }
        this.R1 = colorStateList;
        k1();
        j1();
        invalidate();
    }

    public void setTrackIconActiveEnd(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable == this.P1) {
            return;
        }
        this.P1 = drawable;
        this.Q1 = false;
        j1();
        invalidate();
    }

    public void setTrackIconActiveStart(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable == this.N1) {
            return;
        }
        this.N1 = drawable;
        this.O1 = false;
        k1();
        invalidate();
    }

    public void setTrackIconInactiveColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (colorStateList == this.W1) {
            return;
        }
        this.W1 = colorStateList;
        m1();
        l1();
        invalidate();
    }

    public void setTrackIconInactiveEnd(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable == this.U1) {
            return;
        }
        this.U1 = drawable;
        this.V1 = false;
        l1();
        invalidate();
    }

    public void setTrackIconInactiveStart(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable == this.S1) {
            return;
        }
        this.S1 = drawable;
        this.T1 = false;
        m1();
        invalidate();
    }

    public void setTrackIconSize(@PK1 int i) {
        if (this.X1 == i) {
            return;
        }
        this.X1 = i;
        invalidate();
    }

    public void setTrackInactiveTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        if (colorStateList.equals(this.x2)) {
            return;
        }
        this.x2 = colorStateList;
        this.Y0.setColor(Z(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(@PK1 int i) {
        if (this.L1 == i) {
            return;
        }
        this.L1 = i;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@PK1 int i) {
        if (this.J1 == i) {
            return;
        }
        this.J1 = i;
        this.e1.setStrokeWidth(i);
        invalidate();
    }

    public void setTrackTintList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f2) {
        this.f2 = f2;
        this.s2 = true;
        postInvalidate();
    }

    public void setValueTo(float f2) {
        this.g2 = f2;
        this.s2 = true;
        postInvalidate();
    }

    public void setValues(@InterfaceC5670cr1 Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        T0(arrayList);
    }

    public final void t(C10075uq2 c10075uq2, float f2) {
        int H0;
        int intrinsicWidth;
        int x;
        int intrinsicHeight;
        int i;
        if (y0()) {
            H0 = (this.C1 + ((int) (H0(f2) * this.p2))) - (c10075uq2.getIntrinsicHeight() / 2);
            intrinsicWidth = c10075uq2.getIntrinsicHeight() + H0;
            if (u0()) {
                x = x() - (this.Z1 + (this.E1 / 2));
                intrinsicHeight = c10075uq2.getIntrinsicWidth();
            } else {
                int x2 = x() + this.Z1 + (this.E1 / 2);
                x = c10075uq2.getIntrinsicWidth() + x2;
                i = x2;
                this.D2.set(H0, i, intrinsicWidth, x);
            }
        } else {
            H0 = (this.C1 + ((int) (H0(f2) * this.p2))) - (c10075uq2.getIntrinsicWidth() / 2);
            intrinsicWidth = c10075uq2.getIntrinsicWidth() + H0;
            x = x() - (this.Z1 + (this.E1 / 2));
            intrinsicHeight = c10075uq2.getIntrinsicHeight();
        }
        i = x - intrinsicHeight;
        this.D2.set(H0, i, intrinsicWidth, x);
    }

    public final boolean t0(MotionEvent motionEvent) {
        if (!o0(motionEvent) && n0()) {
            return true;
        }
        return false;
    }

    public final boolean t1(float f2) {
        return p0(new BigDecimal(Float.toString(f2)).subtract(new BigDecimal(Float.toString(this.f2)), MathContext.DECIMAL64).doubleValue());
    }

    public final float u(float f2) {
        int size;
        if (!this.h2.isEmpty() && g0()) {
            if (!u0() && !y0()) {
                size = 0;
            } else {
                size = this.h2.size() - 1;
            }
            float u1 = u1(this.h2.get(size).floatValue()) - this.C1;
            if (u1 < f2) {
                return Math.max(u1, this.L1);
            }
            return f2;
        }
        return f2;
    }

    public final boolean u0() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final float u1(float f2) {
        return (H0(f2) * this.p2) + this.C1;
    }

    public final float v() {
        float f2 = this.k2;
        if (f2 == 0.0f) {
            return 1.0f;
        }
        return f2;
    }

    public final boolean v0() {
        Rect rect = new Rect();
        C10920yI2.l(this).getHitRect(rect);
        if (getLocalVisibleRect(rect) && w0()) {
            return true;
        }
        return false;
    }

    public final void v1() {
        float f2 = this.k2;
        if (f2 != 0.0f) {
            if (((int) f2) != f2) {
                Log.w(R2, String.format(Z2, "stepSize", Float.valueOf(f2)));
            }
            float f4 = this.f2;
            if (((int) f4) != f4) {
                Log.w(R2, String.format(Z2, "valueFrom", Float.valueOf(f4)));
            }
            float f5 = this.g2;
            if (((int) f5) != f5) {
                Log.w(R2, String.format(Z2, "valueTo", Float.valueOf(f5)));
            }
        }
    }

    public final float w(int i) {
        float f2;
        float f4;
        float v = v();
        if ((this.g2 - this.f2) / v <= i) {
            return v;
        }
        return Math.round(f2 / f4) * v;
    }

    public final boolean w0() {
        return this.Q2;
    }

    public final int x() {
        int i = this.z1 / 2;
        int i2 = 0;
        if (this.A1 == 1 || U0()) {
            i2 = this.j1.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    public boolean x0() {
        int i = this.m2;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            throw new IllegalStateException("Unexpected tickVisibilityMode: " + this.m2);
        } else if (c0() <= d0()) {
            return true;
        } else {
            return false;
        }
    }

    public final void y(@InterfaceC5670cr1 RectF rectF, @InterfaceC5670cr1 RectF rectF2, @PK1 int i, @PK1 int i2, boolean z) {
        boolean z2;
        float f2;
        if (rectF.right - rectF.left >= (i2 * 2) + i) {
            if (!u0() && !y0()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z ^ z2) {
                f2 = rectF.left + i2;
            } else {
                f2 = (rectF.right - i2) - i;
            }
            float f4 = i;
            float x = x() - (f4 / 2.0f);
            rectF2.set(f2, x, f2 + f4, f4 + x);
            return;
        }
        rectF2.setEmpty();
    }

    public boolean y0() {
        if (this.x1 == 1) {
            return true;
        }
        return false;
    }

    public void z() {
        this.k1.clear();
    }

    public final void z0(@InterfaceC5670cr1 Resources resources) {
        this.y1 = resources.getDimensionPixelSize(C7025iN1.f.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C7025iN1.f.mtrl_slider_track_side_padding);
        this.q1 = dimensionPixelOffset;
        this.C1 = dimensionPixelOffset;
        this.r1 = resources.getDimensionPixelSize(C7025iN1.f.mtrl_slider_thumb_radius);
        this.s1 = resources.getDimensionPixelSize(C7025iN1.f.mtrl_slider_track_height);
        int i = C7025iN1.f.mtrl_slider_tick_radius;
        this.t1 = resources.getDimensionPixelSize(i);
        this.u1 = resources.getDimensionPixelSize(i);
        this.v1 = resources.getDimensionPixelSize(C7025iN1.f.mtrl_slider_tick_min_spacing);
        this.Z1 = resources.getDimensionPixelSize(C7025iN1.f.mtrl_slider_label_padding);
        this.Y1 = resources.getDimensionPixelOffset(C7025iN1.f.m3_slider_track_icon_padding);
    }

    /* renamed from: o.Ll$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public int X;

        public b() {
            this.X = -1;
        }

        public void a(int i) {
            this.X = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC3550Ll.this.f1.Y(this.X, 4);
        }

        public /* synthetic */ b(AbstractC3550Ll abstractC3550Ll, a aVar) {
            this();
        }
    }

    public AbstractC3550Ll(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.sliderStyle);
    }

    public void setCustomThumbDrawable(@InterfaceC5670cr1 Drawable drawable) {
        this.I2 = j0(drawable);
        this.J2.clear();
        postInvalidate();
    }

    public AbstractC3550Ll(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, j3), attributeSet, i);
        int recommendedTimeoutMillis;
        this.j1 = new ArrayList();
        this.k1 = new ArrayList();
        this.l1 = new ArrayList();
        this.m1 = false;
        this.H1 = -1;
        this.I1 = -1;
        this.M1 = false;
        this.O1 = false;
        this.Q1 = false;
        this.T1 = false;
        this.V1 = false;
        this.e2 = false;
        this.h2 = new ArrayList<>();
        this.i2 = -1;
        this.j2 = -1;
        this.k2 = 0.0f;
        this.r2 = false;
        this.y2 = new Path();
        this.z2 = new RectF();
        this.A2 = new RectF();
        this.B2 = new RectF();
        this.C2 = new RectF();
        this.D2 = new Rect();
        this.E2 = new RectF();
        this.F2 = new Rect();
        this.G2 = new Matrix();
        C4394Uc1 c4394Uc1 = new C4394Uc1();
        this.H2 = c4394Uc1;
        this.J2 = Collections.EMPTY_LIST;
        this.L2 = 0;
        this.N2 = new ViewTreeObserver.OnScrollChangedListener() { // from class: o.Il
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AbstractC3550Ll.this.d1();
            }
        };
        this.O2 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.Jl
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AbstractC3550Ll.this.d1();
            }
        };
        this.P2 = new Runnable() { // from class: o.Kl
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC3550Ll.a(AbstractC3550Ll.this);
            }
        };
        Context context2 = getContext();
        this.Q2 = isShown();
        this.Y0 = new Paint();
        this.Z0 = new Paint();
        Paint paint = new Paint(1);
        this.a1 = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.b1 = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.c1 = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.d1 = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.e1 = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        z0(context2.getResources());
        N0(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        c4394Uc1.I0(2);
        this.p1 = ViewConfiguration.get(context2).getScaledTouchSlop();
        c cVar = new c(this);
        this.f1 = cVar;
        C6516gH2.I1(this, cVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.g1 = accessibilityManager;
        if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
            this.M2 = recommendedTimeoutMillis;
            return;
        }
        this.M2 = d3;
    }

    public void setValues(@InterfaceC5670cr1 List<Float> list) {
        T0(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@InterfaceC5670cr1 Drawable... drawableArr) {
        this.I2 = null;
        this.J2 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.J2.add(j0(drawable));
        }
        postInvalidate();
    }

    public void setTrackIconActiveEnd(@K60 int i) {
        setTrackIconActiveEnd(i != 0 ? C3220Ic.b(getContext(), i) : null);
    }

    public void setTrackIconActiveStart(@K60 int i) {
        setTrackIconActiveStart(i != 0 ? C3220Ic.b(getContext(), i) : null);
    }

    public void setTrackIconInactiveEnd(@K60 int i) {
        setTrackIconInactiveEnd(i != 0 ? C3220Ic.b(getContext(), i) : null);
    }

    public void setTrackIconInactiveStart(@K60 int i) {
        setTrackIconInactiveStart(i != 0 ? C3220Ic.b(getContext(), i) : null);
    }
}
