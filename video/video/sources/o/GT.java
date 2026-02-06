package o;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import o.XI0;

/* loaded from: classes.dex */
public class GT {
    public static final String d = "CustomTabsSessionToken";
    public final XI0 a;
    public final PendingIntent b;
    public final C9500sT c;

    /* loaded from: classes.dex */
    public class a extends C9500sT {
        public a() {
        }

        @Override // o.C9500sT
        public void a(String str, Bundle bundle) {
            try {
                GT.this.a.z3(str, bundle);
            } catch (RemoteException unused) {
                Log.e(GT.d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // o.C9500sT
        public Bundle b(String str, Bundle bundle) {
            try {
                return GT.this.a.r2(str, bundle);
            } catch (RemoteException unused) {
                Log.e(GT.d, "RemoteException during ICustomTabsCallback transaction");
                return null;
            }
        }

        @Override // o.C9500sT
        public void c(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
            try {
                GT.this.a.W1(i, i2, i3, i4, i5, bundle);
            } catch (RemoteException unused) {
                Log.e(GT.d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // o.C9500sT
        public void d(int i, int i2, Bundle bundle) {
            try {
                GT.this.a.G6(i, i2, bundle);
            } catch (RemoteException unused) {
                Log.e(GT.d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // o.C9500sT
        public void e(Bundle bundle) {
            try {
                GT.this.a.B7(bundle);
            } catch (RemoteException unused) {
                Log.e(GT.d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // o.C9500sT
        public void f(Bundle bundle) {
            try {
                GT.this.a.q6(bundle);
            } catch (RemoteException unused) {
                Log.e(GT.d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // o.C9500sT
        public void g(int i, Bundle bundle) {
            try {
                GT.this.a.d7(i, bundle);
            } catch (RemoteException unused) {
                Log.e(GT.d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // o.C9500sT
        public void h(String str, Bundle bundle) {
            try {
                GT.this.a.r1(str, bundle);
            } catch (RemoteException unused) {
                Log.e(GT.d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // o.C9500sT
        public void i(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                GT.this.a.F7(i, uri, z, bundle);
            } catch (RemoteException unused) {
                Log.e(GT.d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // o.C9500sT
        public void j(Bundle bundle) {
            try {
                GT.this.a.u6(bundle);
            } catch (RemoteException unused) {
                Log.e(GT.d, "RemoteException during ICustomTabsCallback transaction");
            }
        }

        @Override // o.C9500sT
        public void k(Bundle bundle) {
            try {
                GT.this.a.H3(bundle);
            } catch (RemoteException unused) {
                Log.e(GT.d, "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    public GT(XI0 xi0, PendingIntent pendingIntent) {
        a aVar;
        if (xi0 == null && pendingIntent == null) {
            throw new IllegalStateException("CustomTabsSessionToken must have either a session id or a callback (or both).");
        }
        this.a = xi0;
        this.b = pendingIntent;
        if (xi0 == null) {
            aVar = null;
        } else {
            aVar = new a();
        }
        this.c = aVar;
    }

    public static GT a() {
        return new GT(new b(), null);
    }

    public static GT f(Intent intent) {
        Bundle extras = intent.getExtras();
        XI0 xi0 = null;
        if (extras == null) {
            return null;
        }
        IBinder binder = extras.getBinder(C10229vT.d);
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(C10229vT.e);
        if (binder == null && pendingIntent == null) {
            return null;
        }
        if (binder != null) {
            xi0 = XI0.b.O0(binder);
        }
        return new GT(xi0, pendingIntent);
    }

    public C9500sT b() {
        return this.c;
    }

    public IBinder c() {
        XI0 xi0 = this.a;
        if (xi0 == null) {
            return null;
        }
        return xi0.asBinder();
    }

    public final IBinder d() {
        XI0 xi0 = this.a;
        if (xi0 != null) {
            return xi0.asBinder();
        }
        throw new IllegalStateException("CustomTabSessionToken must have valid binder or pending session");
    }

    public PendingIntent e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof GT)) {
            return false;
        }
        GT gt = (GT) obj;
        PendingIntent e = gt.e();
        PendingIntent pendingIntent = this.b;
        boolean z2 = true;
        if (pendingIntent == null) {
            z = true;
        } else {
            z = false;
        }
        if (e != null) {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        if (pendingIntent != null) {
            return pendingIntent.equals(e);
        }
        return d().equals(gt.d());
    }

    public boolean g() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return pendingIntent.hashCode();
        }
        return d().hashCode();
    }

    public boolean i(CT ct) {
        return ct.g().equals(this.a);
    }

    /* loaded from: classes.dex */
    public static class b extends XI0.b {
        @Override // o.XI0
        public Bundle r2(String str, Bundle bundle) {
            return null;
        }

        @Override // o.XI0.b, android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // o.XI0
        public void B7(Bundle bundle) {
        }

        @Override // o.XI0
        public void H3(Bundle bundle) {
        }

        @Override // o.XI0
        public void q6(Bundle bundle) {
        }

        @Override // o.XI0
        public void u6(Bundle bundle) {
        }

        @Override // o.XI0
        public void d7(int i, Bundle bundle) {
        }

        @Override // o.XI0
        public void r1(String str, Bundle bundle) {
        }

        @Override // o.XI0
        public void z3(String str, Bundle bundle) {
        }

        @Override // o.XI0
        public void G6(int i, int i2, Bundle bundle) {
        }

        @Override // o.XI0
        public void F7(int i, Uri uri, boolean z, Bundle bundle) {
        }

        @Override // o.XI0
        public void W1(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        }
    }
}
