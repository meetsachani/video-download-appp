package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC11300zs1;
import o.JK1;

/* loaded from: classes3.dex */
public final class zzgy extends zzic {
    public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    @InterfaceC11300zs1
    public zzhc c;
    @InterfaceC11300zs1
    public zzhc d;
    public final PriorityBlockingQueue<zzhd<?>> e;
    public final BlockingQueue<zzhd<?>> f;
    public final Thread.UncaughtExceptionHandler g;
    public final Thread.UncaughtExceptionHandler h;
    public final Object i;
    public final Semaphore j;
    public volatile boolean k;

    public zzgy(zzhf zzhfVar) {
        super(zzhfVar);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue<>();
        this.f = new LinkedBlockingQueue();
        this.g = new zzha(this, "Thread death: Uncaught exception on worker thread");
        this.h = new zzha(this, "Thread death: Uncaught exception on network thread");
    }

    public final <V> Future<V> B(Callable<V> callable) throws IllegalStateException {
        o();
        Preconditions.r(callable);
        zzhd<?> zzhdVar = new zzhd<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            zzhdVar.run();
            return zzhdVar;
        }
        y(zzhdVar);
        return zzhdVar;
    }

    public final void D(Runnable runnable) throws IllegalStateException {
        o();
        Preconditions.r(runnable);
        y(new zzhd<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final void G(Runnable runnable) throws IllegalStateException {
        o();
        Preconditions.r(runnable);
        y(new zzhd<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean J() {
        if (Thread.currentThread() == this.c) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Context a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ Clock b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzaf d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzba e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzae f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzfq g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zzgd h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    @JK1
    public final /* bridge */ /* synthetic */ zznd i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzfr j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final void k() {
        if (Thread.currentThread() == this.d) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    @JK1
    public final /* bridge */ /* synthetic */ zzgy l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final void n() {
        if (Thread.currentThread() == this.c) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override // com.google.android.gms.measurement.internal.zzic
    public final boolean s() {
        return false;
    }

    @InterfaceC11300zs1
    public final <T> T v(AtomicReference<T> atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            l().D(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                zzft L = j().L();
                L.a("Interrupted waiting for " + str);
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            zzft L2 = j().L();
            L2.a("Timed out waiting for " + str);
        }
        return t;
    }

    public final <V> Future<V> w(Callable<V> callable) throws IllegalStateException {
        o();
        Preconditions.r(callable);
        zzhd<?> zzhdVar = new zzhd<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.c) {
            if (!this.e.isEmpty()) {
                j().L().a("Callable skipped the worker queue.");
            }
            zzhdVar.run();
            return zzhdVar;
        }
        y(zzhdVar);
        return zzhdVar;
    }

    public final void y(zzhd<?> zzhdVar) {
        synchronized (this.i) {
            try {
                this.e.add(zzhdVar);
                zzhc zzhcVar = this.c;
                if (zzhcVar == null) {
                    zzhc zzhcVar2 = new zzhc(this, "Measurement Worker", this.e);
                    this.c = zzhcVar2;
                    zzhcVar2.setUncaughtExceptionHandler(this.g);
                    this.c.start();
                } else {
                    zzhcVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(Runnable runnable) throws IllegalStateException {
        o();
        Preconditions.r(runnable);
        zzhd<?> zzhdVar = new zzhd<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.i) {
            try {
                this.f.add(zzhdVar);
                zzhc zzhcVar = this.d;
                if (zzhcVar == null) {
                    zzhc zzhcVar2 = new zzhc(this, "Measurement Network", this.f);
                    this.d = zzhcVar2;
                    zzhcVar2.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    zzhcVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
