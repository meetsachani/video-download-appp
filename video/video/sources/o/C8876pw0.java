package o;

import java.util.ArrayList;
import java.util.List;
import o.RP1;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 3 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n17#1:174\n19#1:178\n17#1:179\n19#1:183\n46#2:168\n51#2:170\n46#2:171\n51#2:173\n46#2:175\n51#2:177\n46#2:180\n51#2:182\n46#2:184\n51#2:186\n46#2:187\n51#2:189\n46#2:190\n51#2:192\n46#2:194\n51#2:196\n105#3:169\n105#3:172\n105#3:176\n105#3:181\n105#3:185\n105#3:188\n105#3:191\n105#3:193\n105#3:195\n105#3:197\n105#3:198\n105#3:200\n1#4:199\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n32#1:174\n32#1:178\n37#1:179\n37#1:183\n17#1:168\n17#1:170\n24#1:171\n24#1:173\n32#1:175\n32#1:177\n37#1:180\n37#1:182\n42#1:184\n42#1:186\n49#1:187\n49#1:189\n56#1:190\n56#1:192\n74#1:194\n74#1:196\n17#1:169\n24#1:172\n32#1:176\n37#1:181\n42#1:185\n49#1:188\n56#1:191\n64#1:193\n74#1:195\n101#1:197\n121#1:198\n152#1:200\n*E\n"})
/* renamed from: o.pw0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C8876pw0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n153#2,12:109\n165#2:122\n1#3:121\n*E\n"})
    /* renamed from: o.pw0$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements InterfaceC3882Ov0<List<? extends T>> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ int Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0}, l = {110, 120}, m = "collect", n = {"$this$chunked_u24lambda_u2413", "result"}, s = {"L$0", "L$1"})
        /* renamed from: o.pw0$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0319a extends KM {
            public /* synthetic */ Object Y0;
            public int Z0;
            public Object b1;
            public Object c1;

            public C0319a(HM hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.Z0 |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC3882Ov0 interfaceC3882Ov0, int i) {
            this.X = interfaceC3882Ov0;
            this.Y = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
            if (r2.c(r8, r0) == r1) goto L21;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        /* JADX WARN: Type inference failed for: r2v4, types: [o.Qv0] */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super List<? extends T>> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            C0319a c0319a;
            int i;
            InterfaceC4076Qv0<? super List<? extends T>> interfaceC4076Qv02;
            RP1.h hVar;
            ArrayList arrayList;
            if (hm instanceof C0319a) {
                c0319a = (C0319a) hm;
                int i2 = c0319a.Z0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0319a.Z0 = i2 - Integer.MIN_VALUE;
                    Object obj = c0319a.Y0;
                    Object l = C7289jT0.l();
                    i = c0319a.Z0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                RT1.n(obj);
                                return C7458kA2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        hVar = (RP1.h) c0319a.c1;
                        interfaceC4076Qv02 = (InterfaceC4076Qv0) c0319a.b1;
                        RT1.n(obj);
                    } else {
                        RT1.n(obj);
                        RP1.h hVar2 = new RP1.h();
                        InterfaceC3882Ov0 interfaceC3882Ov0 = this.X;
                        b bVar = new b(hVar2, this.Y, interfaceC4076Qv0);
                        c0319a.b1 = interfaceC4076Qv0;
                        c0319a.c1 = hVar2;
                        c0319a.Z0 = 1;
                        if (interfaceC3882Ov0.a(bVar, c0319a) != l) {
                            interfaceC4076Qv02 = interfaceC4076Qv0;
                            hVar = hVar2;
                        }
                        return l;
                    }
                    arrayList = (ArrayList) hVar.X;
                    if (arrayList != null) {
                        c0319a.b1 = null;
                        c0319a.c1 = null;
                        c0319a.Z0 = 2;
                    }
                    return C7458kA2.a;
                }
            }
            c0319a = new C0319a(hm);
            Object obj2 = c0319a.Y0;
            Object l2 = C7289jT0.l();
            i = c0319a.Z0;
            if (i == 0) {
            }
            arrayList = (ArrayList) hVar.X;
            if (arrayList != null) {
            }
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$chunked$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
    /* renamed from: o.pw0$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.h<ArrayList<T>> X;
        public final /* synthetic */ int Y;
        public final /* synthetic */ InterfaceC4076Qv0<List<? extends T>> Z;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1", f = "Transform.kt", i = {0}, l = {159}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: o.pw0$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public Object Y0;
            public /* synthetic */ Object Z0;
            public final /* synthetic */ b<T> a1;
            public int b1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, HM<? super a> hm) {
                super(hm);
                this.a1 = bVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Z0 = obj;
                this.b1 |= Integer.MIN_VALUE;
                return this.a1.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(RP1.h<ArrayList<T>> hVar, int i, InterfaceC4076Qv0<? super List<? extends T>> interfaceC4076Qv0) {
            this.X = hVar;
            this.Y = i;
            this.Z = interfaceC4076Qv0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
        /* JADX WARN: Type inference failed for: r5v2, types: [o.Qv0<java.util.List<? extends T>>, o.Qv0] */
        /* JADX WARN: Type inference failed for: r6v10 */
        /* JADX WARN: Type inference failed for: r6v11 */
        /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.ArrayList] */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            b<T> bVar;
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
                            bVar = (b) aVar.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        T t2 = (T) this.X.X;
                        ?? r6 = t2;
                        if (t2 == null) {
                            T t3 = (T) new ArrayList(this.Y);
                            this.X.X = t3;
                            r6 = t3;
                        }
                        r6.add(t);
                        if (r6.size() == this.Y) {
                            aVar.Y0 = this;
                            aVar.b1 = 1;
                            if (this.Z.c(r6, aVar) == l) {
                                return l;
                            }
                            bVar = this;
                        }
                        return C7458kA2.a;
                    }
                    bVar.X.X = null;
                    return C7458kA2.a;
                }
            }
            aVar = new a(this, hm);
            Object obj2 = aVar.Z0;
            Object l2 = C7289jT0.l();
            i = aVar.b1;
            if (i == 0) {
            }
            bVar.X.X = null;
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    /* renamed from: o.pw0$c */
    /* loaded from: classes4.dex */
    public static final class c<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ VA0 Y;

        /* renamed from: o.pw0$c$a */
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
                return c.this.a(null, this);
            }
        }

        @InterfaceC8303na2({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2,2:50\n*E\n"})
        /* renamed from: o.pw0$c$b */
        /* loaded from: classes4.dex */
        public static final class b<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ InterfaceC4076Qv0 X;
            public final /* synthetic */ VA0 Y;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {50, 50}, m = "emit", n = {"value", "$this$filter_u24lambda_u240"}, s = {"L$0", "L$1"})
            /* renamed from: o.pw0$c$b$a */
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
                    return b.this.c(null, this);
                }
            }

            public b(InterfaceC4076Qv0 interfaceC4076Qv0, VA0 va0) {
                this.X = interfaceC4076Qv0;
                this.Y = va0;
            }

            public final Object a(Object obj, HM hm) {
                UP0.e(4);
                new a(hm);
                UP0.e(5);
                InterfaceC4076Qv0 interfaceC4076Qv0 = this.X;
                if (((Boolean) this.Y.i(obj, hm)).booleanValue()) {
                    UP0.e(0);
                    interfaceC4076Qv0.c(obj, hm);
                    UP0.e(1);
                }
                return C7458kA2.a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
                if (r7.c(r2, r0) == r1) goto L21;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(T t, HM<? super C7458kA2> hm) {
                a aVar;
                Object obj;
                int i;
                Object obj2;
                InterfaceC4076Qv0 interfaceC4076Qv0;
                if (hm instanceof a) {
                    aVar = (a) hm;
                    int i2 = aVar.Z0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.Z0 = i2 - Integer.MIN_VALUE;
                        obj = aVar.Y0;
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
                            interfaceC4076Qv0 = (InterfaceC4076Qv0) aVar.c1;
                            obj2 = aVar.b1;
                            RT1.n(obj);
                        } else {
                            RT1.n(obj);
                            InterfaceC4076Qv0 interfaceC4076Qv02 = this.X;
                            VA0 va0 = this.Y;
                            aVar.b1 = t;
                            aVar.c1 = interfaceC4076Qv02;
                            aVar.Z0 = 1;
                            Object i3 = va0.i(t, aVar);
                            if (i3 != l) {
                                obj2 = t;
                                interfaceC4076Qv0 = interfaceC4076Qv02;
                                obj = i3;
                            }
                            return l;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            aVar.b1 = null;
                            aVar.c1 = null;
                            aVar.Z0 = 2;
                        }
                        return C7458kA2.a;
                    }
                }
                aVar = new a(hm);
                obj = aVar.Y0;
                Object l2 = C7289jT0.l();
                i = aVar.Z0;
                if (i == 0) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
                return C7458kA2.a;
            }
        }

        public c(InterfaceC3882Ov0 interfaceC3882Ov0, VA0 va0) {
            this.X = interfaceC3882Ov0;
            this.Y = va0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            Object a2 = this.X.a(new b(interfaceC4076Qv0, this.Y), hm);
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
            b bVar = new b(interfaceC4076Qv0, this.Y);
            UP0.e(0);
            interfaceC3882Ov0.a(bVar, hm);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    /* renamed from: o.pw0$d */
    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC3882Ov0<Object> {
        public final /* synthetic */ InterfaceC3882Ov0 X;

        /* renamed from: o.pw0$d$a */
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
                return d.this.a(null, this);
            }
        }

        @InterfaceC8303na2({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2:50\n32#2:51\n19#2:52\n*E\n"})
        /* renamed from: o.pw0$d$b */
        /* loaded from: classes4.dex */
        public static final class b<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ InterfaceC4076Qv0 X;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            /* renamed from: o.pw0$d$b$a */
            /* loaded from: classes4.dex */
            public static final class a extends KM {
                public /* synthetic */ Object Y0;
                public int Z0;
                public Object a1;
                public Object b1;

                public a(HM hm) {
                    super(hm);
                }

                @Override // o.AbstractC5644cl
                public final Object F(Object obj) {
                    this.Y0 = obj;
                    this.Z0 |= Integer.MIN_VALUE;
                    return b.this.c(null, this);
                }
            }

            public b(InterfaceC4076Qv0 interfaceC4076Qv0) {
                this.X = interfaceC4076Qv0;
            }

            public final Object a(Object obj, HM hm) {
                UP0.e(4);
                new a(hm);
                UP0.e(5);
                InterfaceC4076Qv0 interfaceC4076Qv0 = this.X;
                C6562gT0.y(3, "R");
                if (obj != null) {
                    UP0.e(0);
                    interfaceC4076Qv0.c(obj, hm);
                    UP0.e(1);
                }
                return C7458kA2.a;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(Object obj, HM hm) {
                a aVar;
                int i;
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
                                RT1.n(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            RT1.n(obj2);
                            InterfaceC4076Qv0 interfaceC4076Qv0 = this.X;
                            C6562gT0.y(3, "R");
                            if (obj != null) {
                                aVar.Z0 = 1;
                                if (interfaceC4076Qv0.c(obj, aVar) == l) {
                                    return l;
                                }
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

        public d(InterfaceC3882Ov0 interfaceC3882Ov0) {
            this.X = interfaceC3882Ov0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super Object> interfaceC4076Qv0, HM hm) {
            InterfaceC3882Ov0 interfaceC3882Ov0 = this.X;
            C6562gT0.w();
            Object a2 = interfaceC3882Ov0.a(new b(interfaceC4076Qv0), hm);
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
            C6562gT0.w();
            b bVar = new b(interfaceC4076Qv0);
            UP0.e(0);
            interfaceC3882Ov0.a(bVar, hm);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    /* renamed from: o.pw0$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC3882Ov0<Object> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ AW0 Y;

        @InterfaceC8303na2({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n18#2:50\n37#2:51\n19#2:52\n*E\n"})
        /* renamed from: o.pw0$e$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ InterfaceC4076Qv0 X;
            public final /* synthetic */ AW0 Y;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$2$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            /* renamed from: o.pw0$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0320a extends KM {
                public /* synthetic */ Object Y0;
                public int Z0;
                public Object a1;
                public Object b1;

                public C0320a(HM hm) {
                    super(hm);
                }

                @Override // o.AbstractC5644cl
                public final Object F(Object obj) {
                    this.Y0 = obj;
                    this.Z0 |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(InterfaceC4076Qv0 interfaceC4076Qv0, AW0 aw0) {
                this.X = interfaceC4076Qv0;
                this.Y = aw0;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(Object obj, HM hm) {
                C0320a c0320a;
                int i;
                if (hm instanceof C0320a) {
                    c0320a = (C0320a) hm;
                    int i2 = c0320a.Z0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0320a.Z0 = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0320a.Y0;
                        Object l = C7289jT0.l();
                        i = c0320a.Z0;
                        if (i == 0) {
                            if (i == 1) {
                                RT1.n(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            RT1.n(obj2);
                            InterfaceC4076Qv0 interfaceC4076Qv0 = this.X;
                            if (this.Y.F(obj)) {
                                c0320a.Z0 = 1;
                                if (interfaceC4076Qv0.c(obj, c0320a) == l) {
                                    return l;
                                }
                            }
                        }
                        return C7458kA2.a;
                    }
                }
                c0320a = new C0320a(hm);
                Object obj22 = c0320a.Y0;
                Object l2 = C7289jT0.l();
                i = c0320a.Z0;
                if (i == 0) {
                }
                return C7458kA2.a;
            }
        }

        public e(InterfaceC3882Ov0 interfaceC3882Ov0, AW0 aw0) {
            this.X = interfaceC3882Ov0;
            this.Y = aw0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super Object> interfaceC4076Qv0, HM hm) {
            Object a2 = this.X.a(new a(interfaceC4076Qv0, this.Y), hm);
            if (a2 == C7289jT0.l()) {
                return a2;
            }
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    /* renamed from: o.pw0$f */
    /* loaded from: classes4.dex */
    public static final class f<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ VA0 Y;

        /* renamed from: o.pw0$f$a */
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
                return f.this.a(null, this);
            }
        }

        @InterfaceC8303na2({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n25#2,2:50\n*E\n"})
        /* renamed from: o.pw0$f$b */
        /* loaded from: classes4.dex */
        public static final class b<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ InterfaceC4076Qv0 X;
            public final /* synthetic */ VA0 Y;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {50, 50}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u241"}, s = {"L$0", "L$1"})
            /* renamed from: o.pw0$f$b$a */
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
                    return b.this.c(null, this);
                }
            }

            public b(InterfaceC4076Qv0 interfaceC4076Qv0, VA0 va0) {
                this.X = interfaceC4076Qv0;
                this.Y = va0;
            }

            public final Object a(Object obj, HM hm) {
                UP0.e(4);
                new a(hm);
                UP0.e(5);
                InterfaceC4076Qv0 interfaceC4076Qv0 = this.X;
                if (!((Boolean) this.Y.i(obj, hm)).booleanValue()) {
                    UP0.e(0);
                    interfaceC4076Qv0.c(obj, hm);
                    UP0.e(1);
                }
                return C7458kA2.a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
                if (r7.c(r2, r0) == r1) goto L21;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(T t, HM<? super C7458kA2> hm) {
                a aVar;
                Object obj;
                int i;
                Object obj2;
                InterfaceC4076Qv0 interfaceC4076Qv0;
                if (hm instanceof a) {
                    aVar = (a) hm;
                    int i2 = aVar.Z0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.Z0 = i2 - Integer.MIN_VALUE;
                        obj = aVar.Y0;
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
                            interfaceC4076Qv0 = (InterfaceC4076Qv0) aVar.c1;
                            obj2 = aVar.b1;
                            RT1.n(obj);
                        } else {
                            RT1.n(obj);
                            InterfaceC4076Qv0 interfaceC4076Qv02 = this.X;
                            VA0 va0 = this.Y;
                            aVar.b1 = t;
                            aVar.c1 = interfaceC4076Qv02;
                            aVar.Z0 = 1;
                            Object i3 = va0.i(t, aVar);
                            if (i3 != l) {
                                obj2 = t;
                                interfaceC4076Qv0 = interfaceC4076Qv02;
                                obj = i3;
                            }
                            return l;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                            aVar.b1 = null;
                            aVar.c1 = null;
                            aVar.Z0 = 2;
                        }
                        return C7458kA2.a;
                    }
                }
                aVar = new a(hm);
                obj = aVar.Y0;
                Object l2 = C7289jT0.l();
                i = aVar.Z0;
                if (i == 0) {
                }
                if (!((Boolean) obj).booleanValue()) {
                }
                return C7458kA2.a;
            }
        }

        public f(InterfaceC3882Ov0 interfaceC3882Ov0, VA0 va0) {
            this.X = interfaceC3882Ov0;
            this.Y = va0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            Object a2 = this.X.a(new b(interfaceC4076Qv0, this.Y), hm);
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
            b bVar = new b(interfaceC4076Qv0, this.Y);
            UP0.e(0);
            interfaceC3882Ov0.a(bVar, hm);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    /* renamed from: o.pw0$g */
    /* loaded from: classes4.dex */
    public static final class g<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;

        @InterfaceC8303na2({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n43#2,2:50\n*E\n"})
        /* renamed from: o.pw0$g$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ InterfaceC4076Qv0 X;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {50}, m = "emit", n = {}, s = {})
            /* renamed from: o.pw0$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0321a extends KM {
                public /* synthetic */ Object Y0;
                public int Z0;

                public C0321a(HM hm) {
                    super(hm);
                }

                @Override // o.AbstractC5644cl
                public final Object F(Object obj) {
                    this.Y0 = obj;
                    this.Z0 |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(InterfaceC4076Qv0 interfaceC4076Qv0) {
                this.X = interfaceC4076Qv0;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(T t, HM<? super C7458kA2> hm) {
                C0321a c0321a;
                int i;
                if (hm instanceof C0321a) {
                    c0321a = (C0321a) hm;
                    int i2 = c0321a.Z0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0321a.Z0 = i2 - Integer.MIN_VALUE;
                        Object obj = c0321a.Y0;
                        Object l = C7289jT0.l();
                        i = c0321a.Z0;
                        if (i == 0) {
                            if (i == 1) {
                                RT1.n(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            RT1.n(obj);
                            InterfaceC4076Qv0 interfaceC4076Qv0 = this.X;
                            if (t != null) {
                                c0321a.Z0 = 1;
                                if (interfaceC4076Qv0.c(t, c0321a) == l) {
                                    return l;
                                }
                            }
                        }
                        return C7458kA2.a;
                    }
                }
                c0321a = new C0321a(hm);
                Object obj2 = c0321a.Y0;
                Object l2 = C7289jT0.l();
                i = c0321a.Z0;
                if (i == 0) {
                }
                return C7458kA2.a;
            }
        }

        public g(InterfaceC3882Ov0 interfaceC3882Ov0) {
            this.X = interfaceC3882Ov0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            Object a2 = this.X.a(new a(interfaceC4076Qv0), hm);
            if (a2 == C7289jT0.l()) {
                return a2;
            }
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    /* renamed from: o.pw0$h */
    /* loaded from: classes4.dex */
    public static final class h<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ VA0 Y;

        /* renamed from: o.pw0$h$a */
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
                return h.this.a(null, this);
            }
        }

        @InterfaceC8303na2({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n50#2:50\n*E\n"})
        /* renamed from: o.pw0$h$b */
        /* loaded from: classes4.dex */
        public static final class b<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ InterfaceC4076Qv0 X;
            public final /* synthetic */ VA0 Y;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {50, 50}, m = "emit", n = {}, s = {})
            /* renamed from: o.pw0$h$b$a */
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
                    return b.this.c(null, this);
                }
            }

            public b(InterfaceC4076Qv0 interfaceC4076Qv0, VA0 va0) {
                this.X = interfaceC4076Qv0;
                this.Y = va0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object a(Object obj, HM hm) {
                UP0.e(4);
                new a(hm);
                UP0.e(5);
                InterfaceC4076Qv0 interfaceC4076Qv0 = this.X;
                Object i = this.Y.i(obj, hm);
                UP0.e(0);
                interfaceC4076Qv0.c(i, hm);
                UP0.e(1);
                return C7458kA2.a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
                if (r7.c(r8, r0) != r1) goto L11;
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(T t, HM<? super C7458kA2> hm) {
                a aVar;
                int i;
                InterfaceC4076Qv0 interfaceC4076Qv0;
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
                            InterfaceC4076Qv0 interfaceC4076Qv02 = this.X;
                            VA0 va0 = this.Y;
                            aVar.b1 = interfaceC4076Qv02;
                            aVar.Z0 = 1;
                            Object i3 = va0.i(t, aVar);
                            if (i3 != l) {
                                obj = i3;
                                interfaceC4076Qv0 = interfaceC4076Qv02;
                            }
                            return l;
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

        public h(InterfaceC3882Ov0 interfaceC3882Ov0, VA0 va0) {
            this.X = interfaceC3882Ov0;
            this.Y = va0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            Object a2 = this.X.a(new b(interfaceC4076Qv0, this.Y), hm);
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
            b bVar = new b(interfaceC4076Qv0, this.Y);
            UP0.e(0);
            interfaceC3882Ov0.a(bVar, hm);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    /* renamed from: o.pw0$i */
    /* loaded from: classes4.dex */
    public static final class i<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ VA0 Y;

        /* renamed from: o.pw0$i$a */
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
                return i.this.a(null, this);
            }
        }

        @InterfaceC8303na2({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n57#2,2:50\n*E\n"})
        /* renamed from: o.pw0$i$b */
        /* loaded from: classes4.dex */
        public static final class b<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ InterfaceC4076Qv0 X;
            public final /* synthetic */ VA0 Y;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {50, 51}, m = "emit", n = {"$this$mapNotNull_u24lambda_u246"}, s = {"L$0"})
            /* renamed from: o.pw0$i$b$a */
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
                    return b.this.c(null, this);
                }
            }

            public b(InterfaceC4076Qv0 interfaceC4076Qv0, VA0 va0) {
                this.X = interfaceC4076Qv0;
                this.Y = va0;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object a(Object obj, HM hm) {
                UP0.e(4);
                new a(hm);
                UP0.e(5);
                InterfaceC4076Qv0 interfaceC4076Qv0 = this.X;
                Object i = this.Y.i(obj, hm);
                if (i != null) {
                    UP0.e(0);
                    interfaceC4076Qv0.c(i, hm);
                    UP0.e(1);
                }
                return C7458kA2.a;
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
                if (r7.c(r8, r0) == r1) goto L20;
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(T t, HM<? super C7458kA2> hm) {
                a aVar;
                Object obj;
                int i;
                InterfaceC4076Qv0 interfaceC4076Qv0;
                if (hm instanceof a) {
                    aVar = (a) hm;
                    int i2 = aVar.Z0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.Z0 = i2 - Integer.MIN_VALUE;
                        obj = aVar.Y0;
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
                            InterfaceC4076Qv0 interfaceC4076Qv02 = this.X;
                            VA0 va0 = this.Y;
                            aVar.b1 = interfaceC4076Qv02;
                            aVar.Z0 = 1;
                            Object i3 = va0.i(t, aVar);
                            if (i3 != l) {
                                obj = i3;
                                interfaceC4076Qv0 = interfaceC4076Qv02;
                            }
                            return l;
                        }
                        if (obj != null) {
                            aVar.b1 = null;
                            aVar.Z0 = 2;
                        }
                        return C7458kA2.a;
                    }
                }
                aVar = new a(hm);
                obj = aVar.Y0;
                Object l2 = C7289jT0.l();
                i = aVar.Z0;
                if (i == 0) {
                }
                if (obj != null) {
                }
                return C7458kA2.a;
            }
        }

        public i(InterfaceC3882Ov0 interfaceC3882Ov0, VA0 va0) {
            this.X = interfaceC3882Ov0;
            this.Y = va0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0 interfaceC4076Qv0, HM hm) {
            Object a2 = this.X.a(new b(interfaceC4076Qv0, this.Y), hm);
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
            b bVar = new b(interfaceC4076Qv0, this.Y);
            UP0.e(0);
            interfaceC3882Ov0.a(bVar, hm);
            UP0.e(1);
            return C7458kA2.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,108:1\n47#2,5:109\n*E\n"})
    /* renamed from: o.pw0$j */
    /* loaded from: classes4.dex */
    public static final class j<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ VA0 Y;

        @InterfaceC8303na2({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,49:1\n75#2,2:50\n*E\n"})
        /* renamed from: o.pw0$j$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements InterfaceC4076Qv0 {
            public final /* synthetic */ InterfaceC4076Qv0 X;
            public final /* synthetic */ VA0 Y;

            @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {50, 51}, m = "emit", n = {"value", "$this$onEach_u24lambda_u248"}, s = {"L$0", "L$1"})
            /* renamed from: o.pw0$j$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0322a extends KM {
                public /* synthetic */ Object Y0;
                public int Z0;
                public Object b1;
                public Object c1;

                public C0322a(HM hm) {
                    super(hm);
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

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
                if (r6.c(r2, r0) != r1) goto L11;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
            @Override // o.InterfaceC4076Qv0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object c(T t, HM<? super C7458kA2> hm) {
                C0322a c0322a;
                int i;
                Object obj;
                InterfaceC4076Qv0 interfaceC4076Qv0;
                if (hm instanceof C0322a) {
                    c0322a = (C0322a) hm;
                    int i2 = c0322a.Z0;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0322a.Z0 = i2 - Integer.MIN_VALUE;
                        Object obj2 = c0322a.Y0;
                        Object l = C7289jT0.l();
                        i = c0322a.Z0;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    RT1.n(obj2);
                                    return C7458kA2.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC4076Qv0 = (InterfaceC4076Qv0) c0322a.c1;
                            obj = c0322a.b1;
                            RT1.n(obj2);
                        } else {
                            RT1.n(obj2);
                            InterfaceC4076Qv0 interfaceC4076Qv02 = this.X;
                            VA0 va0 = this.Y;
                            c0322a.b1 = t;
                            c0322a.c1 = interfaceC4076Qv02;
                            c0322a.Z0 = 1;
                            UP0.e(6);
                            Object i3 = va0.i(t, c0322a);
                            UP0.e(7);
                            if (i3 != l) {
                                obj = t;
                                interfaceC4076Qv0 = interfaceC4076Qv02;
                            }
                            return l;
                        }
                        c0322a.b1 = null;
                        c0322a.c1 = null;
                        c0322a.Z0 = 2;
                    }
                }
                c0322a = new C0322a(hm);
                Object obj22 = c0322a.Y0;
                Object l2 = C7289jT0.l();
                i = c0322a.Z0;
                if (i == 0) {
                }
                c0322a.b1 = null;
                c0322a.c1 = null;
                c0322a.Z0 = 2;
            }
        }

        public j(InterfaceC3882Ov0 interfaceC3882Ov0, VA0 va0) {
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

    /* JADX INFO: Add missing generic type declarations: [R] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n102#2,7:109\n*E\n"})
    /* renamed from: o.pw0$k */
    /* loaded from: classes4.dex */
    public static final class k<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ Object X;
        public final /* synthetic */ InterfaceC3882Ov0 Y;
        public final /* synthetic */ XA0 Z;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {110, 111}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u249", "accumulator"}, s = {"L$0", "L$1", "L$2"})
        /* renamed from: o.pw0$k$a */
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
                return k.this.a(null, this);
            }
        }

        public k(Object obj, InterfaceC3882Ov0 interfaceC3882Ov0, XA0 xa0) {
            this.X = obj;
            this.Y = interfaceC3882Ov0;
            this.Z = xa0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
            if (r8.a(r5, r0) != r1) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
        /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
        @Override // o.InterfaceC3882Ov0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object a(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            k<R> kVar;
            InterfaceC4076Qv0<? super R> interfaceC4076Qv02;
            RP1.h hVar;
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
                        hVar = (RP1.h) aVar.d1;
                        interfaceC4076Qv02 = (InterfaceC4076Qv0) aVar.c1;
                        kVar = (k) aVar.b1;
                        RT1.n(obj);
                    } else {
                        RT1.n(obj);
                        RP1.h hVar2 = new RP1.h();
                        ?? r2 = this.X;
                        hVar2.X = r2;
                        aVar.b1 = this;
                        aVar.c1 = interfaceC4076Qv0;
                        aVar.d1 = hVar2;
                        aVar.Z0 = 1;
                        if (interfaceC4076Qv0.c(r2, aVar) != l) {
                            kVar = this;
                            interfaceC4076Qv02 = interfaceC4076Qv0;
                            hVar = hVar2;
                        }
                        return l;
                    }
                    InterfaceC3882Ov0 interfaceC3882Ov0 = kVar.Y;
                    l lVar = new l(hVar, kVar.Z, interfaceC4076Qv02);
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
            InterfaceC3882Ov0 interfaceC3882Ov02 = kVar.Y;
            l lVar2 = new l(hVar, kVar.Z, interfaceC4076Qv02);
            aVar.b1 = null;
            aVar.c1 = null;
            aVar.d1 = null;
            aVar.Z0 = 2;
        }
    }

    /* renamed from: o.pw0$l */
    /* loaded from: classes4.dex */
    public static final class l<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.h<R> X;
        public final /* synthetic */ XA0<R, T, HM<? super R>, Object> Y;
        public final /* synthetic */ InterfaceC4076Qv0<R> Z;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {105, 106}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: o.pw0$l$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public Object Y0;
            public Object Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ l<T> b1;
            public int c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(l<? super T> lVar, HM<? super a> hm) {
                super(hm);
                this.b1 = lVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.a1 = obj;
                this.c1 |= Integer.MIN_VALUE;
                return this.b1.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public l(RP1.h<R> hVar, XA0<? super R, ? super T, ? super HM<? super R>, ? extends Object> xa0, InterfaceC4076Qv0<? super R> interfaceC4076Qv0) {
            this.X = hVar;
            this.Y = xa0;
            this.Z = interfaceC4076Qv0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
            if (r7.c(r8, r0) != r1) goto L11;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            RP1.h hVar;
            l<T> lVar;
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.c1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.c1 = i2 - Integer.MIN_VALUE;
                    T t2 = (T) aVar.a1;
                    Object l = C7289jT0.l();
                    i = aVar.c1;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                RT1.n(t2);
                                return C7458kA2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        hVar = (RP1.h) aVar.Z0;
                        lVar = (l) aVar.Y0;
                        RT1.n(t2);
                    } else {
                        RT1.n(t2);
                        RP1.h hVar2 = this.X;
                        XA0<R, T, HM<? super R>, Object> xa0 = this.Y;
                        T t3 = hVar2.X;
                        aVar.Y0 = this;
                        aVar.Z0 = hVar2;
                        aVar.c1 = 1;
                        Object P = xa0.P(t3, t, aVar);
                        if (P != l) {
                            t2 = (T) P;
                            hVar = hVar2;
                            lVar = this;
                        }
                        return l;
                    }
                    hVar.X = t2;
                    InterfaceC4076Qv0<R> interfaceC4076Qv0 = lVar.Z;
                    T t4 = lVar.X.X;
                    aVar.Y0 = null;
                    aVar.Z0 = null;
                    aVar.c1 = 2;
                }
            }
            aVar = new a(this, hm);
            T t22 = (T) aVar.a1;
            Object l2 = C7289jT0.l();
            i = aVar.c1;
            if (i == 0) {
            }
            hVar.X = t22;
            InterfaceC4076Qv0<R> interfaceC4076Qv02 = lVar.Z;
            T t42 = lVar.X.X;
            aVar.Y0 = null;
            aVar.Z0 = null;
            aVar.c1 = 2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n122#2,10:109\n*E\n"})
    /* renamed from: o.pw0$m */
    /* loaded from: classes4.dex */
    public static final class m<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ XA0 Y;

        public m(InterfaceC3882Ov0 interfaceC3882Ov0, XA0 xa0) {
            this.X = interfaceC3882Ov0;
            this.Y = xa0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            RP1.h hVar = new RP1.h();
            hVar.X = (T) C9596ss1.a;
            Object a = this.X.a(new n(hVar, this.Y, interfaceC4076Qv0), hm);
            if (a == C7289jT0.l()) {
                return a;
            }
            return C7458kA2.a;
        }
    }

    /* renamed from: o.pw0$n */
    /* loaded from: classes4.dex */
    public static final class n<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ RP1.h<Object> X;
        public final /* synthetic */ XA0<T, T, HM<? super T>, Object> Y;
        public final /* synthetic */ InterfaceC4076Qv0<T> Z;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {127, 129}, m = "emit", n = {"this"}, s = {"L$0"})
        /* renamed from: o.pw0$n$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public Object Y0;
            public Object Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ n<T> b1;
            public int c1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(n<? super T> nVar, HM<? super a> hm) {
                super(hm);
                this.b1 = nVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.a1 = obj;
                this.c1 |= Integer.MIN_VALUE;
                return this.b1.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public n(RP1.h<Object> hVar, XA0<? super T, ? super T, ? super HM<? super T>, ? extends Object> xa0, InterfaceC4076Qv0<? super T> interfaceC4076Qv0) {
            this.X = hVar;
            this.Y = xa0;
            this.Z = interfaceC4076Qv0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
            if (r8.c(r9, r0) == r1) goto L20;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
        /* JADX WARN: Type inference failed for: r9v7 */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            a aVar;
            int i;
            RP1.h<Object> hVar;
            RP1.h<Object> hVar2;
            n<T> nVar;
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
                            if (i == 2) {
                                RT1.n(obj);
                                return C7458kA2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        hVar2 = (RP1.h) aVar.Z0;
                        nVar = (n) aVar.Y0;
                        RT1.n(obj);
                    } else {
                        RT1.n(obj);
                        hVar = this.X;
                        Object obj2 = hVar.X;
                        if (obj2 == C9596ss1.a) {
                            nVar = this;
                            hVar.X = t;
                            InterfaceC4076Qv0<T> interfaceC4076Qv0 = nVar.Z;
                            T t2 = nVar.X.X;
                            aVar.Y0 = null;
                            aVar.Z0 = null;
                            aVar.c1 = 2;
                        } else {
                            aVar.Y0 = this;
                            aVar.Z0 = hVar;
                            aVar.c1 = 1;
                            Object P = ((XA0<T, T, HM<? super T>, Object>) this.Y).P(obj2, t, aVar);
                            if (P != l) {
                                obj = P;
                                hVar2 = hVar;
                                nVar = this;
                            }
                            return l;
                        }
                    }
                    T t3 = obj;
                    hVar = hVar2;
                    t = t3;
                    hVar.X = t;
                    InterfaceC4076Qv0<T> interfaceC4076Qv02 = nVar.Z;
                    T t22 = nVar.X.X;
                    aVar.Y0 = null;
                    aVar.Z0 = null;
                    aVar.c1 = 2;
                }
            }
            aVar = new a(this, hm);
            Object obj3 = aVar.a1;
            Object l2 = C7289jT0.l();
            i = aVar.c1;
            if (i == 0) {
            }
            T t32 = obj3;
            hVar = hVar2;
            t = t32;
            hVar.X = t;
            InterfaceC4076Qv0<T> interfaceC4076Qv022 = nVar.Z;
            T t222 = nVar.X.X;
            aVar.Y0 = null;
            aVar.Z0 = null;
            aVar.c1 = 2;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,108:1\n65#2,5:109\n*E\n"})
    /* renamed from: o.pw0$o */
    /* loaded from: classes4.dex */
    public static final class o<T> implements InterfaceC3882Ov0<C9485sP0<? extends T>> {
        public final /* synthetic */ InterfaceC3882Ov0 X;

        public o(InterfaceC3882Ov0 interfaceC3882Ov0) {
            this.X = interfaceC3882Ov0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super C9485sP0<? extends T>> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            Object a = this.X.a(new p(interfaceC4076Qv0, new RP1.f()), hm);
            if (a == C7289jT0.l()) {
                return a;
            }
            return C7458kA2.a;
        }
    }

    @InterfaceC8303na2({"SMAP\nTransform.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n+ 2 FlowExceptions.common.kt\nkotlinx/coroutines/flow/internal/FlowExceptions_commonKt\n*L\n1#1,167:1\n29#2,4:168\n*S KotlinDebug\n*F\n+ 1 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt$withIndex$1$1\n*L\n67#1:168,4\n*E\n"})
    /* renamed from: o.pw0$p */
    /* loaded from: classes4.dex */
    public static final class p<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ InterfaceC4076Qv0<C9485sP0<? extends T>> X;
        public final /* synthetic */ RP1.f Y;

        @FV(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {67}, m = "emit", n = {}, s = {})
        /* renamed from: o.pw0$p$a */
        /* loaded from: classes4.dex */
        public static final class a extends KM {
            public /* synthetic */ Object Y0;
            public final /* synthetic */ p<T> Z0;
            public int a1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(p<? super T> pVar, HM<? super a> hm) {
                super(hm);
                this.Z0 = pVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return this.Z0.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public p(InterfaceC4076Qv0<? super C9485sP0<? extends T>> interfaceC4076Qv0, RP1.f fVar) {
            this.X = interfaceC4076Qv0;
            this.Y = fVar;
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
                        InterfaceC4076Qv0<C9485sP0<? extends T>> interfaceC4076Qv0 = this.X;
                        RP1.f fVar = this.Y;
                        int i3 = fVar.X;
                        fVar.X = i3 + 1;
                        if (i3 >= 0) {
                            C9485sP0<? extends T> c9485sP0 = new C9485sP0<>(i3, t);
                            aVar.a1 = 1;
                            if (interfaceC4076Qv0.c(c9485sP0, aVar) == l) {
                                return l;
                            }
                        } else {
                            throw new ArithmeticException("Index overflow has happened");
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

    @InterfaceC2951Fi0
    @NotNull
    public static final <T> InterfaceC3882Ov0<List<T>> a(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, int i2) {
        if (i2 >= 1) {
            return new a(interfaceC3882Ov0, i2);
        }
        throw new IllegalArgumentException(("Expected positive chunk size, but got " + i2).toString());
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> b(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0) {
        return new c(interfaceC3882Ov0, va0);
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
    public static final /* synthetic */ <R> o.InterfaceC3882Ov0<R> c(o.InterfaceC3882Ov0<?> r1) {
        /*
            o.C6562gT0.w()
            o.pw0$d r0 = new o.pw0$d
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C8876pw0.c(o.Ov0):o.Ov0");
    }

    @NotNull
    public static final <R> InterfaceC3882Ov0<R> d(@NotNull InterfaceC3882Ov0<?> interfaceC3882Ov0, @NotNull AW0<R> aw0) {
        return new e(interfaceC3882Ov0, aw0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super Boolean>, ? extends Object> va0) {
        return new f(interfaceC3882Ov0, va0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> f(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        return new g(interfaceC3882Ov0);
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> g(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super R>, ? extends Object> va0) {
        return new h(interfaceC3882Ov0, va0);
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> h(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super R>, ? extends Object> va0) {
        return new i(interfaceC3882Ov0, va0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> i(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull VA0<? super T, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return new j(interfaceC3882Ov0, va0);
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> j(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, R r, @InterfaceC5183ar @NotNull XA0<? super R, ? super T, ? super HM<? super R>, ? extends Object> xa0) {
        return new k(r, interfaceC3882Ov0, xa0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<T> k(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull XA0<? super T, ? super T, ? super HM<? super T>, ? extends Object> xa0) {
        return new m(interfaceC3882Ov0, xa0);
    }

    @NotNull
    public static final <T, R> InterfaceC3882Ov0<R> l(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, R r, @InterfaceC5183ar @NotNull XA0<? super R, ? super T, ? super HM<? super R>, ? extends Object> xa0) {
        return C4467Uv0.y1(interfaceC3882Ov0, r, xa0);
    }

    @NotNull
    public static final <T> InterfaceC3882Ov0<C9485sP0<T>> m(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0) {
        return new o(interfaceC3882Ov0);
    }
}
