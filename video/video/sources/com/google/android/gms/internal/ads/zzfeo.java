package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfeo implements zzfem {
    public final String a;

    public zzfeo(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (!(obj instanceof zzfeo)) {
            return false;
        }
        return this.a.equals(((zzfeo) obj).a);
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
