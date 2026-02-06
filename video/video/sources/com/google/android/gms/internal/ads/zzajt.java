package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class zzajt {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final zzek g = new zzek(255);

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(zzado zzadoVar, boolean z) throws IOException {
        a();
        zzek zzekVar = this.g;
        zzekVar.i(27);
        if (zzadr.c(zzadoVar, zzekVar.n(), 0, 27, z) && zzekVar.O() == 1332176723) {
            if (zzekVar.G() != 0) {
                if (z) {
                    return false;
                }
                throw zzaz.c("unsupported bit stream revision");
            }
            this.a = zzekVar.G();
            this.b = zzekVar.L();
            zzekVar.M();
            zzekVar.M();
            zzekVar.M();
            int G = zzekVar.G();
            this.c = G;
            this.d = G + 27;
            zzekVar.i(G);
            if (zzadr.c(zzadoVar, zzekVar.n(), 0, this.c, z)) {
                for (int i = 0; i < this.c; i++) {
                    int[] iArr = this.f;
                    int G2 = zzekVar.G();
                    iArr[i] = G2;
                    this.e += G2;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(zzado zzadoVar, long j) throws IOException {
        boolean z;
        int i;
        if (zzadoVar.e() == zzadoVar.d()) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        zzek zzekVar = this.g;
        zzekVar.i(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || zzadoVar.e() + 4 < j) && zzadr.c(zzadoVar, zzekVar.n(), 0, 4, true)) {
                zzekVar.l(0);
                if (zzekVar.O() == 1332176723) {
                    zzadoVar.j();
                    return true;
                }
                zzadoVar.G(1);
            }
        }
        do {
            if (i != 0 && zzadoVar.e() >= j) {
                break;
            }
        } while (zzadoVar.C(1) != -1);
        return false;
    }
}
