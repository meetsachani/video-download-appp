package o;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import o.HD1;

@Deprecated
/* renamed from: o.By0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2608By0 implements HD1 {
    public final HD1 Y0;

    /* renamed from: o.By0$a */
    /* loaded from: classes2.dex */
    public static final class a implements HD1.g {
        public final C2608By0 X;
        public final HD1.g Y;

        public a(C2608By0 c2608By0, HD1.g gVar) {
            this.X = c2608By0;
            this.Y = gVar;
        }

        @Override // o.HD1.g
        public void A(DD1 dd1) {
            this.Y.A(dd1);
        }

        @Override // o.HD1.g
        public void G(C8274nS c8274nS) {
            this.Y.G(c8274nS);
        }

        @Override // o.HD1.g
        public void K(int i) {
            this.Y.K(i);
        }

        @Override // o.HD1.g
        public void L(boolean z) {
            this.Y.i0(z);
        }

        @Override // o.HD1.g
        public void M(C3773Nr2 c3773Nr2) {
            this.Y.M(c3773Nr2);
        }

        @Override // o.HD1.g
        public void N(int i) {
            this.Y.N(i);
        }

        @Override // o.HD1.g
        public void O(int i) {
            this.Y.O(i);
        }

        @Override // o.HD1.g
        public void Q(boolean z) {
            this.Y.Q(z);
        }

        @Override // o.HD1.g
        public void R(HD1.k kVar, HD1.k kVar2, int i) {
            this.Y.R(kVar, kVar2, i);
        }

        @Override // o.HD1.g
        public void S(AD1 ad1) {
            this.Y.S(ad1);
        }

        @Override // o.HD1.g
        public void T(AbstractC7373jp2 abstractC7373jp2, int i) {
            this.Y.T(abstractC7373jp2, i);
        }

        @Override // o.HD1.g
        public void U(int i, boolean z) {
            this.Y.U(i, z);
        }

        @Override // o.HD1.g
        public void V(long j) {
            this.Y.V(j);
        }

        @Override // o.HD1.g
        public void X(C9546sg c9546sg) {
            this.Y.X(c9546sg);
        }

        @Override // o.HD1.g
        public void Y(C11005yf1 c11005yf1) {
            this.Y.Y(c11005yf1);
        }

        @Override // o.HD1.g
        public void Z() {
            this.Y.Z();
        }

        @Override // o.HD1.g
        public void a(boolean z) {
            this.Y.a(z);
        }

        @Override // o.HD1.g
        public void a0(int i, int i2) {
            this.Y.a0(i, i2);
        }

        @Override // o.HD1.g
        public void b0(HD1.c cVar) {
            this.Y.b0(cVar);
        }

        @Override // o.HD1.g
        public void c0(HD1 hd1, HD1.f fVar) {
            this.Y.c0(this.X, fVar);
        }

        @Override // o.HD1.g
        public void e0(int i) {
            this.Y.e0(i);
        }

        public boolean equals(@InterfaceC11300zs1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.X.equals(aVar.X)) {
                return false;
            }
            return this.Y.equals(aVar.Y);
        }

        @Override // o.HD1.g
        public void f1(int i) {
            this.Y.f1(i);
        }

        @Override // o.HD1.g
        public void g0(@InterfaceC11300zs1 AD1 ad1) {
            this.Y.g0(ad1);
        }

        public int hashCode() {
            return (this.X.hashCode() * 31) + this.Y.hashCode();
        }

        @Override // o.HD1.g
        public void i0(boolean z) {
            this.Y.i0(z);
        }

        @Override // o.HD1.g
        public void j0(float f) {
            this.Y.j0(f);
        }

        @Override // o.HD1.g
        public void k0(C2989Fr2 c2989Fr2) {
            this.Y.k0(c2989Fr2);
        }

        @Override // o.HD1.g
        public void p0(C11005yf1 c11005yf1) {
            this.Y.p0(c11005yf1);
        }

        @Override // o.HD1.g
        public void q0(boolean z, int i) {
            this.Y.q0(z, i);
        }

        @Override // o.HD1.g
        public void r0(Q20 q20) {
            this.Y.r0(q20);
        }

        @Override // o.HD1.g
        public void s(C4224Si1 c4224Si1) {
            this.Y.s(c4224Si1);
        }

        @Override // o.HD1.g
        public void t(PG2 pg2) {
            this.Y.t(pg2);
        }

        @Override // o.HD1.g
        public void t0(long j) {
            this.Y.t0(j);
        }

        @Override // o.HD1.g
        public void u(List<C7284jS> list) {
            this.Y.u(list);
        }

        @Override // o.HD1.g
        public void v0(long j) {
            this.Y.v0(j);
        }

        @Override // o.HD1.g
        public void w0(boolean z, int i) {
            this.Y.w0(z, i);
        }

        @Override // o.HD1.g
        public void x0(@InterfaceC11300zs1 C8322nf1 c8322nf1, int i) {
            this.Y.x0(c8322nf1, i);
        }

        @Override // o.HD1.g
        public void y0(boolean z) {
            this.Y.y0(z);
        }
    }

    public C2608By0(HD1 hd1) {
        this.Y0 = hd1;
    }

    @Override // o.HD1
    public void A(@InterfaceC11300zs1 TextureView textureView) {
        this.Y0.A(textureView);
    }

    @Override // o.HD1
    public PG2 B() {
        return this.Y0.B();
    }

    @Override // o.HD1
    public long B1() {
        return this.Y0.B1();
    }

    @Override // o.HD1
    public Q20 C() {
        return this.Y0.C();
    }

    @Override // o.HD1
    public int C1() {
        return this.Y0.C1();
    }

    @Override // o.HD1
    public void D0(boolean z) {
        this.Y0.D0(z);
    }

    @Override // o.HD1
    public void D1(int i, int i2) {
        this.Y0.D1(i, i2);
    }

    @Override // o.HD1
    public boolean E1() {
        return this.Y0.E1();
    }

    @Override // o.HD1
    public void F() {
        this.Y0.F();
    }

    @Override // o.HD1
    @Deprecated
    public void F0() {
        this.Y0.F0();
    }

    @Override // o.HD1
    public void F1(C11005yf1 c11005yf1) {
        this.Y0.F1(c11005yf1);
    }

    @Override // o.HD1
    public void G(@InterfaceC11300zs1 SurfaceView surfaceView) {
        this.Y0.G(surfaceView);
    }

    @Override // o.HD1
    @InterfaceC11300zs1
    public Object G0() {
        return this.Y0.G0();
    }

    @Override // o.HD1
    public int G1() {
        return this.Y0.G1();
    }

    @Override // o.HD1
    public boolean H() {
        return this.Y0.H();
    }

    @Override // o.HD1
    public void H0() {
        this.Y0.H0();
    }

    @Override // o.HD1
    @Deprecated
    public boolean J1() {
        return this.Y0.J1();
    }

    @Override // o.HD1
    @Deprecated
    public void K(int i) {
        this.Y0.K(i);
    }

    @Override // o.HD1
    public void K0(int i) {
        this.Y0.K0(i);
    }

    @Override // o.HD1
    public C3773Nr2 L0() {
        return this.Y0.L0();
    }

    @Override // o.HD1
    public void L1(List<C8322nf1> list, int i, long j) {
        this.Y0.L1(list, i, j);
    }

    @Override // o.HD1
    public void M1(int i) {
        this.Y0.M1(i);
    }

    @Override // o.HD1
    public void N(C2989Fr2 c2989Fr2) {
        this.Y0.N(c2989Fr2);
    }

    @Override // o.HD1
    public long N1() {
        return this.Y0.N1();
    }

    @Override // o.HD1
    public boolean O() {
        return this.Y0.O();
    }

    @Override // o.HD1
    public boolean P0() {
        return this.Y0.P0();
    }

    @Override // o.HD1
    public long P1() {
        return this.Y0.P1();
    }

    @Override // o.HD1
    @Deprecated
    public boolean Q() {
        return this.Y0.Q();
    }

    @Override // o.HD1
    public int Q0() {
        return this.Y0.Q0();
    }

    @Override // o.HD1
    public long R() {
        return this.Y0.R();
    }

    @Override // o.HD1
    public int R0() {
        return this.Y0.R0();
    }

    @Override // o.HD1
    public void S(boolean z, int i) {
        this.Y0.S(z, i);
    }

    @Override // o.HD1
    public void S1(int i, List<C8322nf1> list) {
        this.Y0.S1(i, list);
    }

    @Override // o.HD1
    public void T() {
        this.Y0.T();
    }

    @Override // o.HD1
    public boolean T0(int i) {
        return this.Y0.T0(i);
    }

    @Override // o.HD1
    @Deprecated
    public int T1() {
        return this.Y0.T1();
    }

    @Override // o.HD1
    @InterfaceC11300zs1
    public C8322nf1 U() {
        return this.Y0.U();
    }

    @Override // o.HD1
    public void U0(C8322nf1 c8322nf1, long j) {
        this.Y0.U0(c8322nf1, j);
    }

    @Override // o.HD1
    public long U1() {
        return this.Y0.U1();
    }

    @Override // o.HD1
    public boolean V1() {
        return this.Y0.V1();
    }

    @Override // o.HD1
    public int X() {
        return this.Y0.X();
    }

    @Override // o.HD1
    public boolean X0() {
        return this.Y0.X0();
    }

    @Override // o.HD1
    public int Y() {
        return this.Y0.Y();
    }

    @Override // o.HD1
    public void Y0(long j) {
        this.Y0.Y0(j);
    }

    @Override // o.HD1
    public C11005yf1 Y1() {
        return this.Y0.Y1();
    }

    @Override // o.HD1
    public int Z() {
        return this.Y0.Z();
    }

    @Override // o.HD1
    public int Z0() {
        return this.Y0.Z0();
    }

    @Override // o.HD1
    public boolean a() {
        return this.Y0.a();
    }

    @Override // o.HD1
    public void a1(C8322nf1 c8322nf1, boolean z) {
        this.Y0.a1(c8322nf1, z);
    }

    @Override // o.HD1
    public void a2(int i, C8322nf1 c8322nf1) {
        this.Y0.a2(i, c8322nf1);
    }

    @Override // o.HD1
    public C9546sg b() {
        return this.Y0.b();
    }

    @Override // o.HD1
    @Deprecated
    public boolean b0() {
        return this.Y0.b0();
    }

    @Override // o.HD1
    public void b1(float f) {
        this.Y0.b1(f);
    }

    @Override // o.HD1
    @InterfaceC11300zs1
    public AD1 c() {
        return this.Y0.c();
    }

    @Override // o.HD1
    public void c0() {
        this.Y0.c0();
    }

    @Override // o.HD1
    public int c2() {
        return this.Y0.c2();
    }

    @Override // o.HD1
    public void d0() {
        this.Y0.d0();
    }

    @Override // o.HD1
    public void d1(C8322nf1 c8322nf1) {
        this.Y0.d1(c8322nf1);
    }

    @Override // o.HD1
    @Deprecated
    public int d2() {
        return this.Y0.d2();
    }

    @Override // o.HD1
    public void e0(List<C8322nf1> list, boolean z) {
        this.Y0.e0(list, z);
    }

    @Override // o.HD1
    public AbstractC7373jp2 e1() {
        return this.Y0.e1();
    }

    @Override // o.HD1
    public void f(DD1 dd1) {
        this.Y0.f(dd1);
    }

    @Override // o.HD1
    public void f1(HD1.g gVar) {
        this.Y0.f1(new a(this, gVar));
    }

    @Override // o.HD1
    public void g() {
        this.Y0.g();
    }

    @Override // o.HD1
    public void g0(C8322nf1 c8322nf1) {
        this.Y0.g0(c8322nf1);
    }

    @Override // o.HD1
    public long getCurrentPosition() {
        return this.Y0.getCurrentPosition();
    }

    @Override // o.HD1
    public long getDuration() {
        return this.Y0.getDuration();
    }

    @Override // o.HD1
    public float getVolume() {
        return this.Y0.getVolume();
    }

    @Override // o.HD1
    public DD1 h() {
        return this.Y0.h();
    }

    @Override // o.HD1
    public void h0(int i) {
        this.Y0.h0(i);
    }

    @Override // o.HD1
    public Looper h1() {
        return this.Y0.h1();
    }

    @Override // o.HD1
    @Deprecated
    public boolean hasNext() {
        return this.Y0.hasNext();
    }

    @Override // o.HD1
    @Deprecated
    public boolean hasPrevious() {
        return this.Y0.hasPrevious();
    }

    @Override // o.HD1
    @Deprecated
    public void i0() {
        this.Y0.i0();
    }

    @Override // o.HD1
    public C2989Fr2 i1() {
        return this.Y0.i1();
    }

    @Override // o.HD1
    public void i2(int i, int i2) {
        this.Y0.i2(i, i2);
    }

    @Override // o.HD1
    public boolean isPlaying() {
        return this.Y0.isPlaying();
    }

    @Override // o.HD1
    @Deprecated
    public boolean j0() {
        return this.Y0.j0();
    }

    @Override // o.HD1
    public void j1() {
        this.Y0.j1();
    }

    @Override // o.HD1
    @Deprecated
    public boolean j2() {
        return this.Y0.j2();
    }

    @Override // o.HD1
    public L82 k0() {
        return this.Y0.k0();
    }

    @Override // o.HD1
    public void k2(int i, int i2, int i3) {
        this.Y0.k2(i, i2, i3);
    }

    @Override // o.HD1
    public void l(@InterfaceC11300zs1 Surface surface) {
        this.Y0.l(surface);
    }

    @Override // o.HD1
    public void l0(int i, int i2, List<C8322nf1> list) {
        this.Y0.l0(i, i2, list);
    }

    @Override // o.HD1
    public void l1(HD1.g gVar) {
        this.Y0.l1(new a(this, gVar));
    }

    @Override // o.HD1
    public void m(@InterfaceC11300zs1 Surface surface) {
        this.Y0.m(surface);
    }

    @Override // o.HD1
    public void m0() {
        this.Y0.m0();
    }

    @Override // o.HD1
    public void m2(List<C8322nf1> list) {
        this.Y0.m2(list);
    }

    @Override // o.HD1
    @Deprecated
    public void n() {
        this.Y0.n();
    }

    @Override // o.HD1
    public boolean n0() {
        return this.Y0.n0();
    }

    @Override // o.HD1
    public boolean n2() {
        return this.Y0.n2();
    }

    @Override // o.HD1
    @Deprecated
    public void next() {
        this.Y0.next();
    }

    @Override // o.HD1
    public void o(@InterfaceC11300zs1 SurfaceView surfaceView) {
        this.Y0.o(surfaceView);
    }

    @Override // o.HD1
    public void o0(int i) {
        this.Y0.o0(i);
    }

    @Override // o.HD1
    public long o2() {
        return this.Y0.o2();
    }

    @Override // o.HD1
    public void p(@InterfaceC11300zs1 SurfaceHolder surfaceHolder) {
        this.Y0.p(surfaceHolder);
    }

    @Override // o.HD1
    public int p0() {
        return this.Y0.p0();
    }

    @Override // o.HD1
    public void p2() {
        this.Y0.p2();
    }

    @Override // o.HD1
    public void pause() {
        this.Y0.pause();
    }

    @Override // o.HD1
    @Deprecated
    public void previous() {
        this.Y0.previous();
    }

    @Override // o.HD1
    public long q1() {
        return this.Y0.q1();
    }

    @Override // o.HD1
    public void r2() {
        this.Y0.r2();
    }

    @Override // o.HD1
    public C8274nS s() {
        return this.Y0.s();
    }

    @Override // o.HD1
    public void s0(int i, int i2) {
        this.Y0.s0(i, i2);
    }

    @Override // o.HD1
    public void s1(int i, long j) {
        this.Y0.s1(i, j);
    }

    @Override // o.HD1
    public C11005yf1 s2() {
        return this.Y0.s2();
    }

    @Override // o.HD1
    public void setVolume(float f) {
        this.Y0.setVolume(f);
    }

    @Override // o.HD1
    public void stop() {
        this.Y0.stop();
    }

    @Override // o.HD1
    @Deprecated
    public void t(boolean z) {
        this.Y0.t(z);
    }

    @Override // o.HD1
    public void t0() {
        this.Y0.t0();
    }

    @Override // o.HD1
    public HD1.c t1() {
        return this.Y0.t1();
    }

    @Override // o.HD1
    public void t2(List<C8322nf1> list) {
        this.Y0.t2(list);
    }

    @Override // o.HD1
    public void u0(int i) {
        this.Y0.u0(i);
    }

    @Override // o.HD1
    public boolean u1() {
        return this.Y0.u1();
    }

    @Override // o.HD1
    public long u2() {
        return this.Y0.u2();
    }

    @Override // o.HD1
    @Deprecated
    public void v() {
        this.Y0.v();
    }

    @Override // o.HD1
    @Deprecated
    public int v0() {
        return this.Y0.v0();
    }

    @Override // o.HD1
    public void v1(boolean z) {
        this.Y0.v1(z);
    }

    @Override // o.HD1
    public boolean v2() {
        return this.Y0.v2();
    }

    @Override // o.HD1
    public void w(@InterfaceC11300zs1 TextureView textureView) {
        this.Y0.w(textureView);
    }

    @Override // o.HD1
    public int w0() {
        return this.Y0.w0();
    }

    public HD1 w2() {
        return this.Y0;
    }

    @Override // o.HD1
    public void x(@InterfaceC11300zs1 SurfaceHolder surfaceHolder) {
        this.Y0.x(surfaceHolder);
    }

    @Override // o.HD1
    public void x0(int i, C8322nf1 c8322nf1) {
        this.Y0.x0(i, c8322nf1);
    }

    @Override // o.HD1
    public C8322nf1 x1(int i) {
        return this.Y0.x1(i);
    }

    @Override // o.HD1
    public long y1() {
        return this.Y0.y1();
    }

    @Override // o.HD1
    public int z() {
        return this.Y0.z();
    }

    @Override // o.HD1
    public void z0() {
        this.Y0.z0();
    }
}
