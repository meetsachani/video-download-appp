package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbcv;
import o.InterfaceC5056aJ2;

@TargetApi(24)
/* loaded from: classes2.dex */
public class zzu extends zzt {
    @InterfaceC5056aJ2
    public static final boolean l(int i, int i2, int i3) {
        if (Math.abs(i - i2) <= i3) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final boolean d(Activity activity, Configuration configuration) {
        int i;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.l5)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.n5)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        com.google.android.gms.ads.internal.client.zzbb.b();
        int D = com.google.android.gms.ads.internal.util.client.zzf.D(activity, configuration.screenHeightDp);
        int D2 = com.google.android.gms.ads.internal.util.client.zzf.D(activity, configuration.screenWidthDp);
        com.google.android.gms.ads.internal.zzv.v();
        DisplayMetrics a0 = zzs.a0((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i2 = a0.heightPixels;
        int i3 = a0.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = activity.getResources().getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        int round = ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d)) * ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.j5)).intValue();
        if (l(i2, D + i, round) && l(i3, D2, round)) {
            return false;
        }
        return true;
    }
}
