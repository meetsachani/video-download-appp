package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,208:1\n1#2:209\n351#3,11:210\n*S KotlinDebug\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n*L\n168#1:210,11\n*E\n"})
/* renamed from: o.eC0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5996eC0 {

    /* renamed from: o.eC0$a */
    /* loaded from: classes4.dex */
    public static final class a implements HA0<Throwable, C7458kA2> {
        public final /* synthetic */ CompletableFuture<T> X;
        public final /* synthetic */ JM<T> Y;

        public a(CompletableFuture<T> completableFuture, JM<T> jm) {
            this.X = completableFuture;
            this.Y = jm;
        }

        public final void c(Throwable th) {
            this.X.cancel(false);
            this.Y.cont = null;
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
            c(th);
            return C7458kA2.a;
        }
    }

    /* renamed from: o.eC0$b */
    /* loaded from: classes4.dex */
    public static final class b implements VA0 {
        public final /* synthetic */ RU0 X;

        public b(RU0 ru0) {
            this.X = ru0;
        }

        public final void c(Object obj, Throwable th) {
            RU0 ru0 = this.X;
            CancellationException cancellationException = null;
            if (th != null) {
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    cancellationException = C3722Nf0.a("CompletableFuture was completed exceptionally", th);
                }
            }
            ru0.i(cancellationException);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2) {
            c(obj, (Throwable) obj2);
            return C7458kA2.a;
        }
    }

    @NotNull
    public static final <T> CompletableFuture<T> f(@NotNull final J10<? extends T> j10) {
        final CompletableFuture<T> completableFuture = new CompletableFuture<>();
        p(j10, completableFuture);
        j10.i0(new HA0() { // from class: o.ZB0
            @Override // o.HA0
            public final Object invoke(Object obj) {
                C7458kA2 h;
                h = C5996eC0.h(completableFuture, j10, (Throwable) obj);
                return h;
            }
        });
        return completableFuture;
    }

    @NotNull
    public static final CompletableFuture<C7458kA2> g(@NotNull RU0 ru0) {
        final CompletableFuture<C7458kA2> completableFuture = new CompletableFuture<>();
        p(ru0, completableFuture);
        ru0.i0(new HA0() { // from class: o.cC0
            @Override // o.HA0
            public final Object invoke(Object obj) {
                C7458kA2 i;
                i = C5996eC0.i(completableFuture, (Throwable) obj);
                return i;
            }
        });
        return completableFuture;
    }

    public static final C7458kA2 h(CompletableFuture completableFuture, J10 j10, Throwable th) {
        try {
            completableFuture.complete(j10.p());
        } catch (Throwable th2) {
            completableFuture.completeExceptionally(th2);
        }
        return C7458kA2.a;
    }

    public static final C7458kA2 i(CompletableFuture completableFuture, Throwable th) {
        if (th == null) {
            completableFuture.complete(C7458kA2.a);
        } else {
            completableFuture.completeExceptionally(th);
        }
        return C7458kA2.a;
    }

    @NotNull
    public static final <T> J10<T> j(@NotNull CompletionStage<T> completionStage) {
        ExecutionException executionException;
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return JH.a(completableFuture.get());
            } catch (Throwable th) {
                th = th;
                if (th instanceof ExecutionException) {
                    executionException = th;
                } else {
                    executionException = null;
                }
                if (executionException != null && (cause = executionException.getCause()) != null) {
                    th = cause;
                }
                HH c = JH.c(null, 1, null);
                c.k(th);
                return c;
            }
        }
        final HH c2 = JH.c(null, 1, null);
        final VA0 va0 = new VA0() { // from class: o.aC0
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                Object k;
                k = C5996eC0.k(HH.this, obj, (Throwable) obj2);
                return k;
            }
        };
        completionStage.handle(new BiFunction() { // from class: o.bC0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object l;
                l = C5996eC0.l(VA0.this, obj, (Throwable) obj2);
                return l;
            }
        });
        C6314fV0.B(c2, false, new C7163iy(completableFuture), 1, null);
        return c2;
    }

    public static final Object k(HH hh, Object obj, Throwable th) {
        CompletionException completionException;
        boolean k;
        Throwable cause;
        try {
            if (th == null) {
                k = hh.C(obj);
            } else {
                if (th instanceof CompletionException) {
                    completionException = (CompletionException) th;
                } else {
                    completionException = null;
                }
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th = cause;
                }
                k = hh.k(th);
            }
            return Boolean.valueOf(k);
        } catch (Throwable th2) {
            C8753pQ.b(C3897Pa0.X, th2);
            return C7458kA2.a;
        }
    }

    public static final Object l(VA0 va0, Object obj, Throwable th) {
        return va0.i(obj, th);
    }

    @Nullable
    public static final <T> Object m(@NotNull CompletionStage<T> completionStage, @NotNull HM<? super T> hm) {
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    throw e;
                }
                throw cause;
            }
        }
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        JM jm = new JM(c8883py);
        completionStage.handle(jm);
        c8883py.X(new a(completableFuture, jm));
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        return A;
    }

    @NotNull
    public static final <T> CompletableFuture<T> n(@NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull EnumC10949yQ enumC10949yQ, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0) {
        if (!enumC10949yQ.i()) {
            InterfaceC5809dQ k = C7035iQ.k(interfaceC9974uQ, interfaceC5809dQ);
            CompletableFuture<T> completableFuture = new CompletableFuture<>();
            LH lh = new LH(k, completableFuture);
            completableFuture.handle((BiFunction) lh);
            lh.S1(enumC10949yQ, lh, va0);
            return completableFuture;
        }
        throw new IllegalArgumentException((enumC10949yQ + " start is not supported").toString());
    }

    public static /* synthetic */ CompletableFuture o(InterfaceC9974uQ interfaceC9974uQ, InterfaceC5809dQ interfaceC5809dQ, EnumC10949yQ enumC10949yQ, VA0 va0, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC5809dQ = C3897Pa0.X;
        }
        if ((i & 2) != 0) {
            enumC10949yQ = EnumC10949yQ.X;
        }
        return n(interfaceC9974uQ, interfaceC5809dQ, enumC10949yQ, va0);
    }

    public static final void p(RU0 ru0, CompletableFuture<?> completableFuture) {
        final b bVar = new b(ru0);
        completableFuture.handle(new BiFunction() { // from class: o.dC0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C7458kA2 q;
                q = C5996eC0.q(VA0.this, obj, (Throwable) obj2);
                return q;
            }
        });
    }

    public static final C7458kA2 q(VA0 va0, Object obj, Throwable th) {
        return (C7458kA2) va0.i(obj, th);
    }
}
