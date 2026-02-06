package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;
import o.InterfaceC8710pF0;

/* loaded from: classes3.dex */
class RequestLimiter {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final Utils a;
    @InterfaceC8710pF0("this")
    public long b;
    @InterfaceC8710pF0("this")
    public int c;

    public RequestLimiter(Utils utils) {
        this.a = utils;
    }

    public static boolean c(int i) {
        if (i != 429) {
            return i >= 500 && i < 600;
        }
        return true;
    }

    public static boolean d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    public final synchronized long a(int i) {
        if (!c(i)) {
            return d;
        }
        return (long) Math.min(Math.pow(2.0d, this.c) + this.a.e(), e);
    }

    public synchronized boolean b() {
        boolean z;
        if (this.c != 0) {
            if (this.a.a() <= this.b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public final synchronized void e() {
        this.c = 0;
    }

    public synchronized void f(int i) {
        if (d(i)) {
            e();
            return;
        }
        this.c++;
        this.b = this.a.a() + a(i);
    }

    public RequestLimiter() {
        this.a = Utils.c();
    }
}
