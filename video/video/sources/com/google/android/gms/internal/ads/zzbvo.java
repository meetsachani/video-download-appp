package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import o.C9273rY;
import o.InterfaceC11300zs1;
import o.UE;

/* loaded from: classes2.dex */
public final class zzbvo {
    public int A;
    public final String B;
    public boolean C;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public String g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public double m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public String f233o;
    public String p;
    public final boolean q;
    public final boolean r;
    public final String s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final String w;
    public final String x;
    public float y;
    public int z;

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(1:3)(1:34)|4|(1:6)|7|(3:28|29|(7:31|10|11|12|(1:14)|16|(2:20|21)(1:23)))|9|10|11|12|(0)|16|(1:24)(3:18|20|21)) */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a A[Catch: Exception -> 0x00b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b0, blocks: (B:20:0x008c, B:22:0x009a), top: B:32:0x008c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbvo(Context context) {
        ActivityInfo activityInfo;
        PackageInfo f;
        String str;
        Resources resources;
        DisplayMetrics displayMetrics;
        PackageInfo f2;
        PackageManager packageManager = context.getPackageManager();
        zzbcv.a(context);
        c(context);
        e(context);
        d(context);
        Locale locale = Locale.getDefault();
        this.q = b(packageManager, "geo:0,0?q=donuts") != null;
        this.r = b(packageManager, "http://www.google.com") != null;
        this.s = locale.getCountry();
        com.google.android.gms.ads.internal.zzv.v();
        com.google.android.gms.ads.internal.client.zzbb.b();
        this.t = com.google.android.gms.ads.internal.util.client.zzf.x();
        this.u = DeviceProperties.d(context);
        this.v = DeviceProperties.g(context);
        this.w = locale.getLanguage();
        ResolveInfo b = b(packageManager, "market://details?id=com.google.android.gms.ads");
        String str2 = null;
        if (b != null && (activityInfo = b.activityInfo) != null) {
            try {
                f = Wrappers.a(context).f(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (f != null) {
                str = f.versionCode + UE.h + activityInfo.packageName;
                this.x = str;
                f2 = Wrappers.a(context).f("com.android.vending", 128);
                if (f2 != null) {
                    str2 = f2.versionCode + UE.h + f2.packageName;
                }
                this.B = str2;
                resources = context.getResources();
                if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    this.y = displayMetrics.density;
                    this.z = displayMetrics.widthPixels;
                    this.A = displayMetrics.heightPixels;
                }
                return;
            }
        }
        str = null;
        this.x = str;
        f2 = Wrappers.a(context).f("com.android.vending", 128);
        if (f2 != null) {
        }
        this.B = str2;
        resources = context.getResources();
        if (resources == null) {
            return;
        }
        this.y = displayMetrics.density;
        this.z = displayMetrics.widthPixels;
        this.A = displayMetrics.heightPixels;
    }

    @InterfaceC11300zs1
    public static ResolveInfo b(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.t().x(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    public final zzbvp a() {
        return new zzbvp(this.a, this.q, this.r, this.g, this.s, this.t, this.u, this.v, this.b, this.c, this.w, this.x, this.B, this.d, this.h, this.i, this.j, this.e, this.f, this.y, this.z, this.A, this.m, this.n, this.k, this.l, this.f233o, this.C, this.p);
    }

    public final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.a = audioManager.getMode();
                this.b = audioManager.isMusicActive();
                this.c = audioManager.isSpeakerphoneOn();
                this.d = audioManager.getStreamVolume(3);
                this.e = audioManager.getRingerMode();
                this.f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.zzv.t().x(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.a = -2;
        this.b = false;
        this.c = false;
        this.d = 0;
        this.e = 2;
        this.f = 0;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void d(Context context) {
        Intent registerReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ob)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = context.registerReceiver(null, intentFilter, 4);
        } else {
            registerReceiver = context.registerReceiver(null, intentFilter);
        }
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            this.m = registerReceiver.getIntExtra(FirebaseAnalytics.Param.t, -1) / registerReceiver.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            this.n = z;
            return;
        }
        this.m = -1.0d;
        this.n = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Context context) {
        int networkType;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.g = telephonyManager.getNetworkOperator();
        if (PlatformVersion.q()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.U8)).booleanValue()) {
                networkType = 0;
                this.i = networkType;
                this.j = telephonyManager.getPhoneType();
                this.h = -2;
                this.k = false;
                this.l = -1;
                com.google.android.gms.ads.internal.zzv.v();
                if (!com.google.android.gms.ads.internal.util.zzs.b(context, C9273rY.b)) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        this.h = activeNetworkInfo.getType();
                        this.l = activeNetworkInfo.getDetailedState().ordinal();
                    } else {
                        this.h = -1;
                    }
                    this.k = connectivityManager.isActiveNetworkMetered();
                    return;
                }
                return;
            }
        }
        networkType = telephonyManager.getNetworkType();
        this.i = networkType;
        this.j = telephonyManager.getPhoneType();
        this.h = -2;
        this.k = false;
        this.l = -1;
        com.google.android.gms.ads.internal.zzv.v();
        if (!com.google.android.gms.ads.internal.util.zzs.b(context, C9273rY.b)) {
        }
    }

    public zzbvo(Context context, zzbvp zzbvpVar) {
        zzbcv.a(context);
        c(context);
        e(context);
        d(context);
        this.f233o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        this.C = zzbdw.g(context);
        this.q = zzbvpVar.a;
        this.r = zzbvpVar.b;
        this.s = zzbvpVar.c;
        this.t = zzbvpVar.d;
        this.u = zzbvpVar.e;
        this.v = zzbvpVar.f;
        this.w = zzbvpVar.g;
        this.x = zzbvpVar.h;
        this.B = zzbvpVar.i;
        this.y = zzbvpVar.l;
        this.z = zzbvpVar.m;
        this.A = zzbvpVar.n;
    }
}
