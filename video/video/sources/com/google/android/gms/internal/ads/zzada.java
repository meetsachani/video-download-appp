package com.google.android.gms.internal.ads;

import o.C10323vs;
import o.C3893Oz;

/* loaded from: classes2.dex */
public final class zzada {
    public static void a(long j, zzek zzekVar, zzaet[] zzaetVarArr) {
        int i;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (zzekVar.u() > 1) {
                int c = c(zzekVar);
                int c2 = c(zzekVar);
                int w = zzekVar.w() + c2;
                if (c2 != -1 && c2 <= zzekVar.u()) {
                    if (c == 4 && c2 >= 8) {
                        int G = zzekVar.G();
                        int K = zzekVar.K();
                        if (K == 49) {
                            i = zzekVar.A();
                            K = 49;
                        } else {
                            i = 0;
                        }
                        int G2 = zzekVar.G();
                        if (K == 47) {
                            zzekVar.m(1);
                            K = 47;
                        }
                        if (G != 181 || ((K != 49 && K != 47) || G2 != 3)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (K == 49) {
                            if (i != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            b(j, zzekVar, zzaetVarArr);
                        }
                    }
                } else {
                    zzdx.f(C3893Oz.a, "Skipping remainder of malformed SEI NAL unit.");
                    w = zzekVar.x();
                }
                zzekVar.l(w);
            } else {
                return;
            }
        }
    }

    public static void b(long j, zzek zzekVar, zzaet[] zzaetVarArr) {
        boolean z;
        int G = zzekVar.G();
        if ((G & 64) != 0) {
            int i = G & 31;
            zzekVar.m(1);
            int w = zzekVar.w();
            for (zzaet zzaetVar : zzaetVarArr) {
                int i2 = i * 3;
                zzekVar.l(w);
                zzaetVar.d(zzekVar, i2);
                if (j != C10323vs.b) {
                    z = true;
                } else {
                    z = false;
                }
                zzdc.f(z);
                zzaetVar.c(j, 1, i2, 0, null);
            }
        }
    }

    public static int c(zzek zzekVar) {
        int i = 0;
        while (zzekVar.u() != 0) {
            int G = zzekVar.G();
            i += G;
            if (G != 255) {
                return i;
            }
        }
        return -1;
    }
}
