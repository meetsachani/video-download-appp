package o;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import o.C4394Uc1;

/* loaded from: classes3.dex */
public class RT extends C4394Uc1 {
    @InterfaceC5670cr1
    public b J1;

    /* loaded from: classes3.dex */
    public static class c extends RT {
        public c(@InterfaceC5670cr1 b bVar) {
            super(bVar);
        }

        @Override // o.C4394Uc1
        public void y(@InterfaceC5670cr1 Canvas canvas) {
            if (this.J1.x.isEmpty()) {
                super.y(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.J1.x);
            } else {
                canvas.clipRect(this.J1.x, Region.Op.DIFFERENCE);
            }
            super.y(canvas);
            canvas.restore();
        }
    }

    public static RT f1(@InterfaceC5670cr1 b bVar) {
        return new c(bVar);
    }

    public static RT g1(@InterfaceC11300zs1 O22 o22) {
        if (o22 == null) {
            o22 = new O22();
        }
        return f1(new b(o22, new RectF()));
    }

    public boolean h1() {
        return !this.J1.x.isEmpty();
    }

    public void i1() {
        j1(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void j1(float f, float f2, float f3, float f4) {
        if (f == this.J1.x.left && f2 == this.J1.x.top && f3 == this.J1.x.right && f4 == this.J1.x.bottom) {
            return;
        }
        this.J1.x.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public void k1(@InterfaceC5670cr1 RectF rectF) {
        j1(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // o.C4394Uc1, android.graphics.drawable.Drawable
    @InterfaceC5670cr1
    public Drawable mutate() {
        this.J1 = new b(this.J1);
        return this;
    }

    /* loaded from: classes3.dex */
    public static final class b extends C4394Uc1.d {
        @InterfaceC5670cr1
        public final RectF x;

        @Override // o.C4394Uc1.d, android.graphics.drawable.Drawable.ConstantState
        @InterfaceC5670cr1
        public Drawable newDrawable() {
            RT f1 = RT.f1(this);
            f1.invalidateSelf();
            return f1;
        }

        public b(@InterfaceC5670cr1 O22 o22, @InterfaceC5670cr1 RectF rectF) {
            super(o22, null);
            this.x = rectF;
        }

        public b(@InterfaceC5670cr1 b bVar) {
            super(bVar);
            this.x = bVar.x;
        }
    }

    public RT(@InterfaceC5670cr1 b bVar) {
        super(bVar);
        this.J1 = bVar;
    }
}
