package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.wrappers.Wrappers;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class UidVerifier {
    private UidVerifier() {
    }

    @KeepForSdk
    public static boolean a(@InterfaceC5670cr1 Context context, int i) {
        if (b(context, i, "com.google.android.gms")) {
            try {
                return GoogleSignatureVerifier.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                    return false;
                }
                return false;
            }
        }
        return false;
    }

    @KeepForSdk
    @TargetApi(19)
    public static boolean b(@InterfaceC5670cr1 Context context, int i, @InterfaceC5670cr1 String str) {
        return Wrappers.a(context).h(i, str);
    }
}
