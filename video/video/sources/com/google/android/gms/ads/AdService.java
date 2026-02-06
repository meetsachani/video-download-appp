package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbph;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public class AdService extends IntentService {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String X = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@InterfaceC5670cr1 Intent intent) {
        try {
            zzbb.a().o(this, new zzbph()).s1(intent);
        } catch (RemoteException e) {
            zzo.d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
