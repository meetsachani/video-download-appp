package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgez {
    public static zzgex a(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgtq w2 = zzgtq.w2(bArr, zzgyc.a());
            zzgnj c = zzgnj.c();
            zzgoj a = zzgoj.a(w2);
            if (!c.k(a)) {
                return new zzgmp(a);
            }
            return c.b(a);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] b(zzgex zzgexVar) throws GeneralSecurityException {
        return ((zzgoj) zzgnj.c().e(zzgexVar, zzgoj.class)).c().b1();
    }
}
