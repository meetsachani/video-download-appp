package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import o.C4128Rj1;
import o.C9337ro1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfs {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static int a(byte[] bArr, int i, int i2, boolean[] zArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i2 - i;
        boolean z4 = false;
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.f(z);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            i(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            i(zArr);
            return i - 2;
        } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            i(zArr);
            return i - 1;
        } else {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b2 = bArr[i5];
                if ((b2 & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                        i(zArr);
                        return i6;
                    }
                    i5 = i6;
                }
                i5 += 3;
            }
            if (i3 <= 2 ? !(i3 != 2 ? !zArr[1] || bArr[i4] != 1 : !zArr[2] || bArr[i2 - 2] != 0 || bArr[i4] != 1) : !(bArr[i2 - 3] != 0 || bArr[i2 - 2] != 0 || bArr[i4] != 1)) {
                z2 = true;
            } else {
                z2 = false;
            }
            zArr[0] = z2;
            if (i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : !(bArr[i2 - 2] != 0 || bArr[i4] != 0)) {
                z3 = true;
            } else {
                z3 = false;
            }
            zArr[1] = z3;
            if (bArr[i4] == 0) {
                z4 = true;
            }
            zArr[2] = z4;
            return i2;
        }
    }

    public static int b(zzz zzzVar) {
        String str = zzzVar.f301o;
        if (Objects.equals(str, "video/avc")) {
            return 1;
        }
        if (!Objects.equals(str, C4128Rj1.k) && !zzay.g(zzzVar.k, C4128Rj1.k)) {
            return 0;
        }
        return 2;
    }

    public static int c(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    try {
                        if (i3 < i - 2) {
                            int i5 = i3 + 1;
                            if (bArr[i3] == 0 && bArr[i5] == 0 && bArr[i3 + 2] == 3) {
                                break;
                            }
                            i3 = i5;
                        } else {
                            i3 = i;
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = d;
                    int length = iArr.length;
                    if (length <= i4) {
                        d = Arrays.copyOf(iArr, length + length);
                    }
                    d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = d[i8] - i6;
                System.arraycopy(bArr, i6, bArr, i7, i9);
                int i10 = i7 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i7 = i10 + 2;
                bArr[i11] = 0;
                i6 += i9 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i7, i2 - i7);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfm d(byte[] bArr, int i, int i2, @InterfaceC11300zs1 zzfp zzfpVar) {
        boolean z;
        int i3;
        int c2;
        int i4;
        int c3;
        int i5;
        int c4;
        int c5;
        int i6;
        int i7;
        int i8;
        int c6;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        zzfo zzfoVar;
        int i16;
        int i17;
        zzfg zzfgVar;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        zzfk zzfkVar;
        zzfg m = m(new zzft(bArr, i, i2));
        zzft zzftVar = new zzft(bArr, i + 2, i2);
        zzftVar.f(4);
        int a2 = zzftVar.a(3);
        int i26 = m.b;
        if (i26 != 0 && a2 == 7) {
            a2 = 7;
            z = true;
        } else {
            z = false;
        }
        if (zzfpVar != null) {
            zzfyc zzfycVar = zzfpVar.a;
            if (!zzfycVar.isEmpty()) {
                i3 = ((zzff) zzfycVar.get(Math.min(i26, zzfycVar.size() - 1))).a;
                zzfh zzfhVar = null;
                if (z) {
                    zzftVar.e();
                    zzfhVar = n(zzftVar, true, a2, null);
                } else if (zzfpVar != null) {
                    zzfi zzfiVar = zzfpVar.b;
                    int i27 = zzfiVar.b[i3];
                    zzfyc zzfycVar2 = zzfiVar.a;
                    if (zzfycVar2.size() > i27) {
                        zzfhVar = (zzfh) zzfycVar2.get(i27);
                    }
                }
                int c7 = zzftVar.c();
                if (!z) {
                    if (zzftVar.h()) {
                        i25 = zzftVar.a(8);
                    } else {
                        i25 = -1;
                    }
                    if (zzfpVar != null && (zzfkVar = zzfpVar.c) != null) {
                        if (i25 == -1) {
                            i25 = zzfkVar.b[i3];
                        }
                        if (i25 != -1) {
                            zzfyc zzfycVar3 = zzfkVar.a;
                            if (zzfycVar3.size() > i25) {
                                zzfj zzfjVar = (zzfj) zzfycVar3.get(i25);
                                c2 = zzfjVar.a;
                                i5 = zzfjVar.d;
                                c3 = zzfjVar.e;
                                c4 = zzfjVar.b;
                                c5 = zzfjVar.c;
                            }
                        }
                    }
                    c4 = 0;
                    i7 = 0;
                    i6 = 0;
                    c3 = 0;
                    i5 = 0;
                    int c8 = zzftVar.c();
                    if (!z) {
                        if (true != zzftVar.h()) {
                            i24 = a2;
                        } else {
                            i24 = 0;
                        }
                        i8 = -1;
                        while (i24 <= a2) {
                            zzftVar.c();
                            i8 = Math.max(zzftVar.c(), i8);
                            zzftVar.c();
                            i24++;
                            c8 = c8;
                        }
                    } else {
                        i8 = -1;
                    }
                    int i28 = c8;
                    zzftVar.c();
                    zzftVar.c();
                    zzftVar.c();
                    zzftVar.c();
                    zzftVar.c();
                    zzftVar.c();
                    if (zzftVar.h()) {
                        int i29 = 6;
                        if (z && zzftVar.h()) {
                            zzftVar.f(6);
                        } else if (zzftVar.h()) {
                            int i30 = 0;
                            int i31 = 4;
                            while (i30 < i31) {
                                int i32 = i31;
                                int i33 = 0;
                                while (i33 < i29) {
                                    if (!zzftVar.h()) {
                                        zzftVar.c();
                                        i22 = a2;
                                    } else {
                                        i22 = a2;
                                        int min = Math.min(64, 1 << ((i30 + i30) + 4));
                                        if (i30 > 1) {
                                            zzftVar.b();
                                        }
                                        for (int i34 = 0; i34 < min; i34++) {
                                            zzftVar.b();
                                        }
                                    }
                                    if (i30 == 3) {
                                        i23 = 3;
                                    } else {
                                        i23 = 1;
                                    }
                                    i33 += i23;
                                    a2 = i22;
                                    i29 = 6;
                                }
                                i30++;
                                i31 = i32;
                                i29 = 6;
                            }
                        }
                    }
                    int i35 = a2;
                    zzftVar.f(2);
                    if (zzftVar.h()) {
                        zzftVar.f(8);
                        zzftVar.c();
                        zzftVar.c();
                        zzftVar.e();
                    }
                    c6 = zzftVar.c();
                    i9 = 0;
                    int[] iArr = new int[0];
                    int[] iArr2 = new int[0];
                    int i36 = c4;
                    int i37 = -1;
                    int i38 = -1;
                    while (i9 < c6) {
                        if (i9 != 0 && zzftVar.h()) {
                            i16 = c6;
                            int i39 = i37 + i38;
                            boolean h = zzftVar.h();
                            boolean z2 = true;
                            int c9 = zzftVar.c() + 1;
                            int i40 = 1 - ((h ? 1 : 0) + (h ? 1 : 0));
                            i17 = i9;
                            int i41 = i39 + 1;
                            zzfgVar = m;
                            boolean[] zArr = new boolean[i41];
                            int i42 = 0;
                            while (i42 <= i39) {
                                if (!zzftVar.h()) {
                                    zArr[i42] = zzftVar.h();
                                } else {
                                    zArr[i42] = z2;
                                }
                                i42++;
                                z2 = true;
                            }
                            int i43 = i38 - 1;
                            int[] iArr3 = new int[i41];
                            int[] iArr4 = new int[i41];
                            int i44 = 0;
                            while (true) {
                                i21 = i40 * c9;
                                if (i43 < 0) {
                                    break;
                                }
                                int i45 = iArr[i43] + i21;
                                if (i45 < 0 && zArr[i37 + i43]) {
                                    iArr3[i44] = i45;
                                    i44++;
                                }
                                i43--;
                            }
                            if (i21 < 0 && zArr[i39]) {
                                iArr3[i44] = i21;
                                i44++;
                            }
                            i18 = i3;
                            int i46 = i44;
                            for (int i47 = 0; i47 < i37; i47++) {
                                int i48 = iArr2[i47] + i21;
                                if (i48 < 0 && zArr[i47]) {
                                    iArr3[i46] = i48;
                                    i46++;
                                }
                            }
                            int[] copyOf = Arrays.copyOf(iArr3, i46);
                            int i49 = 0;
                            for (int i50 = i37 - 1; i50 >= 0; i50--) {
                                int i51 = iArr2[i50] + i21;
                                if (i51 > 0 && zArr[i50]) {
                                    iArr4[i49] = i51;
                                    i49++;
                                }
                            }
                            if (i21 > 0 && zArr[i39]) {
                                iArr4[i49] = i21;
                                i49++;
                            }
                            iArr2 = copyOf;
                            int i52 = i49;
                            for (int i53 = 0; i53 < i38; i53++) {
                                int i54 = iArr[i53] + i21;
                                if (i54 > 0 && zArr[i37 + i53]) {
                                    iArr4[i52] = i54;
                                    i52++;
                                }
                            }
                            iArr = Arrays.copyOf(iArr4, i52);
                            i37 = i46;
                            i38 = i52;
                        } else {
                            i16 = c6;
                            i17 = i9;
                            zzfgVar = m;
                            i18 = i3;
                            int c10 = zzftVar.c();
                            int c11 = zzftVar.c();
                            int[] iArr5 = new int[c10];
                            for (int i55 = 0; i55 < c10; i55++) {
                                if (i55 > 0) {
                                    i20 = iArr5[i55 - 1];
                                } else {
                                    i20 = 0;
                                }
                                iArr5[i55] = i20 - (zzftVar.c() + 1);
                                zzftVar.e();
                            }
                            int[] iArr6 = new int[c11];
                            for (int i56 = 0; i56 < c11; i56++) {
                                if (i56 > 0) {
                                    i19 = iArr6[i56 - 1];
                                } else {
                                    i19 = 0;
                                }
                                iArr6[i56] = i19 + zzftVar.c() + 1;
                                zzftVar.e();
                            }
                            iArr2 = iArr5;
                            iArr = iArr6;
                            i37 = c10;
                            i38 = c11;
                        }
                        i9 = i17 + 1;
                        c6 = i16;
                        i3 = i18;
                        m = zzfgVar;
                    }
                    zzfg zzfgVar2 = m;
                    int i57 = i3;
                    if (zzftVar.h()) {
                        int c12 = zzftVar.c();
                        for (int i58 = 0; i58 < c12; i58++) {
                            zzftVar.f(i28 + 5);
                        }
                    }
                    zzftVar.f(2);
                    float f = 1.0f;
                    if (zzftVar.h()) {
                        if (zzftVar.h()) {
                            int a3 = zzftVar.a(8);
                            if (a3 == 255) {
                                int a4 = zzftVar.a(16);
                                int a5 = zzftVar.a(16);
                                if (a4 != 0 && a5 != 0) {
                                    f = a4 / a5;
                                }
                            } else if (a3 < 17) {
                                f = b[a3];
                            } else {
                                zzdx.f(C9337ro1.a, "Unexpected aspect_ratio_idc value: " + a3);
                            }
                        }
                        if (zzftVar.h()) {
                            zzftVar.e();
                        }
                        if (zzftVar.h()) {
                            zzftVar.f(3);
                            if (true != zzftVar.h()) {
                                i15 = 2;
                            } else {
                                i15 = 1;
                            }
                            if (zzftVar.h()) {
                                int a6 = zzftVar.a(8);
                                int a7 = zzftVar.a(8);
                                zzftVar.f(8);
                                i13 = zzk.a(a6);
                                i14 = zzk.b(a7);
                            } else {
                                i13 = -1;
                                i14 = -1;
                            }
                        } else {
                            if (zzfpVar != null && (zzfoVar = zzfpVar.d) != null) {
                                int i59 = zzfoVar.b[i57];
                                zzfyc zzfycVar4 = zzfoVar.a;
                                if (zzfycVar4.size() > i59) {
                                    zzfn zzfnVar = (zzfn) zzfycVar4.get(i59);
                                    int i60 = zzfnVar.a;
                                    int i61 = zzfnVar.b;
                                    i14 = zzfnVar.c;
                                    i13 = i60;
                                    i15 = i61;
                                }
                            }
                            i13 = -1;
                            i14 = -1;
                            i15 = -1;
                        }
                        if (zzftVar.h()) {
                            zzftVar.c();
                            zzftVar.c();
                        }
                        zzftVar.e();
                        if (zzftVar.h()) {
                            c3 += c3;
                        }
                        i10 = i13;
                        i12 = i14;
                        i11 = i15;
                    } else {
                        i10 = -1;
                        i11 = -1;
                        i12 = -1;
                    }
                    return new zzfm(zzfgVar2, i35, zzfhVar, i7, i36, i6, c7, i5, c3, f, i8, i10, i11, i12);
                }
                c2 = zzftVar.c();
                if (c2 == 3) {
                    zzftVar.e();
                    i4 = 3;
                } else {
                    i4 = c2;
                }
                int c13 = zzftVar.c();
                c3 = zzftVar.c();
                if (zzftVar.h()) {
                    int c14 = zzftVar.c();
                    int c15 = zzftVar.c();
                    int c16 = zzftVar.c();
                    int c17 = zzftVar.c();
                    int l = l(c13, i4, c14, c15);
                    c3 = k(c3, i4, c16, c17);
                    i5 = l;
                } else {
                    i5 = c13;
                }
                c4 = zzftVar.c();
                c5 = zzftVar.c();
                int i62 = c2;
                i6 = c5;
                i7 = i62;
                int c82 = zzftVar.c();
                if (!z) {
                }
                int i282 = c82;
                zzftVar.c();
                zzftVar.c();
                zzftVar.c();
                zzftVar.c();
                zzftVar.c();
                zzftVar.c();
                if (zzftVar.h()) {
                }
                int i352 = a2;
                zzftVar.f(2);
                if (zzftVar.h()) {
                }
                c6 = zzftVar.c();
                i9 = 0;
                int[] iArr7 = new int[0];
                int[] iArr22 = new int[0];
                int i362 = c4;
                int i372 = -1;
                int i382 = -1;
                while (i9 < c6) {
                }
                zzfg zzfgVar22 = m;
                int i572 = i3;
                if (zzftVar.h()) {
                }
                zzftVar.f(2);
                float f2 = 1.0f;
                if (zzftVar.h()) {
                }
                return new zzfm(zzfgVar22, i352, zzfhVar, i7, i362, i6, c7, i5, c3, f2, i8, i10, i11, i12);
            }
        }
        i3 = 0;
        zzfh zzfhVar2 = null;
        if (z) {
        }
        int c72 = zzftVar.c();
        if (!z) {
        }
        int i622 = c2;
        i6 = c5;
        i7 = i622;
        int c822 = zzftVar.c();
        if (!z) {
        }
        int i2822 = c822;
        zzftVar.c();
        zzftVar.c();
        zzftVar.c();
        zzftVar.c();
        zzftVar.c();
        zzftVar.c();
        if (zzftVar.h()) {
        }
        int i3522 = a2;
        zzftVar.f(2);
        if (zzftVar.h()) {
        }
        c6 = zzftVar.c();
        i9 = 0;
        int[] iArr72 = new int[0];
        int[] iArr222 = new int[0];
        int i3622 = c4;
        int i3722 = -1;
        int i3822 = -1;
        while (i9 < c6) {
        }
        zzfg zzfgVar222 = m;
        int i5722 = i3;
        if (zzftVar.h()) {
        }
        zzftVar.f(2);
        float f22 = 1.0f;
        if (zzftVar.h()) {
        }
        return new zzfm(zzfgVar222, i3522, zzfhVar2, i7, i3622, i6, c72, i5, c3, f22, i8, i10, i11, i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfp e(byte[] bArr, int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int[] iArr;
        zzfo zzfoVar;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        zzfg zzfgVar;
        int i7;
        int i8;
        int i9;
        zzfyc zzfycVar;
        boolean[][] zArr;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean[][] zArr2;
        int[] iArr2;
        boolean[][] zArr3;
        int[] iArr3;
        boolean z7;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean h;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int c2;
        int i24;
        int i25;
        boolean z8;
        boolean z9;
        zzft zzftVar = new zzft(bArr, i, i2);
        zzfg m = m(zzftVar);
        zzftVar.f(4);
        boolean h2 = zzftVar.h();
        boolean h3 = zzftVar.h();
        int a2 = zzftVar.a(6);
        int i26 = a2 + 1;
        int a3 = zzftVar.a(3);
        zzftVar.f(17);
        zzfh n = n(zzftVar, true, a3, null);
        if (true != zzftVar.h()) {
            i3 = a3;
        } else {
            i3 = 0;
        }
        while (i3 <= a3) {
            zzftVar.c();
            zzftVar.c();
            zzftVar.c();
            i3++;
        }
        int a4 = zzftVar.a(6);
        int c3 = zzftVar.c() + 1;
        int i27 = 6;
        zzfi zzfiVar = new zzfi(zzfyc.G(n), new int[1]);
        if (i26 >= 2 && c3 >= 2) {
            z = true;
        } else {
            z = false;
        }
        if (h2 && h3) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i28 = 1;
        int i29 = a4 + 1;
        if (z && z2 && i29 >= i26) {
            Class cls = Integer.TYPE;
            int[][] iArr4 = (int[][]) Array.newInstance(cls, c3, i29);
            int[] iArr5 = new int[c3];
            int[] iArr6 = new int[c3];
            iArr4[0][0] = 0;
            iArr5[0] = 1;
            iArr6[0] = 0;
            for (int i30 = 1; i30 < c3; i30++) {
                int i31 = 0;
                for (int i32 = 0; i32 <= a4; i32++) {
                    if (zzftVar.h()) {
                        iArr4[i30][i31] = i32;
                        iArr6[i30] = i32;
                        i31++;
                    }
                    iArr5[i30] = i31;
                }
            }
            if (zzftVar.h()) {
                zzftVar.f(64);
                if (zzftVar.h()) {
                    zzftVar.c();
                }
                int c4 = zzftVar.c();
                int i33 = 0;
                while (i33 < c4) {
                    zzftVar.c();
                    if (i33 != 0 && !zzftVar.h()) {
                        i19 = c4;
                        z9 = false;
                        z8 = false;
                    } else {
                        boolean h4 = zzftVar.h();
                        boolean h5 = zzftVar.h();
                        if (!h4 && !h5) {
                            i19 = c4;
                            z9 = h4;
                            z8 = h5;
                        } else {
                            h = zzftVar.h();
                            i19 = c4;
                            if (h) {
                                zzftVar.f(19);
                            }
                            zzftVar.f(8);
                            if (h) {
                                zzftVar.f(4);
                            }
                            zzftVar.f(15);
                            i21 = h4;
                            i20 = h5;
                            i22 = 0;
                            while (i22 <= a3) {
                                if (!zzftVar.h() && !zzftVar.h()) {
                                    if (zzftVar.h()) {
                                        i23 = i22;
                                        c2 = 0;
                                        zzfg zzfgVar2 = m;
                                        i24 = i21 + i20;
                                        int[][] iArr7 = iArr4;
                                        i25 = 0;
                                        while (i25 < i24) {
                                            int i34 = i24;
                                            for (int i35 = 0; i35 <= c2; i35++) {
                                                zzftVar.c();
                                                zzftVar.c();
                                                if (h) {
                                                    zzftVar.c();
                                                    zzftVar.c();
                                                }
                                                zzftVar.e();
                                            }
                                            i25++;
                                            i24 = i34;
                                        }
                                        i22 = i23 + 1;
                                        m = zzfgVar2;
                                        iArr4 = iArr7;
                                    }
                                } else {
                                    zzftVar.c();
                                }
                                i23 = i22;
                                c2 = zzftVar.c();
                                zzfg zzfgVar22 = m;
                                i24 = i21 + i20;
                                int[][] iArr72 = iArr4;
                                i25 = 0;
                                while (i25 < i24) {
                                }
                                i22 = i23 + 1;
                                m = zzfgVar22;
                                iArr4 = iArr72;
                            }
                            i33++;
                            c4 = i19;
                        }
                    }
                    h = false;
                    i21 = z9;
                    i20 = z8;
                    i22 = 0;
                    while (i22 <= a3) {
                    }
                    i33++;
                    c4 = i19;
                }
            }
            zzfg zzfgVar3 = m;
            int[][] iArr8 = iArr4;
            if (!zzftVar.h()) {
                return new zzfp(zzfgVar3, null, zzfiVar, null, null);
            }
            zzftVar.d();
            zzfh n2 = n(zzftVar, false, a3, n);
            boolean h6 = zzftVar.h();
            boolean[] zArr4 = new boolean[16];
            int i36 = 0;
            for (int i37 = 0; i37 < 16; i37++) {
                boolean h7 = zzftVar.h();
                zArr4[i37] = h7;
                if (h7) {
                    i36++;
                }
            }
            if (i36 != 0 && zArr4[1]) {
                int i38 = i36 + 1;
                int[] iArr9 = new int[i36];
                for (int i39 = 0; i39 < i36 - (h6 ? 1 : 0); i39++) {
                    iArr9[i39] = zzftVar.a(3);
                }
                int[] iArr10 = new int[i38];
                if (h6) {
                    for (int i40 = 1; i40 < i36; i40++) {
                        for (int i41 = 0; i41 < i40; i41++) {
                            iArr10[i40] = iArr10[i40] + iArr9[i41] + 1;
                        }
                    }
                    iArr10[i36] = 6;
                }
                int[][] iArr11 = (int[][]) Array.newInstance(cls, i26, i36);
                int[] iArr12 = new int[i26];
                iArr12[0] = 0;
                boolean h8 = zzftVar.h();
                int i42 = 1;
                while (i42 < i26) {
                    if (h8) {
                        iArr12[i42] = zzftVar.a(i27);
                    } else {
                        iArr12[i42] = i42;
                    }
                    if (!h6) {
                        int i43 = 0;
                        while (i43 < i36) {
                            iArr11[i42][i43] = zzftVar.a(iArr9[i43] + 1);
                            i43++;
                            i42 = i42;
                        }
                        i17 = i42;
                    } else {
                        i17 = i42;
                        for (int i44 = 0; i44 < i36; i44++) {
                            iArr11[i17][i44] = (iArr12[i17] & ((1 << iArr10[i18]) - 1)) >> iArr10[i44];
                        }
                    }
                    i42 = i17 + 1;
                    i27 = 6;
                }
                int[] iArr13 = new int[i29];
                int i45 = 1;
                int i46 = 0;
                while (i46 < i26) {
                    iArr13[iArr12[i46]] = -1;
                    int[] iArr14 = iArr13;
                    int i47 = 0;
                    int i48 = 0;
                    while (i47 < 16) {
                        if (zArr4[i47]) {
                            i16 = i28;
                            if (i47 == i16) {
                                iArr14[iArr12[i46]] = iArr11[i46][i48];
                                i47 = i16;
                            }
                            i48++;
                        } else {
                            i16 = i28;
                        }
                        i47 += i16;
                        i28 = i16;
                    }
                    if (i46 > 0) {
                        int i49 = 0;
                        while (true) {
                            if (i49 < i46) {
                                if (iArr14[iArr12[i46]] == iArr14[iArr12[i49]]) {
                                    break;
                                }
                                i49++;
                            } else {
                                i45++;
                                break;
                            }
                        }
                    }
                    i46++;
                    iArr13 = iArr14;
                    i28 = 1;
                }
                int[] iArr15 = iArr13;
                int a5 = zzftVar.a(4);
                if (i45 >= 2 && a5 != 0) {
                    int[] iArr16 = new int[i45];
                    for (int i50 = 0; i50 < i45; i50++) {
                        iArr16[i50] = zzftVar.a(a5);
                    }
                    int[] iArr17 = new int[i29];
                    for (int i51 = 0; i51 < i26; i51++) {
                        iArr17[Math.min(iArr12[i51], a4)] = i51;
                    }
                    zzfxz zzfxzVar = new zzfxz();
                    int i52 = 0;
                    while (i52 <= a4) {
                        int[] iArr18 = iArr16;
                        int i53 = i45;
                        int min = Math.min(iArr15[i52], i53 - 1);
                        if (min >= 0) {
                            i15 = iArr18[min];
                        } else {
                            i15 = -1;
                        }
                        int[] iArr19 = iArr17;
                        zzfxzVar.g(new zzff(iArr19[i52], i15));
                        i52++;
                        i45 = i53;
                        iArr16 = iArr18;
                        iArr17 = iArr19;
                    }
                    zzfyc j = zzfxzVar.j();
                    if (((zzff) j.get(0)).b == -1) {
                        return new zzfp(zzfgVar3, null, zzfiVar, null, null);
                    }
                    int i54 = 1;
                    while (true) {
                        zzfg zzfgVar4 = zzfgVar3;
                        if (i54 <= a4) {
                            zzfgVar3 = zzfgVar4;
                            i4 = -1;
                            if (((zzff) j.get(i54)).b != -1) {
                                break;
                            }
                            i54++;
                        } else {
                            zzfgVar3 = zzfgVar4;
                            i4 = -1;
                            i54 = -1;
                            break;
                        }
                    }
                    if (i54 == i4) {
                        return new zzfp(zzfgVar3, null, zzfiVar, null, null);
                    }
                    Class cls2 = Boolean.TYPE;
                    boolean[][] zArr5 = (boolean[][]) Array.newInstance(cls2, i26, i26);
                    boolean[][] zArr6 = (boolean[][]) Array.newInstance(cls2, i26, i26);
                    int i55 = 1;
                    while (i55 < i26) {
                        boolean[][] zArr7 = zArr6;
                        for (int i56 = 0; i56 < i55; i56++) {
                            boolean[] zArr8 = zArr5[i55];
                            boolean[] zArr9 = zArr7[i55];
                            boolean h9 = zzftVar.h();
                            zArr9[i56] = h9;
                            zArr8[i56] = h9;
                        }
                        i55++;
                        zArr6 = zArr7;
                    }
                    boolean[][] zArr10 = zArr6;
                    for (int i57 = 1; i57 < i26; i57++) {
                        int i58 = 0;
                        while (i58 < a2) {
                            int i59 = i58;
                            int i60 = 0;
                            while (true) {
                                if (i60 < i57) {
                                    boolean[] zArr11 = zArr10[i57];
                                    if (zArr11[i60] && zArr10[i60][i59]) {
                                        zArr11[i59] = true;
                                        break;
                                    }
                                    i60++;
                                }
                            }
                            i58 = i59 + 1;
                        }
                    }
                    int[] iArr20 = new int[i29];
                    int i61 = 0;
                    while (i61 < i26) {
                        int[] iArr21 = iArr20;
                        int i62 = 0;
                        for (int i63 = 0; i63 < i61; i63++) {
                            i62 += zArr5[i61][i63] ? 1 : 0;
                        }
                        iArr21[iArr12[i61]] = i62;
                        i61++;
                        iArr20 = iArr21;
                    }
                    int[] iArr22 = iArr20;
                    int i64 = 0;
                    for (int i65 = 0; i65 < i26; i65++) {
                        if (iArr22[iArr12[i65]] == 0) {
                            i64++;
                        }
                    }
                    if (i64 > 1) {
                        return new zzfp(zzfgVar3, null, zzfiVar, null, null);
                    }
                    int[] iArr23 = new int[i26];
                    int[] iArr24 = new int[c3];
                    if (zzftVar.h()) {
                        iArr = iArr24;
                        int i66 = 0;
                        while (i66 < i26) {
                            int i67 = i66;
                            iArr23[i67] = zzftVar.a(3);
                            i66 = i67 + 1;
                        }
                    } else {
                        iArr = iArr24;
                        Arrays.fill(iArr23, 0, i26, a3);
                    }
                    int i68 = 0;
                    while (i68 < c3) {
                        int[] iArr25 = iArr23;
                        int i69 = i68;
                        int[] iArr26 = iArr12;
                        int i70 = 0;
                        for (int i71 = 0; i71 < iArr5[i69]; i71++) {
                            i70 = Math.max(i70, iArr25[((zzff) j.get(iArr8[i69][i71])).a]);
                        }
                        iArr[i69] = i70 + 1;
                        i68 = i69 + 1;
                        iArr23 = iArr25;
                        iArr12 = iArr26;
                    }
                    int[] iArr27 = iArr12;
                    if (zzftVar.h()) {
                        int i72 = 0;
                        while (i72 < a2) {
                            int i73 = i72 + 1;
                            int i74 = i73;
                            while (i74 < i26) {
                                if (zArr5[i74][i72]) {
                                    i14 = i72;
                                    zzftVar.f(3);
                                } else {
                                    i14 = i72;
                                }
                                i74++;
                                i72 = i14;
                            }
                            i72 = i73;
                        }
                    }
                    zzftVar.e();
                    int c5 = zzftVar.c() + 1;
                    zzfxz zzfxzVar2 = new zzfxz();
                    zzfxzVar2.g(n);
                    if (c5 > 1) {
                        zzfxzVar2.g(n2);
                        for (int i75 = 2; i75 < c5; i75++) {
                            n2 = n(zzftVar, zzftVar.h(), a3, n2);
                            zzfxzVar2.g(n2);
                        }
                    }
                    zzfyc j2 = zzfxzVar2.j();
                    int c6 = zzftVar.c() + c3;
                    if (c6 > c3) {
                        return new zzfp(zzfgVar3, null, zzfiVar, null, null);
                    }
                    int a6 = zzftVar.a(2);
                    boolean[][] zArr12 = (boolean[][]) Array.newInstance(cls2, c6, i29);
                    int[] iArr28 = new int[c6];
                    int i76 = 0;
                    int[] iArr29 = new int[c6];
                    int i77 = 0;
                    while (i77 < c3) {
                        iArr28[i77] = i76;
                        int i78 = i77;
                        int i79 = iArr6[i78];
                        iArr29[i78] = i79;
                        if (a6 == 0) {
                            iArr2 = iArr6;
                            zArr3 = zArr12;
                            iArr3 = iArr28;
                            Arrays.fill(zArr12[i78], i76, iArr5[i78], true);
                            iArr3[i78] = iArr5[i78];
                        } else {
                            iArr2 = iArr6;
                            zArr3 = zArr12;
                            iArr3 = iArr28;
                            if (a6 == 1) {
                                for (int i80 = 0; i80 < iArr5[i78]; i80++) {
                                    boolean[] zArr13 = zArr3[i78];
                                    if (iArr8[i78][i80] == i79) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    zArr13[i80] = z7;
                                }
                                iArr3[i78] = 1;
                            } else {
                                i76 = 0;
                                zArr3[0][0] = true;
                                iArr3[0] = 1;
                                i77 = i78 + 1;
                                iArr6 = iArr2;
                                zArr12 = zArr3;
                                iArr28 = iArr3;
                            }
                        }
                        i76 = 0;
                        i77 = i78 + 1;
                        iArr6 = iArr2;
                        zArr12 = zArr3;
                        iArr28 = iArr3;
                    }
                    boolean[][] zArr14 = zArr12;
                    int[] iArr30 = iArr28;
                    int[] iArr31 = new int[i29];
                    int i81 = 2;
                    int[] iArr32 = new int[2];
                    iArr32[1] = i29;
                    iArr32[i76] = c6;
                    boolean[][] zArr15 = (boolean[][]) Array.newInstance(cls2, iArr32);
                    int i82 = 1;
                    int i83 = 0;
                    while (i82 < c6) {
                        if (a6 == i81) {
                            for (int i84 = 0; i84 < iArr5[i82]; i84++) {
                                zArr14[i82][i84] = zzftVar.h();
                                int i85 = iArr30[i82];
                                boolean z10 = zArr14[i82][i84];
                                iArr30[i82] = i85 + (z10 ? 1 : 0);
                                if (z10) {
                                    iArr29[i82] = iArr8[i82][i84];
                                }
                            }
                        }
                        if (i83 == 0) {
                            i11 = 0;
                            if (iArr8[i82][0] == 0 && zArr14[i82][0]) {
                                i83 = 0;
                                for (int i86 = 1; i86 < iArr5[i82]; i86++) {
                                    if (iArr8[i82][i86] == i54 && zArr14[i82][i54]) {
                                        i83 = i82;
                                    }
                                }
                            } else {
                                i83 = 0;
                            }
                        } else {
                            i11 = 0;
                        }
                        int i87 = i11;
                        while (i87 < iArr5[i82]) {
                            if (c5 > 1) {
                                zArr15[i82][i87] = zArr14[i82][i87];
                                zArr2 = zArr5;
                                i12 = c5;
                                int a7 = zzgav.a(c5, RoundingMode.CEILING);
                                if (!zArr15[i82][i87]) {
                                    int i88 = ((zzff) j.get(iArr8[i82][i87])).a;
                                    int i89 = i11;
                                    while (i89 < i87) {
                                        i13 = a6;
                                        if (zArr10[i88][((zzff) j.get(iArr8[i82][i89])).a]) {
                                            zArr15[i82][i87] = true;
                                            break;
                                        }
                                        i89++;
                                        a6 = i13;
                                    }
                                }
                                i13 = a6;
                                if (zArr15[i82][i87]) {
                                    if (i83 > 0 && i82 == i83) {
                                        iArr31[i87] = zzftVar.a(a7);
                                    } else {
                                        zzftVar.f(a7);
                                    }
                                }
                            } else {
                                i12 = c5;
                                i13 = a6;
                                zArr2 = zArr5;
                            }
                            i87++;
                            zArr5 = zArr2;
                            c5 = i12;
                            a6 = i13;
                        }
                        int i90 = c5;
                        int i91 = a6;
                        boolean[][] zArr16 = zArr5;
                        if (iArr30[i82] == 1 && iArr22[iArr29[i82]] > 0) {
                            zzftVar.e();
                        }
                        i82++;
                        zArr5 = zArr16;
                        c5 = i90;
                        a6 = i91;
                        i81 = 2;
                    }
                    boolean[][] zArr17 = zArr5;
                    if (i83 == 0) {
                        return new zzfp(zzfgVar3, null, zzfiVar, null, null);
                    }
                    zzfg zzfgVar5 = zzfgVar3;
                    int c7 = zzftVar.c();
                    int i92 = c7 + 1;
                    zzfxz p = zzfyc.p(i92);
                    int[] iArr33 = new int[i26];
                    int i93 = 0;
                    while (i93 < i92) {
                        int a8 = zzftVar.a(16);
                        zzfyc zzfycVar2 = j;
                        int a9 = zzftVar.a(16);
                        if (zzftVar.h()) {
                            zzfgVar = zzfgVar5;
                            i7 = zzftVar.a(2);
                            if (i7 == 3) {
                                zzftVar.e();
                            }
                            i8 = zzftVar.a(4);
                            i9 = zzftVar.a(4);
                        } else {
                            zzfgVar = zzfgVar5;
                            i7 = 0;
                            i8 = 0;
                            i9 = 0;
                        }
                        if (zzftVar.h()) {
                            int c8 = zzftVar.c();
                            zArr = zArr15;
                            int c9 = zzftVar.c();
                            i10 = i93;
                            int c10 = zzftVar.c();
                            zzfycVar = j2;
                            int c11 = zzftVar.c();
                            a8 = l(a8, i7, c8, c9);
                            a9 = k(a9, i7, c10, c11);
                        } else {
                            zzfycVar = j2;
                            zArr = zArr15;
                            i10 = i93;
                        }
                        p.g(new zzfj(i7, i8, i9, a8, a9));
                        i93 = i10 + 1;
                        j = zzfycVar2;
                        zArr15 = zArr;
                        zzfgVar5 = zzfgVar;
                        j2 = zzfycVar;
                    }
                    zzfyc zzfycVar3 = j;
                    zzfg zzfgVar6 = zzfgVar5;
                    zzfyc zzfycVar4 = j2;
                    boolean[][] zArr18 = zArr15;
                    if (i92 > 1 && zzftVar.h()) {
                        int a10 = zzgav.a(i92, RoundingMode.CEILING);
                        for (int i94 = 1; i94 < i26; i94++) {
                            iArr33[i94] = zzftVar.a(a10);
                        }
                    } else {
                        for (int i95 = 1; i95 < i26; i95++) {
                            iArr33[i95] = Math.min(i95, c7);
                        }
                    }
                    zzfk zzfkVar = new zzfk(p.j(), iArr33);
                    zzftVar.f(2);
                    for (int i96 = 1; i96 < i26; i96++) {
                        if (iArr22[iArr27[i96]] == 0) {
                            zzftVar.e();
                        }
                    }
                    for (int i97 = 1; i97 < c6; i97++) {
                        boolean h10 = zzftVar.h();
                        for (int i98 = 0; i98 < iArr[i97]; i98++) {
                            if (i98 > 0 && h10) {
                                z6 = zzftVar.h();
                            } else if (i98 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (z6) {
                                for (int i99 = 0; i99 < iArr5[i97]; i99++) {
                                    if (zArr18[i97][i99]) {
                                        zzftVar.c();
                                    }
                                }
                                zzftVar.c();
                                zzftVar.c();
                            }
                        }
                    }
                    int c12 = zzftVar.c() + 2;
                    if (zzftVar.h()) {
                        zzftVar.f(c12);
                    } else {
                        for (int i100 = 1; i100 < i26; i100++) {
                            for (int i101 = 0; i101 < i100; i101++) {
                                if (zArr17[i100][i101]) {
                                    zzftVar.f(c12);
                                }
                            }
                        }
                    }
                    int c13 = zzftVar.c();
                    for (int i102 = 1; i102 <= c13; i102++) {
                        zzftVar.f(8);
                    }
                    if (zzftVar.h()) {
                        zzftVar.d();
                        if (zzftVar.h() || zzftVar.h()) {
                            zzftVar.e();
                        }
                        boolean h11 = zzftVar.h();
                        boolean h12 = zzftVar.h();
                        if (h11 || h12) {
                            for (int i103 = 0; i103 < c3; i103++) {
                                for (int i104 = 0; i104 < iArr[i103]; i104++) {
                                    if (h11) {
                                        z3 = zzftVar.h();
                                    } else {
                                        z3 = false;
                                    }
                                    if (h12) {
                                        z4 = zzftVar.h();
                                    } else {
                                        z4 = false;
                                    }
                                    if (z3) {
                                        zzftVar.f(32);
                                    }
                                    if (z4) {
                                        zzftVar.f(18);
                                    }
                                }
                            }
                        }
                        boolean h13 = zzftVar.h();
                        if (h13) {
                            z5 = true;
                            i5 = zzftVar.a(4) + 1;
                        } else {
                            z5 = true;
                            i5 = i26;
                        }
                        zzfxz p2 = zzfyc.p(i5);
                        int[] iArr34 = new int[i26];
                        int i105 = 0;
                        while (i105 < i5) {
                            zzftVar.f(3);
                            if (z5 != zzftVar.h()) {
                                i6 = 2;
                            } else {
                                i6 = 1;
                            }
                            int a11 = zzk.a(zzftVar.a(8));
                            int b2 = zzk.b(zzftVar.a(8));
                            zzftVar.f(8);
                            p2.g(new zzfn(a11, i6, b2));
                            i105++;
                            z5 = true;
                        }
                        if (h13 && i5 > 1) {
                            for (int i106 = 0; i106 < i26; i106++) {
                                iArr34[i106] = zzftVar.a(4);
                            }
                        }
                        zzfoVar = new zzfo(p2.j(), iArr34);
                    } else {
                        zzfoVar = null;
                    }
                    return new zzfp(zzfgVar6, zzfycVar3, new zzfi(zzfycVar4, iArr31), zzfkVar, zzfoVar);
                }
                return new zzfp(zzfgVar3, null, zzfiVar, null, null);
            }
            return new zzfp(zzfgVar3, null, zzfiVar, null, null);
        }
        return new zzfp(m, null, zzfiVar, null, null);
    }

    public static zzfq f(byte[] bArr, int i, int i2) {
        zzft zzftVar = new zzft(bArr, 4, i2);
        int c2 = zzftVar.c();
        int c3 = zzftVar.c();
        zzftVar.e();
        return new zzfq(c2, c3, zzftVar.h());
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfr g(byte[] bArr, int i, int i2) {
        int c2;
        int i3;
        boolean z;
        int i4;
        int c3;
        int i5;
        int i6;
        int i7;
        int c4;
        int i8;
        int i9;
        boolean z2;
        boolean h;
        int i10;
        int i11;
        float f;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        zzft zzftVar = new zzft(bArr, i, i2);
        int a2 = zzftVar.a(8);
        int a3 = zzftVar.a(8);
        int a4 = zzftVar.a(8);
        int c5 = zzftVar.c();
        if (a2 != 100 && a2 != 110 && a2 != 122 && a2 != 244 && a2 != 44 && a2 != 83 && a2 != 86 && a2 != 118 && a2 != 128) {
            if (a2 == 138) {
                a2 = 138;
            } else {
                c2 = 1;
                i4 = 16;
                i5 = 0;
                z = false;
                c3 = 0;
                int c6 = zzftVar.c() + 4;
                c4 = zzftVar.c();
                if (c4 != 0) {
                    i9 = zzftVar.c() + 4;
                    i8 = 244;
                } else if (c4 == 1) {
                    boolean h2 = zzftVar.h();
                    zzftVar.b();
                    zzftVar.b();
                    long c7 = zzftVar.c();
                    for (int i19 = 0; i19 < c7; i19++) {
                        zzftVar.c();
                    }
                    z2 = h2;
                    c4 = 1;
                    i8 = 244;
                    i9 = 0;
                    int c8 = zzftVar.c();
                    zzftVar.e();
                    int c9 = zzftVar.c() + 1;
                    int c10 = zzftVar.c() + 1;
                    h = zzftVar.h();
                    int i20 = 2 - (h ? 1 : 0);
                    if (!h) {
                        zzftVar.e();
                    }
                    zzftVar.e();
                    int i21 = c9 * 16;
                    int i22 = c10 * i20 * 16;
                    if (zzftVar.h()) {
                        int c11 = zzftVar.c();
                        int c12 = zzftVar.c();
                        int c13 = zzftVar.c();
                        int c14 = zzftVar.c();
                        if (c2 == 0) {
                            i17 = 1;
                        } else {
                            if (c2 == 3) {
                                i17 = 1;
                            } else {
                                i17 = 2;
                            }
                            if (c2 == 1) {
                                i18 = 2;
                            } else {
                                i18 = 1;
                            }
                            i20 *= i18;
                        }
                        i21 -= (c11 + c12) * i17;
                        i22 -= (c13 + c14) * i20;
                    }
                    if (a2 != 44 && a2 != 86 && a2 != 100 && a2 != 110 && a2 != 122) {
                        if (a2 == i8) {
                            a2 = i8;
                        }
                        i10 = i4;
                        float f2 = 1.0f;
                        int i23 = -1;
                        if (!zzftVar.h()) {
                            if (zzftVar.h()) {
                                int a5 = zzftVar.a(8);
                                if (a5 == 255) {
                                    int i24 = i4;
                                    int a6 = zzftVar.a(i24);
                                    int a7 = zzftVar.a(i24);
                                    if (a6 != 0 && a7 != 0) {
                                        f2 = a6 / a7;
                                    }
                                } else if (a5 < 17) {
                                    f2 = b[a5];
                                } else {
                                    zzdx.f(C9337ro1.a, "Unexpected aspect_ratio_idc value: " + a5);
                                }
                            }
                            if (zzftVar.h()) {
                                zzftVar.e();
                            }
                            if (zzftVar.h()) {
                                zzftVar.f(3);
                                if (true != zzftVar.h()) {
                                    i16 = 2;
                                } else {
                                    i16 = 1;
                                }
                                if (zzftVar.h()) {
                                    int a8 = zzftVar.a(8);
                                    int a9 = zzftVar.a(8);
                                    zzftVar.f(8);
                                    i14 = zzk.a(a8);
                                    i15 = zzk.b(a9);
                                } else {
                                    i14 = -1;
                                    i15 = -1;
                                }
                                i23 = i16;
                            } else {
                                i14 = -1;
                                i15 = -1;
                            }
                            if (zzftVar.h()) {
                                zzftVar.c();
                                zzftVar.c();
                            }
                            if (zzftVar.h()) {
                                zzftVar.f(65);
                            }
                            boolean h3 = zzftVar.h();
                            if (h3) {
                                o(zzftVar);
                            }
                            boolean h4 = zzftVar.h();
                            if (h4) {
                                o(zzftVar);
                            }
                            if (h3 || h4) {
                                zzftVar.e();
                            }
                            zzftVar.e();
                            if (zzftVar.h()) {
                                zzftVar.e();
                                zzftVar.c();
                                zzftVar.c();
                                zzftVar.c();
                                zzftVar.c();
                                i10 = zzftVar.c();
                                zzftVar.c();
                            }
                            i13 = i15;
                            i11 = i10;
                            f = f2;
                            i12 = i23;
                            i23 = i14;
                        } else {
                            i11 = i10;
                            f = 1.0f;
                            i12 = -1;
                            i13 = -1;
                        }
                        return new zzfr(a2, a3, a4, c5, c8, i21, i22, f, i5, c3, z, h, c6, c4, i9, z2, i23, i12, i13, i11);
                    }
                    if ((a3 & 16) != 0) {
                        i10 = 0;
                        float f22 = 1.0f;
                        int i232 = -1;
                        if (!zzftVar.h()) {
                        }
                        return new zzfr(a2, a3, a4, c5, c8, i21, i22, f, i5, c3, z, h, c6, c4, i9, z2, i232, i12, i13, i11);
                    }
                    i10 = i4;
                    float f222 = 1.0f;
                    int i2322 = -1;
                    if (!zzftVar.h()) {
                    }
                    return new zzfr(a2, a3, a4, c5, c8, i21, i22, f, i5, c3, z, h, c6, c4, i9, z2, i2322, i12, i13, i11);
                } else {
                    i8 = 244;
                    i9 = 0;
                }
                z2 = false;
                int c82 = zzftVar.c();
                zzftVar.e();
                int c92 = zzftVar.c() + 1;
                int c102 = zzftVar.c() + 1;
                h = zzftVar.h();
                int i202 = 2 - (h ? 1 : 0);
                if (!h) {
                }
                zzftVar.e();
                int i212 = c92 * 16;
                int i222 = c102 * i202 * 16;
                if (zzftVar.h()) {
                }
                if (a2 != 44) {
                    if (a2 == i8) {
                    }
                    i10 = i4;
                    float f2222 = 1.0f;
                    int i23222 = -1;
                    if (!zzftVar.h()) {
                    }
                    return new zzfr(a2, a3, a4, c5, c82, i212, i222, f, i5, c3, z, h, c6, c4, i9, z2, i23222, i12, i13, i11);
                }
                if ((a3 & 16) != 0) {
                }
                i10 = i4;
                float f22222 = 1.0f;
                int i232222 = -1;
                if (!zzftVar.h()) {
                }
                return new zzfr(a2, a3, a4, c5, c82, i212, i222, f, i5, c3, z, h, c6, c4, i9, z2, i232222, i12, i13, i11);
            }
        }
        c2 = zzftVar.c();
        if (c2 == 3) {
            z = zzftVar.h();
            i3 = 3;
        } else {
            i3 = c2;
            z = false;
        }
        i4 = 16;
        int c15 = zzftVar.c();
        c3 = zzftVar.c();
        zzftVar.e();
        if (zzftVar.h()) {
            if (i3 != 3) {
                i6 = 8;
            } else {
                i6 = 12;
            }
            for (int i25 = 0; i25 < i6; i25++) {
                if (zzftVar.h()) {
                    if (i25 < 6) {
                        i7 = 16;
                    } else {
                        i7 = 64;
                    }
                    int i26 = 8;
                    int i27 = 8;
                    for (int i28 = 0; i28 < i7; i28++) {
                        if (i26 != 0) {
                            i26 = ((i27 + zzftVar.b()) + 256) % 256;
                        }
                        if (i26 != 0) {
                            i27 = i26;
                        }
                    }
                }
            }
        }
        i5 = c15;
        int c62 = zzftVar.c() + 4;
        c4 = zzftVar.c();
        if (c4 != 0) {
        }
        z2 = false;
        int c822 = zzftVar.c();
        zzftVar.e();
        int c922 = zzftVar.c() + 1;
        int c1022 = zzftVar.c() + 1;
        h = zzftVar.h();
        int i2022 = 2 - (h ? 1 : 0);
        if (!h) {
        }
        zzftVar.e();
        int i2122 = c922 * 16;
        int i2222 = c1022 * i2022 * 16;
        if (zzftVar.h()) {
        }
        if (a2 != 44) {
        }
        if ((a3 & 16) != 0) {
        }
        i10 = i4;
        float f222222 = 1.0f;
        int i2322222 = -1;
        if (!zzftVar.h()) {
        }
        return new zzfr(a2, a3, a4, c5, c822, i2122, i2222, f, i5, c3, z, h, c62, c4, i9, z2, i2322222, i12, i13, i11);
    }

    @InterfaceC11300zs1
    public static String h(List list) {
        for (int i = 0; i < list.size(); i++) {
            byte[] bArr = (byte[]) list.get(i);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                int i2 = zzfyc.Z;
                zzfxz zzfxzVar = new zzfxz();
                int i3 = 0;
                while (true) {
                    int length2 = bArr.length;
                    if (i3 >= length2) {
                        break;
                    }
                    int a2 = a(bArr, i3, length2, zArr);
                    if (a2 != length2) {
                        zzfxzVar.g(Integer.valueOf(a2));
                    }
                    i3 = a2 + 3;
                }
                zzfyc j = zzfxzVar.j();
                for (int i4 = 0; i4 < j.size(); i4++) {
                    if (((Integer) j.get(i4)).intValue() + 3 < length) {
                        zzft zzftVar = new zzft(bArr, ((Integer) j.get(i4)).intValue() + 3, length);
                        zzfg m = m(zzftVar);
                        if (m.a == 33 && m.b == 0) {
                            zzftVar.f(4);
                            int a3 = zzftVar.a(3);
                            zzftVar.e();
                            zzfh n = n(zzftVar, true, a3, null);
                            return zzdh.d(n.a, n.b, n.c, n.d, n.e, n.f);
                        }
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static void i(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean j(byte[] bArr, int i, int i2, zzz zzzVar) {
        String str = zzzVar.f301o;
        if (Objects.equals(str, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) != 0) {
                return true;
            }
            int i3 = b2 & 31;
            if (i3 == 1 || i3 == 9 || i3 == 14) {
                return false;
            }
            return true;
        }
        if (Objects.equals(str, C4128Rj1.k)) {
            zzfg m = m(new zzft(bArr, 4, i2 + 4));
            int i4 = m.a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && m.c == zzzVar.D - 1) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int k(int i, int i2, int i3, int i4) {
        return i - ((i2 == 1 ? 2 : 1) * (i3 + i4));
    }

    public static int l(int i, int i2, int i3, int i4) {
        int i5 = 2;
        if (i2 != 1 && i2 != 2) {
            i5 = 1;
        }
        return i - (i5 * (i3 + i4));
    }

    public static zzfg m(zzft zzftVar) {
        zzftVar.e();
        return new zzfg(zzftVar.a(6), zzftVar.a(6), zzftVar.a(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzfh n(zzft zzftVar, boolean z, int i, @InterfaceC11300zs1 zzfh zzfhVar) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (z) {
            int a2 = zzftVar.a(2);
            z3 = zzftVar.h();
            i5 = zzftVar.a(5);
            i6 = 0;
            for (int i7 = 0; i7 < 32; i7++) {
                if (zzftVar.h()) {
                    i6 |= 1 << i7;
                }
            }
            for (int i8 = 0; i8 < 6; i8++) {
                iArr2[i8] = zzftVar.a(8);
            }
            i2 = a2;
        } else if (zzfhVar != null) {
            int i9 = zzfhVar.a;
            z3 = zzfhVar.b;
            i5 = zzfhVar.c;
            i6 = zzfhVar.d;
            iArr2 = zzfhVar.e;
            i2 = i9;
        } else {
            iArr = iArr2;
            i2 = 0;
            z2 = false;
            i3 = 0;
            i4 = 0;
            int a3 = zzftVar.a(8);
            int i10 = 0;
            for (int i11 = 0; i11 < i; i11++) {
                if (zzftVar.h()) {
                    i10 += 88;
                }
                if (zzftVar.h()) {
                    i10 += 8;
                }
            }
            zzftVar.f(i10);
            if (i > 0) {
                int i12 = 8 - i;
                zzftVar.f(i12 + i12);
            }
            return new zzfh(i2, z2, i3, i4, iArr, a3);
        }
        iArr = iArr2;
        z2 = z3;
        i3 = i5;
        i4 = i6;
        int a32 = zzftVar.a(8);
        int i102 = 0;
        while (i11 < i) {
        }
        zzftVar.f(i102);
        if (i > 0) {
        }
        return new zzfh(i2, z2, i3, i4, iArr, a32);
    }

    public static void o(zzft zzftVar) {
        int c2 = zzftVar.c() + 1;
        zzftVar.f(8);
        for (int i = 0; i < c2; i++) {
            zzftVar.c();
            zzftVar.c();
            zzftVar.e();
        }
        zzftVar.f(20);
    }
}
