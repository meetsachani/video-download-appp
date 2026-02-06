package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public class zzacz {
    public final zzact a;
    public final zzacy b;
    @InterfaceC11300zs1
    public zzacv c;
    public final int d;

    public zzacz(zzacw zzacwVar, zzacy zzacyVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = zzacyVar;
        this.d = i;
        this.a = new zzact(zzacwVar, j, 0L, j3, j4, j5, j6);
    }

    public static final int f(zzado zzadoVar, long j, zzaej zzaejVar) {
        if (j == zzadoVar.e()) {
            return 0;
        }
        zzaejVar.a = j;
        return 1;
    }

    public static final boolean g(zzado zzadoVar, long j) throws IOException {
        long e = j - zzadoVar.e();
        if (e >= 0 && e <= 262144) {
            zzadoVar.G((int) e);
            return true;
        }
        return false;
    }

    public final int a(zzado zzadoVar, zzaej zzaejVar) throws IOException {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        while (true) {
            zzacv zzacvVar = this.c;
            zzdc.b(zzacvVar);
            j = zzacvVar.f;
            j2 = zzacvVar.g;
            j3 = zzacvVar.h;
            if (j2 - j <= this.d) {
                c(false, j);
                return f(zzadoVar, j, zzaejVar);
            } else if (!g(zzadoVar, j3)) {
                return f(zzadoVar, j3, zzaejVar);
            } else {
                zzadoVar.j();
                zzacy zzacyVar = this.b;
                j4 = zzacvVar.b;
                zzacx a = zzacyVar.a(zzadoVar, j4);
                i = a.a;
                if (i != -3) {
                    if (i == -2) {
                        j10 = a.b;
                        j11 = a.c;
                        zzacv.h(zzacvVar, j10, j11);
                    } else if (i != -1) {
                        j5 = a.c;
                        g(zzadoVar, j5);
                        j6 = a.c;
                        c(true, j6);
                        j7 = a.c;
                        return f(zzadoVar, j7, zzaejVar);
                    } else {
                        j8 = a.b;
                        j9 = a.c;
                        zzacv.g(zzacvVar, j8, j9);
                    }
                } else {
                    c(false, j3);
                    return f(zzadoVar, j3, zzaejVar);
                }
            }
        }
    }

    public final zzaem b() {
        return this.a;
    }

    public final void c(boolean z, long j) {
        this.c = null;
        this.b.b();
    }

    public final void d(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        zzacv zzacvVar = this.c;
        if (zzacvVar != null) {
            j6 = zzacvVar.a;
            if (j6 == j) {
                return;
            }
        }
        zzact zzactVar = this.a;
        long i = zzactVar.i(j);
        j2 = zzactVar.c;
        j3 = zzactVar.d;
        j4 = zzactVar.e;
        j5 = zzactVar.f;
        this.c = new zzacv(j, i, 0L, j2, j3, j4, j5);
    }

    public final boolean e() {
        return this.c != null;
    }
}
