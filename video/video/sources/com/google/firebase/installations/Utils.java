package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.time.Clock;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class Utils {
    public static final String c = ":";
    public static Utils e;
    public final Clock a;
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern d = Pattern.compile("\\AA[\\w-]{38}\\z");

    public Utils(Clock clock) {
        this.a = clock;
    }

    public static Utils c() {
        return d(SystemClock.b());
    }

    public static Utils d(Clock clock) {
        if (e == null) {
            e = new Utils(clock);
        }
        return e;
    }

    public static boolean g(@InterfaceC11300zs1 String str) {
        return d.matcher(str).matches();
    }

    public static boolean h(@InterfaceC11300zs1 String str) {
        return str.contains(":");
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(@InterfaceC5670cr1 PersistedInstallationEntry persistedInstallationEntry) {
        if (TextUtils.isEmpty(persistedInstallationEntry.b()) || persistedInstallationEntry.h() + persistedInstallationEntry.c() < b() + b) {
            return true;
        }
        return false;
    }
}
