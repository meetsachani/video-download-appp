package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzant implements zzaog {
    public final zzans a;
    public final zzek b = new zzek(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public zzant(zzans zzansVar) {
        this.a = zzansVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void a(zzer zzerVar, zzadq zzadqVar, zzaof zzaofVar) {
        this.a.a(zzerVar, zzadqVar, zzaofVar);
        this.f = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void b(zzek zzekVar, int i) {
        int i2;
        boolean z;
        int i3 = i & 1;
        if (i3 != 0) {
            i2 = zzekVar.w() + zzekVar.G();
        } else {
            i2 = -1;
        }
        if (this.f) {
            if (i3 != 0) {
                this.f = false;
                zzekVar.l(i2);
                this.d = 0;
            } else {
                return;
            }
        }
        while (zzekVar.u() > 0) {
            int i4 = this.d;
            if (i4 < 3) {
                if (i4 == 0) {
                    int G = zzekVar.G();
                    zzekVar.l(zzekVar.w() - 1);
                    if (G == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(zzekVar.u(), 3 - this.d);
                zzek zzekVar2 = this.b;
                zzekVar.h(zzekVar2.n(), this.d, min);
                int i5 = this.d + min;
                this.d = i5;
                if (i5 == 3) {
                    zzekVar2.l(0);
                    zzekVar2.k(3);
                    zzekVar2.m(1);
                    int G2 = zzekVar2.G();
                    if ((G2 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int G3 = zzekVar2.G();
                    this.e = z;
                    this.c = (((G2 & 15) << 8) | G3) + 3;
                    int v = zzekVar2.v();
                    int i6 = this.c;
                    if (v < i6) {
                        int v2 = zzekVar2.v();
                        zzekVar2.f(Math.min(4098, Math.max(i6, v2 + v2)));
                    }
                }
            } else {
                int min2 = Math.min(zzekVar.u(), this.c - this.d);
                zzek zzekVar3 = this.b;
                zzekVar.h(zzekVar3.n(), this.d, min2);
                int i7 = this.d + min2;
                this.d = i7;
                int i8 = this.c;
                if (i7 != i8) {
                    continue;
                } else {
                    if (this.e) {
                        if (zzeu.A(zzekVar3.n(), 0, i8, -1) == 0) {
                            zzekVar3.k(this.c - 4);
                        } else {
                            this.f = true;
                            return;
                        }
                    } else {
                        zzekVar3.k(i8);
                    }
                    zzekVar3.l(0);
                    this.a.b(zzekVar3);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void c() {
        this.f = true;
    }
}
