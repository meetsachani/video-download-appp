package o;

import java.util.HashMap;
import java.util.Map;
import o.HT1;

@HT1({HT1.a.Y})
/* renamed from: o.aq2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5182aq2 {
    public Map<Integer, Integer> a = new HashMap();
    public JG0 b;
    public double c;
    public double d;

    /* renamed from: o.aq2$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final double d = 200.0d;
        public final double a;
        public final double b;
        public final Map<Integer, Double> c = new HashMap();

        public a(double d2, double d3) {
            this.a = d2;
            this.b = d3;
        }

        public JG0 a() {
            boolean z;
            int i = 100;
            int i2 = 0;
            while (i2 < i) {
                int i3 = (i2 + i) / 2;
                int i4 = i3 + 1;
                if (b(i3) < b(i4)) {
                    z = true;
                } else {
                    z = false;
                }
                if (b(i3) >= this.b - 0.01d) {
                    if (Math.abs(i2 - 50) >= Math.abs(i - 50)) {
                        if (i2 == i3) {
                            return JG0.a(this.a, this.b, i2);
                        }
                        i2 = i3;
                    } else {
                        i = i3;
                    }
                } else if (z) {
                    i2 = i4;
                } else {
                    i = i3;
                }
            }
            return JG0.a(this.a, this.b, i2);
        }

        public final double b(int i) {
            if (this.c.get(Integer.valueOf(i)) == null) {
                this.c.put(Integer.valueOf(i), Double.valueOf(JG0.a(this.a, 200.0d, i).c()));
            }
            return this.c.get(Integer.valueOf(i)).doubleValue();
        }
    }

    public C5182aq2(double d, double d2, JG0 jg0) {
        this.c = d;
        this.d = d2;
        this.b = jg0;
    }

    public static C5182aq2 a(JG0 jg0) {
        return new C5182aq2(jg0.d(), jg0.c(), jg0);
    }

    public static C5182aq2 b(double d, double d2) {
        return new C5182aq2(d, d2, new a(d, d2).a());
    }

    public static C5182aq2 c(int i) {
        return a(JG0.b(i));
    }

    public double d() {
        return this.d;
    }

    public JG0 e(double d) {
        return JG0.a(this.c, this.d, d);
    }

    public double f() {
        return this.c;
    }

    public JG0 g() {
        return this.b;
    }

    public int h(int i) {
        Integer num = this.a.get(Integer.valueOf(i));
        if (num == null) {
            num = Integer.valueOf(JG0.a(this.c, this.d, i).k());
            this.a.put(Integer.valueOf(i), num);
        }
        return num.intValue();
    }
}
