package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdmx extends zzbgw {
    @InterfaceC11300zs1
    public final String X;
    public final zzdij Y;
    public final zzdio Z;

    public zzdmx(@InterfaceC11300zs1 String str, zzdij zzdijVar, zzdio zzdioVar) {
        this.X = str;
        this.Y = zzdijVar;
        this.Z = zzdioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void B0(Bundle bundle) throws RemoteException {
        this.Y.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final boolean Z(Bundle bundle) throws RemoteException {
        return this.Y.I(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final Bundle b() throws RemoteException {
        return this.Z.Q();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final com.google.android.gms.ads.internal.client.zzea c() throws RemoteException {
        return this.Z.W();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final zzbgg d() throws RemoteException {
        return this.Z.b0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final IObjectWrapper e() throws RemoteException {
        return this.Z.i0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final zzbfz f() throws RemoteException {
        return this.Z.Y();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final IObjectWrapper g() throws RemoteException {
        return ObjectWrapper.V3(this.Y);
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String h() throws RemoteException {
        return this.Z.k0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String i() throws RemoteException {
        return this.Z.l0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String j() throws RemoteException {
        return this.Z.m0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String k() throws RemoteException {
        return this.Z.b();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final String l() throws RemoteException {
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final List m() throws RemoteException {
        return this.Z.g();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void n() throws RemoteException {
        this.Y.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void x0(Bundle bundle) throws RemoteException {
        this.Y.v(bundle);
    }
}
