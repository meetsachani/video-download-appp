package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcfb;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
public final class zzi {
    public final int a;
    public final ViewGroup.LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public zzi(zzcfb zzcfbVar) throws zzg {
        this.b = zzcfbVar.getLayoutParams();
        ViewParent parent = zzcfbVar.getParent();
        this.d = zzcfbVar.h0();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.c = viewGroup;
            this.a = viewGroup.indexOfChild(zzcfbVar.U());
            viewGroup.removeView(zzcfbVar.U());
            zzcfbVar.l1(true);
            return;
        }
        throw new zzg("Could not get the parent of the WebView for an overlay.");
    }
}
