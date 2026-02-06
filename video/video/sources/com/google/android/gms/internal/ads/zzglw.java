package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzglw {
    public final Map a;
    public final Map b;

    public /* synthetic */ zzglw(Map map, Map map2, zzglv zzglvVar) {
        this.a = map;
        this.b = map2;
    }

    public static zzglu a() {
        return new zzglu(null);
    }

    public final Enum b(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) this.b.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object c(Enum r3) throws GeneralSecurityException {
        Object obj = this.a.get(r3);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r3)));
    }
}
