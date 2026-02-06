package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;
import o.InterfaceC10389w71;
import o.InterfaceC10697xN2;
import o.InterfaceC5056aJ2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class zzgb extends BroadcastReceiver {
    @InterfaceC5056aJ2
    public static final String d = "com.google.android.gms.measurement.internal.zzgb";
    public final zzmp a;
    public boolean b;
    public boolean c;

    public zzgb(zzmp zzmpVar) {
        Preconditions.r(zzmpVar);
        this.a = zzmpVar;
    }

    @InterfaceC10697xN2
    public final void b() {
        this.a.p0();
        this.a.l().n();
        if (this.b) {
            return;
        }
        this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.c = this.a.g0().A();
        this.a.j().K().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.c));
        this.b = true;
    }

    @InterfaceC10697xN2
    public final void c() {
        this.a.p0();
        this.a.l().n();
        this.a.l().n();
        if (!this.b) {
            return;
        }
        this.a.j().K().a("Unregistering connectivity change receiver");
        this.b = false;
        this.c = false;
        try {
            this.a.a().unregisterReceiver(this);
        } catch (IllegalArgumentException e) {
            this.a.j().G().b("Failed to unregister the network broadcast receiver", e);
        }
    }

    @Override // android.content.BroadcastReceiver
    @InterfaceC10389w71
    public void onReceive(Context context, Intent intent) {
        this.a.p0();
        String action = intent.getAction();
        this.a.j().K().b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean A = this.a.g0().A();
            if (this.c != A) {
                this.c = A;
                this.a.l().D(new zzge(this, A));
                return;
            }
            return;
        }
        this.a.j().L().b("NetworkBroadcastReceiver received unknown action", action);
    }
}
