package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C7025iN1;
import o.HT1;
import o.InterfaceC8441o9;
import o.OL1;

/* renamed from: o.o91  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8443o91 extends C4485Vb {
    public static final int[] B1;
    public static final int[][] C1;
    @SuppressLint({"DiscouragedApi"})
    public static final int D1;
    public static final int x1 = 0;
    public static final int y1 = 1;
    public static final int z1 = 2;
    @InterfaceC5670cr1
    public final LinkedHashSet<d> c1;
    @InterfaceC5670cr1
    public final LinkedHashSet<c> d1;
    @InterfaceC11300zs1
    public ColorStateList e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    @InterfaceC11300zs1
    public CharSequence i1;
    @InterfaceC11300zs1
    public Drawable j1;
    @InterfaceC11300zs1
    public Drawable k1;
    public boolean l1;
    @InterfaceC11300zs1
    public ColorStateList m1;
    @InterfaceC11300zs1
    public ColorStateList n1;
    @InterfaceC5670cr1
    public PorterDuff.Mode o1;
    public int p1;
    public int[] q1;
    public boolean r1;
    @InterfaceC11300zs1
    public CharSequence s1;
    @InterfaceC11300zs1
    public CompoundButton.OnCheckedChangeListener t1;
    @InterfaceC11300zs1
    public final T9 u1;
    public final InterfaceC8441o9.a v1;
    public static final int w1 = C7025iN1.n.Widget_MaterialComponents_CompoundButton_CheckBox;
    public static final int[] A1 = {C7025iN1.c.state_indeterminate};

    /* renamed from: o.o91$a */
    /* loaded from: classes3.dex */
    public class a extends InterfaceC8441o9.a {
        public a() {
        }

        @Override // o.InterfaceC8441o9.a
        public void b(Drawable drawable) {
            super.b(drawable);
            ColorStateList colorStateList = C8443o91.this.m1;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }

        @Override // o.InterfaceC8441o9.a
        public void c(Drawable drawable) {
            super.c(drawable);
            C8443o91 c8443o91 = C8443o91.this;
            ColorStateList colorStateList = c8443o91.m1;
            if (colorStateList != null) {
                drawable.setTint(colorStateList.getColorForState(c8443o91.q1, C8443o91.this.m1.getDefaultColor()));
            }
        }
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.o91$b */
    /* loaded from: classes3.dex */
    public @interface b {
    }

    /* renamed from: o.o91$c */
    /* loaded from: classes3.dex */
    public interface c {
        void a(@InterfaceC5670cr1 C8443o91 c8443o91, int i);
    }

    /* renamed from: o.o91$d */
    /* loaded from: classes3.dex */
    public interface d {
        void a(@InterfaceC5670cr1 C8443o91 c8443o91, boolean z);
    }

    /* renamed from: o.o91$e */
    /* loaded from: classes3.dex */
    public static class e extends View.BaseSavedState {
        @InterfaceC5670cr1
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int X;

        /* renamed from: o.o91$e$a */
        /* loaded from: classes3.dex */
        public class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public /* synthetic */ e(Parcel parcel, a aVar) {
            this(parcel);
        }

        @InterfaceC5670cr1
        public final String a() {
            int i = this.X;
            if (i != 1) {
                if (i != 2) {
                    return "unchecked";
                }
                return "indeterminate";
            }
            return "checked";
        }

        @InterfaceC5670cr1
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.X));
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public e(Parcel parcel) {
            super(parcel);
            this.X = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    static {
        int i = C7025iN1.c.state_error;
        B1 = new int[]{i};
        C1 = new int[][]{new int[]{16842910, i}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
        D1 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public C8443o91(Context context) {
        this(context, null);
    }

    @InterfaceC5670cr1
    private String getButtonStateDescription() {
        int i = this.p1;
        if (i == 1) {
            return getResources().getString(C7025iN1.m.mtrl_checkbox_state_description_checked);
        }
        if (i == 0) {
            return getResources().getString(C7025iN1.m.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(C7025iN1.m.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e1 == null) {
            int[][] iArr = C1;
            int[] iArr2 = new int[iArr.length];
            int d2 = C9179r91.d(this, OL1.b.F0);
            int d3 = C9179r91.d(this, OL1.b.I0);
            int d4 = C9179r91.d(this, C7025iN1.c.colorSurface);
            int d5 = C9179r91.d(this, C7025iN1.c.colorOnSurface);
            iArr2[0] = C9179r91.t(d4, d3, 1.0f);
            iArr2[1] = C9179r91.t(d4, d2, 1.0f);
            iArr2[2] = C9179r91.t(d4, d5, 0.54f);
            iArr2[3] = C9179r91.t(d4, d5, 0.38f);
            iArr2[4] = C9179r91.t(d4, d5, 0.38f);
            this.e1 = new ColorStateList(iArr, iArr2);
        }
        return this.e1;
    }

    @InterfaceC11300zs1
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.m1;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public void d(@InterfaceC5670cr1 c cVar) {
        this.d1.add(cVar);
    }

    public void e(@InterfaceC5670cr1 d dVar) {
        this.c1.add(dVar);
    }

    public void f() {
        this.d1.clear();
    }

    public void g() {
        this.c1.clear();
    }

    @Override // android.widget.CompoundButton
    @InterfaceC11300zs1
    public Drawable getButtonDrawable() {
        return this.j1;
    }

    @InterfaceC11300zs1
    public Drawable getButtonIconDrawable() {
        return this.k1;
    }

    @InterfaceC11300zs1
    public ColorStateList getButtonIconTintList() {
        return this.n1;
    }

    @InterfaceC5670cr1
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.o1;
    }

    @Override // android.widget.CompoundButton
    @InterfaceC11300zs1
    public ColorStateList getButtonTintList() {
        return this.m1;
    }

    public int getCheckedState() {
        return this.p1;
    }

    @InterfaceC11300zs1
    public CharSequence getErrorAccessibilityLabel() {
        return this.i1;
    }

    public final boolean h(C2872Ep2 c2872Ep2) {
        int u = c2872Ep2.u(C7025iN1.o.I6, 0);
        int u2 = c2872Ep2.u(C7025iN1.o.J6, 0);
        if (u != D1 || u2 != 0) {
            return false;
        }
        return true;
    }

    public boolean i() {
        return this.g1;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        if (this.p1 == 1) {
            return true;
        }
        return false;
    }

    public boolean j() {
        return this.h1;
    }

    public boolean k() {
        return this.f1;
    }

    public final void l() {
        this.j1 = Z60.d(this.j1, this.m1, ZI.c(this));
        this.k1 = Z60.d(this.k1, this.n1, this.o1);
        p();
        q();
        super.setButtonDrawable(Z60.a(this.j1, this.k1));
        refreshDrawableState();
    }

    public void m(@InterfaceC5670cr1 c cVar) {
        this.d1.remove(cVar);
    }

    public void n(@InterfaceC5670cr1 d dVar) {
        this.c1.remove(dVar);
    }

    public final void o() {
        if (Build.VERSION.SDK_INT >= 30 && this.s1 == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1 && this.m1 == null && this.n1 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, A1);
        }
        if (j()) {
            View.mergeDrawableStates(onCreateDrawableState, B1);
        }
        this.q1 = Z60.f(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable a2;
        int i;
        if (this.g1 && TextUtils.isEmpty(getText()) && (a2 = ZI.a(this)) != null) {
            if (C10920yI2.s(this)) {
                i = -1;
            } else {
                i = 1;
            }
            int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * i;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = a2.getBounds();
                getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@InterfaceC11300zs1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && j()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + C6566gU0.h + ((Object) this.i1));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@InterfaceC11300zs1 Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        setCheckedState(eVar.X);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @InterfaceC11300zs1
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.X = getCheckedState();
        return eVar;
    }

    public final void p() {
        T9 t9;
        if (this.l1) {
            T9 t92 = this.u1;
            if (t92 != null) {
                t92.b(this.v1);
                this.u1.c(this.v1);
            }
            Drawable drawable = this.j1;
            if ((drawable instanceof AnimatedStateListDrawable) && (t9 = this.u1) != null) {
                int i = C7025iN1.h.s;
                int i2 = C7025iN1.h.R2;
                ((AnimatedStateListDrawable) drawable).addTransition(i, i2, t9, false);
                ((AnimatedStateListDrawable) this.j1).addTransition(C7025iN1.h.indeterminate, i2, this.u1, false);
            }
        }
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.j1;
        if (drawable != null && (colorStateList2 = this.m1) != null) {
            drawable.setTintList(colorStateList2);
        }
        Drawable drawable2 = this.k1;
        if (drawable2 != null && (colorStateList = this.n1) != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // o.C4485Vb, android.widget.CompoundButton
    public void setButtonDrawable(@K60 int i) {
        setButtonDrawable(C3220Ic.b(getContext(), i));
    }

    public void setButtonIconDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.k1 = drawable;
        l();
    }

    public void setButtonIconDrawableResource(@K60 int i) {
        setButtonIconDrawable(C3220Ic.b(getContext(), i));
    }

    public void setButtonIconTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.n1 == colorStateList) {
            return;
        }
        this.n1 = colorStateList;
        l();
    }

    public void setButtonIconTintMode(@InterfaceC5670cr1 PorterDuff.Mode mode) {
        if (this.o1 == mode) {
            return;
        }
        this.o1 = mode;
        l();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        if (this.m1 == colorStateList) {
            return;
        }
        this.m1 = colorStateList;
        l();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        l();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.g1 = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z;
        AutofillManager a2;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.p1 != i) {
            this.p1 = i;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            o();
            if (!this.r1) {
                this.r1 = true;
                LinkedHashSet<c> linkedHashSet = this.d1;
                if (linkedHashSet != null) {
                    Iterator<c> it = linkedHashSet.iterator();
                    while (it.hasNext()) {
                        it.next().a(this, this.p1);
                    }
                }
                if (this.p1 != 2 && (onCheckedChangeListener = this.t1) != null) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (Build.VERSION.SDK_INT >= 26 && (a2 = com.facebook.internal.g0.a(getContext().getSystemService(com.facebook.internal.f0.a()))) != null) {
                    a2.notifyValueChanged(this);
                }
                this.r1 = false;
            }
        }
    }

    public void setErrorAccessibilityLabel(@InterfaceC11300zs1 CharSequence charSequence) {
        this.i1 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@InterfaceC3329Je2 int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z) {
        if (this.h1 != z) {
            this.h1 = z;
            refreshDrawableState();
            Iterator<d> it = this.c1.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.h1);
            }
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@InterfaceC11300zs1 CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.t1 = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @ES1(30)
    public void setStateDescription(@InterfaceC11300zs1 CharSequence charSequence) {
        this.s1 = charSequence;
        if (charSequence == null) {
            o();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f1 = z;
        if (z) {
            ZI.d(this, getMaterialThemeColorsTintList());
        } else {
            ZI.d(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public C8443o91(Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.v0);
    }

    @Override // o.C4485Vb, android.widget.CompoundButton
    public void setButtonDrawable(@InterfaceC11300zs1 Drawable drawable) {
        this.j1 = drawable;
        this.l1 = false;
        l();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C8443o91(Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = w1;
        this.c1 = new LinkedHashSet<>();
        this.d1 = new LinkedHashSet<>();
        this.u1 = T9.d(getContext(), C7025iN1.g.mtrl_checkbox_button_checked_unchecked);
        this.v1 = new a();
        Context context2 = getContext();
        this.j1 = ZI.a(this);
        this.m1 = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C2872Ep2 l = C7608kn2.l(context2, attributeSet, C7025iN1.o.H6, i, i2, new int[0]);
        this.k1 = l.h(C7025iN1.o.K6);
        if (this.j1 != null && C7608kn2.h(context2) && h(l)) {
            super.setButtonDrawable((Drawable) null);
            this.j1 = C3220Ic.b(context2, C7025iN1.g.mtrl_checkbox_button);
            this.l1 = true;
            if (this.k1 == null) {
                this.k1 = C3220Ic.b(context2, C7025iN1.g.mtrl_checkbox_button_icon);
            }
        }
        this.n1 = C4297Tc1.b(context2, l, C7025iN1.o.L6);
        this.o1 = C10920yI2.t(l.o(C7025iN1.o.M6, -1), PorterDuff.Mode.SRC_IN);
        this.f1 = l.a(C7025iN1.o.S6, false);
        this.g1 = l.a(C7025iN1.o.O6, true);
        this.h1 = l.a(C7025iN1.o.R6, false);
        this.i1 = l.x(C7025iN1.o.Q6);
        int i3 = C7025iN1.o.P6;
        if (l.C(i3)) {
            setCheckedState(l.o(i3, 0));
        }
        l.I();
        l();
    }
}
