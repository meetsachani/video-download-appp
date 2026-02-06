package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class ClientLibraryUtils {
    private ClientLibraryUtils() {
    }

    @KeepForSdk
    public static int a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        PackageInfo b = b(context, str);
        if (b == null || (applicationInfo = b.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @InterfaceC11300zs1
    @KeepForSdk
    public static PackageInfo b(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str) {
        try {
            return Wrappers.a(context).f(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @KeepForSdk
    public static boolean c() {
        return false;
    }
}
