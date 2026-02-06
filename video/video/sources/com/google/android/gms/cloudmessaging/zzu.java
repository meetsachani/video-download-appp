package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzu {
    @InterfaceC11300zs1
    public static zzu e;
    public final Context a;
    public final ScheduledExecutorService b;
    public zzn c = new zzn(this, null);
    public int d = 1;

    @InterfaceC5056aJ2
    public zzu(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static /* bridge */ /* synthetic */ Context a(zzu zzuVar) {
        return zzuVar.a;
    }

    public static synchronized zzu b(Context context) {
        zzu zzuVar;
        synchronized (zzu.class) {
            try {
                if (e == null) {
                    com.google.android.gms.internal.cloudmessaging.zze.a();
                    e = new zzu(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new NamedThreadFactory("MessengerIpcClient"))));
                }
                zzuVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzuVar;
    }

    public static /* bridge */ /* synthetic */ ScheduledExecutorService e(zzu zzuVar) {
        return zzuVar.b;
    }

    public final Task c(int i, Bundle bundle) {
        return g(new zzq(f(), i, bundle));
    }

    public final Task d(int i, Bundle bundle) {
        return g(new zzt(f(), 1, bundle));
    }

    public final synchronized int f() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }

    public final synchronized Task g(zzr zzrVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(zzrVar.toString()));
            }
            if (!this.c.g(zzrVar)) {
                zzn zznVar = new zzn(this, null);
                this.c = zznVar;
                zznVar.g(zzrVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzrVar.b.a();
    }
}
