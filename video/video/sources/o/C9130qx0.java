package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import o.C7025iN1;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.qx0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9130qx0 extends androidx.appcompat.widget.d {
    public final Rect A1;
    public final Rect B1;
    public int C1;
    public boolean D1;
    public boolean E1;
    @InterfaceC11300zs1
    public Drawable z1;

    public C9130qx0(@InterfaceC5670cr1 Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.z1;
        if (drawable != null) {
            if (this.E1) {
                this.E1 = false;
                Rect rect = this.A1;
                Rect rect2 = this.B1;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.D1) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.C1, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.z1;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.z1;
        if (drawable != null && drawable.isStateful()) {
            this.z1.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    @InterfaceC11300zs1
    public Drawable getForeground() {
        return this.z1;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.C1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.z1;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.d, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.E1 = z | this.E1;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.E1 = true;
    }

    @Override // android.view.View
    public void setForeground(@InterfaceC11300zs1 Drawable drawable) {
        Drawable drawable2 = this.z1;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.z1);
            }
            this.z1 = drawable;
            this.E1 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.C1 == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.C1 != i) {
            if ((8388615 & i) == 0) {
                i |= JE0.b;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.C1 = i;
            if (i == 119 && this.z1 != null) {
                this.z1.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.z1) {
            return false;
        }
        return true;
    }

    public C9130qx0(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9130qx0(@InterfaceC5670cr1 Context context, @InterfaceC11300zs1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A1 = new Rect();
        this.B1 = new Rect();
        this.C1 = 119;
        this.D1 = true;
        this.E1 = false;
        TypedArray k = C7608kn2.k(context, attributeSet, C7025iN1.o.m4, i, 0, new int[0]);
        this.C1 = k.getInt(C7025iN1.o.o4, this.C1);
        Drawable drawable = k.getDrawable(C7025iN1.o.n4);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.D1 = k.getBoolean(C7025iN1.o.p4, true);
        k.recycle();
    }
}
