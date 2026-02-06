package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgou {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static final zzgwp a(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i] = (byte) charAt;
            } else {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
        }
        return zzgwp.b(bArr);
    }

    public static final zzgwp b(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '!' && charAt <= '~') {
                bArr[i] = (byte) charAt;
            } else {
                throw new zzgot("Not a printable ASCII character: " + charAt);
            }
        }
        return zzgwp.b(bArr);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr2[i] != bArr[i]) {
                return false;
            }
        }
        return true;
    }
}
