package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nTickerChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TickerChannels.kt\nkotlinx/coroutines/channels/TickerChannelsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n1#2:109\n*E\n"})
/* renamed from: o.yo2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11042yo2 {

    @FV(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 1, 1, 2, 2}, l = {102, 104, 105}, m = "fixedDelayTicker", n = {C5287bG2.q2, "delayMillis", C5287bG2.q2, "delayMillis", C5287bG2.q2, "delayMillis"}, s = {"L$0", "J$0", "L$0", "J$0", "L$0", "J$0"})
    /* renamed from: o.yo2$a */
    /* loaded from: classes3.dex */
    public static final class a extends KM {
        public long Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public int b1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.a1 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return C11042yo2.c(0L, 0L, null, this);
        }
    }

    @FV(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {80, 84, 90, 92}, m = "fixedPeriodTicker", n = {C5287bG2.q2, "delayMillis", "deadline", C5287bG2.q2, "deadline", "delayNs", C5287bG2.q2, "deadline", "delayNs", C5287bG2.q2, "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
    /* renamed from: o.yo2$b */
    /* loaded from: classes3.dex */
    public static final class b extends KM {
        public long Y0;
        public long Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public b(HM<? super b> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            return C11042yo2.d(0L, 0L, null, this);
        }
    }

    @FV(c = "kotlinx.coroutines.channels.TickerChannelsKt$ticker$3", f = "TickerChannels.kt", i = {}, l = {68, 69}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.yo2$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC4225Si2 implements VA0<AI1<? super C7458kA2>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ EnumC11285zo2 b1;
        public final /* synthetic */ long c1;
        public final /* synthetic */ long d1;

        /* renamed from: o.yo2$c$a */
        /* loaded from: classes3.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[EnumC11285zo2.values().length];
                try {
                    iArr[EnumC11285zo2.X.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC11285zo2.Y.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumC11285zo2 enumC11285zo2, long j, long j2, HM<? super c> hm) {
            super(2, hm);
            this.b1 = enumC11285zo2;
            this.c1 = j;
            this.d1 = j2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            if (o.C11042yo2.c(r4, r6, r8, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
            if (o.C11042yo2.d(r1, r3, r11, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
            return r0;
         */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                }
            } else {
                RT1.n(obj);
                AI1 ai1 = (AI1) this.a1;
                int i2 = a.a[this.b1.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        long j = this.c1;
                        long j2 = this.d1;
                        InterfaceC10362w02 a2 = ai1.a();
                        this.Z0 = 2;
                    } else {
                        throw new C3865Oq1();
                    }
                } else {
                    long j3 = this.c1;
                    long j4 = this.d1;
                    InterfaceC10362w02 a3 = ai1.a();
                    this.Z0 = 1;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(AI1<? super C7458kA2> ai1, HM<? super C7458kA2> hm) {
            return ((c) t(ai1, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            c cVar = new c(this.b1, this.c1, this.d1, hm);
            cVar.a1 = obj;
            return cVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (o.P10.b(r8, r0) == r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
        if (o.P10.b(r6, r0) != r1) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x007d -> B:14:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(long j, long j2, InterfaceC10362w02<? super C7458kA2> interfaceC10362w02, HM<? super C7458kA2> hm) {
        a aVar;
        Object l;
        int i;
        InterfaceC10362w02<? super C7458kA2> interfaceC10362w022;
        C7458kA2 c7458kA2;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i2 = aVar.b1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.b1 = i2 - Integer.MIN_VALUE;
                Object obj = aVar.a1;
                l = C7289jT0.l();
                i = aVar.b1;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                j = aVar.Y0;
                                interfaceC10362w022 = (InterfaceC10362w02) aVar.Z0;
                                RT1.n(obj);
                                interfaceC10362w02 = interfaceC10362w022;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            j = aVar.Y0;
                            interfaceC10362w022 = (InterfaceC10362w02) aVar.Z0;
                            RT1.n(obj);
                            aVar.Z0 = interfaceC10362w022;
                            aVar.Y0 = j;
                            aVar.b1 = 3;
                        }
                    } else {
                        j = aVar.Y0;
                        interfaceC10362w02 = (InterfaceC10362w02) aVar.Z0;
                        RT1.n(obj);
                    }
                } else {
                    RT1.n(obj);
                    aVar.Z0 = interfaceC10362w02;
                    aVar.Y0 = j;
                    aVar.b1 = 1;
                }
                c7458kA2 = C7458kA2.a;
                aVar.Z0 = interfaceC10362w02;
                aVar.Y0 = j;
                aVar.b1 = 2;
                if (interfaceC10362w02.d0(c7458kA2, aVar) != l) {
                    interfaceC10362w022 = interfaceC10362w02;
                    aVar.Z0 = interfaceC10362w022;
                    aVar.Y0 = j;
                    aVar.b1 = 3;
                }
                return l;
            }
        }
        aVar = new a(hm);
        Object obj2 = aVar.a1;
        l = C7289jT0.l();
        i = aVar.b1;
        if (i == 0) {
        }
        c7458kA2 = C7458kA2.a;
        aVar.Z0 = interfaceC10362w02;
        aVar.Y0 = j;
        aVar.b1 = 2;
        if (interfaceC10362w02.d0(c7458kA2, aVar) != l) {
        }
        return l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
        if (o.P10.b(r4, r1) == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
        if (o.P10.b(r4, r1) != r2) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00fd -> B:31:0x00ab). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0113 -> B:15:0x003d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(long j, long j2, InterfaceC10362w02<? super C7458kA2> interfaceC10362w02, HM<? super C7458kA2> hm) {
        b bVar;
        Object l;
        int i;
        long nanoTime;
        InterfaceC10362w02<? super C7458kA2> interfaceC10362w022;
        long j3;
        long j4;
        long d;
        long j5;
        long j6;
        InterfaceC10362w02<? super C7458kA2> interfaceC10362w023;
        char c2;
        InterfaceC10362w02<? super C7458kA2> interfaceC10362w024;
        long j7;
        AbstractC10857y3 abstractC10857y3;
        long nanoTime2;
        long v;
        char c3;
        char c4;
        C7458kA2 c7458kA2;
        if (hm instanceof b) {
            bVar = (b) hm;
            int i2 = bVar.c1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.c1 = i2 - Integer.MIN_VALUE;
                Object obj = bVar.b1;
                l = C7289jT0.l();
                i = bVar.c1;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    j6 = bVar.Z0;
                                    j7 = bVar.Y0;
                                    interfaceC10362w023 = (InterfaceC10362w02) bVar.a1;
                                    RT1.n(obj);
                                    c4 = 4;
                                    c3 = 3;
                                    long j8 = j7;
                                    d = j6;
                                    j4 = j8;
                                    interfaceC10362w024 = interfaceC10362w023;
                                    long j9 = j4 + d;
                                    c7458kA2 = C7458kA2.a;
                                    bVar.a1 = interfaceC10362w024;
                                    bVar.Y0 = j9;
                                    bVar.Z0 = d;
                                    bVar.c1 = 2;
                                    if (interfaceC10362w024.d0(c7458kA2, bVar) != l) {
                                        long j10 = d;
                                        j7 = j9;
                                        j6 = j10;
                                        interfaceC10362w023 = interfaceC10362w024;
                                        abstractC10857y3 = C11100z3.a;
                                        if (abstractC10857y3 == null) {
                                            nanoTime2 = abstractC10857y3.b();
                                        } else {
                                            nanoTime2 = System.nanoTime();
                                        }
                                        v = C5075aO1.v(j7 - nanoTime2, 0L);
                                        if (v != 0 && j6 != 0) {
                                            long j11 = j6 - ((nanoTime2 - j7) % j6);
                                            j5 = nanoTime2 + j11;
                                            long c5 = C3718Ne0.c(j11);
                                            bVar.a1 = interfaceC10362w023;
                                            bVar.Y0 = j5;
                                            bVar.Z0 = j6;
                                            c2 = 3;
                                            bVar.c1 = 3;
                                        } else {
                                            c3 = 3;
                                            long c6 = C3718Ne0.c(v);
                                            bVar.a1 = interfaceC10362w023;
                                            bVar.Y0 = j7;
                                            bVar.Z0 = j6;
                                            c4 = 4;
                                            bVar.c1 = 4;
                                        }
                                    }
                                    return l;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j6 = bVar.Z0;
                            j5 = bVar.Y0;
                            interfaceC10362w023 = (InterfaceC10362w02) bVar.a1;
                            RT1.n(obj);
                            c2 = 3;
                            long j12 = j5;
                            d = j6;
                            j4 = j12;
                            interfaceC10362w024 = interfaceC10362w023;
                            long j92 = j4 + d;
                            c7458kA2 = C7458kA2.a;
                            bVar.a1 = interfaceC10362w024;
                            bVar.Y0 = j92;
                            bVar.Z0 = d;
                            bVar.c1 = 2;
                            if (interfaceC10362w024.d0(c7458kA2, bVar) != l) {
                            }
                            return l;
                        }
                        j6 = bVar.Z0;
                        j7 = bVar.Y0;
                        interfaceC10362w023 = (InterfaceC10362w02) bVar.a1;
                        RT1.n(obj);
                        abstractC10857y3 = C11100z3.a;
                        if (abstractC10857y3 == null) {
                        }
                        v = C5075aO1.v(j7 - nanoTime2, 0L);
                        if (v != 0) {
                        }
                        c3 = 3;
                        long c62 = C3718Ne0.c(v);
                        bVar.a1 = interfaceC10362w023;
                        bVar.Y0 = j7;
                        bVar.Z0 = j6;
                        c4 = 4;
                        bVar.c1 = 4;
                    } else {
                        j4 = bVar.Z0;
                        long j13 = bVar.Y0;
                        RT1.n(obj);
                        interfaceC10362w022 = (InterfaceC10362w02) bVar.a1;
                        j3 = j13;
                    }
                } else {
                    RT1.n(obj);
                    AbstractC10857y3 abstractC10857y32 = C11100z3.a;
                    if (abstractC10857y32 != null) {
                        nanoTime = abstractC10857y32.b();
                    } else {
                        nanoTime = System.nanoTime();
                    }
                    long d2 = nanoTime + C3718Ne0.d(j2);
                    interfaceC10362w022 = interfaceC10362w02;
                    bVar.a1 = interfaceC10362w022;
                    j3 = j;
                    bVar.Y0 = j3;
                    bVar.Z0 = d2;
                    bVar.c1 = 1;
                    if (P10.b(j2, bVar) != l) {
                        j4 = d2;
                    }
                    return l;
                }
                d = C3718Ne0.d(j3);
                interfaceC10362w024 = interfaceC10362w022;
                long j922 = j4 + d;
                c7458kA2 = C7458kA2.a;
                bVar.a1 = interfaceC10362w024;
                bVar.Y0 = j922;
                bVar.Z0 = d;
                bVar.c1 = 2;
                if (interfaceC10362w024.d0(c7458kA2, bVar) != l) {
                }
                return l;
            }
        }
        bVar = new b(hm);
        Object obj2 = bVar.b1;
        l = C7289jT0.l();
        i = bVar.c1;
        if (i == 0) {
        }
        d = C3718Ne0.d(j3);
        interfaceC10362w024 = interfaceC10362w022;
        long j9222 = j4 + d;
        c7458kA2 = C7458kA2.a;
        bVar.a1 = interfaceC10362w024;
        bVar.Y0 = j9222;
        bVar.Z0 = d;
        bVar.c1 = 2;
        if (interfaceC10362w024.d0(c7458kA2, bVar) != l) {
        }
        return l;
    }

    @InterfaceC3681Mt1
    @NotNull
    public static final OO1<C7458kA2> e(long j, long j2, @NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull EnumC11285zo2 enumC11285zo2) {
        if (j >= 0) {
            if (j2 >= 0) {
                return C10919yI1.g(C6502gE0.X, C8909q40.g().M(interfaceC5809dQ), 0, new c(enumC11285zo2, j, j2, null));
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
    }

    public static /* synthetic */ OO1 f(long j, long j2, InterfaceC5809dQ interfaceC5809dQ, EnumC11285zo2 enumC11285zo2, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        if ((i & 4) != 0) {
            interfaceC5809dQ = C3897Pa0.X;
        }
        if ((i & 8) != 0) {
            enumC11285zo2 = EnumC11285zo2.X;
        }
        return e(j, j2, interfaceC5809dQ, enumC11285zo2);
    }
}
