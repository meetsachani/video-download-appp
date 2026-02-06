package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import o.InterfaceC5056aJ2;

@InterfaceC5056aJ2
/* loaded from: classes2.dex */
public final class zze implements ServiceConnection {
    public final int X;
    public final /* synthetic */ BaseGmsClient Y;

    public zze(BaseGmsClient baseGmsClient, int i) {
        this.Y = baseGmsClient;
        this.X = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        IGmsServiceBroker zzadVar;
        BaseGmsClient baseGmsClient = this.Y;
        if (iBinder != null) {
            obj = baseGmsClient.i1;
            synchronized (obj) {
                try {
                    BaseGmsClient baseGmsClient2 = this.Y;
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof IGmsServiceBroker)) {
                        zzadVar = (IGmsServiceBroker) queryLocalInterface;
                    } else {
                        zzadVar = new zzad(iBinder);
                    }
                    baseGmsClient2.j1 = zzadVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.Y.l0(0, null, this.X);
            return;
        }
        BaseGmsClient.k0(baseGmsClient, 16);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.Y.i1;
        synchronized (obj) {
            this.Y.j1 = null;
        }
        BaseGmsClient baseGmsClient = this.Y;
        int i = this.X;
        Handler handler = baseGmsClient.g1;
        handler.sendMessage(handler.obtainMessage(6, i, 1));
    }
}
