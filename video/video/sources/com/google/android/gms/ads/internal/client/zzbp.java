package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public abstract class zzbp extends zzayl implements zzbq {
    public zzbp() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return false;
                        }
                        int readInt = parcel.readInt();
                        zzaym.c(parcel);
                        Q4((zzm) zzaym.a(parcel, zzm.CREATOR), readInt);
                        parcel2.writeNoException();
                    } else {
                        String e = e();
                        parcel2.writeNoException();
                        parcel2.writeString(e);
                    }
                } else {
                    boolean i3 = i();
                    parcel2.writeNoException();
                    int i4 = zzaym.b;
                    parcel2.writeInt(i3 ? 1 : 0);
                }
            } else {
                String d = d();
                parcel2.writeNoException();
                parcel2.writeString(d);
            }
        } else {
            zzaym.c(parcel);
            U4((zzm) zzaym.a(parcel, zzm.CREATOR));
            parcel2.writeNoException();
        }
        return true;
    }
}
