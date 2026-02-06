package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzaw extends zzay {
    public zzaw() {
        this.a.add(zzbv.BITWISE_AND);
        this.a.add(zzbv.BITWISE_LEFT_SHIFT);
        this.a.add(zzbv.BITWISE_NOT);
        this.a.add(zzbv.BITWISE_OR);
        this.a.add(zzbv.BITWISE_RIGHT_SHIFT);
        this.a.add(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(zzbv.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq b(String str, zzh zzhVar, List<zzaq> list) {
        switch (zzaz.a[zzg.c(str).ordinal()]) {
            case 1:
                zzg.f(zzbv.BITWISE_AND, 2, list);
                return new zzai(Double.valueOf(zzg.i(zzhVar.b(list.get(0)).d().doubleValue()) & zzg.i(zzhVar.b(list.get(1)).d().doubleValue())));
            case 2:
                zzg.f(zzbv.BITWISE_LEFT_SHIFT, 2, list);
                return new zzai(Double.valueOf(zzg.i(zzhVar.b(list.get(0)).d().doubleValue()) << ((int) (zzg.m(zzhVar.b(list.get(1)).d().doubleValue()) & 31))));
            case 3:
                zzg.f(zzbv.BITWISE_NOT, 1, list);
                return new zzai(Double.valueOf(~zzg.i(zzhVar.b(list.get(0)).d().doubleValue())));
            case 4:
                zzg.f(zzbv.BITWISE_OR, 2, list);
                return new zzai(Double.valueOf(zzg.i(zzhVar.b(list.get(0)).d().doubleValue()) | zzg.i(zzhVar.b(list.get(1)).d().doubleValue())));
            case 5:
                zzg.f(zzbv.BITWISE_RIGHT_SHIFT, 2, list);
                return new zzai(Double.valueOf(zzg.i(zzhVar.b(list.get(0)).d().doubleValue()) >> ((int) (zzg.m(zzhVar.b(list.get(1)).d().doubleValue()) & 31))));
            case 6:
                zzg.f(zzbv.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new zzai(Double.valueOf(zzg.m(zzhVar.b(list.get(0)).d().doubleValue()) >>> ((int) (zzg.m(zzhVar.b(list.get(1)).d().doubleValue()) & 31))));
            case 7:
                zzg.f(zzbv.BITWISE_XOR, 2, list);
                return new zzai(Double.valueOf(zzg.i(zzhVar.b(list.get(0)).d().doubleValue()) ^ zzg.i(zzhVar.b(list.get(1)).d().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
