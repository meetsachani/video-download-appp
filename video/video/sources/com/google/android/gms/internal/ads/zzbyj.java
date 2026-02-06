package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbyj {
    public final AtomicReference a = new AtomicReference(null);
    public final Object b = new Object();
    @InterfaceC11300zs1
    public String c = null;
    @InterfaceC5056aJ2
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicInteger e = new AtomicInteger(-1);
    public final AtomicReference f = new AtomicReference(null);
    public final AtomicReference g = new AtomicReference(null);
    public final ConcurrentMap h = new ConcurrentHashMap(9);
    public final Object i;

    public zzbyj() {
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.i = new Object();
    }

    public static /* synthetic */ String a(zzbyj zzbyjVar, Context context) {
        return (String) zzbyjVar.s("getAppInstanceId", context);
    }

    public static final Bundle q(@InterfaceC11300zs1 Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    @InterfaceC5056aJ2
    public static final boolean r(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.z0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.A0)).intValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    @InterfaceC11300zs1
    public final String b(Context context) {
        Object s;
        if (p(context) && (s = s("generateEventId", context)) != null) {
            return s.toString();
        }
        return null;
    }

    @InterfaceC11300zs1
    public final String c(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!p(context)) {
            return null;
        }
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.x0)).longValue();
        if (longValue < 0) {
            return (String) s("getAppInstanceId", context);
        }
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() == null) {
            if (ClientLibraryUtils.c()) {
                threadPoolExecutor = zzfrk.a().b(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.y0)).intValue(), new zzbyi(this), 2);
            } else {
                zzbcm zzbcmVar = zzbcv.y0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzbyi(this));
            }
            zzbyg.a(atomicReference, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzbyh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzbyj.a(zzbyj.this, context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String d(Context context) {
        if (p(context)) {
            AtomicReference atomicReference = this.f;
            if (x(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str = (String) t(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                    if (str == null) {
                        str = (String) t(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                    }
                    if (str == null) {
                        return "";
                    }
                    return str;
                } catch (Exception unused) {
                    w("getCurrentScreenName", false);
                }
            }
        }
        return "";
    }

    @InterfaceC11300zs1
    public final String e(Context context) {
        if (!p(context)) {
            return null;
        }
        synchronized (this.b) {
            try {
                String str = this.c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) s("getGmpAppId", context);
                this.c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Context context, String str) {
        if (!p(context)) {
            return;
        }
        u(context, str, "beginAdUnitExposure");
    }

    public final void g(Context context, String str) {
        if (!p(context)) {
            return;
        }
        u(context, str, "endAdUnitExposure");
    }

    public final void h(Context context, String str) {
        v(context, "_aa", str, null);
    }

    public final void i(Context context, String str) {
        v(context, "_aq", str, null);
    }

    public final void j(Context context, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 Map map) {
        v(context, "_ac", str, q(map));
    }

    public final void k(Context context, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 Map map) {
        v(context, "_ai", str, q(map));
    }

    public final void l(Context context, @InterfaceC11300zs1 String str, String str2, String str3, int i) {
        if (!p(context)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str2);
        bundle.putString("reward_type", str3);
        bundle.putInt("reward_value", i);
        v(context, "_ar", str, bundle);
        com.google.android.gms.ads.internal.util.zze.k("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i);
    }

    public final void m(Context context, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E0)).booleanValue() && p(context) && r(context)) {
            synchronized (this.i) {
            }
        }
    }

    public final void n(Context context, com.google.android.gms.ads.internal.client.zzfr zzfrVar) {
        zzbyk.b(context).a().c(zzfrVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.E0)).booleanValue() && p(context) && r(context)) {
            synchronized (this.i) {
            }
        }
    }

    @Deprecated
    public final void o(Context context, String str) {
        if (p(context) && (context instanceof Activity) && x(context, "com.google.firebase.analytics.FirebaseAnalytics", this.g, false)) {
            ConcurrentMap concurrentMap = this.h;
            Method method = (Method) concurrentMap.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    concurrentMap.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    w("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.g.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                w("setCurrentScreen", false);
            }
        }
    }

    public final boolean p(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.r0)).booleanValue() && !this.d.get()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.C0)).booleanValue()) {
                return true;
            }
            AtomicInteger atomicInteger = this.e;
            if (atomicInteger.get() == -1) {
                com.google.android.gms.ads.internal.client.zzbb.b();
                if (!com.google.android.gms.ads.internal.util.client.zzf.y(context, GooglePlayServicesUtilLight.a)) {
                    com.google.android.gms.ads.internal.client.zzbb.b();
                    if (com.google.android.gms.ads.internal.util.client.zzf.z(context)) {
                        int i = com.google.android.gms.ads.internal.util.zze.b;
                        com.google.android.gms.ads.internal.util.client.zzo.g("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    }
                }
                atomicInteger.set(1);
            }
            if (atomicInteger.get() == 1) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC11300zs1
    public final Object s(String str, Context context) {
        AtomicReference atomicReference = this.f;
        if (!x(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return t(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            w(str, true);
            return null;
        }
    }

    @InterfaceC11300zs1
    public final Method t(Context context, String str) {
        ConcurrentMap concurrentMap = this.h;
        Method method = (Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            w(str, false);
            return null;
        }
    }

    public final void u(Context context, String str, String str2) {
        if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
            ConcurrentMap concurrentMap = this.h;
            Method method = (Method) concurrentMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentMap.put(str2, method);
                } catch (Exception unused) {
                    w(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f.get(), str);
                com.google.android.gms.ads.internal.util.zze.k("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                w(str2, false);
            }
        }
    }

    public final void v(Context context, String str, String str2, @InterfaceC11300zs1 Bundle bundle) {
        if (p(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String valueOf = String.valueOf(str2);
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.e("Invalid event ID: ".concat(valueOf), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f, true)) {
                ConcurrentMap concurrentMap = this.h;
                Method method = (Method) concurrentMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        w("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    w("logEventInternal", true);
                }
            }
        }
    }

    public final void w(String str, boolean z) {
        AtomicBoolean atomicBoolean = this.d;
        if (!atomicBoolean.get()) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.g("Invoke Firebase method " + str + " error.");
            if (z) {
                com.google.android.gms.ads.internal.util.client.zzo.g("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
                atomicBoolean.set(true);
            }
        }
    }

    public final boolean x(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                zzbyg.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
                return true;
            } catch (Exception unused) {
                w("getInstance", z);
                return false;
            }
        }
        return true;
    }
}
