package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class zzgen {
    public static final zzgex a(zzgex zzgexVar) throws GeneralSecurityException {
        if (zzgexVar != null) {
            return zzgexVar;
        }
        return zzgez.a(b(null).b1());
    }

    public static final zzgtq b(zzgex zzgexVar) {
        try {
            return ((zzgoj) zzgnj.c().e(null, zzgoj.class)).c();
        } catch (GeneralSecurityException e) {
            throw new zzgot("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }
}
