package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzw extends zzal {
    public zzaa Z;

    public zzw(zzaa zzaaVar) {
        super("internal.registerCallback");
        this.Z = zzaaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List<zzaq> list) {
        int i;
        zzg.g(this.X, 3, list);
        String e = zzhVar.b(list.get(0)).e();
        zzaq b = zzhVar.b(list.get(1));
        if (b instanceof zzar) {
            zzaq b2 = zzhVar.b(list.get(2));
            if (b2 instanceof zzap) {
                zzap zzapVar = (zzap) b2;
                if (zzapVar.Q("type")) {
                    String e2 = zzapVar.w("type").e();
                    if (zzapVar.Q("priority")) {
                        i = zzg.i(zzapVar.w("priority").d().doubleValue());
                    } else {
                        i = 1000;
                    }
                    this.Z.c(e, i, (zzar) b, e2);
                    return zzaq.i;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
