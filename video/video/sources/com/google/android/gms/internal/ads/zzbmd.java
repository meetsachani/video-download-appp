package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbmd implements InitializationStatus {
    public final Map a;

    public zzbmd(Map map) {
        this.a = map;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public final Map<String, AdapterStatus> a() {
        return this.a;
    }
}
