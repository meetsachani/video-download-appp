package com.google.firebase.crashlytics.internal;

import android.util.Log;

/* loaded from: classes3.dex */
public class Logger {
    public static final String c = "FirebaseCrashlytics";
    public static final Logger d = new Logger(c);
    public final String a;
    public int b = 4;

    public Logger(String str) {
        this.a = str;
    }

    public static Logger f() {
        return d;
    }

    public final boolean a(int i) {
        if (this.b > i && !Log.isLoggable(this.a, i)) {
            return false;
        }
        return true;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.a, str, th);
        }
    }

    public void i(int i, String str) {
        j(i, str, false);
    }

    public void j(int i, String str, boolean z) {
        if (!z && !a(i)) {
            return;
        }
        Log.println(i, this.a, str);
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.a, str, th);
        }
    }

    public void m(String str) {
        n(str, null);
    }

    public void n(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.a, str, th);
        }
    }
}
