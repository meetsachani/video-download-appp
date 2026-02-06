package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzah;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.google.firebase.FirebaseOptions;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;
import o.InterfaceC7980mF0;
import o.InterfaceC8148mw2;
import o.UE;

@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public final class GoogleServices {
    public static final Object e = new Object();
    @InterfaceC7980mF0("lock")
    @InterfaceC11300zs1
    public static GoogleServices f;
    @InterfaceC11300zs1
    public final String a;
    public final Status b;
    public final boolean c;
    public final boolean d;

    @InterfaceC5056aJ2
    @KeepForSdk
    public GoogleServices(String str, boolean z) {
        this.a = str;
        this.b = Status.a1;
        this.c = z;
        this.d = !z;
    }

    @KeepForSdk
    public static GoogleServices b(String str) {
        GoogleServices googleServices;
        synchronized (e) {
            try {
                googleServices = f;
                if (googleServices == null) {
                    throw new IllegalStateException("Initialize must be called before " + str + UE.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return googleServices;
    }

    @InterfaceC5056aJ2
    @KeepForSdk
    public static void c() {
        synchronized (e) {
            f = null;
        }
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static String d() {
        return b("getGoogleAppId").a;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static Status e(@InterfaceC5670cr1 Context context) {
        Status status;
        Preconditions.s(context, "Context must not be null.");
        synchronized (e) {
            try {
                if (f == null) {
                    f = new GoogleServices(context);
                }
                status = f.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return status;
    }

    @ResultIgnorabilityUnspecified
    @InterfaceC5670cr1
    @KeepForSdk
    public static Status f(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str, boolean z) {
        Preconditions.s(context, "Context must not be null.");
        Preconditions.m(str, "App ID must be nonempty.");
        synchronized (e) {
            try {
                GoogleServices googleServices = f;
                if (googleServices != null) {
                    return googleServices.a(str);
                }
                GoogleServices googleServices2 = new GoogleServices(str, z);
                f = googleServices2;
                return googleServices2.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public static boolean g() {
        GoogleServices b = b("isMeasurementEnabled");
        if (b.b.S0() && b.c) {
            return true;
        }
        return false;
    }

    @KeepForSdk
    public static boolean h() {
        return b("isMeasurementExplicitlyDisabled").d;
    }

    @InterfaceC5056aJ2
    @KeepForSdk
    public Status a(String str) {
        String str2 = this.a;
        if (str2 != null && !str2.equals(str)) {
            String str3 = this.a;
            return new Status(10, "Initialize was called with two different Google App IDs.  Only the first app ID will be used: '" + str3 + "'.");
        }
        return Status.a1;
    }

    @InterfaceC5056aJ2
    @KeepForSdk
    public GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", InterfaceC8148mw2.b.b, resources.getResourcePackageName(R.string.a));
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            boolean z = integer == 0;
            r2 = integer != 0;
            this.d = z;
        } else {
            this.d = false;
        }
        this.c = r2;
        String b = zzah.b(context);
        b = b == null ? new StringResourceValueReader(context).a(FirebaseOptions.i) : b;
        if (TextUtils.isEmpty(b)) {
            this.b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.a = null;
            return;
        }
        this.a = b;
        this.b = Status.a1;
    }
}
