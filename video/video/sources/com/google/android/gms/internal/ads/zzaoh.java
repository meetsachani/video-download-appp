package com.google.android.gms.internal.ads;

import o.C10323vs;

/* loaded from: classes2.dex */
public final class zzaoh {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long b(zzek zzekVar, int i, int i2) {
        zzekVar.l(i);
        if (zzekVar.u() >= 5) {
            int A = zzekVar.A();
            if ((8388608 & A) == 0 && ((A >> 8) & 8191) == i2 && (A & 32) != 0 && zzekVar.G() >= 7 && zzekVar.u() >= 7 && (zzekVar.G() & 16) == 16) {
                byte[] bArr = new byte[6];
                zzekVar.h(bArr, 0, 6);
                long j = bArr[3] & 255;
                return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | (j + j) | ((bArr[4] & 255) >> 7);
            }
            return C10323vs.b;
        }
        return C10323vs.b;
    }
}
