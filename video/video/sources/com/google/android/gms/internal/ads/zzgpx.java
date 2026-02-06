package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgpx {
    static {
        int i = zzgut.zza;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() throws GeneralSecurityException {
        zzgqe.d();
        zzgpj.d();
        zzgpr.a(true);
        if (zzgls.b()) {
            return;
        }
        zzgpb.d(true);
    }
}
