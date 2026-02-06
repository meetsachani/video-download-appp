package com.google.android.gms.common.wrappers;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import o.C4377Tx1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class PackageManagerWrapper {
    @InterfaceC5670cr1
    public final Context a;

    public PackageManagerWrapper(@InterfaceC5670cr1 Context context) {
        this.a = context;
    }

    @KeepForSdk
    public int a(@InterfaceC5670cr1 String str) {
        return this.a.checkCallingOrSelfPermission(str);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public int b(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2) {
        return this.a.getPackageManager().checkPermission(str, str2);
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @KeepForSdk
    public ApplicationInfo c(@InterfaceC5670cr1 String str, int i) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(str, i);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public CharSequence d(@InterfaceC5670cr1 String str) throws PackageManager.NameNotFoundException {
        Context context = this.a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @KeepForSdk
    public C4377Tx1<CharSequence, Drawable> e(@InterfaceC5670cr1 String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.a.getPackageManager().getApplicationInfo(str, 0);
        return C4377Tx1.a(this.a.getPackageManager().getApplicationLabel(applicationInfo), this.a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @KeepForSdk
    public PackageInfo f(@InterfaceC5670cr1 String str, int i) throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getPackageInfo(str, i);
    }

    @KeepForSdk
    public boolean g() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.a(this.a);
        }
        if (PlatformVersion.n() && (nameForUid = this.a.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            isInstantApp = this.a.getPackageManager().isInstantApp(nameForUid);
            return isInstantApp;
        }
        return false;
    }

    @TargetApi(19)
    public final boolean h(int i, @InterfaceC5670cr1 String str) {
        if (PlatformVersion.h()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
