package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzbxh extends zzbwm {
    public final String X;
    public final int Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbxh(@InterfaceC11300zs1 RewardItem rewardItem) {
        this(r0, rewardItem != null ? rewardItem.a() : 1);
        String str;
        if (rewardItem != null) {
            str = rewardItem.getType();
        } else {
            str = "";
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final int d() throws RemoteException {
        return this.Y;
    }

    @Override // com.google.android.gms.internal.ads.zzbwn
    public final String e() throws RemoteException {
        return this.X;
    }

    public zzbxh(String str, int i) {
        this.X = str;
        this.Y = i;
    }
}
