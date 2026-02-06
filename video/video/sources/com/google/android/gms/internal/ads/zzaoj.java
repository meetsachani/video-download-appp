package com.google.android.gms.internal.ads;

import com.facebook.internal.C2372q;
import java.io.IOException;
import java.math.RoundingMode;
import o.C3503Kz;
import o.C4128Rj1;
import o.C8077mf;

/* loaded from: classes2.dex */
final class zzaoj implements zzaok {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, C3503Kz.g0, C3503Kz.q0, 173, C2372q.m, C3503Kz.b.y, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final zzadq a;
    public final zzaet b;
    public final zzaon c;
    public final int d;
    public final byte[] e;
    public final zzek f;
    public final int g;
    public final zzz h;
    public int i;
    public long j;
    public int k;
    public long l;

    public zzaoj(zzadq zzadqVar, zzaet zzaetVar, zzaon zzaonVar) throws zzaz {
        this.a = zzadqVar;
        this.b = zzaetVar;
        this.c = zzaonVar;
        int max = Math.max(1, zzaonVar.c / 10);
        this.g = max;
        zzek zzekVar = new zzek(zzaonVar.f);
        zzekVar.E();
        int E = zzekVar.E();
        this.d = E;
        int i = zzaonVar.b;
        int i2 = zzaonVar.d;
        int i3 = (((i2 - (i * 4)) * 8) / (zzaonVar.e * i)) + 1;
        if (E == i3) {
            String str = zzeu.a;
            int i4 = ((max + E) - 1) / E;
            this.e = new byte[i2 * i4];
            this.f = new zzek(i4 * (E + E) * i);
            int i5 = ((zzaonVar.c * zzaonVar.d) * 8) / E;
            zzx zzxVar = new zzx();
            zzxVar.E(C4128Rj1.N);
            zzxVar.a(i5);
            zzxVar.y(i5);
            zzxVar.t((max + max) * i);
            zzxVar.b(zzaonVar.b);
            zzxVar.F(zzaonVar.c);
            zzxVar.x(2);
            this.h = zzxVar.K();
            return;
        }
        throw zzaz.a("Expected frames per block: " + i3 + "; got: " + E, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final void a(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaok
    public final void b(int i, long j) {
        zzaoq zzaoqVar = new zzaoq(this.c, this.d, i, j);
        this.a.P(zzaoqVar);
        zzaet zzaetVar = this.b;
        zzaetVar.e(this.h);
        zzaetVar.f(zzaoqVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:4:0x0021). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzaok
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(zzado zzadoVar, long j) throws IOException {
        boolean z;
        int i;
        int d;
        int i2;
        int i3;
        int d2 = d(this.k);
        int i4 = this.g;
        String str = zzeu.a;
        int i5 = this.d;
        zzaon zzaonVar = this.c;
        int i6 = zzaonVar.d;
        int i7 = ((((i4 - d2) + i5) - 1) / i5) * i6;
        if (j != 0) {
            z = false;
            while (!z) {
                if (this.i >= i7) {
                    break;
                }
                int D = zzadoVar.D(this.e, this.i, (int) Math.min(i7 - i3, j));
                if (D != -1) {
                    this.i += D;
                }
            }
            i = this.i / i6;
            if (i > 0) {
                byte[] bArr = this.e;
                zzek zzekVar = this.f;
                for (int i8 = 0; i8 < i; i8++) {
                    int i9 = 0;
                    while (true) {
                        int i10 = zzaonVar.b;
                        if (i9 < i10) {
                            byte[] n2 = zzekVar.n();
                            int i11 = (i6 / i10) - 4;
                            int i12 = (i8 * i6) + (i9 * 4);
                            int i13 = i;
                            byte[] bArr2 = bArr;
                            int min = Math.min(bArr[i12 + 2] & 255, 88);
                            int[] iArr = n;
                            int i14 = iArr[min];
                            int i15 = (i8 * i5 * i10) + i9;
                            int i16 = (short) ((bArr[i12] & 255) | ((bArr[i12 + 1] & 255) << 8));
                            int i17 = i15 + i15;
                            n2[i17] = (byte) (i16 & 255);
                            n2[i17 + 1] = (byte) (i16 >> 8);
                            for (int i18 = 0; i18 < i11 + i11; i18++) {
                                byte b = bArr2[(i10 * 4) + i12 + ((i18 / 8) * i10 * 4) + ((i18 / 2) % 4)];
                                int i19 = min;
                                int i20 = b & 255;
                                if (i18 % 2 == 0) {
                                    i2 = b & C8077mf.q;
                                } else {
                                    i2 = i20 >> 4;
                                }
                                int i21 = i2 & 7;
                                int i22 = (((i21 + i21) + 1) * i14) >> 3;
                                if ((i2 & 8) != 0) {
                                    i22 = -i22;
                                }
                                i16 = Math.max(-32768, Math.min(i16 + i22, 32767));
                                i17 += i10 + i10;
                                n2[i17] = (byte) (i16 & 255);
                                n2[i17 + 1] = (byte) (i16 >> 8);
                                min = Math.max(0, Math.min(i19 + m[i2], 88));
                                i14 = iArr[min];
                            }
                            i9++;
                            i = i13;
                            bArr = bArr2;
                        }
                    }
                }
                int i23 = i;
                int e = e(i5 * i23);
                zzekVar.l(0);
                zzekVar.k(e);
                this.i -= i23 * i6;
                int x = zzekVar.x();
                this.b.d(zzekVar, x);
                int i24 = this.k + x;
                this.k = i24;
                if (d(i24) >= i4) {
                    f(i4);
                }
            }
            if (z && (d = d(this.k)) > 0) {
                f(d);
            }
            return z;
        }
        z = true;
        while (!z) {
        }
        i = this.i / i6;
        if (i > 0) {
        }
        if (z) {
            f(d);
        }
        return z;
    }

    public final int d(int i) {
        int i2 = this.c.b;
        return i / (i2 + i2);
    }

    public final int e(int i) {
        return (i + i) * this.c.b;
    }

    public final void f(int i) {
        RoundingMode roundingMode = RoundingMode.DOWN;
        long j = this.j;
        long j2 = this.l;
        int e = e(i);
        this.b.c(j + zzeu.P(j2, 1000000L, this.c.c, roundingMode), 1, e, this.k - e, null);
        this.l += i;
        this.k -= e;
    }
}
