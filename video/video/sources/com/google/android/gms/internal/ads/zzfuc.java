package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzfuc {
    public final Context b;
    public final zzfud c;
    public boolean f;
    public final Intent g;
    @InterfaceC11300zs1
    public ServiceConnection i;
    @InterfaceC11300zs1
    public IInterface j;
    public final List e = new ArrayList();
    public final String d = "OverlayDisplayService";
    public final zzfvu a = zzfvy.a(new zzfvu("OverlayDisplayService") { // from class: com.google.android.gms.internal.ads.zzftt
        public final /* synthetic */ String X = "OverlayDisplayService";

        @Override // com.google.android.gms.internal.ads.zzfvu
        public final Object a() {
            HandlerThread handlerThread = new HandlerThread(this.X, 10);
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    });
    public final IBinder.DeathRecipient h = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzftu
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            zzfuc.h(zzfuc.this);
        }
    };

    public zzfuc(Context context, zzfud zzfudVar, String str, Intent intent, zzfth zzfthVar) {
        this.b = context;
        this.c = zzfudVar;
        this.g = intent;
    }

    public static /* bridge */ /* synthetic */ IBinder.DeathRecipient a(zzfuc zzfucVar) {
        return zzfucVar.h;
    }

    public static /* bridge */ /* synthetic */ IInterface b(zzfuc zzfucVar) {
        return zzfucVar.j;
    }

    public static /* bridge */ /* synthetic */ zzfud d(zzfuc zzfucVar) {
        return zzfucVar.c;
    }

    public static /* bridge */ /* synthetic */ List e(zzfuc zzfucVar) {
        return zzfucVar.e;
    }

    public static /* synthetic */ void f(zzfuc zzfucVar, Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            zzfucVar.c.a("error caused by ", e);
        }
    }

    public static /* synthetic */ void g(zzfuc zzfucVar, Runnable runnable) {
        if (zzfucVar.j == null && !zzfucVar.f) {
            zzfucVar.c.c("Initiate binding to the service.", new Object[0]);
            List list = zzfucVar.e;
            synchronized (list) {
                list.add(runnable);
            }
            zzfua zzfuaVar = new zzfua(zzfucVar, null);
            zzfucVar.i = zzfuaVar;
            zzfucVar.f = true;
            if (!zzfucVar.b.bindService(zzfucVar.g, zzfuaVar, 1)) {
                zzfucVar.c.c("Failed to bind to the service.", new Object[0]);
                zzfucVar.f = false;
                List list2 = zzfucVar.e;
                synchronized (list2) {
                    list2.clear();
                }
            }
        } else if (zzfucVar.f) {
            zzfucVar.c.c("Waiting to bind to the service.", new Object[0]);
            List list3 = zzfucVar.e;
            synchronized (list3) {
                list3.add(runnable);
            }
        } else {
            runnable.run();
        }
    }

    public static /* synthetic */ void h(zzfuc zzfucVar) {
        zzfucVar.c.c("%s : Binder has died.", zzfucVar.d);
        List list = zzfucVar.e;
        synchronized (list) {
            list.clear();
        }
    }

    public static /* synthetic */ void i(zzfuc zzfucVar) {
        if (zzfucVar.j != null) {
            zzfucVar.c.c("Unbind from service.", new Object[0]);
            Context context = zzfucVar.b;
            ServiceConnection serviceConnection = zzfucVar.i;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            zzfucVar.f = false;
            zzfucVar.j = null;
            zzfucVar.i = null;
            List list = zzfucVar.e;
            synchronized (list) {
                list.clear();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void j(zzfuc zzfucVar, boolean z) {
        zzfucVar.f = false;
    }

    public static /* bridge */ /* synthetic */ void k(zzfuc zzfucVar, IInterface iInterface) {
        zzfucVar.j = iInterface;
    }

    @InterfaceC11300zs1
    public final IInterface c() {
        return this.j;
    }

    public final void m(final Runnable runnable) {
        o(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftw
            @Override // java.lang.Runnable
            public final void run() {
                zzfuc.g(zzfuc.this, runnable);
            }
        });
    }

    public final void n() {
        o(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftx
            @Override // java.lang.Runnable
            public final void run() {
                zzfuc.i(zzfuc.this);
            }
        });
    }

    public final void o(final Runnable runnable) {
        ((Handler) this.a.a()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftv
            @Override // java.lang.Runnable
            public final void run() {
                zzfuc.f(zzfuc.this, runnable);
            }
        });
    }
}
