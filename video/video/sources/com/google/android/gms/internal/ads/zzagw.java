package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import o.C4128Rj1;
import o.InterfaceC11300zs1;
import o.KL0;

/* loaded from: classes2.dex */
public final class zzagw {
    public static final zzagu a = new Object() { // from class: com.google.android.gms.internal.ads.zzagu
    };

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final zzav a(byte[] bArr, int i, zzagu zzaguVar, zzagi zzagiVar) {
        boolean z;
        zzagv zzagvVar;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        zzek zzekVar = new zzek(bArr, i);
        boolean z3 = false;
        int i9 = 10;
        if (zzekVar.u() < 10) {
            zzdx.f(KL0.c, "Data too short to be an ID3 tag");
        } else {
            int I = zzekVar.I();
            if (I != 4801587) {
                zzdx.f(KL0.c, "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(I))));
            } else {
                int G = zzekVar.G();
                zzekVar.m(1);
                int G2 = zzekVar.G();
                int F = zzekVar.F();
                if (G == 2) {
                    if ((G2 & 64) != 0) {
                        zzdx.f(KL0.c, "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    if (G >= 4 && (G2 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzagvVar = new zzagv(G, z, F);
                } else {
                    if (G == 3) {
                        if ((G2 & 64) != 0) {
                            int A = zzekVar.A();
                            zzekVar.m(A);
                            F -= A + 4;
                        }
                    } else if (G == 4) {
                        if ((G2 & 64) != 0) {
                            int F2 = zzekVar.F();
                            zzekVar.m(F2 - 4);
                            F -= F2;
                        }
                        if ((G2 & 16) != 0) {
                            F -= 10;
                        }
                    } else {
                        zzdx.f(KL0.c, "Skipped ID3 tag with unsupported majorVersion=" + G);
                    }
                    if (G >= 4) {
                    }
                    z = false;
                    zzagvVar = new zzagv(G, z, F);
                }
                if (zzagvVar != null) {
                    return null;
                }
                int w = zzekVar.w();
                i2 = zzagvVar.a;
                if (i2 == 2) {
                    i9 = 6;
                }
                i3 = zzagvVar.c;
                z2 = zzagvVar.b;
                if (z2) {
                    i8 = zzagvVar.c;
                    i3 = e(zzekVar, i8);
                }
                zzekVar.k(w + i3);
                i4 = zzagvVar.a;
                if (!j(zzekVar, i4, i9, false)) {
                    i6 = zzagvVar.a;
                    if (i6 != 4 || !j(zzekVar, 4, i9, true)) {
                        i7 = zzagvVar.a;
                        zzdx.f(KL0.c, "Failed to validate ID3 tag with majorVersion=" + i7);
                        return null;
                    }
                    z3 = true;
                }
                while (zzekVar.u() >= i9) {
                    i5 = zzagvVar.a;
                    zzagx l = l(i5, zzekVar, z3, i9, zzaguVar);
                    if (l != null) {
                        arrayList.add(l);
                    }
                }
                return new zzav(arrayList);
            }
        }
        zzagvVar = null;
        if (zzagvVar != null) {
        }
    }

    public static int b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static int c(byte[] bArr, int i, int i2) {
        int d = d(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return d;
        }
        while (true) {
            int length = bArr.length;
            if (d < length - 1) {
                int i3 = d + 1;
                if ((d - i) % 2 == 0 && bArr[i3] == 0) {
                    return d;
                }
                d = d(bArr, i3);
            } else {
                return length;
            }
        }
    }

    public static int d(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i < length) {
                if (bArr[i] == 0) {
                    return i;
                }
                i++;
            } else {
                return length;
            }
        }
    }

    public static int e(zzek zzekVar, int i) {
        byte[] n = zzekVar.n();
        int w = zzekVar.w();
        int i2 = w;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < w + i) {
                if ((n[i2] & 255) == 255 && n[i3] == 0) {
                    System.arraycopy(n, i2 + 2, n, i3, (i - (i2 - w)) - 2);
                    i--;
                }
                i2 = i3;
            } else {
                return i;
            }
        }
    }

    public static zzfyc f(byte[] bArr, int i, int i2) {
        if (i2 >= bArr.length) {
            return zzfyc.G("");
        }
        int i3 = zzfyc.Z;
        zzfxz zzfxzVar = new zzfxz();
        int c = c(bArr, i2, i);
        while (i2 < c) {
            zzfxzVar.g(new String(bArr, i2, c - i2, i(i)));
            i2 = b(i) + c;
            c = c(bArr, i2, i);
        }
        zzfyc j = zzfxzVar.j();
        if (j.isEmpty()) {
            return zzfyc.G("");
        }
        return j;
    }

    public static String g(byte[] bArr, int i, int i2, Charset charset) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, charset);
    }

    public static String h(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static Charset i(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return StandardCharsets.ISO_8859_1;
                }
                return StandardCharsets.UTF_8;
            }
            return StandardCharsets.UTF_16BE;
        }
        return StandardCharsets.UTF_16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean j(zzek zzekVar, int i, int i2, boolean z) {
        boolean z2;
        int I;
        long I2;
        int i3;
        int i4;
        int w = zzekVar.w();
        while (true) {
            try {
                z2 = true;
                z2 = true;
                int i5 = 1;
                int i6 = 1;
                if (zzekVar.u() < i2) {
                    break;
                }
                if (i >= 3) {
                    I = zzekVar.A();
                    I2 = zzekVar.O();
                    i3 = zzekVar.K();
                } else {
                    I = zzekVar.I();
                    I2 = zzekVar.I();
                    i3 = 0;
                }
                if (I != 0 || I2 != 0 || i3 != 0) {
                    if (i == 4 && !z) {
                        if ((8421504 & I2) != 0) {
                            break;
                        }
                        long j = I2 & 255;
                        long j2 = I2 >> 8;
                        I2 = ((I2 >> 24) << 21) | (((I2 >> 16) & 255) << 14) | j | ((j2 & 255) << 7);
                    }
                    if (i == 4) {
                        if ((i3 & 64) == 0) {
                            i5 = 0;
                        }
                        int i7 = i5;
                        i6 = i3 & 1;
                        i4 = i7;
                    } else if (i == 3) {
                        if ((i3 & 32) != 0) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        if ((i3 & 128) == 0) {
                            i6 = 0;
                        }
                    } else {
                        i4 = 0;
                        i6 = 0;
                    }
                    if (i6 != 0) {
                        i4 += 4;
                    }
                    if (I2 >= i4 && zzekVar.u() >= I2) {
                        zzekVar.m((int) I2);
                    }
                }
            } finally {
                zzekVar.l(w);
            }
        }
        return z2;
    }

    public static byte[] k(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return zzeu.b;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:80|(2:82|(1:88)(1:87))|89|90|(2:92|(4:110|111|112|(8:114|(9:119|120|(3:122|(1:124)|125)(2:129|(1:131))|126|127|128|54|(0)|57)|132|133|(2:(1:(1:(2:212|213)(4:207|(1:209)|210|211))(11:176|(1:178)(1:199)|179|(1:181)|182|183|(4:186|(3:188|189|190)(1:192)|191|184)|193|194|(1:196)(1:198)|197))(8:151|(1:153)|154|(1:156)|157|(4:160|(3:162|163|164)(1:166)|165|158)|167|168)|169)(2:141|(2:143|75)(1:144))|54|(0)|57)(13:214|(1:(1:(0)))|132|133|(1:135)|(1:146)|(1:171)|(1:201)|212|213|54|(0)|57))(2:95|(7:99|100|101|102|54|(0)|57)(1:98)))|223|111|112|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x017e, code lost:
        r20 = r4;
        r22 = o.KL0.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0291, code lost:
        if (r9 == 67) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x030f, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0312, code lost:
        r0 = e;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0503  */
    @InterfaceC11300zs1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzagx l(int i, zzek zzekVar, boolean z, int i2, @InterfaceC11300zs1 zzagu zzaguVar) {
        int I;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        int i5;
        String str;
        zzagx zzagxVar;
        int i6;
        zzahc zzagpVar;
        zzagx zzahaVar;
        int d;
        String a2;
        int G = zzekVar.G();
        int G2 = zzekVar.G();
        int G3 = zzekVar.G();
        int G4 = i >= 3 ? zzekVar.G() : 0;
        if (i == 4) {
            I = zzekVar.J();
            if (!z) {
                I = ((I >> 24) << 21) | (I & 255) | (((I >> 8) & 255) << 7) | (((I >> 16) & 255) << 14);
            }
        } else if (i == 3) {
            I = zzekVar.J();
        } else {
            I = zzekVar.I();
        }
        int K = i >= 3 ? zzekVar.K() : 0;
        if (G == 0 && G2 == 0 && G3 == 0 && G4 == 0 && I == 0 && K == 0) {
            zzekVar.l(zzekVar.x());
            return null;
        }
        int w = zzekVar.w() + I;
        if (w > zzekVar.x()) {
            zzdx.f(KL0.c, "Frame size exceeds remaining tag data");
            zzekVar.l(zzekVar.x());
            return null;
        } else if (zzaguVar == null) {
            if (i == 3) {
                int i7 = K & 64;
                i3 = (K & 128) != 0 ? 1 : 0;
                i5 = 0;
                z3 = i7 != 0;
                z2 = (K & 32) != 0;
                i4 = i3;
            } else if (i == 4) {
                boolean z4 = (K & 64) != 0;
                int i8 = (K & 8) != 0 ? 1 : 0;
                z3 = (K & 4) != 0;
                i5 = (K & 2) != 0 ? 1 : 0;
                i4 = K & 1;
                int i9 = i8;
                z2 = z4;
                i3 = i9;
            } else {
                i3 = 0;
                i4 = 0;
                z2 = false;
                z3 = false;
                i5 = 0;
            }
            if (i3 == 0 && !z3) {
                if (z2) {
                    zzekVar.m(1);
                    I--;
                }
                if (i4 != 0) {
                    zzekVar.m(4);
                    I -= 4;
                }
                if (i5 != 0) {
                    I = e(zzekVar, I);
                }
                try {
                    try {
                    } catch (Exception e) {
                        e = e;
                        i5 = G;
                        str = KL0.c;
                        zzekVar.l(w);
                        zzagxVar = null;
                        if (zzagxVar == null) {
                        }
                        return zzagxVar;
                    } catch (OutOfMemoryError e2) {
                        e = e2;
                        i5 = G;
                        str = KL0.c;
                        zzekVar.l(w);
                        zzagxVar = null;
                        if (zzagxVar == null) {
                        }
                        return zzagxVar;
                    }
                    if (G == 84 && G2 == 88 && G3 == 88 && (i == 2 || G4 == 88)) {
                        if (I > 0) {
                            int G5 = zzekVar.G();
                            int i10 = I - 1;
                            byte[] bArr = new byte[i10];
                            zzekVar.h(bArr, 0, i10);
                            int c = c(bArr, 0, G5);
                            zzagpVar = new zzahc("TXXX", new String(bArr, 0, c, i(G5)), f(bArr, G5, c + b(G5)));
                            i5 = G;
                            str = KL0.c;
                            zzekVar.l(w);
                            zzagxVar = zzagpVar;
                            e = null;
                            if (zzagxVar == null) {
                            }
                            return zzagxVar;
                        }
                        i5 = G;
                        str = KL0.c;
                        zzagpVar = null;
                        zzekVar.l(w);
                        zzagxVar = zzagpVar;
                        e = null;
                        if (zzagxVar == null) {
                        }
                        return zzagxVar;
                    } else if (G == 84) {
                        String h = h(i, 84, G2, G3, G4);
                        if (I > 0) {
                            int G6 = zzekVar.G();
                            int i11 = I - 1;
                            byte[] bArr2 = new byte[i11];
                            zzekVar.h(bArr2, 0, i11);
                            i5 = G;
                            zzagpVar = new zzahc(h, null, f(bArr2, G6, 0));
                            str = KL0.c;
                            zzekVar.l(w);
                            zzagxVar = zzagpVar;
                            e = null;
                            if (zzagxVar == null) {
                            }
                            return zzagxVar;
                        }
                        i5 = G;
                        str = KL0.c;
                        zzagpVar = null;
                        zzekVar.l(w);
                        zzagxVar = zzagpVar;
                        e = null;
                        if (zzagxVar == null) {
                            zzdx.g(str, "Failed to decode frame: id=" + h(i, i5, G2, G3, G4) + ", frameSize=" + I, e);
                        }
                        return zzagxVar;
                    } else {
                        if (G == 87) {
                            if (G2 != 88 || G3 != 88 || (i != 2 && G4 != 88)) {
                                i6 = 87;
                            }
                            int G7 = zzekVar.G();
                            int i12 = I - 1;
                            byte[] bArr3 = new byte[i12];
                            zzekVar.h(bArr3, 0, i12);
                            int c2 = c(bArr3, 0, G7);
                            String str2 = new String(bArr3, 0, c2, i(G7));
                            int b = c2 + b(G7);
                            zzagpVar = new zzahd("WXXX", str2, g(bArr3, b, d(bArr3, b), StandardCharsets.ISO_8859_1));
                            i5 = G;
                            str = KL0.c;
                            zzekVar.l(w);
                            zzagxVar = zzagpVar;
                            e = null;
                            if (zzagxVar == null) {
                            }
                            return zzagxVar;
                        }
                        i6 = G;
                        if (i6 == 87) {
                            String h2 = h(i, 87, G2, G3, G4);
                            byte[] bArr4 = new byte[I];
                            zzekVar.h(bArr4, 0, I);
                            zzagpVar = new zzahd(h2, null, new String(bArr4, 0, d(bArr4, 0), StandardCharsets.ISO_8859_1));
                        } else {
                            if (i6 == 80) {
                                if (G2 == 82 && G3 == 73 && G4 == 86) {
                                    byte[] bArr5 = new byte[I];
                                    zzekVar.h(bArr5, 0, I);
                                    int d2 = d(bArr5, 0);
                                    zzagpVar = new zzahb(new String(bArr5, 0, d2, StandardCharsets.ISO_8859_1), k(bArr5, d2 + 1, I));
                                } else {
                                    i6 = 80;
                                }
                            }
                            try {
                            } catch (Exception e3) {
                                e = e3;
                            } catch (OutOfMemoryError e4) {
                                e = e4;
                            }
                            if (i6 == 71) {
                                if (G2 != 69 || G3 != 79) {
                                    str = KL0.c;
                                    i6 = 71;
                                    if (i == 2) {
                                        if (i6 == 65) {
                                            if (G2 == 80) {
                                                if (G3 == 73) {
                                                }
                                            }
                                        }
                                        i5 = G;
                                        if (i6 == 67) {
                                        }
                                        if (i6 != 67) {
                                        }
                                        if (i6 != 67) {
                                        }
                                        if (i6 != 77) {
                                        }
                                        String h3 = h(i, i6, G2, G3, G4);
                                        byte[] bArr6 = new byte[I];
                                        zzekVar.h(bArr6, 0, I);
                                        zzagpVar = new zzagp(h3, bArr6);
                                        zzekVar.l(w);
                                        zzagxVar = zzagpVar;
                                        e = null;
                                        if (zzagxVar == null) {
                                        }
                                        return zzagxVar;
                                    }
                                    if (i6 == 80 && G2 == 73 && G3 == 67) {
                                        int G8 = zzekVar.G();
                                        Charset i13 = i(G8);
                                        int i14 = I - 1;
                                        byte[] bArr7 = new byte[i14];
                                        zzekVar.h(bArr7, 0, i14);
                                        if (i == 2) {
                                            a2 = "image/".concat(String.valueOf(zzfui.a(new String(bArr7, 0, 3, StandardCharsets.ISO_8859_1))));
                                            if ("image/jpg".equals(a2)) {
                                                a2 = C4128Rj1.R0;
                                            }
                                            d = 2;
                                        } else {
                                            d = d(bArr7, 0);
                                            a2 = zzfui.a(new String(bArr7, 0, d, StandardCharsets.ISO_8859_1));
                                            if (a2.indexOf(47) == -1) {
                                                a2 = "image/".concat(a2);
                                            }
                                        }
                                        int i15 = bArr7[d + 1] & 255;
                                        int i16 = d + 2;
                                        int c3 = c(bArr7, i16, G8);
                                        i5 = G;
                                        zzagpVar = new zzago(a2, new String(bArr7, i16, c3 - i16, i13), i15, k(bArr7, c3 + b(G8), i14));
                                        zzekVar.l(w);
                                        zzagxVar = zzagpVar;
                                        e = null;
                                        if (zzagxVar == null) {
                                        }
                                        return zzagxVar;
                                    }
                                    i5 = G;
                                    if (i6 == 67 || G2 != 79 || G3 != 77 || (G4 != 77 && i != 2)) {
                                        if (i6 != 67 && G2 == 72 && G3 == 65 && G4 == 80) {
                                            int w2 = zzekVar.w();
                                            int d3 = d(zzekVar.n(), w2);
                                            String str3 = new String(zzekVar.n(), w2, d3 - w2, StandardCharsets.ISO_8859_1);
                                            zzekVar.l(d3 + 1);
                                            int A = zzekVar.A();
                                            int A2 = zzekVar.A();
                                            long O = zzekVar.O();
                                            if (O == 4294967295L) {
                                                O = -1;
                                            }
                                            long j = O;
                                            long O2 = zzekVar.O();
                                            if (O2 == 4294967295L) {
                                                O2 = -1;
                                            }
                                            long j2 = O2;
                                            ArrayList arrayList = new ArrayList();
                                            int i17 = w2 + I;
                                            while (zzekVar.w() < i17) {
                                                zzagx l = l(i, zzekVar, z, i2, null);
                                                if (l != null) {
                                                    arrayList.add(l);
                                                }
                                            }
                                            zzahaVar = new zzagq(str3, A, A2, j, j2, (zzagx[]) arrayList.toArray(new zzagx[0]));
                                        } else if (i6 != 67 && G2 == 84 && G3 == 79 && G4 == 67) {
                                            int w3 = zzekVar.w();
                                            int d4 = d(zzekVar.n(), w3);
                                            String str4 = new String(zzekVar.n(), w3, d4 - w3, StandardCharsets.ISO_8859_1);
                                            zzekVar.l(d4 + 1);
                                            int G9 = zzekVar.G();
                                            boolean z5 = (G9 & 2) != 0;
                                            int i18 = G9 & 1;
                                            int G10 = zzekVar.G();
                                            String[] strArr = new String[G10];
                                            int i19 = 0;
                                            while (i19 < G10) {
                                                int w4 = zzekVar.w();
                                                int i20 = w3;
                                                int d5 = d(zzekVar.n(), w4);
                                                String[] strArr2 = strArr;
                                                strArr2[i19] = new String(zzekVar.n(), w4, d5 - w4, StandardCharsets.ISO_8859_1);
                                                zzekVar.l(d5 + 1);
                                                i19++;
                                                w3 = i20;
                                                G10 = G10;
                                                str4 = str4;
                                                strArr = strArr2;
                                            }
                                            int i21 = w3;
                                            String str5 = str4;
                                            String[] strArr3 = strArr;
                                            ArrayList arrayList2 = new ArrayList();
                                            int i22 = i21 + I;
                                            while (zzekVar.w() < i22) {
                                                zzagx l2 = l(i, zzekVar, z, i2, null);
                                                if (l2 != null) {
                                                    arrayList2.add(l2);
                                                }
                                            }
                                            zzahaVar = new zzagr(str5, z5, 1 == i18, strArr3, (zzagx[]) arrayList2.toArray(new zzagx[0]));
                                        } else if (i6 != 77 && G2 == 76 && G3 == 76 && G4 == 84) {
                                            int K2 = zzekVar.K();
                                            int I2 = zzekVar.I();
                                            int I3 = zzekVar.I();
                                            int G11 = zzekVar.G();
                                            int G12 = zzekVar.G();
                                            zzej zzejVar = new zzej();
                                            zzejVar.j(zzekVar);
                                            int i23 = ((I - 10) * 8) / (G11 + G12);
                                            int[] iArr = new int[i23];
                                            int[] iArr2 = new int[i23];
                                            for (int i24 = 0; i24 < i23; i24++) {
                                                int d6 = zzejVar.d(G11);
                                                int d7 = zzejVar.d(G12);
                                                iArr[i24] = d6;
                                                iArr2[i24] = d7;
                                            }
                                            zzahaVar = new zzaha(K2, I2, I3, iArr, iArr2);
                                        } else {
                                            String h32 = h(i, i6, G2, G3, G4);
                                            byte[] bArr62 = new byte[I];
                                            zzekVar.h(bArr62, 0, I);
                                            zzagpVar = new zzagp(h32, bArr62);
                                        }
                                        zzagpVar = zzahaVar;
                                    } else if (I < 4) {
                                        zzagpVar = null;
                                    } else {
                                        int G13 = zzekVar.G();
                                        Charset i25 = i(G13);
                                        byte[] bArr8 = new byte[3];
                                        zzekVar.h(bArr8, 0, 3);
                                        String str6 = new String(bArr8, 0, 3);
                                        int i26 = I - 4;
                                        byte[] bArr9 = new byte[i26];
                                        zzekVar.h(bArr9, 0, i26);
                                        int c4 = c(bArr9, 0, G13);
                                        String str7 = new String(bArr9, 0, c4, i25);
                                        int b2 = c4 + b(G13);
                                        zzagpVar = new zzags(str6, str7, g(bArr9, b2, c(bArr9, b2, G13), i25));
                                    }
                                    zzekVar.l(w);
                                    zzagxVar = zzagpVar;
                                    e = null;
                                    if (zzagxVar == null) {
                                    }
                                    return zzagxVar;
                                } else if (G4 == 66 || i == 2) {
                                    try {
                                        int G14 = zzekVar.G();
                                        Charset i27 = i(G14);
                                        int i28 = I - 1;
                                        byte[] bArr10 = new byte[i28];
                                        zzekVar.h(bArr10, 0, i28);
                                        int d8 = d(bArr10, 0);
                                        str = KL0.c;
                                        String e5 = zzay.e(new String(bArr10, 0, d8, StandardCharsets.ISO_8859_1));
                                        int i29 = d8 + 1;
                                        int c5 = c(bArr10, i29, G14);
                                        String g = g(bArr10, i29, c5, i27);
                                        int b3 = c5 + b(G14);
                                        int c6 = c(bArr10, b3, G14);
                                        i5 = G;
                                        zzagpVar = new zzagt(e5, g, g(bArr10, b3, c6, i27), k(bArr10, c6 + b(G14), i28));
                                        zzekVar.l(w);
                                        zzagxVar = zzagpVar;
                                        e = null;
                                    } catch (Exception e6) {
                                        e = e6;
                                        str = KL0.c;
                                        i5 = G;
                                        zzekVar.l(w);
                                        zzagxVar = null;
                                        if (zzagxVar == null) {
                                        }
                                        return zzagxVar;
                                    } catch (OutOfMemoryError e7) {
                                        e = e7;
                                        str = KL0.c;
                                        i5 = G;
                                        zzekVar.l(w);
                                        zzagxVar = null;
                                        if (zzagxVar == null) {
                                        }
                                        return zzagxVar;
                                    }
                                    if (zzagxVar == null) {
                                    }
                                    return zzagxVar;
                                } else {
                                    i6 = 71;
                                }
                            }
                            str = KL0.c;
                            if (i == 2) {
                            }
                        }
                        i5 = G;
                        str = KL0.c;
                        zzekVar.l(w);
                        zzagxVar = zzagpVar;
                        e = null;
                        if (zzagxVar == null) {
                        }
                        return zzagxVar;
                    }
                } catch (Throwable th) {
                    zzekVar.l(w);
                    throw th;
                }
            }
            zzdx.f(KL0.c, "Skipping unsupported compressed or encrypted frame");
            zzekVar.l(w);
            return null;
        } else {
            zzekVar.l(w);
            return null;
        }
    }
}
