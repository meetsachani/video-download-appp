package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzfdm {
    public static void a(Context context, boolean z) {
        if (z) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.f("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzbb.b();
        int i2 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + com.google.android.gms.ads.internal.util.client.zzf.E(context) + "\")) to get test ads on this device.");
    }

    public static void b(int i, Throwable th, String str) {
        int i2 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f("Ad failed to load : " + i);
        com.google.android.gms.ads.internal.util.zze.l(str, th);
        if (i == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.t().w(th, str);
    }
}
