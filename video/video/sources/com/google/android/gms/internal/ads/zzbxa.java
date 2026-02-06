package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbxa implements RewardItem {
    public final zzbwn b;

    public zzbxa(zzbwn zzbwnVar) {
        this.b = zzbwnVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int a() {
        zzbwn zzbwnVar = this.b;
        if (zzbwnVar != null) {
            try {
                return zzbwnVar.d();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.h("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    @InterfaceC11300zs1
    public final String getType() {
        zzbwn zzbwnVar = this.b;
        if (zzbwnVar != null) {
            try {
                return zzbwnVar.e();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.h("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
