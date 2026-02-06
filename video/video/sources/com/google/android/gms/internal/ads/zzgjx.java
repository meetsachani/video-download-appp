package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgjx {
    public static final ThreadLocal a = new zzgjw();

    public static AlgorithmParameterSpec a(byte[] bArr, int i, int i2) {
        int i3 = zzgou.a;
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        return new GCMParameterSpec(128, bArr, i, 12);
    }

    public static Cipher b() {
        return (Cipher) a.get();
    }

    public static SecretKey c(byte[] bArr) throws GeneralSecurityException {
        zzgwn.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
