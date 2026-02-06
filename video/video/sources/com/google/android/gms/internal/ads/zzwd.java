package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzwd {
    public final int a;
    public final boolean b;

    public zzwd(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwd.class == obj.getClass()) {
            zzwd zzwdVar = (zzwd) obj;
            if (this.a == zzwdVar.a && this.b == zzwdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
