package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzk extends zzal {
    public final zzac Z;

    public zzk(zzac zzacVar) {
        super("internal.eventLogger");
        this.Z = zzacVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List<zzaq> list) {
        Map<String, Object> hashMap;
        zzg.g(this.X, 3, list);
        String e = zzhVar.b(list.get(0)).e();
        long a = (long) zzg.a(zzhVar.b(list.get(1)).d().doubleValue());
        zzaq b = zzhVar.b(list.get(2));
        if (b instanceof zzap) {
            hashMap = zzg.e((zzap) b);
        } else {
            hashMap = new HashMap<>();
        }
        this.Z.c(e, a, hashMap);
        return zzaq.i;
    }
}
