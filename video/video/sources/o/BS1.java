package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import o.BS1;

@Deprecated
/* loaded from: classes2.dex */
public final class BS1 {
    public final Context a;
    public final c b;
    public final AS1 c;
    public final Handler d = TD2.E();
    @InterfaceC11300zs1
    public b e;
    public int f;
    @InterfaceC11300zs1
    public d g;

    /* loaded from: classes2.dex */
    public class b extends BroadcastReceiver {
        public b() {
            BS1.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                BS1.this.e();
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(BS1 bs1, int i);
    }

    @ES1(24)
    /* loaded from: classes2.dex */
    public final class d extends ConnectivityManager.NetworkCallback {
        public boolean a;
        public boolean b;

        public d() {
            BS1.this = r1;
        }

        public static /* synthetic */ void a(d dVar) {
            if (BS1.this.g != null) {
                BS1.this.g();
            }
        }

        public static /* synthetic */ void b(d dVar) {
            if (BS1.this.g != null) {
                BS1.this.e();
            }
        }

        public final void c() {
            BS1.this.d.post(new Runnable() { // from class: o.CS1
                @Override // java.lang.Runnable
                public final void run() {
                    BS1.d.b(BS1.d.this);
                }
            });
        }

        public final void d() {
            BS1.this.d.post(new Runnable() { // from class: o.DS1
                @Override // java.lang.Runnable
                public final void run() {
                    BS1.d.a(BS1.d.this);
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z) {
            if (!z) {
                d();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean hasCapability = networkCapabilities.hasCapability(16);
            if (this.a && this.b == hasCapability) {
                if (hasCapability) {
                    d();
                    return;
                }
                return;
            }
            this.a = true;
            this.b = hasCapability;
            c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            c();
        }
    }

    public BS1(Context context, c cVar, AS1 as1) {
        this.a = context.getApplicationContext();
        this.b = cVar;
        this.c = as1;
    }

    public final void e() {
        int d2 = this.c.d(this.a);
        if (this.f != d2) {
            this.f = d2;
            this.b.a(this, d2);
        }
    }

    public AS1 f() {
        return this.c;
    }

    public final void g() {
        if ((this.f & 3) == 0) {
            return;
        }
        e();
    }

    @ES1(24)
    public final void h() {
        d dVar = new d();
        this.g = dVar;
        ((ConnectivityManager) C9542sf.g((ConnectivityManager) this.a.getSystemService("connectivity"))).registerDefaultNetworkCallback(dVar);
    }

    public int i() {
        this.f = this.c.d(this.a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.c.n()) {
            if (TD2.a >= 24) {
                h();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.c.f()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.c.k()) {
            if (TD2.a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.c.q()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        b bVar = new b();
        this.e = bVar;
        this.a.registerReceiver(bVar, intentFilter, null, this.d);
        return this.f;
    }

    public void j() {
        this.a.unregisterReceiver((BroadcastReceiver) C9542sf.g(this.e));
        this.e = null;
        if (TD2.a >= 24 && this.g != null) {
            k();
        }
    }

    @ES1(24)
    public final void k() {
        ((ConnectivityManager) C9542sf.g((ConnectivityManager) this.a.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) C9542sf.g(this.g));
        this.g = null;
    }
}
