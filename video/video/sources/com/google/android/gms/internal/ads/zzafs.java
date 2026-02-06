package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import o.C4128Rj1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzafs implements zzadn {
    public final byte[] a;
    public final zzek b;
    public final zzadt c;
    public zzadq d;
    public zzaet e;
    public int f;
    @InterfaceC11300zs1
    public zzav g;
    public zzady h;
    public int i;
    public int j;
    public zzafr k;
    public int l;
    public long m;

    public zzafs() {
        throw null;
    }

    public final long a(zzek zzekVar, boolean z) {
        boolean z2;
        this.h.getClass();
        int w = zzekVar.w();
        while (w <= zzekVar.x() - 16) {
            zzekVar.l(w);
            zzady zzadyVar = this.h;
            int i = this.j;
            zzadt zzadtVar = this.c;
            if (zzadu.c(zzekVar, zzadyVar, i, zzadtVar)) {
                zzekVar.l(w);
                return zzadtVar.a;
            }
            w++;
        }
        if (z) {
            while (w <= zzekVar.x() - this.i) {
                zzekVar.l(w);
                try {
                    z2 = zzadu.c(zzekVar, this.h, this.j, this.c);
                } catch (IndexOutOfBoundsException unused) {
                    z2 = false;
                }
                if (zzekVar.w() <= zzekVar.x() && z2) {
                    zzekVar.l(w);
                    return this.c.a;
                }
                w++;
            }
            zzekVar.l(zzekVar.x());
            return -1L;
        }
        zzekVar.l(w);
        return -1L;
    }

    public final void b() {
        zzady zzadyVar = this.h;
        String str = zzeu.a;
        this.e.c((this.m * 1000000) / zzadyVar.e, 1, this.l, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        long j3 = 0;
        if (j == 0) {
            this.f = 0;
        } else {
            zzafr zzafrVar = this.k;
            if (zzafrVar != null) {
                zzafrVar.d(j2);
            }
        }
        if (j2 != 0) {
            j3 = -1;
        }
        this.m = j3;
        this.l = 0;
        this.b.i(0);
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        zzadv.a(zzadoVar, false);
        zzek zzekVar = new zzek(4);
        ((zzadd) zzadoVar).F(zzekVar.n(), 0, 4, false);
        if (zzekVar.O() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.d = zzadqVar;
        this.e = zzadqVar.O(0, 1);
        zzadqVar.N();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        boolean p;
        zzaem zzaelVar;
        int i = this.f;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            this.e.getClass();
                            zzady zzadyVar = this.h;
                            zzadyVar.getClass();
                            zzafr zzafrVar = this.k;
                            if (zzafrVar != null && zzafrVar.e()) {
                                return zzafrVar.a(zzadoVar, zzaejVar);
                            }
                            if (this.m == -1) {
                                this.m = zzadu.b(zzadoVar, zzadyVar);
                                return 0;
                            }
                            zzek zzekVar = this.b;
                            int x = zzekVar.x();
                            if (x < 32768) {
                                int D = zzadoVar.D(zzekVar.n(), x, 32768 - x);
                                if (D != -1) {
                                    z = false;
                                }
                                if (!z) {
                                    zzekVar.k(x + D);
                                } else if (zzekVar.u() == 0) {
                                    b();
                                    return -1;
                                }
                            } else {
                                z = false;
                            }
                            int w = zzekVar.w();
                            int i2 = this.l;
                            int i3 = this.i;
                            if (i2 < i3) {
                                zzekVar.m(Math.min(i3 - i2, zzekVar.u()));
                            }
                            long a = a(zzekVar, z);
                            int w2 = zzekVar.w() - w;
                            zzekVar.l(w);
                            this.e.d(zzekVar, w2);
                            this.l += w2;
                            if (a != -1) {
                                b();
                                this.l = 0;
                                this.m = a;
                            }
                            int length = zzekVar.n().length - zzekVar.x();
                            if (zzekVar.u() >= 16 || length >= 16) {
                                return 0;
                            }
                            int u = zzekVar.u();
                            System.arraycopy(zzekVar.n(), zzekVar.w(), zzekVar.n(), 0, u);
                            zzekVar.l(0);
                            zzekVar.k(u);
                            return 0;
                        }
                        zzadoVar.j();
                        zzek zzekVar2 = new zzek(2);
                        zzadoVar.J(zzekVar2.n(), 0, 2);
                        int K = zzekVar2.K();
                        if ((K >> 2) == 16382) {
                            zzadoVar.j();
                            this.j = K;
                            zzadq zzadqVar = this.d;
                            String str = zzeu.a;
                            long e = zzadoVar.e();
                            long f = zzadoVar.f();
                            zzady zzadyVar2 = this.h;
                            zzadyVar2.getClass();
                            if (zzadyVar2.k != null) {
                                zzaelVar = new zzadw(zzadyVar2, e);
                            } else if (f != -1 && zzadyVar2.j > 0) {
                                zzafr zzafrVar2 = new zzafr(zzadyVar2, this.j, e, f);
                                this.k = zzafrVar2;
                                zzaelVar = zzafrVar2.b();
                            } else {
                                zzaelVar = new zzael(zzadyVar2.a(), 0L);
                            }
                            zzadqVar.P(zzaelVar);
                            this.f = 5;
                            return 0;
                        }
                        zzadoVar.j();
                        throw zzaz.a("First frame does not start with sync code.", null);
                    }
                    zzady zzadyVar3 = this.h;
                    do {
                        zzadoVar.j();
                        zzej zzejVar = new zzej(new byte[4], 4);
                        zzadoVar.J(zzejVar.a, 0, 4);
                        p = zzejVar.p();
                        int d = zzejVar.d(7);
                        int d2 = zzejVar.d(24) + 4;
                        if (d == 0) {
                            byte[] bArr = new byte[38];
                            zzadoVar.I(bArr, 0, 38);
                            zzadyVar3 = new zzady(bArr, 4);
                        } else if (zzadyVar3 != null) {
                            if (d == 3) {
                                zzek zzekVar3 = new zzek(d2);
                                zzadoVar.I(zzekVar3.n(), 0, d2);
                                zzadyVar3 = zzadyVar3.f(zzadv.b(zzekVar3));
                            } else if (d == 4) {
                                zzek zzekVar4 = new zzek(d2);
                                zzadoVar.I(zzekVar4.n(), 0, d2);
                                zzekVar4.m(4);
                                zzadyVar3 = zzadyVar3.g(Arrays.asList(zzaez.c(zzekVar4, false, false).a));
                            } else if (d == 6) {
                                zzek zzekVar5 = new zzek(d2);
                                zzadoVar.I(zzekVar5.n(), 0, d2);
                                zzekVar5.m(4);
                                zzadyVar3 = zzadyVar3.e(zzfyc.G(zzagl.b(zzekVar5)));
                            } else {
                                zzadoVar.G(d2);
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        String str2 = zzeu.a;
                        this.h = zzadyVar3;
                    } while (!p);
                    zzadyVar3.getClass();
                    this.i = Math.max(zzadyVar3.c, 6);
                    zzz c = this.h.c(this.a, this.g);
                    zzaet zzaetVar = this.e;
                    zzx b = c.b();
                    b.e(C4128Rj1.e0);
                    zzaetVar.e(b.K());
                    this.e.f(this.h.a());
                    this.f = 4;
                    return 0;
                }
                zzek zzekVar6 = new zzek(4);
                zzadoVar.I(zzekVar6.n(), 0, 4);
                if (zzekVar6.O() == 1716281667) {
                    this.f = 3;
                    return 0;
                }
                throw zzaz.a("Failed to read FLAC stream marker.", null);
            }
            zzadoVar.J(this.a, 0, 42);
            zzadoVar.j();
            this.f = 2;
            return 0;
        }
        zzadoVar.j();
        long d3 = zzadoVar.d();
        zzav a2 = zzadv.a(zzadoVar, true);
        zzadoVar.G((int) (zzadoVar.d() - d3));
        this.g = a2;
        this.f = 1;
        return 0;
    }

    public zzafs(int i) {
        this.a = new byte[42];
        this.b = new zzek(new byte[32768], 0);
        this.c = new zzadt();
        this.f = 0;
    }
}
