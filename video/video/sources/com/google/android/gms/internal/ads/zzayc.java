package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzayc {
    public final Map a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            try {
                Map map = this.a;
                if (!map.containsKey(str)) {
                    map.put(str, new AtomicReference());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (AtomicReference) this.a.get(str);
    }
}
