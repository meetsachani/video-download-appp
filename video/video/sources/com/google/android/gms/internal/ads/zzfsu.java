package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfsu {
    @SuppressLint({"RestrictedApi"})
    public static zzfst a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzfsv(new zzftl(context));
    }
}
