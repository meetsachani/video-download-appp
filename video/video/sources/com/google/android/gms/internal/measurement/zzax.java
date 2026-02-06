package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzax implements zzaq {
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return zzaq.i;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String e() {
        return "undefined";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof zzax;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean f() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> h() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq i(String str, zzh zzhVar, List<zzaq> list) {
        throw new IllegalStateException(String.format("Undefined has no function %s", str));
    }
}
