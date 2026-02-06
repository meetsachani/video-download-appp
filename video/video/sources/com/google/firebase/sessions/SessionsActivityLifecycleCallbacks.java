package com.google.firebase.sessions;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.appcompat.widget.b;
import o.C6562gT0;
import o.C7458kA2;
import o.InterfaceC5056aJ2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class SessionsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    @NotNull
    public static final SessionsActivityLifecycleCallbacks X = new SessionsActivityLifecycleCallbacks();
    public static boolean Y;
    @Nullable
    public static SessionLifecycleClient Z;

    private SessionsActivityLifecycleCallbacks() {
    }

    @InterfaceC5056aJ2
    public static /* synthetic */ void b() {
    }

    public final boolean a() {
        return Y;
    }

    @Nullable
    public final SessionLifecycleClient c() {
        return Z;
    }

    public final void d(boolean z) {
        Y = z;
    }

    public final void e(@Nullable SessionLifecycleClient sessionLifecycleClient) {
        Z = sessionLifecycleClient;
        if (sessionLifecycleClient != null && Y) {
            Y = false;
            sessionLifecycleClient.k();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        C6562gT0.p(activity, b.r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        C6562gT0.p(activity, b.r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        C6562gT0.p(activity, b.r);
        SessionLifecycleClient sessionLifecycleClient = Z;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        C7458kA2 c7458kA2;
        C6562gT0.p(activity, b.r);
        SessionLifecycleClient sessionLifecycleClient = Z;
        if (sessionLifecycleClient != null) {
            sessionLifecycleClient.k();
            c7458kA2 = C7458kA2.a;
        } else {
            c7458kA2 = null;
        }
        if (c7458kA2 == null) {
            Y = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        C6562gT0.p(activity, b.r);
        C6562gT0.p(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        C6562gT0.p(activity, b.r);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        C6562gT0.p(activity, b.r);
    }
}
