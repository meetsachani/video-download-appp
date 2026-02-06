package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzbq extends zzay {
    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq b(String str, zzh zzhVar, List<zzaq> list) {
        if (str != null && !str.isEmpty() && zzhVar.g(str)) {
            zzaq c = zzhVar.c(str);
            if (c instanceof zzal) {
                return ((zzal) c).a(zzhVar, list);
            }
            throw new IllegalArgumentException(String.format("Function %s is not defined", str));
        }
        throw new IllegalArgumentException(String.format("Command not found: %s", str));
    }
}
