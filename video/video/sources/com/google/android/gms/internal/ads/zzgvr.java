package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class zzgvr implements zzgee {
    public final zzgwh a;
    public final zzgew b;
    public final int c;
    public final byte[] d;

    public zzgvr(zzgwh zzgwhVar, zzgew zzgewVar, int i, byte[] bArr) {
        this.a = zzgwhVar;
        this.b = zzgewVar;
        this.c = i;
        this.d = bArr;
    }

    public static zzgee b(zzgft zzgftVar) throws GeneralSecurityException {
        zzgvk zzgvkVar = new zzgvk(zzgftVar.e().d(zzgej.a()), zzgftVar.d().d());
        String valueOf = String.valueOf(zzgftVar.d().g());
        return new zzgvr(zzgvkVar, new zzgwm(new zzgwl("HMAC".concat(valueOf), new SecretKeySpec(zzgftVar.f().d(zzgej.a()), "HMAC")), zzgftVar.d().e()), zzgftVar.d().e(), zzgftVar.b().d());
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.d;
        int length = bArr.length;
        int i = this.c;
        int length2 = bArr3.length;
        if (length >= i + length2) {
            if (zzgou.c(bArr3, bArr)) {
                int i2 = length - i;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i2);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i2, length);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] copyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8);
                if (MessageDigest.isEqual(((zzgwm) this.b).c(zzgvp.b(bArr2, copyOfRange, copyOf)), copyOfRange2)) {
                    return this.a.B0(copyOfRange);
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
    }
}
