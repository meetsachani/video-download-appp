package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* loaded from: classes2.dex */
final class zzbzd implements Runnable {
    public final /* synthetic */ Context X;
    public final /* synthetic */ zzcaf Y;

    public zzbzd(zzbze zzbzeVar, Context context, zzcaf zzcafVar) {
        this.X = context;
        this.Y = zzcafVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.Y.c(AdvertisingIdClient.a(this.X));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e) {
            this.Y.d(e);
            com.google.android.gms.ads.internal.util.client.zzo.e("Exception while getting advertising Id info", e);
        }
    }
}
