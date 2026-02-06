package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o.OL1;
import o.P4;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean Y0;
    public View Z0;
    public View a1;
    public View b1;
    public Drawable c1;
    public Drawable d1;
    public Drawable e1;
    public boolean f1;
    public boolean g1;
    public int h1;

    /* loaded from: classes.dex */
    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.c1;
        if (drawable != null && drawable.isStateful()) {
            this.c1.setState(getDrawableState());
        }
        Drawable drawable2 = this.d1;
        if (drawable2 != null && drawable2.isStateful()) {
            this.d1.setState(getDrawableState());
        }
        Drawable drawable3 = this.e1;
        if (drawable3 != null && drawable3.isStateful()) {
            this.e1.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.Z0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.c1;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.d1;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.e1;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a1 = findViewById(OL1.g.a);
        this.b1 = findViewById(OL1.g.h);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.Y0 && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.Z0;
        boolean z3 = true;
        boolean z4 = false;
        if (view != null && view.getVisibility() != 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f1) {
            Drawable drawable2 = this.e1;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z3 = z4;
        } else {
            if (this.c1 != null) {
                if (this.a1.getVisibility() == 0) {
                    this.c1.setBounds(this.a1.getLeft(), this.a1.getTop(), this.a1.getRight(), this.a1.getBottom());
                } else {
                    View view2 = this.b1;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.c1.setBounds(this.b1.getLeft(), this.b1.getTop(), this.b1.getRight(), this.b1.getBottom());
                    } else {
                        this.c1.setBounds(0, 0, 0, 0);
                    }
                }
                z4 = true;
            }
            this.g1 = z2;
            if (z2 && (drawable = this.d1) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z3 = z4;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.a1 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i5 = this.h1) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.a1 != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.Z0;
            if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
                if (!b(this.a1)) {
                    i3 = a(this.a1);
                } else if (!b(this.b1)) {
                    i3 = a(this.b1);
                } else {
                    i3 = 0;
                }
                if (mode == Integer.MIN_VALUE) {
                    i4 = View.MeasureSpec.getSize(i2);
                } else {
                    i4 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i3 + a(this.Z0), i4));
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.c1;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.c1);
        }
        this.c1 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.a1;
            if (view != null) {
                this.c1.setBounds(view.getLeft(), this.a1.getTop(), this.a1.getRight(), this.a1.getBottom());
            }
        }
        boolean z = false;
        if (!this.f1 ? !(this.c1 != null || this.d1 != null) : this.e1 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.e1;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.e1);
        }
        this.e1 = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1 && (drawable2 = this.e1) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f1 ? !(this.c1 != null || this.d1 != null) : this.e1 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.d1;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.d1);
        }
        this.d1 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.g1 && (drawable2 = this.d1) != null) {
                drawable2.setBounds(this.Z0.getLeft(), this.Z0.getTop(), this.Z0.getRight(), this.Z0.getBottom());
            }
        }
        boolean z = false;
        if (!this.f1 ? !(this.c1 != null || this.d1 != null) : this.e1 == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(e eVar) {
        View view = this.Z0;
        if (view != null) {
            removeView(view);
        }
        this.Z0 = eVar;
        if (eVar != null) {
            addView(eVar);
            ViewGroup.LayoutParams layoutParams = eVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            eVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.Y0 = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.c1;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.d1;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.e1;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.c1 || this.f1) {
            if (drawable != this.d1 || !this.g1) {
                if ((drawable == this.e1 && this.f1) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new P4(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OL1.m.a);
        this.c1 = obtainStyledAttributes.getDrawable(OL1.m.b);
        this.d1 = obtainStyledAttributes.getDrawable(OL1.m.d);
        this.h1 = obtainStyledAttributes.getDimensionPixelSize(OL1.m.f572o, -1);
        boolean z = true;
        if (getId() == OL1.g.j0) {
            this.f1 = true;
            this.e1 = obtainStyledAttributes.getDrawable(OL1.m.c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1 ? this.c1 != null || this.d1 != null : this.e1 != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
