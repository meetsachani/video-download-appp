package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbwq;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class zzcg extends zzayl implements zzch {
    public zzcg() {
        super("com.google.android.gms.ads.internal.client.IAdPreloader");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzce zzccVar;
        switch (i) {
            case 1:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(zzfp.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzccVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloadCallback");
                    if (queryLocalInterface instanceof zzce) {
                        zzccVar = (zzce) queryLocalInterface;
                    } else {
                        zzccVar = new zzcc(readStrongBinder);
                    }
                }
                zzaym.c(parcel);
                P2(createTypedArrayList, zzccVar);
                parcel2.writeNoException();
                return true;
            case 2:
                String readString = parcel.readString();
                zzaym.c(parcel);
                boolean g0 = g0(readString);
                parcel2.writeNoException();
                parcel2.writeInt(g0 ? 1 : 0);
                return true;
            case 3:
                String readString2 = parcel.readString();
                zzaym.c(parcel);
                zzbwq f0 = f0(readString2);
                parcel2.writeNoException();
                zzaym.f(parcel2, f0);
                return true;
            case 4:
                String readString3 = parcel.readString();
                zzaym.c(parcel);
                boolean p1 = p1(readString3);
                parcel2.writeNoException();
                parcel2.writeInt(p1 ? 1 : 0);
                return true;
            case 5:
                String readString4 = parcel.readString();
                zzaym.c(parcel);
                zzban u = u(readString4);
                parcel2.writeNoException();
                zzaym.f(parcel2, u);
                return true;
            case 6:
                String readString5 = parcel.readString();
                zzaym.c(parcel);
                boolean k2 = k2(readString5);
                parcel2.writeNoException();
                parcel2.writeInt(k2 ? 1 : 0);
                return true;
            case 7:
                String readString6 = parcel.readString();
                zzaym.c(parcel);
                zzbx S = S(readString6);
                parcel2.writeNoException();
                zzaym.f(parcel2, S);
                return true;
            case 8:
                zzbpl W7 = zzbpk.W7(parcel.readStrongBinder());
                zzaym.c(parcel);
                B1(W7);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
