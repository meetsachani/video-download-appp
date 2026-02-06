package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import o.C7025iN1;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC3329Je2;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;
import o.InterfaceC8494oM;
import o.InterfaceC9397s30;
import o.JF;

/* loaded from: classes3.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] V;
    public static final int[] W;
    @InterfaceC11300zs1
    public final AccessibilityManager S;
    public boolean T;
    @InterfaceC11300zs1
    public BaseTransientBottomBar.s<Snackbar> U;

    @HT1({HT1.a.Y})
    /* loaded from: classes3.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.w {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@InterfaceC11300zs1 Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@InterfaceC11300zs1 Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.w, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@InterfaceC11300zs1 View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes3.dex */
    public static class a extends BaseTransientBottomBar.s<Snackbar> {
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;
        public static final int j = 4;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* renamed from: c */
        public void a(Snackbar snackbar, int i2) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* renamed from: d */
        public void b(Snackbar snackbar) {
        }
    }

    static {
        int i = C7025iN1.c.snackbarButtonStyle;
        V = new int[]{i};
        W = new int[]{i, C7025iN1.c.snackbarTextViewStyle};
    }

    public Snackbar(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 ViewGroup viewGroup, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 InterfaceC8494oM interfaceC8494oM) {
        super(context, viewGroup, view, interfaceC8494oM);
        this.S = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    @InterfaceC5670cr1
    public static Snackbar A0(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 CharSequence charSequence, int i) {
        return D0(context, view, charSequence, i);
    }

    @InterfaceC5670cr1
    public static Snackbar B0(@InterfaceC5670cr1 View view, @InterfaceC3329Je2 int i, int i2) {
        return C0(view, view.getResources().getText(i), i2);
    }

    @InterfaceC5670cr1
    public static Snackbar C0(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 CharSequence charSequence, int i) {
        return D0(null, view, charSequence, i);
    }

    @InterfaceC5670cr1
    public static Snackbar D0(@InterfaceC11300zs1 Context context, @InterfaceC5670cr1 View view, @InterfaceC5670cr1 CharSequence charSequence, int i) {
        int i2;
        ViewGroup u0 = u0(view);
        if (u0 != null) {
            if (context == null) {
                context = u0.getContext();
            }
            LayoutInflater from = LayoutInflater.from(context);
            if (z0(context)) {
                i2 = C7025iN1.k.mtrl_layout_snackbar_include;
            } else {
                i2 = C7025iN1.k.design_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, u0, false);
            Snackbar snackbar = new Snackbar(context, u0, snackbarContentLayout, snackbarContentLayout);
            snackbar.O0(charSequence);
            snackbar.g0(i);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public static /* synthetic */ void t0(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.getClass();
        onClickListener.onClick(view);
        snackbar.A(1);
    }

    @InterfaceC11300zs1
    public static ViewGroup u0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @Deprecated
    public static boolean y0(@InterfaceC5670cr1 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(V);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            return false;
        }
        return true;
    }

    public static boolean z0(@InterfaceC5670cr1 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(W);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1 || resourceId2 == -1) {
            return false;
        }
        return true;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar E0(@InterfaceC3329Je2 int i, View.OnClickListener onClickListener) {
        return F0(F().getText(i), onClickListener);
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar F0(@InterfaceC11300zs1 CharSequence charSequence, @InterfaceC11300zs1 final View.OnClickListener onClickListener) {
        Button v0 = v0();
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.T = true;
            v0.setVisibility(0);
            v0.setText(charSequence);
            v0.setOnClickListener(new View.OnClickListener() { // from class: o.y92
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Snackbar.t0(Snackbar.this, onClickListener, view);
                }
            });
            return this;
        }
        v0.setVisibility(8);
        v0.setOnClickListener(null);
        this.T = false;
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int G() {
        int i;
        int recommendedTimeoutMillis;
        int G = super.G();
        if (G == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (this.T) {
                i = 4;
            } else {
                i = 0;
            }
            recommendedTimeoutMillis = this.S.getRecommendedTimeoutMillis(G, i | 3);
            return recommendedTimeoutMillis;
        } else if (this.T && this.S.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return G;
        }
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar G0(@JF int i) {
        v0().setTextColor(i);
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar H0(ColorStateList colorStateList) {
        v0().setTextColor(colorStateList);
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar I0(@JF int i) {
        return J0(ColorStateList.valueOf(i));
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar J0(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.i.setBackgroundTintList(colorStateList);
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar K0(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        this.i.setBackgroundTintMode(mode);
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    @Deprecated
    public Snackbar L0(@InterfaceC11300zs1 a aVar) {
        BaseTransientBottomBar.s<Snackbar> sVar = this.U;
        if (sVar != null) {
            a0(sVar);
        }
        if (aVar != null) {
            t(aVar);
        }
        this.U = aVar;
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar M0(@InterfaceC9397s30 int i) {
        w0().setMaxInlineActionWidth(i);
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar N0(@InterfaceC3329Je2 int i) {
        return O0(F().getText(i));
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar O0(@InterfaceC5670cr1 CharSequence charSequence) {
        x0().setText(charSequence);
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar P0(@JF int i) {
        x0().setTextColor(i);
        return this;
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar Q0(ColorStateList colorStateList) {
        x0().setTextColor(colorStateList);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean R() {
        return super.R();
    }

    @InterfaceC6181ey
    @InterfaceC5670cr1
    public Snackbar R0(int i) {
        x0().setMaxLines(i);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void l0() {
        super.l0();
    }

    public final Button v0() {
        return w0().getActionView();
    }

    public final SnackbarContentLayout w0() {
        return (SnackbarContentLayout) this.i.getChildAt(0);
    }

    public final TextView x0() {
        return w0().getMessageView();
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void z() {
        super.z();
    }
}
