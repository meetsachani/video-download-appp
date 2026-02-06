package o;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public class PU1 extends Drawable implements InterfaceC6946i32, InterfaceC2480Ap2 {
    public b X;

    @InterfaceC11300zs1
    public C6092eb2 a() {
        return this.X.a.E();
    }

    @InterfaceC11300zs1
    public C10751xc2 b() {
        return this.X.a.V();
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC5670cr1
    /* renamed from: c */
    public PU1 mutate() {
        this.X = new b(this.X);
        return this;
    }

    public void d(@InterfaceC5670cr1 C6092eb2 c6092eb2) {
        this.X.a.v0(c6092eb2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.X;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    public void e(@InterfaceC5670cr1 C10751xc2 c10751xc2) {
        this.X.a.O0(c10751xc2);
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC11300zs1
    public Drawable.ConstantState getConstantState() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.X.a.getOpacity();
    }

    @Override // o.InterfaceC6946i32
    @InterfaceC5670cr1
    public O22 getShapeAppearanceModel() {
        return this.X.a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@InterfaceC5670cr1 Rect rect) {
        super.onBoundsChange(rect);
        this.X.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@InterfaceC5670cr1 int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.X.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean f = QU1.f(iArr);
        b bVar = this.X;
        if (bVar.b != f) {
            bVar.b = f;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.X.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
        this.X.a.setColorFilter(colorFilter);
    }

    @Override // o.InterfaceC6946i32
    public void setShapeAppearanceModel(@InterfaceC5670cr1 O22 o22) {
        this.X.a.setShapeAppearanceModel(o22);
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTint(@JF int i) {
        this.X.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintList(@InterfaceC11300zs1 ColorStateList colorStateList) {
        this.X.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, o.InterfaceC2480Ap2
    public void setTintMode(@InterfaceC11300zs1 PorterDuff.Mode mode) {
        this.X.a.setTintMode(mode);
    }

    public PU1(O22 o22) {
        this(new b(new C4394Uc1(o22)));
    }

    /* loaded from: classes3.dex */
    public static final class b extends Drawable.ConstantState {
        @InterfaceC5670cr1
        public C4394Uc1 a;
        public boolean b;

        public b(C4394Uc1 c4394Uc1) {
            this.a = c4394Uc1;
            this.b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @InterfaceC5670cr1
        /* renamed from: a */
        public PU1 newDrawable() {
            return new PU1(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(@InterfaceC5670cr1 b bVar) {
            this.a = (C4394Uc1) bVar.a.getConstantState().newDrawable();
            this.b = bVar.b;
        }
    }

    public PU1(b bVar) {
        this.X = bVar;
    }
}
