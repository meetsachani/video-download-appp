package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public class DataCollectionArbiter {
    public static final String i = "firebase_crashlytics_collection_enabled";
    public final SharedPreferences a;
    public final FirebaseApp b;
    public final Object c;
    public TaskCompletionSource<Void> d;
    public boolean e;
    public boolean f;
    @InterfaceC11300zs1
    public Boolean g;
    public final TaskCompletionSource<Void> h;

    public DataCollectionArbiter(FirebaseApp firebaseApp) {
        Object obj = new Object();
        this.c = obj;
        this.d = new TaskCompletionSource<>();
        this.e = false;
        this.f = false;
        this.h = new TaskCompletionSource<>();
        Context n = firebaseApp.n();
        this.b = firebaseApp;
        this.a = CommonUtils.r(n);
        Boolean b = b();
        this.g = b == null ? a(n) : b;
        synchronized (obj) {
            try {
                if (d()) {
                    this.d.e(null);
                    this.e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC11300zs1
    public static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(i)) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(i));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Logger.f().e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean(i, bool.booleanValue());
        } else {
            edit.remove(i);
        }
        edit.apply();
    }

    @InterfaceC11300zs1
    public final Boolean a(Context context) {
        Boolean g = g(context);
        if (g == null) {
            this.f = false;
            return null;
        }
        this.f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g));
    }

    @InterfaceC11300zs1
    public final Boolean b() {
        if (this.a.contains(i)) {
            this.f = false;
            return Boolean.valueOf(this.a.getBoolean(i, true));
        }
        return null;
    }

    public void c(boolean z) {
        if (z) {
            this.h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean e;
        try {
            Boolean bool = this.g;
            if (bool != null) {
                e = bool.booleanValue();
            } else {
                e = e();
            }
            f(e);
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public final boolean e() {
        try {
            return this.b.A();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final void f(boolean z) {
        String str;
        String str2;
        if (z) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (this.g == null) {
            str2 = "global Firebase setting";
        } else if (this.f) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        Logger.f().b(String.format("Crashlytics automatic data collection %s by %s.", str, str2));
    }

    public synchronized void h(@InterfaceC11300zs1 Boolean bool) {
        Boolean a;
        if (bool != null) {
            try {
                this.f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            a = bool;
        } else {
            a = a(this.b.n());
        }
        this.g = a;
        i(this.a, bool);
        synchronized (this.c) {
            if (d()) {
                if (!this.e) {
                    this.d.e(null);
                    this.e = true;
                }
            } else if (this.e) {
                this.d = new TaskCompletionSource<>();
                this.e = false;
            }
        }
    }

    public Task<Void> j() {
        Task<Void> a;
        synchronized (this.c) {
            a = this.d.a();
        }
        return a;
    }

    public Task<Void> k(Executor executor) {
        return Utils.j(executor, this.h.a(), j());
    }
}
