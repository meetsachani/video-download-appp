package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzaia {
    public final zzaef a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;
    @InterfaceC11300zs1
    public final long[] f;

    public zzaia(zzaef zzaefVar, long j, long j2, @InterfaceC11300zs1 long[] jArr, int i, int i2) {
        this.a = new zzaef(zzaefVar);
        this.b = j;
        this.c = j2;
        this.f = jArr;
        this.d = i;
        this.e = i2;
    }

    public static zzaia b(zzaef zzaefVar, zzek zzekVar) {
        int i;
        long j;
        long[] jArr;
        int i2;
        int i3;
        int A = zzekVar.A();
        if ((A & 1) != 0) {
            i = zzekVar.J();
        } else {
            i = -1;
        }
        if ((A & 2) != 0) {
            j = zzekVar.O();
        } else {
            j = -1;
        }
        long j2 = j;
        if ((A & 4) == 4) {
            jArr = new long[100];
            for (int i4 = 0; i4 < 100; i4++) {
                jArr[i4] = zzekVar.G();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((A & 8) != 0) {
            zzekVar.m(4);
        }
        if (zzekVar.u() >= 24) {
            zzekVar.m(21);
            int I = zzekVar.I();
            i3 = I & 4095;
            i2 = I >> 12;
        } else {
            i2 = -1;
            i3 = -1;
        }
        return new zzaia(zzaefVar, i, j2, jArr2, i2, i3);
    }

    public final long a() {
        long j = this.b;
        if (j != -1 && j != 0) {
            zzaef zzaefVar = this.a;
            return zzeu.O((j * zzaefVar.g) - 1, zzaefVar.d);
        }
        return C10323vs.b;
    }
}
