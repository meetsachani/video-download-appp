package com.google.android.gms.internal.ads;

import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.KE2;

/* loaded from: classes2.dex */
final class zzahz implements zzahy {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public zzahz(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = i;
    }

    @InterfaceC11300zs1
    public static zzahz b(long j, long j2, zzaef zzaefVar, zzek zzekVar) {
        int A;
        int G;
        zzek zzekVar2 = zzekVar;
        zzekVar2.m(6);
        int A2 = zzekVar2.A();
        long j3 = zzaefVar.c;
        long j4 = A2;
        if (zzekVar2.A() > 0) {
            long O = zzeu.O((A * zzaefVar.g) - 1, zzaefVar.d);
            int K = zzekVar2.K();
            int K2 = zzekVar2.K();
            int K3 = zzekVar2.K();
            zzekVar2.m(2);
            long[] jArr = new long[K];
            long[] jArr2 = new long[K];
            int i = 0;
            long j5 = j2 + zzaefVar.c;
            while (i < K) {
                long j6 = j3;
                jArr[i] = (i * O) / K;
                jArr2[i] = j5;
                if (K3 != 1) {
                    if (K3 != 2) {
                        if (K3 != 3) {
                            if (K3 != 4) {
                                return null;
                            }
                            G = zzekVar2.J();
                        } else {
                            G = zzekVar2.I();
                        }
                    } else {
                        G = zzekVar2.K();
                    }
                } else {
                    G = zzekVar2.G();
                }
                j5 += G * K2;
                i++;
                zzekVar2 = zzekVar;
                K = K;
                j3 = j6;
            }
            long j7 = j2 + j3;
            long j8 = j7 + j4;
            if (j != -1 && j != j8) {
                zzdx.f(KE2.h, "VBRI data size mismatch: " + j + C6566gU0.h + j8);
            }
            if (j8 != j5) {
                zzdx.f(KE2.h, "VBRI bytes and ToC mismatch (using max): " + j8 + C6566gU0.h + j5 + "\nSeeking will be inaccurate.");
                j8 = Math.max(j8, j5);
            }
            return new zzahz(jArr, jArr2, O, j7, j8, zzaefVar.f);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final long a() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int c() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long f() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final boolean h() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final zzaek t(long j) {
        long[] jArr = this.a;
        int y = zzeu.y(jArr, j, true, true);
        long j2 = jArr[y];
        long[] jArr2 = this.b;
        zzaen zzaenVar = new zzaen(j2, jArr2[y]);
        if (zzaenVar.a < j && y != jArr.length - 1) {
            int i = y + 1;
            return new zzaek(zzaenVar, new zzaen(jArr[i], jArr2[i]));
        }
        return new zzaek(zzaenVar, zzaenVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long w(long j) {
        return this.a[zzeu.y(this.b, j, true, true)];
    }
}
