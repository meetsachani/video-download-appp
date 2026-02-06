package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o.C8077mf;

/* loaded from: classes2.dex */
public final class zzgbf extends zzgbg {
    public static /* bridge */ /* synthetic */ int a(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int b(long j) {
        boolean z;
        int i = (int) j;
        if (i == j) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.h(z, "Out of range: %s", j);
        return i;
    }

    public static int c(int i, int i2, int i3) {
        zzfvc.j(true, "min (%s) must be less than or equal to max (%s)", i2, 1073741823);
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static int d(byte[] bArr) {
        boolean z;
        int length = bArr.length;
        if (length >= 4) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.j(z, "array too small: %s < %s", length, 4);
        return e(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int e(byte b, byte b2, byte b3, byte b4) {
        return (b << C8077mf.B) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int f(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static Integer g(String str, int i) {
        Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            int i2 = 0;
            char charAt = str.charAt(0);
            if (charAt == '-') {
                i2 = 1;
            }
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                int a = zzgbh.a(str.charAt(i2));
                if (a >= 0 && a < 10) {
                    long j = -a;
                    while (true) {
                        if (i3 < str.length()) {
                            int i4 = i3 + 1;
                            int a2 = zzgbh.a(str.charAt(i3));
                            if (a2 < 0 || a2 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = a2;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i3 = i4;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static List h(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.EMPTY_LIST;
        }
        return new zzgbe(iArr, 0, length);
    }

    public static int[] i(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
