package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public abstract class zzfsd extends zzayl implements zzfse {
    public zzfsd() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayl
    public final boolean V7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzaym.c(parcel);
            U6((Bundle) zzaym.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
