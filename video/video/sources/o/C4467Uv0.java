package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Uv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4467Uv0 {
    @NotNull
    public static final String a = "kotlinx.coroutines.flow.defaultConcurrency";

    @Nullable
    public static final <T> Object A(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0, @NotNull HM<? super C7458kA2> hm) {
        return C4758Xv0.f(interfaceC3882Ov0, va0, hm);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> A0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super InterfaceC3882Ov0<? extends R>>, ? extends Object> va0) {
        return C7642kw0.a(interfaceC3882Ov0, va0);
    }

    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> A1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C5931dw0.k(interfaceC3882Ov0, j);
    }

    @Nullable
    public static final <T> Object B(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, @NotNull HM<? super C7458kA2> hm) {
        return C7399jw0.b(interfaceC3882Ov0, va0, hm);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> B0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull VA0<? super T, ? super HM<? super InterfaceC3882Ov0<? extends R>>, ? extends Object> va0) {
        return C7642kw0.b(interfaceC3882Ov0, va0);
    }

    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> B1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C5931dw0.l(interfaceC3882Ov0, j);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> C0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i, @NotNull VA0<? super T, ? super HM<? super InterfaceC3882Ov0<? extends R>>, ? extends Object> va0) {
        return C7642kw0.c(interfaceC3882Ov0, i, va0);
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> C1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, R r, @InterfaceC5183ar @NotNull XA0<? super R, ? super T, ? super HM<? super R>, ? extends Object> xa0) {
        return C8876pw0.l(interfaceC3882Ov0, r, xa0);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> InterfaceC3882Ov0<R> D(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @NotNull InterfaceC3882Ov0<? extends T5> interfaceC3882Ov05, @NotNull InterfaceC5507cB0<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super HM<? super R>, ? extends Object> interfaceC5507cB0) {
        return C9126qw0.c(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04, interfaceC3882Ov05, interfaceC5507cB0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow has less verbose 'scan' shortcut", replaceWith = @IR1(expression = "scan(initial, operation)", imports = {}))
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> D1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, R r, @InterfaceC5183ar @NotNull XA0<? super R, ? super T, ? super HM<? super R>, ? extends Object> xa0) {
        return C8146mw0.D(interfaceC3882Ov0, r, xa0);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> InterfaceC3882Ov0<R> E(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @NotNull InterfaceC5265bB0<? super T1, ? super T2, ? super T3, ? super T4, ? super HM<? super R>, ? extends Object> interfaceC5265bB0) {
        return C9126qw0.d(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04, interfaceC5265bB0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @IR1(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> E0(@NotNull InterfaceC3882Ov0<? extends InterfaceC3882Ov0<? extends T>> interfaceC3882Ov0) {
        return C8146mw0.n(interfaceC3882Ov0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @IR1(expression = "runningReduce(operation)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> E1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super T, ? super T, ? super HM<? super T>, ? extends Object> xa0) {
        return C8146mw0.E(interfaceC3882Ov0, xa0);
    }

    @NotNull
    public static final <T1, T2, T3, R> InterfaceC3882Ov0<R> F(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @InterfaceC5183ar @NotNull ZA0<? super T1, ? super T2, ? super T3, ? super HM<? super R>, ? extends Object> za0) {
        return C9126qw0.e(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, za0);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> F0(@NotNull InterfaceC3882Ov0<? extends InterfaceC3882Ov0<? extends T>> interfaceC3882Ov0) {
        return C7642kw0.e(interfaceC3882Ov0);
    }

    @NotNull
    public static final <T> V32<T> F1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC7677l42 interfaceC7677l42, int i) {
        return C8633ow0.g(interfaceC3882Ov0, interfaceC9974uQ, interfaceC7677l42, i);
    }

    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> G(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0) {
        return C9126qw0.f(interfaceC3882Ov0, interfaceC3882Ov02, xa0);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> G0(@NotNull InterfaceC3882Ov0<? extends InterfaceC3882Ov0<? extends T>> interfaceC3882Ov0, int i) {
        return C7642kw0.f(interfaceC3882Ov0, i);
    }

    @Nullable
    public static final <T> Object H1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        return C8389nw0.j(interfaceC3882Ov0, hm);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @IR1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, T5, R> InterfaceC3882Ov0<R> I(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @NotNull InterfaceC3882Ov0<? extends T5> interfaceC3882Ov05, @NotNull InterfaceC5507cB0<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super HM<? super R>, ? extends Object> interfaceC5507cB0) {
        return C8146mw0.c(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04, interfaceC3882Ov05, interfaceC5507cB0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> I0(@InterfaceC5183ar @NotNull VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return C4564Vv0.n(va0);
    }

    @Nullable
    public static final <T> Object I1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        return C8389nw0.k(interfaceC3882Ov0, hm);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @IR1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, R> InterfaceC3882Ov0<R> J(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @NotNull InterfaceC5265bB0<? super T1, ? super T2, ? super T3, ? super T4, ? super HM<? super R>, ? extends Object> interfaceC5265bB0) {
        return C8146mw0.d(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04, interfaceC5265bB0);
    }

    @InterfaceC8046mW0(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> J0(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0) {
        return C9126qw0.p(interfaceC3882Ov0, interfaceC3882Ov02, xa0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @IR1(expression = "drop(count)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> J1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i) {
        return C8146mw0.F(interfaceC3882Ov0, i);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @IR1(expression = "combine(this, other, other2, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, R> InterfaceC3882Ov0<R> K(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull ZA0<? super T1, ? super T2, ? super T3, ? super HM<? super R>, ? extends Object> za0) {
        return C8146mw0.e(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, za0);
    }

    @InterfaceC8046mW0(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> K0(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @InterfaceC5183ar @NotNull ZA0<? super InterfaceC4076Qv0<? super R>, ? super T1, ? super T2, ? super HM<? super C7458kA2>, ? extends Object> za0) {
        return C9126qw0.q(interfaceC3882Ov0, interfaceC3882Ov02, za0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @IR1(expression = "onStart { emit(value) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> K1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, T t) {
        return C8146mw0.G(interfaceC3882Ov0, t);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @IR1(expression = "this.combine(other, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> L(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0) {
        return C8146mw0.f(interfaceC3882Ov0, interfaceC3882Ov02, xa0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> L0(T t) {
        return C4564Vv0.o(t);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @IR1(expression = "onStart { emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> L1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov02) {
        return C8146mw0.H(interfaceC3882Ov0, interfaceC3882Ov02);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> M0(@NotNull T... tArr) {
        return C4564Vv0.p(tArr);
    }

    @Nullable
    public static final <T> Object M1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull HM<? super InterfaceC9041qc2<? extends T>> hm) {
        return C8633ow0.i(interfaceC3882Ov0, interfaceC9974uQ, hm);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> InterfaceC3882Ov0<R> N(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @NotNull InterfaceC3882Ov0<? extends T5> interfaceC3882Ov05, @InterfaceC5183ar @NotNull InterfaceC5750dB0<? super InterfaceC4076Qv0<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super HM<? super C7458kA2>, ? extends Object> interfaceC5750dB0) {
        return C9126qw0.i(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04, interfaceC3882Ov05, interfaceC5750dB0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> N0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return C4962Zv0.h(interfaceC3882Ov0, interfaceC5809dQ);
    }

    @NotNull
    public static final <T> InterfaceC9041qc2<T> N1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC9974uQ interfaceC9974uQ, @NotNull InterfaceC7677l42 interfaceC7677l42, T t) {
        return C8633ow0.j(interfaceC3882Ov0, interfaceC9974uQ, interfaceC7677l42, t);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> InterfaceC3882Ov0<R> O(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @InterfaceC5183ar @NotNull InterfaceC5507cB0<? super InterfaceC4076Qv0<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super HM<? super C7458kA2>, ? extends Object> interfaceC5507cB0) {
        return C9126qw0.j(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04, interfaceC5507cB0);
    }

    @Nullable
    public static final <T, R> Object O0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, R r, @NotNull XA0<? super R, ? super T, ? super HM<? super R>, ? extends Object> xa0, @NotNull HM<? super R> hm) {
        return C8389nw0.e(interfaceC3882Ov0, r, xa0, hm);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void O1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        C8146mw0.I(interfaceC3882Ov0);
    }

    @NotNull
    public static final <T1, T2, T3, R> InterfaceC3882Ov0<R> P(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @InterfaceC5183ar @NotNull InterfaceC5265bB0<? super InterfaceC4076Qv0<? super R>, ? super T1, ? super T2, ? super T3, ? super HM<? super C7458kA2>, ? extends Object> interfaceC5265bB0) {
        return C9126qw0.k(interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC5265bB0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @IR1(expression = "collect(action)", imports = {}))
    public static final <T> void P0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        C8146mw0.o(interfaceC3882Ov0, va0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void P1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        C8146mw0.J(interfaceC3882Ov0, va0);
    }

    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> Q(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @InterfaceC5183ar @NotNull ZA0<? super InterfaceC4076Qv0<? super R>, ? super T1, ? super T2, ? super HM<? super C7458kA2>, ? extends Object> za0) {
        return C9126qw0.l(interfaceC3882Ov0, interfaceC3882Ov02, za0);
    }

    public static final int Q0() {
        return C7642kw0.h();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Q1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0, @NotNull VA0<? super Throwable, ? super HM<? super C7458kA2>, ? extends Object> va02) {
        C8146mw0.K(interfaceC3882Ov0, va0, va02);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'flowOn' instead")
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> R1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return C8146mw0.L(interfaceC3882Ov0, interfaceC5809dQ);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'compose' is 'let'", replaceWith = @IR1(expression = "let(transformer)", imports = {}))
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> S(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HA0<? super InterfaceC3882Ov0<? extends T>, ? extends InterfaceC3882Ov0<? extends R>> ha0) {
        return C8146mw0.g(interfaceC3882Ov0, ha0);
    }

    @Nullable
    public static final <T> Object S0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        return C8389nw0.g(interfaceC3882Ov0, hm);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @IR1(expression = "this.flatMapLatest(transform)", imports = {}))
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> S1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super InterfaceC3882Ov0<? extends R>>, ? extends Object> va0) {
        return C8146mw0.M(interfaceC3882Ov0, va0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @IR1(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> T(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HA0<? super T, ? extends InterfaceC3882Ov0<? extends R>> ha0) {
        return C8146mw0.h(interfaceC3882Ov0, ha0);
    }

    @Nullable
    public static final <T> Object T0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        return C8389nw0.h(interfaceC3882Ov0, hm);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> T1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i) {
        return C7399jw0.g(interfaceC3882Ov0, i);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @IR1(expression = "onCompletion { emit(value) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> U(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, T t) {
        return C8146mw0.i(interfaceC3882Ov0, t);
    }

    @NotNull
    public static final <T> RU0 U0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC9974uQ interfaceC9974uQ) {
        return C4758Xv0.h(interfaceC3882Ov0, interfaceC9974uQ);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> U1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0) {
        return C7399jw0.h(interfaceC3882Ov0, va0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @IR1(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> V(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov02) {
        return C8146mw0.j(interfaceC3882Ov0, interfaceC3882Ov02);
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> V0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super R>, ? extends Object> va0) {
        return C8876pw0.g(interfaceC3882Ov0, va0);
    }

    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> V1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C5931dw0.m(interfaceC3882Ov0, j);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> W(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        return C4962Zv0.g(interfaceC3882Ov0);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> W0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull VA0<? super T, ? super HM<? super R>, ? extends Object> va0) {
        return C7642kw0.k(interfaceC3882Ov0, va0);
    }

    @Nullable
    public static final <T, C extends Collection<? super T>> Object W1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull C c, @NotNull HM<? super C> hm) {
        return C4855Yv0.a(interfaceC3882Ov0, c, hm);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> X(@NotNull OO1<? extends T> oo1) {
        return C4661Wv0.b(oo1);
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> X0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super R>, ? extends Object> va0) {
        return C8876pw0.h(interfaceC3882Ov0, va0);
    }

    @Nullable
    public static final <T> Object X1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull List<T> list, @NotNull HM<? super List<? extends T>> hm) {
        return C4855Yv0.b(interfaceC3882Ov0, list, hm);
    }

    @Nullable
    public static final <T> Object Y(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super Integer> hm) {
        return C5204aw0.a(interfaceC3882Ov0, hm);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> Y0(@NotNull Iterable<? extends InterfaceC3882Ov0<? extends T>> iterable) {
        return C7642kw0.l(iterable);
    }

    @Nullable
    public static final <T> Object Z(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, @NotNull HM<? super Integer> hm) {
        return C5204aw0.b(interfaceC3882Ov0, va0, hm);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @IR1(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> Z0(@NotNull InterfaceC3882Ov0<? extends InterfaceC3882Ov0<? extends T>> interfaceC3882Ov0) {
        return C8146mw0.p(interfaceC3882Ov0);
    }

    @Nullable
    public static final <T> Object Z1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull Set<T> set, @NotNull HM<? super Set<? extends T>> hm) {
        return C4855Yv0.d(interfaceC3882Ov0, set, hm);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> a(@NotNull Iterable<? extends T> iterable) {
        return C4564Vv0.a(iterable);
    }

    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> a0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C5931dw0.c(interfaceC3882Ov0, j);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> a1(@NotNull InterfaceC3882Ov0<? extends T>... interfaceC3882Ov0Arr) {
        return C7642kw0.m(interfaceC3882Ov0Arr);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> b(@NotNull Iterator<? extends T> it) {
        return C4564Vv0.b(it);
    }

    @InterfaceC9611sw0
    @InterfaceC7161ix1
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> b0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HA0<? super T, Long> ha0) {
        return C5931dw0.d(interfaceC3882Ov0, ha0);
    }

    @NotNull
    public static final Void b1() {
        return C8146mw0.q();
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> b2(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        return C6915hw0.g(interfaceC3882Ov0, xa0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> c(@NotNull FA0<? extends T> fa0) {
        return C4564Vv0.c(fa0);
    }

    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> c0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C5931dw0.g(interfaceC3882Ov0, j);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> c1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return C8146mw0.r(interfaceC3882Ov0, interfaceC5809dQ);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> c2(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        return C7642kw0.n(interfaceC3882Ov0, xa0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> d(@NotNull HA0<? super HM<? super T>, ? extends Object> ha0) {
        return C4564Vv0.d(ha0);
    }

    @NotNull
    @InterfaceC9611sw0
    @InterfaceC8046mW0(name = "debounceDuration")
    @InterfaceC7161ix1
    public static final <T> InterfaceC3882Ov0<T> d0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HA0<? super T, Y70> ha0) {
        return C5931dw0.h(interfaceC3882Ov0, ha0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> d1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super InterfaceC4076Qv0<? super T>, ? super Throwable, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        return C6915hw0.d(interfaceC3882Ov0, xa0);
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> d2(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super Boolean>, ? extends Object> xa0) {
        return C7399jw0.i(interfaceC3882Ov0, xa0);
    }

    @NotNull
    public static final InterfaceC3882Ov0<Integer> e(@NotNull C11197zR0 c11197zR0) {
        return C4564Vv0.e(c11197zR0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @IR1(expression = "onEach { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C8146mw0.k(interfaceC3882Ov0, j);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return C8876pw0.i(interfaceC3882Ov0, va0);
    }

    @HK1
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> e2(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        return C6915hw0.h(interfaceC3882Ov0, xa0);
    }

    @NotNull
    public static final InterfaceC3882Ov0<Long> f(@NotNull W41 w41) {
        return C4564Vv0.f(w41);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @IR1(expression = "onStart { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> f0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C8146mw0.l(interfaceC3882Ov0, j);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> f1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return C6915hw0.e(interfaceC3882Ov0, va0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<C9485sP0<T>> f2(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        return C8876pw0.m(interfaceC3882Ov0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> g(@NotNull B02<? extends T> b02) {
        return C4564Vv0.g(b02);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> g0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        return C6672gw0.e(interfaceC3882Ov0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @IR1(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> g1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov02) {
        return C8146mw0.s(interfaceC3882Ov0, interfaceC3882Ov02);
    }

    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> g2(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0) {
        return C9126qw0.s(interfaceC3882Ov0, interfaceC3882Ov02, xa0);
    }

    @NotNull
    public static final InterfaceC3882Ov0<Integer> h(@NotNull int[] iArr) {
        return C4564Vv0.h(iArr);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> h0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super T, Boolean> va0) {
        return C6672gw0.f(interfaceC3882Ov0, va0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @IR1(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> h1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov02) {
        return C8146mw0.t(interfaceC3882Ov0, interfaceC3882Ov02);
    }

    @NotNull
    public static final InterfaceC3882Ov0<Long> i(@NotNull long[] jArr) {
        return C4564Vv0.i(jArr);
    }

    @NotNull
    public static final <T, K> InterfaceC3882Ov0<T> i0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HA0<? super T, ? extends K> ha0) {
        return C6672gw0.g(interfaceC3882Ov0, ha0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @IR1(expression = "catch { emit(fallback) }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> i1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, T t) {
        return C8146mw0.u(interfaceC3882Ov0, t);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> j(@NotNull T[] tArr) {
        return C4564Vv0.j(tArr);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> j0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i) {
        return C7399jw0.d(interfaceC3882Ov0, i);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @IR1(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> j1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, T t, @NotNull HA0<? super Throwable, Boolean> ha0) {
        return C8146mw0.v(interfaceC3882Ov0, t, ha0);
    }

    @NotNull
    public static final <T> V32<T> k(@NotNull InterfaceC3950Pn1<T> interfaceC3950Pn1) {
        return C8633ow0.a(interfaceC3950Pn1);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> k0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0) {
        return C7399jw0.e(interfaceC3882Ov0, va0);
    }

    @NotNull
    public static final <T> InterfaceC9041qc2<T> l(@NotNull InterfaceC4144Rn1<T> interfaceC4144Rn1) {
        return C8633ow0.b(interfaceC4144Rn1);
    }

    @Nullable
    public static final <T> Object l0(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super C7458kA2> hm) {
        return C4758Xv0.g(interfaceC4076Qv0, interfaceC3882Ov0, hm);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> l1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return C6915hw0.f(interfaceC3882Ov0, va0);
    }

    @Nullable
    public static final <T> Object m0(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull OO1<? extends T> oo1, @NotNull HM<? super C7458kA2> hm) {
        return C4661Wv0.c(interfaceC4076Qv0, oo1, hm);
    }

    @NotNull
    public static final <T> V32<T> m1(@NotNull V32<? extends T> v32, @NotNull VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return C8633ow0.f(v32, va0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> n(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i, @NotNull EnumC7132iq enumC7132iq) {
        return C4962Zv0.b(interfaceC3882Ov0, i, enumC7132iq);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> n0() {
        return C4564Vv0.m();
    }

    @NotNull
    public static final <T> OO1<T> n1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC9974uQ interfaceC9974uQ) {
        return C4661Wv0.e(interfaceC3882Ov0, interfaceC9974uQ);
    }

    public static final void o0(@NotNull InterfaceC4076Qv0<?> interfaceC4076Qv0) {
        C6915hw0.b(interfaceC4076Qv0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @IR1(expression = "this.shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> o1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        return C8146mw0.y(interfaceC3882Ov0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> p0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0) {
        return C8876pw0.b(interfaceC3882Ov0, va0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @IR1(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> p1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i) {
        return C8146mw0.z(interfaceC3882Ov0, i);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStarted.Lazily' argument'", replaceWith = @IR1(expression = "this.shareIn(scope, started = SharingStarted.Lazily, replay = Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> q(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        return C8146mw0.b(interfaceC3882Ov0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> q1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return C8146mw0.A(interfaceC3882Ov0, interfaceC5809dQ);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> r(@InterfaceC5183ar @NotNull VA0<? super AI1<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return C4564Vv0.k(va0);
    }

    @NotNull
    public static final <R> InterfaceC3882Ov0<R> r0(@NotNull InterfaceC3882Ov0<?> interfaceC3882Ov0, @NotNull AW0<R> aw0) {
        return C8876pw0.d(interfaceC3882Ov0, aw0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> r1(@NotNull OO1<? extends T> oo1) {
        return C4661Wv0.f(oo1);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> s(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        return C4962Zv0.e(interfaceC3882Ov0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> s0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0) {
        return C8876pw0.e(interfaceC3882Ov0, va0);
    }

    @Nullable
    public static final <S, T extends S> Object s1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super S, ? super T, ? super HM<? super S>, ? extends Object> xa0, @NotNull HM<? super S> hm) {
        return C8389nw0.i(interfaceC3882Ov0, xa0, hm);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> t(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super InterfaceC4076Qv0<? super T>, ? super Throwable, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        return C7156iw0.a(interfaceC3882Ov0, xa0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> t0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        return C8876pw0.f(interfaceC3882Ov0);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @IR1(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> t1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        return C8146mw0.B(interfaceC3882Ov0);
    }

    @Nullable
    public static final <T> Object u(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super Throwable> hm) {
        return C7156iw0.b(interfaceC3882Ov0, interfaceC4076Qv0, hm);
    }

    @Nullable
    public static final <T> Object u0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        return C8389nw0.a(interfaceC3882Ov0, hm);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @IR1(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> u1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i) {
        return C8146mw0.C(interfaceC3882Ov0, i);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> v(@InterfaceC5183ar @NotNull VA0<? super AI1<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return C4564Vv0.l(va0);
    }

    @Nullable
    public static final <T> Object v0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        return C8389nw0.b(interfaceC3882Ov0, va0, hm);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> v1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j, @NotNull VA0<? super Throwable, ? super HM<? super Boolean>, ? extends Object> va0) {
        return C7156iw0.e(interfaceC3882Ov0, j, va0);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T> InterfaceC3882Ov0<List<T>> w(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i) {
        return C8876pw0.a(interfaceC3882Ov0, i);
    }

    @Nullable
    public static final <T> Object w0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        return C8389nw0.c(interfaceC3882Ov0, hm);
    }

    @Nullable
    public static final Object x(@NotNull InterfaceC3882Ov0<?> interfaceC3882Ov0, @NotNull HM<? super C7458kA2> hm) {
        return C4758Xv0.a(interfaceC3882Ov0, hm);
    }

    @Nullable
    public static final <T> Object x0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        return C8389nw0.d(interfaceC3882Ov0, va0, hm);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> x1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull ZA0<? super InterfaceC4076Qv0<? super T>, ? super Throwable, ? super Long, ? super HM<? super Boolean>, ? extends Object> za0) {
        return C7156iw0.g(interfaceC3882Ov0, za0);
    }

    @NotNull
    public static final OO1<C7458kA2> y0(@NotNull InterfaceC9974uQ interfaceC9974uQ, long j) {
        return C5931dw0.j(interfaceC9974uQ, j);
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> y1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, R r, @InterfaceC5183ar @NotNull XA0<? super R, ? super T, ? super HM<? super R>, ? extends Object> xa0) {
        return C8876pw0.j(interfaceC3882Ov0, r, xa0);
    }

    @Nullable
    public static final <T> Object z(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super Integer, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0, @NotNull HM<? super C7458kA2> hm) {
        return C4758Xv0.d(interfaceC3882Ov0, xa0, hm);
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Flow analogue is 'flatMapConcat'", replaceWith = @IR1(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> z0(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super InterfaceC3882Ov0<? extends R>>, ? extends Object> va0) {
        return C8146mw0.m(interfaceC3882Ov0, va0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> z1(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super T, ? super T, ? super HM<? super T>, ? extends Object> xa0) {
        return C8876pw0.k(interfaceC3882Ov0, xa0);
    }
}
