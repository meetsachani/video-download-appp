package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzfxm {
    public static int a(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        e(r11, r1, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        r12[r5] = (r12[r5] & r4) | (r7 & r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int b = zzfxu.b(obj);
        int i2 = b & i;
        int c = c(obj3, i2);
        if (c != 0) {
            int i3 = ~i;
            int i4 = b & i3;
            int i5 = -1;
            while (true) {
                int i6 = c - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !zzfuz.a(obj, objArr[i6]) || (objArr2 != null && !zzfuz.a(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    c = i8;
                }
            }
        }
        return -1;
    }

    public static int c(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static Object d(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i);
    }

    public static void e(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
