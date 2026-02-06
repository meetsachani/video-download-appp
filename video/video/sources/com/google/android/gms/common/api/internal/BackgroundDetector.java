package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceC7980mF0;

@KeepForSdk
/* loaded from: classes2.dex */
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final BackgroundDetector Z0 = new BackgroundDetector();
    public final AtomicBoolean X = new AtomicBoolean();
    public final AtomicBoolean Y = new AtomicBoolean();
    @InterfaceC7980mF0("instance")
    public final ArrayList Z = new ArrayList();
    @InterfaceC7980mF0("instance")
    public boolean Y0 = false;

    @KeepForSdk
    /* loaded from: classes2.dex */
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void a(boolean z);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static BackgroundDetector b() {
        return Z0;
    }

    @KeepForSdk
    public static void c(@InterfaceC5670cr1 Application application) {
        BackgroundDetector backgroundDetector = Z0;
        synchronized (backgroundDetector) {
            try {
                if (!backgroundDetector.Y0) {
                    application.registerActivityLifecycleCallbacks(backgroundDetector);
                    application.registerComponentCallbacks(backgroundDetector);
                    backgroundDetector.Y0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public void a(@InterfaceC5670cr1 BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (Z0) {
            this.Z.add(backgroundStateChangeListener);
        }
    }

    @KeepForSdk
    public boolean d() {
        return this.X.get();
    }

    @KeepForSdk
    @TargetApi(16)
    public boolean e(boolean z) {
        if (!this.Y.get()) {
            if (PlatformVersion.e()) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (!this.Y.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                    this.X.set(true);
                }
            } else {
                return z;
            }
        }
        return d();
    }

    public final void f(boolean z) {
        synchronized (Z0) {
            try {
                Iterator it = this.Z.iterator();
                while (it.hasNext()) {
                    ((BackgroundStateChangeListener) it.next()).a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@InterfaceC5670cr1 Activity activity, @InterfaceC11300zs1 Bundle bundle) {
        AtomicBoolean atomicBoolean = this.Y;
        boolean compareAndSet = this.X.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@InterfaceC5670cr1 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@InterfaceC5670cr1 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@InterfaceC5670cr1 Activity activity) {
        AtomicBoolean atomicBoolean = this.Y;
        boolean compareAndSet = this.X.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@InterfaceC5670cr1 Activity activity, @InterfaceC5670cr1 Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@InterfaceC5670cr1 Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@InterfaceC5670cr1 Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@InterfaceC5670cr1 Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.X.compareAndSet(false, true)) {
            this.Y.set(true);
            f(true);
        }
    }
}
