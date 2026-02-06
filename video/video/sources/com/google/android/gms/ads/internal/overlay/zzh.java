package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzau;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
final class zzh extends RelativeLayout {
    @InterfaceC5056aJ2
    public final zzau Y0;
    @InterfaceC5056aJ2
    public boolean Z0;

    public zzh(Context context, String str, String str2, String str3) {
        super(context);
        zzau zzauVar = new zzau(context, str);
        this.Y0 = zzauVar;
        zzauVar.o(str2);
        zzauVar.n(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.Z0) {
            this.Y0.m(motionEvent);
            return false;
        }
        return false;
    }
}
