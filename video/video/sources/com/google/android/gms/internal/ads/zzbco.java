package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbco {
    @InterfaceC11300zs1
    public static final SharedPreferences a(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.h("", e);
            return null;
        }
    }
}
