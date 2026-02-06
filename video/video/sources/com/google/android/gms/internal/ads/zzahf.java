package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzahf {
    public final long a;
    public final long b;
    public final int c;

    public zzahf(long j, long j2, int i) {
        boolean z;
        if (j < j2) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahf.class == obj.getClass()) {
            zzahf zzahfVar = (zzahf) obj;
            if (this.a == zzahfVar.a && this.b == zzahfVar.b && this.c == zzahfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)};
        String str = zzeu.a;
        return String.format(Locale.US, "Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", objArr);
    }
}
