package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgbm;
import com.google.android.gms.internal.ads.zzgbn;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C3855Oo;
import o.C4500Ve2;
import o.C6920hx1;
import o.InterfaceFutureC8411o11;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgbn<V> extends zzgec implements InterfaceFutureC8411o11<V> {
    public static final Object Y0 = new Object();
    public static final zzgdh Z0 = new zzgdh(zzgbm.class);
    public static final boolean a1;
    public static final zza b1;
    public volatile Object X;
    public volatile zzgbm.zzd Y;
    public volatile zze Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public abstract class zza {
        public /* synthetic */ zza(zzgbr zzgbrVar) {
        }

        public abstract zzgbm.zzd a(zzgbn zzgbnVar, zzgbm.zzd zzdVar);

        public abstract zze b(zzgbn zzgbnVar, zze zzeVar);

        public abstract void c(zze zzeVar, zze zzeVar2);

        public abstract void d(zze zzeVar, Thread thread);

        public abstract boolean e(zzgbn zzgbnVar, zzgbm.zzd zzdVar, zzgbm.zzd zzdVar2);

        public abstract boolean f(zzgbn zzgbnVar, Object obj, Object obj2);

        public abstract boolean g(zzgbn zzgbnVar, zze zzeVar, zze zzeVar2);
    }

    /* loaded from: classes2.dex */
    final class zzb extends zza {
        public static final AtomicReferenceFieldUpdater<zze, Thread> a = AtomicReferenceFieldUpdater.newUpdater(zze.class, Thread.class, "a");
        public static final AtomicReferenceFieldUpdater<zze, zze> b = AtomicReferenceFieldUpdater.newUpdater(zze.class, zze.class, "b");
        public static final AtomicReferenceFieldUpdater<? super zzgbn<?>, zze> c = AtomicReferenceFieldUpdater.newUpdater(zzgbn.class, zze.class, "Z");
        public static final AtomicReferenceFieldUpdater<? super zzgbn<?>, zzgbm.zzd> d = AtomicReferenceFieldUpdater.newUpdater(zzgbn.class, zzgbm.zzd.class, "Y");
        public static final AtomicReferenceFieldUpdater<? super zzgbn<?>, Object> e = AtomicReferenceFieldUpdater.newUpdater(zzgbn.class, Object.class, "X");

        private zzb() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final zzgbm.zzd a(zzgbn zzgbnVar, zzgbm.zzd zzdVar) {
            return d.getAndSet(zzgbnVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final zze b(zzgbn zzgbnVar, zze zzeVar) {
            return c.getAndSet(zzgbnVar, zzeVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final void c(zze zzeVar, zze zzeVar2) {
            b.lazySet(zzeVar, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final void d(zze zzeVar, Thread thread) {
            a.lazySet(zzeVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final boolean e(zzgbn zzgbnVar, zzgbm.zzd zzdVar, zzgbm.zzd zzdVar2) {
            return zzgbo.a(d, zzgbnVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final boolean f(zzgbn zzgbnVar, Object obj, Object obj2) {
            return zzgbo.a(e, zzgbnVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final boolean g(zzgbn zzgbnVar, zze zzeVar, zze zzeVar2) {
            return zzgbo.a(c, zzgbnVar, zzeVar, zzeVar2);
        }

        public /* synthetic */ zzb(zzgbr zzgbrVar) {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    final class zzc extends zza {
        private zzc() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final zzgbm.zzd a(zzgbn zzgbnVar, zzgbm.zzd zzdVar) {
            zzgbm.zzd zzdVar2;
            synchronized (zzgbnVar) {
                try {
                    zzdVar2 = zzgbnVar.Y;
                    if (zzdVar2 != zzdVar) {
                        zzgbnVar.Y = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final zze b(zzgbn zzgbnVar, zze zzeVar) {
            zze zzeVar2;
            synchronized (zzgbnVar) {
                try {
                    zzeVar2 = zzgbnVar.Z;
                    if (zzeVar2 != zzeVar) {
                        zzgbnVar.Z = zzeVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final void c(zze zzeVar, zze zzeVar2) {
            zzeVar.b = zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final void d(zze zzeVar, Thread thread) {
            zzeVar.a = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final boolean e(zzgbn zzgbnVar, zzgbm.zzd zzdVar, zzgbm.zzd zzdVar2) {
            synchronized (zzgbnVar) {
                try {
                    if (zzgbnVar.Y == zzdVar) {
                        zzgbnVar.Y = zzdVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final boolean f(zzgbn zzgbnVar, Object obj, Object obj2) {
            synchronized (zzgbnVar) {
                try {
                    if (zzgbnVar.X == obj) {
                        zzgbnVar.X = obj2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final boolean g(zzgbn zzgbnVar, zze zzeVar, zze zzeVar2) {
            synchronized (zzgbnVar) {
                try {
                    if (zzgbnVar.Z == zzeVar) {
                        zzgbnVar.Z = zzeVar2;
                        return true;
                    }
                    return false;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ zzc(zzgbr zzgbrVar) {
            super(null);
        }
    }

    /* loaded from: classes2.dex */
    final class zzd extends zza {
        public static final Unsafe a;
        public static final long b;
        public static final long c;
        public static final long d;
        public static final long e;
        public static final long f;
        public static final /* synthetic */ int g = 0;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.ads.zzgbq
                        @Override // java.security.PrivilegedExceptionAction
                        public final Object run() {
                            Field[] declaredFields;
                            int i = zzgbn.zzd.g;
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    c = unsafe.objectFieldOffset(zzgbn.class.getDeclaredField("Z"));
                    b = unsafe.objectFieldOffset(zzgbn.class.getDeclaredField("Y"));
                    d = unsafe.objectFieldOffset(zzgbn.class.getDeclaredField("X"));
                    e = unsafe.objectFieldOffset(zze.class.getDeclaredField("a"));
                    f = unsafe.objectFieldOffset(zze.class.getDeclaredField("b"));
                    a = unsafe;
                } catch (NoSuchFieldException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        private zzd() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final zzgbm.zzd a(zzgbn zzgbnVar, zzgbm.zzd zzdVar) {
            zzgbm.zzd zzdVar2;
            do {
                zzdVar2 = zzgbnVar.Y;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!e(zzgbnVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final zze b(zzgbn zzgbnVar, zze zzeVar) {
            zze zzeVar2;
            do {
                zzeVar2 = zzgbnVar.Z;
                if (zzeVar == zzeVar2) {
                    break;
                }
            } while (!g(zzgbnVar, zzeVar2, zzeVar));
            return zzeVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final void c(zze zzeVar, zze zzeVar2) {
            a.putObject(zzeVar, f, zzeVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final void d(zze zzeVar, Thread thread) {
            a.putObject(zzeVar, e, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final boolean e(zzgbn zzgbnVar, zzgbm.zzd zzdVar, zzgbm.zzd zzdVar2) {
            return zzgbp.a(a, zzgbnVar, b, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final boolean f(zzgbn zzgbnVar, Object obj, Object obj2) {
            return zzgbp.a(a, zzgbnVar, d, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgbn.zza
        public final boolean g(zzgbn zzgbnVar, zze zzeVar, zze zzeVar2) {
            return zzgbp.a(a, zzgbnVar, c, zzeVar, zzeVar2);
        }

        public /* synthetic */ zzd(zzgbr zzgbrVar) {
            super(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zze {
        public static final zze c = new zze(false);
        public volatile Thread a;
        public volatile zze b;

        public zze(boolean z) {
        }

        public zze() {
            zzgbn.f(this, Thread.currentThread());
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzcVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", C3855Oo.a));
        } catch (SecurityException unused) {
            z = false;
        }
        a1 = z;
        String property = System.getProperty("java.runtime.name", "");
        if (property != null && !property.contains("Android")) {
            try {
                zzcVar = new zzb(null);
            } catch (NoClassDefFoundError unused2) {
                zzcVar = new zzc(null);
            }
        } else {
            try {
                zzcVar = new zzd(null);
            } catch (Error | Exception e) {
                try {
                    zzcVar = new zzb(null);
                    th = null;
                    th2 = e;
                } catch (Error | Exception e2) {
                    th = e2;
                    th2 = e;
                    zzcVar = new zzc(null);
                }
            }
        }
        th = null;
        th2 = null;
        b1 = zzcVar;
        if (th != null) {
            zzgdh zzgdhVar = Z0;
            Logger a = zzgdhVar.a();
            Level level = Level.SEVERE;
            a.logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzgdhVar.a().logp(level, "com.google.common.util.concurrent.AbstractFutureState", "<clinit>", "AtomicReferenceFieldUpdaterAtomicHelper is broken!", th);
        }
    }

    public static /* synthetic */ void f(zze zzeVar, Thread thread) {
        b1.d(zzeVar, thread);
    }

    public static boolean i(zzgbn zzgbnVar, Object obj, Object obj2) {
        return b1.f(zzgbnVar, obj, obj2);
    }

    public final void b(zze zzeVar) {
        zzeVar.a = null;
        while (true) {
            zze zzeVar2 = this.Z;
            if (zzeVar2 != zze.c) {
                zze zzeVar3 = null;
                while (zzeVar2 != null) {
                    zze zzeVar4 = zzeVar2.b;
                    if (zzeVar2.a != null) {
                        zzeVar3 = zzeVar2;
                    } else if (zzeVar3 != null) {
                        zzeVar3.b = zzeVar4;
                        if (zzeVar3.a == null) {
                            break;
                        }
                    } else if (!b1.g(this, zzeVar2, zzeVar4)) {
                        break;
                    }
                    zzeVar2 = zzeVar4;
                }
                return;
            }
            return;
        }
    }

    public final zzgbm.zzd c(zzgbm.zzd zzdVar) {
        return b1.a(this, zzdVar);
    }

    public final Object d() throws InterruptedException, ExecutionException {
        boolean z;
        Object obj;
        boolean z2;
        if (!Thread.interrupted()) {
            Object obj2 = this.X;
            if (obj2 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & zzgbm.u(obj2)) {
                return zzgbm.q(obj2);
            }
            zze zzeVar = this.Z;
            if (zzeVar != zze.c) {
                zze zzeVar2 = new zze();
                do {
                    zza zzaVar = b1;
                    zzaVar.c(zzeVar2, zzeVar);
                    if (zzaVar.g(this, zzeVar, zzeVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.X;
                                if (obj != null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                b(zzeVar2);
                                throw new InterruptedException();
                            }
                        } while (!(z2 & zzgbm.u(obj)));
                        return zzgbm.q(obj);
                    }
                    zzeVar = this.Z;
                } while (zzeVar != zze.c);
                Object obj3 = this.X;
                Objects.requireNonNull(obj3);
                return zzgbm.q(obj3);
            }
            Object obj32 = this.X;
            Objects.requireNonNull(obj32);
            return zzgbm.q(obj32);
        }
        throw new InterruptedException();
    }

    public final Object e(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.X;
            boolean z4 = true;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & zzgbm.u(obj)) {
                return zzgbm.q(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                zze zzeVar = this.Z;
                if (zzeVar != zze.c) {
                    zze zzeVar2 = new zze();
                    do {
                        zza zzaVar = b1;
                        zzaVar.c(zzeVar2, zzeVar);
                        if (zzaVar.g(this, zzeVar, zzeVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, (long) C6920hx1.a));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.X;
                                    if (obj2 != null) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3 & zzgbm.u(obj2)) {
                                        return zzgbm.q(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    b(zzeVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(zzeVar2);
                        } else {
                            zzeVar = this.Z;
                        }
                    } while (zzeVar != zze.c);
                    Object obj3 = this.X;
                    Objects.requireNonNull(obj3);
                    return zzgbm.q(obj3);
                }
                Object obj32 = this.X;
                Objects.requireNonNull(obj32);
                return zzgbm.q(obj32);
            }
            while (nanos > 0) {
                Object obj4 = this.X;
                if (obj4 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 & zzgbm.u(obj4)) {
                    return zzgbm.q(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String obj5 = toString();
            String obj6 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj6.toLowerCase(locale);
            String str = "Waited " + j + C4500Ve2.b + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z4 = false;
                }
                if (i > 0) {
                    String str2 = concat + convert + C4500Ve2.b + lowerCase;
                    if (z4) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(C4500Ve2.b);
                }
                if (z4) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + obj5);
        }
        throw new InterruptedException();
    }

    public final void g() {
        for (zze b = b1.b(this, zze.c); b != null; b = b.b) {
            Thread thread = b.a;
            if (thread != null) {
                b.a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    public final boolean h(zzgbm.zzd zzdVar, zzgbm.zzd zzdVar2) {
        return b1.e(this, zzdVar, zzdVar2);
    }
}
