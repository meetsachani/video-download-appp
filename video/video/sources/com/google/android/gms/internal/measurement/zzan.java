package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class zzan {
    public static zzaq a(zzak zzakVar, zzaq zzaqVar, zzh zzhVar, List<zzaq> list) {
        if (zzakVar.Q(zzaqVar.e())) {
            zzaq w = zzakVar.w(zzaqVar.e());
            if (w instanceof zzal) {
                return ((zzal) w).a(zzhVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", zzaqVar.e()));
        } else if ("hasOwnProperty".equals(zzaqVar.e())) {
            zzg.g("hasOwnProperty", 1, list);
            if (zzakVar.Q(zzhVar.b(list.get(0)).e())) {
                return zzaq.n;
            }
            return zzaq.f304o;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", zzaqVar.e()));
        }
    }

    public static Iterator<zzaq> b(Map<String, zzaq> map) {
        return new zzam(map.keySet().iterator());
    }
}
