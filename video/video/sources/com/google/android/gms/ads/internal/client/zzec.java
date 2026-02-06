package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayl;
import com.google.android.gms.internal.ads.zzaym;

/* loaded from: classes2.dex */
public abstract class zzec extends zzayl implements zzed {
    public zzec() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
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
                        boolean g = zzaym.g(parcel);
                        zzaym.c(parcel);
                        U3(g);
                    } else {
                        d();
                    }
                } else {
                    g();
                }
            } else {
                h();
            }
        } else {
            i();
        }
        parcel2.writeNoException();
        return true;
    }
}
