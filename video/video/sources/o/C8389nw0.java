package o;

import java.util.NoSuchElementException;
import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,168:1\n123#2,15:169\n123#2,15:184\n123#2,15:199\n123#2,15:214\n123#2,15:229\n*S KotlinDebug\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n68#1:169,15\n88#1:184,15\n102#1:199,15\n120#1:214,15\n133#1:229,15\n*E\n"})
/* renamed from: o.nw0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8389nw0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,130:1\n89#2,2:131\n*E\n"})
    /* renamed from: o.nw0$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements InterfaceC4076Qv0<T> {
        public final /* synthetic */ RP1.h X;

        public a(RP1.h hVar) {
            this.X = hVar;
        }

        @Override // o.InterfaceC4076Qv0
        public Object c(T t, HM<? super C7458kA2> hm) {
            this.X.X = t;
            throw new H(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,130:1\n103#2,6:131\n*E\n"})
    /* renamed from: o.nw0$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements InterfaceC4076Qv0<T> {
        public final /* synthetic */ VA0 X;
        public final /* synthetic */ RP1.h Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {131}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        /* renamed from: o.nw0$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public int a1;
            public Object c1;

            public a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Z0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return b.this.c(null, this);
            }
        }

        public b(VA0 va0, RP1.h hVar) {
            this.X = va0;
            this.Y = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            Object obj;
            int i;
            b<T> bVar;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.a1 = i2 - Integer.MIN_VALUE;
                    obj = aVar.Z0;
                    Object l = C7289jT0.l();
                    i = aVar.a1;
                    if (i == 0) {
                        if (i == 1) {
                            t = (T) aVar.c1;
                            bVar = (b) aVar.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        VA0 va0 = this.X;
                        aVar.Y0 = this;
                        aVar.c1 = t;
                        aVar.a1 = 1;
                        UP0.e(6);
                        obj = va0.i(t, aVar);
                        UP0.e(7);
                        if (obj == l) {
                            return l;
                        }
                        bVar = this;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return C7458kA2.a;
                    }
                    bVar.Y.X = t;
                    throw new H(bVar);
                }
            }
            aVar = new a(hm);
            obj = aVar.Z0;
            Object l2 = C7289jT0.l();
            i = aVar.a1;
            if (i == 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* renamed from: o.nw0$c */
    /* loaded from: classes4.dex */
    public static final class c<T> extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public int b1;

        public c(HM<? super c> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.a1 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return C4467Uv0.u0(null, this);
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0, 0}, l = {179}, m = "first", n = {"predicate", "result", "collector$iv"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: o.nw0$d */
    /* loaded from: classes4.dex */
    public static final class d<T> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public d(HM<? super d> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            return C4467Uv0.v0(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,130:1\n121#2,2:131\n*E\n"})
    /* renamed from: o.nw0$e */
    /* loaded from: classes4.dex */
    public static final class e<T> implements InterfaceC4076Qv0<T> {
        public final /* synthetic */ RP1.h X;

        public e(RP1.h hVar) {
            this.X = hVar;
        }

        @Override // o.InterfaceC4076Qv0
        public Object c(T t, HM<? super C7458kA2> hm) {
            this.X.X = t;
            throw new H(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,130:1\n134#2,6:131\n*E\n"})
    /* renamed from: o.nw0$f */
    /* loaded from: classes4.dex */
    public static final class f<T> implements InterfaceC4076Qv0<T> {
        public final /* synthetic */ VA0 X;
        public final /* synthetic */ RP1.h Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", i = {0, 0}, l = {131}, m = "emit", n = {"this", "it"}, s = {"L$0", "L$1"})
        /* renamed from: o.nw0$f$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public int a1;
            public Object c1;

            public a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Z0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return f.this.c(null, this);
            }
        }

        public f(VA0 va0, RP1.h hVar) {
            this.X = va0;
            this.Y = hVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            Object obj;
            int i;
            f<T> fVar;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.a1 = i2 - Integer.MIN_VALUE;
                    obj = aVar.Z0;
                    Object l = C7289jT0.l();
                    i = aVar.a1;
                    if (i == 0) {
                        if (i == 1) {
                            t = (T) aVar.c1;
                            fVar = (f) aVar.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        VA0 va0 = this.X;
                        aVar.Y0 = this;
                        aVar.c1 = t;
                        aVar.a1 = 1;
                        UP0.e(6);
                        obj = va0.i(t, aVar);
                        UP0.e(7);
                        if (obj == l) {
                            return l;
                        }
                        fVar = this;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return C7458kA2.a;
                    }
                    fVar.Y.X = t;
                    throw new H(fVar);
                }
            }
            aVar = new a(hm);
            obj = aVar.Z0;
            Object l2 = C7289jT0.l();
            i = aVar.a1;
            if (i == 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* renamed from: o.nw0$g */
    /* loaded from: classes4.dex */
    public static final class g<T> extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public int b1;

        public g(HM<? super g> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.a1 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return C4467Uv0.w0(null, this);
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* renamed from: o.nw0$h */
    /* loaded from: classes4.dex */
    public static final class h<T> extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public int b1;

        public h(HM<? super h> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.a1 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return C4467Uv0.x0(null, null, this);
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {40}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    /* renamed from: o.nw0$i */
    /* loaded from: classes4.dex */
    public static final class i<T, R> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public i(HM<? super i> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C8389nw0.e(null, null, null, this);
        }
    }

    /* renamed from: o.nw0$j */
    /* loaded from: classes4.dex */
    public static final class j<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.h<R> X;
        public final /* synthetic */ XA0<R, T, HM<? super R>, Object> Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2", f = "Reduce.kt", i = {}, l = {41}, m = "emit", n = {}, s = {})
        /* renamed from: o.nw0$j$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public final /* synthetic */ j<T> a1;
            public int b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(j<? super T> jVar, HM<? super a> hm) {
                super(hm);
                this.a1 = jVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Z0 = obj;
                this.b1 |= Integer.MIN_VALUE;
                return this.a1.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public j(RP1.h<R> hVar, XA0<? super R, ? super T, ? super HM<? super R>, ? extends Object> xa0) {
            this.X = hVar;
            this.Y = xa0;
        }

        public final Object a(T t, HM<? super C7458kA2> hm) {
            UP0.e(4);
            new a(this, hm);
            UP0.e(5);
            RP1.h<R> hVar = this.X;
            hVar.X = (T) this.Y.P(hVar.X, t, hm);
            return C7458kA2.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            RP1.h hVar;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.b1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.b1 = i2 - Integer.MIN_VALUE;
                    T t2 = (T) aVar.Z0;
                    Object l = C7289jT0.l();
                    i = aVar.b1;
                    if (i == 0) {
                        if (i == 1) {
                            hVar = (RP1.h) aVar.Y0;
                            RT1.n(t2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(t2);
                        RP1.h hVar2 = this.X;
                        XA0<R, T, HM<? super R>, Object> xa0 = this.Y;
                        T t3 = hVar2.X;
                        aVar.Y0 = hVar2;
                        aVar.b1 = 1;
                        Object P = xa0.P(t3, t, aVar);
                        if (P == l) {
                            return l;
                        }
                        t2 = (T) P;
                        hVar = hVar2;
                    }
                    hVar.X = t2;
                    return C7458kA2.a;
                }
            }
            aVar = new a(this, hm);
            T t22 = (T) aVar.Z0;
            Object l2 = C7289jT0.l();
            i = aVar.b1;
            if (i == 0) {
            }
            hVar.X = t22;
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {C3503Kz.k0}, m = "last", n = {"result"}, s = {"L$0"})
    /* renamed from: o.nw0$k */
    /* loaded from: classes4.dex */
    public static final class k<T> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public k(HM<? super k> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C4467Uv0.S0(null, this);
        }
    }

    /* renamed from: o.nw0$l */
    /* loaded from: classes4.dex */
    public static final class l<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.h<Object> X;

        public l(RP1.h<Object> hVar) {
            this.X = hVar;
        }

        @Override // o.InterfaceC4076Qv0
        public final Object c(T t, HM<? super C7458kA2> hm) {
            this.X.X = t;
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {C10997yd1.o1}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    /* renamed from: o.nw0$m */
    /* loaded from: classes4.dex */
    public static final class m<T> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public m(HM<? super m> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C4467Uv0.T0(null, this);
        }
    }

    /* renamed from: o.nw0$n */
    /* loaded from: classes4.dex */
    public static final class n<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.h<T> X;

        public n(RP1.h<T> hVar) {
            this.X = hVar;
        }

        @Override // o.InterfaceC4076Qv0
        public final Object c(T t, HM<? super C7458kA2> hm) {
            this.X.X = t;
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {18}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    /* renamed from: o.nw0$o */
    /* loaded from: classes4.dex */
    public static final class o<S, T extends S> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public o(HM<? super o> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C4467Uv0.s1(null, null, this);
        }
    }

    /* renamed from: o.nw0$p */
    /* loaded from: classes4.dex */
    public static final class p<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.h<Object> X;
        public final /* synthetic */ XA0<S, T, HM<? super S>, Object> Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {21}, m = "emit", n = {}, s = {})
        /* renamed from: o.nw0$p$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public final /* synthetic */ p<T> a1;
            public int b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(p<? super T> pVar, HM<? super a> hm) {
                super(hm);
                this.a1 = pVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Z0 = obj;
                this.b1 |= Integer.MIN_VALUE;
                return this.a1.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public p(RP1.h<Object> hVar, XA0<? super S, ? super T, ? super HM<? super S>, ? extends Object> xa0) {
            this.X = hVar;
            this.Y = xa0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Type inference failed for: r8v5 */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            RP1.h<Object> hVar;
            RP1.h<Object> hVar2;
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
                            hVar2 = (RP1.h) aVar.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        hVar = this.X;
                        Object obj2 = hVar.X;
                        if (obj2 != C9596ss1.a) {
                            XA0 xa0 = this.Y;
                            aVar.Y0 = hVar;
                            aVar.b1 = 1;
                            Object P = xa0.P(obj2, t, aVar);
                            if (P == l) {
                                return l;
                            }
                            obj = P;
                            hVar2 = hVar;
                        }
                        hVar.X = t;
                        return C7458kA2.a;
                    }
                    T t2 = obj;
                    hVar = hVar2;
                    t = t2;
                    hVar.X = t;
                    return C7458kA2.a;
                }
            }
            aVar = new a(this, hm);
            Object obj3 = aVar.Z0;
            Object l2 = C7289jT0.l();
            i = aVar.b1;
            if (i == 0) {
            }
            T t22 = obj3;
            hVar = hVar2;
            t = t22;
            hVar.X = t;
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {53}, m = "single", n = {"result"}, s = {"L$0"})
    /* renamed from: o.nw0$q */
    /* loaded from: classes4.dex */
    public static final class q<T> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public q(HM<? super q> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C4467Uv0.H1(null, this);
        }
    }

    @InterfaceC8303na2({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$single$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
    /* renamed from: o.nw0$r */
    /* loaded from: classes4.dex */
    public static final class r<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.h<Object> X;

        public r(RP1.h<Object> hVar) {
            this.X = hVar;
        }

        @Override // o.InterfaceC4076Qv0
        public final Object c(T t, HM<? super C7458kA2> hm) {
            RP1.h<Object> hVar = this.X;
            if (hVar.X == C9596ss1.a) {
                hVar.X = t;
                return C7458kA2.a;
            }
            throw new IllegalArgumentException("Flow has more than one element");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,130:1\n70#2,8:131\n*E\n"})
    /* renamed from: o.nw0$s */
    /* loaded from: classes4.dex */
    public static final class s<T> implements InterfaceC4076Qv0<T> {
        public final /* synthetic */ RP1.h X;

        public s(RP1.h hVar) {
            this.X = hVar;
        }

        @Override // o.InterfaceC4076Qv0
        public Object c(T t, HM<? super C7458kA2> hm) {
            RP1.h hVar = this.X;
            T t2 = hVar.X;
            T t3 = (T) C9596ss1.a;
            if (t2 == t3) {
                hVar.X = t;
                return C7458kA2.a;
            }
            hVar.X = t3;
            throw new H(this);
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    /* renamed from: o.nw0$t */
    /* loaded from: classes4.dex */
    public static final class t<T> extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public int b1;

        public t(HM<? super t> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.a1 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return C4467Uv0.I1(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object a(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        c cVar;
        int i2;
        RP1.h hVar;
        H e2;
        InterfaceC4076Qv0<? super Object> interfaceC4076Qv0;
        T t2;
        if (hm instanceof c) {
            cVar = (c) hm;
            int i3 = cVar.b1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.b1 = i3 - Integer.MIN_VALUE;
                Object obj = cVar.a1;
                Object l2 = C7289jT0.l();
                i2 = cVar.b1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        interfaceC4076Qv0 = (a) cVar.Z0;
                        hVar = (RP1.h) cVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (H e3) {
                            e2 = e3;
                            C4370Tv0.b(e2, interfaceC4076Qv0);
                            t2 = hVar.X;
                            if (t2 == C9596ss1.a) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.h hVar2 = new RP1.h();
                    hVar2.X = (T) C9596ss1.a;
                    InterfaceC4076Qv0<? super Object> aVar = new a<>(hVar2);
                    try {
                        cVar.Y0 = hVar2;
                        cVar.Z0 = aVar;
                        cVar.b1 = 1;
                        if (interfaceC3882Ov0.a(aVar, cVar) == l2) {
                            return l2;
                        }
                        hVar = hVar2;
                    } catch (H e4) {
                        hVar = hVar2;
                        e2 = e4;
                        interfaceC4076Qv0 = aVar;
                        C4370Tv0.b(e2, interfaceC4076Qv0);
                        t2 = hVar.X;
                        if (t2 == C9596ss1.a) {
                        }
                    }
                }
                t2 = hVar.X;
                if (t2 == C9596ss1.a) {
                    return t2;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        cVar = new c(hm);
        Object obj2 = cVar.a1;
        Object l22 = C7289jT0.l();
        i2 = cVar.b1;
        if (i2 == 0) {
        }
        t2 = hVar.X;
        if (t2 == C9596ss1.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object b(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        d dVar;
        int i2;
        VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va02;
        RP1.h hVar;
        H e2;
        InterfaceC4076Qv0<? super Object> interfaceC4076Qv0;
        T t2;
        if (hm instanceof d) {
            dVar = (d) hm;
            int i3 = dVar.c1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.c1 = i3 - Integer.MIN_VALUE;
                Object obj = dVar.b1;
                Object l2 = C7289jT0.l();
                i2 = dVar.c1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        interfaceC4076Qv0 = (b) dVar.a1;
                        hVar = (RP1.h) dVar.Z0;
                        va02 = (VA0) dVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (H e3) {
                            e2 = e3;
                            C4370Tv0.b(e2, interfaceC4076Qv0);
                            t2 = hVar.X;
                            if (t2 == C9596ss1.a) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.h hVar2 = new RP1.h();
                    hVar2.X = (T) C9596ss1.a;
                    InterfaceC4076Qv0<? super Object> bVar = new b<>(va0, hVar2);
                    try {
                        dVar.Y0 = va0;
                        dVar.Z0 = hVar2;
                        dVar.a1 = bVar;
                        dVar.c1 = 1;
                        if (interfaceC3882Ov0.a(bVar, dVar) == l2) {
                            return l2;
                        }
                        va02 = va0;
                        hVar = hVar2;
                    } catch (H e4) {
                        va02 = va0;
                        hVar = hVar2;
                        e2 = e4;
                        interfaceC4076Qv0 = bVar;
                        C4370Tv0.b(e2, interfaceC4076Qv0);
                        t2 = hVar.X;
                        if (t2 == C9596ss1.a) {
                        }
                    }
                }
                t2 = hVar.X;
                if (t2 == C9596ss1.a) {
                    return t2;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + va02);
            }
        }
        dVar = new d(hm);
        Object obj2 = dVar.b1;
        Object l22 = C7289jT0.l();
        i2 = dVar.c1;
        if (i2 == 0) {
        }
        t2 = hVar.X;
        if (t2 == C9596ss1.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object c(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        g gVar;
        int i2;
        RP1.h hVar;
        H e2;
        InterfaceC4076Qv0<? super Object> interfaceC4076Qv0;
        if (hm instanceof g) {
            gVar = (g) hm;
            int i3 = gVar.b1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.b1 = i3 - Integer.MIN_VALUE;
                Object obj = gVar.a1;
                Object l2 = C7289jT0.l();
                i2 = gVar.b1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        interfaceC4076Qv0 = (e) gVar.Z0;
                        hVar = (RP1.h) gVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (H e3) {
                            e2 = e3;
                            C4370Tv0.b(e2, interfaceC4076Qv0);
                            return hVar.X;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.h hVar2 = new RP1.h();
                    InterfaceC4076Qv0<? super Object> eVar = new e<>(hVar2);
                    try {
                        gVar.Y0 = hVar2;
                        gVar.Z0 = eVar;
                        gVar.b1 = 1;
                        if (interfaceC3882Ov0.a(eVar, gVar) == l2) {
                            return l2;
                        }
                        hVar = hVar2;
                    } catch (H e4) {
                        hVar = hVar2;
                        e2 = e4;
                        interfaceC4076Qv0 = eVar;
                        C4370Tv0.b(e2, interfaceC4076Qv0);
                        return hVar.X;
                    }
                }
                return hVar.X;
            }
        }
        gVar = new g(hm);
        Object obj2 = gVar.a1;
        Object l22 = C7289jT0.l();
        i2 = gVar.b1;
        if (i2 == 0) {
        }
        return hVar.X;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object d(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        h hVar;
        int i2;
        RP1.h hVar2;
        H e2;
        InterfaceC4076Qv0<? super Object> interfaceC4076Qv0;
        if (hm instanceof h) {
            hVar = (h) hm;
            int i3 = hVar.b1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar.b1 = i3 - Integer.MIN_VALUE;
                Object obj = hVar.a1;
                Object l2 = C7289jT0.l();
                i2 = hVar.b1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        interfaceC4076Qv0 = (f) hVar.Z0;
                        hVar2 = (RP1.h) hVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (H e3) {
                            e2 = e3;
                            C4370Tv0.b(e2, interfaceC4076Qv0);
                            return hVar2.X;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.h hVar3 = new RP1.h();
                    InterfaceC4076Qv0<? super Object> fVar = new f<>(va0, hVar3);
                    try {
                        hVar.Y0 = hVar3;
                        hVar.Z0 = fVar;
                        hVar.b1 = 1;
                        if (interfaceC3882Ov0.a(fVar, hVar) == l2) {
                            return l2;
                        }
                        hVar2 = hVar3;
                    } catch (H e4) {
                        hVar2 = hVar3;
                        e2 = e4;
                        interfaceC4076Qv0 = fVar;
                        C4370Tv0.b(e2, interfaceC4076Qv0);
                        return hVar2.X;
                    }
                }
                return hVar2.X;
            }
        }
        hVar = new h(hm);
        Object obj2 = hVar.a1;
        Object l22 = C7289jT0.l();
        i2 = hVar.b1;
        if (i2 == 0) {
        }
        return hVar2.X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, R> Object e(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, R r2, @NotNull XA0<? super R, ? super T, ? super HM<? super R>, ? extends Object> xa0, @NotNull HM<? super R> hm) {
        i iVar;
        int i2;
        RP1.h hVar;
        if (hm instanceof i) {
            iVar = (i) hm;
            int i3 = iVar.a1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.a1 = i3 - Integer.MIN_VALUE;
                Object obj = iVar.Z0;
                Object l2 = C7289jT0.l();
                i2 = iVar.a1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        hVar = (RP1.h) iVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.h hVar2 = new RP1.h();
                    hVar2.X = r2;
                    InterfaceC4076Qv0<? super Object> jVar = new j<>(hVar2, xa0);
                    iVar.Y0 = hVar2;
                    iVar.a1 = 1;
                    if (interfaceC3882Ov0.a(jVar, iVar) == l2) {
                        return l2;
                    }
                    hVar = hVar2;
                }
                return hVar.X;
            }
        }
        iVar = new i(hm);
        Object obj2 = iVar.Z0;
        Object l22 = C7289jT0.l();
        i2 = iVar.a1;
        if (i2 == 0) {
        }
        return hVar.X;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> Object f(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, R r2, XA0<? super R, ? super T, ? super HM<? super R>, ? extends Object> xa0, HM<? super R> hm) {
        RP1.h hVar = new RP1.h();
        hVar.X = r2;
        j jVar = new j(hVar, xa0);
        UP0.e(0);
        interfaceC3882Ov0.a(jVar, hm);
        UP0.e(1);
        return hVar.X;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object g(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        k kVar;
        int i2;
        RP1.h hVar;
        T t2;
        if (hm instanceof k) {
            kVar = (k) hm;
            int i3 = kVar.a1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.a1 = i3 - Integer.MIN_VALUE;
                Object obj = kVar.Z0;
                Object l2 = C7289jT0.l();
                i2 = kVar.a1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        hVar = (RP1.h) kVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.h hVar2 = new RP1.h();
                    hVar2.X = (T) C9596ss1.a;
                    InterfaceC4076Qv0<? super Object> lVar = new l<>(hVar2);
                    kVar.Y0 = hVar2;
                    kVar.a1 = 1;
                    if (interfaceC3882Ov0.a(lVar, kVar) == l2) {
                        return l2;
                    }
                    hVar = hVar2;
                }
                t2 = hVar.X;
                if (t2 == C9596ss1.a) {
                    return t2;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        kVar = new k(hm);
        Object obj2 = kVar.Z0;
        Object l22 = C7289jT0.l();
        i2 = kVar.a1;
        if (i2 == 0) {
        }
        t2 = hVar.X;
        if (t2 == C9596ss1.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object h(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        m mVar;
        int i2;
        RP1.h hVar;
        if (hm instanceof m) {
            mVar = (m) hm;
            int i3 = mVar.a1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mVar.a1 = i3 - Integer.MIN_VALUE;
                Object obj = mVar.Z0;
                Object l2 = C7289jT0.l();
                i2 = mVar.a1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        hVar = (RP1.h) mVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.h hVar2 = new RP1.h();
                    InterfaceC4076Qv0<? super Object> nVar = new n<>(hVar2);
                    mVar.Y0 = hVar2;
                    mVar.a1 = 1;
                    if (interfaceC3882Ov0.a(nVar, mVar) == l2) {
                        return l2;
                    }
                    hVar = hVar2;
                }
                return hVar.X;
            }
        }
        mVar = new m(hm);
        Object obj2 = mVar.Z0;
        Object l22 = C7289jT0.l();
        i2 = mVar.a1;
        if (i2 == 0) {
        }
        return hVar.X;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, o.kj2] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S, T extends S> Object i(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super S, ? super T, ? super HM<? super S>, ? extends Object> xa0, @NotNull HM<? super S> hm) {
        o oVar;
        int i2;
        RP1.h hVar;
        T t2;
        if (hm instanceof o) {
            oVar = (o) hm;
            int i3 = oVar.a1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oVar.a1 = i3 - Integer.MIN_VALUE;
                Object obj = oVar.Z0;
                Object l2 = C7289jT0.l();
                i2 = oVar.a1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        hVar = (RP1.h) oVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.h hVar2 = new RP1.h();
                    hVar2.X = C9596ss1.a;
                    InterfaceC4076Qv0<? super Object> pVar = new p<>(hVar2, xa0);
                    oVar.Y0 = hVar2;
                    oVar.a1 = 1;
                    if (interfaceC3882Ov0.a(pVar, oVar) == l2) {
                        return l2;
                    }
                    hVar = hVar2;
                }
                t2 = hVar.X;
                if (t2 == C9596ss1.a) {
                    return t2;
                }
                throw new NoSuchElementException("Empty flow can't be reduced");
            }
        }
        oVar = new o(hm);
        Object obj2 = oVar.Z0;
        Object l22 = C7289jT0.l();
        i2 = oVar.a1;
        if (i2 == 0) {
        }
        t2 = hVar.X;
        if (t2 == C9596ss1.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object j(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        q qVar;
        int i2;
        RP1.h hVar;
        T t2;
        if (hm instanceof q) {
            qVar = (q) hm;
            int i3 = qVar.a1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qVar.a1 = i3 - Integer.MIN_VALUE;
                Object obj = qVar.Z0;
                Object l2 = C7289jT0.l();
                i2 = qVar.a1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        hVar = (RP1.h) qVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.h hVar2 = new RP1.h();
                    hVar2.X = (T) C9596ss1.a;
                    InterfaceC4076Qv0<? super Object> rVar = new r<>(hVar2);
                    qVar.Y0 = hVar2;
                    qVar.a1 = 1;
                    if (interfaceC3882Ov0.a(rVar, qVar) == l2) {
                        return l2;
                    }
                    hVar = hVar2;
                }
                t2 = hVar.X;
                if (t2 == C9596ss1.a) {
                    return t2;
                }
                throw new NoSuchElementException("Flow is empty");
            }
        }
        qVar = new q(hm);
        Object obj2 = qVar.Z0;
        Object l22 = C7289jT0.l();
        i2 = qVar.a1;
        if (i2 == 0) {
        }
        t2 = hVar.X;
        if (t2 == C9596ss1.a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object k(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HM<? super T> hm) {
        t tVar;
        int i2;
        RP1.h hVar;
        H e2;
        InterfaceC4076Qv0<? super Object> interfaceC4076Qv0;
        T t2;
        if (hm instanceof t) {
            tVar = (t) hm;
            int i3 = tVar.b1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tVar.b1 = i3 - Integer.MIN_VALUE;
                Object obj = tVar.a1;
                Object l2 = C7289jT0.l();
                i2 = tVar.b1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        interfaceC4076Qv0 = (s) tVar.Z0;
                        hVar = (RP1.h) tVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (H e3) {
                            e2 = e3;
                            C4370Tv0.b(e2, interfaceC4076Qv0);
                            t2 = hVar.X;
                            if (t2 != C9596ss1.a) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    RP1.h hVar2 = new RP1.h();
                    hVar2.X = (T) C9596ss1.a;
                    InterfaceC4076Qv0<? super Object> sVar = new s<>(hVar2);
                    try {
                        tVar.Y0 = hVar2;
                        tVar.Z0 = sVar;
                        tVar.b1 = 1;
                        if (interfaceC3882Ov0.a(sVar, tVar) == l2) {
                            return l2;
                        }
                        hVar = hVar2;
                    } catch (H e4) {
                        hVar = hVar2;
                        e2 = e4;
                        interfaceC4076Qv0 = sVar;
                        C4370Tv0.b(e2, interfaceC4076Qv0);
                        t2 = hVar.X;
                        if (t2 != C9596ss1.a) {
                        }
                    }
                }
                t2 = hVar.X;
                if (t2 != C9596ss1.a) {
                    return null;
                }
                return t2;
            }
        }
        tVar = new t(hm);
        Object obj2 = tVar.a1;
        Object l22 = C7289jT0.l();
        i2 = tVar.b1;
        if (i2 == 0) {
        }
        t2 = hVar.X;
        if (t2 != C9596ss1.a) {
        }
    }
}
