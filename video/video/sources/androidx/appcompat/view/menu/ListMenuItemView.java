package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import o.C2872Ep2;
import o.OL1;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    public static final String p1 = "ListMenuItemView";
    public h Y0;
    public ImageView Z0;
    public RadioButton a1;
    public TextView b1;
    public CheckBox c1;
    public TextView d1;
    public ImageView e1;
    public ImageView f1;
    public LinearLayout g1;
    public Drawable h1;
    public int i1;
    public Context j1;
    public boolean k1;
    public Drawable l1;
    public boolean m1;
    public LayoutInflater n1;
    public boolean o1;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, OL1.b.Y1);
    }

    private LayoutInflater getInflater() {
        if (this.n1 == null) {
            this.n1 = LayoutInflater.from(getContext());
        }
        return this.n1;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.e1;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1.getLayoutParams();
            rect.top += this.f1.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public final void b(View view) {
        c(view, -1);
    }

    public final void c(View view, int i) {
        LinearLayout linearLayout = this.g1;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(boolean z, char c) {
        int i;
        if (z && this.Y0.D()) {
            i = 0;
        } else {
            i = 8;
        }
        if (i == 0) {
            this.d1.setText(this.Y0.k());
        }
        if (this.d1.getVisibility() != i) {
            this.d1.setVisibility(i);
        }
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(OL1.j.f569o, (ViewGroup) this, false);
        this.c1 = checkBox;
        b(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(OL1.j.p, (ViewGroup) this, false);
        this.Z0 = imageView;
        c(imageView, 0);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void g(h hVar, int i) {
        int i2;
        this.Y0 = hVar;
        if (hVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(hVar.l(this));
        setCheckable(hVar.isCheckable());
        d(hVar.D(), hVar.j());
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.Y0;
    }

    public final void h() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(OL1.j.r, (ViewGroup) this, false);
        this.a1 = radioButton;
        b(radioButton);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.h1);
        TextView textView = (TextView) findViewById(OL1.g.s0);
        this.b1 = textView;
        int i = this.i1;
        if (i != -1) {
            textView.setTextAppearance(this.j1, i);
        }
        this.d1 = (TextView) findViewById(OL1.g.h0);
        ImageView imageView = (ImageView) findViewById(OL1.g.n0);
        this.e1 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.l1);
        }
        this.f1 = (ImageView) findViewById(OL1.g.C);
        this.g1 = (LinearLayout) findViewById(OL1.g.t);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.Z0 != null && this.k1) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.Z0.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean r() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean s() {
        return this.o1;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (z || this.a1 != null || this.c1 != null) {
            if (this.Y0.p()) {
                if (this.a1 == null) {
                    h();
                }
                compoundButton = this.a1;
                view = this.c1;
            } else {
                if (this.c1 == null) {
                    e();
                }
                compoundButton = this.c1;
                view = this.a1;
            }
            if (z) {
                compoundButton.setChecked(this.Y0.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.c1;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.a1;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.Y0.p()) {
            if (this.a1 == null) {
                h();
            }
            compoundButton = this.a1;
        } else {
            if (this.c1 == null) {
                e();
            }
            compoundButton = this.c1;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.o1 = z;
        this.k1 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f1;
        if (imageView != null) {
            if (!this.m1 && z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setIcon(Drawable drawable) {
        boolean z;
        if (!this.Y0.C() && !this.o1) {
            z = false;
        } else {
            z = true;
        }
        if (z || this.k1) {
            ImageView imageView = this.Z0;
            if (imageView != null || drawable != null || this.k1) {
                if (imageView == null) {
                    f();
                }
                if (drawable == null && !this.k1) {
                    this.Z0.setVisibility(8);
                    return;
                }
                ImageView imageView2 = this.Z0;
                if (!z) {
                    drawable = null;
                }
                imageView2.setImageDrawable(drawable);
                if (this.Z0.getVisibility() != 0) {
                    this.Z0.setVisibility(0);
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.b1.setText(charSequence);
            if (this.b1.getVisibility() != 0) {
                this.b1.setVisibility(0);
            }
        } else if (this.b1.getVisibility() != 8) {
            this.b1.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C2872Ep2 G = C2872Ep2.G(getContext(), attributeSet, OL1.m.I4, i, 0);
        this.h1 = G.h(OL1.m.O4);
        this.i1 = G.u(OL1.m.K4, -1);
        this.k1 = G.a(OL1.m.Q4, false);
        this.j1 = context;
        this.l1 = G.h(OL1.m.R4);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, OL1.b.p1, 0);
        this.m1 = obtainStyledAttributes.hasValue(0);
        G.I();
        obtainStyledAttributes.recycle();
    }
}
