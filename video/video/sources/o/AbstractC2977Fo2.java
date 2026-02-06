package o;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import o.C10000uX0;

/* renamed from: o.Fo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2977Fo2 {
    public static final String k = "SplineSet";
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static float f457o = 6.2831855f;
    public AS a;
    public int e;
    public String f;
    public long i;
    public int b = 0;
    public int[] c = new int[10];
    public float[][] d = (float[][]) Array.newInstance(Float.TYPE, 10, 3);
    public float[] g = new float[3];
    public boolean h = false;
    public float j = Float.NaN;

    /* renamed from: o.Fo2$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC2977Fo2 {
        public String p;
        public C10000uX0.a q;
        public C10000uX0.c r = new C10000uX0.c();
        public float[] s;
        public float[] t;

        public a(String str, C10000uX0.a aVar) {
            this.p = str.split(",")[1];
            this.q = aVar;
        }

        @Override // o.AbstractC2977Fo2
        public void c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // o.AbstractC2977Fo2
        public void f(int i) {
            float[] fArr;
            int f = this.q.f();
            int h = this.q.g(0).h();
            double[] dArr = new double[f];
            int i2 = h + 2;
            this.s = new float[i2];
            this.t = new float[h];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, f, i2);
            for (int i3 = 0; i3 < f; i3++) {
                int d = this.q.d(i3);
                BS g = this.q.g(i3);
                float[] g2 = this.r.g(i3);
                dArr[i3] = d * 0.01d;
                g.e(this.s);
                int i4 = 0;
                while (true) {
                    if (i4 < this.s.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[h] = g2[0];
                dArr3[h + 1] = g2[1];
            }
            this.a = AS.a(i, dArr, dArr2);
        }

        public void g(int i, BS bs, float f, int i2, float f2) {
            this.q.a(i, bs);
            this.r.a(i, new float[]{f, f2});
            this.b = Math.max(this.b, i2);
        }

        public boolean h(C10054ul1 c10054ul1, float f, long j, C8049mX0 c8049mX0) {
            boolean z;
            this.a.e(f, this.s);
            float[] fArr = this.s;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.i;
            if (Float.isNaN(this.j)) {
                float a = c8049mX0.a(c10054ul1, this.p, 0);
                this.j = a;
                if (Float.isNaN(a)) {
                    this.j = 0.0f;
                }
            }
            float f4 = (float) ((this.j + ((j2 * 1.0E-9d) * f2)) % 1.0d);
            this.j = f4;
            this.i = j;
            float a2 = a(f4);
            this.h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.t;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.h;
                float f5 = this.s[i];
                if (f5 != 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                this.h = z2 | z;
                fArr2[i] = (f5 * a2) + f3;
                i++;
            }
            c10054ul1.M(this.q.g(0), this.t);
            if (f2 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }
    }

    /* renamed from: o.Fo2$b */
    /* loaded from: classes.dex */
    public static class b extends AbstractC2977Fo2 {
        public String p;
        public C10000uX0.b q;
        public C10000uX0.c r = new C10000uX0.c();
        public float[] s;
        public float[] t;

        public b(String str, C10000uX0.b bVar) {
            this.p = str.split(",")[1];
            this.q = bVar;
        }

        @Override // o.AbstractC2977Fo2
        public void c(int i, float f, float f2, int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // o.AbstractC2977Fo2
        public void f(int i) {
            float[] fArr;
            int f = this.q.f();
            int r = this.q.g(0).r();
            double[] dArr = new double[f];
            int i2 = r + 2;
            this.s = new float[i2];
            this.t = new float[r];
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, f, i2);
            for (int i3 = 0; i3 < f; i3++) {
                int d = this.q.d(i3);
                NT g = this.q.g(i3);
                float[] g2 = this.r.g(i3);
                dArr[i3] = d * 0.01d;
                g.o(this.s);
                int i4 = 0;
                while (true) {
                    if (i4 < this.s.length) {
                        dArr2[i3][i4] = fArr[i4];
                        i4++;
                    }
                }
                double[] dArr3 = dArr2[i3];
                dArr3[r] = g2[0];
                dArr3[r + 1] = g2[1];
            }
            this.a = AS.a(i, dArr, dArr2);
        }

        public void g(int i, NT nt, float f, int i2, float f2) {
            this.q.a(i, nt);
            this.r.a(i, new float[]{f, f2});
            this.b = Math.max(this.b, i2);
        }

        public boolean h(C10054ul1 c10054ul1, float f, long j, C8049mX0 c8049mX0) {
            boolean z;
            this.a.e(f, this.s);
            float[] fArr = this.s;
            float f2 = fArr[fArr.length - 2];
            float f3 = fArr[fArr.length - 1];
            long j2 = j - this.i;
            if (Float.isNaN(this.j)) {
                float a = c8049mX0.a(c10054ul1, this.p, 0);
                this.j = a;
                if (Float.isNaN(a)) {
                    this.j = 0.0f;
                }
            }
            float f4 = (float) ((this.j + ((j2 * 1.0E-9d) * f2)) % 1.0d);
            this.j = f4;
            this.i = j;
            float a2 = a(f4);
            this.h = false;
            int i = 0;
            while (true) {
                float[] fArr2 = this.t;
                if (i >= fArr2.length) {
                    break;
                }
                boolean z2 = this.h;
                float f5 = this.s[i];
                if (f5 != 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                this.h = z2 | z;
                fArr2[i] = (f5 * a2) + f3;
                i++;
            }
            this.q.g(0).w(c10054ul1, this.t);
            if (f2 != 0.0f) {
                this.h = true;
            }
            return this.h;
        }
    }

    /* renamed from: o.Fo2$c */
    /* loaded from: classes.dex */
    public static class c {
        public static void a(int[] iArr, float[][] fArr, int i, int i2) {
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

        public static int b(int[] iArr, float[][] fArr, int i, int i2) {
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

        public static void c(int[] iArr, float[][] fArr, int i, int i2) {
            int i3 = iArr[i];
            iArr[i] = iArr[i2];
            iArr[i2] = i3;
            float[] fArr2 = fArr[i];
            fArr[i] = fArr[i2];
            fArr[i2] = fArr2;
        }
    }

    public float a(float f) {
        float abs;
        switch (this.b) {
            case 1:
                return Math.signum(f * f457o);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * f457o);
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f * f457o);
        }
        return 1.0f - abs;
    }

    public AS b() {
        return this.a;
    }

    public void c(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.c;
        int i3 = this.e;
        iArr[i3] = i;
        float[] fArr = this.d[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.b = Math.max(this.b, i2);
        this.e++;
    }

    public void d(long j) {
        this.i = j;
    }

    public void e(String str) {
        this.f = str;
    }

    public void f(int i) {
        int i2 = this.e;
        if (i2 == 0) {
            System.err.println("Error no points added to " + this.f);
            return;
        }
        c.a(this.c, this.d, 0, i2 - 1);
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int[] iArr = this.c;
            if (i3 >= iArr.length) {
                break;
            }
            if (iArr[i3] != iArr[i3 - 1]) {
                i4++;
            }
            i3++;
        }
        if (i4 == 0) {
            i4 = 1;
        }
        double[] dArr = new double[i4];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i4, 3);
        int i5 = 0;
        for (int i6 = 0; i6 < this.e; i6++) {
            if (i6 > 0) {
                int[] iArr2 = this.c;
                if (iArr2[i6] == iArr2[i6 - 1]) {
                }
            }
            dArr[i5] = this.c[i6] * 0.01d;
            double[] dArr3 = dArr2[i5];
            float[] fArr = this.d[i6];
            dArr3[0] = fArr[0];
            dArr3[1] = fArr[1];
            dArr3[2] = fArr[2];
            i5++;
        }
        this.a = AS.a(i, dArr, dArr2);
    }

    public String toString() {
        String str = this.f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.e; i++) {
            str = str + C6566gU0.f + this.c[i] + " , " + decimalFormat.format(this.d[i]) + "] ";
        }
        return str;
    }
}
