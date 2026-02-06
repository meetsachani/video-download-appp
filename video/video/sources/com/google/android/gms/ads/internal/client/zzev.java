package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzev extends zzdf {
    public final String X;
    public final String Y;

    public zzev(String str, String str2) {
        this.X = str;
        this.Y = str2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String d() throws RemoteException {
        return this.X;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final String e() throws RemoteException {
        return this.Y;
    }
}
