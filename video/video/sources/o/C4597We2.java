package o;

import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: o.We2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4597We2 {
    public static final String a;
    public static final String b = "SJIS";
    public static final String c = "GB2312";
    public static final String d = "EUC_JP";
    public static final String e = "UTF8";
    public static final String f = "ISO8859_1";
    public static final boolean g;

    static {
        boolean z;
        String name = Charset.defaultCharset().name();
        a = name;
        if (!b.equalsIgnoreCase(name) && !d.equalsIgnoreCase(name)) {
            z = false;
        } else {
            z = true;
        }
        g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(byte[] bArr, Map<XV, ?> map) {
        boolean z;
        boolean z2;
        byte[] bArr2 = bArr;
        if (map != null) {
            XV xv = XV.CHARACTER_SET;
            if (map.containsKey(xv)) {
                return map.get(xv).toString();
            }
        }
        int length = bArr2.length;
        boolean z3 = true;
        int i = 0;
        if (bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = true;
        boolean z5 = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i3 < length && (z3 || z4 || z5)) {
            byte b2 = bArr2[i3];
            int i13 = b2 & 255;
            if (z5) {
                if (i4 > 0) {
                    if ((b2 & 128) != 0) {
                        i4--;
                    } else {
                        z2 = z;
                    }
                } else {
                    z2 = z;
                    if ((b2 & 128) != 0) {
                        if ((b2 & 64) != 0) {
                            int i14 = i4 + 1;
                            if ((b2 & 32) == 0) {
                                i6++;
                            } else {
                                i14 = i4 + 2;
                                if ((b2 & C8077mf.r) == 0) {
                                    i7++;
                                } else {
                                    i4 += 3;
                                    if ((b2 & 8) == 0) {
                                        i8++;
                                    }
                                }
                            }
                            i4 = i14;
                        }
                    }
                    if (z3) {
                        if (i13 > 127 && i13 < 160) {
                            z3 = false;
                        } else if (i13 > 159 && (i13 < 192 || i13 == 215 || i13 == 247)) {
                            i10++;
                        }
                    }
                    if (z4) {
                        if (i5 > 0) {
                            if (i13 >= 64 && i13 != 127 && i13 <= 252) {
                                i5--;
                            }
                            z4 = false;
                        } else {
                            if (i13 != 128 && i13 != 160 && i13 <= 239) {
                                if (i13 > 160 && i13 < 224) {
                                    i2++;
                                    int i15 = i12 + 1;
                                    if (i15 > i9) {
                                        i9 = i15;
                                        i12 = i9;
                                    } else {
                                        i12 = i15;
                                    }
                                    i11 = 0;
                                } else {
                                    if (i13 > 127) {
                                        i5++;
                                        int i16 = i11 + 1;
                                        if (i16 > i) {
                                            i = i16;
                                            i11 = i;
                                        } else {
                                            i11 = i16;
                                        }
                                    } else {
                                        i11 = 0;
                                    }
                                    i12 = 0;
                                }
                            }
                            z4 = false;
                        }
                    }
                    i3++;
                    bArr2 = bArr;
                    z = z2;
                }
                z5 = false;
                if (z3) {
                }
                if (z4) {
                }
                i3++;
                bArr2 = bArr;
                z = z2;
            }
            z2 = z;
            if (z3) {
            }
            if (z4) {
            }
            i3++;
            bArr2 = bArr;
            z = z2;
        }
        boolean z6 = z;
        if (z5 && i4 > 0) {
            z5 = false;
        }
        if (z4 && i5 > 0) {
            z4 = false;
        }
        if (z5 && (z6 || i6 + i7 + i8 > 0)) {
            return e;
        }
        if (z4 && (g || i9 >= 3 || i >= 3)) {
            return b;
        }
        if (z3 && z4) {
            if ((i9 == 2 && i2 == 2) || i10 * 10 >= length) {
                return b;
            }
            return f;
        } else if (z3) {
            return f;
        } else {
            if (z4) {
                return b;
            }
            if (z5) {
                return e;
            }
            return a;
        }
    }
}
