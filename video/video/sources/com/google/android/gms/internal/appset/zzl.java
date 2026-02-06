package com.google.android.gms.internal.appset;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzl implements AppSetIdClient {
    @InterfaceC8710pF0("InternalAppSetAppSideClientImpl.class")
    @InterfaceC11300zs1
    public static AppSetIdClient e;
    public final Context a;
    public boolean b;
    public final ScheduledExecutorService c;
    public final ExecutorService d;

    public zzl(Context context) {
        this.b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.c = newSingleThreadScheduledExecutor;
        this.d = Executors.newSingleThreadExecutor();
        this.a = context;
        if (!this.b) {
            newSingleThreadScheduledExecutor.scheduleAtFixedRate(new zzj(this, null), 0L, 86400L, TimeUnit.SECONDS);
            this.b = true;
        }
    }

    @InterfaceC5670cr1
    public static synchronized AppSetIdClient d(@InterfaceC5670cr1 Context context) {
        AppSetIdClient appSetIdClient;
        synchronized (zzl.class) {
            try {
                Preconditions.s(context, "Context must not be null");
                if (e == null) {
                    e = new zzl(context.getApplicationContext());
                }
                appSetIdClient = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return appSetIdClient;
    }

    @InterfaceC5056aJ2
    public static final void f(Context context) {
        String str;
        String str2;
        if (!g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str2 = "Failed to clear app set ID generated for App ".concat(valueOf);
            } else {
                str2 = new String("Failed to clear app set ID generated for App ");
            }
            Log.e("AppSet", str2);
        }
        if (!g(context).edit().remove("app_set_id_last_used_time").commit()) {
            String valueOf2 = String.valueOf(context.getPackageName());
            if (valueOf2.length() != 0) {
                str = "Failed to clear app set ID last used time for App ".concat(valueOf2);
            } else {
                str = new String("Failed to clear app set ID last used time for App ");
            }
            Log.e("AppSet", str);
        }
    }

    public static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    public static final void h(Context context) throws zzk {
        String str;
        SharedPreferences g = g(context);
        if (!g.edit().putLong("app_set_id_last_used_time", DefaultClock.d().a()).commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            if (valueOf.length() != 0) {
                str = "Failed to store app set ID last used time for App ".concat(valueOf);
            } else {
                str = new String("Failed to store app set ID last used time for App ");
            }
            Log.e("AppSet", str);
            throw new zzk("Failed to store the app set ID last used time.");
        }
    }

    @InterfaceC5056aJ2
    public final long a() {
        long j = g(this.a).getLong("app_set_id_last_used_time", -1L);
        if (j == -1) {
            return -1L;
        }
        return j + 33696000000L;
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task<AppSetIdInfo> b() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.d.execute(new Runnable() { // from class: com.google.android.gms.internal.appset.zzh
            @Override // java.lang.Runnable
            public final void run() {
                zzl.this.e(taskCompletionSource);
            }
        });
        return taskCompletionSource.a();
    }

    public final /* synthetic */ void e(TaskCompletionSource taskCompletionSource) {
        String str;
        String str2;
        String string = g(this.a).getString("app_set_id", null);
        long a = a();
        if (string != null && DefaultClock.d().a() <= a) {
            try {
                h(this.a);
            } catch (zzk e2) {
                taskCompletionSource.b(e2);
                return;
            }
        } else {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    if (valueOf.length() != 0) {
                        str2 = "Failed to store app set ID generated for App ".concat(valueOf);
                    } else {
                        str2 = new String("Failed to store app set ID generated for App ");
                    }
                    Log.e("AppSet", str2);
                    throw new zzk("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.a;
                SharedPreferences g = g(context2);
                if (!g.edit().putLong("app_set_id_creation_time", DefaultClock.d().a()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    if (valueOf2.length() != 0) {
                        str = "Failed to store app set ID creation time for App ".concat(valueOf2);
                    } else {
                        str = new String("Failed to store app set ID creation time for App ");
                    }
                    Log.e("AppSet", str);
                    throw new zzk("Failed to store the app set ID creation time.");
                }
            } catch (zzk e3) {
                taskCompletionSource.b(e3);
                return;
            }
        }
        taskCompletionSource.c(new AppSetIdInfo(string, 1));
    }
}
