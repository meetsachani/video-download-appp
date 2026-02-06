package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzx extends zzal {
    public final Callable<Object> Z;

    public zzx(String str, Callable<Object> callable) {
        super(str);
        this.Z = callable;
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzaq a(zzh zzhVar, List<zzaq> list) {
        try {
            return zzj.b(this.Z.call());
        } catch (Exception unused) {
            return zzaq.i;
        }
    }
}
