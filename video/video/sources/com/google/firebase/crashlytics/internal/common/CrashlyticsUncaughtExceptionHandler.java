package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    public final CrashListener a;
    public final SettingsProvider b;
    public final Thread.UncaughtExceptionHandler c;
    public final CrashlyticsNativeComponent d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    /* loaded from: classes3.dex */
    public interface CrashListener {
        void a(SettingsProvider settingsProvider, Thread thread, Throwable th);
    }

    public CrashlyticsUncaughtExceptionHandler(CrashListener crashListener, SettingsProvider settingsProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, CrashlyticsNativeComponent crashlyticsNativeComponent) {
        this.a = crashListener;
        this.b = settingsProvider;
        this.c = uncaughtExceptionHandler;
        this.d = crashlyticsNativeComponent;
    }

    public boolean a() {
        return this.e.get();
    }

    public final boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            Logger.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        } else if (th == null) {
            Logger.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        } else if (this.d.b()) {
            Logger.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
            return false;
        } else {
            return true;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.a.a(this.b, thread, th);
                } else {
                    Logger.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
            } catch (Exception e) {
                Logger.f().e("An error occurred in the uncaught exception handler", e);
            }
            Logger.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.e.set(false);
        } catch (Throwable th2) {
            Logger.f().b("Completed exception processing. Invoking default exception handler.");
            this.c.uncaughtException(thread, th);
            this.e.set(false);
            throw th2;
        }
    }
}
