package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C10323vs;

/* loaded from: classes2.dex */
final class zzanp {
    public boolean c;
    public boolean d;
    public boolean e;
    public final zzer a = new zzer(0);
    public long f = C10323vs.b;
    public long g = C10323vs.b;
    public long h = C10323vs.b;
    public final zzek b = new zzek();

    public static long c(zzek zzekVar) {
        int w = zzekVar.w();
        if (zzekVar.u() >= 9) {
            byte[] bArr = new byte[9];
            zzekVar.h(bArr, 0, 9);
            zzekVar.l(w);
            byte b = bArr[0];
            if ((b & 196) == 68) {
                byte b2 = bArr[2];
                if ((b2 & 4) == 4) {
                    byte b3 = bArr[4];
                    if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = b;
                        long j2 = b2;
                        long j3 = (j2 & 3) << 13;
                        return j3 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (((248 & j2) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                    }
                    return C10323vs.b;
                }
                return C10323vs.b;
            }
            return C10323vs.b;
        }
        return C10323vs.b;
    }

    public static final int g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int a(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        boolean z = this.e;
        long j = C10323vs.b;
        if (!z) {
            long f = zzadoVar.f();
            int min = (int) Math.min(20000L, f);
            long j2 = f - min;
            if (zzadoVar.e() != j2) {
                zzaejVar.a = j2;
                return 1;
            }
            zzek zzekVar = this.b;
            zzekVar.i(min);
            zzadoVar.j();
            zzadoVar.J(zzekVar.n(), 0, min);
            int w = zzekVar.w();
            int x = zzekVar.x() - 4;
            while (true) {
                if (x < w) {
                    break;
                }
                if (g(zzekVar.n(), x) == 442) {
                    zzekVar.l(x + 4);
                    long c = c(zzekVar);
                    if (c != C10323vs.b) {
                        j = c;
                        break;
                    }
                }
                x--;
            }
            this.g = j;
            this.e = true;
            return 0;
        } else if (this.g == C10323vs.b) {
            f(zzadoVar);
            return 0;
        } else if (!this.d) {
            int min2 = (int) Math.min(20000L, zzadoVar.f());
            if (zzadoVar.e() != 0) {
                zzaejVar.a = 0L;
                return 1;
            }
            zzek zzekVar2 = this.b;
            zzekVar2.i(min2);
            zzadoVar.j();
            zzadoVar.J(zzekVar2.n(), 0, min2);
            int w2 = zzekVar2.w();
            int x2 = zzekVar2.x();
            while (true) {
                if (w2 >= x2 - 3) {
                    break;
                }
                if (g(zzekVar2.n(), w2) == 442) {
                    zzekVar2.l(w2 + 4);
                    long c2 = c(zzekVar2);
                    if (c2 != C10323vs.b) {
                        j = c2;
                        break;
                    }
                }
                w2++;
            }
            this.f = j;
            this.d = true;
            return 0;
        } else {
            long j3 = this.f;
            if (j3 == C10323vs.b) {
                f(zzadoVar);
                return 0;
            }
            zzer zzerVar = this.a;
            this.h = zzerVar.c(this.g) - zzerVar.b(j3);
            f(zzadoVar);
            return 0;
        }
    }

    public final long b() {
        return this.h;
    }

    public final zzer d() {
        return this.a;
    }

    public final boolean e() {
        return this.c;
    }

    public final int f(zzado zzadoVar) {
        byte[] bArr = zzeu.b;
        int length = bArr.length;
        this.b.j(bArr, 0);
        this.c = true;
        zzadoVar.j();
        return 0;
    }
}
