package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,135:1\n62#1,8:136\n62#1,8:144\n27#2:152\n27#2:154\n16#3:153\n16#3:155\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n44#1:136,8\n51#1:144,8\n75#1:152\n88#1:154\n75#1:153\n88#1:155\n*E\n"})
/* loaded from: classes4.dex */
public final class PZ0 extends AbstractC7762lQ implements O10 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d1 = AtomicIntegerFieldUpdater.newUpdater(PZ0.class, "runningWorkers$volatile");
    @NotNull
    public final AbstractC7762lQ Y0;
    public final /* synthetic */ O10 Z;
    public final int Z0;
    @Nullable
    public final String a1;
    @NotNull
    public final C9155r31<Runnable> b1;
    @NotNull
    public final Object c1;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* loaded from: classes4.dex */
    public final class a implements Runnable {
        @NotNull
        public Runnable X;

        public a(@NotNull Runnable runnable) {
            this.X = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.X.run();
                } catch (Throwable th) {
                    C8753pQ.b(C3897Pa0.X, th);
                }
                Runnable m0 = PZ0.this.m0();
                if (m0 == null) {
                    return;
                }
                this.X = m0;
                i++;
                if (i >= 16 && PZ0.this.Y0.U(PZ0.this)) {
                    PZ0.this.Y0.I(PZ0.this, this);
                    return;
                }
            }
        }
    }

    public PZ0(@NotNull AbstractC7762lQ abstractC7762lQ, int i, @Nullable String str) {
        O10 o10;
        if (abstractC7762lQ instanceof O10) {
            o10 = (O10) abstractC7762lQ;
        } else {
            o10 = null;
        }
        this.Z = o10 == null ? UY.a() : o10;
        this.Y0 = abstractC7762lQ;
        this.Z0 = i;
        this.a1 = str;
        this.b1 = new C9155r31<>(false);
        this.c1 = new Object();
    }

    @Override // o.O10
    public void E(long j, @NotNull InterfaceC8396ny<? super C7458kA2> interfaceC8396ny) {
        this.Z.E(j, interfaceC8396ny);
    }

    @Override // o.AbstractC7762lQ
    public void I(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        Runnable m0;
        this.b1.a(runnable);
        if (d1.get(this) < this.Z0 && p0() && (m0 = m0()) != null) {
            this.Y0.I(this, new a(m0));
        }
    }

    @Override // o.AbstractC7762lQ
    @InterfaceC10472wS0
    public void R(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull Runnable runnable) {
        Runnable m0;
        this.b1.a(runnable);
        if (d1.get(this) < this.Z0 && p0() && (m0 = m0()) != null) {
            this.Y0.R(this, new a(m0));
        }
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public AbstractC7762lQ W(int i, @Nullable String str) {
        QZ0.a(i);
        if (i >= this.Z0) {
            return QZ0.b(this, str);
        }
        return super.W(i, str);
    }

    public final void j0(Runnable runnable, HA0<? super a, C7458kA2> ha0) {
        Runnable m0;
        this.b1.a(runnable);
        if (d1.get(this) >= this.Z0 || !p0() || (m0 = m0()) == null) {
            return;
        }
        ha0.invoke(new a(m0));
    }

    public final /* synthetic */ int k0() {
        return this.runningWorkers$volatile;
    }

    public final Runnable m0() {
        while (true) {
            Runnable j = this.b1.j();
            if (j == null) {
                synchronized (this.c1) {
                    d1.decrementAndGet(this);
                    if (this.b1.c() == 0) {
                        return null;
                    }
                    d1.incrementAndGet(this);
                }
            } else {
                return j;
            }
        }
    }

    public final /* synthetic */ void n0(int i) {
        this.runningWorkers$volatile = i;
    }

    @Override // o.O10
    @NotNull
    public B40 o(long j, @NotNull Runnable runnable, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return this.Z.o(j, runnable, interfaceC5809dQ);
    }

    public final boolean p0() {
        synchronized (this.c1) {
            if (d1.get(this) >= this.Z0) {
                return false;
            }
            d1.incrementAndGet(this);
            return true;
        }
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public String toString() {
        String str = this.a1;
        if (str == null) {
            return this.Y0 + ".limitedParallelism(" + this.Z0 + ')';
        }
        return str;
    }

    @Override // o.O10
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object z(long j, @NotNull HM<? super C7458kA2> hm) {
        return this.Z.z(j, hm);
    }
}
