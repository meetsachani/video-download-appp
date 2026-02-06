package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class FN2 extends Drawable.ConstantState {
    public int a;
    public Drawable.ConstantState b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    public FN2(FN2 fn2) {
        this.c = null;
        this.d = DN2.b1;
        if (fn2 != null) {
            this.a = fn2.a;
            this.b = fn2.b;
            this.c = fn2.c;
            this.d = fn2.d;
        }
    }

    public boolean a() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i;
        int i2 = this.a;
        Drawable.ConstantState constantState = this.b;
        if (constantState != null) {
            i = constantState.getChangingConfigurations();
        } else {
            i = 0;
        }
        return i2 | i;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new EN2(this, resources);
    }
}
