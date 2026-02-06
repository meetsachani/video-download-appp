package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class zzgvy implements zzgwf {
    @Override // com.google.android.gms.internal.ads.zzgwf
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
