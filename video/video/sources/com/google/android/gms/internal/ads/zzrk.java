package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import o.C3062Gl1;
import o.C6418fw1;
import o.C7063iY;
import o.C8431o61;
import o.G;
import o.I3;
import o.M3;
import o.O70;

/* loaded from: classes2.dex */
public final class zzrk implements zzqu {
    public zzrk(zzrj zzrjVar) {
    }

    public static int a(int i, int i2, int i3) {
        return zzgbf.b(((i * i2) * i3) / 1000000);
    }

    public static final int b(int i, int i2, int i3, int i4, int i5, int i6) {
        int c;
        int i7 = 250000;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i2 == 5) {
                    i7 = 500000;
                } else if (i2 == 8) {
                    i7 = 1000000;
                    i2 = 8;
                }
                if (i6 != -1) {
                    c = zzgay.b(i6, 8, RoundingMode.CEILING);
                } else {
                    c = c(i2);
                }
                return zzgbf.b((i7 * c) / 1000000);
            }
            return zzgbf.b((c(i2) * C8431o61.T1) / 1000000);
        }
        int a = a(250000, i5, i4);
        int a2 = a(C7063iY.i, i5, i4);
        String str = zzeu.a;
        return Math.max(a, Math.min(i * 4, a2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int c(int i) {
        int i2;
        boolean z;
        if (i != 20) {
            if (i != 30) {
                switch (i) {
                    case 5:
                        i2 = I3.a;
                        break;
                    case 6:
                        i2 = I3.b;
                        break;
                    case 7:
                        i2 = O70.a;
                        break;
                    case 8:
                        break;
                    case 9:
                        i2 = C3062Gl1.b;
                        break;
                    case 10:
                        i2 = 100000;
                        break;
                    case 11:
                        i2 = 16000;
                        break;
                    case 12:
                        i2 = 7000;
                        break;
                    default:
                        switch (i) {
                            case 14:
                                i2 = I3.c;
                                break;
                            case 15:
                                i2 = 8000;
                                break;
                            case 16:
                                i2 = G.i;
                                break;
                            case 17:
                                i2 = M3.c;
                                break;
                            case 18:
                                break;
                            default:
                                i2 = -2147483647;
                                break;
                        }
                }
            }
            i2 = O70.b;
        } else {
            i2 = C6418fw1.b;
        }
        if (i2 != -2147483647) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        return i2;
    }
}
