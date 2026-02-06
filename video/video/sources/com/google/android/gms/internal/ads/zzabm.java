package com.google.android.gms.internal.ads;

import android.view.Surface;
import o.C6755hG2;
import o.ES1;

@ES1(30)
/* loaded from: classes2.dex */
final class zzabm {
    public static void a(Surface surface, float f) {
        int i;
        if (f == 0.0f) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            surface.setFrameRate(f, i);
        } catch (IllegalStateException e) {
            zzdx.d(C6755hG2.r, "Failed to call Surface.setFrameRate", e);
        }
    }
}
