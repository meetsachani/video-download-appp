package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC11300zs1;
import o.InterfaceC5670cr1;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public abstract class zzfkt {
    public final ClientApi a;
    public final Context b;
    public final int c;
    public final zzbpl d;
    public com.google.android.gms.ads.internal.client.zzfp e;
    public final com.google.android.gms.ads.internal.client.zzce g;
    public final Queue h;
    public final zzfjx i;
    public final ScheduledExecutorService k;
    public zzfkc n;

    /* renamed from: o  reason: collision with root package name */
    public final Clock f283o;
    public final zzfkk p;
    public final AtomicBoolean f = new AtomicBoolean(true);
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final AtomicBoolean l = new AtomicBoolean(true);
    public final AtomicBoolean m = new AtomicBoolean(false);

    public zzfkt(ClientApi clientApi, Context context, int i, zzbpl zzbplVar, @InterfaceC5670cr1 com.google.android.gms.ads.internal.client.zzfp zzfpVar, @InterfaceC5670cr1 com.google.android.gms.ads.internal.client.zzce zzceVar, @InterfaceC5670cr1 ScheduledExecutorService scheduledExecutorService, zzfjx zzfjxVar, Clock clock) {
        this.a = clientApi;
        this.b = context;
        this.c = i;
        this.d = zzbplVar;
        this.e = zzfpVar;
        this.g = zzceVar;
        this.h = new PriorityQueue(Math.max(1, zzfpVar.Y0), new zzfkn(this));
        this.k = scheduledExecutorService;
        this.i = zzfjxVar;
        this.f283o = clock;
        this.p = new zzfkk(new zzfki(zzfpVar.X, AdFormat.e(this.e.Y)), null);
    }

    @InterfaceC11300zs1
    public static final String i(@InterfaceC11300zs1 com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        if (!(zzdxVar instanceof zzcvm)) {
            return null;
        }
        return ((zzcvm) zzdxVar).l();
    }

    public static /* bridge */ /* synthetic */ double l(zzfkt zzfktVar, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        if (!(zzdxVar instanceof zzcvm)) {
            return 0.0d;
        }
        return ((zzcvm) zzdxVar).X7();
    }

    public final void A() {
        this.h.clear();
    }

    public final synchronized void B() {
        InterfaceFutureC8411o11 k;
        try {
            g();
            e();
            AtomicBoolean atomicBoolean = this.j;
            if (!atomicBoolean.get() && this.f.get() && this.h.size() < this.e.Y0) {
                atomicBoolean.set(true);
                Activity a = com.google.android.gms.ads.internal.zzv.f().a();
                if (a == null) {
                    String valueOf = String.valueOf(this.e.X);
                    int i = com.google.android.gms.ads.internal.util.zze.b;
                    com.google.android.gms.ads.internal.util.client.zzo.g("Empty activity context at preloading: ".concat(valueOf));
                    k = k(this.b);
                } else {
                    k = k(a);
                }
                zzgcy.r(k, new zzfkm(this), this.k);
            }
        } finally {
        }
    }

    public final synchronized void C(int i) {
        boolean z;
        if (i >= 5) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.a(z);
        this.i.d(i);
    }

    public final synchronized void D() {
        this.f.set(true);
        this.l.set(true);
        this.k.submit(new zzfko(this));
    }

    public final void E(zzfkc zzfkcVar) {
        this.n = zzfkcVar;
    }

    public final void F() {
        this.f.set(false);
        this.l.set(false);
    }

    public final void G(int i) {
        boolean z;
        int i2;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.a(z);
        AdFormat e = AdFormat.e(this.e.Y);
        int i3 = this.e.Y0;
        synchronized (this) {
            try {
                com.google.android.gms.ads.internal.client.zzfp zzfpVar = this.e;
                String str = zzfpVar.X;
                int i4 = zzfpVar.Y;
                com.google.android.gms.ads.internal.client.zzm zzmVar = zzfpVar.Z;
                if (i > 0) {
                    i2 = i;
                } else {
                    i2 = zzfpVar.Y0;
                }
                this.e = new com.google.android.gms.ads.internal.client.zzfp(str, i4, zzmVar, i2);
                Queue queue = this.h;
                if (queue.size() > i) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.c().b(zzbcv.u)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i5 = 0; i5 < i; i5++) {
                            zzfkl zzfklVar = (zzfkl) queue.poll();
                            if (zzfklVar != null) {
                                arrayList.add(zzfklVar);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfkc zzfkcVar = this.n;
        if (zzfkcVar != null && e != null) {
            zzfkcVar.a(i3, i, this.f283o.a(), new zzfkk(new zzfki(this.e.X, e), null));
        }
    }

    public final synchronized boolean H() {
        g();
        if (!this.h.isEmpty()) {
            return true;
        }
        return false;
    }

    public final synchronized void I(Object obj) {
        Clock clock = this.f283o;
        zzfkl zzfklVar = new zzfkl(obj, clock);
        this.h.add(zzfklVar);
        com.google.android.gms.ads.internal.client.zzdx j = j(obj);
        long a = clock.a();
        com.google.android.gms.ads.internal.util.zzs.l.post(new zzfkp(this));
        zzfkq zzfkqVar = new zzfkq(this, a, j);
        ScheduledExecutorService scheduledExecutorService = this.k;
        scheduledExecutorService.execute(zzfkqVar);
        scheduledExecutorService.schedule(new zzfko(this), zzfklVar.a(), TimeUnit.MILLISECONDS);
    }

    public final synchronized void a(Throwable th) {
        try {
            this.j.set(false);
            if ((th instanceof zzfjt) && ((zzfjt) th).a() == 0) {
                throw null;
            }
            h(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Object obj) {
        try {
            boolean z = false;
            this.j.set(false);
            if (obj != null) {
                this.i.c();
                this.m.set(true);
                I(obj);
            }
            if (obj == null) {
                z = true;
            }
            h(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (this.l.get()) {
            try {
                this.g.S2(this.e);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Failed to call onAdsAvailable");
            }
        }
    }

    public final synchronized void d() {
        if (this.l.get()) {
            try {
                this.g.z1(this.e);
            } catch (RemoteException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.b;
                com.google.android.gms.ads.internal.util.client.zzo.g("Failed to call onAdsExhausted");
            }
        }
    }

    public final synchronized void e() {
        AtomicBoolean atomicBoolean = this.m;
        if (atomicBoolean.get() && this.h.isEmpty()) {
            atomicBoolean.set(false);
            com.google.android.gms.ads.internal.util.zzs.l.post(new zzfkr(this));
            this.k.execute(new zzfks(this));
        }
    }

    public final synchronized void f(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.j.set(false);
        int i = zzeVar.X;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            h(true);
            return;
        }
        com.google.android.gms.ads.internal.client.zzfp zzfpVar = this.e;
        String str = "Preloading " + zzfpVar.Y + ", for adUnitId:" + zzfpVar.X + ", Ad load failed. Stop preloading due to non-retriable error:";
        int i2 = com.google.android.gms.ads.internal.util.zze.b;
        com.google.android.gms.ads.internal.util.client.zzo.f(str);
        this.f.set(false);
    }

    public final synchronized void g() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            if (((zzfkl) it.next()).d()) {
                it.remove();
            }
        }
    }

    public final synchronized void h(boolean z) {
        try {
            zzfjx zzfjxVar = this.i;
            if (!zzfjxVar.e()) {
                if (z) {
                    zzfjxVar.b();
                }
                this.k.schedule(new zzfko(this), zzfjxVar.a(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC11300zs1
    public abstract com.google.android.gms.ads.internal.client.zzdx j(Object obj);

    public abstract InterfaceFutureC8411o11 k(Context context);

    public final synchronized int m() {
        return this.h.size();
    }

    public final synchronized zzfkt p() {
        this.k.submit(new zzfko(this));
        return this;
    }

    @InterfaceC11300zs1
    public final synchronized Object r() {
        zzfkl zzfklVar = (zzfkl) this.h.peek();
        if (zzfklVar == null) {
            return null;
        }
        return zzfklVar.c();
    }

    @InterfaceC11300zs1
    public final synchronized Object s() {
        boolean z;
        try {
            this.i.c();
            Queue queue = this.h;
            zzfkl zzfklVar = (zzfkl) queue.poll();
            if (zzfklVar != null) {
                z = true;
            } else {
                z = false;
            }
            this.m.set(z);
            if (zzfklVar != null) {
                if (!queue.isEmpty()) {
                    zzfkl zzfklVar2 = (zzfkl) queue.peek();
                    AdFormat e = AdFormat.e(this.e.Y);
                    String i = i(j(zzfklVar.c()));
                    if (zzfklVar2 != null && e != null && i != null && zzfklVar2.b() < zzfklVar.b()) {
                        this.n.g(this.f283o.a(), this.e.Y0, m(), i, this.p);
                    }
                }
            } else {
                zzfklVar = null;
            }
            B();
            if (zzfklVar == null) {
                return null;
            }
            return zzfklVar.c();
        } catch (Throwable th) {
            throw th;
        }
    }

    @InterfaceC11300zs1
    public final synchronized String u() {
        com.google.android.gms.ads.internal.client.zzdx j;
        Object r = r();
        if (r == null) {
            j = null;
        } else {
            j = j(r);
        }
        return i(j);
    }
}
