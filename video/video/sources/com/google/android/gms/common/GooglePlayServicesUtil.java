package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;
import com.google.android.gms.common.util.VisibleForTesting;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {
    @InterfaceC5670cr1
    public static final String k = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final int l = GooglePlayServicesUtilLight.a;
    @InterfaceC5670cr1
    @Deprecated
    public static final String m = "com.google.android.gms";
    @InterfaceC5670cr1
    public static final String n = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Deprecated
    public static void A(int i, @InterfaceC5670cr1 Context context) {
        GoogleApiAvailability x = GoogleApiAvailability.x();
        if (!GooglePlayServicesUtilLight.o(context, i) && !GooglePlayServicesUtilLight.p(context, i)) {
            x.C(context, i);
        } else {
            x.J(context);
        }
    }

    @InterfaceC5670cr1
    @Deprecated
    public static PendingIntent f(int i, @InterfaceC5670cr1 Context context, int i2) {
        return GooglePlayServicesUtilLight.f(i, context, i2);
    }

    @VisibleForTesting
    @InterfaceC5670cr1
    @Deprecated
    public static String g(int i) {
        return GooglePlayServicesUtilLight.g(i);
    }

    @InterfaceC5670cr1
    public static Context i(@InterfaceC5670cr1 Context context) {
        return GooglePlayServicesUtilLight.i(context);
    }

    @InterfaceC5670cr1
    public static Resources j(@InterfaceC5670cr1 Context context) {
        return GooglePlayServicesUtilLight.j(context);
    }

    @HideFirstParty
    @Deprecated
    public static int l(@InterfaceC5670cr1 Context context) {
        return GooglePlayServicesUtilLight.l(context);
    }

    @KeepForSdk
    @Deprecated
    public static int m(@InterfaceC5670cr1 Context context, int i) {
        return GooglePlayServicesUtilLight.m(context, i);
    }

    @Deprecated
    public static boolean s(int i) {
        return GooglePlayServicesUtilLight.s(i);
    }

    @InterfaceC11300zs1
    @Deprecated
    public static Dialog v(int i, @InterfaceC5670cr1 Activity activity, int i2) {
        return w(i, activity, i2, null);
    }

    @InterfaceC11300zs1
    @Deprecated
    public static Dialog w(int i, @InterfaceC5670cr1 Activity activity, int i2, @InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.o(activity, i)) {
            i = 18;
        }
        return GoogleApiAvailability.x().t(activity, i, i2, onCancelListener);
    }

    @Deprecated
    public static boolean x(int i, @InterfaceC5670cr1 Activity activity, int i2) {
        return y(i, activity, i2, null);
    }

    @Deprecated
    public static boolean y(int i, @InterfaceC5670cr1 Activity activity, int i2, @InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        return z(i, activity, null, i2, onCancelListener);
    }

    public static boolean z(int i, @InterfaceC5670cr1 Activity activity, @InterfaceC11300zs1 Fragment fragment, int i2, @InterfaceC11300zs1 DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.o(activity, i)) {
            i = 18;
        }
        GoogleApiAvailability x = GoogleApiAvailability.x();
        if (fragment == null) {
            return x.B(activity, i, i2, onCancelListener);
        }
        Dialog E = x.E(activity, i, zag.c(fragment, GoogleApiAvailability.x().e(activity, i, "d"), i2), onCancelListener);
        if (E == null) {
            return false;
        }
        x.H(activity, E, k, onCancelListener);
        return true;
    }
}
