package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import o.AbstractC4468Uv1;

/* loaded from: classes3.dex */
public final class zzgl {
    public static volatile AbstractC4468Uv1<Boolean> a = AbstractC4468Uv1.a();
    public static final Object b = new Object();

    public static boolean a(Context context) {
        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(Context context, Uri uri) {
        int i;
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        } else if (a.e()) {
            return a.d().booleanValue();
        } else {
            synchronized (b) {
                try {
                    if (a.e()) {
                        return a.d().booleanValue();
                    }
                    if (!"com.google.android.gms".equals(context.getPackageName())) {
                        PackageManager packageManager = context.getPackageManager();
                        if (Build.VERSION.SDK_INT < 29) {
                            i = 0;
                        } else {
                            i = 268435456;
                        }
                        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.phenotype", i);
                        if (resolveContentProvider != null) {
                        }
                        a = AbstractC4468Uv1.f(Boolean.valueOf(z));
                        return a.d().booleanValue();
                    }
                    if (a(context)) {
                        z = true;
                    }
                    a = AbstractC4468Uv1.f(Boolean.valueOf(z));
                    return a.d().booleanValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
