package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;
import o.C2531Be;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zal {
    public int d;
    public final C2531Be<ApiKey<?>, String> b = new C2531Be<>();
    public final TaskCompletionSource<Map<ApiKey<?>, String>> c = new TaskCompletionSource<>();
    public boolean e = false;
    public final C2531Be<ApiKey<?>, ConnectionResult> a = new C2531Be<>();

    public zal(Iterable<? extends HasApiKey<?>> iterable) {
        for (HasApiKey<?> hasApiKey : iterable) {
            this.a.put(hasApiKey.c(), null);
        }
        this.d = this.a.keySet().size();
    }

    public final Task<Map<ApiKey<?>, String>> a() {
        return this.c.a();
    }

    public final Set<ApiKey<?>> b() {
        return this.a.keySet();
    }

    public final void c(ApiKey<?> apiKey, ConnectionResult connectionResult, @InterfaceC11300zs1 String str) {
        this.a.put(apiKey, connectionResult);
        this.b.put(apiKey, str);
        this.d--;
        if (!connectionResult.H0()) {
            this.e = true;
        }
        if (this.d == 0) {
            if (this.e) {
                this.c.b(new AvailabilityException(this.a));
                return;
            }
            this.c.c(this.b);
        }
    }
}
