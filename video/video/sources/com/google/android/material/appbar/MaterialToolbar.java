package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import o.C4394Uc1;
import o.C4491Vc1;
import o.C6597gd1;
import o.C7025iN1;
import o.C7608kn2;
import o.C8854pq2;
import o.D60;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.JF;
import o.OL1;
import o.Z60;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {
    public static final int Y1 = C7025iN1.n.Widget_MaterialComponents_Toolbar;
    public static final ImageView.ScaleType[] Z1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    @InterfaceC11300zs1
    public Integer T1;
    public boolean U1;
    public boolean V1;
    @InterfaceC11300zs1
    public ImageView.ScaleType W1;
    @InterfaceC11300zs1
    public Boolean X1;

    public MaterialToolbar(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    public final Pair<Integer, Integer> Z(@InterfaceC11300zs1 TextView textView, @InterfaceC11300zs1 TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public void b0() {
        this.T1 = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            D60.r(navigationIcon.mutate()).setTintList(null);
            setNavigationIcon(navigationIcon);
        }
    }

    public final void c0(Context context) {
        ColorStateList g;
        Drawable background = getBackground();
        if (background == null) {
            g = ColorStateList.valueOf(0);
        } else {
            g = Z60.g(background);
        }
        if (g != null) {
            C4394Uc1 c4394Uc1 = new C4394Uc1();
            c4394Uc1.y0(g);
            c4394Uc1.i0(context);
            c4394Uc1.x0(getElevation());
            setBackground(c4394Uc1);
        }
    }

    public boolean d0() {
        Boolean bool = this.X1;
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public boolean e0() {
        return this.V1;
    }

    public boolean f0() {
        return this.U1;
    }

    public final void g0(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @InterfaceC11300zs1
    public ImageView.ScaleType getLogoScaleType() {
        return this.W1;
    }

    @InterfaceC11300zs1
    @JF
    public Integer getNavigationIconTint() {
        return this.T1;
    }

    public final void h0() {
        if (this.U1 || this.V1) {
            TextView i = C8854pq2.i(this);
            TextView g = C8854pq2.g(this);
            if (i != null || g != null) {
                Pair<Integer, Integer> Z = Z(i, g);
                if (this.U1 && i != null) {
                    g0(i, Z);
                }
                if (this.V1 && g != null) {
                    g0(g, Z);
                }
            }
        }
    }

    @InterfaceC11300zs1
    public final Drawable i0(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable != null && this.T1 != null) {
            Drawable r = D60.r(drawable.mutate());
            r.setTint(this.T1.intValue());
            return r;
        }
        return drawable;
    }

    public final void j0() {
        ImageView d = C8854pq2.d(this);
        if (d != null) {
            Boolean bool = this.X1;
            if (bool != null) {
                d.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.W1;
            if (scaleType != null) {
                d.setScaleType(scaleType);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4491Vc1.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h0();
        j0();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C4491Vc1.d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.X1;
        if (bool != null && bool.booleanValue() == z) {
            return;
        }
        this.X1 = Boolean.valueOf(z);
        requestLayout();
    }

    public void setLogoScaleType(@InterfaceC5670cr1 ImageView.ScaleType scaleType) {
        if (this.W1 != scaleType) {
            this.W1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@InterfaceC11300zs1 Drawable drawable) {
        super.setNavigationIcon(i0(drawable));
    }

    public void setNavigationIconTint(@JF int i) {
        this.T1 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.V1 != z) {
            this.V1 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.U1 != z) {
            this.U1 = z;
            requestLayout();
        }
    }

    public MaterialToolbar(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.U3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialToolbar(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(C6597gd1.d(context, attributeSet, i, r4), attributeSet, i);
        int i2 = Y1;
        Context context2 = getContext();
        TypedArray k = C7608kn2.k(context2, attributeSet, C7025iN1.o.H7, i, i2, new int[0]);
        int i3 = C7025iN1.o.K7;
        if (k.hasValue(i3)) {
            setNavigationIconTint(k.getColor(i3, -1));
        }
        this.U1 = k.getBoolean(C7025iN1.o.M7, false);
        this.V1 = k.getBoolean(C7025iN1.o.L7, false);
        int i4 = k.getInt(C7025iN1.o.J7, -1);
        if (i4 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = Z1;
            if (i4 < scaleTypeArr.length) {
                this.W1 = scaleTypeArr[i4];
            }
        }
        int i5 = C7025iN1.o.I7;
        if (k.hasValue(i5)) {
            this.X1 = Boolean.valueOf(k.getBoolean(i5, false));
        }
        k.recycle();
        c0(context2);
    }
}
