package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import o.InterfaceFutureC8411o11;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgby extends zzgcd {
    public static final zzgdh j1 = new zzgdh(zzgby.class);
    public zzfxx g1;
    public final boolean h1;
    public final boolean i1;

    public zzgby(zzfxx zzfxxVar, boolean z, boolean z2) {
        super(zzfxxVar.size());
        this.g1 = zzfxxVar;
        this.h1 = z;
        this.i1 = z2;
    }

    public static void H(Throwable th) {
        String str;
        if (true != (th instanceof Error)) {
            str = "Got more than one input Future failure. Logging failures after the first";
        } else {
            str = "Input Future failed with Error";
        }
        j1.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", str, th);
    }

    public static boolean J(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void C(Set set) {
        set.getClass();
        if (!isCancelled()) {
            Throwable a = a();
            Objects.requireNonNull(a);
            J(set, a);
        }
    }

    public void D(int i) {
        this.g1 = null;
    }

    public final void E(int i, Future future) {
        try {
            M(i, zzgeb.a(future));
        } catch (ExecutionException e) {
            G(e.getCause());
        } catch (Throwable th) {
            G(th);
        }
    }

    public final void F(zzfxx zzfxxVar) {
        boolean z;
        int A = A();
        int i = 0;
        if (A >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzfvc.m(z, "Less than 0 remaining futures");
        if (A == 0) {
            if (zzfxxVar != null) {
                zzgai it = zzfxxVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        E(i, future);
                    }
                    i++;
                }
            }
            this.c1 = null;
            N();
            D(2);
        }
    }

    public final void G(Throwable th) {
        th.getClass();
        if (this.h1 && !m(th) && J(B(), th)) {
            H(th);
        } else if (th instanceof Error) {
            H(th);
        }
    }

    public final void I(int i, InterfaceFutureC8411o11 interfaceFutureC8411o11) {
        try {
            if (interfaceFutureC8411o11.isCancelled()) {
                this.g1 = null;
                cancel(false);
            } else {
                E(i, interfaceFutureC8411o11);
            }
            F(null);
        } catch (Throwable th) {
            F(null);
            throw th;
        }
    }

    public abstract void M(int i, Object obj);

    public abstract void N();

    public final void O() {
        final zzfxx zzfxxVar;
        Objects.requireNonNull(this.g1);
        if (this.g1.isEmpty()) {
            N();
        } else if (this.h1) {
            zzgai it = this.g1.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final InterfaceFutureC8411o11 interfaceFutureC8411o11 = (InterfaceFutureC8411o11) it.next();
                int i2 = i + 1;
                if (interfaceFutureC8411o11.isDone()) {
                    I(i, interfaceFutureC8411o11);
                } else {
                    interfaceFutureC8411o11.h4(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbw
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzgby.this.I(i, interfaceFutureC8411o11);
                        }
                    }, zzgcm.INSTANCE);
                }
                i = i2;
            }
        } else {
            zzfxx zzfxxVar2 = this.g1;
            if (true != this.i1) {
                zzfxxVar = null;
            } else {
                zzfxxVar = zzfxxVar2;
            }
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbx
                @Override // java.lang.Runnable
                public final void run() {
                    zzgby.this.F(zzfxxVar);
                }
            };
            zzgai it2 = zzfxxVar2.iterator();
            while (it2.hasNext()) {
                InterfaceFutureC8411o11 interfaceFutureC8411o112 = (InterfaceFutureC8411o11) it2.next();
                if (interfaceFutureC8411o112.isDone()) {
                    F(zzfxxVar);
                } else {
                    interfaceFutureC8411o112.h4(runnable, zzgcm.INSTANCE);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final String j() {
        zzfxx zzfxxVar = this.g1;
        if (zzfxxVar != null) {
            return "futures=".concat(zzfxxVar.toString());
        }
        return super.j();
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final void k() {
        zzfxx zzfxxVar = this.g1;
        boolean z = true;
        D(1);
        boolean isCancelled = isCancelled();
        if (zzfxxVar == null) {
            z = false;
        }
        if (z & isCancelled) {
            boolean w = w();
            zzgai it = zzfxxVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(w);
            }
        }
    }
}
