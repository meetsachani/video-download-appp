package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public abstract class zzdz extends zzayl implements zzea {
    public zzdz() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static zzea W7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        if (queryLocalInterface instanceof zzea) {
            return (zzea) queryLocalInterface;
        }
        return new zzdy(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzed zzebVar;
        switch (i) {
            case 1:
                l();
                parcel2.writeNoException();
                return true;
            case 2:
                k();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean g = zzaym.g(parcel);
                zzaym.c(parcel);
                n0(g);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean r = r();
                parcel2.writeNoException();
                int i3 = zzaym.b;
                parcel2.writeInt(r ? 1 : 0);
                return true;
            case 5:
                int h = h();
                parcel2.writeNoException();
                parcel2.writeInt(h);
                return true;
            case 6:
                float g2 = g();
                parcel2.writeNoException();
                parcel2.writeFloat(g2);
                return true;
            case 7:
                float e = e();
                parcel2.writeNoException();
                parcel2.writeFloat(e);
                return true;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzebVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    if (queryLocalInterface instanceof zzed) {
                        zzebVar = (zzed) queryLocalInterface;
                    } else {
                        zzebVar = new zzeb(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                n2(zzebVar);
                parcel2.writeNoException();
                return true;
            case 9:
                float d = d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 10:
                boolean o2 = o();
                parcel2.writeNoException();
                int i4 = zzaym.b;
                parcel2.writeInt(o2 ? 1 : 0);
                return true;
            case 11:
                zzed i5 = i();
                parcel2.writeNoException();
                zzaym.f(parcel2, i5);
                return true;
            case 12:
                boolean p = p();
                parcel2.writeNoException();
                int i6 = zzaym.b;
                parcel2.writeInt(p ? 1 : 0);
                return true;
            case 13:
                n();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
