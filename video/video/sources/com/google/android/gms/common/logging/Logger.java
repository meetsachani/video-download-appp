package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class Logger {
    public final String a;
    public final String b;
    public final GmsLogger c;
    public final int d;

    @KeepForSdk
    public Logger(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.b = sb;
        this.a = str;
        this.c = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.d = i;
    }

    @KeepForSdk
    public void a(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Object... objArr) {
        if (g(3)) {
            Log.d(this.a, d(str, objArr));
        }
    }

    @KeepForSdk
    public void b(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Throwable th, @InterfaceC5670cr1 Object... objArr) {
        Log.e(this.a, d(str, objArr), th);
    }

    @KeepForSdk
    public void c(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Object... objArr) {
        Log.e(this.a, d(str, objArr));
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String d(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String e() {
        return this.a;
    }

    @KeepForSdk
    public void f(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Object... objArr) {
        Log.i(this.a, d(str, objArr));
    }

    @KeepForSdk
    public boolean g(int i) {
        return this.d <= i;
    }

    @KeepForSdk
    public void h(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Throwable th, @InterfaceC5670cr1 Object... objArr) {
        if (g(2)) {
            Log.v(this.a, d(str, objArr), th);
        }
    }

    @KeepForSdk
    public void i(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Object... objArr) {
        if (g(2)) {
            Log.v(this.a, d(str, objArr));
        }
    }

    @KeepForSdk
    public void j(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Object... objArr) {
        Log.w(this.a, d(str, objArr));
    }

    @KeepForSdk
    public void k(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Throwable th, @InterfaceC5670cr1 Object... objArr) {
        Log.wtf(this.a, d(str, objArr), th);
    }

    @KeepForSdk
    public void l(@InterfaceC5670cr1 Throwable th) {
        Log.wtf(this.a, th);
    }
}
