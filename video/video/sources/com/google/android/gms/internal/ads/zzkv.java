package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzkv {
    public final long a;
    public final float b;
    public final long c;

    public /* synthetic */ zzkv(zzkt zzktVar, zzku zzkuVar) {
        this.a = zzkt.c(zzktVar);
        this.b = zzkt.a(zzktVar);
        this.c = zzkt.b(zzktVar);
    }

    public final zzkt a() {
        return new zzkt(this, null);
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkv)) {
            return false;
        }
        zzkv zzkvVar = (zzkv) obj;
        if (this.a == zzkvVar.a && this.b == zzkvVar.b && this.c == zzkvVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c));
    }
}
