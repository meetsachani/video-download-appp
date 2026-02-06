package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzauz {
    public static final String a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 String str, long j, boolean z) {
        try {
            zzatq s2 = zzatr.s2();
            s2.Z1(str);
            s2.Y1("0.460000000");
            s2.a2(context.getPackageName());
            s2.c2((System.currentTimeMillis() - j) / 1000);
            s2.b2(System.currentTimeMillis() / 1000);
            try {
                s2.d2(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                s2.d2(-1L);
            }
            zzatx a = zzauj.a(((zzatr) s2.V1()).b1(), null);
            a.b2(5);
            a.a2(2);
            return Base64.encodeToString(((zzaty) a.V1()).b1(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
