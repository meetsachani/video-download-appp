package com.google.android.gms.internal.ads;

import o.C9680tD0;

/* loaded from: classes2.dex */
public final class zzgqq {
    public static byte[] a(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            int i = 0;
            while (i < 16) {
                int i2 = i + 1;
                byte b = bArr[i];
                byte b2 = (byte) ((b + b) & C9680tD0.l);
                bArr2[i] = b2;
                if (i < 15) {
                    bArr2[i] = (byte) (((bArr[i2] >> 7) & 1) | b2);
                }
                i = i2;
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }
}
