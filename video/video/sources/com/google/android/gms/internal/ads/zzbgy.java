package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbgy extends zzayk implements zzbha {
    public zzbgy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void E0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        o1(14, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean F0(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        Parcel g1 = g1(10, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean O(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel O0 = O0();
        zzaym.f(O0, iObjectWrapper);
        Parcel g1 = g1(17, O0);
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final com.google.android.gms.ads.internal.client.zzea d() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbgd e() throws RemoteException {
        zzbgd zzbgbVar;
        Parcel g1 = g1(16, O0());
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbgbVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            if (queryLocalInterface instanceof zzbgd) {
                zzbgbVar = (zzbgd) queryLocalInterface;
            } else {
                zzbgbVar = new zzbgb(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void e0(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        o1(5, O0);
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final zzbgg f0(String str) throws RemoteException {
        zzbgg zzbgeVar;
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(2, O0);
        IBinder readStrongBinder = g1.readStrongBinder();
        if (readStrongBinder == null) {
            zzbgeVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            if (queryLocalInterface instanceof zzbgg) {
                zzbgeVar = (zzbgg) queryLocalInterface;
            } else {
                zzbgeVar = new zzbge(readStrongBinder);
            }
        }
        g1.recycle();
        return zzbgeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final IObjectWrapper h() throws RemoteException {
        Parcel g1 = g1(9, O0());
        IObjectWrapper g12 = IObjectWrapper.Stub.g1(g1.readStrongBinder());
        g1.recycle();
        return g12;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String i() throws RemoteException {
        Parcel g1 = g1(4, O0());
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final List k() throws RemoteException {
        Parcel g1 = g1(3, O0());
        ArrayList<String> createStringArrayList = g1.createStringArrayList();
        g1.recycle();
        return createStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void l() throws RemoteException {
        o1(8, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void m() throws RemoteException {
        o1(15, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void p() throws RemoteException {
        o1(6, O0());
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final String p1(String str) throws RemoteException {
        Parcel O0 = O0();
        O0.writeString(str);
        Parcel g1 = g1(1, O0);
        String readString = g1.readString();
        g1.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean r() throws RemoteException {
        Parcel g1 = g1(12, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final boolean v() throws RemoteException {
        Parcel g1 = g1(13, O0());
        boolean g = zzaym.g(g1);
        g1.recycle();
        return g;
    }
}
