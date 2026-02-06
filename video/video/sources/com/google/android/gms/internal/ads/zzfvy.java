package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class zzfvy {
    public static zzfvu a(zzfvu zzfvuVar) {
        if (!(zzfvuVar instanceof zzfvx)) {
            if (zzfvuVar instanceof zzfvv) {
                return zzfvuVar;
            }
            if (zzfvuVar instanceof Serializable) {
                return new zzfvv(zzfvuVar);
            }
            return new zzfvx(zzfvuVar);
        }
        return zzfvuVar;
    }
}
