package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.C5370bd;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.appevents.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2314d {
    @NotNull
    public static final String c = "com.facebook.appevents.AnalyticsUserIDStore.userID";
    @Nullable
    public static String e;
    public static volatile boolean f;
    @NotNull
    public static final C2314d a = new C2314d();
    public static final String b = C2314d.class.getSimpleName();
    @NotNull
    public static final ReentrantReadWriteLock d = new ReentrantReadWriteLock();

    @InterfaceC9511sW0
    @Nullable
    public static final String c() {
        if (!f) {
            Log.w(b, "initStore should have been called before calling setUserID");
            a.d();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = d;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = e;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th) {
            d.readLock().unlock();
            throw th;
        }
    }

    @InterfaceC9511sW0
    public static final void e() {
        if (f) {
            return;
        }
        K.b.e().execute(new Runnable() { // from class: com.facebook.appevents.c
            @Override // java.lang.Runnable
            public final void run() {
                C2314d.f();
            }
        });
    }

    public static final void f() {
        a.d();
    }

    @InterfaceC9511sW0
    public static final void g(@Nullable final String str) {
        C5370bd c5370bd = C5370bd.a;
        C5370bd.b();
        if (!f) {
            Log.w(b, "initStore should have been called before calling setUserID");
            a.d();
        }
        K.b.e().execute(new Runnable() { // from class: com.facebook.appevents.b
            @Override // java.lang.Runnable
            public final void run() {
                C2314d.h(str);
            }
        });
    }

    public static final void h(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            e = str;
            com.facebook.M m = com.facebook.M.a;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(com.facebook.M.n()).edit();
            edit.putString(c, e);
            edit.apply();
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            d.writeLock().unlock();
            throw th;
        }
    }

    public final void d() {
        if (f) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!f) {
                com.facebook.M m = com.facebook.M.a;
                e = PreferenceManager.getDefaultSharedPreferences(com.facebook.M.n()).getString(c, null);
                f = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            d.writeLock().unlock();
            throw th;
        }
    }
}
