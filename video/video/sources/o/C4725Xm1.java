package o;

import java.util.Arrays;

/* renamed from: o.Xm1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4725Xm1 extends AbstractC9115qv0 {
    public C4725Xm1() {
        this(0, 1, null);
    }

    public static /* synthetic */ void w0(C4725Xm1 c4725Xm1, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = c4725Xm1.b;
        }
        c4725Xm1.v0(i);
    }

    public final void W(int i, float f) {
        int i2;
        if (i >= 0 && i <= (i2 = this.b)) {
            d0(i2 + 1);
            float[] fArr = this.a;
            int i3 = this.b;
            if (i != i3) {
                C4788Ye.y0(fArr, fArr, i + 1, i, i3);
            }
            fArr[i] = f;
            this.b++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean X(float f) {
        d0(this.b + 1);
        float[] fArr = this.a;
        int i = this.b;
        fArr[i] = f;
        this.b = i + 1;
        return true;
    }

    public final boolean Y(int i, AbstractC9115qv0 abstractC9115qv0) {
        C6562gT0.p(abstractC9115qv0, "elements");
        if (i >= 0 && i <= this.b) {
            if (abstractC9115qv0.B()) {
                return false;
            }
            d0(this.b + abstractC9115qv0.b);
            float[] fArr = this.a;
            int i2 = this.b;
            if (i != i2) {
                C4788Ye.y0(fArr, fArr, abstractC9115qv0.b + i, i, i2);
            }
            C4788Ye.y0(abstractC9115qv0.a, fArr, i, 0, abstractC9115qv0.b);
            this.b += abstractC9115qv0.b;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean Z(int i, float[] fArr) {
        int i2;
        C6562gT0.p(fArr, "elements");
        if (i >= 0 && i <= (i2 = this.b)) {
            if (fArr.length == 0) {
                return false;
            }
            d0(i2 + fArr.length);
            float[] fArr2 = this.a;
            int i3 = this.b;
            if (i != i3) {
                C4788Ye.y0(fArr2, fArr2, fArr.length + i, i, i3);
            }
            C4788Ye.H0(fArr, fArr2, i, 0, 0, 12, null);
            this.b += fArr.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + i + " must be in 0.." + this.b);
    }

    public final boolean a0(AbstractC9115qv0 abstractC9115qv0) {
        C6562gT0.p(abstractC9115qv0, "elements");
        return Y(this.b, abstractC9115qv0);
    }

    public final boolean b0(float[] fArr) {
        C6562gT0.p(fArr, "elements");
        return Z(this.b, fArr);
    }

    public final void c0() {
        this.b = 0;
    }

    public final void d0(int i) {
        float[] fArr = this.a;
        if (fArr.length < i) {
            float[] copyOf = Arrays.copyOf(fArr, Math.max(i, (fArr.length * 3) / 2));
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public final int e0() {
        return this.a.length;
    }

    public final void f0(float f) {
        l0(f);
    }

    public final void g0(AbstractC9115qv0 abstractC9115qv0) {
        C6562gT0.p(abstractC9115qv0, "elements");
        float[] fArr = abstractC9115qv0.a;
        int i = abstractC9115qv0.b;
        for (int i2 = 0; i2 < i; i2++) {
            l0(fArr[i2]);
        }
    }

    public final void h0(float[] fArr) {
        C6562gT0.p(fArr, "elements");
        for (float f : fArr) {
            l0(f);
        }
    }

    public final void i0(float f) {
        X(f);
    }

    public final void j0(AbstractC9115qv0 abstractC9115qv0) {
        C6562gT0.p(abstractC9115qv0, "elements");
        Y(this.b, abstractC9115qv0);
    }

    public final void k0(float[] fArr) {
        C6562gT0.p(fArr, "elements");
        Z(this.b, fArr);
    }

    public final boolean l0(float f) {
        int y = y(f);
        if (y >= 0) {
            o0(y);
            return true;
        }
        return false;
    }

    public final boolean m0(AbstractC9115qv0 abstractC9115qv0) {
        C6562gT0.p(abstractC9115qv0, "elements");
        int i = this.b;
        int i2 = abstractC9115qv0.b - 1;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                l0(abstractC9115qv0.s(i3));
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

    public final boolean n0(float[] fArr) {
        C6562gT0.p(fArr, "elements");
        int i = this.b;
        for (float f : fArr) {
            l0(f);
        }
        if (i == this.b) {
            return false;
        }
        return true;
    }

    public final float o0(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            float[] fArr = this.a;
            float f = fArr[i];
            if (i != i2 - 1) {
                C4788Ye.y0(fArr, fArr, i, i + 1, i2);
            }
            this.b--;
            return f;
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
                        float[] fArr = this.a;
                        C4788Ye.y0(fArr, fArr, i, i2, i3);
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

    public final boolean q0(AbstractC9115qv0 abstractC9115qv0) {
        C6562gT0.p(abstractC9115qv0, "elements");
        int i = this.b;
        float[] fArr = this.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!abstractC9115qv0.c(fArr[i2])) {
                o0(i2);
            }
        }
        if (i != this.b) {
            return true;
        }
        return false;
    }

    public final boolean r0(float[] fArr) {
        C6562gT0.p(fArr, "elements");
        int i = this.b;
        float[] fArr2 = this.a;
        int i2 = i - 1;
        while (true) {
            int i3 = 0;
            int i4 = -1;
            if (-1 >= i2) {
                break;
            }
            float f = fArr2[i2];
            int length = fArr.length;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (fArr[i3] == f) {
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

    public final float s0(int i, float f) {
        if (i >= 0 && i < this.b) {
            float[] fArr = this.a;
            float f2 = fArr[i];
            fArr[i] = f;
            return f2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set index ");
        sb.append(i);
        sb.append(" must be between 0 .. ");
        sb.append(this.b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public final void t0() {
        C4788Ye.N3(this.a, 0, this.b);
    }

    public final void u0() {
        C7330jf.Iu(this.a, 0, this.b);
    }

    public final void v0(int i) {
        int max = Math.max(i, this.b);
        float[] fArr = this.a;
        if (fArr.length > max) {
            float[] copyOf = Arrays.copyOf(fArr, max);
            C6562gT0.o(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
    }

    public /* synthetic */ C4725Xm1(int i, int i2, C9516sY c9516sY) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public C4725Xm1(int i) {
        super(i, null);
    }
}
