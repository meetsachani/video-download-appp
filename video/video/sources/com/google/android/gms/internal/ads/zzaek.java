package com.google.android.gms.internal.ads;

import o.C6566gU0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaek {
    public final zzaen a;
    public final zzaen b;

    public zzaek(zzaen zzaenVar, zzaen zzaenVar2) {
        this.a = zzaenVar;
        this.b = zzaenVar2;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaek.class == obj.getClass()) {
            zzaek zzaekVar = (zzaek) obj;
            if (this.a.equals(zzaekVar.a) && this.b.equals(zzaekVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String concat;
        zzaen zzaenVar = this.a;
        zzaen zzaenVar2 = this.b;
        String obj = zzaenVar.toString();
        if (zzaenVar.equals(zzaenVar2)) {
            concat = "";
        } else {
            concat = C6566gU0.h.concat(zzaenVar2.toString());
        }
        return C6566gU0.f + obj + concat + C6566gU0.g;
    }
}
