package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import o.DJ2;
import o.FJ2;

/* loaded from: classes2.dex */
final class zzaop {
    public static Pair a(zzado zzadoVar) throws IOException {
        zzadoVar.j();
        zzaoo d = d(1684108385, zzadoVar, new zzek(8));
        zzadoVar.G(8);
        return Pair.create(Long.valueOf(zzadoVar.e()), Long.valueOf(d.b));
    }

    public static zzaon b(zzado zzadoVar) throws IOException {
        boolean z;
        byte[] bArr;
        zzek zzekVar = new zzek(16);
        long j = d(FJ2.c, zzadoVar, zzekVar).b;
        if (j >= 16) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        zzadoVar.J(zzekVar.n(), 0, 16);
        zzekVar.l(0);
        int E = zzekVar.E();
        int E2 = zzekVar.E();
        int D = zzekVar.D();
        int D2 = zzekVar.D();
        int E3 = zzekVar.E();
        int E4 = zzekVar.E();
        int i = ((int) j) - 16;
        if (i > 0) {
            bArr = new byte[i];
            zzadoVar.J(bArr, 0, i);
        } else {
            bArr = zzeu.b;
        }
        byte[] bArr2 = bArr;
        zzadoVar.G((int) (zzadoVar.d() - zzadoVar.e()));
        return new zzaon(E, E2, D, D2, E3, E4, bArr2);
    }

    public static boolean c(zzado zzadoVar) throws IOException {
        zzek zzekVar = new zzek(8);
        int i = zzaoo.a(zzadoVar, zzekVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        zzadoVar.J(zzekVar.n(), 0, 4);
        zzekVar.l(0);
        int A = zzekVar.A();
        if (A != 1463899717) {
            zzdx.c(DJ2.a, "Unsupported form type: " + A);
            return false;
        }
        return true;
    }

    public static zzaoo d(int i, zzado zzadoVar, zzek zzekVar) throws IOException {
        zzaoo a = zzaoo.a(zzadoVar, zzekVar);
        while (true) {
            int i2 = a.a;
            if (i2 != i) {
                zzdx.f(DJ2.a, "Ignoring unknown WAV chunk: " + i2);
                long j = a.b;
                long j2 = 8 + j;
                if ((1 & j) != 0) {
                    j2 = 9 + j;
                }
                if (j2 <= 2147483647L) {
                    zzadoVar.G((int) j2);
                    a = zzaoo.a(zzadoVar, zzekVar);
                } else {
                    throw zzaz.c("Chunk is too large (~2GB+) to skip; id: " + i2);
                }
            } else {
                return a;
            }
        }
    }
}
