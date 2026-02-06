package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgqs implements zzgpg {
    public zzgqs(zzgpm zzgpmVar) throws GeneralSecurityException {
        if (zzglr.a(2)) {
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
