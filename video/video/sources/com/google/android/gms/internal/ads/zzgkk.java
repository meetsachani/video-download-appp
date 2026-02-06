package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzgkk implements zzgee {
    public static final byte[] c = zzgwg.a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");
    public static final byte[] d = zzgwg.a("070000004041424344454647");
    public static final byte[] e = zzgwg.a("a0784d7a4716f3feb4f64e7f4b39bf04");
    public static final ThreadLocal f = new zzgkj();
    public final SecretKey a;
    public final byte[] b;

    public zzgkk(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            if (e()) {
                if (bArr.length == 32) {
                    this.a = new SecretKeySpec(bArr, "ChaCha20");
                    this.b = bArr2;
                    return;
                }
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static zzgee b(zzghj zzghjVar) throws GeneralSecurityException {
        return new zzgkk(zzghjVar.e().d(zzgej.a()), zzghjVar.b().d());
    }

    @InterfaceC10571ws1
    public static Cipher c() {
        return (Cipher) f.get();
    }

    public static boolean e() {
        if (f.get() != null) {
            return true;
        }
        return false;
    }

    public static boolean f(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(d);
            byte[] bArr = c;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            byte[] bArr3 = this.b;
            int length = bArr.length;
            int length2 = bArr3.length;
            if (length >= length2 + 28) {
                if (zzgou.c(bArr3, bArr)) {
                    byte[] bArr4 = new byte[12];
                    System.arraycopy(bArr, length2, bArr4, 0, 12);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
                    Cipher cipher = (Cipher) f.get();
                    cipher.init(2, this.a, ivParameterSpec);
                    if (bArr2 != null && bArr2.length != 0) {
                        cipher.updateAAD(bArr2);
                    }
                    return cipher.doFinal(bArr, length2 + 12, (length - length2) - 12);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
