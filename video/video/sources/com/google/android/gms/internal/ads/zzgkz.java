package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes2.dex */
public final class zzgkz implements zzgee {
    public final byte[] a;
    public final int b;
    public final zzgqz c;

    public zzgkz(byte[] bArr, zzgwp zzgwpVar, int i) throws GeneralSecurityException {
        this.c = new zzgwj(bArr);
        this.a = zzgwpVar.d();
        this.b = i;
    }

    public static zzgee b(zzgiz zzgizVar) throws GeneralSecurityException {
        return new zzgkz(zzgizVar.e().d(zzgej.a()), zzgizVar.b(), zzgizVar.d().b());
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr != null) {
            byte[] bArr3 = this.a;
            int i = this.b;
            int length = bArr.length;
            int length2 = bArr3.length;
            int i2 = i + length2;
            if (length >= i2 + 28) {
                if (zzgou.c(bArr3, bArr)) {
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i2);
                    byte[] bArr4 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    byte[] bArr5 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
                    int length3 = copyOfRange.length;
                    if (length3 <= 12 && length3 >= 8) {
                        System.arraycopy(copyOfRange, 0, bArr4, 4, length3);
                        System.arraycopy(copyOfRange, 0, bArr5, 4, length3);
                        zzgqz zzgqzVar = this.c;
                        byte[] bArr6 = new byte[32];
                        System.arraycopy(zzgqzVar.a(bArr4, 16), 0, bArr6, 0, 16);
                        System.arraycopy(zzgqzVar.a(bArr5, 16), 0, bArr6, 16, 16);
                        if (zzglr.a(2)) {
                            SecretKey c = zzgjx.c(bArr6);
                            int i3 = i2 + 12;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i2, i3);
                            if (copyOfRange2.length == 12) {
                                if (length >= i2 + 28) {
                                    AlgorithmParameterSpec a = zzgjx.a(copyOfRange2, 0, 12);
                                    Cipher b = zzgjx.b();
                                    b.init(2, c, a);
                                    if (bArr2 != null && bArr2.length != 0) {
                                        b.updateAAD(bArr2);
                                    }
                                    return b.doFinal(bArr, i3, length - i3);
                                }
                                throw new GeneralSecurityException("ciphertext too short");
                            }
                            throw new GeneralSecurityException("iv is wrong size");
                        }
                        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                    }
                    throw new GeneralSecurityException("invalid salt size");
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            }
            throw new GeneralSecurityException("ciphertext too short");
        }
        throw new NullPointerException("ciphertext is null");
    }
}
