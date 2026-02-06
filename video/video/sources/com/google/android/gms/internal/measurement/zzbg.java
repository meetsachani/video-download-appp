package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzbg extends zzay {
    public zzbg() {
        this.a.add(zzbv.AND);
        this.a.add(zzbv.NOT);
        this.a.add(zzbv.OR);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq b(String str, zzh zzhVar, List<zzaq> list) {
        int i = zzbj.a[zzg.c(str).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.a(str);
                }
                zzg.f(zzbv.OR, 2, list);
                zzaq b = zzhVar.b(list.get(0));
                if (b.f().booleanValue()) {
                    return b;
                }
                return zzhVar.b(list.get(1));
            }
            zzg.f(zzbv.NOT, 1, list);
            return new zzag(Boolean.valueOf(!zzhVar.b(list.get(0)).f().booleanValue()));
        }
        zzg.f(zzbv.AND, 2, list);
        zzaq b2 = zzhVar.b(list.get(0));
        if (!b2.f().booleanValue()) {
            return b2;
        }
        return zzhVar.b(list.get(1));
    }
}
