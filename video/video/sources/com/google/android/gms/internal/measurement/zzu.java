package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzu extends zzal {
    public boolean Y0;
    public boolean Z;
    public final /* synthetic */ zzr Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzr zzrVar, boolean z, boolean z2) {
        super("log");
        this.Z0 = zzrVar;
        this.Z = z;
        this.Y0 = z2;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List<zzaq> list) {
        zzv zzvVar;
        zzv zzvVar2;
        zzv zzvVar3;
        zzg.k("log", 1, list);
        if (list.size() == 1) {
            zzvVar3 = this.Z0.Z;
            zzvVar3.a(zzs.INFO, zzhVar.b(list.get(0)).e(), Collections.EMPTY_LIST, this.Z, this.Y0);
            return zzaq.i;
        }
        zzs e = zzs.e(zzg.i(zzhVar.b(list.get(0)).d().doubleValue()));
        String e2 = zzhVar.b(list.get(1)).e();
        if (list.size() == 2) {
            zzvVar2 = this.Z0.Z;
            zzvVar2.a(e, e2, Collections.EMPTY_LIST, this.Z, this.Y0);
            return zzaq.i;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 2; i < Math.min(list.size(), 5); i++) {
            arrayList.add(zzhVar.b(list.get(i)).e());
        }
        zzvVar = this.Z0.Z;
        zzvVar.a(e, e2, arrayList, this.Z, this.Y0);
        return zzaq.i;
    }
}
