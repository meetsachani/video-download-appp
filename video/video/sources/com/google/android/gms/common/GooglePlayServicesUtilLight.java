package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.google.firebase.messaging.MessagingAnalytics;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.VP0;
import o.W12;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GooglePlayServicesUtilLight {
    @KeepForSdk
    @Deprecated
    public static final int a = 12451000;
    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    public static final String b = "com.google.android.gms";
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String c = "com.google.android.play.games";
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String d = "com.android.vending";
    @KeepForSdk
    public static final int e = 39789;
    @KeepForSdk
    public static final int f = 10436;
    public static boolean h = false;
    @InterfaceC5056aJ2
    public static boolean i = false;
    @KeepForSdk
    @Deprecated
    public static final AtomicBoolean g = new AtomicBoolean();
    public static final AtomicBoolean j = new AtomicBoolean();

    @KeepForSdk
    @Deprecated
    public static void a(@InterfaceC5670cr1 Context context) {
        if (!g.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(MessagingAnalytics.b);
                if (notificationManager != null) {
                    notificationManager.cancel(f);
                }
            } catch (SecurityException e2) {
                Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e2);
            }
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void b() {
        j.set(true);
    }

    @KeepForSdk
    @Deprecated
    public static void c(@InterfaceC5670cr1 Context context, int i2) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int k = GoogleApiAvailabilityLight.i().k(context, i2);
        if (k != 0) {
            Intent e2 = GoogleApiAvailabilityLight.i().e(context, k, W12.i);
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + k);
            if (e2 == null) {
                throw new GooglePlayServicesNotAvailableException(k);
            }
            throw new GooglePlayServicesRepairableException(k, "Google Play Services not available", e2);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int d(@InterfaceC5670cr1 Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int e(@InterfaceC5670cr1 Context context) {
        Preconditions.x(true);
        return ClientLibraryUtils.a(context, context.getPackageName());
    }

    @Deprecated
    @VP0(imports = {"com.google.android.gms.common.GoogleApiAvailabilityLight"}, replacement = "GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, errorCode, requestCode)")
    @InterfaceC11300zs1
    @KeepForSdk
    public static PendingIntent f(int i2, @InterfaceC5670cr1 Context context, int i3) {
        return GoogleApiAvailabilityLight.i().f(context, i2, i3);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    @Deprecated
    public static String g(int i2) {
        return ConnectionResult.O0(i2);
    }

    @Deprecated
    @VP0(imports = {"com.google.android.gms.common.GoogleApiAvailabilityLight"}, replacement = "GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, errorCode, null)")
    @InterfaceC11300zs1
    @ShowFirstParty
    @KeepForSdk
    public static Intent h(int i2) {
        return GoogleApiAvailabilityLight.i().e(null, i2, null);
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static Context i(@InterfaceC5670cr1 Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static Resources j(@InterfaceC5670cr1 Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static boolean k(@InterfaceC5670cr1 Context context) {
        try {
            if (!i) {
                try {
                    PackageInfo f2 = Wrappers.a(context).f("com.google.android.gms", 64);
                    GoogleSignatureVerifier.a(context);
                    if (f2 != null && !GoogleSignatureVerifier.f(f2, false) && GoogleSignatureVerifier.f(f2, true)) {
                        h = true;
                    } else {
                        h = false;
                    }
                    i = true;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                    i = true;
                }
            }
            if (!h && DeviceProperties.k()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            i = true;
            throw th;
        }
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    @HideFirstParty
    @KeepForSdk
    public static int l(@InterfaceC5670cr1 Context context) {
        return m(context, a);
    }

    @KeepForSdk
    @Deprecated
    public static int m(@InterfaceC5670cr1 Context context, int i2) {
        boolean z;
        boolean z2;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(R.string.a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !j.get()) {
            int a2 = zzah.a(context);
            if (a2 != 0) {
                if (a2 != a) {
                    throw new GooglePlayServicesIncorrectManifestValueException(a2);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        if (!DeviceProperties.m(context) && !DeviceProperties.p(context)) {
            z = true;
        } else {
            z = false;
        }
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.a(z2);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            GoogleSignatureVerifier.a(context);
            if (!GoogleSignatureVerifier.f(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z) {
                    Preconditions.r(packageInfo);
                    if (!GoogleSignatureVerifier.f(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else if (com.google.android.gms.common.util.zza.a(packageInfo2.versionCode) < com.google.android.gms.common.util.zza.a(i2)) {
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i2 + " but found " + packageInfo2.versionCode);
                    return 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                            return 1;
                        }
                    }
                    if (applicationInfo.enabled) {
                        return 0;
                    }
                    return 3;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @KeepForSdk
    @Deprecated
    @VP0(imports = {"com.google.android.gms.common.util.UidVerifier"}, replacement = "UidVerifier.isGooglePlayServicesUid(context, uid)")
    public static boolean n(@InterfaceC5670cr1 Context context, int i2) {
        return UidVerifier.a(context, i2);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean o(@InterfaceC5670cr1 Context context, int i2) {
        if (i2 == 18) {
            return true;
        }
        if (i2 == 1) {
            return u(context, "com.google.android.gms");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean p(@InterfaceC5670cr1 Context context, int i2) {
        if (i2 == 9) {
            return u(context, "com.android.vending");
        }
        return false;
    }

    @KeepForSdk
    @TargetApi(18)
    public static boolean q(@InterfaceC5670cr1 Context context) {
        if (PlatformVersion.g()) {
            Object systemService = context.getSystemService("user");
            Preconditions.r(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Deprecated
    @VP0(imports = {"com.google.android.gms.common.util.DeviceProperties"}, replacement = "DeviceProperties.isSidewinder(context)")
    @ShowFirstParty
    @KeepForSdk
    public static boolean r(@InterfaceC5670cr1 Context context) {
        return DeviceProperties.g(context);
    }

    @KeepForSdk
    @Deprecated
    public static boolean s(int i2) {
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 9;
    }

    @Deprecated
    @VP0(imports = {"com.google.android.gms.common.util.UidVerifier"}, replacement = "UidVerifier.uidHasPackageName(context, uid, packageName)")
    @KeepForSdk
    @TargetApi(19)
    public static boolean t(@InterfaceC5670cr1 Context context, int i2, @InterfaceC5670cr1 String str) {
        return UidVerifier.b(context, i2, str);
    }

    @TargetApi(21)
    public static boolean u(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (PlatformVersion.j()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled && !q(context)) {
            return true;
        }
        return false;
    }
}
