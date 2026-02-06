package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzpg;
import o.InterfaceC10389w71;

/* loaded from: classes3.dex */
public final class zzp extends BroadcastReceiver {
    public final zzhf a;

    public zzp(zzhf zzhfVar) {
        this.a = zzhfVar;
    }

    @Override // android.content.BroadcastReceiver
    @InterfaceC10389w71
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.a.j().L().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.a.j().L().a("App receiver called with null action");
        } else if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.a.j().L().a("App receiver called with unknown action");
        } else {
            final zzhf zzhfVar = this.a;
            if (zzpg.a() && zzhfVar.z().D(null, zzbi.M0)) {
                zzhfVar.j().K().a("App receiver notified triggers are available");
                zzhfVar.l().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzhf zzhfVar2 = zzhf.this;
                        if (!zzhfVar2.L().V0()) {
                            zzhfVar2.j().L().a("registerTrigger called but app not eligible");
                            return;
                        }
                        final zziq H = zzhfVar2.H();
                        H.getClass();
                        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzs
                            @Override // java.lang.Runnable
                            public final void run() {
                                zziq.this.q0();
                            }
                        }).start();
                    }
                });
            }
        }
    }
}
