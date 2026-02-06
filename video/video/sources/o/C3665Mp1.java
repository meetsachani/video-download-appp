package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* renamed from: o.Mp1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3665Mp1 extends TK<C3568Lp1> {
    public static final String j = AbstractC6949i41.f("NetworkStateTracker");
    public final ConnectivityManager g;
    public b h;
    public a i;

    /* renamed from: o.Mp1$a */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                AbstractC6949i41.c().a(C3665Mp1.j, "Network broadcast received", new Throwable[0]);
                C3665Mp1 c3665Mp1 = C3665Mp1.this;
                c3665Mp1.d(c3665Mp1.g());
            }
        }
    }

    /* renamed from: o.Mp1$b */
    /* loaded from: classes.dex */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            AbstractC6949i41.c().a(C3665Mp1.j, String.format("Network capabilities changed: %s", capabilities), new Throwable[0]);
            C3665Mp1 c3665Mp1 = C3665Mp1.this;
            c3665Mp1.d(c3665Mp1.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC6949i41.c().a(C3665Mp1.j, "Network connection lost", new Throwable[0]);
            C3665Mp1 c3665Mp1 = C3665Mp1.this;
            c3665Mp1.d(c3665Mp1.g());
        }
    }

    public C3665Mp1(Context context, InterfaceC3748Nl2 taskExecutor) {
        super(context, taskExecutor);
        this.g = (ConnectivityManager) this.b.getSystemService("connectivity");
        if (j()) {
            this.h = new b();
        } else {
            this.i = new a();
        }
    }

    public static boolean j() {
        return true;
    }

    @Override // o.TK
    public void e() {
        if (j()) {
            try {
                AbstractC6949i41.c().a(j, "Registering network callback", new Throwable[0]);
                this.g.registerDefaultNetworkCallback(this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                AbstractC6949i41.c().b(j, "Received exception while registering network callback", e);
                return;
            }
        }
        AbstractC6949i41.c().a(j, "Registering broadcast receiver", new Throwable[0]);
        this.b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // o.TK
    public void f() {
        if (j()) {
            try {
                AbstractC6949i41.c().a(j, "Unregistering network callback", new Throwable[0]);
                this.g.unregisterNetworkCallback(this.h);
                return;
            } catch (IllegalArgumentException | SecurityException e) {
                AbstractC6949i41.c().b(j, "Received exception while unregistering network callback", e);
                return;
            }
        }
        AbstractC6949i41.c().a(j, "Unregistering broadcast receiver", new Throwable[0]);
        this.b.unregisterReceiver(this.i);
    }

    public C3568Lp1 g() {
        boolean z;
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean z2 = false;
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z = true;
        } else {
            z = false;
        }
        boolean i = i();
        boolean c = C5785dK.c(this.g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z2 = true;
        }
        return new C3568Lp1(z, i, c, z2);
    }

    @Override // o.TK
    /* renamed from: h */
    public C3568Lp1 b() {
        return g();
    }

    public boolean i() {
        try {
            NetworkCapabilities networkCapabilities = this.g.getNetworkCapabilities(this.g.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e) {
            AbstractC6949i41.c().b(j, "Unable to validate active network", e);
            return false;
        }
    }
}
