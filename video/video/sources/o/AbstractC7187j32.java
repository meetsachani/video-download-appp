package o;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import o.C2705Cy;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.j32  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7187j32 {
    @InterfaceC11300zs1
    public O22 c;
    public boolean a = false;
    public boolean b = false;
    public RectF d = new RectF();
    public final Path e = new Path();

    @InterfaceC5670cr1
    public static AbstractC7187j32 a(@InterfaceC5670cr1 View view) {
        if (Build.VERSION.SDK_INT >= 33) {
            return new C7916m32(view);
        }
        return new C7673l32(view);
    }

    public abstract void b(@InterfaceC5670cr1 View view);

    public boolean c() {
        return this.a;
    }

    public final boolean d() {
        RectF rectF = this.d;
        if (rectF.left <= rectF.right && rectF.top <= rectF.bottom) {
            return true;
        }
        return false;
    }

    public void e(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 C2705Cy.a aVar) {
        if (j() && !this.e.isEmpty()) {
            canvas.save();
            canvas.clipPath(this.e);
            aVar.a(canvas);
            canvas.restore();
            return;
        }
        aVar.a(canvas);
    }

    public void f(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 RectF rectF) {
        this.d = rectF;
        k();
        b(view);
    }

    public void g(@InterfaceC5670cr1 View view, @InterfaceC5670cr1 O22 o22) {
        this.c = o22;
        k();
        b(view);
    }

    public void h(@InterfaceC5670cr1 View view, boolean z) {
        if (z != this.a) {
            this.a = z;
            b(view);
        }
    }

    public void i(@InterfaceC5670cr1 View view, boolean z) {
        this.b = z;
        b(view);
    }

    public abstract boolean j();

    public final void k() {
        if (d() && this.c != null) {
            P22.l().d(this.c, 1.0f, this.d, this.e);
        }
    }
}
