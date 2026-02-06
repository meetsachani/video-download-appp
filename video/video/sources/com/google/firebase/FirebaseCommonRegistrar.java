package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.platforminfo.DefaultUserAgentPublisher;
import com.google.firebase.platforminfo.KotlinDetector;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static final String a = "fire-android";
    public static final String b = "fire-core";
    public static final String c = "device-name";
    public static final String d = "device-model";
    public static final String e = "device-brand";
    public static final String f = "android-target-sdk";
    public static final String g = "android-min-sdk";
    public static final String h = "android-platform";
    public static final String i = "android-installer";
    public static final String j = "kotlin";

    public static /* synthetic */ String a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return e(installerPackageName);
        }
        return "";
    }

    public static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.minSdkVersion);
        }
        return "";
    }

    public static /* synthetic */ String c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    public static /* synthetic */ String d(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i2 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    public static String e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(DefaultUserAgentPublisher.c());
        arrayList.add(DefaultHeartBeatController.g());
        arrayList.add(LibraryVersionComponent.b(a, String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(LibraryVersionComponent.b(b, BuildConfig.d));
        arrayList.add(LibraryVersionComponent.b(c, e(Build.PRODUCT)));
        arrayList.add(LibraryVersionComponent.b(d, e(Build.DEVICE)));
        arrayList.add(LibraryVersionComponent.b(e, e(Build.BRAND)));
        arrayList.add(LibraryVersionComponent.c(f, new LibraryVersionComponent.VersionExtractor() { // from class: o.Ct0
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.c((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.c(g, new LibraryVersionComponent.VersionExtractor() { // from class: o.Dt0
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.b((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.c(h, new LibraryVersionComponent.VersionExtractor() { // from class: o.Et0
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.d((Context) obj);
            }
        }));
        arrayList.add(LibraryVersionComponent.c(i, new LibraryVersionComponent.VersionExtractor() { // from class: o.Ft0
            @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.a((Context) obj);
            }
        }));
        String a2 = KotlinDetector.a();
        if (a2 != null) {
            arrayList.add(LibraryVersionComponent.b(j, a2));
        }
        return arrayList;
    }
}
