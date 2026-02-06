package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class zzho implements Comparator<zzhm> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzhm zzhmVar, zzhm zzhmVar2) {
        zzhm zzhmVar3 = zzhmVar;
        zzhm zzhmVar4 = zzhmVar2;
        zzhs zzhsVar = (zzhs) zzhmVar3.iterator();
        zzhs zzhsVar2 = (zzhs) zzhmVar4.iterator();
        while (zzhsVar.hasNext() && zzhsVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzhm.f(zzhsVar.a())).compareTo(Integer.valueOf(zzhm.f(zzhsVar2.a())));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzhmVar3.B()).compareTo(Integer.valueOf(zzhmVar4.B()));
    }
}
