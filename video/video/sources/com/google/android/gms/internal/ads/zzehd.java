package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzehd {
    @InterfaceC11300zs1
    public zzegu a;

    public zzehd() {
    }

    public static zzehd b(zzegu zzeguVar) {
        return new zzehd(zzeguVar);
    }

    public final zzegu a(Clock clock, zzegw zzegwVar, zzedk zzedkVar, zzfjr zzfjrVar) {
        zzegu zzeguVar = this.a;
        if (zzeguVar != null) {
            return zzeguVar;
        }
        return new zzegu(clock, zzegwVar, zzedkVar, zzfjrVar);
    }

    public zzehd(zzegu zzeguVar) {
        this.a = zzeguVar;
    }
}
