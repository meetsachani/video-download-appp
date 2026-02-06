package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import o.InterfaceC10389w71;

/* loaded from: classes3.dex */
public final class zzgl implements ServiceConnection {
    public final String X;
    public final /* synthetic */ zzgm Y;

    public zzgl(zzgm zzgmVar, String str) {
        this.Y = zzgmVar;
        this.X = str;
    }

    @Override // android.content.ServiceConnection
    @InterfaceC10389w71
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.Y.a.j().L().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            com.google.android.gms.internal.measurement.zzby g1 = com.google.android.gms.internal.measurement.zzcb.g1(iBinder);
            if (g1 == null) {
                this.Y.a.j().L().a("Install Referrer Service implementation was not found");
                return;
            }
            this.Y.a.j().K().a("Install Referrer Service connected");
            this.Y.a.l().D(new zzgo(this, g1, this));
        } catch (RuntimeException e) {
            this.Y.a.j().L().b("Exception occurred while calling Install Referrer API", e);
        }
    }

    @Override // android.content.ServiceConnection
    @InterfaceC10389w71
    public final void onServiceDisconnected(ComponentName componentName) {
        this.Y.a.j().K().a("Install Referrer Service disconnected");
    }
}
