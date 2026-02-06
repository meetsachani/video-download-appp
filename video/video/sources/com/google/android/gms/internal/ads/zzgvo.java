package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public final class zzgvo implements zzgee {
    public final SecretKey a;
    public final byte[] b;

    public zzgvo(byte[] bArr, zzgwp zzgwpVar) throws GeneralSecurityException {
        if (zzglr.a(2)) {
            this.a = zzgjx.c(bArr);
            this.b = zzgwpVar.d();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    public static zzgee b(zzggp zzggpVar) throws GeneralSecurityException {
        return new zzgvo(zzggpVar.e().d(zzgej.a()), zzggpVar.b());
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            byte[] bArr3 = this.b;
            int length = bArr.length;
            int length2 = bArr3.length;
            if (length >= length2 + 28) {
                if (zzgou.c(bArr3, bArr)) {
                    AlgorithmParameterSpec a = zzgjx.a(bArr, length2, 12);
                    SecretKey secretKey = this.a;
                    Cipher b = zzgjx.b();
                    b.init(2, secretKey, a);
                    if (bArr2 != null && bArr2.length != 0) {
                        b.updateAAD(bArr2);
                    }
                    return b.doFinal(bArr, length2 + 12, (length - length2) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
