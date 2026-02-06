package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FcmLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public final Set<Intent> X = Collections.newSetFromMap(new WeakHashMap());

    public final void b(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle = extras.getBundle(Constants.MessageNotificationKeys.E);
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (MessagingAnalytics.F(bundle)) {
            MessagingAnalytics.x(bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @SuppressLint({"ThreadPoolCreation"})
    public void onActivityCreated(Activity activity, Bundle bundle) {
        final Intent intent = activity.getIntent();
        if (intent != null && this.X.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.firebase.messaging.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        FcmLifecycleCallbacks.this.b(intent);
                    }
                });
            } else {
                b(intent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.X.remove(activity.getIntent());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
