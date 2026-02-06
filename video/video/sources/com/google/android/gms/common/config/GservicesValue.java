package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.VP0;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GservicesValue<T> {
    public static final Object d = new Object();
    @InterfaceC5670cr1
    public final String a;
    @InterfaceC5670cr1
    public final Object b;
    @InterfaceC11300zs1
    public Object c = null;

    public GservicesValue(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Object obj) {
        this.a = str;
        this.b = obj;
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static boolean c() {
        synchronized (d) {
        }
        return false;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static GservicesValue<Float> f(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Float f) {
        return new zzd(str, f);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static GservicesValue<Integer> g(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Integer num) {
        return new zzc(str, num);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static GservicesValue<Long> h(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 Long l) {
        return new zzb(str, l);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static GservicesValue<String> i(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        return new zze(str, str2);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static GservicesValue<Boolean> j(@InterfaceC5670cr1 String str, boolean z) {
        return new zza(str, Boolean.valueOf(z));
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @KeepForSdk
    public final T a() {
        T t;
        T t2 = (T) this.c;
        if (t2 != null) {
            return t2;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = d;
        synchronized (obj) {
        }
        synchronized (obj) {
        }
        try {
            try {
                t = (T) k(this.a);
            } catch (SecurityException unused) {
                long clearCallingIdentity = Binder.clearCallingIdentity();
                Object k = k(this.a);
                Binder.restoreCallingIdentity(clearCallingIdentity);
                t = (T) k;
            }
            return t;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    @Deprecated
    @VP0(replacement = "this.get()")
    @InterfaceC5670cr1
    @KeepForSdk
    public final T b() {
        return a();
    }

    @InterfaceC5056aJ2
    @KeepForSdk
    public void d(@InterfaceC5670cr1 T t) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.c = t;
        Object obj = d;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @InterfaceC5056aJ2
    @KeepForSdk
    public void e() {
        this.c = null;
    }

    @InterfaceC5670cr1
    public abstract Object k(@InterfaceC5670cr1 String str);
}
