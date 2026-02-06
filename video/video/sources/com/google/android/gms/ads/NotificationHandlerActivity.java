package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbph;
import com.google.android.gms.internal.ads.zzbte;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public final class NotificationHandlerActivity extends Activity {
    @InterfaceC5670cr1
    @KeepForSdk
    public static final String X = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    public final void onCreate(@InterfaceC11300zs1 Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbte o2 = zzbb.a().o(this, new zzbph());
            if (o2 == null) {
                zzo.d("OfflineUtils is null");
            } else {
                o2.s1(getIntent());
            }
        } catch (RemoteException e) {
            zzo.d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
