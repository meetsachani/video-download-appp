package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;

/* loaded from: classes2.dex */
public final class zzdh implements MuteThisAdReason {
    public final String a;
    public final zzdg b;

    public zzdh(zzdg zzdgVar) {
        String str;
        this.b = zzdgVar;
        try {
            str = zzdgVar.d();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.e("", e);
            str = null;
        }
        this.a = str;
    }

    public final zzdg a() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.a;
    }

    public final String toString() {
        return this.a;
    }
}
