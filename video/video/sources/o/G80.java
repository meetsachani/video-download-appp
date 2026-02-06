package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Function;
import o.HT1;

@HT1({HT1.a.Y})
/* loaded from: classes3.dex */
public final class G80 {
    public final String a;
    public final Function<Y80, C5182aq2> b;
    public final Function<Y80, Double> c;
    public final boolean d;
    public final Function<Y80, G80> e;
    public final Function<Y80, G80> f;
    public final TM g;
    public final Function<Y80, C5425bq2> h;
    public final Function<Y80, Double> i;
    public final HashMap<Y80, JG0> j;

    public G80(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Function<Y80, C5182aq2> function, @InterfaceC5670cr1 Function<Y80, Double> function2, boolean z, @InterfaceC11300zs1 Function<Y80, G80> function3, @InterfaceC11300zs1 Function<Y80, G80> function4, @InterfaceC11300zs1 TM tm, @InterfaceC11300zs1 Function<Y80, C5425bq2> function5) {
        this.j = new HashMap<>();
        this.a = str;
        this.b = function;
        this.c = function2;
        this.d = z;
        this.e = function3;
        this.f = function4;
        this.g = tm;
        this.h = function5;
        this.i = null;
    }

    public static /* synthetic */ C5182aq2 b(C5182aq2 c5182aq2, Y80 y80) {
        return c5182aq2;
    }

    public static double c(double d) {
        if (l(d) && !k(d)) {
            return 49.0d;
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double d(double d, double d2) {
        boolean z;
        double d3 = SM.d(d, d2);
        double b = SM.b(d, d2);
        double e = SM.e(d3, d);
        double e2 = SM.e(b, d);
        if (l(d)) {
            if (Math.abs(e - e2) < 0.1d && e < d2 && e2 < d2) {
                z = true;
            } else {
                z = false;
            }
            if (e >= d2 || e >= e2 || z) {
                return d3;
            }
            return b;
        } else if (e2 >= d2 || e2 >= e) {
        }
    }

    @InterfaceC5670cr1
    public static G80 e(@InterfaceC5670cr1 String str, int i) {
        final JG0 b = JG0.b(i);
        final C5182aq2 c = C5182aq2.c(i);
        return f(str, new Function() { // from class: o.E80
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return G80.b(C5182aq2.this, (Y80) obj);
            }
        }, new Function() { // from class: o.F80
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double valueOf;
                Y80 y80 = (Y80) obj;
                valueOf = Double.valueOf(JG0.this.e());
                return valueOf;
            }
        });
    }

    @InterfaceC5670cr1
    public static G80 f(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Function<Y80, C5182aq2> function, @InterfaceC5670cr1 Function<Y80, Double> function2) {
        return new G80(str, function, function2, false, null, null, null, null);
    }

    @InterfaceC5670cr1
    public static G80 g(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Function<Y80, C5182aq2> function, @InterfaceC5670cr1 Function<Y80, Double> function2, boolean z) {
        return new G80(str, function, function2, z, null, null, null, null);
    }

    public static boolean k(double d) {
        if (Math.round(d) <= 49) {
            return true;
        }
        return false;
    }

    public static boolean l(double d) {
        if (Math.round(d) < 60) {
            return true;
        }
        return false;
    }

    public int h(@InterfaceC5670cr1 Y80 y80) {
        int k = i(y80).k();
        Function<Y80, Double> function = this.i;
        if (function == null) {
            return k;
        }
        return (C8558od1.b(0, 255, (int) Math.round(function.apply(y80).doubleValue() * 255.0d)) << 24) | (k & C6516gH2.x);
    }

    @InterfaceC5670cr1
    public JG0 i(@InterfaceC5670cr1 Y80 y80) {
        JG0 jg0 = this.j.get(y80);
        if (jg0 != null) {
            return jg0;
        }
        JG0 e = this.b.apply(y80).e(j(y80));
        if (this.j.size() > 4) {
            this.j.clear();
        }
        this.j.put(y80, e);
        return e;
    }

    public double j(@InterfaceC5670cr1 Y80 y80) {
        boolean z;
        double d;
        G80 g80;
        G80 g802;
        double d2;
        double d3;
        double min;
        boolean z2 = false;
        if (y80.e < 0.0d) {
            z = true;
        } else {
            z = false;
        }
        Function<Y80, C5425bq2> function = this.h;
        if (function != null) {
            C5425bq2 apply = function.apply(y80);
            G80 c = apply.c();
            G80 d4 = apply.d();
            double a = apply.a();
            EnumC5667cq2 b = apply.b();
            boolean e = apply.e();
            double j = this.e.apply(y80).j(y80);
            if (b == EnumC5667cq2.NEARER || ((b == EnumC5667cq2.LIGHTER && !y80.d) || (b == EnumC5667cq2.DARKER && y80.d))) {
                z2 = true;
            }
            if (z2) {
                g80 = c;
            } else {
                g80 = d4;
            }
            if (z2) {
                g802 = d4;
            } else {
                g802 = c;
            }
            boolean equals = this.a.equals(g80.a);
            if (y80.d) {
                d2 = 1.0d;
            } else {
                d2 = -1.0d;
            }
            double a2 = g80.g.a(y80.e);
            double a3 = g802.g.a(y80.e);
            double doubleValue = g80.c.apply(y80).doubleValue();
            if (SM.e(j, doubleValue) < a2) {
                doubleValue = d(j, a2);
            }
            boolean z3 = z;
            double doubleValue2 = g802.c.apply(y80).doubleValue();
            if (SM.e(j, doubleValue2) < a3) {
                doubleValue2 = d(j, a3);
            }
            if (z3) {
                doubleValue = d(j, a2);
                doubleValue2 = d(j, a3);
            }
            if ((doubleValue2 - doubleValue) * d2 < a) {
                double d5 = a * d2;
                double a4 = C8558od1.a(0.0d, 100.0d, doubleValue + d5);
                if ((a4 - doubleValue) * d2 < a) {
                    doubleValue = C8558od1.a(0.0d, 100.0d, a4 - d5);
                }
                doubleValue2 = a4;
            }
            if (50.0d <= doubleValue && doubleValue < 60.0d) {
                if (d2 > 0.0d) {
                    d3 = Math.max(doubleValue2, (a * d2) + 60.0d);
                    doubleValue = 60.0d;
                } else {
                    min = Math.min(doubleValue2, (a * d2) + 49.0d);
                    d3 = min;
                    doubleValue = 49.0d;
                }
            } else if (50.0d <= doubleValue2 && doubleValue2 < 60.0d) {
                if (e) {
                    if (d2 > 0.0d) {
                        d3 = Math.max(doubleValue2, (a * d2) + 60.0d);
                        doubleValue = 60.0d;
                    } else {
                        min = Math.min(doubleValue2, (a * d2) + 49.0d);
                        d3 = min;
                        doubleValue = 49.0d;
                    }
                } else if (d2 > 0.0d) {
                    d3 = 60.0d;
                } else {
                    d3 = 49.0d;
                }
            } else {
                d3 = doubleValue2;
            }
            if (equals) {
                return doubleValue;
            }
            return d3;
        }
        boolean z4 = z;
        double doubleValue3 = this.c.apply(y80).doubleValue();
        Function<Y80, G80> function2 = this.e;
        if (function2 == null) {
            return doubleValue3;
        }
        double j2 = function2.apply(y80).j(y80);
        double a5 = this.g.a(y80.e);
        if (SM.e(j2, doubleValue3) < a5) {
            doubleValue3 = d(j2, a5);
        }
        if (z4) {
            doubleValue3 = d(j2, a5);
        }
        if (this.d && 50.0d <= doubleValue3 && doubleValue3 < 60.0d) {
            d = 49.0d;
            if (SM.e(49.0d, j2) < a5) {
                d = 60.0d;
            }
        } else {
            d = doubleValue3;
        }
        if (this.f != null) {
            double j3 = this.e.apply(y80).j(y80);
            double j4 = this.f.apply(y80).j(y80);
            double max = Math.max(j3, j4);
            double min2 = Math.min(j3, j4);
            if (SM.e(max, d) < a5 || SM.e(min2, d) < a5) {
                double c2 = SM.c(max, a5);
                double a6 = SM.a(min2, a5);
                ArrayList arrayList = new ArrayList();
                int i = (c2 > (-1.0d) ? 1 : (c2 == (-1.0d) ? 0 : -1));
                if (i != 0) {
                    arrayList.add(Double.valueOf(c2));
                }
                int i2 = (a6 > (-1.0d) ? 1 : (a6 == (-1.0d) ? 0 : -1));
                if (i2 != 0) {
                    arrayList.add(Double.valueOf(a6));
                }
                if (!l(j3) && !l(j4)) {
                    if (arrayList.size() == 1) {
                        return ((Double) arrayList.get(0)).doubleValue();
                    }
                    if (i2 == 0) {
                        return 0.0d;
                    }
                    return a6;
                } else if (i == 0) {
                    return 100.0d;
                } else {
                    return c2;
                }
            }
        }
        return d;
    }

    public G80(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Function<Y80, C5182aq2> function, @InterfaceC5670cr1 Function<Y80, Double> function2, boolean z, @InterfaceC11300zs1 Function<Y80, G80> function3, @InterfaceC11300zs1 Function<Y80, G80> function4, @InterfaceC11300zs1 TM tm, @InterfaceC11300zs1 Function<Y80, C5425bq2> function5, @InterfaceC11300zs1 Function<Y80, Double> function6) {
        this.j = new HashMap<>();
        this.a = str;
        this.b = function;
        this.c = function2;
        this.d = z;
        this.e = function3;
        this.f = function4;
        this.g = tm;
        this.h = function5;
        this.i = function6;
    }
}
