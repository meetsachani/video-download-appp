package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.gms.common.util.PlatformVersion;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdph {
    @InterfaceC11300zs1
    public Context a;
    @InterfaceC11300zs1
    public PopupWindow b;

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, View view) {
        Window window;
        PopupWindow popupWindow;
        if (PlatformVersion.h() && !PlatformVersion.j()) {
            if (context instanceof Activity) {
                window = ((Activity) context).getWindow();
            } else {
                window = null;
            }
            if (window != null && window.getDecorView() != null && !((Activity) context).isDestroyed()) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                frameLayout.addView(view, -1, -1);
                popupWindow = new PopupWindow((View) frameLayout, 1, 1, false);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setClippingEnabled(false);
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.b("Displaying the 1x1 popup off the screen.");
                try {
                    popupWindow.showAtLocation(window.getDecorView(), 0, -1, -1);
                } catch (Exception unused) {
                }
                this.b = popupWindow;
                if (popupWindow == null) {
                    context = null;
                }
                this.a = context;
            }
            popupWindow = null;
            this.b = popupWindow;
            if (popupWindow == null) {
            }
            this.a = context;
        }
    }

    public final void b() {
        PopupWindow popupWindow;
        Context context = this.a;
        if (context != null && this.b != null) {
            if ((!(context instanceof Activity) || !((Activity) context).isDestroyed()) && (popupWindow = this.b) != null && popupWindow.isShowing()) {
                this.b.dismiss();
            }
            this.a = null;
            this.b = null;
        }
    }
}
