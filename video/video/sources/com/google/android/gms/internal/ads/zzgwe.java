package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* loaded from: classes2.dex */
public final class zzgwe implements zzgwf {
    @Override // com.google.android.gms.internal.ads.zzgwf
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
