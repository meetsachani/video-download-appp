package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import o.InterfaceC11300zs1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzajo implements zzaju {
    public final zzajt a;
    public final long b;
    public final long c;
    public final zzajz d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public zzajo(zzajz zzajzVar, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzdc.d(z2);
        this.d = zzajzVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.e = 0;
        } else {
            this.f = j4;
            this.e = 4;
        }
        this.a = new zzajt();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    @Override // com.google.android.gms.internal.ads.zzaju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long a(zzado zzadoVar) throws IOException {
        long j;
        long j2;
        long j3;
        long max;
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return -1L;
                    }
                    j3 = -1;
                    j = 2;
                } else {
                    long j4 = this.i;
                    long j5 = this.j;
                    if (j4 == j5) {
                        max = -1;
                        j3 = -1;
                    } else {
                        long e = zzadoVar.e();
                        zzajt zzajtVar = this.a;
                        if (!zzajtVar.c(zzadoVar, j5)) {
                            max = this.i;
                            if (max != e) {
                                j3 = -1;
                            } else {
                                throw new IOException("No ogg page can be found.");
                            }
                        } else {
                            zzajtVar.b(zzadoVar, false);
                            zzadoVar.j();
                            long j6 = this.h;
                            j = 2;
                            long j7 = zzajtVar.b;
                            long j8 = j6 - j7;
                            int i2 = zzajtVar.d + zzajtVar.e;
                            int i3 = (j8 > 0L ? 1 : (j8 == 0L ? 0 : -1));
                            if (i3 >= 0 && j8 < 72000) {
                                max = -1;
                                j3 = -1;
                            } else {
                                if (i3 < 0) {
                                    this.j = e;
                                    this.l = j7;
                                } else {
                                    this.i = zzadoVar.e() + i2;
                                    this.k = j7;
                                }
                                long j9 = this.j;
                                long j10 = this.i;
                                long j11 = j9 - j10;
                                if (j11 < 100000) {
                                    this.j = j10;
                                    j3 = -1;
                                    max = j10;
                                } else {
                                    long j12 = i2;
                                    if (i3 <= 0) {
                                        j2 = 2;
                                    } else {
                                        j2 = 1;
                                    }
                                    j3 = -1;
                                    String str = zzeu.a;
                                    max = Math.max(j10, Math.min((zzadoVar.e() - (j12 * j2)) + ((j8 * j11) / (this.l - this.k)), j9 - 1));
                                }
                            }
                            if (max == j3) {
                                return max;
                            }
                            this.e = 3;
                        }
                    }
                    j = 2;
                    if (max == j3) {
                    }
                }
                while (true) {
                    zzajt zzajtVar2 = this.a;
                    zzajtVar2.c(zzadoVar, j3);
                    zzajtVar2.b(zzadoVar, false);
                    if (zzajtVar2.b > this.h) {
                        zzadoVar.j();
                        this.e = 4;
                        return -(this.k + j);
                    }
                    zzadoVar.G(zzajtVar2.d + zzajtVar2.e);
                    this.i = zzadoVar.e();
                    this.k = zzajtVar2.b;
                    j3 = -1;
                }
            }
        } else {
            long e2 = zzadoVar.e();
            this.g = e2;
            this.e = 1;
            long j13 = this.c - 65307;
            if (j13 > e2) {
                return j13;
            }
        }
        zzajt zzajtVar3 = this.a;
        zzajtVar3.a();
        if (zzajtVar3.c(zzadoVar, -1L)) {
            zzajtVar3.b(zzadoVar, false);
            zzadoVar.G(zzajtVar3.d + zzajtVar3.e);
            long j14 = zzajtVar3.b;
            while ((zzajtVar3.a & 4) != 4 && zzajtVar3.c(zzadoVar, -1L) && zzadoVar.e() < this.c && zzajtVar3.b(zzadoVar, true) && zzadr.e(zzadoVar, zzajtVar3.d + zzajtVar3.e)) {
                j14 = zzajtVar3.b;
            }
            this.f = j14;
            this.e = 4;
            return this.g;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    @InterfaceC11300zs1
    public final /* bridge */ /* synthetic */ zzaem d() {
        if (this.f != 0) {
            return new zzajm(this, null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final void t(long j) {
        String str = zzeu.a;
        this.h = Math.max(0L, Math.min(j, this.f - 1));
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
