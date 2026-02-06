package o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class WX1 extends C5249b70 {
    public a Y;
    public boolean Z;

    public WX1(@InterfaceC5670cr1 Drawable drawable, int i, int i2) {
        super(drawable);
        this.Y = new a(c(drawable), i, i2);
    }

    @Override // o.C5249b70
    public void b(@InterfaceC11300zs1 Drawable drawable) {
        super.b(drawable);
        a aVar = this.Y;
        if (aVar != null) {
            aVar.a = c(drawable);
            this.Z = false;
        }
    }

    @InterfaceC11300zs1
    public final Drawable.ConstantState c(@InterfaceC11300zs1 Drawable drawable) {
        if (drawable != null) {
            return drawable.getConstantState();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC11300zs1
    public Drawable.ConstantState getConstantState() {
        if (this.Y.d()) {
            return this.Y;
        }
        return null;
    }

    @Override // o.C5249b70, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.Y.c;
    }

    @Override // o.C5249b70, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.Y.b;
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC5670cr1
    public Drawable mutate() {
        if (!this.Z && super.mutate() == this) {
            Drawable a2 = a();
            if (a2 != null) {
                a2.mutate();
            }
            this.Y = new a(c(a2), this.Y.b, this.Y.c);
            this.Z = true;
        }
        return this;
    }

    /* loaded from: classes3.dex */
    public static final class a extends Drawable.ConstantState {
        public Drawable.ConstantState a;
        public final int b;
        public final int c;

        public a(@InterfaceC11300zs1 Drawable.ConstantState constantState, int i, int i2) {
            this.a = constantState;
            this.b = i;
            this.c = i2;
        }

        public boolean d() {
            if (this.a != null) {
                return true;
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            Drawable.ConstantState constantState = this.a;
            if (constantState != null) {
                return constantState.getChangingConfigurations();
            }
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC5670cr1
        public Drawable newDrawable() {
            return new WX1(this.a.newDrawable(), this.b, this.c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC5670cr1
        public Drawable newDrawable(@InterfaceC11300zs1 Resources resources) {
            return new WX1(this.a.newDrawable(resources), this.b, this.c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC5670cr1
        public Drawable newDrawable(@InterfaceC11300zs1 Resources resources, @InterfaceC11300zs1 Resources.Theme theme) {
            return new WX1(this.a.newDrawable(resources, theme), this.b, this.c);
        }
    }
}
