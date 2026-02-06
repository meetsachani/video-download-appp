package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC10389w71;

/* loaded from: classes3.dex */
public final class zzgn {
    public final zza a;

    /* loaded from: classes3.dex */
    public interface zza {
        void a(Context context, Intent intent);
    }

    public zzgn(zza zzaVar) {
        Preconditions.r(zzaVar);
        this.a = zzaVar;
    }

    @InterfaceC10389w71
    public final void a(Context context, Intent intent) {
        zzfr j = zzhf.c(context, null, null).j();
        if (intent == null) {
            j.L().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        j.K().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            j.K().a("Starting wakeful intent.");
            this.a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            j.L().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
