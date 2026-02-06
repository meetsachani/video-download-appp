package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzand implements zzamr {
    public final zzek a;
    public final zzaef b;
    @InterfaceC11300zs1
    public final String c;
    public final int d;
    public final String e;
    public zzaet f;
    public String g;
    public int h = 0;
    public int i;
    public boolean j;
    public boolean k;
    public long l;
    public int m;
    public long n;

    public zzand(@InterfaceC11300zs1 String str, int i, String str2) {
        zzek zzekVar = new zzek(4);
        this.a = zzekVar;
        zzekVar.n()[0] = -1;
        this.b = new zzaef();
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
        zzdc.b(this.f);
        while (zzekVar.u() > 0) {
            int i = this.h;
            boolean z3 = true;
            if (i != 0) {
                if (i != 1) {
                    int min = Math.min(zzekVar.u(), this.m - this.i);
                    this.f.d(zzekVar, min);
                    int i2 = this.i + min;
                    this.i = i2;
                    if (i2 >= this.m) {
                        if (this.n == C10323vs.b) {
                            z3 = false;
                        }
                        zzdc.f(z3);
                        this.f.c(this.n, 1, this.m, 0, null);
                        this.n += this.l;
                        this.i = 0;
                        this.h = 0;
                    }
                } else {
                    int min2 = Math.min(zzekVar.u(), 4 - this.i);
                    zzek zzekVar2 = this.a;
                    zzekVar.h(zzekVar2.n(), this.i, min2);
                    int i3 = this.i + min2;
                    this.i = i3;
                    if (i3 >= 4) {
                        zzekVar2.l(0);
                        zzaef zzaefVar = this.b;
                        if (!zzaefVar.a(zzekVar2.A())) {
                            this.i = 0;
                            this.h = 1;
                        } else {
                            this.m = zzaefVar.c;
                            if (!this.j) {
                                this.l = (zzaefVar.g * 1000000) / zzaefVar.d;
                                zzx zzxVar = new zzx();
                                zzxVar.o(this.g);
                                zzxVar.e(this.e);
                                zzxVar.E(zzaefVar.b);
                                zzxVar.t(4096);
                                zzxVar.b(zzaefVar.e);
                                zzxVar.F(zzaefVar.d);
                                zzxVar.s(this.c);
                                zzxVar.C(this.d);
                                this.f.e(zzxVar.K());
                                this.j = true;
                            }
                            zzekVar2.l(0);
                            this.f.d(zzekVar2, 4);
                            this.h = 2;
                        }
                    }
                }
            } else {
                byte[] n = zzekVar.n();
                int w = zzekVar.w();
                int x = zzekVar.x();
                while (true) {
                    if (w < x) {
                        int i4 = w + 1;
                        byte b = n[w];
                        if ((b & 255) == 255) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (this.k && (b & 224) == 224) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.k = z;
                        if (z2) {
                            zzekVar.l(i4);
                            this.k = false;
                            this.a.n()[1] = n[w];
                            this.i = 2;
                            this.h = 1;
                            break;
                        }
                        w = i4;
                    } else {
                        zzekVar.l(x);
                        break;
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
        this.k = false;
        this.n = C10323vs.b;
    }

    @Override // com.google.android.gms.internal.ads.zzamr
    public final void e(zzadq zzadqVar, zzaof zzaofVar) {
        zzaofVar.c();
        this.g = zzaofVar.b();
        this.f = zzadqVar.O(zzaofVar.a(), 1);
    }
}
