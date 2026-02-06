package com.google.android.material.search;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import o.C3220Ic;
import o.C4297Tc1;
import o.C4394Uc1;
import o.C4491Vc1;
import o.C4930Zm2;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.C8854pq2;
import o.C9179r91;
import o.D60;
import o.HT1;
import o.InterfaceC10285vi1;
import o.InterfaceC11300zs1;
import o.InterfaceC3329Je2;
import o.InterfaceC4698Xf2;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;
import o.InterfaceC9154r30;
import o.InterfaceC9397s30;
import o.J;
import o.JF;
import o.K60;
import o.O22;
import o.OL1;
import o.PK1;

/* loaded from: classes3.dex */
public class SearchBar extends Toolbar {
    public static final int q2 = C7025iN1.n.Widget_Material3_SearchBar;
    public static final int r2 = 53;
    public static final String s2 = "http://schemas.android.com/apk/res-auto";
    public final TextView T1;
    public final TextView U1;
    public final FrameLayout V1;
    public final int W1;
    public boolean X1;
    @InterfaceC11300zs1
    public final ColorStateList Y1;
    public final boolean Z1;
    public final boolean a2;
    public final com.google.android.material.search.a b2;
    public final Drawable c2;
    public final boolean d2;
    public final boolean e2;
    @InterfaceC11300zs1
    public View f2;
    @InterfaceC11300zs1
    public Integer g2;
    @InterfaceC11300zs1
    public Drawable h2;
    public int i2;
    public boolean j2;
    public C4394Uc1 k2;
    public boolean l2;
    public int m2;
    @InterfaceC11300zs1
    public ActionMenuView n2;
    @InterfaceC11300zs1
    public ImageButton o2;
    public final AppBarLayout.g p2;

    /* loaded from: classes3.dex */
    public class a extends AppBarLayout.g {
        public a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.g
        public void a(float f, int i, float f2) {
            if (SearchBar.this.Y1 != null) {
                SearchBar.this.k2.y0(ColorStateList.valueOf(C9179r91.t(SearchBar.this.W1, SearchBar.this.Y1.getDefaultColor(), f2)));
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {
        public void a() {
        }

        public void b() {
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends J {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public String Z;

        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel) {
            this(parcel, null);
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.Z);
        }

        public c(Parcel parcel, @InterfaceC11300zs1 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Z = parcel.readString();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchBar(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @InterfaceC11300zs1
    private Drawable D0(@InterfaceC11300zs1 Drawable drawable) {
        int i;
        int d;
        if (this.d2 && drawable != null) {
            Integer num = this.g2;
            if (num != null) {
                d = num.intValue();
            } else {
                if (drawable == this.c2) {
                    i = C7025iN1.c.colorOnSurfaceVariant;
                } else {
                    i = C7025iN1.c.colorOnSurface;
                }
                d = C9179r91.d(this, i);
            }
            Drawable r = D60.r(drawable.mutate());
            r.setTint(d);
            return r;
        }
        return drawable;
    }

    @InterfaceC11300zs1
    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private void setNavigationIconDecorative(boolean z) {
        Drawable drawable;
        ImageButton e = C8854pq2.e(this);
        if (e == null) {
            return;
        }
        e.setClickable(!z);
        e.setFocusable(!z);
        Drawable background = e.getBackground();
        if (background != null) {
            this.h2 = background;
        }
        if (z) {
            drawable = null;
        } else {
            drawable = this.h2;
        }
        e.setBackgroundDrawable(drawable);
        K0();
    }

    public final void A0(View view, int i, int i2, int i3, int i4) {
        if (getLayoutDirection() == 1) {
            view.layout(getMeasuredWidth() - i3, i2, getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    public final void B0() {
        ActionMenuView actionMenuView;
        int i;
        int i2;
        int measuredWidth = (getMeasuredWidth() / 2) - (this.V1.getMeasuredWidth() / 2);
        int measuredWidth2 = this.V1.getMeasuredWidth() + measuredWidth;
        int measuredHeight = (getMeasuredHeight() / 2) - (this.V1.getMeasuredHeight() / 2);
        int measuredHeight2 = this.V1.getMeasuredHeight() + measuredHeight;
        boolean z = true;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        ActionMenuView q0 = q0();
        ImageButton r0 = r0();
        int measuredWidth3 = (this.V1.getMeasuredWidth() / 2) - (this.T1.getMeasuredWidth() / 2);
        int measuredWidth4 = this.T1.getMeasuredWidth() + measuredWidth3;
        int i3 = measuredWidth3 + measuredWidth;
        int i4 = measuredWidth4 + measuredWidth;
        if (z) {
            actionMenuView = q0;
        } else {
            actionMenuView = r0;
        }
        if (z) {
            q0 = r0;
        }
        if (actionMenuView != null) {
            i = Math.max(actionMenuView.getRight() - i3, 0);
        } else {
            i = 0;
        }
        int i5 = i3 + i;
        int i6 = i4 + i;
        if (q0 != null) {
            i2 = Math.max(i6 - q0.getLeft(), 0);
        } else {
            i2 = 0;
        }
        int i7 = i5 - i2;
        int i8 = i6 - i2;
        int max = ((i - i2) + Math.max(Math.max(getPaddingLeft() - i7, getContentInsetLeft() - i7), 0)) - Math.max(Math.max(i8 - (getMeasuredWidth() - getPaddingRight()), i8 - (getMeasuredWidth() - getContentInsetRight())), 0);
        this.V1.layout(measuredWidth + max, measuredHeight, measuredWidth2 + max, measuredHeight2);
    }

    public final void C0(View view) {
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i = measuredWidth2 + measuredWidth;
        int measuredHeight = view.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        A0(view, measuredWidth2, measuredHeight2, i, measuredHeight2 + measuredHeight);
    }

    public final void E0(int i, int i2) {
        View view = this.f2;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    public boolean F0(@InterfaceC5670cr1 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.b2.A(animatorListenerAdapter);
    }

    public boolean G0(@InterfaceC5670cr1 AnimatorListenerAdapter animatorListenerAdapter) {
        return this.b2.B(animatorListenerAdapter);
    }

    public final void H0() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.C(this.p2);
        }
    }

    public boolean I0(@InterfaceC5670cr1 b bVar) {
        return this.b2.C(bVar);
    }

    public final void J0() {
        if (this.a2 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C7025iN1.f.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = m0(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = m0(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = m0(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = m0(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    public final void K0() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = true;
        int i3 = 0;
        if (getLayoutDirection() != 1) {
            z = false;
        }
        ImageButton e = C8854pq2.e(this);
        if (e != null && e.isClickable()) {
            if (z) {
                i = getWidth() - e.getLeft();
            } else {
                i = e.getRight();
            }
        } else {
            i = 0;
        }
        ActionMenuView b2 = C8854pq2.b(this);
        if (b2 != null) {
            if (z) {
                i3 = b2.getRight();
            } else {
                i3 = getWidth() - b2.getLeft();
            }
        }
        if (z) {
            i2 = i3;
        } else {
            i2 = i;
        }
        float f = -i2;
        if (!z) {
            i = i3;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -i, 0.0f);
    }

    public final void L0() {
        if (getLayoutParams() instanceof AppBarLayout.e) {
            AppBarLayout.e eVar = (AppBarLayout.e) getLayoutParams();
            if (this.j2) {
                if (eVar.c() == 0) {
                    eVar.h(53);
                }
            } else if (eVar.c() == 53) {
                eVar.h(0);
            }
        }
    }

    public void M0() {
        post(new Runnable() { // from class: o.YY1
            @Override // java.lang.Runnable
            public final void run() {
                r0.b2.G(SearchBar.this);
            }
        });
    }

    public void N0() {
        this.b2.H(this);
    }

    public final void O0(@InterfaceC11300zs1 AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") == null) {
                    return;
                }
                throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
            }
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.Z1 && this.f2 == null && !(view instanceof ActionMenuView)) {
            this.f2 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public void e0(@InterfaceC5670cr1 AnimatorListenerAdapter animatorListenerAdapter) {
        this.b2.h(animatorListenerAdapter);
    }

    public void f0(@InterfaceC5670cr1 AnimatorListenerAdapter animatorListenerAdapter) {
        this.b2.i(animatorListenerAdapter);
    }

    public final void g0() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null && this.Y1 != null) {
            appBarLayoutParentIfExists.d(this.p2);
        }
    }

    @InterfaceC11300zs1
    public View getCenterView() {
        return this.f2;
    }

    public float getCompatElevation() {
        C4394Uc1 c4394Uc1 = this.k2;
        if (c4394Uc1 != null) {
            return c4394Uc1.F();
        }
        return getElevation();
    }

    public float getCornerSize() {
        return this.k2.b0();
    }

    @HT1({HT1.a.Y})
    @InterfaceC9154r30
    public int getDefaultMarginVerticalResource() {
        return C7025iN1.f.m3_searchbar_margin_vertical;
    }

    @HT1({HT1.a.Y})
    @K60
    public int getDefaultNavigationIconResource() {
        return C7025iN1.g.ic_search_black_24;
    }

    @InterfaceC11300zs1
    public CharSequence getHint() {
        return this.T1.getHint();
    }

    @PK1
    public int getMaxWidth() {
        return this.m2;
    }

    public int getMenuResId() {
        return this.i2;
    }

    public TextView getPlaceholderTextView() {
        return this.U1;
    }

    @JF
    public int getStrokeColor() {
        return this.k2.W().getDefaultColor();
    }

    @InterfaceC9397s30
    public float getStrokeWidth() {
        return this.k2.Z();
    }

    @InterfaceC5670cr1
    public CharSequence getText() {
        return this.T1.getText();
    }

    public boolean getTextCentered() {
        return this.l2;
    }

    @InterfaceC5670cr1
    public TextView getTextView() {
        return this.T1;
    }

    public void h0(@InterfaceC5670cr1 b bVar) {
        this.b2.j(bVar);
    }

    public void i0() {
        this.T1.setText("");
        this.U1.setText("");
    }

    @InterfaceC6181ey
    public boolean j0(@InterfaceC5670cr1 View view) {
        return k0(view, null);
    }

    @InterfaceC6181ey
    public boolean k0(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 AppBarLayout appBarLayout) {
        return l0(view, appBarLayout, false);
    }

    @InterfaceC6181ey
    public boolean l0(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() == 0 && !v0()) || x0()) {
            this.b2.E(this, view, appBarLayout, z);
            return true;
        }
        return false;
    }

    public final int m0(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    @InterfaceC6181ey
    public boolean n0(@InterfaceC5670cr1 View view) {
        return o0(view, null);
    }

    @InterfaceC6181ey
    public boolean o0(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 AppBarLayout appBarLayout) {
        return p0(view, appBarLayout, false);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4491Vc1.f(this, this.k2);
        J0();
        L0();
        if (this.X1) {
            g0();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        H0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean isEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(isEmpty);
        }
        if (isEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f2;
        if (view != null) {
            C0(view);
        }
        K0();
        if (this.T1 != null && this.l2) {
            B0();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.m2;
        if (i3 >= 0 && i3 < View.MeasureSpec.getSize(i)) {
            i = View.MeasureSpec.makeMeasureSpec(this.m2, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        E0(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setText(cVar.Z);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @InterfaceC5670cr1
    public Parcelable onSaveInstanceState() {
        String charSequence;
        c cVar = new c(super.onSaveInstanceState());
        CharSequence text = getText();
        if (text == null) {
            charSequence = null;
        } else {
            charSequence = text.toString();
        }
        cVar.Z = charSequence;
        return cVar;
    }

    @InterfaceC6181ey
    public boolean p0(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 AppBarLayout appBarLayout, boolean z) {
        if ((view.getVisibility() != 0 && !x0()) || v0()) {
            this.b2.F(this, view, appBarLayout, z);
            return true;
        }
        return false;
    }

    @InterfaceC11300zs1
    public final ActionMenuView q0() {
        if (this.n2 == null) {
            this.n2 = C8854pq2.b(this);
        }
        return this.n2;
    }

    @InterfaceC11300zs1
    public final ImageButton r0() {
        if (this.o2 == null) {
            this.o2 = C8854pq2.e(this);
        }
        return this.o2;
    }

    public final void s0(O22 o22, @JF int i, float f, float f2, @JF int i2) {
        C4394Uc1 c4394Uc1 = new C4394Uc1(o22);
        this.k2 = c4394Uc1;
        c4394Uc1.i0(getContext());
        this.k2.x0(f);
        if (f2 >= 0.0f) {
            this.k2.P0(f2, i2);
        }
        int d = C9179r91.d(this, OL1.b.G0);
        this.k2.y0(ColorStateList.valueOf(i));
        ColorStateList valueOf = ColorStateList.valueOf(d);
        C4394Uc1 c4394Uc12 = this.k2;
        setBackground(new RippleDrawable(valueOf, c4394Uc12, c4394Uc12));
    }

    public void setCenterView(@InterfaceC11300zs1 View view) {
        View view2 = this.f2;
        if (view2 != null) {
            removeView(view2);
            this.f2 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.j2 = z;
        L0();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C4394Uc1 c4394Uc1 = this.k2;
        if (c4394Uc1 != null) {
            c4394Uc1.x0(f);
        }
    }

    public void setHint(@InterfaceC11300zs1 CharSequence charSequence) {
        this.T1.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z) {
        this.X1 = z;
        if (z) {
            g0();
        } else {
            H0();
        }
    }

    public void setMaxWidth(@PK1 int i) {
        if (this.m2 != i) {
            this.m2 = i;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@InterfaceC11300zs1 Drawable drawable) {
        super.setNavigationIcon(D0(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        boolean z;
        if (this.e2) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        if (onClickListener == null) {
            z = true;
        } else {
            z = false;
        }
        setNavigationIconDecorative(z);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.b2.D(z);
    }

    public void setPlaceholderText(String str) {
        this.U1.setText(str);
    }

    public void setStrokeColor(@JF int i) {
        if (getStrokeColor() != i) {
            this.k2.R0(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(@InterfaceC9397s30 float f) {
        if (getStrokeWidth() != f) {
            this.k2.U0(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@InterfaceC11300zs1 CharSequence charSequence) {
        this.T1.setText(charSequence);
        this.U1.setText(charSequence);
    }

    public void setTextCentered(boolean z) {
        this.l2 = z;
        TextView textView = this.T1;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z) {
            layoutParams.gravity = 1;
            this.T1.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            this.T1.setGravity(0);
        }
        this.T1.setLayoutParams(layoutParams);
        this.U1.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void t0() {
        Drawable navigationIcon;
        if (getNavigationIcon() == null) {
            navigationIcon = this.c2;
        } else {
            navigationIcon = getNavigationIcon();
        }
        setNavigationIcon(navigationIcon);
        setNavigationIconDecorative(true);
    }

    public final void u0(@InterfaceC4698Xf2 int i, String str, String str2) {
        if (i != -1) {
            C4930Zm2.D(this.T1, i);
            C4930Zm2.D(this.U1, i);
        }
        setText(str);
        setHint(str2);
        setTextCentered(this.l2);
    }

    public boolean v0() {
        return this.b2.x();
    }

    public boolean w0() {
        return this.j2;
    }

    public boolean x0() {
        return this.b2.y();
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void y(@InterfaceC10285vi1 int i) {
        super.y(i);
        this.i2 = i;
    }

    public boolean y0() {
        return this.X1;
    }

    public boolean z0() {
        return this.b2.z();
    }

    /* loaded from: classes3.dex */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        public boolean c1;

        public ScrollingViewBehavior() {
            this.c1 = false;
        }

        @Override // o.AbstractC5531cH0
        public boolean e0() {
            return true;
        }

        public final void j0(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean p(@InterfaceC5670cr1 CoordinatorLayout coordinatorLayout, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 View view2) {
            boolean p = super.p(coordinatorLayout, view, view2);
            if (!this.c1 && (view2 instanceof AppBarLayout)) {
                this.c1 = true;
                j0((AppBarLayout) view2);
            }
            return p;
        }

        public ScrollingViewBehavior(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c1 = false;
        }
    }

    public SearchBar(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, C7025iN1.c.materialSearchBarStyle);
    }

    public void setHint(@InterfaceC3329Je2 int i) {
        this.T1.setHint(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SearchBar(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r5), attributeSet, i);
        int i2 = q2;
        this.i2 = -1;
        this.p2 = new a();
        Context context2 = getContext();
        O0(attributeSet);
        this.c2 = C3220Ic.b(context2, getDefaultNavigationIconResource());
        this.b2 = new com.google.android.material.search.a();
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.O9, i, i2, new int[0]);
        O22 m = O22.e(context2, attributeSet, i, i2).m();
        int color = k.getColor(C7025iN1.o.T9, 0);
        this.W1 = color;
        this.Y1 = C4297Tc1.a(context2, k, C7025iN1.o.aa);
        float dimension = k.getDimension(C7025iN1.o.W9, 0.0f);
        this.a2 = k.getBoolean(C7025iN1.o.U9, true);
        this.j2 = k.getBoolean(C7025iN1.o.V9, true);
        boolean z = k.getBoolean(C7025iN1.o.Y9, false);
        this.e2 = k.getBoolean(C7025iN1.o.X9, false);
        this.d2 = k.getBoolean(C7025iN1.o.fa, true);
        int i3 = C7025iN1.o.ba;
        if (k.hasValue(i3)) {
            this.g2 = Integer.valueOf(k.getColor(i3, -1));
        }
        int resourceId = k.getResourceId(C7025iN1.o.P9, -1);
        String string = k.getString(C7025iN1.o.R9);
        String string2 = k.getString(C7025iN1.o.S9);
        float dimension2 = k.getDimension(C7025iN1.o.da, -1.0f);
        int color2 = k.getColor(C7025iN1.o.ca, 0);
        this.l2 = k.getBoolean(C7025iN1.o.ea, false);
        this.X1 = k.getBoolean(C7025iN1.o.Z9, false);
        this.m2 = k.getDimensionPixelSize(C7025iN1.o.Q9, -1);
        k.recycle();
        if (!z) {
            t0();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(C7025iN1.k.mtrl_search_bar, this);
        this.Z1 = true;
        this.T1 = (TextView) findViewById(C7025iN1.h.open_search_bar_text_view);
        this.U1 = (TextView) findViewById(C7025iN1.h.open_search_bar_placeholder_text_view);
        this.V1 = (FrameLayout) findViewById(C7025iN1.h.open_search_bar_text_view_container);
        setElevation(dimension);
        u0(resourceId, string, string2);
        s0(m, color, dimension, dimension2, color2);
    }

    public void setText(@InterfaceC3329Je2 int i) {
        this.T1.setText(i);
        this.U1.setText(i);
    }
}
