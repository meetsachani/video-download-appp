package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import o.AbstractView$OnTouchListenerC8397ny0;
import o.C9097qq2;
import o.OL1;
import o.T52;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {
    public static final String q1 = "ActionMenuItemView";
    public static final int r1 = 32;
    public h f1;
    public CharSequence g1;
    public Drawable h1;
    public e.b i1;
    public AbstractView$OnTouchListenerC8397ny0 j1;
    public b k1;
    public boolean l1;
    public boolean m1;
    public int n1;
    public int o1;
    public int p1;

    /* loaded from: classes.dex */
    public class a extends AbstractView$OnTouchListenerC8397ny0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // o.AbstractView$OnTouchListenerC8397ny0
        public T52 b() {
            b bVar = ActionMenuItemView.this.k1;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // o.AbstractView$OnTouchListenerC8397ny0
        public boolean c() {
            T52 b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.i1;
            if (bVar == null || !bVar.b(actionMenuItemView.f1) || (b = b()) == null || !b.b()) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract T52 a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public boolean H() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean I() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480) {
            if ((i < 640 || i2 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void J() {
        CharSequence charSequence;
        CharSequence title;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.g1);
        if (this.h1 != null && (!this.f1.E() || (!this.l1 && !this.m1))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        if (z3) {
            charSequence = this.g1;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f1.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                title = null;
            } else {
                title = this.f1.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f1.getTitle();
            }
            C9097qq2.a(this, charSequence2);
            return;
        }
        C9097qq2.a(this, tooltipText);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return H();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(boolean z, char c) {
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean f() {
        if (H() && this.f1.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void g(h hVar, int i) {
        int i2;
        this.f1 = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.l(this));
        setId(hVar.getItemId());
        if (hVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.j1 == null) {
            this.j1 = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public h getItemData() {
        return this.f1;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.i1;
        if (bVar != null) {
            bVar.b(this.f1);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l1 = I();
        J();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean H = H();
        if (H && (i4 = this.o1) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.n1);
        } else {
            i3 = this.n1;
        }
        if (mode != 1073741824 && this.n1 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!H && this.h1 != null) {
            super.setPadding((getMeasuredWidth() - this.h1.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC8397ny0 abstractView$OnTouchListenerC8397ny0;
        if (this.f1.hasSubMenu() && (abstractView$OnTouchListenerC8397ny0 = this.j1) != null && abstractView$OnTouchListenerC8397ny0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean r() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean s() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setCheckable(boolean z) {
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.m1 != z) {
            this.m1 = z;
            h hVar = this.f1;
            if (hVar != null) {
                hVar.e();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setIcon(Drawable drawable) {
        this.h1 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.p1;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        J();
    }

    public void setItemInvoker(e.b bVar) {
        this.i1 = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.o1 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.k1 = bVar;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void setTitle(CharSequence charSequence) {
        this.g1 = charSequence;
        J();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.l1 = I();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OL1.m.G, i, 0);
        this.n1 = obtainStyledAttributes.getDimensionPixelSize(OL1.m.H, 0);
        obtainStyledAttributes.recycle();
        this.p1 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.o1 = -1;
        setSaveEnabled(false);
    }
}
