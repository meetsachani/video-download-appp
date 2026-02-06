package com.google.android.gms.internal.ads;

import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;

/* loaded from: classes2.dex */
public final class zzfd implements zzau {
    public final float a;
    public final float b;

    public zzfd(@InterfaceC2501Av0(from = -90.0d, to = 90.0d) float f, @InterfaceC2501Av0(from = -180.0d, to = 180.0d) float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        zzdc.e(z, "Invalid latitude or longitude");
        this.a = f;
        this.b = f2;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final /* synthetic */ void a(zzar zzarVar) {
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfd.class == obj.getClass()) {
            zzfd zzfdVar = (zzfd) obj;
            if (this.a == zzfdVar.a && this.b == zzfdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) + 527) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
