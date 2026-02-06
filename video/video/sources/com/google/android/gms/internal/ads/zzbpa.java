package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbpa extends zzcgw {
    public final AppMeasurementSdk X;

    public zzbpa(AppMeasurementSdk appMeasurementSdk) {
        this.X = appMeasurementSdk;
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void A1(String str, String str2, IObjectWrapper iObjectWrapper) throws RemoteException {
        Object obj;
        if (iObjectWrapper != null) {
            obj = ObjectWrapper.o1(iObjectWrapper);
        } else {
            obj = null;
        }
        this.X.z(str, str2, obj);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void C7(String str, String str2, Bundle bundle) throws RemoteException {
        this.X.b(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final int I(String str) throws RemoteException {
        return this.X.m(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void W6(String str, String str2, Bundle bundle) throws RemoteException {
        this.X.o(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void Z(Bundle bundle) throws RemoteException {
        this.X.t(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final long c() throws RemoteException {
        return this.X.d();
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final String d() throws RemoteException {
        return this.X.e();
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final String e() throws RemoteException {
        return this.X.f();
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void e0(String str) throws RemoteException {
        this.X.c(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final Bundle e6(Bundle bundle) throws RemoteException {
        return this.X.r(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final String g() throws RemoteException {
        return this.X.h();
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void g0(String str) throws RemoteException {
        this.X.a(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final String h() throws RemoteException {
        return this.X.i();
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final String i() throws RemoteException {
        return this.X.j();
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void m1(Bundle bundle) throws RemoteException {
        this.X.u(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final List q3(String str, String str2) throws RemoteException {
        return this.X.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void t3(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Activity activity;
        if (iObjectWrapper != null) {
            activity = (Activity) ObjectWrapper.o1(iObjectWrapper);
        } else {
            activity = null;
        }
        this.X.v(activity, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final Map u7(String str, String str2, boolean z) throws RemoteException {
        return this.X.n(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcgx
    public final void x0(Bundle bundle) throws RemoteException {
        this.X.q(bundle);
    }
}
