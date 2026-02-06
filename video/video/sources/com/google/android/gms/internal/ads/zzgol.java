package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class zzgol {
    public static final ThreadLocal a = new zzgok();

    public static /* synthetic */ SecureRandom a() {
        SecureRandom c = c();
        c.nextLong();
        return c;
    }

    public static byte[] b(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) a.get()).nextBytes(bArr);
        return bArr;
    }

    public static SecureRandom c() {
        Provider a2 = zzglt.a();
        if (a2 != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", a2);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider provider = null;
        try {
            provider = (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        if (provider != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", provider);
            } catch (GeneralSecurityException unused3) {
            }
        }
        return new SecureRandom();
    }
}
