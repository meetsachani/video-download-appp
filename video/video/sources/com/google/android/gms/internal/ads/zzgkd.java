package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgkd implements zzgee {
    public static final byte[] c = zzgwg.a("7a806c");
    public static final byte[] d = zzgwg.a("46bb91c3c5");
    public static final byte[] e = zzgwg.a("36864200e0eaf5284d884a0e77d31646");
    public static final byte[] f = zzgwg.a("bae8e37fc83441b16034566b");
    public static final byte[] g = zzgwg.a("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    public final SecretKey a;
    public final byte[] b;

    public zzgkd(byte[] bArr, byte[] bArr2, zzgll zzgllVar) throws GeneralSecurityException {
        this.b = bArr2;
        zzgwn.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = f;
            cipher.init(2, new SecretKeySpec(e, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
            cipher.updateAAD(d);
            byte[] bArr2 = g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    public static zzgee c(zzgha zzghaVar, zzgll zzgllVar) throws GeneralSecurityException {
        if (b(zzgln.c())) {
            return new zzgkd(zzghaVar.e().d(zzgej.a()), zzghaVar.b().d(), zzgllVar);
        }
        throw new IllegalStateException("Cipher does not implement AES GCM SIV.");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.b;
        int length2 = bArr3.length;
        if (length >= length2 + 28) {
            if (zzgou.c(bArr3, bArr)) {
                Cipher c2 = zzgln.c();
                c2.init(2, this.a, new GCMParameterSpec(128, bArr, length2, 12));
                if (bArr2 != null && bArr2.length != 0) {
                    c2.updateAAD(bArr2);
                }
                return c2.doFinal(bArr, length2 + 12, (length - length2) - 12);
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
