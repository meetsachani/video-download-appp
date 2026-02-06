package o;

import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class Q92 implements Comparable<Q92> {
    public static int A1 = 1;
    public static int B1 = 1;
    public static int C1 = 1;
    public static final int D1 = 9;
    public static final boolean m1 = false;
    public static final boolean n1 = false;
    public static final boolean o1 = false;
    public static final int p1 = 0;
    public static final int q1 = 1;
    public static final int r1 = 2;
    public static final int s1 = 3;
    public static final int t1 = 4;
    public static final int u1 = 5;
    public static final int v1 = 6;
    public static final int w1 = 7;
    public static final int x1 = 8;
    public static int y1 = 1;
    public static int z1 = 1;
    public boolean X;
    public String Y;
    public int Y0;
    public int Z;
    public int Z0;
    public float a1;
    public boolean b1;
    public float[] c1;
    public float[] d1;
    public a e1;
    public C3130He[] f1;
    public int g1;
    public int h1;
    public boolean i1;
    public int j1;
    public float k1;
    public HashSet<C3130He> l1;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public Q92(String str, a aVar) {
        this.Z = -1;
        this.Y0 = -1;
        this.Z0 = 0;
        this.b1 = false;
        this.c1 = new float[9];
        this.d1 = new float[9];
        this.f1 = new C3130He[16];
        this.g1 = 0;
        this.h1 = 0;
        this.i1 = false;
        this.j1 = -1;
        this.k1 = 0.0f;
        this.l1 = null;
        this.Y = str;
        this.e1 = aVar;
    }

    public static String j(a aVar, String str) {
        if (str != null) {
            return str + z1;
        }
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(C2638Cg0.X4);
                            int i = C1 + 1;
                            C1 = i;
                            sb.append(i);
                            return sb.toString();
                        }
                        throw new AssertionError(aVar.name());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(W12.i);
                    int i2 = z1 + 1;
                    z1 = i2;
                    sb2.append(i2);
                    return sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("S");
                int i3 = y1 + 1;
                y1 = i3;
                sb3.append(i3);
                return sb3.toString();
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("C");
            int i4 = B1 + 1;
            B1 = i4;
            sb4.append(i4);
            return sb4.toString();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("U");
        int i5 = A1 + 1;
        A1 = i5;
        sb5.append(i5);
        return sb5.toString();
    }

    public static void l() {
        z1++;
    }

    public final void e(C3130He c3130He) {
        int i = 0;
        while (true) {
            int i2 = this.g1;
            if (i < i2) {
                if (this.f1[i] == c3130He) {
                    return;
                }
                i++;
            } else {
                C3130He[] c3130HeArr = this.f1;
                if (i2 >= c3130HeArr.length) {
                    this.f1 = (C3130He[]) Arrays.copyOf(c3130HeArr, c3130HeArr.length * 2);
                }
                C3130He[] c3130HeArr2 = this.f1;
                int i3 = this.g1;
                c3130HeArr2[i3] = c3130He;
                this.g1 = i3 + 1;
                return;
            }
        }
    }

    public void g() {
        for (int i = 0; i < 9; i++) {
            this.c1[i] = 0.0f;
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: h */
    public int compareTo(Q92 q92) {
        return this.Z - q92.Z;
    }

    public String i() {
        return this.Y;
    }

    public final void m(C3130He c3130He) {
        int i = this.g1;
        int i2 = 0;
        while (i2 < i) {
            if (this.f1[i2] == c3130He) {
                while (i2 < i - 1) {
                    C3130He[] c3130HeArr = this.f1;
                    int i3 = i2 + 1;
                    c3130HeArr[i2] = c3130HeArr[i3];
                    i2 = i3;
                }
                this.g1--;
                return;
            }
            i2++;
        }
    }

    public void n() {
        this.Y = null;
        this.e1 = a.UNKNOWN;
        this.Z0 = 0;
        this.Z = -1;
        this.Y0 = -1;
        this.a1 = 0.0f;
        this.b1 = false;
        this.i1 = false;
        this.j1 = -1;
        this.k1 = 0.0f;
        int i = this.g1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1[i2] = null;
        }
        this.g1 = 0;
        this.h1 = 0;
        this.X = false;
        Arrays.fill(this.d1, 0.0f);
    }

    public void o(C9872u01 c9872u01, float f) {
        this.a1 = f;
        this.b1 = true;
        this.i1 = false;
        this.j1 = -1;
        this.k1 = 0.0f;
        int i = this.g1;
        this.Y0 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1[i2].a(c9872u01, this, false);
        }
        this.g1 = 0;
    }

    public void p(String str) {
        this.Y = str;
    }

    public void q(C9872u01 c9872u01, Q92 q92, float f) {
        this.i1 = true;
        this.j1 = q92.Z;
        this.k1 = f;
        int i = this.g1;
        this.Y0 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1[i2].G(c9872u01, this, false);
        }
        this.g1 = 0;
        c9872u01.x();
    }

    public void r(a aVar, String str) {
        this.e1 = aVar;
    }

    public String s() {
        String str = this + C6566gU0.f;
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < this.c1.length; i++) {
            String str2 = str + this.c1[i];
            float[] fArr = this.c1;
            float f = fArr[i];
            if (f > 0.0f) {
                z = false;
            } else if (f < 0.0f) {
                z = true;
            }
            if (f != 0.0f) {
                z2 = false;
            }
            if (i < fArr.length - 1) {
                str = str2 + C6566gU0.h;
            } else {
                str = str2 + "] ";
            }
        }
        if (z) {
            str = str + " (-)";
        }
        if (z2) {
            return str + " (*)";
        }
        return str;
    }

    public final void t(C9872u01 c9872u01, C3130He c3130He) {
        int i = this.g1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f1[i2].d(c9872u01, c3130He, false);
        }
        this.g1 = 0;
    }

    public String toString() {
        if (this.Y != null) {
            return "" + this.Y;
        }
        return "" + this.Z;
    }

    public Q92(a aVar, String str) {
        this.Z = -1;
        this.Y0 = -1;
        this.Z0 = 0;
        this.b1 = false;
        this.c1 = new float[9];
        this.d1 = new float[9];
        this.f1 = new C3130He[16];
        this.g1 = 0;
        this.h1 = 0;
        this.i1 = false;
        this.j1 = -1;
        this.k1 = 0.0f;
        this.l1 = null;
        this.e1 = aVar;
    }
}
