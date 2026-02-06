package o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import o.AbstractC7840ll;
import o.C10660xE1;
import o.C6460g32;

/* renamed from: o.wE1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10417wE1 implements InterfaceC5702cz1, AbstractC7840ll.b, CX0 {
    public static final float s = 0.47829f;
    public static final float t = 0.25f;
    public final String e;
    public final C8431o61 f;
    public final C10660xE1.a g;
    public final boolean h;
    public final boolean i;
    public final AbstractC7840ll<?, Float> j;
    public final AbstractC7840ll<?, PointF> k;
    public final AbstractC7840ll<?, Float> l;
    public final AbstractC7840ll<?, Float> m;
    public final AbstractC7840ll<?, Float> n;

    /* renamed from: o  reason: collision with root package name */
    public final AbstractC7840ll<?, Float> f901o;
    public final AbstractC7840ll<?, Float> p;
    public boolean r;
    public final Path a = new Path();
    public final Path b = new Path();
    public final PathMeasure c = new PathMeasure();
    public final float[] d = new float[2];
    public final C5296bJ q = new C5296bJ();

    /* renamed from: o.wE1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[C10660xE1.a.values().length];
            a = iArr;
            try {
                iArr[C10660xE1.a.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[C10660xE1.a.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C10417wE1(C8431o61 c8431o61, AbstractC8588ol abstractC8588ol, C10660xE1 c10660xE1) {
        this.f = c8431o61;
        this.e = c10660xE1.d();
        C10660xE1.a j = c10660xE1.j();
        this.g = j;
        this.h = c10660xE1.k();
        this.i = c10660xE1.l();
        C8629ov0 a2 = c10660xE1.g().a();
        this.j = a2;
        AbstractC7840ll<PointF, PointF> a3 = c10660xE1.h().a();
        this.k = a3;
        C8629ov0 a4 = c10660xE1.i().a();
        this.l = a4;
        C8629ov0 a5 = c10660xE1.e().a();
        this.n = a5;
        C8629ov0 a6 = c10660xE1.f().a();
        this.p = a6;
        C10660xE1.a aVar = C10660xE1.a.STAR;
        if (j == aVar) {
            this.m = c10660xE1.b().a();
            this.f901o = c10660xE1.c().a();
        } else {
            this.m = null;
            this.f901o = null;
        }
        abstractC8588ol.j(a2);
        abstractC8588ol.j(a3);
        abstractC8588ol.j(a4);
        abstractC8588ol.j(a5);
        abstractC8588ol.j(a6);
        if (j == aVar) {
            abstractC8588ol.j(this.m);
            abstractC8588ol.j(this.f901o);
        }
        a2.a(this);
        a3.a(this);
        a4.a(this);
        a5.a(this);
        a6.a(this);
        if (j == aVar) {
            this.m.a(this);
            this.f901o.a(this);
        }
    }

    private void k() {
        this.r = false;
        this.f.invalidateSelf();
    }

    @Override // o.InterfaceC5702cz1
    public Path Y() {
        if (this.r) {
            return this.a;
        }
        this.a.reset();
        if (this.h) {
            this.r = true;
            return this.a;
        }
        int i = a.a[this.g.ordinal()];
        if (i != 1) {
            if (i == 2) {
                i();
            }
        } else {
            j();
        }
        this.a.close();
        this.q.b(this.a);
        this.r = true;
        return this.a;
    }

    @Override // o.AbstractC7840ll.b
    public void a() {
        k();
    }

    @Override // o.DL
    public void b(List<DL> list, List<DL> list2) {
        for (int i = 0; i < list.size(); i++) {
            DL dl = list.get(i);
            if (dl instanceof C10823xu2) {
                C10823xu2 c10823xu2 = (C10823xu2) dl;
                if (c10823xu2.k() == C6460g32.a.SIMULTANEOUSLY) {
                    this.q.a(c10823xu2);
                    c10823xu2.c(this);
                }
            }
        }
    }

    @Override // o.BX0
    public void c(AX0 ax0, int i, List<AX0> list, AX0 ax02) {
        C4713Xj1.m(ax0, i, list, ax02, this);
    }

    @Override // o.BX0
    public <T> void d(T t2, O61<T> o61) {
        AbstractC7840ll<?, Float> abstractC7840ll;
        AbstractC7840ll<?, Float> abstractC7840ll2;
        if (t2 == D61.z) {
            this.j.o(o61);
        } else if (t2 == D61.A) {
            this.l.o(o61);
        } else if (t2 == D61.n) {
            this.k.o(o61);
        } else if (t2 == D61.B && (abstractC7840ll2 = this.m) != null) {
            abstractC7840ll2.o(o61);
        } else if (t2 == D61.C) {
            this.n.o(o61);
        } else if (t2 == D61.D && (abstractC7840ll = this.f901o) != null) {
            abstractC7840ll.o(o61);
        } else if (t2 == D61.E) {
            this.p.o(o61);
        }
    }

    @Override // o.DL
    public String getName() {
        return this.e;
    }

    public final void i() {
        double floatValue;
        double d;
        float f;
        float f2;
        float f3;
        int floor = (int) Math.floor(this.j.h().floatValue());
        AbstractC7840ll<?, Float> abstractC7840ll = this.l;
        if (abstractC7840ll == null) {
            floatValue = 0.0d;
        } else {
            floatValue = abstractC7840ll.h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d2 = floor;
        float floatValue2 = this.p.h().floatValue() / 100.0f;
        float floatValue3 = this.n.h().floatValue();
        double d3 = floatValue3;
        float cos = (float) (Math.cos(radians) * d3);
        float sin = (float) (Math.sin(radians) * d3);
        this.a.moveTo(cos, sin);
        double d4 = (float) (6.283185307179586d / d2);
        double ceil = Math.ceil(d2);
        double d5 = radians + d4;
        int i = 0;
        while (true) {
            double d6 = i;
            if (d6 < ceil) {
                float cos2 = (float) (d3 * Math.cos(d5));
                float sin2 = (float) (Math.sin(d5) * d3);
                if (floatValue2 != 0.0f) {
                    d = ceil;
                    f = floatValue2;
                    double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                    float cos3 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                    float f4 = floatValue3 * f * 0.25f;
                    float f5 = f4 * cos3;
                    float f6 = f4 * sin3;
                    float cos4 = ((float) Math.cos(atan22)) * f4;
                    float sin4 = f4 * ((float) Math.sin(atan22));
                    if (d6 == d - 1.0d) {
                        this.b.reset();
                        this.b.moveTo(cos, sin);
                        float f7 = cos - f5;
                        float f8 = sin - f6;
                        float f9 = cos2 + cos4;
                        float f10 = sin2 + sin4;
                        f2 = cos2;
                        f3 = sin2;
                        this.b.cubicTo(f7, f8, f9, f10, f2, f3);
                        this.c.setPath(this.b, false);
                        PathMeasure pathMeasure = this.c;
                        pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, this.d, null);
                        Path path = this.a;
                        float[] fArr = this.d;
                        path.cubicTo(f7, f8, f9, f10, fArr[0], fArr[1]);
                    } else {
                        f2 = cos2;
                        f3 = sin2;
                        this.a.cubicTo(cos - f5, sin - f6, f2 + cos4, f3 + sin4, f2, f3);
                    }
                    cos = f2;
                    sin = f3;
                } else {
                    cos = cos2;
                    sin = sin2;
                    d = ceil;
                    f = floatValue2;
                    if (d6 != d - 1.0d) {
                        this.a.lineTo(cos, sin);
                    } else {
                        i++;
                        ceil = d;
                        floatValue2 = f;
                    }
                }
                d5 += d4;
                i++;
                ceil = d;
                floatValue2 = f;
            } else {
                PointF h = this.k.h();
                this.a.offset(h.x, h.y);
                this.a.close();
                return;
            }
        }
    }

    public final void j() {
        double floatValue;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float cos;
        float sin;
        float f5;
        float f6;
        double d;
        float f7;
        float f8;
        int i2;
        float f9;
        double d2;
        float f10;
        float f11;
        double d3;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float floatValue2 = this.j.h().floatValue();
        AbstractC7840ll<?, Float> abstractC7840ll = this.l;
        if (abstractC7840ll == null) {
            floatValue = 0.0d;
        } else {
            floatValue = abstractC7840ll.h().floatValue();
        }
        double radians = Math.toRadians(floatValue - 90.0d);
        double d4 = floatValue2;
        float f18 = (float) (6.283185307179586d / d4);
        if (this.i) {
            f18 *= -1.0f;
        }
        float f19 = f18 / 2.0f;
        float f20 = floatValue2 - ((int) floatValue2);
        int i3 = (f20 > 0.0f ? 1 : (f20 == 0.0f ? 0 : -1));
        if (i3 != 0) {
            radians += (1.0f - f20) * f19;
        }
        float floatValue3 = this.n.h().floatValue();
        float floatValue4 = this.m.h().floatValue();
        AbstractC7840ll<?, Float> abstractC7840ll2 = this.f901o;
        if (abstractC7840ll2 != null) {
            f = abstractC7840ll2.h().floatValue() / 100.0f;
        } else {
            f = 0.0f;
        }
        AbstractC7840ll<?, Float> abstractC7840ll3 = this.p;
        if (abstractC7840ll3 != null) {
            f2 = abstractC7840ll3.h().floatValue() / 100.0f;
        } else {
            f2 = 0.0f;
        }
        if (i3 != 0) {
            f7 = ((floatValue3 - floatValue4) * f20) + floatValue4;
            f4 = 0.0f;
            i = i3;
            double d5 = f7;
            f3 = 2.0f;
            float cos2 = (float) (d5 * Math.cos(radians));
            sin = (float) (d5 * Math.sin(radians));
            this.a.moveTo(cos2, sin);
            d = radians + ((f18 * f20) / 2.0f);
            f5 = f20;
            cos = cos2;
            f6 = f19;
        } else {
            f3 = 2.0f;
            f4 = 0.0f;
            i = i3;
            double d6 = floatValue3;
            cos = (float) (Math.cos(radians) * d6);
            sin = (float) (d6 * Math.sin(radians));
            this.a.moveTo(cos, sin);
            f5 = f20;
            f6 = f19;
            d = radians + f6;
            f7 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i4 = 0;
        boolean z = false;
        double d7 = d;
        float f21 = sin;
        float f22 = cos;
        double d8 = d7;
        while (true) {
            double d9 = i4;
            if (d9 < ceil) {
                if (z) {
                    f8 = floatValue3;
                } else {
                    f8 = floatValue4;
                }
                int i5 = (f7 > f4 ? 1 : (f7 == f4 ? 0 : -1));
                if (i5 != 0 && d9 == ceil - 2.0d) {
                    i2 = i4;
                    f9 = (f18 * f5) / f3;
                } else {
                    i2 = i4;
                    f9 = f6;
                }
                if (i5 != 0 && d9 == ceil - 1.0d) {
                    d2 = d9;
                    f10 = f7;
                } else {
                    d2 = d9;
                    f10 = f8;
                }
                double d10 = f10;
                float cos3 = (float) (d10 * Math.cos(d8));
                float f23 = f18;
                float sin2 = (float) (d10 * Math.sin(d8));
                if (f == f4 && f2 == f4) {
                    this.a.lineTo(cos3, sin2);
                    f17 = cos3;
                    f12 = sin2;
                    f11 = f6;
                    d3 = d8;
                } else {
                    f11 = f6;
                    d3 = d8;
                    double atan2 = (float) (Math.atan2(f21, f22) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    float f24 = f22;
                    float f25 = f21;
                    f12 = sin2;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    if (z) {
                        f13 = f;
                    } else {
                        f13 = f2;
                    }
                    if (z) {
                        f14 = f2;
                    } else {
                        f14 = f;
                    }
                    if (z) {
                        f15 = floatValue4;
                    } else {
                        f15 = floatValue3;
                    }
                    if (z) {
                        f16 = floatValue3;
                    } else {
                        f16 = floatValue4;
                    }
                    float f26 = f15 * f13 * 0.47829f;
                    float f27 = cos4 * f26;
                    float f28 = f26 * sin3;
                    float f29 = f16 * f14 * 0.47829f;
                    float f30 = cos5 * f29;
                    float f31 = f29 * sin4;
                    if (i != 0) {
                        if (i2 == 0) {
                            f27 *= f5;
                            f28 *= f5;
                        } else if (d2 == ceil - 1.0d) {
                            f30 *= f5;
                            f31 *= f5;
                        }
                    }
                    f17 = cos3;
                    this.a.cubicTo(f24 - f27, f25 - f28, cos3 + f30, f12 + f31, f17, f12);
                }
                d8 = d3 + f9;
                z = !z;
                i4 = i2 + 1;
                f6 = f11;
                f22 = f17;
                f21 = f12;
                f18 = f23;
            } else {
                PointF h = this.k.h();
                this.a.offset(h.x, h.y);
                this.a.close();
                return;
            }
        }
    }
}
