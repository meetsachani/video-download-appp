package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes2.dex */
public final class zzgwb implements zzgwf {
    @Override // com.google.android.gms.internal.ads.zzgwf
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
