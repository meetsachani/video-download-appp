package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzmd {
    public static final zzmd c;
    public static final zzmd d;
    public final long a;
    public final long b;

    static {
        zzmd zzmdVar = new zzmd(0L, 0L);
        c = zzmdVar;
        new zzmd(Long.MAX_VALUE, Long.MAX_VALUE);
        new zzmd(Long.MAX_VALUE, 0L);
        new zzmd(0L, Long.MAX_VALUE);
        d = zzmdVar;
    }

    public zzmd(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        zzdc.d(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzmd.class == obj.getClass()) {
            zzmd zzmdVar = (zzmd) obj;
            if (this.a == zzmdVar.a && this.b == zzmdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
