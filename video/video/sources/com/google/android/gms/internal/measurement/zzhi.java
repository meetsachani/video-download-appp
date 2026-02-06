package com.google.android.gms.internal.measurement;

import java.io.IOException;
import o.C8077mf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhi {
    public static double a(byte[] bArr, int i) {
        return Double.longBitsToDouble(r(bArr, i));
    }

    public static int b(int i, byte[] bArr, int i2, int i3, zzhl zzhlVar) throws zzji {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw zzji.c();
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = p(bArr, i2, zzhlVar);
                            i6 = zzhlVar.a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = b(i6, bArr, i2, i3, zzhlVar);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw zzji.g();
                    }
                    return p(bArr, i2, zzhlVar) + zzhlVar.a;
                }
                return i2 + 8;
            }
            return q(bArr, i2, zzhlVar);
        }
        throw zzji.c();
    }

    public static int c(int i, byte[] bArr, int i2, int i3, zzjf<?> zzjfVar, zzhl zzhlVar) {
        zzja zzjaVar = (zzja) zzjfVar;
        int p = p(bArr, i2, zzhlVar);
        zzjaVar.h(zzhlVar.a);
        while (p < i3) {
            int p2 = p(bArr, p, zzhlVar);
            if (i != zzhlVar.a) {
                break;
            }
            p = p(bArr, p2, zzhlVar);
            zzjaVar.h(zzhlVar.a);
        }
        return p;
    }

    public static int d(int i, byte[] bArr, int i2, int i3, zzlz zzlzVar, zzhl zzhlVar) throws zzji {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                zzlzVar.e(i, Integer.valueOf(o(bArr, i2)));
                                return i2 + 4;
                            }
                            throw zzji.c();
                        }
                        zzlz l = zzlz.l();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int p = p(bArr, i2, zzhlVar);
                            i6 = zzhlVar.a;
                            if (i6 != i5) {
                                i2 = d(i6, bArr, p, i3, l, zzhlVar);
                            } else {
                                i2 = p;
                                break;
                            }
                        }
                        if (i2 <= i3 && i6 == i5) {
                            zzlzVar.e(i, l);
                            return i2;
                        }
                        throw zzji.g();
                    }
                    int p2 = p(bArr, i2, zzhlVar);
                    int i7 = zzhlVar.a;
                    if (i7 >= 0) {
                        if (i7 <= bArr.length - p2) {
                            if (i7 == 0) {
                                zzlzVar.e(i, zzhm.Y);
                            } else {
                                zzlzVar.e(i, zzhm.l(bArr, p2, i7));
                            }
                            return p2 + i7;
                        }
                        throw zzji.h();
                    }
                    throw zzji.f();
                }
                zzlzVar.e(i, Long.valueOf(r(bArr, i2)));
                return i2 + 8;
            }
            int q = q(bArr, i2, zzhlVar);
            zzlzVar.e(i, Long.valueOf(zzhlVar.b));
            return q;
        }
        throw zzji.c();
    }

    public static int e(int i, byte[] bArr, int i2, zzhl zzhlVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzhlVar.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzhlVar.a = i5 | (b2 << C8077mf.p);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzhlVar.a = i7 | (b3 << C8077mf.y);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzhlVar.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzhlVar.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int f(zzlb<?> zzlbVar, int i, byte[] bArr, int i2, int i3, zzjf<?> zzjfVar, zzhl zzhlVar) throws IOException {
        int h = h(zzlbVar, bArr, i2, i3, zzhlVar);
        zzjfVar.add(zzhlVar.c);
        while (h < i3) {
            int p = p(bArr, h, zzhlVar);
            if (i != zzhlVar.a) {
                break;
            }
            h = h(zzlbVar, bArr, p, i3, zzhlVar);
            zzjfVar.add(zzhlVar.c);
        }
        return h;
    }

    public static int g(zzlb zzlbVar, byte[] bArr, int i, int i2, int i3, zzhl zzhlVar) throws IOException {
        Object a = zzlbVar.a();
        int i4 = i(a, zzlbVar, bArr, i, i2, i3, zzhlVar);
        zzlbVar.f(a);
        zzhlVar.c = a;
        return i4;
    }

    public static int h(zzlb zzlbVar, byte[] bArr, int i, int i2, zzhl zzhlVar) throws IOException {
        Object a = zzlbVar.a();
        int j = j(a, zzlbVar, bArr, i, i2, zzhlVar);
        zzlbVar.f(a);
        zzhlVar.c = a;
        return j;
    }

    public static int i(Object obj, zzlb zzlbVar, byte[] bArr, int i, int i2, int i3, zzhl zzhlVar) throws IOException {
        int n = ((zzkn) zzlbVar).n(obj, bArr, i, i2, i3, zzhlVar);
        zzhlVar.c = obj;
        return n;
    }

    public static int j(Object obj, zzlb zzlbVar, byte[] bArr, int i, int i2, zzhl zzhlVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = e(i4, bArr, i3, zzhlVar);
            i4 = zzhlVar.a;
        }
        int i5 = i3;
        if (i4 >= 0 && i4 <= i2 - i5) {
            int i6 = i5 + i4;
            zzlbVar.i(obj, bArr, i5, i6, zzhlVar);
            zzhlVar.c = obj;
            return i6;
        }
        throw zzji.h();
    }

    public static int k(byte[] bArr, int i, zzhl zzhlVar) throws zzji {
        int p = p(bArr, i, zzhlVar);
        int i2 = zzhlVar.a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - p) {
                if (i2 == 0) {
                    zzhlVar.c = zzhm.Y;
                    return p;
                }
                zzhlVar.c = zzhm.l(bArr, p, i2);
                return p + i2;
            }
            throw zzji.h();
        }
        throw zzji.f();
    }

    public static int l(byte[] bArr, int i, zzjf<?> zzjfVar, zzhl zzhlVar) throws IOException {
        zzja zzjaVar = (zzja) zzjfVar;
        int p = p(bArr, i, zzhlVar);
        int i2 = zzhlVar.a + p;
        while (p < i2) {
            p = p(bArr, p, zzhlVar);
            zzjaVar.h(zzhlVar.a);
        }
        if (p == i2) {
            return p;
        }
        throw zzji.h();
    }

    public static float m(byte[] bArr, int i) {
        return Float.intBitsToFloat(o(bArr, i));
    }

    public static int n(byte[] bArr, int i, zzhl zzhlVar) throws zzji {
        int p = p(bArr, i, zzhlVar);
        int i2 = zzhlVar.a;
        if (i2 >= 0) {
            if (i2 == 0) {
                zzhlVar.c = "";
                return p;
            }
            zzhlVar.c = zzmh.e(bArr, p, i2);
            return p + i2;
        }
        throw zzji.f();
    }

    public static int o(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int p(byte[] bArr, int i, zzhl zzhlVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzhlVar.a = b;
            return i2;
        }
        return e(b, bArr, i2, zzhlVar);
    }

    public static int q(byte[] bArr, int i, zzhl zzhlVar) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzhlVar.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        zzhlVar.b = j2;
        return i3;
    }

    public static long r(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }
}
