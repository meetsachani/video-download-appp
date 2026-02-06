package com.facebook.bolts;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o.C6562gT0;
import o.C7458kA2;
import o.C8319ne2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class k implements Closeable {
    @Nullable
    public ScheduledFuture<?> Y0;
    public boolean Z0;
    public boolean a1;
    @NotNull
    public final Object X = new Object();
    @NotNull
    public final List<i> Y = new ArrayList();
    @NotNull
    public final ScheduledExecutorService Z = f.d.e();

    public static /* synthetic */ void a(k kVar) {
        h(kVar);
    }

    public static final void h(k kVar) {
        C6562gT0.p(kVar, "this$0");
        synchronized (kVar.X) {
            kVar.Y0 = null;
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
        kVar.cancel();
    }

    public final void cancel() {
        synchronized (this.X) {
            o();
            if (this.Z0) {
                return;
            }
            i();
            this.Z0 = true;
            ArrayList arrayList = new ArrayList(this.Y);
            C7458kA2 c7458kA2 = C7458kA2.a;
            l(arrayList);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.X) {
            try {
                if (this.a1) {
                    return;
                }
                i();
                for (i iVar : this.Y) {
                    iVar.close();
                }
                this.Y.clear();
                this.a1 = true;
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(long j) {
        f(j, TimeUnit.MILLISECONDS);
    }

    public final void f(long j, TimeUnit timeUnit) {
        boolean z;
        int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == 0) {
                cancel();
                return;
            }
            synchronized (this.X) {
                try {
                    if (this.Z0) {
                        return;
                    }
                    i();
                    if (i != 0) {
                        this.Y0 = this.Z.schedule(new Runnable() { // from class: com.facebook.bolts.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                k.a(k.this);
                            }
                        }, j, timeUnit);
                    }
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("Delay must be >= -1");
    }

    public final void i() {
        ScheduledFuture<?> scheduledFuture = this.Y0;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
        this.Y0 = null;
    }

    @NotNull
    public final h j() {
        h hVar;
        synchronized (this.X) {
            o();
            hVar = new h(this);
        }
        return hVar;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.X) {
            o();
            z = this.Z0;
        }
        return z;
    }

    public final void l(List<i> list) {
        for (i iVar : list) {
            iVar.a();
        }
    }

    @NotNull
    public final i m(@Nullable Runnable runnable) {
        i iVar;
        synchronized (this.X) {
            try {
                o();
                iVar = new i(this, runnable);
                if (this.Z0) {
                    iVar.a();
                    C7458kA2 c7458kA2 = C7458kA2.a;
                } else {
                    this.Y.add(iVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public final void n() throws CancellationException {
        synchronized (this.X) {
            o();
            if (!this.Z0) {
                C7458kA2 c7458kA2 = C7458kA2.a;
            } else {
                throw new CancellationException();
            }
        }
    }

    public final void o() {
        if (!this.a1) {
            return;
        }
        throw new IllegalStateException("Object already closed");
    }

    public final void p(@NotNull i iVar) {
        C6562gT0.p(iVar, "registration");
        synchronized (this.X) {
            o();
            this.Y.remove(iVar);
        }
    }

    @NotNull
    public String toString() {
        C8319ne2 c8319ne2 = C8319ne2.a;
        String format = String.format(Locale.US, "%s@%s[cancellationRequested=%s]", Arrays.copyOf(new Object[]{k.class.getName(), Integer.toHexString(hashCode()), Boolean.toString(k())}, 3));
        C6562gT0.o(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }
}
