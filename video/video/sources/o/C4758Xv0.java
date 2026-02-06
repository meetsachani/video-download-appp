package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Xv0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class C4758Xv0 {

    /* renamed from: o.Xv0$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements InterfaceC4076Qv0<T> {
        public final /* synthetic */ VA0<T, HM<? super C7458kA2>, Object> X;

        /* renamed from: o.Xv0$a$a */
        /* loaded from: classes4.dex */
        public static final class C0251a extends KM {
            public /* synthetic */ Object Y0;
            public int a1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0251a(HM<? super C0251a> hm) {
                super(hm);
                a.this = r1;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return a.this.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0) {
            this.X = va0;
        }

        public Object a(T t, HM<? super C7458kA2> hm) {
            UP0.e(4);
            new C0251a(hm);
            UP0.e(5);
            this.X.i(t, hm);
            return C7458kA2.a;
        }

        @Override // o.InterfaceC4076Qv0
        public Object c(T t, HM<? super C7458kA2> hm) {
            Object i = this.X.i(t, hm);
            if (i == C7289jT0.l()) {
                return i;
            }
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nCollect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,114:1\n29#2,4:115\n*S KotlinDebug\n*F\n+ 1 Collect.kt\nkotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2\n*L\n58#1:115,4\n*E\n"})
    /* renamed from: o.Xv0$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements InterfaceC4076Qv0<T> {
        public int X;
        public final /* synthetic */ XA0<Integer, T, HM<? super C7458kA2>, Object> Y;

        /* renamed from: o.Xv0$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int a1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HM<? super a> hm) {
                super(hm);
                b.this = r1;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return b.this.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(XA0<? super Integer, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
            this.Y = xa0;
        }

        public Object a(T t, HM<? super C7458kA2> hm) {
            UP0.e(4);
            new a(hm);
            UP0.e(5);
            XA0<Integer, T, HM<? super C7458kA2>, Object> xa0 = this.Y;
            int i = this.X;
            this.X = i + 1;
            if (i >= 0) {
                xa0.P(Integer.valueOf(i), t, hm);
                return C7458kA2.a;
            }
            throw new ArithmeticException("Index overflow has happened");
        }

        @Override // o.InterfaceC4076Qv0
        public Object c(T t, HM<? super C7458kA2> hm) {
            XA0<Integer, T, HM<? super C7458kA2>, Object> xa0 = this.Y;
            int i = this.X;
            this.X = i + 1;
            if (i >= 0) {
                Object P = xa0.P(C10557wp.f(i), t, hm);
                if (P == C7289jT0.l()) {
                    return P;
                }
                return C7458kA2.a;
            }
            throw new ArithmeticException("Index overflow has happened");
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.Xv0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ InterfaceC3882Ov0<T> a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HM<? super c> hm) {
            super(2, hm);
            this.a1 = interfaceC3882Ov0;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                InterfaceC3882Ov0<T> interfaceC3882Ov0 = this.a1;
                this.Z0 = 1;
                if (C4467Uv0.x(interfaceC3882Ov0, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((c) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new c(this.a1, hm);
        }
    }

    @Nullable
    public static final Object a(@NotNull InterfaceC3882Ov0<?> interfaceC3882Ov0, @NotNull HM<? super C7458kA2> hm) {
        Object a2 = interfaceC3882Ov0.a(C8370nr1.X, hm);
        if (a2 == C7289jT0.l()) {
            return a2;
        }
        return C7458kA2.a;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object b(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0, HM<? super C7458kA2> hm) {
        Object a2 = interfaceC3882Ov0.a(new a(va0), hm);
        if (a2 == C7289jT0.l()) {
            return a2;
        }
        return C7458kA2.a;
    }

    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Backwards compatibility with JS and K/N")
    public static final /* synthetic */ <T> Object c(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0, HM<? super C7458kA2> hm) {
        a aVar = new a(va0);
        UP0.e(0);
        interfaceC3882Ov0.a(aVar, hm);
        UP0.e(1);
        return C7458kA2.a;
    }

    @Nullable
    public static final <T> Object d(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super Integer, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0, @NotNull HM<? super C7458kA2> hm) {
        Object a2 = interfaceC3882Ov0.a(new b(xa0), hm);
        if (a2 == C7289jT0.l()) {
            return a2;
        }
        return C7458kA2.a;
    }

    public static final <T> Object e(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, XA0<? super Integer, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0, HM<? super C7458kA2> hm) {
        b bVar = new b(xa0);
        UP0.e(0);
        interfaceC3882Ov0.a(bVar, hm);
        UP0.e(1);
        return C7458kA2.a;
    }

    @Nullable
    public static final <T> Object f(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0, @NotNull HM<? super C7458kA2> hm) {
        InterfaceC3882Ov0 d;
        d = C4962Zv0.d(C4467Uv0.W0(interfaceC3882Ov0, va0), 0, null, 2, null);
        Object x = C4467Uv0.x(d, hm);
        if (x == C7289jT0.l()) {
            return x;
        }
        return C7458kA2.a;
    }

    @Nullable
    public static final <T> Object g(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super C7458kA2> hm) {
        C4467Uv0.o0(interfaceC4076Qv0);
        Object a2 = interfaceC3882Ov0.a(interfaceC4076Qv0, hm);
        if (a2 == C7289jT0.l()) {
            return a2;
        }
        return C7458kA2.a;
    }

    @NotNull
    public static final <T> RU0 h(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC9974uQ interfaceC9974uQ) {
        RU0 f;
        f = C5910dr.f(interfaceC9974uQ, null, null, new c(interfaceC3882Ov0, null), 3, null);
        return f;
    }
}
