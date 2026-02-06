package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import o.C8945qD0;
import o.InterfaceC8441o9;

/* renamed from: o.kD0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7468kD0 extends Drawable implements C8945qD0.b, Animatable, InterfaceC8441o9 {
    public static final int g1 = -1;
    public static final int h1 = 0;
    public static final int i1 = 119;
    public final a X;
    public boolean Y;
    public boolean Y0;
    public boolean Z;
    public boolean Z0;
    public int a1;
    public int b1;
    public boolean c1;
    public Paint d1;
    public Rect e1;
    public List<InterfaceC8441o9.a> f1;

    /* renamed from: o.kD0$a */
    /* loaded from: classes.dex */
    public static final class a extends Drawable.ConstantState {
        public final C8945qD0 a;

        public a(C8945qD0 c8945qD0) {
            this.a = c8945qD0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C7468kD0(this);
        }
    }

    @Deprecated
    public C7468kD0(Context context, InterfaceC7225jD0 interfaceC7225jD0, InterfaceC4931Zn interfaceC4931Zn, InterfaceC5675cs2<Bitmap> interfaceC5675cs2, int i, int i2, Bitmap bitmap) {
        this(context, interfaceC7225jD0, interfaceC5675cs2, i, i2, bitmap);
    }

    @Override // o.C8945qD0.b
    public void a() {
        if (d() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (i() == h() - 1) {
            this.a1++;
        }
        int i = this.b1;
        if (i != -1 && this.a1 >= i) {
            stop();
            n();
        }
    }

    @Override // o.InterfaceC8441o9
    public boolean b(InterfaceC8441o9.a aVar) {
        List<InterfaceC8441o9.a> list = this.f1;
        if (list != null && aVar != null) {
            return list.remove(aVar);
        }
        return false;
    }

    @Override // o.InterfaceC8441o9
    public void c(InterfaceC8441o9.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f1 == null) {
            this.f1 = new ArrayList();
        }
        this.f1.add(aVar);
    }

    @Override // o.InterfaceC8441o9
    public void clearAnimationCallbacks() {
        List<InterfaceC8441o9.a> list = this.f1;
        if (list != null) {
            list.clear();
        }
    }

    public final Drawable.Callback d() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.Y0) {
            return;
        }
        if (this.c1) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), f());
            this.c1 = false;
        }
        canvas.drawBitmap(this.X.a.c(), (Rect) null, f(), k());
    }

    public ByteBuffer e() {
        return this.X.a.b();
    }

    public final Rect f() {
        if (this.e1 == null) {
            this.e1 = new Rect();
        }
        return this.e1;
    }

    public Bitmap g() {
        return this.X.a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.X;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.X.a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.X.a.m();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int h() {
        return this.X.a.f();
    }

    public int i() {
        return this.X.a.d();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.Y;
    }

    public InterfaceC5675cs2<Bitmap> j() {
        return this.X.a.h();
    }

    public final Paint k() {
        if (this.d1 == null) {
            this.d1 = new Paint(2);
        }
        return this.d1;
    }

    public int l() {
        return this.X.a.l();
    }

    public boolean m() {
        return this.Y0;
    }

    public final void n() {
        List<InterfaceC8441o9.a> list = this.f1;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.f1.get(i).b(this);
            }
        }
    }

    public void o() {
        this.Y0 = true;
        this.X.a.a();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c1 = true;
    }

    public final void p() {
        this.a1 = 0;
    }

    public void q(InterfaceC5675cs2<Bitmap> interfaceC5675cs2, Bitmap bitmap) {
        this.X.a.q(interfaceC5675cs2, bitmap);
    }

    public void r(boolean z) {
        this.Y = z;
    }

    public void s(int i) {
        int i2 = -1;
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i == 0) {
            int j = this.X.a.j();
            if (j != 0) {
                i2 = j;
            }
            this.b1 = i2;
            return;
        }
        this.b1 = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        k().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        k().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        C10175vF1.b(!this.Y0, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.Z0 = z;
        if (!z) {
            v();
        } else if (this.Z) {
            u();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.Z = true;
        p();
        if (this.Z0) {
            u();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.Z = false;
        v();
    }

    public void t() {
        C10175vF1.b(!this.Y, "You cannot restart a currently running animation.");
        this.X.a.r();
        start();
    }

    public final void u() {
        C10175vF1.b(!this.Y0, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.X.a.f() == 1) {
            invalidateSelf();
        } else if (!this.Y) {
            this.Y = true;
            this.X.a.v(this);
            invalidateSelf();
        }
    }

    public final void v() {
        this.Y = false;
        this.X.a.w(this);
    }

    public C7468kD0(Context context, InterfaceC7225jD0 interfaceC7225jD0, InterfaceC5675cs2<Bitmap> interfaceC5675cs2, int i, int i2, Bitmap bitmap) {
        this(new a(new C8945qD0(com.bumptech.glide.a.e(context), interfaceC7225jD0, i, i2, interfaceC5675cs2, bitmap)));
    }

    public C7468kD0(a aVar) {
        this.Z0 = true;
        this.b1 = -1;
        this.X = (a) C10175vF1.e(aVar);
    }

    public C7468kD0(C8945qD0 c8945qD0, Paint paint) {
        this(new a(c8945qD0));
        this.d1 = paint;
    }
}
