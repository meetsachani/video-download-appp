package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzcgw extends zzayl implements zzcgx {
    public zzcgw() {
        super("com.google.android.gms.ads.measurement.IAppMeasurementProxy");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zzaym.c(parcel);
                x0((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                zzaym.c(parcel);
                Bundle e6 = e6((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                zzaym.e(parcel2, e6);
                return true;
            case 3:
                zzaym.c(parcel);
                W6(parcel.readString(), parcel.readString(), (Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                A1(readString, readString2, g1);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean g = zzaym.g(parcel);
                zzaym.c(parcel);
                Map u7 = u7(readString3, readString4, g);
                parcel2.writeNoException();
                parcel2.writeMap(u7);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzaym.c(parcel);
                int I = I(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(I);
                return true;
            case 7:
                zzaym.c(parcel);
                Z((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                zzaym.c(parcel);
                C7(parcel.readString(), parcel.readString(), (Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 9:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                zzaym.c(parcel);
                List q3 = q3(readString6, readString7);
                parcel2.writeNoException();
                parcel2.writeList(q3);
                return true;
            case 10:
                String e = e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 11:
                String i3 = i();
                parcel2.writeNoException();
                parcel2.writeString(i3);
                return true;
            case 12:
                long c = c();
                parcel2.writeNoException();
                parcel2.writeLong(c);
                return true;
            case 13:
                String readString8 = parcel.readString();
                zzaym.c(parcel);
                g0(readString8);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString9 = parcel.readString();
                zzaym.c(parcel);
                e0(readString9);
                parcel2.writeNoException();
                return true;
            case 15:
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                zzaym.c(parcel);
                t3(g12, readString10, readString11);
                parcel2.writeNoException();
                return true;
            case 16:
                String h = h();
                parcel2.writeNoException();
                parcel2.writeString(h);
                return true;
            case 17:
                String g2 = g();
                parcel2.writeNoException();
                parcel2.writeString(g2);
                return true;
            case 18:
                String d = d();
                parcel2.writeNoException();
                parcel2.writeString(d);
                return true;
            case 19:
                zzaym.c(parcel);
                m1((Bundle) zzaym.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
