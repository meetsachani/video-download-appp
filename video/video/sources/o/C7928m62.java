package o;

import android.net.Uri;
import java.util.ArrayList;
import o.C10833xx0;
import o.C8322nf1;
import o.InterfaceC4410Ug1;
import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.m62  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7928m62 extends AbstractC10541wl {
    public static final String e1 = "SilenceMediaSource";
    public static final int f1 = 44100;
    public static final int g1 = 2;
    public static final int h1 = 2;
    public static final C10833xx0 i1;
    public static final C8322nf1 j1;
    public static final byte[] k1;
    public final long c1;
    public final C8322nf1 d1;

    /* renamed from: o.m62$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public long a;
        @InterfaceC11300zs1
        public Object b;

        public C7928m62 a() {
            boolean z;
            if (this.a > 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            return new C7928m62(this.a, C7928m62.j1.b().K(this.b).a());
        }

        @InterfaceC6181ey
        public b b(@BR0(from = 1) long j) {
            this.a = j;
            return this;
        }

        @InterfaceC6181ey
        public b c(@InterfaceC11300zs1 Object obj) {
            this.b = obj;
            return this;
        }
    }

    static {
        C10833xx0 G = new C10833xx0.b().g0(C4128Rj1.N).J(2).h0(44100).a0(2).G();
        i1 = G;
        j1 = new C8322nf1.c().D(e1).L(Uri.EMPTY).F(G.g1).a();
        k1 = new byte[TD2.w0(2, 2) * 1024];
    }

    public static long y0(long j) {
        return TD2.w0(2, 2) * ((j * 44100) / 1000000);
    }

    public static long z0(long j) {
        return ((j / TD2.w0(2, 2)) * 1000000) / 44100;
    }

    @Override // o.InterfaceC7583kh1
    public InterfaceC4410Ug1 h(InterfaceC7583kh1.b bVar, InterfaceC10877y8 interfaceC10877y8, long j) {
        return new c(this.c1);
    }

    @Override // o.InterfaceC7583kh1
    public C8322nf1 k() {
        return this.d1;
    }

    @Override // o.AbstractC10541wl
    public void k0(@InterfaceC11300zs1 InterfaceC4261Sr2 interfaceC4261Sr2) {
        p0(new C9419s82(this.c1, true, false, false, (Object) null, this.d1));
    }

    public C7928m62(long j) {
        this(j, j1);
    }

    public C7928m62(long j, C8322nf1 c8322nf1) {
        C9542sf.a(j >= 0);
        this.c1 = j;
        this.d1 = c8322nf1;
    }

    /* renamed from: o.m62$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC4410Ug1 {
        public static final C10079ur2 Z = new C10079ur2(new C9593sr2(C7928m62.i1));
        public final long X;
        public final ArrayList<IX1> Y = new ArrayList<>();

        public c(long j) {
            this.X = j;
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public boolean a() {
            return false;
        }

        public final long b(long j) {
            return TD2.x(j, 0L, this.X);
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public long c() {
            return Long.MIN_VALUE;
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public boolean d(long j) {
            return false;
        }

        @Override // o.InterfaceC4410Ug1
        public long e(long j, LZ1 lz1) {
            return b(j);
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public long f() {
            return Long.MIN_VALUE;
        }

        @Override // o.InterfaceC4410Ug1
        public long i(long j) {
            long b = b(j);
            for (int i = 0; i < this.Y.size(); i++) {
                ((d) this.Y.get(i)).a(b);
            }
            return b;
        }

        @Override // o.InterfaceC4410Ug1
        public long k() {
            return C10323vs.b;
        }

        @Override // o.InterfaceC4410Ug1
        public void o(InterfaceC4410Ug1.a aVar, long j) {
            aVar.j(this);
        }

        @Override // o.InterfaceC4410Ug1
        public C10079ur2 q() {
            return Z;
        }

        @Override // o.InterfaceC4410Ug1
        public long s(InterfaceC6859hi0[] interfaceC6859hi0Arr, boolean[] zArr, IX1[] ix1Arr, boolean[] zArr2, long j) {
            long b = b(j);
            for (int i = 0; i < interfaceC6859hi0Arr.length; i++) {
                IX1 ix1 = ix1Arr[i];
                if (ix1 != null && (interfaceC6859hi0Arr[i] == null || !zArr[i])) {
                    this.Y.remove(ix1);
                    ix1Arr[i] = null;
                }
                if (ix1Arr[i] == null && interfaceC6859hi0Arr[i] != null) {
                    d dVar = new d(this.X);
                    dVar.a(b);
                    this.Y.add(dVar);
                    ix1Arr[i] = dVar;
                    zArr2[i] = true;
                }
            }
            return b;
        }

        @Override // o.InterfaceC4410Ug1
        public void m() {
        }

        @Override // o.InterfaceC4410Ug1, o.G02
        public void g(long j) {
        }

        @Override // o.InterfaceC4410Ug1
        public void r(long j, boolean z) {
        }
    }

    /* renamed from: o.m62$d */
    /* loaded from: classes2.dex */
    public static final class d implements IX1 {
        public final long X;
        public boolean Y;
        public long Z;

        public d(long j) {
            this.X = C7928m62.y0(j);
            a(0L);
        }

        public void a(long j) {
            this.Z = TD2.x(C7928m62.y0(j), 0L, this.X);
        }

        @Override // o.IX1
        public boolean isReady() {
            return true;
        }

        @Override // o.IX1
        public int j(C2899Ex0 c2899Ex0, C9267rW c9267rW, int i) {
            if (this.Y && (i & 2) == 0) {
                long j = this.X;
                long j2 = this.Z;
                long j3 = j - j2;
                if (j3 == 0) {
                    c9267rW.j(4);
                    return -4;
                }
                c9267rW.a1 = C7928m62.z0(j2);
                c9267rW.j(1);
                int min = (int) Math.min(C7928m62.k1.length, j3);
                if ((i & 4) == 0) {
                    c9267rW.w(min);
                    c9267rW.Y0.put(C7928m62.k1, 0, min);
                }
                if ((i & 1) == 0) {
                    this.Z += min;
                }
                return -4;
            }
            c2899Ex0.b = C7928m62.i1;
            this.Y = true;
            return -5;
        }

        @Override // o.IX1
        public int n(long j) {
            long j2 = this.Z;
            a(j);
            return (int) ((this.Z - j2) / C7928m62.k1.length);
        }

        @Override // o.IX1
        public void b() {
        }
    }

    @Override // o.InterfaceC7583kh1
    public void Q() {
    }

    @Override // o.AbstractC10541wl
    public void q0() {
    }

    @Override // o.InterfaceC7583kh1
    public void s(InterfaceC4410Ug1 interfaceC4410Ug1) {
    }
}
