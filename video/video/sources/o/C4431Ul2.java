package o;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import o.InterfaceC5809dQ;
import o.InterfaceC8396ny;
import o.PT1;
import o.RU0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nTasks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,164:1\n351#2,11:165\n*S KotlinDebug\n*F\n+ 1 Tasks.kt\nkotlinx/coroutines/tasks/TasksKt\n*L\n136#1:165,11\n*E\n"})
/* renamed from: o.Ul2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4431Ul2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.Ul2$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements J10<T> {
        public final /* synthetic */ HH<T> X;

        public a(HH<T> hh) {
            this.X = hh;
        }

        @Override // o.RU0
        @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        public RU0 A(RU0 ru0) {
            return this.X.A(ru0);
        }

        @Override // o.InterfaceC5809dQ
        public InterfaceC5809dQ M(InterfaceC5809dQ interfaceC5809dQ) {
            return this.X.M(interfaceC5809dQ);
        }

        @Override // o.RU0
        @InterfaceC10472wS0
        public ZB O(InterfaceC5268bC interfaceC5268bC) {
            return this.X.O(interfaceC5268bC);
        }

        @Override // o.J10
        public InterfaceC5223b02<T> P() {
            return this.X.P();
        }

        @Override // o.RU0
        @InterfaceC10472wS0
        public B40 Q(boolean z, boolean z2, HA0<? super Throwable, C7458kA2> ha0) {
            return this.X.Q(z, z2, ha0);
        }

        @Override // o.RU0
        public Object T(HM<? super C7458kA2> hm) {
            return this.X.T(hm);
        }

        @Override // o.RU0
        @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ void cancel() {
            this.X.cancel();
        }

        @Override // o.RU0, o.InterfaceC10800xp
        @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public /* synthetic */ boolean d(Throwable th) {
            return this.X.d(th);
        }

        @Override // o.RU0
        public ZZ1 e0() {
            return this.X.e0();
        }

        @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
        public <E extends InterfaceC5809dQ.b> E f(InterfaceC5809dQ.c<E> cVar) {
            return (E) this.X.f(cVar);
        }

        @Override // o.InterfaceC5809dQ.b
        public InterfaceC5809dQ.c<?> getKey() {
            return this.X.getKey();
        }

        @Override // o.RU0
        public RU0 getParent() {
            return this.X.getParent();
        }

        @Override // o.RU0
        public boolean h() {
            return this.X.h();
        }

        @Override // o.RU0, o.InterfaceC10800xp
        public void i(CancellationException cancellationException) {
            this.X.i(cancellationException);
        }

        @Override // o.RU0
        public B40 i0(HA0<? super Throwable, C7458kA2> ha0) {
            return this.X.i0(ha0);
        }

        @Override // o.RU0
        public boolean isCancelled() {
            return this.X.isCancelled();
        }

        @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
        public InterfaceC5809dQ j(InterfaceC5809dQ.c<?> cVar) {
            return this.X.j(cVar);
        }

        @Override // o.RU0
        public boolean l() {
            return this.X.l();
        }

        @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
        public <R> R m(R r, VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
            return (R) this.X.m(r, va0);
        }

        @Override // o.J10
        @InterfaceC2951Fi0
        public T p() {
            return this.X.p();
        }

        @Override // o.RU0
        public B02<RU0> r() {
            return this.X.r();
        }

        @Override // o.RU0
        public boolean start() {
            return this.X.start();
        }

        @Override // o.J10
        @InterfaceC2951Fi0
        public Throwable t() {
            return this.X.t();
        }

        @Override // o.RU0
        @InterfaceC10472wS0
        public CancellationException u() {
            return this.X.u();
        }

        @Override // o.J10
        public Object v(HM<? super T> hm) {
            return this.X.v(hm);
        }
    }

    /* renamed from: o.Ul2$b */
    /* loaded from: classes4.dex */
    public static final class b<TResult> implements OnCompleteListener {
        public final /* synthetic */ InterfaceC8396ny<T> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC8396ny<? super T> interfaceC8396ny) {
            this.a = interfaceC8396ny;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void a(Task<T> task) {
            Exception q = task.q();
            if (q == null) {
                if (task.t()) {
                    InterfaceC8396ny.a.a(this.a, null, 1, null);
                    return;
                }
                HM hm = this.a;
                PT1.a aVar = PT1.Y;
                hm.q(PT1.b(task.r()));
                return;
            }
            HM hm2 = this.a;
            PT1.a aVar2 = PT1.Y;
            hm2.q(PT1.b(RT1.a(q)));
        }
    }

    /* renamed from: o.Ul2$c */
    /* loaded from: classes4.dex */
    public static final class c implements HA0<Throwable, C7458kA2> {
        public final /* synthetic */ CancellationTokenSource X;

        public c(CancellationTokenSource cancellationTokenSource) {
            this.X = cancellationTokenSource;
        }

        public final void c(Throwable th) {
            this.X.a();
        }

        @Override // o.HA0
        public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
            c(th);
            return C7458kA2.a;
        }
    }

    @NotNull
    public static final <T> J10<T> e(@NotNull Task<T> task) {
        return g(task, null);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T> J10<T> f(@NotNull Task<T> task, @NotNull CancellationTokenSource cancellationTokenSource) {
        return g(task, cancellationTokenSource);
    }

    public static final <T> J10<T> g(Task<T> task, final CancellationTokenSource cancellationTokenSource) {
        final HH c2 = JH.c(null, 1, null);
        if (task.u()) {
            Exception q = task.q();
            if (q == null) {
                if (task.t()) {
                    RU0.a.b(c2, null, 1, null);
                } else {
                    c2.C(task.r());
                }
            } else {
                c2.k(q);
            }
        } else {
            task.f(B30.X, new OnCompleteListener() { // from class: o.Rl2
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void a(Task task2) {
                    C4431Ul2.h(HH.this, task2);
                }
            });
        }
        if (cancellationTokenSource != null) {
            c2.i0(new HA0() { // from class: o.Sl2
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    C7458kA2 i;
                    i = C4431Ul2.i(CancellationTokenSource.this, (Throwable) obj);
                    return i;
                }
            });
        }
        return new a(c2);
    }

    public static final void h(HH hh, Task task) {
        Exception q = task.q();
        if (q == null) {
            if (task.t()) {
                RU0.a.b(hh, null, 1, null);
                return;
            } else {
                hh.C(task.r());
                return;
            }
        }
        hh.k(q);
    }

    public static final C7458kA2 i(CancellationTokenSource cancellationTokenSource, Throwable th) {
        cancellationTokenSource.a();
        return C7458kA2.a;
    }

    @NotNull
    public static final <T> Task<T> j(@NotNull final J10<? extends T> j10) {
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.b());
        j10.i0(new HA0() { // from class: o.Tl2
            @Override // o.HA0
            public final Object invoke(Object obj) {
                C7458kA2 k;
                k = C4431Ul2.k(CancellationTokenSource.this, j10, taskCompletionSource, (Throwable) obj);
                return k;
            }
        });
        return taskCompletionSource.a();
    }

    public static final C7458kA2 k(CancellationTokenSource cancellationTokenSource, J10 j10, TaskCompletionSource taskCompletionSource, Throwable th) {
        Exception exc;
        if (th instanceof CancellationException) {
            cancellationTokenSource.a();
            return C7458kA2.a;
        }
        Throwable t = j10.t();
        if (t == null) {
            taskCompletionSource.c(j10.p());
        } else {
            if (t instanceof Exception) {
                exc = (Exception) t;
            } else {
                exc = null;
            }
            if (exc == null) {
                exc = new RuntimeExecutionException(t);
            }
            taskCompletionSource.b(exc);
        }
        return C7458kA2.a;
    }

    @InterfaceC2951Fi0
    @Nullable
    public static final <T> Object l(@NotNull Task<T> task, @NotNull CancellationTokenSource cancellationTokenSource, @NotNull HM<? super T> hm) {
        return n(task, cancellationTokenSource, hm);
    }

    @Nullable
    public static final <T> Object m(@NotNull Task<T> task, @NotNull HM<? super T> hm) {
        return n(task, null, hm);
    }

    public static final <T> Object n(Task<T> task, CancellationTokenSource cancellationTokenSource, HM<? super T> hm) {
        if (task.u()) {
            Exception q = task.q();
            if (q == null) {
                if (!task.t()) {
                    return task.r();
                }
                throw new CancellationException("Task " + task + " was cancelled normally.");
            }
            throw q;
        }
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        task.f(B30.X, new b(c8883py));
        if (cancellationTokenSource != null) {
            c8883py.X(new c(cancellationTokenSource));
        }
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        return A;
    }
}
