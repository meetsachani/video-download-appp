package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
/* renamed from: o.iT0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7048iT0 {

    /* renamed from: o.iT0$a */
    /* loaded from: classes3.dex */
    public static final class a extends LT1 {
        public int Y;
        public final /* synthetic */ HA0<HM<? super T>, Object> Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(HM<? super T> hm, HA0<? super HM<? super T>, ? extends Object> ha0) {
            super(hm);
            this.Z = ha0;
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o.AbstractC5644cl
        public Object F(Object obj) {
            int i = this.Y;
            if (i != 0) {
                if (i == 1) {
                    this.Y = 2;
                    RT1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.Y = 1;
            RT1.n(obj);
            return this.Z.invoke(this);
        }
    }

    /* renamed from: o.iT0$b */
    /* loaded from: classes3.dex */
    public static final class b extends KM {
        public int Y0;
        public final /* synthetic */ HA0<HM<? super T>, Object> Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(HM<? super T> hm, InterfaceC5809dQ interfaceC5809dQ, HA0<? super HM<? super T>, ? extends Object> ha0) {
            super(hm, interfaceC5809dQ);
            this.Z0 = ha0;
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o.AbstractC5644cl
        public Object F(Object obj) {
            int i = this.Y0;
            if (i != 0) {
                if (i == 1) {
                    this.Y0 = 2;
                    RT1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.Y0 = 1;
            RT1.n(obj);
            return this.Z0.invoke(this);
        }
    }

    @InterfaceC8303na2({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,222:1\n131#2:223\n*E\n"})
    /* renamed from: o.iT0$c */
    /* loaded from: classes3.dex */
    public static final class c extends LT1 {
        public int Y;
        public final /* synthetic */ HA0 Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HM hm, HA0 ha0) {
            super(hm);
            this.Z = ha0;
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o.AbstractC5644cl
        public Object F(Object obj) {
            int i = this.Y;
            if (i != 0) {
                if (i == 1) {
                    this.Y = 2;
                    RT1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.Y = 1;
            RT1.n(obj);
            C6562gT0.n(this.Z, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            return ((HA0) C11313zv2.q(this.Z, 1)).invoke(this);
        }
    }

    @InterfaceC8303na2({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,240:1\n131#2:241\n*E\n"})
    /* renamed from: o.iT0$d */
    /* loaded from: classes3.dex */
    public static final class d extends KM {
        public int Y0;
        public final /* synthetic */ HA0 Z0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HM hm, InterfaceC5809dQ interfaceC5809dQ, HA0 ha0) {
            super(hm, interfaceC5809dQ);
            this.Z0 = ha0;
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o.AbstractC5644cl
        public Object F(Object obj) {
            int i = this.Y0;
            if (i != 0) {
                if (i == 1) {
                    this.Y0 = 2;
                    RT1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.Y0 = 1;
            RT1.n(obj);
            C6562gT0.n(this.Z0, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            return ((HA0) C11313zv2.q(this.Z0, 1)).invoke(this);
        }
    }

    @InterfaceC8303na2({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,222:1\n166#2:223\n*E\n"})
    /* renamed from: o.iT0$e */
    /* loaded from: classes3.dex */
    public static final class e extends LT1 {
        public int Y;
        public final /* synthetic */ Object Y0;
        public final /* synthetic */ VA0 Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HM hm, VA0 va0, Object obj) {
            super(hm);
            this.Z = va0;
            this.Y0 = obj;
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o.AbstractC5644cl
        public Object F(Object obj) {
            int i = this.Y;
            if (i != 0) {
                if (i == 1) {
                    this.Y = 2;
                    RT1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.Y = 1;
            RT1.n(obj);
            C6562gT0.n(this.Z, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            return ((VA0) C11313zv2.q(this.Z, 2)).i(this.Y0, this);
        }
    }

    @InterfaceC8303na2({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,240:1\n166#2:241\n*E\n"})
    /* renamed from: o.iT0$f */
    /* loaded from: classes3.dex */
    public static final class f extends KM {
        public int Y0;
        public final /* synthetic */ VA0 Z0;
        public final /* synthetic */ Object a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HM hm, InterfaceC5809dQ interfaceC5809dQ, VA0 va0, Object obj) {
            super(hm, interfaceC5809dQ);
            this.Z0 = va0;
            this.a1 = obj;
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o.AbstractC5644cl
        public Object F(Object obj) {
            int i = this.Y0;
            if (i != 0) {
                if (i == 1) {
                    this.Y0 = 2;
                    RT1.n(obj);
                    return obj;
                }
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.Y0 = 1;
            RT1.n(obj);
            C6562gT0.n(this.Z0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            return ((VA0) C11313zv2.q(this.Z0, 2)).i(this.a1, this);
        }
    }

    /* renamed from: o.iT0$g */
    /* loaded from: classes3.dex */
    public static final class g extends LT1 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(HM<? super T> hm) {
            super(hm);
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o.AbstractC5644cl
        public Object F(Object obj) {
            RT1.n(obj);
            return obj;
        }
    }

    /* renamed from: o.iT0$h */
    /* loaded from: classes3.dex */
    public static final class h extends KM {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(HM<? super T> hm, InterfaceC5809dQ interfaceC5809dQ) {
            super(hm, interfaceC5809dQ);
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // o.AbstractC5644cl
        public Object F(Object obj) {
            RT1.n(obj);
            return obj;
        }
    }

    @InterfaceC6480g82(version = "1.3")
    public static final <T> HM<C7458kA2> a(HM<? super T> hm, HA0<? super HM<? super T>, ? extends Object> ha0) {
        InterfaceC5809dQ context = hm.getContext();
        if (context == C3897Pa0.X) {
            return new a(hm, ha0);
        }
        return new b(hm, context, ha0);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <T> HM<C7458kA2> b(@NotNull HA0<? super HM<? super T>, ? extends Object> ha0, @NotNull HM<? super T> hm) {
        C6562gT0.p(ha0, "<this>");
        C6562gT0.p(hm, "completion");
        HM<?> a2 = MV.a(hm);
        if (ha0 instanceof AbstractC5644cl) {
            return ((AbstractC5644cl) ha0).u(a2);
        }
        InterfaceC5809dQ context = a2.getContext();
        if (context == C3897Pa0.X) {
            return new c(a2, ha0);
        }
        return new d(a2, context, ha0);
    }

    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <R, T> HM<C7458kA2> c(@NotNull VA0<? super R, ? super HM<? super T>, ? extends Object> va0, R r, @NotNull HM<? super T> hm) {
        C6562gT0.p(va0, "<this>");
        C6562gT0.p(hm, "completion");
        HM<?> a2 = MV.a(hm);
        if (va0 instanceof AbstractC5644cl) {
            return ((AbstractC5644cl) va0).t(r, a2);
        }
        InterfaceC5809dQ context = a2.getContext();
        if (context == C3897Pa0.X) {
            return new e(a2, va0, r);
        }
        return new f(a2, context, va0, r);
    }

    public static final <T> HM<T> d(HM<? super T> hm) {
        InterfaceC5809dQ context = hm.getContext();
        if (context == C3897Pa0.X) {
            return new g(hm);
        }
        return new h(hm, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6480g82(version = "1.3")
    @NotNull
    public static <T> HM<T> e(@NotNull HM<? super T> hm) {
        KM km;
        HM<T> hm2;
        C6562gT0.p(hm, "<this>");
        if (hm instanceof KM) {
            km = (KM) hm;
        } else {
            km = null;
        }
        if (km != null && (hm2 = (HM<T>) km.O()) != null) {
            return hm2;
        }
        return hm;
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <T> Object f(HA0<? super HM<? super T>, ? extends Object> ha0, HM<? super T> hm) {
        C6562gT0.p(ha0, "<this>");
        C6562gT0.p(hm, "completion");
        if (!(ha0 instanceof AbstractC5644cl)) {
            return i(ha0, hm);
        }
        return ((HA0) C11313zv2.q(ha0, 1)).invoke(hm);
    }

    @XP0
    @InterfaceC6480g82(version = "1.3")
    public static final <R, T> Object g(VA0<? super R, ? super HM<? super T>, ? extends Object> va0, R r, HM<? super T> hm) {
        C6562gT0.p(va0, "<this>");
        C6562gT0.p(hm, "completion");
        if (!(va0 instanceof AbstractC5644cl)) {
            return j(va0, r, hm);
        }
        return ((VA0) C11313zv2.q(va0, 2)).i(r, hm);
    }

    @XP0
    public static final <R, P, T> Object h(XA0<? super R, ? super P, ? super HM<? super T>, ? extends Object> xa0, R r, P p, HM<? super T> hm) {
        C6562gT0.p(xa0, "<this>");
        C6562gT0.p(hm, "completion");
        if (!(xa0 instanceof AbstractC5644cl)) {
            return k(xa0, r, p, hm);
        }
        return ((XA0) C11313zv2.q(xa0, 3)).P(r, p, hm);
    }

    @HK1
    @Nullable
    public static final <T> Object i(@NotNull HA0<? super HM<? super T>, ? extends Object> ha0, @NotNull HM<? super T> hm) {
        C6562gT0.p(ha0, "<this>");
        C6562gT0.p(hm, "completion");
        return ((HA0) C11313zv2.q(ha0, 1)).invoke(d(MV.a(hm)));
    }

    @HK1
    @Nullable
    public static <R, T> Object j(@NotNull VA0<? super R, ? super HM<? super T>, ? extends Object> va0, R r, @NotNull HM<? super T> hm) {
        C6562gT0.p(va0, "<this>");
        C6562gT0.p(hm, "completion");
        return ((VA0) C11313zv2.q(va0, 2)).i(r, d(MV.a(hm)));
    }

    @HK1
    @Nullable
    public static <R, P, T> Object k(@NotNull XA0<? super R, ? super P, ? super HM<? super T>, ? extends Object> xa0, R r, P p, @NotNull HM<? super T> hm) {
        C6562gT0.p(xa0, "<this>");
        C6562gT0.p(hm, "completion");
        return ((XA0) C11313zv2.q(xa0, 3)).P(r, p, d(MV.a(hm)));
    }
}
