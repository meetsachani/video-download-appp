package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import o.D6;
import o.InterfaceC10697xN2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ProxyNotificationInitializer {
    public static final String a = "firebase_messaging_notification_delegation_enabled";

    private ProxyNotificationInitializer() {
    }

    public static /* synthetic */ void a(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        String notificationDelegate;
        try {
            if (!b(context)) {
                Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                return;
            }
            ProxyNotificationPreferences.c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else {
                notificationDelegate = notificationManager.getNotificationDelegate();
                if ("com.google.android.gms".equals(notificationDelegate)) {
                    notificationManager.setNotificationDelegate(null);
                }
            }
        } finally {
            taskCompletionSource.e(null);
        }
    }

    public static boolean b(Context context) {
        if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
            return true;
        }
        return false;
    }

    @InterfaceC10697xN2
    public static void c(Context context) {
        if (ProxyNotificationPreferences.b(context)) {
            return;
        }
        e(new D6(), context, f(context));
    }

    public static boolean d(Context context) {
        String notificationDelegate;
        if (!PlatformVersion.p()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Platform doesn't support proxying.");
            }
            return false;
        } else if (b(context)) {
            notificationDelegate = ((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate();
            if (!"com.google.android.gms".equals(notificationDelegate)) {
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "GMS core is set for proxying");
                return true;
            }
            return true;
        } else {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
    }

    @TargetApi(29)
    public static Task<Void> e(Executor executor, final Context context, final boolean z) {
        if (!PlatformVersion.p()) {
            return Tasks.g(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new Runnable() { // from class: com.google.firebase.messaging.i
            @Override // java.lang.Runnable
            public final void run() {
                ProxyNotificationInitializer.a(context, z, taskCompletionSource);
            }
        });
        return taskCompletionSource.a();
    }

    public static boolean f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(a)) {
                return applicationInfo.metaData.getBoolean(a);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
