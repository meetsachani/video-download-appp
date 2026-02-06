package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n49#2:215\n51#2:219\n49#2:220\n51#2:224\n46#3:216\n51#3:218\n46#3:221\n51#3:223\n105#4:217\n105#4:222\n105#4:225\n1#5:226\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n43#1:215\n43#1:219\n70#1:220\n70#1:224\n43#1:216\n43#1:218\n70#1:221\n70#1:223\n43#1:217\n70#1:222\n78#1:225\n*E\n"})
/* renamed from: o.kw0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class C7642kw0 {
    public static final int a = C2852Ek2.b(C4467Uv0.a, 16, 1, Integer.MAX_VALUE);

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    /* renamed from: o.kw0$a */
    /* loaded from: classes4.dex */
    public static final class a<R> implements InterfaceC3882Ov0<InterfaceC3882Ov0<? extends R>> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ VA0 Y;

        @InterfaceC8303na2({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n50#2:50\n*E\n"})
        /* renamed from: o.kw0$a$a */
        /* loaded from: classes4.dex */
        public static final class C0301a<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ InterfaceC4076Qv0 X;
            public final /* synthetic */ VA0 Y;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
            /* renamed from: o.kw0$a$a$a */
            /* loaded from: classes4.dex */
            public static final class C0302a extends KM {
                public /* synthetic */ Object Y0;
                public int Z0;
                public Object a1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0302a(HM hm) {
                    super(hm);
                    C0301a.this = r1;
                }

                @Override // o.AbstractC5644cl
                public final Object F(Object obj) {
                    this.Y0 = obj;
                    this.Z0 |= Integer.MIN_VALUE;
                    return C0301a.this.c(null, this);
                }
            }

            public C0301a(InterfaceC4076Qv0 interfaceC4076Qv0, VA0 va0) {
                this.X = interfaceC4076Qv0;
                this.Y = va0;
            }

            /* JADX WARN: Code restructure failed: missing block: B:46:0x005a, code lost:
                if (r7.c(r8, r0) != r1) goto L11;
             */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(Object obj, HM hm) {
                C0302a c0302a;
                int i;
                InterfaceC4076Qv0 interfaceC4076Qv0;
                if (hm instanceof C0302a) {
                    c0302a = (C0302a) hm;
                    int i2 = c0302a.Z0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0302a.Z0 = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0302a.Y0;
                        Object l = C7289jT0.l();
                        i = c0302a.Z0;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    RT1.n(obj2);
                                    return C7458kA2.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC4076Qv0 = (InterfaceC4076Qv0) c0302a.a1;
                            RT1.n(obj2);
                        } else {
                            RT1.n(obj2);
                            InterfaceC4076Qv0 interfaceC4076Qv02 = this.X;
                            VA0 va0 = this.Y;
                            c0302a.a1 = interfaceC4076Qv02;
                            c0302a.Z0 = 1;
                            Object i3 = va0.i(obj, c0302a);
                            if (i3 != l) {
                                obj2 = i3;
                                interfaceC4076Qv0 = interfaceC4076Qv02;
                            }
                            return l;
                        }
                        c0302a.a1 = null;
                        c0302a.Z0 = 2;
                    }
                }
                c0302a = new C0302a(hm);
                Object obj22 = c0302a.Y0;
                Object l2 = C7289jT0.l();
                i = c0302a.Z0;
                if (i == 0) {
                }
                c0302a.a1 = null;
                c0302a.Z0 = 2;
            }
        }

        public a(InterfaceC3882Ov0 interfaceC3882Ov0, VA0 va0) {
            this.X = interfaceC3882Ov0;
            this.Y = va0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            Object a = this.X.a(new C0301a(interfaceC4076Qv0, this.Y), hm);
            if (a == C7289jT0.l()) {
                return a;
            }
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", i = {}, l = {CK1.w, CK1.w}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.kw0$b */
    /* loaded from: classes4.dex */
    public static final class b<R, T> extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, T, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ VA0<T, HM<? super InterfaceC3882Ov0<? extends R>>, Object> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(VA0<? super T, ? super HM<? super InterfaceC3882Ov0<? extends R>>, ? extends Object> va0, HM<? super b> hm) {
            super(3, hm);
            this.c1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
            if (r6 == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
            if (o.C4467Uv0.l0(r1, (o.InterfaceC3882Ov0) r6, r5) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            InterfaceC4076Qv0 interfaceC4076Qv0;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        RT1.n(obj);
                        return C7458kA2.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                RT1.n(obj);
            } else {
                RT1.n(obj);
                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                Object obj2 = this.b1;
                this.a1 = interfaceC4076Qv0;
                this.Z0 = 1;
                obj = this.c1.i(obj2, this);
            }
            this.a1 = null;
            this.Z0 = 2;
        }

        @Override // o.XA0
        /* renamed from: U */
        public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, T t, HM<? super C7458kA2> hm) {
            b bVar = new b(this.c1, hm);
            bVar.a1 = interfaceC4076Qv0;
            bVar.b1 = t;
            return bVar.F(C7458kA2.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object V(Object obj) {
            Object obj2 = this.b1;
            UP0.e(0);
            C4467Uv0.l0((InterfaceC4076Qv0) this.a1, (InterfaceC3882Ov0) this.c1.i(obj2, this), this);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    /* renamed from: o.kw0$c */
    /* loaded from: classes4.dex */
    public static final class c<R> implements InterfaceC3882Ov0<InterfaceC3882Ov0<? extends R>> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ VA0 Y;

        @InterfaceC8303na2({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n50#2:50\n*E\n"})
        /* renamed from: o.kw0$c$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ InterfaceC4076Qv0 X;
            public final /* synthetic */ VA0 Y;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
            /* renamed from: o.kw0$c$a$a */
            /* loaded from: classes4.dex */
            public static final class C0303a extends KM {
                public /* synthetic */ Object Y0;
                public int Z0;
                public Object a1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0303a(HM hm) {
                    super(hm);
                    a.this = r1;
                }

                @Override // o.AbstractC5644cl
                public final Object F(Object obj) {
                    this.Y0 = obj;
                    this.Z0 |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(InterfaceC4076Qv0 interfaceC4076Qv0, VA0 va0) {
                this.X = interfaceC4076Qv0;
                this.Y = va0;
            }

            /* JADX WARN: Code restructure failed: missing block: B:46:0x005a, code lost:
                if (r7.c(r8, r0) != r1) goto L11;
             */
            /* JADX WARN: Removed duplicated region for block: B:35:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x003c  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(Object obj, HM hm) {
                C0303a c0303a;
                int i;
                InterfaceC4076Qv0 interfaceC4076Qv0;
                if (hm instanceof C0303a) {
                    c0303a = (C0303a) hm;
                    int i2 = c0303a.Z0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0303a.Z0 = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0303a.Y0;
                        Object l = C7289jT0.l();
                        i = c0303a.Z0;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    RT1.n(obj2);
                                    return C7458kA2.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC4076Qv0 = (InterfaceC4076Qv0) c0303a.a1;
                            RT1.n(obj2);
                        } else {
                            RT1.n(obj2);
                            InterfaceC4076Qv0 interfaceC4076Qv02 = this.X;
                            VA0 va0 = this.Y;
                            c0303a.a1 = interfaceC4076Qv02;
                            c0303a.Z0 = 1;
                            Object i3 = va0.i(obj, c0303a);
                            if (i3 != l) {
                                obj2 = i3;
                                interfaceC4076Qv0 = interfaceC4076Qv02;
                            }
                            return l;
                        }
                        c0303a.a1 = null;
                        c0303a.Z0 = 2;
                    }
                }
                c0303a = new C0303a(hm);
                Object obj22 = c0303a.Y0;
                Object l2 = C7289jT0.l();
                i = c0303a.Z0;
                if (i == 0) {
                }
                c0303a.a1 = null;
                c0303a.Z0 = 2;
            }
        }

        public c(InterfaceC3882Ov0 interfaceC3882Ov0, VA0 va0) {
            this.X = interfaceC3882Ov0;
            this.Y = va0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            Object a2 = this.X.a(new a(interfaceC4076Qv0, this.Y), hm);
            if (a2 == C7289jT0.l()) {
                return a2;
            }
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,108:1\n79#2,2:109\n*E\n"})
    /* renamed from: o.kw0$d */
    /* loaded from: classes4.dex */
    public static final class d<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;

        public d(InterfaceC3882Ov0 interfaceC3882Ov0) {
            this.X = interfaceC3882Ov0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            Object a = this.X.a(new e(interfaceC4076Qv0), hm);
            if (a == C7289jT0.l()) {
                return a;
            }
            return C7458kA2.a;
        }
    }

    /* renamed from: o.kw0$e */
    /* loaded from: classes4.dex */
    public static final class e<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ InterfaceC4076Qv0<T> X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", f = "Merge.kt", i = {}, l = {79}, m = "emit", n = {}, s = {})
        /* renamed from: o.kw0$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public final /* synthetic */ e<T> Z0;
            public int a1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e<? super T> eVar, HM<? super a> hm) {
                super(hm);
                this.Z0 = eVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return this.Z0.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(InterfaceC4076Qv0<? super T> interfaceC4076Qv0) {
            this.X = interfaceC4076Qv0;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
        @Override // o.InterfaceC4076Qv0
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HM<? super C7458kA2> hm) {
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
                        InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.X;
                        aVar.a1 = 1;
                        if (C4467Uv0.l0(interfaceC4076Qv0, interfaceC3882Ov0, aVar) == l) {
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

    @FV(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", i = {}, l = {213, 213}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.kw0$f */
    /* loaded from: classes4.dex */
    public static final class f<R, T> extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, T, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ VA0<T, HM<? super R>, Object> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(VA0<? super T, ? super HM<? super R>, ? extends Object> va0, HM<? super f> hm) {
            super(3, hm);
            this.c1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0036, code lost:
            if (r6 == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0042, code lost:
            if (r1.c(r6, r5) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0044, code lost:
            return r0;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            InterfaceC4076Qv0 interfaceC4076Qv0;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        RT1.n(obj);
                        return C7458kA2.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RT1.n(obj);
                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
            } else {
                RT1.n(obj);
                InterfaceC4076Qv0 interfaceC4076Qv02 = (InterfaceC4076Qv0) this.a1;
                Object obj2 = this.b1;
                this.a1 = interfaceC4076Qv02;
                this.Z0 = 1;
                obj = this.c1.i(obj2, this);
                interfaceC4076Qv0 = interfaceC4076Qv02;
            }
            this.a1 = null;
            this.Z0 = 2;
        }

        @Override // o.XA0
        /* renamed from: U */
        public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, T t, HM<? super C7458kA2> hm) {
            f fVar = new f(this.c1, hm);
            fVar.a1 = interfaceC4076Qv0;
            fVar.b1 = t;
            return fVar.F(C7458kA2.a);
        }
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> a(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super InterfaceC3882Ov0<? extends R>>, ? extends Object> va0) {
        return C4467Uv0.F0(new a(interfaceC3882Ov0, va0));
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> b(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull VA0<? super T, ? super HM<? super InterfaceC3882Ov0<? extends R>>, ? extends Object> va0) {
        return C4467Uv0.c2(interfaceC3882Ov0, new b(va0, null));
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> c(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i, @NotNull VA0<? super T, ? super HM<? super InterfaceC3882Ov0<? extends R>>, ? extends Object> va0) {
        return C4467Uv0.G0(new c(interfaceC3882Ov0, va0), i);
    }

    public static /* synthetic */ InterfaceC3882Ov0 d(InterfaceC3882Ov0 interfaceC3882Ov0, int i, VA0 va0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = a;
        }
        return C4467Uv0.C0(interfaceC3882Ov0, i, va0);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e(@NotNull InterfaceC3882Ov0<? extends InterfaceC3882Ov0<? extends T>> interfaceC3882Ov0) {
        return new d(interfaceC3882Ov0);
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> f(@NotNull InterfaceC3882Ov0<? extends InterfaceC3882Ov0<? extends T>> interfaceC3882Ov0, int i) {
        if (i > 0) {
            if (i == 1) {
                return C4467Uv0.F0(interfaceC3882Ov0);
            }
            return new C8202nA(interfaceC3882Ov0, i, null, 0, null, 28, null);
        }
        throw new IllegalArgumentException(("Expected positive concurrency level, but had " + i).toString());
    }

    public static /* synthetic */ InterfaceC3882Ov0 g(InterfaceC3882Ov0 interfaceC3882Ov0, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = a;
        }
        return C4467Uv0.G0(interfaceC3882Ov0, i);
    }

    public static final int h() {
        return a;
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> k(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull VA0<? super T, ? super HM<? super R>, ? extends Object> va0) {
        return C4467Uv0.c2(interfaceC3882Ov0, new f(va0, null));
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> l(@NotNull Iterable<? extends InterfaceC3882Ov0<? extends T>> iterable) {
        return new C9667tA(iterable, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> m(@NotNull InterfaceC3882Ov0<? extends T>... interfaceC3882Ov0Arr) {
        return C4467Uv0.Y0(C7330jf.K5(interfaceC3882Ov0Arr));
    }

    @InterfaceC2951Fi0
    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> n(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @InterfaceC5183ar @NotNull XA0<? super InterfaceC4076Qv0<? super R>, ? super T, ? super HM<? super C7458kA2>, ? extends Object> xa0) {
        return new C8932qA(xa0, interfaceC3882Ov0, null, 0, null, 28, null);
    }

    @InterfaceC9611sw0
    public static /* synthetic */ void i() {
    }

    @InterfaceC9611sw0
    public static /* synthetic */ void j() {
    }
}
