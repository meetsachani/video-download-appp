package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C3062Gl1;
import o.CK1;

/* loaded from: classes2.dex */
public final class zzadu {
    public static int a(zzek zzekVar, int i) {
        switch (i) {
            case 1:
                return CK1.x;
            case 2:
            case 3:
            case 4:
            case 5:
                return C3062Gl1.m << (i - 2);
            case 6:
                return zzekVar.G() + 1;
            case 7:
                return zzekVar.K() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long b(zzado zzadoVar, zzady zzadyVar) throws IOException {
        boolean z;
        int i;
        zzadoVar.j();
        zzadoVar.A(1);
        byte[] bArr = new byte[1];
        zzadoVar.J(bArr, 0, 1);
        int i2 = bArr[0] & 1;
        if (1 != i2) {
            z = false;
        } else {
            z = true;
        }
        zzadoVar.A(2);
        if (1 != i2) {
            i = 6;
        } else {
            i = 7;
        }
        zzek zzekVar = new zzek(i);
        zzekVar.k(zzadr.a(zzadoVar, zzekVar.n(), 0, i));
        zzadoVar.j();
        zzadt zzadtVar = new zzadt();
        if (d(zzekVar, zzadyVar, z, zzadtVar)) {
            return zzadtVar.a;
        }
        throw zzaz.a(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        if (r3 != r24.f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
        if ((r23.G() * 1000) == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0099, code lost:
        if (r4 == r5) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(zzek zzekVar, zzady zzadyVar, int i, zzadt zzadtVar) {
        boolean z;
        int a;
        int w = zzekVar.w();
        long O = zzekVar.O();
        long j = O >>> 16;
        if (j != i) {
            return false;
        }
        if ((j & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        long j2 = O >> 12;
        long j3 = O >> 8;
        long j4 = O >> 4;
        long j5 = O >> 1;
        long j6 = O & 1;
        int i2 = (int) (j4 & 15);
        if (i2 > 7 ? !(i2 > 10 || zzadyVar.g != 2) : i2 == zzadyVar.g - 1) {
            int i3 = (int) (j5 & 7);
            if ((i3 == 0 || i3 == zzadyVar.i) && j6 != 1 && d(zzekVar, zzadyVar, z, zzadtVar) && (a = a(zzekVar, (int) (j2 & 15))) != -1 && a <= zzadyVar.b) {
                int i4 = zzadyVar.e;
                int i5 = (int) (j3 & 15);
                if (i5 != 0) {
                    if (i5 > 11) {
                        if (i5 != 12) {
                            if (i5 <= 14) {
                                int K = zzekVar.K();
                                if (i5 == 14) {
                                    K *= 10;
                                }
                            }
                        }
                    }
                }
                if (zzekVar.G() == zzeu.B(zzekVar.n(), w, zzekVar.w() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean d(zzek zzekVar, zzady zzadyVar, boolean z, zzadt zzadtVar) {
        try {
            long R = zzekVar.R();
            if (!z) {
                R *= zzadyVar.b;
            }
            zzadtVar.a = R;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
