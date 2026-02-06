package o;

import java.io.IOException;
import java.util.Arrays;
import o.NN2;

/* renamed from: o.yA2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10888yA2 {
    public static final int f = 8;
    public static final C10888yA2 g = new C10888yA2(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public C10888yA2() {
        this(0, new int[8], new Object[8], true);
    }

    public static boolean c(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    public static C10888yA2 e() {
        return g;
    }

    public static int h(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    public static int i(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    public static C10888yA2 o(C10888yA2 c10888yA2, C10888yA2 c10888yA22) {
        int i = c10888yA2.a + c10888yA22.a;
        int[] copyOf = Arrays.copyOf(c10888yA2.b, i);
        System.arraycopy(c10888yA22.b, 0, copyOf, c10888yA2.a, c10888yA22.a);
        Object[] copyOf2 = Arrays.copyOf(c10888yA2.c, i);
        System.arraycopy(c10888yA22.c, 0, copyOf2, c10888yA2.a, c10888yA22.a);
        return new C10888yA2(i, copyOf, copyOf2, true);
    }

    public static C10888yA2 p() {
        return new C10888yA2();
    }

    public static void u(int i, Object obj, NN2 nn2) throws IOException {
        int a = IM2.a(i);
        int b = IM2.b(i);
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 5) {
                            nn2.c(a, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(C9258rT0.e());
                    } else if (nn2.y() == NN2.a.ASCENDING) {
                        nn2.F(a);
                        ((C10888yA2) obj).w(nn2);
                        nn2.M(a);
                        return;
                    } else {
                        nn2.M(a);
                        ((C10888yA2) obj).w(nn2);
                        nn2.F(a);
                        return;
                    }
                }
                nn2.e(a, (AbstractC8616os) obj);
                return;
            }
            nn2.x(a, ((Long) obj).longValue());
            return;
        }
        nn2.B(a, ((Long) obj).longValue());
    }

    public void a() {
        if (this.e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void b() {
        int i;
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 < 4) {
                i = 8;
            } else {
                i = i2 >> 1;
            }
            int i3 = i2 + i;
            this.b = Arrays.copyOf(iArr, i3);
            this.c = Arrays.copyOf(this.c, i3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10888yA2)) {
            return false;
        }
        C10888yA2 c10888yA2 = (C10888yA2) obj;
        int i = this.a;
        if (i == c10888yA2.a && c(this.b, c10888yA2.b, i) && d(this.c, c10888yA2.c, this.a)) {
            return true;
        }
        return false;
    }

    public int f() {
        int a1;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int a = IM2.a(i4);
            int b = IM2.b(i4);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 5) {
                                a1 = ME.m0(a, ((Integer) this.c[i3]).intValue());
                            } else {
                                throw new IllegalStateException(C9258rT0.e());
                            }
                        } else {
                            a1 = (ME.X0(a) * 2) + ((C10888yA2) this.c[i3]).f();
                        }
                    } else {
                        a1 = ME.g0(a, (AbstractC8616os) this.c[i3]);
                    }
                } else {
                    a1 = ME.o0(a, ((Long) this.c[i3]).longValue());
                }
            } else {
                a1 = ME.a1(a, ((Long) this.c[i3]).longValue());
            }
            i2 += a1;
        }
        this.d = i2;
        return i2;
    }

    public int g() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            i2 += ME.K0(IM2.a(this.b[i3]), (AbstractC8616os) this.c[i3]);
        }
        this.d = i2;
        return i2;
    }

    public int hashCode() {
        int i = this.a;
        return ((((527 + i) * 31) + h(this.b, i)) * 31) + i(this.c, this.a);
    }

    public void j() {
        this.e = false;
    }

    public boolean k(int i, KE ke) throws IOException {
        a();
        int a = IM2.a(i);
        int b = IM2.b(i);
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        if (b != 4) {
                            if (b == 5) {
                                r(i, Integer.valueOf(ke.A()));
                                return true;
                            }
                            throw C9258rT0.e();
                        }
                        return false;
                    }
                    C10888yA2 c10888yA2 = new C10888yA2();
                    c10888yA2.l(ke);
                    ke.a(IM2.c(a, 4));
                    r(i, c10888yA2);
                    return true;
                }
                r(i, ke.x());
                return true;
            }
            r(i, Long.valueOf(ke.B()));
            return true;
        }
        r(i, Long.valueOf(ke.G()));
        return true;
    }

    public final C10888yA2 l(KE ke) throws IOException {
        int Y;
        do {
            Y = ke.Y();
            if (Y == 0) {
                break;
            }
        } while (k(Y, ke));
        return this;
    }

    public C10888yA2 m(int i, AbstractC8616os abstractC8616os) {
        a();
        if (i != 0) {
            r(IM2.c(i, 2), abstractC8616os);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public C10888yA2 n(int i, int i2) {
        a();
        if (i != 0) {
            r(IM2.c(i, 0), Long.valueOf(i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void q(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            C3735Ni1.c(sb, i, String.valueOf(IM2.a(this.b[i2])), this.c[i2]);
        }
    }

    public void r(int i, Object obj) {
        a();
        b();
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public void s(ME me) throws IOException {
        for (int i = 0; i < this.a; i++) {
            me.Y1(IM2.a(this.b[i]), (AbstractC8616os) this.c[i]);
        }
    }

    public void t(NN2 nn2) throws IOException {
        if (nn2.y() == NN2.a.DESCENDING) {
            for (int i = this.a - 1; i >= 0; i--) {
                nn2.b(IM2.a(this.b[i]), this.c[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.a; i2++) {
            nn2.b(IM2.a(this.b[i2]), this.c[i2]);
        }
    }

    public void v(ME me) throws IOException {
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            int a = IM2.a(i2);
            int b = IM2.b(i2);
            if (b != 0) {
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            if (b == 5) {
                                me.c(a, ((Integer) this.c[i]).intValue());
                            } else {
                                throw C9258rT0.e();
                            }
                        } else {
                            me.g2(a, 3);
                            ((C10888yA2) this.c[i]).v(me);
                            me.g2(a, 4);
                        }
                    } else {
                        me.e(a, (AbstractC8616os) this.c[i]);
                    }
                } else {
                    me.x(a, ((Long) this.c[i]).longValue());
                }
            } else {
                me.h(a, ((Long) this.c[i]).longValue());
            }
        }
    }

    public void w(NN2 nn2) throws IOException {
        if (this.a != 0) {
            if (nn2.y() == NN2.a.ASCENDING) {
                for (int i = 0; i < this.a; i++) {
                    u(this.b[i], this.c[i], nn2);
                }
                return;
            }
            for (int i2 = this.a - 1; i2 >= 0; i2--) {
                u(this.b[i2], this.c[i2], nn2);
            }
        }
    }

    public C10888yA2(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
