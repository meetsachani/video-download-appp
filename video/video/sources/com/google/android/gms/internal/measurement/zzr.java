package com.google.android.gms.internal.measurement;

import java.util.List;
import o.C3771Nr1;

/* loaded from: classes3.dex */
public final class zzr extends zzal {
    public final zzv Z;

    public zzr(zzv zzvVar) {
        super("internal.logger");
        this.Z = zzvVar;
        this.Y.put("log", new zzu(this, false, true));
        this.Y.put(C3771Nr1.f1, new zzq(this, C3771Nr1.f1));
        ((zzal) this.Y.get(C3771Nr1.f1)).j("log", new zzu(this, true, true));
        this.Y.put("unmonitored", new zzt(this, "unmonitored"));
        ((zzal) this.Y.get("unmonitored")).j("log", new zzu(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List<zzaq> list) {
        return zzaq.i;
    }
}
