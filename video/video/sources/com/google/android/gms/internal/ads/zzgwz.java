package com.google.android.gms.internal.ads;

import java.io.IOException;
import o.C8077mf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgwz {
    public static volatile int a = 100;
    public static final /* synthetic */ int b = 0;

    public static int a(byte[] bArr, int i, zzgwy zzgwyVar) throws zzgzh {
        int h = h(bArr, i, zzgwyVar);
        int i2 = zzgwyVar.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - h) {
                if (i2 == 0) {
                    zzgwyVar.c = zzgxk.Y;
                    return h;
                }
                zzgwyVar.c = zzgxk.U(bArr, h, i2);
                return h + i2;
            }
            throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int b(byte[] bArr, int i) {
        int i2 = (bArr[i + 1] & 255) << 8;
        return ((bArr[i + 3] & 255) << 24) | i2 | (bArr[i] & 255) | ((bArr[i + 2] & 255) << 16);
    }

    public static int c(zzhaw zzhawVar, byte[] bArr, int i, int i2, int i3, zzgwy zzgwyVar) throws IOException {
        Object d = zzhawVar.d();
        int l = l(d, zzhawVar, bArr, i, i2, i3, zzgwyVar);
        zzhawVar.e(d);
        zzgwyVar.c = d;
        return l;
    }

    public static int d(zzhaw zzhawVar, byte[] bArr, int i, int i2, zzgwy zzgwyVar) throws IOException {
        Object d = zzhawVar.d();
        int m = m(d, zzhawVar, bArr, i, i2, zzgwyVar);
        zzhawVar.e(d);
        zzgwyVar.c = d;
        return m;
    }

    public static int e(zzhaw zzhawVar, int i, byte[] bArr, int i2, int i3, zzgze zzgzeVar, zzgwy zzgwyVar) throws IOException {
        int d = d(zzhawVar, bArr, i2, i3, zzgwyVar);
        zzgzeVar.add(zzgwyVar.c);
        while (d < i3) {
            int h = h(bArr, d, zzgwyVar);
            if (i != zzgwyVar.a) {
                break;
            }
            d = d(zzhawVar, bArr, h, i3, zzgwyVar);
            zzgzeVar.add(zzgwyVar.c);
        }
        return d;
    }

    public static int f(byte[] bArr, int i, zzgze zzgzeVar, zzgwy zzgwyVar) throws IOException {
        zzgyt zzgytVar = (zzgyt) zzgzeVar;
        int h = h(bArr, i, zzgwyVar);
        int i2 = zzgwyVar.a + h;
        while (h < i2) {
            h = h(bArr, h, zzgwyVar);
            zzgytVar.N(zzgwyVar.a);
        }
        if (h == i2) {
            return h;
        }
        throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int g(int i, byte[] bArr, int i2, int i3, zzhbj zzhbjVar, zzgwy zzgwyVar) throws zzgzh {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzhbjVar.j(i, Integer.valueOf(b(bArr, i2)));
                                return i2 + 4;
                            }
                            throw new zzgzh("Protocol message contained an invalid tag (zero).");
                        }
                        int i5 = (i & (-8)) | 4;
                        zzhbj f = zzhbj.f();
                        int i6 = zzgwyVar.e + 1;
                        zzgwyVar.e = i6;
                        o(i6);
                        int i7 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int h = h(bArr, i2, zzgwyVar);
                            int i8 = zzgwyVar.a;
                            if (i8 == i5) {
                                i7 = i8;
                                i2 = h;
                                break;
                            }
                            i2 = g(i8, bArr, h, i3, f, zzgwyVar);
                            i7 = i8;
                        }
                        zzgwyVar.e--;
                        if (i2 <= i3 && i7 == i5) {
                            zzhbjVar.j(i, f);
                            return i2;
                        }
                        throw new zzgzh("Failed to parse the message.");
                    }
                    int h2 = h(bArr, i2, zzgwyVar);
                    int i9 = zzgwyVar.a;
                    if (i9 >= 0) {
                        if (i9 <= bArr.length - h2) {
                            if (i9 == 0) {
                                zzhbjVar.j(i, zzgxk.Y);
                            } else {
                                zzhbjVar.j(i, zzgxk.U(bArr, h2, i9));
                            }
                            return h2 + i9;
                        }
                        throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new zzgzh("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                zzhbjVar.j(i, Long.valueOf(n(bArr, i2)));
                return i2 + 8;
            }
            int k = k(bArr, i2, zzgwyVar);
            zzhbjVar.j(i, Long.valueOf(zzgwyVar.b));
            return k;
        }
        throw new zzgzh("Protocol message contained an invalid tag (zero).");
    }

    public static int h(byte[] bArr, int i, zzgwy zzgwyVar) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 >= 0) {
            zzgwyVar.a = b2;
            return i2;
        }
        return i(b2, bArr, i2, zzgwyVar);
    }

    public static int i(int i, byte[] bArr, int i2, zzgwy zzgwyVar) {
        byte b2 = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b2 >= 0) {
            zzgwyVar.a = i4 | (b2 << 7);
            return i3;
        }
        int i5 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i3];
        if (b3 >= 0) {
            zzgwyVar.a = i5 | (b3 << C8077mf.p);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            zzgwyVar.a = i7 | (b4 << C8077mf.y);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            zzgwyVar.a = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzgwyVar.a = i11;
                return i12;
            }
        }
    }

    public static int j(int i, byte[] bArr, int i2, int i3, zzgze zzgzeVar, zzgwy zzgwyVar) {
        zzgyt zzgytVar = (zzgyt) zzgzeVar;
        int h = h(bArr, i2, zzgwyVar);
        zzgytVar.N(zzgwyVar.a);
        while (h < i3) {
            int h2 = h(bArr, h, zzgwyVar);
            if (i != zzgwyVar.a) {
                break;
            }
            h = h(bArr, h2, zzgwyVar);
            zzgytVar.N(zzgwyVar.a);
        }
        return h;
    }

    public static int k(byte[] bArr, int i, zzgwy zzgwyVar) {
        byte b2;
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzgwyVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b3 = bArr[i2];
        long j2 = (j & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b3 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b2 & Byte.MAX_VALUE) << i4;
            b3 = bArr[i3];
            i3 = i5;
        }
        zzgwyVar.b = j2;
        return i3;
    }

    public static int l(Object obj, zzhaw zzhawVar, byte[] bArr, int i, int i2, int i3, zzgwy zzgwyVar) throws IOException {
        int i4 = zzgwyVar.e + 1;
        zzgwyVar.e = i4;
        o(i4);
        int E = ((zzhag) zzhawVar).E(obj, bArr, i, i2, i3, zzgwyVar);
        zzgwyVar.e--;
        zzgwyVar.c = obj;
        return E;
    }

    public static int m(Object obj, zzhaw zzhawVar, byte[] bArr, int i, int i2, zzgwy zzgwyVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = i(i4, bArr, i3, zzgwyVar);
            i4 = zzgwyVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = zzgwyVar.e + 1;
            zzgwyVar.e = i6;
            o(i6);
            int i7 = i5 + i4;
            zzhawVar.f(obj, bArr, i5, i7, zzgwyVar);
            zzgwyVar.e--;
            zzgwyVar.c = obj;
            return i7;
        }
        throw new zzgzh("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static long n(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static void o(int i) throws zzgzh {
        if (i < a) {
            return;
        }
        throw new zzgzh("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }
}
