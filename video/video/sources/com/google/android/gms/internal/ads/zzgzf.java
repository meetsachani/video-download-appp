package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import o.OA;

/* loaded from: classes2.dex */
public final class zzgzf {
    public static final Charset a;
    public static final byte[] b;
    public static final ByteBuffer c;

    static {
        Charset.forName(OA.b);
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        c = ByteBuffer.wrap(bArr);
        int i = zzgxq.e;
        zzgxq.g(bArr, 0, 0, false);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
