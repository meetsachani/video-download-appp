package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import o.AbstractC6717h70;

/* renamed from: o.f01  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6192f01 extends AbstractC6717h70<C9629t01> {
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public int m;
    public boolean n;
    @InterfaceC2501Av0(from = 0.0d, to = 1.0d)

    /* renamed from: o  reason: collision with root package name */
    public float f735o;
    public Pair<AbstractC6717h70<C9629t01>.b, AbstractC6717h70<C9629t01>.b> p;

    public C6192f01(@InterfaceC5670cr1 C9629t01 c9629t01) {
        super(c9629t01);
        this.g = 300.0f;
        this.p = new Pair<>(new AbstractC6717h70.b(), new AbstractC6717h70.b());
    }

    private void j(@InterfaceC5670cr1 PathMeasure pathMeasure, @InterfaceC5670cr1 Path path, @InterfaceC5670cr1 Pair<AbstractC6717h70<C9629t01>.b, AbstractC6717h70<C9629t01>.b> pair, float f, float f2, float f3, float f4) {
        int i;
        if (this.n) {
            i = ((C9629t01) this.a).j;
        } else {
            i = ((C9629t01) this.a).k;
        }
        if (pathMeasure == this.d && i != this.m) {
            this.m = i;
            g();
        }
        path.rewind();
        float f5 = (-this.g) / 2.0f;
        boolean b = ((C9629t01) this.a).b(this.n);
        if (b) {
            float f6 = this.g;
            float f7 = this.l;
            float f8 = f6 / f7;
            float f9 = f4 / f8;
            float f10 = f8 / (f8 + 1.0f);
            f = (f + f9) * f10;
            f2 = (f2 + f9) * f10;
            f5 -= f4 * f7;
        }
        float length = f * pathMeasure.getLength();
        float length2 = f2 * pathMeasure.getLength();
        pathMeasure.getSegment(length, length2, path, true);
        AbstractC6717h70.b bVar = (AbstractC6717h70.b) pair.first;
        bVar.d();
        pathMeasure.getPosTan(length, bVar.a, bVar.b);
        AbstractC6717h70.b bVar2 = (AbstractC6717h70.b) pair.second;
        bVar2.d();
        pathMeasure.getPosTan(length2, bVar2.a, bVar2.b);
        this.e.reset();
        this.e.setTranslate(f5, 0.0f);
        bVar.g(f5, 0.0f);
        bVar2.g(f5, 0.0f);
        if (b) {
            float f11 = this.k * f3;
            this.e.postScale(1.0f, f11);
            bVar.f(1.0f, f11);
            bVar2.f(1.0f, f11);
        }
        path.transform(this.e);
    }

    private void l(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @InterfaceC5670cr1 AbstractC6717h70<C9629t01>.b bVar, float f, float f2, float f3) {
        m(canvas, paint, bVar, f, f2, f3, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // o.AbstractC6717h70
    public void a(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Rect rect, @InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f, boolean z, boolean z2) {
        if (this.g != rect.width()) {
            this.g = rect.width();
            g();
        }
        float e = e();
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - e) / 2.0f));
        if (((C9629t01) this.a).q) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.g / 2.0f;
        float f3 = e / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        S s = this.a;
        this.h = ((C9629t01) s).a * f;
        this.i = Math.min(((C9629t01) s).a / 2, ((C9629t01) s).a()) * f;
        S s2 = this.a;
        this.k = ((C9629t01) s2).l * f;
        this.j = Math.min(((C9629t01) s2).a / 2.0f, ((C9629t01) s2).i()) * f;
        if (z || z2) {
            if ((z && ((C9629t01) this.a).g == 2) || (z2 && ((C9629t01) this.a).h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && ((C9629t01) this.a).h != 3)) {
                canvas.translate(0.0f, (((C9629t01) this.a).a * (1.0f - f)) / 2.0f);
            }
        }
        if (z2 && ((C9629t01) this.a).h == 3) {
            this.f735o = f;
        } else {
            this.f735o = 1.0f;
        }
    }

    @Override // o.AbstractC6717h70
    public void b(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @JF int i, @BR0(from = 0, to = 255) int i2) {
        float f;
        int a = C9179r91.a(i, i2);
        this.n = false;
        if (((C9629t01) this.a).r > 0 && a != 0) {
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(a);
            S s = this.a;
            if (((C9629t01) s).s != null) {
                f = ((C9629t01) s).s.floatValue() + (((C9629t01) this.a).r / 2.0f);
            } else {
                f = this.h / 2.0f;
            }
            AbstractC6717h70<C9629t01>.b bVar = new AbstractC6717h70.b(new float[]{(this.g / 2.0f) - f, 0.0f}, new float[]{1.0f, 0.0f});
            S s2 = this.a;
            l(canvas, paint, bVar, ((C9629t01) s2).r, ((C9629t01) s2).r, (this.i * ((C9629t01) s2).r) / this.h);
        }
    }

    @Override // o.AbstractC6717h70
    public void c(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @InterfaceC5670cr1 AbstractC6717h70.a aVar, int i) {
        int a = C9179r91.a(aVar.c, i);
        this.n = aVar.h;
        float f = aVar.a;
        float f2 = aVar.b;
        int i2 = aVar.d;
        k(canvas, paint, f, f2, a, i2, i2, aVar.e, aVar.f, true);
    }

    @Override // o.AbstractC6717h70
    public void d(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, float f, float f2, int i, int i2, @PK1 int i3) {
        int a = C9179r91.a(i, i2);
        this.n = false;
        k(canvas, paint, f, f2, a, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // o.AbstractC6717h70
    public int e() {
        S s = this.a;
        return ((C9629t01) s).a + (((C9629t01) s).l * 2);
    }

    @Override // o.AbstractC6717h70
    public int f() {
        return -1;
    }

    @Override // o.AbstractC6717h70
    public void g() {
        int i;
        this.b.rewind();
        if (((C9629t01) this.a).b(this.n)) {
            if (this.n) {
                i = ((C9629t01) this.a).j;
            } else {
                i = ((C9629t01) this.a).k;
            }
            float f = this.g;
            int i2 = (int) (f / i);
            this.l = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                this.b.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = i4 + 2;
                this.b.cubicTo(f2 + 0.48f, 1.0f, f3 - 0.48f, 0.0f, f3, 0.0f);
            }
            this.e.reset();
            this.e.setScale(this.l / 2.0f, -2.0f);
            this.e.postTranslate(0.0f, 1.0f);
            this.b.transform(this.e);
        } else {
            this.b.lineTo(this.g, 0.0f);
        }
        this.d.setPath(this.b, false);
    }

    public final void k(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, float f, float f2, @JF int i, @PK1 int i2, @PK1 int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        boolean z2;
        Paint.Cap cap;
        Paint paint2;
        Canvas canvas2;
        float d = C9293rd1.d(f, 0.0f, 1.0f);
        float d2 = C9293rd1.d(f2, 0.0f, 1.0f);
        float g = C8801pd1.g(1.0f - this.f735o, 1.0f, d);
        float g2 = C8801pd1.g(1.0f - this.f735o, 1.0f, d2);
        float f7 = this.g;
        int d3 = (int) ((g * f7) + ((int) ((i2 * C9293rd1.d(g, 0.0f, 0.01f)) / 0.01f)));
        int d4 = (int) ((g2 * f7) - ((int) ((i3 * (1.0f - C9293rd1.d(g2, 0.99f, 1.0f))) / 0.01f)));
        float f8 = this.i;
        float f9 = this.j;
        if (f8 != f9) {
            float max = Math.max(f8, f9);
            float f10 = this.g;
            float f11 = max / f10;
            float g3 = C8801pd1.g(this.i, this.j, C9293rd1.d(d3 / f10, 0.0f, f11) / f11);
            float f12 = this.i;
            float f13 = this.j;
            float f14 = this.g;
            f6 = C8801pd1.g(f12, f13, C9293rd1.d((f14 - d4) / f14, 0.0f, f11) / f11);
            f5 = g3;
        } else {
            f5 = f8;
            f6 = f5;
        }
        float f15 = (-this.g) / 2.0f;
        if (((C9629t01) this.a).b(this.n) && z && f3 > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (d3 <= d4) {
            float f16 = d3 + f5;
            float f17 = d4 - f6;
            float f18 = f5 * 2.0f;
            float f19 = 2.0f * f6;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.h);
            ((AbstractC6717h70.b) this.p.first).d();
            ((AbstractC6717h70.b) this.p.second).d();
            ((AbstractC6717h70.b) this.p.first).g(f16 + f15, 0.0f);
            ((AbstractC6717h70.b) this.p.second).g(f15 + f17, 0.0f);
            if (d3 == 0 && f17 + f6 < f16 + f5) {
                Pair<AbstractC6717h70<C9629t01>.b, AbstractC6717h70<C9629t01>.b> pair = this.p;
                float f20 = this.h;
                m(canvas, paint, (AbstractC6717h70.b) pair.first, f18, f20, f5, (AbstractC6717h70.b) pair.second, f19, f20, f6, true);
            } else if (f16 - f5 > f17 - f6) {
                Pair<AbstractC6717h70<C9629t01>.b, AbstractC6717h70<C9629t01>.b> pair2 = this.p;
                float f21 = this.h;
                m(canvas, paint, (AbstractC6717h70.b) pair2.second, f19, f21, f6, (AbstractC6717h70.b) pair2.first, f18, f21, f5, false);
            } else {
                float f22 = f6;
                float f23 = f5;
                paint.setStyle(Paint.Style.STROKE);
                if (((C9629t01) this.a).g()) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                paint.setStrokeCap(cap);
                if (!z2) {
                    Pair<AbstractC6717h70<C9629t01>.b, AbstractC6717h70<C9629t01>.b> pair3 = this.p;
                    Object obj = pair3.first;
                    float f24 = ((AbstractC6717h70.b) obj).a[0];
                    float f25 = ((AbstractC6717h70.b) obj).a[1];
                    Object obj2 = pair3.second;
                    canvas.drawLine(f24, f25, ((AbstractC6717h70.b) obj2).a[0], ((AbstractC6717h70.b) obj2).a[1], paint);
                    paint2 = paint;
                    canvas2 = canvas;
                } else {
                    paint2 = paint;
                    PathMeasure pathMeasure = this.d;
                    Path path = this.c;
                    Pair<AbstractC6717h70<C9629t01>.b, AbstractC6717h70<C9629t01>.b> pair4 = this.p;
                    float f26 = this.g;
                    j(pathMeasure, path, pair4, f16 / f26, f17 / f26, f3, f4);
                    canvas2 = canvas;
                    canvas2.drawPath(this.c, paint2);
                }
                if (!((C9629t01) this.a).g()) {
                    if (f16 > 0.0f && f23 > 0.0f) {
                        l(canvas2, paint2, (AbstractC6717h70.b) this.p.first, f18, this.h, f23);
                    }
                    if (f17 < this.g && f22 > 0.0f) {
                        l(canvas, paint, (AbstractC6717h70.b) this.p.second, f19, this.h, f22);
                    }
                }
            }
        }
    }

    public final void m(@InterfaceC5670cr1 Canvas canvas, @InterfaceC5670cr1 Paint paint, @InterfaceC5670cr1 AbstractC6717h70<C9629t01>.b bVar, float f, float f2, float f3, @InterfaceC11300zs1 AbstractC6717h70<C9629t01>.b bVar2, float f4, float f5, float f6, boolean z) {
        char c;
        float f7;
        float f8;
        float min = Math.min(f2, this.h);
        float f9 = (-f) / 2.0f;
        float f10 = (-min) / 2.0f;
        float f11 = f / 2.0f;
        float f12 = min / 2.0f;
        RectF rectF = new RectF(f9, f10, f11, f12);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (bVar2 != null) {
            float min2 = Math.min(f5, this.h);
            float min3 = Math.min(f4 / 2.0f, (f6 * min2) / this.h);
            RectF rectF2 = new RectF();
            if (z) {
                c = 0;
                float f13 = (bVar2.a[0] - min3) - (bVar.a[0] - f3);
                if (f13 > 0.0f) {
                    bVar2.g((-f13) / 2.0f, 0.0f);
                    f8 = f4 + f13;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f10, f11, f12);
            } else {
                c = 0;
                float f14 = (bVar2.a[0] + min3) - (bVar.a[0] + f3);
                if (f14 < 0.0f) {
                    bVar2.g((-f14) / 2.0f, 0.0f);
                    f7 = f4 - f14;
                } else {
                    f7 = f4;
                }
                rectF2.set(f9, f10, 0.0f, f12);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-min2) / 2.0f, f8 / 2.0f, min2 / 2.0f);
            float[] fArr = bVar2.a;
            canvas.translate(fArr[c], fArr[1]);
            canvas.rotate(i(bVar2.b));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-i(bVar2.b));
            float[] fArr2 = bVar2.a;
            canvas.translate(-fArr2[c], -fArr2[1]);
            float[] fArr3 = bVar.a;
            canvas.translate(fArr3[c], fArr3[1]);
            canvas.rotate(i(bVar.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = bVar.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(i(bVar.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }
}
