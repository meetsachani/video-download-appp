package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzdmv extends zzbgu {
    @InterfaceC11300zs1
    public final String X;
    public final zzdij Y;
    public final zzdio Z;

    public zzdmv(@InterfaceC11300zs1 String str, zzdij zzdijVar, zzdio zzdioVar) {
        this.X = str;
        this.Y = zzdijVar;
        this.Z = zzdioVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final void Z(Bundle bundle) throws RemoteException {
        this.Y.o(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final double b() throws RemoteException {
        return this.Z.A();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final Bundle c() throws RemoteException {
        return this.Z.Q();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final zzbfz d() throws RemoteException {
        return this.Z.Y();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final zzbgg e() throws RemoteException {
        return this.Z.a0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final com.google.android.gms.ads.internal.client.zzea f() throws RemoteException {
        return this.Z.W();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final IObjectWrapper g() throws RemoteException {
        return this.Z.i0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final IObjectWrapper h() throws RemoteException {
        return ObjectWrapper.V3(this.Y);
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final boolean h1(Bundle bundle) throws RemoteException {
        return this.Y.I(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final String i() throws RemoteException {
        return this.Z.l0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final String j() throws RemoteException {
        return this.Z.m0();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final String k() throws RemoteException {
        return this.Z.b();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final String l() throws RemoteException {
        return this.X;
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final String m() throws RemoteException {
        return this.Z.d();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final void m1(Bundle bundle) throws RemoteException {
        this.Y.v(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final String n() throws RemoteException {
        return this.Z.e();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final void o() throws RemoteException {
        this.Y.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbgv
    public final List p() throws RemoteException {
        return this.Z.g();
    }
}
