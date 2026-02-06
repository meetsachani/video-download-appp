package com.google.android.gms.common.providers;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;
import o.InterfaceC5670cr1;

@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class PooledExecutorsProvider {
    public static PooledExecutorFactory a;

    /* loaded from: classes2.dex */
    public interface PooledExecutorFactory {
        @InterfaceC5670cr1
        @KeepForSdk
        @Deprecated
        ScheduledExecutorService a();
    }

    private PooledExecutorsProvider() {
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    public static synchronized PooledExecutorFactory a() {
        PooledExecutorFactory pooledExecutorFactory;
        synchronized (PooledExecutorsProvider.class) {
            try {
                if (a == null) {
                    a = new zza();
                }
                pooledExecutorFactory = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pooledExecutorFactory;
    }
}
