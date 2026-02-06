package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import o.C4500Ve2;

/* loaded from: classes2.dex */
public final class zzbaa extends zzazv {
    public MessageDigest c;

    @Override // com.google.android.gms.internal.ads.zzazv
    public final byte[] b(String str) {
        byte[] bArr;
        byte[] bArr2;
        String[] split = str.split(C4500Ve2.b);
        int length = split.length;
        int i = 4;
        if (length == 1) {
            int a = zzazz.a(split[0]);
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(a);
            bArr2 = allocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i2 = 0; i2 < split.length; i2++) {
                    int a2 = zzazz.a(split[i2]);
                    int i3 = (a2 >> 16) ^ ((char) a2);
                    byte b = (byte) i3;
                    byte b2 = (byte) (i3 >> 8);
                    int i4 = i2 + i2;
                    bArr[i4] = new byte[]{b, b2}[0];
                    bArr[i4 + 1] = b2;
                }
            } else {
                bArr = new byte[length];
                for (int i5 = 0; i5 < split.length; i5++) {
                    int a3 = zzazz.a(split[i5]);
                    bArr[i5] = (byte) ((a3 >> 24) ^ (((a3 & 255) ^ ((a3 >> 8) & 255)) ^ ((a3 >> 16) & 255)));
                }
            }
            bArr2 = bArr;
        }
        this.c = a();
        synchronized (this.a) {
            try {
                MessageDigest messageDigest = this.c;
                if (messageDigest == null) {
                    return new byte[0];
                }
                messageDigest.reset();
                this.c.update(bArr2);
                byte[] digest = this.c.digest();
                int length2 = digest.length;
                if (length2 <= 4) {
                    i = length2;
                }
                byte[] bArr3 = new byte[i];
                System.arraycopy(digest, 0, bArr3, 0, i);
                return bArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
