package o;

import android.util.SparseArray;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import o.HD1;
import o.InterfaceC7583kh1;

@Deprecated
/* loaded from: classes2.dex */
public interface J8 {
    public static final int A = 26;
    public static final int B = 28;
    public static final int C = 27;
    public static final int D = 29;
    public static final int E = 30;
    public static final int F = 1000;
    public static final int G = 1001;
    public static final int H = 1002;
    public static final int I = 1003;
    public static final int J = 1004;
    public static final int K = 1005;
    public static final int L = 1006;
    public static final int M = 1007;
    public static final int N = 1008;
    public static final int O = 1009;
    public static final int P = 1010;
    public static final int Q = 1011;
    public static final int R = 1012;
    public static final int S = 1013;
    public static final int T = 1014;
    public static final int U = 1015;
    public static final int V = 1016;
    public static final int W = 1017;
    public static final int X = 1018;
    public static final int Y = 1019;
    public static final int Z = 1020;
    public static final int a = 0;
    public static final int a0 = 1021;
    public static final int b = 1;
    public static final int b0 = 1022;
    public static final int c = 2;
    public static final int c0 = 1023;
    public static final int d = 3;
    public static final int d0 = 1024;
    public static final int e = 4;
    public static final int e0 = 1025;
    public static final int f = 5;
    public static final int f0 = 1026;
    public static final int g = 6;
    public static final int g0 = 1027;
    public static final int h = 7;
    public static final int h0 = 1028;
    public static final int i = 8;
    public static final int i0 = 1029;
    public static final int j = 9;
    public static final int j0 = 1030;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 12;
    public static final int n = 13;

    /* renamed from: o  reason: collision with root package name */
    public static final int f501o = 14;
    public static final int p = 15;
    public static final int q = 16;
    public static final int r = 17;
    public static final int s = 18;
    public static final int t = 19;
    public static final int u = 20;
    public static final int v = 21;
    public static final int w = 22;
    public static final int x = 23;
    public static final int y = 24;
    public static final int z = 25;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface a {
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public final long a;
        public final AbstractC7373jp2 b;
        public final int c;
        @InterfaceC11300zs1
        public final InterfaceC7583kh1.b d;
        public final long e;
        public final AbstractC7373jp2 f;
        public final int g;
        @InterfaceC11300zs1
        public final InterfaceC7583kh1.b h;
        public final long i;
        public final long j;

        public b(long j, AbstractC7373jp2 abstractC7373jp2, int i, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar, long j2, AbstractC7373jp2 abstractC7373jp22, int i2, @InterfaceC11300zs1 InterfaceC7583kh1.b bVar2, long j3, long j4) {
            this.a = j;
            this.b = abstractC7373jp2;
            this.c = i;
            this.d = bVar;
            this.e = j2;
            this.f = abstractC7373jp22;
            this.g = i2;
            this.h = bVar2;
            this.i = j3;
            this.j = j4;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.a == bVar.a && this.c == bVar.c && this.e == bVar.e && this.g == bVar.g && this.i == bVar.i && this.j == bVar.j && C2593Bt1.a(this.b, bVar.b) && C2593Bt1.a(this.d, bVar.d) && C2593Bt1.a(this.f, bVar.f) && C2593Bt1.a(this.h, bVar.h)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C2593Bt1.b(Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j));
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public final C4170Ru0 a;
        public final SparseArray<b> b;

        public c(C4170Ru0 c4170Ru0, SparseArray<b> sparseArray) {
            this.a = c4170Ru0;
            SparseArray<b> sparseArray2 = new SparseArray<>(c4170Ru0.d());
            for (int i = 0; i < c4170Ru0.d(); i++) {
                int c = c4170Ru0.c(i);
                sparseArray2.append(c, (b) C9542sf.g(sparseArray.get(c)));
            }
            this.b = sparseArray2;
        }

        public boolean a(int i) {
            return this.a.a(i);
        }

        public boolean b(int... iArr) {
            return this.a.b(iArr);
        }

        public int c(int i) {
            return this.a.c(i);
        }

        public b d(int i) {
            return (b) C9542sf.g(this.b.get(i));
        }

        public int e() {
            return this.a.d();
        }
    }

    default void L(b bVar) {
    }

    @Deprecated
    default void S(b bVar) {
    }

    default void W(b bVar) {
    }

    default void a(b bVar) {
    }

    @Deprecated
    default void b0(b bVar) {
    }

    default void f(b bVar) {
    }

    default void h0(b bVar) {
    }

    default void A(b bVar, C10519wf1 c10519wf1) {
    }

    default void A0(b bVar, long j2) {
    }

    default void B(b bVar, C8274nS c8274nS) {
    }

    default void C(b bVar, Q20 q20) {
    }

    default void D(b bVar, C8775pW c8775pW) {
    }

    default void H(b bVar, C2989Fr2 c2989Fr2) {
    }

    default void K(b bVar, Exception exc) {
    }

    default void N(b bVar, C11005yf1 c11005yf1) {
    }

    default void O(b bVar, long j2) {
    }

    default void R(b bVar, HD1.c cVar) {
    }

    default void U(b bVar, boolean z2) {
    }

    @Deprecated
    default void X(b bVar, int i2) {
    }

    default void a0(b bVar, boolean z2) {
    }

    default void c(b bVar, Exception exc) {
    }

    @Deprecated
    default void d0(b bVar, C10833xx0 c10833xx0) {
    }

    default void e(b bVar, AD1 ad1) {
    }

    default void e0(b bVar, @InterfaceC11300zs1 AD1 ad1) {
    }

    default void f0(b bVar, Exception exc) {
    }

    default void g(b bVar, C4224Si1 c4224Si1) {
    }

    default void g0(HD1 hd1, c cVar) {
    }

    default void h(b bVar, int i2) {
    }

    @Deprecated
    default void i(b bVar, boolean z2) {
    }

    default void j(b bVar, C11005yf1 c11005yf1) {
    }

    default void j0(b bVar, long j2) {
    }

    default void k(b bVar, String str) {
    }

    default void l(b bVar, C9546sg c9546sg) {
    }

    @Deprecated
    default void l0(b bVar, C10833xx0 c10833xx0) {
    }

    default void m0(b bVar, float f2) {
    }

    default void n(b bVar, long j2) {
    }

    default void n0(b bVar, DD1 dd1) {
    }

    default void o(b bVar, int i2) {
    }

    default void p(b bVar, int i2) {
    }

    default void q(b bVar, String str) {
    }

    default void q0(b bVar, C8775pW c8775pW) {
    }

    default void s(b bVar, C8775pW c8775pW) {
    }

    default void s0(b bVar, C8775pW c8775pW) {
    }

    default void t0(b bVar, int i2) {
    }

    default void u(b bVar, boolean z2) {
    }

    default void u0(b bVar, C3773Nr2 c3773Nr2) {
    }

    default void v(b bVar, int i2) {
    }

    default void w0(b bVar, PG2 pg2) {
    }

    default void x(b bVar, Exception exc) {
    }

    default void x0(b bVar, boolean z2) {
    }

    default void y(b bVar, int i2) {
    }

    @Deprecated
    default void y0(b bVar, List<C7284jS> list) {
    }

    default void z(b bVar, C10519wf1 c10519wf1) {
    }

    default void E(b bVar, Object obj, long j2) {
    }

    @Deprecated
    default void F(b bVar, String str, long j2) {
    }

    default void G(b bVar, N11 n11, C10519wf1 c10519wf1) {
    }

    @Deprecated
    default void J(b bVar, boolean z2, int i2) {
    }

    default void M(b bVar, @InterfaceC11300zs1 C8322nf1 c8322nf1, int i2) {
    }

    default void Q(b bVar, long j2, int i2) {
    }

    default void T(b bVar, int i2, long j2) {
    }

    @Deprecated
    default void Y(b bVar, String str, long j2) {
    }

    default void b(b bVar, boolean z2, int i2) {
    }

    default void c0(b bVar, N11 n11, C10519wf1 c10519wf1) {
    }

    default void d(b bVar, int i2, int i3) {
    }

    default void o0(b bVar, int i2, boolean z2) {
    }

    default void t(b bVar, C10833xx0 c10833xx0, @InterfaceC11300zs1 C9996uW c9996uW) {
    }

    default void v0(b bVar, N11 n11, C10519wf1 c10519wf1) {
    }

    default void w(b bVar, C10833xx0 c10833xx0, @InterfaceC11300zs1 C9996uW c9996uW) {
    }

    default void I(b bVar, String str, long j2, long j3) {
    }

    default void P(b bVar, HD1.k kVar, HD1.k kVar2, int i2) {
    }

    default void Z(b bVar, String str, long j2, long j3) {
    }

    default void p0(b bVar, int i2, long j2, long j3) {
    }

    default void z0(b bVar, int i2, long j2, long j3) {
    }

    @Deprecated
    default void k0(b bVar, int i2, int i3, int i4, float f2) {
    }

    default void r0(b bVar, N11 n11, C10519wf1 c10519wf1, IOException iOException, boolean z2) {
    }
}
