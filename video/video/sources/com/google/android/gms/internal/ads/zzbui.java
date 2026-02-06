package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.messaging.GmsRpc;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import o.BU0;
import o.C4190Sa;
import o.C4500Ve2;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5940dy1;

@InterfaceC5940dy1
/* loaded from: classes2.dex */
public final class zzbui implements zzbuk {
    public static final Object l = new Object();
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static zzbuk m;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static zzbuk n;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2

    /* renamed from: o  reason: collision with root package name */
    public static zzbuk f232o;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static Boolean p;
    public final Object a;
    public final Context b;
    public final WeakHashMap c;
    public final ExecutorService d;
    public final VersionInfoParcel e;
    @InterfaceC11300zs1
    public final PackageInfo f;
    public final String g;
    @InterfaceC11300zs1
    public final String h;
    public final AtomicBoolean i;
    public boolean j;
    public Set k;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbui(Context context, VersionInfoParcel versionInfoParcel) {
        PackageInfo packageInfo;
        zzbcm zzbcmVar;
        String str;
        this.a = new Object();
        this.c = new WeakHashMap();
        zzfrk.a();
        this.d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.i = new AtomicBoolean();
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.b = context;
        this.e = versionInfoParcel;
        String str2 = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.a8)).booleanValue()) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.b;
            if (context != null && context.getApplicationInfo() != null) {
                try {
                    packageInfo = Wrappers.a(context).f(context.getApplicationInfo().packageName, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.f = packageInfo;
                zzbcmVar = zzbcv.Y7;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                    str = "unknown";
                } else {
                    Handler handler2 = com.google.android.gms.ads.internal.util.client.zzf.b;
                    str = Locale.getDefault().getCountry();
                }
                this.g = str;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
                    str2 = "unknown";
                } else {
                    Context context2 = this.b;
                    Handler handler3 = com.google.android.gms.ads.internal.util.client.zzf.b;
                    if (context2 != null) {
                        try {
                            PackageInfo f = Wrappers.a(context2).f("com.android.vending", 128);
                            if (f != null) {
                                str2 = Integer.toString(f.versionCode);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
                this.h = str2;
                if (((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U7)).intValue() <= 0) {
                    this.k = new HashSet();
                    return;
                }
                return;
            }
        }
        packageInfo = null;
        this.f = packageInfo;
        zzbcmVar = zzbcv.Y7;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
        }
        this.g = str;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcmVar)).booleanValue()) {
        }
        this.h = str2;
        if (((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U7)).intValue() <= 0) {
        }
    }

    public static zzbuk c(Context context) {
        synchronized (l) {
            try {
                if (m == null) {
                    if (l(context)) {
                        m = new zzbui(context, VersionInfoParcel.m0());
                    } else {
                        m = new zzbuj();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m;
    }

    public static zzbuk d(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (l) {
            try {
                if (f232o == null) {
                    boolean z = false;
                    if (((Boolean) zzben.c.e()).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S7)).booleanValue() || ((Boolean) zzben.a.e()).booleanValue()) {
                            z = true;
                        }
                    }
                    if (l(context)) {
                        zzbui zzbuiVar = new zzbui(context, versionInfoParcel);
                        zzbuiVar.k();
                        zzbuiVar.j();
                        f232o = zzbuiVar;
                    } else if (z && context != null) {
                        zzbui zzbuiVar2 = new zzbui(context, versionInfoParcel, true);
                        zzbuiVar2.k();
                        zzbuiVar2.j();
                        f232o = zzbuiVar2;
                    } else {
                        f232o = new zzbuj();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f232o;
    }

    public static zzbuk e(Context context) {
        synchronized (l) {
            try {
                if (n == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T7)).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S7)).booleanValue()) {
                            n = new zzbui(context, VersionInfoParcel.m0());
                        }
                    }
                    n = new zzbuj();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n;
    }

    public static zzbuk f(Context context, VersionInfoParcel versionInfoParcel) {
        synchronized (l) {
            try {
                if (n == null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.T7)).booleanValue()) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S7)).booleanValue()) {
                            n = new zzbui(context, versionInfoParcel);
                        }
                    }
                    n = new zzbuj();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n;
    }

    public static String g(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String h(Throwable th) {
        return zzfvt.c(com.google.android.gms.ads.internal.util.client.zzf.m(g(th)));
    }

    public static boolean l(Context context) {
        boolean z;
        if (context == null) {
            return false;
        }
        synchronized (l) {
            try {
                if (p == null) {
                    if (com.google.android.gms.ads.internal.client.zzbb.e().nextInt(100) < ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Xc)).intValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    p = Boolean.valueOf(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (p.booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.S7)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void a(Throwable th, String str, float f) {
        Throwable th2;
        boolean z;
        Throwable th3;
        String str2;
        int i;
        String str3;
        String str4;
        PackageInfo f2;
        ActivityManager.MemoryInfo h;
        if (!this.j) {
            Handler handler = com.google.android.gms.ads.internal.util.client.zzf.b;
            boolean z2 = false;
            if (((Boolean) zzbfe.e.e()).booleanValue()) {
                th2 = th;
            } else {
                LinkedList linkedList = new LinkedList();
                for (Throwable th4 = th; th4 != null; th4 = th4.getCause()) {
                    linkedList.push(th4);
                }
                th2 = null;
                while (!linkedList.isEmpty()) {
                    Throwable th5 = (Throwable) linkedList.pop();
                    StackTraceElement[] stackTrace = th5.getStackTrace();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.B2)).booleanValue() && stackTrace != null && stackTrace.length == 0 && com.google.android.gms.ads.internal.util.client.zzf.u(th5.getClass().getName())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new StackTraceElement(th5.getClass().getName(), "<filtered>", "<filtered>", 1));
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        if (com.google.android.gms.ads.internal.util.client.zzf.u(stackTraceElement.getClassName())) {
                            arrayList.add(stackTraceElement);
                            z = true;
                        } else {
                            String className = stackTraceElement.getClassName();
                            if (TextUtils.isEmpty(className) || (!className.startsWith("android.") && !className.startsWith("java."))) {
                                arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                            } else {
                                arrayList.add(stackTraceElement);
                            }
                        }
                    }
                    if (z) {
                        if (th2 == null) {
                            th3 = new Throwable(th5.getMessage());
                        } else {
                            th3 = new Throwable(th5.getMessage(), th2);
                        }
                        th2 = th3;
                        th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                    }
                }
            }
            if (th2 != null) {
                String name = th.getClass().getName();
                String g = g(th);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.e9)).booleanValue()) {
                    str2 = h(th);
                } else {
                    str2 = "";
                }
                double d = f;
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                double random = Math.random();
                if (i2 > 0) {
                    i = (int) (1.0f / f);
                } else {
                    i = 1;
                }
                if (random < d) {
                    ArrayList<String> arrayList2 = new ArrayList();
                    try {
                        z2 = Wrappers.a(this.b).g();
                    } catch (Throwable th6) {
                        com.google.android.gms.ads.internal.util.client.zzo.e("Error fetching instant app info", th6);
                    }
                    try {
                        str3 = this.b.getPackageName();
                    } catch (Throwable unused) {
                        com.google.android.gms.ads.internal.util.client.zzo.g("Cannot obtain package name, proceeding.");
                        str3 = "unknown";
                    }
                    Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z2)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter(BU0.f, Build.VERSION.RELEASE);
                    int i3 = Build.VERSION.SDK_INT;
                    Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("api", String.valueOf(i3));
                    String str5 = Build.MANUFACTURER;
                    String str6 = Build.MODEL;
                    if (!str6.startsWith(str5)) {
                        str6 = str5 + C4500Ve2.b + str6;
                    }
                    Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("device", str6);
                    VersionInfoParcel versionInfoParcel = this.e;
                    Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("js", versionInfoParcel.X).appendQueryParameter(GmsRpc.w, str3).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", g).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzbd.a().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "756340629").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbfe.c.e()));
                    Context context = this.b;
                    Uri.Builder appendQueryParameter5 = appendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.i().b(context)));
                    String str7 = "1";
                    if (true == versionInfoParcel.Z0) {
                        str4 = "1";
                    } else {
                        str4 = "0";
                    }
                    Uri.Builder appendQueryParameter6 = appendQueryParameter5.appendQueryParameter("lite", str4);
                    if (!TextUtils.isEmpty(str2)) {
                        appendQueryParameter6.appendQueryParameter("hash", str2);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Z7)).booleanValue() && (h = com.google.android.gms.ads.internal.util.client.zzf.h(context)) != null) {
                        appendQueryParameter6.appendQueryParameter("available_memory", Long.toString(h.availMem));
                        appendQueryParameter6.appendQueryParameter("total_memory", Long.toString(h.totalMem));
                        if (true != h.lowMemory) {
                            str7 = "0";
                        }
                        appendQueryParameter6.appendQueryParameter("is_low_memory", str7);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Y7)).booleanValue()) {
                        String str8 = this.g;
                        if (!TextUtils.isEmpty(str8)) {
                            appendQueryParameter6.appendQueryParameter("countrycode", str8);
                        }
                        String str9 = this.h;
                        if (!TextUtils.isEmpty(str9)) {
                            appendQueryParameter6.appendQueryParameter("psv", str9);
                        }
                        if (i3 >= 26) {
                            f2 = C4190Sa.a();
                        } else {
                            if (context != null) {
                                try {
                                    f2 = Wrappers.a(context).f("com.android.webview", 128);
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                            }
                            f2 = null;
                        }
                        if (f2 != null) {
                            appendQueryParameter6.appendQueryParameter("wvvc", Integer.toString(f2.versionCode));
                            appendQueryParameter6.appendQueryParameter("wvvn", f2.versionName);
                            appendQueryParameter6.appendQueryParameter("wvpn", f2.packageName);
                        }
                    }
                    PackageInfo packageInfo = this.f;
                    if (packageInfo != null) {
                        appendQueryParameter6.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                        appendQueryParameter6.appendQueryParameter("appvn", packageInfo.versionName);
                    }
                    arrayList2.add(appendQueryParameter6.toString());
                    for (final String str10 : arrayList2) {
                        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = new com.google.android.gms.ads.internal.util.client.zzu(null);
                        this.d.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbuf
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.android.gms.ads.internal.util.client.zzu.this.w(str10);
                            }
                        });
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuk
    public final void b(Throwable th, String str) {
        if (this.j) {
            return;
        }
        a(th, str, 1.0f);
    }

    public final void i(Thread thread, Throwable th) {
        StackTraceElement[] stackTrace;
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= com.google.android.gms.ads.internal.util.client.zzf.u(stackTraceElement.getClassName());
                    z2 |= zzbui.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U7)).intValue();
            if (intValue > 0) {
                if (this.k.size() < intValue) {
                    String h = h(th);
                    if (!this.k.contains(h)) {
                        this.k.add(h);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (z && !z2) {
                if (!this.j) {
                    b(th, "");
                }
                if (!this.i.getAndSet(true) && ((Boolean) zzben.c.e()).booleanValue()) {
                    zzbcf.c(this.b);
                }
            }
        }
    }

    public final void j() {
        Thread.setDefaultUncaughtExceptionHandler(new zzbug(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    public final void k() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.a) {
            this.c.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new zzbuh(this, thread.getUncaughtExceptionHandler()));
    }

    public zzbui(Context context, VersionInfoParcel versionInfoParcel, boolean z) {
        this(context, versionInfoParcel);
        this.j = true;
    }
}
