package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzgwo implements zzgee {
    public final zzgkw a;
    public final byte[] b;

    public zzgwo(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.a = new zzgkw(bArr);
        this.b = bArr2;
    }

    public static zzgee b(zzgjf zzgjfVar) throws GeneralSecurityException {
        return new zzgwo(zzgjfVar.e().d(zzgej.a()), zzgjfVar.b().d());
    }

    private final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 40) {
            byte[] copyOf = Arrays.copyOf(bArr, 24);
            return this.a.b(ByteBuffer.wrap(bArr, 24, length - 24), copyOf, bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
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
}
