package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public final class zzz extends zzal {
    @InterfaceC5299bJ2
    public final Map<String, zzal> Y0;
    public final zzl Z;

    public zzz(zzl zzlVar) {
        super("require");
        this.Y0 = new HashMap();
        this.Z = zzlVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List<zzaq> list) {
        zzg.g("require", 1, list);
        String e = zzhVar.b(list.get(0)).e();
        if (this.Y0.containsKey(e)) {
            return this.Y0.get(e);
        }
        zzaq a = this.Z.a(e);
        if (a instanceof zzal) {
            this.Y0.put(e, (zzal) a);
        }
        return a;
    }
}
