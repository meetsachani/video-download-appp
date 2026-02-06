package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
final class zzp {
    @InterfaceC11300zs1
    public final Messenger a;
    @InterfaceC11300zs1
    public final zze b;

    public zzp(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (zzo.a(interfaceDescriptor, "android.os.IMessenger")) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if (zzo.a(interfaceDescriptor, IMessengerCompat.a)) {
            this.b = new zze(iBinder);
            this.a = null;
        } else {
            Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public final void a(Message message) throws RemoteException {
        Messenger messenger = this.a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zze zzeVar = this.b;
        if (zzeVar != null) {
            zzeVar.b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
