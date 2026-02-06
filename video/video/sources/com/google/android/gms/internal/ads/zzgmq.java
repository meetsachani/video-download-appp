package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzgmq {
    public HashMap a = new HashMap();

    public final zzgms a() {
        if (this.a != null) {
            zzgms zzgmsVar = new zzgms(Collections.unmodifiableMap(this.a), null);
            this.a = null;
            return zzgmsVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
