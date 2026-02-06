package o;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import o.AbstractC7840ll;

/* renamed from: o.as2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5190as2 {
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public AbstractC7840ll<PointF, PointF> l;
    public AbstractC7840ll<?, PointF> m;
    public AbstractC7840ll<UX1, UX1> n;

    /* renamed from: o  reason: collision with root package name */
    public AbstractC7840ll<Float, Float> f694o;
    public AbstractC7840ll<Integer, Integer> p;
    public C8629ov0 q;
    public C8629ov0 r;
    public C8629ov0 s;
    public C8629ov0 t;
    public C8629ov0 u;
    public AbstractC7840ll<?, Float> v;
    public AbstractC7840ll<?, Float> w;
    public final boolean x;
    public final Matrix a = new Matrix();
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public C5190as2(F9 f9) {
        AbstractC7840ll<PointF, PointF> a;
        AbstractC7840ll<PointF, PointF> a2;
        AbstractC7840ll<UX1, UX1> a3;
        C8629ov0 a4;
        C8629ov0 a5;
        C8629ov0 a6;
        C8629ov0 a7;
        C8629ov0 a8;
        C8629ov0 a9;
        if (f9.c() == null) {
            a = null;
        } else {
            a = f9.c().a();
        }
        this.l = a;
        if (f9.f() == null) {
            a2 = null;
        } else {
            a2 = f9.f().a();
        }
        this.m = a2;
        if (f9.k() == null) {
            a3 = null;
        } else {
            a3 = f9.k().a();
        }
        this.n = a3;
        if (f9.g() == null) {
            a4 = null;
        } else {
            a4 = f9.g().a();
        }
        this.f694o = a4;
        if (f9.l() == null) {
            a5 = null;
        } else {
            a5 = f9.l().a();
        }
        this.q = a5;
        this.x = f9.p();
        if (f9.h() == null) {
            a6 = null;
        } else {
            a6 = f9.h().a();
        }
        this.s = a6;
        if (f9.i() == null) {
            a7 = null;
        } else {
            a7 = f9.i().a();
        }
        this.t = a7;
        if (f9.j() == null) {
            a8 = null;
        } else {
            a8 = f9.j().a();
        }
        this.u = a8;
        if (this.q != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        if (f9.m() == null) {
            a9 = null;
        } else {
            a9 = f9.m().a();
        }
        this.r = a9;
        if (f9.e() != null) {
            this.p = f9.e().a();
        }
        if (f9.n() != null) {
            this.v = f9.n().a();
        } else {
            this.v = null;
        }
        if (f9.d() != null) {
            this.w = f9.d().a();
        } else {
            this.w = null;
        }
    }

    public void d(AbstractC8588ol abstractC8588ol) {
        abstractC8588ol.j(this.p);
        abstractC8588ol.j(this.v);
        abstractC8588ol.j(this.w);
        abstractC8588ol.j(this.l);
        abstractC8588ol.j(this.m);
        abstractC8588ol.j(this.n);
        abstractC8588ol.j(this.f694o);
        abstractC8588ol.j(this.q);
        abstractC8588ol.j(this.r);
        abstractC8588ol.j(this.s);
        abstractC8588ol.j(this.t);
        abstractC8588ol.j(this.u);
    }

    public void e(AbstractC7840ll.b bVar) {
        AbstractC7840ll<Integer, Integer> abstractC7840ll = this.p;
        if (abstractC7840ll != null) {
            abstractC7840ll.a(bVar);
        }
        AbstractC7840ll<?, Float> abstractC7840ll2 = this.v;
        if (abstractC7840ll2 != null) {
            abstractC7840ll2.a(bVar);
        }
        AbstractC7840ll<?, Float> abstractC7840ll3 = this.w;
        if (abstractC7840ll3 != null) {
            abstractC7840ll3.a(bVar);
        }
        AbstractC7840ll<PointF, PointF> abstractC7840ll4 = this.l;
        if (abstractC7840ll4 != null) {
            abstractC7840ll4.a(bVar);
        }
        AbstractC7840ll<?, PointF> abstractC7840ll5 = this.m;
        if (abstractC7840ll5 != null) {
            abstractC7840ll5.a(bVar);
        }
        AbstractC7840ll<UX1, UX1> abstractC7840ll6 = this.n;
        if (abstractC7840ll6 != null) {
            abstractC7840ll6.a(bVar);
        }
        AbstractC7840ll<Float, Float> abstractC7840ll7 = this.f694o;
        if (abstractC7840ll7 != null) {
            abstractC7840ll7.a(bVar);
        }
        C8629ov0 c8629ov0 = this.q;
        if (c8629ov0 != null) {
            c8629ov0.a(bVar);
        }
        C8629ov0 c8629ov02 = this.r;
        if (c8629ov02 != null) {
            c8629ov02.a(bVar);
        }
        C8629ov0 c8629ov03 = this.s;
        if (c8629ov03 != null) {
            c8629ov03.a(bVar);
            this.s.a(new AbstractC7840ll.b() { // from class: o.Xr2
                @Override // o.AbstractC7840ll.b
                public final void a() {
                    C5190as2.this.k = true;
                }
            });
        }
        C8629ov0 c8629ov04 = this.t;
        if (c8629ov04 != null) {
            c8629ov04.a(bVar);
            this.t.a(new AbstractC7840ll.b() { // from class: o.Yr2
                @Override // o.AbstractC7840ll.b
                public final void a() {
                    C5190as2.this.k = true;
                }
            });
        }
        C8629ov0 c8629ov05 = this.u;
        if (c8629ov05 != null) {
            c8629ov05.a(bVar);
            this.u.a(new AbstractC7840ll.b() { // from class: o.Zr2
                @Override // o.AbstractC7840ll.b
                public final void a() {
                    C5190as2.this.k = true;
                }
            });
        }
    }

    public <T> boolean f(T t, O61<T> o61) {
        Float valueOf = Float.valueOf(100.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        if (t == D61.f) {
            AbstractC7840ll<PointF, PointF> abstractC7840ll = this.l;
            if (abstractC7840ll == null) {
                this.l = new CE2(o61, new PointF());
                return true;
            }
            abstractC7840ll.o(o61);
            return true;
        } else if (t == D61.g) {
            AbstractC7840ll<?, PointF> abstractC7840ll2 = this.m;
            if (abstractC7840ll2 == null) {
                this.m = new CE2(o61, new PointF());
                return true;
            }
            abstractC7840ll2.o(o61);
            return true;
        } else {
            if (t == D61.h) {
                AbstractC7840ll<?, PointF> abstractC7840ll3 = this.m;
                if (abstractC7840ll3 instanceof C4775Ya2) {
                    ((C4775Ya2) abstractC7840ll3).t(o61);
                    return true;
                }
            }
            if (t == D61.i) {
                AbstractC7840ll<?, PointF> abstractC7840ll4 = this.m;
                if (abstractC7840ll4 instanceof C4775Ya2) {
                    ((C4775Ya2) abstractC7840ll4).u(o61);
                    return true;
                }
            }
            if (t == D61.f435o) {
                AbstractC7840ll<UX1, UX1> abstractC7840ll5 = this.n;
                if (abstractC7840ll5 == null) {
                    this.n = new CE2(o61, new UX1());
                    return true;
                }
                abstractC7840ll5.o(o61);
                return true;
            } else if (t == D61.p) {
                AbstractC7840ll<Float, Float> abstractC7840ll6 = this.f694o;
                if (abstractC7840ll6 == null) {
                    this.f694o = new CE2(o61, valueOf2);
                    return true;
                }
                abstractC7840ll6.o(o61);
                return true;
            } else if (t == D61.c) {
                AbstractC7840ll<Integer, Integer> abstractC7840ll7 = this.p;
                if (abstractC7840ll7 == null) {
                    this.p = new CE2(o61, 100);
                    return true;
                }
                abstractC7840ll7.o(o61);
                return true;
            } else if (t == D61.F) {
                AbstractC7840ll<?, Float> abstractC7840ll8 = this.v;
                if (abstractC7840ll8 == null) {
                    this.v = new CE2(o61, valueOf);
                    return true;
                }
                abstractC7840ll8.o(o61);
                return true;
            } else if (t == D61.G) {
                AbstractC7840ll<?, Float> abstractC7840ll9 = this.w;
                if (abstractC7840ll9 == null) {
                    this.w = new CE2(o61, valueOf);
                    return true;
                }
                abstractC7840ll9.o(o61);
                return true;
            } else if (t == D61.t) {
                if (this.q == null) {
                    this.q = new C8629ov0(Collections.singletonList(new LX0(valueOf2)));
                }
                this.q.o(o61);
                return true;
            } else if (t == D61.u) {
                if (this.r == null) {
                    this.r = new C8629ov0(Collections.singletonList(new LX0(valueOf2)));
                }
                this.r.o(o61);
                return true;
            } else if (t == D61.q) {
                if (this.s == null) {
                    this.s = new C8629ov0(Collections.singletonList(new LX0(valueOf2)));
                }
                this.s.o(o61);
                return true;
            } else if (t == D61.r) {
                if (this.t == null) {
                    this.t = new C8629ov0(Collections.singletonList(new LX0(valueOf2)));
                }
                this.t.o(o61);
                return true;
            } else if (t == D61.s) {
                if (this.u == null) {
                    this.u = new C8629ov0(Collections.singletonList(new LX0(valueOf2)));
                }
                this.u.o(o61);
                return true;
            } else {
                return false;
            }
        }
    }

    public final void g() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public AbstractC7840ll<?, Float> h() {
        return this.w;
    }

    public Matrix i() {
        C8629ov0 c8629ov0;
        C8629ov0 c8629ov02;
        float r;
        C8629ov0 c8629ov03;
        PointF h;
        UX1 h2;
        C8629ov0 c8629ov04;
        float cos;
        C8629ov0 c8629ov05;
        float sin;
        PointF h3;
        float f;
        float f2;
        float f3;
        PointF h4;
        PointF h5;
        float f4;
        this.a.reset();
        C8629ov0 c8629ov06 = this.s;
        float f5 = 1.0f;
        if ((c8629ov06 != null && c8629ov06.r() != 0.0f) || (((c8629ov0 = this.t) != null && c8629ov0.r() != 0.0f) || ((c8629ov02 = this.u) != null && c8629ov02.r() != 0.0f))) {
            C8629ov0 c8629ov07 = this.s;
            if (c8629ov07 != null) {
                f = c8629ov07.r();
            } else {
                f = 0.0f;
            }
            C8629ov0 c8629ov08 = this.t;
            if (c8629ov08 != null) {
                f2 = c8629ov08.r();
            } else {
                f2 = 0.0f;
            }
            C8629ov0 c8629ov09 = this.u;
            if (c8629ov09 != null) {
                f3 = c8629ov09.r();
            } else {
                f3 = 0.0f;
            }
            if (this.k || f != this.f || f2 != this.g || f3 != this.h) {
                this.f = f;
                this.g = f2;
                this.h = f3;
                if (f != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(f));
                } else {
                    this.i = 1.0f;
                }
                if (f2 != 0.0f) {
                    this.j = (float) Math.cos(Math.toRadians(f2));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            AbstractC7840ll<PointF, PointF> abstractC7840ll = this.l;
            UX1 ux1 = null;
            if (abstractC7840ll == null) {
                h4 = null;
            } else {
                h4 = abstractC7840ll.h();
            }
            AbstractC7840ll<?, PointF> abstractC7840ll2 = this.m;
            if (abstractC7840ll2 == null) {
                h5 = null;
            } else {
                h5 = abstractC7840ll2.h();
            }
            AbstractC7840ll<UX1, UX1> abstractC7840ll3 = this.n;
            if (abstractC7840ll3 != null) {
                ux1 = abstractC7840ll3.h();
            }
            if (ux1 != null) {
                f4 = ux1.b();
            } else {
                f4 = 1.0f;
            }
            if (ux1 != null) {
                f5 = ux1.c();
            }
            C4358Tr2.b(this.a, h4, h5, f4, f5, f, f2, f3, this.i, this.j);
            return this.a;
        }
        AbstractC7840ll<?, PointF> abstractC7840ll4 = this.m;
        if (abstractC7840ll4 != null && (h3 = abstractC7840ll4.h()) != null) {
            float f6 = h3.x;
            if (f6 != 0.0f || h3.y != 0.0f) {
                this.a.preTranslate(f6, h3.y);
            }
        }
        if (this.x) {
            if (abstractC7840ll4 != null) {
                float f7 = abstractC7840ll4.f();
                PointF h6 = abstractC7840ll4.h();
                float f8 = h6.x;
                float f9 = h6.y;
                abstractC7840ll4.n(1.0E-4f + f7);
                PointF h7 = abstractC7840ll4.h();
                abstractC7840ll4.n(f7);
                this.a.preRotate((float) Math.toDegrees(Math.atan2(h7.y - f9, h7.x - f8)));
            }
        } else {
            AbstractC7840ll<Float, Float> abstractC7840ll5 = this.f694o;
            if (abstractC7840ll5 != null) {
                if (abstractC7840ll5 instanceof CE2) {
                    r = abstractC7840ll5.h().floatValue();
                } else {
                    r = ((C8629ov0) abstractC7840ll5).r();
                }
                if (r != 0.0f) {
                    this.a.preRotate(r);
                }
            }
        }
        if (this.q != null) {
            if (this.r == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-c8629ov04.r()) + 90.0f));
            }
            if (this.r == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-c8629ov05.r()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(c8629ov03.r()));
            g();
            float[] fArr = this.e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f10 = -sin;
            fArr[3] = f10;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            g();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.c.setValues(fArr2);
            g();
            float[] fArr3 = this.e;
            fArr3[0] = cos;
            fArr3[1] = f10;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.a.preConcat(this.d);
        }
        AbstractC7840ll<UX1, UX1> abstractC7840ll6 = this.n;
        if (abstractC7840ll6 != null && (h2 = abstractC7840ll6.h()) != null && (h2.b() != 1.0f || h2.c() != 1.0f)) {
            this.a.preScale(h2.b(), h2.c());
        }
        AbstractC7840ll<PointF, PointF> abstractC7840ll7 = this.l;
        if (abstractC7840ll7 != null && (h = abstractC7840ll7.h()) != null) {
            float f11 = h.x;
            if (f11 != 0.0f || h.y != 0.0f) {
                this.a.preTranslate(-f11, -h.y);
            }
        }
        return this.a;
    }

    public Matrix j(float f) {
        PointF h;
        UX1 h2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        AbstractC7840ll<?, PointF> abstractC7840ll = this.m;
        PointF pointF = null;
        if (abstractC7840ll == null) {
            h = null;
        } else {
            h = abstractC7840ll.h();
        }
        AbstractC7840ll<UX1, UX1> abstractC7840ll2 = this.n;
        if (abstractC7840ll2 == null) {
            h2 = null;
        } else {
            h2 = abstractC7840ll2.h();
        }
        AbstractC7840ll<PointF, PointF> abstractC7840ll3 = this.l;
        if (abstractC7840ll3 != null) {
            pointF = abstractC7840ll3.h();
        }
        this.a.reset();
        if (h != null) {
            this.a.preTranslate(h.x * f, h.y * f);
        }
        C8629ov0 c8629ov0 = this.s;
        float f8 = 0.0f;
        if (c8629ov0 != null) {
            f2 = c8629ov0.r() * f;
        } else {
            f2 = 0.0f;
        }
        C8629ov0 c8629ov02 = this.t;
        if (c8629ov02 != null) {
            f3 = c8629ov02.r() * f;
        } else {
            f3 = 0.0f;
        }
        C8629ov0 c8629ov03 = this.u;
        if (c8629ov03 != null) {
            f4 = c8629ov03.r() * f;
        } else {
            f4 = 0.0f;
        }
        int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i == 0 && f3 == 0.0f && f4 == 0.0f) {
            AbstractC7840ll<Float, Float> abstractC7840ll4 = this.f694o;
            if (abstractC7840ll4 != null) {
                float floatValue = abstractC7840ll4.h().floatValue();
                Matrix matrix = this.a;
                float f9 = floatValue * f;
                if (pointF == null) {
                    f7 = 0.0f;
                } else {
                    f7 = pointF.x;
                }
                if (pointF != null) {
                    f8 = pointF.y;
                }
                matrix.preRotate(f9, f7, f8);
            }
        } else {
            float f10 = 1.0f;
            if (i != 0) {
                f5 = (float) Math.cos(Math.toRadians(f2));
            } else {
                f5 = 1.0f;
            }
            if (f3 != 0.0f) {
                f10 = (float) Math.cos(Math.toRadians(f3));
            }
            float f11 = f10;
            if (f4 != 0.0f) {
                Matrix matrix2 = this.a;
                if (pointF == null) {
                    f6 = 0.0f;
                } else {
                    f6 = pointF.x;
                }
                if (pointF != null) {
                    f8 = pointF.y;
                }
                matrix2.preRotate(f4, f6, f8);
            }
            C4358Tr2.a(this.a, f2, f3, 0.0f, f5, f11);
        }
        if (h2 != null) {
            double d = f;
            this.a.preScale((float) Math.pow(h2.b(), d), (float) Math.pow(h2.c(), d));
        }
        return this.a;
    }

    public AbstractC7840ll<?, Integer> k() {
        return this.p;
    }

    public AbstractC7840ll<?, Float> l() {
        return this.v;
    }

    public void m(float f) {
        AbstractC7840ll<Integer, Integer> abstractC7840ll = this.p;
        if (abstractC7840ll != null) {
            abstractC7840ll.n(f);
        }
        AbstractC7840ll<?, Float> abstractC7840ll2 = this.v;
        if (abstractC7840ll2 != null) {
            abstractC7840ll2.n(f);
        }
        AbstractC7840ll<?, Float> abstractC7840ll3 = this.w;
        if (abstractC7840ll3 != null) {
            abstractC7840ll3.n(f);
        }
        AbstractC7840ll<PointF, PointF> abstractC7840ll4 = this.l;
        if (abstractC7840ll4 != null) {
            abstractC7840ll4.n(f);
        }
        AbstractC7840ll<?, PointF> abstractC7840ll5 = this.m;
        if (abstractC7840ll5 != null) {
            abstractC7840ll5.n(f);
        }
        AbstractC7840ll<UX1, UX1> abstractC7840ll6 = this.n;
        if (abstractC7840ll6 != null) {
            abstractC7840ll6.n(f);
        }
        AbstractC7840ll<Float, Float> abstractC7840ll7 = this.f694o;
        if (abstractC7840ll7 != null) {
            abstractC7840ll7.n(f);
        }
        C8629ov0 c8629ov0 = this.q;
        if (c8629ov0 != null) {
            c8629ov0.n(f);
        }
        C8629ov0 c8629ov02 = this.r;
        if (c8629ov02 != null) {
            c8629ov02.n(f);
        }
        C8629ov0 c8629ov03 = this.s;
        if (c8629ov03 != null) {
            c8629ov03.n(f);
        }
        C8629ov0 c8629ov04 = this.t;
        if (c8629ov04 != null) {
            c8629ov04.n(f);
        }
        C8629ov0 c8629ov05 = this.u;
        if (c8629ov05 != null) {
            c8629ov05.n(f);
        }
    }
}
