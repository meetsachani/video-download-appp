package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.a;
import java.util.List;
import o.AbstractC4051Qo1;
import o.AbstractC7347jj0;
import o.AbstractC9573sm2;
import o.C10861y4;
import o.C3771Nr1;
import o.C4485Vb;
import o.C4491Vc1;
import o.C5995eC;
import o.C6516gH2;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.C9076ql1;
import o.C9081qm2;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC2591Bt;
import o.InterfaceC2669Co;
import o.InterfaceC3329Je2;
import o.InterfaceC4698Xf2;
import o.InterfaceC5670cr1;
import o.InterfaceC6509gG;
import o.InterfaceC6826ha;
import o.InterfaceC6946i32;
import o.InterfaceC8687p91;
import o.InterfaceC9154r30;
import o.InterfaceC9397s30;
import o.K60;
import o.O22;
import o.PK1;
import o.QU1;
import o.X81;

/* loaded from: classes3.dex */
public class Chip extends C4485Vb implements a.InterfaceC0123a, InterfaceC6946i32, InterfaceC8687p91<Chip> {
    public static final String C1 = "http://schemas.android.com/apk/res/android";
    public static final String D1 = "android.widget.Button";
    public static final String E1 = "android.widget.RadioButton";
    public static final String F1 = "android.view.View";
    public static final String v1 = "Chip";
    public static final int x1 = 0;
    public static final int y1 = 1;
    @InterfaceC11300zs1
    public com.google.android.material.chip.a c1;
    @InterfaceC11300zs1
    public InsetDrawable d1;
    @InterfaceC11300zs1
    public RippleDrawable e1;
    @InterfaceC11300zs1
    public View.OnClickListener f1;
    @InterfaceC11300zs1
    public CompoundButton.OnCheckedChangeListener g1;
    @InterfaceC11300zs1
    public InterfaceC8687p91.a<Chip> h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public int n1;
    @InterfaceC9397s30(unit = 1)
    public int o1;
    @InterfaceC11300zs1
    public CharSequence p1;
    @InterfaceC5670cr1
    public final c q1;
    public boolean r1;
    public final Rect s1;
    public final RectF t1;
    public final AbstractC9573sm2 u1;
    public static final int w1 = C7025iN1.n.Widget_MaterialComponents_Chip_Action;
    public static final Rect z1 = new Rect();
    public static final int[] A1 = {16842913};
    public static final int[] B1 = {16842911};

    /* loaded from: classes3.dex */
    public class a extends AbstractC9573sm2 {
        public a() {
        }

        @Override // o.AbstractC9573sm2
        public void a(int i) {
        }

        @Override // o.AbstractC9573sm2
        public void b(@InterfaceC5670cr1 Typeface typeface, boolean z) {
            CharSequence text;
            Chip chip = Chip.this;
            if (chip.c1.a4()) {
                text = Chip.this.c1.e2();
            } else {
                text = Chip.this.getText();
            }
            chip.setText(text);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* loaded from: classes3.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, @InterfaceC5670cr1 Outline outline) {
            if (Chip.this.c1 != null) {
                Chip.this.c1.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AbstractC7347jj0 {
        public c(Chip chip) {
            super(chip);
        }

        @Override // o.AbstractC7347jj0
        public int C(float f, float f2) {
            if (Chip.this.o() && Chip.this.getCloseIconTouchBounds().contains(f, f2)) {
                return 1;
            }
            return 0;
        }

        @Override // o.AbstractC7347jj0
        public void D(@InterfaceC5670cr1 List<Integer> list) {
            list.add(0);
            if (Chip.this.o() && Chip.this.y() && Chip.this.f1 != null) {
                list.add(1);
            }
        }

        @Override // o.AbstractC7347jj0
        public boolean N(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.z();
                }
                return false;
            }
            return false;
        }

        @Override // o.AbstractC7347jj0
        public void Q(@InterfaceC5670cr1 C10861y4 c10861y4) {
            c10861y4.i1(Chip.this.s());
            c10861y4.l1(Chip.this.isClickable());
            c10861y4.k1(Chip.this.getAccessibilityClassName());
            c10861y4.f2(Chip.this.getText());
        }

        @Override // o.AbstractC7347jj0
        public void R(int i, @InterfaceC5670cr1 C10861y4 c10861y4) {
            String str = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    c10861y4.p1(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C7025iN1.m.mtrl_chip_close_icon_content_description;
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    c10861y4.p1(context.getString(i2, str).trim());
                }
                c10861y4.e1(Chip.this.getCloseIconTouchBoundsInt());
                c10861y4.b(C10861y4.a.j);
                c10861y4.v1(Chip.this.isEnabled());
                c10861y4.k1(Button.class.getName());
                return;
            }
            c10861y4.p1("");
            c10861y4.e1(Chip.z1);
        }

        @Override // o.AbstractC7347jj0
        public void S(int i, boolean z) {
            if (i == 1) {
                Chip.this.l1 = z;
            }
            if (Chip.this.c1.A2(Chip.this.l1)) {
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    private void I(@InterfaceC11300zs1 AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", C3771Nr1.A.C) != null) {
                Log.w(v1, "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", C3771Nr1.A.I, AbstractC4051Qo1.o1) != 8388627) {
                                    Log.w(v1, "Chip text must be vertically center and start aligned");
                                    return;
                                }
                                return;
                            }
                            throw new UnsupportedOperationException("Chip does not support multi-line text");
                        }
                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
    }

    public static /* synthetic */ void c(Chip chip, CompoundButton compoundButton, boolean z) {
        InterfaceC8687p91.a<Chip> aVar = chip.h1;
        if (aVar != null) {
            aVar.a(chip, z);
        }
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.g1;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5670cr1
    public RectF getCloseIconTouchBounds() {
        this.t1.setEmpty();
        if (o() && this.f1 != null) {
            this.c1.U1(this.t1);
        }
        return this.t1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @InterfaceC5670cr1
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.s1.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.s1;
    }

    @InterfaceC11300zs1
    private C9081qm2 getTextAppearance() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.f2();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.k1 != z) {
            this.k1 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.j1 != z) {
            this.j1 = z;
            refreshDrawableState();
        }
    }

    public final void A() {
        if (this.d1 != null) {
            this.d1 = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            E();
        }
    }

    public boolean B() {
        return this.m1;
    }

    public final void C(@InterfaceC11300zs1 com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.A3(null);
        }
    }

    public final void D() {
        if (o() && y() && this.f1 != null) {
            C6516gH2.I1(this, this.q1);
            this.r1 = true;
            return;
        }
        C6516gH2.I1(this, null);
        this.r1 = false;
    }

    public final void E() {
        F();
    }

    public final void F() {
        this.e1 = new RippleDrawable(QU1.e(this.c1.c2()), getBackgroundDrawable(), null);
        this.c1.Z3(false);
        setBackground(this.e1);
        G();
    }

    public final void G() {
        com.google.android.material.chip.a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.c1) != null) {
            int E12 = (int) (aVar.E1() + this.c1.g2() + this.c1.k1());
            int J1 = (int) (this.c1.J1() + this.c1.h2() + this.c1.g1());
            if (this.d1 != null) {
                Rect rect = new Rect();
                this.d1.getPadding(rect);
                J1 += rect.left;
                E12 += rect.right;
            }
            setPaddingRelative(J1, getPaddingTop(), E12, getPaddingBottom());
        }
    }

    public final void H() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C9081qm2 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.r(getContext(), paint, this.u1);
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0123a
    public void a() {
        n(this.o1);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@InterfaceC5670cr1 MotionEvent motionEvent) {
        if (!this.r1) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (!this.q1.v(motionEvent) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.r1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (this.q1.w(keyEvent) && this.q1.B() != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // o.C4485Vb, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        boolean z;
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null && aVar.r2()) {
            z = this.c1.v3(m());
        } else {
            z = false;
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @InterfaceC5670cr1
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.p1)) {
            return this.p1;
        }
        if (s()) {
            ViewParent parent = getParent();
            if (!(parent instanceof C5995eC) || !((C5995eC) parent).l()) {
                return D1;
            }
            return E1;
        } else if (isClickable()) {
            return D1;
        } else {
            return "android.view.View";
        }
    }

    @InterfaceC11300zs1
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.d1;
        if (insetDrawable == null) {
            return this.c1;
        }
        return insetDrawable;
    }

    @InterfaceC11300zs1
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.A1();
        }
        return null;
    }

    @InterfaceC11300zs1
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.B1();
        }
        return null;
    }

    @InterfaceC11300zs1
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.C1();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, aVar.D1());
    }

    public Drawable getChipDrawable() {
        return this.c1;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.E1();
        }
        return 0.0f;
    }

    @InterfaceC11300zs1
    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.F1();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.G1();
        }
        return 0.0f;
    }

    @InterfaceC11300zs1
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.H1();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.I1();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.J1();
        }
        return 0.0f;
    }

    @InterfaceC11300zs1
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.K1();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.L1();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @InterfaceC11300zs1
    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.N1();
        }
        return null;
    }

    @InterfaceC11300zs1
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.O1();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.P1();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.Q1();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.R1();
        }
        return 0.0f;
    }

    @InterfaceC11300zs1
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.T1();
        }
        return null;
    }

    @Override // android.widget.TextView
    @InterfaceC11300zs1
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.X1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@InterfaceC5670cr1 Rect rect) {
        if (this.r1 && (this.q1.B() == 1 || this.q1.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @InterfaceC11300zs1
    public C9076ql1 getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.Y1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.Z1();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.a2();
        }
        return 0.0f;
    }

    @InterfaceC11300zs1
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.c2();
        }
        return null;
    }

    @Override // o.InterfaceC6946i32
    @InterfaceC5670cr1
    public O22 getShapeAppearanceModel() {
        return this.c1.getShapeAppearanceModel();
    }

    @InterfaceC11300zs1
    public C9076ql1 getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.d2();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.g2();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            return aVar.h2();
        }
        return 0.0f;
    }

    public final void l(@InterfaceC5670cr1 com.google.android.material.chip.a aVar) {
        aVar.A3(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    @InterfaceC5670cr1
    public final int[] m() {
        ?? isEnabled = isEnabled();
        int i = isEnabled;
        if (this.l1) {
            i = isEnabled + 1;
        }
        int i2 = i;
        if (this.k1) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (this.j1) {
            i3 = i2 + 1;
        }
        int i4 = i3;
        if (isChecked()) {
            i4 = i3 + 1;
        }
        int[] iArr = new int[i4];
        int i5 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i5 = 1;
        }
        if (this.l1) {
            iArr[i5] = 16842908;
            i5++;
        }
        if (this.k1) {
            iArr[i5] = 16843623;
            i5++;
        }
        if (this.j1) {
            iArr[i5] = 16842919;
            i5++;
        }
        if (isChecked()) {
            iArr[i5] = 16842913;
        }
        return iArr;
    }

    public boolean n(@InterfaceC9397s30 int i) {
        int i2;
        this.o1 = i;
        int i3 = 0;
        if (!B()) {
            if (this.d1 != null) {
                A();
            } else {
                E();
            }
            return false;
        }
        int max = Math.max(0, i - this.c1.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.c1.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.d1 != null) {
                A();
            } else {
                E();
            }
            return false;
        }
        if (max2 > 0) {
            i2 = max2 / 2;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max / 2;
        }
        if (this.d1 != null) {
            Rect rect = new Rect();
            this.d1.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                E();
                return true;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        r(i2, i3, i2, i3);
        E();
        return true;
    }

    public final boolean o() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null && aVar.N1() != null) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4491Vc1.f(this, this.c1);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A1);
        }
        if (s()) {
            View.mergeDrawableStates(onCreateDrawableState, B1);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.r1) {
            this.q1.M(z, i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(@InterfaceC5670cr1 MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC5670cr1 AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(s());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof C5995eC) {
            C5995eC c5995eC = (C5995eC) getParent();
            C10861y4 t2 = C10861y4.t2(accessibilityNodeInfo);
            if (c5995eC.c()) {
                i = c5995eC.i(this);
            } else {
                i = -1;
            }
            t2.n1(C10861y4.g.j(c5995eC.b(this), 1, i, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @InterfaceC11300zs1
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(@InterfaceC5670cr1 MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.n1 != i) {
            this.n1 = i;
            G();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L16;
     */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(@InterfaceC5670cr1 MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.j1) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.j1) {
                z();
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        if (z || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void p(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        TypedArray k = C7608kn2.k(context, attributeSet, C7025iN1.o.x1, i, w1, new int[0]);
        this.m1 = k.getBoolean(C7025iN1.o.e2, false);
        this.o1 = (int) Math.ceil(k.getDimension(C7025iN1.o.S1, X81.f(context)));
        k.recycle();
    }

    public final void q() {
        setOutlineProvider(new b());
    }

    public final void r(int i, int i2, int i3, int i4) {
        this.d1 = new InsetDrawable((Drawable) this.c1, i, i2, i3, i4);
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null && aVar.l2()) {
            return true;
        }
        return false;
    }

    public void setAccessibilityClassName(@InterfaceC11300zs1 CharSequence charSequence) {
        this.p1 = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.e1) {
            Log.w(v1, "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w(v1, "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // o.C4485Vb, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.e1) {
            Log.w(v1, "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // o.C4485Vb, android.view.View
    public void setBackgroundResource(int i) {
        Log.w(v1, "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        Log.w(v1, "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        Log.w(v1, "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.B2(z);
        }
    }

    public void setCheckableResource(@InterfaceC2669Co int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.C2(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar == null) {
            this.i1 = z;
        } else if (aVar.l2()) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(@InterfaceC11300zs1 Drawable drawable) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.D2(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@InterfaceC2669Co int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(@K60 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.G2(i);
        }
    }

    public void setCheckedIconTint(@InterfaceC11300zs1 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.H2(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@InterfaceC6509gG int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.I2(i);
        }
    }

    public void setCheckedIconVisible(@InterfaceC2669Co int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.J2(i);
        }
    }

    public void setChipBackgroundColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.L2(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@InterfaceC6509gG int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.M2(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.N2(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.O2(i);
        }
    }

    public void setChipDrawable(@InterfaceC5670cr1 com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.c1;
        if (aVar2 != aVar) {
            C(aVar2);
            this.c1 = aVar;
            aVar.L3(false);
            l(this.c1);
            n(this.o1);
        }
    }

    public void setChipEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.P2(f);
        }
    }

    public void setChipEndPaddingResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.Q2(i);
        }
    }

    public void setChipIcon(@InterfaceC11300zs1 Drawable drawable) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.R2(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@InterfaceC2669Co int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@K60 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.U2(i);
        }
    }

    public void setChipIconSize(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.V2(f);
        }
    }

    public void setChipIconSizeResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.W2(i);
        }
    }

    public void setChipIconTint(@InterfaceC11300zs1 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.X2(colorStateList);
        }
    }

    public void setChipIconTintResource(@InterfaceC6509gG int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.Y2(i);
        }
    }

    public void setChipIconVisible(@InterfaceC2669Co int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.Z2(i);
        }
    }

    public void setChipMinHeight(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.b3(f);
        }
    }

    public void setChipMinHeightResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.c3(i);
        }
    }

    public void setChipStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.d3(f);
        }
    }

    public void setChipStartPaddingResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.e3(i);
        }
    }

    public void setChipStrokeColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.f3(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@InterfaceC6509gG int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.g3(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.h3(f);
        }
    }

    public void setChipStrokeWidthResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.i3(i);
        }
    }

    @Deprecated
    public void setChipText(@InterfaceC11300zs1 CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@InterfaceC3329Je2 int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(@InterfaceC11300zs1 Drawable drawable) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.k3(drawable);
        }
        D();
    }

    public void setCloseIconContentDescription(@InterfaceC11300zs1 CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.l3(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@InterfaceC2669Co int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.o3(f);
        }
    }

    public void setCloseIconEndPaddingResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.p3(i);
        }
    }

    public void setCloseIconResource(@K60 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.q3(i);
        }
        D();
    }

    public void setCloseIconSize(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.r3(f);
        }
    }

    public void setCloseIconSizeResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.s3(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.t3(f);
        }
    }

    public void setCloseIconStartPaddingResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.u3(i);
        }
    }

    public void setCloseIconTint(@InterfaceC11300zs1 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.w3(colorStateList);
        }
    }

    public void setCloseIconTintResource(@InterfaceC6509gG int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.x3(i);
        }
    }

    public void setCloseIconVisible(@InterfaceC2669Co int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // o.C4485Vb, android.widget.TextView
    public void setCompoundDrawables(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 Drawable drawable2, @InterfaceC11300zs1 Drawable drawable3, @InterfaceC11300zs1 Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // o.C4485Vb, android.widget.TextView
    public void setCompoundDrawablesRelative(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 Drawable drawable2, @InterfaceC11300zs1 Drawable drawable3, @InterfaceC11300zs1 Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.x0(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.c1 != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                com.google.android.material.chip.a aVar = this.c1;
                if (aVar != null) {
                    aVar.B3(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.m1 = z;
        n(this.o1);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w(v1, "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.C3(c9076ql1);
        }
    }

    public void setHideMotionSpecResource(@InterfaceC6826ha int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.D3(i);
        }
    }

    public void setIconEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.E3(f);
        }
    }

    public void setIconEndPaddingResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.F3(i);
        }
    }

    public void setIconStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.G3(f);
        }
    }

    public void setIconStartPaddingResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.H3(i);
        }
    }

    @Override // o.InterfaceC8687p91
    @HT1({HT1.a.Y})
    public void setInternalOnCheckedChangeListener(@InterfaceC11300zs1 InterfaceC8687p91.a<Chip> aVar) {
        this.h1 = aVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.c1 == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@PK1 int i) {
        super.setMaxWidth(i);
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.I3(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@InterfaceC11300zs1 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.g1 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f1 = onClickListener;
        D();
    }

    public void setRippleColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.J3(colorStateList);
        }
        if (!this.c1.j2()) {
            F();
        }
    }

    public void setRippleColorResource(@InterfaceC6509gG int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.K3(i);
            if (!this.c1.j2()) {
                F();
            }
        }
    }

    @Override // o.InterfaceC6946i32
    public void setShapeAppearanceModel(@InterfaceC5670cr1 O22 o22) {
        this.c1.setShapeAppearanceModel(o22);
    }

    public void setShowMotionSpec(@InterfaceC11300zs1 C9076ql1 c9076ql1) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.M3(c9076ql1);
        }
    }

    public void setShowMotionSpecResource(@InterfaceC6826ha int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.N3(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (aVar.a4()) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            com.google.android.material.chip.a aVar2 = this.c1;
            if (aVar2 != null) {
                aVar2.O3(charSequence);
            }
        }
    }

    public void setTextAppearance(@InterfaceC11300zs1 C9081qm2 c9081qm2) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.P3(c9081qm2);
        }
        H();
    }

    public void setTextAppearanceResource(@InterfaceC4698Xf2 int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.T3(f);
        }
    }

    public void setTextEndPaddingResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.U3(i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.W3(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
        }
        H();
    }

    public void setTextStartPadding(float f) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.X3(f);
        }
    }

    public void setTextStartPaddingResource(@InterfaceC9154r30 int i) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.Y3(i);
        }
    }

    @Deprecated
    public boolean t() {
        return u();
    }

    public boolean u() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null && aVar.n2()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean v() {
        return w();
    }

    public boolean w() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null && aVar.p2()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public boolean x() {
        return y();
    }

    public boolean y() {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null && aVar.s2()) {
            return true;
        }
        return false;
    }

    @InterfaceC2591Bt
    public boolean z() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f1;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.r1) {
            this.q1.Y(1, 1);
        }
        return z;
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.chipStyle);
    }

    public void setCloseIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.z3(z);
        }
        D();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = w1;
        this.s1 = new Rect();
        this.t1 = new RectF();
        this.u1 = new a();
        Context context2 = getContext();
        I(attributeSet);
        com.google.android.material.chip.a p1 = com.google.android.material.chip.a.p1(context2, attributeSet, i, i2);
        p(context2, attributeSet, i);
        setChipDrawable(p1);
        p1.x0(getElevation());
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.x1, i, i2, new int[0]);
        boolean hasValue = k.hasValue(C7025iN1.o.j2);
        k.recycle();
        this.q1 = new c(this);
        D();
        if (!hasValue) {
            q();
        }
        setChecked(this.i1);
        setText(p1.e2());
        setEllipsize(p1.X1());
        H();
        if (!this.c1.a4()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(AbstractC4051Qo1.o1);
        G();
        if (B()) {
            setMinHeight(this.o1);
        }
        this.n1 = getLayoutDirection();
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.dC
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Chip.c(Chip.this, compoundButton, z);
            }
        });
    }

    public void setCheckedIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.K2(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.a3(z);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 Drawable drawable2, @InterfaceC11300zs1 Drawable drawable3, @InterfaceC11300zs1 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@InterfaceC11300zs1 Drawable drawable, @InterfaceC11300zs1 Drawable drawable2, @InterfaceC11300zs1 Drawable drawable3, @InterfaceC11300zs1 Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.Q3(i);
        }
        H();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        com.google.android.material.chip.a aVar = this.c1;
        if (aVar != null) {
            aVar.Q3(i);
        }
        H();
    }
}
