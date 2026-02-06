package o;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class QE0 {
    public static final int l = 1;
    public static final int m = 0;
    public static final int n = 50;

    /* renamed from: o  reason: collision with root package name */
    public static final int f588o = 50;
    public static final int p = 3;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public String f;
    public String g;
    public int h;
    public int i = 0;
    public boolean[][] j;
    public int[][] k;

    public QE0() {
    }

    public final void a() {
        for (int i = 0; i < this.c; i++) {
            if (m(i) == -1) {
                int f = f();
                int g = g(f);
                int e = e(f);
                if (f != -1) {
                    b(i, g, e, 1, 1);
                } else {
                    return;
                }
            }
        }
    }

    public final void b(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.k[i];
        iArr[0] = i3;
        iArr[1] = i2;
        iArr[2] = (i3 + i5) - 1;
        iArr[3] = (i2 + i4) - 1;
    }

    public int c(int i) {
        int[][] iArr = this.k;
        if (iArr != null && i < iArr.length) {
            return iArr[i][3];
        }
        return 0;
    }

    public final void d(boolean z) {
        int[][] n2;
        int[][] n3;
        if (z) {
            for (int i = 0; i < this.j.length; i++) {
                int i2 = 0;
                while (true) {
                    boolean[][] zArr = this.j;
                    if (i2 < zArr[0].length) {
                        zArr[i][i2] = true;
                        i2++;
                    }
                }
            }
            for (int i3 = 0; i3 < this.k.length; i3++) {
                int i4 = 0;
                while (true) {
                    int[][] iArr = this.k;
                    if (i4 < iArr[0].length) {
                        iArr[i3][i4] = -1;
                        i4++;
                    }
                }
            }
        }
        this.i = 0;
        String str = this.g;
        if (str != null && !str.trim().isEmpty() && (n3 = n(this.g)) != null) {
            h(n3);
        }
        String str2 = this.f;
        if (str2 != null && !str2.trim().isEmpty() && (n2 = n(this.f)) != null) {
            i(n2);
        }
        a();
    }

    public final int e(int i) {
        if (this.h == 1) {
            return i / this.a;
        }
        return i % this.d;
    }

    public final int f() {
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.i;
            if (i >= this.a * this.d) {
                return -1;
            }
            int g = g(i);
            int e = e(this.i);
            boolean[] zArr = this.j[g];
            if (zArr[e]) {
                zArr[e] = false;
                z = true;
            }
            this.i++;
        }
        return i;
    }

    public final int g(int i) {
        if (this.h == 1) {
            return i % this.a;
        }
        return i / this.d;
    }

    public final void h(int[][] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int g = g(iArr[i][0]);
            int e = e(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!k(g, e, iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    public final void i(int[][] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int g = g(iArr[i][0]);
            int e = e(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (k(g, e, iArr2[1], iArr2[2])) {
                int[] iArr3 = iArr[i];
                b(i, g, e, iArr3[1], iArr3[2]);
            } else {
                return;
            }
        }
    }

    public final void j() {
        boolean[][] zArr = (boolean[][]) Array.newInstance(Boolean.TYPE, this.a, this.d);
        this.j = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.c;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, i, 4);
            this.k = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    public final boolean k(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.j;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean l(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        return true;
    }

    public int m(int i) {
        int[][] iArr = this.k;
        if (iArr == null || i >= iArr.length) {
            return 0;
        }
        return iArr[i][0];
    }

    public final int[][] n(String str) {
        if (!l(str)) {
            return null;
        }
        String[] split = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, split.length, 3);
        for (int i = 0; i < split.length; i++) {
            String[] split2 = split[i].trim().split(":");
            String[] split3 = split2[1].split("x");
            iArr[i][0] = Integer.parseInt(split2[0]);
            iArr[i][1] = Integer.parseInt(split3[0]);
            iArr[i][2] = Integer.parseInt(split3[1]);
        }
        return iArr;
    }

    public int o(int i) {
        int[][] iArr = this.k;
        if (iArr != null && i < iArr.length) {
            return iArr[i][2];
        }
        return 0;
    }

    public void p(int i) {
        if (i > 50 || this.e == i) {
            return;
        }
        this.e = i;
        x();
    }

    public void q(int i) {
        if (i > this.a * this.d) {
            return;
        }
        this.c = i;
    }

    public void r(int i) {
        if ((i != 0 && i != 1) || this.h == i) {
            return;
        }
        this.h = i;
    }

    public void s(int i) {
        if (i > 50 || this.b == i) {
            return;
        }
        this.b = i;
        x();
    }

    public void t(String str) {
        String str2 = this.g;
        if (str2 != null && str2.equals(str)) {
            return;
        }
        this.g = str;
    }

    public void u(CharSequence charSequence) {
        String str = this.f;
        if (str != null && str.equals(charSequence.toString())) {
            return;
        }
        this.f = charSequence.toString();
    }

    public void v() {
        boolean[][] zArr;
        int[][] iArr = this.k;
        boolean z = false;
        if (iArr != null && iArr.length == this.c && (zArr = this.j) != null && zArr.length == this.a && zArr[0].length == this.d) {
            z = true;
        }
        if (!z) {
            j();
        }
        d(z);
    }

    public int w(int i) {
        int[][] iArr = this.k;
        if (iArr != null && i < iArr.length) {
            return iArr[i][1];
        }
        return 0;
    }

    public final void x() {
        int i;
        int i2 = this.b;
        if (i2 != 0 && (i = this.e) != 0) {
            this.a = i2;
            this.d = i;
            return;
        }
        int i3 = this.e;
        if (i3 > 0) {
            this.d = i3;
            this.a = ((this.c + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.a = i2;
            this.d = ((this.c + i2) - 1) / i2;
        } else {
            int sqrt = (int) (Math.sqrt(this.c) + 1.5d);
            this.a = sqrt;
            this.d = ((this.c + sqrt) - 1) / sqrt;
        }
    }

    public QE0(int i, int i2) {
        this.b = i;
        this.e = i2;
        if (i > 50) {
            this.b = 3;
        }
        if (i2 > 50) {
            this.e = 3;
        }
        x();
        j();
    }

    public QE0(int i, int i2, int i3) {
        this.b = i;
        this.e = i2;
        this.c = i3;
        if (i > 50) {
            this.b = 3;
        }
        if (i2 > 50) {
            this.e = 3;
        }
        x();
        int i4 = this.a;
        int i5 = this.d;
        if (i3 > i4 * i5 || i3 < 1) {
            this.c = i4 * i5;
        }
        j();
        d(false);
    }
}
