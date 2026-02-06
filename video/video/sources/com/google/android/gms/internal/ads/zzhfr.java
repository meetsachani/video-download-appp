package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzhfr implements zzhfv {
    public final Map a;

    public zzhfr(Map map) {
        this.a = Collections.unmodifiableMap(map);
    }

    public final Map a() {
        return this.a;
    }
}
