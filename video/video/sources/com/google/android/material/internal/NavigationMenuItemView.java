package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.d;
import o.C10231vT1;
import o.C10861y4;
import o.C4930Zm2;
import o.C6516gH2;
import o.C7025iN1;
import o.C9097qq2;
import o.C9130qx0;
import o.D60;
import o.HT1;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC9397s30;
import o.OL1;
import o.Q3;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class NavigationMenuItemView extends C9130qx0 implements k.a {
    public static final int[] Q1 = {16842912};
    public int F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public final CheckedTextView J1;
    public FrameLayout K1;
    public h L1;
    public ColorStateList M1;
    public boolean N1;
    public Drawable O1;
    public final Q3 P1;

    /* loaded from: classes3.dex */
    public class a extends Q3 {
        public a() {
        }

        @Override // o.Q3
        public void g(View view, @InterfaceC5670cr1 C10861y4 c10861y4) {
            super.g(view, c10861y4);
            c10861y4.i1(NavigationMenuItemView.this.H1);
        }
    }

    public NavigationMenuItemView(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    private void setActionView(@InterfaceC11300zs1 View view) {
        if (view != null) {
            if (this.K1 == null) {
                this.K1 = (FrameLayout) ((ViewStub) findViewById(C7025iN1.h.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.K1.removeAllViews();
            this.K1.addView(view);
        }
    }

    public final void F() {
        if (J()) {
            this.J1.setVisibility(8);
            FrameLayout frameLayout = this.K1;
            if (frameLayout != null) {
                d.b bVar = (d.b) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) bVar).width = -1;
                this.K1.setLayoutParams(bVar);
                return;
            }
            return;
        }
        this.J1.setVisibility(0);
        FrameLayout frameLayout2 = this.K1;
        if (frameLayout2 != null) {
            d.b bVar2 = (d.b) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) bVar2).width = -2;
            this.K1.setLayoutParams(bVar2);
        }
    }

    @InterfaceC11300zs1
    public final StateListDrawable G() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(OL1.b.G0, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(Q1, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    public void H(@InterfaceC5670cr1 h hVar, boolean z) {
        this.I1 = z;
        g(hVar, 0);
    }

    public void I() {
        FrameLayout frameLayout = this.K1;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.J1.setCompoundDrawables(null, null, null, null);
    }

    public final boolean J() {
        if (this.L1.getTitle() == null && this.L1.getIcon() == null && this.L1.getActionView() != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(boolean z, char c) {
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void g(@InterfaceC5670cr1 h hVar, int i) {
        int i2;
        this.L1 = hVar;
        if (hVar.getItemId() > 0) {
            setId(hVar.getItemId());
        }
        if (hVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            setBackground(G());
        }
        setCheckable(hVar.isCheckable());
        setChecked(hVar.isChecked());
        setEnabled(hVar.isEnabled());
        setTitle(hVar.getTitle());
        setIcon(hVar.getIcon());
        setActionView(hVar.getActionView());
        setContentDescription(hVar.getContentDescription());
        C9097qq2.a(this, hVar.getTooltipText());
        F();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.L1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        h hVar = this.L1;
        if (hVar != null && hVar.isCheckable() && this.L1.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, Q1);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean r() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean s() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.H1 != z) {
            this.H1 = z;
            this.P1.l(this.J1, 2048);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setChecked(boolean z) {
        int i;
        refreshDrawableState();
        this.J1.setChecked(z);
        CheckedTextView checkedTextView = this.J1;
        Typeface typeface = checkedTextView.getTypeface();
        if (z && this.I1) {
            i = 1;
        } else {
            i = 0;
        }
        checkedTextView.setTypeface(typeface, i);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setIcon(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable != null) {
            if (this.N1) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = D60.r(drawable).mutate();
                drawable.setTintList(this.M1);
            }
            int i = this.F1;
            drawable.setBounds(0, 0, i, i);
        } else if (this.G1) {
            if (this.O1 == null) {
                Drawable g = C10231vT1.g(getResources(), C7025iN1.g.navigation_empty_icon, getContext().getTheme());
                this.O1 = g;
                if (g != null) {
                    int i2 = this.F1;
                    g.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.O1;
        }
        this.J1.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.J1.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@InterfaceC9397s30 int i) {
        this.F1 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.M1 = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.N1 = z;
        h hVar = this.L1;
        if (hVar != null) {
            setIcon(hVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.J1.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.G1 = z;
    }

    public void setTextAppearance(int i) {
        C4930Zm2.D(this.J1, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.J1.setTextColor(colorStateList);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setTitle(CharSequence charSequence) {
        this.J1.setText(charSequence);
    }

    public NavigationMenuItemView(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.I1 = true;
        a aVar = new a();
        this.P1 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C7025iN1.k.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C7025iN1.f.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C7025iN1.h.design_menu_item_text);
        this.J1 = checkedTextView;
        C6516gH2.I1(checkedTextView, aVar);
    }
}
