package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgvq implements zzgee {
    public final zzgkt a;
    public final byte[] b;

    public zzgvq(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.a = new zzgkt(bArr);
        this.b = bArr2;
    }

    public static zzgee b(zzghj zzghjVar) throws GeneralSecurityException {
        return new zzgvq(zzghjVar.e().d(zzgej.a()), zzghjVar.b().d());
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.b;
        int length = bArr3.length;
        if (length == 0) {
            return c(bArr, bArr2);
        }
        if (zzgou.c(bArr3, bArr)) {
            return c(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            byte[] copyOf = Arrays.copyOf(bArr, 12);
            return this.a.b(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
