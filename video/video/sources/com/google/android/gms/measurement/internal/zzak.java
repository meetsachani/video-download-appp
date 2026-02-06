package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.zzih;
import java.util.EnumMap;

/* loaded from: classes3.dex */
final class zzak {
    public final EnumMap<zzih.zza, zzaj> a;

    public zzak() {
        this.a = new EnumMap<>(zzih.zza.class);
    }

    public static zzak b(String str) {
        EnumMap enumMap = new EnumMap(zzih.zza.class);
        if (str.length() >= zzih.zza.values().length) {
            int i = 0;
            if (str.charAt(0) == '1') {
                zzih.zza[] values = zzih.zza.values();
                int length = values.length;
                int i2 = 1;
                while (i < length) {
                    enumMap.put((EnumMap) values[i], (zzih.zza) zzaj.g(str.charAt(i2)));
                    i++;
                    i2++;
                }
                return new zzak(enumMap);
            }
        }
        return new zzak();
    }

    public final zzaj a(zzih.zza zzaVar) {
        zzaj zzajVar = this.a.get(zzaVar);
        if (zzajVar == null) {
            return zzaj.UNSET;
        }
        return zzajVar;
    }

    public final void c(zzih.zza zzaVar, int i) {
        zzaj zzajVar = zzaj.UNSET;
        if (i != -20) {
            if (i != -10) {
                if (i != 0) {
                    if (i == 30) {
                        zzajVar = zzaj.INITIALIZATION;
                    }
                }
            } else {
                zzajVar = zzaj.MANIFEST;
            }
            this.a.put((EnumMap<zzih.zza, zzaj>) zzaVar, (zzih.zza) zzajVar);
        }
        zzajVar = zzaj.API;
        this.a.put((EnumMap<zzih.zza, zzaj>) zzaVar, (zzih.zza) zzajVar);
    }

    public final void d(zzih.zza zzaVar, zzaj zzajVar) {
        this.a.put((EnumMap<zzih.zza, zzaj>) zzaVar, (zzih.zza) zzajVar);
    }

    public final String toString() {
        char c;
        StringBuilder sb = new StringBuilder("1");
        for (zzih.zza zzaVar : zzih.zza.values()) {
            zzaj zzajVar = this.a.get(zzaVar);
            if (zzajVar == null) {
                zzajVar = zzaj.UNSET;
            }
            c = zzajVar.X;
            sb.append(c);
        }
        return sb.toString();
    }

    public zzak(EnumMap<zzih.zza, zzaj> enumMap) {
        EnumMap<zzih.zza, zzaj> enumMap2 = new EnumMap<>(zzih.zza.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
