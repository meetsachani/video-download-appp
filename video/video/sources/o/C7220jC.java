package o;

import java.io.IOException;
import java.util.Arrays;
import o.KZ1;

@Deprecated
/* renamed from: o.jC  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7220jC {
    public static final int m = 512;
    public static final int n = 1667497984;

    /* renamed from: o  reason: collision with root package name */
    public static final int f773o = 1650720768;
    public static final int p = 1651965952;
    public final InterfaceC10568wr2 a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public C7220jC(int i, int i2, long j, int i3, InterfaceC10568wr2 interfaceC10568wr2) {
        int i4;
        int i5;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        C9542sf.a(z);
        this.d = j;
        this.e = i3;
        this.a = interfaceC10568wr2;
        if (i2 == 2) {
            i4 = n;
        } else {
            i4 = p;
        }
        this.b = d(i, i4);
        if (i2 == 2) {
            i5 = d(i, f773o);
        } else {
            i5 = -1;
        }
        this.c = i5;
        this.k = new long[512];
        this.l = new int[512];
    }

    public static int d(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    public void a() {
        this.h++;
    }

    public void b(long j) {
        if (this.j == this.l.length) {
            long[] jArr = this.k;
            this.k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.l;
            this.l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.k;
        int i = this.j;
        jArr2[i] = j;
        this.l[i] = this.i;
        this.j = i + 1;
    }

    public void c() {
        this.k = Arrays.copyOf(this.k, this.j);
        this.l = Arrays.copyOf(this.l, this.j);
    }

    public final long e(int i) {
        return (this.d * i) / this.e;
    }

    public long f() {
        return e(this.h);
    }

    public long g() {
        return e(1);
    }

    public final MZ1 h(int i) {
        return new MZ1(this.l[i] * g(), this.k[i]);
    }

    public KZ1.a i(long j) {
        int g = (int) (j / g());
        int m2 = TD2.m(this.l, g, true, true);
        if (this.l[m2] == g) {
            return new KZ1.a(h(m2));
        }
        MZ1 h = h(m2);
        int i = m2 + 1;
        if (i < this.k.length) {
            return new KZ1.a(h, h(i));
        }
        return new KZ1.a(h);
    }

    public boolean j(int i) {
        if (this.b != i && this.c != i) {
            return false;
        }
        return true;
    }

    public void k() {
        this.i++;
    }

    public boolean l() {
        if ((this.b & p) == 1651965952) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (Arrays.binarySearch(this.l, this.h) >= 0) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if ((this.b & n) == 1667497984) {
            return true;
        }
        return false;
    }

    public boolean o(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        int i = this.g;
        boolean z = false;
        int c = i - this.a.c(interfaceC4421Uj0, i, false);
        this.g = c;
        if (c == 0) {
            z = true;
        }
        if (z) {
            if (this.f > 0) {
                InterfaceC10568wr2 interfaceC10568wr2 = this.a;
                long f = f();
                boolean m2 = m();
                interfaceC10568wr2.b(f, m2 ? 1 : 0, this.f, 0, null);
            }
            a();
        }
        return z;
    }

    public void p(int i) {
        this.f = i;
        this.g = i;
    }

    public void q(long j) {
        if (this.j == 0) {
            this.h = 0;
            return;
        }
        this.h = this.l[TD2.n(this.k, j, true, true)];
    }
}
