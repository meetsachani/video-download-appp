package o;

import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,328:1\n268#1,3:330\n268#1,3:333\n257#1:336\n259#1:338\n268#1,3:339\n257#1:342\n259#1:344\n268#1,3:345\n257#1:348\n259#1:350\n268#1,3:351\n105#2:329\n105#2:337\n105#2:343\n105#2:349\n105#2:354\n105#2:355\n105#2:358\n37#3,2:356\n37#3,2:359\n*S KotlinDebug\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n71#1:330,3\n99#1:333,3\n115#1:336\n115#1:338\n134#1:339,3\n152#1:342\n152#1:344\n173#1:345,3\n193#1:348\n193#1:350\n216#1:351,3\n28#1:329\n115#1:337\n152#1:343\n193#1:349\n233#1:354\n257#1:355\n284#1:358\n283#1:356,2\n302#1:359,2\n*E\n"})
/* renamed from: o.qw0 */
/* loaded from: classes4.dex */
public final /* synthetic */ class C9126qw0 {

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    /* renamed from: o.qw0$a */
    /* loaded from: classes4.dex */
    public static final class a<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ InterfaceC3882Ov0[] X;
        public final /* synthetic */ ZA0 Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
        @InterfaceC8303na2({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n116#2,5:259\n*E\n"})
        /* renamed from: o.qw0$a$a */
        /* loaded from: classes4.dex */
        public static final class C0330a extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, Object[], HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ ZA0 c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0330a(HM hm, ZA0 za0) {
                super(3, hm);
                this.c1 = za0;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x0047, code lost:
                if (r8 == r0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0053, code lost:
                if (r1.c(r8, r7) == r0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x0055, code lost:
                return r0;
             */
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
                    Object[] objArr = (Object[]) this.b1;
                    ZA0 za0 = this.c1;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.a1 = interfaceC4076Qv0;
                    this.Z0 = 1;
                    UP0.e(6);
                    obj = za0.r(obj2, obj3, obj4, this);
                    UP0.e(7);
                }
                this.a1 = null;
                this.Z0 = 2;
            }

            @Override // o.XA0
            /* renamed from: U */
            public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, Object[] objArr, HM<? super C7458kA2> hm) {
                C0330a c0330a = new C0330a(hm, this.c1);
                c0330a.a1 = interfaceC4076Qv0;
                c0330a.b1 = objArr;
                return c0330a.F(C7458kA2.a);
            }
        }

        public a(InterfaceC3882Ov0[] interfaceC3882Ov0Arr, ZA0 za0) {
            this.X = interfaceC3882Ov0Arr;
            this.Y = za0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            Object a = BG.a(interfaceC4076Qv0, this.X, C9126qw0.a(), new C0330a(null, this.Y), hm);
            if (a == C7289jT0.l()) {
                return a;
            }
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    /* renamed from: o.qw0$b */
    /* loaded from: classes4.dex */
    public static final class b<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ InterfaceC3882Ov0[] X;
        public final /* synthetic */ InterfaceC5265bB0 Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
        @InterfaceC8303na2({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n153#2,6:259\n*E\n"})
        /* renamed from: o.qw0$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, Object[], HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ InterfaceC5265bB0 c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HM hm, InterfaceC5265bB0 interfaceC5265bB0) {
                super(3, hm);
                this.c1 = interfaceC5265bB0;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
                if (r11 == r0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
                if (r1.c(r11, r10) == r0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
                return r0;
             */
            @Override // o.AbstractC5644cl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object F(Object obj) {
                InterfaceC4076Qv0 interfaceC4076Qv0;
                a aVar;
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
                    aVar = this;
                } else {
                    RT1.n(obj);
                    interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                    Object[] objArr = (Object[]) this.b1;
                    InterfaceC5265bB0 interfaceC5265bB0 = this.c1;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.a1 = interfaceC4076Qv0;
                    this.Z0 = 1;
                    UP0.e(6);
                    aVar = this;
                    obj = interfaceC5265bB0.c0(obj2, obj3, obj4, obj5, aVar);
                    UP0.e(7);
                }
                aVar.a1 = null;
                aVar.Z0 = 2;
            }

            @Override // o.XA0
            /* renamed from: U */
            public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, Object[] objArr, HM<? super C7458kA2> hm) {
                a aVar = new a(hm, this.c1);
                aVar.a1 = interfaceC4076Qv0;
                aVar.b1 = objArr;
                return aVar.F(C7458kA2.a);
            }
        }

        public b(InterfaceC3882Ov0[] interfaceC3882Ov0Arr, InterfaceC5265bB0 interfaceC5265bB0) {
            this.X = interfaceC3882Ov0Arr;
            this.Y = interfaceC5265bB0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            Object a2 = BG.a(interfaceC4076Qv0, this.X, C9126qw0.a(), new a(null, this.Y), hm);
            if (a2 == C7289jT0.l()) {
                return a2;
            }
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    /* renamed from: o.qw0$c */
    /* loaded from: classes4.dex */
    public static final class c<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ InterfaceC3882Ov0[] X;
        public final /* synthetic */ InterfaceC5507cB0 Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {259, 258}, m = "invokeSuspend", n = {}, s = {})
        @InterfaceC8303na2({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,258:1\n194#2,7:259\n*E\n"})
        /* renamed from: o.qw0$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, Object[], HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ InterfaceC5507cB0 c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HM hm, InterfaceC5507cB0 interfaceC5507cB0) {
                super(3, hm);
                this.c1 = interfaceC5507cB0;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
                if (r12 == r0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
                if (r1.c(r12, r11) == r0) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x005e, code lost:
                return r0;
             */
            @Override // o.AbstractC5644cl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object F(Object obj) {
                InterfaceC4076Qv0 interfaceC4076Qv0;
                a aVar;
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
                    aVar = this;
                } else {
                    RT1.n(obj);
                    interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                    Object[] objArr = (Object[]) this.b1;
                    InterfaceC5507cB0 interfaceC5507cB0 = this.c1;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.a1 = interfaceC4076Qv0;
                    this.Z0 = 1;
                    UP0.e(6);
                    aVar = this;
                    obj = interfaceC5507cB0.B(obj2, obj3, obj4, obj5, obj6, aVar);
                    UP0.e(7);
                }
                aVar.a1 = null;
                aVar.Z0 = 2;
            }

            @Override // o.XA0
            /* renamed from: U */
            public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, Object[] objArr, HM<? super C7458kA2> hm) {
                a aVar = new a(hm, this.c1);
                aVar.a1 = interfaceC4076Qv0;
                aVar.b1 = objArr;
                return aVar.F(C7458kA2.a);
            }
        }

        public c(InterfaceC3882Ov0[] interfaceC3882Ov0Arr, InterfaceC5507cB0 interfaceC5507cB0) {
            this.X = interfaceC3882Ov0Arr;
            this.Y = interfaceC5507cB0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            Object a2 = BG.a(interfaceC4076Qv0, this.X, C9126qw0.a(), new a(null, this.Y), hm);
            if (a2 == C7289jT0.l()) {
                return a2;
            }
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n29#2,2:109\n*E\n"})
    /* renamed from: o.qw0$d */
    /* loaded from: classes4.dex */
    public static final class d<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ InterfaceC3882Ov0 Y;
        public final /* synthetic */ XA0 Z;

        public d(InterfaceC3882Ov0 interfaceC3882Ov0, InterfaceC3882Ov0 interfaceC3882Ov02, XA0 xa0) {
            this.X = interfaceC3882Ov0;
            this.Y = interfaceC3882Ov02;
            this.Z = xa0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            Object a = BG.a(interfaceC4076Qv0, new InterfaceC3882Ov0[]{this.X, this.Y}, C9126qw0.a(), new g(this.Z, null), hm);
            if (a == C7289jT0.l()) {
                return a;
            }
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n234#2,2:109\n*E\n"})
    /* renamed from: o.qw0$e */
    /* loaded from: classes4.dex */
    public static final class e<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ InterfaceC3882Ov0[] X;
        public final /* synthetic */ VA0 Y;

        /* renamed from: o.qw0$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HM hm) {
                super(hm);
                e.this = r1;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return e.this.a(null, this);
            }
        }

        public e(InterfaceC3882Ov0[] interfaceC3882Ov0Arr, VA0 va0) {
            this.X = interfaceC3882Ov0Arr;
            this.Y = va0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.X;
            C6562gT0.w();
            h hVar = new h(this.X);
            C6562gT0.w();
            Object a2 = BG.a(interfaceC4076Qv0, interfaceC3882Ov0Arr, hVar, new i(this.Y, null), hm);
            if (a2 == C7289jT0.l()) {
                return a2;
            }
            return C7458kA2.a;
        }

        public Object e(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            UP0.e(4);
            new a(hm);
            UP0.e(5);
            InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.X;
            C6562gT0.w();
            h hVar = new h(this.X);
            C6562gT0.w();
            i iVar = new i(this.Y, null);
            UP0.e(0);
            BG.a(interfaceC4076Qv0, interfaceC3882Ov0Arr, hVar, iVar, hm);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n285#2,5:109\n*E\n"})
    /* renamed from: o.qw0$f */
    /* loaded from: classes4.dex */
    public static final class f<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ InterfaceC3882Ov0[] X;
        public final /* synthetic */ VA0 Y;

        /* renamed from: o.qw0$f$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;

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

        public f(InterfaceC3882Ov0[] interfaceC3882Ov0Arr, VA0 va0) {
            this.X = interfaceC3882Ov0Arr;
            this.Y = va0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.X;
            C6562gT0.w();
            j jVar = new j(this.X);
            C6562gT0.w();
            Object a2 = BG.a(interfaceC4076Qv0, interfaceC3882Ov0Arr, jVar, new k(this.Y, null), hm);
            if (a2 == C7289jT0.l()) {
                return a2;
            }
            return C7458kA2.a;
        }

        public Object e(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            UP0.e(4);
            new a(hm);
            UP0.e(5);
            InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.X;
            C6562gT0.w();
            j jVar = new j(this.X);
            C6562gT0.w();
            k kVar = new k(this.Y, null);
            UP0.e(0);
            BG.a(interfaceC4076Qv0, interfaceC3882Ov0Arr, jVar, kVar, hm);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {29, 29}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$g */
    /* loaded from: classes4.dex */
    public static final class g<R> extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, Object[], HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ XA0<T1, T2, HM<? super R>, Object> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0, HM<? super g> hm) {
            super(3, hm);
            this.c1 = xa0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x003d, code lost:
            if (r7 == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:
            if (r1.c(r7, r6) == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
            return r0;
         */
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
                Object[] objArr = (Object[]) this.b1;
                XA0<T1, T2, HM<? super R>, Object> xa0 = this.c1;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.a1 = interfaceC4076Qv0;
                this.Z0 = 1;
                obj = xa0.P(obj2, obj3, this);
            }
            this.a1 = null;
            this.Z0 = 2;
        }

        @Override // o.XA0
        /* renamed from: U */
        public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, Object[] objArr, HM<? super C7458kA2> hm) {
            g gVar = new g(this.c1, hm);
            gVar.a1 = interfaceC4076Qv0;
            gVar.b1 = objArr;
            return gVar.F(C7458kA2.a);
        }
    }

    /* renamed from: o.qw0$h */
    /* loaded from: classes4.dex */
    public static final class h<T> implements FA0<T[]> {
        public final /* synthetic */ InterfaceC3882Ov0<T>[] X;

        /* JADX WARN: Multi-variable type inference failed */
        public h(InterfaceC3882Ov0<? extends T>[] interfaceC3882Ov0Arr) {
            this.X = interfaceC3882Ov0Arr;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final T[] invoke() {
            int length = this.X.length;
            C6562gT0.y(0, "T?");
            return (T[]) new Object[length];
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {234, 234}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$i */
    /* loaded from: classes4.dex */
    public static final class i<R, T> extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ VA0<T[], HM<? super R>, Object> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(VA0<? super T[], ? super HM<? super R>, ? extends Object> va0, HM<? super i> hm) {
            super(3, hm);
            this.c1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0038, code lost:
            if (r6 == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
            if (r1.c(r6, r5) == r0) goto L14;
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
                RT1.n(obj);
                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
            } else {
                RT1.n(obj);
                InterfaceC4076Qv0 interfaceC4076Qv02 = (InterfaceC4076Qv0) this.a1;
                VA0<T[], HM<? super R>, Object> va0 = this.c1;
                this.a1 = interfaceC4076Qv02;
                this.Z0 = 1;
                obj = va0.i((Object[]) this.b1, this);
                interfaceC4076Qv0 = interfaceC4076Qv02;
            }
            this.a1 = null;
            this.Z0 = 2;
        }

        @Override // o.XA0
        /* renamed from: U */
        public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, T[] tArr, HM<? super C7458kA2> hm) {
            C6562gT0.w();
            i iVar = new i(this.c1, hm);
            iVar.a1 = interfaceC4076Qv0;
            iVar.b1 = tArr;
            return iVar.F(C7458kA2.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object V(Object obj) {
            Object i = this.c1.i((Object[]) this.b1, this);
            UP0.e(0);
            ((InterfaceC4076Qv0) this.a1).c(i, this);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    /* renamed from: o.qw0$j */
    /* loaded from: classes4.dex */
    public static final class j<T> implements FA0<T[]> {
        public final /* synthetic */ InterfaceC3882Ov0<T>[] X;

        public j(InterfaceC3882Ov0<T>[] interfaceC3882Ov0Arr) {
            this.X = interfaceC3882Ov0Arr;
        }

        @Override // o.FA0
        /* renamed from: c */
        public final T[] invoke() {
            int length = this.X.length;
            C6562gT0.y(0, "T?");
            return (T[]) new Object[length];
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {288, 288}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$k */
    /* loaded from: classes4.dex */
    public static final class k<R, T> extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ VA0<T[], HM<? super R>, Object> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(VA0<? super T[], ? super HM<? super R>, ? extends Object> va0, HM<? super k> hm) {
            super(3, hm);
            this.c1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0038, code lost:
            if (r6 == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
            if (r1.c(r6, r5) == r0) goto L14;
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
                RT1.n(obj);
                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
            } else {
                RT1.n(obj);
                InterfaceC4076Qv0 interfaceC4076Qv02 = (InterfaceC4076Qv0) this.a1;
                VA0<T[], HM<? super R>, Object> va0 = this.c1;
                this.a1 = interfaceC4076Qv02;
                this.Z0 = 1;
                obj = va0.i((Object[]) this.b1, this);
                interfaceC4076Qv0 = interfaceC4076Qv02;
            }
            this.a1 = null;
            this.Z0 = 2;
        }

        @Override // o.XA0
        /* renamed from: U */
        public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, T[] tArr, HM<? super C7458kA2> hm) {
            C6562gT0.w();
            k kVar = new k(this.c1, hm);
            kVar.a1 = interfaceC4076Qv0;
            kVar.b1 = tArr;
            return kVar.F(C7458kA2.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object V(Object obj) {
            Object i = this.c1.i((Object[]) this.b1, this);
            UP0.e(0);
            ((InterfaceC4076Qv0) this.a1).c(i, this);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$l */
    /* loaded from: classes4.dex */
    public static final class l<R> extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC3882Ov0[] b1;
        public final /* synthetic */ ZA0 c1;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {C4731Xo.d1}, m = "invokeSuspend", n = {}, s = {})
        @InterfaceC8303na2({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n72#2,5:270\n*E\n"})
        /* renamed from: o.qw0$l$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, Object[], HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ ZA0 c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HM hm, ZA0 za0) {
                super(3, hm);
                this.c1 = za0;
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
                    Object[] objArr = (Object[]) this.b1;
                    ZA0 za0 = this.c1;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.Z0 = 1;
                    UP0.e(6);
                    Object r = za0.r((InterfaceC4076Qv0) this.a1, obj2, obj3, this);
                    UP0.e(7);
                    if (r == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.XA0
            /* renamed from: U */
            public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, Object[] objArr, HM<? super C7458kA2> hm) {
                a aVar = new a(hm, this.c1);
                aVar.a1 = interfaceC4076Qv0;
                aVar.b1 = objArr;
                return aVar.F(C7458kA2.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC3882Ov0[] interfaceC3882Ov0Arr, HM hm, ZA0 za0) {
            super(2, hm);
            this.b1 = interfaceC3882Ov0Arr;
            this.c1 = za0;
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
                InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.b1;
                FA0 a2 = C9126qw0.a();
                a aVar = new a(null, this.c1);
                this.Z0 = 1;
                if (BG.a((InterfaceC4076Qv0) this.a1, interfaceC3882Ov0Arr, a2, aVar, this) == l) {
                    return l;
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
            l lVar = new l(this.b1, hm, this.c1);
            lVar.a1 = obj;
            return lVar;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$m */
    /* loaded from: classes4.dex */
    public static final class m<R> extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC3882Ov0[] b1;
        public final /* synthetic */ ZA0 c1;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {C4731Xo.d1}, m = "invokeSuspend", n = {}, s = {})
        @InterfaceC8303na2({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n100#2,5:270\n*E\n"})
        /* renamed from: o.qw0$m$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, Object[], HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ ZA0 c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HM hm, ZA0 za0) {
                super(3, hm);
                this.c1 = za0;
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
                    Object[] objArr = (Object[]) this.b1;
                    ZA0 za0 = this.c1;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.Z0 = 1;
                    UP0.e(6);
                    Object r = za0.r((InterfaceC4076Qv0) this.a1, obj2, obj3, this);
                    UP0.e(7);
                    if (r == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.XA0
            /* renamed from: U */
            public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, Object[] objArr, HM<? super C7458kA2> hm) {
                a aVar = new a(hm, this.c1);
                aVar.a1 = interfaceC4076Qv0;
                aVar.b1 = objArr;
                return aVar.F(C7458kA2.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC3882Ov0[] interfaceC3882Ov0Arr, HM hm, ZA0 za0) {
            super(2, hm);
            this.b1 = interfaceC3882Ov0Arr;
            this.c1 = za0;
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
                InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.b1;
                FA0 a2 = C9126qw0.a();
                a aVar = new a(null, this.c1);
                this.Z0 = 1;
                if (BG.a((InterfaceC4076Qv0) this.a1, interfaceC3882Ov0Arr, a2, aVar, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((m) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            m mVar = new m(this.b1, hm, this.c1);
            mVar.a1 = obj;
            return mVar;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$n */
    /* loaded from: classes4.dex */
    public static final class n<R> extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC3882Ov0[] b1;
        public final /* synthetic */ InterfaceC5265bB0 c1;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", i = {}, l = {C4731Xo.d1}, m = "invokeSuspend", n = {}, s = {})
        @InterfaceC8303na2({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n135#2,6:270\n*E\n"})
        /* renamed from: o.qw0$n$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, Object[], HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ InterfaceC5265bB0 c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HM hm, InterfaceC5265bB0 interfaceC5265bB0) {
                super(3, hm);
                this.c1 = interfaceC5265bB0;
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
                    InterfaceC4076Qv0 interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                    Object[] objArr = (Object[]) this.b1;
                    InterfaceC5265bB0 interfaceC5265bB0 = this.c1;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.Z0 = 1;
                    UP0.e(6);
                    Object c0 = interfaceC5265bB0.c0(interfaceC4076Qv0, obj2, obj3, obj4, this);
                    UP0.e(7);
                    if (c0 == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.XA0
            /* renamed from: U */
            public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, Object[] objArr, HM<? super C7458kA2> hm) {
                a aVar = new a(hm, this.c1);
                aVar.a1 = interfaceC4076Qv0;
                aVar.b1 = objArr;
                return aVar.F(C7458kA2.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC3882Ov0[] interfaceC3882Ov0Arr, HM hm, InterfaceC5265bB0 interfaceC5265bB0) {
            super(2, hm);
            this.b1 = interfaceC3882Ov0Arr;
            this.c1 = interfaceC5265bB0;
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
                InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.b1;
                FA0 a2 = C9126qw0.a();
                a aVar = new a(null, this.c1);
                this.Z0 = 1;
                if (BG.a((InterfaceC4076Qv0) this.a1, interfaceC3882Ov0Arr, a2, aVar, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((n) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            n nVar = new n(this.b1, hm, this.c1);
            nVar.a1 = obj;
            return nVar;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$o */
    /* loaded from: classes4.dex */
    public static final class o<R> extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC3882Ov0[] b1;
        public final /* synthetic */ InterfaceC5507cB0 c1;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {C4731Xo.d1}, m = "invokeSuspend", n = {}, s = {})
        @InterfaceC8303na2({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n174#2,7:270\n*E\n"})
        /* renamed from: o.qw0$o$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, Object[], HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ InterfaceC5507cB0 c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HM hm, InterfaceC5507cB0 interfaceC5507cB0) {
                super(3, hm);
                this.c1 = interfaceC5507cB0;
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
                    InterfaceC4076Qv0 interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                    Object[] objArr = (Object[]) this.b1;
                    InterfaceC5507cB0 interfaceC5507cB0 = this.c1;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.Z0 = 1;
                    UP0.e(6);
                    Object B = interfaceC5507cB0.B(interfaceC4076Qv0, obj2, obj3, obj4, obj5, this);
                    UP0.e(7);
                    if (B == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.XA0
            /* renamed from: U */
            public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, Object[] objArr, HM<? super C7458kA2> hm) {
                a aVar = new a(hm, this.c1);
                aVar.a1 = interfaceC4076Qv0;
                aVar.b1 = objArr;
                return aVar.F(C7458kA2.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC3882Ov0[] interfaceC3882Ov0Arr, HM hm, InterfaceC5507cB0 interfaceC5507cB0) {
            super(2, hm);
            this.b1 = interfaceC3882Ov0Arr;
            this.c1 = interfaceC5507cB0;
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
                InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.b1;
                FA0 a2 = C9126qw0.a();
                a aVar = new a(null, this.c1);
                this.Z0 = 1;
                if (BG.a((InterfaceC4076Qv0) this.a1, interfaceC3882Ov0Arr, a2, aVar, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((o) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            o oVar = new o(this.b1, hm, this.c1);
            oVar.a1 = obj;
            return oVar;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$p */
    /* loaded from: classes4.dex */
    public static final class p<R> extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC3882Ov0[] b1;
        public final /* synthetic */ InterfaceC5750dB0 c1;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {C4731Xo.d1}, m = "invokeSuspend", n = {}, s = {})
        @InterfaceC8303na2({"SMAP\nZip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,269:1\n217#2,8:270\n*E\n"})
        /* renamed from: o.qw0$p$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, Object[], HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ InterfaceC5750dB0 c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HM hm, InterfaceC5750dB0 interfaceC5750dB0) {
                super(3, hm);
                this.c1 = interfaceC5750dB0;
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
                    InterfaceC4076Qv0 interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
                    Object[] objArr = (Object[]) this.b1;
                    InterfaceC5750dB0 interfaceC5750dB0 = this.c1;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.Z0 = 1;
                    UP0.e(6);
                    Object G = interfaceC5750dB0.G(interfaceC4076Qv0, obj2, obj3, obj4, obj5, obj6, this);
                    UP0.e(7);
                    if (G == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.XA0
            /* renamed from: U */
            public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, Object[] objArr, HM<? super C7458kA2> hm) {
                a aVar = new a(hm, this.c1);
                aVar.a1 = interfaceC4076Qv0;
                aVar.b1 = objArr;
                return aVar.F(C7458kA2.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC3882Ov0[] interfaceC3882Ov0Arr, HM hm, InterfaceC5750dB0 interfaceC5750dB0) {
            super(2, hm);
            this.b1 = interfaceC3882Ov0Arr;
            this.c1 = interfaceC5750dB0;
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
                InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.b1;
                FA0 a2 = C9126qw0.a();
                a aVar = new a(null, this.c1);
                this.Z0 = 1;
                if (BG.a((InterfaceC4076Qv0) this.a1, interfaceC3882Ov0Arr, a2, aVar, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((p) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            p pVar = new p(this.b1, hm, this.c1);
            pVar.a1 = obj;
            return pVar;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$q */
    /* loaded from: classes4.dex */
    public static final class q<R> extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC3882Ov0<T>[] b1;
        public final /* synthetic */ XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> c1;

        /* renamed from: o.qw0$q$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FA0<T[]> {
            public final /* synthetic */ InterfaceC3882Ov0<T>[] X;

            /* JADX WARN: Multi-variable type inference failed */
            public a(InterfaceC3882Ov0<? extends T>[] interfaceC3882Ov0Arr) {
                this.X = interfaceC3882Ov0Arr;
            }

            @Override // o.FA0
            /* renamed from: c */
            public final T[] invoke() {
                int length = this.X.length;
                C6562gT0.y(0, "T?");
                return (T[]) new Object[length];
            }
        }

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {247}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.qw0$q$b */
        /* loaded from: classes4.dex */
        public static final class b<T> extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(XA0<? super InterfaceC4076Qv0<? super R>, ? super T[], ? super HM<? super C7458kA2>, ? extends Object> xa0, HM<? super b> hm) {
                super(3, hm);
                this.c1 = xa0;
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
                    XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> xa0 = this.c1;
                    this.a1 = null;
                    this.Z0 = 1;
                    if (xa0.P((InterfaceC4076Qv0) this.a1, (Object[]) this.b1, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.XA0
            /* renamed from: U */
            public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, T[] tArr, HM<? super C7458kA2> hm) {
                C6562gT0.w();
                b bVar = new b(this.c1, hm);
                bVar.a1 = interfaceC4076Qv0;
                bVar.b1 = tArr;
                return bVar.F(C7458kA2.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object V(Object obj) {
                this.c1.P((InterfaceC4076Qv0) this.a1, (Object[]) this.b1, this);
                return C7458kA2.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public q(InterfaceC3882Ov0<? extends T>[] interfaceC3882Ov0Arr, XA0<? super InterfaceC4076Qv0<? super R>, ? super T[], ? super HM<? super C7458kA2>, ? extends Object> xa0, HM<? super q> hm) {
            super(2, hm);
            this.b1 = interfaceC3882Ov0Arr;
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
                InterfaceC3882Ov0<T>[] interfaceC3882Ov0Arr = this.b1;
                C6562gT0.w();
                a aVar = new a(this.b1);
                C6562gT0.w();
                b bVar = new b(this.c1, null);
                this.Z0 = 1;
                if (BG.a((InterfaceC4076Qv0) this.a1, interfaceC3882Ov0Arr, aVar, bVar, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((q) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        public final Object V(Object obj) {
            InterfaceC3882Ov0<T>[] interfaceC3882Ov0Arr = this.b1;
            C6562gT0.w();
            a aVar = new a(this.b1);
            C6562gT0.w();
            b bVar = new b(this.c1, null);
            UP0.e(0);
            BG.a((InterfaceC4076Qv0) this.a1, interfaceC3882Ov0Arr, aVar, bVar, this);
            UP0.e(1);
            return C7458kA2.a;
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            q qVar = new q(this.b1, this.c1, hm);
            qVar.a1 = obj;
            return qVar;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$r */
    /* loaded from: classes4.dex */
    public static final class r<R> extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC3882Ov0<T>[] b1;
        public final /* synthetic */ XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> c1;

        /* renamed from: o.qw0$r$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements FA0<T[]> {
            public final /* synthetic */ InterfaceC3882Ov0<T>[] X;

            public a(InterfaceC3882Ov0<T>[] interfaceC3882Ov0Arr) {
                this.X = interfaceC3882Ov0Arr;
            }

            @Override // o.FA0
            /* renamed from: c */
            public final T[] invoke() {
                int length = this.X.length;
                C6562gT0.y(0, "T?");
                return (T[]) new Object[length];
            }
        }

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {304}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.qw0$r$b */
        /* loaded from: classes4.dex */
        public static final class b<T> extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(XA0<? super InterfaceC4076Qv0<? super R>, ? super T[], ? super HM<? super C7458kA2>, ? extends Object> xa0, HM<? super b> hm) {
                super(3, hm);
                this.c1 = xa0;
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
                    XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> xa0 = this.c1;
                    this.a1 = null;
                    this.Z0 = 1;
                    if (xa0.P((InterfaceC4076Qv0) this.a1, (Object[]) this.b1, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.XA0
            /* renamed from: U */
            public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, T[] tArr, HM<? super C7458kA2> hm) {
                C6562gT0.w();
                b bVar = new b(this.c1, hm);
                bVar.a1 = interfaceC4076Qv0;
                bVar.b1 = tArr;
                return bVar.F(C7458kA2.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object V(Object obj) {
                this.c1.P((InterfaceC4076Qv0) this.a1, (Object[]) this.b1, this);
                return C7458kA2.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(InterfaceC3882Ov0<T>[] interfaceC3882Ov0Arr, XA0<? super InterfaceC4076Qv0<? super R>, ? super T[], ? super HM<? super C7458kA2>, ? extends Object> xa0, HM<? super r> hm) {
            super(2, hm);
            this.b1 = interfaceC3882Ov0Arr;
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
                InterfaceC3882Ov0<T>[] interfaceC3882Ov0Arr = this.b1;
                C6562gT0.w();
                a aVar = new a(this.b1);
                C6562gT0.w();
                b bVar = new b(this.c1, null);
                this.Z0 = 1;
                if (BG.a((InterfaceC4076Qv0) this.a1, interfaceC3882Ov0Arr, aVar, bVar, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((r) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        public final Object V(Object obj) {
            InterfaceC3882Ov0<T>[] interfaceC3882Ov0Arr = this.b1;
            C6562gT0.w();
            a aVar = new a(this.b1);
            C6562gT0.w();
            b bVar = new b(this.c1, null);
            UP0.e(0);
            BG.a((InterfaceC4076Qv0) this.a1, interfaceC3882Ov0Arr, aVar, bVar, this);
            UP0.e(1);
            return C7458kA2.a;
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            r rVar = new r(this.b1, this.c1, hm);
            rVar.a1 = obj;
            return rVar;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$s */
    /* loaded from: classes4.dex */
    public static final class s<R> extends AbstractC4225Si2 implements VA0<InterfaceC4076Qv0<? super R>, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC3882Ov0<T>[] b1;
        public final /* synthetic */ XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> c1;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.qw0$s$a */
        /* loaded from: classes4.dex */
        public static final class a<T> extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public /* synthetic */ Object b1;
            public final /* synthetic */ XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(XA0<? super InterfaceC4076Qv0<? super R>, ? super T[], ? super HM<? super C7458kA2>, ? extends Object> xa0, HM<? super a> hm) {
                super(3, hm);
                this.c1 = xa0;
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
                    XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> xa0 = this.c1;
                    this.a1 = null;
                    this.Z0 = 1;
                    if (xa0.P((InterfaceC4076Qv0) this.a1, (Object[]) this.b1, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            @Override // o.XA0
            /* renamed from: U */
            public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, T[] tArr, HM<? super C7458kA2> hm) {
                C6562gT0.w();
                a aVar = new a(this.c1, hm);
                aVar.a1 = interfaceC4076Qv0;
                aVar.b1 = tArr;
                return aVar.F(C7458kA2.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object V(Object obj) {
                this.c1.P((InterfaceC4076Qv0) this.a1, (Object[]) this.b1, this);
                return C7458kA2.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(InterfaceC3882Ov0<? extends T>[] interfaceC3882Ov0Arr, XA0<? super InterfaceC4076Qv0<? super R>, ? super T[], ? super HM<? super C7458kA2>, ? extends Object> xa0, HM<? super s> hm) {
            super(2, hm);
            this.b1 = interfaceC3882Ov0Arr;
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
                InterfaceC3882Ov0<T>[] interfaceC3882Ov0Arr = this.b1;
                FA0 a2 = C9126qw0.a();
                C6562gT0.w();
                a aVar = new a(this.c1, null);
                this.Z0 = 1;
                if (BG.a((InterfaceC4076Qv0) this.a1, interfaceC3882Ov0Arr, a2, aVar, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            return ((s) t(interfaceC4076Qv0, hm)).F(C7458kA2.a);
        }

        public final Object V(Object obj) {
            InterfaceC3882Ov0<T>[] interfaceC3882Ov0Arr = this.b1;
            FA0 a2 = C9126qw0.a();
            C6562gT0.w();
            a aVar = new a(this.c1, null);
            UP0.e(0);
            BG.a((InterfaceC4076Qv0) this.a1, interfaceC3882Ov0Arr, a2, aVar, this);
            UP0.e(1);
            return C7458kA2.a;
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            s sVar = new s(this.b1, this.c1, hm);
            sVar.a1 = obj;
            return sVar;
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,108:1\n258#2,2:109\n*E\n"})
    /* renamed from: o.qw0$t */
    /* loaded from: classes4.dex */
    public static final class t<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ InterfaceC3882Ov0[] X;
        public final /* synthetic */ VA0 Y;

        /* renamed from: o.qw0$t$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HM hm) {
                super(hm);
                t.this = r1;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return t.this.a(null, this);
            }
        }

        public t(InterfaceC3882Ov0[] interfaceC3882Ov0Arr, VA0 va0) {
            this.X = interfaceC3882Ov0Arr;
            this.Y = va0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.X;
            FA0 a2 = C9126qw0.a();
            C6562gT0.w();
            Object a3 = BG.a(interfaceC4076Qv0, interfaceC3882Ov0Arr, a2, new u(this.Y, null), hm);
            if (a3 == C7289jT0.l()) {
                return a3;
            }
            return C7458kA2.a;
        }

        public Object e(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            UP0.e(4);
            new a(hm);
            UP0.e(5);
            InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.X;
            FA0 a2 = C9126qw0.a();
            C6562gT0.w();
            u uVar = new u(this.Y, null);
            UP0.e(0);
            BG.a(interfaceC4076Qv0, interfaceC3882Ov0Arr, a2, uVar, hm);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {258, 258}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.qw0$u */
    /* loaded from: classes4.dex */
    public static final class u<R, T> extends AbstractC4225Si2 implements XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ VA0<T[], HM<? super R>, Object> c1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public u(VA0<? super T[], ? super HM<? super R>, ? extends Object> va0, HM<? super u> hm) {
            super(3, hm);
            this.c1 = va0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0038, code lost:
            if (r6 == r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0044, code lost:
            if (r1.c(r6, r5) == r0) goto L14;
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
                RT1.n(obj);
                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.a1;
            } else {
                RT1.n(obj);
                InterfaceC4076Qv0 interfaceC4076Qv02 = (InterfaceC4076Qv0) this.a1;
                VA0<T[], HM<? super R>, Object> va0 = this.c1;
                this.a1 = interfaceC4076Qv02;
                this.Z0 = 1;
                obj = va0.i((Object[]) this.b1, this);
                interfaceC4076Qv0 = interfaceC4076Qv02;
            }
            this.a1 = null;
            this.Z0 = 2;
        }

        @Override // o.XA0
        /* renamed from: U */
        public final Object P(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, T[] tArr, HM<? super C7458kA2> hm) {
            C6562gT0.w();
            u uVar = new u(this.c1, hm);
            uVar.a1 = interfaceC4076Qv0;
            uVar.b1 = tArr;
            return uVar.F(C7458kA2.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object V(Object obj) {
            Object i = this.c1.i((Object[]) this.b1, this);
            UP0.e(0);
            ((InterfaceC4076Qv0) this.a1).c(i, this);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    /* renamed from: o.qw0$v */
    /* loaded from: classes4.dex */
    public static final class v implements FA0 {
        public static final v X = new v();

        @Override // o.FA0
        /* renamed from: c */
        public final Void invoke() {
            return null;
        }
    }

    public static final /* synthetic */ FA0 a() {
        return r();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4808)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> o.InterfaceC3882Ov0<R> b(java.lang.Iterable<? extends o.InterfaceC3882Ov0<? extends T>> r1, o.VA0<? super T[], ? super o.HM<? super R>, ? extends java.lang.Object> r2) {
        /*
            java.util.List r1 = o.C10662xF.Y5(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = 0
            o.Ov0[] r0 = new o.InterfaceC3882Ov0[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            o.Ov0[] r1 = (o.InterfaceC3882Ov0[]) r1
            o.C6562gT0.w()
            o.qw0$f r0 = new o.qw0$f
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9126qw0.b(java.lang.Iterable, o.VA0):o.Ov0");
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> InterfaceC3882Ov0<R> c(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @NotNull InterfaceC3882Ov0<? extends T5> interfaceC3882Ov05, @NotNull InterfaceC5507cB0<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super HM<? super R>, ? extends Object> interfaceC5507cB0) {
        return new c(new InterfaceC3882Ov0[]{interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04, interfaceC3882Ov05}, interfaceC5507cB0);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> InterfaceC3882Ov0<R> d(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @NotNull InterfaceC5265bB0<? super T1, ? super T2, ? super T3, ? super T4, ? super HM<? super R>, ? extends Object> interfaceC5265bB0) {
        return new b(new InterfaceC3882Ov0[]{interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04}, interfaceC5265bB0);
    }

    @NotNull
    public static final <T1, T2, T3, R> InterfaceC3882Ov0<R> e(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @InterfaceC5183ar @NotNull ZA0<? super T1, ? super T2, ? super T3, ? super HM<? super R>, ? extends Object> za0) {
        return new a(new InterfaceC3882Ov0[]{interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03}, za0);
    }

    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> f(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0) {
        return C4467Uv0.J0(interfaceC3882Ov0, interfaceC3882Ov02, xa0);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4808)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> o.InterfaceC3882Ov0<R> g(o.InterfaceC3882Ov0<? extends T>[] r1, o.VA0<? super T[], ? super o.HM<? super R>, ? extends java.lang.Object> r2) {
        /*
            o.C6562gT0.w()
            o.qw0$e r0 = new o.qw0$e
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9126qw0.g(o.Ov0[], o.VA0):o.Ov0");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4808)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> o.InterfaceC3882Ov0<R> h(java.lang.Iterable<? extends o.InterfaceC3882Ov0<? extends T>> r2, @o.InterfaceC5183ar o.XA0<? super o.InterfaceC4076Qv0<? super R>, ? super T[], ? super o.HM<? super o.C7458kA2>, ? extends java.lang.Object> r3) {
        /*
            java.util.List r2 = o.C10662xF.Y5(r2)
            java.util.Collection r2 = (java.util.Collection) r2
            r0 = 0
            o.Ov0[] r0 = new o.InterfaceC3882Ov0[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            o.Ov0[] r2 = (o.InterfaceC3882Ov0[]) r2
            o.C6562gT0.w()
            o.qw0$r r0 = new o.qw0$r
            r1 = 0
            r0.<init>(r2, r3, r1)
            o.Ov0 r2 = o.C4467Uv0.I0(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9126qw0.h(java.lang.Iterable, o.XA0):o.Ov0");
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> InterfaceC3882Ov0<R> i(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @NotNull InterfaceC3882Ov0<? extends T5> interfaceC3882Ov05, @InterfaceC5183ar @NotNull InterfaceC5750dB0<? super InterfaceC4076Qv0<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super HM<? super C7458kA2>, ? extends Object> interfaceC5750dB0) {
        return C4467Uv0.I0(new p(new InterfaceC3882Ov0[]{interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04, interfaceC3882Ov05}, null, interfaceC5750dB0));
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> InterfaceC3882Ov0<R> j(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @NotNull InterfaceC3882Ov0<? extends T4> interfaceC3882Ov04, @InterfaceC5183ar @NotNull InterfaceC5507cB0<? super InterfaceC4076Qv0<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super HM<? super C7458kA2>, ? extends Object> interfaceC5507cB0) {
        return C4467Uv0.I0(new o(new InterfaceC3882Ov0[]{interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03, interfaceC3882Ov04}, null, interfaceC5507cB0));
    }

    @NotNull
    public static final <T1, T2, T3, R> InterfaceC3882Ov0<R> k(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull InterfaceC3882Ov0<? extends T3> interfaceC3882Ov03, @InterfaceC5183ar @NotNull InterfaceC5265bB0<? super InterfaceC4076Qv0<? super R>, ? super T1, ? super T2, ? super T3, ? super HM<? super C7458kA2>, ? extends Object> interfaceC5265bB0) {
        return C4467Uv0.I0(new n(new InterfaceC3882Ov0[]{interfaceC3882Ov0, interfaceC3882Ov02, interfaceC3882Ov03}, null, interfaceC5265bB0));
    }

    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> l(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @InterfaceC5183ar @NotNull ZA0<? super InterfaceC4076Qv0<? super R>, ? super T1, ? super T2, ? super HM<? super C7458kA2>, ? extends Object> za0) {
        return C4467Uv0.I0(new m(new InterfaceC3882Ov0[]{interfaceC3882Ov0, interfaceC3882Ov02}, null, za0));
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4808)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> o.InterfaceC3882Ov0<R> m(o.InterfaceC3882Ov0<? extends T>[] r2, @o.InterfaceC5183ar o.XA0<? super o.InterfaceC4076Qv0<? super R>, ? super T[], ? super o.HM<? super o.C7458kA2>, ? extends java.lang.Object> r3) {
        /*
            o.C6562gT0.w()
            o.qw0$q r0 = new o.qw0$q
            r1 = 0
            r0.<init>(r2, r3, r1)
            o.Ov0 r2 = o.C4467Uv0.I0(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9126qw0.m(o.Ov0[], o.XA0):o.Ov0");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4808)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> o.InterfaceC3882Ov0<R> n(o.InterfaceC3882Ov0<? extends T>[] r2, @o.InterfaceC5183ar o.XA0<? super o.InterfaceC4076Qv0<? super R>, ? super T[], ? super o.HM<? super o.C7458kA2>, ? extends java.lang.Object> r3) {
        /*
            o.C6562gT0.w()
            o.qw0$s r0 = new o.qw0$s
            r1 = 0
            r0.<init>(r2, r3, r1)
            o.Ov0 r2 = o.C4467Uv0.I0(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9126qw0.n(o.Ov0[], o.XA0):o.Ov0");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4808)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static final /* synthetic */ <T, R> o.InterfaceC3882Ov0<R> o(o.InterfaceC3882Ov0<? extends T>[] r1, o.VA0<? super T[], ? super o.HM<? super R>, ? extends java.lang.Object> r2) {
        /*
            o.C6562gT0.w()
            o.qw0$t r0 = new o.qw0$t
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C9126qw0.o(o.Ov0[], o.VA0):o.Ov0");
    }

    @InterfaceC8046mW0(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> p(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0) {
        return new d(interfaceC3882Ov0, interfaceC3882Ov02, xa0);
    }

    @InterfaceC8046mW0(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> q(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @InterfaceC5183ar @NotNull ZA0<? super InterfaceC4076Qv0<? super R>, ? super T1, ? super T2, ? super HM<? super C7458kA2>, ? extends Object> za0) {
        return C4467Uv0.I0(new l(new InterfaceC3882Ov0[]{interfaceC3882Ov0, interfaceC3882Ov02}, null, za0));
    }

    public static final <T> FA0<T[]> r() {
        return v.X;
    }

    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> s(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0) {
        return BG.b(interfaceC3882Ov0, interfaceC3882Ov02, xa0);
    }
}
