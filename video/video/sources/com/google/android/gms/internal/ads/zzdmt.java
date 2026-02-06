package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.Map;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdmt extends zzbmi implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbfs {
    public View X;
    public com.google.android.gms.ads.internal.client.zzea Y;
    public zzdij Z;
    public boolean Y0 = false;
    public boolean Z0 = false;

    public zzdmt(zzdij zzdijVar, zzdio zzdioVar) {
        this.X = zzdioVar.S();
        this.Y = zzdioVar.W();
        this.Z = zzdijVar;
        if (zzdioVar.f0() != null) {
            zzdioVar.f0().a1(this);
        }
    }

    public static final void W7(zzbmm zzbmmVar, int i) {
        try {
            zzbmmVar.E(i);
        } catch (RemoteException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
        }
    }

    private final void g() {
        View view;
        zzdij zzdijVar = this.Z;
        if (zzdijVar != null && (view = this.X) != null) {
            Map map = Collections.EMPTY_MAP;
            zzdijVar.j(view, map, map, zzdij.H(view));
        }
    }

    private final void h() {
        View view = this.X;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.X);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzea b() throws RemoteException {
        Preconditions.k("#008 Must be called on the main UI thread.");
        if (this.Y0) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    @InterfaceC11300zs1
    public final zzbgd c() {
        Preconditions.k("#008 Must be called on the main UI thread.");
        if (this.Y0) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdij zzdijVar = this.Z;
        if (zzdijVar == null || zzdijVar.S() == null) {
            return null;
        }
        return zzdijVar.S().a();
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void f() throws RemoteException {
        Preconditions.k("#008 Must be called on the main UI thread.");
        h();
        zzdij zzdijVar = this.Z;
        if (zzdijVar != null) {
            zzdijVar.a();
        }
        this.Z = null;
        this.X = null;
        this.Y = null;
        this.Y0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void g6(IObjectWrapper iObjectWrapper, zzbmm zzbmmVar) throws RemoteException {
        String str;
        Preconditions.k("#008 Must be called on the main UI thread.");
        if (this.Y0) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.d("Instream ad can not be shown after destroy().");
            W7(zzbmmVar, 2);
            return;
        }
        View view = this.X;
        if (view != null && this.Y != null) {
            if (this.Z0) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.d("Instream ad should not be used again.");
                W7(zzbmmVar, 1);
                return;
            }
            this.Z0 = true;
            h();
            ((ViewGroup) ObjectWrapper.o1(iObjectWrapper)).addView(this.X, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzv.D();
            zzcan.a(this.X, this);
            com.google.android.gms.ads.internal.zzv.D();
            zzcan.b(this.X, this);
            g();
            try {
                zzbmmVar.e();
                return;
            } catch (RemoteException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.i("#007 Could not call remote method.", e);
                return;
            }
        }
        if (view == null) {
            str = "can not get video view.";
        } else {
            str = "can not get video controller.";
        }
        int i4 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.d("Instream internal error: ".concat(str));
        W7(zzbmmVar, 0);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        g();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        g();
    }

    @Override // com.google.android.gms.internal.ads.zzbmj
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.k("#008 Must be called on the main UI thread.");
        g6(iObjectWrapper, new zzdms(this));
    }
}
