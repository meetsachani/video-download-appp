package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaec {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    @InterfaceC11300zs1
    public final String l;
    @InterfaceC11300zs1
    public final zzfp m;

    public zzaec(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 zzfp zzfpVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = i9;
        this.i = i10;
        this.j = f;
        this.k = i11;
        this.l = str;
        this.m = zzfpVar;
    }

    public static zzaec a(zzek zzekVar) throws zzaz {
        return c(zzekVar, false, null);
    }

    public static zzaec b(zzek zzekVar, zzfp zzfpVar) throws zzaz {
        return c(zzekVar, true, zzfpVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzaec c(zzek zzekVar, boolean z, @InterfaceC11300zs1 zzfp zzfpVar) throws zzaz {
        boolean z2;
        boolean z3;
        String str;
        List singletonList;
        int i;
        int i2;
        int i3;
        zzfl zzflVar;
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        int i8;
        int i9 = 4;
        boolean z4 = true;
        if (z) {
            try {
                zzekVar.m(4);
            } catch (ArrayIndexOutOfBoundsException e) {
                e = e;
                z3 = true;
                if (z3 != z) {
                }
                throw zzaz.a("Error parsing".concat(str), e);
            }
        } else {
            try {
                zzekVar.m(21);
            } catch (ArrayIndexOutOfBoundsException e2) {
                e = e2;
                z2 = z4;
                z3 = z2;
                if (z3 != z) {
                    str = "HEVC config";
                } else {
                    str = "L-HEVC config";
                }
                throw zzaz.a("Error parsing".concat(str), e);
            }
        }
        int G = zzekVar.G() & 3;
        int G2 = zzekVar.G();
        int w = zzekVar.w();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < G2; i12++) {
            zzekVar.m(1);
            int K = zzekVar.K();
            for (int i13 = 0; i13 < K; i13++) {
                int K2 = zzekVar.K();
                i11 += K2 + 4;
                zzekVar.m(K2);
            }
        }
        zzekVar.l(w);
        byte[] bArr = new byte[i11];
        zzfp zzfpVar2 = zzfpVar;
        int i14 = 0;
        float f = 1.0f;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        int i21 = -1;
        int i22 = -1;
        int i23 = -1;
        int i24 = -1;
        String str2 = null;
        int i25 = 0;
        while (i25 < G2) {
            int G3 = zzekVar.G() & 63;
            int K3 = zzekVar.K();
            z2 = z4;
            int i26 = i10;
            zzfp zzfpVar3 = zzfpVar2;
            while (i26 < K3) {
                try {
                    int K4 = zzekVar.K();
                    int i27 = i26;
                    System.arraycopy(zzfs.a, i10, bArr, i14, i9);
                    int i28 = i14 + 4;
                    System.arraycopy(zzekVar.n(), zzekVar.w(), bArr, i28, K4);
                    int i29 = 32;
                    if (G3 == 32) {
                        if (i27 == 0) {
                            zzfpVar3 = zzfs.e(bArr, i28, i28 + K4);
                            i2 = i28;
                            i = G;
                            i7 = 0;
                            i6 = 0;
                            i14 = i2 + K4;
                            zzekVar.m(K4);
                            i26 = i7 + 1;
                            i10 = i6;
                            G = i;
                            i9 = 4;
                        }
                    } else {
                        i29 = G3;
                    }
                    i = G;
                    if (i29 == 33) {
                        if (i27 == 0) {
                            zzfm d = zzfs.d(bArr, i28, i28 + K4, zzfpVar3);
                            int i30 = d.a + 1;
                            int i31 = d.e;
                            int i32 = d.f;
                            int i33 = d.c + 8;
                            i2 = i28;
                            int i34 = d.d + 8;
                            int i35 = d.i;
                            int i36 = d.j;
                            int i37 = d.k;
                            float f2 = d.g;
                            int i38 = d.h;
                            zzfh zzfhVar = d.b;
                            if (zzfhVar != null) {
                                i8 = i38;
                                str2 = zzdh.d(zzfhVar.a, zzfhVar.b, zzfhVar.c, zzfhVar.d, zzfhVar.e, zzfhVar.f);
                            } else {
                                i8 = i38;
                            }
                            i22 = i37;
                            f = f2;
                            i24 = i8;
                            i7 = i27;
                            i19 = i34;
                            i20 = i35;
                            i21 = i36;
                            i18 = i33;
                            i16 = i31;
                            i17 = i32;
                            i6 = 0;
                            i15 = i30;
                            i14 = i2 + K4;
                            zzekVar.m(K4);
                            i26 = i7 + 1;
                            i10 = i6;
                            G = i;
                            i9 = 4;
                        } else {
                            i2 = i28;
                            i6 = 0;
                        }
                    } else {
                        i2 = i28;
                        int i39 = 8;
                        if (i29 == 39 && i27 == 0) {
                            int i40 = i14 + 6;
                            int i41 = (i2 + K4) - 1;
                            while (true) {
                                byte b = bArr[i41];
                                if (b == 0) {
                                    if (i41 <= i40) {
                                        break;
                                    }
                                    i41--;
                                } else if (b != 0 && i41 > i40) {
                                    zzft zzftVar = new zzft(bArr, i40, i41 + 1);
                                    while (true) {
                                        if (!zzftVar.g(16)) {
                                            break;
                                        }
                                        int i42 = i39;
                                        int a = zzftVar.a(i42);
                                        int i43 = 0;
                                        while (a == 255) {
                                            i43 += 255;
                                            a = zzftVar.a(i42);
                                        }
                                        int i44 = i43 + a;
                                        int a2 = zzftVar.a(i42);
                                        int i45 = 0;
                                        while (a2 == 255) {
                                            i45 += 255;
                                            a2 = zzftVar.a(8);
                                        }
                                        i39 = 8;
                                        int i46 = i45 + a2;
                                        if (i46 == 0 || !zzftVar.g(i46)) {
                                            break;
                                        } else if (i44 == 176) {
                                            int c = zzftVar.c();
                                            boolean h = zzftVar.h();
                                            if (h) {
                                                i3 = zzftVar.c();
                                            } else {
                                                i3 = 0;
                                            }
                                            int c2 = zzftVar.c();
                                            int i47 = -1;
                                            int i48 = -1;
                                            int i49 = -1;
                                            int i50 = -1;
                                            int i51 = -1;
                                            int i52 = -1;
                                            int i53 = 0;
                                            while (i53 <= c2) {
                                                i47 = zzftVar.c();
                                                i48 = zzftVar.c();
                                                boolean z5 = h;
                                                int a3 = zzftVar.a(6);
                                                if (a3 != 63) {
                                                    if (a3 == 0) {
                                                        i4 = a3;
                                                        max = Math.max(0, c - 30);
                                                    } else {
                                                        i4 = a3;
                                                        max = Math.max(0, (i4 + c) - 31);
                                                    }
                                                    i50 = zzftVar.a(max);
                                                    if (z5) {
                                                        int a4 = zzftVar.a(6);
                                                        if (a4 != 63) {
                                                            if (a4 == 0) {
                                                                i5 = a4;
                                                                max2 = Math.max(0, i3 - 30);
                                                            } else {
                                                                i5 = a4;
                                                                max2 = Math.max(0, (i5 + i3) - 31);
                                                            }
                                                            i52 = zzftVar.a(max2);
                                                            i51 = i5;
                                                        }
                                                    }
                                                    if (zzftVar.h()) {
                                                        zzftVar.f(10);
                                                    }
                                                    i53++;
                                                    h = z5;
                                                    i49 = i4;
                                                }
                                            }
                                            zzflVar = new zzfl(c, i3, c2 + 1, i47, i48, i49, i50, i51, i52);
                                        }
                                    }
                                }
                            }
                            zzflVar = null;
                            if (zzflVar != null && zzfpVar3 != null) {
                                i6 = 0;
                                if (zzflVar.a == ((zzff) zzfpVar3.a.get(0)).b) {
                                    i7 = i27;
                                    i23 = 4;
                                    i14 = i2 + K4;
                                    zzekVar.m(K4);
                                    i26 = i7 + 1;
                                    i10 = i6;
                                    G = i;
                                    i9 = 4;
                                } else {
                                    i23 = 5;
                                }
                            }
                        }
                        i6 = 0;
                    }
                    i7 = i27;
                    i14 = i2 + K4;
                    zzekVar.m(K4);
                    i26 = i7 + 1;
                    i10 = i6;
                    G = i;
                    i9 = 4;
                } catch (ArrayIndexOutOfBoundsException e3) {
                    e = e3;
                    z3 = z2;
                    if (z3 != z) {
                    }
                    throw zzaz.a("Error parsing".concat(str), e);
                }
            }
            i25++;
            zzfpVar2 = zzfpVar3;
            z4 = z2;
            G = G;
            i9 = 4;
        }
        z2 = z4;
        int i54 = G;
        if (i11 == 0) {
            singletonList = Collections.EMPTY_LIST;
        } else {
            singletonList = Collections.singletonList(bArr);
        }
        return new zzaec(singletonList, i54 + 1, i15, i16, i17, i18, i19, i20, i21, i22, i23, f, i24, str2, zzfpVar2);
    }
}
