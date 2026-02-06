package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import o.InterfaceC5670cr1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhd<V> extends FutureTask<V> implements Comparable<zzhd<V>> {
    public final long X;
    public final boolean Y;
    public final /* synthetic */ zzgy Y0;
    public final String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhd(zzgy zzgyVar, Runnable runnable, boolean z, String str) {
        super(com.google.android.gms.internal.measurement.zzcl.a().f0(runnable), null);
        AtomicLong atomicLong;
        this.Y0 = zzgyVar;
        Preconditions.r(str);
        atomicLong = zzgy.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.X = andIncrement;
        this.Z = str;
        this.Y = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzgyVar.j().G().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@InterfaceC5670cr1 Object obj) {
        zzhd zzhdVar = (zzhd) obj;
        boolean z = this.Y;
        if (z != zzhdVar.Y) {
            if (!z) {
                return 1;
            }
            return -1;
        }
        long j = this.X;
        long j2 = zzhdVar.X;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.Y0.j().I().b("Two tasks share the same index. index", Long.valueOf(this.X));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.Y0.j().G().b(this.Z, th);
        if ((th instanceof zzhb) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhd(zzgy zzgyVar, Callable<V> callable, boolean z, String str) {
        super(com.google.android.gms.internal.measurement.zzcl.a().a(callable));
        AtomicLong atomicLong;
        this.Y0 = zzgyVar;
        Preconditions.r(str);
        atomicLong = zzgy.l;
        long andIncrement = atomicLong.getAndIncrement();
        this.X = andIncrement;
        this.Z = str;
        this.Y = z;
        if (andIncrement == Long.MAX_VALUE) {
            zzgyVar.j().G().a("Tasks index overflow");
        }
    }
}
