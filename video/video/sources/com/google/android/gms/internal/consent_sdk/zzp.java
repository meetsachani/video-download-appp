package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import o.C6525gK;
import o.C7252jK;

/* loaded from: classes3.dex */
public final class zzp {
    public final zzn a;
    public final Activity b;
    public final C6525gK c;
    public final C7252jK d;

    public /* synthetic */ zzp(zzn zznVar, Activity activity, C6525gK c6525gK, C7252jK c7252jK, zzo zzoVar) {
        this.a = zznVar;
        this.b = activity;
        this.c = c6525gK;
        this.d = c7252jK;
    }

    public static /* bridge */ /* synthetic */ zzcj a(zzp zzpVar) {
        Bundle bundle;
        Application application;
        Application application2;
        List list;
        zzaq zzaqVar;
        Application application3;
        Application application4;
        Application application5;
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        List list2;
        Application application6;
        PackageInfo packageInfo;
        Application application7;
        Application application8;
        long j;
        Application application9;
        zzcj zzcjVar = new zzcj();
        String c = zzpVar.d.c();
        String str = null;
        if (TextUtils.isEmpty(c)) {
            try {
                zzn zznVar = zzpVar.a;
                application = zznVar.a;
                PackageManager packageManager = application.getPackageManager();
                application2 = zznVar.a;
                bundle = packageManager.getApplicationInfo(application2.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                c = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(c)) {
                throw new zzg(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzcjVar.a = c;
        C6525gK c6525gK = zzpVar.c;
        if (!c6525gK.b()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            int a = c6525gK.a();
            if (a != 1) {
                if (a != 2) {
                    if (a != 3) {
                        if (a == 4) {
                            arrayList.add(zzce.GEO_OVERRIDE_OTHER);
                        }
                    } else {
                        arrayList.add(zzce.GEO_OVERRIDE_REGULATED_US_STATE);
                    }
                } else {
                    arrayList.add(zzce.GEO_OVERRIDE_NON_EEA);
                }
            } else {
                arrayList.add(zzce.GEO_OVERRIDE_EEA);
            }
            arrayList.add(zzce.PREVIEWING_DEBUG_MESSAGES);
            list = arrayList;
        }
        zzcjVar.i = list;
        zzn zznVar2 = zzpVar.a;
        zzaqVar = zznVar2.b;
        zzcjVar.e = zzaqVar.c();
        zzcjVar.d = Boolean.valueOf(zzpVar.d.b());
        zzcjVar.c = Locale.getDefault().toLanguageTag();
        zzcf zzcfVar = new zzcf();
        int i = Build.VERSION.SDK_INT;
        zzcfVar.b = Integer.valueOf(i);
        zzcfVar.a = Build.MODEL;
        zzcfVar.c = 2;
        zzcjVar.b = zzcfVar;
        application3 = zznVar2.a;
        Configuration configuration = application3.getResources().getConfiguration();
        application4 = zznVar2.a;
        application4.getResources().getConfiguration();
        zzch zzchVar = new zzch();
        zzchVar.a = Integer.valueOf(configuration.screenWidthDp);
        zzchVar.b = Integer.valueOf(configuration.screenHeightDp);
        application5 = zznVar2.a;
        zzchVar.c = Double.valueOf(application5.getResources().getDisplayMetrics().density);
        if (i < 28) {
            list2 = Collections.EMPTY_LIST;
        } else {
            Activity activity = zzpVar.b;
            if (activity == null) {
                window = null;
            } else {
                window = activity.getWindow();
            }
            if (window == null) {
                decorView = null;
            } else {
                decorView = window.getDecorView();
            }
            if (decorView == null) {
                rootWindowInsets = null;
            } else {
                rootWindowInsets = decorView.getRootWindowInsets();
            }
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            } else {
                displayCutout = null;
            }
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList2 = new ArrayList();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    if (rect != null) {
                        zzcg zzcgVar = new zzcg();
                        zzcgVar.b = Integer.valueOf(rect.left);
                        zzcgVar.c = Integer.valueOf(rect.right);
                        zzcgVar.a = Integer.valueOf(rect.top);
                        zzcgVar.d = Integer.valueOf(rect.bottom);
                        arrayList2.add(zzcgVar);
                    }
                }
                list2 = arrayList2;
            } else {
                list2 = Collections.EMPTY_LIST;
            }
        }
        zzchVar.d = list2;
        zzcjVar.f = zzchVar;
        application6 = zznVar2.a;
        try {
            application9 = zznVar2.a;
            packageInfo = application9.getPackageManager().getPackageInfo(application6.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzcd zzcdVar = new zzcd();
        zzcdVar.a = application6.getPackageName();
        zzn zznVar3 = zzpVar.a;
        application7 = zznVar3.a;
        PackageManager packageManager2 = application7.getPackageManager();
        application8 = zznVar3.a;
        CharSequence applicationLabel = packageManager2.getApplicationLabel(application8.getApplicationInfo());
        if (applicationLabel != null) {
            str = applicationLabel.toString();
        }
        zzcdVar.b = str;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = packageInfo.versionCode;
            }
            zzcdVar.c = Long.toString(j);
        }
        zzcjVar.g = zzcdVar;
        zzci zzciVar = new zzci();
        zzciVar.a = "3.2.0";
        zzcjVar.h = zzciVar;
        return zzcjVar;
    }
}
