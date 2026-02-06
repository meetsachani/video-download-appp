package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import java.io.Closeable;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import o.C8077mf;

/* renamed from: com.facebook.ads.redexgen.X.Lj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0889Lj {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{91, 78, 76, 6, 52, 3, 3, C8077mf.H, 3, 81, C8077mf.u, C8077mf.G, C8077mf.H, 2, C8077mf.B, 31, C8077mf.z, 81, 3, C8077mf.x, 2, C8077mf.H, 4, 3, C8077mf.u, C8077mf.x, 107, 98, 19};
    }

    static {
        A04();
        A01 = C0889Lj.class.getSimpleName();
    }

    public static String A01(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String extension = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(extension)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(extension);
    }

    public static String A02(String str) {
        try {
            return A03(MessageDigest.getInstance(A00(26, 3, 55)).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public static String A03(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(String.format(Locale.US, A00(0, 4, 111), Byte.valueOf(b)));
        }
        return stringBuffer.toString();
    }

    public static void A05(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e(A01, A00(4, 22, 96), e);
            }
        }
    }
}
