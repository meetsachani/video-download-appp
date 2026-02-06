package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.DisplayMetrics;
import o.C10671xH0;
import o.C8077mf;

/* loaded from: classes2.dex */
public final class zzawr {
    public static final char[] a = C10671xH0.a.toCharArray();
    public static final /* synthetic */ int b = 0;

    public static long a(double d, int i, DisplayMetrics displayMetrics) {
        return Math.round(d / displayMetrics.density);
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            char[] cArr2 = a;
            int i2 = i + i;
            cArr[i2] = cArr2[(b2 & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b2 & C8077mf.q];
        }
        return new String(cArr);
    }

    public static boolean c() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean d(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean e(DisplayMetrics displayMetrics) {
        if (displayMetrics != null && displayMetrics.density != 0.0f) {
            return true;
        }
        return false;
    }

    public static byte[] f(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[length / 2];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        }
        throw new IllegalArgumentException("String must be of even-length");
    }
}
