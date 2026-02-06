package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbqq extends zzbpz {
    public final NativeAdMapper X;

    public zzbqq(NativeAdMapper nativeAdMapper) {
        this.X = nativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void G4(IObjectWrapper iObjectWrapper) {
        this.X.q((View) ObjectWrapper.o1(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final boolean L() {
        return this.X.l();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final boolean R() {
        return this.X.m();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void X5(IObjectWrapper iObjectWrapper) {
        this.X.K((View) ObjectWrapper.o1(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final double d() {
        NativeAdMapper nativeAdMapper = this.X;
        if (nativeAdMapper.o() != null) {
            return nativeAdMapper.o().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final float e() {
        return this.X.k();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final float g() {
        return this.X.e();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void g7(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        View view = (View) ObjectWrapper.o1(iObjectWrapper);
        this.X.J(view, (HashMap) ObjectWrapper.o1(iObjectWrapper2), (HashMap) ObjectWrapper.o1(iObjectWrapper3));
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final float h() {
        return this.X.f();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final Bundle i() {
        return this.X.g();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    @InterfaceC11300zs1
    public final com.google.android.gms.ads.internal.client.zzea j() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    @InterfaceC11300zs1
    public final zzbfz k() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    @InterfaceC11300zs1
    public final zzbgg l() {
        NativeAd.Image i = this.X.i();
        if (i != null) {
            return new zzbft(i.a(), i.c(), i.b(), i.e(), i.d());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    @InterfaceC11300zs1
    public final IObjectWrapper m() {
        View a = this.X.a();
        if (a == null) {
            return null;
        }
        return ObjectWrapper.V3(a);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    @InterfaceC11300zs1
    public final IObjectWrapper n() {
        View L = this.X.L();
        if (L == null) {
            return null;
        }
        return ObjectWrapper.V3(L);
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String o() {
        return this.X.b();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    @InterfaceC11300zs1
    public final IObjectWrapper p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final List q() {
        List<NativeAd.Image> j = this.X.j();
        ArrayList arrayList = new ArrayList();
        if (j != null) {
            for (NativeAd.Image image : j) {
                arrayList.add(new zzbft(image.a(), image.c(), image.b(), image.e(), image.d()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String r() {
        return this.X.c();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String s() {
        return this.X.h();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String t() {
        return this.X.p();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String v() {
        return this.X.n();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final String x() {
        return this.X.d();
    }

    @Override // com.google.android.gms.internal.ads.zzbqa
    public final void y() {
        this.X.s();
    }
}
