package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.InterfaceC11300zs1;
import o.InterfaceC3204Hx0;
import o.InterfaceC3302Ix0;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class GmsLogger {
    public final String a;
    @InterfaceC11300zs1
    public final String b;

    @KeepForSdk
    public GmsLogger(@InterfaceC5670cr1 String str) {
        this(str, null);
    }

    @KeepForSdk
    public boolean a(int i) {
        return Log.isLoggable(this.a, i);
    }

    @KeepForSdk
    public boolean b() {
        return false;
    }

    @KeepForSdk
    public void c(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        if (a(3)) {
            Log.d(str, r(str2));
        }
    }

    @KeepForSdk
    public void d(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Throwable th) {
        if (a(3)) {
            Log.d(str, r(str2), th);
        }
    }

    @KeepForSdk
    public void e(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        if (a(6)) {
            Log.e(str, r(str2));
        }
    }

    @KeepForSdk
    public void f(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Throwable th) {
        if (a(6)) {
            Log.e(str, r(str2), th);
        }
    }

    @KeepForSdk
    @InterfaceC3204Hx0
    public void g(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 @InterfaceC3302Ix0 String str2, @InterfaceC5670cr1 Object... objArr) {
        if (a(6)) {
            Log.e(str, s(str2, objArr));
        }
    }

    @KeepForSdk
    public void h(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        if (a(4)) {
            Log.i(str, r(str2));
        }
    }

    @KeepForSdk
    public void i(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Throwable th) {
        if (a(4)) {
            Log.i(str, r(str2), th);
        }
    }

    @KeepForSdk
    public void j(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
    }

    @KeepForSdk
    public void k(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Throwable th) {
    }

    @KeepForSdk
    public void l(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        if (a(2)) {
            Log.v(str, r(str2));
        }
    }

    @KeepForSdk
    public void m(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Throwable th) {
        if (a(2)) {
            Log.v(str, r(str2), th);
        }
    }

    @KeepForSdk
    public void n(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        if (a(5)) {
            Log.w(str, r(str2));
        }
    }

    @KeepForSdk
    public void o(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Throwable th) {
        if (a(5)) {
            Log.w(str, r(str2), th);
        }
    }

    @KeepForSdk
    @InterfaceC3204Hx0
    public void p(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 @InterfaceC3302Ix0 String str2, @InterfaceC5670cr1 Object... objArr) {
        if (a(5)) {
            Log.w(this.a, s(str2, objArr));
        }
    }

    @KeepForSdk
    public void q(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, @InterfaceC5670cr1 Throwable th) {
        if (a(7)) {
            Log.e(str, r(str2), th);
            Log.wtf(str, r(str2), th);
        }
    }

    public final String r(String str) {
        String str2 = this.b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    @InterfaceC3204Hx0
    public final String s(String str, Object... objArr) {
        String str2 = this.b;
        String format = String.format(str, objArr);
        if (str2 == null) {
            return format;
        }
        return str2.concat(format);
    }

    @KeepForSdk
    public GmsLogger(@InterfaceC5670cr1 String str, @InterfaceC11300zs1 String str2) {
        Preconditions.s(str, "log tag cannot be null");
        Preconditions.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
        this.b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
