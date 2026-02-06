package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import o.C10323vs;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class GoogleApiAvailabilityLight {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String b = "com.google.android.gms";
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String c = "com.android.vending";
    @KeepForSdk
    public static final String d = "d";
    @KeepForSdk
    public static final String e = "n";
    @KeepForSdk
    public static final int a = GooglePlayServicesUtilLight.a;
    public static final GoogleApiAvailabilityLight f = new GoogleApiAvailabilityLight();

    @ShowFirstParty
    @InterfaceC5670cr1
    @KeepForSdk
    public static GoogleApiAvailabilityLight i() {
        return f;
    }

    @KeepForSdk
    public void a(@InterfaceC5670cr1 Context context) {
        GooglePlayServicesUtilLight.a(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int b(@InterfaceC5670cr1 Context context) {
        return GooglePlayServicesUtilLight.d(context);
    }

    @ShowFirstParty
    @KeepForSdk
    public int c(@InterfaceC5670cr1 Context context) {
        return GooglePlayServicesUtilLight.e(context);
    }

    @Deprecated
    @InterfaceC11300zs1
    @ShowFirstParty
    @KeepForSdk
    public Intent d(int i) {
        return e(null, i, null);
    }

    @InterfaceC11300zs1
    @ShowFirstParty
    @KeepForSdk
    public Intent e(@InterfaceC11300zs1 Context context, int i, @InterfaceC11300zs1 String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && DeviceProperties.m(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("gcore_");
            sb.append(a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(Wrappers.a(context).f(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb2 = sb.toString();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb2)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public PendingIntent f(@InterfaceC5670cr1 Context context, int i, int i2) {
        return g(context, i, i2, null);
    }

    @InterfaceC11300zs1
    @ShowFirstParty
    @KeepForSdk
    public PendingIntent g(@InterfaceC5670cr1 Context context, int i, int i2, @InterfaceC11300zs1 String str) {
        Intent e2 = e(context, i, str);
        if (e2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, e2, com.google.android.gms.internal.common.zzd.a | C10323vs.Q0);
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public String h(int i) {
        return GooglePlayServicesUtilLight.g(i);
    }

    @ResultIgnorabilityUnspecified
    @HideFirstParty
    @KeepForSdk
    public int j(@InterfaceC5670cr1 Context context) {
        return k(context, a);
    }

    @KeepForSdk
    public int k(@InterfaceC5670cr1 Context context, int i) {
        int m = GooglePlayServicesUtilLight.m(context, i);
        if (GooglePlayServicesUtilLight.o(context, m)) {
            return 18;
        }
        return m;
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean l(@InterfaceC5670cr1 Context context, int i) {
        return GooglePlayServicesUtilLight.o(context, i);
    }

    @ShowFirstParty
    @KeepForSdk
    public boolean m(@InterfaceC5670cr1 Context context, int i) {
        return GooglePlayServicesUtilLight.p(context, i);
    }

    @KeepForSdk
    public boolean n(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        return GooglePlayServicesUtilLight.u(context, str);
    }

    @KeepForSdk
    public boolean o(int i) {
        return GooglePlayServicesUtilLight.s(i);
    }

    @KeepForSdk
    public void p(@InterfaceC5670cr1 Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        GooglePlayServicesUtilLight.c(context, i);
    }
}
