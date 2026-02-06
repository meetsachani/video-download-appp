package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import o.InterfaceC6027eK;
import o.ZD0;

/* loaded from: classes.dex */
public final class A82 {
    public static volatile A82 d = null;
    public static final String e = "ConnectivityMonitor";
    public final c a;
    public final Set<InterfaceC6027eK.a> b = new HashSet();
    public boolean c;

    /* loaded from: classes.dex */
    public class a implements ZD0.b<ConnectivityManager> {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // o.ZD0.b
        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    /* loaded from: classes.dex */
    public class b implements InterfaceC6027eK.a {
        public b() {
        }

        @Override // o.InterfaceC6027eK.a
        public void a(boolean z) {
            ArrayList<InterfaceC6027eK.a> arrayList;
            SD2.b();
            synchronized (A82.this) {
                arrayList = new ArrayList(A82.this.b);
            }
            for (InterfaceC6027eK.a aVar : arrayList) {
                aVar.a(z);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static final class d implements c {
        public boolean a;
        public final InterfaceC6027eK.a b;
        public final ZD0.b<ConnectivityManager> c;
        public final ConnectivityManager.NetworkCallback d = new a();

        /* loaded from: classes.dex */
        public class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: o.A82$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0149a implements Runnable {
                public final /* synthetic */ boolean X;

                public RunnableC0149a(boolean z) {
                    this.X = z;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.X);
                }
            }

            public a() {
            }

            public void a(boolean z) {
                SD2.b();
                d dVar = d.this;
                boolean z2 = dVar.a;
                dVar.a = z;
                if (z2 != z) {
                    dVar.b.a(z);
                }
            }

            public final void b(boolean z) {
                SD2.z(new RunnableC0149a(z));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        public d(ZD0.b<ConnectivityManager> bVar, InterfaceC6027eK.a aVar) {
            this.c = bVar;
            this.b = aVar;
        }

        @Override // o.A82.c
        public void a() {
            this.c.get().unregisterNetworkCallback(this.d);
        }

        @Override // o.A82.c
        public boolean b() {
            boolean z;
            if (this.c.get().getActiveNetwork() != null) {
                z = true;
            } else {
                z = false;
            }
            this.a = z;
            try {
                this.c.get().registerDefaultNetworkCallback(this.d);
                return true;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements c {
        public static final Executor g = AsyncTask.SERIAL_EXECUTOR;
        public final Context a;
        public final InterfaceC6027eK.a b;
        public final ZD0.b<ConnectivityManager> c;
        public volatile boolean d;
        public volatile boolean e;
        public final BroadcastReceiver f = new a();

        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                e.this.e();
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.d = eVar.c();
                try {
                    e eVar2 = e.this;
                    eVar2.a.registerReceiver(eVar2.f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.e = true;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    e.this.e = false;
                }
            }
        }

        /* loaded from: classes.dex */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!e.this.e) {
                    return;
                }
                e.this.e = false;
                e eVar = e.this;
                eVar.a.unregisterReceiver(eVar.f);
            }
        }

        /* loaded from: classes.dex */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = e.this.d;
                e eVar = e.this;
                eVar.d = eVar.c();
                if (z != e.this.d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.d);
                    }
                    e eVar2 = e.this;
                    eVar2.d(eVar2.d);
                }
            }
        }

        /* renamed from: o.A82$e$e  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0150e implements Runnable {
            public final /* synthetic */ boolean X;

            public RunnableC0150e(boolean z) {
                this.X = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.b.a(this.X);
            }
        }

        public e(Context context, ZD0.b<ConnectivityManager> bVar, InterfaceC6027eK.a aVar) {
            this.a = context.getApplicationContext();
            this.c = bVar;
            this.b = aVar;
        }

        @Override // o.A82.c
        public void a() {
            g.execute(new c());
        }

        @Override // o.A82.c
        public boolean b() {
            g.execute(new b());
            return true;
        }

        public boolean c() {
            try {
                NetworkInfo activeNetworkInfo = this.c.get().getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    return true;
                }
                return false;
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                }
                return true;
            }
        }

        public void d(boolean z) {
            SD2.z(new RunnableC0150e(z));
        }

        public void e() {
            g.execute(new d());
        }
    }

    public A82(Context context) {
        this.a = new d(ZD0.a(new a(context)), new b());
    }

    public static A82 a(Context context) {
        if (d == null) {
            synchronized (A82.class) {
                try {
                    if (d == null) {
                        d = new A82(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public static void e() {
        d = null;
    }

    public final void b() {
        if (!this.c && !this.b.isEmpty()) {
            this.c = this.a.b();
        }
    }

    public final void c() {
        if (this.c && this.b.isEmpty()) {
            this.a.a();
            this.c = false;
        }
    }

    public synchronized void d(InterfaceC6027eK.a aVar) {
        this.b.add(aVar);
        b();
    }

    public synchronized void f(InterfaceC6027eK.a aVar) {
        this.b.remove(aVar);
        c();
    }
}
