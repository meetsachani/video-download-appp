package o;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import o.InterfaceC8247nL0;

/* loaded from: classes.dex */
public class QE1 extends Service {
    public InterfaceC8247nL0.b X = new a();

    /* loaded from: classes.dex */
    public class a extends InterfaceC8247nL0.b {
        public a() {
        }

        @Override // o.InterfaceC8247nL0
        public void R1(XI0 xi0, String str, Bundle bundle) throws RemoteException {
            xi0.r1(str, bundle);
        }

        @Override // o.InterfaceC8247nL0
        public void w7(XI0 xi0, Bundle bundle) throws RemoteException {
            xi0.B7(bundle);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.X;
    }
}
