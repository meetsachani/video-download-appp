package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.facebook.internal.l0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public final class zzfue {
    public static String a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(l0.e);
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }
}
