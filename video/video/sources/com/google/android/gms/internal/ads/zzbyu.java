package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class zzbyu extends zzayl implements zzbyv {
    public zzbyu() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbyv W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        if (queryLocalInterface instanceof zzbyv) {
            return (zzbyv) queryLocalInterface;
        }
        return new zzbyt(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbys zzbysVar = null;
        switch (i) {
            case 1:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbyz zzbyzVar = (zzbyz) zzaym.a(parcel, zzbyz.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    if (queryLocalInterface instanceof zzbys) {
                        zzbysVar = (zzbys) queryLocalInterface;
                    } else {
                        zzbysVar = new zzbyq(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                E3(g1, zzbyzVar, zzbysVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                b0(g12);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                parcel2.writeNoException();
                zzaym.f(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                parcel2.writeNoException();
                zzaym.f(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper g13 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbua W7 = zzbtz.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                a6(createTypedArrayList, g13, W7);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper g14 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbua W72 = zzbtz.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                O3(createTypedArrayList2, g14, W72);
                parcel2.writeNoException();
                return true;
            case 7:
                zzaym.c(parcel);
                s4((zzbud) zzaym.a(parcel, zzbud.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper g15 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                s0(g15);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper g16 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbua W73 = zzbtz.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                R3(createTypedArrayList3, g16, W73);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper g17 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzbua W74 = zzbtz.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                V1(createTypedArrayList4, g17, W74);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper g18 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                IObjectWrapper g19 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                String readString = parcel.readString();
                IObjectWrapper g110 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                IObjectWrapper V2 = V2(g18, g19, readString, g110);
                parcel2.writeNoException();
                zzaym.f(parcel2, V2);
                return true;
            default:
                return false;
        }
    }
}
