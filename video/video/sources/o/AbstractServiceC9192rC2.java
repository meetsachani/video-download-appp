package o;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import o.InterfaceC11173zL0;

/* renamed from: o.rC2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractServiceC9192rC2 extends Service {
    public static final String Y = "android.support.unusedapprestrictions.action.CustomUnusedAppRestrictionsBackportService";
    public InterfaceC11173zL0.b X = new a();

    /* renamed from: o.rC2$a */
    /* loaded from: classes.dex */
    public class a extends InterfaceC11173zL0.b {
        public a() {
        }

        @Override // o.InterfaceC11173zL0
        public void Y6(InterfaceC10930yL0 interfaceC10930yL0) throws RemoteException {
            if (interfaceC10930yL0 == null) {
                return;
            }
            AbstractServiceC9192rC2.this.a(new C8943qC2(interfaceC10930yL0));
        }
    }

    public abstract void a(C8943qC2 c8943qC2);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.X;
    }
}
