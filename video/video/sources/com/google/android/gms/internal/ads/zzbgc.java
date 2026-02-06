package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbgc extends zzayl implements zzbgd {
    public zzbgc() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbho zzbhoVar;
        switch (i) {
            case 2:
                float d = d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 3:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                s0(g1);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper i3 = i();
                parcel2.writeNoException();
                zzaym.f(parcel2, i3);
                return true;
            case 5:
                float g = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g);
                return true;
            case 6:
                float e = e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzea h = h();
                parcel2.writeNoException();
                zzaym.f(parcel2, h);
                return true;
            case 8:
                boolean l = l();
                parcel2.writeNoException();
                int i4 = zzaym.b;
                parcel2.writeInt(l ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbhoVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    if (queryLocalInterface instanceof zzbho) {
                        zzbhoVar = (zzbho) queryLocalInterface;
                    } else {
                        zzbhoVar = new zzbho(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                D2(zzbhoVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean k = k();
                parcel2.writeNoException();
                int i5 = zzaym.b;
                parcel2.writeInt(k ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
