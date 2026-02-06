package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzehp implements zzedh {
    public final Map a = new HashMap();
    public final zzdpt b;

    public zzehp(zzdpt zzdptVar) {
        this.b = zzdptVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedh
    @InterfaceC11300zs1
    public final zzedi a(String str, JSONObject jSONObject) throws zzfcw {
        zzedi zzediVar;
        synchronized (this) {
            try {
                Map map = this.a;
                zzediVar = (zzedi) map.get(str);
                if (zzediVar == null) {
                    zzediVar = new zzedi(this.b.c(str, jSONObject), new zzeex(), str);
                    map.put(str, zzediVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzediVar;
    }
}
