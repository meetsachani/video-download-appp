package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.Provider;
import java.security.Security;
import o.InterfaceC10571ws1;

/* loaded from: classes2.dex */
public final class zzglt {
    public static final String[] a = {ProviderInstaller.a, "AndroidOpenSSL", "Conscrypt"};

    @InterfaceC10571ws1
    public static Provider a() {
        String[] strArr = a;
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}
