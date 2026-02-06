package o;

import android.graphics.PointF;

/* renamed from: o.gS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6557gS {
    public final PointF a;
    public final PointF b;
    public final PointF c;

    public C6557gS() {
        this.a = new PointF();
        this.b = new PointF();
        this.c = new PointF();
    }

    public PointF a() {
        return this.a;
    }

    public PointF b() {
        return this.b;
    }

    public PointF c() {
        return this.c;
    }

    public void d(float f, float f2) {
        this.a.set(f, f2);
    }

    public void e(float f, float f2) {
        this.b.set(f, f2);
    }

    public void f(C6557gS c6557gS) {
        PointF pointF = c6557gS.c;
        g(pointF.x, pointF.y);
        PointF pointF2 = c6557gS.a;
        d(pointF2.x, pointF2.y);
        PointF pointF3 = c6557gS.b;
        e(pointF3.x, pointF3.y);
    }

    public void g(float f, float f2) {
        this.c.set(f, f2);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.c.x), Float.valueOf(this.c.y), Float.valueOf(this.a.x), Float.valueOf(this.a.y), Float.valueOf(this.b.x), Float.valueOf(this.b.y));
    }

    public C6557gS(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
    }
}
