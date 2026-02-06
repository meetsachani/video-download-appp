package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import o.C10323vs;
import o.C4128Rj1;
import o.G3;

/* loaded from: classes2.dex */
public final class zzami implements zzadn {
    public final zzamj a = new zzamj(null, 0, C4128Rj1.Q);
    public final zzek b = new zzek((int) G3.j);
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
        zzek zzekVar = new zzek(10);
        int i = 0;
        while (true) {
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
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzaddVar2.F(zzekVar.n(), 0, 6, false);
            zzekVar.l(0);
            if (zzekVar.K() != 2935) {
                zzadoVar.j();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzaddVar2.g(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int b = zzacn.b(zzekVar.n());
                if (b == -1) {
                    return false;
                }
                zzaddVar2.g(b - 6, false);
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
        int D = zzadoVar.D(zzekVar.n(), 0, G3.j);
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
