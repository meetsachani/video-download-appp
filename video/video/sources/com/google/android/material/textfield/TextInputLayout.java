package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.BR0;
import o.C10122v20;
import o.C10201vM;
import o.C10460wP0;
import o.C10576wt2;
import o.C10861y4;
import o.C10920yI2;
import o.C2664Cm2;
import o.C2762Dm2;
import o.C2860Em2;
import o.C2872Ep2;
import o.C2969Fm2;
import o.C3067Gm2;
import o.C3165Hm2;
import o.C3220Ic;
import o.C3263Im2;
import o.C3517Lc2;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C4820Ym;
import o.C4930Zm2;
import o.C5369bc2;
import o.C5600ca;
import o.C6516gH2;
import o.C6566gU0;
import o.C6597gd1;
import o.C7025iN1;
import o.C7351jk0;
import o.C7608kn2;
import o.C9038qc;
import o.C9179r91;
import o.C9811tl1;
import o.D60;
import o.ES1;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC3329Je2;
import o.InterfaceC3614Mc2;
import o.InterfaceC4698Xf2;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC6509gG;
import o.InterfaceC9154r30;
import o.J;
import o.JF;
import o.K60;
import o.K90;
import o.O22;
import o.OL1;
import o.PK1;
import o.Q3;
import o.RT;
import o.X60;
import o.XE;
import o.Y81;
import o.ZP;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int A2 = 167;
    public static final int B2 = 87;
    public static final int C2 = 67;
    public static final int D2 = -1;
    public static final int E2 = -1;
    public static final String G2 = "TextInputLayout";
    public static final int H2 = 0;
    public static final int I2 = 1;
    public static final int J2 = 2;
    public static final int K2 = -1;
    public static final int L2 = 0;
    public static final int M2 = 1;
    public static final int N2 = 2;
    public static final int O2 = 3;
    public static final String y2 = "TextInputLayout";
    @InterfaceC11300zs1
    public ColorStateList A1;
    public boolean B1;
    public CharSequence C1;
    public boolean D1;
    @InterfaceC11300zs1
    public C4394Uc1 E1;
    public C4394Uc1 F1;
    public StateListDrawable G1;
    public boolean H1;
    @InterfaceC11300zs1
    public C4394Uc1 I1;
    @InterfaceC11300zs1
    public C4394Uc1 J1;
    @InterfaceC5670cr1
    public O22 K1;
    public boolean L1;
    public final int M1;
    public int N1;
    public int O1;
    public int P1;
    public int Q1;
    public int R1;
    @JF
    public int S1;
    @JF
    public int T1;
    public final Rect U1;
    public final Rect V1;
    public final RectF W1;
    public Typeface X1;
    @InterfaceC5670cr1
    public final FrameLayout Y0;
    @InterfaceC11300zs1
    public Drawable Y1;
    @InterfaceC5670cr1
    public final C5369bc2 Z0;
    public int Z1;
    @InterfaceC5670cr1
    public final com.google.android.material.textfield.a a1;
    public final LinkedHashSet<i> a2;
    public final int b1;
    @InterfaceC11300zs1
    public Drawable b2;
    public EditText c1;
    public int c2;
    public CharSequence d1;
    public Drawable d2;
    public int e1;
    public ColorStateList e2;
    public int f1;
    public ColorStateList f2;
    public int g1;
    @JF
    public int g2;
    public int h1;
    @JF
    public int h2;
    public final C10460wP0 i1;
    @JF
    public int i2;
    public boolean j1;
    public ColorStateList j2;
    public int k1;
    @JF
    public int k2;
    public boolean l1;
    @JF
    public int l2;
    @InterfaceC5670cr1
    public h m1;
    @JF
    public int m2;
    @InterfaceC11300zs1
    public TextView n1;
    @JF
    public int n2;
    public int o1;
    @JF
    public int o2;
    public int p1;
    public int p2;
    public CharSequence q1;
    public boolean q2;
    public boolean r1;
    public final XE r2;
    public TextView s1;
    public boolean s2;
    @InterfaceC11300zs1
    public ColorStateList t1;
    public boolean t2;
    public int u1;
    public ValueAnimator u2;
    @InterfaceC11300zs1
    public C7351jk0 v1;
    public boolean v2;
    @InterfaceC11300zs1
    public C7351jk0 w1;
    public boolean w2;
    @InterfaceC11300zs1
    public ColorStateList x1;
    public boolean x2;
    @InterfaceC11300zs1
    public ColorStateList y1;
    @InterfaceC11300zs1
    public ColorStateList z1;
    public static final int z2 = C7025iN1.n.Widget_Design_TextInputLayout;
    public static final int[][] F2 = {new int[]{16842919}, new int[0]};

    /* loaded from: classes3.dex */
    public class a implements TextWatcher {
        public int X;
        public final /* synthetic */ EditText Y;

        public a(EditText editText) {
            this.Y = editText;
            this.X = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@InterfaceC5670cr1 Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.Q0(!textInputLayout.w2);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.j1) {
                textInputLayout2.F0(editable);
            }
            if (TextInputLayout.this.r1) {
                TextInputLayout.this.U0(editable);
            }
            int lineCount = this.Y.getLineCount();
            int i = this.X;
            if (lineCount != i) {
                if (lineCount < i) {
                    int minimumHeight = this.Y.getMinimumHeight();
                    int i2 = TextInputLayout.this.p2;
                    if (minimumHeight != i2) {
                        this.Y.setMinimumHeight(i2);
                    }
                }
                this.X = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes3.dex */
    public class b extends Q3 {
        public b() {
        }

        @Override // o.Q3
        public void g(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.r2(false);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.a1.i();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@InterfaceC5670cr1 ValueAnimator valueAnimator) {
            TextInputLayout.this.r2.F0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends Q3 {
        public final TextInputLayout d;

        public e(@InterfaceC5670cr1 TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // o.Q3
        public void g(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            CharSequence charSequence;
            boolean z;
            String str;
            super.g(view, c10861y4);
            EditText editText = this.d.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence placeholderText = this.d.getPlaceholderText();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean a0 = this.d.a0();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            if (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) {
                z = false;
            } else {
                z = true;
            }
            if (!isEmpty2) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.d.Z0.B(c10861y4);
            if (!isEmpty) {
                c10861y4.f2(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                c10861y4.f2(str);
                if (!a0 && placeholderText != null) {
                    c10861y4.f2(str + C6566gU0.h + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c10861y4.f2(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    c10861y4.C1(str);
                } else {
                    if (!isEmpty) {
                        str = ((Object) charSequence) + C6566gU0.h + str;
                    }
                    c10861y4.f2(str);
                }
                c10861y4.b2(isEmpty);
            }
            c10861y4.L1((charSequence == null || charSequence.length() != counterMaxLength) ? -1 : -1);
            if (z) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                c10861y4.w1(error);
            }
            View u = this.d.i1.u();
            if (u != null) {
                c10861y4.F1(u);
            }
            this.d.a1.o().o(view, c10861y4);
        }

        @Override // o.Q3
        public void h(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.d.a1.o().p(view, accessibilityEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface f {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface g {
    }

    /* loaded from: classes3.dex */
    public interface h {
        int a(@InterfaceC11300zs1 Editable editable);
    }

    /* loaded from: classes3.dex */
    public interface i {
        void a(@InterfaceC5670cr1 TextInputLayout textInputLayout);
    }

    /* loaded from: classes3.dex */
    public interface j {
        void a(@InterfaceC5670cr1 TextInputLayout textInputLayout, int i);
    }

    /* loaded from: classes3.dex */
    public static class k extends J {
        public static final Parcelable.Creator<k> CREATOR = new a();
        public boolean Y0;
        @InterfaceC11300zs1
        public CharSequence Z;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<k> {
            @Override // android.os.Parcelable.Creator
            @InterfaceC11300zs1
            /* renamed from: a */
            public k createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                return new k(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @InterfaceC5670cr1
            /* renamed from: b */
            public k createFromParcel(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
                return new k(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: c */
            public k[] newArray(int i) {
                return new k[i];
            }
        }

        public k(Parcelable parcelable) {
            super(parcelable);
        }

        @InterfaceC5670cr1
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.Z) + "}";
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.Z, parcel, i);
            parcel.writeInt(this.Y0 ? 1 : 0);
        }

        public k(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.Y0 = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static void G0(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 TextView textView, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            i4 = C7025iN1.m.character_counter_overflowed_content_description;
        } else {
            i4 = C7025iN1.m.character_counter_content_description;
        }
        textView.setContentDescription(context.getString(i4, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static Drawable M(C4394Uc1 c4394Uc1, int i2, int i3, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{C9179r91.t(i3, i2, 0.1f), i2}), c4394Uc1, c4394Uc1);
    }

    public static Drawable P(Context context, C4394Uc1 c4394Uc1, int i2, int[][] iArr) {
        int c2 = C9179r91.c(context, C7025iN1.c.colorSurface, "TextInputLayout");
        C4394Uc1 c4394Uc12 = new C4394Uc1(c4394Uc1.getShapeAppearanceModel());
        int t = C9179r91.t(i2, c2, 0.1f);
        c4394Uc12.y0(new ColorStateList(iArr, new int[]{t, 0}));
        c4394Uc12.setTint(c2);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{t, c2});
        C4394Uc1 c4394Uc13 = new C4394Uc1(c4394Uc1.getShapeAppearanceModel());
        c4394Uc13.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c4394Uc12, c4394Uc13), c4394Uc1});
    }

    public static /* synthetic */ int c(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @InterfaceC11300zs1
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.c1;
        if ((editText instanceof AutoCompleteTextView) && !K90.a(editText)) {
            int d2 = C9179r91.d(this.c1, OL1.b.G0);
            int i2 = this.N1;
            if (i2 == 2) {
                return P(getContext(), this.E1, d2, F2);
            }
            if (i2 == 1) {
                return M(this.E1, this.T1, d2, F2);
            }
            return null;
        }
        return this.E1;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.G1 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.G1 = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.G1.addState(new int[0], L(false));
        }
        return this.G1;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.F1 == null) {
            this.F1 = L(true);
        }
        return this.F1;
    }

    public static void m0(@InterfaceC5670cr1 ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m0((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.c1 == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.c1 = editText;
            int i2 = this.e1;
            if (i2 != -1) {
                setMinEms(i2);
            } else {
                setMinWidth(this.g1);
            }
            int i3 = this.f1;
            if (i3 != -1) {
                setMaxEms(i3);
            } else {
                setMaxWidth(this.h1);
            }
            this.H1 = false;
            i0();
            setTextInputAccessibilityDelegate(new e(this));
            this.r2.T0(this.c1.getTypeface());
            this.r2.C0(this.c1.getTextSize());
            this.r2.w0(this.c1.getLetterSpacing());
            int gravity = this.c1.getGravity();
            this.r2.o0((gravity & (-113)) | 48);
            this.r2.B0(gravity);
            this.p2 = editText.getMinimumHeight();
            this.c1.addTextChangedListener(new a(editText));
            if (this.e2 == null) {
                this.e2 = this.c1.getHintTextColors();
            }
            if (this.B1) {
                if (TextUtils.isEmpty(this.C1)) {
                    CharSequence hint = this.c1.getHint();
                    this.d1 = hint;
                    setHint(hint);
                    this.c1.setHint((CharSequence) null);
                }
                this.D1 = true;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                I0();
            }
            if (this.n1 != null) {
                F0(this.c1.getText());
            }
            K0();
            this.i1.f();
            this.Z0.bringToFront();
            this.a1.bringToFront();
            H();
            this.a1.D0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            R0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.C1)) {
            this.C1 = charSequence;
            this.r2.Q0(charSequence);
            if (!this.q2) {
                j0();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.r1 == z) {
            return;
        }
        if (z) {
            l();
        } else {
            s0();
            this.s1 = null;
        }
        this.r1 = z;
    }

    public void A() {
        this.a2.clear();
    }

    public final void A0() {
        if (this.s1 != null && this.r1 && !TextUtils.isEmpty(this.q1)) {
            this.s1.setText(this.q1);
            C10576wt2.b(this.Y0, this.v1);
            this.s1.setVisibility(0);
            this.s1.bringToFront();
        }
    }

    public void B() {
        this.a1.j();
    }

    public final void B0() {
        if (this.N1 == 1) {
            if (C4297Tc1.l(getContext())) {
                this.O1 = getResources().getDimensionPixelSize(C7025iN1.f.material_font_2_0_box_collapsed_padding_top);
            } else if (C4297Tc1.k(getContext())) {
                this.O1 = getResources().getDimensionPixelSize(C7025iN1.f.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    public final void C() {
        if (F()) {
            ((RT) this.E1).i1();
        }
    }

    public final void C0(@InterfaceC5670cr1 Rect rect) {
        C4394Uc1 c4394Uc1 = this.I1;
        if (c4394Uc1 != null) {
            int i2 = rect.bottom;
            c4394Uc1.setBounds(rect.left, i2 - this.Q1, rect.right, i2);
        }
        C4394Uc1 c4394Uc12 = this.J1;
        if (c4394Uc12 != null) {
            int i3 = rect.bottom;
            c4394Uc12.setBounds(rect.left, i3 - this.R1, rect.right, i3);
        }
    }

    public final void D(boolean z) {
        ValueAnimator valueAnimator = this.u2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.u2.cancel();
        }
        if (z && this.t2) {
            n(1.0f);
        } else {
            this.r2.F0(1.0f);
        }
        this.q2 = false;
        if (F()) {
            j0();
        }
        T0();
        this.Z0.m(false);
        this.a1.L(false);
    }

    public final void D0(int i2) {
        this.r2.W0(i2);
        Rect rect = this.U1;
        C10122v20.a(this, this.c1, rect);
        this.r2.i0(t(rect));
        P0();
        m();
        N0(i2);
    }

    public final C7351jk0 E() {
        C7351jk0 c7351jk0 = new C7351jk0();
        c7351jk0.I0(C9811tl1.f(getContext(), C7025iN1.c.motionDurationShort2, 87));
        c7351jk0.K0(C9811tl1.g(getContext(), C7025iN1.c.motionEasingLinearInterpolator, C5600ca.a));
        return c7351jk0;
    }

    public final void E0() {
        Editable text;
        if (this.n1 != null) {
            EditText editText = this.c1;
            if (editText == null) {
                text = null;
            } else {
                text = editText.getText();
            }
            F0(text);
        }
    }

    public final boolean F() {
        if (this.B1 && !TextUtils.isEmpty(this.C1) && (this.E1 instanceof RT)) {
            return true;
        }
        return false;
    }

    public void F0(@InterfaceC11300zs1 Editable editable) {
        boolean z;
        int a2 = this.m1.a(editable);
        boolean z3 = this.l1;
        int i2 = this.k1;
        if (i2 == -1) {
            this.n1.setText(String.valueOf(a2));
            this.n1.setContentDescription(null);
            this.l1 = false;
        } else {
            if (a2 > i2) {
                z = true;
            } else {
                z = false;
            }
            this.l1 = z;
            G0(getContext(), this.n1, a2, this.k1, this.l1);
            if (z3 != this.l1) {
                H0();
            }
            this.n1.setText(C4820Ym.c().q(getContext().getString(C7025iN1.m.character_counter_pattern, Integer.valueOf(a2), Integer.valueOf(this.k1))));
        }
        if (this.c1 != null && z3 != this.l1) {
            Q0(false);
            W0();
            K0();
        }
    }

    @InterfaceC5056aJ2
    public boolean G() {
        if (F() && ((RT) this.E1).h1()) {
            return true;
        }
        return false;
    }

    public final void H() {
        Iterator<i> it = this.a2.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void H0() {
        int i2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.n1;
        if (textView != null) {
            if (this.l1) {
                i2 = this.o1;
            } else {
                i2 = this.p1;
            }
            w0(textView, i2);
            if (!this.l1 && (colorStateList2 = this.x1) != null) {
                this.n1.setTextColor(colorStateList2);
            }
            if (this.l1 && (colorStateList = this.y1) != null) {
                this.n1.setTextColor(colorStateList);
            }
        }
    }

    public final void I(Canvas canvas) {
        C4394Uc1 c4394Uc1;
        if (this.J1 != null && (c4394Uc1 = this.I1) != null) {
            c4394Uc1.draw(canvas);
            if (this.c1.isFocused()) {
                Rect bounds = this.J1.getBounds();
                Rect bounds2 = this.I1.getBounds();
                float I = this.r2.I();
                int centerX = bounds2.centerX();
                bounds.left = C5600ca.c(centerX, bounds2.left, I);
                bounds.right = C5600ca.c(centerX, bounds2.right, I);
                this.J1.draw(canvas);
            }
        }
    }

    @ES1(29)
    public final void I0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.z1;
        if (colorStateList2 == null) {
            colorStateList2 = C9179r91.l(getContext(), OL1.b.F0);
        }
        EditText editText = this.c1;
        if (editText != null && C3263Im2.a(editText) != null) {
            Drawable mutate = D60.r(C3263Im2.a(this.c1)).mutate();
            if (c0() && (colorStateList = this.A1) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    public final void J(@InterfaceC5670cr1 Canvas canvas) {
        if (this.B1) {
            this.r2.k(canvas);
        }
    }

    public boolean J0() {
        boolean z;
        if (this.c1 == null) {
            return false;
        }
        boolean z3 = true;
        if (z0()) {
            int measuredWidth = this.Z0.getMeasuredWidth() - this.c1.getPaddingLeft();
            if (this.Y1 == null || this.Z1 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.Y1 = colorDrawable;
                this.Z1 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.c1.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.Y1;
            if (drawable != drawable2) {
                this.c1.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.Y1 != null) {
                Drawable[] compoundDrawablesRelative2 = this.c1.getCompoundDrawablesRelative();
                this.c1.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.Y1 = null;
                z = true;
            }
            z = false;
        }
        if (y0()) {
            int measuredWidth2 = this.a1.B().getMeasuredWidth() - this.c1.getPaddingRight();
            CheckableImageButton m = this.a1.m();
            if (m != null) {
                measuredWidth2 = measuredWidth2 + m.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) m.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.c1.getCompoundDrawablesRelative();
            Drawable drawable3 = this.b2;
            if (drawable3 != null && this.c2 != measuredWidth2) {
                this.c2 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.c1.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.b2, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.b2 = colorDrawable2;
                this.c2 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.b2;
            if (drawable4 != drawable5) {
                this.d2 = drawable4;
                this.c1.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.b2 != null) {
            Drawable[] compoundDrawablesRelative4 = this.c1.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.b2) {
                this.c1.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.d2, compoundDrawablesRelative4[3]);
            } else {
                z3 = z;
            }
            this.b2 = null;
            return z3;
        }
        return z;
    }

    public final void K(boolean z) {
        ValueAnimator valueAnimator = this.u2;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.u2.cancel();
        }
        if (z && this.t2) {
            n(0.0f);
        } else {
            this.r2.F0(0.0f);
        }
        if (F() && ((RT) this.E1).h1()) {
            C();
        }
        this.q2 = true;
        Q();
        this.Z0.m(true);
        this.a1.L(true);
    }

    public void K0() {
        Drawable background;
        TextView textView;
        EditText editText = this.c1;
        if (editText != null && this.N1 == 0 && (background = editText.getBackground()) != null) {
            if (X60.a(background)) {
                background = background.mutate();
            }
            if (x0()) {
                background.setColorFilter(C9038qc.e(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.l1 && (textView = this.n1) != null) {
                background.setColorFilter(C9038qc.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                D60.c(background);
                this.c1.refreshDrawableState();
            }
        }
    }

    public final C4394Uc1 L(boolean z) {
        float f2;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C7025iN1.f.mtrl_shape_corner_size_small_component);
        if (z) {
            f2 = dimensionPixelOffset2;
        } else {
            f2 = 0.0f;
        }
        EditText editText = this.c1;
        if (editText instanceof Y81) {
            dimensionPixelOffset = ((Y81) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(C7025iN1.f.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(C7025iN1.f.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        O22 m = O22.a().K(f2).P(f2).x(dimensionPixelOffset2).C(dimensionPixelOffset2).m();
        EditText editText2 = this.c1;
        if (editText2 instanceof Y81) {
            colorStateList = ((Y81) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        C4394Uc1 t = C4394Uc1.t(getContext(), dimensionPixelOffset, colorStateList);
        t.setShapeAppearanceModel(m);
        t.B0(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return t;
    }

    public final void L0() {
        this.c1.setBackground(getEditTextBoxBackground());
    }

    public void M0() {
        EditText editText = this.c1;
        if (editText != null && this.E1 != null) {
            if ((this.H1 || editText.getBackground() == null) && this.N1 != 0) {
                L0();
                this.H1 = true;
            }
        }
    }

    public final int N(int i2, boolean z) {
        int compoundPaddingLeft;
        if (!z && getPrefixText() != null) {
            compoundPaddingLeft = this.Z0.c();
        } else if (z && getSuffixText() != null) {
            compoundPaddingLeft = this.a1.A();
        } else {
            compoundPaddingLeft = this.c1.getCompoundPaddingLeft();
        }
        return i2 + compoundPaddingLeft;
    }

    public final void N0(int i2) {
        boolean z;
        float f2;
        if (this.c1 != null) {
            float E = this.r2.E();
            float f3 = 0.0f;
            if (this.q1 != null) {
                TextPaint textPaint = new TextPaint(129);
                textPaint.set(this.s1.getPaint());
                textPaint.setTextSize(this.s1.getTextSize());
                textPaint.setTypeface(this.s1.getTypeface());
                textPaint.setLetterSpacing(this.s1.getLetterSpacing());
                try {
                    C3517Lc2 c2 = C3517Lc2.c(this.q1, textPaint, i2);
                    if (getLayoutDirection() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    StaticLayout a2 = c2.i(z).h(true).j(this.s1.getLineSpacingExtra(), this.s1.getLineSpacingMultiplier()).m(new InterfaceC3614Mc2() { // from class: o.Lm2
                        @Override // o.InterfaceC3614Mc2
                        public final void a(StaticLayout.Builder builder) {
                            builder.setBreakStrategy(TextInputLayout.this.s1.getBreakStrategy());
                        }
                    }).a();
                    if (this.N1 == 1) {
                        f2 = this.r2.r() + this.O1 + this.b1;
                    } else {
                        f2 = 0.0f;
                    }
                    f3 = a2.getHeight() + f2;
                } catch (C3517Lc2.a e2) {
                    Log.e("TextInputLayout", e2.getCause().getMessage(), e2);
                }
            }
            float max = Math.max(E, f3);
            if (this.c1.getMeasuredHeight() < max) {
                this.c1.setMinimumHeight(Math.round(max));
            }
        }
    }

    public final int O(int i2, boolean z) {
        int compoundPaddingRight;
        if (!z && getSuffixText() != null) {
            compoundPaddingRight = this.a1.A();
        } else if (z && getPrefixText() != null) {
            compoundPaddingRight = this.Z0.c();
        } else {
            compoundPaddingRight = this.c1.getCompoundPaddingRight();
        }
        return i2 - compoundPaddingRight;
    }

    public final boolean O0() {
        int max;
        if (this.c1 == null || this.c1.getMeasuredHeight() >= (max = Math.max(this.a1.getMeasuredHeight(), this.Z0.getMeasuredHeight()))) {
            return false;
        }
        this.c1.setMinimumHeight(max);
        return true;
    }

    public final void P0() {
        if (this.N1 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.Y0.getLayoutParams();
            int x = x();
            if (x != layoutParams.topMargin) {
                layoutParams.topMargin = x;
                this.Y0.requestLayout();
            }
        }
    }

    public final void Q() {
        TextView textView = this.s1;
        if (textView != null && this.r1) {
            textView.setText((CharSequence) null);
            C10576wt2.b(this.Y0, this.w1);
            this.s1.setVisibility(4);
        }
    }

    public void Q0(boolean z) {
        R0(z, false);
    }

    public boolean R() {
        return this.j1;
    }

    public final void R0(boolean z, boolean z3) {
        boolean z4;
        ColorStateList colorStateList;
        TextView textView;
        int i2;
        boolean isEnabled = isEnabled();
        EditText editText = this.c1;
        boolean z5 = false;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z4 = true;
        } else {
            z4 = false;
        }
        EditText editText2 = this.c1;
        if (editText2 != null && editText2.hasFocus()) {
            z5 = true;
        }
        ColorStateList colorStateList2 = this.e2;
        if (colorStateList2 != null) {
            this.r2.g0(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.e2;
            if (colorStateList3 != null) {
                i2 = colorStateList3.getColorForState(new int[]{-16842910}, this.o2);
            } else {
                i2 = this.o2;
            }
            this.r2.g0(ColorStateList.valueOf(i2));
        } else if (x0()) {
            this.r2.g0(this.i1.s());
        } else if (this.l1 && (textView = this.n1) != null) {
            this.r2.g0(textView.getTextColors());
        } else if (z5 && (colorStateList = this.f2) != null) {
            this.r2.n0(colorStateList);
        }
        if (!z4 && this.s2 && (!isEnabled() || !z5)) {
            if (z3 || !this.q2) {
                K(z);
            }
        } else if (!z3 && !this.q2) {
        } else {
            D(z);
        }
    }

    public boolean S() {
        return this.a1.G();
    }

    public final void S0() {
        EditText editText;
        if (this.s1 != null && (editText = this.c1) != null) {
            this.s1.setGravity(editText.getGravity());
            this.s1.setPadding(this.c1.getCompoundPaddingLeft(), this.c1.getCompoundPaddingTop(), this.c1.getCompoundPaddingRight(), this.c1.getCompoundPaddingBottom());
        }
    }

    public boolean T() {
        return this.a1.I();
    }

    public final void T0() {
        Editable text;
        EditText editText = this.c1;
        if (editText == null) {
            text = null;
        } else {
            text = editText.getText();
        }
        U0(text);
    }

    public boolean U() {
        return this.i1.F();
    }

    public final void U0(@InterfaceC11300zs1 Editable editable) {
        if (this.m1.a(editable) == 0 && !this.q2) {
            A0();
        } else {
            Q();
        }
    }

    public boolean V() {
        return this.s2;
    }

    public final void V0(boolean z, boolean z3) {
        int defaultColor = this.j2.getDefaultColor();
        int colorForState = this.j2.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.j2.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.S1 = colorForState2;
        } else if (z3) {
            this.S1 = colorForState;
        } else {
            this.S1 = defaultColor;
        }
    }

    @InterfaceC5056aJ2
    public final boolean W() {
        return this.i1.y();
    }

    public void W0() {
        boolean z;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.E1 != null && this.N1 != 0) {
            boolean z3 = false;
            if (!isFocused() && ((editText2 = this.c1) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (isHovered() || ((editText = this.c1) != null && editText.isHovered())) {
                z3 = true;
            }
            if (!isEnabled()) {
                this.S1 = this.o2;
            } else if (x0()) {
                if (this.j2 != null) {
                    V0(z, z3);
                } else {
                    this.S1 = getErrorCurrentTextColors();
                }
            } else if (this.l1 && (textView = this.n1) != null) {
                if (this.j2 != null) {
                    V0(z, z3);
                } else {
                    this.S1 = textView.getCurrentTextColor();
                }
            } else if (z) {
                this.S1 = this.i2;
            } else if (z3) {
                this.S1 = this.h2;
            } else {
                this.S1 = this.g2;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                I0();
            }
            this.a1.M();
            p0();
            if (this.N1 == 2) {
                int i2 = this.P1;
                if (z && isEnabled()) {
                    this.P1 = this.R1;
                } else {
                    this.P1 = this.Q1;
                }
                if (this.P1 != i2) {
                    l0();
                }
            }
            if (this.N1 == 1) {
                if (!isEnabled()) {
                    this.T1 = this.l2;
                } else if (z3 && !z) {
                    this.T1 = this.n2;
                } else if (z) {
                    this.T1 = this.m2;
                } else {
                    this.T1 = this.k2;
                }
            }
            o();
        }
    }

    public boolean X() {
        return this.i1.G();
    }

    public boolean Y() {
        return this.t2;
    }

    public boolean Z() {
        return this.B1;
    }

    public final boolean a0() {
        return this.q2;
    }

    @Override // android.view.ViewGroup
    public void addView(@InterfaceC5670cr1 View view, int i2, @InterfaceC5670cr1 ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.Y0.addView(view, layoutParams2);
            this.Y0.setLayoutParams(layoutParams);
            P0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public final boolean b0() {
        if (getHintMaxLines() == 1) {
            return true;
        }
        return false;
    }

    public final boolean c0() {
        if (!x0()) {
            if (this.n1 == null || !this.l1) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Deprecated
    public boolean d0() {
        return this.a1.K();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@InterfaceC5670cr1 ViewStructure viewStructure, int i2) {
        EditText editText = this.c1;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.d1 != null) {
            boolean z = this.D1;
            this.D1 = false;
            CharSequence hint = editText.getHint();
            this.c1.setHint(this.d1);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
                return;
            } finally {
                this.c1.setHint(hint);
                this.D1 = z;
            }
        }
        C2860Em2.a(viewStructure, C2762Dm2.a(this));
        C2969Fm2.a(this, viewStructure, i2);
        C3067Gm2.a(this, viewStructure, i2);
        viewStructure.setChildCount(this.Y0.getChildCount());
        for (int i3 = 0; i3 < this.Y0.getChildCount(); i3++) {
            View childAt = this.Y0.getChildAt(i3);
            ViewStructure newChild = viewStructure.newChild(i3);
            C3165Hm2.a(childAt, newChild, i2);
            if (childAt == this.c1) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@InterfaceC5670cr1 SparseArray<Parcelable> sparseArray) {
        this.w2 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.w2 = false;
    }

    @Override // android.view.View
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        super.draw(canvas);
        J(canvas);
        I(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        if (this.v2) {
            return;
        }
        boolean z3 = true;
        this.v2 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        XE xe = this.r2;
        if (xe != null) {
            z = xe.O0(drawableState);
        } else {
            z = false;
        }
        if (this.c1 != null) {
            if (!isLaidOut() || !isEnabled()) {
                z3 = false;
            }
            Q0(z3);
        }
        K0();
        W0();
        if (z) {
            invalidate();
        }
        this.v2 = false;
    }

    @HT1({HT1.a.Y})
    public boolean e0() {
        return this.D1;
    }

    public final boolean f0() {
        if (this.N1 == 1 && this.c1.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    public boolean g0() {
        return this.Z0.k();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.c1;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + x();
        }
        return super.getBaseline();
    }

    @InterfaceC5670cr1
    public C4394Uc1 getBoxBackground() {
        int i2 = this.N1;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException();
        }
        return this.E1;
    }

    public int getBoxBackgroundColor() {
        return this.T1;
    }

    public int getBoxBackgroundMode() {
        return this.N1;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.O1;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (C10920yI2.s(this)) {
            return this.K1.j().a(this.W1);
        }
        return this.K1.l().a(this.W1);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (C10920yI2.s(this)) {
            return this.K1.l().a(this.W1);
        }
        return this.K1.j().a(this.W1);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (C10920yI2.s(this)) {
            return this.K1.r().a(this.W1);
        }
        return this.K1.t().a(this.W1);
    }

    public float getBoxCornerRadiusTopStart() {
        if (C10920yI2.s(this)) {
            return this.K1.t().a(this.W1);
        }
        return this.K1.r().a(this.W1);
    }

    public int getBoxStrokeColor() {
        return this.i2;
    }

    @InterfaceC11300zs1
    public ColorStateList getBoxStrokeErrorColor() {
        return this.j2;
    }

    public int getBoxStrokeWidth() {
        return this.Q1;
    }

    public int getBoxStrokeWidthFocused() {
        return this.R1;
    }

    public int getCounterMaxLength() {
        return this.k1;
    }

    @InterfaceC11300zs1
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.j1 && this.l1 && (textView = this.n1) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @InterfaceC11300zs1
    public ColorStateList getCounterOverflowTextColor() {
        return this.y1;
    }

    @InterfaceC11300zs1
    public ColorStateList getCounterTextColor() {
        return this.x1;
    }

    @InterfaceC11300zs1
    @ES1(29)
    public ColorStateList getCursorColor() {
        return this.z1;
    }

    @InterfaceC11300zs1
    @ES1(29)
    public ColorStateList getCursorErrorColor() {
        return this.A1;
    }

    @InterfaceC11300zs1
    public ColorStateList getDefaultHintTextColor() {
        return this.e2;
    }

    @InterfaceC11300zs1
    public EditText getEditText() {
        return this.c1;
    }

    @InterfaceC11300zs1
    public CharSequence getEndIconContentDescription() {
        return this.a1.n();
    }

    @InterfaceC11300zs1
    public Drawable getEndIconDrawable() {
        return this.a1.p();
    }

    public int getEndIconMinSize() {
        return this.a1.q();
    }

    public int getEndIconMode() {
        return this.a1.r();
    }

    @InterfaceC5670cr1
    public ImageView.ScaleType getEndIconScaleType() {
        return this.a1.s();
    }

    @InterfaceC5670cr1
    public CheckableImageButton getEndIconView() {
        return this.a1.t();
    }

    @InterfaceC11300zs1
    public CharSequence getError() {
        if (this.i1.F()) {
            return this.i1.q();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.i1.o();
    }

    @InterfaceC11300zs1
    public CharSequence getErrorContentDescription() {
        return this.i1.p();
    }

    @JF
    public int getErrorCurrentTextColors() {
        return this.i1.r();
    }

    @InterfaceC11300zs1
    public Drawable getErrorIconDrawable() {
        return this.a1.u();
    }

    @InterfaceC11300zs1
    public CharSequence getHelperText() {
        if (this.i1.G()) {
            return this.i1.t();
        }
        return null;
    }

    @JF
    public int getHelperTextCurrentTextColor() {
        return this.i1.w();
    }

    @InterfaceC11300zs1
    public CharSequence getHint() {
        if (this.B1) {
            return this.C1;
        }
        return null;
    }

    @InterfaceC5056aJ2
    public final float getHintCollapsedTextHeight() {
        return this.r2.r();
    }

    @InterfaceC5056aJ2
    public final int getHintCurrentCollapsedTextColor() {
        return this.r2.w();
    }

    public int getHintMaxLines() {
        return this.r2.A();
    }

    @InterfaceC11300zs1
    public ColorStateList getHintTextColor() {
        return this.f2;
    }

    @InterfaceC5670cr1
    public h getLengthCounter() {
        return this.m1;
    }

    public int getMaxEms() {
        return this.f1;
    }

    @PK1
    public int getMaxWidth() {
        return this.h1;
    }

    public int getMinEms() {
        return this.e1;
    }

    @PK1
    public int getMinWidth() {
        return this.g1;
    }

    @InterfaceC11300zs1
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.a1.w();
    }

    @InterfaceC11300zs1
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.a1.x();
    }

    @InterfaceC11300zs1
    public CharSequence getPlaceholderText() {
        if (this.r1) {
            return this.q1;
        }
        return null;
    }

    @InterfaceC4698Xf2
    public int getPlaceholderTextAppearance() {
        return this.u1;
    }

    @InterfaceC11300zs1
    public ColorStateList getPlaceholderTextColor() {
        return this.t1;
    }

    @InterfaceC11300zs1
    public CharSequence getPrefixText() {
        return this.Z0.a();
    }

    @InterfaceC11300zs1
    public ColorStateList getPrefixTextColor() {
        return this.Z0.b();
    }

    @InterfaceC5670cr1
    public TextView getPrefixTextView() {
        return this.Z0.d();
    }

    @InterfaceC5670cr1
    public O22 getShapeAppearanceModel() {
        return this.K1;
    }

    @InterfaceC11300zs1
    public CharSequence getStartIconContentDescription() {
        return this.Z0.e();
    }

    @InterfaceC11300zs1
    public Drawable getStartIconDrawable() {
        return this.Z0.f();
    }

    public int getStartIconMinSize() {
        return this.Z0.g();
    }

    @InterfaceC5670cr1
    public ImageView.ScaleType getStartIconScaleType() {
        return this.Z0.h();
    }

    @InterfaceC11300zs1
    public CharSequence getSuffixText() {
        return this.a1.y();
    }

    @InterfaceC11300zs1
    public ColorStateList getSuffixTextColor() {
        return this.a1.z();
    }

    @InterfaceC5670cr1
    public TextView getSuffixTextView() {
        return this.a1.B();
    }

    @InterfaceC11300zs1
    public Typeface getTypeface() {
        return this.X1;
    }

    public boolean h0() {
        return this.Z0.l();
    }

    public final void i0() {
        r();
        M0();
        W0();
        B0();
        m();
        if (this.N1 != 0) {
            P0();
        }
        v0();
    }

    public void j(@InterfaceC5670cr1 i iVar) {
        this.a2.add(iVar);
        if (this.c1 != null) {
            iVar.a(this);
        }
    }

    public final void j0() {
        if (F()) {
            RectF rectF = this.W1;
            this.r2.o(rectF, this.c1.getWidth(), this.c1.getGravity());
            if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                q(rectF);
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.P1);
                rectF.top = 0.0f;
                ((RT) this.E1).k1(rectF);
            }
        }
    }

    public void k(@InterfaceC5670cr1 j jVar) {
        this.a1.g(jVar);
    }

    @Deprecated
    public void k0(boolean z) {
        this.a1.A0(z);
    }

    public final void l() {
        TextView textView = this.s1;
        if (textView != null) {
            this.Y0.addView(textView);
            this.s1.setVisibility(0);
        }
    }

    public final void l0() {
        if (F() && !this.q2) {
            C();
            j0();
        }
    }

    public final void m() {
        if (this.c1 != null && this.N1 == 1) {
            if (!b0()) {
                EditText editText = this.c1;
                editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.r2.r() + this.b1), this.c1.getPaddingEnd(), getResources().getDimensionPixelSize(C7025iN1.f.material_filled_edittext_font_1_3_padding_bottom));
            } else if (C4297Tc1.l(getContext())) {
                EditText editText2 = this.c1;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(C7025iN1.f.material_filled_edittext_font_2_0_padding_top), this.c1.getPaddingEnd(), getResources().getDimensionPixelSize(C7025iN1.f.material_filled_edittext_font_2_0_padding_bottom));
            } else if (C4297Tc1.k(getContext())) {
                EditText editText3 = this.c1;
                editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(C7025iN1.f.material_filled_edittext_font_1_3_padding_top), this.c1.getPaddingEnd(), getResources().getDimensionPixelSize(C7025iN1.f.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    @InterfaceC5056aJ2
    public void n(float f2) {
        if (this.r2.I() == f2) {
            return;
        }
        if (this.u2 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.u2 = valueAnimator;
            valueAnimator.setInterpolator(C9811tl1.g(getContext(), C7025iN1.c.motionEasingEmphasizedInterpolator, C5600ca.b));
            this.u2.setDuration(C9811tl1.f(getContext(), C7025iN1.c.motionDurationMedium4, 167));
            this.u2.addUpdateListener(new d());
        }
        this.u2.setFloatValues(this.r2.I(), f2);
        this.u2.start();
    }

    public void n0() {
        this.a1.N();
    }

    public final void o() {
        C4394Uc1 c4394Uc1 = this.E1;
        if (c4394Uc1 == null) {
            return;
        }
        O22 shapeAppearanceModel = c4394Uc1.getShapeAppearanceModel();
        O22 o22 = this.K1;
        if (shapeAppearanceModel != o22) {
            this.E1.setShapeAppearanceModel(o22);
        }
        if (y()) {
            this.E1.P0(this.P1, this.S1);
        }
        int s = s();
        this.T1 = s;
        this.E1.y0(ColorStateList.valueOf(s));
        p();
        M0();
    }

    public void o0() {
        this.a1.O();
    }

    @Override // android.view.View
    public void onConfigurationChanged(@InterfaceC5670cr1 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r2.b0(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.a1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.x2 = false;
        boolean O0 = O0();
        boolean J0 = J0();
        if (!O0 && !J0) {
            return;
        }
        this.c1.post(new Runnable() { // from class: o.Jm2
            @Override // java.lang.Runnable
            public final void run() {
                TextInputLayout.this.c1.requestLayout();
            }
        });
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        EditText editText = this.c1;
        if (editText != null) {
            Rect rect = this.U1;
            C10122v20.a(this, editText, rect);
            C0(rect);
            if (this.B1) {
                this.r2.C0(this.c1.getTextSize());
                int gravity = this.c1.getGravity();
                this.r2.o0((gravity & (-113)) | 48);
                this.r2.B0(gravity);
                this.r2.i0(t(rect));
                this.r2.v0(w(rect));
                this.r2.d0();
                if (F() && !this.q2) {
                    j0();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (!this.x2) {
            this.a1.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.x2 = true;
        }
        S0();
        this.a1.D0();
        if (!b0()) {
            D0((this.c1.getMeasuredWidth() - this.c1.getCompoundPaddingLeft()) - this.c1.getCompoundPaddingRight());
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@InterfaceC11300zs1 Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.a());
        setError(kVar.Z);
        if (kVar.Y0) {
            post(new c());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (z != this.L1) {
            float a2 = this.K1.r().a(this.W1);
            float a3 = this.K1.t().a(this.W1);
            float a4 = this.K1.j().a(this.W1);
            float a5 = this.K1.l().a(this.W1);
            ZP q = this.K1.q();
            ZP s = this.K1.s();
            O22 m = O22.a().J(s).O(q).w(this.K1.k()).B(this.K1.i()).K(a3).P(a2).x(a5).C(a4).m();
            this.L1 = z;
            setShapeAppearanceModel(m);
        }
    }

    @Override // android.view.View
    @InterfaceC11300zs1
    public Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        if (x0()) {
            kVar.Z = getError();
        }
        kVar.Y0 = this.a1.H();
        return kVar;
    }

    public final void p() {
        ColorStateList valueOf;
        if (this.I1 != null && this.J1 != null) {
            if (z()) {
                C4394Uc1 c4394Uc1 = this.I1;
                if (this.c1.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.g2);
                } else {
                    valueOf = ColorStateList.valueOf(this.S1);
                }
                c4394Uc1.y0(valueOf);
                this.J1.y0(ColorStateList.valueOf(this.S1));
            }
            invalidate();
        }
    }

    public void p0() {
        this.Z0.n();
    }

    public final void q(@InterfaceC5670cr1 RectF rectF) {
        float f2 = rectF.left;
        int i2 = this.M1;
        rectF.left = f2 - i2;
        rectF.right += i2;
    }

    public void q0(@InterfaceC5670cr1 i iVar) {
        this.a2.remove(iVar);
    }

    public final void r() {
        int i2 = this.N1;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (this.B1 && !(this.E1 instanceof RT)) {
                        this.E1 = RT.g1(this.K1);
                    } else {
                        this.E1 = new C4394Uc1(this.K1);
                    }
                    this.I1 = null;
                    this.J1 = null;
                    return;
                }
                throw new IllegalArgumentException(this.N1 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.E1 = new C4394Uc1(this.K1);
            this.I1 = new C4394Uc1();
            this.J1 = new C4394Uc1();
            return;
        }
        this.E1 = null;
        this.I1 = null;
        this.J1 = null;
    }

    public void r0(@InterfaceC5670cr1 j jVar) {
        this.a1.Q(jVar);
    }

    public final int s() {
        int i2 = this.T1;
        if (this.N1 == 1) {
            return C9179r91.s(C9179r91.e(this, C7025iN1.c.colorSurface, 0), this.T1);
        }
        return i2;
    }

    public final void s0() {
        TextView textView = this.s1;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public void setBoxBackgroundColor(@JF int i2) {
        if (this.T1 != i2) {
            this.T1 = i2;
            this.k2 = i2;
            this.m2 = i2;
            this.n2 = i2;
            o();
        }
    }

    public void setBoxBackgroundColorResource(@InterfaceC6509gG int i2) {
        setBoxBackgroundColor(C10201vM.g(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.k2 = defaultColor;
        this.T1 = defaultColor;
        this.l2 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.m2 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.n2 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        o();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.N1) {
            this.N1 = i2;
            if (this.c1 != null) {
                i0();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.O1 = i2;
    }

    public void setBoxCornerFamily(int i2) {
        this.K1 = this.K1.w().I(i2, this.K1.r()).N(i2, this.K1.t()).v(i2, this.K1.j()).A(i2, this.K1.l()).m();
        o();
    }

    public void setBoxStrokeColor(@JF int i2) {
        if (this.i2 != i2) {
            this.i2 = i2;
            W0();
        }
    }

    public void setBoxStrokeColorStateList(@InterfaceC5670cr1 ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.g2 = colorStateList.getDefaultColor();
            this.o2 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.h2 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.i2 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.i2 != colorStateList.getDefaultColor()) {
            this.i2 = colorStateList.getDefaultColor();
        }
        W0();
    }

    public void setBoxStrokeErrorColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.j2 != colorStateList) {
            this.j2 = colorStateList;
            W0();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.Q1 = i2;
        W0();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.R1 = i2;
        W0();
    }

    public void setBoxStrokeWidthFocusedResource(@InterfaceC9154r30 int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(@InterfaceC9154r30 int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z) {
        if (this.j1 != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.n1 = appCompatTextView;
                appCompatTextView.setId(C7025iN1.h.textinput_counter);
                Typeface typeface = this.X1;
                if (typeface != null) {
                    this.n1.setTypeface(typeface);
                }
                this.n1.setMaxLines(1);
                this.i1.e(this.n1, 2);
                ((ViewGroup.MarginLayoutParams) this.n1.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(C7025iN1.f.mtrl_textinput_counter_margin_start));
                H0();
                E0();
            } else {
                this.i1.H(this.n1, 2);
                this.n1 = null;
            }
            this.j1 = z;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.k1 != i2) {
            if (i2 > 0) {
                this.k1 = i2;
            } else {
                this.k1 = -1;
            }
            if (this.j1) {
                E0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.o1 != i2) {
            this.o1 = i2;
            H0();
        }
    }

    public void setCounterOverflowTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.y1 != colorStateList) {
            this.y1 = colorStateList;
            H0();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.p1 != i2) {
            this.p1 = i2;
            H0();
        }
    }

    public void setCounterTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.x1 != colorStateList) {
            this.x1 = colorStateList;
            H0();
        }
    }

    @ES1(29)
    public void setCursorColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.z1 != colorStateList) {
            this.z1 = colorStateList;
            I0();
        }
    }

    @ES1(29)
    public void setCursorErrorColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.A1 != colorStateList) {
            this.A1 = colorStateList;
            if (c0()) {
                I0();
            }
        }
    }

    public void setDefaultHintTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.e2 = colorStateList;
        this.f2 = colorStateList;
        if (this.c1 != null) {
            Q0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m0(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.a1.S(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.a1.T(z);
    }

    public void setEndIconContentDescription(@InterfaceC3329Je2 int i2) {
        this.a1.U(i2);
    }

    public void setEndIconDrawable(@K60 int i2) {
        this.a1.W(i2);
    }

    public void setEndIconMinSize(@BR0(from = 0) int i2) {
        this.a1.Y(i2);
    }

    public void setEndIconMode(int i2) {
        this.a1.Z(i2);
    }

    public void setEndIconOnClickListener(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
        this.a1.a0(onClickListener);
    }

    public void setEndIconOnLongClickListener(@InterfaceC11300zs1 View.OnLongClickListener onLongClickListener) {
        this.a1.b0(onLongClickListener);
    }

    public void setEndIconScaleType(@InterfaceC5670cr1 ImageView.ScaleType scaleType) {
        this.a1.c0(scaleType);
    }

    public void setEndIconTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.a1.d0(colorStateList);
    }

    public void setEndIconTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        this.a1.e0(mode);
    }

    public void setEndIconVisible(boolean z) {
        this.a1.f0(z);
    }

    public void setError(@InterfaceC11300zs1 CharSequence charSequence) {
        if (!this.i1.F()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.i1.V(charSequence);
        } else {
            this.i1.A();
        }
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        this.i1.J(i2);
    }

    public void setErrorContentDescription(@InterfaceC11300zs1 CharSequence charSequence) {
        this.i1.K(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.i1.L(z);
    }

    public void setErrorIconDrawable(@K60 int i2) {
        this.a1.g0(i2);
    }

    public void setErrorIconOnClickListener(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
        this.a1.i0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@InterfaceC11300zs1 View.OnLongClickListener onLongClickListener) {
        this.a1.j0(onLongClickListener);
    }

    public void setErrorIconTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.a1.k0(colorStateList);
    }

    public void setErrorIconTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        this.a1.l0(mode);
    }

    public void setErrorTextAppearance(@InterfaceC4698Xf2 int i2) {
        this.i1.M(i2);
    }

    public void setErrorTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.i1.N(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.s2 != z) {
            this.s2 = z;
            Q0(false);
        }
    }

    public void setHelperText(@InterfaceC11300zs1 CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (X()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!X()) {
            setHelperTextEnabled(true);
        }
        this.i1.W(charSequence);
    }

    public void setHelperTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.i1.Q(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.i1.P(z);
    }

    public void setHelperTextTextAppearance(@InterfaceC4698Xf2 int i2) {
        this.i1.O(i2);
    }

    public void setHint(@InterfaceC11300zs1 CharSequence charSequence) {
        if (this.B1) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.t2 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.B1) {
            this.B1 = z;
            if (!z) {
                this.D1 = false;
                if (!TextUtils.isEmpty(this.C1) && TextUtils.isEmpty(this.c1.getHint())) {
                    this.c1.setHint(this.C1);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.c1.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.C1)) {
                        setHint(hint);
                    }
                    this.c1.setHint((CharSequence) null);
                }
                this.D1 = true;
            }
            if (this.c1 != null) {
                P0();
            }
        }
    }

    public void setHintMaxLines(int i2) {
        this.r2.k0(i2);
        this.r2.x0(i2);
        requestLayout();
    }

    public void setHintTextAppearance(@InterfaceC4698Xf2 int i2) {
        this.r2.l0(i2);
        this.f2 = this.r2.p();
        if (this.c1 != null) {
            Q0(false);
            P0();
        }
    }

    public void setHintTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.f2 != colorStateList) {
            if (this.e2 == null) {
                this.r2.n0(colorStateList);
            }
            this.f2 = colorStateList;
            if (this.c1 != null) {
                Q0(false);
            }
        }
    }

    public void setLengthCounter(@InterfaceC5670cr1 h hVar) {
        this.m1 = hVar;
    }

    public void setMaxEms(int i2) {
        this.f1 = i2;
        EditText editText = this.c1;
        if (editText != null && i2 != -1) {
            editText.setMaxEms(i2);
        }
    }

    public void setMaxWidth(@PK1 int i2) {
        this.h1 = i2;
        EditText editText = this.c1;
        if (editText != null && i2 != -1) {
            editText.setMaxWidth(i2);
        }
    }

    public void setMaxWidthResource(@InterfaceC9154r30 int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.e1 = i2;
        EditText editText = this.c1;
        if (editText != null && i2 != -1) {
            editText.setMinEms(i2);
        }
    }

    public void setMinWidth(@PK1 int i2) {
        this.g1 = i2;
        EditText editText = this.c1;
        if (editText != null && i2 != -1) {
            editText.setMinWidth(i2);
        }
    }

    public void setMinWidthResource(@InterfaceC9154r30 int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@InterfaceC3329Je2 int i2) {
        this.a1.n0(i2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@K60 int i2) {
        this.a1.p0(i2);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        this.a1.r0(z);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.a1.s0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        this.a1.t0(mode);
    }

    public void setPlaceholderText(@InterfaceC11300zs1 CharSequence charSequence) {
        if (this.s1 == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.s1 = appCompatTextView;
            appCompatTextView.setId(C7025iN1.h.textinput_placeholder);
            this.s1.setImportantForAccessibility(1);
            this.s1.setAccessibilityLiveRegion(1);
            C7351jk0 E = E();
            this.v1 = E;
            E.O0(67L);
            this.w1 = E();
            setPlaceholderTextAppearance(this.u1);
            setPlaceholderTextColor(this.t1);
            C6516gH2.I1(this.s1, new b());
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.r1) {
                setPlaceholderTextEnabled(true);
            }
            this.q1 = charSequence;
        }
        T0();
    }

    public void setPlaceholderTextAppearance(@InterfaceC4698Xf2 int i2) {
        this.u1 = i2;
        TextView textView = this.s1;
        if (textView != null) {
            C4930Zm2.D(textView, i2);
        }
    }

    public void setPlaceholderTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.t1 != colorStateList) {
            this.t1 = colorStateList;
            TextView textView = this.s1;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(@InterfaceC11300zs1 CharSequence charSequence) {
        this.Z0.o(charSequence);
    }

    public void setPrefixTextAppearance(@InterfaceC4698Xf2 int i2) {
        this.Z0.p(i2);
    }

    public void setPrefixTextColor(@InterfaceC5670cr1 ColorStateList colorStateList) {
        this.Z0.q(colorStateList);
    }

    public void setShapeAppearanceModel(@InterfaceC5670cr1 O22 o22) {
        C4394Uc1 c4394Uc1 = this.E1;
        if (c4394Uc1 != null && c4394Uc1.getShapeAppearanceModel() != o22) {
            this.K1 = o22;
            o();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.Z0.r(z);
    }

    public void setStartIconContentDescription(@InterfaceC3329Je2 int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(@K60 int i2) {
        setStartIconDrawable(i2 != 0 ? C3220Ic.b(getContext(), i2) : null);
    }

    public void setStartIconMinSize(@BR0(from = 0) int i2) {
        this.Z0.u(i2);
    }

    public void setStartIconOnClickListener(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
        this.Z0.v(onClickListener);
    }

    public void setStartIconOnLongClickListener(@InterfaceC11300zs1 View.OnLongClickListener onLongClickListener) {
        this.Z0.w(onLongClickListener);
    }

    public void setStartIconScaleType(@InterfaceC5670cr1 ImageView.ScaleType scaleType) {
        this.Z0.x(scaleType);
    }

    public void setStartIconTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.Z0.y(colorStateList);
    }

    public void setStartIconTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        this.Z0.z(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.Z0.A(z);
    }

    public void setSuffixText(@InterfaceC11300zs1 CharSequence charSequence) {
        this.a1.u0(charSequence);
    }

    public void setSuffixTextAppearance(@InterfaceC4698Xf2 int i2) {
        this.a1.v0(i2);
    }

    public void setSuffixTextColor(@InterfaceC5670cr1 ColorStateList colorStateList) {
        this.a1.w0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@InterfaceC11300zs1 e eVar) {
        EditText editText = this.c1;
        if (editText != null) {
            C6516gH2.I1(editText, eVar);
        }
    }

    public void setTypeface(@InterfaceC11300zs1 Typeface typeface) {
        if (typeface != this.X1) {
            this.X1 = typeface;
            this.r2.T0(typeface);
            this.i1.S(typeface);
            TextView textView = this.n1;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    @InterfaceC5670cr1
    public final Rect t(@InterfaceC5670cr1 Rect rect) {
        if (this.c1 != null) {
            Rect rect2 = this.V1;
            boolean s = C10920yI2.s(this);
            rect2.bottom = rect.bottom;
            int i2 = this.N1;
            if (i2 != 1) {
                if (i2 != 2) {
                    rect2.left = N(rect.left, s);
                    rect2.top = getPaddingTop();
                    rect2.right = O(rect.right, s);
                    return rect2;
                }
                rect2.left = rect.left + this.c1.getPaddingLeft();
                rect2.top = rect.top - x();
                rect2.right = rect.right - this.c1.getPaddingRight();
                return rect2;
            }
            rect2.left = N(rect.left, s);
            rect2.top = rect.top + this.O1;
            rect2.right = O(rect.right, s);
            return rect2;
        }
        throw new IllegalStateException();
    }

    public void t0(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        boolean s = C10920yI2.s(this);
        this.L1 = s;
        if (s) {
            f6 = f3;
        } else {
            f6 = f2;
        }
        if (!s) {
            f2 = f3;
        }
        if (s) {
            f7 = f5;
        } else {
            f7 = f4;
        }
        if (!s) {
            f4 = f5;
        }
        C4394Uc1 c4394Uc1 = this.E1;
        if (c4394Uc1 != null && c4394Uc1.b0() == f6 && this.E1.c0() == f2 && this.E1.z() == f7 && this.E1.A() == f4) {
            return;
        }
        this.K1 = this.K1.w().K(f6).P(f2).x(f7).C(f4).m();
        o();
    }

    public final int u(@InterfaceC5670cr1 Rect rect, @InterfaceC5670cr1 Rect rect2, float f2) {
        if (f0()) {
            return (int) (rect2.top + f2);
        }
        return rect.bottom - this.c1.getCompoundPaddingBottom();
    }

    public void u0(@InterfaceC9154r30 int i2, @InterfaceC9154r30 int i3, @InterfaceC9154r30 int i4, @InterfaceC9154r30 int i5) {
        t0(getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i3), getContext().getResources().getDimension(i5), getContext().getResources().getDimension(i4));
    }

    public final int v(@InterfaceC5670cr1 Rect rect, float f2) {
        int i2;
        if (f0()) {
            return (int) (rect.centerY() - (f2 / 2.0f));
        }
        if (this.N1 == 0 && !b0()) {
            i2 = (int) (this.r2.F() / 2.0f);
        } else {
            i2 = 0;
        }
        return (rect.top + this.c1.getCompoundPaddingTop()) - i2;
    }

    public final void v0() {
        EditText editText = this.c1;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i2 = this.N1;
                if (i2 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i2 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    @InterfaceC5670cr1
    public final Rect w(@InterfaceC5670cr1 Rect rect) {
        float C;
        if (this.c1 != null) {
            Rect rect2 = this.V1;
            if (b0()) {
                C = this.r2.F();
            } else {
                C = this.r2.C() * this.r2.z();
            }
            rect2.left = rect.left + this.c1.getCompoundPaddingLeft();
            rect2.top = v(rect, C);
            rect2.right = rect.right - this.c1.getCompoundPaddingRight();
            rect2.bottom = u(rect, rect2, C);
            return rect2;
        }
        throw new IllegalStateException();
    }

    public void w0(@InterfaceC5670cr1 TextView textView, @InterfaceC4698Xf2 int i2) {
        try {
            C4930Zm2.D(textView, i2);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        C4930Zm2.D(textView, OL1.l.K2);
        textView.setTextColor(C10201vM.g(getContext(), C7025iN1.e.design_error));
    }

    public final int x() {
        if (!this.B1) {
            return 0;
        }
        int i2 = this.N1;
        if (i2 != 0) {
            if (i2 != 2) {
                return 0;
            }
            if (b0()) {
                return (int) (this.r2.r() / 2.0f);
            }
            return Math.max(0, (int) (this.r2.r() - (this.r2.n() / 2.0f)));
        }
        return (int) this.r2.r();
    }

    public boolean x0() {
        return this.i1.m();
    }

    public final boolean y() {
        if (this.N1 == 2 && z()) {
            return true;
        }
        return false;
    }

    public final boolean y0() {
        if ((this.a1.J() || ((this.a1.C() && T()) || this.a1.y() != null)) && this.a1.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        if (this.P1 > -1 && this.S1 != 0) {
            return true;
        }
        return false;
    }

    public final boolean z0() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.Z0.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    public TextInputLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.textInputStyle);
    }

    public void setEndIconContentDescription(@InterfaceC11300zs1 CharSequence charSequence) {
        this.a1.V(charSequence);
    }

    public void setEndIconDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.a1.X(drawable);
    }

    public void setErrorIconDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.a1.h0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@InterfaceC11300zs1 CharSequence charSequence) {
        this.a1.o0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.a1.q0(drawable);
    }

    public void setStartIconContentDescription(@InterfaceC11300zs1 CharSequence charSequence) {
        this.Z0.s(charSequence);
    }

    public void setStartIconDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.Z0.t(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputLayout(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i2) {
        super(C6597gd1.d(context, attributeSet, i2, r5), attributeSet, i2);
        int i3 = z2;
        this.e1 = -1;
        this.f1 = -1;
        this.g1 = -1;
        this.h1 = -1;
        this.i1 = new C10460wP0(this);
        this.m1 = new h() { // from class: o.Km2
            @Override // com.google.android.material.textfield.TextInputLayout.h
            public final int a(Editable editable) {
                return TextInputLayout.c(editable);
            }
        };
        this.U1 = new Rect();
        this.V1 = new Rect();
        this.W1 = new RectF();
        this.a2 = new LinkedHashSet<>();
        XE xe = new XE(this);
        this.r2 = xe;
        this.x2 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.Y0 = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        TimeInterpolator timeInterpolator = C5600ca.a;
        xe.R0(timeInterpolator);
        xe.M0(timeInterpolator);
        xe.o0(8388659);
        int[] iArr = C7025iN1.o.hd;
        int i4 = C7025iN1.o.Ed;
        int i5 = C7025iN1.o.Cd;
        int i6 = C7025iN1.o.Wd;
        int i7 = C7025iN1.o.be;
        int i8 = C7025iN1.o.ge;
        C2872Ep2 l = C7608kn2.l(context2, attributeSet, iArr, i2, i3, i4, i5, i6, i7, i8);
        C5369bc2 c5369bc2 = new C5369bc2(this, l);
        this.Z0 = c5369bc2;
        this.B1 = l.a(C7025iN1.o.ee, true);
        setHint(l.x(C7025iN1.o.md));
        this.t2 = l.a(C7025iN1.o.de, true);
        this.s2 = l.a(C7025iN1.o.Yd, true);
        int i9 = C7025iN1.o.od;
        if (l.C(i9)) {
            setMinEms(l.o(i9, -1));
        } else {
            int i10 = C7025iN1.o.ld;
            if (l.C(i10)) {
                setMinWidth(l.g(i10, -1));
            }
        }
        int i11 = C7025iN1.o.nd;
        if (l.C(i11)) {
            setMaxEms(l.o(i11, -1));
        } else {
            int i12 = C7025iN1.o.kd;
            if (l.C(i12)) {
                setMaxWidth(l.g(i12, -1));
            }
        }
        this.K1 = O22.e(context2, attributeSet, i2, i3).m();
        this.M1 = context2.getResources().getDimensionPixelOffset(C7025iN1.f.mtrl_textinput_box_label_cutout_padding);
        this.O1 = l.f(C7025iN1.o.rd, 0);
        this.b1 = getResources().getDimensionPixelSize(C7025iN1.f.m3_multiline_hint_filled_text_extra_space);
        this.Q1 = l.g(C7025iN1.o.yd, context2.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_textinput_box_stroke_width_default));
        this.R1 = l.g(C7025iN1.o.zd, context2.getResources().getDimensionPixelSize(C7025iN1.f.mtrl_textinput_box_stroke_width_focused));
        this.P1 = this.Q1;
        float e2 = l.e(C7025iN1.o.vd, -1.0f);
        float e3 = l.e(C7025iN1.o.ud, -1.0f);
        float e4 = l.e(C7025iN1.o.sd, -1.0f);
        float e5 = l.e(C7025iN1.o.td, -1.0f);
        O22.b w = this.K1.w();
        if (e2 >= 0.0f) {
            w.K(e2);
        }
        if (e3 >= 0.0f) {
            w.P(e3);
        }
        if (e4 >= 0.0f) {
            w.C(e4);
        }
        if (e5 >= 0.0f) {
            w.x(e5);
        }
        this.K1 = w.m();
        ColorStateList b2 = C4297Tc1.b(context2, l, C7025iN1.o.pd);
        if (b2 != null) {
            int defaultColor = b2.getDefaultColor();
            this.k2 = defaultColor;
            this.T1 = defaultColor;
            if (b2.isStateful()) {
                this.l2 = b2.getColorForState(new int[]{-16842910}, -1);
                this.m2 = b2.getColorForState(new int[]{16842908, 16842910}, -1);
                this.n2 = b2.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.m2 = this.k2;
                ColorStateList a2 = C3220Ic.a(context2, C7025iN1.e.mtrl_filled_background_color);
                this.l2 = a2.getColorForState(new int[]{-16842910}, -1);
                this.n2 = a2.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.T1 = 0;
            this.k2 = 0;
            this.l2 = 0;
            this.m2 = 0;
            this.n2 = 0;
        }
        int i13 = C7025iN1.o.jd;
        if (l.C(i13)) {
            ColorStateList d2 = l.d(i13);
            this.f2 = d2;
            this.e2 = d2;
        }
        int i14 = C7025iN1.o.wd;
        ColorStateList b3 = C4297Tc1.b(context2, l, i14);
        this.i2 = l.c(i14, 0);
        this.g2 = C10201vM.g(context2, C7025iN1.e.mtrl_textinput_default_box_stroke_color);
        this.o2 = C10201vM.g(context2, C7025iN1.e.mtrl_textinput_disabled_color);
        this.h2 = C10201vM.g(context2, C7025iN1.e.mtrl_textinput_hovered_box_stroke_color);
        if (b3 != null) {
            setBoxStrokeColorStateList(b3);
        }
        int i15 = C7025iN1.o.xd;
        if (l.C(i15)) {
            setBoxStrokeErrorColor(C4297Tc1.b(context2, l, i15));
        }
        if (l.u(i8, -1) != -1) {
            setHintTextAppearance(l.u(i8, 0));
        }
        this.z1 = l.d(C7025iN1.o.Gd);
        this.A1 = l.d(C7025iN1.o.Hd);
        int u = l.u(i6, 0);
        CharSequence x = l.x(C7025iN1.o.Rd);
        int o2 = l.o(C7025iN1.o.Qd, 1);
        boolean a3 = l.a(C7025iN1.o.Sd, false);
        int u2 = l.u(i7, 0);
        boolean a4 = l.a(C7025iN1.o.ae, false);
        CharSequence x2 = l.x(C7025iN1.o.Zd);
        int u3 = l.u(C7025iN1.o.oe, 0);
        CharSequence x3 = l.x(C7025iN1.o.ne);
        boolean a5 = l.a(C7025iN1.o.Ad, false);
        setCounterMaxLength(l.o(C7025iN1.o.Bd, -1));
        this.p1 = l.u(i4, 0);
        this.o1 = l.u(i5, 0);
        setBoxBackgroundMode(l.o(C7025iN1.o.qd, 0));
        setErrorContentDescription(x);
        setErrorAccessibilityLiveRegion(o2);
        setCounterOverflowTextAppearance(this.o1);
        setHelperTextTextAppearance(u2);
        setErrorTextAppearance(u);
        setCounterTextAppearance(this.p1);
        setPlaceholderText(x3);
        setPlaceholderTextAppearance(u3);
        int i16 = C7025iN1.o.Xd;
        if (l.C(i16)) {
            setErrorTextColor(l.d(i16));
        }
        int i17 = C7025iN1.o.ce;
        if (l.C(i17)) {
            setHelperTextColor(l.d(i17));
        }
        int i18 = C7025iN1.o.he;
        if (l.C(i18)) {
            setHintTextColor(l.d(i18));
        }
        int i19 = C7025iN1.o.Fd;
        if (l.C(i19)) {
            setCounterTextColor(l.d(i19));
        }
        int i20 = C7025iN1.o.Dd;
        if (l.C(i20)) {
            setCounterOverflowTextColor(l.d(i20));
        }
        int i21 = C7025iN1.o.pe;
        if (l.C(i21)) {
            setPlaceholderTextColor(l.d(i21));
        }
        com.google.android.material.textfield.a aVar = new com.google.android.material.textfield.a(this, l);
        this.a1 = aVar;
        boolean a6 = l.a(C7025iN1.o.id, true);
        setHintMaxLines(l.o(C7025iN1.o.fe, 1));
        l.I();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            C2664Cm2.a(this, 1);
        }
        frameLayout.addView(c5369bc2);
        frameLayout.addView(aVar);
        addView(frameLayout);
        setEnabled(a6);
        setHelperTextEnabled(a4);
        setErrorEnabled(a3);
        setCounterEnabled(a5);
        setHelperText(x2);
    }

    public void setHint(@InterfaceC3329Je2 int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }
}
