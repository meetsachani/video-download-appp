package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.Objects;

/* loaded from: classes2.dex */
public final class zzbe {
    public final String a;
    public final double b;
    public final double c;
    public final double d;
    public final int e;

    public zzbe(String str, double d, double d2, double d3, int i) {
        this.a = str;
        this.c = d;
        this.b = d2;
        this.d = d3;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbe)) {
            return false;
        }
        zzbe zzbeVar = (zzbe) obj;
        if (!Objects.b(this.a, zzbeVar.a) || this.b != zzbeVar.b || this.c != zzbeVar.c || this.e != zzbeVar.e || Double.compare(this.d, zzbeVar.d) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.c(this.a, Double.valueOf(this.b), Double.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        return Objects.d(this).a("name", this.a).a("minBound", Double.valueOf(this.c)).a("maxBound", Double.valueOf(this.b)).a("percent", Double.valueOf(this.d)).a("count", Integer.valueOf(this.e)).toString();
    }
}
