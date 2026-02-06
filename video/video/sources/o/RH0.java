package o;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import o.C4224Si1;
import o.MH0;
import o.OU;
import o.UH0;

@Deprecated
/* loaded from: classes2.dex */
public final class RH0 extends AbstractC2533Be1 {
    public static final String N = "com.apple.streaming.transportStreamTimestamp";
    public static final AtomicInteger O = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public final ND1 C;
    public final long D;
    public SH0 E;
    public C6020eI0 F;
    public int G;
    public boolean H;
    public volatile boolean I;
    public boolean J;
    public AbstractC5317bO0<Integer> K;
    public boolean L;
    public boolean M;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;

    /* renamed from: o  reason: collision with root package name */
    public final int f596o;
    @InterfaceC11300zs1
    public final FU p;
    @InterfaceC11300zs1
    public final OU q;
    @InterfaceC11300zs1
    public final SH0 r;
    public final boolean s;
    public final boolean t;
    public final C10071up2 u;
    public final PH0 v;
    @InterfaceC11300zs1
    public final List<C10833xx0> w;
    @InterfaceC11300zs1
    public final C6960i70 x;
    public final KL0 y;
    public final C3012Fy1 z;

    public RH0(PH0 ph0, FU fu, OU ou, C10833xx0 c10833xx0, boolean z, @InterfaceC11300zs1 FU fu2, @InterfaceC11300zs1 OU ou2, boolean z2, Uri uri, @InterfaceC11300zs1 List<C10833xx0> list, int i, @InterfaceC11300zs1 Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, C10071up2 c10071up2, long j4, @InterfaceC11300zs1 C6960i70 c6960i70, @InterfaceC11300zs1 SH0 sh0, KL0 kl0, C3012Fy1 c3012Fy1, boolean z6, ND1 nd1) {
        super(fu, ou, c10833xx0, i, obj, j, j2, j3);
        this.A = z;
        this.f596o = i2;
        this.M = z3;
        this.l = i3;
        this.q = ou2;
        this.p = fu2;
        this.H = ou2 != null;
        this.B = z2;
        this.m = uri;
        this.s = z5;
        this.u = c10071up2;
        this.D = j4;
        this.t = z4;
        this.v = ph0;
        this.w = list;
        this.x = c6960i70;
        this.r = sh0;
        this.y = kl0;
        this.z = c3012Fy1;
        this.n = z6;
        this.C = nd1;
        this.K = AbstractC5317bO0.L();
        this.k = O.getAndIncrement();
    }

    public static FU i(FU fu, @InterfaceC11300zs1 byte[] bArr, @InterfaceC11300zs1 byte[] bArr2) {
        if (bArr != null) {
            C9542sf.g(bArr2);
            return new P7(fu, bArr, bArr2);
        }
        return fu;
    }

    public static RH0 j(PH0 ph0, FU fu, C10833xx0 c10833xx0, long j, UH0 uh0, MH0.e eVar, Uri uri, @InterfaceC11300zs1 List<C10833xx0> list, int i, @InterfaceC11300zs1 Object obj, boolean z, C10314vp2 c10314vp2, long j2, @InterfaceC11300zs1 RH0 rh0, @InterfaceC11300zs1 byte[] bArr, @InterfaceC11300zs1 byte[] bArr2, boolean z2, ND1 nd1, @InterfaceC11300zs1 C10901yE c10901yE) {
        AbstractC6044eO0<String, String> a;
        boolean z3;
        boolean z4;
        OU ou;
        FU fu2;
        Uri uri2;
        KL0 kl0;
        C3012Fy1 c3012Fy1;
        SH0 sh0;
        AbstractC6044eO0<String, String> a2;
        UH0.f fVar = eVar.a;
        if (c10901yE == null) {
            a = AbstractC6044eO0.u();
        } else {
            a = c10901yE.d(fVar.Z).a();
        }
        boolean z5 = false;
        OU a3 = new OU.b().j(RC2.f(uh0.a, fVar.X)).i(fVar.d1).h(fVar.e1).c(eVar.d ? 8 : 0).f(a).a();
        boolean z6 = bArr != null;
        FU i2 = i(fu, bArr, z6 ? l((String) C9542sf.g(fVar.c1)) : null);
        UH0.e eVar2 = fVar.Y;
        if (eVar2 != null) {
            boolean z7 = bArr2 != null;
            byte[] l = z7 ? l((String) C9542sf.g(eVar2.c1)) : null;
            z3 = true;
            Uri f = RC2.f(uh0.a, eVar2.X);
            if (c10901yE == null) {
                a2 = AbstractC6044eO0.u();
            } else {
                a2 = c10901yE.e("i").a();
            }
            ou = new OU.b().j(f).i(eVar2.d1).h(eVar2.e1).f(a2).a();
            z4 = z7;
            fu2 = i(fu, bArr2, l);
        } else {
            z3 = true;
            z4 = false;
            ou = null;
            fu2 = null;
        }
        long j3 = j + fVar.Z0;
        long j4 = j3 + fVar.Z;
        int i3 = uh0.j + fVar.Y0;
        if (rh0 != null) {
            OU ou2 = rh0.q;
            boolean z8 = (ou == ou2 || (ou != null && ou2 != null && ou.a.equals(ou2.a) && ou.g == rh0.q.g)) ? z3 : false;
            uri2 = uri;
            if (uri2.equals(rh0.m) && rh0.J) {
                z5 = z3;
            }
            kl0 = rh0.y;
            c3012Fy1 = rh0.z;
            sh0 = (z8 && z5 && !rh0.L && rh0.l == i3) ? rh0.E : null;
        } else {
            uri2 = uri;
            kl0 = new KL0();
            c3012Fy1 = new C3012Fy1(10);
            sh0 = null;
        }
        return new RH0(ph0, i2, a3, c10833xx0, z6, fu2, ou, z4, uri2, list, i, obj, j3, j4, eVar.b, eVar.c, !eVar.d, i3, fVar.f1, z, c10314vp2.a(i3), j2, fVar.a1, sh0, kl0, c3012Fy1, z2, nd1);
    }

    public static byte[] l(String str) {
        int i;
        if (C8077mf.g(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i = byteArray.length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr, (16 - byteArray.length) + i, byteArray.length - i);
        return bArr;
    }

    public static boolean p(MH0.e eVar, UH0 uh0) {
        UH0.f fVar = eVar.a;
        if (fVar instanceof UH0.b) {
            if (!((UH0.b) fVar).g1) {
                if (eVar.c != 0 || !uh0.c) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return uh0.c;
    }

    public static boolean w(@InterfaceC11300zs1 RH0 rh0, Uri uri, UH0 uh0, MH0.e eVar, long j) {
        if (rh0 == null) {
            return false;
        }
        if (uri.equals(rh0.m) && rh0.J) {
            return false;
        }
        long j2 = j + eVar.a.Z0;
        if (p(eVar, uh0) && j2 >= rh0.h) {
            return false;
        }
        return true;
    }

    @Override // o.R11.e
    public void a() throws IOException {
        SH0 sh0;
        C9542sf.g(this.F);
        if (this.E == null && (sh0 = this.r) != null && sh0.d()) {
            this.E = this.r;
            this.H = false;
        }
        s();
        if (!this.I) {
            if (!this.t) {
                r();
            }
            this.J = !this.I;
        }
    }

    @Override // o.R11.e
    public void c() {
        this.I = true;
    }

    @Override // o.AbstractC2533Be1
    public boolean h() {
        return this.J;
    }

    @HS1({"output"})
    public final void k(FU fu, OU ou, boolean z, boolean z2) throws IOException {
        OU e;
        long position;
        long j;
        boolean z3 = false;
        if (z) {
            if (this.G != 0) {
                z3 = true;
            }
            e = ou;
        } else {
            e = ou.e(this.G);
        }
        try {
            WY u = u(fu, e, z2);
            if (z3) {
                u.t(this.G);
            }
            do {
                try {
                    if (this.I) {
                        break;
                    }
                } catch (EOFException e2) {
                    if ((this.d.Z0 & 16384) != 0) {
                        this.E.c();
                        position = u.getPosition();
                        j = ou.g;
                    } else {
                        throw e2;
                    }
                }
            } while (this.E.a(u));
            position = u.getPosition();
            j = ou.g;
            this.G = (int) (position - j);
        } finally {
            NU.a(fu);
        }
    }

    public int m(int i) {
        C9542sf.i(!this.n);
        if (i >= this.K.size()) {
            return 0;
        }
        return this.K.get(i).intValue();
    }

    public void n(C6020eI0 c6020eI0, AbstractC5317bO0<Integer> abstractC5317bO0) {
        this.F = c6020eI0;
        this.K = abstractC5317bO0;
    }

    public void o() {
        this.L = true;
    }

    public boolean q() {
        return this.M;
    }

    @HS1({"output"})
    public final void r() throws IOException {
        k(this.i, this.b, this.A, true);
    }

    @HS1({"output"})
    public final void s() throws IOException {
        if (!this.H) {
            return;
        }
        C9542sf.g(this.p);
        C9542sf.g(this.q);
        k(this.p, this.q, this.B, false);
        this.G = 0;
        this.H = false;
    }

    public final long t(InterfaceC4421Uj0 interfaceC4421Uj0) throws IOException {
        interfaceC4421Uj0.i();
        try {
            this.z.U(10);
            interfaceC4421Uj0.x(this.z.e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.z.O() != 4801587) {
            return C10323vs.b;
        }
        this.z.Z(3);
        int K = this.z.K();
        int i = K + 10;
        if (i > this.z.b()) {
            byte[] e = this.z.e();
            this.z.U(i);
            System.arraycopy(e, 0, this.z.e(), 0, 10);
        }
        interfaceC4421Uj0.x(this.z.e(), 10, K);
        C4224Si1 e2 = this.y.e(this.z.e(), K);
        if (e2 == null) {
            return C10323vs.b;
        }
        int e3 = e2.e();
        for (int i2 = 0; i2 < e3; i2++) {
            C4224Si1.b d = e2.d(i2);
            if (d instanceof HH1) {
                HH1 hh1 = (HH1) d;
                if (N.equals(hh1.Y)) {
                    System.arraycopy(hh1.Z, 0, this.z.e(), 0, 8);
                    this.z.Y(0);
                    this.z.X(8);
                    return this.z.E() & 8589934591L;
                }
            }
        }
        return C10323vs.b;
    }

    @InterfaceC8557od0({"extractor"})
    @HS1({"output"})
    public final WY u(FU fu, OU ou, boolean z) throws IOException {
        SH0 a;
        long j;
        long a2 = fu.a(ou);
        if (z) {
            try {
                this.u.i(this.s, this.g, this.D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e) {
                throw new IOException(e);
            }
        }
        WY wy = new WY(fu, ou.g, a2);
        if (this.E == null) {
            long t = t(wy);
            wy.i();
            SH0 sh0 = this.r;
            if (sh0 != null) {
                a = sh0.f();
            } else {
                a = this.v.a(ou.a, this.d, this.w, this.u, fu.b(), wy, this.C);
                wy = wy;
            }
            this.E = a;
            if (a.e()) {
                C6020eI0 c6020eI0 = this.F;
                if (t != C10323vs.b) {
                    j = this.u.b(t);
                } else {
                    j = this.g;
                }
                c6020eI0.p0(j);
            } else {
                this.F.p0(0L);
            }
            this.F.b0();
            this.E.b(this.F);
        }
        this.F.m0(this.x);
        return wy;
    }

    public void v() {
        this.M = true;
    }
}
