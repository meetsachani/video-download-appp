package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import o.C6566gU0;
import o.InterfaceC11300zs1;
import o.InterfaceC3204Hx0;
import o.InterfaceC3302Ix0;
import o.InterfaceC5670cr1;
import o.InterfaceC6181ey;
import o.InterfaceC8557od0;
import o.UE;

@KeepForSdk
/* loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
        throw new AssertionError("Uninstantiable");
    }

    public static String A(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + 48);
        int i = 0;
        int i2 = 0;
        while (i < 3 && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append(str.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(str.substring(i2));
        if (i < 3) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < 3; i3++) {
                sb.append(C6566gU0.h);
                sb.append(objArr[i3]);
            }
            sb.append(C6566gU0.g);
        }
        return sb.toString();
    }

    @KeepForSdk
    public static void a(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    @KeepForSdk
    public static void b(boolean z, @InterfaceC5670cr1 Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void c(boolean z, @InterfaceC5670cr1 String str, @InterfaceC5670cr1 Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    @KeepForSdk
    public static double d(double d, double d2, double d3, @InterfaceC5670cr1 String str) {
        if (d >= d2) {
            if (d <= d3) {
                return d;
            }
            throw new IllegalArgumentException(A("%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d2), Double.valueOf(d3)));
        }
        throw new IllegalArgumentException(A("%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d2), Double.valueOf(d3)));
    }

    @KeepForSdk
    public static float e(float f, float f2, float f3, @InterfaceC5670cr1 String str) {
        if (f >= f2) {
            if (f <= f3) {
                return f;
            }
            throw new IllegalArgumentException(A("%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f2), Float.valueOf(f3)));
        }
        throw new IllegalArgumentException(A("%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f2), Float.valueOf(f3)));
    }

    @InterfaceC6181ey
    @KeepForSdk
    public static int f(int i, int i2, int i3, @InterfaceC5670cr1 String str) {
        if (i >= i2) {
            if (i <= i3) {
                return i;
            }
            throw new IllegalArgumentException(A("%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        throw new IllegalArgumentException(A("%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    @KeepForSdk
    public static long g(long j, long j2, long j3, @InterfaceC5670cr1 String str) {
        if (j >= j2) {
            if (j <= j3) {
                return j;
            }
            throw new IllegalArgumentException(A("%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j2), Long.valueOf(j3)));
        }
        throw new IllegalArgumentException(A("%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    @KeepForSdk
    public static void h(@InterfaceC5670cr1 Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            throw new IllegalStateException("Must be called on " + name + " thread, but got " + str + UE.h);
        }
    }

    @KeepForSdk
    public static void i(@InterfaceC5670cr1 Handler handler, @InterfaceC5670cr1 String str) {
        if (Looper.myLooper() == handler.getLooper()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @KeepForSdk
    public static void j() {
        k("Must be called on the main application thread");
    }

    @KeepForSdk
    public static void k(@InterfaceC5670cr1 String str) {
        if (com.google.android.gms.common.util.zzb.a()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @InterfaceC6181ey
    @InterfaceC8557od0({"#1"})
    @InterfaceC5670cr1
    @KeepForSdk
    public static String l(@InterfaceC11300zs1 String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException("Given String is empty or null");
    }

    @InterfaceC6181ey
    @InterfaceC8557od0({"#1"})
    @InterfaceC5670cr1
    @KeepForSdk
    public static String m(@InterfaceC11300zs1 String str, @InterfaceC5670cr1 Object obj) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void n() {
        o("Must not be called on GoogleApiHandler thread.");
    }

    @KeepForSdk
    public static void o(@InterfaceC5670cr1 String str) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException(str);
            }
        }
    }

    @KeepForSdk
    public static void p() {
        q("Must not be called on the main application thread");
    }

    @KeepForSdk
    public static void q(@InterfaceC5670cr1 String str) {
        if (!com.google.android.gms.common.util.zzb.a()) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @InterfaceC6181ey
    @InterfaceC8557od0({"#1"})
    @InterfaceC5670cr1
    @KeepForSdk
    public static <T> T r(@InterfaceC11300zs1 T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null reference");
    }

    @InterfaceC6181ey
    @InterfaceC8557od0({"#1"})
    @InterfaceC5670cr1
    @KeepForSdk
    public static <T> T s(@InterfaceC5670cr1 T t, @InterfaceC5670cr1 Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @InterfaceC6181ey
    @KeepForSdk
    public static int t(int i) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    @InterfaceC6181ey
    @KeepForSdk
    public static int u(int i, @InterfaceC5670cr1 Object obj) {
        if (i != 0) {
            return i;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @InterfaceC6181ey
    @KeepForSdk
    public static long v(long j) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    @InterfaceC6181ey
    @KeepForSdk
    public static long w(long j, @InterfaceC5670cr1 Object obj) {
        if (j != 0) {
            return j;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }

    @KeepForSdk
    public static void x(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    @KeepForSdk
    public static void y(boolean z, @InterfaceC5670cr1 Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    @KeepForSdk
    @InterfaceC3204Hx0
    public static void z(boolean z, @InterfaceC5670cr1 @InterfaceC3302Ix0 String str, @InterfaceC5670cr1 Object... objArr) {
        if (z) {
            return;
        }
        throw new IllegalStateException(String.format(str, objArr));
    }
}
