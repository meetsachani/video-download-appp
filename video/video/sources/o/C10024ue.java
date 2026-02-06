package o;

import java.io.PrintStream;
import java.util.Arrays;
import o.C3130He;

/* renamed from: o.ue */
/* loaded from: classes.dex */
public class C10024ue implements C3130He.a {
    public static final boolean l = false;
    public static final int m = -1;
    public static float n = 0.001f;
    public final C3130He b;
    public final C5191at c;
    public int a = 0;
    public int d = 8;
    public Q92 e = null;
    public int[] f = new int[8];
    public int[] g = new int[8];
    public float[] h = new float[8];
    public int i = -1;
    public int j = -1;
    public boolean k = false;

    public C10024ue(C3130He c3130He, C5191at c5191at) {
        this.b = c3130He;
        this.c = c5191at;
    }

    public int a() {
        return this.i;
    }

    public final int b(int i) {
        return this.f[i];
    }

    public final int c(int i) {
        return this.g[i];
    }

    @Override // o.C3130He.a
    public final void clear() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            Q92 q92 = this.c.d[this.f[i]];
            if (q92 != null) {
                q92.m(this.b);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }

    @Override // o.C3130He.a
    public int d() {
        return this.a;
    }

    @Override // o.C3130He.a
    public final float e(Q92 q92) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == q92.Z) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // o.C3130He.a
    public Q92 f(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.c.d[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    @Override // o.C3130He.a
    public final float g(Q92 q92, boolean z) {
        if (this.e == q92) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.a) {
            if (this.f[i] == q92.Z) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    q92.m(this.b);
                }
                q92.h1--;
                this.a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    @Override // o.C3130He.a
    public void h() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.g[i];
        }
    }

    @Override // o.C3130He.a
    public final void i(Q92 q92, float f) {
        if (f == 0.0f) {
            g(q92, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = q92.Z;
            this.g[0] = -1;
            q92.h1++;
            q92.e(this.b);
            this.a++;
            if (!this.k) {
                int i2 = this.j + 1;
                this.j = i2;
                int[] iArr = this.f;
                if (i2 >= iArr.length) {
                    this.k = true;
                    this.j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
            int i5 = this.f[i];
            int i6 = q92.Z;
            if (i5 == i6) {
                this.h[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int i7 = this.j;
        int i8 = i7 + 1;
        if (this.k) {
            int[] iArr2 = this.f;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f;
        if (i7 >= iArr3.length && this.a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.k = false;
            this.j = i7 - 1;
            this.h = Arrays.copyOf(this.h, i10);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i7] = q92.Z;
        this.h[i7] = f;
        if (i3 != -1) {
            int[] iArr6 = this.g;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.g[i7] = this.i;
            this.i = i7;
        }
        q92.h1++;
        q92.e(this.b);
        int i11 = this.a + 1;
        this.a = i11;
        if (!this.k) {
            this.j++;
        }
        int[] iArr7 = this.f;
        if (i11 >= iArr7.length) {
            this.k = true;
        }
        if (this.j >= iArr7.length) {
            this.k = true;
            this.j = iArr7.length - 1;
        }
    }

    @Override // o.C3130He.a
    public boolean j(Q92 q92) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == q92.Z) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    @Override // o.C3130He.a
    public int k() {
        return (this.f.length * 12) + 36;
    }

    @Override // o.C3130He.a
    public void l() {
        int i = this.a;
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
        int i = this.i;
        if (i == -1) {
            return -1;
        }
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.f[i] == q92.Z) {
                return i;
            }
            i = this.g[i];
        }
        return -1;
    }

    @Override // o.C3130He.a
    public float n(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    @Override // o.C3130He.a
    public void o(Q92 q92, float f, boolean z) {
        float f2 = n;
        if (f <= (-f2) || f >= f2) {
            int i = this.i;
            if (i == -1) {
                this.i = 0;
                this.h[0] = f;
                this.f[0] = q92.Z;
                this.g[0] = -1;
                q92.h1++;
                q92.e(this.b);
                this.a++;
                if (!this.k) {
                    int i2 = this.j + 1;
                    this.j = i2;
                    int[] iArr = this.f;
                    if (i2 >= iArr.length) {
                        this.k = true;
                        this.j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.a; i4++) {
                int i5 = this.f[i];
                int i6 = q92.Z;
                if (i5 == i6) {
                    float[] fArr = this.h;
                    float f3 = fArr[i] + f;
                    float f4 = n;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.i) {
                            this.i = this.g[i];
                        } else {
                            int[] iArr2 = this.g;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            q92.m(this.b);
                        }
                        if (this.k) {
                            this.j = i;
                        }
                        q92.h1--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.g[i];
            }
            int i7 = this.j;
            int i8 = i7 + 1;
            if (this.k) {
                int[] iArr3 = this.f;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f;
            if (i7 >= iArr4.length && this.a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.d * 2;
                this.d = i10;
                this.k = false;
                this.j = i7 - 1;
                this.h = Arrays.copyOf(this.h, i10);
                this.f = Arrays.copyOf(this.f, this.d);
                this.g = Arrays.copyOf(this.g, this.d);
            }
            this.f[i7] = q92.Z;
            this.h[i7] = f;
            if (i3 != -1) {
                int[] iArr7 = this.g;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.g[i7] = this.i;
                this.i = i7;
            }
            q92.h1++;
            q92.e(this.b);
            this.a++;
            if (!this.k) {
                this.j++;
            }
            int i11 = this.j;
            int[] iArr8 = this.f;
            if (i11 >= iArr8.length) {
                this.k = true;
                this.j = iArr8.length - 1;
            }
        }
    }

    @Override // o.C3130He.a
    public float p(C3130He c3130He, boolean z) {
        float e = e(c3130He.a);
        g(c3130He.a, z);
        C3130He.a aVar = c3130He.e;
        int d = aVar.d();
        for (int i = 0; i < d; i++) {
            Q92 f = aVar.f(i);
            o(f, aVar.e(f) * e, z);
        }
        return e;
    }

    @Override // o.C3130He.a
    public void q(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    public Q92 r() {
        Q92 q92 = this.e;
        if (q92 == null) {
            int i = this.i;
            Q92 q922 = null;
            for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
                if (this.h[i] < 0.0f) {
                    Q92 q923 = this.c.d[this.f[i]];
                    if (q922 == null || q922.Z0 < q923.Z0) {
                        q922 = q923;
                    }
                }
                i = this.g[i];
            }
            return q922;
        }
        return q92;
    }

    public final float s(int i) {
        return this.h[i];
    }

    public boolean t() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.h[i] > 0.0f) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    public String toString() {
        int i = this.i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            str = ((str + B8.d) + this.h[i] + " : ") + this.c.d[this.f[i]];
            i = this.g[i];
        }
        return str;
    }
}
