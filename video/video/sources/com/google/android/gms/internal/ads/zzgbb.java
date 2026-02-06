package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgbb {
    public static long a(String str, long j) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " (" + j + ") must be >= 0");
    }

    public static void b(boolean z) {
        if (z) {
            return;
        }
        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
    }
}
