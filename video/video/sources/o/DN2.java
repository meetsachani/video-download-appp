package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class DN2 extends Drawable implements Drawable.Callback, CN2, InterfaceC2480Ap2 {
    public static final PorterDuff.Mode b1 = PorterDuff.Mode.SRC_IN;
    public int X;
    public PorterDuff.Mode Y;
    public FN2 Y0;
    public boolean Z;
    public boolean Z0;
    public Drawable a1;

    public DN2(FN2 fn2, Resources resources) {
        this.Y0 = fn2;
        e(resources);
    }

    @Override // o.CN2
    public final Drawable a() {
        return this.a1;
    }

    @Override // o.CN2
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.a1;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a1 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            FN2 fn2 = this.Y0;
            if (fn2 != null) {
                fn2.b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public boolean c() {
        return true;
    }

    public final FN2 d() {
        return new FN2(this.Y0);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.a1.draw(canvas);
    }

    public final void e(Resources resources) {
        Drawable.ConstantState constantState;
        FN2 fn2 = this.Y0;
        if (fn2 != null && (constantState = fn2.b) != null) {
            b(constantState.newDrawable(resources));
        }
    }

    public final boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        FN2 fn2 = this.Y0;
        ColorStateList colorStateList = fn2.c;
        PorterDuff.Mode mode = fn2.d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.Z || colorForState != this.X || mode != this.Y) {
                setColorFilter(colorForState, mode);
                this.X = colorForState;
                this.Y = mode;
                this.Z = true;
                return true;
            }
        } else {
            this.Z = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        FN2 fn2 = this.Y0;
        if (fn2 != null) {
            i = fn2.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.a1.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        FN2 fn2 = this.Y0;
        if (fn2 != null && fn2.a()) {
            this.Y0.a = getChangingConfigurations();
            return this.Y0;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.a1.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a1.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a1.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return D60.f(this.a1);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.a1.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.a1.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.a1.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.a1.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.a1.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.a1.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return D60.h(this.a1);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        FN2 fn2;
        if (c() && (fn2 = this.Y0) != null) {
            colorStateList = fn2.c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.a1.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.a1.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.Z0 && super.mutate() == this) {
            this.Y0 = d();
            Drawable drawable = this.a1;
            if (drawable != null) {
                drawable.mutate();
            }
            FN2 fn2 = this.Y0;
            if (fn2 != null) {
                Drawable drawable2 = this.a1;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                fn2.b = constantState;
            }
            this.Z0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.a1;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return D60.m(this.a1, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.a1.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.a1.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        D60.j(this.a1, z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.a1.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a1.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.a1.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.a1.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        boolean state = this.a1.setState(iArr);
        if (!f(iArr) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintList(ColorStateList colorStateList) {
        this.Y0.c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintMode(PorterDuff.Mode mode) {
        this.Y0.d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (!super.setVisible(z, z2) && !this.a1.setVisible(z, z2)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public DN2(Drawable drawable) {
        this.Y0 = d();
        b(drawable);
    }
}
