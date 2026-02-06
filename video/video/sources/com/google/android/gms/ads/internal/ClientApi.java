package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbt;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzch;
import com.google.android.gms.ads.internal.client.zzcn;
import com.google.android.gms.ads.internal.client.zzcy;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzac;
import com.google.android.gms.ads.internal.overlay.zzag;
import com.google.android.gms.ads.internal.overlay.zzai;
import com.google.android.gms.ads.internal.overlay.zzaj;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbgk;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzbwq;
import com.google.android.gms.internal.ads.zzbyv;
import com.google.android.gms.internal.ads.zzchb;
import com.google.android.gms.internal.ads.zzdji;
import com.google.android.gms.internal.ads.zzdjk;
import com.google.android.gms.internal.ads.zzdtn;
import com.google.android.gms.internal.ads.zzeju;
import com.google.android.gms.internal.ads.zzewu;
import com.google.android.gms.internal.ads.zzeyi;
import com.google.android.gms.internal.ads.zzezz;
import com.google.android.gms.internal.ads.zzfbn;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ClientApi extends zzcn {
    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbte E2(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) {
        return zzchb.f((Context) ObjectWrapper.o1(iObjectWrapper), zzbplVar, i).r();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbwa I1(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) {
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        zzfbn z = zzchb.f(context, zzbplVar, i).z();
        z.a(context);
        return z.c().b();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzcy L3(IObjectWrapper iObjectWrapper, int i) {
        return zzchb.f((Context) ObjectWrapper.o1(iObjectWrapper), null, i).g();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbky N3(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i, zzbkv zzbkvVar) {
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        zzdtn o2 = zzchb.f(context, zzbplVar, i).o();
        o2.a(context);
        o2.b(zzbkvVar);
        return o2.c().f();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbgq Q6(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        return new zzdji((View) ObjectWrapper.o1(iObjectWrapper), (HashMap) ObjectWrapper.o1(iObjectWrapper2), (HashMap) ObjectWrapper.o1(iObjectWrapper3));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbgk T2(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        return new zzdjk((FrameLayout) ObjectWrapper.o1(iObjectWrapper), (FrameLayout) ObjectWrapper.o1(iObjectWrapper2), ModuleDescriptor.MODULE_VERSION);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx T5(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbpl zzbplVar, int i) {
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        zzewu w = zzchb.f(context, zzbplVar, i).w();
        w.w(str);
        w.a(context);
        return w.c().a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx W4(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbpl zzbplVar, int i) {
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        zzezz y = zzchb.f(context, zzbplVar, i).y();
        y.b(context);
        y.a(zzrVar);
        y.I(str);
        return y.f().a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbtl d0(IObjectWrapper iObjectWrapper) {
        Activity activity = (Activity) ObjectWrapper.o1(iObjectWrapper);
        AdOverlayInfoParcel m0 = AdOverlayInfoParcel.m0(activity.getIntent());
        if (m0 == null) {
            return new zzw(activity);
        }
        int i = m0.f1;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return new zzw(activity);
                        }
                        return new zzag(activity);
                    }
                    return new zzac(activity, m0);
                }
                return new zzaj(activity);
            }
            return new zzai(activity);
        }
        return new com.google.android.gms.ads.internal.overlay.zzv(activity);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbt e2(IObjectWrapper iObjectWrapper, String str, zzbpl zzbplVar, int i) {
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        return new zzeju(zzchb.f(context, zzbplVar, i), context, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx m2(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, int i) {
        return new zzu((Context) ObjectWrapper.o1(iObjectWrapper), zzrVar, str, new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i, true, false));
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzch q4(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) {
        return zzchb.f((Context) ObjectWrapper.o1(iObjectWrapper), zzbplVar, i).D();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbx r5(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, String str, zzbpl zzbplVar, int i) {
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        zzeyi x = zzchb.f(context, zzbplVar, i).x();
        x.b(context);
        x.a(zzrVar);
        x.I(str);
        return x.f().a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbyv r7(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) {
        return zzchb.f((Context) ObjectWrapper.o1(iObjectWrapper), zzbplVar, i).u();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzbwq s3(IObjectWrapper iObjectWrapper, String str, zzbpl zzbplVar, int i) {
        Context context = (Context) ObjectWrapper.o1(iObjectWrapper);
        zzfbn z = zzchb.f(context, zzbplVar, i).z();
        z.a(context);
        z.w(str);
        return z.c().a();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final zzdt y3(IObjectWrapper iObjectWrapper, zzbpl zzbplVar, int i) {
        return zzchb.f((Context) ObjectWrapper.o1(iObjectWrapper), zzbplVar, i).q();
    }
}
