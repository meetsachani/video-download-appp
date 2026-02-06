package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* loaded from: classes2.dex */
final class zzgvs implements zzgvv {
    public final zzgwf a;

    @Override // com.google.android.gms.internal.ads.zzgvv
    public final Object w(String str) throws GeneralSecurityException {
        for (Provider provider : zzgvx.b(ProviderInstaller.a, "AndroidOpenSSL")) {
            try {
                return this.a.a(str, provider);
            } catch (Exception unused) {
            }
        }
        return this.a.a(str, null);
    }
}
