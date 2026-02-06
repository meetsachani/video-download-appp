package com.facebook.internal;

import com.facebook.C2416z;
import com.facebook.internal.t0;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import o.C6562gT0;
import o.C7458kA2;
import o.C9516sY;
import o.InterfaceC8289nW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class t0 {
    @NotNull
    public static final a g = new a(null);
    public static final int h = 8;
    public final int a;
    @NotNull
    public final Executor b;
    @NotNull
    public final ReentrantLock c;
    @Nullable
    public c d;
    @Nullable
    public c e;
    public int f;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final void b(boolean z) {
            if (z) {
                return;
            }
            throw new C2416z("Validation failed");
        }

        public a() {
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        boolean cancel();

        boolean isRunning();
    }

    /* loaded from: classes2.dex */
    public final class c implements b {
        @NotNull
        public final Runnable a;
        @Nullable
        public c b;
        @Nullable
        public c c;
        public boolean d;
        public final /* synthetic */ t0 e;

        public c(@NotNull t0 t0Var, Runnable runnable) {
            C6562gT0.p(t0Var, "this$0");
            C6562gT0.p(runnable, "callback");
            this.e = t0Var;
            this.a = runnable;
        }

        @Override // com.facebook.internal.t0.b
        public void a() {
            ReentrantLock reentrantLock = this.e.c;
            t0 t0Var = this.e;
            reentrantLock.lock();
            try {
                if (!isRunning()) {
                    t0Var.d = e(t0Var.d);
                    t0Var.d = b(t0Var.d, true);
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @NotNull
        public final c b(@Nullable c cVar, boolean z) {
            boolean z2;
            c cVar2;
            a aVar = t0.g;
            boolean z3 = false;
            if (this.b == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar.b(z2);
            if (this.c == null) {
                z3 = true;
            }
            aVar.b(z3);
            if (cVar == null) {
                this.c = this;
                this.b = this;
                cVar = this;
            } else {
                this.b = cVar;
                c cVar3 = cVar.c;
                this.c = cVar3;
                if (cVar3 != null) {
                    cVar3.b = this;
                }
                c cVar4 = this.b;
                if (cVar4 != null) {
                    if (cVar3 == null) {
                        cVar2 = null;
                    } else {
                        cVar2 = cVar3.b;
                    }
                    cVar4.c = cVar2;
                }
            }
            if (z) {
                return this;
            }
            return cVar;
        }

        @NotNull
        public final Runnable c() {
            return this.a;
        }

        @Override // com.facebook.internal.t0.b
        public boolean cancel() {
            ReentrantLock reentrantLock = this.e.c;
            t0 t0Var = this.e;
            reentrantLock.lock();
            try {
                if (!isRunning()) {
                    t0Var.d = e(t0Var.d);
                    reentrantLock.unlock();
                    return true;
                }
                C7458kA2 c7458kA2 = C7458kA2.a;
                reentrantLock.unlock();
                return false;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }

        @Nullable
        public final c d() {
            return this.b;
        }

        @Nullable
        public final c e(@Nullable c cVar) {
            boolean z;
            a aVar = t0.g;
            boolean z2 = false;
            if (this.b != null) {
                z = true;
            } else {
                z = false;
            }
            aVar.b(z);
            if (this.c != null) {
                z2 = true;
            }
            aVar.b(z2);
            if (cVar == this && (cVar = this.b) == this) {
                cVar = null;
            }
            c cVar2 = this.b;
            if (cVar2 != null) {
                cVar2.c = this.c;
            }
            c cVar3 = this.c;
            if (cVar3 != null) {
                cVar3.b = cVar2;
            }
            this.c = null;
            this.b = null;
            return cVar;
        }

        public void f(boolean z) {
            this.d = z;
        }

        public final void g(boolean z) {
            c cVar;
            boolean z2;
            c cVar2;
            boolean z3;
            a aVar = t0.g;
            c cVar3 = this.c;
            if (cVar3 == null || (cVar = cVar3.b) == null) {
                cVar = this;
            }
            boolean z4 = false;
            if (cVar == this) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar.b(z2);
            c cVar4 = this.b;
            if (cVar4 == null || (cVar2 = cVar4.c) == null) {
                cVar2 = this;
            }
            if (cVar2 == this) {
                z3 = true;
            } else {
                z3 = false;
            }
            aVar.b(z3);
            if (isRunning() == z) {
                z4 = true;
            }
            aVar.b(z4);
        }

        @Override // com.facebook.internal.t0.b
        public boolean isRunning() {
            return this.d;
        }
    }

    @InterfaceC8289nW0
    public t0() {
        this(0, null, 3, null);
    }

    public static /* synthetic */ b g(t0 t0Var, Runnable runnable, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return t0Var.f(runnable, z);
    }

    public static final void i(c cVar, t0 t0Var) {
        C6562gT0.p(cVar, "$node");
        C6562gT0.p(t0Var, "this$0");
        try {
            cVar.c().run();
        } finally {
            t0Var.j(cVar);
        }
    }

    @InterfaceC8289nW0
    @NotNull
    public final b e(@NotNull Runnable runnable) {
        C6562gT0.p(runnable, "callback");
        return g(this, runnable, false, 2, null);
    }

    @InterfaceC8289nW0
    @NotNull
    public final b f(@NotNull Runnable runnable, boolean z) {
        C6562gT0.p(runnable, "callback");
        c cVar = new c(this, runnable);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.d = cVar.b(this.d, z);
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
            k();
            return cVar;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void h(final c cVar) {
        this.b.execute(new Runnable() { // from class: com.facebook.internal.s0
            @Override // java.lang.Runnable
            public final void run() {
                t0.i(t0.c.this, this);
            }
        });
    }

    public final void j(c cVar) {
        c cVar2;
        this.c.lock();
        if (cVar != null) {
            this.e = cVar.e(this.e);
            this.f--;
        }
        if (this.f < this.a) {
            cVar2 = this.d;
            if (cVar2 != null) {
                this.d = cVar2.e(cVar2);
                this.e = cVar2.b(this.e, false);
                this.f++;
                cVar2.f(true);
            }
        } else {
            cVar2 = null;
        }
        this.c.unlock();
        if (cVar2 != null) {
            h(cVar2);
        }
    }

    public final void k() {
        j(null);
    }

    public final void l() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            c cVar = this.e;
            boolean z = false;
            int i = 0;
            if (cVar != null) {
                while (cVar != null) {
                    cVar.g(true);
                    i++;
                    cVar = cVar.d();
                    if (cVar == this.e) {
                    }
                }
                throw new IllegalStateException("Required value was null.");
            }
            a aVar = g;
            if (this.f == i) {
                z = true;
            }
            aVar.b(z);
            C7458kA2 c7458kA2 = C7458kA2.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @InterfaceC8289nW0
    public t0(int i) {
        this(i, null, 2, null);
    }

    @InterfaceC8289nW0
    public t0(int i, @NotNull Executor executor) {
        C6562gT0.p(executor, "executor");
        this.a = i;
        this.b = executor;
        this.c = new ReentrantLock();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ t0(int i, Executor executor, int i2, C9516sY c9516sY) {
        this(i, executor);
        i = (i2 & 1) != 0 ? 8 : i;
        if ((i2 & 2) != 0) {
            com.facebook.M m = com.facebook.M.a;
            executor = com.facebook.M.y();
        }
    }
}
