package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import o.C10323vs;

/* loaded from: classes2.dex */
public final class zzamm implements zzadn {
    public final zzamn a;
    public final zzek b;
    public final zzek c;
    public final zzej d;
    public zzadq e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;

    public zzamm() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        this.h = false;
        this.a.d();
        this.f = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        zzek zzekVar;
        int i = 0;
        while (true) {
            zzekVar = this.c;
            zzadd zzaddVar = (zzadd) zzadoVar;
            zzaddVar.F(zzekVar.n(), 0, 10, false);
            zzekVar.l(0);
            if (zzekVar.I() != 4801587) {
                break;
            }
            zzekVar.m(3);
            int F = zzekVar.F();
            i += F + 10;
            zzaddVar.g(F, false);
        }
        zzadoVar.j();
        zzadd zzaddVar2 = (zzadd) zzadoVar;
        zzaddVar2.g(i, false);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzaddVar2.F(zzekVar.n(), 0, 2, false);
            zzekVar.l(0);
            if (!zzamn.f(zzekVar.K())) {
                i4++;
                zzadoVar.j();
                zzaddVar2.g(i4, false);
            } else {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzaddVar2.F(zzekVar.n(), 0, 4, false);
                zzej zzejVar = this.d;
                zzejVar.l(14);
                int d = zzejVar.d(13);
                if (d <= 6) {
                    i4++;
                    zzadoVar.j();
                    zzaddVar2.g(i4, false);
                } else {
                    zzaddVar2.g(d - 6, false);
                    i3 += d;
                }
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.e = zzadqVar;
        this.a.e(zzadqVar, new zzaof(Integer.MIN_VALUE, 0, 1));
        zzadqVar.N();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        zzdc.b(this.e);
        zzek zzekVar = this.b;
        int D = zzadoVar.D(zzekVar.n(), 0, 2048);
        if (!this.i) {
            this.e.P(new zzael(C10323vs.b, 0L));
            this.i = true;
        }
        if (D == -1) {
            return -1;
        }
        zzekVar.l(0);
        zzekVar.k(D);
        if (!this.h) {
            this.a.c(this.f, 4);
            this.h = true;
        }
        this.a.b(zzekVar);
        return 0;
    }

    public zzamm(int i) {
        this.a = new zzamn(true, null, 0, "audio/mp4a-latm");
        this.b = new zzek(2048);
        this.g = -1L;
        zzek zzekVar = new zzek(10);
        this.c = zzekVar;
        byte[] n = zzekVar.n();
        this.d = new zzej(n, n.length);
    }
}
