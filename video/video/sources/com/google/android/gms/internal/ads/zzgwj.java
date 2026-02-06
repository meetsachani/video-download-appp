package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgwj implements zzgqz {
    public static final ThreadLocal d = new zzgwi();
    public final SecretKey a;
    public final byte[] b;
    public final byte[] c;

    public zzgwj(byte[] bArr) throws GeneralSecurityException {
        zzgwn.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        Cipher b = b();
        b.init(1, secretKeySpec);
        byte[] a = zzgqq.a(b.doFinal(new byte[16]));
        this.b = a;
        this.c = zzgqq.a(a);
    }

    public static Cipher b() throws GeneralSecurityException {
        if (zzglr.a(1)) {
            return (Cipher) d.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    public static void c(byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        for (int i2 = 0; i2 < 16; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2 + i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqz
    public final byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] c;
        if (i <= 16) {
            SecretKey secretKey = this.a;
            Cipher b = b();
            int i2 = 1;
            b.init(1, secretKey);
            int length = bArr.length;
            if (length != 0) {
                i2 = 1 + ((length - 1) >> 4);
            }
            int i3 = i2 - 1;
            int i4 = i3 * 16;
            if (i2 * 16 == length) {
                c = zzgvp.c(bArr, i4, this.b, 0, 16);
            } else {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, length);
                int length2 = copyOfRange.length;
                if (length2 < 16) {
                    byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
                    copyOf[length2] = Byte.MIN_VALUE;
                    byte[] bArr2 = this.c;
                    if (copyOf.length == 16) {
                        c = zzgvp.c(copyOf, 0, bArr2, 0, 16);
                    } else {
                        throw new IllegalArgumentException("The lengths of x and y should match.");
                    }
                } else {
                    throw new IllegalArgumentException("x must be smaller than a block.");
                }
            }
            byte[] bArr3 = new byte[16];
            byte[] bArr4 = new byte[16];
            for (int i5 = 0; i5 < i3; i5++) {
                c(bArr3, bArr, i5 * 16, bArr4);
                if (b.doFinal(bArr4, 0, 16, bArr3) != 16) {
                    throw new IllegalStateException("Cipher didn't write full block");
                }
            }
            c(bArr3, c, 0, bArr4);
            if (b.doFinal(bArr4, 0, 16, bArr3) == 16) {
                if (i == 16) {
                    return bArr3;
                }
                return Arrays.copyOf(bArr3, i);
            }
            throw new IllegalStateException("Cipher didn't write full block");
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
