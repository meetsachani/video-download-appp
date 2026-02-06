package o;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class L01 {

    @FV(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<Throwable, HM<? super Boolean>, Object> {
        public int Z0;

        public a(HM<? super a> hm) {
            super(2, hm);
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                return C10557wp.a(true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(Throwable th, HM<? super Boolean> hm) {
            return ((a) t(th, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new a(hm);
        }
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @IR1(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@NotNull InterfaceC4076Qv0<?> interfaceC4076Qv0, @Nullable CancellationException cancellationException) {
        C4467Uv0.b1();
        throw new SX0();
    }

    public static /* synthetic */ void b(InterfaceC4076Qv0 interfaceC4076Qv0, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        a(interfaceC4076Qv0, cancellationException);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @IR1(expression = "this", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> c(@NotNull V32<? extends T> v32) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @XP0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "SharedFlow never completes, so this operator typically has not effect, it can only catch exceptions from 'onSubscribe' operator", replaceWith = @IR1(expression = "this", imports = {}))
    public static final <T> InterfaceC3882Ov0<T> d(V32<? extends T> v32, XA0<? super InterfaceC4076Qv0<? super T>, ? super Throwable, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        C6562gT0.n(v32, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.catch>");
        return C4467Uv0.t(v32, xa0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @IR1(expression = "this", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e(@NotNull InterfaceC9041qc2<? extends T> interfaceC9041qc2) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @XP0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "SharedFlow never completes, so this terminal operation never completes.")
    public static final <T> Object f(V32<? extends T> v32, HM<? super Integer> hm) {
        C6562gT0.n(v32, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.count>");
        UP0.e(0);
        Object Y = C4467Uv0.Y(v32, hm);
        UP0.e(1);
        return Y;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @IR1(expression = "this", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> g(@NotNull InterfaceC9041qc2<? extends T> interfaceC9041qc2) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @IR1(expression = "this", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> h(@NotNull V32<? extends T> v32, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @NotNull
    public static final InterfaceC5809dQ i(@NotNull InterfaceC4076Qv0<?> interfaceC4076Qv0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    public static final boolean k(@NotNull InterfaceC4076Qv0<?> interfaceC4076Qv0) {
        C4467Uv0.b1();
        throw new SX0();
    }

    @XP0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @IR1(expression = "this", imports = {}))
    public static final <T> InterfaceC3882Ov0<T> m(V32<? extends T> v32, long j, VA0<? super Throwable, ? super HM<? super Boolean>, ? extends Object> va0) {
        C6562gT0.n(v32, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return C4467Uv0.v1(v32, j, va0);
    }

    public static /* synthetic */ InterfaceC3882Ov0 n(V32 v32, long j, VA0 va0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            va0 = new a(null);
        }
        C6562gT0.n(v32, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retry>");
        return C4467Uv0.v1(v32, j, va0);
    }

    @XP0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @IR1(expression = "this", imports = {}))
    public static final <T> InterfaceC3882Ov0<T> o(V32<? extends T> v32, ZA0<? super InterfaceC4076Qv0<? super T>, ? super Throwable, ? super Long, ? super HM<? super Boolean>, ? extends Object> za0) {
        C6562gT0.n(v32, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.retryWhen>");
        return C4467Uv0.x1(v32, za0);
    }

    @XP0
    public static final <T> Object p(V32<? extends T> v32, List<T> list, HM<?> hm) {
        C6562gT0.n(v32, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        UP0.e(0);
        C4467Uv0.X1(v32, list, hm);
        UP0.e(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @XP0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "SharedFlow never completes, so this terminal operation never completes.")
    public static final <T> Object q(V32<? extends T> v32, HM<? super List<? extends T>> hm) {
        Object c;
        C6562gT0.n(v32, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toList>");
        UP0.e(0);
        c = C4855Yv0.c(v32, null, hm, 1, null);
        UP0.e(1);
        return c;
    }

    @XP0
    public static final <T> Object r(V32<? extends T> v32, Set<T> set, HM<?> hm) {
        C6562gT0.n(v32, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        UP0.e(0);
        C4467Uv0.Z1(v32, set, hm);
        UP0.e(1);
        throw new IllegalStateException("this code is supposed to be unreachable");
    }

    @XP0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = "SharedFlow never completes, so this terminal operation never completes.")
    public static final <T> Object s(V32<? extends T> v32, HM<? super Set<? extends T>> hm) {
        Object e;
        C6562gT0.n(v32, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.LintKt.toSet>");
        UP0.e(0);
        e = C4855Yv0.e(v32, null, hm, 1, null);
        UP0.e(1);
        return e;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "coroutineContext is resolved into the property of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext() instead or specify the receiver of coroutineContext explicitly", replaceWith = @IR1(expression = "currentCoroutineContext()", imports = {}))
    public static /* synthetic */ void j(InterfaceC4076Qv0 interfaceC4076Qv0) {
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "isActive is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().isActive or cancellable() operator instead or specify the receiver of isActive explicitly. Additionally, flow {} builder emissions are cancellable by default.", replaceWith = @IR1(expression = "currentCoroutineContext().isActive", imports = {}))
    public static /* synthetic */ void l(InterfaceC4076Qv0 interfaceC4076Qv0) {
    }
}
