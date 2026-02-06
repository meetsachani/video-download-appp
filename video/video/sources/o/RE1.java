package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import o.InterfaceC8247nL0;
import o.XI0;

/* loaded from: classes.dex */
public abstract class RE1 implements PE1, ServiceConnection {
    public static final String a1 = "PostMessageServConn";
    public final Object X = new Object();
    public final XI0 Y;
    public String Y0;
    public InterfaceC8247nL0 Z;
    public boolean Z0;

    public RE1(GT gt) {
        IBinder c = gt.c();
        if (c != null) {
            this.Y = XI0.b.O0(c);
            return;
        }
        throw new IllegalArgumentException("Provided session must have binder.");
    }

    @Override // o.PE1
    public void a(Context context) {
        m(context);
    }

    @Override // o.PE1
    public final boolean b(Bundle bundle) {
        return g(bundle);
    }

    public boolean c(Context context) {
        String str = this.Y0;
        if (str != null) {
            return d(context, str);
        }
        throw new IllegalStateException("setPackageName must be called before bindSessionToPostMessageService.");
    }

    public boolean d(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(str, QE1.class.getName());
        boolean bindService = context.bindService(intent, this, 1);
        if (!bindService) {
            Log.w(a1, "Could not bind to PostMessageService in client.");
        }
        return bindService;
    }

    public void e(Context context) {
        if (f()) {
            m(context);
        }
    }

    public final boolean f() {
        if (this.Z != null) {
            return true;
        }
        return false;
    }

    public final boolean g(Bundle bundle) {
        this.Z0 = true;
        return h(bundle);
    }

    public final boolean h(Bundle bundle) {
        if (this.Z == null) {
            return false;
        }
        synchronized (this.X) {
            try {
                try {
                    this.Z.w7(this.Y, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void i() {
        if (this.Z0) {
            h(null);
        }
    }

    public final boolean k(String str, Bundle bundle) {
        if (this.Z == null) {
            return false;
        }
        synchronized (this.X) {
            try {
                try {
                    this.Z.R1(this.Y, str, bundle);
                } catch (RemoteException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void l(String str) {
        this.Y0 = str;
    }

    public void m(Context context) {
        if (f()) {
            context.unbindService(this);
            this.Z = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.Z = InterfaceC8247nL0.b.O0(iBinder);
        i();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.Z = null;
        j();
    }

    @Override // o.PE1
    public final boolean r1(String str, Bundle bundle) {
        return k(str, bundle);
    }

    public void j() {
    }
}
