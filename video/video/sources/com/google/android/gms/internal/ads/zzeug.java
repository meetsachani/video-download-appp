package com.google.android.gms.internal.ads;

import android.app.LocaleManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import o.C7291jT2;
import o.C7534kT2;
import o.InterfaceC11300zs1;
import o.InterfaceFutureC8411o11;
import o.UE;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeug implements zzetv {
    public final zzgdj a;
    public final Context b;

    public zzeug(zzgdj zzgdjVar, Context context) {
        this.a = zzgdjVar;
        this.b = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:4|2)|5|6|(3:73|74|(5:76|9|10|11|(19:13|14|15|(2:17|(2:19|(1:21))(1:22))|23|24|(2:56|(3:59|(3:62|(2:65|66)(1:64)|60)|67))|26|27|(2:29|(9:31|32|(9:46|47|(1:51)|53|36|(1:38)(1:45)|(1:40)(1:44)|41|42)(1:34)|35|36|(0)(0)|(0)(0)|41|42))|55|32|(0)(0)|35|36|(0)(0)|(0)(0)|41|42)(18:69|15|(0)|23|24|(0)|26|27|(0)|55|32|(0)(0)|35|36|(0)(0)|(0)(0)|41|42)))|8|9|10|11|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b2, code lost:
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b2, blocks: (B:16:0x008a, B:18:0x0096), top: B:73:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ zzeue c(zzeug zzeugVar) {
        ActivityInfo activityInfo;
        PackageInfo f;
        String str;
        String str2;
        Context context;
        boolean equals;
        boolean z;
        String str3;
        String string;
        boolean z2;
        boolean z3;
        LocaleList systemLocales;
        PackageInfo f2;
        Context context2 = zzeugVar.b;
        PackageManager packageManager = context2.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo d = d(packageManager, "geo:0,0?q=donuts");
        ResolveInfo d2 = d(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        com.google.android.gms.ads.internal.zzv.v();
        com.google.android.gms.ads.internal.client.zzbb.b();
        boolean x = com.google.android.gms.ads.internal.util.client.zzf.x();
        boolean d3 = DeviceProperties.d(context2);
        boolean g = DeviceProperties.g(context2);
        String language = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i = 0; i < localeList.size(); i++) {
            arrayList.add(localeList.get(i).getLanguage());
        }
        ResolveInfo d4 = d(packageManager, "market://details?id=com.google.android.gms.ads");
        if (d4 != null && (activityInfo = d4.activityInfo) != null) {
            try {
                f = Wrappers.a(context2).f(activityInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (f != null) {
                str = f.versionCode + UE.h + activityInfo.packageName;
                f2 = Wrappers.a(zzeugVar.b).f("com.android.vending", 128);
                if (f2 == null) {
                    str2 = f2.versionCode + UE.h + f2.packageName;
                    String str4 = Build.FINGERPRINT;
                    String language2 = Locale.getDefault().getLanguage();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ad)).booleanValue()) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            LocaleManager a = C7534kT2.a(zzeugVar.b.getSystemService(C7291jT2.a()));
                            if (a != null) {
                                systemLocales = a.getSystemLocales();
                                language2 = systemLocales.get(0).getLanguage();
                            }
                        } else {
                            language2 = zzeugVar.b.getResources().getConfiguration().getLocales().get(0).getLanguage();
                        }
                    }
                    String str5 = language2;
                    Context context3 = zzeugVar.b;
                    if (packageManager != null) {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                        if (queryIntentActivities != null && resolveActivity != null) {
                            int i2 = 0;
                            while (i2 < queryIntentActivities.size()) {
                                context = context3;
                                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i2).activityInfo.name)) {
                                    equals = resolveActivity.activityInfo.packageName.equals(zzhgl.a(context));
                                    break;
                                }
                                i2++;
                                context3 = context;
                            }
                        }
                    }
                    context = context3;
                    equals = false;
                    com.google.android.gms.ads.internal.zzv.v();
                    long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Gb)).booleanValue()) {
                        com.google.android.gms.ads.internal.zzv.v();
                        if (com.google.android.gms.ads.internal.util.zzs.c(context)) {
                            z = true;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Kb)).booleanValue()) {
                                try {
                                    Bundle bundle = Wrappers.a(context).c(context.getPackageName(), 128).metaData;
                                    if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                                        string = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                                    }
                                } catch (PackageManager.NameNotFoundException unused2) {
                                }
                                str3 = null;
                                boolean z4 = equals;
                                if (d2 == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (d == null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                return new zzeue(z3, z2, country, x, d3, g, language, arrayList, str, str2, str4, z4, Build.MODEL, availableBytes, z, str3, Build.VERSION.SDK_INT, str5);
                            }
                            string = "";
                            str3 = string;
                            boolean z42 = equals;
                            if (d2 == null) {
                            }
                            if (d == null) {
                            }
                            return new zzeue(z3, z2, country, x, d3, g, language, arrayList, str, str2, str4, z42, Build.MODEL, availableBytes, z, str3, Build.VERSION.SDK_INT, str5);
                        }
                    }
                    z = false;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Kb)).booleanValue()) {
                    }
                    str3 = string;
                    boolean z422 = equals;
                    if (d2 == null) {
                    }
                    if (d == null) {
                    }
                    return new zzeue(z3, z2, country, x, d3, g, language, arrayList, str, str2, str4, z422, Build.MODEL, availableBytes, z, str3, Build.VERSION.SDK_INT, str5);
                }
                str2 = null;
                String str42 = Build.FINGERPRINT;
                String language22 = Locale.getDefault().getLanguage();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Ad)).booleanValue()) {
                }
                String str52 = language22;
                Context context32 = zzeugVar.b;
                if (packageManager != null) {
                }
                context = context32;
                equals = false;
                com.google.android.gms.ads.internal.zzv.v();
                long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Gb)).booleanValue()) {
                }
                z = false;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.Kb)).booleanValue()) {
                }
                str3 = string;
                boolean z4222 = equals;
                if (d2 == null) {
                }
                if (d == null) {
                }
                return new zzeue(z3, z2, country, x, d3, g, language, arrayList, str, str2, str42, z4222, Build.MODEL, availableBytes2, z, str3, Build.VERSION.SDK_INT, str52);
            }
        }
        str = null;
        f2 = Wrappers.a(zzeugVar.b).f("com.android.vending", 128);
        if (f2 == null) {
        }
    }

    @InterfaceC11300zs1
    public static ResolveInfo d(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final int a() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzetv
    public final InterfaceFutureC8411o11 b() {
        return this.a.I2(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeug.c(zzeug.this);
            }
        });
    }
}
