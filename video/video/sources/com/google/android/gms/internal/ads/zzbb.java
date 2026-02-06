package com.google.android.gms.internal.ads;

import java.util.Locale;
import o.InterfaceC11300zs1;
import o.InterfaceC2501Av0;

/* loaded from: classes2.dex */
public final class zzbb {
    public static final zzbb d = new zzbb(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = zzeu.a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public zzbb(@InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f, @InterfaceC2501Av0(from = 0.0d, fromInclusive = false) float f2) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        zzdc.d(z);
        zzdc.d(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final long a(long j) {
        return j * this.c;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbb.class == obj.getClass()) {
            zzbb zzbbVar = (zzbb) obj;
            if (this.a == zzbbVar.a && this.b == zzbbVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.a) + 527) * 31) + Float.floatToRawIntBits(this.b);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = zzeu.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
