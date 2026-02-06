package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzha {
    public final Map a = new HashMap();
    @InterfaceC11300zs1
    public Map b;

    public final synchronized Map a() {
        try {
            if (this.b == null) {
                this.b = Collections.unmodifiableMap(new HashMap(this.a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
