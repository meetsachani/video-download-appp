package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,350:1\n105#2:351\n105#2:352\n105#2:353\n105#2:354\n105#2:355\n105#2:356\n105#2:357\n105#2:358\n105#2:359\n105#2:360\n105#2:361\n105#2:362\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n64#1:351\n78#1:352\n85#1:353\n94#1:354\n103#1:355\n118#1:356\n127#1:357\n149#1:358\n160#1:359\n171#1:360\n180#1:361\n189#1:362\n*E\n"})
/* renamed from: o.Vv0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C4564Vv0 {

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n190#2:109\n191#2,2:111\n193#2:114\n1863#3:110\n1864#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n190#1:110\n190#1:113\n*E\n"})
    /* renamed from: o.Vv0$a */
    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC3882Ov0<Long> {
        public final /* synthetic */ W41 X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", f = "Builders.kt", i = {0}, l = {111}, m = "collect", n = {"$this$asFlow_u24lambda_u2419"}, s = {"L$0"})
        /* renamed from: o.Vv0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0237a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;
            public Object c1;

            public C0237a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(W41 w41) {
            this.X = w41;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super Long> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            C0237a c0237a;
            int i;
            InterfaceC4076Qv0<? super Long> interfaceC4076Qv02;
            Iterator<Long> it;
            if (hm instanceof C0237a) {
                c0237a = (C0237a) hm;
                int i2 = c0237a.Z0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0237a.Z0 = i2 - Integer.MIN_VALUE;
                    Object obj = c0237a.Y0;
                    Object l = C7289jT0.l();
                    i = c0237a.Z0;
                    if (i == 0) {
                        if (i == 1) {
                            it = (Iterator) c0237a.c1;
                            RT1.n(obj);
                            interfaceC4076Qv02 = (InterfaceC4076Qv0) c0237a.b1;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        interfaceC4076Qv02 = interfaceC4076Qv0;
                        it = this.X.iterator();
                    }
                    while (it.hasNext()) {
                        Long g = C10557wp.g(((J41) it).nextLong());
                        c0237a.b1 = interfaceC4076Qv02;
                        c0237a.c1 = it;
                        c0237a.Z0 = 1;
                        if (interfaceC4076Qv02.c(g, c0237a) == l) {
                            return l;
                        }
                    }
                    return C7458kA2.a;
                }
            }
            c0237a = new C0237a(hm);
            Object obj2 = c0237a.Y0;
            Object l2 = C7289jT0.l();
            i = c0237a.Z0;
            if (i == 0) {
            }
            while (it.hasNext()) {
            }
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n65#2,2:109\n*E\n"})
    /* renamed from: o.Vv0$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ FA0 X;

        public b(FA0 fa0) {
            this.X = fa0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            Object c = interfaceC4076Qv0.c((Object) this.X.invoke(), hm);
            if (c == C7289jT0.l()) {
                return c;
            }
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n79#2,2:109\n*E\n"})
    /* renamed from: o.Vv0$c */
    /* loaded from: classes4.dex */
    public static final class c<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ HA0 X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", f = "Builders.kt", i = {}, l = {109, 109}, m = "collect", n = {}, s = {})
        /* renamed from: o.Vv0$c$a */
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
                return c.this.a(null, this);
            }
        }

        public c(HA0 ha0) {
            this.X = ha0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
            if (r7 == r1) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
            if (r6.c(r7, r0) != r1) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
            return r1;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
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
                        interfaceC4076Qv0 = (InterfaceC4076Qv0) aVar.b1;
                        RT1.n(obj);
                    } else {
                        RT1.n(obj);
                        HA0 ha0 = this.X;
                        aVar.b1 = interfaceC4076Qv0;
                        aVar.Z0 = 1;
                        UP0.e(6);
                        obj = ha0.invoke(aVar);
                        UP0.e(7);
                    }
                    aVar.b1 = null;
                    aVar.Z0 = 2;
                }
            }
            aVar = new a(hm);
            Object obj2 = aVar.Y0;
            Object l2 = C7289jT0.l();
            i = aVar.Z0;
            if (i == 0) {
            }
            aVar.b1 = null;
            aVar.Z0 = 2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n86#2:109\n87#2,2:111\n89#2:114\n1863#3:110\n1864#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n86#1:110\n86#1:113\n*E\n"})
    /* renamed from: o.Vv0$d */
    /* loaded from: classes4.dex */
    public static final class d<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ Iterable X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", i = {0}, l = {111}, m = "collect", n = {"$this$asFlow_u24lambda_u243"}, s = {"L$0"})
        /* renamed from: o.Vv0$d$a */
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
                return d.this.a(null, this);
            }
        }

        public d(Iterable iterable) {
            this.X = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            InterfaceC4076Qv0<? super T> interfaceC4076Qv02;
            Iterator<T> it;
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
                            it = (Iterator) aVar.c1;
                            RT1.n(obj);
                            interfaceC4076Qv02 = (InterfaceC4076Qv0) aVar.b1;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        interfaceC4076Qv02 = interfaceC4076Qv0;
                        it = this.X.iterator();
                    }
                    while (it.hasNext()) {
                        aVar.b1 = interfaceC4076Qv02;
                        aVar.c1 = it;
                        aVar.Z0 = 1;
                        if (interfaceC4076Qv02.c((T) it.next(), aVar) == l) {
                            return l;
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
            while (it.hasNext()) {
            }
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,108:1\n95#2:109\n96#2,2:111\n98#2:114\n32#3:110\n33#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n95#1:110\n95#1:113\n*E\n"})
    /* renamed from: o.Vv0$e */
    /* loaded from: classes4.dex */
    public static final class e<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ Iterator X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4", f = "Builders.kt", i = {0}, l = {111}, m = "collect", n = {"$this$asFlow_u24lambda_u245"}, s = {"L$0"})
        /* renamed from: o.Vv0$e$a */
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
                return e.this.a(null, this);
            }
        }

        public e(Iterator it) {
            this.X = it;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            InterfaceC4076Qv0<? super T> interfaceC4076Qv02;
            Iterator it;
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
                            it = (Iterator) aVar.c1;
                            RT1.n(obj);
                            interfaceC4076Qv02 = (InterfaceC4076Qv0) aVar.b1;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        interfaceC4076Qv02 = interfaceC4076Qv0;
                        it = this.X;
                    }
                    while (it.hasNext()) {
                        aVar.b1 = interfaceC4076Qv02;
                        aVar.c1 = it;
                        aVar.Z0 = 1;
                        if (interfaceC4076Qv02.c((Object) it.next(), aVar) == l) {
                            return l;
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
            while (it.hasNext()) {
            }
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,108:1\n104#2:109\n105#2,2:111\n107#2:114\n1317#3:110\n1318#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n104#1:110\n104#1:113\n*E\n"})
    /* renamed from: o.Vv0$f */
    /* loaded from: classes4.dex */
    public static final class f<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ B02 X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", f = "Builders.kt", i = {0}, l = {111}, m = "collect", n = {"$this$asFlow_u24lambda_u247"}, s = {"L$0"})
        /* renamed from: o.Vv0$f$a */
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
                return f.this.a(null, this);
            }
        }

        public f(B02 b02) {
            this.X = b02;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            InterfaceC4076Qv0<? super T> interfaceC4076Qv02;
            Iterator<T> it;
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
                            it = (Iterator) aVar.c1;
                            RT1.n(obj);
                            interfaceC4076Qv02 = (InterfaceC4076Qv0) aVar.b1;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        interfaceC4076Qv02 = interfaceC4076Qv0;
                        it = this.X.iterator();
                    }
                    while (it.hasNext()) {
                        aVar.b1 = interfaceC4076Qv02;
                        aVar.c1 = it;
                        aVar.Z0 = 1;
                        if (interfaceC4076Qv02.c((T) it.next(), aVar) == l) {
                            return l;
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
            while (it.hasNext()) {
            }
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n150#2:109\n151#2,2:111\n153#2:114\n13346#3:110\n13347#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n150#1:110\n150#1:113\n*E\n"})
    /* renamed from: o.Vv0$g */
    /* loaded from: classes4.dex */
    public static final class g<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ Object[] X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", f = "Builders.kt", i = {0, 0}, l = {111}, m = "collect", n = {"$this$asFlow_u24lambda_u2411", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* renamed from: o.Vv0$g$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;
            public Object c1;
            public int d1;
            public int e1;

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

        public g(Object[] objArr) {
            this.X = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005c -> B:19:0x005f). Please submit an issue!!! */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            InterfaceC4076Qv0<? super T> interfaceC4076Qv02;
            int i2;
            int i3;
            Object[] objArr;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i4 = aVar.Z0;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar.Z0 = i4 - Integer.MIN_VALUE;
                    Object obj = aVar.Y0;
                    Object l = C7289jT0.l();
                    i = aVar.Z0;
                    if (i == 0) {
                        if (i == 1) {
                            i2 = aVar.e1;
                            i3 = aVar.d1;
                            objArr = (Object[]) aVar.c1;
                            RT1.n(obj);
                            InterfaceC4076Qv0<? super T> interfaceC4076Qv03 = (InterfaceC4076Qv0) aVar.b1;
                            i3++;
                            interfaceC4076Qv02 = interfaceC4076Qv03;
                            if (i3 < i2) {
                                Object obj2 = objArr[i3];
                                aVar.b1 = interfaceC4076Qv02;
                                aVar.c1 = objArr;
                                aVar.d1 = i3;
                                aVar.e1 = i2;
                                aVar.Z0 = 1;
                                Object c = interfaceC4076Qv02.c(obj2, aVar);
                                interfaceC4076Qv03 = interfaceC4076Qv02;
                                if (c == l) {
                                    return l;
                                }
                                i3++;
                                interfaceC4076Qv02 = interfaceC4076Qv03;
                                if (i3 < i2) {
                                    return C7458kA2.a;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        Object[] objArr2 = this.X;
                        int length = objArr2.length;
                        interfaceC4076Qv02 = interfaceC4076Qv0;
                        i2 = length;
                        i3 = 0;
                        objArr = objArr2;
                        if (i3 < i2) {
                        }
                    }
                }
            }
            aVar = new a(hm);
            Object obj3 = aVar.Y0;
            Object l2 = C7289jT0.l();
            i = aVar.Z0;
            if (i == 0) {
            }
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n161#2:109\n162#2,2:111\n164#2:114\n13367#3:110\n13368#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n161#1:110\n161#1:113\n*E\n"})
    /* renamed from: o.Vv0$h */
    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC3882Ov0<Integer> {
        public final /* synthetic */ int[] X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", f = "Builders.kt", i = {0, 0}, l = {111}, m = "collect", n = {"$this$asFlow_u24lambda_u2413", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* renamed from: o.Vv0$h$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;
            public Object c1;
            public int d1;
            public int e1;

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

        public h(int[] iArr) {
            this.X = iArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please submit an issue!!! */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super Integer> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            InterfaceC4076Qv0<? super Integer> interfaceC4076Qv02;
            int i2;
            int i3;
            int[] iArr;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i4 = aVar.Z0;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar.Z0 = i4 - Integer.MIN_VALUE;
                    Object obj = aVar.Y0;
                    Object l = C7289jT0.l();
                    i = aVar.Z0;
                    if (i == 0) {
                        if (i == 1) {
                            i2 = aVar.e1;
                            i3 = aVar.d1;
                            iArr = (int[]) aVar.c1;
                            RT1.n(obj);
                            InterfaceC4076Qv0<? super Integer> interfaceC4076Qv03 = (InterfaceC4076Qv0) aVar.b1;
                            i3++;
                            interfaceC4076Qv02 = interfaceC4076Qv03;
                            if (i3 < i2) {
                                Integer f = C10557wp.f(iArr[i3]);
                                aVar.b1 = interfaceC4076Qv02;
                                aVar.c1 = iArr;
                                aVar.d1 = i3;
                                aVar.e1 = i2;
                                aVar.Z0 = 1;
                                Object c = interfaceC4076Qv02.c(f, aVar);
                                interfaceC4076Qv03 = interfaceC4076Qv02;
                                if (c == l) {
                                    return l;
                                }
                                i3++;
                                interfaceC4076Qv02 = interfaceC4076Qv03;
                                if (i3 < i2) {
                                    return C7458kA2.a;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        int[] iArr2 = this.X;
                        int length = iArr2.length;
                        interfaceC4076Qv02 = interfaceC4076Qv0;
                        i2 = length;
                        i3 = 0;
                        iArr = iArr2;
                        if (i3 < i2) {
                        }
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

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,108:1\n172#2:109\n173#2,2:111\n175#2:114\n13374#3:110\n13375#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n172#1:110\n172#1:113\n*E\n"})
    /* renamed from: o.Vv0$i */
    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC3882Ov0<Long> {
        public final /* synthetic */ long[] X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8", f = "Builders.kt", i = {0, 0}, l = {111}, m = "collect", n = {"$this$asFlow_u24lambda_u2415", "$this$forEach$iv"}, s = {"L$0", "L$1"})
        /* renamed from: o.Vv0$i$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;
            public Object c1;
            public int d1;
            public int e1;

            public a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return i.this.a(null, this);
            }
        }

        public i(long[] jArr) {
            this.X = jArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0060 -> B:19:0x0063). Please submit an issue!!! */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super Long> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            InterfaceC4076Qv0<? super Long> interfaceC4076Qv02;
            int i2;
            int i3;
            long[] jArr;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i4 = aVar.Z0;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    aVar.Z0 = i4 - Integer.MIN_VALUE;
                    Object obj = aVar.Y0;
                    Object l = C7289jT0.l();
                    i = aVar.Z0;
                    if (i == 0) {
                        if (i == 1) {
                            i2 = aVar.e1;
                            i3 = aVar.d1;
                            jArr = (long[]) aVar.c1;
                            RT1.n(obj);
                            InterfaceC4076Qv0<? super Long> interfaceC4076Qv03 = (InterfaceC4076Qv0) aVar.b1;
                            i3++;
                            interfaceC4076Qv02 = interfaceC4076Qv03;
                            if (i3 < i2) {
                                Long g = C10557wp.g(jArr[i3]);
                                aVar.b1 = interfaceC4076Qv02;
                                aVar.c1 = jArr;
                                aVar.d1 = i3;
                                aVar.e1 = i2;
                                aVar.Z0 = 1;
                                Object c = interfaceC4076Qv02.c(g, aVar);
                                interfaceC4076Qv03 = interfaceC4076Qv02;
                                if (c == l) {
                                    return l;
                                }
                                i3++;
                                interfaceC4076Qv02 = interfaceC4076Qv03;
                                if (i3 < i2) {
                                    return C7458kA2.a;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        long[] jArr2 = this.X;
                        int length = jArr2.length;
                        interfaceC4076Qv02 = interfaceC4076Qv0;
                        i2 = length;
                        i3 = 0;
                        jArr = jArr2;
                        if (i3 < i2) {
                        }
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

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,108:1\n181#2:109\n182#2,2:111\n184#2:114\n1863#3:110\n1864#3:113\n*S KotlinDebug\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n181#1:110\n181#1:113\n*E\n"})
    /* renamed from: o.Vv0$j */
    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC3882Ov0<Integer> {
        public final /* synthetic */ C11197zR0 X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", f = "Builders.kt", i = {0}, l = {111}, m = "collect", n = {"$this$asFlow_u24lambda_u2417"}, s = {"L$0"})
        /* renamed from: o.Vv0$j$a */
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
                return j.this.a(null, this);
            }
        }

        public j(C11197zR0 c11197zR0) {
            this.X = c11197zR0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super Integer> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            InterfaceC4076Qv0<? super Integer> interfaceC4076Qv02;
            Iterator<Integer> it;
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
                            it = (Iterator) aVar.c1;
                            RT1.n(obj);
                            interfaceC4076Qv02 = (InterfaceC4076Qv0) aVar.b1;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        interfaceC4076Qv02 = interfaceC4076Qv0;
                        it = this.X.iterator();
                    }
                    while (it.hasNext()) {
                        Integer f = C10557wp.f(((AbstractC8515oR0) it).nextInt());
                        aVar.b1 = interfaceC4076Qv02;
                        aVar.c1 = it;
                        aVar.Z0 = 1;
                        if (interfaceC4076Qv02.c(f, aVar) == l) {
                            return l;
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
            while (it.hasNext()) {
            }
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n119#2,4:109\n*E\n"})
    /* renamed from: o.Vv0$k */
    /* loaded from: classes4.dex */
    public static final class k<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ Object[] X;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", i = {0, 0}, l = {110}, m = "collect", n = {"this", "$this$flowOf_u24lambda_u248"}, s = {"L$0", "L$1"})
        /* renamed from: o.Vv0$k$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;
            public Object c1;
            public int d1;
            public int e1;

            public a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        public k(Object[] objArr) {
            this.X = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please submit an issue!!! */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            int i2;
            InterfaceC4076Qv0<? super T> interfaceC4076Qv02;
            int length;
            k<T> kVar;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i3 = aVar.Z0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    aVar.Z0 = i3 - Integer.MIN_VALUE;
                    Object obj = aVar.Y0;
                    Object l = C7289jT0.l();
                    i = aVar.Z0;
                    if (i == 0) {
                        if (i == 1) {
                            length = aVar.e1;
                            i2 = aVar.d1;
                            kVar = (k) aVar.b1;
                            RT1.n(obj);
                            InterfaceC4076Qv0<? super T> interfaceC4076Qv03 = (InterfaceC4076Qv0) aVar.c1;
                            i2++;
                            interfaceC4076Qv02 = interfaceC4076Qv03;
                            if (i2 < length) {
                                Object obj2 = kVar.X[i2];
                                aVar.b1 = kVar;
                                aVar.c1 = interfaceC4076Qv02;
                                aVar.d1 = i2;
                                aVar.e1 = length;
                                aVar.Z0 = 1;
                                Object c = interfaceC4076Qv02.c(obj2, aVar);
                                interfaceC4076Qv03 = interfaceC4076Qv02;
                                if (c == l) {
                                    return l;
                                }
                                i2++;
                                interfaceC4076Qv02 = interfaceC4076Qv03;
                                if (i2 < length) {
                                    return C7458kA2.a;
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        i2 = 0;
                        interfaceC4076Qv02 = interfaceC4076Qv0;
                        length = this.X.length;
                        kVar = this;
                        if (i2 < length) {
                        }
                    }
                }
            }
            aVar = new a(hm);
            Object obj3 = aVar.Y0;
            Object l2 = C7289jT0.l();
            i = aVar.Z0;
            if (i == 0) {
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Builders.kt\nkotlinx/coroutines/flow/FlowKt__BuildersKt\n*L\n1#1,108:1\n132#2,2:109\n*E\n"})
    /* renamed from: o.Vv0$l */
    /* loaded from: classes4.dex */
    public static final class l<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ Object X;

        public l(Object obj) {
            this.X = obj;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            Object c = interfaceC4076Qv0.c((Object) this.X, hm);
            if (c == C7289jT0.l()) {
                return c;
            }
            return C7458kA2.a;
        }
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> a(@NotNull Iterable<? extends T> iterable) {
        return new d(iterable);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> b(@NotNull Iterator<? extends T> it) {
        return new e(it);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> c(@NotNull FA0<? extends T> fa0) {
        return new b(fa0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> d(@NotNull HA0<? super HM<? super T>, ? extends Object> ha0) {
        return new c(ha0);
    }

    @NotNull
    public static final InterfaceC3882Ov0<Integer> e(@NotNull C11197zR0 c11197zR0) {
        return new j(c11197zR0);
    }

    @NotNull
    public static final InterfaceC3882Ov0<Long> f(@NotNull W41 w41) {
        return new a(w41);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> g(@NotNull B02<? extends T> b02) {
        return new f(b02);
    }

    @NotNull
    public static final InterfaceC3882Ov0<Integer> h(@NotNull int[] iArr) {
        return new h(iArr);
    }

    @NotNull
    public static final InterfaceC3882Ov0<Long> i(@NotNull long[] jArr) {
        return new i(jArr);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> j(@NotNull T[] tArr) {
        return new g(tArr);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> k(@InterfaceC5183ar @NotNull VA0<? super AI1<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return new C3581Lt(va0, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> l(@InterfaceC5183ar @NotNull VA0<? super AI1<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return new C7698lA(va0, null, 0, null, 14, null);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> m() {
        return C4191Sa0.X;
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> n(@InterfaceC5183ar @NotNull VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return new C10244vX1(va0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> o(T t) {
        return new l(t);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> p(@NotNull T... tArr) {
        return new k(tArr);
    }
}
