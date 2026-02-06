package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.C7025iN1;
import o.HT1;

/* renamed from: o.Qo1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4051Qo1 extends FrameLayout {
    public static final int e1 = -1;
    public static final int f1 = 0;
    public static final int g1 = 1;
    public static final int h1 = 2;
    public static final int i1 = -1;
    public static final int j1 = -2;
    public static final int k1 = 0;
    public static final int l1 = 1;
    public static final int m1 = 49;
    public static final int n1 = 17;
    public static final int o1 = 8388627;
    public static final int p1 = 1;
    @InterfaceC5670cr1
    public final C3368Jo1 Y0;
    @InterfaceC5670cr1
    public final AbstractC3661Mo1 Z0;
    @InterfaceC5670cr1
    public final C3759No1 a1;
    public MenuInflater b1;
    public f c1;
    public e d1;

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Qo1$b */
    /* loaded from: classes3.dex */
    public @interface b {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Qo1$c */
    /* loaded from: classes3.dex */
    public @interface c {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Qo1$d */
    /* loaded from: classes3.dex */
    public @interface d {
    }

    /* renamed from: o.Qo1$e */
    /* loaded from: classes3.dex */
    public interface e {
        void a(@InterfaceC5670cr1 MenuItem menuItem);
    }

    /* renamed from: o.Qo1$f */
    /* loaded from: classes3.dex */
    public interface f {
        boolean a(@InterfaceC5670cr1 MenuItem menuItem);
    }

    /* renamed from: o.Qo1$g */
    /* loaded from: classes3.dex */
    public static class g extends J {
        public static final Parcelable.Creator<g> CREATOR = new a();
        @InterfaceC11300zs1
        public Bundle Z;

        /* renamed from: o.Qo1$g$a */
        /* loaded from: classes3.dex */
        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            @InterfaceC11300zs1
            /* renamed from: a */
            public g createFromParcel(@InterfaceC5670cr1 Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @InterfaceC5670cr1
            /* renamed from: b */
            public g createFromParcel(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @InterfaceC5670cr1
            /* renamed from: c */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
            this.Z = parcel.readBundle(classLoader);
        }

        @Override // o.J, android.os.Parcelable
        public void writeToParcel(@InterfaceC5670cr1 Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.Z);
        }

        public g(@InterfaceC5670cr1 Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC4051Qo1(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, @InterfaceC8568og int i, @InterfaceC4698Xf2 int i2) {
        super(C6597gd1.d(context, attributeSet, i, i2), attributeSet, i);
        int i3;
        int i4;
        C3759No1 c3759No1 = new C3759No1();
        this.a1 = c3759No1;
        Context context2 = getContext();
        int[] iArr = C7025iN1.o.a8;
        int i5 = C7025iN1.o.s8;
        int i6 = C7025iN1.o.q8;
        C2872Ep2 l = C7608kn2.l(context2, attributeSet, iArr, i, i2, i5, i6);
        C3368Jo1 c3368Jo1 = new C3368Jo1(context2, getClass(), getMaxItemCount(), i());
        this.Y0 = c3368Jo1;
        AbstractC3661Mo1 c2 = c(context2);
        this.Z0 = c2;
        c2.setMinimumHeight(getSuggestedMinimumHeight());
        c2.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        c3759No1.m(c2);
        c3759No1.b(1);
        c2.setPresenter(c3759No1);
        c3368Jo1.b(c3759No1);
        c3759No1.l(getContext(), c3368Jo1);
        int i7 = C7025iN1.o.m8;
        if (l.C(i7)) {
            c2.setIconTintList(l.d(i7));
        } else {
            c2.setIconTintList(c2.e(16842808));
        }
        setItemIconSize(l.g(C7025iN1.o.l8, getResources().getDimensionPixelSize(C7025iN1.f.mtrl_navigation_bar_item_default_icon_size)));
        if (l.C(i5)) {
            setItemTextAppearanceInactive(l.u(i5, 0));
        }
        if (l.C(i6)) {
            setItemTextAppearanceActive(l.u(i6, 0));
        }
        int i8 = C7025iN1.o.f8;
        if (l.C(i8)) {
            setHorizontalItemTextAppearanceInactive(l.u(i8, 0));
        }
        int i9 = C7025iN1.o.e8;
        if (l.C(i9)) {
            setHorizontalItemTextAppearanceActive(l.u(i9, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(l.a(C7025iN1.o.r8, true));
        int i10 = C7025iN1.o.t8;
        if (l.C(i10)) {
            setItemTextColor(l.d(i10));
        }
        Drawable background = getBackground();
        ColorStateList g2 = Z60.g(background);
        if (background == null || g2 != null) {
            C4394Uc1 c4394Uc1 = new C4394Uc1(O22.e(context2, attributeSet, i, i2).m());
            if (g2 != null) {
                c4394Uc1.y0(g2);
            }
            c4394Uc1.i0(context2);
            setBackground(c4394Uc1);
        }
        int i11 = C7025iN1.o.o8;
        if (l.C(i11)) {
            setItemPaddingTop(l.g(i11, 0));
        }
        int i12 = C7025iN1.o.n8;
        if (l.C(i12)) {
            setItemPaddingBottom(l.g(i12, 0));
        }
        int i13 = C7025iN1.o.b8;
        if (l.C(i13)) {
            setActiveIndicatorLabelPadding(l.g(i13, 0));
        }
        int i14 = C7025iN1.o.g8;
        if (l.C(i14)) {
            setIconLabelHorizontalSpacing(l.g(i14, 0));
        }
        if (l.C(C7025iN1.o.d8)) {
            setElevation(l.g(i3, 0));
        }
        getBackground().mutate().setTintList(C4297Tc1.b(context2, l, C7025iN1.o.c8));
        int i15 = -1;
        setLabelVisibilityMode(l.p(C7025iN1.o.w8, -1));
        setItemIconGravity(l.p(C7025iN1.o.k8, 0));
        setItemGravity(l.p(C7025iN1.o.j8, 49));
        int u = l.u(C7025iN1.o.i8, 0);
        if (u != 0) {
            c2.setItemBackgroundRes(u);
        } else {
            setItemRippleColor(C4297Tc1.b(context2, l, C7025iN1.o.p8));
        }
        setMeasureBottomPaddingFromLabelBaseline(l.a(C7025iN1.o.x8, true));
        setLabelFontScalingEnabled(l.a(C7025iN1.o.u8, false));
        setLabelMaxLines(l.p(C7025iN1.o.v8, 1));
        int u2 = l.u(C7025iN1.o.h8, 0);
        if (u2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(u2, C7025iN1.o.N7);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.P7, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.O7, 0));
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.Y7, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            int i16 = C7025iN1.o.X7;
            String string = obtainStyledAttributes.getString(i16);
            if (string != null) {
                if (!String.valueOf(-1).equals(string)) {
                    if (!String.valueOf(-2).equals(string)) {
                        i15 = obtainStyledAttributes.getDimensionPixelSize(i16, -2);
                    }
                }
                setItemActiveIndicatorExpandedWidth(i15);
                setItemActiveIndicatorExpandedHeight(obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.V7, dimensionPixelSize));
                setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.W7, dimensionPixelOffset));
                int dimensionPixelSize2 = getResources().getDimensionPixelSize(C7025iN1.f.m3_navigation_item_leading_trailing_space);
                int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.T7, dimensionPixelSize2);
                int dimensionPixelOffset3 = obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.S7, dimensionPixelSize2);
                if (getLayoutDirection() != 1) {
                    i4 = dimensionPixelOffset3;
                } else {
                    i4 = dimensionPixelOffset2;
                }
                k(i4, obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.U7, 0), getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2, obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.R7, 0));
                setItemActiveIndicatorColor(C4297Tc1.a(context2, obtainStyledAttributes, C7025iN1.o.Q7));
                setItemActiveIndicatorShapeAppearance(O22.b(context2, obtainStyledAttributes.getResourceId(C7025iN1.o.Z7, 0), 0).m());
                obtainStyledAttributes.recycle();
            }
            i15 = -2;
            setItemActiveIndicatorExpandedWidth(i15);
            setItemActiveIndicatorExpandedHeight(obtainStyledAttributes.getDimensionPixelSize(C7025iN1.o.V7, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.W7, dimensionPixelOffset));
            int dimensionPixelSize22 = getResources().getDimensionPixelSize(C7025iN1.f.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset22 = obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.T7, dimensionPixelSize22);
            int dimensionPixelOffset32 = obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.S7, dimensionPixelSize22);
            if (getLayoutDirection() != 1) {
            }
            k(i4, obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.U7, 0), getLayoutDirection() != 1 ? dimensionPixelOffset32 : dimensionPixelOffset22, obtainStyledAttributes.getDimensionPixelOffset(C7025iN1.o.R7, 0));
            setItemActiveIndicatorColor(C4297Tc1.a(context2, obtainStyledAttributes, C7025iN1.o.Q7));
            setItemActiveIndicatorShapeAppearance(O22.b(context2, obtainStyledAttributes.getResourceId(C7025iN1.o.Z7, 0), 0).m());
            obtainStyledAttributes.recycle();
        }
        int i17 = C7025iN1.o.y8;
        if (l.C(i17)) {
            g(l.u(i17, 0));
        }
        l.I();
        if (!m()) {
            addView(c2);
        }
        c3368Jo1.Y(new a());
    }

    private MenuInflater getMenuInflater() {
        if (this.b1 == null) {
            this.b1 = new C9796th2(getContext());
        }
        return this.b1;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.Z0.setMeasurePaddingFromLabelBaseline(z);
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public abstract AbstractC3661Mo1 c(@InterfaceC5670cr1 Context context);

    @InterfaceC11300zs1
    public C2555Bk d(int i) {
        return this.Z0.j(i);
    }

    public int e(int i) {
        return this.Z0.getLabelMaxLines();
    }

    @InterfaceC5670cr1
    public C2555Bk f(int i) {
        return this.Z0.k(i);
    }

    public void g(int i) {
        this.a1.n(true);
        getMenuInflater().inflate(i, this.Y0);
        this.a1.n(false);
        this.a1.i(true);
    }

    @PK1
    public int getActiveIndicatorLabelPadding() {
        return this.Z0.getActiveIndicatorLabelPadding();
    }

    @HT1({HT1.a.Y})
    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    @InterfaceC4698Xf2
    public int getHorizontalItemTextAppearanceActive() {
        return this.Z0.getHorizontalItemTextAppearanceActive();
    }

    @InterfaceC4698Xf2
    public int getHorizontalItemTextAppearanceInactive() {
        return this.Z0.getHorizontalItemTextAppearanceInactive();
    }

    @PK1
    public int getIconLabelHorizontalSpacing() {
        return this.Z0.getIconLabelHorizontalSpacing();
    }

    @InterfaceC11300zs1
    public ColorStateList getItemActiveIndicatorColor() {
        return this.Z0.getItemActiveIndicatorColor();
    }

    @PK1
    public int getItemActiveIndicatorExpandedHeight() {
        return this.Z0.getItemActiveIndicatorExpandedHeight();
    }

    @PK1
    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.Z0.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    @PK1
    public int getItemActiveIndicatorExpandedWidth() {
        return this.Z0.getItemActiveIndicatorExpandedWidth();
    }

    @PK1
    public int getItemActiveIndicatorHeight() {
        return this.Z0.getItemActiveIndicatorHeight();
    }

    @PK1
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.Z0.getItemActiveIndicatorMarginHorizontal();
    }

    @InterfaceC11300zs1
    public O22 getItemActiveIndicatorShapeAppearance() {
        return this.Z0.getItemActiveIndicatorShapeAppearance();
    }

    @PK1
    public int getItemActiveIndicatorWidth() {
        return this.Z0.getItemActiveIndicatorWidth();
    }

    @InterfaceC11300zs1
    public Drawable getItemBackground() {
        return this.Z0.getItemBackground();
    }

    @K60
    @Deprecated
    public int getItemBackgroundResource() {
        return this.Z0.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.Z0.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.Z0.getItemIconGravity();
    }

    @InterfaceC9397s30
    public int getItemIconSize() {
        return this.Z0.getItemIconSize();
    }

    @InterfaceC11300zs1
    public ColorStateList getItemIconTintList() {
        return this.Z0.getIconTintList();
    }

    @PK1
    public int getItemPaddingBottom() {
        return this.Z0.getItemPaddingBottom();
    }

    @PK1
    public int getItemPaddingTop() {
        return this.Z0.getItemPaddingTop();
    }

    @InterfaceC11300zs1
    public ColorStateList getItemRippleColor() {
        return this.Z0.getItemRippleColor();
    }

    @InterfaceC4698Xf2
    public int getItemTextAppearanceActive() {
        return this.Z0.getItemTextAppearanceActive();
    }

    @InterfaceC4698Xf2
    public int getItemTextAppearanceInactive() {
        return this.Z0.getItemTextAppearanceInactive();
    }

    @InterfaceC11300zs1
    public ColorStateList getItemTextColor() {
        return this.Z0.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.Z0.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @InterfaceC5670cr1
    public Menu getMenu() {
        return this.Y0;
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public androidx.appcompat.view.menu.k getMenuView() {
        return this.Z0;
    }

    @InterfaceC5670cr1
    public ViewGroup getMenuViewGroup() {
        return this.Z0;
    }

    @HT1({HT1.a.Y})
    @InterfaceC5670cr1
    public C3759No1 getPresenter() {
        return this.a1;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.Z0.getScaleLabelTextWithFont();
    }

    @PL0
    public int getSelectedItemId() {
        return this.Z0.getSelectedItemId();
    }

    public boolean h() {
        return this.Z0.getItemActiveIndicatorEnabled();
    }

    public boolean i() {
        return false;
    }

    public void j(int i) {
        this.Z0.r(i);
    }

    public void k(@PK1 int i, @PK1 int i2, @PK1 int i3, @PK1 int i4) {
        this.Z0.u(i, i2, i3, i4);
    }

    public void l(int i, @InterfaceC11300zs1 View.OnTouchListener onTouchListener) {
        this.Z0.v(i, onTouchListener);
    }

    @HT1({HT1.a.Y})
    public boolean m() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4491Vc1.e(this);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@InterfaceC11300zs1 Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        this.Y0.V(gVar.Z);
    }

    @Override // android.view.View
    @InterfaceC5670cr1
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        gVar.Z = bundle;
        this.Y0.X(bundle);
        return gVar;
    }

    public void setActiveIndicatorLabelPadding(@PK1 int i) {
        this.Z0.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C4491Vc1.d(this, f2);
    }

    public void setHorizontalItemTextAppearanceActive(@InterfaceC4698Xf2 int i) {
        this.Z0.setHorizontalItemTextAppearanceActive(i);
    }

    public void setHorizontalItemTextAppearanceInactive(@InterfaceC4698Xf2 int i) {
        this.Z0.setHorizontalItemTextAppearanceInactive(i);
    }

    public void setIconLabelHorizontalSpacing(@PK1 int i) {
        this.Z0.setIconLabelHorizontalSpacing(i);
    }

    public void setItemActiveIndicatorColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.Z0.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.Z0.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorExpandedHeight(@PK1 int i) {
        this.Z0.setItemActiveIndicatorExpandedHeight(i);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(@PK1 int i) {
        this.Z0.setItemActiveIndicatorExpandedMarginHorizontal(i);
    }

    public void setItemActiveIndicatorExpandedWidth(@PK1 int i) {
        this.Z0.setItemActiveIndicatorExpandedWidth(i);
    }

    public void setItemActiveIndicatorHeight(@PK1 int i) {
        this.Z0.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(@PK1 int i) {
        this.Z0.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@InterfaceC11300zs1 O22 o22) {
        this.Z0.setItemActiveIndicatorShapeAppearance(o22);
    }

    public void setItemActiveIndicatorWidth(@PK1 int i) {
        this.Z0.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@InterfaceC11300zs1 Drawable drawable) {
        this.Z0.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@K60 int i) {
        this.Z0.setItemBackgroundRes(i);
    }

    public void setItemGravity(int i) {
        if (this.Z0.getItemGravity() != i) {
            this.Z0.setItemGravity(i);
            this.a1.i(false);
        }
    }

    public void setItemIconGravity(int i) {
        if (this.Z0.getItemIconGravity() != i) {
            this.Z0.setItemIconGravity(i);
            this.a1.i(false);
        }
    }

    public void setItemIconSize(@InterfaceC9397s30 int i) {
        this.Z0.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@InterfaceC9154r30 int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.Z0.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(@PK1 int i) {
        this.Z0.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(@PK1 int i) {
        this.Z0.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.Z0.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@InterfaceC4698Xf2 int i) {
        this.Z0.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.Z0.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(@InterfaceC4698Xf2 int i) {
        this.Z0.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.Z0.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.Z0.setLabelFontScalingEnabled(z);
    }

    public void setLabelMaxLines(int i) {
        this.Z0.setLabelMaxLines(i);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.Z0.getLabelVisibilityMode() != i) {
            this.Z0.setLabelVisibilityMode(i);
            this.a1.i(false);
        }
    }

    public void setOnItemReselectedListener(@InterfaceC11300zs1 e eVar) {
        this.d1 = eVar;
    }

    public void setOnItemSelectedListener(@InterfaceC11300zs1 f fVar) {
        this.c1 = fVar;
    }

    public void setSelectedItemId(@PL0 int i) {
        MenuItem findItem = this.Y0.findItem(i);
        if (findItem != null) {
            boolean Q = this.Y0.Q(findItem, this.a1, 0);
            if (findItem.isCheckable()) {
                if (!Q || findItem.isChecked()) {
                    this.Z0.setCheckedItem(findItem);
                }
            }
        }
    }

    /* renamed from: o.Qo1$a */
    /* loaded from: classes3.dex */
    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, @InterfaceC5670cr1 MenuItem menuItem) {
            if (AbstractC4051Qo1.this.d1 != null && menuItem.getItemId() == AbstractC4051Qo1.this.getSelectedItemId()) {
                AbstractC4051Qo1.this.d1.a(menuItem);
                return true;
            } else if (AbstractC4051Qo1.this.c1 != null && !AbstractC4051Qo1.this.c1.a(menuItem)) {
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }
}
