package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.List;
import o.C10323vs;
import o.C11029yl1;
import o.C4128Rj1;
import o.HS1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzahw implements zzadn {
    public final zzek a;
    public final zzaef b;
    public final zzaeb c;
    public final zzaed d;
    public final zzaet e;
    public zzadq f;
    public zzaet g;
    public zzaet h;
    public int i;
    @InterfaceC11300zs1
    public zzav j;
    public long k;
    public long l;
    public long m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public int f203o;
    public zzahy p;
    public boolean q;

    public zzahw() {
        throw null;
    }

    public static boolean k(int i, long j) {
        return ((long) (i & C11029yl1.G)) == (j & (-128000));
    }

    public final void a() {
        this.q = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0235  */
    /* JADX WARN: Type inference failed for: r2v41, types: [com.google.android.gms.internal.ads.zzaib] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v54, types: [com.google.android.gms.internal.ads.zzahz] */
    @HS1({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(zzado zzadoVar) throws IOException {
        long j;
        Throwable th;
        zzaef zzaefVar;
        int i;
        zzaeb zzaebVar;
        long j2;
        int i2;
        zzahy zzahtVar;
        int i3;
        int i4;
        zzav zzavVar;
        Object obj;
        zzahy zzahyVar;
        long j3;
        Throwable th2;
        if (this.i == 0) {
            try {
                m(zzadoVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.p == null) {
            zzaef zzaefVar2 = this.b;
            zzek zzekVar = new zzek(zzaefVar2.c);
            zzadoVar.J(zzekVar.n(), 0, zzaefVar2.c);
            int i5 = 21;
            if ((zzaefVar2.a & 1) != 0) {
                if (zzaefVar2.e != 1) {
                    i5 = 36;
                }
            } else if (zzaefVar2.e == 1) {
                i5 = 13;
            }
            int x = zzekVar.x();
            int i6 = i5 + 4;
            j = C10323vs.b;
            if (x >= i6) {
                zzekVar.l(i5);
                i = zzekVar.A();
                if (i != 1483304551) {
                    if (i == 1231971951) {
                        i = 1231971951;
                    }
                }
                if (i != 1231971951) {
                    if (i != 1447187017) {
                        if (i != 1483304551) {
                            zzadoVar.j();
                            th2 = null;
                        }
                    } else {
                        ?? b = zzahz.b(zzadoVar.f(), zzadoVar.e(), zzaefVar2, zzekVar);
                        zzadoVar.G(zzaefVar2.c);
                        th2 = b;
                    }
                    th = null;
                    zzahtVar = th2;
                    zzavVar = this.j;
                    long e = zzadoVar.e();
                    if (zzavVar != null) {
                        int a = zzavVar.a();
                        for (int i7 = 0; i7 < a; i7++) {
                            zzau b2 = zzavVar.b(i7);
                            if (b2 instanceof zzaha) {
                                zzaha zzahaVar = (zzaha) b2;
                                int a2 = zzavVar.a();
                                int i8 = 0;
                                while (true) {
                                    if (i8 < a2) {
                                        zzau b3 = zzavVar.b(i8);
                                        if (b3 instanceof zzahc) {
                                            zzahc zzahcVar = (zzahc) b3;
                                            if (zzahcVar.a.equals("TLEN")) {
                                                j3 = zzeu.N(Long.parseLong((String) zzahcVar.c.get(0)));
                                                break;
                                            }
                                        }
                                        i8++;
                                    } else {
                                        j3 = -9223372036854775807L;
                                        break;
                                    }
                                }
                                obj = zzahv.b(e, zzahaVar, j3);
                                zzahy zzahyVar2 = zzahtVar;
                                if (!this.q) {
                                    zzahyVar = new zzahx();
                                } else {
                                    if (obj != null) {
                                        zzahyVar2 = obj;
                                    } else if (zzahtVar == null) {
                                        zzahyVar2 = th;
                                    }
                                    if (zzahyVar2 == null) {
                                        zzek zzekVar2 = this.a;
                                        zzadoVar.J(zzekVar2.n(), 0, 4);
                                        zzekVar2.l(0);
                                        zzaefVar2.a(zzekVar2.A());
                                        zzahyVar2 = new zzaht(zzadoVar.f(), zzadoVar.e(), zzaefVar2.f, zzaefVar2.c, false);
                                    }
                                    this.g.f(zzahyVar2.a());
                                    zzahyVar = zzahyVar2;
                                }
                                this.p = zzahyVar;
                                this.f.P(zzahyVar);
                                zzx zzxVar = new zzx();
                                zzxVar.e(C4128Rj1.I);
                                zzxVar.E(zzaefVar2.b);
                                zzxVar.t(4096);
                                zzxVar.b(zzaefVar2.e);
                                zzxVar.F(zzaefVar2.d);
                                zzaeb zzaebVar2 = this.c;
                                zzxVar.i(zzaebVar2.a);
                                zzxVar.j(zzaebVar2.b);
                                zzxVar.w(this.j);
                                if (this.p.c() != -2147483647) {
                                    zzxVar.a(this.p.c());
                                }
                                this.h.e(zzxVar.K());
                                this.m = zzadoVar.e();
                            }
                        }
                    }
                    obj = th;
                    zzahy zzahyVar22 = zzahtVar;
                    if (!this.q) {
                    }
                    this.p = zzahyVar;
                    this.f.P(zzahyVar);
                    zzx zzxVar2 = new zzx();
                    zzxVar2.e(C4128Rj1.I);
                    zzxVar2.E(zzaefVar2.b);
                    zzxVar2.t(4096);
                    zzxVar2.b(zzaefVar2.e);
                    zzxVar2.F(zzaefVar2.d);
                    zzaeb zzaebVar22 = this.c;
                    zzxVar2.i(zzaebVar22.a);
                    zzxVar2.j(zzaebVar22.b);
                    zzxVar2.w(this.j);
                    if (this.p.c() != -2147483647) {
                    }
                    this.h.e(zzxVar2.K());
                    this.m = zzadoVar.e();
                }
                zzaia b4 = zzaia.b(zzaefVar2, zzekVar);
                zzaebVar = this.c;
                if (!zzaebVar.a() && (i3 = b4.d) != -1 && (i4 = b4.e) != -1) {
                    zzaebVar.a = i3;
                    zzaebVar.b = i4;
                }
                long e2 = zzadoVar.e();
                if (zzadoVar.f() != -1) {
                    long j4 = b4.c;
                    if (j4 != -1) {
                        long j5 = j4 + e2;
                        if (zzadoVar.f() != j5) {
                            j2 = -1;
                            th = null;
                            zzdx.e("Mp3Extractor", "Data size mismatch between stream (" + zzadoVar.f() + ") and Xing frame (" + j5 + "), using Xing value.");
                            zzadoVar.G(zzaefVar2.c);
                            if (i != 1483304551) {
                                zzahtVar = zzaib.b(b4, e2);
                            } else {
                                long f = zzadoVar.f();
                                long a3 = b4.a();
                                if (a3 != C10323vs.b) {
                                    long j6 = b4.c;
                                    if (j6 != j2) {
                                        f = e2 + j6;
                                        i2 = b4.a.c;
                                    } else if (f != j2) {
                                        j6 = f - e2;
                                        i2 = b4.a.c;
                                    }
                                    long j7 = j6 - i2;
                                    long j8 = f;
                                    RoundingMode roundingMode = RoundingMode.HALF_UP;
                                    zzahtVar = new zzaht(j8, e2 + b4.a.c, zzgbf.b(zzeu.P(j7, 8000000L, a3, roundingMode)), zzgbf.b(zzgba.b(j7, b4.b, roundingMode)), false);
                                }
                                zzahtVar = th;
                            }
                            zzavVar = this.j;
                            long e3 = zzadoVar.e();
                            if (zzavVar != null) {
                            }
                            obj = th;
                            zzahy zzahyVar222 = zzahtVar;
                            if (!this.q) {
                            }
                            this.p = zzahyVar;
                            this.f.P(zzahyVar);
                            zzx zzxVar22 = new zzx();
                            zzxVar22.e(C4128Rj1.I);
                            zzxVar22.E(zzaefVar2.b);
                            zzxVar22.t(4096);
                            zzxVar22.b(zzaefVar2.e);
                            zzxVar22.F(zzaefVar2.d);
                            zzaeb zzaebVar222 = this.c;
                            zzxVar22.i(zzaebVar222.a);
                            zzxVar22.j(zzaebVar222.b);
                            zzxVar22.w(this.j);
                            if (this.p.c() != -2147483647) {
                            }
                            this.h.e(zzxVar22.K());
                            this.m = zzadoVar.e();
                        }
                    }
                }
                j2 = -1;
                th = null;
                zzadoVar.G(zzaefVar2.c);
                if (i != 1483304551) {
                }
                zzavVar = this.j;
                long e32 = zzadoVar.e();
                if (zzavVar != null) {
                }
                obj = th;
                zzahy zzahyVar2222 = zzahtVar;
                if (!this.q) {
                }
                this.p = zzahyVar;
                this.f.P(zzahyVar);
                zzx zzxVar222 = new zzx();
                zzxVar222.e(C4128Rj1.I);
                zzxVar222.E(zzaefVar2.b);
                zzxVar222.t(4096);
                zzxVar222.b(zzaefVar2.e);
                zzxVar222.F(zzaefVar2.d);
                zzaeb zzaebVar2222 = this.c;
                zzxVar222.i(zzaebVar2222.a);
                zzxVar222.j(zzaebVar2222.b);
                zzxVar222.w(this.j);
                if (this.p.c() != -2147483647) {
                }
                this.h.e(zzxVar222.K());
                this.m = zzadoVar.e();
            }
            if (zzekVar.x() >= 40) {
                zzekVar.l(36);
                if (zzekVar.A() == 1447187017) {
                    i = 1447187017;
                    if (i != 1231971951) {
                    }
                    zzaia b42 = zzaia.b(zzaefVar2, zzekVar);
                    zzaebVar = this.c;
                    if (!zzaebVar.a()) {
                        zzaebVar.a = i3;
                        zzaebVar.b = i4;
                    }
                    long e22 = zzadoVar.e();
                    if (zzadoVar.f() != -1) {
                    }
                    j2 = -1;
                    th = null;
                    zzadoVar.G(zzaefVar2.c);
                    if (i != 1483304551) {
                    }
                    zzavVar = this.j;
                    long e322 = zzadoVar.e();
                    if (zzavVar != null) {
                    }
                    obj = th;
                    zzahy zzahyVar22222 = zzahtVar;
                    if (!this.q) {
                    }
                    this.p = zzahyVar;
                    this.f.P(zzahyVar);
                    zzx zzxVar2222 = new zzx();
                    zzxVar2222.e(C4128Rj1.I);
                    zzxVar2222.E(zzaefVar2.b);
                    zzxVar2222.t(4096);
                    zzxVar2222.b(zzaefVar2.e);
                    zzxVar2222.F(zzaefVar2.d);
                    zzaeb zzaebVar22222 = this.c;
                    zzxVar2222.i(zzaebVar22222.a);
                    zzxVar2222.j(zzaebVar22222.b);
                    zzxVar2222.w(this.j);
                    if (this.p.c() != -2147483647) {
                    }
                    this.h.e(zzxVar2222.K());
                    this.m = zzadoVar.e();
                }
            }
            i = 0;
            if (i != 1231971951) {
            }
            zzaia b422 = zzaia.b(zzaefVar2, zzekVar);
            zzaebVar = this.c;
            if (!zzaebVar.a()) {
            }
            long e222 = zzadoVar.e();
            if (zzadoVar.f() != -1) {
            }
            j2 = -1;
            th = null;
            zzadoVar.G(zzaefVar2.c);
            if (i != 1483304551) {
            }
            zzavVar = this.j;
            long e3222 = zzadoVar.e();
            if (zzavVar != null) {
            }
            obj = th;
            zzahy zzahyVar222222 = zzahtVar;
            if (!this.q) {
            }
            this.p = zzahyVar;
            this.f.P(zzahyVar);
            zzx zzxVar22222 = new zzx();
            zzxVar22222.e(C4128Rj1.I);
            zzxVar22222.E(zzaefVar2.b);
            zzxVar22222.t(4096);
            zzxVar22222.b(zzaefVar2.e);
            zzxVar22222.F(zzaefVar2.d);
            zzaeb zzaebVar222222 = this.c;
            zzxVar22222.i(zzaebVar222222.a);
            zzxVar22222.j(zzaebVar222222.b);
            zzxVar22222.w(this.j);
            if (this.p.c() != -2147483647) {
            }
            this.h.e(zzxVar22222.K());
            this.m = zzadoVar.e();
        } else {
            j = C10323vs.b;
            th = null;
            long j9 = this.m;
            if (j9 != 0) {
                long e4 = zzadoVar.e();
                if (e4 < j9) {
                    zzadoVar.G((int) (j9 - e4));
                }
            }
        }
        int i9 = this.f203o;
        if (i9 == 0) {
            zzadoVar.j();
            if (l(zzadoVar)) {
                return -1;
            }
            zzek zzekVar3 = this.a;
            zzekVar3.l(0);
            int A = zzekVar3.A();
            if (k(A, this.i) && zzaeg.b(A) != -1) {
                zzaef zzaefVar3 = this.b;
                zzaefVar3.a(A);
                if (this.k == j) {
                    this.k = this.p.w(zzadoVar.e());
                }
                i9 = zzaefVar3.c;
                this.f203o = i9;
                this.n = zzadoVar.e() + i9;
                if (this.p instanceof zzahu) {
                    d(this.l + zzaefVar3.g);
                    throw th;
                }
            } else {
                zzadoVar.G(1);
                this.i = 0;
                return 0;
            }
        }
        int b5 = this.h.b(zzadoVar, i9, true);
        if (b5 == -1) {
            return -1;
        }
        int i10 = this.f203o - b5;
        this.f203o = i10;
        if (i10 > 0) {
            return 0;
        }
        this.h.c(d(this.l), 1, this.b.c, 0, null);
        this.l += zzaefVar.g;
        this.f203o = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    public final long d(long j) {
        return this.k + ((j * 1000000) / this.b.d);
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        this.i = 0;
        this.k = C10323vs.b;
        this.l = 0L;
        this.f203o = 0;
        if (!(this.p instanceof zzahu)) {
            return;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        return m(zzadoVar, true);
    }

    public final void h() {
        zzahy zzahyVar = this.p;
        if ((zzahyVar instanceof zzaht) && zzahyVar.h()) {
            long j = this.n;
            if (j != -1 && j != this.p.f()) {
                this.p = ((zzaht) this.p).e(this.n);
                zzadq zzadqVar = this.f;
                zzadqVar.getClass();
                zzadqVar.P(this.p);
                this.g.getClass();
                this.p.a();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.f = zzadqVar;
        zzaet O = zzadqVar.O(0, 1);
        this.g = O;
        this.h = O;
        this.f.N();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        zzdc.b(this.g);
        String str = zzeu.a;
        int b = b(zzadoVar);
        if (b == -1 && (this.p instanceof zzahu)) {
            if (this.p.a() != d(this.l)) {
                zzahu zzahuVar = (zzahu) this.p;
                throw null;
            }
        }
        return b;
    }

    public final boolean l(zzado zzadoVar) throws IOException {
        zzahy zzahyVar = this.p;
        if (zzahyVar != null) {
            long f = zzahyVar.f();
            if (f != -1 && zzadoVar.d() > f - 4) {
                return true;
            }
        }
        try {
            if (!zzadoVar.F(this.a.n(), 0, 4, true)) {
                return true;
            }
            return false;
        } catch (EOFException unused) {
            return true;
        }
    }

    public final boolean m(zzado zzadoVar, boolean z) throws IOException {
        int i;
        int i2;
        int b;
        int i3;
        zzadoVar.j();
        if (zzadoVar.e() == 0) {
            zzav a = this.d.a(zzadoVar, null);
            this.j = a;
            if (a != null) {
                this.c.b(a);
            }
            i = (int) zzadoVar.d();
            if (!z) {
                zzadoVar.G(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i4 = i2;
        int i5 = i4;
        while (true) {
            if (l(zzadoVar)) {
                if (i4 <= 0) {
                    h();
                    throw new EOFException();
                }
            } else {
                zzek zzekVar = this.a;
                zzekVar.l(0);
                int A = zzekVar.A();
                if ((i2 != 0 && !k(A, i2)) || (b = zzaeg.b(A)) == -1) {
                    if (true != z) {
                        i3 = 131072;
                    } else {
                        i3 = 32768;
                    }
                    int i6 = i5 + 1;
                    if (i5 == i3) {
                        if (z) {
                            return false;
                        }
                        h();
                        throw new EOFException();
                    }
                    if (z) {
                        zzadoVar.j();
                        zzadoVar.A(i + i6);
                    } else {
                        zzadoVar.G(1);
                    }
                    i2 = 0;
                    i5 = i6;
                    i4 = 0;
                } else {
                    i4++;
                    if (i4 == 1) {
                        this.b.a(A);
                        i2 = A;
                    } else if (i4 == 4) {
                        break;
                    }
                    zzadoVar.A(b - 4);
                }
            }
        }
        if (z) {
            zzadoVar.G(i + i5);
        } else {
            zzadoVar.j();
        }
        this.i = i2;
        return true;
    }

    public zzahw(int i) {
        this.a = new zzek(10);
        this.b = new zzaef();
        this.c = new zzaeb();
        this.k = C10323vs.b;
        this.d = new zzaed();
        zzadj zzadjVar = new zzadj();
        this.e = zzadjVar;
        this.h = zzadjVar;
        this.n = -1L;
    }
}
