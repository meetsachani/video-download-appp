package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzag implements zzaq {
    public final boolean X;

    public zzag(Boolean bool) {
        if (bool == null) {
            this.X = false;
        } else {
            this.X = bool.booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq c() {
        return new zzag(Boolean.valueOf(this.X));
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double d() {
        double d;
        if (this.X) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        return Double.valueOf(d);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String e() {
        return Boolean.toString(this.X);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzag) && this.X == ((zzag) obj).X) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean f() {
        return Boolean.valueOf(this.X);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> h() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.X).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq i(String str, zzh zzhVar, List<zzaq> list) {
        if ("toString".equals(str)) {
            return new zzas(Boolean.toString(this.X));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.X), str));
    }

    public final String toString() {
        return String.valueOf(this.X);
    }
}
