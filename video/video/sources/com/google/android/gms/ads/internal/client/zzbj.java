package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public abstract class zzbj extends zzayl implements zzbk {
    public zzbj() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                f();
                break;
            case 2:
                int readInt = parcel.readInt();
                zzaym.c(parcel);
                E(readInt);
                break;
            case 3:
                break;
            case 4:
                i();
                break;
            case 5:
                j();
                break;
            case 6:
                c();
                break;
            case 7:
                g();
                break;
            case 8:
                zzaym.c(parcel);
                G((zze) zzaym.a(parcel, zze.CREATOR));
                break;
            case 9:
                k();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
