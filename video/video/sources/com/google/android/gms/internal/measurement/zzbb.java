package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public final class zzbb {
    @InterfaceC5299bJ2
    public Map<String, zzay> a = new HashMap();
    public zzbq b = new zzbq();

    public zzbb() {
        b(new zzaw());
        b(new zzba());
        b(new zzbc());
        b(new zzbg());
        b(new zzbi());
        b(new zzbo());
        b(new zzbt());
    }

    public final zzaq a(zzh zzhVar, zzaq zzaqVar) {
        zzay zzayVar;
        zzg.b(zzhVar);
        if (zzaqVar instanceof zzat) {
            zzat zzatVar = (zzat) zzaqVar;
            ArrayList<zzaq> b = zzatVar.b();
            String a = zzatVar.a();
            if (this.a.containsKey(a)) {
                zzayVar = this.a.get(a);
            } else {
                zzayVar = this.b;
            }
            return zzayVar.b(a, zzhVar, b);
        }
        return zzaqVar;
    }

    public final void b(zzay zzayVar) {
        for (zzbv zzbvVar : zzayVar.a) {
            this.a.put(zzbvVar.toString(), zzayVar);
        }
    }
}
