package o;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import o.C10000uX0;
import o.InterfaceC8148mw2;

/* renamed from: o.Xa2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4678Xa2 {
    public static final String f = "SplineSet";
    public AS a;
    public int[] b = new int[10];
    public float[] c = new float[10];
    public int d;
    public String e;

    /* renamed from: o.Xa2$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC4678Xa2 {
        public String g;
        public long h;

        public a(String str, long j) {
            this.g = str;
            this.h = j;
        }

        @Override // o.AbstractC4678Xa2
        public void h(InterfaceC8148mw2 interfaceC8148mw2, float f) {
            interfaceC8148mw2.c(interfaceC8148mw2.a(this.g), a(f));
        }
    }

    /* renamed from: o.Xa2$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC4678Xa2 {
        public String g;
        public C10000uX0.a h;
        public float[] i;

        public b(String str, C10000uX0.a aVar) {
            this.g = str.split(",")[1];
            this.h = aVar;
        }

        @Override // o.AbstractC4678Xa2
        public void g(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // o.AbstractC4678Xa2
        public void j(int i) {
            float[] fArr;
            int f = this.h.f();
            int h = this.h.g(0).h();
            double[] dArr = new double[f];
            this.i = new float[h];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, f, h);
            for (int i2 = 0; i2 < f; i2++) {
                int d = this.h.d(i2);
                BS g = this.h.g(i2);
                dArr[i2] = d * 0.01d;
                g.e(this.i);
                int i3 = 0;
                while (true) {
                    if (i3 < this.i.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.a = AS.a(i, dArr, dArr2);
        }

        public void k(int i, BS bs) {
            this.h.a(i, bs);
        }

        public void l(UK2 uk2, float f) {
            this.a.e(f, this.i);
            uk2.B(this.h.g(0), this.i);
        }
    }

    /* renamed from: o.Xa2$c */
    /* loaded from: classes.dex */
    public static class c extends AbstractC4678Xa2 {
        public String g;
        public C10000uX0.b h;
        public float[] i;

        public c(String str, C10000uX0.b bVar) {
            this.g = str.split(",")[1];
            this.h = bVar;
        }

        @Override // o.AbstractC4678Xa2
        public void g(int i, float f) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // o.AbstractC4678Xa2
        public void h(InterfaceC8148mw2 interfaceC8148mw2, float f) {
            l((C10054ul1) interfaceC8148mw2, f);
        }

        @Override // o.AbstractC4678Xa2
        public void j(int i) {
            float[] fArr;
            int f = this.h.f();
            int r = this.h.g(0).r();
            double[] dArr = new double[f];
            this.i = new float[r];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, f, r);
            for (int i2 = 0; i2 < f; i2++) {
                int d = this.h.d(i2);
                NT g = this.h.g(i2);
                dArr[i2] = d * 0.01d;
                g.o(this.i);
                int i3 = 0;
                while (true) {
                    if (i3 < this.i.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.a = AS.a(i, dArr, dArr2);
        }

        public void k(int i, NT nt) {
            this.h.a(i, nt);
        }

        public void l(C10054ul1 c10054ul1, float f) {
            this.a.e(f, this.i);
            this.h.g(0).w(c10054ul1, this.i);
        }
    }

    /* renamed from: o.Xa2$d */
    /* loaded from: classes.dex */
    public static class d {
        public static void a(int[] iArr, float[] fArr, int i, int i2) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i2;
            iArr2[1] = i;
            int i3 = 2;
            while (i3 > 0) {
                int i4 = iArr2[i3 - 1];
                int i5 = i3 - 2;
                int i6 = iArr2[i5];
                if (i4 < i6) {
                    int b = b(iArr, fArr, i4, i6);
                    iArr2[i5] = b - 1;
                    iArr2[i3 - 1] = i4;
                    int i7 = i3 + 1;
                    iArr2[i3] = i6;
                    i3 += 2;
                    iArr2[i7] = b + 1;
                } else {
                    i3 = i5;
                }
            }
        }

        public static int b(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i2];
            int i4 = i;
            while (i < i2) {
                if (iArr[i] <= i3) {
                    c(iArr, fArr, i4, i);
                    i4++;
                }
                i++;
            }
            c(iArr, fArr, i4, i2);
            return i4;
        }

        public static void c(int[] iArr, float[] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float f = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = f;
        }
    }

    public static AbstractC4678Xa2 d(String str, C10000uX0.a aVar) {
        return new b(str, aVar);
    }

    public static AbstractC4678Xa2 e(String str, C10000uX0.b bVar) {
        return new c(str, bVar);
    }

    public static AbstractC4678Xa2 f(String str, long j) {
        return new a(str, j);
    }

    public float a(float f2) {
        return (float) this.a.c(f2, 0);
    }

    public AS b() {
        return this.a;
    }

    public float c(float f2) {
        return (float) this.a.f(f2, 0);
    }

    public void g(int i, float f2) {
        int[] iArr = this.b;
        if (iArr.length < this.d + 1) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.c;
            this.c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i2 = this.d;
        iArr2[i2] = i;
        this.c[i2] = f2;
        this.d = i2 + 1;
    }

    public void h(InterfaceC8148mw2 interfaceC8148mw2, float f2) {
        interfaceC8148mw2.c(InterfaceC8148mw2.a.a(this.e), a(f2));
    }

    public void i(String str) {
        this.e = str;
    }

    public void j(int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return;
        }
        d.a(this.b, this.c, 0, i2 - 1);
        int i3 = 1;
        for (int i4 = 1; i4 < this.d; i4++) {
            int[] iArr = this.b;
            if (iArr[i4 - 1] != iArr[i4]) {
                i3++;
            }
        }
        double[] dArr = new double[i3];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i3, 1);
        int i5 = 0;
        for (int i6 = 0; i6 < this.d; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.b;
                if (iArr2[i6] == iArr2[i6 - 1]) {
                }
            }
            dArr[i5] = this.b[i6] * 0.01d;
            dArr2[i5][0] = this.c[i6];
            i5++;
        }
        this.a = AS.a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.d; i++) {
            str = str + C6566gU0.f + this.b[i] + " , " + decimalFormat.format(this.c[i]) + "] ";
        }
        return str;
    }
}
