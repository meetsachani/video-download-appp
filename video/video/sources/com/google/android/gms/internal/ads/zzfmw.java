package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import o.InterfaceC5670cr1;

/* loaded from: classes2.dex */
public final class zzfmw {
    public static int a = 2;

    public static void a(@InterfaceC5670cr1 Context context) {
        context.registerReceiver(new zzfmv(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int b() {
        if (zzfms.a() != zzflh.CTV) {
            return 2;
        }
        return a;
    }
}
