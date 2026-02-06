package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzp extends zzal {
    public final /* synthetic */ zzo Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzp(zzm zzmVar, String str, zzo zzoVar) {
        super(str);
        this.Z = zzoVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List<zzaq> list) {
        zzg.g("getValue", 2, list);
        zzaq b = zzhVar.b(list.get(0));
        zzaq b2 = zzhVar.b(list.get(1));
        String w = this.Z.w(b.e());
        if (w != null) {
            return new zzas(w);
        }
        return b2;
    }
}
