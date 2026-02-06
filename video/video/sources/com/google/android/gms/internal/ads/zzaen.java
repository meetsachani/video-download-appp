package com.google.android.gms.internal.ads;

import o.C6566gU0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaen {
    public static final zzaen c = new zzaen(0, 0);
    public final long a;
    public final long b;

    public zzaen(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaen.class == obj.getClass()) {
            zzaen zzaenVar = (zzaen) obj;
            if (this.a == zzaenVar.a && this.b == zzaenVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        return "[timeUs=" + this.a + ", position=" + this.b + C6566gU0.g;
    }
}
