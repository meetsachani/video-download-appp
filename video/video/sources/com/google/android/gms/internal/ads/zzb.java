package com.google.android.gms.internal.ads;

import java.util.Arrays;
import o.BR0;
import o.C10323vs;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzb {
    public static final zzb e = new zzb(null, new zza[0], 0, C10323vs.b, 0);
    public static final zza f = new zza(0).b(0);
    public final zza[] d;
    public final long b = 0;
    public final int a = 0;
    public final int c = 0;

    static {
        String str = zzeu.a;
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public zzb(@InterfaceC11300zs1 Object obj, zza[] zzaVarArr, long j, long j2, int i) {
        this.d = zzaVarArr;
    }

    public final zza a(@BR0(from = 0) int i) {
        if (i < 0) {
            return f;
        }
        return this.d[i];
    }

    public final boolean b(int i) {
        a(-1);
        return false;
    }

    public final boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzb.class == obj.getClass() && Arrays.equals(this.d, ((zzb) obj).d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) C10323vs.b) * 961) + Arrays.hashCode(this.d);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
