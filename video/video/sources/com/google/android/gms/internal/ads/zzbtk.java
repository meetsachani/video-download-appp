package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbtk extends zzayl implements zzbtl {
    public zzbtk() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static zzbtl W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        if (queryLocalInterface instanceof zzbtl) {
            return (zzbtl) queryLocalInterface;
        }
        return new zzbtj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzaym.c(parcel);
                n3((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                v();
                parcel2.writeNoException();
                return true;
            case 4:
                x();
                parcel2.writeNoException();
                return true;
            case 5:
                p();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle = (Bundle) zzaym.a(parcel, Bundle.CREATOR);
                zzaym.c(parcel);
                h1(bundle);
                parcel2.writeNoException();
                zzaym.e(parcel2, bundle);
                return true;
            case 7:
                t();
                parcel2.writeNoException();
                return true;
            case 8:
                m();
                parcel2.writeNoException();
                return true;
            case 9:
                y();
                parcel2.writeNoException();
                return true;
            case 10:
                i();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean P = P();
                parcel2.writeNoException();
                int i3 = zzaym.b;
                parcel2.writeInt(P ? 1 : 0);
                return true;
            case 12:
                zzaym.c(parcel);
                G5(parcel.readInt(), parcel.readInt(), (Intent) zzaym.a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                b0(g1);
                parcel2.writeNoException();
                return true;
            case 14:
                q();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                zzaym.c(parcel);
                K2(readInt, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
