package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes2.dex */
public final class zzgkt extends zzgku {
    public zzgkt(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgku
    public final zzgks a(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgkr(bArr, i);
    }
}
