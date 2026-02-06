package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class EN2 extends DN2 {
    public static final String c1 = "WrappedDrawableApi21";
    public static Method d1;

    public EN2(Drawable drawable) {
        super(drawable);
        g();
    }

    @Override // o.DN2
    public boolean c() {
        return false;
    }

    public final void g() {
        if (d1 == null) {
            try {
                d1 = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e) {
                Log.w(c1, "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.a1.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.a1.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.a1;
        if (drawable != null && (method = d1) != null) {
            try {
                return ((Boolean) method.invoke(drawable, null)).booleanValue();
            } catch (Exception e) {
                Log.w(c1, "Error calling Drawable#isProjected() method", e);
                return false;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.a1.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.a1.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // o.DN2, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (super.setState(iArr)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // o.DN2, android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTint(int i) {
        if (c()) {
            super.setTint(i);
        } else {
            this.a1.setTint(i);
        }
    }

    @Override // o.DN2, android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.a1.setTintList(colorStateList);
        }
    }

    @Override // o.DN2, android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.a1.setTintMode(mode);
        }
    }

    public EN2(FN2 fn2, Resources resources) {
        super(fn2, resources);
        g();
    }
}
