package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import java.util.List;

/* loaded from: classes3.dex */
public class AppData {
    public final String a;
    public final String b;
    public final List<BuildIdInfo> c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final DevelopmentPlatformProvider h;

    public AppData(String str, String str2, List<BuildIdInfo> list, String str3, String str4, String str5, String str6, DevelopmentPlatformProvider developmentPlatformProvider) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = developmentPlatformProvider;
    }

    public static AppData a(Context context, IdManager idManager, String str, String str2, List<BuildIdInfo> list, DevelopmentPlatformProvider developmentPlatformProvider) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String g = idManager.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = IdManager.g;
        }
        return new AppData(str, str2, list, g, packageName, b, str3, developmentPlatformProvider);
    }

    public static String b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            return Long.toString(longVersionCode);
        }
        return Integer.toString(packageInfo.versionCode);
    }
}
