package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbae extends zzazv {
    public MessageDigest c;
    public final int d;
    public final int e;

    public zzbae(int i) {
        int i2 = i >> 3;
        this.d = (i & 7) > 0 ? i2 + 1 : i2;
        this.e = i;
    }

    @Override // com.google.android.gms.internal.ads.zzazv
    public final byte[] b(String str) {
        synchronized (this.a) {
            try {
                MessageDigest a = a();
                this.c = a;
                if (a == null) {
                    return new byte[0];
                }
                a.reset();
                this.c.update(str.getBytes(Charset.forName("UTF-8")));
                byte[] digest = this.c.digest();
                int length = digest.length;
                int i = this.d;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(digest, 0, bArr, 0, length);
                int i2 = this.e & 7;
                if (i2 > 0) {
                    long j = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (i3 > 0) {
                            j <<= 8;
                        }
                        j += bArr[i3] & 255;
                    }
                    long j2 = j >>> (8 - i2);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j2);
                        j2 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
