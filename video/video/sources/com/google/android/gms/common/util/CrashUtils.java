package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class CrashUtils {
    public static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static boolean a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Throwable th) {
        try {
            Preconditions.r(context);
            Preconditions.r(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
