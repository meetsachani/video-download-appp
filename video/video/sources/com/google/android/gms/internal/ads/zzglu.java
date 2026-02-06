package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzglu {
    public final Map a = new HashMap();
    public final Map b = new HashMap();

    private zzglu() {
    }

    public final zzglu a(Enum r2, Object obj) {
        this.a.put(r2, obj);
        this.b.put(obj, r2);
        return this;
    }

    public final zzglw b() {
        return new zzglw(Collections.unmodifiableMap(this.a), Collections.unmodifiableMap(this.b), null);
    }

    public /* synthetic */ zzglu(zzglv zzglvVar) {
    }
}
