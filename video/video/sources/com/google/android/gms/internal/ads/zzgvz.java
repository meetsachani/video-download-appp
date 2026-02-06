package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes2.dex */
public final class zzgvz implements zzgwf {
    @Override // com.google.android.gms.internal.ads.zzgwf
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyAgreement.getInstance(str);
        }
        return KeyAgreement.getInstance(str, provider);
    }
}
