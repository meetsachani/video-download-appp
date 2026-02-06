package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzglf implements zzgee {
    public final byte[] a;
    public final byte[] b;

    public zzglf(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            if (c()) {
                if (bArr.length == 32) {
                    this.a = bArr;
                    this.b = bArr2;
                    return;
                }
                throw new InvalidKeyException("The key length in bytes must be 32.");
            }
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static zzgee b(zzgjf zzgjfVar) throws GeneralSecurityException {
        return new zzglf(zzgjfVar.e().d(zzgej.a()), zzgjfVar.b().d());
    }

    public static boolean c() {
        if (zzgkk.c() != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            byte[] bArr3 = this.b;
            int length = bArr.length;
            int length2 = bArr3.length;
            if (length >= length2 + 40) {
                if (zzgou.c(bArr3, bArr)) {
                    byte[] bArr4 = new byte[24];
                    System.arraycopy(bArr, length2, bArr4, 0, 24);
                    int[] d = zzgkq.d(zzgkq.e(this.a), zzgkq.e(bArr4));
                    ByteBuffer order = ByteBuffer.allocate(d.length * 4).order(ByteOrder.LITTLE_ENDIAN);
                    order.asIntBuffer().put(d);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(order.array(), "ChaCha20");
                    byte[] bArr5 = new byte[12];
                    System.arraycopy(bArr4, 16, bArr5, 4, 8);
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr5);
                    Cipher c = zzgkk.c();
                    c.init(2, secretKeySpec, ivParameterSpec);
                    if (bArr2 != null && bArr2.length != 0) {
                        c.updateAAD(bArr2);
                    }
                    return c.doFinal(bArr, length2 + 24, (length - length2) - 24);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
