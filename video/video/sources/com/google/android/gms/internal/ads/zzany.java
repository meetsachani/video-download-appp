package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C10323vs;
import o.Xu2;

/* loaded from: classes2.dex */
final class zzany {
    public boolean c;
    public boolean d;
    public boolean e;
    public final zzer a = new zzer(0);
    public long f = C10323vs.b;
    public long g = C10323vs.b;
    public long h = C10323vs.b;
    public final zzek b = new zzek();

    public zzany(int i) {
    }

    public final int a(zzado zzadoVar, zzaej zzaejVar, int i) throws IOException {
        if (i <= 0) {
            e(zzadoVar);
            return 0;
        }
        boolean z = this.e;
        long j = C10323vs.b;
        if (!z) {
            long f = zzadoVar.f();
            int min = (int) Math.min(112800L, f);
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
            int x = zzekVar.x();
            int i2 = x - 188;
            while (true) {
                if (i2 < w) {
                    break;
                }
                byte[] n = zzekVar.n();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * Xu2.A) + i2;
                    if (i5 < w || i5 >= x || n[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long b = zzaoh.b(zzekVar, i2, i);
                            if (b != C10323vs.b) {
                                j = b;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.g = j;
            this.e = true;
            return 0;
        } else if (this.g == C10323vs.b) {
            e(zzadoVar);
            return 0;
        } else if (!this.d) {
            int min2 = (int) Math.min(112800L, zzadoVar.f());
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
                if (w2 >= x2) {
                    break;
                }
                if (zzekVar2.n()[w2] == 71) {
                    long b2 = zzaoh.b(zzekVar2, w2, i);
                    if (b2 != C10323vs.b) {
                        j = b2;
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
                e(zzadoVar);
                return 0;
            }
            zzer zzerVar = this.a;
            this.h = zzerVar.c(this.g) - zzerVar.b(j3);
            e(zzadoVar);
            return 0;
        }
    }

    public final long b() {
        return this.h;
    }

    public final zzer c() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    public final int e(zzado zzadoVar) {
        byte[] bArr = zzeu.b;
        int length = bArr.length;
        this.b.j(bArr, 0);
        this.c = true;
        zzadoVar.j();
        return 0;
    }
}
