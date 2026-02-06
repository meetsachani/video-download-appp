package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;
import o.C4128Rj1;

/* loaded from: classes2.dex */
final class zzaol implements zzaok {
    public final zzadq a;
    public final zzaet b;
    public final zzaon c;
    public final zzz d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public zzaol(zzadq zzadqVar, zzaet zzaetVar, zzaon zzaonVar, String str, int i) throws zzaz {
        this.a = zzadqVar;
        this.b = zzaetVar;
        this.c = zzaonVar;
        int i2 = zzaonVar.b * zzaonVar.e;
        int i3 = zzaonVar.d;
        int i4 = i2 / 8;
        if (i3 == i4) {
            int i5 = zzaonVar.c * i4;
            int i6 = i5 * 8;
            int max = Math.max(i4, i5 / 10);
            this.e = max;
            zzx zzxVar = new zzx();
            zzxVar.e(C4128Rj1.i0);
            zzxVar.E(str);
            zzxVar.a(i6);
            zzxVar.y(i6);
            zzxVar.t(max);
            zzxVar.b(zzaonVar.b);
            zzxVar.F(zzaonVar.c);
            zzxVar.x(i);
            this.d = zzxVar.K();
            return;
        }
        throw zzaz.a("Expected block size: " + i4 + "; got: " + i3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final void b(int i, long j) {
        zzaoq zzaoqVar = new zzaoq(this.c, 1, i, j);
        this.a.P(zzaoqVar);
        zzaet zzaetVar = this.b;
        zzaetVar.e(this.d);
        zzaetVar.f(zzaoqVar.a());
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final boolean c(zzado zzadoVar, long j) throws IOException {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i <= 0 || (i2 = this.g) >= (i3 = this.e)) {
                break;
            }
            int b = this.b.b(zzadoVar, (int) Math.min(i3 - i2, j2), true);
            if (b == -1) {
                j2 = 0;
            } else {
                this.g += b;
                j2 -= b;
            }
        }
        zzaon zzaonVar = this.c;
        int i4 = this.g;
        int i5 = zzaonVar.d;
        int i6 = i4 / i5;
        if (i6 > 0) {
            int i7 = i6 * i5;
            int i8 = this.g - i7;
            this.b.c(this.f + zzeu.P(this.h, 1000000L, zzaonVar.c, RoundingMode.DOWN), 1, i7, i8, null);
            this.h += i6;
            this.g = i8;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }
}
