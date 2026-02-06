package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgnb {
    public static final zzgnb b = new zzgnb();
    public final Map a = new HashMap();

    public static zzgnb a() {
        return b;
    }

    public final synchronized void b(zzgna zzgnaVar, Class cls) throws GeneralSecurityException {
        try {
            Map map = this.a;
            zzgna zzgnaVar2 = (zzgna) map.get(cls);
            if (zzgnaVar2 != null && !zzgnaVar2.equals(zzgnaVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            map.put(cls, zzgnaVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
