package com.google.android.gms.stats;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import o.InterfaceC3561Ln2;
import o.InterfaceC5670cr1;
import o.InterfaceC8710pF0;

@ShowFirstParty
@InterfaceC3561Ln2
@KeepForSdk
/* loaded from: classes3.dex */
public class WakeLock {
    public static final long r = TimeUnit.DAYS.toMillis(366);
    public static volatile ScheduledExecutorService s = null;
    public static final Object t = new Object();
    public static volatile zzd u = new zzb();
    public final Object a;
    @InterfaceC8710pF0("acquireReleaseLock")
    public final PowerManager.WakeLock b;
    @InterfaceC8710pF0("acquireReleaseLock")
    public int c;
    @InterfaceC8710pF0("acquireReleaseLock")
    public Future<?> d;
    @InterfaceC8710pF0("acquireReleaseLock")
    public long e;
    @InterfaceC8710pF0("acquireReleaseLock")
    public final Set<zze> f;
    @InterfaceC8710pF0("acquireReleaseLock")
    public boolean g;
    @InterfaceC8710pF0("acquireReleaseLock")
    public int h;
    @InterfaceC8710pF0("acquireReleaseLock")
    public com.google.android.gms.internal.stats.zzb i;
    public Clock j;
    public WorkSource k;
    public final String l;
    public final String m;
    public final Context n;
    @InterfaceC8710pF0("acquireReleaseLock")

    /* renamed from: o  reason: collision with root package name */
    public final Map<String, zzc> f318o;
    public AtomicInteger p;
    public final ScheduledExecutorService q;

    @KeepForSdk
    public WakeLock(@InterfaceC5670cr1 Context context, int i, @InterfaceC5670cr1 String str) {
        String str2;
        String packageName = context.getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.j = DefaultClock.d();
        this.f318o = new HashMap();
        this.p = new AtomicInteger(0);
        Preconditions.s(context, "WakeLock: context must not be null");
        Preconditions.m(str, "WakeLock: wakeLockName must not be empty");
        this.n = context.getApplicationContext();
        this.m = str;
        this.i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.l = str2;
        } else {
            this.l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i, str);
            this.b = newWakeLock;
            if (WorkSourceUtil.g(context)) {
                WorkSource b = WorkSourceUtil.b(context, Strings.b(packageName) ? context.getPackageName() : packageName);
                this.k = b;
                if (b != null) {
                    i(newWakeLock, b);
                }
            }
            ScheduledExecutorService scheduledExecutorService = s;
            if (scheduledExecutorService == null) {
                synchronized (t) {
                    try {
                        scheduledExecutorService = s;
                        if (scheduledExecutorService == null) {
                            zzh.a();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            s = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.q = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    public static /* synthetic */ void e(@InterfaceC5670cr1 WakeLock wakeLock) {
        synchronized (wakeLock.a) {
            try {
                if (!wakeLock.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(wakeLock.l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                wakeLock.g();
                if (!wakeLock.b()) {
                    return;
                }
                wakeLock.c = 1;
                wakeLock.h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            Log.wtf("WakeLock", e.toString());
        }
    }

    @KeepForSdk
    public void a(long j) {
        this.p.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, r), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.a) {
            try {
                if (!b()) {
                    this.i = com.google.android.gms.internal.stats.zzb.a(false, null);
                    this.b.acquire();
                    this.j.b();
                }
                this.c++;
                this.h++;
                f(null);
                zzc zzcVar = this.f318o.get(null);
                if (zzcVar == null) {
                    zzcVar = new zzc(null);
                    this.f318o.put(null, zzcVar);
                }
                zzcVar.a++;
                long b = this.j.b();
                if (Long.MAX_VALUE - b > max) {
                    j2 = b + max;
                }
                if (j2 > this.e) {
                    this.e = j2;
                    Future<?> future = this.d;
                    if (future != null) {
                        future.cancel(false);
                    }
                    this.d = this.q.schedule(new Runnable() { // from class: com.google.android.gms.stats.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            WakeLock.e(WakeLock.this);
                        }
                    }, max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public boolean b() {
        boolean z;
        synchronized (this.a) {
            if (this.c > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @KeepForSdk
    public void c() {
        if (this.p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.l).concat(" release without a matched acquire!"));
        }
        synchronized (this.a) {
            try {
                f(null);
                if (this.f318o.containsKey(null)) {
                    zzc zzcVar = this.f318o.get(null);
                    if (zzcVar != null) {
                        int i = zzcVar.a - 1;
                        zzcVar.a = i;
                        if (i == 0) {
                            this.f318o.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.l).concat(" counter does not exist"));
                }
                h(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @KeepForSdk
    public void d(boolean z) {
        synchronized (this.a) {
            this.g = z;
        }
    }

    @InterfaceC8710pF0("acquireReleaseLock")
    public final String f(String str) {
        if (this.g) {
            TextUtils.isEmpty(null);
        }
        return null;
    }

    @InterfaceC8710pF0("acquireReleaseLock")
    public final void g() {
        if (!this.f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f);
            this.f.clear();
            if (arrayList.size() <= 0) {
                return;
            }
            zze zzeVar = (zze) arrayList.get(0);
            throw null;
        }
    }

    public final void h(int i) {
        synchronized (this.a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.g) {
                    int i2 = this.c - 1;
                    this.c = i2;
                    if (i2 > 0) {
                        return;
                    }
                } else {
                    this.c = 0;
                }
                g();
                for (zzc zzcVar : this.f318o.values()) {
                    zzcVar.a = 0;
                }
                this.f318o.clear();
                Future<?> future = this.d;
                if (future != null) {
                    future.cancel(false);
                    this.d = null;
                    this.e = 0L;
                }
                this.h = 0;
                if (this.b.isHeld()) {
                    try {
                        this.b.release();
                        if (this.i != null) {
                            this.i = null;
                        }
                    } catch (RuntimeException e) {
                        if (e.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.l).concat(" failed to release!"), e);
                            if (this.i != null) {
                                this.i = null;
                            }
                        } else {
                            throw e;
                        }
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.l).concat(" should be held!"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
