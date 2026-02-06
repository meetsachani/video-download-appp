package o;

import java.util.Formatter;

/* loaded from: classes3.dex */
public final class D20 {
    public static final int e = 2;
    public final C4033Qk a;
    public final E20[] b;
    public C10311vp c;
    public final int d;

    public D20(C4033Qk c4033Qk, C10311vp c10311vp) {
        this.a = c4033Qk;
        int a = c4033Qk.a();
        this.d = a;
        this.c = c10311vp;
        this.b = new E20[a + 2];
    }

    public static boolean b(VE ve, VE ve2) {
        if (ve2 == null || !ve2.g() || ve2.a() != ve.a()) {
            return false;
        }
        ve.i(ve2.c());
        return true;
    }

    public static int c(int i, int i2, VE ve) {
        if (ve != null && !ve.g()) {
            if (ve.h(i)) {
                ve.i(i);
                return 0;
            }
            return i2 + 1;
        }
        return i2;
    }

    public final void a(E20 e20) {
        if (e20 != null) {
            ((F20) e20).g(this.a);
        }
    }

    public final int d() {
        int f = f();
        if (f == 0) {
            return 0;
        }
        for (int i = 1; i < this.d + 1; i++) {
            VE[] d = this.b[i].d();
            for (int i2 = 0; i2 < d.length; i2++) {
                VE ve = d[i2];
                if (ve != null && !ve.g()) {
                    e(i, i2, d);
                }
            }
        }
        return f;
    }

    public final void e(int i, int i2, VE[] veArr) {
        VE[] veArr2;
        VE ve = veArr[i2];
        VE[] d = this.b[i - 1].d();
        E20 e20 = this.b[i + 1];
        if (e20 != null) {
            veArr2 = e20.d();
        } else {
            veArr2 = d;
        }
        VE[] veArr3 = new VE[14];
        veArr3[2] = d[i2];
        veArr3[3] = veArr2[i2];
        if (i2 > 0) {
            int i3 = i2 - 1;
            veArr3[0] = veArr[i3];
            veArr3[4] = d[i3];
            veArr3[5] = veArr2[i3];
        }
        if (i2 > 1) {
            int i4 = i2 - 2;
            veArr3[8] = veArr[i4];
            veArr3[10] = d[i4];
            veArr3[11] = veArr2[i4];
        }
        if (i2 < veArr.length - 1) {
            int i5 = i2 + 1;
            veArr3[1] = veArr[i5];
            veArr3[6] = d[i5];
            veArr3[7] = veArr2[i5];
        }
        if (i2 < veArr.length - 2) {
            int i6 = i2 + 2;
            veArr3[9] = veArr[i6];
            veArr3[12] = d[i6];
            veArr3[13] = veArr2[i6];
        }
        for (int i7 = 0; i7 < 14 && !b(ve, veArr3[i7]); i7++) {
        }
    }

    public final int f() {
        g();
        return h() + i();
    }

    public final void g() {
        E20[] e20Arr = this.b;
        E20 e20 = e20Arr[0];
        if (e20 != null && e20Arr[this.d + 1] != null) {
            VE[] d = e20.d();
            VE[] d2 = this.b[this.d + 1].d();
            for (int i = 0; i < d.length; i++) {
                VE ve = d[i];
                if (ve != null && d2[i] != null && ve.c() == d2[i].c()) {
                    for (int i2 = 1; i2 <= this.d; i2++) {
                        VE ve2 = this.b[i2].d()[i];
                        if (ve2 != null) {
                            ve2.i(d[i].c());
                            if (!ve2.g()) {
                                this.b[i2].d()[i] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int h() {
        E20 e20 = this.b[0];
        if (e20 == null) {
            return 0;
        }
        VE[] d = e20.d();
        int i = 0;
        for (int i2 = 0; i2 < d.length; i2++) {
            VE ve = d[i2];
            if (ve != null) {
                int c = ve.c();
                int i3 = 0;
                for (int i4 = 1; i4 < this.d + 1 && i3 < 2; i4++) {
                    VE ve2 = this.b[i4].d()[i2];
                    if (ve2 != null) {
                        i3 = c(c, i3, ve2);
                        if (!ve2.g()) {
                            i++;
                        }
                    }
                }
            }
        }
        return i;
    }

    public final int i() {
        E20[] e20Arr = this.b;
        int i = this.d;
        if (e20Arr[i + 1] == null) {
            return 0;
        }
        VE[] d = e20Arr[i + 1].d();
        int i2 = 0;
        for (int i3 = 0; i3 < d.length; i3++) {
            VE ve = d[i3];
            if (ve != null) {
                int c = ve.c();
                int i4 = 0;
                for (int i5 = this.d + 1; i5 > 0 && i4 < 2; i5--) {
                    VE ve2 = this.b[i5].d()[i3];
                    if (ve2 != null) {
                        i4 = c(c, i4, ve2);
                        if (!ve2.g()) {
                            i2++;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public int j() {
        return this.d;
    }

    public int k() {
        return this.a.b();
    }

    public int l() {
        return this.a.c();
    }

    public C10311vp m() {
        return this.c;
    }

    public E20 n(int i) {
        return this.b[i];
    }

    public E20[] o() {
        a(this.b[0]);
        a(this.b[this.d + 1]);
        int i = 928;
        while (true) {
            int d = d();
            if (d <= 0 || d >= i) {
                break;
            }
            i = d;
        }
        return this.b;
    }

    public void p(C10311vp c10311vp) {
        this.c = c10311vp;
    }

    public void q(int i, E20 e20) {
        this.b[i] = e20;
    }

    public String toString() {
        E20[] e20Arr = this.b;
        E20 e20 = e20Arr[0];
        if (e20 == null) {
            e20 = e20Arr[this.d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i = 0; i < e20.d().length; i++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i));
                for (int i2 = 0; i2 < this.d + 2; i2++) {
                    E20 e202 = this.b[i2];
                    if (e202 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        VE ve = e202.d()[i];
                        if (ve == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(ve.c()), Integer.valueOf(ve.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
