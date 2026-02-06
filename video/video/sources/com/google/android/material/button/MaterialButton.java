package com.google.android.material.button;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.button.MaterialButton;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.AbstractC11311zv0;
import o.C10751xc2;
import o.C10920yI2;
import o.C10994yc2;
import o.C3220Ic;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C4491Vc1;
import o.C5850db2;
import o.C6092eb2;
import o.C6597gd1;
import o.C7025iN1;
import o.C7210j91;
import o.C7608kn2;
import o.C9811tl1;
import o.D60;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC6509gG;
import o.InterfaceC6946i32;
import o.InterfaceC8568og;
import o.InterfaceC9154r30;
import o.InterfaceC9397s30;
import o.J;
import o.JE0;
import o.JF;
import o.K60;
import o.O22;
import o.PK1;

/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC6946i32 {
    public static final int F1 = 1;
    public static final int G1 = 2;
    public static final int H1 = 3;
    public static final int I1 = 4;
    public static final int J1 = 16;
    public static final int K1 = 32;
    public static final String L1 = "MaterialButton";
    public static final float O1 = 0.11f;
    public static final int P1 = -1;
    public float A1;
    public float B1;
    @InterfaceC11300zs1
    public C5850db2 C1;
    @InterfaceC5670cr1
    public final C7210j91 b1;
    @InterfaceC5670cr1
    public final LinkedHashSet<c> c1;
    @InterfaceC11300zs1
    public d d1;
    @InterfaceC11300zs1
    public PorterDuff.Mode e1;
    @InterfaceC11300zs1
    public ColorStateList f1;
    @InterfaceC11300zs1
    public Drawable g1;
    @InterfaceC11300zs1
    public String h1;
    @PK1
    public int i1;
    @PK1
    public int j1;
    @PK1
    public int k1;
    @PK1
    public int l1;
    public boolean m1;
    public boolean n1;
    public int o1;
    public int p1;
    public float q1;
    @PK1
    public int r1;
    @PK1
    public int s1;
    @InterfaceC11300zs1
    public LinearLayout.LayoutParams t1;
    public boolean u1;
    public int v1;
    public boolean w1;
    @PK1
    public int x1;
    @InterfaceC11300zs1
    public C10994yc2 y1;
    @PK1
    public int z1;
    public static final int[] D1 = {16842911};
    public static final int[] E1 = {16842912};
    public static final int M1 = C7025iN1.n.Widget_MaterialComponents_Button;
    @InterfaceC8568og
    public static final int N1 = C7025iN1.c.materialSizeOverlay;
    public static final AbstractC11311zv0<MaterialButton> Q1 = new a("widthIncrease");

    /* loaded from: classes3.dex */
    public class a extends AbstractC11311zv0<MaterialButton> {
        public a(String str) {
            super(str);
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: d */
        public float b(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // o.AbstractC11311zv0
        /* renamed from: e */
        public void c(MaterialButton materialButton, float f) {
            materialButton.setDisplayedWidthIncrease(f);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface b {
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(MaterialButton materialButton, boolean z);
    }

    /* loaded from: classes3.dex */
    public static class e extends J {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public boolean Z;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: a */
            public e createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @InterfaceC5670cr1
            /* renamed from: b */
            public e createFromParcel(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: c */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(@InterfaceC5670cr1 Parcel parcel) {
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.Z = z;
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.Z ? 1 : 0);
        }

        public e(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.v1 = materialButton.getOpticalCenterShift();
        materialButton.y();
        materialButton.invalidate();
    }

    public static /* synthetic */ void c(MaterialButton materialButton, float f) {
        int i = (int) (f * 0.11f);
        if (materialButton.v1 != i) {
            materialButton.v1 = i;
            materialButton.y();
            materialButton.invalidate();
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.A1;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & JE0.d;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        C4394Uc1 g;
        if (this.u1 && this.w1 && (g = this.b1.g()) != null) {
            return (int) (g.D() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private void setCheckedInternal(boolean z) {
        if (j() && this.m1 != z) {
            this.m1 = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).z(this, this.m1);
            }
            if (!this.n1) {
                this.n1 = true;
                Iterator<c> it = this.c1.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.m1);
                }
                this.n1 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        if (this.A1 != f) {
            this.A1 = f;
            y();
            invalidate();
            if (getParent() instanceof com.google.android.material.button.a) {
                ((com.google.android.material.button.a) getParent()).k(this, (int) this.A1);
            }
        }
    }

    public void f(@InterfaceC5670cr1 c cVar) {
        this.c1.add(cVar);
    }

    public void g() {
        this.c1.clear();
    }

    @InterfaceC5670cr1
    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.h1)) {
            return this.h1;
        }
        if (j()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @PK1
    public int getAllowedWidthDecrease() {
        return this.x1;
    }

    @Override // android.view.View
    @InterfaceC11300zs1
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @InterfaceC11300zs1
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @PK1
    public int getCornerRadius() {
        if (r()) {
            return this.b1.b();
        }
        return 0;
    }

    @InterfaceC11300zs1
    @HT1({HT1.a.Y})
    public C6092eb2 getCornerSpringForce() {
        return this.b1.c();
    }

    public Drawable getIcon() {
        return this.g1;
    }

    public int getIconGravity() {
        return this.o1;
    }

    @PK1
    public int getIconPadding() {
        return this.l1;
    }

    @PK1
    public int getIconSize() {
        return this.i1;
    }

    public ColorStateList getIconTint() {
        return this.f1;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.e1;
    }

    @InterfaceC9397s30
    public int getInsetBottom() {
        return this.b1.d();
    }

    @InterfaceC9397s30
    public int getInsetTop() {
        return this.b1.e();
    }

    @InterfaceC11300zs1
    public ColorStateList getRippleColor() {
        if (r()) {
            return this.b1.i();
        }
        return null;
    }

    @Override // o.InterfaceC6946i32
    @InterfaceC5670cr1
    public O22 getShapeAppearanceModel() {
        if (r()) {
            return this.b1.j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    @InterfaceC11300zs1
    @HT1({HT1.a.Y})
    public C10751xc2 getStateListShapeAppearanceModel() {
        if (r()) {
            return this.b1.k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (r()) {
            return this.b1.l();
        }
        return null;
    }

    @PK1
    public int getStrokeWidth() {
        if (r()) {
            return this.b1.m();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, o.InterfaceC2981Fp2
    @InterfaceC11300zs1
    @HT1({HT1.a.Y})
    public ColorStateList getSupportBackgroundTintList() {
        if (r()) {
            return this.b1.n();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, o.InterfaceC2981Fp2
    @InterfaceC11300zs1
    @HT1({HT1.a.Y})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (r()) {
            return this.b1.o();
        }
        return super.getSupportBackgroundTintMode();
    }

    public final C6092eb2 h() {
        return C9811tl1.h(getContext(), C7025iN1.c.motionSpringFastSpatial, C7025iN1.n.Motion_Material3_Spring_Standard_Fast_Spatial);
    }

    public final void i() {
        C5850db2 c5850db2 = new C5850db2(this, Q1);
        this.C1 = c5850db2;
        c5850db2.G(h());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.m1;
    }

    public boolean j() {
        C7210j91 c7210j91 = this.b1;
        if (c7210j91 != null && c7210j91.r()) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        int i = this.o1;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    public final boolean l() {
        int i = this.o1;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        int i = this.o1;
        if (i != 16 && i != 32) {
            return false;
        }
        return true;
    }

    public final boolean n() {
        if ((getParent() instanceof com.google.android.material.button.a) && ((com.google.android.material.button.a) getParent()).getOrientation() == 0) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (r()) {
            C4491Vc1.f(this, this.b1.g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (j()) {
            View.mergeDrawableStates(onCreateDrawableState, D1);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, E1);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@InterfaceC5670cr1 AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC5670cr1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(j());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        x(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.p1 != i6) {
            this.p1 = i6;
            this.q1 = -1.0f;
        }
        if (this.q1 == -1.0f) {
            this.q1 = getMeasuredWidth();
            if (this.t1 == null && (getParent() instanceof com.google.android.material.button.a) && ((com.google.android.material.button.a) getParent()).getButtonSizeChange() != null) {
                this.t1 = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.t1);
                layoutParams.width = (int) this.q1;
                setLayoutParams(layoutParams);
            }
        }
        if (this.x1 == -1) {
            if (this.g1 == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.i1;
                if (i7 == 0) {
                    i7 = this.g1.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.x1 = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.r1 == -1) {
            this.r1 = getPaddingStart();
        }
        if (this.s1 == -1) {
            this.s1 = getPaddingEnd();
        }
        this.w1 = n();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@InterfaceC11300zs1 Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        setChecked(eVar.Z);
    }

    @Override // android.widget.TextView, android.view.View
    @InterfaceC5670cr1
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.Z = this.m1;
        return eVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean p() {
        return this.u1;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.b1.s()) {
            toggle();
        }
        return super.performClick();
    }

    public boolean q() {
        return this.b1.s();
    }

    public final boolean r() {
        C7210j91 c7210j91 = this.b1;
        if (c7210j91 != null && !c7210j91.q()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.g1 != null) {
            if (this.g1.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public final void s(boolean z) {
        if (this.y1 != null) {
            if (this.C1 == null) {
                i();
            }
            if (this.w1) {
                this.C1.C(Math.min(this.z1, this.y1.f(getDrawableState()).a.a(getWidth())));
                if (z) {
                    this.C1.H();
                }
            }
        }
    }

    @HT1({HT1.a.Y})
    public void setA11yClassName(@InterfaceC11300zs1 String str) {
        this.h1 = str;
    }

    @Override // android.view.View
    public void setBackground(@InterfaceC5670cr1 Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@JF int i) {
        if (r()) {
            this.b1.u(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@InterfaceC5670cr1 Drawable drawable) {
        if (r()) {
            if (drawable != getBackground()) {
                Log.w(L1, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.b1.v();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@K60 int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C3220Ic.b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (r()) {
            this.b1.w(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(@PK1 int i) {
        if (r()) {
            this.b1.x(i);
        }
    }

    public void setCornerRadiusResource(@InterfaceC9154r30 int i) {
        if (r()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @HT1({HT1.a.Y})
    public void setCornerSpringForce(@InterfaceC5670cr1 C6092eb2 c6092eb2) {
        this.b1.z(c6092eb2);
    }

    public void setDisplayedWidthDecrease(int i) {
        this.B1 = Math.min(i, this.x1);
        y();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (r()) {
            this.b1.g().x0(f);
        }
    }

    public void setIcon(@InterfaceC11300zs1 Drawable drawable) {
        if (this.g1 != drawable) {
            this.g1 = drawable;
            w(true);
            x(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.o1 != i) {
            this.o1 = i;
            x(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@PK1 int i) {
        if (this.l1 != i) {
            this.l1 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(@K60 int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C3220Ic.b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(@PK1 int i) {
        if (i >= 0) {
            if (this.i1 != i) {
                this.i1 = i;
                w(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.f1 != colorStateList) {
            this.f1 = colorStateList;
            w(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.e1 != mode) {
            this.e1 = mode;
            w(false);
        }
    }

    public void setIconTintResource(@InterfaceC6509gG int i) {
        setIconTint(C3220Ic.a(getContext(), i));
    }

    public void setInsetBottom(@InterfaceC9397s30 int i) {
        this.b1.A(i);
    }

    public void setInsetTop(@InterfaceC9397s30 int i) {
        this.b1.B(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@InterfaceC11300zs1 d dVar) {
        this.d1 = dVar;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.u1 != z) {
            this.u1 = z;
            if (z) {
                this.b1.y(new C4394Uc1.e() { // from class: o.f91
                    @Override // o.C4394Uc1.e
                    public final void a(float f) {
                        MaterialButton.c(MaterialButton.this, f);
                    }
                });
            } else {
                this.b1.y(null);
            }
            post(new Runnable() { // from class: o.g91
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.a(MaterialButton.this);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        d dVar = this.d1;
        if (dVar != null) {
            dVar.a(this, z);
        }
        super.setPressed(z);
        s(false);
    }

    public void setRippleColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (r()) {
            this.b1.C(colorStateList);
        }
    }

    public void setRippleColorResource(@InterfaceC6509gG int i) {
        if (r()) {
            setRippleColor(C3220Ic.a(getContext(), i));
        }
    }

    @Override // o.InterfaceC6946i32
    public void setShapeAppearanceModel(@InterfaceC5670cr1 O22 o22) {
        if (r()) {
            this.b1.D(o22);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (r()) {
            this.b1.E(z);
        }
    }

    public void setSizeChange(@InterfaceC5670cr1 C10994yc2 c10994yc2) {
        if (this.y1 != c10994yc2) {
            this.y1 = c10994yc2;
            s(true);
        }
    }

    @HT1({HT1.a.Y})
    public void setStateListShapeAppearanceModel(@InterfaceC5670cr1 C10751xc2 c10751xc2) {
        if (r()) {
            if (this.b1.c() == null && c10751xc2.g()) {
                this.b1.z(h());
            }
            this.b1.F(c10751xc2);
            return;
        }
        throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setStrokeColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (r()) {
            this.b1.G(colorStateList);
        }
    }

    public void setStrokeColorResource(@InterfaceC6509gG int i) {
        if (r()) {
            setStrokeColor(C3220Ic.a(getContext(), i));
        }
    }

    public void setStrokeWidth(@PK1 int i) {
        if (r()) {
            this.b1.H(i);
        }
    }

    public void setStrokeWidthResource(@InterfaceC9154r30 int i) {
        if (r()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, o.InterfaceC2981Fp2
    @HT1({HT1.a.Y})
    public void setSupportBackgroundTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (r()) {
            this.b1.I(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, o.InterfaceC2981Fp2
    @HT1({HT1.a.Y})
    public void setSupportBackgroundTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        if (r()) {
            this.b1.J(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        x(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.b1.K(z);
    }

    @Override // android.widget.TextView
    public void setWidth(@PK1 int i) {
        this.q1 = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(@PK1 int i) {
        if (this.z1 != i) {
            this.z1 = i;
            s(true);
        }
    }

    public void t() {
        LinearLayout.LayoutParams layoutParams = this.t1;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.t1 = null;
            this.q1 = -1.0f;
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.m1);
    }

    public void u(@InterfaceC5670cr1 c cVar) {
        this.c1.remove(cVar);
    }

    public final void v() {
        if (l()) {
            setCompoundDrawablesRelative(this.g1, null, null, null);
        } else if (k()) {
            setCompoundDrawablesRelative(null, null, this.g1, null);
        } else if (m()) {
            setCompoundDrawablesRelative(null, this.g1, null, null);
        }
    }

    public final void w(boolean z) {
        Drawable drawable = this.g1;
        if (drawable != null) {
            Drawable mutate = D60.r(drawable).mutate();
            this.g1 = mutate;
            mutate.setTintList(this.f1);
            PorterDuff.Mode mode = this.e1;
            if (mode != null) {
                this.g1.setTintMode(mode);
            }
            int i = this.i1;
            if (i == 0) {
                i = this.g1.getIntrinsicWidth();
            }
            int i2 = this.i1;
            if (i2 == 0) {
                i2 = this.g1.getIntrinsicHeight();
            }
            Drawable drawable2 = this.g1;
            int i3 = this.j1;
            int i4 = this.k1;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.g1.setVisible(true, z);
        }
        if (z) {
            v();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((l() && drawable3 != this.g1) || ((k() && drawable5 != this.g1) || (m() && drawable4 != this.g1))) {
            v();
        }
    }

    public final void x(int i, int i2) {
        if (this.g1 != null && getLayout() != null) {
            if (!l() && !k()) {
                if (m()) {
                    this.j1 = 0;
                    if (this.o1 == 16) {
                        this.k1 = 0;
                        w(false);
                        return;
                    }
                    int i3 = this.i1;
                    if (i3 == 0) {
                        i3 = this.g1.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.l1) - getPaddingBottom()) / 2);
                    if (this.k1 != max) {
                        this.k1 = max;
                        w(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.k1 = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i4 = this.o1;
            boolean z = true;
            if (i4 != 1 && i4 != 3 && ((i4 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i4 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i5 = this.i1;
                if (i5 == 0) {
                    i5 = this.g1.getIntrinsicWidth();
                }
                int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i5) - this.l1) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textLayoutWidth /= 2;
                }
                boolean o2 = o();
                if (this.o1 != 4) {
                    z = false;
                }
                if (o2 != z) {
                    textLayoutWidth = -textLayoutWidth;
                }
                if (this.j1 != textLayoutWidth) {
                    this.j1 = textLayoutWidth;
                    w(false);
                    return;
                }
                return;
            }
            this.j1 = 0;
            w(false);
        }
    }

    public final void y() {
        int i = (int) (this.A1 - this.B1);
        int i2 = (i / 2) + this.v1;
        getLayoutParams().width = (int) (this.q1 + i);
        setPaddingRelative(this.r1 + i2, getPaddingTop(), (this.s1 + i) - i2, getPaddingBottom());
    }

    public MaterialButton(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialButton(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.e(context, attributeSet, i, r4, new int[]{N1}), attributeSet, i);
        O22 m;
        int i2 = M1;
        this.c1 = new LinkedHashSet<>();
        this.m1 = false;
        this.n1 = false;
        this.p1 = -1;
        this.q1 = -1.0f;
        this.r1 = -1;
        this.s1 = -1;
        this.x1 = -1;
        Context context2 = getContext();
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.h5, i, i2, new int[0]);
        this.l1 = k.getDimensionPixelSize(C7025iN1.o.v5, 0);
        this.e1 = C10920yI2.t(k.getInt(C7025iN1.o.y5, -1), PorterDuff.Mode.SRC_IN);
        this.f1 = C4297Tc1.a(getContext(), k, C7025iN1.o.x5);
        this.g1 = C4297Tc1.e(getContext(), k, C7025iN1.o.t5);
        this.o1 = k.getInteger(C7025iN1.o.u5, 1);
        this.i1 = k.getDimensionPixelSize(C7025iN1.o.w5, 0);
        C10751xc2 b2 = C10751xc2.b(context2, k, C7025iN1.o.B5);
        if (b2 != null) {
            m = b2.c(true);
        } else {
            m = O22.e(context2, attributeSet, i, i2).m();
        }
        boolean z = k.getBoolean(C7025iN1.o.z5, false);
        C7210j91 c7210j91 = new C7210j91(this, m);
        this.b1 = c7210j91;
        c7210j91.t(k);
        setCheckedInternal(k.getBoolean(C7025iN1.o.j5, false));
        if (b2 != null) {
            c7210j91.z(h());
            c7210j91.F(b2);
        }
        setOpticalCenterEnabled(z);
        k.recycle();
        setCompoundDrawablePadding(this.l1);
        w(this.g1 != null);
    }
}
