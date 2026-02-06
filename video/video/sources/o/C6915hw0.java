package o;

import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,218:1\n105#2:219\n105#2:220\n105#2:221\n105#2:222\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n46#1:219\n72#1:220\n142#1:221\n177#1:222\n*E\n"})
/* renamed from: o.hw0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C6915hw0 {

    @FV(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {212}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
    /* renamed from: o.hw0$a */
    /* loaded from: classes4.dex */
    public static final class a<T> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C6915hw0.c(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n143#2,13:109\n156#2,6:123\n326#3:122\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n155#1:122\n*E\n"})
    /* renamed from: o.hw0$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ XA0 Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 1, 2}, l = {110, 117, 124}, m = "collect", n = {"this", "$this$onCompletion_u24lambda_u242", W12.i, "sc"}, s = {"L$0", "L$1", "L$0", "L$0"})
        /* renamed from: o.hw0$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;
            public Object c1;

            public a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(InterfaceC3882Ov0 interfaceC3882Ov0, XA0 xa0) {
            this.X = interfaceC3882Ov0;
            this.Y = xa0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            Object l;
            int i;
            b<T> bVar;
            C8116mo2 c8116mo2;
            XA0 xa0;
            C8780pX1 c8780pX1;
            Throwable th;
            C8780pX1 c8780pX12;
            Object P;
            try {
                if (hm instanceof a) {
                    aVar = (a) hm;
                    int i2 = aVar.Z0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.Z0 = i2 - Integer.MIN_VALUE;
                        Object obj = aVar.Y0;
                        l = C7289jT0.l();
                        i = aVar.Z0;
                        if (i == 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        c8780pX12 = (C8780pX1) aVar.b1;
                                        try {
                                            RT1.n(obj);
                                            c8780pX12.H();
                                            return C7458kA2.a;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            c8780pX12.H();
                                            throw th;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Throwable th3 = (Throwable) aVar.b1;
                                RT1.n(obj);
                                throw th3;
                            }
                            interfaceC4076Qv0 = (InterfaceC4076Qv0) aVar.c1;
                            bVar = (b) aVar.b1;
                            try {
                                RT1.n(obj);
                            } catch (Throwable th4) {
                                th = th4;
                                c8116mo2 = new C8116mo2(th);
                                xa0 = bVar.Y;
                                aVar.b1 = th;
                                aVar.c1 = null;
                                aVar.Z0 = 2;
                                if (C6915hw0.c(c8116mo2, xa0, th, aVar) != l) {
                                    return l;
                                }
                                throw th;
                            }
                        } else {
                            RT1.n(obj);
                            try {
                                InterfaceC3882Ov0 interfaceC3882Ov0 = this.X;
                                aVar.b1 = this;
                                aVar.c1 = interfaceC4076Qv0;
                                aVar.Z0 = 1;
                                if (interfaceC3882Ov0.a(interfaceC4076Qv0, aVar) != l) {
                                    bVar = this;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                bVar = this;
                                c8116mo2 = new C8116mo2(th);
                                xa0 = bVar.Y;
                                aVar.b1 = th;
                                aVar.c1 = null;
                                aVar.Z0 = 2;
                                if (C6915hw0.c(c8116mo2, xa0, th, aVar) != l) {
                                }
                            }
                            return l;
                        }
                        c8780pX1 = new C8780pX1(interfaceC4076Qv0, aVar.getContext());
                        XA0 xa02 = bVar.Y;
                        aVar.b1 = c8780pX1;
                        aVar.c1 = null;
                        aVar.Z0 = 3;
                        UP0.e(6);
                        P = xa02.P(c8780pX1, null, aVar);
                        UP0.e(7);
                        if (P != l) {
                            c8780pX12 = c8780pX1;
                            c8780pX12.H();
                            return C7458kA2.a;
                        }
                        return l;
                    }
                }
                XA0 xa022 = bVar.Y;
                aVar.b1 = c8780pX1;
                aVar.c1 = null;
                aVar.Z0 = 3;
                UP0.e(6);
                P = xa022.P(c8780pX1, null, aVar);
                UP0.e(7);
                if (P != l) {
                }
                return l;
            } catch (Throwable th6) {
                th = th6;
                c8780pX12 = c8780pX1;
                c8780pX12.H();
                throw th;
            }
            aVar = new a(hm);
            Object obj2 = aVar.Y0;
            l = C7289jT0.l();
            i = aVar.Z0;
            if (i == 0) {
            }
            c8780pX1 = new C8780pX1(interfaceC4076Qv0, aVar.getContext());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n178#2,7:109\n185#2,7:117\n326#3:116\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n184#1:116\n*E\n"})
    /* renamed from: o.hw0$c */
    /* loaded from: classes4.dex */
    public static final class c<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ VA0 Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0, 1}, l = {110, 118}, m = "collect", n = {"this", "$this$onEmpty_u24lambda_u243", "isEmpty", "collector"}, s = {"L$0", "L$1", "L$2", "L$0"})
        /* renamed from: o.hw0$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;
            public Object c1;
            public Object d1;

            public a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(InterfaceC3882Ov0 interfaceC3882Ov0, VA0 va0) {
            this.X = interfaceC3882Ov0;
            this.Y = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
            if (r8 == r1) goto L26;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
        /* JADX WARN: Type inference failed for: r7v0, types: [o.Qv0<? super T>, java.lang.Object, o.Qv0] */
        /* JADX WARN: Type inference failed for: r7v1, types: [o.pX1] */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v7, types: [o.pX1] */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            c<T> cVar;
            InterfaceC4076Qv0 interfaceC4076Qv02;
            RP1.a aVar2;
            try {
                if (hm instanceof a) {
                    aVar = (a) hm;
                    int i2 = aVar.Z0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.Z0 = i2 - Integer.MIN_VALUE;
                        Object obj = aVar.Y0;
                        Object l = C7289jT0.l();
                        i = aVar.Z0;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    C8780pX1 c8780pX1 = (C8780pX1) aVar.b1;
                                    RT1.n(obj);
                                    interfaceC4076Qv0 = c8780pX1;
                                    return C7458kA2.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (RP1.a) aVar.d1;
                            interfaceC4076Qv02 = (InterfaceC4076Qv0) aVar.c1;
                            cVar = (c) aVar.b1;
                            RT1.n(obj);
                        } else {
                            RT1.n(obj);
                            RP1.a aVar3 = new RP1.a();
                            aVar3.X = true;
                            InterfaceC3882Ov0 interfaceC3882Ov0 = this.X;
                            d dVar = new d(aVar3, interfaceC4076Qv0);
                            aVar.b1 = this;
                            aVar.c1 = interfaceC4076Qv0;
                            aVar.d1 = aVar3;
                            aVar.Z0 = 1;
                            if (interfaceC3882Ov0.a(dVar, aVar) != l) {
                                cVar = this;
                                interfaceC4076Qv02 = interfaceC4076Qv0;
                                aVar2 = aVar3;
                            }
                            return l;
                        }
                        if (aVar2.X) {
                            C8780pX1 c8780pX12 = new C8780pX1(interfaceC4076Qv02, aVar.getContext());
                            VA0 va0 = cVar.Y;
                            aVar.b1 = c8780pX12;
                            aVar.c1 = null;
                            aVar.d1 = null;
                            aVar.Z0 = 2;
                            UP0.e(6);
                            Object i3 = va0.i(c8780pX12, aVar);
                            UP0.e(7);
                            interfaceC4076Qv0 = c8780pX12;
                        }
                        return C7458kA2.a;
                    }
                }
                if (i == 0) {
                }
                if (aVar2.X) {
                }
                return C7458kA2.a;
            } finally {
                interfaceC4076Qv0.H();
            }
            aVar = new a(hm);
            Object obj2 = aVar.Y0;
            Object l2 = C7289jT0.l();
            i = aVar.Z0;
        }
    }

    /* renamed from: o.hw0$d */
    /* loaded from: classes4.dex */
    public static final class d<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.a X;
        public final /* synthetic */ InterfaceC4076Qv0<T> Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", i = {}, l = {181}, m = "emit", n = {}, s = {})
        /* renamed from: o.hw0$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public final /* synthetic */ d<T> Z0;
            public int a1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(d<? super T> dVar, HM<? super a> hm) {
                super(hm);
                this.Z0 = dVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return this.Z0.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(RP1.a aVar, InterfaceC4076Qv0<? super T> interfaceC4076Qv0) {
            this.X = aVar;
            this.Y = interfaceC4076Qv0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.a1 = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.Y0;
                    Object l = C7289jT0.l();
                    i = aVar.a1;
                    if (i == 0) {
                        if (i == 1) {
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        this.X.X = false;
                        InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.Y;
                        aVar.a1 = 1;
                        if (interfaceC4076Qv0.c(t, aVar) == l) {
                            return l;
                        }
                    }
                    return C7458kA2.a;
                }
            }
            aVar = new a(this, hm);
            Object obj2 = aVar.Y0;
            Object l2 = C7289jT0.l();
            i = aVar.a1;
            if (i == 0) {
            }
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,108:1\n73#2:109\n74#2,7:111\n326#3:110\n*S KotlinDebug\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n73#1:110\n*E\n"})
    /* renamed from: o.hw0$e */
    /* loaded from: classes4.dex */
    public static final class e<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ VA0 X;
        public final /* synthetic */ InterfaceC3882Ov0 Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", f = "Emitters.kt", i = {0, 0, 0}, l = {112, 116}, m = "collect", n = {"this", "$this$onStart_u24lambda_u241", "safeCollector"}, s = {"L$0", "L$1", "L$2"})
        /* renamed from: o.hw0$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;
            public Object c1;
            public Object d1;

            public a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(VA0 va0, InterfaceC3882Ov0 interfaceC3882Ov0) {
            this.X = va0;
            this.Y = interfaceC3882Ov0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            if (r7.a(r2, r0) != r1) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            Throwable th;
            C8780pX1 c8780pX1;
            e<T> eVar;
            InterfaceC4076Qv0<? super T> interfaceC4076Qv02;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.Z0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.Z0 = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.Y0;
                    Object l = C7289jT0.l();
                    i = aVar.Z0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                RT1.n(obj);
                                return C7458kA2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c8780pX1 = (C8780pX1) aVar.d1;
                        interfaceC4076Qv02 = (InterfaceC4076Qv0) aVar.c1;
                        eVar = (e) aVar.b1;
                        try {
                            RT1.n(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            c8780pX1.H();
                            throw th;
                        }
                    } else {
                        RT1.n(obj);
                        C8780pX1 c8780pX12 = new C8780pX1(interfaceC4076Qv0, aVar.getContext());
                        try {
                            VA0 va0 = this.X;
                            aVar.b1 = this;
                            aVar.c1 = interfaceC4076Qv0;
                            aVar.d1 = c8780pX12;
                            aVar.Z0 = 1;
                            UP0.e(6);
                            Object i3 = va0.i(c8780pX12, aVar);
                            UP0.e(7);
                            if (i3 != l) {
                                eVar = this;
                                interfaceC4076Qv02 = interfaceC4076Qv0;
                                c8780pX1 = c8780pX12;
                            }
                            return l;
                        } catch (Throwable th3) {
                            th = th3;
                            c8780pX1 = c8780pX12;
                            c8780pX1.H();
                            throw th;
                        }
                    }
                    c8780pX1.H();
                    InterfaceC3882Ov0 interfaceC3882Ov0 = eVar.Y;
                    aVar.b1 = null;
                    aVar.c1 = null;
                    aVar.d1 = null;
                    aVar.Z0 = 2;
                }
            }
            aVar = new a(hm);
            Object obj2 = aVar.Y0;
            Object l2 = C7289jT0.l();
            i = aVar.Z0;
            if (i == 0) {
            }
            c8780pX1.H();
            InterfaceC3882Ov0 interfaceC3882Ov02 = eVar.Y;
            aVar.b1 = null;
            aVar.c1 = null;
            aVar.d1 = null;
            aVar.Z0 = 2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @FV(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.hw0$f */
    /* loaded from: classes4.dex */
    public static final class f<R> extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC3882Ov0<T> b1;
        public final /* synthetic */ XA0<InterfaceC4076Qv0<? super R>, T, HM<? super C7458kA2>, Object> c1;

        /* renamed from: o.hw0$f$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ XA0<InterfaceC4076Qv0<? super R>, T, HM<? super C7458kA2>, Object> X;
            public final /* synthetic */ InterfaceC4076Qv0<R> Y;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1", f = "Emitters.kt", i = {}, l = {38}, m = "emit", n = {}, s = {})
            /* renamed from: o.hw0$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0289a extends KM {
                public /* synthetic */ Object Y0;
                public final /* synthetic */ a<T> Z0;
                public int a1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0289a(a<? super T> aVar, HM<? super C0289a> hm) {
                    super(hm);
                    this.Z0 = aVar;
                }

                @Override // o.AbstractC5644cl
                public final Object F(Object obj) {
                    this.Y0 = obj;
                    this.a1 |= Integer.MIN_VALUE;
                    return this.Z0.c(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public a(XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0, InterfaceC4076Qv0<? super R> interfaceC4076Qv0) {
                this.X = xa0;
                this.Y = interfaceC4076Qv0;
            }

            public final Object a(T t, HM<? super C7458kA2> hm) {
                UP0.e(4);
                new C0289a(this, hm);
                UP0.e(5);
                this.X.P(this.Y, t, hm);
                return C7458kA2.a;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(T t, HM<? super C7458kA2> hm) {
                C0289a c0289a;
                int i;
                if (hm instanceof C0289a) {
                    c0289a = (C0289a) hm;
                    int i2 = c0289a.a1;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0289a.a1 = i2 - Integer.MIN_VALUE;
                        Object obj = c0289a.Y0;
                        Object l = C7289jT0.l();
                        i = c0289a.a1;
                        if (i == 0) {
                            if (i == 1) {
                                RT1.n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            RT1.n(obj);
                            InterfaceC4076Qv0<R> interfaceC4076Qv0 = this.Y;
                            c0289a.a1 = 1;
                            if (this.X.P(interfaceC4076Qv0, t, c0289a) == l) {
                                return l;
                            }
                        }
                        return C7458kA2.a;
                    }
                }
                c0289a = new C0289a(this, hm);
                Object obj2 = c0289a.Y0;
                Object l2 = C7289jT0.l();
                i = c0289a.a1;
                if (i == 0) {
                }
                return C7458kA2.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0, HM<? super f> hm) {
            super(2, hm);
            this.b1 = interfaceC3882Ov0;
            this.c1 = xa0;
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
                InterfaceC3882Ov0<T> interfaceC3882Ov0 = this.b1;
                a aVar = new a(this.c1, (InterfaceC4076Qv0) this.a1);
                this.Z0 = 1;
                if (interfaceC3882Ov0.a(aVar, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((f) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        public final Object V(Object obj) {
            InterfaceC3882Ov0<T> interfaceC3882Ov0 = this.b1;
            a aVar = new a(this.c1, (InterfaceC4076Qv0) this.a1);
            UP0.e(0);
            interfaceC3882Ov0.a(aVar, this);
            UP0.e(1);
            return C7458kA2.a;
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            f fVar = new f(this.b1, this.c1, hm);
            fVar.a1 = obj;
            return fVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    /* renamed from: o.hw0$g */
    /* loaded from: classes4.dex */
    public static final class g<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ XA0 Y;

        /* renamed from: o.hw0$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;

            public a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return g.this.a(null, this);
            }
        }

        public g(InterfaceC3882Ov0 interfaceC3882Ov0, XA0 xa0) {
            this.X = interfaceC3882Ov0;
            this.Y = xa0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            Object a2 = this.X.a(new h(this.Y, interfaceC4076Qv0), hm);
            if (a2 == C7289jT0.l()) {
                return a2;
            }
            return C7458kA2.a;
        }

        public Object e(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            UP0.e(4);
            new a(hm);
            UP0.e(5);
            InterfaceC3882Ov0 interfaceC3882Ov0 = this.X;
            h hVar = new h(this.Y, interfaceC4076Qv0);
            UP0.e(0);
            interfaceC3882Ov0.a(hVar, hm);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    /* renamed from: o.hw0$h */
    /* loaded from: classes4.dex */
    public static final class h<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ XA0<InterfaceC4076Qv0<? super R>, T, HM<? super C7458kA2>, Object> X;
        public final /* synthetic */ InterfaceC4076Qv0<R> Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$1$1", f = "Emitters.kt", i = {}, l = {49}, m = "emit", n = {}, s = {})
        /* renamed from: o.hw0$h$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public final /* synthetic */ h<T> Z0;
            public int a1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(h<? super T> hVar, HM<? super a> hm) {
                super(hm);
                this.Z0 = hVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return this.Z0.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0, InterfaceC4076Qv0<? super R> interfaceC4076Qv0) {
            this.X = xa0;
            this.Y = interfaceC4076Qv0;
        }

        public final Object a(T t, HM<? super C7458kA2> hm) {
            UP0.e(4);
            new a(this, hm);
            UP0.e(5);
            this.X.P(this.Y, t, hm);
            return C7458kA2.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.a1 = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.Y0;
                    Object l = C7289jT0.l();
                    i = aVar.a1;
                    if (i == 0) {
                        if (i == 1) {
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        XA0<InterfaceC4076Qv0<? super R>, T, HM<? super C7458kA2>, Object> xa0 = this.X;
                        Object obj2 = this.Y;
                        aVar.a1 = 1;
                        if (xa0.P(obj2, t, aVar) == l) {
                            return l;
                        }
                    }
                    return C7458kA2.a;
                }
            }
            aVar = new a(this, hm);
            Object obj3 = aVar.Y0;
            Object l2 = C7289jT0.l();
            i = aVar.a1;
            if (i == 0) {
            }
            return C7458kA2.a;
        }
    }

    public static final void b(@NotNull InterfaceC4076Qv0<?> interfaceC4076Qv0) {
        if (!(interfaceC4076Qv0 instanceof C8116mo2)) {
            return;
        }
        throw ((C8116mo2) interfaceC4076Qv0).X;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object c(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, XA0<? super InterfaceC4076Qv0<? super T>, ? super Throwable, ? super HM<? super C7458kA2>, ? extends Object> xa0, Throwable th, HM<? super C7458kA2> hm) {
        a aVar;
        int i;
        try {
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.a1 = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.Z0;
                    Object l = C7289jT0.l();
                    i = aVar.a1;
                    if (i == 0) {
                        if (i == 1) {
                            th = (Throwable) aVar.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        aVar.Y0 = th;
                        aVar.a1 = 1;
                        if (xa0.P(interfaceC4076Qv0, th, aVar) == l) {
                            return l;
                        }
                    }
                    return C7458kA2.a;
                }
            }
            if (i == 0) {
            }
            return C7458kA2.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                C3917Pf0.a(th2, th);
            }
            throw th2;
        }
        aVar = new a(hm);
        Object obj2 = aVar.Z0;
        Object l2 = C7289jT0.l();
        i = aVar.a1;
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> d(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super InterfaceC4076Qv0<? super T>, ? super Throwable, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        return new b(interfaceC3882Ov0, xa0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return new c(interfaceC3882Ov0, va0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> f(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return new e(va0, interfaceC3882Ov0);
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> g(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        return C4467Uv0.I0(new f(interfaceC3882Ov0, xa0, null));
    }

    @HK1
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> h(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        return new g(interfaceC3882Ov0, xa0);
    }
}
