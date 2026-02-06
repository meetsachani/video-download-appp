package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzber;
import com.google.android.gms.internal.ads.zzcad;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public final class zzd {
    public static void a(Context context) {
        int i = com.google.android.gms.ads.internal.util.client.zzl.g;
        if (((Boolean) zzber.a.e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0 && !com.google.android.gms.ads.internal.util.client.zzl.l()) {
                    InterfaceFutureC8411o11 b = new zzc(context).b();
                    int i2 = zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.f("Updating ad debug logging enablement.");
                    zzcad.a(b, "AdDebugLogUpdater.updateEnablement");
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.h("Fail to determine debug setting.", e);
            }
        }
    }
}
