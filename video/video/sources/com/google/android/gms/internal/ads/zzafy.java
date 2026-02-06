package com.google.android.gms.internal.ads;

import o.C4128Rj1;

/* loaded from: classes2.dex */
final class zzafy extends zzafx {
    public final zzek b;
    public final zzek c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;

    public zzafy(zzaet zzaetVar) {
        super(zzaetVar);
        this.b = new zzek(zzfs.a);
        this.c = new zzek(4);
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final boolean a(zzek zzekVar) throws zzafw {
        int G = zzekVar.G();
        int i = G >> 4;
        int i2 = G & 15;
        if (i2 == 7) {
            this.g = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new zzafw("Video format not supported: " + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final boolean b(zzek zzekVar, long j) throws zzaz {
        int i;
        int i2;
        int G = zzekVar.G();
        long B = zzekVar.B();
        if (G == 0) {
            if (!this.e) {
                zzek zzekVar2 = new zzek(new byte[zzekVar.u()]);
                zzekVar.h(zzekVar2.n(), 0, zzekVar.u());
                zzacs a = zzacs.a(zzekVar2);
                this.d = a.b;
                zzx zzxVar = new zzx();
                zzxVar.e(C4128Rj1.v);
                zzxVar.E("video/avc");
                zzxVar.c(a.l);
                zzxVar.J(a.c);
                zzxVar.m(a.d);
                zzxVar.z(a.k);
                zzxVar.p(a.a);
                this.a.e(zzxVar.K());
                this.e = true;
                return false;
            }
        } else if (G == 1 && this.e) {
            if (this.g == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (!this.f) {
                if (i != 0) {
                    i2 = 1;
                }
            } else {
                i2 = i;
            }
            zzek zzekVar3 = this.c;
            byte[] n = zzekVar3.n();
            n[0] = 0;
            n[1] = 0;
            n[2] = 0;
            int i3 = 4 - this.d;
            int i4 = 0;
            while (zzekVar.u() > 0) {
                zzekVar.h(zzekVar3.n(), i3, this.d);
                zzekVar3.l(0);
                zzek zzekVar4 = this.b;
                int J = zzekVar3.J();
                zzekVar4.l(0);
                zzaet zzaetVar = this.a;
                zzaetVar.d(zzekVar4, 4);
                zzaetVar.d(zzekVar, J);
                i4 = i4 + 4 + J;
            }
            this.a.c(j + (B * 1000), i2, i4, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}
