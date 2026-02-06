package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C11304zt1;
import o.C6566gU0;
import o.InterfaceFutureC8411o11;

/* loaded from: classes2.dex */
public abstract class zzgbm<V> extends zzgbn<V> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zza {
        public static final zza c;
        public static final zza d;
        public final boolean a;
        public final Throwable b;

        static {
            if (zzgbn.a1) {
                d = null;
                c = null;
                return;
            }
            d = new zza(false, null);
            c = new zza(true, null);
        }

        public zza(boolean z, Throwable th) {
            this.a = z;
            this.b = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzb<V> implements Runnable {
        public final zzgbm<V> X;
        public final InterfaceFutureC8411o11<? extends V> Y;

        public zzb(zzgbm zzgbmVar, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
            this.X = zzgbmVar;
            this.Y = interfaceFutureC8411o11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.X.X == this) {
                if (zzgbn.i(this.X, this, zzgbm.n(this.Y))) {
                    zzgbm.y(this.X, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzc {
        public static final zzc b = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgbm.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final Throwable fillInStackTrace() {
                return this;
            }
        });
        public final Throwable a;

        public zzc(Throwable th) {
            th.getClass();
            this.a = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class zzd {
        public static final zzd d = new zzd();
        public final Runnable a;
        public final Executor b;
        public zzd c;

        public zzd() {
            this.a = null;
            this.b = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface zze<V> extends InterfaceFutureC8411o11<V> {
    }

    /* loaded from: classes2.dex */
    abstract class zzf<V> extends zzgbm<V> implements zze<V> {
    }

    public static Object n(InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        Throwable a;
        if (interfaceFutureC8411o11 instanceof zze) {
            Object obj = ((zzgbm) interfaceFutureC8411o11).X;
            if (obj instanceof zza) {
                zza zzaVar = (zza) obj;
                if (zzaVar.a) {
                    Throwable th = zzaVar.b;
                    obj = th != null ? new zza(false, th) : zza.d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((interfaceFutureC8411o11 instanceof zzgec) && (a = ((zzgec) interfaceFutureC8411o11).a()) != null) {
            return new zzc(a);
        } else {
            boolean isCancelled = interfaceFutureC8411o11.isCancelled();
            if ((!zzgbn.a1) & isCancelled) {
                zza zzaVar2 = zza.d;
                Objects.requireNonNull(zzaVar2);
                return zzaVar2;
            }
            try {
                Object o2 = o(interfaceFutureC8411o11);
                if (isCancelled) {
                    String valueOf = String.valueOf(interfaceFutureC8411o11);
                    return new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + valueOf));
                } else if (o2 == null) {
                    return zzgbn.Y0;
                } else {
                    return o2;
                }
            } catch (Error | Exception e) {
                return new zzc(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC8411o11)), e2));
                }
                return new zza(false, e2);
            } catch (ExecutionException e3) {
                if (isCancelled) {
                    return new zza(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC8411o11)), e3));
                }
                return new zzc(e3.getCause());
            }
        }
    }

    public static Object o(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static Object q(Object obj) throws ExecutionException {
        if (!(obj instanceof zza)) {
            if (!(obj instanceof zzc)) {
                if (obj == zzgbn.Y0) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((zzc) obj).a);
        }
        Throwable th = ((zza) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static boolean u(Object obj) {
        return !(obj instanceof zzb);
    }

    public static void y(zzgbm zzgbmVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            zzgbmVar.g();
            if (z) {
                zzgbmVar.s();
            }
            zzgbmVar.k();
            zzd zzdVar2 = zzdVar;
            zzd c = zzgbmVar.c(zzd.d);
            zzd zzdVar3 = zzdVar2;
            while (c != null) {
                zzd zzdVar4 = c.c;
                c.c = zzdVar3;
                zzdVar3 = c;
                c = zzdVar4;
            }
            while (zzdVar3 != null) {
                Runnable runnable = zzdVar3.a;
                zzdVar = zzdVar3.c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzb) {
                    zzb zzbVar = (zzb) runnable2;
                    zzgbmVar = zzbVar.X;
                    if (zzgbmVar.X == zzbVar && zzgbn.i(zzgbmVar, zzbVar, n(zzbVar.Y))) {
                        break;
                    }
                } else {
                    Executor executor = zzdVar3.b;
                    Objects.requireNonNull(executor);
                    z(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
            z = false;
        }
    }

    public static void z(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger a = zzgbn.Z0.a();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            a.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, (Throwable) e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    public final Throwable a() {
        if (this instanceof zze) {
            Object obj = this.X;
            if (obj instanceof zzc) {
                return ((zzc) obj).a;
            }
            return null;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2;
        zza zzaVar;
        boolean z3;
        Object obj = this.X;
        boolean z4 = obj instanceof zzb;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z4 | z2)) {
            return false;
        }
        if (zzgbn.a1) {
            zzaVar = new zza(z, new CancellationException("Future.cancel() was called."));
        } else {
            if (z) {
                zzaVar = zza.c;
            } else {
                zzaVar = zza.d;
            }
            Objects.requireNonNull(zzaVar);
        }
        zzgbm<V> zzgbmVar = this;
        boolean z5 = false;
        while (true) {
            if (zzgbn.i(zzgbmVar, obj, zzaVar)) {
                y(zzgbmVar, z);
                if (!(obj instanceof zzb)) {
                    break;
                }
                InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11 = ((zzb) obj).Y;
                if (interfaceFutureC8411o11 instanceof zze) {
                    zzgbmVar = (zzgbm) interfaceFutureC8411o11;
                    obj = zzgbmVar.X;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!(z3 | (obj instanceof zzb))) {
                        return true;
                    }
                    z5 = true;
                } else {
                    interfaceFutureC8411o11.cancel(z);
                    break;
                }
            } else {
                obj = zzgbmVar.X;
                if (u(obj)) {
                    return z5;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        return d();
    }

    @Override // o.InterfaceFutureC8411o11
    public void h4(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfvc.c(runnable, "Runnable was null.");
        zzfvc.c(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.Y) != zzd.d) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.c = zzdVar;
                if (!h(zzdVar, zzdVar2)) {
                    zzdVar = this.Y;
                } else {
                    return;
                }
            } while (zzdVar != zzd.d);
            z(runnable, executor);
        }
        z(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.X instanceof zza;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.X;
        return (obj != null) & u(obj);
    }

    public String j() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            return "remaining delay=[" + delay + " ms]";
        }
        return null;
    }

    public void k() {
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = zzgbn.Y0;
        }
        if (!zzgbn.i(this, null, obj)) {
            return false;
        }
        y(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!zzgbn.i(this, null, new zzc(th))) {
            return false;
        }
        y(this, false);
        return true;
    }

    public void s() {
    }

    public final void t(Future future) {
        boolean z;
        if (future != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & isCancelled()) {
            future.cancel(w());
        }
    }

    public String toString() {
        String concat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append(C11304zt1.a);
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            x(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.X;
            if (obj instanceof zzb) {
                sb.append(", setFuture=[");
                InterfaceFutureC8411o11<? extends V> interfaceFutureC8411o11 = ((zzb) obj).Y;
                try {
                    if (interfaceFutureC8411o11 == this) {
                        sb.append("this future");
                    } else {
                        sb.append(interfaceFutureC8411o11);
                    }
                } catch (Throwable th) {
                    zzgdr.b(th);
                    sb.append("Exception thrown from implementation: ");
                    sb.append(th.getClass());
                }
                sb.append(C6566gU0.g);
            } else {
                try {
                    concat = zzfvt.a(j());
                } catch (Throwable th2) {
                    zzgdr.b(th2);
                    concat = "Exception thrown from implementation: ".concat(String.valueOf(th2.getClass()));
                }
                if (concat != null) {
                    sb.append(", info=[");
                    sb.append(concat);
                    sb.append(C6566gU0.g);
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                x(sb);
            }
        }
        sb.append(C6566gU0.g);
        return sb.toString();
    }

    public final boolean v(InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        zzc zzcVar;
        interfaceFutureC8411o11.getClass();
        Object obj = this.X;
        if (obj == null) {
            if (interfaceFutureC8411o11.isDone()) {
                if (!zzgbn.i(this, null, n(interfaceFutureC8411o11))) {
                    return false;
                }
                y(this, false);
                return true;
            }
            zzb zzbVar = new zzb(this, interfaceFutureC8411o11);
            if (zzgbn.i(this, null, zzbVar)) {
                try {
                    interfaceFutureC8411o11.h4(zzbVar, zzgcm.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.b;
                    }
                    zzgbn.i(this, zzbVar, zzcVar);
                }
                return true;
            }
            obj = this.X;
        }
        if (obj instanceof zza) {
            interfaceFutureC8411o11.cancel(((zza) obj).a);
        }
        return false;
    }

    public final boolean w() {
        Object obj = this.X;
        if ((obj instanceof zza) && ((zza) obj).a) {
            return true;
        }
        return false;
    }

    public final void x(StringBuilder sb) {
        try {
            Object o2 = o(this);
            sb.append("SUCCESS, result=[");
            if (o2 == null) {
                sb.append("null");
            } else if (o2 == this) {
                sb.append("this future");
            } else {
                sb.append(o2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(o2)));
            }
            sb.append(C6566gU0.g);
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append(C6566gU0.g);
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        return e(j, timeUnit);
    }
}
