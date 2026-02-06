package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.util.List;
import o.BJ2;
import o.C4128Rj1;
import o.C6566gU0;

/* loaded from: classes2.dex */
public final class zzaom implements zzadn {
    public zzadq a;
    public zzaet b;
    public zzaok e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ zzadn c() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void e(long j, long j2) {
        int i;
        if (j == 0) {
            i = 0;
        } else {
            i = 4;
        }
        this.c = i;
        zzaok zzaokVar = this.e;
        if (zzaokVar != null) {
            zzaokVar.a(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final /* synthetic */ List f() {
        return zzfyc.F();
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final boolean g(zzado zzadoVar) throws IOException {
        return zzaop.c(zzadoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadn
    public final void i(zzadq zzadqVar) {
        this.a = zzadqVar;
        this.b = zzadqVar.O(0, 1);
        zzadqVar.N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
        if (r1 != 65534) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (r2 == 32) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    @Override // com.google.android.gms.internal.ads.zzadn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        boolean z;
        int i;
        zzdc.b(this.b);
        String str = zzeu.a;
        int i2 = this.c;
        int i3 = 4;
        boolean z2 = true;
        if (i2 != 0) {
            long j = -1;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (this.g == -1) {
                            z2 = false;
                        }
                        zzdc.f(z2);
                        zzaok zzaokVar = this.e;
                        zzaokVar.getClass();
                        if (zzaokVar.c(zzadoVar, this.g - zzadoVar.e())) {
                            return -1;
                        }
                        return 0;
                    }
                    Pair a = zzaop.a(zzadoVar);
                    this.f = ((Long) a.first).intValue();
                    long longValue = ((Long) a.second).longValue();
                    long j2 = this.d;
                    if (j2 != -1 && longValue == 4294967295L) {
                        longValue = j2;
                    }
                    long j3 = this.f + longValue;
                    this.g = j3;
                    long f = zzadoVar.f();
                    if (f != -1 && j3 > f) {
                        zzdx.f(BJ2.k, "Data exceeds input length: " + j3 + C6566gU0.h + f);
                        this.g = f;
                        j3 = f;
                    }
                    zzaok zzaokVar2 = this.e;
                    zzaokVar2.getClass();
                    zzaokVar2.b(this.f, j3);
                    this.c = 4;
                    return 0;
                }
                zzaon b = zzaop.b(zzadoVar);
                int i4 = b.a;
                if (i4 == 17) {
                    this.e = new zzaoj(this.a, this.b, b);
                } else if (i4 == 6) {
                    this.e = new zzaol(this.a, this.b, b, C4128Rj1.O, -1);
                } else if (i4 == 7) {
                    this.e = new zzaol(this.a, this.b, b, C4128Rj1.P, -1);
                } else {
                    int i5 = b.e;
                    if (i4 != 1) {
                        if (i4 != 3) {
                        }
                        i = 0;
                        if (i == 0) {
                            this.e = new zzaol(this.a, this.b, b, C4128Rj1.N, i);
                        } else {
                            throw zzaz.c("Unsupported WAV format type: " + i4);
                        }
                    }
                    i3 = zzeu.I(i5);
                    i = i3;
                    if (i == 0) {
                    }
                }
                this.c = 3;
                return 0;
            }
            zzek zzekVar = new zzek(8);
            zzaoo a2 = zzaoo.a(zzadoVar, zzekVar);
            if (a2.a != 1685272116) {
                zzadoVar.j();
            } else {
                zzadoVar.A(8);
                zzekVar.l(0);
                zzadoVar.J(zzekVar.n(), 0, 8);
                j = zzekVar.L();
                zzadoVar.G(((int) a2.b) + 8);
            }
            this.d = j;
            this.c = 2;
            return 0;
        }
        if (zzadoVar.e() == 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        int i6 = this.f;
        if (i6 != -1) {
            zzadoVar.G(i6);
            this.c = 4;
        } else if (zzaop.c(zzadoVar)) {
            zzadoVar.G((int) (zzadoVar.d() - zzadoVar.e()));
            this.c = 1;
        } else {
            throw zzaz.a("Unsupported or unrecognized wav file type.", null);
        }
        return 0;
    }
}
