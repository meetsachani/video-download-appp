package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public final class zzaa {
    @InterfaceC5299bJ2
    public final TreeMap<Integer, zzar> a = new TreeMap<>();
    @InterfaceC5299bJ2
    public final TreeMap<Integer, zzar> b = new TreeMap<>();

    public static int a(zzh zzhVar, zzar zzarVar, zzaq zzaqVar) {
        zzaq a = zzarVar.a(zzhVar, Collections.singletonList(zzaqVar));
        if (a instanceof zzai) {
            return zzg.i(a.d().doubleValue());
        }
        return -1;
    }

    public final void b(zzh zzhVar, zzac zzacVar) {
        zzn zznVar = new zzn(zzacVar);
        for (Integer num : this.a.keySet()) {
            zzad zzadVar = (zzad) zzacVar.d().clone();
            int a = a(zzhVar, this.a.get(num), zznVar);
            if (a == 2 || a == -1) {
                zzacVar.e(zzadVar);
            }
        }
        for (Integer num2 : this.b.keySet()) {
            a(zzhVar, this.b.get(num2), zznVar);
        }
    }

    public final void c(String str, int i, zzar zzarVar, String str2) {
        TreeMap<Integer, zzar> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.b;
        } else if ("edit".equals(str2)) {
            treeMap = this.a;
        } else {
            throw new IllegalStateException("Unknown callback type: " + str2);
        }
        if (treeMap.containsKey(Integer.valueOf(i))) {
            i = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i), zzarVar);
    }
}
