package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public final class zzgkv extends zzgks {
    public zzgkv(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzgks
    public final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzgks
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            zzgkq.b(iArr2, zzgkq.d(this.a, iArr));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}
