package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.zzbui;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcd {
    @Deprecated
    public static Object a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.e("Unexpected exception.", th);
            zzbui.c(context).b(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
