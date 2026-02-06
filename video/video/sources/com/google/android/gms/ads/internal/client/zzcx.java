package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzbma;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpl;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class zzcx extends zzayl implements zzcy {
    public zzcx() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdk zzdiVar;
        switch (i) {
            case 1:
                k();
                parcel2.writeNoException();
                return true;
            case 2:
                float readFloat = parcel.readFloat();
                zzaym.c(parcel);
                D6(readFloat);
                parcel2.writeNoException();
                return true;
            case 3:
                String readString = parcel.readString();
                zzaym.c(parcel);
                Q3(readString);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean g = zzaym.g(parcel);
                zzaym.c(parcel);
                T7(g);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                zzaym.c(parcel);
                P6(g1, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                String readString3 = parcel.readString();
                IObjectWrapper g12 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                zzaym.c(parcel);
                d3(readString3, g12);
                parcel2.writeNoException();
                return true;
            case 7:
                float d = d();
                parcel2.writeNoException();
                parcel2.writeFloat(d);
                return true;
            case 8:
                boolean q = q();
                parcel2.writeNoException();
                int i3 = zzaym.b;
                parcel2.writeInt(q ? 1 : 0);
                return true;
            case 9:
                String e = e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 10:
                String readString4 = parcel.readString();
                zzaym.c(parcel);
                r0(readString4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbpl W7 = zzbpk.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                b6(W7);
                parcel2.writeNoException();
                return true;
            case 12:
                zzbmb W72 = zzbma.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                u4(W72);
                parcel2.writeNoException();
                return true;
            case 13:
                List g2 = g();
                parcel2.writeNoException();
                parcel2.writeTypedList(g2);
                return true;
            case 14:
                zzaym.c(parcel);
                y1((zzfr) zzaym.a(parcel, zzfr.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                i();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzdiVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    if (queryLocalInterface instanceof zzdk) {
                        zzdiVar = (zzdk) queryLocalInterface;
                    } else {
                        zzdiVar = new zzdi(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                I4(zzdiVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean g3 = zzaym.g(parcel);
                zzaym.c(parcel);
                n0(g3);
                parcel2.writeNoException();
                return true;
            case 18:
                String readString5 = parcel.readString();
                zzaym.c(parcel);
                B4(readString5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
