package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzc extends zzb {
    public final Context c;

    public zzc(Context context) {
        this.c = context;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void a() {
        boolean z;
        try {
            z = AdvertisingIdClient.c(this.c);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            int i = zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.e("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        com.google.android.gms.ads.internal.util.client.zzl.j(z);
        int i2 = zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.g("Update ad debug logging enablement as " + z);
    }
}
