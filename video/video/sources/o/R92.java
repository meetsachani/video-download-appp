package o;

import java.io.PrintStream;
import java.util.Arrays;
import o.C3130He;

/* loaded from: classes.dex */
public class R92 implements C3130He.a {
    public static final boolean n = false;

    /* renamed from: o  reason: collision with root package name */
    public static final boolean f594o = true;
    public static float p = 0.001f;
    public final int a = -1;
    public int b = 16;
    public int c = 16;
    public int[] d = new int[16];
    public int[] e = new int[16];
    public int[] f = new int[16];
    public float[] g = new float[16];
    public int[] h = new int[16];
    public int[] i = new int[16];
    public int j = 0;
    public int k = -1;
    public final C3130He l;
    public final C5191at m;

    public R92(C3130He c3130He, C5191at c5191at) {
        this.l = c3130He;
        this.m = c5191at;
        clear();
    }

    public final void a(Q92 q92, int i) {
        int[] iArr;
        int i2 = q92.Z % this.c;
        int[] iArr2 = this.d;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.e;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                }
                i3 = i4;
            }
            iArr[i3] = i;
        }
        this.e[i] = -1;
    }

    public final void b(int i, Q92 q92, float f) {
        this.f[i] = q92.Z;
        this.g[i] = f;
        this.h[i] = -1;
        this.i[i] = -1;
        q92.e(this.l);
        q92.h1++;
        this.j++;
    }

    public final void c() {
        for (int i = 0; i < this.c; i++) {
            if (this.d[i] != -1) {
                String str = hashCode() + " hash [" + i + "] => ";
                int i2 = this.d[i];
                boolean z = false;
                while (!z) {
                    str = str + C4500Ve2.b + this.f[i2];
                    int i3 = this.e[i2];
                    if (i3 != -1) {
                        i2 = i3;
                    } else {
                        z = true;
                    }
                }
                System.out.println(str);
            }
        }
    }

    @Override // o.C3130He.a
    public void clear() {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            Q92 f = f(i2);
            if (f != null) {
                f.m(this.l);
            }
        }
        for (int i3 = 0; i3 < this.b; i3++) {
            this.f[i3] = -1;
            this.e[i3] = -1;
        }
        for (int i4 = 0; i4 < this.c; i4++) {
            this.d[i4] = -1;
        }
        this.j = 0;
        this.k = -1;
    }

    @Override // o.C3130He.a
    public int d() {
        return this.j;
    }

    @Override // o.C3130He.a
    public float e(Q92 q92) {
        int m = m(q92);
        if (m != -1) {
            return this.g[m];
        }
        return 0.0f;
    }

    @Override // o.C3130He.a
    public Q92 f(int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.m.d[this.f[i3]];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // o.C3130He.a
    public float g(Q92 q92, boolean z) {
        int m = m(q92);
        if (m == -1) {
            return 0.0f;
        }
        u(q92);
        float f = this.g[m];
        if (this.k == m) {
            this.k = this.i[m];
        }
        this.f[m] = -1;
        int[] iArr = this.h;
        int i = iArr[m];
        if (i != -1) {
            int[] iArr2 = this.i;
            iArr2[i] = iArr2[m];
        }
        int i2 = this.i[m];
        if (i2 != -1) {
            iArr[i2] = iArr[m];
        }
        this.j--;
        q92.h1--;
        if (z) {
            q92.m(this.l);
        }
        return f;
    }

    @Override // o.C3130He.a
    public void h() {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // o.C3130He.a
    public void i(Q92 q92, float f) {
        float f2 = p;
        if (f > (-f2) && f < f2) {
            g(q92, true);
            return;
        }
        if (this.j == 0) {
            b(0, q92, f);
            a(q92, 0);
            this.k = 0;
            return;
        }
        int m = m(q92);
        if (m != -1) {
            this.g[m] = f;
            return;
        }
        if (this.j + 1 >= this.b) {
            s();
        }
        int i = this.j;
        int i2 = this.k;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = this.f[i2];
            int i6 = q92.Z;
            if (i5 == i6) {
                this.g[i2] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i2;
            }
            i2 = this.i[i2];
            if (i2 == -1) {
                break;
            }
        }
        t(i3, q92, f);
    }

    @Override // o.C3130He.a
    public boolean j(Q92 q92) {
        if (m(q92) != -1) {
            return true;
        }
        return false;
    }

    @Override // o.C3130He.a
    public int k() {
        return 0;
    }

    @Override // o.C3130He.a
    public void l() {
        int i = this.j;
        System.out.print("{ ");
        for (int i2 = 0; i2 < i; i2++) {
            Q92 f = f(i2);
            if (f != null) {
                PrintStream printStream = System.out;
                printStream.print(f + " = " + n(i2) + C4500Ve2.b);
            }
        }
        System.out.println(" }");
    }

    @Override // o.C3130He.a
    public int m(Q92 q92) {
        if (this.j != 0 && q92 != null) {
            int i = q92.Z;
            int i2 = this.d[i % this.c];
            if (i2 == -1) {
                return -1;
            }
            if (this.f[i2] == i) {
                return i2;
            }
            do {
                i2 = this.e[i2];
                if (i2 == -1) {
                    break;
                }
            } while (this.f[i2] != i);
            if (i2 != -1 && this.f[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // o.C3130He.a
    public float n(int i) {
        int i2 = this.j;
        int i3 = this.k;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.g[i3];
            }
            i3 = this.i[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // o.C3130He.a
    public void o(Q92 q92, float f, boolean z) {
        float f2 = p;
        if (f <= (-f2) || f >= f2) {
            int m = m(q92);
            if (m == -1) {
                i(q92, f);
                return;
            }
            float[] fArr = this.g;
            float f3 = fArr[m] + f;
            fArr[m] = f3;
            float f4 = p;
            if (f3 > (-f4) && f3 < f4) {
                fArr[m] = 0.0f;
                g(q92, z);
            }
        }
    }

    @Override // o.C3130He.a
    public float p(C3130He c3130He, boolean z) {
        float e = e(c3130He.a);
        g(c3130He.a, z);
        R92 r92 = (R92) c3130He.e;
        int d = r92.d();
        int i = 0;
        int i2 = 0;
        while (i < d) {
            int i3 = r92.f[i2];
            if (i3 != -1) {
                o(this.m.d[i3], r92.g[i2] * e, z);
                i++;
            }
            i2++;
        }
        return e;
    }

    @Override // o.C3130He.a
    public void q(float f) {
        int i = this.j;
        int i2 = this.k;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f;
            i2 = this.i[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    public final int r() {
        for (int i = 0; i < this.b; i++) {
            if (this.f[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    public final void s() {
        int i = this.b * 2;
        this.f = Arrays.copyOf(this.f, i);
        this.g = Arrays.copyOf(this.g, i);
        this.h = Arrays.copyOf(this.h, i);
        this.i = Arrays.copyOf(this.i, i);
        this.e = Arrays.copyOf(this.e, i);
        for (int i2 = this.b; i2 < i; i2++) {
            this.f[i2] = -1;
            this.e[i2] = -1;
        }
        this.b = i;
    }

    public final void t(int i, Q92 q92, float f) {
        int r = r();
        b(r, q92, f);
        if (i != -1) {
            this.h[r] = i;
            int[] iArr = this.i;
            iArr[r] = iArr[i];
            iArr[i] = r;
        } else {
            this.h[r] = -1;
            if (this.j > 0) {
                this.i[r] = this.k;
                this.k = r;
            } else {
                this.i[r] = -1;
            }
        }
        int i2 = this.i[r];
        if (i2 != -1) {
            this.h[i2] = r;
        }
        a(q92, r);
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            Q92 f = f(i2);
            if (f != null) {
                String str4 = str3 + f + " = " + n(i2) + C4500Ve2.b;
                int m = m(f);
                String str5 = str4 + "[p: ";
                if (this.h[m] != -1) {
                    str = str5 + this.m.d[this.f[this.h[m]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.i[m] != -1) {
                    str2 = str6 + this.m.d[this.f[this.i[m]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + C6566gU0.g;
            }
        }
        return str3 + " }";
    }

    public final void u(Q92 q92) {
        int[] iArr;
        int i;
        int i2 = q92.Z;
        int i3 = i2 % this.c;
        int[] iArr2 = this.d;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.f[i4] == i2) {
                int[] iArr3 = this.e;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
                return;
            }
            while (true) {
                iArr = this.e;
                i = iArr[i4];
                if (i == -1 || this.f[i] == i2) {
                    break;
                }
                i4 = i;
            }
            if (i != -1 && this.f[i] == i2) {
                iArr[i4] = iArr[i];
                iArr[i] = -1;
            }
        }
    }
}
