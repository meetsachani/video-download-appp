package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzarm;
import com.google.android.gms.internal.ads.zzaro;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzavg;
import com.google.android.gms.internal.ads.zzavi;
import com.google.android.gms.internal.ads.zzavk;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcaa;
import com.google.android.gms.internal.ads.zzfnx;
import com.google.android.gms.internal.ads.zzfox;
import com.google.android.gms.internal.ads.zzfpr;
import com.google.android.gms.internal.ads.zzgcy;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC11300zs1;
import o.InterfaceC5056aJ2;

/* loaded from: classes2.dex */
public final class zzk implements Runnable, zzavg {
    public static final long k1 = System.currentTimeMillis();
    @InterfaceC5056aJ2
    public boolean Y0;
    public final boolean Z0;
    public final boolean a1;
    public final Executor b1;
    public final zzfnx c1;
    public Context d1;
    public final Context e1;
    public VersionInfoParcel f1;
    public final VersionInfoParcel g1;
    public final boolean h1;
    public int j1;
    public final List X = new Vector();
    public final AtomicReference Y = new AtomicReference();
    public final AtomicReference Z = new AtomicReference();
    public final CountDownLatch i1 = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.d1 = context;
        this.e1 = context;
        this.f1 = versionInfoParcel;
        this.g1 = versionInfoParcel;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.b1 = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzbd.c().b(zzbcv.H2)).booleanValue();
        this.h1 = booleanValue;
        this.c1 = zzfnx.a(context, newCachedThreadPool, booleanValue);
        this.Z0 = ((Boolean) zzbd.c().b(zzbcv.E2)).booleanValue();
        this.a1 = ((Boolean) zzbd.c().b(zzbcv.I2)).booleanValue();
        if (((Boolean) zzbd.c().b(zzbcv.G2)).booleanValue()) {
            this.j1 = 2;
        } else {
            this.j1 = 1;
        }
        if (!((Boolean) zzbd.c().b(zzbcv.K3)).booleanValue()) {
            this.Y0 = m();
        }
        if (((Boolean) zzbd.c().b(zzbcv.E3)).booleanValue()) {
            zzcaa.a.execute(this);
            return;
        }
        zzbb.b();
        if (com.google.android.gms.ads.internal.util.client.zzf.A()) {
            zzcaa.a.execute(this);
        } else {
            run();
        }
    }

    public static /* synthetic */ void l(zzk zzkVar, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            u(zzkVar.e1, zzkVar.g1, z, zzkVar.h1).p();
        } catch (NullPointerException e) {
            zzkVar.c1.c(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    public static final Context t(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            return context;
        }
        return applicationContext;
    }

    public static final zzavd u(Context context, VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        zzarm s2 = zzaro.s2();
        s2.Y1(z);
        s2.Z1(versionInfoParcel.X);
        return zzavd.j(t(context), (zzaro) s2.V1(), z2);
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String a(Context context) {
        return k(context, null);
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final void b(View view) {
        zzavg q = q();
        if (q != null) {
            q.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String c(final Context context) {
        try {
            return (String) zzgcy.j(new Callable() { // from class: com.google.android.gms.ads.internal.zzh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzk.this.k(context, null);
                }
            }, this.b1).get(((Integer) zzbd.c().b(zzbcv.Y2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzauz.a(context, this.g1.X, k1, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final void d(int i, int i2, int i3) {
        zzavg q = q();
        if (q != null) {
            r();
            q.d(i, i2, i3);
            return;
        }
        this.X.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final void e(MotionEvent motionEvent) {
        zzavg q = q();
        if (q != null) {
            r();
            q.e(motionEvent);
            return;
        }
        this.X.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final void f(StackTraceElement[] stackTraceElementArr) {
        zzavg q;
        zzavg q2;
        if (((Boolean) zzbd.c().b(zzbcv.e3)).booleanValue()) {
            if (this.i1.getCount() == 0 && (q2 = q()) != null) {
                q2.f(stackTraceElementArr);
            }
        } else if (n() && (q = q()) != null) {
            q.f(stackTraceElementArr);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String g(Context context, String str, View view) {
        return h(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String h(Context context, String str, View view, Activity activity) {
        if (n()) {
            zzavg q = q();
            if (((Boolean) zzbd.c().b(zzbcv.Wa)).booleanValue()) {
                zzv.v();
                com.google.android.gms.ads.internal.util.zzs.k(view, 4, null);
            }
            if (q != null) {
                r();
                return q.h(t(context), str, view, activity);
            }
            return "";
        }
        return "";
    }

    @Override // com.google.android.gms.internal.ads.zzavg
    public final String i(Context context, View view, Activity activity) {
        if (((Boolean) zzbd.c().b(zzbcv.Va)).booleanValue()) {
            if (n()) {
                zzavg q = q();
                if (((Boolean) zzbd.c().b(zzbcv.Wa)).booleanValue()) {
                    zzv.v();
                    com.google.android.gms.ads.internal.util.zzs.k(view, 2, null);
                }
                if (q != null) {
                    return q.i(context, view, activity);
                }
                return "";
            }
            return "";
        }
        zzavg q2 = q();
        if (((Boolean) zzbd.c().b(zzbcv.Wa)).booleanValue()) {
            zzv.v();
            com.google.android.gms.ads.internal.util.zzs.k(view, 2, null);
        }
        if (q2 != null) {
            return q2.i(context, view, activity);
        }
        return "";
    }

    public final String k(Context context, byte[] bArr) {
        zzavg q;
        if (n() && (q = q()) != null) {
            r();
            return q.a(t(context));
        }
        return "";
    }

    public final boolean m() {
        Context context = this.d1;
        zzj zzjVar = new zzj(this);
        zzfnx zzfnxVar = this.c1;
        return new zzfpr(this.d1, zzfox.b(context, zzfnxVar), zzjVar, ((Boolean) zzbd.c().b(zzbcv.F2)).booleanValue()).d(1);
    }

    public final boolean n() {
        try {
            this.i1.await();
            return true;
        } catch (InterruptedException e) {
            int i = com.google.android.gms.ads.internal.util.zze.b;
            com.google.android.gms.ads.internal.util.client.zzo.h("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    public final int o() {
        if (!this.Z0 || this.Y0) {
            return this.j1;
        }
        return 1;
    }

    public final int p() {
        return this.j1;
    }

    @InterfaceC11300zs1
    public final zzavg q() {
        if (o() == 2) {
            return (zzavg) this.Z.get();
        }
        return (zzavg) this.Y.get();
    }

    public final void r() {
        List<Object[]> list = this.X;
        zzavg q = q();
        if (!list.isEmpty() && q != null) {
            for (Object[] objArr : list) {
                int length = objArr.length;
                if (length == 1) {
                    q.e((MotionEvent) objArr[0]);
                } else if (length == 3) {
                    q.d(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
                }
            }
            list.clear();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzbd.c().b(zzbcv.K3)).booleanValue()) {
                this.Y0 = m();
            }
            boolean z = this.f1.Y0;
            final boolean z2 = false;
            if (!((Boolean) zzbd.c().b(zzbcv.j1)).booleanValue() && z) {
                z2 = true;
            }
            if (o() == 1) {
                s(z2);
                if (this.j1 == 2) {
                    this.b1.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzk.l(zzk.this, z2);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzavd u = u(this.d1, this.f1, z2, this.h1);
                    this.Z.set(u);
                    if (this.a1 && !u.r()) {
                        this.j1 = 1;
                        s(z2);
                    }
                } catch (NullPointerException e) {
                    this.j1 = 1;
                    s(z2);
                    this.c1.c(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
            this.i1.countDown();
            this.d1 = null;
            this.f1 = null;
        } catch (Throwable th) {
            this.i1.countDown();
            this.d1 = null;
            this.f1 = null;
            throw th;
        }
    }

    public final void s(boolean z) {
        String str = this.f1.X;
        Context t = t(this.d1);
        zzarm s2 = zzaro.s2();
        s2.Y1(z);
        s2.Z1(str);
        int i = zzavk.C1;
        this.Y.set(zzavk.x(t, new zzavi((zzaro) s2.V1())));
    }
}
