package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class zzfj extends com.google.android.gms.internal.measurement.zzbx implements zzfk {
    public zzfj() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.internal.measurement.zzbx
    public final boolean O0(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                W5((zzbg) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzbg.CREATOR), (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                K7((zznc) com.google.android.gms.internal.measurement.zzbw.a(parcel, zznc.CREATOR), (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                l6((zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                l7((zzbg) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzbg.CREATOR), readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                o5((zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                boolean h = com.google.android.gms.internal.measurement.zzbw.h(parcel);
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                List<zznc> l4 = l4((zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR), h);
                parcel2.writeNoException();
                parcel2.writeTypedList(l4);
                return true;
            case 9:
                String readString3 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                byte[] i6 = i6((zzbg) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzbg.CREATOR), readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(i6);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                O2(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                String J5 = J5((zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(J5);
                break;
            case 12:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                J7((zzad) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzad.CREATOR), (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                break;
            case 13:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                p3((zzad) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzad.CREATOR));
                parcel2.writeNoException();
                break;
            case 14:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                List<zznc> e7 = e7(parcel.readString(), parcel.readString(), com.google.android.gms.internal.measurement.zzbw.h(parcel), (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(e7);
                break;
            case 15:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                boolean h2 = com.google.android.gms.internal.measurement.zzbw.h(parcel);
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                List<zznc> X1 = X1(readString7, readString8, readString9, h2);
                parcel2.writeNoException();
                parcel2.writeTypedList(X1);
                break;
            case 16:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                List<zzad> u1 = u1(parcel.readString(), parcel.readString(), (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(u1);
                break;
            case 17:
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                List<zzad> R2 = R2(readString10, readString11, readString12);
                parcel2.writeNoException();
                parcel2.writeTypedList(R2);
                break;
            case 18:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                F4((zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                break;
            case 19:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                n5((Bundle) com.google.android.gms.internal.measurement.zzbw.a(parcel, Bundle.CREATOR), (zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                break;
            case 20:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                l5((zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                break;
            case 21:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                zzam A3 = A3((zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR));
                parcel2.writeNoException();
                com.google.android.gms.internal.measurement.zzbw.g(parcel2, A3);
                break;
            case 24:
                com.google.android.gms.internal.measurement.zzbw.f(parcel);
                List<zzmh> f4 = f4((zzo) com.google.android.gms.internal.measurement.zzbw.a(parcel, zzo.CREATOR), (Bundle) com.google.android.gms.internal.measurement.zzbw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(f4);
                break;
        }
        return true;
    }
}
