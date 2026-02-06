package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import o.C10323vs;
import o.C4128Rj1;

/* loaded from: classes2.dex */
public final class zzamk implements zzadn {
    public final zzaml a = new zzaml(null, 0, C4128Rj1.T);
    public final zzek b = new zzek(16384);
    public boolean c;

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        this.c = false;
        this.a.d();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        int i;
        zzek zzekVar = new zzek(10);
        int i2 = 0;
        while (true) {
            zzadd zzaddVar = (zzadd) zzadoVar;
            zzaddVar.F(zzekVar.n(), 0, 10, false);
            zzekVar.l(0);
            if (zzekVar.I() != 4801587) {
                break;
            }
            zzekVar.m(3);
            int F = zzekVar.F();
            i2 += F + 10;
            zzaddVar.g(F, false);
        }
        zzadoVar.j();
        zzadd zzaddVar2 = (zzadd) zzadoVar;
        zzaddVar2.g(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzaddVar2.F(zzekVar.n(), 0, 7, false);
            zzekVar.l(0);
            int K = zzekVar.K();
            if (K != 44096 && K != 44097) {
                zzadoVar.j();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzaddVar2.g(i4, false);
                i3 = 0;
            } else {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] n = zzekVar.n();
                int i6 = zzacr.b;
                if (n.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((n[2] & 255) << 8) | (n[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((n[4] & 255) << 16) | ((n[5] & 255) << 8) | (n[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (K == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzaddVar2.g(i - 7, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.a.e(zzadqVar, new zzaof(Integer.MIN_VALUE, 0, 1));
        zzadqVar.N();
        zzadqVar.P(new zzael(C10323vs.b, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        zzek zzekVar = this.b;
        int D = zzadoVar.D(zzekVar.n(), 0, 16384);
        if (D == -1) {
            return -1;
        }
        zzekVar.l(0);
        zzekVar.k(D);
        if (!this.c) {
            this.a.c(0L, 4);
            this.c = true;
        }
        this.a.b(zzekVar);
        return 0;
    }
}
