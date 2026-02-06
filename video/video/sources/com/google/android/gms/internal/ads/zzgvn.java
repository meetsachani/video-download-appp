package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgvn implements zzgee {
    public static final ThreadLocal f = new zzgvl();
    public static final ThreadLocal g = new zzgvm();
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;
    public final SecretKeySpec d;
    public final int e;

    public zzgvn(byte[] bArr, int i, byte[] bArr2) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            if (i != 12 && i != 16) {
                throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
            }
            this.e = i;
            zzgwn.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.d = secretKeySpec;
            Cipher cipher = (Cipher) f.get();
            cipher.init(1, secretKeySpec);
            byte[] d = d(cipher.doFinal(new byte[16]));
            this.a = d;
            this.b = d(d);
            this.c = bArr2;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    public static zzgee b(zzggf zzggfVar) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            return new zzgvn(zzggfVar.e().d(zzgej.a()), zzggfVar.d().b(), zzggfVar.b().d());
        }
        throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
    }

    public static void c(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b2 + b2));
        return bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        byte[] bArr4 = this.c;
        int length = bArr.length;
        int length2 = bArr4.length;
        int i = this.e;
        int i2 = ((length - length2) - i) - 16;
        if (i2 >= 0) {
            if (zzgou.c(bArr4, bArr)) {
                Cipher cipher = (Cipher) f.get();
                SecretKeySpec secretKeySpec = this.d;
                cipher.init(1, secretKeySpec);
                byte[] e = e(cipher, 0, bArr, length2, i);
                if (bArr2 == null) {
                    bArr3 = new byte[0];
                } else {
                    bArr3 = bArr2;
                }
                byte[] e2 = e(cipher, 1, bArr3, 0, bArr3.length);
                byte[] e3 = e(cipher, 2, bArr, length2 + i, i2);
                int i3 = length - 16;
                byte b = 0;
                for (int i4 = 0; i4 < 16; i4++) {
                    b = (byte) (b | (((bArr[i3 + i4] ^ e2[i4]) ^ e[i4]) ^ e3[i4]));
                }
                if (b == 0) {
                    Cipher cipher2 = (Cipher) g.get();
                    cipher2.init(1, secretKeySpec, new IvParameterSpec(e));
                    return cipher2.doFinal(bArr, bArr4.length + i, i2);
                }
                throw new AEADBadTagException("tag mismatch");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] e(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            c(bArr2, this.a);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        byte[] bArr4 = bArr3;
        byte[] bArr5 = bArr2;
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                bArr4[i5] = (byte) (bArr[(i2 + i4) + i5] ^ bArr4[i5]);
            }
            cipher.doFinal(bArr4, 0, 16, bArr5);
            i4 += 16;
            byte[] bArr6 = bArr4;
            bArr4 = bArr5;
            bArr5 = bArr6;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            c(copyOfRange, this.a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.b, 16);
            int i6 = 0;
            while (true) {
                length = copyOfRange.length;
                if (i6 >= length) {
                    break;
                }
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
                i6++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            copyOfRange = copyOf;
        }
        c(bArr4, copyOfRange);
        cipher.doFinal(bArr4, 0, 16, bArr5);
        return bArr5;
    }
}
