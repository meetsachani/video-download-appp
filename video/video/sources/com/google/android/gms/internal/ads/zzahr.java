package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzahr {
    public final zzek a = new zzek(8);
    public int b;

    public final boolean a(zzado zzadoVar) throws IOException {
        long b;
        int i;
        long f = zzadoVar.f();
        int i2 = (f > (-1L) ? 1 : (f == (-1L) ? 0 : -1));
        long j = 1024;
        if (i2 != 0 && f <= 1024) {
            j = f;
        }
        zzek zzekVar = this.a;
        zzadd zzaddVar = (zzadd) zzadoVar;
        zzaddVar.F(zzekVar.n(), 0, 4, false);
        this.b = 4;
        for (long O = zzekVar.O(); O != 440786851; O = ((O << 8) & (-256)) | (zzekVar.n()[0] & 255)) {
            int i3 = (int) j;
            int i4 = this.b + 1;
            this.b = i4;
            if (i4 == i3) {
                return false;
            }
            zzaddVar.F(zzekVar.n(), 0, 1, false);
        }
        long b2 = b(zzadoVar);
        long j2 = this.b;
        if (b2 != Long.MIN_VALUE) {
            long j3 = j2 + b2;
            if (i2 == 0 || j3 < f) {
                while (true) {
                    int i5 = (this.b > j3 ? 1 : (this.b == j3 ? 0 : -1));
                    if (i5 < 0) {
                        if (b(zzadoVar) == Long.MIN_VALUE || (b(zzadoVar)) < 0) {
                            return false;
                        }
                        if (i != 0) {
                            int i6 = (int) b;
                            zzaddVar.g(i6, false);
                            this.b += i6;
                        }
                    } else if (i5 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final long b(zzado zzadoVar) throws IOException {
        int i;
        zzek zzekVar = this.a;
        zzadd zzaddVar = (zzadd) zzadoVar;
        int i2 = 0;
        zzaddVar.F(zzekVar.n(), 0, 1, false);
        int i3 = zzekVar.n()[0] & 255;
        if (i3 != 0) {
            int i4 = 128;
            int i5 = 0;
            while (true) {
                i = i5 + 1;
                if ((i3 & i4) != 0) {
                    break;
                }
                i4 >>= 1;
                i5 = i;
            }
            int i6 = i3 & (~i4);
            zzaddVar.F(zzekVar.n(), 1, i5, false);
            while (i2 < i5) {
                i2++;
                i6 = (zzekVar.n()[i2] & 255) + (i6 << 8);
            }
            this.b += i;
            return i6;
        }
        return Long.MIN_VALUE;
    }
}
