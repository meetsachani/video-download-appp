package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgqr implements zzgpg {
    public zzgqr(zzgox zzgoxVar) throws GeneralSecurityException {
        if (zzglr.a(1)) {
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
