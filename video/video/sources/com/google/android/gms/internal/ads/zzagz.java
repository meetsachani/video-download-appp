package com.google.android.gms.internal.ads;

import java.util.Objects;
import o.C11201zS0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzagz extends zzagx {
    public final String b;
    public final String c;
    public final String d;

    public zzagz(String str, String str2, String str3) {
        super(C11201zS0.Z0);
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagz.class == obj.getClass()) {
            zzagz zzagzVar = (zzagz) obj;
            if (Objects.equals(this.c, zzagzVar.c) && Objects.equals(this.b, zzagzVar.b) && Objects.equals(this.d, zzagzVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzagx
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
