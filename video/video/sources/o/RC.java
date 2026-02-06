package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.UC;

/* loaded from: classes3.dex */
public class RC {
    public static final boolean k = false;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f595o = 2;
    public final a a;
    @InterfaceC5670cr1
    public final View b;
    @InterfaceC5670cr1
    public final Path c;
    @InterfaceC5670cr1
    public final Paint d;
    @InterfaceC5670cr1
    public final Paint e;
    @InterfaceC11300zs1
    public UC.e f;
    @InterfaceC11300zs1
    public Drawable g;
    public Paint h;
    public boolean i;
    public boolean j;

    /* loaded from: classes3.dex */
    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface b {
    }

    public RC(a aVar) {
        this.a = aVar;
        View view = (View) aVar;
        this.b = view;
        view.setWillNotDraw(false);
        this.c = new Path();
        this.d = new Paint(7);
        Paint paint = new Paint(1);
        this.e = paint;
        paint.setColor(0);
    }

    public void c(@InterfaceC5670cr1 Canvas canvas) {
        Canvas canvas2;
        if (p()) {
            this.a.c(canvas);
            if (r()) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, this.b.getWidth(), this.b.getHeight(), this.e);
            } else {
                canvas2 = canvas;
            }
        } else {
            canvas2 = canvas;
            this.a.c(canvas2);
            if (r()) {
                canvas2.drawRect(0.0f, 0.0f, this.b.getWidth(), this.b.getHeight(), this.e);
            }
        }
        f(canvas2);
    }

    public final void d(@InterfaceC5670cr1 Canvas canvas, int i, float f) {
        this.h.setColor(i);
        this.h.setStrokeWidth(f);
        UC.e eVar = this.f;
        canvas.drawCircle(eVar.a, eVar.b, eVar.c - (f / 2.0f), this.h);
    }

    public final void e(@InterfaceC5670cr1 Canvas canvas) {
        this.a.c(canvas);
        if (r()) {
            UC.e eVar = this.f;
            canvas.drawCircle(eVar.a, eVar.b, eVar.c, this.e);
        }
        if (p()) {
            d(canvas, -16777216, 10.0f);
            d(canvas, InterfaceMenuC9553sh2.c, 5.0f);
        }
        f(canvas);
    }

    public final void f(@InterfaceC5670cr1 Canvas canvas) {
        if (q()) {
            Rect bounds = this.g.getBounds();
            float width = this.f.a - (bounds.width() / 2.0f);
            float height = this.f.b - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    @InterfaceC11300zs1
    public Drawable g() {
        return this.g;
    }

    @JF
    public int h() {
        return this.e.getColor();
    }

    public final float i(@InterfaceC5670cr1 UC.e eVar) {
        return C8801pd1.c(eVar.a, eVar.b, 0.0f, 0.0f, this.b.getWidth(), this.b.getHeight());
    }

    @InterfaceC11300zs1
    public UC.e j() {
        UC.e eVar = this.f;
        if (eVar == null) {
            return null;
        }
        UC.e eVar2 = new UC.e(eVar);
        if (eVar2.a()) {
            eVar2.c = i(eVar2);
        }
        return eVar2;
    }

    public final void k() {
        this.b.invalidate();
    }

    public boolean l() {
        if (this.a.d() && !p()) {
            return true;
        }
        return false;
    }

    public void m(@InterfaceC11300zs1 Drawable drawable) {
        this.g = drawable;
        this.b.invalidate();
    }

    public void n(@JF int i) {
        this.e.setColor(i);
        this.b.invalidate();
    }

    public void o(@InterfaceC11300zs1 UC.e eVar) {
        if (eVar == null) {
            this.f = null;
        } else {
            UC.e eVar2 = this.f;
            if (eVar2 == null) {
                this.f = new UC.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (C8801pd1.f(eVar.c, i(eVar), 1.0E-4f)) {
                this.f.c = Float.MAX_VALUE;
            }
        }
        k();
    }

    public final boolean p() {
        boolean z;
        UC.e eVar = this.f;
        if (eVar != null && !eVar.a()) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public final boolean q() {
        if (!this.i && this.g != null && this.f != null) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        if (!this.i && Color.alpha(this.e.getColor()) != 0) {
            return true;
        }
        return false;
    }

    public void a() {
    }

    public void b() {
    }
}
