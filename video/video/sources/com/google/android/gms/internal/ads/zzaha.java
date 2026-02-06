package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.C5885dk1;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzaha extends zzagx {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public zzaha(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(C5885dk1.b1);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaha.class == obj.getClass()) {
            zzaha zzahaVar = (zzaha) obj;
            if (this.b == zzahaVar.b && this.c == zzahaVar.c && this.d == zzahaVar.d && Arrays.equals(this.e, zzahaVar.e) && Arrays.equals(this.f, zzahaVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b + 527) * 31) + this.c) * 31) + this.d) * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f);
    }
}
