package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzao implements zzaq {
    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return zzaq.j;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double d() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String e() {
        return "null";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof zzao;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean f() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> h() {
        return null;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq i(String str, zzh zzhVar, List<zzaq> list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }
}
