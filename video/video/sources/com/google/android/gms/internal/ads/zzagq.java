package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import o.GA;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzagq extends zzagx {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final zzagx[] g;

    public zzagq(String str, int i, int i2, long j, long j2, zzagx[] zzagxVarArr) {
        super(GA.c1);
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = zzagxVarArr;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagq.class == obj.getClass()) {
            zzagq zzagqVar = (zzagq) obj;
            if (this.c == zzagqVar.c && this.d == zzagqVar.d && this.e == zzagqVar.e && this.f == zzagqVar.f && Objects.equals(this.b, zzagqVar.b) && Arrays.equals(this.g, zzagqVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        long j = this.f;
        return ((((((((this.c + 527) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) j)) * 31) + str.hashCode();
    }
}
