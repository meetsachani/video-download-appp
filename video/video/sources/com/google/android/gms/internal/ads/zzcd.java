package com.google.android.gms.internal.ads;

import o.BR0;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;

/* loaded from: classes2.dex */
public final class zzcd {
    public static final zzcd d = new zzcd(0, 0, 1.0f);
    @BR0(from = 0)
    public final int a;
    @BR0(from = 0)
    public final int b;
    @InterfaceC2501Av0(from = 0.0d, fromInclusive = false)
    public final float c;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public zzcd(@BR0(from = 0) int i, @BR0(from = 0) int i2, @InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.a == zzcdVar.a && this.b == zzcdVar.b && this.c == zzcdVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a + 217) * 31) + this.b) * 31) + Float.floatToRawIntBits(this.c);
    }
}
