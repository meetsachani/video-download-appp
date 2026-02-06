package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import o.InterfaceC10444wL0;

/* loaded from: classes.dex */
public class Ku2 {
    public final InterfaceC10444wL0 a;

    public Ku2(InterfaceC10444wL0 interfaceC10444wL0) {
        this.a = interfaceC10444wL0;
    }

    public static Ku2 a(IBinder iBinder) {
        InterfaceC10444wL0 O0;
        if (iBinder == null) {
            O0 = null;
        } else {
            O0 = InterfaceC10444wL0.b.O0(iBinder);
        }
        if (O0 == null) {
            return null;
        }
        return new Ku2(O0);
    }

    public void b(String str, Bundle bundle) throws RemoteException {
        this.a.A7(str, bundle);
    }
}
