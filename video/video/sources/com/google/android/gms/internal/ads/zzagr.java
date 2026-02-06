package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import o.HA;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzagr extends zzagx {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final zzagx[] f;

    public zzagr(String str, boolean z, boolean z2, String[] strArr, zzagx[] zzagxVarArr) {
        super(HA.b1);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = zzagxVarArr;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagr.class == obj.getClass()) {
            zzagr zzagrVar = (zzagr) obj;
            if (this.c == zzagrVar.c && this.d == zzagrVar.d && Objects.equals(this.b, zzagrVar.b) && Arrays.equals(this.e, zzagrVar.e) && Arrays.equals(this.f, zzagrVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.c ? 1 : 0) + 527) * 31) + (this.d ? 1 : 0)) * 31) + this.b.hashCode();
    }
}
