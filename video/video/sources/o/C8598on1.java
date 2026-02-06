package o;

import java.util.Arrays;

/* renamed from: o.on1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8598on1 extends L41 {
    public C8598on1() {
        this(0, 1, null);
    }

    public static /* synthetic */ void w0(C8598on1 c8598on1, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c8598on1.b;
        }
        c8598on1.v0(i);
    }

    public final void W(int i, long j) {
        int i2;
        if (i >= 0 && i <= (i2 = this.b)) {
            d0(i2 + 1);
            long[] jArr = this.a;
            int i3 = this.b;
            if (i != i3) {
                C4788Ye.A0(jArr, jArr, i + 1, i, i3);
            }
            jArr[i] = j;
            this.b++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean X(long j) {
        d0(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
        return true;
    }

    public final boolean Y(int i, L41 l41) {
        C6562gT0.p(l41, "elements");
        if (i >= 0 && i <= this.b) {
            if (l41.B()) {
                return false;
            }
            d0(this.b + l41.b);
            long[] jArr = this.a;
            int i2 = this.b;
            if (i != i2) {
                C4788Ye.A0(jArr, jArr, l41.b + i, i, i2);
            }
            C4788Ye.A0(l41.a, jArr, i, 0, l41.b);
            this.b += l41.b;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean Z(int i, long[] jArr) {
        int i2;
        C6562gT0.p(jArr, "elements");
        if (i >= 0 && i <= (i2 = this.b)) {
            if (jArr.length == 0) {
                return false;
            }
            d0(i2 + jArr.length);
            long[] jArr2 = this.a;
            int i3 = this.b;
            if (i != i3) {
                C4788Ye.A0(jArr2, jArr2, jArr.length + i, i, i3);
            }
            C4788Ye.J0(jArr, jArr2, i, 0, 0, 12, null);
            this.b += jArr.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean a0(L41 l41) {
        C6562gT0.p(l41, "elements");
        return Y(this.b, l41);
    }

    public final boolean b0(long[] jArr) {
        C6562gT0.p(jArr, "elements");
        return Z(this.b, jArr);
    }

    public final void c0() {
        this.b = 0;
    }

    public final void d0(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            long[] copyOf = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public final int e0() {
        return this.a.length;
    }

    public final void f0(long j) {
        l0(j);
    }

    public final void g0(L41 l41) {
        C6562gT0.p(l41, "elements");
        long[] jArr = l41.a;
        int i = l41.b;
        for (int i2 = 0; i2 < i; i2++) {
            l0(jArr[i2]);
        }
    }

    public final void h0(long[] jArr) {
        C6562gT0.p(jArr, "elements");
        for (long j : jArr) {
            l0(j);
        }
    }

    public final void i0(long j) {
        X(j);
    }

    public final void j0(L41 l41) {
        C6562gT0.p(l41, "elements");
        Y(this.b, l41);
    }

    public final void k0(long[] jArr) {
        C6562gT0.p(jArr, "elements");
        Z(this.b, jArr);
    }

    public final boolean l0(long j) {
        int y = y(j);
        if (y >= 0) {
            o0(y);
            return true;
        }
        return false;
    }

    public final boolean m0(L41 l41) {
        C6562gT0.p(l41, "elements");
        int i = this.b;
        int i2 = l41.b - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                l0(l41.s(i3));
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean n0(long[] jArr) {
        C6562gT0.p(jArr, "elements");
        int i = this.b;
        for (long j : jArr) {
            l0(j);
        }
        if (i == this.b) {
            return false;
        }
        return true;
    }

    public final long o0(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            long[] jArr = this.a;
            long j = jArr[i];
            if (i != i2 - 1) {
                C4788Ye.A0(jArr, jArr, i, i + 1, i2);
            }
            this.b--;
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void p0(int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this.b) && i2 >= 0 && i2 <= i3) {
            if (i2 >= i) {
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = this.a;
                        C4788Ye.A0(jArr, jArr, i, i2, i3);
                    }
                    this.b -= i2 - i;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.b);
    }

    public final boolean q0(L41 l41) {
        C6562gT0.p(l41, "elements");
        int i = this.b;
        long[] jArr = this.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!l41.c(jArr[i2])) {
                o0(i2);
            }
        }
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean r0(long[] jArr) {
        C6562gT0.p(jArr, "elements");
        int i = this.b;
        long[] jArr2 = this.a;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            long j = jArr2[i2];
            int length = jArr.length;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (jArr[i3] == j) {
                    i4 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            if (i4 < 0) {
                o0(i2);
            }
            i2--;
        }
        if (i == this.b) {
            return false;
        }
        return true;
    }

    public final long s0(int i, long j) {
        if (i >= 0 && i < this.b) {
            long[] jArr = this.a;
            long j2 = jArr[i];
            jArr[i] = j;
            return j2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i);
        sb.append(" must be between 0 .. ");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void t0() {
        C4788Ye.R3(this.a, 0, this.b);
    }

    public final void u0() {
        C7330jf.Mu(this.a, 0, this.b);
    }

    public final void v0(int i) {
        int max = Math.max(i, this.b);
        long[] jArr = this.a;
        if (jArr.length > max) {
            long[] copyOf = Arrays.copyOf(jArr, max);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public /* synthetic */ C8598on1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public C8598on1(int i) {
        super(i, null);
    }
}
