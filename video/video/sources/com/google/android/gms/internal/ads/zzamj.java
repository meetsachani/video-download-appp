package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C10323vs;
import o.C4128Rj1;
import o.C8077mf;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzamj implements zzamr {
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

    public zzamj(@InterfaceC11300zs1 String str, int i, String str2) {
        zzej zzejVar = new zzej(new byte[128], 128);
        this.a = zzejVar;
        this.b = new zzek(zzejVar.a);
        this.h = 0;
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
            if (i == 0) {
                while (true) {
                    if (zzekVar.u() <= 0) {
                        break;
                    } else if (!this.j) {
                        if (zzekVar.G() == 11) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.j = z;
                    } else {
                        int G = zzekVar.G();
                        if (G == 119) {
                            this.j = false;
                            this.h = 1;
                            zzek zzekVar2 = this.b;
                            zzekVar2.n()[0] = C8077mf.m;
                            zzekVar2.n()[1] = 119;
                            this.i = 2;
                            break;
                        }
                        if (G == 11) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.j = z2;
                    }
                }
            } else if (i != 1) {
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
                zzek zzekVar3 = this.b;
                byte[] n = zzekVar3.n();
                int min2 = Math.min(zzekVar.u(), 128 - this.i);
                zzekVar.h(n, this.i, min2);
                int i3 = this.i + min2;
                this.i = i3;
                if (i3 == 128) {
                    zzej zzejVar = this.a;
                    zzejVar.l(0);
                    zzacl e = zzacn.e(zzejVar);
                    zzz zzzVar = this.l;
                    if (zzzVar == null || e.c != zzzVar.E || e.b != zzzVar.F || !Objects.equals(e.a, zzzVar.f301o)) {
                        zzx zzxVar = new zzx();
                        zzxVar.o(this.f);
                        zzxVar.e(this.e);
                        String str = e.a;
                        zzxVar.E(str);
                        zzxVar.b(e.c);
                        zzxVar.F(e.b);
                        zzxVar.s(this.c);
                        zzxVar.C(this.d);
                        int i4 = e.f;
                        zzxVar.y(i4);
                        if (C4128Rj1.Q.equals(str)) {
                            zzxVar.a(i4);
                        }
                        zzz K = zzxVar.K();
                        this.l = K;
                        this.g.e(K);
                    }
                    this.m = e.d;
                    this.k = (e.e * 1000000) / this.l.F;
                    zzekVar3.l(0);
                    this.g.d(zzekVar3, 128);
                    this.h = 2;
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
