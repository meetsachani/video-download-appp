package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* loaded from: classes2.dex */
abstract class zzgku {
    public final zzgks a;
    public final zzgks b;

    public zzgku(byte[] bArr) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            this.a = a(bArr, 1);
            this.b = a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public abstract zzgks a(byte[] bArr, int i) throws InvalidKeyException;

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i;
        int i2;
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.b.c(bArr, 0).get(bArr4);
                int length = bArr2.length;
                int i3 = length & 15;
                if (i3 == 0) {
                    i = length;
                } else {
                    i = (length + 16) - i3;
                }
                int remaining = byteBuffer.remaining();
                int i4 = remaining % 16;
                if (i4 == 0) {
                    i2 = remaining;
                } else {
                    i2 = (remaining + 16) - i4;
                }
                int i5 = i2 + i;
                ByteBuffer order = ByteBuffer.allocate(i5 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(i);
                order.put(byteBuffer);
                order.position(i5);
                order.putLong(length);
                order.putLong(remaining);
                if (MessageDigest.isEqual(zzgky.a(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    return this.a.d(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
