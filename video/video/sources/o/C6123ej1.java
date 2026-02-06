package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import o.C5881dj1;

/* renamed from: o.ej1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6123ej1 extends C3646Mk2 {

    /* renamed from: o.ej1$a */
    /* loaded from: classes.dex */
    public static final class a extends C4428Ul {
        public a f(int i, int i2, ByteBuffer byteBuffer) {
            b(i, i2, byteBuffer);
            return this;
        }

        public C6123ej1 g(int i) {
            return h(new C6123ej1(), i);
        }

        public C6123ej1 h(C6123ej1 c6123ej1, int i) {
            return c6123ej1.v(C3646Mk2.c(a(i), this.d), this.d);
        }
    }

    public static void A(C4852Yu0 c4852Yu0, int i) {
        c4852Yu0.k(0, i, 0);
    }

    public static int B(C4852Yu0 c4852Yu0, int[] iArr) {
        c4852Yu0.h0(4, iArr.length, 4);
        for (int length = iArr.length - 1; length >= 0; length--) {
            c4852Yu0.n(iArr[length]);
        }
        return c4852Yu0.E();
    }

    public static int C(C4852Yu0 c4852Yu0, int i, int i2, int i3) {
        c4852Yu0.g0(3);
        z(c4852Yu0, i3);
        y(c4852Yu0, i2);
        A(c4852Yu0, i);
        return D(c4852Yu0);
    }

    public static int D(C4852Yu0 c4852Yu0) {
        return c4852Yu0.D();
    }

    public static void E(C4852Yu0 c4852Yu0, int i) {
        c4852Yu0.F(i);
    }

    public static void F(C4852Yu0 c4852Yu0, int i) {
        c4852Yu0.J(i);
    }

    public static C6123ej1 G(ByteBuffer byteBuffer) {
        return H(byteBuffer, new C6123ej1());
    }

    public static C6123ej1 H(ByteBuffer byteBuffer, C6123ej1 c6123ej1) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c6123ej1.v(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public static void Q(C4852Yu0 c4852Yu0, int i) {
        c4852Yu0.h0(4, i, 4);
    }

    public static void R(C4852Yu0 c4852Yu0) {
        c4852Yu0.g0(3);
    }

    public static void u() {
        IK.a();
    }

    public static void y(C4852Yu0 c4852Yu0, int i) {
        c4852Yu0.o(1, i, 0);
    }

    public static void z(C4852Yu0 c4852Yu0, int i) {
        c4852Yu0.o(2, i, 0);
    }

    public C5881dj1 I(int i) {
        return J(new C5881dj1(), i);
    }

    public C5881dj1 J(C5881dj1 c5881dj1, int i) {
        int d = d(6);
        if (d != 0) {
            return c5881dj1.v(b(l(d) + (i * 4)), this.b);
        }
        return null;
    }

    public int K() {
        int d = d(6);
        if (d != 0) {
            return o(d);
        }
        return 0;
    }

    public C5881dj1.a L() {
        return M(new C5881dj1.a());
    }

    public C5881dj1.a M(C5881dj1.a aVar) {
        int d = d(6);
        if (d != 0) {
            return aVar.f(l(d), 4, this.b);
        }
        return null;
    }

    public String N() {
        int d = d(8);
        if (d != 0) {
            return h(d + this.a);
        }
        return null;
    }

    public ByteBuffer O() {
        return m(8, 1);
    }

    public ByteBuffer P(ByteBuffer byteBuffer) {
        return n(byteBuffer, 8, 1);
    }

    public int S() {
        int d = d(4);
        if (d != 0) {
            return this.b.getInt(d + this.a);
        }
        return 0;
    }

    public C6123ej1 v(int i, ByteBuffer byteBuffer) {
        w(i, byteBuffer);
        return this;
    }

    public void w(int i, ByteBuffer byteBuffer) {
        g(i, byteBuffer);
    }
}
