package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import o.InterfaceC5299bJ2;

/* loaded from: classes3.dex */
public final class zzl {
    @InterfaceC5299bJ2
    public Map<String, Callable<? extends zzal>> a = new HashMap();

    public final zzaq a(String str) {
        if (this.a.containsKey(str)) {
            try {
                return this.a.get(str).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: " + str);
            }
        }
        return zzaq.i;
    }

    public final void b(String str, Callable<? extends zzal> callable) {
        this.a.put(str, callable);
    }
}
