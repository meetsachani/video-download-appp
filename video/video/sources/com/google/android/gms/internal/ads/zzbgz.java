package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzbgz extends zzayl implements zzbha {
    public zzbgz() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static zzbha W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        if (queryLocalInterface instanceof zzbha) {
            return (zzbha) queryLocalInterface;
        }
        return new zzbgy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                zzaym.c(parcel);
                String p1 = p1(readString);
                parcel2.writeNoException();
                parcel2.writeString(p1);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzaym.c(parcel);
                zzbgg f0 = f0(readString2);
                parcel2.writeNoException();
                zzaym.f(parcel2, f0);
                return true;
            case 3:
                List<String> k = k();
                parcel2.writeNoException();
                parcel2.writeStringList(k);
                return true;
            case 4:
                String i3 = i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzaym.c(parcel);
                e0(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                p();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzea d = d();
                parcel2.writeNoException();
                zzaym.f(parcel2, d);
                return true;
            case 8:
                l();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper h = h();
                parcel2.writeNoException();
                zzaym.f(parcel2, h);
                return true;
            case 10:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                boolean F0 = F0(g1);
                parcel2.writeNoException();
                parcel2.writeInt(F0 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                zzaym.f(parcel2, null);
                return true;
            case 12:
                boolean r = r();
                parcel2.writeNoException();
                int i4 = zzaym.b;
                parcel2.writeInt(r ? 1 : 0);
                return true;
            case 13:
                boolean v = v();
                parcel2.writeNoException();
                int i5 = zzaym.b;
                parcel2.writeInt(v ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                E0(g12);
                parcel2.writeNoException();
                return true;
            case 15:
                m();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbgd e = e();
                parcel2.writeNoException();
                zzaym.f(parcel2, e);
                return true;
            case 17:
                IObjectWrapper g13 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                boolean O = O(g13);
                parcel2.writeNoException();
                parcel2.writeInt(O ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
