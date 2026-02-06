package o;

import androidx.media.AudioAttributesCompat;
import com.facebook.internal.C2372q;
import o.C10642xA;
import o.RP1;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1#2:408\n*E\n"})
/* renamed from: o.dw0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C5931dw0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1}, l = {C10997yd1.z1, 415}, m = "invokeSuspend", n = {"downstream", androidx.lifecycle.p.g, "lastValue", "timeoutMillis", "downstream", androidx.lifecycle.p.g, "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"})
    @InterfaceC8303na2({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n14#2:408\n14#2:410\n1#3:409\n54#4,5:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1\n*L\n212#1:408\n215#1:410\n222#1:411,5\n*E\n"})
    /* renamed from: o.dw0$a */
    /* loaded from: classes4.dex */
    public static final class a<T> extends AbstractC4225Si2 implements XA0<InterfaceC9974uQ, InterfaceC4076Qv0<? super T>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public Object a1;
        public int b1;
        public /* synthetic */ Object c1;
        public /* synthetic */ Object d1;
        public final /* synthetic */ HA0<T, Long> e1;
        public final /* synthetic */ InterfaceC3882Ov0<T> f1;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", i = {}, l = {C9276rZ.p}, m = "invokeSuspend", n = {}, s = {})
        @InterfaceC8303na2({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$1\n*L\n226#1:408\n*E\n"})
        /* renamed from: o.dw0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0267a extends AbstractC4225Si2 implements HA0<HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ InterfaceC4076Qv0<T> a1;
            public final /* synthetic */ RP1.h<Object> b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0267a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, RP1.h<Object> hVar, HM<? super C0267a> hm) {
                super(1, hm);
                this.a1 = interfaceC4076Qv0;
                this.b1 = hVar;
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
                    InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.a1;
                    C7592kj2 c7592kj2 = C9596ss1.a;
                    T t = this.b1.X;
                    if (t == c7592kj2) {
                        t = null;
                    }
                    this.Z0 = 1;
                    if (interfaceC4076Qv0.c(t, this) == l) {
                        return l;
                    }
                }
                this.b1.X = null;
                return C7458kA2.a;
            }

            @Override // o.HA0
            /* renamed from: U */
            public final Object invoke(HM<? super C7458kA2> hm) {
                return ((C0267a) u(hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> u(HM<?> hm) {
                return new C0267a(this.a1, this.b1, hm);
            }
        }

        @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {236}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
        @InterfaceC8303na2({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n529#2,2:408\n544#2:410\n545#2:413\n1#3:411\n14#4:412\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n*L\n232#1:408,2\n233#1:410\n233#1:413\n236#1:412\n*E\n"})
        /* renamed from: o.dw0$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC4225Si2 implements VA0<C10642xA<? extends Object>, HM<? super C7458kA2>, Object> {
            public Object Z0;
            public int a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ RP1.h<Object> c1;
            public final /* synthetic */ InterfaceC4076Qv0<T> d1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(RP1.h<Object> hVar, InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super b> hm) {
                super(2, hm);
                this.c1 = hVar;
                this.d1 = interfaceC4076Qv0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                RP1.h<Object> hVar;
                RP1.h<Object> hVar2;
                Object l = C7289jT0.l();
                int i = this.a1;
                if (i != 0) {
                    if (i == 1) {
                        hVar2 = (RP1.h) this.Z0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    T t = (T) ((C10642xA) this.b1).o();
                    hVar = this.c1;
                    boolean z = t instanceof C10642xA.c;
                    if (!z) {
                        hVar.X = t;
                    }
                    InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.d1;
                    if (z) {
                        Throwable f = C10642xA.f(t);
                        if (f == null) {
                            Object obj2 = hVar.X;
                            if (obj2 != null) {
                                if (obj2 == C9596ss1.a) {
                                    obj2 = null;
                                }
                                this.b1 = t;
                                this.Z0 = hVar;
                                this.a1 = 1;
                                if (interfaceC4076Qv0.c(obj2, this) == l) {
                                    return l;
                                }
                                hVar2 = hVar;
                            }
                            hVar.X = (T) C9596ss1.c;
                        } else {
                            throw f;
                        }
                    }
                    return C7458kA2.a;
                }
                hVar = hVar2;
                hVar.X = (T) C9596ss1.c;
                return C7458kA2.a;
            }

            public final Object U(Object obj, HM<? super C7458kA2> hm) {
                return ((b) t(C10642xA.b(obj), hm)).F(C7458kA2.a);
            }

            @Override // o.VA0
            public /* bridge */ /* synthetic */ Object i(C10642xA<? extends Object> c10642xA, HM<? super C7458kA2> hm) {
                return U(c10642xA.o(), hm);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                b bVar = new b(this.c1, this.d1, hm);
                bVar.b1 = obj;
                return bVar;
            }
        }

        @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.dw0$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC4225Si2 implements VA0<AI1<? super Object>, HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ InterfaceC3882Ov0<T> b1;

            /* renamed from: o.dw0$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0268a<T> implements InterfaceC4076Qv0 {
                public final /* synthetic */ AI1<Object> X;

                @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", i = {}, l = {204}, m = "emit", n = {}, s = {})
                /* renamed from: o.dw0$a$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0269a extends KM {
                    public /* synthetic */ Object Y0;
                    public final /* synthetic */ C0268a<T> Z0;
                    public int a1;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0269a(C0268a<? super T> c0268a, HM<? super C0269a> hm) {
                        super(hm);
                        this.Z0 = c0268a;
                    }

                    @Override // o.AbstractC5644cl
                    public final Object F(Object obj) {
                        this.Y0 = obj;
                        this.a1 |= Integer.MIN_VALUE;
                        return this.Z0.c(null, this);
                    }
                }

                public C0268a(AI1<Object> ai1) {
                    this.X = ai1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // o.InterfaceC4076Qv0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(T t, HM<? super C7458kA2> hm) {
                    C0269a c0269a;
                    int i;
                    if (hm instanceof C0269a) {
                        c0269a = (C0269a) hm;
                        int i2 = c0269a.a1;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0269a.a1 = i2 - Integer.MIN_VALUE;
                            Object obj = c0269a.Y0;
                            Object l = C7289jT0.l();
                            i = c0269a.a1;
                            if (i == 0) {
                                if (i == 1) {
                                    RT1.n(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                RT1.n(obj);
                                AI1<Object> ai1 = this.X;
                                if (t == null) {
                                    t = (T) C9596ss1.a;
                                }
                                c0269a.a1 = 1;
                                if (ai1.d0(t, c0269a) == l) {
                                    return l;
                                }
                            }
                            return C7458kA2.a;
                        }
                    }
                    c0269a = new C0269a(this, hm);
                    Object obj2 = c0269a.Y0;
                    Object l2 = C7289jT0.l();
                    i = c0269a.a1;
                    if (i == 0) {
                    }
                    return C7458kA2.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HM<? super c> hm) {
                super(2, hm);
                this.b1 = interfaceC3882Ov0;
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
                    C0268a c0268a = new C0268a((AI1) this.a1);
                    this.Z0 = 1;
                    if (interfaceC3882Ov0.a(c0268a, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(AI1<Object> ai1, HM<? super C7458kA2> hm) {
                return ((c) t(ai1, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                c cVar = new c(this.b1, hm);
                cVar.a1 = obj;
                return cVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(HA0<? super T, Long> ha0, InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HM<? super a> hm) {
            super(3, hm);
            this.e1 = ha0;
            this.f1 = interfaceC3882Ov0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
            if (r7.c(r15, r14) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
            if (r7.w(r14) != r0) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e4, code lost:
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00e5  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00e2 -> B:7:0x001e). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            RP1.h hVar;
            InterfaceC4076Qv0 interfaceC4076Qv0;
            OO1 oo1;
            RP1.g gVar;
            RP1.h hVar2;
            OO1 oo12;
            InterfaceC4076Qv0 interfaceC4076Qv02;
            Object l = C7289jT0.l();
            int i = this.b1;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        hVar2 = (RP1.h) this.Z0;
                        oo12 = (OO1) this.d1;
                        interfaceC4076Qv02 = (InterfaceC4076Qv0) this.c1;
                        RT1.n(obj);
                        interfaceC4076Qv0 = interfaceC4076Qv02;
                        oo1 = oo12;
                        hVar = hVar2;
                        if (hVar.X == C9596ss1.c) {
                            gVar = new RP1.g();
                            T t = hVar.X;
                            if (t != null) {
                                HA0<T, Long> ha0 = this.e1;
                                C7592kj2 c7592kj2 = C9596ss1.a;
                                if (t == c7592kj2) {
                                    t = null;
                                }
                                long longValue = ha0.invoke(t).longValue();
                                gVar.X = longValue;
                                if (longValue >= 0) {
                                    if (longValue == 0) {
                                        T t2 = hVar.X;
                                        if (t2 == c7592kj2) {
                                            t2 = null;
                                        }
                                        this.c1 = interfaceC4076Qv0;
                                        this.d1 = oo1;
                                        this.Z0 = hVar;
                                        this.a1 = gVar;
                                        this.b1 = 1;
                                    }
                                } else {
                                    throw new IllegalArgumentException("Debounce timeout should not be negative");
                                }
                            }
                            RP1.g gVar2 = gVar;
                            hVar2 = hVar;
                            oo12 = oo1;
                            interfaceC4076Qv02 = interfaceC4076Qv0;
                            C6436g02 c6436g02 = new C6436g02(getContext());
                            if (hVar2.X != null) {
                                C8143mv1.a(c6436g02, gVar2.X, new C0267a(interfaceC4076Qv02, hVar2, null));
                            }
                            c6436g02.j(oo12.L(), new b(hVar2, interfaceC4076Qv02, null));
                            this.c1 = interfaceC4076Qv02;
                            this.d1 = oo12;
                            this.Z0 = hVar2;
                            this.a1 = null;
                            this.b1 = 2;
                        } else {
                            return C7458kA2.a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    gVar = (RP1.g) this.a1;
                    hVar = (RP1.h) this.Z0;
                    oo1 = (OO1) this.d1;
                    interfaceC4076Qv0 = (InterfaceC4076Qv0) this.c1;
                    RT1.n(obj);
                    hVar.X = null;
                    RP1.g gVar22 = gVar;
                    hVar2 = hVar;
                    oo12 = oo1;
                    interfaceC4076Qv02 = interfaceC4076Qv0;
                    C6436g02 c6436g022 = new C6436g02(getContext());
                    if (hVar2.X != null) {
                    }
                    c6436g022.j(oo12.L(), new b(hVar2, interfaceC4076Qv02, null));
                    this.c1 = interfaceC4076Qv02;
                    this.d1 = oo12;
                    this.Z0 = hVar2;
                    this.a1 = null;
                    this.b1 = 2;
                }
            } else {
                RT1.n(obj);
                OO1 j = C10919yI1.j((InterfaceC9974uQ) this.c1, null, 0, new c(this.f1, null), 3, null);
                hVar = new RP1.h();
                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.d1;
                oo1 = j;
                if (hVar.X == C9596ss1.c) {
                }
            }
        }

        @Override // o.XA0
        /* renamed from: U */
        public final Object P(InterfaceC9974uQ interfaceC9974uQ, InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar = new a(this.e1, this.f1, hm);
            aVar.c1 = interfaceC9974uQ;
            aVar.d1 = interfaceC4076Qv0;
            return aVar.F(C7458kA2.a);
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", i = {0, 1, 2}, l = {307, 309, 310}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: o.dw0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC4225Si2 implements VA0<AI1<? super C7458kA2>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ long b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, HM<? super b> hm) {
            super(2, hm);
            this.b1 = j;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
            if (o.P10.b(r5, r7) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
            if (r8.d0(r4, r7) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
            if (o.P10.b(r4, r7) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:15:0x003f). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            AI1 ai1;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ai1 = (AI1) this.a1;
                        RT1.n(obj);
                        long j = this.b1;
                        this.a1 = ai1;
                        this.Z0 = 3;
                    }
                }
                ai1 = (AI1) this.a1;
                RT1.n(obj);
            } else {
                RT1.n(obj);
                ai1 = (AI1) this.a1;
                long j2 = this.b1;
                this.a1 = ai1;
                this.Z0 = 1;
            }
            InterfaceC10362w02 a = ai1.a();
            C7458kA2 c7458kA2 = C7458kA2.a;
            this.a1 = ai1;
            this.Z0 = 2;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<? super C7458kA2> ai1, HM<? super C7458kA2> hm) {
            return ((b) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            b bVar = new b(this.b1, hm);
            bVar.a1 = obj;
            return bVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {C2372q.n}, m = "invokeSuspend", n = {"downstream", androidx.lifecycle.p.g, "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @InterfaceC8303na2({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n54#2,5:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2\n*L\n278#1:408,5\n*E\n"})
    /* renamed from: o.dw0$c */
    /* loaded from: classes4.dex */
    public static final class c<T> extends AbstractC4225Si2 implements XA0<InterfaceC9974uQ, InterfaceC4076Qv0<? super T>, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public Object a1;
        public int b1;
        public /* synthetic */ Object c1;
        public /* synthetic */ Object d1;
        public final /* synthetic */ long e1;
        public final /* synthetic */ InterfaceC3882Ov0<T> f1;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @InterfaceC8303na2({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n529#2,2:408\n544#2:410\n545#2:412\n1#3:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$1\n*L\n281#1:408,2\n282#1:410\n282#1:412\n*E\n"})
        /* renamed from: o.dw0$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC4225Si2 implements VA0<C10642xA<? extends Object>, HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ RP1.h<Object> b1;
            public final /* synthetic */ OO1<C7458kA2> c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(RP1.h<Object> hVar, OO1<C7458kA2> oo1, HM<? super a> hm) {
                super(2, hm);
                this.b1 = hVar;
                this.c1 = oo1;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                C7289jT0.l();
                if (this.Z0 == 0) {
                    RT1.n(obj);
                    T t = (T) ((C10642xA) this.a1).o();
                    RP1.h<Object> hVar = this.b1;
                    boolean z = t instanceof C10642xA.c;
                    if (!z) {
                        hVar.X = t;
                    }
                    OO1<C7458kA2> oo1 = this.c1;
                    if (z) {
                        Throwable f = C10642xA.f(t);
                        if (f == null) {
                            oo1.i(new XB());
                            hVar.X = (T) C9596ss1.c;
                        } else {
                            throw f;
                        }
                    }
                    return C7458kA2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object U(Object obj, HM<? super C7458kA2> hm) {
                return ((a) t(C10642xA.b(obj), hm)).F(C7458kA2.a);
            }

            @Override // o.VA0
            public /* bridge */ /* synthetic */ Object i(C10642xA<? extends Object> c10642xA, HM<? super C7458kA2> hm) {
                return U(c10642xA.o(), hm);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                a aVar = new a(this.b1, this.c1, hm);
                aVar.a1 = obj;
                return aVar;
            }
        }

        @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", i = {}, l = {293}, m = "invokeSuspend", n = {}, s = {})
        @InterfaceC8303na2({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n14#2:408\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$sample$2$1$2\n*L\n293#1:408\n*E\n"})
        /* renamed from: o.dw0$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC4225Si2 implements VA0<C7458kA2, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ RP1.h<Object> a1;
            public final /* synthetic */ InterfaceC4076Qv0<T> b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(RP1.h<Object> hVar, InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super b> hm) {
                super(2, hm);
                this.a1 = hVar;
                this.b1 = interfaceC4076Qv0;
            }

            /* JADX WARN: Multi-variable type inference failed */
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
                    RP1.h<Object> hVar = this.a1;
                    Object obj2 = hVar.X;
                    if (obj2 == null) {
                        return C7458kA2.a;
                    }
                    hVar.X = null;
                    InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.b1;
                    if (obj2 == C9596ss1.a) {
                        obj2 = null;
                    }
                    this.Z0 = 1;
                    if (interfaceC4076Qv0.c(obj2, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(C7458kA2 c7458kA2, HM<? super C7458kA2> hm) {
                return ((b) t(c7458kA2, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new b(this.a1, this.b1, hm);
            }
        }

        @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1", f = "Delay.kt", i = {}, l = {AudioAttributesCompat.O}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.dw0$c$c  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0270c extends AbstractC4225Si2 implements VA0<AI1<? super Object>, HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ InterfaceC3882Ov0<T> b1;

            /* renamed from: o.dw0$c$c$a */
            /* loaded from: classes4.dex */
            public static final class a<T> implements InterfaceC4076Qv0 {
                public final /* synthetic */ AI1<Object> X;

                @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", f = "Delay.kt", i = {}, l = {AudioAttributesCompat.O}, m = "emit", n = {}, s = {})
                /* renamed from: o.dw0$c$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0271a extends KM {
                    public /* synthetic */ Object Y0;
                    public final /* synthetic */ a<T> Z0;
                    public int a1;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0271a(a<? super T> aVar, HM<? super C0271a> hm) {
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

                public a(AI1<Object> ai1) {
                    this.X = ai1;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // o.InterfaceC4076Qv0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(T t, HM<? super C7458kA2> hm) {
                    C0271a c0271a;
                    int i;
                    if (hm instanceof C0271a) {
                        c0271a = (C0271a) hm;
                        int i2 = c0271a.a1;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0271a.a1 = i2 - Integer.MIN_VALUE;
                            Object obj = c0271a.Y0;
                            Object l = C7289jT0.l();
                            i = c0271a.a1;
                            if (i == 0) {
                                if (i == 1) {
                                    RT1.n(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                RT1.n(obj);
                                AI1<Object> ai1 = this.X;
                                if (t == null) {
                                    t = (T) C9596ss1.a;
                                }
                                c0271a.a1 = 1;
                                if (ai1.d0(t, c0271a) == l) {
                                    return l;
                                }
                            }
                            return C7458kA2.a;
                        }
                    }
                    c0271a = new C0271a(this, hm);
                    Object obj2 = c0271a.Y0;
                    Object l2 = C7289jT0.l();
                    i = c0271a.a1;
                    if (i == 0) {
                    }
                    return C7458kA2.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0270c(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HM<? super C0270c> hm) {
                super(2, hm);
                this.b1 = interfaceC3882Ov0;
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
                    a aVar = new a((AI1) this.a1);
                    this.Z0 = 1;
                    if (interfaceC3882Ov0.a(aVar, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(AI1<Object> ai1, HM<? super C7458kA2> hm) {
                return ((C0270c) t(ai1, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                C0270c c0270c = new C0270c(this.b1, hm);
                c0270c.a1 = obj;
                return c0270c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(long j, InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HM<? super c> hm) {
            super(3, hm);
            this.e1 = j;
            this.f1 = interfaceC3882Ov0;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            OO1 oo1;
            OO1<C7458kA2> y0;
            RP1.h hVar;
            InterfaceC4076Qv0 interfaceC4076Qv0;
            Object l = C7289jT0.l();
            int i = this.b1;
            if (i != 0) {
                if (i == 1) {
                    y0 = (OO1) this.a1;
                    hVar = (RP1.h) this.Z0;
                    oo1 = (OO1) this.d1;
                    interfaceC4076Qv0 = (InterfaceC4076Qv0) this.c1;
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                InterfaceC9974uQ interfaceC9974uQ = (InterfaceC9974uQ) this.c1;
                OO1 j = C10919yI1.j(interfaceC9974uQ, null, -1, new C0270c(this.f1, null), 1, null);
                RP1.h hVar2 = new RP1.h();
                oo1 = j;
                y0 = C4467Uv0.y0(interfaceC9974uQ, this.e1);
                hVar = hVar2;
                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.d1;
            }
            while (hVar.X != C9596ss1.c) {
                C6436g02 c6436g02 = new C6436g02(getContext());
                c6436g02.j(oo1.L(), new a(hVar, y0, null));
                c6436g02.j(y0.J(), new b(hVar, interfaceC4076Qv0, null));
                this.c1 = interfaceC4076Qv0;
                this.d1 = oo1;
                this.Z0 = hVar;
                this.a1 = y0;
                this.b1 = 1;
                if (c6436g02.w(this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.XA0
        /* renamed from: U */
        public final Object P(InterfaceC9974uQ interfaceC9974uQ, InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            c cVar = new c(this.e1, this.f1, hm);
            cVar.c1 = interfaceC9974uQ;
            cVar.d1 = interfaceC4076Qv0;
            return cVar.F(C7458kA2.a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {413}, m = "invokeSuspend", n = {"downStream", androidx.lifecycle.p.g}, s = {"L$0", "L$1"})
    @InterfaceC8303na2({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n27#2:408\n28#2:414\n54#3,5:409\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n392#1:408\n392#1:414\n392#1:409,5\n*E\n"})
    /* renamed from: o.dw0$d */
    /* loaded from: classes4.dex */
    public static final class d<T> extends AbstractC4225Si2 implements XA0<InterfaceC9974uQ, InterfaceC4076Qv0<? super T>, HM<? super C7458kA2>, Object> {
        public long Z0;
        public int a1;
        public /* synthetic */ Object b1;
        public /* synthetic */ Object c1;
        public final /* synthetic */ long d1;
        public final /* synthetic */ InterfaceC3882Ov0<T> e1;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", i = {0}, l = {395}, m = "invokeSuspend", n = {"$this$onSuccess_u2dWpGqRn0$iv"}, s = {"L$0"})
        @InterfaceC8303na2({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n529#2,2:408\n562#2:410\n563#2:412\n1#3:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n394#1:408,2\n396#1:410\n396#1:412\n*E\n"})
        /* renamed from: o.dw0$d$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC4225Si2 implements VA0<C10642xA<? extends T>, HM<? super Boolean>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ InterfaceC4076Qv0<T> b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super a> hm) {
                super(2, hm);
                this.b1 = interfaceC4076Qv0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
            @Override // o.AbstractC5644cl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object F(Object obj) {
                Object o2;
                Object obj2;
                Object l = C7289jT0.l();
                int i = this.Z0;
                if (i != 0) {
                    if (i == 1) {
                        obj2 = this.a1;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    o2 = ((C10642xA) this.a1).o();
                    InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.b1;
                    if (!(o2 instanceof C10642xA.c)) {
                        this.a1 = o2;
                        this.Z0 = 1;
                        if (interfaceC4076Qv0.c(o2, this) == l) {
                            return l;
                        }
                        obj2 = o2;
                    }
                    if (!(o2 instanceof C10642xA.a)) {
                        Throwable f = C10642xA.f(o2);
                        if (f == null) {
                            return C10557wp.a(false);
                        }
                        throw f;
                    }
                    return C10557wp.a(true);
                }
                o2 = obj2;
                if (!(o2 instanceof C10642xA.a)) {
                }
            }

            public final Object U(Object obj, HM<? super Boolean> hm) {
                return ((a) t(C10642xA.b(obj), hm)).F(C7458kA2.a);
            }

            @Override // o.VA0
            public /* bridge */ /* synthetic */ Object i(Object obj, HM<? super Boolean> hm) {
                return U(((C10642xA) obj).o(), hm);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                a aVar = new a(this.b1, hm);
                aVar.a1 = obj;
                return aVar;
            }
        }

        @FV(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.dw0$d$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC4225Si2 implements HA0<HM<?>, Object> {
            public int Z0;
            public final /* synthetic */ long a1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, HM<? super b> hm) {
                super(1, hm);
                this.a1 = j;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                C7289jT0.l();
                if (this.Z0 != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RT1.n(obj);
                throw new C8363np2("Timed out waiting for " + ((Object) Y70.h0(this.a1)));
            }

            @Override // o.HA0
            /* renamed from: U */
            public final Object invoke(HM<?> hm) {
                return ((b) u(hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> u(HM<?> hm) {
                return new b(this.a1, hm);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(long j, InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HM<? super d> hm) {
            super(3, hm);
            this.d1 = j;
            this.e1 = interfaceC3882Ov0;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0074 -> B:14:0x0077). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object F(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = o.C7289jT0.l()
                int r1 = r9.a1
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L22
                if (r1 != r2) goto L1a
                long r4 = r9.Z0
                java.lang.Object r1 = r9.c1
                o.OO1 r1 = (o.OO1) r1
                java.lang.Object r6 = r9.b1
                o.Qv0 r6 = (o.InterfaceC4076Qv0) r6
                o.RT1.n(r10)
                goto L77
            L1a:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L22:
                o.RT1.n(r10)
                java.lang.Object r10 = r9.b1
                o.uQ r10 = (o.InterfaceC9974uQ) r10
                java.lang.Object r1 = r9.c1
                o.Qv0 r1 = (o.InterfaceC4076Qv0) r1
                long r4 = r9.d1
                o.Y70$a r6 = o.Y70.Y
                long r6 = r6.T()
                int r4 = o.Y70.n(r4, r6)
                if (r4 <= 0) goto L82
                o.Ov0<T> r4 = r9.e1
                r5 = 0
                r6 = 2
                o.Ov0 r4 = o.C4467Uv0.p(r4, r5, r3, r6, r3)
                o.OO1 r10 = o.C4467Uv0.n1(r4, r10)
                long r4 = r9.d1
                r6 = r1
                r1 = r10
            L4b:
                o.g02 r10 = new o.g02
                o.dQ r7 = r9.getContext()
                r10.<init>(r7)
                o.b02 r7 = r1.L()
                o.dw0$d$a r8 = new o.dw0$d$a
                r8.<init>(r6, r3)
                r10.j(r7, r8)
                o.dw0$d$b r7 = new o.dw0$d$b
                r7.<init>(r4, r3)
                o.C8143mv1.b(r10, r4, r7)
                r9.b1 = r6
                r9.c1 = r1
                r9.Z0 = r4
                r9.a1 = r2
                java.lang.Object r10 = r10.w(r9)
                if (r10 != r0) goto L77
                return r0
            L77:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L4b
                o.kA2 r10 = o.C7458kA2.a
                return r10
            L82:
                o.np2 r10 = new o.np2
                java.lang.String r0 = "Timed out immediately"
                r10.<init>(r0)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C5931dw0.d.F(java.lang.Object):java.lang.Object");
        }

        @Override // o.XA0
        /* renamed from: U */
        public final Object P(InterfaceC9974uQ interfaceC9974uQ, InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            d dVar = new d(this.d1, this.e1, hm);
            dVar.b1 = interfaceC9974uQ;
            dVar.c1 = interfaceC4076Qv0;
            return dVar.F(C7458kA2.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> c(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, final long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return interfaceC3882Ov0;
            }
            return i(interfaceC3882Ov0, new HA0() { // from class: o.cw0
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    long e;
                    e = C5931dw0.e(j, obj);
                    return Long.valueOf(e);
                }
            });
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    @InterfaceC9611sw0
    @InterfaceC7161ix1
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> d(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HA0<? super T, Long> ha0) {
        return i(interfaceC3882Ov0, ha0);
    }

    public static final long f(HA0 ha0, Object obj) {
        return P10.e(((Y70) ha0.invoke(obj)).n0());
    }

    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> g(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C4467Uv0.a0(interfaceC3882Ov0, P10.e(j));
    }

    @NotNull
    @InterfaceC9611sw0
    @InterfaceC8046mW0(name = "debounceDuration")
    @InterfaceC7161ix1
    public static final <T> InterfaceC3882Ov0<T> h(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull final HA0<? super T, Y70> ha0) {
        return i(interfaceC3882Ov0, new HA0() { // from class: o.bw0
            @Override // o.HA0
            public final Object invoke(Object obj) {
                long f;
                f = C5931dw0.f(HA0.this, obj);
                return Long.valueOf(f);
            }
        });
    }

    public static final <T> InterfaceC3882Ov0<T> i(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, HA0<? super T, Long> ha0) {
        return C4273Sv0.b(new a(ha0, interfaceC3882Ov0, null));
    }

    @NotNull
    public static final OO1<C7458kA2> j(@NotNull InterfaceC9974uQ interfaceC9974uQ, long j) {
        return C10919yI1.j(interfaceC9974uQ, null, 0, new b(j, null), 1, null);
    }

    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> k(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        if (j > 0) {
            return C4273Sv0.b(new c(j, interfaceC3882Ov0, null));
        }
        throw new IllegalArgumentException("Sample period should be positive");
    }

    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> l(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C4467Uv0.A1(interfaceC3882Ov0, P10.e(j));
    }

    @InterfaceC9611sw0
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> m(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return n(interfaceC3882Ov0, j);
    }

    public static final <T> InterfaceC3882Ov0<T> n(InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, long j) {
        return C4273Sv0.b(new d(j, interfaceC3882Ov0, null));
    }

    public static final long e(long j, Object obj) {
        return j;
    }
}
