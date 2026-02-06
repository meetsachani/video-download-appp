package o;

import java.util.concurrent.CancellationException;
import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n105#2:221\n105#2:223\n1#3:222\n159#4:224\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n54#1:221\n128#1:223\n217#1:224\n*E\n"})
/* renamed from: o.iw0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class C7156iw0 {

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,108:1\n55#2,3:109\n*E\n"})
    /* renamed from: o.iw0$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ XA0 Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0}, l = {109, 110}, m = "collect", n = {"this", "$this$catch_u24lambda_u240"}, s = {"L$0", "L$1"})
        /* renamed from: o.iw0$a$a */
        /* loaded from: classes4.dex */
        public static final class C0292a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;
            public Object c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0292a(HM hm) {
                super(hm);
                a.this = r1;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC3882Ov0 interfaceC3882Ov0, XA0 xa0) {
            this.X = interfaceC3882Ov0;
            this.Y = xa0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x006c, code lost:
            if (r6 == r1) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0057  */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            C0292a c0292a;
            int i;
            a<T> aVar;
            Throwable th;
            if (hm instanceof C0292a) {
                c0292a = (C0292a) hm;
                int i2 = c0292a.Z0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0292a.Z0 = i2 - Integer.MIN_VALUE;
                    Object obj = c0292a.Y0;
                    Object l = C7289jT0.l();
                    i = c0292a.Z0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                RT1.n(obj);
                                return C7458kA2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC4076Qv0 = (InterfaceC4076Qv0) c0292a.c1;
                        aVar = (a) c0292a.b1;
                        RT1.n(obj);
                    } else {
                        RT1.n(obj);
                        InterfaceC3882Ov0 interfaceC3882Ov0 = this.X;
                        c0292a.b1 = this;
                        c0292a.c1 = interfaceC4076Qv0;
                        c0292a.Z0 = 1;
                        obj = C4467Uv0.u(interfaceC3882Ov0, interfaceC4076Qv0, c0292a);
                        if (obj != l) {
                            aVar = this;
                        }
                        return l;
                    }
                    th = (Throwable) obj;
                    if (th != null) {
                        XA0 xa0 = aVar.Y;
                        c0292a.b1 = null;
                        c0292a.c1 = null;
                        c0292a.Z0 = 2;
                        UP0.e(6);
                        Object P = xa0.P(interfaceC4076Qv0, th, c0292a);
                        UP0.e(7);
                    }
                    return C7458kA2.a;
                }
            }
            c0292a = new C0292a(hm);
            Object obj2 = c0292a.Y0;
            Object l2 = C7289jT0.l();
            i = c0292a.Z0;
            if (i == 0) {
            }
            th = (Throwable) obj2;
            if (th != null) {
            }
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {C3503Kz.l0}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    /* renamed from: o.iw0$b */
    /* loaded from: classes4.dex */
    public static final class b<T> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public b(HM<? super b> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C4467Uv0.u(null, null, this);
        }
    }

    /* renamed from: o.iw0$c */
    /* loaded from: classes4.dex */
    public static final class c<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ InterfaceC4076Qv0<T> X;
        public final /* synthetic */ RP1.h<Throwable> Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {C3503Kz.n0}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: o.iw0$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public final /* synthetic */ c<T> a1;
            public int b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(c<? super T> cVar, HM<? super a> hm) {
                super(hm);
                this.a1 = cVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Z0 = obj;
                this.b1 |= Integer.MIN_VALUE;
                return this.a1.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, RP1.h<Throwable> hVar) {
            this.X = interfaceC4076Qv0;
            this.Y = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0037  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            c<T> cVar;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.b1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.b1 = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.Z0;
                    Object l = C7289jT0.l();
                    i = aVar.b1;
                    if (i == 0) {
                        if (i == 1) {
                            cVar = (c) aVar.Y0;
                            try {
                                RT1.n(obj);
                            } catch (Throwable t2) {
                                t2 = th;
                                cVar.Y.X = t2;
                                throw ((Throwable) t2);
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        try {
                            InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.X;
                            aVar.Y0 = this;
                            aVar.b1 = 1;
                            if (interfaceC4076Qv0.c(t, aVar) == l) {
                                return l;
                            }
                        } catch (Throwable t22) {
                            t22 = th;
                            cVar = this;
                            cVar.Y.X = t22;
                            throw ((Throwable) t22);
                        }
                    }
                    return C7458kA2.a;
                }
            }
            aVar = new a(this, hm);
            Object obj2 = aVar.Z0;
            Object l2 = C7289jT0.l();
            i = aVar.b1;
            if (i == 0) {
            }
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.iw0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC4225Si2 implements VA0<Throwable, HM<? super Boolean>, Object> {
        public int Z0;

        public d(HM<? super d> hm) {
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
            return ((d) t(th, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new d(hm);
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.iw0$e */
    /* loaded from: classes4.dex */
    public static final class e<T> extends AbstractC4225Si2 implements ZA0<InterfaceC4076Qv0<? super T>, Throwable, Long, HM<? super Boolean>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public /* synthetic */ long b1;
        public final /* synthetic */ long c1;
        public final /* synthetic */ VA0<Throwable, HM<? super Boolean>, Object> d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(long j, VA0<? super Throwable, ? super HM<? super Boolean>, ? extends Object> va0, HM<? super e> hm) {
            super(4, hm);
            this.c1 = j;
            this.d1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0037, code lost:
            if (((java.lang.Boolean) r8).booleanValue() != false) goto L8;
         */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            boolean z = true;
            if (i != 0) {
                if (i == 1) {
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                Throwable th = (Throwable) this.a1;
                if (this.b1 < this.c1) {
                    VA0<Throwable, HM<? super Boolean>, Object> va0 = this.d1;
                    this.Z0 = 1;
                    obj = va0.i(th, this);
                    if (obj == l) {
                        return l;
                    }
                }
                z = false;
                return C10557wp.a(z);
            }
        }

        public final Object U(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, Throwable th, long j, HM<? super Boolean> hm) {
            e eVar = new e(this.c1, this.d1, hm);
            eVar.a1 = th;
            eVar.b1 = j;
            return eVar.F(C7458kA2.a);
        }

        @Override // o.ZA0
        public /* bridge */ /* synthetic */ Object r(Object obj, Throwable th, Long l, HM<? super Boolean> hm) {
            return U((InterfaceC4076Qv0) obj, th, l.longValue(), hm);
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n1#1,108:1\n129#2,15:109\n*E\n"})
    /* renamed from: o.iw0$f */
    /* loaded from: classes4.dex */
    public static final class f<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ ZA0 Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {113, 115}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
        /* renamed from: o.iw0$f$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;
            public Object c1;
            public Object d1;
            public long e1;
            public int f1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HM hm) {
                super(hm);
                f.this = r1;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return f.this.a(null, this);
            }
        }

        public f(InterfaceC3882Ov0 interfaceC3882Ov0, ZA0 za0) {
            this.X = interfaceC3882Ov0;
            this.Y = za0;
        }

        /* JADX WARN: Removed duplicated region for block: B:46:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00ae  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0076 -> B:66:0x00a6). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0097 -> B:63:0x009a). Please submit an issue!!! */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            long j;
            f<T> fVar;
            int i2;
            f<T> fVar2;
            InterfaceC4076Qv0<? super T> interfaceC4076Qv02;
            Throwable th;
            Object u;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i3 = aVar.Z0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    aVar.Z0 = i3 - Integer.MIN_VALUE;
                    Object obj = aVar.Y0;
                    Object l = C7289jT0.l();
                    i = aVar.Z0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                j = aVar.e1;
                                Throwable th2 = (Throwable) aVar.d1;
                                interfaceC4076Qv02 = (InterfaceC4076Qv0) aVar.c1;
                                fVar2 = (f) aVar.b1;
                                RT1.n(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    j++;
                                    i2 = 1;
                                    fVar = fVar2;
                                    if (i2 == 0) {
                                        return C7458kA2.a;
                                    }
                                    interfaceC4076Qv0 = interfaceC4076Qv02;
                                    InterfaceC3882Ov0 interfaceC3882Ov0 = fVar.X;
                                    aVar.b1 = fVar;
                                    aVar.c1 = interfaceC4076Qv0;
                                    aVar.d1 = null;
                                    aVar.e1 = j;
                                    aVar.f1 = 0;
                                    aVar.Z0 = 1;
                                    u = C4467Uv0.u(interfaceC3882Ov0, interfaceC4076Qv0, aVar);
                                    if (u != l) {
                                        interfaceC4076Qv02 = interfaceC4076Qv0;
                                        i2 = 0;
                                        fVar2 = fVar;
                                        obj = u;
                                        th = (Throwable) obj;
                                        if (th != null) {
                                            ZA0 za0 = fVar2.Y;
                                            Long g = C10557wp.g(j);
                                            aVar.b1 = fVar2;
                                            aVar.c1 = interfaceC4076Qv02;
                                            aVar.d1 = th;
                                            aVar.e1 = j;
                                            aVar.Z0 = 2;
                                            UP0.e(6);
                                            Object r = za0.r(interfaceC4076Qv02, th, g, aVar);
                                            UP0.e(7);
                                            if (r != l) {
                                                obj = r;
                                                th2 = th;
                                                if (!((Boolean) obj).booleanValue()) {
                                                    throw th2;
                                                }
                                            }
                                        }
                                        fVar = fVar2;
                                        if (i2 == 0) {
                                        }
                                    }
                                    return l;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            i2 = aVar.f1;
                            j = aVar.e1;
                            interfaceC4076Qv02 = (InterfaceC4076Qv0) aVar.c1;
                            fVar2 = (f) aVar.b1;
                            RT1.n(obj);
                            th = (Throwable) obj;
                            if (th != null) {
                            }
                            fVar = fVar2;
                            if (i2 == 0) {
                            }
                        }
                    } else {
                        RT1.n(obj);
                        j = 0;
                        fVar = this;
                        InterfaceC3882Ov0 interfaceC3882Ov02 = fVar.X;
                        aVar.b1 = fVar;
                        aVar.c1 = interfaceC4076Qv0;
                        aVar.d1 = null;
                        aVar.e1 = j;
                        aVar.f1 = 0;
                        aVar.Z0 = 1;
                        u = C4467Uv0.u(interfaceC3882Ov02, interfaceC4076Qv0, aVar);
                        if (u != l) {
                        }
                        return l;
                    }
                }
            }
            aVar = new a(hm);
            Object obj2 = aVar.Y0;
            Object l2 = C7289jT0.l();
            i = aVar.Z0;
            if (i == 0) {
            }
        }
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> a(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super InterfaceC4076Qv0<? super T>, ? super Throwable, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        return new a(interfaceC3882Ov0, xa0);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0037  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object b(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super Throwable> hm) {
        b bVar;
        int i;
        RP1.h hVar;
        Throwable th;
        if (hm instanceof b) {
            bVar = (b) hm;
            int i2 = bVar.a1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.a1 = i2 - Integer.MIN_VALUE;
                Object obj = bVar.Z0;
                Object l = C7289jT0.l();
                i = bVar.a1;
                if (i == 0) {
                    if (i == 1) {
                        hVar = (RP1.h) bVar.Y0;
                        try {
                            RT1.n(obj);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.h hVar2 = new RP1.h();
                    try {
                        InterfaceC4076Qv0<? super Object> cVar = new c<>(interfaceC4076Qv0, hVar2);
                        bVar.Y0 = hVar2;
                        bVar.a1 = 1;
                        if (interfaceC3882Ov0.a(cVar, bVar) == l) {
                            return l;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        hVar = hVar2;
                    }
                }
                th = (Throwable) hVar.X;
                if (d(th, th) && !c(th, bVar.getContext())) {
                    if (th == null) {
                        return th;
                    }
                    if (th instanceof CancellationException) {
                        C3917Pf0.a(th, th);
                        throw th;
                    }
                    C3917Pf0.a(th, th);
                    throw th;
                }
                throw th;
            }
        }
        bVar = new b(hm);
        Object obj2 = bVar.Z0;
        Object l2 = C7289jT0.l();
        i = bVar.a1;
        if (i == 0) {
        }
        th = (Throwable) hVar.X;
        if (d(th, th)) {
        }
        throw th;
    }

    public static final boolean c(Throwable th, InterfaceC5809dQ interfaceC5809dQ) {
        RU0 ru0 = (RU0) interfaceC5809dQ.f(RU0.W);
        if (ru0 != null && ru0.isCancelled()) {
            return d(th, ru0.u());
        }
        return false;
    }

    public static final boolean d(Throwable th, Throwable th2) {
        if (th2 != null && C6562gT0.g(th2, th)) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j, @NotNull VA0<? super Throwable, ? super HM<? super Boolean>, ? extends Object> va0) {
        if (j > 0) {
            return C4467Uv0.x1(interfaceC3882Ov0, new e(j, va0, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j).toString());
    }

    public static /* synthetic */ InterfaceC3882Ov0 f(InterfaceC3882Ov0 interfaceC3882Ov0, long j, VA0 va0, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        if ((i & 2) != 0) {
            va0 = new d(null);
        }
        return C4467Uv0.v1(interfaceC3882Ov0, j, va0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> g(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull ZA0<? super InterfaceC4076Qv0<? super T>, ? super Throwable, ? super Long, ? super HM<? super Boolean>, ? extends Object> za0) {
        return new f(interfaceC3882Ov0, za0);
    }
}
