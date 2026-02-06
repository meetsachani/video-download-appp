package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.Executor;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;
import o.InterfaceC5670cr1;

@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GmsClientSupervisor {
    public static final Object a = new Object();
    @InterfaceC11300zs1
    public static zzs b = null;
    @InterfaceC11300zs1
    @InterfaceC5056aJ2
    public static HandlerThread c = null;
    @InterfaceC11300zs1
    public static Executor d = null;
    public static boolean e = false;

    @KeepForSdk
    public static int d() {
        return 4225;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static GmsClientSupervisor e(@InterfaceC5670cr1 Context context) {
        Looper mainLooper;
        synchronized (a) {
            try {
                if (b == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (e) {
                        mainLooper = f().getLooper();
                    } else {
                        mainLooper = context.getMainLooper();
                    }
                    b = new zzs(applicationContext, mainLooper, d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static HandlerThread f() {
        synchronized (a) {
            try {
                HandlerThread handlerThread = c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                c = handlerThread2;
                handlerThread2.start();
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @InterfaceC5670cr1
    @KeepForSdk
    public static HandlerThread g(int i) {
        synchronized (a) {
            try {
                HandlerThread handlerThread = c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i);
                c = handlerThread2;
                handlerThread2.start();
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public static void h(@InterfaceC11300zs1 Executor executor) {
        synchronized (a) {
            try {
                zzs zzsVar = b;
                if (zzsVar != null) {
                    zzsVar.t(executor);
                }
                d = executor;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public static void i() {
        synchronized (a) {
            try {
                zzs zzsVar = b;
                if (zzsVar != null && !e) {
                    zzsVar.u(f().getLooper());
                }
                e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public boolean a(@InterfaceC5670cr1 ComponentName componentName, @InterfaceC5670cr1 ServiceConnection serviceConnection, @InterfaceC5670cr1 String str) {
        return n(new zzo(componentName, 4225), serviceConnection, str, null);
    }

    @KeepForSdk
    public boolean b(@InterfaceC5670cr1 ComponentName componentName, @InterfaceC5670cr1 ServiceConnection serviceConnection, @InterfaceC5670cr1 String str, @InterfaceC11300zs1 Executor executor) {
        return n(new zzo(componentName, 4225), serviceConnection, str, executor);
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public boolean c(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 ServiceConnection serviceConnection, @InterfaceC5670cr1 String str2) {
        return n(new zzo(str, 4225, false), serviceConnection, str2, null);
    }

    @KeepForSdk
    public void j(@InterfaceC5670cr1 ComponentName componentName, @InterfaceC5670cr1 ServiceConnection serviceConnection, @InterfaceC5670cr1 String str) {
        l(new zzo(componentName, 4225), serviceConnection, str);
    }

    @KeepForSdk
    public void k(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 ServiceConnection serviceConnection, @InterfaceC5670cr1 String str2) {
        l(new zzo(str, 4225, false), serviceConnection, str2);
    }

    public abstract void l(zzo zzoVar, ServiceConnection serviceConnection, String str);

    public final void m(@InterfaceC5670cr1 String str, @InterfaceC5670cr1 String str2, int i, @InterfaceC5670cr1 ServiceConnection serviceConnection, @InterfaceC5670cr1 String str3, boolean z) {
        l(new zzo(str, str2, 4225, z), serviceConnection, str3);
    }

    public abstract boolean n(zzo zzoVar, ServiceConnection serviceConnection, String str, @InterfaceC11300zs1 Executor executor);
}
