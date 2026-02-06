package o;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.AbstractC4501Vf;
import o.C10821xu0;
import o.C10833xx0;
import o.C4224Si1;
import o.G;

@Deprecated
/* renamed from: o.Wf  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4598Wf {
    public static final String a = "AtomParsers";
    public static final int b = 1668047728;
    public static final int c = 1835299937;
    public static final int d = 1835365473;
    public static final int e = 1852009571;
    public static final int f = 1852009592;
    public static final int g = 1935832172;
    public static final int h = 1936684398;
    public static final int i = 1937072756;
    public static final int j = 1952807028;
    public static final int k = 1986618469;
    public static final int l = 4;
    public static final byte[] m = TD2.G0("OpusHead");

    /* renamed from: o.Wf$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public final int a;
        public int b;
        public int c;
        public long d;
        public final boolean e;
        public final C3012Fy1 f;
        public final C3012Fy1 g;
        public int h;
        public int i;

        public a(C3012Fy1 c3012Fy1, C3012Fy1 c3012Fy12, boolean z) throws C3989Py1 {
            this.g = c3012Fy1;
            this.f = c3012Fy12;
            this.e = z;
            c3012Fy12.Y(12);
            this.a = c3012Fy12.P();
            c3012Fy1.Y(12);
            this.i = c3012Fy1.P();
            C4615Wj0.a(c3012Fy1.s() == 1, "first_chunk must be 1");
            this.b = -1;
        }

        public boolean a() {
            long N;
            int i;
            int i2 = this.b + 1;
            this.b = i2;
            if (i2 == this.a) {
                return false;
            }
            if (this.e) {
                N = this.f.Q();
            } else {
                N = this.f.N();
            }
            this.d = N;
            if (this.b == this.h) {
                this.c = this.g.P();
                this.g.Z(4);
                int i3 = this.i - 1;
                this.i = i3;
                if (i3 > 0) {
                    i = this.g.P() - 1;
                } else {
                    i = -1;
                }
                this.h = i;
            }
            return true;
        }
    }

    /* renamed from: o.Wf$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public final String a;
        public final byte[] b;
        public final long c;
        public final long d;

        public b(String str, byte[] bArr, long j, long j2) {
            this.a = str;
            this.b = bArr;
            this.c = j;
            this.d = j2;
        }
    }

    /* renamed from: o.Wf$c */
    /* loaded from: classes2.dex */
    public static final class c {
        public final C4224Si1 a;
        public final long b;

        public c(C4224Si1 c4224Si1, long j) {
            this.a = c4224Si1;
            this.b = j;
        }
    }

    /* renamed from: o.Wf$d */
    /* loaded from: classes2.dex */
    public interface d {
        int a();

        int b();

        int c();
    }

    /* renamed from: o.Wf$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public static final int e = 8;
        public final C8858pr2[] a;
        @InterfaceC11300zs1
        public C10833xx0 b;
        public int c;
        public int d = 0;

        public e(int i) {
            this.a = new C8858pr2[i];
        }
    }

    /* renamed from: o.Wf$f */
    /* loaded from: classes2.dex */
    public static final class f implements d {
        public final int a;
        public final int b;
        public final C3012Fy1 c;

        public f(AbstractC4501Vf.b bVar, C10833xx0 c10833xx0) {
            C3012Fy1 c3012Fy1 = bVar.E1;
            this.c = c3012Fy1;
            c3012Fy1.Y(12);
            int P = c3012Fy1.P();
            if (C4128Rj1.N.equals(c10833xx0.g1)) {
                int w0 = TD2.w0(c10833xx0.v1, c10833xx0.t1);
                if (P == 0 || P % w0 != 0) {
                    I31.n(C4598Wf.a, "Audio sample size mismatch. stsd sample size: " + w0 + ", stsz sample size: " + P);
                    P = w0;
                }
            }
            this.a = P == 0 ? -1 : P;
            this.b = c3012Fy1.P();
        }

        @Override // o.C4598Wf.d
        public int a() {
            int i = this.a;
            if (i == -1) {
                return this.c.P();
            }
            return i;
        }

        @Override // o.C4598Wf.d
        public int b() {
            return this.a;
        }

        @Override // o.C4598Wf.d
        public int c() {
            return this.b;
        }
    }

    /* renamed from: o.Wf$g */
    /* loaded from: classes2.dex */
    public static final class g implements d {
        public final C3012Fy1 a;
        public final int b;
        public final int c;
        public int d;
        public int e;

        public g(AbstractC4501Vf.b bVar) {
            C3012Fy1 c3012Fy1 = bVar.E1;
            this.a = c3012Fy1;
            c3012Fy1.Y(12);
            this.c = c3012Fy1.P() & 255;
            this.b = c3012Fy1.P();
        }

        @Override // o.C4598Wf.d
        public int a() {
            int i = this.c;
            if (i == 8) {
                return this.a.L();
            }
            if (i == 16) {
                return this.a.R();
            }
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 % 2 == 0) {
                int L = this.a.L();
                this.e = L;
                return (L & 240) >> 4;
            }
            return this.e & 15;
        }

        @Override // o.C4598Wf.d
        public int b() {
            return -1;
        }

        @Override // o.C4598Wf.d
        public int c() {
            return this.b;
        }
    }

    /* renamed from: o.Wf$h */
    /* loaded from: classes2.dex */
    public static final class h {
        public final int a;
        public final long b;
        public final int c;

        public h(int i, long j, int i2) {
            this.a = i;
            this.b = j;
            this.c = i2;
        }
    }

    /* renamed from: o.Wf$i */
    /* loaded from: classes2.dex */
    public static final class i {
        @InterfaceC11300zs1
        public final C4224Si1 a;
        @InterfaceC11300zs1
        public final C4224Si1 b;
        @InterfaceC11300zs1
        public final C4224Si1 c;

        public i(@InterfaceC11300zs1 C4224Si1 c4224Si1, @InterfaceC11300zs1 C4224Si1 c4224Si12, @InterfaceC11300zs1 C4224Si1 c4224Si13) {
            this.a = c4224Si1;
            this.b = c4224Si12;
            this.c = c4224Si13;
        }
    }

    @InterfaceC11300zs1
    public static C8615or2 A(AbstractC4501Vf.a aVar, AbstractC4501Vf.b bVar, long j2, @InterfaceC11300zs1 C6960i70 c6960i70, boolean z, boolean z2) throws C3989Py1 {
        long j3;
        long[] jArr;
        long[] jArr2;
        AbstractC4501Vf.a g2;
        Pair<long[], long[]> i2;
        AbstractC4501Vf.a aVar2 = (AbstractC4501Vf.a) C9542sf.g(aVar.g(AbstractC4501Vf.k0));
        int e2 = e(l(((AbstractC4501Vf.b) C9542sf.g(aVar2.h(AbstractC4501Vf.w0))).E1));
        if (e2 == -1) {
            return null;
        }
        h z3 = z(((AbstractC4501Vf.b) C9542sf.g(aVar.h(AbstractC4501Vf.s0))).E1);
        long j4 = C10323vs.b;
        if (j2 == C10323vs.b) {
            j3 = z3.b;
        } else {
            j3 = j2;
        }
        long j5 = q(bVar.E1).b;
        if (j3 != C10323vs.b) {
            j4 = TD2.C1(j3, 1000000L, j5);
        }
        long j6 = j4;
        Pair<Long, String> n = n(((AbstractC4501Vf.b) C9542sf.g(aVar2.h(AbstractC4501Vf.v0))).E1);
        AbstractC4501Vf.b h2 = ((AbstractC4501Vf.a) C9542sf.g(((AbstractC4501Vf.a) C9542sf.g(aVar2.g(AbstractC4501Vf.l0))).g(AbstractC4501Vf.m0))).h(AbstractC4501Vf.x0);
        if (h2 != null) {
            e x = x(h2.E1, z3.a, z3.c, (String) n.second, c6960i70, z2);
            if (!z && (g2 = aVar.g(AbstractC4501Vf.t0)) != null && (i2 = i(g2)) != null) {
                jArr2 = (long[]) i2.second;
                jArr = (long[]) i2.first;
            } else {
                jArr = null;
                jArr2 = null;
            }
            if (x.b == null) {
                return null;
            }
            return new C8615or2(z3.a, e2, ((Long) n.first).longValue(), j5, j6, x.b, x.d, x.a, x.c, jArr, jArr2);
        }
        throw C3989Py1.a("Malformed sample table (stbl) missing sample description (stsd)", null);
    }

    public static List<C10811xr2> B(AbstractC4501Vf.a aVar, BC0 bc0, long j2, @InterfaceC11300zs1 C6960i70 c6960i70, boolean z, boolean z2, YA0<C8615or2, C8615or2> ya0) throws C3989Py1 {
        C8615or2 apply;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < aVar.G1.size(); i2++) {
            AbstractC4501Vf.a aVar2 = aVar.G1.get(i2);
            if (aVar2.a == 1953653099 && (apply = ya0.apply(A(aVar2, (AbstractC4501Vf.b) C9542sf.g(aVar.h(AbstractC4501Vf.i0)), j2, c6960i70, z, z2))) != null) {
                arrayList.add(w(apply, (AbstractC4501Vf.a) C9542sf.g(((AbstractC4501Vf.a) C9542sf.g(((AbstractC4501Vf.a) C9542sf.g(aVar2.g(AbstractC4501Vf.k0))).g(AbstractC4501Vf.l0))).g(AbstractC4501Vf.m0)), bc0));
            }
        }
        return arrayList;
    }

    public static i C(AbstractC4501Vf.b bVar) {
        C3012Fy1 c3012Fy1 = bVar.E1;
        c3012Fy1.Y(8);
        C4224Si1 c4224Si1 = null;
        C4224Si1 c4224Si12 = null;
        C4224Si1 c4224Si13 = null;
        while (c3012Fy1.a() >= 8) {
            int f2 = c3012Fy1.f();
            int s = c3012Fy1.s();
            int s2 = c3012Fy1.s();
            if (s2 == 1835365473) {
                c3012Fy1.Y(f2);
                c4224Si1 = D(c3012Fy1, f2 + s);
            } else if (s2 == 1936553057) {
                c3012Fy1.Y(f2);
                c4224Si12 = v(c3012Fy1, f2 + s);
            } else if (s2 == -1451722374) {
                c4224Si13 = F(c3012Fy1);
            }
            c3012Fy1.Y(f2 + s);
        }
        return new i(c4224Si1, c4224Si12, c4224Si13);
    }

    @InterfaceC11300zs1
    public static C4224Si1 D(C3012Fy1 c3012Fy1, int i2) {
        c3012Fy1.Z(8);
        f(c3012Fy1);
        while (c3012Fy1.f() < i2) {
            int f2 = c3012Fy1.f();
            int s = c3012Fy1.s();
            if (c3012Fy1.s() == 1768715124) {
                c3012Fy1.Y(f2);
                return m(c3012Fy1, f2 + s);
            }
            c3012Fy1.Y(f2 + s);
        }
        return null;
    }

    public static void E(C3012Fy1 c3012Fy1, int i2, int i3, int i4, int i5, int i6, @InterfaceC11300zs1 C6960i70 c6960i70, e eVar, int i7) throws C3989Py1 {
        String str;
        byte[] bArr;
        boolean z;
        C6960i70 c6960i702;
        int i8;
        int i9;
        String str2;
        float f2;
        List<byte[]> list;
        int i10;
        int i11;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str3;
        boolean z6;
        boolean z7;
        boolean z8;
        int i12;
        int i13;
        int i14;
        String str4;
        boolean z9;
        int i15 = i3;
        int i16 = i4;
        C6960i70 c6960i703 = c6960i70;
        e eVar2 = eVar;
        c3012Fy1.Y(i15 + 16);
        c3012Fy1.Z(16);
        int R = c3012Fy1.R();
        int R2 = c3012Fy1.R();
        c3012Fy1.Z(50);
        int f3 = c3012Fy1.f();
        int i17 = i2;
        if (i17 == 1701733238) {
            Pair<Integer, C8858pr2> t = t(c3012Fy1, i15, i16);
            if (t != null) {
                i17 = ((Integer) t.first).intValue();
                if (c6960i703 == null) {
                    c6960i703 = null;
                } else {
                    c6960i703 = c6960i703.c(((C8858pr2) t.second).b);
                }
                eVar2.a[i7] = (C8858pr2) t.second;
            }
            c3012Fy1.Y(f3);
        }
        String str5 = C4128Rj1.i;
        if (i17 == 1831958048) {
            str = C4128Rj1.q;
        } else if (i17 == 1211250227) {
            str = C4128Rj1.i;
        } else {
            str = null;
        }
        float f4 = 1.0f;
        String str6 = null;
        List<byte[]> list2 = null;
        byte[] bArr2 = null;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        ByteBuffer byteBuffer = null;
        b bVar = null;
        boolean z10 = false;
        while (f3 - i15 < i16) {
            c3012Fy1.Y(f3);
            int f5 = c3012Fy1.f();
            int s = c3012Fy1.s();
            if (s == 0 && c3012Fy1.f() - i3 == i16) {
                break;
            }
            if (s > 0) {
                z = true;
            } else {
                z = false;
            }
            C4615Wj0.a(z, "childAtomSize must be positive");
            int s2 = c3012Fy1.s();
            if (s2 == 1635148611) {
                if (str == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                C4615Wj0.a(z9, null);
                c3012Fy1.Y(f5 + 8);
                C3932Pj b2 = C3932Pj.b(c3012Fy1);
                list2 = b2.a;
                eVar2.c = b2.b;
                if (!z10) {
                    f4 = b2.h;
                }
                str6 = b2.i;
                i12 = b2.e;
                i13 = b2.f;
                i14 = b2.g;
                str4 = "video/avc";
            } else if (s2 == 1752589123) {
                if (str == null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                C4615Wj0.a(z8, null);
                c3012Fy1.Y(f5 + 8);
                C10182vH0 a2 = C10182vH0.a(c3012Fy1);
                list2 = a2.a;
                eVar2.c = a2.b;
                if (!z10) {
                    f4 = a2.h;
                }
                str6 = a2.i;
                i12 = a2.e;
                i13 = a2.f;
                i14 = a2.g;
                str4 = C4128Rj1.k;
            } else {
                if (s2 == 1685480259 || s2 == 1685485123) {
                    c6960i702 = c6960i703;
                    i8 = f3;
                    i9 = i17;
                    str2 = str5;
                    f2 = f4;
                    list = list2;
                    i10 = i19;
                    i11 = i21;
                    T40 a3 = T40.a(c3012Fy1);
                    if (a3 != null) {
                        str6 = a3.c;
                        str = C4128Rj1.w;
                    }
                } else {
                    i8 = f3;
                    if (s2 == 1987076931) {
                        if (str == null) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        C4615Wj0.a(z6, null);
                        if (i17 == 1987063864) {
                            str3 = "video/x-vnd.on2.vp8";
                        } else {
                            str3 = C4128Rj1.m;
                        }
                        c3012Fy1.Y(f5 + 12);
                        c3012Fy1.Z(2);
                        if ((c3012Fy1.L() & 1) != 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        int L = c3012Fy1.L();
                        int L2 = c3012Fy1.L();
                        i19 = IF.i(L);
                        if (z7) {
                            i20 = 1;
                        } else {
                            i20 = 2;
                        }
                        i21 = IF.j(L2);
                    } else if (s2 == 1635135811) {
                        if (str == null) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        C4615Wj0.a(z5, null);
                        str3 = C4128Rj1.n;
                    } else if (s2 == 1668050025) {
                        if (byteBuffer == null) {
                            byteBuffer = a();
                        }
                        ByteBuffer byteBuffer2 = byteBuffer;
                        byteBuffer2.position(21);
                        byteBuffer2.putShort(c3012Fy1.H());
                        byteBuffer2.putShort(c3012Fy1.H());
                        byteBuffer = byteBuffer2;
                        c6960i702 = c6960i703;
                        i9 = i17;
                        str2 = str5;
                        f3 = i8 + s;
                        i15 = i3;
                        i16 = i4;
                        eVar2 = eVar;
                        i17 = i9;
                        str5 = str2;
                        c6960i703 = c6960i702;
                    } else if (s2 == 1835295606) {
                        if (byteBuffer == null) {
                            byteBuffer = a();
                        }
                        ByteBuffer byteBuffer3 = byteBuffer;
                        short H = c3012Fy1.H();
                        short H2 = c3012Fy1.H();
                        short H3 = c3012Fy1.H();
                        i9 = i17;
                        short H4 = c3012Fy1.H();
                        str2 = str5;
                        short H5 = c3012Fy1.H();
                        short H6 = c3012Fy1.H();
                        c6960i702 = c6960i703;
                        short H7 = c3012Fy1.H();
                        List<byte[]> list3 = list2;
                        short H8 = c3012Fy1.H();
                        long N = c3012Fy1.N();
                        long N2 = c3012Fy1.N();
                        byteBuffer3.position(1);
                        byteBuffer3.putShort(H5);
                        byteBuffer3.putShort(H6);
                        byteBuffer3.putShort(H);
                        byteBuffer3.putShort(H2);
                        byteBuffer3.putShort(H3);
                        byteBuffer3.putShort(H4);
                        byteBuffer3.putShort(H7);
                        byteBuffer3.putShort(H8);
                        byteBuffer3.putShort((short) (N / 10000));
                        byteBuffer3.putShort((short) (N2 / 10000));
                        byteBuffer = byteBuffer3;
                        list2 = list3;
                        f4 = f4;
                        f3 = i8 + s;
                        i15 = i3;
                        i16 = i4;
                        eVar2 = eVar;
                        i17 = i9;
                        str5 = str2;
                        c6960i703 = c6960i702;
                    } else {
                        c6960i702 = c6960i703;
                        i9 = i17;
                        str2 = str5;
                        f2 = f4;
                        list = list2;
                        if (s2 == 1681012275) {
                            if (str == null) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            C4615Wj0.a(z4, null);
                            str = str2;
                        } else if (s2 == 1702061171) {
                            if (str == null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            C4615Wj0.a(z3, null);
                            bVar = j(c3012Fy1, f5);
                            String str7 = bVar.a;
                            byte[] bArr3 = bVar.b;
                            if (bArr3 != null) {
                                list2 = AbstractC5317bO0.M(bArr3);
                            } else {
                                list2 = list;
                            }
                            str = str7;
                            f4 = f2;
                            f3 = i8 + s;
                            i15 = i3;
                            i16 = i4;
                            eVar2 = eVar;
                            i17 = i9;
                            str5 = str2;
                            c6960i703 = c6960i702;
                        } else if (s2 == 1885434736) {
                            f4 = r(c3012Fy1, f5);
                            list2 = list;
                            z10 = true;
                            f3 = i8 + s;
                            i15 = i3;
                            i16 = i4;
                            eVar2 = eVar;
                            i17 = i9;
                            str5 = str2;
                            c6960i703 = c6960i702;
                        } else if (s2 == 1937126244) {
                            bArr2 = s(c3012Fy1, f5, s);
                        } else if (s2 == 1936995172) {
                            int L3 = c3012Fy1.L();
                            c3012Fy1.Z(3);
                            if (L3 == 0) {
                                int L4 = c3012Fy1.L();
                                if (L4 != 0) {
                                    if (L4 != 1) {
                                        if (L4 != 2) {
                                            if (L4 == 3) {
                                                i18 = 3;
                                            }
                                        } else {
                                            i18 = 2;
                                        }
                                    } else {
                                        i18 = 1;
                                    }
                                } else {
                                    i18 = 0;
                                }
                            }
                        } else {
                            i10 = i19;
                            if (s2 == 1668246642) {
                                i11 = i21;
                                if (i10 == -1 && i11 == -1) {
                                    int s3 = c3012Fy1.s();
                                    if (s3 != 1852009592 && s3 != 1852009571) {
                                        I31.n(a, "Unsupported color type: " + AbstractC4501Vf.a(s3));
                                    } else {
                                        int R3 = c3012Fy1.R();
                                        int R4 = c3012Fy1.R();
                                        c3012Fy1.Z(2);
                                        if (s == 19 && (c3012Fy1.L() & 128) != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        i19 = IF.i(R3);
                                        if (z2) {
                                            i20 = 1;
                                        } else {
                                            i20 = 2;
                                        }
                                        i21 = IF.j(R4);
                                    }
                                }
                            } else {
                                i11 = i21;
                            }
                        }
                        list2 = list;
                        f4 = f2;
                        f3 = i8 + s;
                        i15 = i3;
                        i16 = i4;
                        eVar2 = eVar;
                        i17 = i9;
                        str5 = str2;
                        c6960i703 = c6960i702;
                    }
                    str = str3;
                    c6960i702 = c6960i703;
                    i9 = i17;
                    str2 = str5;
                    f3 = i8 + s;
                    i15 = i3;
                    i16 = i4;
                    eVar2 = eVar;
                    i17 = i9;
                    str5 = str2;
                    c6960i703 = c6960i702;
                }
                i21 = i11;
                i19 = i10;
                list2 = list;
                f4 = f2;
                f3 = i8 + s;
                i15 = i3;
                i16 = i4;
                eVar2 = eVar;
                i17 = i9;
                str5 = str2;
                c6960i703 = c6960i702;
            }
            i21 = i14;
            i19 = i12;
            c6960i702 = c6960i703;
            i8 = f3;
            i20 = i13;
            i9 = i17;
            str2 = str5;
            str = str4;
            f3 = i8 + s;
            i15 = i3;
            i16 = i4;
            eVar2 = eVar;
            i17 = i9;
            str5 = str2;
            c6960i703 = c6960i702;
        }
        C6960i70 c6960i704 = c6960i703;
        float f6 = f4;
        List<byte[]> list4 = list2;
        int i22 = i19;
        int i23 = i21;
        if (str == null) {
            return;
        }
        C10833xx0.b O = new C10833xx0.b().T(i5).g0(str).K(str6).n0(R).S(R2).c0(f6).f0(i6).d0(bArr2).j0(i18).V(list4).O(c6960i704);
        int i24 = i20;
        if (i22 != -1 || i24 != -1 || i23 != -1 || byteBuffer != null) {
            if (byteBuffer != null) {
                bArr = byteBuffer.array();
            } else {
                bArr = null;
            }
            O.L(new IF(i22, i24, i23, bArr));
        }
        if (bVar != null) {
            O.I(C7775lT0.x(bVar.c)).b0(C7775lT0.x(bVar.d));
        }
        eVar.b = O.G();
    }

    @InterfaceC11300zs1
    public static C4224Si1 F(C3012Fy1 c3012Fy1) {
        short H = c3012Fy1.H();
        c3012Fy1.Z(2);
        String I = c3012Fy1.I(H);
        int max = Math.max(I.lastIndexOf(43), I.lastIndexOf(45));
        try {
            return new C4224Si1(new C2659Cl1(Float.parseFloat(I.substring(0, max)), Float.parseFloat(I.substring(max, I.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean b(long[] jArr, long j2, long j3, long j4) {
        int length = jArr.length - 1;
        int w = TD2.w(4, 0, length);
        int w2 = TD2.w(jArr.length - 4, 0, length);
        if (jArr[0] <= j3 && j3 < jArr[w] && jArr[w2] < j4 && j4 <= j2) {
            return true;
        }
        return false;
    }

    public static boolean c(int i2) {
        if (i2 != 1) {
            return true;
        }
        return false;
    }

    public static int d(C3012Fy1 c3012Fy1, int i2, int i3, int i4) throws C3989Py1 {
        boolean z;
        boolean z2;
        int f2 = c3012Fy1.f();
        if (f2 >= i3) {
            z = true;
        } else {
            z = false;
        }
        C4615Wj0.a(z, null);
        while (f2 - i3 < i4) {
            c3012Fy1.Y(f2);
            int s = c3012Fy1.s();
            if (s > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C4615Wj0.a(z2, "childAtomSize must be positive");
            if (c3012Fy1.s() == i2) {
                return f2;
            }
            f2 += s;
        }
        return -1;
    }

    public static int e(int i2) {
        if (i2 == 1936684398) {
            return 1;
        }
        if (i2 == 1986618469) {
            return 2;
        }
        if (i2 != 1952807028 && i2 != 1935832172 && i2 != 1937072756 && i2 != 1668047728) {
            if (i2 == 1835365473) {
                return 5;
            }
            return -1;
        }
        return 3;
    }

    public static void f(C3012Fy1 c3012Fy1) {
        int f2 = c3012Fy1.f();
        c3012Fy1.Z(4);
        if (c3012Fy1.s() != 1751411826) {
            f2 += 4;
        }
        c3012Fy1.Y(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:99:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(C3012Fy1 c3012Fy1, int i2, int i3, int i4, int i5, String str, boolean z, @InterfaceC11300zs1 C6960i70 c6960i70, e eVar, int i6) throws C3989Py1 {
        int i7;
        int M;
        int s;
        int i8;
        String str2;
        String str3;
        int i9;
        boolean z2;
        int d2;
        boolean z3;
        int i10 = i3;
        int i11 = i4;
        C6960i70 c6960i702 = c6960i70;
        c3012Fy1.Y(i10 + 16);
        if (z) {
            i7 = c3012Fy1.R();
            c3012Fy1.Z(6);
        } else {
            c3012Fy1.Z(8);
            i7 = 0;
        }
        if (i7 != 0 && i7 != 1) {
            if (i7 == 2) {
                c3012Fy1.Z(16);
                M = (int) Math.round(c3012Fy1.q());
                i8 = c3012Fy1.P();
                c3012Fy1.Z(20);
                s = 0;
            } else {
                return;
            }
        } else {
            int R = c3012Fy1.R();
            c3012Fy1.Z(6);
            M = c3012Fy1.M();
            c3012Fy1.Y(c3012Fy1.f() - 4);
            s = c3012Fy1.s();
            if (i7 == 1) {
                c3012Fy1.Z(16);
            }
            i8 = R;
        }
        int f2 = c3012Fy1.f();
        int i12 = i2;
        if (i12 == 1701733217) {
            Pair<Integer, C8858pr2> t = t(c3012Fy1, i10, i11);
            if (t != null) {
                i12 = ((Integer) t.first).intValue();
                if (c6960i702 == null) {
                    c6960i702 = null;
                } else {
                    c6960i702 = c6960i702.c(((C8858pr2) t.second).b);
                }
                eVar.a[i6] = (C8858pr2) t.second;
            }
            c3012Fy1.Y(f2);
        }
        if (i12 == 1633889587) {
            str2 = C4128Rj1.Q;
        } else if (i12 == 1700998451) {
            str2 = C4128Rj1.R;
        } else if (i12 == 1633889588) {
            str2 = C4128Rj1.T;
        } else if (i12 == 1685353315) {
            str2 = C4128Rj1.V;
        } else if (i12 != 1685353320 && i12 != 1685353324) {
            if (i12 == 1685353317) {
                str2 = C4128Rj1.X;
            } else if (i12 == 1685353336) {
                str2 = C4128Rj1.Y;
            } else if (i12 == 1935764850) {
                str2 = C4128Rj1.c0;
            } else if (i12 == 1935767394) {
                str2 = C4128Rj1.d0;
            } else {
                str3 = C4128Rj1.N;
                if (i12 != 1819304813 && i12 != 1936684916) {
                    if (i12 == 1953984371) {
                        i9 = 268435456;
                    } else if (i12 != 778924082 && i12 != 778924083) {
                        if (i12 == 1835557169) {
                            str2 = C4128Rj1.L;
                        } else if (i12 == 1835560241) {
                            str2 = C4128Rj1.M;
                        } else if (i12 == 1634492771) {
                            str2 = C4128Rj1.f0;
                        } else if (i12 == 1634492791) {
                            str2 = C4128Rj1.O;
                        } else if (i12 == 1970037111) {
                            str2 = C4128Rj1.P;
                        } else if (i12 == 1332770163) {
                            str2 = C4128Rj1.a0;
                        } else if (i12 == 1716281667) {
                            str2 = C4128Rj1.e0;
                        } else if (i12 == 1835823201) {
                            str2 = C4128Rj1.U;
                        } else {
                            i9 = -1;
                            str3 = null;
                        }
                    } else {
                        str2 = C4128Rj1.I;
                    }
                } else {
                    i9 = 2;
                }
                String str4 = str3;
                b bVar = null;
                String str5 = null;
                List<byte[]> list = null;
                while (f2 - i10 < i11) {
                    c3012Fy1.Y(f2);
                    int s2 = c3012Fy1.s();
                    if (s2 > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C4615Wj0.a(z2, "childAtomSize must be positive");
                    int s3 = c3012Fy1.s();
                    if (s3 == 1835557187) {
                        int i13 = s2 - 13;
                        byte[] bArr = new byte[i13];
                        c3012Fy1.Y(f2 + 13);
                        c3012Fy1.n(bArr, 0, i13);
                        list = AbstractC5317bO0.M(bArr);
                    } else {
                        if (s3 != 1702061171 && (!z || s3 != 2002876005)) {
                            if (s3 == 1684103987) {
                                c3012Fy1.Y(f2 + 8);
                                eVar.b = I3.d(c3012Fy1, Integer.toString(i5), str, c6960i702);
                            } else if (s3 == 1684366131) {
                                c3012Fy1.Y(f2 + 8);
                                eVar.b = I3.h(c3012Fy1, Integer.toString(i5), str, c6960i702);
                            } else if (s3 == 1684103988) {
                                c3012Fy1.Y(f2 + 8);
                                eVar.b = M3.b(c3012Fy1, Integer.toString(i5), str, c6960i702);
                            } else if (s3 == 1684892784) {
                                if (s > 0) {
                                    M = s;
                                    i8 = 2;
                                } else {
                                    throw C3989Py1.a("Invalid sample rate for Dolby TrueHD MLP stream: " + s, null);
                                }
                            } else if (s3 == 1684305011 || s3 == 1969517683) {
                                z3 = false;
                                eVar.b = new C10833xx0.b().T(i5).g0(str4).J(i8).h0(M).O(c6960i702).X(str).G();
                            } else if (s3 == 1682927731) {
                                int i14 = s2 - 8;
                                byte[] bArr2 = m;
                                byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length + i14);
                                c3012Fy1.Y(f2 + 8);
                                c3012Fy1.n(copyOf, bArr2.length, i14);
                                list = C6418fw1.a(copyOf);
                            } else if (s3 == 1684425825) {
                                byte[] bArr3 = new byte[s2 - 8];
                                bArr3[0] = 102;
                                bArr3[1] = 76;
                                bArr3[2] = 97;
                                bArr3[3] = 67;
                                c3012Fy1.Y(f2 + 12);
                                c3012Fy1.n(bArr3, 4, s2 - 12);
                                list = AbstractC5317bO0.M(bArr3);
                            } else if (s3 == 1634492771) {
                                int i15 = s2 - 12;
                                byte[] bArr4 = new byte[i15];
                                c3012Fy1.Y(f2 + 12);
                                c3012Fy1.n(bArr4, 0, i15);
                                Pair<Integer, Integer> h2 = JE.h(bArr4);
                                int intValue = ((Integer) h2.first).intValue();
                                int intValue2 = ((Integer) h2.second).intValue();
                                list = AbstractC5317bO0.M(bArr4);
                                M = intValue;
                                i8 = intValue2;
                            } else {
                                z3 = false;
                            }
                            z3 = false;
                        } else {
                            if (s3 == 1702061171) {
                                d2 = f2;
                            } else {
                                d2 = d(c3012Fy1, AbstractC4501Vf.n0, f2, s2);
                            }
                            if (d2 != -1) {
                                bVar = j(c3012Fy1, d2);
                                str4 = bVar.a;
                                byte[] bArr5 = bVar.b;
                                if (bArr5 != null) {
                                    if ("audio/mp4a-latm".equals(str4)) {
                                        G.c f3 = G.f(bArr5);
                                        M = f3.a;
                                        i8 = f3.b;
                                        str5 = f3.c;
                                    }
                                    list = AbstractC5317bO0.M(bArr5);
                                }
                            }
                        }
                        f2 += s2;
                        i10 = i3;
                        i11 = i4;
                    }
                    f2 += s2;
                    i10 = i3;
                    i11 = i4;
                }
                if (eVar.b != null && str4 != null) {
                    C10833xx0.b X = new C10833xx0.b().T(i5).g0(str4).K(str5).J(i8).h0(M).a0(i9).V(list).O(c6960i702).X(str);
                    if (bVar != null) {
                        X.I(C7775lT0.x(bVar.c)).b0(C7775lT0.x(bVar.d));
                    }
                    eVar.b = X.G();
                    return;
                }
            }
        } else {
            str2 = C4128Rj1.W;
        }
        str3 = str2;
        i9 = -1;
        String str42 = str3;
        b bVar2 = null;
        String str52 = null;
        List<byte[]> list2 = null;
        while (f2 - i10 < i11) {
        }
        if (eVar.b != null) {
        }
    }

    @InterfaceC11300zs1
    public static Pair<Integer, C8858pr2> h(C3012Fy1 c3012Fy1, int i2, int i3) throws C3989Py1 {
        boolean z;
        boolean z2;
        int i4 = i2 + 8;
        boolean z3 = false;
        int i5 = -1;
        int i6 = 0;
        String str = null;
        Integer num = null;
        while (i4 - i2 < i3) {
            c3012Fy1.Y(i4);
            int s = c3012Fy1.s();
            int s2 = c3012Fy1.s();
            if (s2 == 1718775137) {
                num = Integer.valueOf(c3012Fy1.s());
            } else if (s2 == 1935894637) {
                c3012Fy1.Z(4);
                str = c3012Fy1.I(4);
            } else if (s2 == 1935894633) {
                i5 = i4;
                i6 = s;
            }
            i4 += s;
        }
        if (!"cenc".equals(str) && !C10323vs.a2.equals(str) && !C10323vs.b2.equals(str) && !C10323vs.c2.equals(str)) {
            return null;
        }
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        C4615Wj0.a(z, "frma atom is mandatory");
        if (i5 != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C4615Wj0.a(z2, "schi atom is mandatory");
        C8858pr2 u = u(c3012Fy1, i5, i6, str);
        if (u != null) {
            z3 = true;
        }
        C4615Wj0.a(z3, "tenc atom is mandatory");
        return Pair.create(num, (C8858pr2) TD2.o(u));
    }

    @InterfaceC11300zs1
    public static Pair<long[], long[]> i(AbstractC4501Vf.a aVar) {
        long N;
        long s;
        AbstractC4501Vf.b h2 = aVar.h(AbstractC4501Vf.u0);
        if (h2 == null) {
            return null;
        }
        C3012Fy1 c3012Fy1 = h2.E1;
        c3012Fy1.Y(8);
        int c2 = AbstractC4501Vf.c(c3012Fy1.s());
        int P = c3012Fy1.P();
        long[] jArr = new long[P];
        long[] jArr2 = new long[P];
        for (int i2 = 0; i2 < P; i2++) {
            if (c2 == 1) {
                N = c3012Fy1.Q();
            } else {
                N = c3012Fy1.N();
            }
            jArr[i2] = N;
            if (c2 == 1) {
                s = c3012Fy1.E();
            } else {
                s = c3012Fy1.s();
            }
            jArr2[i2] = s;
            if (c3012Fy1.H() == 1) {
                c3012Fy1.Z(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    public static b j(C3012Fy1 c3012Fy1, int i2) {
        long j2;
        c3012Fy1.Y(i2 + 12);
        c3012Fy1.Z(1);
        k(c3012Fy1);
        c3012Fy1.Z(2);
        int L = c3012Fy1.L();
        if ((L & 128) != 0) {
            c3012Fy1.Z(2);
        }
        if ((L & 64) != 0) {
            c3012Fy1.Z(c3012Fy1.L());
        }
        if ((L & 32) != 0) {
            c3012Fy1.Z(2);
        }
        c3012Fy1.Z(1);
        k(c3012Fy1);
        String h2 = C4128Rj1.h(c3012Fy1.L());
        if (!C4128Rj1.I.equals(h2) && !C4128Rj1.V.equals(h2) && !C4128Rj1.W.equals(h2)) {
            c3012Fy1.Z(4);
            long N = c3012Fy1.N();
            long N2 = c3012Fy1.N();
            c3012Fy1.Z(1);
            int k2 = k(c3012Fy1);
            long j3 = N2;
            byte[] bArr = new byte[k2];
            c3012Fy1.n(bArr, 0, k2);
            if (j3 <= 0) {
                j3 = -1;
            }
            if (N > 0) {
                j2 = N;
            } else {
                j2 = -1;
            }
            return new b(h2, bArr, j3, j2);
        }
        return new b(h2, null, -1L, -1L);
    }

    public static int k(C3012Fy1 c3012Fy1) {
        int L = c3012Fy1.L();
        int i2 = L & 127;
        while ((L & 128) == 128) {
            L = c3012Fy1.L();
            i2 = (i2 << 7) | (L & 127);
        }
        return i2;
    }

    public static int l(C3012Fy1 c3012Fy1) {
        c3012Fy1.Y(16);
        return c3012Fy1.s();
    }

    @InterfaceC11300zs1
    public static C4224Si1 m(C3012Fy1 c3012Fy1, int i2) {
        c3012Fy1.Z(8);
        ArrayList arrayList = new ArrayList();
        while (c3012Fy1.f() < i2) {
            C4224Si1.b c2 = C7834lj1.c(c3012Fy1);
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4224Si1(arrayList);
    }

    public static Pair<Long, String> n(C3012Fy1 c3012Fy1) {
        int i2;
        int i3 = 8;
        c3012Fy1.Y(8);
        int c2 = AbstractC4501Vf.c(c3012Fy1.s());
        if (c2 == 0) {
            i2 = 8;
        } else {
            i2 = 16;
        }
        c3012Fy1.Z(i2);
        long N = c3012Fy1.N();
        if (c2 == 0) {
            i3 = 4;
        }
        c3012Fy1.Z(i3);
        int R = c3012Fy1.R();
        return Pair.create(Long.valueOf(N), "" + ((char) (((R >> 10) & 31) + 96)) + ((char) (((R >> 5) & 31) + 96)) + ((char) ((R & 31) + 96)));
    }

    @InterfaceC11300zs1
    public static C4224Si1 o(AbstractC4501Vf.a aVar) {
        AbstractC4501Vf.b h2 = aVar.h(AbstractC4501Vf.w0);
        AbstractC4501Vf.b h3 = aVar.h(AbstractC4501Vf.j1);
        AbstractC4501Vf.b h4 = aVar.h(AbstractC4501Vf.k1);
        if (h2 == null || h3 == null || h4 == null || l(h2.E1) != 1835299937) {
            return null;
        }
        C3012Fy1 c3012Fy1 = h3.E1;
        c3012Fy1.Y(12);
        int s = c3012Fy1.s();
        String[] strArr = new String[s];
        for (int i2 = 0; i2 < s; i2++) {
            int s2 = c3012Fy1.s();
            c3012Fy1.Z(4);
            strArr[i2] = c3012Fy1.I(s2 - 8);
        }
        C3012Fy1 c3012Fy12 = h4.E1;
        c3012Fy12.Y(8);
        ArrayList arrayList = new ArrayList();
        while (c3012Fy12.a() > 8) {
            int f2 = c3012Fy12.f();
            int s3 = c3012Fy12.s();
            int s4 = c3012Fy12.s() - 1;
            if (s4 >= 0 && s4 < s) {
                C3128Hd1 f3 = C7834lj1.f(c3012Fy12, f2 + s3, strArr[s4]);
                if (f3 != null) {
                    arrayList.add(f3);
                }
            } else {
                I31.n(a, "Skipped metadata with unknown key index: " + s4);
            }
            c3012Fy12.Y(f2 + s3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C4224Si1(arrayList);
    }

    public static void p(C3012Fy1 c3012Fy1, int i2, int i3, int i4, e eVar) {
        c3012Fy1.Y(i3 + 16);
        if (i2 == 1835365492) {
            c3012Fy1.F();
            String F = c3012Fy1.F();
            if (F != null) {
                eVar.b = new C10833xx0.b().T(i4).g0(F).G();
            }
        }
    }

    public static c q(C3012Fy1 c3012Fy1) {
        long j2;
        c3012Fy1.Y(8);
        if (AbstractC4501Vf.c(c3012Fy1.s()) == 0) {
            j2 = c3012Fy1.N();
            c3012Fy1.Z(4);
        } else {
            long E = c3012Fy1.E();
            c3012Fy1.Z(8);
            j2 = E;
        }
        return new c(new C4224Si1(new C6796hR((j2 - 2082844800) * 1000)), c3012Fy1.N());
    }

    public static float r(C3012Fy1 c3012Fy1, int i2) {
        c3012Fy1.Y(i2 + 8);
        return c3012Fy1.P() / c3012Fy1.P();
    }

    @InterfaceC11300zs1
    public static byte[] s(C3012Fy1 c3012Fy1, int i2, int i3) {
        int i4 = i2 + 8;
        while (i4 - i2 < i3) {
            c3012Fy1.Y(i4);
            int s = c3012Fy1.s();
            if (c3012Fy1.s() == 1886547818) {
                return Arrays.copyOfRange(c3012Fy1.e(), i4, s + i4);
            }
            i4 += s;
        }
        return null;
    }

    @InterfaceC11300zs1
    public static Pair<Integer, C8858pr2> t(C3012Fy1 c3012Fy1, int i2, int i3) throws C3989Py1 {
        boolean z;
        Pair<Integer, C8858pr2> h2;
        int f2 = c3012Fy1.f();
        while (f2 - i2 < i3) {
            c3012Fy1.Y(f2);
            int s = c3012Fy1.s();
            if (s > 0) {
                z = true;
            } else {
                z = false;
            }
            C4615Wj0.a(z, "childAtomSize must be positive");
            if (c3012Fy1.s() == 1936289382 && (h2 = h(c3012Fy1, f2, s)) != null) {
                return h2;
            }
            f2 += s;
        }
        return null;
    }

    @InterfaceC11300zs1
    public static C8858pr2 u(C3012Fy1 c3012Fy1, int i2, int i3, String str) {
        int i4;
        int i5;
        boolean z;
        int i6 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i6 - i2 >= i3) {
                return null;
            }
            c3012Fy1.Y(i6);
            int s = c3012Fy1.s();
            if (c3012Fy1.s() == 1952804451) {
                int c2 = AbstractC4501Vf.c(c3012Fy1.s());
                c3012Fy1.Z(1);
                if (c2 == 0) {
                    c3012Fy1.Z(1);
                    i5 = 0;
                    i4 = 0;
                } else {
                    int L = c3012Fy1.L();
                    i4 = L & 15;
                    i5 = (L & 240) >> 4;
                }
                if (c3012Fy1.L() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int L2 = c3012Fy1.L();
                byte[] bArr2 = new byte[16];
                c3012Fy1.n(bArr2, 0, 16);
                if (z && L2 == 0) {
                    int L3 = c3012Fy1.L();
                    bArr = new byte[L3];
                    c3012Fy1.n(bArr, 0, L3);
                }
                return new C8858pr2(z, str, L2, bArr2, i5, i4, bArr);
            }
            i6 += s;
        }
    }

    @InterfaceC11300zs1
    public static C4224Si1 v(C3012Fy1 c3012Fy1, int i2) {
        float f2;
        c3012Fy1.Z(12);
        while (c3012Fy1.f() < i2) {
            int f3 = c3012Fy1.f();
            int s = c3012Fy1.s();
            if (c3012Fy1.s() == 1935766900) {
                if (s < 14) {
                    return null;
                }
                c3012Fy1.Z(5);
                int L = c3012Fy1.L();
                if (L != 12 && L != 13) {
                    return null;
                }
                if (L == 12) {
                    f2 = 240.0f;
                } else {
                    f2 = 120.0f;
                }
                c3012Fy1.Z(1);
                return new C4224Si1(new C10641x92(f2, c3012Fy1.L()));
            }
            c3012Fy1.Y(f3 + s);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v23, types: [boolean] */
    public static C10811xr2 w(C8615or2 c8615or2, AbstractC4501Vf.a aVar, BC0 bc0) throws C3989Py1 {
        d gVar;
        boolean z;
        C3012Fy1 c3012Fy1;
        C3012Fy1 c3012Fy12;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2;
        long[] jArr;
        int i7;
        int i8;
        long j3;
        int i9;
        String str;
        int[] iArr;
        long[] jArr2;
        int i10;
        int[] iArr2;
        int i11;
        ?? r10;
        int[] iArr3;
        int i12;
        long[] jArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        long j4;
        int[] iArr7;
        int i13;
        ?? r11;
        int i14;
        int i15;
        int i16;
        AbstractC4501Vf.b h2 = aVar.h(AbstractC4501Vf.U0);
        if (h2 != null) {
            gVar = new f(h2, c8615or2.f);
        } else {
            AbstractC4501Vf.b h3 = aVar.h(AbstractC4501Vf.V0);
            if (h3 != null) {
                gVar = new g(h3);
            } else {
                throw C3989Py1.a("Track has no sample table size information", null);
            }
        }
        int c2 = gVar.c();
        if (c2 == 0) {
            return new C10811xr2(c8615or2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        AbstractC4501Vf.b h4 = aVar.h(AbstractC4501Vf.W0);
        if (h4 == null) {
            h4 = (AbstractC4501Vf.b) C9542sf.g(aVar.h(AbstractC4501Vf.X0));
            z = true;
        } else {
            z = false;
        }
        C3012Fy1 c3012Fy13 = h4.E1;
        C3012Fy1 c3012Fy14 = ((AbstractC4501Vf.b) C9542sf.g(aVar.h(AbstractC4501Vf.T0))).E1;
        C3012Fy1 c3012Fy15 = ((AbstractC4501Vf.b) C9542sf.g(aVar.h(AbstractC4501Vf.Q0))).E1;
        AbstractC4501Vf.b h5 = aVar.h(AbstractC4501Vf.R0);
        if (h5 != null) {
            c3012Fy1 = h5.E1;
        } else {
            c3012Fy1 = null;
        }
        AbstractC4501Vf.b h6 = aVar.h(AbstractC4501Vf.S0);
        if (h6 != null) {
            c3012Fy12 = h6.E1;
        } else {
            c3012Fy12 = null;
        }
        a aVar2 = new a(c3012Fy14, c3012Fy13, z);
        c3012Fy15.Y(12);
        int P = c3012Fy15.P() - 1;
        int P2 = c3012Fy15.P();
        int P3 = c3012Fy15.P();
        if (c3012Fy12 != null) {
            c3012Fy12.Y(12);
            i2 = c3012Fy12.P();
        } else {
            i2 = 0;
        }
        if (c3012Fy1 != null) {
            c3012Fy1.Y(12);
            i4 = c3012Fy1.P();
            if (i4 > 0) {
                i3 = c3012Fy1.P() - 1;
                i5 = 0;
            } else {
                i3 = -1;
                i5 = 0;
                c3012Fy1 = null;
            }
        } else {
            i3 = -1;
            i4 = 0;
            i5 = 0;
        }
        int b2 = gVar.b();
        String str2 = c8615or2.f.g1;
        if (b2 != -1 && ((C4128Rj1.N.equals(str2) || C4128Rj1.P.equals(str2) || C4128Rj1.O.equals(str2)) && P == 0 && i2 == 0 && i4 == 0)) {
            i6 = 1;
        } else {
            i6 = i5;
        }
        d dVar = gVar;
        if (i6 != 0) {
            int i17 = aVar2.a;
            long[] jArr4 = new long[i17];
            int[] iArr8 = new int[i17];
            while (aVar2.a()) {
                int i18 = aVar2.b;
                jArr4[i18] = aVar2.d;
                iArr8[i18] = aVar2.c;
            }
            C10821xu0.b a2 = C10821xu0.a(b2, jArr4, iArr8, P3);
            long[] jArr5 = a2.a;
            iArr = a2.b;
            int i19 = a2.c;
            long[] jArr6 = a2.d;
            int[] iArr9 = a2.e;
            j3 = a2.f;
            jArr2 = jArr5;
            i10 = i19;
            jArr = jArr6;
            iArr2 = iArr9;
            j2 = 0;
        } else {
            long[] jArr7 = new long[c2];
            j2 = 0;
            int[] iArr10 = new int[c2];
            jArr = new long[c2];
            C3012Fy1 c3012Fy16 = c3012Fy12;
            int[] iArr11 = new int[c2];
            C3012Fy1 c3012Fy17 = c3012Fy1;
            int i20 = i3;
            int i21 = i5;
            int i22 = i21;
            int i23 = i22;
            int i24 = i23;
            long j5 = 0;
            long j6 = 0;
            int i25 = i2;
            int i26 = P3;
            int i27 = P2;
            int i28 = P;
            int i29 = i24;
            while (true) {
                if (i21 < c2) {
                    long j7 = j6;
                    int i30 = i23;
                    boolean z2 = true;
                    while (i30 == 0) {
                        z2 = aVar2.a();
                        if (!z2) {
                            break;
                        }
                        int i31 = i27;
                        long j8 = aVar2.d;
                        i30 = aVar2.c;
                        j7 = j8;
                        i27 = i31;
                        i26 = i26;
                        c2 = c2;
                    }
                    int i32 = c2;
                    i7 = i27;
                    int i33 = i26;
                    if (!z2) {
                        I31.n(a, "Unexpected end of chunk data");
                        long[] copyOf = Arrays.copyOf(jArr7, i21);
                        iArr10 = Arrays.copyOf(iArr10, i21);
                        jArr = Arrays.copyOf(jArr, i21);
                        iArr11 = Arrays.copyOf(iArr11, i21);
                        jArr7 = copyOf;
                        c2 = i21;
                        i8 = i30;
                        break;
                    }
                    if (c3012Fy16 != null) {
                        int i34 = i24;
                        while (i34 == 0 && i25 > 0) {
                            i34 = c3012Fy16.P();
                            i22 = c3012Fy16.s();
                            i25--;
                        }
                        i24 = i34 - 1;
                    }
                    jArr7[i21] = j7;
                    int a3 = dVar.a();
                    iArr10[i21] = a3;
                    if (a3 > i29) {
                        i29 = a3;
                    }
                    jArr[i21] = j5 + i22;
                    if (c3012Fy17 == null) {
                        i11 = 1;
                    } else {
                        i11 = i5;
                    }
                    iArr11[i21] = i11;
                    if (i21 == i20) {
                        iArr11[i21] = 1;
                        i4--;
                        if (i4 > 0) {
                            i20 = ((C3012Fy1) C9542sf.g(c3012Fy17)).P() - 1;
                        }
                    }
                    j5 += i33;
                    int i35 = i7 - 1;
                    if (i35 == 0 && i28 > 0) {
                        i35 = c3012Fy15.P();
                        i28--;
                        i26 = c3012Fy15.s();
                    } else {
                        i26 = i33;
                    }
                    i27 = i35;
                    i23 = i30 - 1;
                    i21++;
                    j6 = j7 + iArr10[i21];
                    c2 = i32;
                } else {
                    i7 = i27;
                    i8 = i23;
                    break;
                }
            }
            j3 = j5 + i22;
            if (c3012Fy16 != null) {
                while (i25 > 0) {
                    if (c3012Fy16.P() != 0) {
                        i9 = i5;
                        break;
                    }
                    c3012Fy16.s();
                    i25--;
                }
            }
            i9 = 1;
            if (i4 != 0 || i7 != 0 || i8 != 0 || i28 != 0 || i24 != 0 || i9 == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent stbl box for track ");
                sb.append(c8615or2.a);
                sb.append(": remainingSynchronizationSamples ");
                sb.append(i4);
                sb.append(", remainingSamplesAtTimestampDelta ");
                sb.append(i7);
                sb.append(", remainingSamplesInChunk ");
                sb.append(i8);
                sb.append(", remainingTimestampDeltaChanges ");
                sb.append(i28);
                sb.append(", remainingSamplesAtTimestampOffset ");
                sb.append(i24);
                if (i9 == 0) {
                    str = ", ctts invalid";
                } else {
                    str = "";
                }
                sb.append(str);
                I31.n(a, sb.toString());
            }
            iArr = iArr10;
            jArr2 = jArr7;
            i10 = i29;
            iArr2 = iArr11;
        }
        long j9 = j3;
        long C1 = TD2.C1(j9, 1000000L, c8615or2.c);
        long[] jArr8 = c8615or2.h;
        if (jArr8 == null) {
            TD2.E1(jArr, 1000000L, c8615or2.c);
            return new C10811xr2(c8615or2, jArr2, iArr, i10, jArr, iArr2, C1);
        }
        int[] iArr12 = iArr;
        int i36 = c2;
        int[] iArr13 = iArr12;
        if (jArr8.length == 1 && c8615or2.b == 1 && jArr.length >= 2) {
            long j10 = ((long[]) C9542sf.g(c8615or2.i))[i5];
            long C12 = j10 + TD2.C1(c8615or2.h[i5], c8615or2.c, c8615or2.d);
            long[] jArr9 = jArr2;
            long[] jArr10 = jArr;
            boolean b3 = b(jArr10, j9, j10, C12);
            jArr = jArr10;
            j9 = j9;
            if (b3) {
                long C13 = TD2.C1(j10 - jArr[i5], c8615or2.f.u1, c8615or2.c);
                long C14 = TD2.C1(j9 - C12, c8615or2.f.u1, c8615or2.c);
                if ((C13 != j2 || C14 != j2) && C13 <= 2147483647L && C14 <= 2147483647L) {
                    bc0.a = (int) C13;
                    bc0.b = (int) C14;
                    TD2.E1(jArr, 1000000L, c8615or2.c);
                    return new C10811xr2(c8615or2, jArr9, iArr13, i10, jArr, iArr2, TD2.C1(c8615or2.h[i5], 1000000L, c8615or2.d));
                }
            }
            jArr2 = jArr9;
            iArr13 = iArr13;
        }
        long[] jArr11 = c8615or2.h;
        if (jArr11.length == 1 && jArr11[i5] == j2) {
            long j11 = ((long[]) C9542sf.g(c8615or2.i))[i5];
            for (int i37 = i5; i37 < jArr.length; i37++) {
                jArr[i37] = TD2.C1(jArr[i37] - j11, 1000000L, c8615or2.c);
            }
            return new C10811xr2(c8615or2, jArr2, iArr13, i10, jArr, iArr2, TD2.C1(j9 - j11, 1000000L, c8615or2.c));
        }
        if (c8615or2.b == 1) {
            r10 = 1;
        } else {
            r10 = i5;
        }
        int[] iArr14 = new int[jArr11.length];
        int[] iArr15 = new int[jArr11.length];
        long[] jArr12 = (long[]) C9542sf.g(c8615or2.i);
        int i38 = i5;
        int i39 = i38;
        int i40 = i39;
        int i41 = i40;
        while (true) {
            long[] jArr13 = c8615or2.h;
            iArr3 = iArr15;
            if (i38 >= jArr13.length) {
                break;
            }
            int[] iArr16 = iArr14;
            long[] jArr14 = jArr12;
            long j12 = jArr14[i38];
            if (j12 != -1) {
                long j13 = jArr13[i38];
                i13 = i38;
                int i42 = i39;
                long C15 = TD2.C1(j13, c8615or2.c, c8615or2.d);
                iArr7 = iArr16;
                iArr7[i13] = TD2.n(jArr, j12, true, true);
                long j14 = j12 + C15;
                r11 = i5;
                iArr3[i13] = TD2.j(jArr, j14, r10, r11);
                while (true) {
                    i14 = iArr7[i13];
                    i15 = iArr3[i13];
                    if (i14 >= i15 || (iArr2[i14] & 1) != 0) {
                        break;
                    }
                    iArr7[i13] = i14 + 1;
                }
                i40 += i15 - i14;
                if (i41 != i14) {
                    i16 = 1;
                } else {
                    i16 = r11 == true ? 1 : 0;
                }
                i39 = i42 | i16;
                i41 = i15;
            } else {
                iArr7 = iArr16;
                i13 = i38;
                r11 = i5;
            }
            jArr12 = jArr14;
            i5 = r11;
            iArr15 = iArr3;
            i38 = i13 + 1;
            iArr14 = iArr7;
        }
        int[] iArr17 = iArr14;
        int i43 = i39;
        int i44 = i5;
        if (i40 != i36) {
            i12 = 1;
        } else {
            i12 = i44;
        }
        int i45 = i43 | i12;
        if (i45 != 0) {
            jArr3 = new long[i40];
        } else {
            jArr3 = jArr2;
        }
        if (i45 != 0) {
            iArr4 = new int[i40];
        } else {
            iArr4 = iArr13;
        }
        if (i45 != 0) {
            i10 = i44;
        }
        if (i45 != 0) {
            iArr5 = new int[i40];
        } else {
            iArr5 = iArr2;
        }
        long[] jArr15 = new long[i40];
        int i46 = i44;
        long j15 = j2;
        while (i44 < c8615or2.h.length) {
            long j16 = c8615or2.i[i44];
            int i47 = iArr17[i44];
            int i48 = i45;
            int i49 = iArr3[i44];
            int i50 = i10;
            if (i48 != 0) {
                int i51 = i49 - i47;
                System.arraycopy(jArr2, i47, jArr3, i46, i51);
                System.arraycopy(iArr13, i47, iArr4, i46, i51);
                System.arraycopy(iArr2, i47, iArr5, i46, i51);
            }
            i10 = i50;
            while (i47 < i49) {
                long[] jArr16 = jArr2;
                int[] iArr18 = iArr13;
                long C16 = TD2.C1(j15, 1000000L, c8615or2.d);
                long C17 = TD2.C1(jArr[i47] - j16, 1000000L, c8615or2.c);
                int i52 = i49;
                long[] jArr17 = jArr;
                if (c(c8615or2.b)) {
                    iArr6 = iArr2;
                    j4 = j2;
                    C17 = Math.max(j4, C17);
                } else {
                    iArr6 = iArr2;
                    j4 = j2;
                }
                jArr15[i46] = C16 + C17;
                if (i48 != 0 && iArr4[i46] > i10) {
                    i10 = iArr18[i47];
                }
                i46++;
                i47++;
                j2 = j4;
                jArr2 = jArr16;
                iArr13 = iArr18;
                jArr = jArr17;
                iArr2 = iArr6;
                i49 = i52;
            }
            j15 += c8615or2.h[i44];
            i44++;
            jArr2 = jArr2;
            jArr = jArr;
            iArr2 = iArr2;
            i45 = i48;
        }
        return new C10811xr2(c8615or2, jArr3, iArr4, i10, jArr15, iArr5, TD2.C1(j15, 1000000L, c8615or2.d));
    }

    public static e x(C3012Fy1 c3012Fy1, int i2, int i3, String str, @InterfaceC11300zs1 C6960i70 c6960i70, boolean z) throws C3989Py1 {
        boolean z2;
        c3012Fy1.Y(12);
        int s = c3012Fy1.s();
        e eVar = new e(s);
        int i4 = 0;
        while (i4 < s) {
            int f2 = c3012Fy1.f();
            int s2 = c3012Fy1.s();
            if (s2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C4615Wj0.a(z2, "childAtomSize must be positive");
            int s3 = c3012Fy1.s();
            if (s3 == 1635148593 || s3 == 1635148595 || s3 == 1701733238 || s3 == 1831958048 || s3 == 1836070006 || s3 == 1752589105 || s3 == 1751479857 || s3 == 1932670515 || s3 == 1211250227 || s3 == 1987063864 || s3 == 1987063865 || s3 == 1635135537 || s3 == 1685479798 || s3 == 1685479729 || s3 == 1685481573 || s3 == 1685481521) {
                e eVar2 = eVar;
                int i5 = i4;
                E(c3012Fy1, s3, f2, s2, i2, i3, c6960i70, eVar2, i5);
                eVar = eVar2;
                i4 = i5;
            } else if (s3 == 1836069985 || s3 == 1701733217 || s3 == 1633889587 || s3 == 1700998451 || s3 == 1633889588 || s3 == 1835823201 || s3 == 1685353315 || s3 == 1685353317 || s3 == 1685353320 || s3 == 1685353324 || s3 == 1685353336 || s3 == 1935764850 || s3 == 1935767394 || s3 == 1819304813 || s3 == 1936684916 || s3 == 1953984371 || s3 == 778924082 || s3 == 778924083 || s3 == 1835557169 || s3 == 1835560241 || s3 == 1634492771 || s3 == 1634492791 || s3 == 1970037111 || s3 == 1332770163 || s3 == 1716281667) {
                e eVar3 = eVar;
                g(c3012Fy1, s3, f2, s2, i2, str, z, c6960i70, eVar3, i4);
                eVar = eVar3;
            } else if (s3 != 1414810956 && s3 != 1954034535 && s3 != 2004251764 && s3 != 1937010800 && s3 != 1664495672) {
                if (s3 == 1835365492) {
                    p(c3012Fy1, s3, f2, i2, eVar);
                } else if (s3 == 1667329389) {
                    eVar.b = new C10833xx0.b().T(i2).g0(C4128Rj1.I0).G();
                }
            } else {
                y(c3012Fy1, s3, f2, s2, i2, str, eVar);
            }
            c3012Fy1.Y(f2 + s2);
            i4++;
        }
        return eVar;
    }

    public static void y(C3012Fy1 c3012Fy1, int i2, int i3, int i4, int i5, String str, e eVar) {
        c3012Fy1.Y(i3 + 16);
        String str2 = C4128Rj1.A0;
        AbstractC5317bO0 abstractC5317bO0 = null;
        long j2 = Long.MAX_VALUE;
        if (i2 != 1414810956) {
            if (i2 == 1954034535) {
                int i6 = i4 - 16;
                byte[] bArr = new byte[i6];
                c3012Fy1.n(bArr, 0, i6);
                abstractC5317bO0 = AbstractC5317bO0.M(bArr);
                str2 = C4128Rj1.B0;
            } else if (i2 == 2004251764) {
                str2 = C4128Rj1.C0;
            } else if (i2 == 1937010800) {
                j2 = 0;
            } else if (i2 == 1664495672) {
                eVar.d = 1;
                str2 = C4128Rj1.D0;
            } else {
                throw new IllegalStateException();
            }
        }
        eVar.b = new C10833xx0.b().T(i5).g0(str2).X(str).k0(j2).V(abstractC5317bO0).G();
    }

    public static h z(C3012Fy1 c3012Fy1) {
        int i2;
        long j2;
        long Q;
        int i3 = 8;
        c3012Fy1.Y(8);
        int c2 = AbstractC4501Vf.c(c3012Fy1.s());
        if (c2 == 0) {
            i2 = 8;
        } else {
            i2 = 16;
        }
        c3012Fy1.Z(i2);
        int s = c3012Fy1.s();
        c3012Fy1.Z(4);
        int f2 = c3012Fy1.f();
        if (c2 == 0) {
            i3 = 4;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            j2 = C10323vs.b;
            if (i5 < i3) {
                if (c3012Fy1.e()[f2 + i5] != -1) {
                    if (c2 == 0) {
                        Q = c3012Fy1.N();
                    } else {
                        Q = c3012Fy1.Q();
                    }
                    if (Q != 0) {
                        j2 = Q;
                    }
                } else {
                    i5++;
                }
            } else {
                c3012Fy1.Z(i3);
                break;
            }
        }
        c3012Fy1.Z(16);
        int s2 = c3012Fy1.s();
        int s3 = c3012Fy1.s();
        c3012Fy1.Z(4);
        int s4 = c3012Fy1.s();
        int s5 = c3012Fy1.s();
        if (s2 == 0 && s3 == 65536 && s4 == -65536 && s5 == 0) {
            i4 = 90;
        } else if (s2 == 0 && s3 == -65536 && s4 == 65536 && s5 == 0) {
            i4 = C4731Xo.d1;
        } else if (s2 == -65536 && s3 == 0 && s4 == 0 && s5 == -65536) {
            i4 = 180;
        }
        return new h(s, j2, i4);
    }
}
