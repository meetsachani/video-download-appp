package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbcv;
import java.util.List;
import java.util.Locale;
import o.C8929q90;
import o.InterfaceC5940dy1;
import o.LT2;

@InterfaceC5940dy1
@TargetApi(28)
/* loaded from: classes2.dex */
public class zzx extends zzv {
    public static /* synthetic */ WindowInsets m(zzx zzxVar, Activity activity, View view, WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        if (com.google.android.gms.ads.internal.zzv.t().j().j() == null) {
            displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzg j = com.google.android.gms.ads.internal.zzv.t().j();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(format);
                }
                j.V(str);
            } else {
                com.google.android.gms.ads.internal.zzv.t().j().V("");
            }
        }
        n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    public static final void n(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int a = LT2.a(attributes);
        int i = 1;
        if (true != z) {
            i = 2;
        }
        if (i != a) {
            C8929q90.a(attributes, i);
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final int i(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }

    @Override // com.google.android.gms.ads.internal.util.zzaa
    public final void j(final Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.s1)).booleanValue() && com.google.android.gms.ads.internal.zzv.t().j().j() == null && !activity.isInMultiWindowMode()) {
            n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.zzw
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return zzx.m(zzx.this, activity, view, windowInsets);
                }
            });
        }
    }
}
