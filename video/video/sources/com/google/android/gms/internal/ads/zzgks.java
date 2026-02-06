package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
abstract class zzgks {
    public int[] a;
    public final int b;

    public zzgks(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.a = zzgkq.e(bArr);
            this.b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public abstract int a();

    public abstract int[] b(int[] iArr, int i);

    public final ByteBuffer c(byte[] bArr, int i) {
        int[] b = b(zzgkq.e(bArr), i);
        int[] iArr = (int[]) b.clone();
        zzgkq.c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    public final byte[] d(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length == a()) {
            int remaining = byteBuffer.remaining();
            int i = remaining / 64;
            for (int i2 = 0; i2 < i + 1; i2++) {
                ByteBuffer c = c(bArr, this.b + i2);
                if (i2 == i) {
                    zzgvp.a(allocate, byteBuffer, c, remaining % 64);
                } else {
                    zzgvp.a(allocate, byteBuffer, c, 64);
                }
            }
            return allocate.array();
        }
        int a = a();
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + a);
    }
}
