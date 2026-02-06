package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public abstract class zzcr extends zzayl implements zzcs {
    public zzcr() {
        super("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
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
                        b();
                    } else {
                        d();
                    }
                } else {
                    c();
                }
            } else {
                e();
            }
        } else {
            zzaym.c(parcel);
            D0((zze) zzaym.a(parcel, zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
