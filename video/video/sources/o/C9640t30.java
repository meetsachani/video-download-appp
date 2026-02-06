package o;

import o.UK;

/* renamed from: o.t30  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9640t30 {
    public static final Object i = new String("FIXED_DIMENSION");
    public static final Object j = new String("WRAP_DIMENSION");
    public static final Object k = new String("SPREAD_DIMENSION");
    public static final Object l = new String("PARENT_DIMENSION");
    public static final Object m = new String("PERCENT_DIMENSION");
    public static final Object n = new String("RATIO_DIMENSION");
    public final int a;
    public int b;
    public int c;
    public float d;
    public int e;
    public String f;
    public Object g;
    public boolean h;

    /* renamed from: o.t30$a */
    /* loaded from: classes.dex */
    public enum a {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public C9640t30() {
        this.a = -2;
        this.b = 0;
        this.c = Integer.MAX_VALUE;
        this.d = 1.0f;
        this.e = 0;
        this.f = null;
        this.g = j;
        this.h = false;
    }

    @Deprecated
    public static C9640t30 a(int i2) {
        return k(i2);
    }

    @Deprecated
    public static C9640t30 b(Object obj) {
        C9640t30 c9640t30 = new C9640t30(i);
        c9640t30.v(obj);
        return c9640t30;
    }

    @Deprecated
    public static C9640t30 c() {
        return m();
    }

    @Deprecated
    public static C9640t30 d(Object obj, float f) {
        return n(obj, f);
    }

    @Deprecated
    public static C9640t30 e(String str) {
        return o(str);
    }

    @Deprecated
    public static C9640t30 f() {
        return p();
    }

    @Deprecated
    public static C9640t30 g(int i2) {
        return q(i2);
    }

    @Deprecated
    public static C9640t30 h(Object obj) {
        return r(obj);
    }

    @Deprecated
    public static C9640t30 i() {
        return s();
    }

    public static C9640t30 k(int i2) {
        C9640t30 c9640t30 = new C9640t30(i);
        c9640t30.u(i2);
        return c9640t30;
    }

    public static C9640t30 l(Object obj) {
        C9640t30 c9640t30 = new C9640t30(i);
        c9640t30.v(obj);
        return c9640t30;
    }

    public static C9640t30 m() {
        return new C9640t30(l);
    }

    public static C9640t30 n(Object obj, float f) {
        C9640t30 c9640t30 = new C9640t30(m);
        c9640t30.B(obj, f);
        return c9640t30;
    }

    public static C9640t30 o(String str) {
        C9640t30 c9640t30 = new C9640t30(n);
        c9640t30.C(str);
        return c9640t30;
    }

    public static C9640t30 p() {
        return new C9640t30(k);
    }

    public static C9640t30 q(int i2) {
        C9640t30 c9640t30 = new C9640t30();
        c9640t30.E(i2);
        return c9640t30;
    }

    public static C9640t30 r(Object obj) {
        C9640t30 c9640t30 = new C9640t30();
        c9640t30.F(obj);
        return c9640t30;
    }

    public static C9640t30 s() {
        return new C9640t30(j);
    }

    public C9640t30 A(Object obj) {
        if (obj == j) {
            this.b = -2;
        }
        return this;
    }

    public C9640t30 B(Object obj, float f) {
        this.d = f;
        return this;
    }

    public C9640t30 C(String str) {
        this.f = str;
        return this;
    }

    public void D(int i2) {
        this.h = false;
        this.g = null;
        this.e = i2;
    }

    public C9640t30 E(int i2) {
        this.h = true;
        if (i2 >= 0) {
            this.c = i2;
        }
        return this;
    }

    public C9640t30 F(Object obj) {
        this.g = obj;
        this.h = true;
        return this;
    }

    public void j(C8068mc2 c8068mc2, UK uk, int i2) {
        String str = this.f;
        if (str != null) {
            uk.o1(str);
        }
        int i3 = 2;
        if (i2 == 0) {
            if (this.h) {
                uk.E1(UK.b.MATCH_CONSTRAINT);
                Object obj = this.g;
                if (obj == j) {
                    i3 = 1;
                } else if (obj != m) {
                    i3 = 0;
                }
                uk.F1(i3, this.b, this.c, this.d);
                return;
            }
            int i4 = this.b;
            if (i4 > 0) {
                uk.Q1(i4);
            }
            int i5 = this.c;
            if (i5 < Integer.MAX_VALUE) {
                uk.N1(i5);
            }
            Object obj2 = this.g;
            if (obj2 == j) {
                uk.E1(UK.b.WRAP_CONTENT);
            } else if (obj2 == l) {
                uk.E1(UK.b.MATCH_PARENT);
            } else if (obj2 == null) {
                uk.E1(UK.b.FIXED);
                uk.d2(this.e);
            }
        } else if (this.h) {
            uk.Z1(UK.b.MATCH_CONSTRAINT);
            Object obj3 = this.g;
            if (obj3 == j) {
                i3 = 1;
            } else if (obj3 != m) {
                i3 = 0;
            }
            uk.a2(i3, this.b, this.c, this.d);
        } else {
            int i6 = this.b;
            if (i6 > 0) {
                uk.P1(i6);
            }
            int i7 = this.c;
            if (i7 < Integer.MAX_VALUE) {
                uk.M1(i7);
            }
            Object obj4 = this.g;
            if (obj4 == j) {
                uk.Z1(UK.b.WRAP_CONTENT);
            } else if (obj4 == l) {
                uk.Z1(UK.b.MATCH_PARENT);
            } else if (obj4 == null) {
                uk.Z1(UK.b.FIXED);
                uk.z1(this.e);
            }
        }
    }

    public boolean t(int i2) {
        if (this.g == null && this.e == i2) {
            return true;
        }
        return false;
    }

    public C9640t30 u(int i2) {
        this.g = null;
        this.e = i2;
        return this;
    }

    public C9640t30 v(Object obj) {
        this.g = obj;
        if (obj instanceof Integer) {
            this.e = ((Integer) obj).intValue();
            this.g = null;
        }
        return this;
    }

    public int w() {
        return this.e;
    }

    public C9640t30 x(int i2) {
        if (this.c >= 0) {
            this.c = i2;
        }
        return this;
    }

    public C9640t30 y(Object obj) {
        Object obj2 = j;
        if (obj == obj2 && this.h) {
            this.g = obj2;
            this.c = Integer.MAX_VALUE;
        }
        return this;
    }

    public C9640t30 z(int i2) {
        if (i2 >= 0) {
            this.b = i2;
        }
        return this;
    }

    public C9640t30(Object obj) {
        this.a = -2;
        this.b = 0;
        this.c = Integer.MAX_VALUE;
        this.d = 1.0f;
        this.e = 0;
        this.f = null;
        this.h = false;
        this.g = obj;
    }
}
