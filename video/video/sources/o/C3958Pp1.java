package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

@Deprecated
/* renamed from: o.Pp1 */
/* loaded from: classes2.dex */
public final class C3958Pp1 {
    @InterfaceC11300zs1
    public static C3958Pp1 e;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList<WeakReference<c>> b = new CopyOnWriteArrayList<>();
    public final Object c = new Object();
    @InterfaceC8710pF0("networkTypeLock")
    public int d = 0;

    @ES1(31)
    /* renamed from: o.Pp1$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: o.Pp1$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            public final C3958Pp1 a;

            public a(C3958Pp1 c3958Pp1) {
                this.a = c3958Pp1;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                boolean z;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                int i = 5;
                if (overrideNetworkType != 3 && overrideNetworkType != 4 && overrideNetworkType != 5) {
                    z = false;
                } else {
                    z = true;
                }
                C3958Pp1 c3958Pp1 = this.a;
                if (z) {
                    i = 10;
                }
                c3958Pp1.k(i);
            }
        }

        public static void a(Context context, C3958Pp1 c3958Pp1) {
            Executor mainExecutor;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C9542sf.g((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(c3958Pp1);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                c3958Pp1.k(5);
            }
        }
    }

    /* renamed from: o.Pp1$c */
    /* loaded from: classes2.dex */
    public interface c {
        void a(int i);
    }

    /* renamed from: o.Pp1$d */
    /* loaded from: classes2.dex */
    public final class d extends BroadcastReceiver {
        public d() {
            C3958Pp1.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int g = C3958Pp1.g(context);
            if (TD2.a < 31 || g != 5) {
                C3958Pp1.this.k(g);
            } else {
                b.a(context, C3958Pp1.this);
            }
        }
    }

    public C3958Pp1(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static /* synthetic */ void a(C3958Pp1 c3958Pp1, c cVar) {
        cVar.a(c3958Pp1.f());
    }

    public static synchronized C3958Pp1 d(Context context) {
        C3958Pp1 c3958Pp1;
        synchronized (C3958Pp1.class) {
            try {
                if (e == null) {
                    e = new C3958Pp1(context);
                }
                c3958Pp1 = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3958Pp1;
    }

    public static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                if (TD2.a >= 29) {
                    return 9;
                }
                return 0;
        }
    }

    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        if (type != 4 && type != 5) {
                            if (type == 6) {
                                return 5;
                            }
                            if (type != 9) {
                                return 8;
                            }
                            return 7;
                        }
                    } else {
                        return 2;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    @InterfaceC5056aJ2
    public static synchronized void j() {
        synchronized (C3958Pp1.class) {
            e = null;
        }
    }

    public int f() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public void h(final c cVar) {
        i();
        this.b.add(new WeakReference<>(cVar));
        this.a.post(new Runnable() { // from class: o.Op1
            {
                C3958Pp1.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3958Pp1.a(C3958Pp1.this, cVar);
            }
        });
    }

    public final void i() {
        Iterator<WeakReference<c>> it = this.b.iterator();
        while (it.hasNext()) {
            WeakReference<c> next = it.next();
            if (next.get() == null) {
                this.b.remove(next);
            }
        }
    }

    public final void k(int i) {
        synchronized (this.c) {
            try {
                if (this.d == i) {
                    return;
                }
                this.d = i;
                Iterator<WeakReference<c>> it = this.b.iterator();
                while (it.hasNext()) {
                    WeakReference<c> next = it.next();
                    c cVar = next.get();
                    if (cVar != null) {
                        cVar.a(i);
                    } else {
                        this.b.remove(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
