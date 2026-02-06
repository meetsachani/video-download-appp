package com.google.android.gms.internal.ads;

import com.facebook.internal.q0;
import java.util.Locale;
import o.C4128Rj1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzacr {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, q0.n1, 400, 400, 2048};
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Removed duplicated region for block: B:146:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0334  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzz a(zzek zzekVar, String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 zzs zzsVar) throws zzaz {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean p;
        int i8;
        int d;
        int d2;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        zzej zzejVar = new zzej();
        zzejVar.j(zzekVar);
        int a2 = zzejVar.a();
        int d3 = zzejVar.d(3);
        if (d3 <= 1) {
            int d4 = zzejVar.d(7);
            if (true != zzejVar.p()) {
                i = 44100;
            } else {
                i = 48000;
            }
            zzejVar.n(4);
            int d5 = zzejVar.d(9);
            if (d4 > 1) {
                if (d3 != 0) {
                    if (zzejVar.p()) {
                        zzejVar.n(16);
                        if (zzejVar.p()) {
                            zzejVar.n(128);
                        }
                    }
                } else {
                    throw zzaz.c("Invalid AC-4 DSI version: 0");
                }
            }
            if (d3 == 1) {
                if (g(zzejVar)) {
                    zzejVar.f();
                } else {
                    throw zzaz.c("Invalid AC-4 DSI bitrate.");
                }
            }
            zzaco zzacoVar = new zzaco(null);
            for (int i15 = 0; i15 < d5; i15++) {
                if (d3 == 0) {
                    p = zzejVar.p();
                    i8 = 8;
                    d = zzejVar.d(5);
                    d2 = zzejVar.d(5);
                    i9 = 0;
                    i10 = 0;
                    z = false;
                } else {
                    int d6 = zzejVar.d(8);
                    i9 = zzejVar.d(8);
                    i8 = 8;
                    if (i9 == 255) {
                        i9 = zzejVar.d(16) + 255;
                    }
                    if (d6 > 2) {
                        zzejVar.n(i9 * 8);
                    } else {
                        int a3 = (a2 - zzejVar.a()) / 8;
                        d = zzejVar.d(5);
                        if (d == 31) {
                            z = true;
                        } else {
                            z = false;
                        }
                        d2 = d6;
                        i10 = a3;
                        p = false;
                    }
                }
                zzacoVar.f = d2;
                if (!p && !z && d == 6) {
                    i11 = a2;
                    i4 = 2;
                } else {
                    zzacoVar.g = zzejVar.d(3);
                    if (zzejVar.p()) {
                        zzejVar.n(5);
                    }
                    zzejVar.n(2);
                    if (d3 == 1) {
                        if (d2 != 1) {
                            if (d2 == 2) {
                                d2 = 2;
                            }
                        }
                        zzejVar.n(2);
                    }
                    zzejVar.n(5);
                    zzejVar.n(10);
                    if (d3 == 1) {
                        if (d2 > 0) {
                            zzacoVar.a = zzejVar.p();
                        }
                        if (zzacoVar.a) {
                            if (d2 != 1) {
                                i12 = 2;
                                if (d2 == 2) {
                                    i14 = 2;
                                } else {
                                    i11 = a2;
                                    i14 = d2;
                                    zzejVar.n(24);
                                    i13 = 1;
                                }
                            } else {
                                i14 = 1;
                            }
                            i11 = a2;
                            int d7 = zzejVar.d(5);
                            if (d7 >= 0 && d7 <= 15) {
                                zzacoVar.b = d7;
                            }
                            if (d7 >= 11 && d7 <= 14) {
                                zzacoVar.d = zzejVar.p();
                                i12 = 2;
                                zzacoVar.e = zzejVar.d(2);
                            } else {
                                i12 = 2;
                            }
                            zzejVar.n(24);
                            i13 = 1;
                        } else {
                            i11 = a2;
                            i12 = 2;
                            i13 = 1;
                            i14 = d2;
                        }
                        if (d2 == i13 || d2 == i12) {
                            if (zzejVar.p() && zzejVar.p()) {
                                zzejVar.n(i12);
                            }
                            if (zzejVar.p()) {
                                zzejVar.m();
                                int i16 = i8;
                                int d8 = zzejVar.d(i16);
                                int i17 = 0;
                                while (i17 < d8) {
                                    zzejVar.n(i16);
                                    i17++;
                                    i16 = 8;
                                }
                            }
                        }
                        d2 = i14;
                    } else {
                        i11 = a2;
                    }
                    if (p || z) {
                        i4 = 2;
                        if (d2 == 0) {
                            d(zzejVar, zzacoVar);
                            d2 = 0;
                            zzejVar.m();
                            if (!zzejVar.p()) {
                                i6 = 7;
                                if (d2 > 0) {
                                    if (zzejVar.p() && !g(zzejVar)) {
                                        throw zzaz.c("Can't parse bitrate DSI.");
                                    }
                                    if (zzejVar.p()) {
                                        zzejVar.f();
                                        zzejVar.o(zzejVar.d(16));
                                        i3 = 5;
                                        int d9 = zzejVar.d(5);
                                        int i18 = 0;
                                        while (true) {
                                            i2 = 3;
                                            if (i18 >= d9) {
                                                break;
                                            }
                                            zzejVar.n(3);
                                            zzejVar.n(8);
                                            i18++;
                                        }
                                        i5 = 8;
                                        zzejVar.f();
                                        if (d3 == 1) {
                                            int a4 = ((i11 - zzejVar.a()) / 8) - i10;
                                            if (i9 >= a4) {
                                                zzejVar.o(i9 - a4);
                                            } else {
                                                throw zzaz.c("pres_bytes is smaller than presentation bytes read.");
                                            }
                                        }
                                        if (zzacoVar.a) {
                                            i7 = -1;
                                            if (zzacoVar.b == -1) {
                                                throw zzaz.c("Can't determine channel mode of presentation " + i15);
                                            }
                                        }
                                        i7 = -1;
                                    }
                                }
                                i3 = 5;
                                i2 = 3;
                                i5 = 8;
                                zzejVar.f();
                                if (d3 == 1) {
                                }
                                if (zzacoVar.a) {
                                }
                                i7 = -1;
                            }
                        } else {
                            e(zzejVar, zzacoVar);
                            zzejVar.m();
                            if (!zzejVar.p()) {
                            }
                        }
                    } else {
                        zzejVar.m();
                        if (d != 0 && d != 1 && d != 2) {
                            if (d != 3 && d != 4) {
                                if (d != 5) {
                                    int d10 = zzejVar.d(7);
                                    for (int i19 = 0; i19 < d10; i19++) {
                                        zzejVar.n(8);
                                    }
                                } else if (d2 == 0) {
                                    d(zzejVar, zzacoVar);
                                    i4 = 2;
                                    d2 = 0;
                                    zzejVar.m();
                                    if (!zzejVar.p()) {
                                    }
                                } else {
                                    int d11 = zzejVar.d(3);
                                    for (int i20 = 0; i20 < d11 + 2; i20++) {
                                        e(zzejVar, zzacoVar);
                                    }
                                }
                                i4 = 2;
                                zzejVar.m();
                                if (!zzejVar.p()) {
                                }
                            } else if (d2 == 0) {
                                for (int i21 = 0; i21 < 3; i21++) {
                                    d(zzejVar, zzacoVar);
                                }
                                i4 = 2;
                                d2 = 0;
                                zzejVar.m();
                                if (!zzejVar.p()) {
                                }
                            } else {
                                for (int i22 = 0; i22 < 3; i22++) {
                                    e(zzejVar, zzacoVar);
                                }
                                i4 = 2;
                                zzejVar.m();
                                if (!zzejVar.p()) {
                                }
                            }
                        } else if (d2 == 0) {
                            i4 = 2;
                            for (int i23 = 0; i23 < 2; i23++) {
                                d(zzejVar, zzacoVar);
                            }
                            d2 = 0;
                            zzejVar.m();
                            if (!zzejVar.p()) {
                            }
                        } else {
                            i4 = 2;
                            for (int i24 = 0; i24 < 2; i24++) {
                                e(zzejVar, zzacoVar);
                            }
                            zzejVar.m();
                            if (!zzejVar.p()) {
                            }
                        }
                    }
                    if (zzacoVar.a) {
                        int i25 = zzacoVar.b;
                        boolean z2 = zzacoVar.d;
                        int i26 = zzacoVar.e;
                        switch (i25) {
                            case 0:
                                i3 = 1;
                                break;
                            case 1:
                                i3 = i4;
                                break;
                            case 2:
                                i3 = i2;
                                break;
                            case 3:
                                break;
                            case 4:
                                i3 = 6;
                                break;
                            case 5:
                            case 7:
                            case 9:
                                i3 = i6;
                                break;
                            case 6:
                            case 8:
                            case 10:
                                i3 = i5;
                                break;
                            case 11:
                                i3 = 11;
                                break;
                            case 12:
                                i3 = 12;
                                break;
                            case 13:
                                i3 = 13;
                                break;
                            case 14:
                                i3 = 14;
                                break;
                            case 15:
                                i3 = 24;
                                break;
                            default:
                                i3 = i7;
                                break;
                        }
                        if (i25 == 11 || i25 == 12 || i25 == 13 || i25 == 14) {
                            if (!z2) {
                                i3 -= 2;
                            }
                            if (i26 == 0) {
                                i3 -= 4;
                            } else if (i26 == 1) {
                                i3 -= 2;
                            }
                        }
                    } else {
                        i3 = zzacoVar.c + 1;
                        if (zzacoVar.g == 4 && i3 == 17) {
                            i3 = 21;
                        }
                    }
                    if (i3 > 0) {
                        Object[] objArr = {Integer.valueOf(d4), Integer.valueOf(zzacoVar.f), Integer.valueOf(zzacoVar.g)};
                        String str3 = zzeu.a;
                        String format = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                        zzx zzxVar = new zzx();
                        zzxVar.o(str);
                        zzxVar.E(C4128Rj1.T);
                        zzxVar.b(i3);
                        zzxVar.F(i);
                        zzxVar.h(zzsVar);
                        zzxVar.s(str2);
                        zzxVar.c(format);
                        return zzxVar.K();
                    }
                    throw zzaz.c("Can't determine channel count of presentation.");
                }
                i6 = 7;
                int d12 = zzejVar.d(7);
                for (int i27 = 0; i27 < d12; i27++) {
                    zzejVar.n(15);
                }
                if (d2 > 0) {
                }
                i3 = 5;
                i2 = 3;
                i5 = 8;
                zzejVar.f();
                if (d3 == 1) {
                }
                if (zzacoVar.a) {
                }
                i7 = -1;
                if (zzacoVar.a) {
                }
                if (i3 > 0) {
                }
            }
            i2 = 3;
            i3 = 5;
            i4 = 2;
            i5 = 8;
            i6 = 7;
            i7 = -1;
            if (zzacoVar.a) {
            }
            if (i3 > 0) {
            }
        } else {
            throw zzaz.c("Unsupported AC-4 DSI version: " + d3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
        if (r11 != 11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0098, code lost:
        if (r11 != 11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
        if (r11 != 8) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzacp b(zzej zzejVar) {
        int i;
        int i2;
        int d;
        int d2 = zzejVar.d(16);
        int d3 = zzejVar.d(16);
        if (d3 == 65535) {
            d3 = zzejVar.d(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = d3 + i;
        if (d2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int d4 = zzejVar.d(2);
        int i5 = 0;
        if (d4 == 3) {
            int i6 = 0;
            while (true) {
                d = i6 + zzejVar.d(2);
                if (!zzejVar.p()) {
                    break;
                }
                i6 = (d + 1) << 2;
            }
            d4 = d + 3;
        }
        int i7 = d4;
        int d5 = zzejVar.d(10);
        if (zzejVar.p() && zzejVar.d(3) > 0) {
            zzejVar.n(2);
        }
        int i8 = 48000;
        if (true != zzejVar.p()) {
            i2 = 48000;
            i8 = 44100;
        } else {
            i2 = 48000;
        }
        int d6 = zzejVar.d(4);
        if (i8 == 44100 && d6 == 13) {
            i5 = a[13];
        } else if (i8 == i2 && d6 < 14) {
            i5 = a[d6];
            int i9 = d5 % 5;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4) {
                            if (d6 != 3) {
                                if (d6 != 8) {
                                }
                            }
                            i5++;
                        }
                    }
                } else {
                    if (d6 != 8) {
                    }
                    i5++;
                }
            }
            if (d6 != 3) {
            }
            i5++;
        }
        return new zzacp(i7, 2, i8, i4, i5, null);
    }

    public static void c(int i, zzek zzekVar) {
        zzekVar.i(7);
        byte[] n = zzekVar.n();
        n[0] = -84;
        n[1] = 64;
        n[2] = -1;
        n[3] = -1;
        n[4] = (byte) ((i >> 16) & 255);
        n[5] = (byte) ((i >> 8) & 255);
        n[6] = (byte) (i & 255);
    }

    public static void d(zzej zzejVar, zzaco zzacoVar) throws zzaz {
        int d = zzejVar.d(5);
        zzejVar.n(2);
        if (zzejVar.p()) {
            zzejVar.n(5);
        }
        if (d >= 7 && d <= 10) {
            zzejVar.m();
        }
        if (zzejVar.p()) {
            int d2 = zzejVar.d(3);
            if (zzacoVar.b == -1 && d >= 0 && d <= 15 && (d2 == 0 || d2 == 1)) {
                zzacoVar.b = d;
            }
            if (zzejVar.p()) {
                f(zzejVar);
            }
        }
    }

    public static void e(zzej zzejVar, zzaco zzacoVar) throws zzaz {
        zzejVar.n(2);
        boolean p = zzejVar.p();
        int d = zzejVar.d(8);
        for (int i = 0; i < d; i++) {
            zzejVar.n(2);
            if (zzejVar.p()) {
                zzejVar.n(5);
            }
            if (p) {
                zzejVar.n(24);
            } else {
                if (zzejVar.p()) {
                    if (!zzejVar.p()) {
                        zzejVar.n(4);
                    }
                    zzacoVar.c = zzejVar.d(6) + 1;
                }
                zzejVar.n(4);
            }
        }
        if (zzejVar.p()) {
            zzejVar.n(3);
            if (zzejVar.p()) {
                f(zzejVar);
            }
        }
    }

    public static void f(zzej zzejVar) throws zzaz {
        int d = zzejVar.d(6);
        if (d >= 2 && d <= 42) {
            zzejVar.n(d * 8);
            return;
        }
        throw zzaz.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(d)));
    }

    public static boolean g(zzej zzejVar) {
        if (zzejVar.a() < 66) {
            return false;
        }
        zzejVar.n(66);
        return true;
    }
}
