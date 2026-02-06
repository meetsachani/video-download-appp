package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.Wrappers;
import o.InterfaceC11300zs1;
import o.InterfaceC7980mF0;

/* loaded from: classes2.dex */
public final class zzah {
    public static final Object a = new Object();
    @InterfaceC7980mF0("lock")
    public static boolean b;
    @InterfaceC11300zs1
    public static String c;
    public static int d;

    public static int a(Context context) {
        c(context);
        return d;
    }

    @InterfaceC11300zs1
    public static String b(Context context) {
        c(context);
        return c;
    }

    public static void c(Context context) {
        Bundle bundle;
        synchronized (a) {
            try {
                if (b) {
                    return;
                }
                b = true;
                try {
                    bundle = Wrappers.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
                if (bundle == null) {
                    return;
                }
                c = bundle.getString("com.google.app.id");
                d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
