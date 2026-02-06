package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
public abstract class zzbdm extends zzayl implements zzbdn {
    public zzbdm() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
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
                        e();
                        parcel2.writeNoException();
                    } else {
                        d();
                        parcel2.writeNoException();
                    }
                } else {
                    IObjectWrapper g1 = IObjectWrapper.Stub.g1(parcel.readStrongBinder());
                    zzaym.c(parcel);
                    L0(g1);
                    parcel2.writeNoException();
                }
            } else {
                String c = c();
                parcel2.writeNoException();
                parcel2.writeString(c);
            }
        } else {
            String b = b();
            parcel2.writeNoException();
            parcel2.writeString(b);
        }
        return true;
    }
}
