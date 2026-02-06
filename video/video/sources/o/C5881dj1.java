package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: o.dj1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5881dj1 extends C3646Mk2 {

    /* renamed from: o.dj1$a */
    /* loaded from: classes.dex */
    public static final class a extends C4428Ul {
        public a f(int i, int i2, ByteBuffer byteBuffer) {
            b(i, i2, byteBuffer);
            return this;
        }

        public C5881dj1 g(int i) {
            return h(new C5881dj1(), i);
        }

        public C5881dj1 h(C5881dj1 c5881dj1, int i) {
            return c5881dj1.v(C3646Mk2.c(a(i), this.d), this.d);
        }
    }

    public static void A(C4852Yu0 c4852Yu0, boolean z) {
        c4852Yu0.b(1, z, false);
    }

    public static void B(C4852Yu0 c4852Yu0, short s) {
        c4852Yu0.p(5, s, 0);
    }

    public static void C(C4852Yu0 c4852Yu0, int i) {
        c4852Yu0.k(0, i, 0);
    }

    public static void D(C4852Yu0 c4852Yu0, short s) {
        c4852Yu0.p(2, s, 0);
    }

    public static void E(C4852Yu0 c4852Yu0, short s) {
        c4852Yu0.p(4, s, 0);
    }

    public static int M(C4852Yu0 c4852Yu0, int[] iArr) {
        c4852Yu0.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            c4852Yu0.j(iArr[length]);
        }
        return c4852Yu0.E();
    }

    public static int N(C4852Yu0 c4852Yu0, int i, boolean z, short s, short s2, short s3, short s4, int i2) {
        c4852Yu0.g0(7);
        y(c4852Yu0, i2);
        C(c4852Yu0, i);
        B(c4852Yu0, s4);
        E(c4852Yu0, s3);
        z(c4852Yu0, s2);
        D(c4852Yu0, s);
        A(c4852Yu0, z);
        return P(c4852Yu0);
    }

    public static int P(C4852Yu0 c4852Yu0) {
        return c4852Yu0.D();
    }

    public static C5881dj1 Q(ByteBuffer byteBuffer) {
        return R(byteBuffer, new C5881dj1());
    }

    public static C5881dj1 R(ByteBuffer byteBuffer, C5881dj1 c5881dj1) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c5881dj1.v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void V(C4852Yu0 c4852Yu0, int i) {
        c4852Yu0.h0(4, i, 4);
    }

    public static void W(C4852Yu0 c4852Yu0) {
        c4852Yu0.g0(7);
    }

    public static void u() {
        IK.a();
    }

    public static void y(C4852Yu0 c4852Yu0, int i) {
        c4852Yu0.o(6, i, 0);
    }

    public static void z(C4852Yu0 c4852Yu0, short s) {
        c4852Yu0.p(3, s, 0);
    }

    public int F(int i) {
        int d = d(16);
        if (d != 0) {
            return this.b.getInt(l(d) + (i * 4));
        }
        return 0;
    }

    public ByteBuffer G() {
        return m(16, 4);
    }

    public ByteBuffer H(ByteBuffer byteBuffer) {
        return n(byteBuffer, 16, 4);
    }

    public int I() {
        int d = d(16);
        if (d != 0) {
            return o(d);
        }
        return 0;
    }

    public JR0 J() {
        return K(new JR0());
    }

    public JR0 K(JR0 jr0) {
        int d = d(16);
        if (d != 0) {
            return jr0.f(l(d), this.b);
        }
        return null;
    }

    public short L() {
        int d = d(10);
        if (d != 0) {
            return this.b.getShort(d + this.a);
        }
        return (short) 0;
    }

    public boolean O() {
        int d = d(6);
        if (d == 0 || this.b.get(d + this.a) == 0) {
            return false;
        }
        return true;
    }

    public short S() {
        int d = d(14);
        if (d != 0) {
            return this.b.getShort(d + this.a);
        }
        return (short) 0;
    }

    public int T() {
        int d = d(4);
        if (d != 0) {
            return this.b.getInt(d + this.a);
        }
        return 0;
    }

    public short U() {
        int d = d(8);
        if (d != 0) {
            return this.b.getShort(d + this.a);
        }
        return (short) 0;
    }

    public short X() {
        int d = d(12);
        if (d != 0) {
            return this.b.getShort(d + this.a);
        }
        return (short) 0;
    }

    public C5881dj1 v(int i, ByteBuffer byteBuffer) {
        w(i, byteBuffer);
        return this;
    }

    public void w(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
    }
}
