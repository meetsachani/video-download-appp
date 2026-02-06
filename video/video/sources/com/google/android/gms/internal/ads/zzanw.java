package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C10323vs;
import o.Xu2;

/* loaded from: classes2.dex */
final class zzanw implements zzacy {
    public final zzer a;
    public final zzek b = new zzek();
    public final int c;

    public zzanw(int i, zzer zzerVar, int i2) {
        this.c = i;
        this.a = zzerVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final zzacx a(zzado zzadoVar, long j) throws IOException {
        int a;
        int a2;
        long e = zzadoVar.e();
        int min = (int) Math.min(112800L, zzadoVar.f() - e);
        zzek zzekVar = this.b;
        zzekVar.i(min);
        zzadoVar.J(zzekVar.n(), 0, min);
        int x = zzekVar.x();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzekVar.u() >= 188 && (a2 = (a = zzaoh.a(zzekVar.n(), zzekVar.w(), x)) + Xu2.A) <= x) {
            long b = zzaoh.b(zzekVar, a, this.c);
            if (b != C10323vs.b) {
                long b2 = this.a.b(b);
                if (b2 > j) {
                    if (j3 == C10323vs.b) {
                        return zzacx.d(b2, e);
                    }
                    return zzacx.e(e + j4);
                }
                j4 = a;
                if (100000 + b2 > j) {
                    return zzacx.e(e + j4);
                }
                j3 = b2;
            }
            zzekVar.l(a2);
            j2 = a2;
        }
        if (j3 != C10323vs.b) {
            return zzacx.f(j3, e + j2);
        }
        return zzacx.d;
    }

    @Override // com.google.android.gms.internal.ads.zzacy
    public final void b() {
        byte[] bArr = zzeu.b;
        int length = bArr.length;
        this.b.j(bArr, 0);
    }
}
