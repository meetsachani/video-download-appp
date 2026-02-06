package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzgnf {
    public static final zzgnf b = new zzgnf();
    public final Map a = new HashMap();

    public static zzgnf b() {
        return b;
    }

    public final synchronized zzgex a(String str) throws GeneralSecurityException {
        Map map;
        map = this.a;
        if (map.containsKey("AES128_GCM")) {
        } else {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzgex) map.get("AES128_GCM");
    }

    public final synchronized void c(String str, zzgex zzgexVar) throws GeneralSecurityException {
        try {
            Map map = this.a;
            if (map.containsKey(str)) {
                if (((zzgex) map.get(str)).equals(zzgexVar)) {
                    return;
                }
                String valueOf = String.valueOf(map.get(str));
                String valueOf2 = String.valueOf(zzgexVar);
                throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + valueOf + "), cannot insert " + valueOf2);
            }
            map.put(str, zzgexVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            c((String) entry.getKey(), (zzgex) entry.getValue());
        }
    }
}
