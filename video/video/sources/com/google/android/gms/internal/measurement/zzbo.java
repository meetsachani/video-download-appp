package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzbo extends zzay {
    public zzbo() {
        this.a.add(zzbv.ADD);
        this.a.add(zzbv.DIVIDE);
        this.a.add(zzbv.MODULUS);
        this.a.add(zzbv.MULTIPLY);
        this.a.add(zzbv.NEGATE);
        this.a.add(zzbv.POST_DECREMENT);
        this.a.add(zzbv.POST_INCREMENT);
        this.a.add(zzbv.PRE_DECREMENT);
        this.a.add(zzbv.PRE_INCREMENT);
        this.a.add(zzbv.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq b(String str, zzh zzhVar, List<zzaq> list) {
        switch (zzbr.a[zzg.c(str).ordinal()]) {
            case 1:
                zzg.f(zzbv.ADD, 2, list);
                zzaq b = zzhVar.b(list.get(0));
                zzaq b2 = zzhVar.b(list.get(1));
                if (!(b instanceof zzak) && !(b instanceof zzas) && !(b2 instanceof zzak) && !(b2 instanceof zzas)) {
                    return new zzai(Double.valueOf(b.d().doubleValue() + b2.d().doubleValue()));
                }
                String e = b.e();
                String e2 = b2.e();
                return new zzas(e + e2);
            case 2:
                zzg.f(zzbv.DIVIDE, 2, list);
                return new zzai(Double.valueOf(zzhVar.b(list.get(0)).d().doubleValue() / zzhVar.b(list.get(1)).d().doubleValue()));
            case 3:
                zzg.f(zzbv.MODULUS, 2, list);
                return new zzai(Double.valueOf(zzhVar.b(list.get(0)).d().doubleValue() % zzhVar.b(list.get(1)).d().doubleValue()));
            case 4:
                zzg.f(zzbv.MULTIPLY, 2, list);
                return new zzai(Double.valueOf(zzhVar.b(list.get(0)).d().doubleValue() * zzhVar.b(list.get(1)).d().doubleValue()));
            case 5:
                zzg.f(zzbv.NEGATE, 1, list);
                return new zzai(Double.valueOf(zzhVar.b(list.get(0)).d().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                zzg.g(str, 2, list);
                zzaq b3 = zzhVar.b(list.get(0));
                zzhVar.b(list.get(1));
                return b3;
            case 8:
            case 9:
                zzg.g(str, 1, list);
                return zzhVar.b(list.get(0));
            case 10:
                zzg.f(zzbv.SUBTRACT, 2, list);
                return new zzai(Double.valueOf(zzhVar.b(list.get(0)).d().doubleValue() + new zzai(Double.valueOf(zzhVar.b(list.get(1)).d().doubleValue() * (-1.0d))).d().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
