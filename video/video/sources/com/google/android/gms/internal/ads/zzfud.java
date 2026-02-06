package com.google.android.gms.internal.ads;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;
import o.C6566gU0;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfud {
    public final String a;

    public zzfud(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    public static String e(String str, String str2, @InterfaceC11300zs1 Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
                str2 = str2 + " [" + TextUtils.join(C6566gU0.h, objArr) + C6566gU0.g;
            }
        }
        return str + " : " + str2;
    }

    public final int a(String str, @InterfaceC11300zs1 Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", e(this.a, str, objArr));
        }
        return 0;
    }

    public final int b(Throwable th, String str, @InterfaceC11300zs1 Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", e(this.a, str, objArr), th);
        }
        return 0;
    }

    public final int c(String str, @InterfaceC11300zs1 Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", e(this.a, str, objArr));
        }
        return 0;
    }

    public final int d(String str, @InterfaceC11300zs1 Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", e(this.a, str, objArr));
        }
        return 0;
    }
}
