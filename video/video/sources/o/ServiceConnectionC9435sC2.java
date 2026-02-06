package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import o.InterfaceC10930yL0;
import o.InterfaceC11173zL0;

/* renamed from: o.sC2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceConnectionC9435sC2 implements ServiceConnection {
    public ZS1<Integer> Y;
    public final Context Z;
    public InterfaceC11173zL0 X = null;
    public boolean Y0 = false;

    /* renamed from: o.sC2$a */
    /* loaded from: classes.dex */
    public class a extends InterfaceC10930yL0.b {
        public a() {
        }

        @Override // o.InterfaceC10930yL0
        public void Z3(boolean z, boolean z2) throws RemoteException {
            if (z) {
                if (z2) {
                    ServiceConnectionC9435sC2.this.Y.v(3);
                    return;
                } else {
                    ServiceConnectionC9435sC2.this.Y.v(2);
                    return;
                }
            }
            ServiceConnectionC9435sC2.this.Y.v(0);
            Log.e(C3009Fx1.a, "Unable to retrieve the permission revocation setting from the backport");
        }
    }

    public ServiceConnectionC9435sC2(Context context) {
        this.Z = context;
    }

    public void a(ZS1<Integer> zs1) {
        if (!this.Y0) {
            this.Y0 = true;
            this.Y = zs1;
            this.Z.bindService(new Intent(AbstractServiceC9192rC2.Y).setPackage(C3009Fx1.b(this.Z.getPackageManager())), this, 1);
            return;
        }
        throw new IllegalStateException("Each UnusedAppRestrictionsBackportServiceConnection can only be bound once.");
    }

    public void b() {
        if (this.Y0) {
            this.Y0 = false;
            this.Z.unbindService(this);
            return;
        }
        throw new IllegalStateException("bindService must be called before unbind");
    }

    public final InterfaceC10930yL0 c() {
        return new a();
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC11173zL0 O0 = InterfaceC11173zL0.b.O0(iBinder);
        this.X = O0;
        try {
            O0.Y6(c());
        } catch (RemoteException unused) {
            this.Y.v(0);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        this.X = null;
    }
}
