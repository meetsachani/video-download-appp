package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import o.AbstractC6717h70;

/* loaded from: classes3.dex */
public final class AC extends AbstractC6717h70<KC> {
    public static final float s = 0.01f;
    public static final float t = 0.5522848f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public int m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f409o;
    @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
    public float p;
    public final RectF q;
    public final Pair<AbstractC6717h70<KC>.b, AbstractC6717h70<KC>.b> r;

    public AC(@InterfaceC5670cr1 KC kc) {
        super(kc);
        this.q = new RectF();
        this.r = new Pair<>(new AbstractC6717h70.b(), new AbstractC6717h70.b());
    }

    @Override // o.AbstractC6717h70
    public void a(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f, boolean z, boolean z2) {
        float width = rect.width() / f();
        float height = rect.height() / e();
        S s2 = this.a;
        float f2 = (((KC) s2).p / 2.0f) + ((KC) s2).q;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (((KC) this.a).r != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        S s3 = this.a;
        this.g = ((KC) s3).a * f;
        this.h = Math.min(((KC) s3).a / 2, ((KC) s3).a()) * f;
        S s4 = this.a;
        this.i = ((KC) s4).l * f;
        float f4 = (((KC) s4).p - ((KC) s4).a) / 2.0f;
        this.j = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * ((KC) s4).a) / 2.0f;
            if ((z && ((KC) s4).g == 2) || (z2 && ((KC) s4).h == 1)) {
                this.j = f4 + f5;
            } else if ((z && ((KC) s4).g == 1) || (z2 && ((KC) s4).h == 2)) {
                this.j = f4 - f5;
            }
        }
        if (z2 && ((KC) s4).h == 3) {
            this.p = f;
        } else {
            this.p = 1.0f;
        }
    }

    @Override // o.AbstractC6717h70
    public void c(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @InterfaceC5670cr1 AbstractC6717h70.a aVar, @BR0(from = 0, to = 255) int i) {
        int a = C9179r91.a(aVar.c, i);
        canvas.save();
        canvas.rotate(aVar.g);
        this.f409o = aVar.h;
        float f = aVar.a;
        float f2 = aVar.b;
        int i2 = aVar.d;
        m(canvas, paint, f, f2, a, i2, i2, aVar.e, aVar.f, true);
        canvas.restore();
    }

    @Override // o.AbstractC6717h70
    public void d(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, float f, float f2, @JF int i, @BR0(from = 0, to = 255) int i2, int i3) {
        int a = C9179r91.a(i, i2);
        this.f409o = false;
        m(canvas, paint, f, f2, a, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // o.AbstractC6717h70
    public int e() {
        return p();
    }

    @Override // o.AbstractC6717h70
    public int f() {
        return p();
    }

    @Override // o.AbstractC6717h70
    public void g() {
        this.b.rewind();
        this.b.moveTo(1.0f, 0.0f);
        for (int i = 0; i < 2; i++) {
            this.b.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            this.b.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            this.b.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.b.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        this.e.reset();
        Matrix matrix = this.e;
        float f = this.j;
        matrix.setScale(f, f);
        this.b.transform(this.e);
        if (((KC) this.a).b(this.f409o)) {
            this.d.setPath(this.b, false);
            l(this.d, this.b, this.l);
        }
        this.d.setPath(this.b, false);
    }

    public final void j(@InterfaceC5670cr1 Path path, @InterfaceC5670cr1 AbstractC6717h70<KC>.b bVar, @InterfaceC5670cr1 AbstractC6717h70<KC>.b bVar2) {
        float f = (this.k / 2.0f) * 0.48f;
        AbstractC6717h70.b bVar3 = new AbstractC6717h70.b(this, bVar);
        AbstractC6717h70.b bVar4 = new AbstractC6717h70.b(this, bVar2);
        bVar3.c(f);
        bVar4.c(-f);
        float[] fArr = bVar3.a;
        float f2 = fArr[0];
        float f3 = fArr[1];
        float[] fArr2 = bVar4.a;
        float f4 = fArr2[0];
        float f5 = fArr2[1];
        float[] fArr3 = bVar2.a;
        path.cubicTo(f2, f3, f4, f5, fArr3[0], fArr3[1]);
    }

    public final void k(@InterfaceC5670cr1 PathMeasure pathMeasure, @InterfaceC5670cr1 Path path, @InterfaceC5670cr1 Pair<AbstractC6717h70<KC>.b, AbstractC6717h70<KC>.b> pair, float f, float f2, float f3, float f4) {
        int i;
        float f5 = this.i * f3;
        if (this.f409o) {
            i = ((KC) this.a).j;
        } else {
            i = ((KC) this.a).k;
        }
        float f6 = this.j;
        if (f6 != this.n || (pathMeasure == this.d && (f5 != this.l || i != this.m))) {
            this.l = f5;
            this.m = i;
            this.n = f6;
            g();
        }
        path.rewind();
        float f7 = 0.0f;
        float d = C9293rd1.d(f2, 0.0f, 1.0f);
        if (((KC) this.a).b(this.f409o)) {
            float f8 = f4 / ((float) ((this.j * 6.283185307179586d) / this.k));
            f += f8;
            f7 = 0.0f - (f8 * 360.0f);
        }
        float f9 = f % 1.0f;
        float length = (pathMeasure.getLength() * f9) / 2.0f;
        float length2 = ((f9 + d) * pathMeasure.getLength()) / 2.0f;
        pathMeasure.getSegment(length, length2, path, true);
        AbstractC6717h70.b bVar = (AbstractC6717h70.b) pair.first;
        bVar.d();
        pathMeasure.getPosTan(length, bVar.a, bVar.b);
        AbstractC6717h70.b bVar2 = (AbstractC6717h70.b) pair.second;
        bVar2.d();
        pathMeasure.getPosTan(length2, bVar2.a, bVar2.b);
        this.e.reset();
        this.e.setRotate(f7);
        bVar.e(f7);
        bVar2.e(f7);
        path.transform(this.e);
    }

    public final void l(@InterfaceC5670cr1 PathMeasure pathMeasure, @InterfaceC5670cr1 Path path, float f) {
        int i;
        path.rewind();
        float length = pathMeasure.getLength();
        if (this.f409o) {
            i = ((KC) this.a).j;
        } else {
            i = ((KC) this.a).k;
        }
        int max = Math.max(3, (int) ((length / i) / 2.0f)) * 2;
        this.k = length / max;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < max; i2++) {
            AbstractC6717h70.b bVar = new AbstractC6717h70.b();
            float f2 = i2;
            pathMeasure.getPosTan(this.k * f2, bVar.a, bVar.b);
            AbstractC6717h70.b bVar2 = new AbstractC6717h70.b();
            float f3 = this.k;
            pathMeasure.getPosTan((f2 * f3) + (f3 / 2.0f), bVar2.a, bVar2.b);
            arrayList.add(bVar);
            bVar2.b(f * 2.0f);
            arrayList.add(bVar2);
        }
        arrayList.add((AbstractC6717h70.b) arrayList.get(0));
        AbstractC6717h70<KC>.b bVar3 = (AbstractC6717h70.b) arrayList.get(0);
        float[] fArr = bVar3.a;
        int i3 = 1;
        path.moveTo(fArr[0], fArr[1]);
        while (i3 < arrayList.size()) {
            AbstractC6717h70<KC>.b bVar4 = (AbstractC6717h70.b) arrayList.get(i3);
            j(path, bVar3, bVar4);
            i3++;
            bVar3 = bVar4;
        }
    }

    public final void m(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, float f, float f2, @JF int i, @PK1 int i2, @PK1 int i3, float f3, float f4, boolean z) {
        float f5;
        boolean z2;
        Paint.Cap cap;
        if (f2 >= f) {
            f5 = f2 - f;
        } else {
            f5 = (f2 + 1.0f) - f;
        }
        float f6 = f % 1.0f;
        if (f6 < 0.0f) {
            f6 += 1.0f;
        }
        if (this.p < 1.0f) {
            float f7 = f6 + f5;
            if (f7 > 1.0f) {
                m(canvas, paint, f6, 1.0f, i, i2, 0, f3, f4, z);
                m(canvas, paint, 1.0f, f7, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.h / this.j);
        float f8 = f5 - 0.99f;
        if (f8 >= 0.0f) {
            float f9 = ((f8 * degrees) / 180.0f) / 0.01f;
            f5 += f9;
            if (!z) {
                f6 -= f9 / 2.0f;
            }
        }
        float g = C8801pd1.g(1.0f - this.p, 1.0f, f6);
        float g2 = C8801pd1.g(0.0f, this.p, f5);
        float degrees2 = (float) Math.toDegrees(i2 / this.j);
        float degrees3 = ((g2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.j));
        float f10 = (g * 360.0f) + degrees2;
        if (degrees3 > 0.0f) {
            if (((KC) this.a).b(this.f409o) && z && f3 > 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.g);
            float f11 = this.h * 2.0f;
            float f12 = degrees * 2.0f;
            if (degrees3 < f12) {
                float f13 = degrees3 / f12;
                float f14 = f10 + (degrees * f13);
                AbstractC6717h70<KC>.b bVar = new AbstractC6717h70.b();
                if (!z2) {
                    bVar.e(f14 + 90.0f);
                    bVar.b(-this.j);
                } else {
                    float length = ((f14 / 360.0f) * this.d.getLength()) / 2.0f;
                    float f15 = this.i * f3;
                    float f16 = this.j;
                    if (f16 != this.n || f15 != this.l) {
                        this.l = f15;
                        this.n = f16;
                        g();
                    }
                    this.d.getPosTan(length, bVar.a, bVar.b);
                }
                paint.setStyle(Paint.Style.FILL);
                o(canvas, paint, bVar, f11, this.g, f13);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            if (((KC) this.a).g()) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = Paint.Cap.BUTT;
            }
            paint.setStrokeCap(cap);
            float f17 = f10 + degrees;
            float f18 = degrees3 - f12;
            ((AbstractC6717h70.b) this.r.first).d();
            ((AbstractC6717h70.b) this.r.second).d();
            if (!z2) {
                ((AbstractC6717h70.b) this.r.first).e(f17 + 90.0f);
                ((AbstractC6717h70.b) this.r.first).b(-this.j);
                ((AbstractC6717h70.b) this.r.second).e(f17 + f18 + 90.0f);
                ((AbstractC6717h70.b) this.r.second).b(-this.j);
                RectF rectF = this.q;
                float f19 = this.j;
                rectF.set(-f19, -f19, f19, f19);
                canvas.drawArc(this.q, f17, f18, false, paint);
            } else {
                k(this.d, this.c, this.r, f17 / 360.0f, f18 / 360.0f, f3, f4);
                canvas.drawPath(this.c, paint);
            }
            if (!((KC) this.a).g() && this.h > 0.0f) {
                paint.setStyle(Paint.Style.FILL);
                n(canvas, paint, (AbstractC6717h70.b) this.r.first, f11, this.g);
                n(canvas, paint, (AbstractC6717h70.b) this.r.second, f11, this.g);
            }
        }
    }

    public final void n(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @InterfaceC5670cr1 AbstractC6717h70<KC>.b bVar, float f, float f2) {
        o(canvas, paint, bVar, f, f2, 1.0f);
    }

    public final void o(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @InterfaceC5670cr1 AbstractC6717h70<KC>.b bVar, float f, float f2, float f3) {
        float min = Math.min(f2, this.g);
        float f4 = f / 2.0f;
        float min2 = Math.min(f4, (this.h * min) / this.g);
        RectF rectF = new RectF((-f) / 2.0f, (-min) / 2.0f, f4, min / 2.0f);
        canvas.save();
        float[] fArr = bVar.a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i(bVar.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int p() {
        S s2 = this.a;
        return ((KC) s2).p + (((KC) s2).q * 2);
    }

    @Override // o.AbstractC6717h70
    public void b(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @JF int i, @BR0(from = 0, to = 255) int i2) {
    }
}
