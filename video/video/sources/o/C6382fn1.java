package o;

import java.util.Arrays;

/* renamed from: o.fn1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6382fn1 extends AbstractC9001qR0 {
    public C6382fn1() {
        this(0, 1, null);
    }

    public static /* synthetic */ void w0(C6382fn1 c6382fn1, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c6382fn1.b;
        }
        c6382fn1.v0(i);
    }

    public final void W(int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this.b)) {
            d0(i3 + 1);
            int[] iArr = this.a;
            int i4 = this.b;
            if (i != i4) {
                C4788Ye.z0(iArr, iArr, i + 1, i, i4);
            }
            iArr[i] = i2;
            this.b++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean X(int i) {
        d0(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
        return true;
    }

    public final boolean Y(int i, AbstractC9001qR0 abstractC9001qR0) {
        C6562gT0.p(abstractC9001qR0, "elements");
        if (i >= 0 && i <= this.b) {
            if (abstractC9001qR0.B()) {
                return false;
            }
            d0(this.b + abstractC9001qR0.b);
            int[] iArr = this.a;
            int i2 = this.b;
            if (i != i2) {
                C4788Ye.z0(iArr, iArr, abstractC9001qR0.b + i, i, i2);
            }
            C4788Ye.z0(abstractC9001qR0.a, iArr, i, 0, abstractC9001qR0.b);
            this.b += abstractC9001qR0.b;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean Z(int i, int[] iArr) {
        int i2;
        C6562gT0.p(iArr, "elements");
        if (i >= 0 && i <= (i2 = this.b)) {
            if (iArr.length == 0) {
                return false;
            }
            d0(i2 + iArr.length);
            int[] iArr2 = this.a;
            int i3 = this.b;
            if (i != i3) {
                C4788Ye.z0(iArr2, iArr2, iArr.length + i, i, i3);
            }
            C4788Ye.I0(iArr, iArr2, i, 0, 0, 12, null);
            this.b += iArr.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean a0(AbstractC9001qR0 abstractC9001qR0) {
        C6562gT0.p(abstractC9001qR0, "elements");
        return Y(this.b, abstractC9001qR0);
    }

    public final boolean b0(int[] iArr) {
        C6562gT0.p(iArr, "elements");
        return Z(this.b, iArr);
    }

    public final void c0() {
        this.b = 0;
    }

    public final void d0(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public final int e0() {
        return this.a.length;
    }

    public final void f0(int i) {
        l0(i);
    }

    public final void g0(AbstractC9001qR0 abstractC9001qR0) {
        C6562gT0.p(abstractC9001qR0, "elements");
        int[] iArr = abstractC9001qR0.a;
        int i = abstractC9001qR0.b;
        for (int i2 = 0; i2 < i; i2++) {
            l0(iArr[i2]);
        }
    }

    public final void h0(int[] iArr) {
        C6562gT0.p(iArr, "elements");
        for (int i : iArr) {
            l0(i);
        }
    }

    public final void i0(int i) {
        X(i);
    }

    public final void j0(AbstractC9001qR0 abstractC9001qR0) {
        C6562gT0.p(abstractC9001qR0, "elements");
        Y(this.b, abstractC9001qR0);
    }

    public final void k0(int[] iArr) {
        C6562gT0.p(iArr, "elements");
        Z(this.b, iArr);
    }

    public final boolean l0(int i) {
        int y = y(i);
        if (y >= 0) {
            o0(y);
            return true;
        }
        return false;
    }

    public final boolean m0(AbstractC9001qR0 abstractC9001qR0) {
        C6562gT0.p(abstractC9001qR0, "elements");
        int i = this.b;
        int i2 = abstractC9001qR0.b - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                l0(abstractC9001qR0.s(i3));
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

    public final boolean n0(int[] iArr) {
        C6562gT0.p(iArr, "elements");
        int i = this.b;
        for (int i2 : iArr) {
            l0(i2);
        }
        if (i == this.b) {
            return false;
        }
        return true;
    }

    public final int o0(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            int[] iArr = this.a;
            int i3 = iArr[i];
            if (i != i2 - 1) {
                C4788Ye.z0(iArr, iArr, i, i + 1, i2);
            }
            this.b--;
            return i3;
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
                        int[] iArr = this.a;
                        C4788Ye.z0(iArr, iArr, i, i2, i3);
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

    public final boolean q0(AbstractC9001qR0 abstractC9001qR0) {
        C6562gT0.p(abstractC9001qR0, "elements");
        int i = this.b;
        int[] iArr = this.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!abstractC9001qR0.c(iArr[i2])) {
                o0(i2);
            }
        }
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean r0(int[] iArr) {
        C6562gT0.p(iArr, "elements");
        int i = this.b;
        int[] iArr2 = this.a;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            int i5 = iArr2[i2];
            int length = iArr.length;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (iArr[i3] == i5) {
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

    public final int s0(int i, int i2) {
        if (i >= 0 && i < this.b) {
            int[] iArr = this.a;
            int i3 = iArr[i];
            iArr[i] = i2;
            return i3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i);
        sb.append(" must be between 0 .. ");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void t0() {
        C4788Ye.P3(this.a, 0, this.b);
    }

    public final void u0() {
        C7330jf.Ku(this.a, 0, this.b);
    }

    public final void v0(int i) {
        int max = Math.max(i, this.b);
        int[] iArr = this.a;
        if (iArr.length > max) {
            int[] copyOf = Arrays.copyOf(iArr, max);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public /* synthetic */ C6382fn1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public C6382fn1(int i) {
        super(i, null);
    }
}
