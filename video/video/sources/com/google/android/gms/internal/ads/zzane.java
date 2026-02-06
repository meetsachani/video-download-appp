package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.C4128Rj1;
import o.C6516gH2;

/* loaded from: classes2.dex */
public final class zzane implements zzamr {
    public String f;
    public zzaet g;
    public boolean j;
    public int l;
    public int m;

    /* renamed from: o  reason: collision with root package name */
    public int f216o;
    public int p;
    public int t;
    public boolean v;
    public final String a = C4128Rj1.f601o;
    public int e = 0;
    public final zzek b = new zzek(new byte[15], 2);
    public final zzej c = new zzej();
    public final zzek d = new zzek();
    public final zzanf q = new zzanf();
    public int r = C10323vs.f;
    public int s = -1;
    public long u = -1;
    public boolean k = true;
    public boolean n = true;
    public double h = -9.223372036854776E18d;
    public double i = -9.223372036854776E18d;

    public zzane(String str) {
    }

    public static final void f(zzek zzekVar, zzek zzekVar2, boolean z) {
        int w = zzekVar.w();
        int min = Math.min(zzekVar.u(), zzekVar2.u());
        zzekVar.h(zzekVar2.n(), zzekVar2.w(), min);
        zzekVar2.m(min);
        if (z) {
            zzekVar.l(w);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void b(zzek zzekVar) throws zzaz {
        int i;
        zzdc.b(this.g);
        while (zzekVar.u() > 0) {
            int i2 = this.e;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 != 1) {
                    zzanf zzanfVar = this.q;
                    int i4 = zzanfVar.a;
                    if (i4 == 1 || i4 == 17) {
                        f(zzekVar, this.d, true);
                    }
                    int min = Math.min(zzekVar.u(), zzanfVar.c - this.f216o);
                    this.g.d(zzekVar, min);
                    int i5 = this.f216o + min;
                    this.f216o = i5;
                    if (i5 == zzanfVar.c) {
                        int i6 = zzanfVar.a;
                        if (i6 == 1) {
                            byte[] n = this.d.n();
                            zzang a = zzani.a(new zzej(n, n.length));
                            this.r = a.b;
                            this.s = a.c;
                            long j = this.u;
                            long j2 = zzanfVar.b;
                            if (j != j2) {
                                this.u = j2;
                                int i7 = a.a;
                                String str = "mhm1";
                                if (i7 != -1) {
                                    str = "mhm1".concat(String.format(".%02X", Integer.valueOf(i7)));
                                }
                                byte[] bArr = a.d;
                                zzfyc zzfycVar = null;
                                if (bArr != null && bArr.length > 0) {
                                    zzfycVar = zzfyc.H(zzeu.b, bArr);
                                }
                                zzx zzxVar = new zzx();
                                zzxVar.o(this.f);
                                zzxVar.e(this.a);
                                zzxVar.E(C4128Rj1.M);
                                zzxVar.F(this.r);
                                zzxVar.c(str);
                                zzxVar.p(zzfycVar);
                                this.g.e(zzxVar.K());
                            }
                            this.v = true;
                        } else if (i6 == 17) {
                            byte[] n2 = this.d.n();
                            zzej zzejVar = new zzej(n2, n2.length);
                            if (zzejVar.p()) {
                                zzejVar.n(2);
                                i3 = zzejVar.d(13);
                            }
                            this.t = i3;
                        } else if (i6 == 2) {
                            if (this.v) {
                                this.k = false;
                                i = 1;
                            } else {
                                i = 0;
                            }
                            int i8 = this.s - this.t;
                            double d = this.r;
                            long round = Math.round(this.h);
                            if (this.j) {
                                this.j = false;
                                this.h = this.i;
                            } else {
                                this.h += (i8 * 1000000.0d) / d;
                            }
                            this.g.c(round, i, this.p, 0, null);
                            this.v = false;
                            this.t = 0;
                            this.p = 0;
                        }
                        this.e = 1;
                    }
                } else {
                    zzek zzekVar2 = this.b;
                    f(zzekVar, zzekVar2, false);
                    if (zzekVar2.u() == 0) {
                        zzej zzejVar2 = this.c;
                        int x = zzekVar2.x();
                        zzejVar2.k(zzekVar2.n(), x);
                        zzanf zzanfVar2 = this.q;
                        if (zzani.b(zzejVar2, zzanfVar2)) {
                            this.f216o = 0;
                            this.p += zzanfVar2.c + x;
                            zzekVar2.l(0);
                            this.g.d(zzekVar2, zzekVar2.x());
                            zzekVar2.i(2);
                            this.d.i(zzanfVar2.c);
                            this.n = true;
                            this.e = 2;
                        } else if (zzekVar2.x() < 15) {
                            zzekVar2.k(zzekVar2.x() + 1);
                        }
                    }
                    this.n = false;
                }
            } else {
                int i9 = this.l;
                if ((i9 & 2) == 0) {
                    zzekVar.l(zzekVar.x());
                } else {
                    if ((i9 & 4) == 0) {
                        while (zzekVar.u() > 0) {
                            int i10 = this.m << 8;
                            this.m = i10;
                            int G = i10 | zzekVar.G();
                            this.m = G;
                            if ((G & C6516gH2.x) == 12583333) {
                                zzekVar.l(zzekVar.w() - 3);
                                this.m = 0;
                            }
                        }
                    }
                    this.e = 1;
                    break;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void c(long j, int i) {
        this.l = i;
        if (!this.k && (this.p != 0 || !this.n)) {
            this.j = true;
        }
        if (j != C10323vs.b) {
            double d = j;
            if (this.j) {
                this.i = d;
            } else {
                this.h = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void d() {
        this.e = 0;
        this.m = 0;
        this.b.i(2);
        this.f216o = 0;
        this.p = 0;
        this.r = C10323vs.f;
        this.s = -1;
        this.t = 0;
        this.u = -1L;
        this.v = false;
        this.j = false;
        this.n = true;
        this.k = true;
        this.h = -9.223372036854776E18d;
        this.i = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        zzaofVar.c();
        this.f = zzaofVar.b();
        this.g = zzadqVar.O(zzaofVar.a(), 1);
    }
}
