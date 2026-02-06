package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import o.OA;

/* loaded from: classes3.dex */
public final class zziz {
    public static final Charset a = Charset.forName(OA.b);
    public static final Charset b = Charset.forName("UTF-8");
    public static final Charset c = Charset.forName("ISO-8859-1");
    public static final byte[] d;
    public static final ByteBuffer e;
    public static final zzib f;

    static {
        byte[] bArr = new byte[0];
        d = bArr;
        e = ByteBuffer.wrap(bArr);
        f = zzib.d(bArr, 0, bArr.length, false);
    }

    public static int a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int c(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    public static <T> T e(T t) {
        t.getClass();
        return t;
    }

    public static <T> T f(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean g(zzkj zzkjVar) {
        return false;
    }

    public static String h(byte[] bArr) {
        return new String(bArr, b);
    }

    public static boolean i(byte[] bArr) {
        return zzmh.d(bArr);
    }
}
