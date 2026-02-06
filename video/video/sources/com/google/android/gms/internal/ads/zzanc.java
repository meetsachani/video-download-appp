package com.google.android.gms.internal.ads;

import java.util.Collections;
import o.C10323vs;
import o.C4128Rj1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzanc implements zzamr {
    @InterfaceC11300zs1
    public final String a;
    public final int b;
    public final String c = C4128Rj1.f601o;
    public final zzek d;
    public final zzej e;
    public zzaet f;
    public String g;
    public zzz h;
    public int i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public int f215o;
    public int p;
    public int q;
    public boolean r;
    public long s;
    public int t;
    public long u;
    public int v;
    @InterfaceC11300zs1
    public String w;

    public zzanc(@InterfaceC11300zs1 String str, int i, String str2) {
        this.a = str;
        this.b = i;
        zzek zzekVar = new zzek(1024);
        this.d = zzekVar;
        byte[] n = zzekVar.n();
        this.e = new zzej(n, n.length);
        this.m = C10323vs.b;
    }

    public static long g(zzej zzejVar) {
        return zzejVar.d((zzejVar.d(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void a(boolean z) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x015a, code lost:
        if (r14.n == false) goto L105;
     */
    @Override // com.google.android.gms.internal.ads.zzamr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(zzek zzekVar) throws zzaz {
        int i;
        int i2;
        int i3;
        boolean p;
        zzdc.b(this.f);
        while (zzekVar.u() > 0) {
            int i4 = this.i;
            boolean z = true;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        int min = Math.min(zzekVar.u(), this.k - this.j);
                        zzej zzejVar = this.e;
                        zzekVar.h(zzejVar.a, this.j, min);
                        int i5 = this.j + min;
                        this.j = i5;
                        if (i5 == this.k) {
                            zzejVar.l(0);
                            if (!zzejVar.p()) {
                                this.n = true;
                                int d = zzejVar.d(1);
                                if (d == 1) {
                                    i3 = zzejVar.d(1);
                                    i2 = 1;
                                } else {
                                    i2 = d;
                                    i3 = 0;
                                }
                                this.f215o = i3;
                                if (i3 == 0) {
                                    if (i2 == 1) {
                                        g(zzejVar);
                                        i2 = 1;
                                    }
                                    if (zzejVar.p()) {
                                        this.p = zzejVar.d(6);
                                        int d2 = zzejVar.d(4);
                                        int d3 = zzejVar.d(3);
                                        if (d2 == 0 && d3 == 0) {
                                            if (i2 == 0) {
                                                int c = zzejVar.c();
                                                int f = f(zzejVar);
                                                zzejVar.l(c);
                                                byte[] bArr = new byte[(f + 7) / 8];
                                                zzejVar.h(bArr, 0, f);
                                                zzx zzxVar = new zzx();
                                                zzxVar.o(this.g);
                                                zzxVar.e(this.c);
                                                zzxVar.E("audio/mp4a-latm");
                                                zzxVar.c(this.w);
                                                zzxVar.b(this.v);
                                                zzxVar.F(this.t);
                                                zzxVar.p(Collections.singletonList(bArr));
                                                zzxVar.s(this.a);
                                                zzxVar.C(this.b);
                                                zzz K = zzxVar.K();
                                                if (!K.equals(this.h)) {
                                                    this.h = K;
                                                    this.u = 1024000000 / K.F;
                                                    this.f.e(K);
                                                }
                                            } else {
                                                zzejVar.n(((int) g(zzejVar)) - f(zzejVar));
                                            }
                                            int d4 = zzejVar.d(3);
                                            this.q = d4;
                                            if (d4 != 0) {
                                                if (d4 != 1) {
                                                    if (d4 != 3 && d4 != 4 && d4 != 5) {
                                                        if (d4 != 6 && d4 != 7) {
                                                            throw new IllegalStateException();
                                                        }
                                                        zzejVar.n(1);
                                                    } else {
                                                        zzejVar.n(6);
                                                    }
                                                } else {
                                                    zzejVar.n(9);
                                                }
                                            } else {
                                                zzejVar.n(8);
                                            }
                                            boolean p2 = zzejVar.p();
                                            this.r = p2;
                                            this.s = 0L;
                                            if (p2) {
                                                if (i2 != 1) {
                                                    do {
                                                        p = zzejVar.p();
                                                        this.s = (this.s << 8) + zzejVar.d(8);
                                                    } while (p);
                                                } else {
                                                    this.s = g(zzejVar);
                                                }
                                            }
                                            if (zzejVar.p()) {
                                                zzejVar.n(8);
                                            }
                                        } else {
                                            throw zzaz.a(null, null);
                                        }
                                    } else {
                                        throw zzaz.a(null, null);
                                    }
                                } else {
                                    throw zzaz.a(null, null);
                                }
                            }
                            if (this.f215o == 0) {
                                if (this.p == 0) {
                                    if (this.q == 0) {
                                        int i6 = 0;
                                        while (true) {
                                            int d5 = zzejVar.d(8);
                                            i = i6 + d5;
                                            if (d5 != 255) {
                                                break;
                                            }
                                            i6 = i;
                                        }
                                        int c2 = zzejVar.c();
                                        if ((c2 & 7) == 0) {
                                            this.d.l(c2 >> 3);
                                        } else {
                                            zzek zzekVar2 = this.d;
                                            zzejVar.h(zzekVar2.n(), 0, i * 8);
                                            zzekVar2.l(0);
                                        }
                                        this.f.d(this.d, i);
                                        if (this.m == C10323vs.b) {
                                            z = false;
                                        }
                                        zzdc.f(z);
                                        this.f.c(this.m, 1, i, 0, null);
                                        this.m += this.u;
                                        if (this.r) {
                                            zzejVar.n((int) this.s);
                                        }
                                        this.i = 0;
                                    } else {
                                        throw zzaz.a(null, null);
                                    }
                                } else {
                                    throw zzaz.a(null, null);
                                }
                            } else {
                                throw zzaz.a(null, null);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        int G = ((this.l & (-225)) << 8) | zzekVar.G();
                        this.k = G;
                        zzek zzekVar3 = this.d;
                        if (G > zzekVar3.n().length) {
                            zzekVar3.i(G);
                            zzej zzejVar2 = this.e;
                            byte[] n = zzekVar3.n();
                            zzejVar2.k(n, n.length);
                        }
                        this.j = 0;
                        this.i = 3;
                    }
                } else {
                    int G2 = zzekVar.G();
                    if ((G2 & 224) == 224) {
                        this.l = G2;
                        this.i = 2;
                    } else if (G2 != 86) {
                        this.i = 0;
                    }
                }
            } else if (zzekVar.G() == 86) {
                this.i = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void c(long j, int i) {
        this.m = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void d() {
        this.i = 0;
        this.m = C10323vs.b;
        this.n = false;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        zzaofVar.c();
        this.f = zzadqVar.O(zzaofVar.a(), 1);
        this.g = zzaofVar.b();
    }

    public final int f(zzej zzejVar) throws zzaz {
        int a = zzejVar.a();
        zzaci b = zzack.b(zzejVar, true);
        this.w = b.c;
        this.t = b.a;
        this.v = b.b;
        return a - zzejVar.a();
    }
}
