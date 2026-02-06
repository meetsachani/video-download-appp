package com.google.firebase.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import o.C10201vM;
import o.InterfaceC5056aJ2;

/* loaded from: classes3.dex */
public class DataCollectionConfigStorage {
    public static final String e = "com.google.firebase.common.prefs:";
    @InterfaceC5056aJ2
    public static final String f = "firebase_data_collection_default_enabled";
    public final Context a;
    public final SharedPreferences b;
    public final Publisher c;
    public boolean d;

    public DataCollectionConfigStorage(Context context, String str, Publisher publisher) {
        Context a = a(context);
        this.a = a;
        this.b = a.getSharedPreferences(e + str, 0);
        this.c = publisher;
        this.d = c();
    }

    public static Context a(Context context) {
        return C10201vM.c(context);
    }

    public synchronized boolean b() {
        return this.d;
    }

    public final boolean c() {
        if (this.b.contains(f)) {
            return this.b.getBoolean(f, true);
        }
        return d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(f)) {
                return applicationInfo.metaData.getBoolean(f);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.b.edit().remove(f).apply();
                f(d());
            } else {
                boolean equals = Boolean.TRUE.equals(bool);
                this.b.edit().putBoolean(f, equals).apply();
                f(equals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.c.c(new Event<>(DataCollectionDefaultChange.class, new DataCollectionDefaultChange(z)));
        }
    }
}
