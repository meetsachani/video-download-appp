package o;

import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,138:1\n1#2:139\n105#3:140\n105#3:141\n105#3:142\n105#3:143\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n18#1:140\n29#1:141\n48#1:142\n80#1:143\n*E\n"})
/* renamed from: o.jw0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C7399jw0 {

    @FV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {C3503Kz.W}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    /* renamed from: o.jw0$a */
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
            return C7399jw0.b(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.jw0$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements InterfaceC4076Qv0<T> {
        public final /* synthetic */ VA0<T, HM<? super Boolean>, Object> X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1", f = "Limit.kt", i = {0}, l = {127}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: o.jw0$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public int b1;

            public a(HM<? super a> hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Z0 = obj;
                this.b1 |= Integer.MIN_VALUE;
                return b.this.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0) {
            this.X = va0;
        }

        public Object a(T t, HM<? super C7458kA2> hm) {
            UP0.e(4);
            new a(hm);
            UP0.e(5);
            if (((Boolean) this.X.i(t, hm)).booleanValue()) {
                return C7458kA2.a;
            }
            throw new H(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
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
                int i2 = aVar.b1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.b1 = i2 - Integer.MIN_VALUE;
                    obj = aVar.Z0;
                    Object l = C7289jT0.l();
                    i = aVar.b1;
                    if (i == 0) {
                        if (i == 1) {
                            bVar = (b) aVar.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        VA0<T, HM<? super Boolean>, Object> va0 = this.X;
                        aVar.Y0 = this;
                        aVar.b1 = 1;
                        obj = va0.i(t, aVar);
                        if (obj == l) {
                            return l;
                        }
                        bVar = this;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        return C7458kA2.a;
                    }
                    throw new H(bVar);
                }
            }
            aVar = new a(hm);
            obj = aVar.Z0;
            Object l2 = C7289jT0.l();
            i = aVar.b1;
            if (i == 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n19#2,5:109\n*E\n"})
    /* renamed from: o.jw0$c */
    /* loaded from: classes4.dex */
    public static final class c<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ int Y;

        public c(InterfaceC3882Ov0 interfaceC3882Ov0, int i) {
            this.X = interfaceC3882Ov0;
            this.Y = i;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            Object a = this.X.a(new d(new RP1.f(), this.Y, interfaceC4076Qv0), hm);
            if (a == C7289jT0.l()) {
                return a;
            }
            return C7458kA2.a;
        }
    }

    /* renamed from: o.jw0$d */
    /* loaded from: classes4.dex */
    public static final class d<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.f X;
        public final /* synthetic */ int Y;
        public final /* synthetic */ InterfaceC4076Qv0<T> Z;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", i = {}, l = {21}, m = "emit", n = {}, s = {})
        /* renamed from: o.jw0$d$a */
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
        public d(RP1.f fVar, int i, InterfaceC4076Qv0<? super T> interfaceC4076Qv0) {
            this.X = fVar;
            this.Y = i;
            this.Z = interfaceC4076Qv0;
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
                        RP1.f fVar = this.X;
                        int i3 = fVar.X;
                        if (i3 >= this.Y) {
                            InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.Z;
                            aVar.a1 = 1;
                            if (interfaceC4076Qv0.c(t, aVar) == l) {
                                return l;
                            }
                        } else {
                            fVar.X = i3 + 1;
                            return C7458kA2.a;
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
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n30#2,10:109\n*E\n"})
    /* renamed from: o.jw0$e */
    /* loaded from: classes4.dex */
    public static final class e<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ VA0 Y;

        public e(InterfaceC3882Ov0 interfaceC3882Ov0, VA0 va0) {
            this.X = interfaceC3882Ov0;
            this.Y = va0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            Object a = this.X.a(new f(new RP1.a(), interfaceC4076Qv0, this.Y), hm);
            if (a == C7289jT0.l()) {
                return a;
            }
            return C7458kA2.a;
        }
    }

    /* renamed from: o.jw0$f */
    /* loaded from: classes4.dex */
    public static final class f<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.a X;
        public final /* synthetic */ InterfaceC4076Qv0<T> Y;
        public final /* synthetic */ VA0<T, HM<? super Boolean>, Object> Z;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", i = {1, 1}, l = {33, 34, 36}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
        /* renamed from: o.jw0$f$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public Object Y0;
            public Object Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ f<T> b1;
            public int c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(f<? super T> fVar, HM<? super a> hm) {
                super(hm);
                this.b1 = fVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.a1 = obj;
                this.c1 |= Integer.MIN_VALUE;
                return this.b1.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(RP1.a aVar, InterfaceC4076Qv0<? super T> interfaceC4076Qv0, VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0) {
            this.X = aVar;
            this.Y = interfaceC4076Qv0;
            this.Z = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
            if (r8.c(r7, r0) == r1) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
            if (r2.Y.c(r7, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            f<T> fVar;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.c1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.c1 = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.a1;
                    Object l = C7289jT0.l();
                    i = aVar.c1;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    RT1.n(obj);
                                    return C7458kA2.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t = (T) aVar.Z0;
                            fVar = (f) aVar.Y0;
                            RT1.n(obj);
                            if (((Boolean) obj).booleanValue()) {
                                fVar.X.X = true;
                                aVar.Y0 = null;
                                aVar.Z0 = null;
                                aVar.c1 = 3;
                            } else {
                                return C7458kA2.a;
                            }
                        } else {
                            RT1.n(obj);
                            return C7458kA2.a;
                        }
                    } else {
                        RT1.n(obj);
                        if (this.X.X) {
                            InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.Y;
                            aVar.c1 = 1;
                        } else {
                            VA0<T, HM<? super Boolean>, Object> va0 = this.Z;
                            aVar.Y0 = this;
                            aVar.Z0 = t;
                            aVar.c1 = 2;
                            obj = va0.i(t, aVar);
                            if (obj != l) {
                                fVar = this;
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                        }
                        return l;
                    }
                }
            }
            aVar = new a(this, hm);
            Object obj2 = aVar.a1;
            Object l2 = C7289jT0.l();
            i = aVar.c1;
            if (i == 0) {
            }
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {70}, m = "emitAbort$FlowKt__LimitKt", n = {"ownershipMarker"}, s = {"L$0"})
    /* renamed from: o.jw0$g */
    /* loaded from: classes4.dex */
    public static final class g<T> extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public int a1;

        public g(HM<? super g> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return C7399jw0.f(null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n49#2,4:109\n63#2,4:113\n*E\n"})
    /* renamed from: o.jw0$h */
    /* loaded from: classes4.dex */
    public static final class h<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ int Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {112}, m = "collect", n = {"ownershipMarker"}, s = {"L$0"})
        /* renamed from: o.jw0$h$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;

            public a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return h.this.a(null, this);
            }
        }

        public h(InterfaceC3882Ov0 interfaceC3882Ov0, int i) {
            this.X = interfaceC3882Ov0;
            this.Y = i;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            H e;
            Object obj;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.Z0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.Z0 = i2 - Integer.MIN_VALUE;
                    Object obj2 = aVar.Y0;
                    Object l = C7289jT0.l();
                    i = aVar.Z0;
                    if (i == 0) {
                        if (i == 1) {
                            obj = aVar.b1;
                            try {
                                RT1.n(obj2);
                            } catch (H e2) {
                                e = e2;
                                C4370Tv0.b(e, obj);
                                return C7458kA2.a;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj2);
                        Object obj3 = new Object();
                        RP1.f fVar = new RP1.f();
                        try {
                            InterfaceC3882Ov0 interfaceC3882Ov0 = this.X;
                            i iVar = new i(fVar, this.Y, interfaceC4076Qv0, obj3);
                            aVar.b1 = obj3;
                            aVar.Z0 = 1;
                            if (interfaceC3882Ov0.a(iVar, aVar) == l) {
                                return l;
                            }
                        } catch (H e3) {
                            e = e3;
                            obj = obj3;
                            C4370Tv0.b(e, obj);
                            return C7458kA2.a;
                        }
                    }
                    return C7458kA2.a;
                }
            }
            aVar = new a(hm);
            Object obj22 = aVar.Y0;
            Object l2 = C7289jT0.l();
            i = aVar.Z0;
            if (i == 0) {
            }
            return C7458kA2.a;
        }
    }

    /* renamed from: o.jw0$i */
    /* loaded from: classes4.dex */
    public static final class i<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.f X;
        public final /* synthetic */ int Y;
        public final /* synthetic */ Object Y0;
        public final /* synthetic */ InterfaceC4076Qv0<T> Z;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", i = {}, l = {58, 60}, m = "emit", n = {}, s = {})
        /* renamed from: o.jw0$i$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public final /* synthetic */ i<T> Z0;
            public int a1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(i<? super T> iVar, HM<? super a> hm) {
                super(hm);
                this.Z0 = iVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return this.Z0.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public i(RP1.f fVar, int i, InterfaceC4076Qv0<? super T> interfaceC4076Qv0, Object obj) {
            this.X = fVar;
            this.Y = i;
            this.Z = interfaceC4076Qv0;
            this.Y0 = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
            if (r7.c(r6, r0) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
            if (o.C7399jw0.f(r7, r6, r2, r0) == r1) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
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
                        if (i != 1) {
                            if (i == 2) {
                                RT1.n(obj);
                                return C7458kA2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        RT1.n(obj);
                        return C7458kA2.a;
                    }
                    RT1.n(obj);
                    RP1.f fVar = this.X;
                    int i3 = fVar.X + 1;
                    fVar.X = i3;
                    if (i3 < this.Y) {
                        InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.Z;
                        aVar.a1 = 1;
                    } else {
                        InterfaceC4076Qv0<T> interfaceC4076Qv02 = this.Z;
                        Object obj2 = this.Y0;
                        aVar.a1 = 2;
                    }
                    return l;
                }
            }
            aVar = new a(this, hm);
            Object obj3 = aVar.Y0;
            Object l2 = C7289jT0.l();
            i = aVar.a1;
            if (i == 0) {
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,108:1\n82#2:109\n123#2,15:110\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n82#1:110,15\n*E\n"})
    /* renamed from: o.jw0$j */
    /* loaded from: classes4.dex */
    public static final class j<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ VA0 Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", i = {0}, l = {120}, m = "collect", n = {"collector$iv"}, s = {"L$0"})
        /* renamed from: o.jw0$j$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;

            public a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return j.this.a(null, this);
            }
        }

        public j(InterfaceC3882Ov0 interfaceC3882Ov0, VA0 va0) {
            this.X = interfaceC3882Ov0;
            this.Y = va0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            k kVar;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.Z0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.Z0 = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.Y0;
                    Object l = C7289jT0.l();
                    i = aVar.Z0;
                    if (i == 0) {
                        if (i == 1) {
                            kVar = (k) aVar.b1;
                            try {
                                RT1.n(obj);
                            } catch (H e) {
                                e = e;
                                C4370Tv0.b(e, kVar);
                                return C7458kA2.a;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        InterfaceC3882Ov0 interfaceC3882Ov0 = this.X;
                        k kVar2 = new k(this.Y, interfaceC4076Qv0);
                        try {
                            aVar.b1 = kVar2;
                            aVar.Z0 = 1;
                            if (interfaceC3882Ov0.a(kVar2, aVar) == l) {
                                return l;
                            }
                        } catch (H e2) {
                            e = e2;
                            kVar = kVar2;
                            C4370Tv0.b(e, kVar);
                            return C7458kA2.a;
                        }
                    }
                    return C7458kA2.a;
                }
            }
            aVar = new a(hm);
            Object obj2 = aVar.Y0;
            Object l2 = C7289jT0.l();
            i = aVar.Z0;
            if (i == 0) {
            }
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,130:1\n83#2,6:131\n*E\n"})
    /* renamed from: o.jw0$k */
    /* loaded from: classes4.dex */
    public static final class k<T> implements InterfaceC4076Qv0<T> {
        public final /* synthetic */ VA0 X;
        public final /* synthetic */ InterfaceC4076Qv0 Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", i = {0, 0, 1}, l = {131, C3503Kz.V}, m = "emit", n = {"this", "value", "this"}, s = {"L$0", "L$1", "L$0"})
        /* renamed from: o.jw0$k$a */
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
                return k.this.c(null, this);
            }
        }

        public k(VA0 va0, InterfaceC4076Qv0 interfaceC4076Qv0) {
            this.X = va0;
            this.Y = interfaceC4076Qv0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
            if (r2.c(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            boolean z;
            Object obj;
            T t2;
            k<T> kVar;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.a1 = i2 - Integer.MIN_VALUE;
                    Object obj2 = aVar.Z0;
                    Object l = C7289jT0.l();
                    i = aVar.a1;
                    z = true;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                kVar = (k) aVar.Y0;
                                RT1.n(obj2);
                                if (z) {
                                    return C7458kA2.a;
                                }
                                throw new H(kVar);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj3 = aVar.c1;
                        RT1.n(obj2);
                        t2 = obj3;
                        kVar = (k) aVar.Y0;
                        obj = obj2;
                    } else {
                        RT1.n(obj2);
                        VA0 va0 = this.X;
                        aVar.Y0 = this;
                        aVar.c1 = t;
                        aVar.a1 = 1;
                        UP0.e(6);
                        Object i3 = va0.i(t, aVar);
                        UP0.e(7);
                        if (i3 != l) {
                            obj = i3;
                            t2 = t;
                            kVar = this;
                        }
                        return l;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        InterfaceC4076Qv0 interfaceC4076Qv0 = kVar.Y;
                        aVar.Y0 = kVar;
                        aVar.c1 = null;
                        aVar.a1 = 2;
                    } else {
                        z = false;
                    }
                    if (z) {
                    }
                }
            }
            aVar = new a(hm);
            Object obj22 = aVar.Z0;
            Object l2 = C7289jT0.l();
            i = aVar.a1;
            z = true;
            if (i == 0) {
            }
            if (!((Boolean) obj).booleanValue()) {
            }
            if (z) {
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @FV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {149}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    @InterfaceC8303na2({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,138:1\n123#2,15:139\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n116#1:139,15\n*E\n"})
    /* renamed from: o.jw0$l */
    /* loaded from: classes4.dex */
    public static final class l<R> extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC3882Ov0<T> b1;
        public final /* synthetic */ XA0<InterfaceC4076Qv0<? super R>, T, HM<? super Boolean>, Object> c1;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @InterfaceC8303na2({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n1#1,130:1\n117#2:131\n*E\n"})
        /* renamed from: o.jw0$l$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements InterfaceC4076Qv0<T> {
            public final /* synthetic */ XA0 X;
            public final /* synthetic */ InterfaceC4076Qv0 Y;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", i = {0}, l = {131}, m = "emit", n = {"this"}, s = {"L$0"})
            /* renamed from: o.jw0$l$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0297a extends KM {
                public Object Y0;
                public /* synthetic */ Object Z0;
                public int a1;

                public C0297a(HM hm) {
                    super(hm);
                }

                @Override // o.AbstractC5644cl
                public final Object F(Object obj) {
                    this.Z0 = obj;
                    this.a1 |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(XA0 xa0, InterfaceC4076Qv0 interfaceC4076Qv0) {
                this.X = xa0;
                this.Y = interfaceC4076Qv0;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public Object c(T t, HM<? super C7458kA2> hm) {
                C0297a c0297a;
                Object obj;
                int i;
                a<T> aVar;
                if (hm instanceof C0297a) {
                    c0297a = (C0297a) hm;
                    int i2 = c0297a.a1;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0297a.a1 = i2 - Integer.MIN_VALUE;
                        obj = c0297a.Z0;
                        Object l = C7289jT0.l();
                        i = c0297a.a1;
                        if (i == 0) {
                            if (i == 1) {
                                aVar = (a) c0297a.Y0;
                                RT1.n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            RT1.n(obj);
                            XA0 xa0 = this.X;
                            InterfaceC4076Qv0 interfaceC4076Qv0 = this.Y;
                            c0297a.Y0 = this;
                            c0297a.a1 = 1;
                            UP0.e(6);
                            obj = xa0.P(interfaceC4076Qv0, t, c0297a);
                            UP0.e(7);
                            if (obj == l) {
                                return l;
                            }
                            aVar = this;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            return C7458kA2.a;
                        }
                        throw new H(aVar);
                    }
                }
                c0297a = new C0297a(hm);
                obj = c0297a.Z0;
                Object l2 = C7289jT0.l();
                i = c0297a.a1;
                if (i == 0) {
                }
                if (!((Boolean) obj).booleanValue()) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super Boolean>, ? extends Object> xa0, HM<? super l> hm) {
            super(2, hm);
            this.b1 = interfaceC3882Ov0;
            this.c1 = xa0;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            a aVar;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    aVar = (a) this.a1;
                    try {
                        RT1.n(obj);
                    } catch (H e) {
                        e = e;
                        C4370Tv0.b(e, aVar);
                        return C7458kA2.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                InterfaceC3882Ov0<T> interfaceC3882Ov0 = this.b1;
                a aVar2 = new a(this.c1, (InterfaceC4076Qv0) this.a1);
                try {
                    this.a1 = aVar2;
                    this.Z0 = 1;
                    if (interfaceC3882Ov0.a(aVar2, this) == l) {
                        return l;
                    }
                } catch (H e2) {
                    e = e2;
                    aVar = aVar2;
                    C4370Tv0.b(e, aVar);
                    return C7458kA2.a;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((l) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            l lVar = new l(this.b1, this.c1, hm);
            lVar.a1 = obj;
            return lVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object b(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, @NotNull HM<? super C7458kA2> hm) {
        a aVar;
        int i2;
        InterfaceC4076Qv0<? super Object> interfaceC4076Qv0;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i3 = aVar.a1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.a1 = i3 - Integer.MIN_VALUE;
                Object obj = aVar.Z0;
                Object l2 = C7289jT0.l();
                i2 = aVar.a1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        interfaceC4076Qv0 = (b) aVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (H e2) {
                            e = e2;
                            C4370Tv0.b(e, interfaceC4076Qv0);
                            return C7458kA2.a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    InterfaceC4076Qv0<? super Object> bVar = new b<>(va0);
                    try {
                        aVar.Y0 = bVar;
                        aVar.a1 = 1;
                        if (interfaceC3882Ov0.a(bVar, aVar) == l2) {
                            return l2;
                        }
                    } catch (H e3) {
                        e = e3;
                        interfaceC4076Qv0 = bVar;
                        C4370Tv0.b(e, interfaceC4076Qv0);
                        return C7458kA2.a;
                    }
                }
                return C7458kA2.a;
            }
        }
        aVar = new a(hm);
        Object obj2 = aVar.Z0;
        Object l22 = C7289jT0.l();
        i2 = aVar.a1;
        if (i2 == 0) {
        }
        return C7458kA2.a;
    }

    public static final <T> Object c(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0, HM<? super C7458kA2> hm) {
        b bVar = new b(va0);
        try {
            UP0.e(0);
            interfaceC3882Ov0.a(bVar, hm);
            UP0.e(1);
        } catch (H e2) {
            C4370Tv0.b(e2, bVar);
        }
        return C7458kA2.a;
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> d(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i2) {
        if (i2 >= 0) {
            return new c(interfaceC3882Ov0, i2);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i2).toString());
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0) {
        return new e(interfaceC3882Ov0, va0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object f(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, T t, Object obj, HM<? super C7458kA2> hm) {
        g gVar;
        int i2;
        if (hm instanceof g) {
            gVar = (g) hm;
            int i3 = gVar.a1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.a1 = i3 - Integer.MIN_VALUE;
                Object obj2 = gVar.Z0;
                Object l2 = C7289jT0.l();
                i2 = gVar.a1;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = gVar.Y0;
                    RT1.n(obj2);
                } else {
                    RT1.n(obj2);
                    gVar.Y0 = obj;
                    gVar.a1 = 1;
                    if (interfaceC4076Qv0.c(t, gVar) == l2) {
                        return l2;
                    }
                }
                throw new H(obj);
            }
        }
        gVar = new g(hm);
        Object obj22 = gVar.Z0;
        Object l22 = C7289jT0.l();
        i2 = gVar.a1;
        if (i2 == 0) {
        }
        throw new H(obj);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> g(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i2) {
        if (i2 > 0) {
            return new h(interfaceC3882Ov0, i2);
        }
        throw new IllegalArgumentException(("Requested element count " + i2 + " should be positive").toString());
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> h(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0) {
        return new j(interfaceC3882Ov0, va0);
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> i(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super Boolean>, ? extends Object> xa0) {
        return C4467Uv0.I0(new l(interfaceC3882Ov0, xa0, null));
    }
}
