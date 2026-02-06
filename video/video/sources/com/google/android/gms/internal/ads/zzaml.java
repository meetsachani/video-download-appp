package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.C4128Rj1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaml implements zzamr {
    public final zzej a;
    public final zzek b;
    @InterfaceC11300zs1
    public final String c;
    public final int d;
    public final String e;
    public String f;
    public zzaet g;
    public int h;
    public int i;
    public boolean j;
    public long k;
    public zzz l;
    public int m;
    public long n;

    public zzaml(@InterfaceC11300zs1 String str, int i, String str2) {
        zzej zzejVar = new zzej(new byte[16], 16);
        this.a = zzejVar;
        this.b = new zzek(zzejVar.a);
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = C10323vs.b;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void a(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void b(zzek zzekVar) {
        boolean z;
        boolean z2;
        zzdc.b(this.g);
        while (zzekVar.u() > 0) {
            int i = this.h;
            boolean z3 = true;
            if (i != 0) {
                if (i != 1) {
                    int min = Math.min(zzekVar.u(), this.m - this.i);
                    this.g.d(zzekVar, min);
                    int i2 = this.i + min;
                    this.i = i2;
                    if (i2 == this.m) {
                        if (this.n == C10323vs.b) {
                            z3 = false;
                        }
                        zzdc.f(z3);
                        this.g.c(this.n, 1, this.m, 0, null);
                        this.n += this.k;
                        this.h = 0;
                    }
                } else {
                    zzek zzekVar2 = this.b;
                    byte[] n = zzekVar2.n();
                    int min2 = Math.min(zzekVar.u(), 16 - this.i);
                    zzekVar.h(n, this.i, min2);
                    int i3 = this.i + min2;
                    this.i = i3;
                    if (i3 == 16) {
                        zzej zzejVar = this.a;
                        zzejVar.l(0);
                        zzacp b = zzacr.b(zzejVar);
                        zzz zzzVar = this.l;
                        if (zzzVar == null || zzzVar.E != 2 || b.a != zzzVar.F || !C4128Rj1.T.equals(zzzVar.f301o)) {
                            zzx zzxVar = new zzx();
                            zzxVar.o(this.f);
                            zzxVar.e(this.e);
                            zzxVar.E(C4128Rj1.T);
                            zzxVar.b(2);
                            zzxVar.F(b.a);
                            zzxVar.s(this.c);
                            zzxVar.C(this.d);
                            zzz K = zzxVar.K();
                            this.l = K;
                            this.g.e(K);
                        }
                        this.m = b.b;
                        this.k = (b.c * 1000000) / this.l.F;
                        zzekVar2.l(0);
                        this.g.d(zzekVar2, 16);
                        this.h = 2;
                    }
                }
            } else {
                while (zzekVar.u() > 0) {
                    if (!this.j) {
                        if (zzekVar.G() == 172) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.j = z;
                    } else {
                        int G = zzekVar.G();
                        if (G == 172) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.j = z2;
                        byte b2 = 64;
                        if (G != 64) {
                            if (G == 65) {
                                G = 65;
                            }
                        }
                        this.h = 1;
                        zzek zzekVar3 = this.b;
                        zzekVar3.n()[0] = -84;
                        if (G == 65) {
                            b2 = 65;
                        }
                        zzekVar3.n()[1] = b2;
                        this.i = 2;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void c(long j, int i) {
        this.n = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void d() {
        this.h = 0;
        this.i = 0;
        this.j = false;
        this.n = C10323vs.b;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        zzaofVar.c();
        this.f = zzaofVar.b();
        this.g = zzadqVar.O(zzaofVar.a(), 1);
    }
}
