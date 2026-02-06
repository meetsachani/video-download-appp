package o;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import o.HD1;
import o.InterfaceC3921Pg0;
import o.InterfaceC7583kh1;
import o.OD1;

@Deprecated
/* loaded from: classes2.dex */
public class Q72 extends AbstractC2559Bl implements InterfaceC3921Pg0, InterfaceC3921Pg0.a, InterfaceC3921Pg0.f, InterfaceC3921Pg0.e, InterfaceC3921Pg0.d {
    public final C4022Qh0 Z0;
    public final CJ a1;

    @Deprecated
    public Q72(Context context, InterfaceC11198zR1 interfaceC11198zR1, AbstractC3283Ir2 abstractC3283Ir2, InterfaceC7583kh1.a aVar, L11 l11, InterfaceC3643Mk interfaceC3643Mk, F8 f8, boolean z, LD ld, Looper looper) {
        this(new InterfaceC3921Pg0.c(context, interfaceC11198zR1, aVar, abstractC3283Ir2, l11, interfaceC3643Mk, f8).U(z).C(ld).I(looper));
    }

    @Override // o.HD1
    public void A(@InterfaceC11300zs1 TextureView textureView) {
        E2();
        this.Z0.A(textureView);
    }

    @Override // o.InterfaceC3921Pg0
    public void A0(InterfaceC7583kh1 interfaceC7583kh1, long j) {
        E2();
        this.Z0.A0(interfaceC7583kh1, j);
    }

    @Override // o.InterfaceC3921Pg0
    public InterfaceC10469wR1 A1(int i) {
        E2();
        return this.Z0.A1(i);
    }

    @Override // o.HD1
    public PG2 B() {
        E2();
        return this.Z0.B();
    }

    @Override // o.InterfaceC3921Pg0
    public void B0(InterfaceC3921Pg0.b bVar) {
        E2();
        this.Z0.B0(bVar);
    }

    @Override // o.HD1
    public Q20 C() {
        E2();
        return this.Z0.C();
    }

    @Override // o.InterfaceC3921Pg0
    public void C0(InterfaceC7583kh1 interfaceC7583kh1) {
        E2();
        this.Z0.C0(interfaceC7583kh1);
    }

    @Override // o.HD1
    public int C1() {
        E2();
        return this.Z0.C1();
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void D(InterfaceC9857tx interfaceC9857tx) {
        E2();
        this.Z0.D(interfaceC9857tx);
    }

    @Override // o.HD1
    public void D0(boolean z) {
        E2();
        this.Z0.D0(z);
    }

    @Override // o.HD1
    public void D1(int i, int i2) {
        E2();
        this.Z0.D1(i, i2);
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void E(InterfaceC9857tx interfaceC9857tx) {
        E2();
        this.Z0.E(interfaceC9857tx);
    }

    public final void E2() {
        this.a1.c();
    }

    @Override // o.HD1
    public void F() {
        E2();
        this.Z0.F();
    }

    @Override // o.HD1
    public void F1(C11005yf1 c11005yf1) {
        E2();
        this.Z0.F1(c11005yf1);
    }

    public void F2(boolean z) {
        E2();
        this.Z0.m4(z);
    }

    @Override // o.HD1
    public void G(@InterfaceC11300zs1 SurfaceView surfaceView) {
        E2();
        this.Z0.G(surfaceView);
    }

    @Override // o.HD1
    public int G1() {
        E2();
        return this.Z0.G1();
    }

    @Override // o.HD1
    public boolean H() {
        E2();
        return this.Z0.H();
    }

    @Override // o.InterfaceC3921Pg0
    public void H1(List<InterfaceC7583kh1> list) {
        E2();
        this.Z0.H1(list);
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public int I() {
        E2();
        return this.Z0.I();
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    public C10833xx0 I0() {
        E2();
        return this.Z0.I0();
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public void J(C9546sg c9546sg, boolean z) {
        E2();
        this.Z0.J(c9546sg, z);
    }

    @Override // o.InterfaceC3921Pg0
    public void J0(List<P90> list) {
        E2();
        this.Z0.J0(list);
    }

    @Override // o.HD1
    @Deprecated
    public void K(int i) {
        E2();
        this.Z0.K(i);
    }

    @Override // o.HD1
    public void K0(int i) {
        E2();
        this.Z0.K0(i);
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void L(InterfaceC5529cG2 interfaceC5529cG2) {
        E2();
        this.Z0.L(interfaceC5529cG2);
    }

    @Override // o.HD1
    public C3773Nr2 L0() {
        E2();
        return this.Z0.L0();
    }

    @Override // o.HD1
    public void L1(List<C8322nf1> list, int i, long j) {
        E2();
        this.Z0.L1(list, i, j);
    }

    @Override // o.InterfaceC3921Pg0
    public boolean M() {
        E2();
        return this.Z0.M();
    }

    @Override // o.InterfaceC3921Pg0
    public void M0(List<InterfaceC7583kh1> list, boolean z) {
        E2();
        this.Z0.M0(list, z);
    }

    @Override // o.HD1
    public void N(C2989Fr2 c2989Fr2) {
        E2();
        this.Z0.N(c2989Fr2);
    }

    @Override // o.InterfaceC3921Pg0
    public void N0(boolean z) {
        E2();
        this.Z0.N0(z);
    }

    @Override // o.HD1
    public long N1() {
        E2();
        return this.Z0.N1();
    }

    @Override // o.HD1
    public boolean O() {
        E2();
        return this.Z0.O();
    }

    @Override // o.InterfaceC3921Pg0
    @ES1(23)
    public void O0(@InterfaceC11300zs1 AudioDeviceInfo audioDeviceInfo) {
        E2();
        this.Z0.O0(audioDeviceInfo);
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    public C8775pW O1() {
        E2();
        return this.Z0.O1();
    }

    @Override // o.InterfaceC3921Pg0
    public void P(J8 j8) {
        E2();
        this.Z0.P(j8);
    }

    @Override // o.HD1
    public long P1() {
        E2();
        return this.Z0.P1();
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    public C10833xx0 Q1() {
        E2();
        return this.Z0.Q1();
    }

    @Override // o.HD1
    public long R() {
        E2();
        return this.Z0.R();
    }

    @Override // o.HD1
    public int R0() {
        E2();
        return this.Z0.R0();
    }

    @Override // o.InterfaceC3921Pg0
    public void R1(InterfaceC7583kh1 interfaceC7583kh1, boolean z) {
        E2();
        this.Z0.R1(interfaceC7583kh1, z);
    }

    @Override // o.HD1
    public void S(boolean z, int i) {
        E2();
        this.Z0.S(z, i);
    }

    @Override // o.InterfaceC3921Pg0
    public void S0(boolean z) {
        E2();
        this.Z0.S0(z);
    }

    @Override // o.HD1
    public void S1(int i, List<C8322nf1> list) {
        E2();
        this.Z0.S1(i, list);
    }

    @Override // o.HD1
    public long U1() {
        E2();
        return this.Z0.U1();
    }

    @Override // o.InterfaceC3921Pg0
    public LD V() {
        E2();
        return this.Z0.V();
    }

    @Override // o.InterfaceC3921Pg0
    public void V0(boolean z) {
        E2();
        this.Z0.V0(z);
    }

    @Override // o.InterfaceC3921Pg0
    public AbstractC3283Ir2 W() {
        E2();
        return this.Z0.W();
    }

    @Override // o.InterfaceC3921Pg0
    public void W0(List<InterfaceC7583kh1> list, int i, long j) {
        E2();
        this.Z0.W0(list, i, j);
    }

    @Override // o.InterfaceC3921Pg0
    public void W1(J8 j8) {
        E2();
        this.Z0.W1(j8);
    }

    @Override // o.HD1
    public int X() {
        E2();
        return this.Z0.X();
    }

    @Override // o.InterfaceC3921Pg0
    public void X1(int i, InterfaceC7583kh1 interfaceC7583kh1) {
        E2();
        this.Z0.X1(i, interfaceC7583kh1);
    }

    @Override // o.HD1
    public C11005yf1 Y1() {
        E2();
        return this.Z0.Y1();
    }

    @Override // o.HD1
    public int Z0() {
        E2();
        return this.Z0.Z0();
    }

    @Override // o.InterfaceC3921Pg0
    public Looper Z1() {
        E2();
        return this.Z0.Z1();
    }

    @Override // o.HD1
    public boolean a() {
        E2();
        return this.Z0.a();
    }

    @Override // o.InterfaceC3921Pg0
    @Deprecated
    public void a0(InterfaceC7583kh1 interfaceC7583kh1, boolean z, boolean z2) {
        E2();
        this.Z0.a0(interfaceC7583kh1, z, z2);
    }

    @Override // o.HD1
    public C9546sg b() {
        E2();
        return this.Z0.b();
    }

    @Override // o.InterfaceC3921Pg0
    public boolean b2() {
        E2();
        return this.Z0.b2();
    }

    @Override // o.InterfaceC3921Pg0
    @Deprecated
    public C10079ur2 c1() {
        E2();
        return this.Z0.c1();
    }

    @Override // o.HD1
    public int c2() {
        E2();
        return this.Z0.c2();
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public void d(int i) {
        E2();
        this.Z0.d(i);
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void e(int i) {
        E2();
        this.Z0.e(i);
    }

    @Override // o.HD1
    public void e0(List<C8322nf1> list, boolean z) {
        E2();
        this.Z0.e0(list, z);
    }

    @Override // o.HD1
    public AbstractC7373jp2 e1() {
        E2();
        return this.Z0.e1();
    }

    @Override // o.InterfaceC3921Pg0
    public void e2(int i) {
        E2();
        this.Z0.e2(i);
    }

    @Override // o.HD1
    public void f(DD1 dd1) {
        E2();
        this.Z0.f(dd1);
    }

    @Override // o.InterfaceC3921Pg0
    public void f0(boolean z) {
        E2();
        this.Z0.f0(z);
    }

    @Override // o.HD1
    public void f1(HD1.g gVar) {
        E2();
        this.Z0.f1(gVar);
    }

    @Override // o.InterfaceC3921Pg0
    public OD1 f2(OD1.b bVar) {
        E2();
        return this.Z0.f2(bVar);
    }

    @Override // o.HD1
    public void g() {
        E2();
        this.Z0.g();
    }

    @Override // o.InterfaceC3921Pg0
    public void g1(@InterfaceC11300zs1 LZ1 lz1) {
        E2();
        this.Z0.g1(lz1);
    }

    @Override // o.InterfaceC3921Pg0
    public LZ1 g2() {
        E2();
        return this.Z0.g2();
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public int getAudioSessionId() {
        E2();
        return this.Z0.getAudioSessionId();
    }

    @Override // o.HD1
    public long getCurrentPosition() {
        E2();
        return this.Z0.getCurrentPosition();
    }

    @Override // o.HD1
    public long getDuration() {
        E2();
        return this.Z0.getDuration();
    }

    @Override // o.HD1
    public float getVolume() {
        E2();
        return this.Z0.getVolume();
    }

    @Override // o.HD1
    public DD1 h() {
        E2();
        return this.Z0.h();
    }

    @Override // o.HD1
    public void h0(int i) {
        E2();
        this.Z0.h0(i);
    }

    @Override // o.HD1
    public Looper h1() {
        E2();
        return this.Z0.h1();
    }

    @Override // o.InterfaceC3921Pg0
    public void h2(InterfaceC7583kh1 interfaceC7583kh1) {
        E2();
        this.Z0.h2(interfaceC7583kh1);
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public void i(C3737Nj c3737Nj) {
        E2();
        this.Z0.i(c3737Nj);
    }

    @Override // o.HD1
    public C2989Fr2 i1() {
        E2();
        return this.Z0.i1();
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public boolean j() {
        E2();
        return this.Z0.j();
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public void k(boolean z) {
        E2();
        this.Z0.k(z);
    }

    @Override // o.HD1
    public L82 k0() {
        E2();
        return this.Z0.k0();
    }

    @Override // o.InterfaceC3921Pg0
    @Deprecated
    public C11297zr2 k1() {
        E2();
        return this.Z0.k1();
    }

    @Override // o.HD1
    public void k2(int i, int i2, int i3) {
        E2();
        this.Z0.k2(i, i2, i3);
    }

    @Override // o.HD1
    public void l(@InterfaceC11300zs1 Surface surface) {
        E2();
        this.Z0.l(surface);
    }

    @Override // o.HD1
    public void l0(int i, int i2, List<C8322nf1> list) {
        E2();
        this.Z0.l0(i, i2, list);
    }

    @Override // o.HD1
    public void l1(HD1.g gVar) {
        E2();
        this.Z0.l1(gVar);
    }

    @Override // o.InterfaceC3921Pg0
    public F8 l2() {
        E2();
        return this.Z0.l2();
    }

    @Override // o.HD1
    public void m(@InterfaceC11300zs1 Surface surface) {
        E2();
        this.Z0.m(surface);
    }

    @Override // o.HD1
    public void m0() {
        E2();
        this.Z0.m0();
    }

    @Override // o.InterfaceC3921Pg0
    public int m1(int i) {
        E2();
        return this.Z0.m1(i);
    }

    @Override // o.HD1
    @Deprecated
    public void n() {
        E2();
        this.Z0.n();
    }

    @Override // o.HD1
    public boolean n2() {
        E2();
        return this.Z0.n2();
    }

    @Override // o.HD1
    public void o(@InterfaceC11300zs1 SurfaceView surfaceView) {
        E2();
        this.Z0.o(surfaceView);
    }

    @Override // o.InterfaceC3921Pg0
    public void o1(U52 u52) {
        E2();
        this.Z0.o1(u52);
    }

    @Override // o.HD1
    public long o2() {
        E2();
        return this.Z0.o2();
    }

    @Override // o.HD1
    public void p(@InterfaceC11300zs1 SurfaceHolder surfaceHolder) {
        E2();
        this.Z0.p(surfaceHolder);
    }

    @Override // o.InterfaceC3921Pg0
    public boolean p1() {
        E2();
        return this.Z0.p1();
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void q(InterfaceC5529cG2 interfaceC5529cG2) {
        E2();
        this.Z0.q(interfaceC5529cG2);
    }

    @Override // o.InterfaceC3921Pg0
    @Deprecated
    public void q0(InterfaceC7583kh1 interfaceC7583kh1) {
        E2();
        this.Z0.q0(interfaceC7583kh1);
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    public C8775pW q2() {
        E2();
        return this.Z0.q2();
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public int r() {
        E2();
        return this.Z0.r();
    }

    @Override // o.InterfaceC3921Pg0
    public void r0(List<InterfaceC7583kh1> list) {
        E2();
        this.Z0.r0(list);
    }

    @Override // o.InterfaceC3921Pg0
    public void r1(@InterfaceC11300zs1 FH1 fh1) {
        E2();
        this.Z0.r1(fh1);
    }

    @Override // o.HD1
    public C8274nS s() {
        E2();
        return this.Z0.s();
    }

    @Override // o.HD1
    public void s0(int i, int i2) {
        E2();
        this.Z0.s0(i, i2);
    }

    @Override // o.HD1
    public C11005yf1 s2() {
        E2();
        return this.Z0.s2();
    }

    @Override // o.HD1
    public void setVolume(float f) {
        E2();
        this.Z0.setVolume(f);
    }

    @Override // o.HD1
    public void stop() {
        E2();
        this.Z0.stop();
    }

    @Override // o.HD1
    @Deprecated
    public void t(boolean z) {
        E2();
        this.Z0.t(z);
    }

    @Override // o.HD1
    public HD1.c t1() {
        E2();
        return this.Z0.t1();
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.f
    public void u(int i) {
        E2();
        this.Z0.u(i);
    }

    @Override // o.HD1
    public void u0(int i) {
        E2();
        this.Z0.u0(i);
    }

    @Override // o.HD1
    public boolean u1() {
        E2();
        return this.Z0.u1();
    }

    @Override // o.HD1
    public long u2() {
        E2();
        return this.Z0.u2();
    }

    @Override // o.HD1
    @Deprecated
    public void v() {
        E2();
        this.Z0.v();
    }

    @Override // o.HD1
    public void v1(boolean z) {
        E2();
        this.Z0.v1(z);
    }

    @Override // o.HD1
    public void w(@InterfaceC11300zs1 TextureView textureView) {
        E2();
        this.Z0.w(textureView);
    }

    @Override // o.HD1
    public int w0() {
        E2();
        return this.Z0.w0();
    }

    @Override // o.InterfaceC3921Pg0
    public int w1() {
        E2();
        return this.Z0.w1();
    }

    @Override // o.HD1
    public void x(@InterfaceC11300zs1 SurfaceHolder surfaceHolder) {
        E2();
        this.Z0.x(surfaceHolder);
    }

    @Override // o.InterfaceC3921Pg0, o.InterfaceC3921Pg0.a
    public void y() {
        E2();
        this.Z0.y();
    }

    @Override // o.InterfaceC3921Pg0
    public void y0(InterfaceC3921Pg0.b bVar) {
        E2();
        this.Z0.y0(bVar);
    }

    @Override // o.HD1
    public long y1() {
        E2();
        return this.Z0.y1();
    }

    @Override // o.AbstractC2559Bl
    @InterfaceC5056aJ2(otherwise = 4)
    public void y2(int i, long j, int i2, boolean z) {
        E2();
        this.Z0.y2(i, j, i2, z);
    }

    @Override // o.HD1
    public int z() {
        E2();
        return this.Z0.z();
    }

    @Override // o.InterfaceC3921Pg0
    public void z1(int i, List<InterfaceC7583kh1> list) {
        E2();
        this.Z0.z1(i, list);
    }

    @Deprecated
    /* loaded from: classes2.dex */
    public static final class a {
        public final InterfaceC3921Pg0.c a;

        @Deprecated
        public a(Context context) {
            this.a = new InterfaceC3921Pg0.c(context);
        }

        @Deprecated
        public Q72 b() {
            return this.a.x();
        }

        @InterfaceC6181ey
        @Deprecated
        public a c(long j) {
            this.a.y(j);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a d(F8 f8) {
            this.a.z(f8);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a e(C9546sg c9546sg, boolean z) {
            this.a.A(c9546sg, z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a f(InterfaceC3643Mk interfaceC3643Mk) {
            this.a.B(interfaceC3643Mk);
            return this;
        }

        @InterfaceC6181ey
        @InterfaceC5056aJ2
        @Deprecated
        public a g(LD ld) {
            this.a.C(ld);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a h(long j) {
            this.a.D(j);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a i(boolean z) {
            this.a.F(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a j(K11 k11) {
            this.a.G(k11);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a k(L11 l11) {
            this.a.H(l11);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a l(Looper looper) {
            this.a.I(looper);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a m(InterfaceC7583kh1.a aVar) {
            this.a.J(aVar);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a n(boolean z) {
            this.a.K(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a o(@InterfaceC11300zs1 FH1 fh1) {
            this.a.M(fh1);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a p(long j) {
            this.a.N(j);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a q(@BR0(from = 1) long j) {
            this.a.P(j);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a r(@BR0(from = 1) long j) {
            this.a.Q(j);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a s(LZ1 lz1) {
            this.a.R(lz1);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a t(boolean z) {
            this.a.S(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a u(AbstractC3283Ir2 abstractC3283Ir2) {
            this.a.T(abstractC3283Ir2);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a v(boolean z) {
            this.a.U(z);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a w(int i) {
            this.a.W(i);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a x(int i) {
            this.a.X(i);
            return this;
        }

        @InterfaceC6181ey
        @Deprecated
        public a y(int i) {
            this.a.Y(i);
            return this;
        }

        @Deprecated
        public a(Context context, InterfaceC11198zR1 interfaceC11198zR1) {
            this.a = new InterfaceC3921Pg0.c(context, interfaceC11198zR1);
        }

        @Deprecated
        public a(Context context, InterfaceC4809Yj0 interfaceC4809Yj0) {
            this.a = new InterfaceC3921Pg0.c(context, new JZ(context, interfaceC4809Yj0));
        }

        @Deprecated
        public a(Context context, InterfaceC11198zR1 interfaceC11198zR1, InterfaceC4809Yj0 interfaceC4809Yj0) {
            this.a = new InterfaceC3921Pg0.c(context, interfaceC11198zR1, new JZ(context, interfaceC4809Yj0));
        }

        @Deprecated
        public a(Context context, InterfaceC11198zR1 interfaceC11198zR1, AbstractC3283Ir2 abstractC3283Ir2, InterfaceC7583kh1.a aVar, L11 l11, InterfaceC3643Mk interfaceC3643Mk, F8 f8) {
            this.a = new InterfaceC3921Pg0.c(context, interfaceC11198zR1, aVar, abstractC3283Ir2, l11, interfaceC3643Mk, f8);
        }
    }

    @Override // o.HD1
    @InterfaceC11300zs1
    public C3824Og0 c() {
        E2();
        return this.Z0.c();
    }

    public Q72(a aVar) {
        this(aVar.a);
    }

    public Q72(InterfaceC3921Pg0.c cVar) {
        CJ cj = new CJ();
        this.a1 = cj;
        try {
            this.Z0 = new C4022Qh0(cVar, this);
            cj.f();
        } catch (Throwable th) {
            this.a1.f();
            throw th;
        }
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    @Deprecated
    public InterfaceC3921Pg0.f E0() {
        return this;
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    @Deprecated
    public InterfaceC3921Pg0.d I1() {
        return this;
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    @Deprecated
    public InterfaceC3921Pg0.a K1() {
        return this;
    }

    @Override // o.InterfaceC3921Pg0
    @InterfaceC11300zs1
    @Deprecated
    public InterfaceC3921Pg0.e n1() {
        return this;
    }
}
