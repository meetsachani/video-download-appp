package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzafp implements zzacy {
    public final zzady a;
    public final int b;
    public final zzadt c = new zzadt();

    public /* synthetic */ zzafp(zzady zzadyVar, int i, zzafq zzafqVar) {
        this.a = zzadyVar;
        this.b = i;
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final zzacx a(zzado zzadoVar, long j) throws IOException {
        long e = zzadoVar.e();
        long c = c(zzadoVar);
        long d = zzadoVar.d();
        zzadoVar.A(Math.max(6, this.a.c));
        int i = (c > j ? 1 : (c == j ? 0 : -1));
        long c2 = c(zzadoVar);
        long d2 = zzadoVar.d();
        if (i <= 0 && c2 > j) {
            return zzacx.e(d);
        }
        if (c2 <= j) {
            return zzacx.f(c2, d2);
        }
        return zzacx.d(c, e);
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final /* synthetic */ void b() {
    }

    public final long c(zzado zzadoVar) throws IOException {
        while (zzadoVar.d() < zzadoVar.f() - 6) {
            zzady zzadyVar = this.a;
            int i = this.b;
            zzadt zzadtVar = this.c;
            long d = zzadoVar.d();
            byte[] bArr = new byte[2];
            zzadoVar.J(bArr, 0, 2);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                zzadoVar.j();
                zzadoVar.A((int) (d - zzadoVar.e()));
            } else {
                zzek zzekVar = new zzek(16);
                System.arraycopy(bArr, 0, zzekVar.n(), 0, 2);
                zzekVar.k(zzadr.a(zzadoVar, zzekVar.n(), 2, 14));
                zzadoVar.j();
                zzadoVar.A((int) (d - zzadoVar.e()));
                if (zzadu.c(zzekVar, zzadyVar, i, zzadtVar)) {
                    break;
                }
            }
            zzadoVar.A(1);
        }
        if (zzadoVar.d() >= zzadoVar.f() - 6) {
            zzadoVar.A((int) (zzadoVar.f() - zzadoVar.d()));
            return this.a.j;
        }
        return this.c.a;
    }
}
