package o;

import android.graphics.Canvas;
import android.graphics.PointF;

/* loaded from: classes3.dex */
public abstract class X11 {
    public int a;
    public int b;
    public int c;
    public int d = 150;
    public int e = 150;
    public PointF f;
    public InterfaceC9744tT0 g;

    public abstract void a(Canvas canvas);

    public int b() {
        return this.e;
    }

    public int c() {
        return this.d;
    }

    public abstract void d();

    public boolean e() {
        if (this.g == null) {
            return true;
        }
        return false;
    }

    public void f() {
        if (this.g != null) {
            this.g = null;
        }
    }

    public void g(int i) {
        this.a = i;
    }

    public void h(InterfaceC9744tT0 interfaceC9744tT0) {
        this.g = interfaceC9744tT0;
    }

    public void i(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.f = new PointF(i / 2.0f, i2 / 2.0f);
    }

    public abstract void j();
}
