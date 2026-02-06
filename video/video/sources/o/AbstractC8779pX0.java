package o;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import o.InterfaceC8148mw2;

/* renamed from: o.pX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8779pX0 {
    public static final String h = "KeyCycleOscillator";
    public AS a;
    public c b;
    public String c;
    public int d = 0;
    public String e = null;
    public int f = 0;
    public ArrayList<e> g = new ArrayList<>();

    /* renamed from: o.pX0$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<e> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(e eVar, e eVar2) {
            return Integer.compare(eVar.a, eVar2.a);
        }
    }

    /* renamed from: o.pX0$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC8779pX0 {
        public String i;
        public int j;

        public b(String str) {
            this.i = str;
            this.j = InterfaceC8148mw2.c.a(str);
        }

        @Override // o.AbstractC8779pX0
        public void h(C10054ul1 c10054ul1, float f) {
            c10054ul1.c(this.j, a(f));
        }
    }

    /* renamed from: o.pX0$c */
    /* loaded from: classes.dex */
    public static class c {
        public static final int q = -1;
        public static final String r = "CycleOscillator";
        public final int a;
        public C11073yw1 b;
        public final int c;
        public final int d;
        public final int e;
        public float[] f;
        public double[] g;
        public float[] h;
        public float[] i;
        public float[] j;
        public float[] k;
        public int l;
        public AS m;
        public double[] n;

        /* renamed from: o  reason: collision with root package name */
        public double[] f835o;
        public float p;

        public c(int i, String str, int i2, int i3) {
            C11073yw1 c11073yw1 = new C11073yw1();
            this.b = c11073yw1;
            this.c = 0;
            this.d = 1;
            this.e = 2;
            this.l = i;
            this.a = i2;
            c11073yw1.g(i, str);
            this.f = new float[i3];
            this.g = new double[i3];
            this.h = new float[i3];
            this.i = new float[i3];
            this.j = new float[i3];
            this.k = new float[i3];
        }

        public double a() {
            return this.n[1];
        }

        public double b(float f) {
            AS as = this.m;
            if (as != null) {
                double d = f;
                as.g(d, this.f835o);
                this.m.d(d, this.n);
            } else {
                double[] dArr = this.f835o;
                dArr[0] = 0.0d;
                dArr[1] = 0.0d;
                dArr[2] = 0.0d;
            }
            double d2 = f;
            double e = this.b.e(d2, this.n[1]);
            double d3 = this.b.d(d2, this.n[1], this.f835o[1]);
            double[] dArr2 = this.f835o;
            return dArr2[0] + (e * dArr2[2]) + (d3 * this.n[2]);
        }

        public double c(float f) {
            AS as = this.m;
            if (as != null) {
                as.d(f, this.n);
            } else {
                double[] dArr = this.n;
                dArr[0] = this.i[0];
                dArr[1] = this.j[0];
                dArr[2] = this.f[0];
            }
            double[] dArr2 = this.n;
            return dArr2[0] + (this.b.e(f, dArr2[1]) * this.n[2]);
        }

        public void d(int i, int i2, float f, float f2, float f3, float f4) {
            this.g[i] = i2 / 100.0d;
            this.h[i] = f;
            this.i[i] = f2;
            this.j[i] = f3;
            this.f[i] = f4;
        }

        public void e(float f) {
            this.p = f;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, this.g.length, 3);
            float[] fArr = this.f;
            this.n = new double[fArr.length + 2];
            this.f835o = new double[fArr.length + 2];
            if (this.g[0] > 0.0d) {
                this.b.a(0.0d, this.h[0]);
            }
            double[] dArr2 = this.g;
            int length = dArr2.length - 1;
            if (dArr2[length] < 1.0d) {
                this.b.a(1.0d, this.h[length]);
            }
            for (int i = 0; i < dArr.length; i++) {
                double[] dArr3 = dArr[i];
                dArr3[0] = this.i[i];
                dArr3[1] = this.j[i];
                dArr3[2] = this.f[i];
                this.b.a(this.g[i], this.h[i]);
            }
            this.b.f();
            double[] dArr4 = this.g;
            if (dArr4.length > 1) {
                this.m = AS.a(0, dArr4, dArr);
            } else {
                this.m = null;
            }
        }
    }

    /* renamed from: o.pX0$d */
    /* loaded from: classes.dex */
    public static class d extends AbstractC8779pX0 {
        public String i;
        public int j;

        public d(String str) {
            this.i = str;
            this.j = InterfaceC8148mw2.c.a(str);
        }

        @Override // o.AbstractC8779pX0
        public void h(C10054ul1 c10054ul1, float f) {
            c10054ul1.c(this.j, a(f));
        }

        public void l(C10054ul1 c10054ul1, float f, double d, double d2) {
            c10054ul1.R(a(f) + ((float) Math.toDegrees(Math.atan2(d2, d))));
        }
    }

    /* renamed from: o.pX0$e */
    /* loaded from: classes.dex */
    public static class e {
        public int a;
        public float b;
        public float c;
        public float d;
        public float e;

        public e(int i, float f, float f2, float f3, float f4) {
            this.a = i;
            this.b = f4;
            this.c = f2;
            this.d = f;
            this.e = f3;
        }
    }

    public static AbstractC8779pX0 d(String str) {
        if (str.equals("pathRotate")) {
            return new d(str);
        }
        return new b(str);
    }

    public float a(float f) {
        return (float) this.b.c(f);
    }

    public AS b() {
        return this.a;
    }

    public float c(float f) {
        return (float) this.b.b(f);
    }

    public void f(int i, int i2, String str, int i3, float f, float f2, float f3, float f4) {
        this.g.add(new e(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f = i3;
        }
        this.d = i2;
        this.e = str;
    }

    public void g(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.g.add(new e(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.f = i3;
        }
        this.d = i2;
        e(obj);
        this.e = str;
    }

    public void i(String str) {
        this.c = str;
    }

    public void j(float f) {
        int size = this.g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.g, new a());
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, 3);
        this.b = new c(this.d, this.e, this.f, size);
        Iterator<e> it = this.g.iterator();
        int i = 0;
        while (it.hasNext()) {
            e next = it.next();
            float f2 = next.d;
            dArr[i] = f2 * 0.01d;
            double[] dArr3 = dArr2[i];
            float f3 = next.b;
            dArr3[0] = f3;
            float f4 = next.c;
            dArr3[1] = f4;
            float f5 = next.e;
            dArr3[2] = f5;
            this.b.d(i, next.a, f2, f4, f5, f3);
            i++;
        }
        this.b.e(f);
        this.a = AS.a(0, dArr, dArr2);
    }

    public boolean k() {
        if (this.f == 1) {
            return true;
        }
        return false;
    }

    public String toString() {
        String str = this.c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<e> it = this.g.iterator();
        while (it.hasNext()) {
            e next = it.next();
            str = str + C6566gU0.f + next.a + " , " + decimalFormat.format(next.b) + "] ";
        }
        return str;
    }

    public void e(Object obj) {
    }

    public void h(C10054ul1 c10054ul1, float f) {
    }
}
