package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzxj {
    public final long a;
    public final long b;

    public zzxj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxj)) {
            return false;
        }
        zzxj zzxjVar = (zzxj) obj;
        if (this.a == zzxjVar.a && this.b == zzxjVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
