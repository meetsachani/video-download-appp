package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.common.internal.Preconditions;
import o.ES1;
import o.InterfaceC11300zs1;

@ES1(api = 21)
/* loaded from: classes2.dex */
public final class zzblc {
    public final Context a;
    public final OnH5AdsEventListener b;
    @InterfaceC11300zs1
    public zzbky c;

    public zzblc(Context context, OnH5AdsEventListener onH5AdsEventListener) {
        Preconditions.y(true, "Android version must be Lollipop or higher");
        Preconditions.r(context);
        Preconditions.r(onH5AdsEventListener);
        this.a = context;
        this.b = onH5AdsEventListener;
        zzbcv.a(context);
    }

    public static final boolean c(String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ka)).booleanValue()) {
            return false;
        }
        Preconditions.r(str);
        if (str.length() > ((Integer) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ma)).intValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.b("H5 GMSG exceeds max length");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"gmsg".equals(parse.getScheme()) || !"mobileads.google.com".equals(parse.getHost()) || !"/h5ads".equals(parse.getPath())) {
            return false;
        }
        return true;
    }

    public final void a() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.ka)).booleanValue()) {
            d();
            zzbky zzbkyVar = this.c;
            if (zzbkyVar != null) {
                try {
                    zzbkyVar.d();
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final boolean b(String str) {
        if (!c(str)) {
            return false;
        }
        d();
        zzbky zzbkyVar = this.c;
        if (zzbkyVar == null) {
            return false;
        }
        try {
            zzbkyVar.S(str);
            return true;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
            return true;
        }
    }

    public final void d() {
        if (this.c != null) {
            return;
        }
        this.c = com.google.android.gms.ads.internal.client.zzbb.a().n(this.a, new zzbph(), this.b);
    }
}
