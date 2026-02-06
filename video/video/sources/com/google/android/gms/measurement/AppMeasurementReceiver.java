package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzgn;
import o.InterfaceC10389w71;
import o.InterfaceC5670cr1;

/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzgn.zza {
    public zzgn Y0;

    @Override // com.google.android.gms.measurement.internal.zzgn.zza
    @InterfaceC10389w71
    public final void a(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Intent intent) {
        WakefulBroadcastReceiver.c(context, intent);
    }

    @InterfaceC5670cr1
    public final BroadcastReceiver.PendingResult d() {
        return goAsync();
    }

    @Override // android.content.BroadcastReceiver
    @InterfaceC10389w71
    public final void onReceive(@InterfaceC5670cr1 Context context, @InterfaceC5670cr1 Intent intent) {
        if (this.Y0 == null) {
            this.Y0 = new zzgn(this);
        }
        this.Y0.a(context, intent);
    }
}
