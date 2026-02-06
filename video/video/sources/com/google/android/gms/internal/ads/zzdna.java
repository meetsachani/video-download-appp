package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import o.C2531Be;
import o.C9654t62;

/* loaded from: classes2.dex */
public final class zzdna extends zzbgz {
    public final Context X;
    public final zzdio Y;
    public zzdij Y0;
    public zzdjo Z;

    public zzdna(Context context, zzdio zzdioVar, zzdjo zzdjoVar, zzdij zzdijVar) {
        this.X = context;
        this.Y = zzdioVar;
        this.Z = zzdjoVar;
        this.Y0 = zzdijVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void E0(IObjectWrapper iObjectWrapper) {
        zzdij zzdijVar;
        Object o1 = ObjectWrapper.o1(iObjectWrapper);
        if ((o1 instanceof View) && this.Y.h0() != null && (zzdijVar = this.Y0) != null) {
            zzdijVar.t((View) o1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean F0(IObjectWrapper iObjectWrapper) {
        zzdjo zzdjoVar;
        Object o1 = ObjectWrapper.o1(iObjectWrapper);
        if ((o1 instanceof ViewGroup) && (zzdjoVar = this.Z) != null && zzdjoVar.g((ViewGroup) o1)) {
            this.Y.f0().p1(new zzdmz(this, NativeCustomFormatAd.a));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean O(IObjectWrapper iObjectWrapper) {
        zzdjo zzdjoVar;
        Object o1 = ObjectWrapper.o1(iObjectWrapper);
        if ((o1 instanceof ViewGroup) && (zzdjoVar = this.Z) != null && zzdjoVar.f((ViewGroup) o1)) {
            this.Y.d0().p1(new zzdmz(this, NativeCustomFormatAd.a));
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final com.google.android.gms.ads.internal.client.zzea d() {
        return this.Y.W();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbgd e() throws RemoteException {
        try {
            return this.Y0.S().a();
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void e0(String str) {
        zzdij zzdijVar = this.Y0;
        if (zzdijVar != null) {
            zzdijVar.n(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbgg f0(String str) {
        return (zzbgg) this.Y.U().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final IObjectWrapper h() {
        return ObjectWrapper.V3(this.X);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String i() {
        return this.Y.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final List k() {
        try {
            zzdio zzdioVar = this.Y;
            C9654t62 U = zzdioVar.U();
            C9654t62 V = zzdioVar.V();
            String[] strArr = new String[U.size() + V.size()];
            int i = 0;
            for (int i2 = 0; i2 < U.size(); i2++) {
                strArr[i] = (String) U.g(i2);
                i++;
            }
            for (int i3 = 0; i3 < V.size(); i3++) {
                strArr[i] = (String) V.g(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void l() {
        zzdij zzdijVar = this.Y0;
        if (zzdijVar != null) {
            zzdijVar.a();
        }
        this.Y0 = null;
        this.Z = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void m() {
        try {
            String c = this.Y.c();
            if (Objects.equals(c, "Google")) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(c)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdij zzdijVar = this.Y0;
                if (zzdijVar != null) {
                    zzdijVar.V(c, false);
                }
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.t().x(e, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void p() {
        zzdij zzdijVar = this.Y0;
        if (zzdijVar != null) {
            zzdijVar.s();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String p1(String str) {
        return (String) this.Y.V().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean r() {
        zzdij zzdijVar = this.Y0;
        if (zzdijVar != null && !zzdijVar.G()) {
            return false;
        }
        zzdio zzdioVar = this.Y;
        if (zzdioVar.e0() == null || zzdioVar.f0() != null) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean v() {
        zzdio zzdioVar = this.Y;
        zzeda h0 = zzdioVar.h0();
        if (h0 != null) {
            com.google.android.gms.ads.internal.zzv.c().c(h0.a());
            if (zzdioVar.e0() != null) {
                zzdioVar.e0().q("onSdkLoaded", new C2531Be());
                return true;
            }
            return true;
        }
        int i = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Trying to start OMID session before creation.");
        return false;
    }
}
