package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import o.C7025iN1;
import o.HT1;

/* renamed from: o.b21  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5230b21 extends Drawable implements Drawable.Callback {
    @InterfaceC5670cr1
    public final Context Y;
    @InterfaceC5670cr1
    public C5472c21 Y0;
    @InterfaceC5670cr1
    public final C5715d21 Z;
    @InterfaceC5670cr1
    public C4987a21 Z0;
    @BR0(from = 0, to = YX1.d)
    public int b1;
    public Drawable c1;
    public C6085ea X = new C6085ea();
    @InterfaceC5670cr1
    public Paint a1 = new Paint();

    public C5230b21(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C5715d21 c5715d21, @InterfaceC5670cr1 C5472c21 c5472c21, @InterfaceC5670cr1 C4987a21 c4987a21) {
        this.Y = context;
        this.Z = c5715d21;
        this.Y0 = c5472c21;
        this.Z0 = c4987a21;
        c4987a21.j(this);
        setAlpha(255);
    }

    @InterfaceC5670cr1
    public static C5230b21 a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 C5715d21 c5715d21) {
        C5230b21 c5230b21 = new C5230b21(context, c5715d21, new C5472c21(c5715d21), new C4987a21(c5715d21));
        c5230b21.h(ME2.d(context.getResources(), C7025iN1.g.ic_mtrl_arrow_circle, null));
        return c5230b21;
    }

    @InterfaceC5670cr1
    public C4987a21 b() {
        return this.Z0;
    }

    @InterfaceC5670cr1
    public C5472c21 c() {
        return this.Y0;
    }

    @InterfaceC11300zs1
    @HT1({HT1.a.Y})
    public Drawable d() {
        return this.c1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@InterfaceC5670cr1 Canvas canvas) {
        Drawable drawable;
        Rect rect = new Rect();
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            if (e() && (drawable = this.c1) != null) {
                drawable.setBounds(bounds);
                this.c1.setTint(this.Z.e[0]);
                this.c1.draw(canvas);
                return;
            }
            canvas.save();
            this.Y0.a(canvas, bounds);
            this.Y0.b(canvas, this.a1, this.Z.f, getAlpha());
            this.Y0.c(canvas, this.a1, this.Z0.h, getAlpha());
            canvas.restore();
        }
    }

    public final boolean e() {
        C6085ea c6085ea = this.X;
        if (c6085ea == null || c6085ea.a(this.Y.getContentResolver()) != 0.0f) {
            return false;
        }
        return true;
    }

    public void f(@InterfaceC5670cr1 C4987a21 c4987a21) {
        this.Z0 = c4987a21;
        c4987a21.j(this);
    }

    public void g(@InterfaceC5670cr1 C5472c21 c5472c21) {
        this.Y0 = c5472c21;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.Y0.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.Y0.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @HT1({HT1.a.Y})
    @InterfaceC5056aJ2
    public void h(@InterfaceC11300zs1 Drawable drawable) {
        this.c1 = drawable;
    }

    @InterfaceC6181ey
    public boolean i(boolean z, boolean z2, boolean z3) {
        boolean visible = super.setVisible(z, z2);
        this.Z0.e();
        if (z && z3 && !e()) {
            this.Z0.o();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@InterfaceC5670cr1 Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@InterfaceC5670cr1 Drawable drawable, @InterfaceC5670cr1 Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.b1 != i) {
            this.b1 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@InterfaceC11300zs1 ColorFilter colorFilter) {
        this.a1.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @InterfaceC6181ey
    public boolean setVisible(boolean z, boolean z2) {
        return i(z, z2, z);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@InterfaceC5670cr1 Drawable drawable, @InterfaceC5670cr1 Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
