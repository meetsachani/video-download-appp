package o;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;
import o.NV0;

/* loaded from: classes.dex */
public class NX0 {
    public static final float a = 100.0f;
    public static C10986ya2<WeakReference<Interpolator>> c;
    public static final Interpolator b = new LinearInterpolator();
    public static NV0.a d = NV0.a.a("t", "s", W12.i, W12.e, "i", C10901yE.i, "to", "ti");
    public static NV0.a e = NV0.a.a("x", C5738d80.b);

    public static WeakReference<Interpolator> a(int i) {
        WeakReference<Interpolator> h;
        synchronized (NX0.class) {
            h = g().h(i);
        }
        return h;
    }

    public static Interpolator b(PointF pointF, PointF pointF2) {
        WeakReference<Interpolator> a2;
        Interpolator linearInterpolator;
        pointF.x = C4713Xj1.c(pointF.x, -1.0f, 1.0f);
        pointF.y = C4713Xj1.c(pointF.y, -100.0f, 100.0f);
        pointF2.x = C4713Xj1.c(pointF2.x, -1.0f, 1.0f);
        float c2 = C4713Xj1.c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c2;
        int i = C6006eE2.i(pointF.x, pointF.y, pointF2.x, c2);
        Interpolator interpolator = null;
        if (ZX0.e()) {
            a2 = null;
        } else {
            a2 = a(i);
        }
        if (a2 != null) {
            interpolator = a2.get();
        }
        if (a2 != null && interpolator != null) {
            return interpolator;
        }
        try {
            linearInterpolator = C6928hz1.b(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e2) {
            if ("The Path cannot loop back on itself.".equals(e2.getMessage())) {
                linearInterpolator = C6928hz1.b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            } else {
                linearInterpolator = new LinearInterpolator();
            }
        }
        if (!ZX0.e()) {
            try {
                h(i, new WeakReference(linearInterpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return linearInterpolator;
    }

    public static <T> LX0<T> c(NV0 nv0, C10624x51 c10624x51, float f, GE2<T> ge2, boolean z, boolean z2) throws IOException {
        if (z && z2) {
            return e(c10624x51, nv0, f, ge2);
        }
        if (z) {
            return d(c10624x51, nv0, f, ge2);
        }
        return f(nv0, f, ge2);
    }

    public static <T> LX0<T> d(C10624x51 c10624x51, NV0 nv0, float f, GE2<T> ge2) throws IOException {
        Interpolator interpolator;
        Interpolator interpolator2;
        T t;
        nv0.f();
        PointF pointF = null;
        T t2 = null;
        T t3 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f2 = 0.0f;
        boolean z = false;
        PointF pointF4 = null;
        while (nv0.j()) {
            switch (nv0.s(d)) {
                case 0:
                    f2 = (float) nv0.l();
                    break;
                case 1:
                    t3 = ge2.a(nv0, f);
                    break;
                case 2:
                    t2 = ge2.a(nv0, f);
                    break;
                case 3:
                    pointF = C5347bW0.e(nv0, 1.0f);
                    break;
                case 4:
                    pointF4 = C5347bW0.e(nv0, 1.0f);
                    break;
                case 5:
                    if (nv0.m() == 1) {
                        z = true;
                        break;
                    } else {
                        z = false;
                        break;
                    }
                case 6:
                    pointF2 = C5347bW0.e(nv0, f);
                    break;
                case 7:
                    pointF3 = C5347bW0.e(nv0, f);
                    break;
                default:
                    nv0.u();
                    break;
            }
        }
        nv0.i();
        if (z) {
            interpolator2 = b;
            t = t3;
        } else {
            if (pointF != null && pointF4 != null) {
                interpolator = b(pointF, pointF4);
            } else {
                interpolator = b;
            }
            interpolator2 = interpolator;
            t = t2;
        }
        LX0<T> lx0 = new LX0<>(c10624x51, t3, t, interpolator2, f2, null);
        lx0.f536o = pointF2;
        lx0.p = pointF3;
        return lx0;
    }

    public static <T> LX0<T> e(C10624x51 c10624x51, NV0 nv0, float f, GE2<T> ge2) throws IOException {
        Interpolator interpolator;
        Interpolator b2;
        Interpolator b3;
        T t;
        Interpolator interpolator2;
        PointF pointF;
        PointF pointF2;
        LX0<T> lx0;
        PointF pointF3;
        boolean z;
        float f2;
        nv0.f();
        boolean z2 = false;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        T t2 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        float f3 = 0.0f;
        T t3 = null;
        while (nv0.j()) {
            switch (nv0.s(d)) {
                case 0:
                    f3 = (float) nv0.l();
                    break;
                case 1:
                    t2 = ge2.a(nv0, f);
                    break;
                case 2:
                    t3 = ge2.a(nv0, f);
                    break;
                case 3:
                    boolean z3 = z2;
                    if (nv0.q() == NV0.b.BEGIN_OBJECT) {
                        nv0.f();
                        float f4 = 0.0f;
                        float f5 = 0.0f;
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        while (nv0.j()) {
                            int s = nv0.s(e);
                            if (s != 0) {
                                if (s != 1) {
                                    nv0.u();
                                } else {
                                    NV0.b q = nv0.q();
                                    NV0.b bVar = NV0.b.NUMBER;
                                    if (q == bVar) {
                                        pointF3 = pointF8;
                                        f7 = (float) nv0.l();
                                        f5 = f7;
                                    } else {
                                        pointF3 = pointF8;
                                        nv0.d();
                                        f5 = (float) nv0.l();
                                        if (nv0.q() == bVar) {
                                            f7 = (float) nv0.l();
                                        } else {
                                            f7 = f5;
                                        }
                                        nv0.h();
                                    }
                                }
                            } else {
                                pointF3 = pointF8;
                                NV0.b q2 = nv0.q();
                                NV0.b bVar2 = NV0.b.NUMBER;
                                if (q2 == bVar2) {
                                    f6 = (float) nv0.l();
                                    f4 = f6;
                                } else {
                                    nv0.d();
                                    f4 = (float) nv0.l();
                                    if (nv0.q() == bVar2) {
                                        f6 = (float) nv0.l();
                                    } else {
                                        f6 = f4;
                                    }
                                    nv0.h();
                                }
                            }
                            pointF8 = pointF3;
                        }
                        pointF6 = new PointF(f4, f5);
                        pointF7 = new PointF(f6, f7);
                        nv0.i();
                    } else {
                        pointF4 = C5347bW0.e(nv0, f);
                    }
                    z2 = z3;
                    break;
                case 4:
                    if (nv0.q() == NV0.b.BEGIN_OBJECT) {
                        nv0.f();
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        while (nv0.j()) {
                            int s2 = nv0.s(e);
                            if (s2 != 0) {
                                z = z2;
                                if (s2 != 1) {
                                    nv0.u();
                                } else {
                                    NV0.b q3 = nv0.q();
                                    NV0.b bVar3 = NV0.b.NUMBER;
                                    if (q3 == bVar3) {
                                        f11 = (float) nv0.l();
                                        f9 = f11;
                                    } else {
                                        nv0.d();
                                        PointF pointF12 = pointF10;
                                        float l = (float) nv0.l();
                                        if (nv0.q() == bVar3) {
                                            f11 = (float) nv0.l();
                                        } else {
                                            f11 = l;
                                        }
                                        nv0.h();
                                        pointF10 = pointF12;
                                        f9 = l;
                                    }
                                }
                            } else {
                                z = z2;
                                PointF pointF13 = pointF10;
                                NV0.b q4 = nv0.q();
                                NV0.b bVar4 = NV0.b.NUMBER;
                                if (q4 == bVar4) {
                                    pointF10 = pointF13;
                                    f10 = (float) nv0.l();
                                    f8 = f10;
                                } else {
                                    pointF10 = pointF13;
                                    nv0.d();
                                    float l2 = (float) nv0.l();
                                    if (nv0.q() == bVar4) {
                                        f2 = l2;
                                        f10 = (float) nv0.l();
                                    } else {
                                        f2 = l2;
                                        f10 = f2;
                                    }
                                    nv0.h();
                                    f8 = f2;
                                }
                            }
                            z2 = z;
                        }
                        PointF pointF14 = new PointF(f8, f9);
                        PointF pointF15 = new PointF(f10, f11);
                        nv0.i();
                        pointF9 = pointF15;
                        pointF8 = pointF14;
                        break;
                    } else {
                        pointF5 = C5347bW0.e(nv0, f);
                        break;
                    }
                case 5:
                    if (nv0.m() == 1) {
                        z2 = true;
                        break;
                    } else {
                        z2 = false;
                        break;
                    }
                case 6:
                    pointF10 = C5347bW0.e(nv0, f);
                    break;
                case 7:
                    pointF11 = C5347bW0.e(nv0, f);
                    break;
                default:
                    nv0.u();
                    break;
            }
        }
        boolean z4 = z2;
        PointF pointF16 = pointF8;
        nv0.i();
        if (z4) {
            interpolator2 = b;
            t = t2;
        } else {
            if (pointF4 != null && pointF5 != null) {
                interpolator = b(pointF4, pointF5);
            } else if (pointF6 != null && pointF7 != null && pointF16 != null && pointF9 != null) {
                b2 = b(pointF6, pointF16);
                b3 = b(pointF7, pointF9);
                t = t3;
                interpolator2 = null;
                if (b2 == null && b3 != null) {
                    pointF2 = pointF11;
                    pointF = pointF10;
                    lx0 = new LX0<>(c10624x51, t2, t, b2, b3, f3, null);
                } else {
                    pointF = pointF10;
                    pointF2 = pointF11;
                    lx0 = new LX0<>(c10624x51, t2, t, interpolator2, f3, null);
                }
                lx0.f536o = pointF;
                lx0.p = pointF2;
                return lx0;
            } else {
                interpolator = b;
            }
            interpolator2 = interpolator;
            t = t3;
        }
        b2 = null;
        b3 = null;
        if (b2 == null) {
        }
        pointF = pointF10;
        pointF2 = pointF11;
        lx0 = new LX0<>(c10624x51, t2, t, interpolator2, f3, null);
        lx0.f536o = pointF;
        lx0.p = pointF2;
        return lx0;
    }

    public static <T> LX0<T> f(NV0 nv0, float f, GE2<T> ge2) throws IOException {
        return new LX0<>(ge2.a(nv0, f));
    }

    public static C10986ya2<WeakReference<Interpolator>> g() {
        if (c == null) {
            c = new C10986ya2<>();
        }
        return c;
    }

    public static void h(int i, WeakReference<Interpolator> weakReference) {
        synchronized (NX0.class) {
            c.o(i, weakReference);
        }
    }
}
