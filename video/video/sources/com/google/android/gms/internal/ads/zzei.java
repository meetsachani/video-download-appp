package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceC8710pF0;

/* loaded from: classes2.dex */
public final class zzei {
    @InterfaceC11300zs1
    public static zzei f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    @InterfaceC8710pF0("lock")
    public int d;
    @InterfaceC8710pF0("lock")
    public boolean e;

    public zzei(final Context context) {
        Executor a = zzdd.a();
        this.a = a;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeb
            @Override // java.lang.Runnable
            public final void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new zzeg(zzei.this, null), intentFilter);
            }
        });
    }

    public static synchronized zzei b(Context context) {
        zzei zzeiVar;
        synchronized (zzei.class) {
            try {
                if (f == null) {
                    f = new zzei(context);
                }
                zzeiVar = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzeiVar;
    }

    public static /* synthetic */ void d(zzei zzeiVar, Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i = type != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
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
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            if (Build.VERSION.SDK_INT >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 31 && i == 5) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    zzec zzecVar = new zzec(zzeiVar);
                    telephonyManager.registerTelephonyCallback(zzeiVar.a, zzecVar);
                    telephonyManager.unregisterTelephonyCallback(zzecVar);
                    return;
                }
                throw null;
            } catch (RuntimeException unused2) {
                zzeiVar.h(5);
                return;
            }
        }
        zzeiVar.h(i);
    }

    public final int a() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void f(zzzh zzzhVar, Executor executor) {
        boolean z;
        g();
        zzee zzeeVar = new zzee(this, zzzhVar, executor);
        synchronized (this.c) {
            this.b.add(zzeeVar);
            z = this.e;
        }
        if (z) {
            zzeeVar.b();
        }
    }

    public final void g() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzee zzeeVar = (zzee) it.next();
            if (zzeeVar.c()) {
                copyOnWriteArrayList.remove(zzeeVar);
            }
        }
    }

    public final void h(int i) {
        g();
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((zzee) it.next()).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
