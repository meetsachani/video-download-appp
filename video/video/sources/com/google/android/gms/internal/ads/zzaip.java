package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import o.AbstractC4501Vf;
import o.C10323vs;
import o.C4128Rj1;
import o.C4731Xo;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaip {
    public static final byte[] a;
    public static final /* synthetic */ int b = 0;

    static {
        String str = zzeu.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static int a(int i) {
        return (i >> 24) & 255;
    }

    @InterfaceC11300zs1
    public static zzav b(zzez zzezVar) {
        zzex zzexVar;
        zzfa c = zzezVar.c(AbstractC4501Vf.w0);
        zzfa c2 = zzezVar.c(AbstractC4501Vf.j1);
        zzfa c3 = zzezVar.c(AbstractC4501Vf.k1);
        if (c != null && c2 != null && c3 != null && i(c.b) == 1835299937) {
            zzek zzekVar = c2.b;
            zzekVar.l(12);
            int A = zzekVar.A();
            String[] strArr = new String[A];
            for (int i = 0; i < A; i++) {
                int A2 = zzekVar.A();
                zzekVar.m(4);
                strArr[i] = zzekVar.b(A2 - 8, StandardCharsets.UTF_8);
            }
            zzek zzekVar2 = c3.b;
            zzekVar2.l(8);
            ArrayList arrayList = new ArrayList();
            while (zzekVar2.u() > 8) {
                int w = zzekVar2.w() + zzekVar2.A();
                int A3 = zzekVar2.A() - 1;
                if (A3 >= 0 && A3 < A) {
                    String str = strArr[A3];
                    while (true) {
                        int w2 = zzekVar2.w();
                        if (w2 < w) {
                            int A4 = zzekVar2.A();
                            if (zzekVar2.A() == 1684108385) {
                                int A5 = zzekVar2.A();
                                int A6 = zzekVar2.A();
                                int i2 = A4 - 16;
                                byte[] bArr = new byte[i2];
                                zzekVar2.h(bArr, 0, i2);
                                zzexVar = new zzex(str, bArr, A6, A5);
                                break;
                            }
                            zzekVar2.l(w2 + A4);
                        } else {
                            zzexVar = null;
                            break;
                        }
                    }
                    if (zzexVar != null) {
                        arrayList.add(zzexVar);
                    }
                } else {
                    zzdx.f("BoxParsers", "Skipped metadata with unknown key index: " + A3);
                }
                zzekVar2.l(w);
            }
            if (!arrayList.isEmpty()) {
                return new zzav(arrayList);
            }
        }
        return null;
    }

    public static zzav c(zzfa zzfaVar) {
        int H;
        zzek zzekVar = zzfaVar.b;
        zzekVar.l(8);
        zzav zzavVar = new zzav(C10323vs.b, new zzau[0]);
        while (zzekVar.u() >= 8) {
            int w = zzekVar.w();
            int A = zzekVar.A() + w;
            int A2 = zzekVar.A();
            zzav zzavVar2 = null;
            if (A2 == 1835365473) {
                zzekVar.l(w);
                zzekVar.m(8);
                g(zzekVar);
                while (true) {
                    if (zzekVar.w() >= A) {
                        break;
                    }
                    int w2 = zzekVar.w();
                    int A3 = zzekVar.A() + w2;
                    if (zzekVar.A() == 1768715124) {
                        zzekVar.l(w2);
                        zzekVar.m(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzekVar.w() < A3) {
                            zzau a2 = zzaix.a(zzekVar);
                            if (a2 != null) {
                                arrayList.add(a2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzavVar2 = new zzav(arrayList);
                        }
                    } else {
                        zzekVar.l(A3);
                    }
                }
                zzavVar = zzavVar.d(zzavVar2);
            } else if (A2 == 1936553057) {
                zzekVar.l(w);
                zzekVar.m(12);
                while (true) {
                    if (zzekVar.w() >= A) {
                        break;
                    }
                    int w3 = zzekVar.w();
                    int A4 = zzekVar.A();
                    if (zzekVar.A() == 1935766900) {
                        if (A4 >= 16) {
                            zzekVar.m(4);
                            int i = -1;
                            int i2 = 0;
                            for (int i3 = 0; i3 < 2; i3++) {
                                int G = zzekVar.G();
                                int G2 = zzekVar.G();
                                if (G == 0) {
                                    i = G2;
                                } else if (G == 1) {
                                    i2 = G2;
                                }
                            }
                            if (i == 12) {
                                H = 240;
                            } else if (i == 13) {
                                H = 120;
                            } else {
                                if (i == 21 && zzekVar.u() >= 8 && zzekVar.w() + 8 <= A) {
                                    int A5 = zzekVar.A();
                                    int A6 = zzekVar.A();
                                    if (A5 >= 12 && A6 == 1936877170) {
                                        H = zzekVar.H();
                                    }
                                }
                                H = -2147483647;
                            }
                            if (H != -2147483647) {
                                zzavVar2 = new zzav(C10323vs.b, new zzahh(H, i2));
                            }
                        }
                    } else {
                        zzekVar.l(w3 + A4);
                    }
                }
                zzavVar = zzavVar.d(zzavVar2);
            } else if (A2 == -1451722374) {
                zzavVar = zzavVar.d(l(zzekVar));
            }
            zzekVar.l(A);
        }
        return zzavVar;
    }

    public static zzfe d(zzek zzekVar) {
        long N;
        long N2;
        zzekVar.l(8);
        if (a(zzekVar.A()) == 0) {
            N = zzekVar.O();
            N2 = zzekVar.O();
        } else {
            N = zzekVar.N();
            N2 = zzekVar.N();
        }
        return new zzfe(N, N2, zzekVar.O());
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzajk e(zzajh zzajhVar, zzez zzezVar, zzaeb zzaebVar) throws zzaz {
        zzaii zzaimVar;
        boolean z;
        zzek zzekVar;
        zzek zzekVar2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        zzz zzzVar;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        long j2;
        long j3;
        long[] jArr3;
        long j4;
        long j5;
        boolean z2;
        boolean z3;
        long[] jArr4;
        int[] iArr3;
        int[] iArr4;
        boolean z4;
        int[] iArr5;
        int i7;
        int i8;
        int i9;
        boolean z5;
        int length;
        long j6;
        int[] iArr6;
        int i10;
        int i11;
        int[] iArr7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j7;
        int i18;
        String str;
        int i19;
        int i20;
        boolean z6;
        int i21;
        zzajh zzajhVar2 = zzajhVar;
        zzfa c = zzezVar.c(AbstractC4501Vf.U0);
        if (c != null) {
            zzaimVar = new zzail(c, zzajhVar2.g);
        } else {
            zzfa c2 = zzezVar.c(AbstractC4501Vf.V0);
            if (c2 != null) {
                zzaimVar = new zzaim(c2);
            } else {
                throw zzaz.a("Track has no sample table size information", null);
            }
        }
        int b2 = zzaimVar.b();
        if (b2 == 0) {
            return new zzajk(zzajhVar2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (zzajhVar2.b == 2) {
            long j8 = zzajhVar2.f;
            if (j8 > 0) {
                zzx b3 = zzajhVar2.g.b();
                b3.k(b2 / (((float) j8) / 1000000.0f));
                zzajhVar2 = zzajhVar2.a(b3.K());
            }
        }
        zzfa c3 = zzezVar.c(AbstractC4501Vf.W0);
        if (c3 == null) {
            c3 = zzezVar.c(AbstractC4501Vf.X0);
            c3.getClass();
            z = true;
        } else {
            z = false;
        }
        zzfa c4 = zzezVar.c(AbstractC4501Vf.T0);
        c4.getClass();
        zzek zzekVar3 = c4.b;
        zzfa c5 = zzezVar.c(AbstractC4501Vf.Q0);
        c5.getClass();
        zzek zzekVar4 = c5.b;
        zzfa c6 = zzezVar.c(AbstractC4501Vf.R0);
        if (c6 != null) {
            zzekVar = c6.b;
        } else {
            zzekVar = null;
        }
        zzfa c7 = zzezVar.c(AbstractC4501Vf.S0);
        if (c7 != null) {
            zzekVar2 = c7.b;
        } else {
            zzekVar2 = null;
        }
        zzaie zzaieVar = new zzaie(zzekVar3, c3.b, z);
        zzekVar4.l(12);
        int J = zzekVar4.J() - 1;
        int J2 = zzekVar4.J();
        int J3 = zzekVar4.J();
        if (zzekVar2 != null) {
            zzekVar2.l(12);
            i = zzekVar2.J();
        } else {
            i = 0;
        }
        if (zzekVar != null) {
            zzekVar.l(12);
            i2 = zzekVar.J();
            if (i2 > 0) {
                i4 = zzekVar.J() - 1;
                i3 = 0;
            } else {
                i3 = 0;
                i4 = -1;
                zzekVar = null;
            }
        } else {
            i2 = 0;
            i3 = 0;
            i4 = -1;
        }
        int a2 = zzaimVar.a();
        zzz zzzVar2 = zzajhVar2.g;
        if (a2 != -1) {
            String str2 = zzzVar2.f301o;
            i5 = 1;
            if ((C4128Rj1.N.equals(str2) || C4128Rj1.P.equals(str2) || C4128Rj1.O.equals(str2)) && J == 0) {
                if (i == 0 && i2 == 0) {
                    int i22 = zzaieVar.a;
                    long[] jArr5 = new long[i22];
                    int[] iArr8 = new int[i22];
                    while (zzaieVar.a()) {
                        int i23 = zzaieVar.b;
                        jArr5[i23] = zzaieVar.d;
                        iArr8[i23] = zzaieVar.c;
                    }
                    long j9 = J3;
                    int i24 = 8192 / a2;
                    int i25 = i3;
                    int i26 = i25;
                    while (i25 < i22) {
                        int i27 = iArr8[i25];
                        String str3 = zzeu.a;
                        i26 += ((i27 + i24) - 1) / i24;
                        i25++;
                    }
                    jArr2 = new long[i26];
                    int[] iArr9 = new int[i26];
                    jArr = new long[i26];
                    iArr2 = new int[i26];
                    int i28 = i3;
                    int i29 = i28;
                    int i30 = i29;
                    int i31 = i30;
                    int i32 = i31;
                    while (i30 < i22) {
                        int i33 = iArr8[i30];
                        long j10 = jArr5[i30];
                        int i34 = i32;
                        int i35 = i22;
                        int i36 = i31;
                        int i37 = i34;
                        int i38 = i29;
                        int i39 = i33;
                        while (i39 > 0) {
                            int min = Math.min(i24, i39);
                            jArr2[i37] = j10;
                            int i40 = i24;
                            int i41 = a2 * min;
                            iArr9[i37] = i41;
                            i38 += i41;
                            i36 = Math.max(i36, i41);
                            jArr[i37] = i28 * j9;
                            iArr2[i37] = 1;
                            j10 += iArr9[i37];
                            i28 += min;
                            i39 -= min;
                            i37++;
                            i24 = i40;
                            iArr8 = iArr8;
                        }
                        int i42 = i24;
                        i30++;
                        int i43 = i37;
                        i31 = i36;
                        i22 = i35;
                        i32 = i43;
                        i29 = i38;
                        i24 = i42;
                    }
                    j2 = i29;
                    zzzVar = zzzVar2;
                    j = j9 * i28;
                    iArr = iArr9;
                    i6 = i31;
                    long[] jArr6 = jArr2;
                    int[] iArr10 = iArr2;
                    j3 = zzajhVar2.f;
                    if (j3 > 0) {
                        long P = zzeu.P(j2 * 8, 1000000L, j3, RoundingMode.HALF_DOWN);
                        if (P > 0 && P < 2147483647L) {
                            zzx b4 = zzzVar.b();
                            b4.a((int) P);
                            zzajhVar2 = zzajhVar2.a(b4.K());
                        }
                    }
                    long j11 = zzajhVar2.c;
                    RoundingMode roundingMode = RoundingMode.DOWN;
                    long P2 = zzeu.P(j, 1000000L, j11, roundingMode);
                    jArr3 = zzajhVar2.i;
                    if (jArr3 == null) {
                        zzeu.g(jArr, 1000000L, j11);
                        return new zzajk(zzajhVar2, jArr6, iArr, i6, jArr, iArr10, P2);
                    }
                    int length2 = jArr3.length;
                    int i44 = 1;
                    if (length2 == 1) {
                        if (zzajhVar2.b == 1 && (length = jArr.length) >= 2) {
                            long[] jArr7 = zzajhVar2.j;
                            jArr7.getClass();
                            long j12 = jArr7[i3];
                            long j13 = jArr3[i3];
                            long j14 = zzajhVar2.d;
                            long P3 = zzeu.P(j13, j11, j14, roundingMode) + j12;
                            int i45 = length - 1;
                            int i46 = i3;
                            int max = Math.max(i46, Math.min(4, i45));
                            int max2 = Math.max(i46, Math.min(length - 4, i45));
                            long j15 = jArr[i46];
                            if (j15 <= j12 && j12 < jArr[max] && jArr[max2] < P3 && P3 <= j) {
                                long j16 = zzajhVar2.g.F;
                                long P4 = zzeu.P(j12 - j15, j16, j11, roundingMode);
                                long P5 = zzeu.P(j - P3, j16, j11, roundingMode);
                                j5 = j11;
                                if (P4 == 0) {
                                    if (P5 != 0) {
                                        j4 = j;
                                        j6 = 0;
                                    } else {
                                        j4 = j;
                                    }
                                } else {
                                    j4 = j;
                                    j6 = P4;
                                }
                                if (j6 <= 2147483647L && P5 <= 2147483647L) {
                                    zzaebVar.a = (int) j6;
                                    zzaebVar.b = (int) P5;
                                    zzeu.g(jArr, 1000000L, j5);
                                    return new zzajk(zzajhVar2, jArr6, iArr, i6, jArr, iArr10, zzeu.P(jArr3[0], 1000000L, j14, roundingMode));
                                }
                            } else {
                                j4 = j;
                                j5 = j11;
                            }
                        } else {
                            j4 = j;
                            j5 = j11;
                        }
                        length2 = 1;
                        i44 = 1;
                    } else {
                        j4 = j;
                        j5 = j11;
                    }
                    if (length2 == i44 && jArr3[0] == 0) {
                        long[] jArr8 = zzajhVar2.j;
                        jArr8.getClass();
                        long j17 = jArr8[0];
                        int i47 = 0;
                        while (i47 < jArr.length) {
                            long j18 = j5;
                            jArr[i47] = zzeu.P(jArr[i47] - j17, 1000000L, j18, RoundingMode.DOWN);
                            i47++;
                            j5 = j18;
                        }
                        return new zzajk(zzajhVar2, jArr6, iArr, i6, jArr, iArr10, zzeu.P(j4 - j17, 1000000L, j5, RoundingMode.DOWN));
                    }
                    long j19 = j5;
                    int[] iArr11 = iArr;
                    int i48 = zzajhVar2.b;
                    if (i48 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long[] jArr9 = zzajhVar2.j;
                    int[] iArr12 = new int[length2];
                    int[] iArr13 = new int[length2];
                    jArr9.getClass();
                    int i49 = 0;
                    int i50 = 0;
                    boolean z7 = false;
                    int i51 = 0;
                    while (i49 < jArr3.length) {
                        int[] iArr14 = iArr12;
                        long j20 = jArr9[i49];
                        if (j20 != -1) {
                            iArr5 = iArr13;
                            i7 = i49;
                            long j21 = j19;
                            long P6 = zzeu.P(jArr3[i49], j21, zzajhVar2.d, RoundingMode.DOWN);
                            j19 = j21;
                            iArr14[i7] = zzeu.y(jArr, j20, true, true);
                            long j22 = j20 + P6;
                            iArr5[i7] = zzeu.v(jArr, j22, z2, false);
                            int i52 = iArr14[i7];
                            while (true) {
                                i8 = iArr14[i7];
                                if (i8 < 0 || (iArr10[i8] & 1) != 0) {
                                    break;
                                }
                                iArr14[i7] = i8 - 1;
                            }
                            if (i8 < 0) {
                                iArr14[i7] = i52;
                                while (true) {
                                    i9 = iArr14[i7];
                                    if (i9 >= iArr5[i7] || (iArr10[i9] & 1) != 0) {
                                        break;
                                    }
                                    iArr14[i7] = i9 + 1;
                                }
                            } else {
                                i9 = i8;
                            }
                            if (i48 == 2 && i9 != iArr5[i7]) {
                                while (true) {
                                    int i53 = iArr5[i7];
                                    if (i53 >= jArr.length - 1) {
                                        break;
                                    }
                                    int i54 = i53 + 1;
                                    if (jArr[i54] > j22) {
                                        break;
                                    }
                                    iArr5[i7] = i54;
                                }
                            }
                            int i55 = iArr5[i7];
                            int i56 = iArr14[i7];
                            i50 += i55 - i56;
                            if (i51 != i56) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            i51 = i55;
                            z7 = z5 | z7;
                        } else {
                            iArr5 = iArr13;
                            i7 = i49;
                        }
                        i49 = i7 + 1;
                        iArr12 = iArr14;
                        iArr13 = iArr5;
                    }
                    int[] iArr15 = iArr12;
                    int[] iArr16 = iArr13;
                    if (i50 != b2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z8 = z3 | z7;
                    if (z8) {
                        jArr4 = new long[i50];
                    } else {
                        jArr4 = jArr6;
                    }
                    if (z8) {
                        iArr3 = new int[i50];
                    } else {
                        iArr3 = iArr11;
                    }
                    if (true == z8) {
                        i6 = 0;
                    }
                    if (z8) {
                        iArr4 = new int[i50];
                    } else {
                        iArr4 = iArr10;
                    }
                    long[] jArr10 = new long[i50];
                    long j23 = 0;
                    int i57 = i6;
                    int i58 = 0;
                    boolean z9 = false;
                    int i59 = 0;
                    while (i58 < jArr3.length) {
                        long j24 = jArr9[i58];
                        int i60 = iArr15[i58];
                        int i61 = iArr16[i58];
                        long[] jArr11 = jArr3;
                        if (z8) {
                            int i62 = i61 - i60;
                            System.arraycopy(jArr6, i60, jArr4, i59, i62);
                            System.arraycopy(iArr11, i60, iArr3, i59, i62);
                            System.arraycopy(iArr10, i60, iArr4, i59, i62);
                        }
                        int i63 = i57;
                        while (i60 < i61) {
                            boolean z10 = z8;
                            long[] jArr12 = jArr4;
                            long j25 = zzajhVar2.d;
                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                            long P7 = zzeu.P(j23, 1000000L, j25, roundingMode2);
                            long P8 = zzeu.P(jArr[i60] - j24, 1000000L, j19, roundingMode2);
                            if (P8 < 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            z9 = (!z4) | z9;
                            jArr10[i59] = P7 + P8;
                            if (z10 && iArr3[i59] > i63) {
                                i63 = iArr11[i60];
                            }
                            i59++;
                            i60++;
                            z8 = z10;
                            jArr4 = jArr12;
                        }
                        j23 += jArr11[i58];
                        i58++;
                        z8 = z8;
                        i57 = i63;
                        jArr3 = jArr11;
                        jArr4 = jArr4;
                    }
                    long[] jArr13 = jArr4;
                    long P9 = zzeu.P(j23, 1000000L, zzajhVar2.d, RoundingMode.DOWN);
                    if (z9) {
                        zzx b5 = zzajhVar2.g.b();
                        b5.l(true);
                        zzajhVar2 = zzajhVar2.a(b5.K());
                    }
                    return new zzajk(zzajhVar2, jArr13, iArr3, i57, jArr10, iArr4, P9);
                }
                J = i3;
            }
        } else {
            i5 = 1;
        }
        long[] jArr14 = new long[b2];
        int[] iArr17 = new int[b2];
        long[] jArr15 = new long[b2];
        zzek zzekVar5 = zzekVar2;
        int[] iArr18 = new int[b2];
        zzaii zzaiiVar = zzaimVar;
        int i64 = i2;
        zzzVar = zzzVar2;
        int i65 = J;
        int i66 = J2;
        long j26 = 0;
        long j27 = 0;
        int i67 = i4;
        int i68 = i;
        int i69 = i3;
        int i70 = i69;
        int i71 = i70;
        int i72 = i71;
        int i73 = i72;
        long j28 = 0;
        while (true) {
            if (i69 < b2) {
                long j29 = j26;
                boolean z11 = i5;
                while (true) {
                    if (i72 == 0) {
                        boolean a3 = zzaieVar.a();
                        if (a3) {
                            zzek zzekVar6 = zzekVar4;
                            long j30 = zzaieVar.d;
                            i72 = zzaieVar.c;
                            j29 = j30;
                            zzekVar4 = zzekVar6;
                            zzekVar = zzekVar;
                            b2 = b2;
                            z11 = a3;
                        } else {
                            i19 = b2;
                            i20 = i3;
                            z6 = a3;
                            break;
                        }
                    } else {
                        i19 = b2;
                        i20 = i72;
                        z6 = z11;
                        break;
                    }
                }
                zzek zzekVar7 = zzekVar4;
                zzek zzekVar8 = zzekVar;
                if (z6 == 0) {
                    zzdx.f("BoxParsers", "Unexpected end of chunk data");
                    long[] copyOf = Arrays.copyOf(jArr14, i69);
                    iArr6 = Arrays.copyOf(iArr17, i69);
                    long[] copyOf2 = Arrays.copyOf(jArr15, i69);
                    iArr18 = Arrays.copyOf(iArr18, i69);
                    jArr2 = copyOf;
                    jArr = copyOf2;
                    b2 = i69;
                    break;
                }
                if (zzekVar5 != null) {
                    while (true) {
                        if (i73 == 0) {
                            if (i68 > 0) {
                                i68--;
                                i73 = zzekVar5.J();
                                i70 = zzekVar5.A();
                            } else {
                                i73 = i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i73--;
                }
                jArr14[i69] = j29;
                int c8 = zzaiiVar.c();
                iArr17[i69] = c8;
                j28 += c8;
                if (c8 > i71) {
                    i71 = c8;
                }
                jArr15[i69] = j27 + i70;
                if (zzekVar8 == null) {
                    i21 = i5;
                } else {
                    i21 = i3;
                }
                iArr18[i69] = i21;
                if (i69 == i67) {
                    iArr18[i69] = i5;
                    i64--;
                    if (i64 > 0) {
                        zzekVar8.getClass();
                        i67 = zzekVar8.J() - 1;
                    }
                }
                j27 += J3;
                i66--;
                if (i66 == 0) {
                    if (i65 > 0) {
                        i65--;
                        i66 = zzekVar7.J();
                        J3 = zzekVar7.A();
                    } else {
                        i66 = i3;
                    }
                }
                i72 = i20 - 1;
                i69++;
                zzekVar4 = zzekVar7;
                j26 = j29 + iArr17[i69];
                zzekVar = zzekVar8;
                b2 = i19;
            } else {
                iArr6 = iArr17;
                jArr = jArr15;
                jArr2 = jArr14;
                break;
            }
        }
        iArr2 = iArr18;
        long j31 = j27 + i70;
        if (zzekVar5 != null) {
            while (i68 > 0) {
                if (zzekVar5.J() != 0) {
                    i10 = i3;
                    break;
                }
                zzekVar5.A();
                i68--;
            }
        }
        i10 = i5;
        if (i64 == 0) {
            if (i66 == 0) {
                if (i72 == 0) {
                    if (i65 == 0) {
                        if (i73 == 0) {
                            if (i10 == 0) {
                                i11 = b2;
                                iArr7 = iArr6;
                                i17 = i3;
                                i16 = i17;
                                i15 = i16;
                                i12 = i15;
                                i13 = i12;
                                i14 = i13;
                            } else {
                                i11 = b2;
                                iArr7 = iArr6;
                                i18 = i71;
                                j7 = j31;
                                b2 = i11;
                                j2 = j28;
                                iArr = iArr7;
                                i6 = i18;
                                j = j7;
                                long[] jArr62 = jArr2;
                                int[] iArr102 = iArr2;
                                j3 = zzajhVar2.f;
                                if (j3 > 0) {
                                }
                                long j112 = zzajhVar2.c;
                                RoundingMode roundingMode3 = RoundingMode.DOWN;
                                long P22 = zzeu.P(j, 1000000L, j112, roundingMode3);
                                jArr3 = zzajhVar2.i;
                                if (jArr3 == null) {
                                }
                            }
                        } else {
                            i11 = b2;
                            iArr7 = iArr6;
                            i15 = i3;
                            i12 = i15;
                            i13 = i12;
                            i14 = i73;
                            i16 = i10;
                            i17 = i13;
                        }
                    } else {
                        i11 = b2;
                        iArr7 = iArr6;
                        i15 = i3;
                        i12 = i15;
                        i13 = i65;
                        i14 = i73;
                        i16 = i10;
                        i17 = i12;
                    }
                } else {
                    i11 = b2;
                    iArr7 = iArr6;
                    i15 = i3;
                    i12 = i72;
                    i13 = i65;
                    i14 = i73;
                    i16 = i10;
                    i17 = i15;
                }
            } else {
                i11 = b2;
                iArr7 = iArr6;
                i12 = i72;
                i13 = i65;
                i14 = i73;
                i15 = i66;
                i16 = i10;
                i17 = i3;
            }
        } else {
            i11 = b2;
            iArr7 = iArr6;
            i12 = i72;
            i13 = i65;
            i14 = i73;
            i15 = i66;
            i16 = i10;
            i17 = i64;
        }
        int i74 = zzajhVar2.a;
        i18 = i71;
        StringBuilder sb = new StringBuilder();
        j7 = j31;
        sb.append("Inconsistent stbl box for track ");
        sb.append(i74);
        sb.append(": remainingSynchronizationSamples ");
        sb.append(i17);
        sb.append(", remainingSamplesAtTimestampDelta ");
        sb.append(i15);
        sb.append(", remainingSamplesInChunk ");
        sb.append(i12);
        sb.append(", remainingTimestampDeltaChanges ");
        sb.append(i13);
        sb.append(", remainingSamplesAtTimestampOffset ");
        sb.append(i14);
        if (i5 != i16) {
            str = ", ctts invalid";
        } else {
            str = "";
        }
        sb.append(str);
        zzdx.f("BoxParsers", sb.toString());
        b2 = i11;
        j2 = j28;
        iArr = iArr7;
        i6 = i18;
        j = j7;
        long[] jArr622 = jArr2;
        int[] iArr1022 = iArr2;
        j3 = zzajhVar2.f;
        if (j3 > 0) {
        }
        long j1122 = zzajhVar2.c;
        RoundingMode roundingMode32 = RoundingMode.DOWN;
        long P222 = zzeu.P(j, 1000000L, j1122, roundingMode32);
        jArr3 = zzajhVar2.i;
        if (jArr3 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e4, code lost:
        if (r23 == 0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0bea  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0db1  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0db5  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0e23  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0e4d  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0e58 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:624:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List f(zzez zzezVar, zzaeb zzaebVar, long j, @InterfaceC11300zs1 zzs zzsVar, boolean z, boolean z2, zzfur zzfurVar) throws zzaz {
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        long P;
        int a2;
        int i3;
        int i4;
        long j5;
        long j6;
        int i5;
        String str;
        zzfa c2;
        int i6;
        int i7;
        String str2;
        ArrayList arrayList;
        int i8;
        zzez zzezVar2;
        long[] jArr;
        long[] jArr2;
        zzz zzzVar;
        int i9;
        int i10;
        long j7;
        long j8;
        zzfur zzfurVar2;
        zzajh zzajhVar;
        int i11;
        zzav zzavVar;
        Pair create;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        zzs zzsVar2;
        String str3;
        ArrayList arrayList2;
        zzez zzezVar3;
        int i17;
        char c3;
        String str4;
        long j9;
        long j10;
        long j11;
        long j12;
        int i18;
        int i19;
        int i20;
        boolean z3;
        zzaik zzaikVar;
        String str5;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        zzfp zzfpVar;
        zzfyc zzfycVar;
        boolean z4;
        int i27;
        String str6;
        byte[] bArr;
        char c4;
        int i28;
        zzaig zzaigVar;
        zzaij zzaijVar;
        boolean z5;
        zzaig zzaigVar2;
        zzaij zzaijVar2;
        boolean z6;
        int i29;
        boolean z7;
        int i30;
        String str7;
        boolean z8;
        zzfyc zzfycVar2;
        boolean z9;
        boolean z10;
        zzs zzsVar3;
        int i31;
        String str8;
        long j13;
        zzfyc G;
        long j14;
        zzajh zzajhVar2;
        ArrayList arrayList3;
        zzez zzezVar4 = zzezVar;
        ArrayList arrayList4 = new ArrayList();
        int i32 = 0;
        while (true) {
            List list = zzezVar4.d;
            if (i32 >= list.size()) {
                return arrayList4;
            }
            zzez zzezVar5 = (zzez) list.get(i32);
            if (zzezVar5.a != 1953653099) {
                arrayList3 = arrayList4;
                i8 = i32;
            } else {
                zzfa c5 = zzezVar4.c(AbstractC4501Vf.i0);
                c5.getClass();
                zzez b2 = zzezVar5.b(AbstractC4501Vf.k0);
                b2.getClass();
                zzfa c6 = b2.c(AbstractC4501Vf.w0);
                c6.getClass();
                int i33 = i(c6.b);
                int i34 = i33 == 1936684398 ? 1 : i33 == 1986618469 ? 2 : (i33 == 1952807028 || i33 == 1935832172 || i33 == 1937072756 || i33 == 1668047728) ? 3 : i33 == 1835365473 ? 5 : -1;
                if (i34 == -1) {
                    zzfurVar2 = zzfurVar;
                    arrayList = arrayList4;
                    i8 = i32;
                    zzezVar2 = zzezVar5;
                } else {
                    char c7 = 2;
                    zzfa c8 = zzezVar5.c(AbstractC4501Vf.s0);
                    c8.getClass();
                    zzek zzekVar = c8.b;
                    zzekVar.l(8);
                    int a3 = a(zzekVar.A());
                    int i35 = 1;
                    zzekVar.m(a3 == 0 ? 8 : 16);
                    int A = zzekVar.A();
                    zzekVar.m(4);
                    int w = zzekVar.w();
                    int i36 = 0;
                    while (true) {
                        int i37 = a3 == 0 ? 4 : 8;
                        c = 0;
                        if (i36 < i37) {
                            if (zzekVar.n()[w + i36] != -1) {
                                j2 = a3 == 0 ? zzekVar.O() : zzekVar.Q();
                            } else {
                                i36++;
                            }
                        } else {
                            zzekVar.m(i37);
                            break;
                        }
                    }
                    j2 = C10323vs.b;
                    zzekVar.m(10);
                    int K = zzekVar.K();
                    zzekVar.m(4);
                    int A2 = zzekVar.A();
                    int A3 = zzekVar.A();
                    zzekVar.m(4);
                    int A4 = zzekVar.A();
                    int A5 = zzekVar.A();
                    int i38 = 65536;
                    if (A2 == 0) {
                        if (A3 == 65536) {
                            if (A4 != -65536) {
                                A3 = 65536;
                            } else if (A5 == 0) {
                                i2 = 90;
                                i = i2;
                                zzain zzainVar = new zzain(A, j2, K, i);
                                if (j != C10323vs.b) {
                                    j14 = zzainVar.b;
                                    j3 = j14;
                                } else {
                                    j3 = j;
                                }
                                long j15 = d(c5.b).c;
                                if (j3 != C10323vs.b) {
                                    j4 = j15;
                                    P = -9223372036854775807L;
                                } else {
                                    j4 = j15;
                                    P = zzeu.P(j3, 1000000L, j4, RoundingMode.DOWN);
                                }
                                zzez b3 = b2.b(AbstractC4501Vf.l0);
                                b3.getClass();
                                zzez b4 = b3.b(AbstractC4501Vf.m0);
                                b4.getClass();
                                zzfa c9 = b2.c(AbstractC4501Vf.v0);
                                c9.getClass();
                                zzek zzekVar2 = c9.b;
                                zzekVar2.l(8);
                                a2 = a(zzekVar2.A());
                                zzekVar2.m(a2 != 0 ? 8 : 16);
                                long O = zzekVar2.O();
                                int w2 = zzekVar2.w();
                                i3 = 0;
                                while (true) {
                                    i4 = a2 != 0 ? 4 : 8;
                                    if (i3 >= i4) {
                                        if (zzekVar2.n()[w2 + i3] != -1) {
                                            long O2 = a2 == 0 ? zzekVar2.O() : zzekVar2.Q();
                                            if (O2 == 0) {
                                                j6 = -9223372036854775807L;
                                                j5 = O;
                                            } else {
                                                j5 = O;
                                                j6 = zzeu.P(O2, 1000000L, j5, RoundingMode.DOWN);
                                            }
                                        } else {
                                            i3++;
                                        }
                                    } else {
                                        j5 = O;
                                        zzekVar2.m(i4);
                                        j6 = -9223372036854775807L;
                                        break;
                                    }
                                }
                                int K2 = zzekVar2.K();
                                char[] cArr = {(char) (((K2 >> 10) & 31) + 96), (char) (((K2 >> 5) & 31) + 96), (char) ((K2 & 31) + 96)};
                                for (i5 = 0; i5 < 3; i5++) {
                                    char c10 = cArr[i5];
                                    if (c10 < 'a' || c10 > 'z') {
                                        str = null;
                                        break;
                                    }
                                }
                                str = new String(cArr);
                                zzaih zzaihVar = new zzaih(j5, j6, str);
                                c2 = b4.c(AbstractC4501Vf.x0);
                                if (c2 == null) {
                                    i6 = zzainVar.a;
                                    i7 = zzainVar.d;
                                    str2 = zzaihVar.c;
                                    zzek zzekVar3 = c2.b;
                                    char c11 = '\f';
                                    zzekVar3.l(12);
                                    int A6 = zzekVar3.A();
                                    zzaik zzaikVar2 = new zzaik(A6);
                                    int i39 = 0;
                                    while (i39 < A6) {
                                        int i40 = i34;
                                        int w3 = zzekVar3.w();
                                        char c12 = c11;
                                        int A7 = zzekVar3.A();
                                        String str9 = "childAtomSize must be positive";
                                        zzadr.b(A7 > 0 ? i35 : c, "childAtomSize must be positive");
                                        int i41 = i7;
                                        int A8 = zzekVar3.A();
                                        if (A8 != 1635148593 && A8 != 1635148595 && A8 != 1701733238 && A8 != 1831958048 && A8 != 1836070006 && A8 != 1752589105 && A8 != 1751479857 && A8 != 1932670515 && A8 != 1211250227 && A8 != 1748121139 && A8 != 1987063864 && A8 != 1987063865 && A8 != 1635135537 && A8 != 1685479798 && A8 != 1685479729 && A8 != 1685481573 && A8 != 1685481521 && A8 != 1634760241) {
                                            if (A8 == 1836069985 || A8 == 1701733217 || A8 == 1633889587 || A8 == 1700998451 || A8 == 1633889588 || A8 == 1835823201 || A8 == 1685353315 || A8 == 1685353317 || A8 == 1685353320 || A8 == 1685353324 || A8 == 1685353336 || A8 == 1935764850 || A8 == 1935767394 || A8 == 1819304813 || A8 == 1936684916 || A8 == 1953984371 || A8 == 778924082 || A8 == 778924083 || A8 == 1835557169 || A8 == 1835560241 || A8 == 1634492771 || A8 == 1634492791 || A8 == 1970037111 || A8 == 1332770163 || A8 == 1716281667) {
                                                i13 = i32;
                                                i31 = i41;
                                                c3 = 65535;
                                            } else if (A8 == 1767992678) {
                                                i31 = i41;
                                                i13 = i32;
                                                c3 = 65535;
                                            } else {
                                                if (A8 == 1414810956 || A8 == 1954034535 || A8 == 2004251764 || A8 == 1937010800 || A8 == 1664495672) {
                                                    zzekVar3.l(w3 + 16);
                                                    String str10 = C4128Rj1.A0;
                                                    if (A8 != 1414810956) {
                                                        if (A8 == 1954034535) {
                                                            int i42 = A7 - 16;
                                                            byte[] bArr2 = new byte[i42];
                                                            zzekVar3.h(bArr2, 0, i42);
                                                            G = zzfyc.G(bArr2);
                                                            str8 = C4128Rj1.B0;
                                                            i13 = i32;
                                                            j13 = Long.MAX_VALUE;
                                                            zzx zzxVar = new zzx();
                                                            zzxVar.n(i6);
                                                            zzxVar.E(str8);
                                                            zzxVar.s(str2);
                                                            zzxVar.I(j13);
                                                            zzxVar.p(G);
                                                            zzaikVar2.b = zzxVar.K();
                                                            i15 = w3;
                                                            i17 = A7;
                                                            str4 = str2;
                                                            i12 = A6;
                                                            i14 = i39;
                                                            arrayList2 = arrayList4;
                                                        } else if (A8 == 2004251764) {
                                                            str10 = C4128Rj1.C0;
                                                        } else if (A8 == 1937010800) {
                                                            str8 = C4128Rj1.A0;
                                                            i13 = i32;
                                                            j13 = 0;
                                                            G = null;
                                                            zzx zzxVar2 = new zzx();
                                                            zzxVar2.n(i6);
                                                            zzxVar2.E(str8);
                                                            zzxVar2.s(str2);
                                                            zzxVar2.I(j13);
                                                            zzxVar2.p(G);
                                                            zzaikVar2.b = zzxVar2.K();
                                                            i15 = w3;
                                                            i17 = A7;
                                                            str4 = str2;
                                                            i12 = A6;
                                                            i14 = i39;
                                                            arrayList2 = arrayList4;
                                                        } else {
                                                            zzaikVar2.d = i35;
                                                            str8 = C4128Rj1.D0;
                                                            i13 = i32;
                                                            j13 = Long.MAX_VALUE;
                                                            G = null;
                                                            zzx zzxVar22 = new zzx();
                                                            zzxVar22.n(i6);
                                                            zzxVar22.E(str8);
                                                            zzxVar22.s(str2);
                                                            zzxVar22.I(j13);
                                                            zzxVar22.p(G);
                                                            zzaikVar2.b = zzxVar22.K();
                                                            i15 = w3;
                                                            i17 = A7;
                                                            str4 = str2;
                                                            i12 = A6;
                                                            i14 = i39;
                                                            arrayList2 = arrayList4;
                                                        }
                                                    }
                                                    str8 = str10;
                                                    i13 = i32;
                                                    j13 = Long.MAX_VALUE;
                                                    G = null;
                                                    zzx zzxVar222 = new zzx();
                                                    zzxVar222.n(i6);
                                                    zzxVar222.E(str8);
                                                    zzxVar222.s(str2);
                                                    zzxVar222.I(j13);
                                                    zzxVar222.p(G);
                                                    zzaikVar2.b = zzxVar222.K();
                                                    i15 = w3;
                                                    i17 = A7;
                                                    str4 = str2;
                                                    i12 = A6;
                                                    i14 = i39;
                                                    arrayList2 = arrayList4;
                                                } else {
                                                    if (A8 == 1835365492) {
                                                        zzekVar3.l(w3 + 16);
                                                        char c13 = c;
                                                        zzekVar3.S(c13);
                                                        String S = zzekVar3.S(c13);
                                                        if (S != null) {
                                                            zzx zzxVar3 = new zzx();
                                                            zzxVar3.n(i6);
                                                            zzxVar3.E(S);
                                                            zzaikVar2.b = zzxVar3.K();
                                                        }
                                                    } else if (A8 == 1667329389) {
                                                        zzx zzxVar4 = new zzx();
                                                        zzxVar4.n(i6);
                                                        zzxVar4.E(C4128Rj1.I0);
                                                        zzaikVar2.b = zzxVar4.K();
                                                    }
                                                    i15 = w3;
                                                    i17 = A7;
                                                    str4 = str2;
                                                    i12 = A6;
                                                    i14 = i39;
                                                    arrayList2 = arrayList4;
                                                    i13 = i32;
                                                }
                                                zzezVar3 = zzezVar5;
                                                c3 = 65535;
                                            }
                                            i12 = A6;
                                            p(zzekVar3, A8, w3, A7, i6, str2, z2, zzsVar, zzaikVar2, i39);
                                            i15 = w3;
                                            i17 = A7;
                                            str4 = str2;
                                            i14 = i39;
                                            arrayList2 = arrayList4;
                                            i41 = i31;
                                            zzezVar3 = zzezVar5;
                                            c12 = '\f';
                                        } else {
                                            i12 = A6;
                                            i13 = i32;
                                            byte b5 = 3;
                                            zzekVar3.l(w3 + 16);
                                            zzekVar3.m(16);
                                            int K3 = zzekVar3.K();
                                            int K4 = zzekVar3.K();
                                            zzekVar3.m(50);
                                            int w4 = zzekVar3.w();
                                            i14 = i39;
                                            int i43 = AbstractC4501Vf.D0;
                                            if (A8 == 1701733238) {
                                                Pair j16 = j(zzekVar3, w3, A7);
                                                if (j16 != null) {
                                                    i43 = ((Integer) j16.first).intValue();
                                                    if (zzsVar == null) {
                                                        i15 = w3;
                                                        zzsVar3 = null;
                                                    } else {
                                                        i15 = w3;
                                                        zzsVar3 = zzsVar.b(((zzaji) j16.second).b);
                                                    }
                                                    zzaikVar2.a[i14] = (zzaji) j16.second;
                                                } else {
                                                    i15 = w3;
                                                    zzsVar3 = zzsVar;
                                                }
                                                int i44 = i43;
                                                zzekVar3.l(w4);
                                                i16 = i44;
                                                zzsVar2 = zzsVar3;
                                            } else {
                                                i15 = w3;
                                                i16 = A8;
                                                zzsVar2 = zzsVar;
                                            }
                                            if (i16 == 1831958048) {
                                                str3 = C4128Rj1.q;
                                            } else if (i16 == 1211250227) {
                                                i16 = 1211250227;
                                                str3 = C4128Rj1.i;
                                            } else {
                                                str3 = null;
                                            }
                                            zzs zzsVar4 = zzsVar2;
                                            int i45 = i6;
                                            String str11 = str2;
                                            String str12 = str3;
                                            arrayList2 = arrayList4;
                                            int i46 = w4;
                                            zzezVar3 = zzezVar5;
                                            float f = 1.0f;
                                            int i47 = -1;
                                            zzfp zzfpVar2 = null;
                                            int i48 = -1;
                                            int i49 = -1;
                                            zzfyc zzfycVar3 = null;
                                            int i50 = -1;
                                            int i51 = 8;
                                            boolean z11 = false;
                                            int i52 = -1;
                                            int i53 = -1;
                                            ByteBuffer byteBuffer = null;
                                            byte[] bArr3 = null;
                                            zzaid zzaidVar = null;
                                            zzaif zzaifVar = null;
                                            String str13 = null;
                                            int i54 = 8;
                                            while (i46 - i15 < A7) {
                                                zzekVar3.l(i46);
                                                int w5 = zzekVar3.w();
                                                int A9 = zzekVar3.A();
                                                if (A9 == 0) {
                                                    i18 = i46;
                                                    if (zzekVar3.w() - i15 == A7) {
                                                        break;
                                                    }
                                                    i19 = 0;
                                                } else {
                                                    i18 = i46;
                                                    i19 = A9;
                                                }
                                                if (i19 > 0) {
                                                    i20 = A7;
                                                    z3 = true;
                                                } else {
                                                    i20 = A7;
                                                    z3 = false;
                                                }
                                                zzadr.b(z3, str9);
                                                int A10 = zzekVar3.A();
                                                if (A10 == 1635148611) {
                                                    int i55 = w5 + 8;
                                                    zzadr.b(str12 == null, null);
                                                    zzekVar3.l(i55);
                                                    zzacs a4 = zzacs.a(zzekVar3);
                                                    List list2 = a4.a;
                                                    zzaikVar2.c = a4.b;
                                                    if (z11) {
                                                        z10 = true;
                                                    } else {
                                                        f = a4.k;
                                                        z10 = false;
                                                    }
                                                    String str14 = a4.l;
                                                    int i56 = a4.j;
                                                    i49 = a4.g;
                                                    i26 = i16;
                                                    str13 = str14;
                                                    zzaikVar = zzaikVar2;
                                                    i53 = i56;
                                                    str5 = str9;
                                                    i23 = a4.h;
                                                    i47 = a4.i;
                                                    i24 = a4.e;
                                                    i25 = b5;
                                                    i54 = a4.f;
                                                    zzfycVar3 = list2;
                                                    str12 = "video/avc";
                                                    z11 = z10;
                                                } else {
                                                    int i57 = i16;
                                                    if (A10 == 1752589123) {
                                                        int i58 = w5 + 8;
                                                        zzadr.b(str12 == null, null);
                                                        zzekVar3.l(i58);
                                                        zzaec a5 = zzaec.a(zzekVar3);
                                                        List list3 = a5.a;
                                                        zzaikVar2.c = a5.b;
                                                        if (z11) {
                                                            z9 = true;
                                                        } else {
                                                            f = a5.j;
                                                            z9 = false;
                                                        }
                                                        int i59 = a5.k;
                                                        int i60 = a5.c;
                                                        String str15 = a5.l;
                                                        int i61 = a5.i;
                                                        if (i61 != -1) {
                                                            i48 = i61;
                                                        }
                                                        i49 = a5.f;
                                                        z11 = z9;
                                                        i53 = i59;
                                                        zzaikVar = zzaikVar2;
                                                        str13 = str15;
                                                        str5 = str9;
                                                        i23 = a5.g;
                                                        i47 = a5.h;
                                                        i24 = a5.d;
                                                        i25 = b5;
                                                        zzfycVar3 = list3;
                                                        i26 = i57;
                                                        i54 = a5.e;
                                                        i52 = i60;
                                                        zzfpVar2 = a5.m;
                                                        str12 = C4128Rj1.k;
                                                    } else if (A10 == 1818785347) {
                                                        int i62 = w5 + 8;
                                                        zzadr.b(C4128Rj1.k.equals(str12), "lhvC must follow hvcC atom");
                                                        if (zzfpVar2 != null) {
                                                            z8 = zzfpVar2.a.size() >= 2;
                                                        } else {
                                                            z8 = false;
                                                            zzfpVar2 = null;
                                                        }
                                                        zzadr.b(z8, "must have at least two layers");
                                                        zzekVar3.l(i62);
                                                        zzfpVar2.getClass();
                                                        zzaec b6 = zzaec.b(zzekVar3, zzfpVar2);
                                                        zzadr.b(zzaikVar2.c == b6.b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                                                        int i63 = b6.f;
                                                        if (i63 != -1) {
                                                            zzadr.b(i49 == i63, "colorSpace must be the same for both views");
                                                        }
                                                        int i64 = b6.g;
                                                        if (i64 != -1) {
                                                            zzadr.b(i50 == i64, "colorRange must be the same for both views");
                                                        }
                                                        int i65 = b6.h;
                                                        if (i65 != -1) {
                                                            zzadr.b(i47 == i65, "colorTransfer must be the same for both views");
                                                        }
                                                        zzadr.b(i51 == b6.d, "bitdepthLuma must be the same for both views");
                                                        zzadr.b(i54 == b6.e, "bitdepthChroma must be the same for both views");
                                                        if (zzfycVar3 != null) {
                                                            int i66 = zzfyc.Z;
                                                            zzfxz zzfxzVar = new zzfxz();
                                                            zzfxzVar.i(zzfycVar3);
                                                            zzfxzVar.i(b6.a);
                                                            zzfycVar2 = zzfxzVar.j();
                                                        } else {
                                                            zzadr.b(false, "initializationData must be already set from hvcC atom");
                                                            zzfycVar2 = null;
                                                        }
                                                        str13 = b6.l;
                                                        zzfycVar3 = zzfycVar2;
                                                        str12 = "video/mv-hevc";
                                                        zzaikVar = zzaikVar2;
                                                        str5 = str9;
                                                        i23 = i50;
                                                        i24 = i51;
                                                        i25 = b5;
                                                        i26 = i57;
                                                    } else if (A10 == 1986361461) {
                                                        zzekVar3.l(w5 + 8);
                                                        int w6 = zzekVar3.w();
                                                        zzaig zzaigVar3 = null;
                                                        while (w6 - w5 < i19) {
                                                            zzekVar3.l(w6);
                                                            int A11 = zzekVar3.A();
                                                            if (A11 > 0) {
                                                                i29 = w6;
                                                                z7 = true;
                                                            } else {
                                                                i29 = w6;
                                                                z7 = false;
                                                            }
                                                            zzadr.b(z7, str9);
                                                            zzaik zzaikVar3 = zzaikVar2;
                                                            if (zzekVar3.A() == 1702454643) {
                                                                zzekVar3.l(i29 + 8);
                                                                int w7 = zzekVar3.w();
                                                                while (true) {
                                                                    if (w7 - i29 >= A11) {
                                                                        i30 = A11;
                                                                        str7 = str9;
                                                                        zzaigVar3 = null;
                                                                        break;
                                                                    }
                                                                    zzekVar3.l(w7);
                                                                    int A12 = zzekVar3.A();
                                                                    zzadr.b(A12 > 0, str9);
                                                                    int i67 = w7;
                                                                    if (zzekVar3.A() == 1937011305) {
                                                                        zzekVar3.m(4);
                                                                        int G2 = zzekVar3.G();
                                                                        i30 = A11;
                                                                        str7 = str9;
                                                                        zzaigVar3 = new zzaig(new zzaij(1 == (G2 & 1), (G2 & 2) == 2, (G2 & 8) == 8));
                                                                    } else {
                                                                        w7 = i67 + A12;
                                                                    }
                                                                }
                                                            } else {
                                                                i30 = A11;
                                                                str7 = str9;
                                                            }
                                                            w6 = i29 + i30;
                                                            zzaikVar2 = zzaikVar3;
                                                            str9 = str7;
                                                        }
                                                        zzaikVar = zzaikVar2;
                                                        str5 = str9;
                                                        zzaio zzaioVar = zzaigVar3 == null ? null : new zzaio(zzaigVar3);
                                                        if (zzaioVar != null) {
                                                            if (zzfpVar2 == null) {
                                                                zzfpVar2 = null;
                                                            } else if (zzfpVar2.a.size() >= 2) {
                                                                zzadr.b(zzaioVar.b(), "both eye views must be marked as available");
                                                                zzaigVar2 = zzaioVar.a;
                                                                zzaijVar2 = zzaigVar2.a;
                                                                z6 = zzaijVar2.c;
                                                                zzadr.b(!z6, "for MV-HEVC, eye_views_reversed must be set to false");
                                                            }
                                                            if (i48 == -1) {
                                                                zzaigVar = zzaioVar.a;
                                                                zzaijVar = zzaigVar.a;
                                                                z5 = zzaijVar.c;
                                                                i23 = i50;
                                                                i24 = i51;
                                                                if (true != z5) {
                                                                    i25 = b5;
                                                                    i48 = 4;
                                                                } else {
                                                                    i48 = 5;
                                                                    i25 = b5;
                                                                }
                                                                i26 = i57;
                                                            } else {
                                                                i23 = i50;
                                                                i24 = i51;
                                                                i25 = b5;
                                                                i26 = i57;
                                                            }
                                                        }
                                                        i21 = i48;
                                                        i22 = i54;
                                                        i23 = i50;
                                                        i24 = i51;
                                                        i25 = b5;
                                                        i26 = i57;
                                                        zzfpVar = zzfpVar2;
                                                        zzfpVar2 = zzfpVar;
                                                        i54 = i22;
                                                        i48 = i21;
                                                    } else {
                                                        zzaikVar = zzaikVar2;
                                                        str5 = str9;
                                                        int i68 = 4;
                                                        if (A10 != 1685480259 && A10 != 1685485123 && A10 != 1685485379) {
                                                            if (A10 == 1987076931) {
                                                                int i69 = w5 + 12;
                                                                zzadr.b(str12 == null, null);
                                                                zzekVar3.l(i69);
                                                                byte G3 = (byte) zzekVar3.G();
                                                                byte G4 = (byte) zzekVar3.G();
                                                                int G5 = zzekVar3.G();
                                                                int i70 = G5 >> 4;
                                                                int i71 = G5 >> 1;
                                                                String str16 = i57 == 1987063864 ? "video/x-vnd.on2.vp8" : C4128Rj1.m;
                                                                if (str16.equals(C4128Rj1.m)) {
                                                                    int i72 = zzdh.d;
                                                                    c4 = '\f';
                                                                    byte[] bArr4 = new byte[12];
                                                                    i28 = 1;
                                                                    bArr4[0] = 1;
                                                                    bArr4[1] = 1;
                                                                    bArr4[2] = G3;
                                                                    bArr4[b5] = 2;
                                                                    bArr4[4] = 1;
                                                                    bArr4[5] = G4;
                                                                    bArr4[6] = b5;
                                                                    bArr4[7] = 1;
                                                                    bArr4[8] = (byte) i70;
                                                                    bArr4[9] = 4;
                                                                    bArr4[10] = 1;
                                                                    bArr4[11] = (byte) (i71 & 7);
                                                                    zzfycVar3 = zzfyc.G(bArr4);
                                                                } else {
                                                                    c4 = '\f';
                                                                    i28 = 1;
                                                                }
                                                                int i73 = G5 & 1;
                                                                int G6 = zzekVar3.G();
                                                                int G7 = zzekVar3.G();
                                                                int a6 = zzk.a(G6);
                                                                i23 = i28 != i73 ? 2 : 1;
                                                                i26 = i57;
                                                                i24 = i70;
                                                                i25 = b5;
                                                                i47 = zzk.b(G7);
                                                                i49 = a6;
                                                                str12 = str16;
                                                                i54 = i24;
                                                            } else {
                                                                if (A10 == 1635135811) {
                                                                    int i74 = i19 - 8;
                                                                    byte[] bArr5 = new byte[i74];
                                                                    zzekVar3.h(bArr5, 0, i74);
                                                                    zzfyc G8 = zzfyc.G(bArr5);
                                                                    zzekVar3.l(w5 + 8);
                                                                    zzk k = k(zzekVar3);
                                                                    int i75 = k.e;
                                                                    i54 = k.f;
                                                                    int i76 = k.a;
                                                                    int i77 = k.b;
                                                                    i27 = k.c;
                                                                    zzfycVar3 = G8;
                                                                    i49 = i76;
                                                                    i23 = i77;
                                                                    str12 = C4128Rj1.n;
                                                                    i26 = i57;
                                                                    i24 = i75;
                                                                    i25 = b5;
                                                                } else if (A10 == 1668050025) {
                                                                    if (byteBuffer == null) {
                                                                        byteBuffer = o();
                                                                    }
                                                                    ByteBuffer byteBuffer2 = byteBuffer;
                                                                    byteBuffer2.position(21);
                                                                    byteBuffer2.putShort(zzekVar3.e());
                                                                    byteBuffer2.putShort(zzekVar3.e());
                                                                    byteBuffer = byteBuffer2;
                                                                    i26 = i57;
                                                                    i23 = i50;
                                                                    i24 = i51;
                                                                    i25 = b5;
                                                                } else {
                                                                    if (A10 == 1835295606) {
                                                                        if (byteBuffer == null) {
                                                                            byteBuffer = o();
                                                                        }
                                                                        ByteBuffer byteBuffer3 = byteBuffer;
                                                                        short e = zzekVar3.e();
                                                                        short e2 = zzekVar3.e();
                                                                        short e3 = zzekVar3.e();
                                                                        zzfpVar = zzfpVar2;
                                                                        short e4 = zzekVar3.e();
                                                                        i26 = i57;
                                                                        short e5 = zzekVar3.e();
                                                                        i22 = i54;
                                                                        short e6 = zzekVar3.e();
                                                                        i24 = i51;
                                                                        short e7 = zzekVar3.e();
                                                                        i23 = i50;
                                                                        short e8 = zzekVar3.e();
                                                                        long O3 = zzekVar3.O();
                                                                        long O4 = zzekVar3.O();
                                                                        i21 = i48;
                                                                        byteBuffer3.position(1);
                                                                        byteBuffer3.putShort(e5);
                                                                        byteBuffer3.putShort(e6);
                                                                        byteBuffer3.putShort(e);
                                                                        byteBuffer3.putShort(e2);
                                                                        byteBuffer3.putShort(e3);
                                                                        byteBuffer3.putShort(e4);
                                                                        byteBuffer3.putShort(e7);
                                                                        byteBuffer3.putShort(e8);
                                                                        byteBuffer3.putShort((short) (O3 / 10000));
                                                                        byteBuffer3.putShort((short) (O4 / 10000));
                                                                        byteBuffer = byteBuffer3;
                                                                    } else {
                                                                        zzfpVar = zzfpVar2;
                                                                        i21 = i48;
                                                                        i26 = i57;
                                                                        i22 = i54;
                                                                        i23 = i50;
                                                                        i24 = i51;
                                                                        if (A10 == 1681012275) {
                                                                            zzadr.b(str12 == null, null);
                                                                            i25 = b5;
                                                                            str12 = C4128Rj1.i;
                                                                            zzfpVar2 = zzfpVar;
                                                                            i54 = i22;
                                                                            i48 = i21;
                                                                        } else if (A10 == 1702061171) {
                                                                            zzadr.b(str12 == null, null);
                                                                            zzaif n = n(zzekVar3, w5);
                                                                            str6 = n.a;
                                                                            bArr = n.b;
                                                                            if (bArr != null) {
                                                                                zzaifVar = n;
                                                                                str12 = str6;
                                                                                zzfycVar3 = zzfyc.G(bArr);
                                                                            } else {
                                                                                zzaifVar = n;
                                                                                str12 = str6;
                                                                            }
                                                                        } else if (A10 == 1651798644) {
                                                                            zzaidVar = m(zzekVar3, w5);
                                                                        } else if (A10 == 1885434736) {
                                                                            zzekVar3.l(w5 + 8);
                                                                            f = zzekVar3.J() / zzekVar3.J();
                                                                            i25 = b5;
                                                                            zzfpVar2 = zzfpVar;
                                                                            i54 = i22;
                                                                            i48 = i21;
                                                                            z11 = true;
                                                                        } else if (A10 == 1937126244) {
                                                                            int i78 = w5 + 8;
                                                                            while (i78 - w5 < i19) {
                                                                                zzekVar3.l(i78);
                                                                                int A13 = zzekVar3.A() + i78;
                                                                                if (zzekVar3.A() == 1886547818) {
                                                                                    bArr3 = Arrays.copyOfRange(zzekVar3.n(), i78, A13);
                                                                                } else {
                                                                                    i78 = A13;
                                                                                }
                                                                            }
                                                                            i25 = b5;
                                                                            zzfpVar2 = zzfpVar;
                                                                            i54 = i22;
                                                                            i48 = i21;
                                                                            bArr3 = null;
                                                                        } else if (A10 == 1936995172) {
                                                                            int G9 = zzekVar3.G();
                                                                            i25 = b5;
                                                                            zzekVar3.m(i25);
                                                                            if (G9 == 0) {
                                                                                int G10 = zzekVar3.G();
                                                                                if (G10 == 0) {
                                                                                    zzfpVar2 = zzfpVar;
                                                                                    i54 = i22;
                                                                                    i48 = 0;
                                                                                } else if (G10 == 1) {
                                                                                    zzfpVar2 = zzfpVar;
                                                                                    i54 = i22;
                                                                                    i48 = 1;
                                                                                } else if (G10 == 2) {
                                                                                    zzfpVar2 = zzfpVar;
                                                                                    i54 = i22;
                                                                                    i48 = 2;
                                                                                } else if (G10 == i25) {
                                                                                    i48 = i25;
                                                                                    zzfpVar2 = zzfpVar;
                                                                                    i54 = i22;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            i25 = b5;
                                                                            if (A10 == 1634760259) {
                                                                                int i79 = i19 - 12;
                                                                                byte[] bArr6 = new byte[i79];
                                                                                zzekVar3.l(w5 + 12);
                                                                                zzekVar3.h(bArr6, 0, i79);
                                                                                zzfyc G11 = zzfyc.G(bArr6);
                                                                                zzek zzekVar4 = new zzek(bArr6);
                                                                                zzi zziVar = new zzi();
                                                                                byte[] n2 = zzekVar4.n();
                                                                                zzej zzejVar = new zzej(n2, n2.length);
                                                                                int i80 = 8;
                                                                                zzejVar.l(zzekVar4.w() * 8);
                                                                                int i81 = 1;
                                                                                zzejVar.o(1);
                                                                                int d = zzejVar.d(8);
                                                                                int i82 = 0;
                                                                                while (i82 < d) {
                                                                                    zzejVar.o(i81);
                                                                                    int d2 = zzejVar.d(i80);
                                                                                    int i83 = 0;
                                                                                    while (i83 < d2) {
                                                                                        zzejVar.n(6);
                                                                                        boolean p = zzejVar.p();
                                                                                        zzejVar.m();
                                                                                        zzejVar.o(11);
                                                                                        int i84 = i68;
                                                                                        zzejVar.n(i84);
                                                                                        int d3 = zzejVar.d(i84) + i80;
                                                                                        zziVar.f(d3);
                                                                                        zziVar.a(d3);
                                                                                        zzejVar.o(1);
                                                                                        if (p) {
                                                                                            int d4 = zzejVar.d(i80);
                                                                                            int d5 = zzejVar.d(i80);
                                                                                            zzejVar.o(1);
                                                                                            boolean p2 = zzejVar.p();
                                                                                            zziVar.c(zzk.a(d4));
                                                                                            zziVar.b(true != p2 ? 2 : 1);
                                                                                            zziVar.d(zzk.b(d5));
                                                                                        }
                                                                                        i83++;
                                                                                        i68 = i84;
                                                                                        i80 = 8;
                                                                                    }
                                                                                    i82++;
                                                                                    i80 = 8;
                                                                                    i81 = 1;
                                                                                }
                                                                                zzk g = zziVar.g();
                                                                                int i85 = g.e;
                                                                                i54 = g.f;
                                                                                int i86 = g.a;
                                                                                int i87 = g.b;
                                                                                i27 = g.c;
                                                                                zzfycVar3 = G11;
                                                                                i49 = i86;
                                                                                i23 = i87;
                                                                                str12 = "video/apv";
                                                                                i24 = i85;
                                                                                zzfpVar2 = zzfpVar;
                                                                                i48 = i21;
                                                                            } else if (A10 == 1668246642 && i49 == -1) {
                                                                                if (i47 == -1) {
                                                                                    int A14 = zzekVar3.A();
                                                                                    if (A14 != 1852009592 && A14 != 1852009571) {
                                                                                        zzdx.f("BoxParsers", "Unsupported color type: ".concat(zzfc.a(A14)));
                                                                                        i47 = -1;
                                                                                        i49 = -1;
                                                                                    } else {
                                                                                        int K5 = zzekVar3.K();
                                                                                        int K6 = zzekVar3.K();
                                                                                        zzekVar3.m(2);
                                                                                        if (i19 == 19) {
                                                                                            if ((zzekVar3.G() & 128) != 0) {
                                                                                                i19 = 19;
                                                                                                z4 = true;
                                                                                                i49 = zzk.a(K5);
                                                                                                i23 = true == z4 ? 2 : 1;
                                                                                                zzfpVar2 = zzfpVar;
                                                                                                i54 = i22;
                                                                                                i48 = i21;
                                                                                                i47 = zzk.b(K6);
                                                                                            } else {
                                                                                                i19 = 19;
                                                                                            }
                                                                                        }
                                                                                        z4 = false;
                                                                                        i49 = zzk.a(K5);
                                                                                        i23 = true == z4 ? 2 : 1;
                                                                                        zzfpVar2 = zzfpVar;
                                                                                        i54 = i22;
                                                                                        i48 = i21;
                                                                                        i47 = zzk.b(K6);
                                                                                    }
                                                                                } else {
                                                                                    i49 = -1;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    i25 = b5;
                                                                    zzfpVar2 = zzfpVar;
                                                                    i54 = i22;
                                                                    i48 = i21;
                                                                }
                                                                i47 = i27;
                                                            }
                                                            break;
                                                        }
                                                        i21 = i48;
                                                        i22 = i54;
                                                        i23 = i50;
                                                        i24 = i51;
                                                        i25 = b5;
                                                        i26 = i57;
                                                        zzfpVar = zzfpVar2;
                                                        int i88 = i19 - 8;
                                                        int i89 = w5 + 8;
                                                        byte[] bArr7 = new byte[i88];
                                                        zzekVar3.h(bArr7, 0, i88);
                                                        if (zzfycVar3 != null) {
                                                            int i90 = zzfyc.Z;
                                                            zzfxz zzfxzVar2 = new zzfxz();
                                                            zzfxzVar2.i(zzfycVar3);
                                                            zzfxzVar2.g(bArr7);
                                                            zzfycVar = zzfxzVar2.j();
                                                        } else {
                                                            zzadr.b(false, "initializationData must already be set from hvcC or avcC atom");
                                                            zzfycVar = null;
                                                        }
                                                        zzekVar3.l(i89);
                                                        zzew a7 = zzew.a(zzekVar3);
                                                        if (a7 != null) {
                                                            str13 = a7.a;
                                                            str12 = C4128Rj1.w;
                                                        }
                                                        zzfycVar3 = zzfycVar;
                                                        zzfpVar2 = zzfpVar;
                                                        i54 = i22;
                                                        i48 = i21;
                                                    }
                                                }
                                                i46 = i18 + i19;
                                                b5 = i25;
                                                A7 = i20;
                                                i16 = i26;
                                                zzaikVar2 = zzaikVar;
                                                i51 = i24;
                                                str9 = str5;
                                                i50 = i23;
                                                zzfycVar3 = zzfycVar3;
                                            }
                                            i17 = A7;
                                            int i91 = i48;
                                            zzaik zzaikVar4 = zzaikVar2;
                                            int i92 = i54;
                                            int i93 = i50;
                                            int i94 = i51;
                                            c3 = 65535;
                                            c12 = '\f';
                                            if (str12 == null) {
                                                str4 = str11;
                                                i41 = i41;
                                                i6 = i45;
                                                zzaikVar2 = zzaikVar4;
                                            } else {
                                                zzx zzxVar5 = new zzx();
                                                i6 = i45;
                                                zzxVar5.n(i6);
                                                zzxVar5.E(str12);
                                                zzxVar5.c(str13);
                                                zzxVar5.J(K3);
                                                zzxVar5.m(K4);
                                                zzxVar5.z(f);
                                                i41 = i41;
                                                zzxVar5.D(i41);
                                                zzxVar5.B(bArr3);
                                                zzxVar5.H(i91);
                                                zzxVar5.p(zzfycVar3);
                                                zzxVar5.u(i53);
                                                zzxVar5.v(i52);
                                                zzxVar5.h(zzsVar4);
                                                str4 = str11;
                                                zzxVar5.s(str4);
                                                zzi zziVar2 = new zzi();
                                                zziVar2.c(i49);
                                                zziVar2.b(i93);
                                                zziVar2.d(i47);
                                                zziVar2.e(byteBuffer != null ? byteBuffer.array() : null);
                                                zziVar2.f(i94);
                                                zziVar2.a(i92);
                                                zzxVar5.d(zziVar2.g());
                                                if (zzaidVar != null) {
                                                    j11 = zzaidVar.a;
                                                    zzxVar5.a(zzgbf.f(j11));
                                                    j12 = zzaidVar.b;
                                                    zzxVar5.y(zzgbf.f(j12));
                                                } else if (zzaifVar != null) {
                                                    j9 = zzaifVar.c;
                                                    zzxVar5.a(zzgbf.f(j9));
                                                    j10 = zzaifVar.d;
                                                    zzxVar5.y(zzgbf.f(j10));
                                                }
                                                zzaikVar2 = zzaikVar4;
                                                zzaikVar2.b = zzxVar5.K();
                                            }
                                        }
                                        zzekVar3.l(i15 + i17);
                                        i39 = i14 + 1;
                                        str2 = str4;
                                        i7 = i41;
                                        A6 = i12;
                                        i34 = i40;
                                        c11 = c12;
                                        arrayList4 = arrayList2;
                                        i32 = i13;
                                        zzezVar5 = zzezVar3;
                                        c7 = 2;
                                        i35 = 1;
                                        c = 0;
                                    }
                                    int i95 = i34;
                                    arrayList = arrayList4;
                                    i8 = i32;
                                    zzez zzezVar6 = zzezVar5;
                                    if (z) {
                                        zzezVar2 = zzezVar6;
                                    } else {
                                        zzezVar2 = zzezVar6;
                                        zzez b7 = zzezVar2.b(AbstractC4501Vf.t0);
                                        if (b7 != null) {
                                            zzfa c14 = b7.c(AbstractC4501Vf.u0);
                                            if (c14 == null) {
                                                create = null;
                                            } else {
                                                zzek zzekVar5 = c14.b;
                                                zzekVar5.l(8);
                                                int a8 = a(zzekVar5.A());
                                                int J = zzekVar5.J();
                                                long[] jArr3 = new long[J];
                                                long[] jArr4 = new long[J];
                                                for (int i96 = 0; i96 < J; i96++) {
                                                    jArr3[i96] = a8 == 1 ? zzekVar5.Q() : zzekVar5.O();
                                                    jArr4[i96] = a8 == 1 ? zzekVar5.N() : zzekVar5.A();
                                                    if (zzekVar5.e() == 1) {
                                                        zzekVar5.m(2);
                                                    } else {
                                                        throw new IllegalArgumentException("Unsupported media rate.");
                                                    }
                                                }
                                                create = Pair.create(jArr3, jArr4);
                                            }
                                            if (create != null) {
                                                jArr = (long[]) create.first;
                                                jArr2 = (long[]) create.second;
                                                zzzVar = zzaikVar2.b;
                                                if (zzzVar != null) {
                                                    zzfurVar2 = zzfurVar;
                                                } else {
                                                    i9 = zzainVar.c;
                                                    if (i9 != 0) {
                                                        i11 = zzainVar.c;
                                                        zzey zzeyVar = new zzey(i11);
                                                        zzx b8 = zzzVar.b();
                                                        zzav zzavVar2 = zzzVar.l;
                                                        if (zzavVar2 != null) {
                                                            zzavVar = zzavVar2.c(zzeyVar);
                                                        } else {
                                                            zzavVar = new zzav(C10323vs.b, zzeyVar);
                                                        }
                                                        b8.w(zzavVar);
                                                        zzzVar = b8.K();
                                                    }
                                                    zzz zzzVar2 = zzzVar;
                                                    i10 = zzainVar.a;
                                                    j7 = zzaihVar.a;
                                                    j8 = zzaihVar.b;
                                                    zzfurVar2 = zzfurVar;
                                                    zzajhVar = new zzajh(i10, i95, j7, j4, P, j8, zzzVar2, zzaikVar2.d, zzaikVar2.a, zzaikVar2.c, jArr, jArr2);
                                                    zzajhVar2 = (zzajh) zzfurVar2.apply(zzajhVar);
                                                    if (zzajhVar2 == null) {
                                                        zzez b9 = zzezVar2.b(AbstractC4501Vf.k0);
                                                        b9.getClass();
                                                        zzez b10 = b9.b(AbstractC4501Vf.l0);
                                                        b10.getClass();
                                                        zzez b11 = b10.b(AbstractC4501Vf.m0);
                                                        b11.getClass();
                                                        zzajk e9 = e(zzajhVar2, b11, zzaebVar);
                                                        arrayList3 = arrayList;
                                                        arrayList3.add(e9);
                                                    } else {
                                                        arrayList3 = arrayList;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    jArr = null;
                                    jArr2 = null;
                                    zzzVar = zzaikVar2.b;
                                    if (zzzVar != null) {
                                    }
                                } else {
                                    throw zzaz.a("Malformed sample table (stbl) missing sample description (stsd)", null);
                                }
                            } else {
                                A3 = 65536;
                                A4 = -65536;
                            }
                        }
                        A2 = 0;
                    }
                    if (A2 == 0) {
                        if (A3 == -65536) {
                            if (A4 != 65536) {
                                i38 = A4;
                            } else if (A5 == 0) {
                                i2 = C4731Xo.d1;
                                i = i2;
                                zzain zzainVar2 = new zzain(A, j2, K, i);
                                if (j != C10323vs.b) {
                                }
                                long j152 = d(c5.b).c;
                                if (j3 != C10323vs.b) {
                                }
                                zzez b32 = b2.b(AbstractC4501Vf.l0);
                                b32.getClass();
                                zzez b42 = b32.b(AbstractC4501Vf.m0);
                                b42.getClass();
                                zzfa c92 = b2.c(AbstractC4501Vf.v0);
                                c92.getClass();
                                zzek zzekVar22 = c92.b;
                                zzekVar22.l(8);
                                a2 = a(zzekVar22.A());
                                zzekVar22.m(a2 != 0 ? 8 : 16);
                                long O5 = zzekVar22.O();
                                int w22 = zzekVar22.w();
                                i3 = 0;
                                while (true) {
                                    if (a2 != 0) {
                                    }
                                    if (i3 >= i4) {
                                    }
                                    i3++;
                                }
                                int K22 = zzekVar22.K();
                                char[] cArr2 = {(char) (((K22 >> 10) & 31) + 96), (char) (((K22 >> 5) & 31) + 96), (char) ((K22 & 31) + 96)};
                                while (i5 < 3) {
                                }
                                str = new String(cArr2);
                                zzaih zzaihVar2 = new zzaih(j5, j6, str);
                                c2 = b42.c(AbstractC4501Vf.x0);
                                if (c2 == null) {
                                }
                            }
                            A3 = -65536;
                        } else {
                            i38 = A4;
                        }
                        A2 = 0;
                    } else {
                        i38 = A4;
                    }
                    if (A2 != -65536 || A3 != 0 || i38 != 0 || A5 != -65536) {
                        i = 0;
                        zzain zzainVar22 = new zzain(A, j2, K, i);
                        if (j != C10323vs.b) {
                        }
                        long j1522 = d(c5.b).c;
                        if (j3 != C10323vs.b) {
                        }
                        zzez b322 = b2.b(AbstractC4501Vf.l0);
                        b322.getClass();
                        zzez b422 = b322.b(AbstractC4501Vf.m0);
                        b422.getClass();
                        zzfa c922 = b2.c(AbstractC4501Vf.v0);
                        c922.getClass();
                        zzek zzekVar222 = c922.b;
                        zzekVar222.l(8);
                        a2 = a(zzekVar222.A());
                        zzekVar222.m(a2 != 0 ? 8 : 16);
                        long O52 = zzekVar222.O();
                        int w222 = zzekVar222.w();
                        i3 = 0;
                        while (true) {
                            if (a2 != 0) {
                            }
                            if (i3 >= i4) {
                            }
                            i3++;
                        }
                        int K222 = zzekVar222.K();
                        char[] cArr22 = {(char) (((K222 >> 10) & 31) + 96), (char) (((K222 >> 5) & 31) + 96), (char) ((K222 & 31) + 96)};
                        while (i5 < 3) {
                        }
                        str = new String(cArr22);
                        zzaih zzaihVar22 = new zzaih(j5, j6, str);
                        c2 = b422.c(AbstractC4501Vf.x0);
                        if (c2 == null) {
                        }
                    } else {
                        i2 = 180;
                        i = i2;
                        zzain zzainVar222 = new zzain(A, j2, K, i);
                        if (j != C10323vs.b) {
                        }
                        long j15222 = d(c5.b).c;
                        if (j3 != C10323vs.b) {
                        }
                        zzez b3222 = b2.b(AbstractC4501Vf.l0);
                        b3222.getClass();
                        zzez b4222 = b3222.b(AbstractC4501Vf.m0);
                        b4222.getClass();
                        zzfa c9222 = b2.c(AbstractC4501Vf.v0);
                        c9222.getClass();
                        zzek zzekVar2222 = c9222.b;
                        zzekVar2222.l(8);
                        a2 = a(zzekVar2222.A());
                        zzekVar2222.m(a2 != 0 ? 8 : 16);
                        long O522 = zzekVar2222.O();
                        int w2222 = zzekVar2222.w();
                        i3 = 0;
                        while (true) {
                            if (a2 != 0) {
                            }
                            if (i3 >= i4) {
                            }
                            i3++;
                        }
                        int K2222 = zzekVar2222.K();
                        char[] cArr222 = {(char) (((K2222 >> 10) & 31) + 96), (char) (((K2222 >> 5) & 31) + 96), (char) ((K2222 & 31) + 96)};
                        while (i5 < 3) {
                        }
                        str = new String(cArr222);
                        zzaih zzaihVar222 = new zzaih(j5, j6, str);
                        c2 = b4222.c(AbstractC4501Vf.x0);
                        if (c2 == null) {
                        }
                    }
                }
                zzajhVar = null;
                zzajhVar2 = (zzajh) zzfurVar2.apply(zzajhVar);
                if (zzajhVar2 == null) {
                }
            }
            i32 = i8 + 1;
            zzezVar4 = zzezVar;
            arrayList4 = arrayList3;
        }
    }

    public static void g(zzek zzekVar) {
        int w = zzekVar.w();
        zzekVar.m(4);
        if (zzekVar.A() != 1751411826) {
            w += 4;
        }
        zzekVar.l(w);
    }

    public static int h(zzek zzekVar) {
        int G = zzekVar.G();
        int i = G & 127;
        while ((G & 128) == 128) {
            G = zzekVar.G();
            i = (i << 7) | (G & 127);
        }
        return i;
    }

    public static int i(zzek zzekVar) {
        zzekVar.l(16);
        return zzekVar.A();
    }

    @InterfaceC11300zs1
    public static Pair j(zzek zzekVar, int i, int i2) throws zzaz {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        zzaji zzajiVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z4;
        int w = zzekVar.w();
        while (w - i < i2) {
            zzekVar.l(w);
            int A = zzekVar.A();
            boolean z5 = true;
            if (A > 0) {
                z = true;
            } else {
                z = false;
            }
            zzadr.b(z, "childAtomSize must be positive");
            if (zzekVar.A() == 1936289382) {
                int i5 = w + 8;
                int i6 = 0;
                int i7 = -1;
                Integer num3 = null;
                String str = null;
                while (i5 - w < A) {
                    zzekVar.l(i5);
                    int A2 = zzekVar.A();
                    int A3 = zzekVar.A();
                    if (A3 == 1718775137) {
                        num3 = Integer.valueOf(zzekVar.A());
                    } else if (A3 == 1935894637) {
                        zzekVar.m(4);
                        str = zzekVar.b(4, StandardCharsets.UTF_8);
                    } else if (A3 == 1935894633) {
                        i7 = i5;
                        i6 = A2;
                    }
                    i5 += A2;
                }
                byte[] bArr = null;
                if (!"cenc".equals(str) && !C10323vs.a2.equals(str) && !C10323vs.b2.equals(str) && !C10323vs.c2.equals(str)) {
                    create = null;
                } else {
                    if (num3 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zzadr.b(z2, "frma atom is mandatory");
                    if (i7 != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zzadr.b(z3, "schi atom is mandatory");
                    int i8 = i7 + 8;
                    while (true) {
                        if (i8 - i7 < i6) {
                            zzekVar.l(i8);
                            int A4 = zzekVar.A();
                            if (zzekVar.A() == 1952804451) {
                                int a2 = a(zzekVar.A());
                                zzekVar.m(1);
                                if (a2 == 0) {
                                    zzekVar.m(1);
                                    i4 = 0;
                                    i3 = 0;
                                } else {
                                    int G = zzekVar.G();
                                    i3 = G & 15;
                                    i4 = (G & 240) >> 4;
                                }
                                if (zzekVar.G() == 1) {
                                    num2 = num3;
                                    z4 = true;
                                } else {
                                    num2 = num3;
                                    z4 = false;
                                }
                                int G2 = zzekVar.G();
                                byte[] bArr2 = new byte[16];
                                zzekVar.h(bArr2, 0, 16);
                                if (z4 && G2 == 0) {
                                    int G3 = zzekVar.G();
                                    byte[] bArr3 = new byte[G3];
                                    zzekVar.h(bArr3, 0, G3);
                                    bArr = bArr3;
                                }
                                num = num2;
                                zzajiVar = new zzaji(z4, str, G2, bArr2, i4, i3, bArr);
                            } else {
                                i8 += A4;
                            }
                        } else {
                            num = num3;
                            zzajiVar = null;
                            break;
                        }
                    }
                    if (zzajiVar == null) {
                        z5 = false;
                    }
                    zzadr.b(z5, "tenc atom is mandatory");
                    String str2 = zzeu.a;
                    create = Pair.create(num, zzajiVar);
                }
                if (create != null) {
                    return create;
                }
            }
            w += A;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0144, code lost:
        if (r6 == 1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzk k(zzek zzekVar) {
        int d;
        int d2;
        zzi zziVar = new zzi();
        byte[] n = zzekVar.n();
        zzej zzejVar = new zzej(n, n.length);
        zzejVar.l(zzekVar.w() * 8);
        int i = 1;
        zzejVar.o(1);
        int d3 = zzejVar.d(3);
        zzejVar.n(6);
        boolean p = zzejVar.p();
        boolean p2 = zzejVar.p();
        int i2 = 10;
        boolean z = false;
        if (d3 == 2) {
            if (p) {
                if (true == p2) {
                    i2 = 12;
                }
                zziVar.f(i2);
                zziVar.a(i2);
                int i3 = 13;
                zzejVar.n(13);
                zzejVar.m();
                d = zzejVar.d(4);
                if (d == 1) {
                    zzdx.e("BoxParsers", "Unsupported obu_type: " + d);
                    return zziVar.g();
                } else if (zzejVar.p()) {
                    zzdx.e("BoxParsers", "Unsupported obu_extension_flag");
                    return zziVar.g();
                } else {
                    boolean p3 = zzejVar.p();
                    zzejVar.m();
                    if (p3 && zzejVar.d(8) > 127) {
                        zzdx.e("BoxParsers", "Excessive obu_size");
                        return zziVar.g();
                    }
                    int d4 = zzejVar.d(3);
                    zzejVar.m();
                    if (zzejVar.p()) {
                        zzdx.e("BoxParsers", "Unsupported reduced_still_picture_header");
                        return zziVar.g();
                    } else if (zzejVar.p()) {
                        zzdx.e("BoxParsers", "Unsupported timing_info_present_flag");
                        return zziVar.g();
                    } else if (zzejVar.p()) {
                        zzdx.e("BoxParsers", "Unsupported initial_display_delay_present_flag");
                        return zziVar.g();
                    } else {
                        int d5 = zzejVar.d(5);
                        for (int i4 = 0; i4 <= d5; i4++) {
                            zzejVar.n(12);
                            if (zzejVar.d(5) > 7) {
                                zzejVar.m();
                            }
                        }
                        int d6 = zzejVar.d(4);
                        int d7 = zzejVar.d(4);
                        zzejVar.n(d6 + 1);
                        zzejVar.n(d7 + 1);
                        if (zzejVar.p()) {
                            zzejVar.n(7);
                        }
                        zzejVar.n(7);
                        boolean p4 = zzejVar.p();
                        if (p4) {
                            zzejVar.n(2);
                        }
                        if ((zzejVar.p() || zzejVar.d(1) > 0) && !zzejVar.p()) {
                            zzejVar.n(1);
                        }
                        if (p4) {
                            zzejVar.n(3);
                        }
                        zzejVar.n(3);
                        boolean p5 = zzejVar.p();
                        if (d4 == 2) {
                            if (p5) {
                                zzejVar.m();
                            }
                        }
                        if (zzejVar.p()) {
                            z = true;
                        }
                        if (zzejVar.p()) {
                            int d8 = zzejVar.d(8);
                            int d9 = zzejVar.d(8);
                            int d10 = zzejVar.d(8);
                            if (!z && d8 == 1) {
                                if (d9 == 13) {
                                    if (d10 == 0) {
                                        d2 = 1;
                                        d8 = 1;
                                        zziVar.c(zzk.a(d8));
                                        if (d2 != 1) {
                                            i = 2;
                                        }
                                        zziVar.b(i);
                                        zziVar.d(zzk.b(i3));
                                    } else {
                                        d8 = 1;
                                        d2 = zzejVar.d(1);
                                        zziVar.c(zzk.a(d8));
                                        if (d2 != 1) {
                                        }
                                        zziVar.b(i);
                                        zziVar.d(zzk.b(i3));
                                    }
                                } else {
                                    d8 = 1;
                                }
                            }
                            i3 = d9;
                            d2 = zzejVar.d(1);
                            zziVar.c(zzk.a(d8));
                            if (d2 != 1) {
                            }
                            zziVar.b(i);
                            zziVar.d(zzk.b(i3));
                        }
                        return zziVar.g();
                    }
                }
            }
            p = false;
            d3 = 2;
        }
        if (d3 <= 2) {
            if (true != p) {
                i2 = 8;
            }
            zziVar.f(i2);
            zziVar.a(i2);
        }
        int i32 = 13;
        zzejVar.n(13);
        zzejVar.m();
        d = zzejVar.d(4);
        if (d == 1) {
        }
    }

    @InterfaceC11300zs1
    public static zzav l(zzek zzekVar) {
        short e = zzekVar.e();
        zzekVar.m(2);
        String b2 = zzekVar.b(e, StandardCharsets.UTF_8);
        int max = Math.max(b2.lastIndexOf(43), b2.lastIndexOf(45));
        try {
            return new zzav(C10323vs.b, new zzfd(Float.parseFloat(b2.substring(0, max)), Float.parseFloat(b2.substring(max, b2.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static zzaid m(zzek zzekVar, int i) {
        zzekVar.l(i + 8);
        zzekVar.m(4);
        return new zzaid(zzekVar.O(), zzekVar.O());
    }

    public static zzaif n(zzek zzekVar, int i) {
        long j;
        zzekVar.l(i + 12);
        zzekVar.m(1);
        h(zzekVar);
        zzekVar.m(2);
        int G = zzekVar.G();
        if ((G & 128) != 0) {
            zzekVar.m(2);
        }
        if ((G & 64) != 0) {
            zzekVar.m(zzekVar.G());
        }
        if ((G & 32) != 0) {
            zzekVar.m(2);
        }
        zzekVar.m(1);
        h(zzekVar);
        String d = zzay.d(zzekVar.G());
        if (!C4128Rj1.I.equals(d) && !C4128Rj1.V.equals(d) && !C4128Rj1.W.equals(d)) {
            zzekVar.m(4);
            long O = zzekVar.O();
            long O2 = zzekVar.O();
            zzekVar.m(1);
            int h = h(zzekVar);
            long j2 = O2;
            byte[] bArr = new byte[h];
            zzekVar.h(bArr, 0, h);
            if (j2 <= 0) {
                j2 = -1;
            }
            if (O > 0) {
                j = O;
            } else {
                j = -1;
            }
            return new zzaif(d, bArr, j2, j);
        }
        return new zzaif(d, null, -1L, -1L);
    }

    public static ByteBuffer o() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static void p(zzek zzekVar, int i, int i2, int i3, int i4, @InterfaceC11300zs1 String str, boolean z, @InterfaceC11300zs1 zzs zzsVar, zzaik zzaikVar, int i5) throws zzaz {
        int i6;
        int i7;
        int K;
        int H;
        int A;
        int i8;
        String str2;
        long j;
        long j2;
        long j3;
        long j4;
        int i9;
        int i10;
        int i11;
        byte[] bArr;
        boolean z2;
        boolean z3;
        String format;
        zzek zzekVar2 = zzekVar;
        int i12 = i;
        int i13 = i3;
        zzs zzsVar2 = zzsVar;
        zzekVar2.l(i2 + 16);
        if (z) {
            i6 = zzekVar2.K();
            zzekVar2.m(6);
        } else {
            zzekVar2.m(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            i7 = 2;
            K = zzekVar2.K();
            zzekVar2.m(6);
            H = zzekVar2.H();
            zzekVar2.l(zzekVar2.w() - 4);
            A = zzekVar2.A();
            if (i6 == 1) {
                zzekVar2.m(16);
            }
            i8 = -1;
        } else if (i6 != 2) {
            return;
        } else {
            zzekVar2.m(16);
            H = (int) Math.round(Double.longBitsToDouble(zzekVar2.N()));
            int J = zzekVar2.J();
            zzekVar2.m(4);
            int J2 = zzekVar2.J();
            int J3 = zzekVar2.J();
            int i14 = J3 & 1;
            int i15 = J3 & 2;
            i7 = 2;
            if (i14 == 0) {
                if (J2 == 8) {
                    i8 = 3;
                } else if (J2 == 16) {
                    i8 = i15 != 0 ? 268435456 : 2;
                } else if (J2 == 24) {
                    i8 = i15 != 0 ? 1342177280 : 21;
                } else {
                    if (J2 == 32) {
                        i8 = i15 != 0 ? 1610612736 : 22;
                    }
                    i8 = -1;
                }
                zzekVar2.m(8);
                K = J;
                A = 0;
            } else {
                if (J2 == 32) {
                    i8 = 4;
                    zzekVar2.m(8);
                    K = J;
                    A = 0;
                }
                i8 = -1;
                zzekVar2.m(8);
                K = J;
                A = 0;
            }
        }
        if (i12 == 1767992678) {
            H = -1;
            K = -1;
        } else {
            if (i12 == 1935764850) {
                H = 8000;
            } else if (i12 == 1935767394) {
                H = 16000;
                i12 = 1935767394;
            }
            K = 1;
        }
        int w = zzekVar2.w();
        int i16 = AbstractC4501Vf.E0;
        if (i12 == 1701733217) {
            Pair j5 = j(zzekVar2, i2, i13);
            if (j5 != null) {
                i16 = ((Integer) j5.first).intValue();
                zzsVar2 = zzsVar2 == null ? null : zzsVar2.b(((zzaji) j5.second).b);
                zzaikVar.a[i5] = (zzaji) j5.second;
            }
            i12 = i16;
            zzekVar2.l(w);
        }
        if (i12 == 1633889587) {
            str2 = C4128Rj1.Q;
        } else if (i12 == 1700998451) {
            str2 = C4128Rj1.R;
        } else if (i12 == 1633889588) {
            str2 = C4128Rj1.T;
        } else if (i12 == 1685353315) {
            str2 = C4128Rj1.V;
        } else if (i12 == 1685353320 || i12 == 1685353324) {
            str2 = C4128Rj1.W;
        } else if (i12 == 1685353317) {
            str2 = C4128Rj1.X;
        } else if (i12 == 1685353336) {
            str2 = C4128Rj1.Y;
        } else if (i12 == 1935764850) {
            str2 = C4128Rj1.c0;
        } else if (i12 == 1935767394) {
            str2 = C4128Rj1.d0;
        } else {
            if (i12 != 1936684916) {
                if (i12 == 1953984371) {
                    str2 = C4128Rj1.N;
                    i8 = 268435456;
                } else if (i12 != 1819304813) {
                    str2 = (i12 == 778924082 || i12 == 778924083) ? C4128Rj1.I : i12 == 1835557169 ? C4128Rj1.L : i12 == 1835560241 ? C4128Rj1.M : i12 == 1634492771 ? C4128Rj1.f0 : i12 == 1634492791 ? C4128Rj1.O : i12 == 1970037111 ? C4128Rj1.P : i12 == 1332770163 ? C4128Rj1.a0 : i12 == 1716281667 ? C4128Rj1.e0 : i12 == 1835823201 ? C4128Rj1.U : i12 == 1767992678 ? "audio/iamf" : null;
                } else if (i8 != -1) {
                    str2 = C4128Rj1.N;
                }
            }
            str2 = C4128Rj1.N;
            i8 = i7;
        }
        String str3 = null;
        List list = null;
        zzaif zzaifVar = null;
        zzaid zzaidVar = null;
        while (w - i2 < i13) {
            zzekVar2.l(w);
            int A2 = zzekVar2.A();
            int i17 = i8;
            zzadr.b(A2 > 0, "childAtomSize must be positive");
            int A3 = zzekVar2.A();
            String str4 = str3;
            if (A3 == 1835557187) {
                zzekVar2.l(w + 8);
                zzekVar2.m(1);
                int G = zzekVar2.G();
                zzekVar2.m(1);
                if (Objects.equals(str2, C4128Rj1.M)) {
                    format = String.format("mhm1.%02X", Integer.valueOf(G));
                } else {
                    format = String.format("mha1.%02X", Integer.valueOf(G));
                }
                String str5 = format;
                int K2 = zzekVar2.K();
                byte[] bArr2 = new byte[K2];
                str4 = str5;
                z3 = false;
                zzekVar2.h(bArr2, 0, K2);
                if (list == null) {
                    list = zzfyc.G(bArr2);
                    i9 = A2;
                    str3 = str4;
                } else {
                    list = zzfyc.H(bArr2, (byte[]) list.get(0));
                    str3 = str4;
                    i9 = A2;
                }
            } else {
                if (A3 == 1835557200) {
                    zzekVar2.l(w + 8);
                    int G2 = zzekVar2.G();
                    if (G2 > 0) {
                        byte[] bArr3 = new byte[G2];
                        z3 = false;
                        zzekVar2.h(bArr3, 0, G2);
                        if (list == null) {
                            list = zzfyc.G(bArr3);
                            i9 = A2;
                            str3 = str4;
                        } else {
                            list = zzfyc.H((byte[]) list.get(0), bArr3);
                            str3 = str4;
                            i9 = A2;
                        }
                    } else {
                        i9 = A2;
                    }
                } else {
                    if (A3 == 1702061171) {
                        i9 = A2;
                        i10 = w;
                        i11 = -1;
                    } else if (z && A3 == 2002876005) {
                        int w2 = zzekVar2.w();
                        zzadr.b(w2 >= w, null);
                        int i18 = w2;
                        while (true) {
                            if (i18 - w >= A2) {
                                i9 = A2;
                                i10 = -1;
                                break;
                            }
                            zzekVar2.l(i18);
                            int A4 = zzekVar2.A();
                            if (A4 > 0) {
                                i9 = A2;
                                z2 = true;
                            } else {
                                i9 = A2;
                                z2 = false;
                            }
                            zzadr.b(z2, "childAtomSize must be positive");
                            if (zzekVar2.A() == 1702061171) {
                                i10 = i18;
                                break;
                            } else {
                                i18 += A4;
                                A2 = i9;
                            }
                        }
                        i11 = -1;
                    } else {
                        i9 = A2;
                        if (A3 == 1651798644) {
                            zzaidVar = m(zzekVar2, w);
                        } else if (A3 == 1684103987) {
                            zzekVar2.l(w + 8);
                            zzaikVar.b = zzacn.c(zzekVar2, Integer.toString(i4), str, zzsVar2);
                        } else if (A3 == 1684366131) {
                            zzekVar2.l(w + 8);
                            zzaikVar.b = zzacn.d(zzekVar2, Integer.toString(i4), str, zzsVar2);
                        } else if (A3 == 1684103988) {
                            zzekVar2.l(w + 8);
                            zzaikVar.b = zzacr.a(zzekVar2, Integer.toString(i4), str, zzsVar2);
                        } else if (A3 == 1684892784) {
                            if (A <= 0) {
                                throw zzaz.a("Invalid sample rate for Dolby TrueHD MLP stream: " + A, null);
                            }
                            str3 = str4;
                            H = A;
                            K = i7;
                        } else if (A3 == 1684305011 || A3 == 1969517683) {
                            zzx zzxVar = new zzx();
                            zzxVar.n(i4);
                            zzxVar.E(str2);
                            zzxVar.b(K);
                            zzxVar.F(H);
                            zzxVar.h(zzsVar2);
                            zzxVar.s(str);
                            zzaikVar.b = zzxVar.K();
                        } else if (A3 == 1682927731) {
                            int i19 = i9 - 8;
                            byte[] bArr4 = a;
                            int length = bArr4.length;
                            byte[] copyOf = Arrays.copyOf(bArr4, length + i19);
                            zzekVar2.l(w + 8);
                            zzekVar2.h(copyOf, length, i19);
                            list = zzaei.e(copyOf);
                        } else if (A3 == 1684425825) {
                            byte[] bArr5 = new byte[i9 - 8];
                            bArr5[0] = 102;
                            bArr5[1] = 76;
                            bArr5[i7] = 97;
                            bArr5[3] = 67;
                            zzekVar2.l(w + 12);
                            zzekVar2.h(bArr5, 4, i9 - 12);
                            list = zzfyc.G(bArr5);
                        } else if (A3 == 1634492771) {
                            int i20 = i9 - 12;
                            byte[] bArr6 = new byte[i20];
                            zzekVar2.l(w + 12);
                            zzekVar2.h(bArr6, 0, i20);
                            int i21 = zzdh.d;
                            zzek zzekVar3 = new zzek(bArr6);
                            zzekVar3.l(9);
                            int G3 = zzekVar3.G();
                            zzekVar3.l(20);
                            Pair create = Pair.create(Integer.valueOf(zzekVar3.J()), Integer.valueOf(G3));
                            H = ((Integer) create.first).intValue();
                            int intValue = ((Integer) create.second).intValue();
                            list = zzfyc.G(bArr6);
                            str3 = str4;
                            K = intValue;
                        } else if (A3 == 1767990114) {
                            zzekVar2.l(w + 9);
                            int b2 = zzgbf.b(zzekVar2.P());
                            byte[] bArr7 = new byte[b2];
                            zzekVar2.h(bArr7, 0, b2);
                            list = zzfyc.G(bArr7);
                        }
                        str3 = str4;
                    }
                    if (i10 != i11) {
                        zzaifVar = n(zzekVar2, i10);
                        str2 = zzaifVar.a;
                        bArr = zzaifVar.b;
                        if (bArr != null) {
                            if ("audio/vorbis".equals(str2)) {
                                zzek zzekVar4 = new zzek(bArr);
                                int i22 = 1;
                                zzekVar4.m(1);
                                int i23 = 0;
                                while (zzekVar4.u() > 0 && zzekVar4.z() == 255) {
                                    zzekVar4.m(i22);
                                    i23 += 255;
                                    i22 = 1;
                                }
                                int G4 = i23 + zzekVar4.G();
                                int i24 = 0;
                                while (zzekVar4.u() > 0 && zzekVar4.z() == 255) {
                                    zzekVar4.m(1);
                                    i24 += 255;
                                }
                                int G5 = i24 + zzekVar4.G();
                                byte[] bArr8 = new byte[G4];
                                int w3 = zzekVar4.w();
                                System.arraycopy(bArr, w3, bArr8, 0, G4);
                                int i25 = w3 + G4 + G5;
                                int length2 = bArr.length - i25;
                                byte[] bArr9 = new byte[length2];
                                System.arraycopy(bArr, i25, bArr9, 0, length2);
                                list = zzfyc.H(bArr8, bArr9);
                                str3 = str4;
                            } else {
                                if ("audio/mp4a-latm".equals(str2)) {
                                    zzaci a2 = zzack.a(bArr);
                                    H = a2.a;
                                    K = a2.b;
                                    str3 = a2.c;
                                } else {
                                    str3 = str4;
                                }
                                list = zzfyc.G(bArr);
                            }
                        }
                    }
                }
                str3 = str4;
            }
            w += i9;
            zzekVar2 = zzekVar;
            i13 = i3;
            i8 = i17;
        }
        int i26 = i8;
        String str6 = str3;
        if (zzaikVar.b != null || str2 == null) {
            return;
        }
        zzx zzxVar2 = new zzx();
        zzxVar2.n(i4);
        zzxVar2.E(str2);
        zzxVar2.c(str6);
        zzxVar2.b(K);
        zzxVar2.F(H);
        zzxVar2.x(i26);
        zzxVar2.p(list);
        zzxVar2.h(zzsVar2);
        zzxVar2.s(str);
        if (zzaifVar != null) {
            j3 = zzaifVar.c;
            zzxVar2.a(zzgbf.f(j3));
            j4 = zzaifVar.d;
            zzxVar2.y(zzgbf.f(j4));
        } else if (zzaidVar != null) {
            j = zzaidVar.a;
            zzxVar2.a(zzgbf.f(j));
            j2 = zzaidVar.b;
            zzxVar2.y(zzgbf.f(j2));
        }
        zzaikVar.b = zzxVar2.K();
    }
}
