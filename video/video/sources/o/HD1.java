package o;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import o.C4170Ru0;
import o.HD1;
import o.InterfaceC8368nr;

@Deprecated
/* loaded from: classes2.dex */
public interface HD1 {
    public static final int A = 0;
    public static final int A0 = 14;
    public static final int B = 1;
    public static final int B0 = 15;
    public static final int C = 2;
    public static final int C0 = 16;
    public static final int D = 3;
    public static final int D0 = 17;
    public static final int E = 0;
    @Deprecated
    public static final int E0 = 18;
    public static final int F = 1;
    public static final int F0 = 18;
    public static final int G = 2;
    @Deprecated
    public static final int G0 = 19;
    public static final int H = 3;
    public static final int H0 = 19;
    public static final int I = 4;
    public static final int I0 = 31;
    public static final int J = 5;
    public static final int J0 = 20;
    public static final int K = 6;
    public static final int K0 = 21;
    public static final int L = 7;
    public static final int L0 = 22;
    public static final int M = 8;
    public static final int M0 = 23;
    public static final int N = 9;
    public static final int N0 = 24;
    public static final int O = 10;
    @Deprecated
    public static final int O0 = 25;
    public static final int P = 11;
    public static final int P0 = 33;
    public static final int Q = 12;
    @Deprecated
    public static final int Q0 = 26;
    public static final int R = 13;
    public static final int R0 = 34;
    public static final int S = 14;
    public static final int S0 = 27;
    public static final int T = 15;
    public static final int T0 = 28;
    public static final int U = 16;
    public static final int U0 = 29;
    public static final int V = 17;
    public static final int V0 = 30;
    public static final int W = 18;
    public static final int W0 = 32;
    public static final int X = 19;
    public static final int X0 = -1;
    public static final int Y = 20;
    public static final int Z = 21;
    public static final int a0 = 22;
    public static final int b0 = 23;
    public static final int c = 1;
    public static final int c0 = 24;
    public static final int d = 2;
    public static final int d0 = 25;
    public static final int e = 3;
    public static final int e0 = 26;
    public static final int f = 4;
    public static final int f0 = 27;
    public static final int g = 1;
    public static final int g0 = 28;
    public static final int h = 2;
    public static final int h0 = 29;
    public static final int i = 3;
    public static final int i0 = 30;
    public static final int j = 4;
    public static final int j0 = 1;
    public static final int k = 5;
    public static final int k0 = 2;
    public static final int l = 6;
    public static final int l0 = 3;
    public static final int m = 0;
    public static final int m0 = 4;
    public static final int n = 1;
    public static final int n0 = 5;

    /* renamed from: o  reason: collision with root package name */
    public static final int f478o = 2;
    @Deprecated
    public static final int o0 = 5;
    public static final int p = 0;
    public static final int p0 = 6;
    public static final int q = 1;
    @Deprecated
    public static final int q0 = 6;
    public static final int r = 2;
    public static final int r0 = 7;
    public static final int s = 0;
    public static final int s0 = 8;
    public static final int t = 1;
    @Deprecated
    public static final int t0 = 8;
    public static final int u = 2;
    public static final int u0 = 9;
    public static final int v = 3;
    public static final int v0 = 10;
    public static final int w = 4;
    @Deprecated
    public static final int w0 = 10;
    public static final int x = 5;
    public static final int x0 = 11;
    public static final int y = 0;
    public static final int y0 = 12;
    public static final int z = 1;
    public static final int z0 = 13;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC8368nr {
        public final C4170Ru0 X;
        public static final c Y = new a().f();
        public static final String Z = TD2.R0(0);
        public static final InterfaceC8368nr.a<c> Y0 = new InterfaceC8368nr.a() { // from class: o.ID1
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                HD1.c g;
                g = HD1.c.g(bundle);
                return g;
            }
        };

        /* loaded from: classes2.dex */
        public static final class a {
            public static final int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};
            public final C4170Ru0.b a;

            @InterfaceC6181ey
            public a a(int i) {
                this.a.a(i);
                return this;
            }

            @InterfaceC6181ey
            public a b(c cVar) {
                this.a.b(cVar.X);
                return this;
            }

            @InterfaceC6181ey
            public a c(int... iArr) {
                this.a.c(iArr);
                return this;
            }

            @InterfaceC6181ey
            public a d() {
                this.a.c(b);
                return this;
            }

            @InterfaceC6181ey
            public a e(int i, boolean z) {
                this.a.d(i, z);
                return this;
            }

            public c f() {
                return new c(this.a.e());
            }

            @InterfaceC6181ey
            public a g(int i) {
                this.a.f(i);
                return this;
            }

            @InterfaceC6181ey
            public a h(int... iArr) {
                this.a.g(iArr);
                return this;
            }

            @InterfaceC6181ey
            public a i(int i, boolean z) {
                this.a.h(i, z);
                return this;
            }

            public a() {
                this.a = new C4170Ru0.b();
            }

            public a(c cVar) {
                C4170Ru0.b bVar = new C4170Ru0.b();
                this.a = bVar;
                bVar.b(cVar.X);
            }
        }

        public static c g(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Z);
            if (integerArrayList == null) {
                return Y;
            }
            a aVar = new a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.a(integerArrayList.get(i).intValue());
            }
            return aVar.f();
        }

        public a c() {
            return new a();
        }

        public boolean d(int i) {
            return this.X.a(i);
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < this.X.d(); i++) {
                arrayList.add(Integer.valueOf(this.X.c(i)));
            }
            bundle.putIntegerArrayList(Z, arrayList);
            return bundle;
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return this.X.equals(((c) obj).X);
        }

        public boolean f(int... iArr) {
            return this.X.b(iArr);
        }

        public int h(int i) {
            return this.X.c(i);
        }

        public int hashCode() {
            return this.X.hashCode();
        }

        public int i() {
            return this.X.d();
        }

        public c(C4170Ru0 c4170Ru0) {
            this.X = c4170Ru0;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface d {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface e {
    }

    /* loaded from: classes2.dex */
    public static final class f {
        public final C4170Ru0 a;

        public f(C4170Ru0 c4170Ru0) {
            this.a = c4170Ru0;
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

        public int d() {
            return this.a.d();
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            return this.a.equals(((f) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface h {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface i {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface j {
    }

    /* loaded from: classes2.dex */
    public static final class k implements InterfaceC8368nr {
        public static final String f1 = TD2.R0(0);
        public static final String g1 = TD2.R0(1);
        public static final String h1 = TD2.R0(2);
        public static final String i1 = TD2.R0(3);
        public static final String j1 = TD2.R0(4);
        public static final String k1 = TD2.R0(5);
        public static final String l1 = TD2.R0(6);
        public static final InterfaceC8368nr.a<k> m1 = new InterfaceC8368nr.a() { // from class: o.JD1
            @Override // o.InterfaceC8368nr.a
            public final InterfaceC8368nr a(Bundle bundle) {
                HD1.k b;
                b = HD1.k.b(bundle);
                return b;
            }
        };
        @InterfaceC11300zs1
        public final Object X;
        @Deprecated
        public final int Y;
        @InterfaceC11300zs1
        public final C8322nf1 Y0;
        public final int Z;
        @InterfaceC11300zs1
        public final Object Z0;
        public final int a1;
        public final long b1;
        public final long c1;
        public final int d1;
        public final int e1;

        @Deprecated
        public k(@InterfaceC11300zs1 Object obj, int i, @InterfaceC11300zs1 Object obj2, int i2, long j, long j2, int i3, int i4) {
            this(obj, i, C8322nf1.e1, obj2, i2, j, j2, i3, i4);
        }

        public static k b(Bundle bundle) {
            C8322nf1 a;
            int i = bundle.getInt(f1, 0);
            Bundle bundle2 = bundle.getBundle(g1);
            if (bundle2 == null) {
                a = null;
            } else {
                a = C8322nf1.l1.a(bundle2);
            }
            return new k(null, i, a, null, bundle.getInt(h1, 0), bundle.getLong(i1, 0L), bundle.getLong(j1, 0L), bundle.getInt(k1, -1), bundle.getInt(l1, -1));
        }

        public Bundle c(boolean z, boolean z2) {
            int i;
            long j;
            int i2;
            Bundle bundle = new Bundle();
            String str = f1;
            int i3 = 0;
            if (z2) {
                i = this.Z;
            } else {
                i = 0;
            }
            bundle.putInt(str, i);
            C8322nf1 c8322nf1 = this.Y0;
            if (c8322nf1 != null && z) {
                bundle.putBundle(g1, c8322nf1.e());
            }
            String str2 = h1;
            if (z2) {
                i3 = this.a1;
            }
            bundle.putInt(str2, i3);
            String str3 = i1;
            long j2 = 0;
            if (z) {
                j = this.b1;
            } else {
                j = 0;
            }
            bundle.putLong(str3, j);
            String str4 = j1;
            if (z) {
                j2 = this.c1;
            }
            bundle.putLong(str4, j2);
            String str5 = k1;
            int i4 = -1;
            if (z) {
                i2 = this.d1;
            } else {
                i2 = -1;
            }
            bundle.putInt(str5, i2);
            String str6 = l1;
            if (z) {
                i4 = this.e1;
            }
            bundle.putInt(str6, i4);
            return bundle;
        }

        @Override // o.InterfaceC8368nr
        public Bundle e() {
            return c(true, true);
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && k.class == obj.getClass()) {
                k kVar = (k) obj;
                if (this.Z == kVar.Z && this.a1 == kVar.a1 && this.b1 == kVar.b1 && this.c1 == kVar.c1 && this.d1 == kVar.d1 && this.e1 == kVar.e1 && C2593Bt1.a(this.X, kVar.X) && C2593Bt1.a(this.Z0, kVar.Z0) && C2593Bt1.a(this.Y0, kVar.Y0)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return C2593Bt1.b(this.X, Integer.valueOf(this.Z), this.Y0, this.Z0, Integer.valueOf(this.a1), Long.valueOf(this.b1), Long.valueOf(this.c1), Integer.valueOf(this.d1), Integer.valueOf(this.e1));
        }

        public k(@InterfaceC11300zs1 Object obj, int i, @InterfaceC11300zs1 C8322nf1 c8322nf1, @InterfaceC11300zs1 Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.X = obj;
            this.Y = i;
            this.Z = i;
            this.Y0 = c8322nf1;
            this.Z0 = obj2;
            this.a1 = i2;
            this.b1 = j;
            this.c1 = j2;
            this.d1 = i3;
            this.e1 = i4;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface l {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface m {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface n {
    }

    void A(@InterfaceC11300zs1 TextureView textureView);

    PG2 B();

    long B1();

    Q20 C();

    int C1();

    void D0(boolean z2);

    void D1(@BR0(from = 0) int i2, int i3);

    boolean E1();

    void F();

    @Deprecated
    void F0();

    void F1(C11005yf1 c11005yf1);

    void G(@InterfaceC11300zs1 SurfaceView surfaceView);

    @InterfaceC11300zs1
    Object G0();

    int G1();

    boolean H();

    void H0();

    @Deprecated
    boolean J1();

    @Deprecated
    void K(@BR0(from = 0) int i2);

    void K0(int i2);

    C3773Nr2 L0();

    void L1(List<C8322nf1> list, int i2, long j2);

    void M1(int i2);

    void N(C2989Fr2 c2989Fr2);

    long N1();

    boolean O();

    boolean P0();

    long P1();

    @Deprecated
    boolean Q();

    int Q0();

    long R();

    int R0();

    void S(boolean z2, int i2);

    void S1(int i2, List<C8322nf1> list);

    void T();

    boolean T0(int i2);

    @Deprecated
    int T1();

    @InterfaceC11300zs1
    C8322nf1 U();

    void U0(C8322nf1 c8322nf1, long j2);

    long U1();

    boolean V1();

    int X();

    boolean X0();

    @BR0(from = 0, to = 100)
    int Y();

    void Y0(long j2);

    C11005yf1 Y1();

    int Z();

    int Z0();

    boolean a();

    void a1(C8322nf1 c8322nf1, boolean z2);

    void a2(int i2, C8322nf1 c8322nf1);

    C9546sg b();

    @Deprecated
    boolean b0();

    void b1(@InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f2);

    @InterfaceC11300zs1
    AD1 c();

    void c0();

    int c2();

    void d0();

    void d1(C8322nf1 c8322nf1);

    @Deprecated
    int d2();

    void e0(List<C8322nf1> list, boolean z2);

    AbstractC7373jp2 e1();

    void f(DD1 dd1);

    void f1(g gVar);

    void g();

    void g0(C8322nf1 c8322nf1);

    long getCurrentPosition();

    long getDuration();

    @InterfaceC2501Av0(from = 0.0d, to = 1.0d)
    float getVolume();

    DD1 h();

    void h0(int i2);

    Looper h1();

    @Deprecated
    boolean hasNext();

    @Deprecated
    boolean hasPrevious();

    @Deprecated
    void i0();

    C2989Fr2 i1();

    void i2(int i2, int i3);

    boolean isPlaying();

    @Deprecated
    boolean j0();

    void j1();

    @Deprecated
    boolean j2();

    L82 k0();

    void k2(int i2, int i3, int i4);

    void l(@InterfaceC11300zs1 Surface surface);

    void l0(int i2, int i3, List<C8322nf1> list);

    void l1(g gVar);

    void m(@InterfaceC11300zs1 Surface surface);

    void m0();

    void m2(List<C8322nf1> list);

    @Deprecated
    void n();

    boolean n0();

    boolean n2();

    @Deprecated
    void next();

    void o(@InterfaceC11300zs1 SurfaceView surfaceView);

    void o0(int i2);

    long o2();

    void p(@InterfaceC11300zs1 SurfaceHolder surfaceHolder);

    int p0();

    void p2();

    void pause();

    @Deprecated
    void previous();

    long q1();

    void r2();

    C8274nS s();

    void s0(int i2, int i3);

    void s1(int i2, long j2);

    C11005yf1 s2();

    void setVolume(@InterfaceC2501Av0(from = 0.0d, to = 1.0d) float f2);

    void stop();

    @Deprecated
    void t(boolean z2);

    void t0();

    c t1();

    void t2(List<C8322nf1> list);

    void u0(int i2);

    boolean u1();

    long u2();

    @Deprecated
    void v();

    @Deprecated
    int v0();

    void v1(boolean z2);

    boolean v2();

    void w(@InterfaceC11300zs1 TextureView textureView);

    int w0();

    void x(@InterfaceC11300zs1 SurfaceHolder surfaceHolder);

    void x0(int i2, C8322nf1 c8322nf1);

    C8322nf1 x1(int i2);

    long y1();

    @BR0(from = 0)
    int z();

    void z0();

    /* loaded from: classes2.dex */
    public interface g {
        default void Z() {
        }

        default void A(DD1 dd1) {
        }

        default void G(C8274nS c8274nS) {
        }

        default void K(int i) {
        }

        @Deprecated
        default void L(boolean z) {
        }

        default void M(C3773Nr2 c3773Nr2) {
        }

        default void N(int i) {
        }

        default void O(int i) {
        }

        default void Q(boolean z) {
        }

        default void S(AD1 ad1) {
        }

        default void V(long j) {
        }

        default void X(C9546sg c9546sg) {
        }

        default void Y(C11005yf1 c11005yf1) {
        }

        default void a(boolean z) {
        }

        default void b0(c cVar) {
        }

        @Deprecated
        default void e0(int i) {
        }

        default void f1(int i) {
        }

        default void g0(@InterfaceC11300zs1 AD1 ad1) {
        }

        default void i0(boolean z) {
        }

        default void j0(float f) {
        }

        default void k0(C2989Fr2 c2989Fr2) {
        }

        default void p0(C11005yf1 c11005yf1) {
        }

        default void r0(Q20 q20) {
        }

        default void s(C4224Si1 c4224Si1) {
        }

        default void t(PG2 pg2) {
        }

        default void t0(long j) {
        }

        @Deprecated
        default void u(List<C7284jS> list) {
        }

        default void v0(long j) {
        }

        default void y0(boolean z) {
        }

        default void T(AbstractC7373jp2 abstractC7373jp2, int i) {
        }

        default void U(int i, boolean z) {
        }

        default void a0(int i, int i2) {
        }

        default void c0(HD1 hd1, f fVar) {
        }

        @Deprecated
        default void q0(boolean z, int i) {
        }

        default void w0(boolean z, int i) {
        }

        default void x0(@InterfaceC11300zs1 C8322nf1 c8322nf1, int i) {
        }

        default void R(k kVar, k kVar2, int i) {
        }
    }
}
