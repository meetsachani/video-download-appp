package o;

import java.util.concurrent.atomic.AtomicInteger;
import o.C10642xA;
import o.C9117qv2;
import o.InterfaceC10362w02;
import o.OO1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T1
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@InterfaceC8303na2({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,140:1\n105#2:141\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n83#1:141\n*E\n"})
/* loaded from: classes4.dex */
public final class BG {

    @FV(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {51, 73, 76}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public Object a1;
        public int b1;
        public int c1;
        public int d1;
        public /* synthetic */ Object e1;
        public final /* synthetic */ InterfaceC3882Ov0<T>[] f1;
        public final /* synthetic */ FA0<T[]> g1;
        public final /* synthetic */ XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> h1;
        public final /* synthetic */ InterfaceC4076Qv0<R> i1;

        @FV(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {28}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.BG$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0153a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ InterfaceC3882Ov0<T>[] a1;
            public final /* synthetic */ int b1;
            public final /* synthetic */ AtomicInteger c1;
            public final /* synthetic */ InterfaceC6728hA<C9485sP0<Object>> d1;

            /* renamed from: o.BG$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0154a<T> implements InterfaceC4076Qv0 {
                public final /* synthetic */ InterfaceC6728hA<C9485sP0<Object>> X;
                public final /* synthetic */ int Y;

                @FV(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {29, 30}, m = "emit", n = {}, s = {})
                /* renamed from: o.BG$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0155a extends KM {
                    public /* synthetic */ Object Y0;
                    public final /* synthetic */ C0154a<T> Z0;
                    public int a1;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0155a(C0154a<? super T> c0154a, HM<? super C0155a> hm) {
                        super(hm);
                        this.Z0 = c0154a;
                    }

                    @Override // o.AbstractC5644cl
                    public final Object F(Object obj) {
                        this.Y0 = obj;
                        this.a1 |= Integer.MIN_VALUE;
                        return this.Z0.c(null, this);
                    }
                }

                public C0154a(InterfaceC6728hA<C9485sP0<Object>> interfaceC6728hA, int i) {
                    this.X = interfaceC6728hA;
                    this.Y = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
                    if (r8.d0(r2, r0) == r1) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
                    if (o.C6787hO2.a(r0) != r1) goto L11;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
                    return r1;
                 */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
                @Override // o.InterfaceC4076Qv0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(T t, HM<? super C7458kA2> hm) {
                    C0155a c0155a;
                    int i;
                    if (hm instanceof C0155a) {
                        c0155a = (C0155a) hm;
                        int i2 = c0155a.a1;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0155a.a1 = i2 - Integer.MIN_VALUE;
                            Object obj = c0155a.Y0;
                            Object l = C7289jT0.l();
                            i = c0155a.a1;
                            if (i == 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        RT1.n(obj);
                                        return C7458kA2.a;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                RT1.n(obj);
                            } else {
                                RT1.n(obj);
                                InterfaceC6728hA<C9485sP0<Object>> interfaceC6728hA = this.X;
                                C9485sP0<Object> c9485sP0 = new C9485sP0<>(this.Y, t);
                                c0155a.a1 = 1;
                            }
                            c0155a.a1 = 2;
                        }
                    }
                    c0155a = new C0155a(this, hm);
                    Object obj2 = c0155a.Y0;
                    Object l2 = C7289jT0.l();
                    i = c0155a.a1;
                    if (i == 0) {
                    }
                    c0155a.a1 = 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0153a(InterfaceC3882Ov0<? extends T>[] interfaceC3882Ov0Arr, int i, AtomicInteger atomicInteger, InterfaceC6728hA<C9485sP0<Object>> interfaceC6728hA, HM<? super C0153a> hm) {
                super(2, hm);
                this.a1 = interfaceC3882Ov0Arr;
                this.b1 = i;
                this.c1 = atomicInteger;
                this.d1 = interfaceC6728hA;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                AtomicInteger atomicInteger;
                Object l = C7289jT0.l();
                int i = this.Z0;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        InterfaceC3882Ov0[] interfaceC3882Ov0Arr = this.a1;
                        int i2 = this.b1;
                        InterfaceC3882Ov0 interfaceC3882Ov0 = interfaceC3882Ov0Arr[i2];
                        C0154a c0154a = new C0154a(this.d1, i2);
                        this.Z0 = 1;
                        if (interfaceC3882Ov0.a(c0154a, this) == l) {
                            return l;
                        }
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        InterfaceC10362w02.a.a(this.d1, null, 1, null);
                    }
                    return C7458kA2.a;
                } finally {
                    if (this.c1.decrementAndGet() == 0) {
                        InterfaceC10362w02.a.a(this.d1, null, 1, null);
                    }
                }
            }

            @Override // o.VA0
            /* renamed from: U */
            public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
                return ((C0153a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new C0153a(this.a1, this.b1, this.c1, this.d1, hm);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC3882Ov0<? extends T>[] interfaceC3882Ov0Arr, FA0<T[]> fa0, XA0<? super InterfaceC4076Qv0<? super R>, ? super T[], ? super HM<? super C7458kA2>, ? extends Object> xa0, InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super a> hm) {
            super(2, hm);
            this.f1 = interfaceC3882Ov0Arr;
            this.g1 = fa0;
            this.h1 = xa0;
            this.i1 = interfaceC4076Qv0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x0106, code lost:
            if (r10.P(r11, r9, r21) == r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
            if (r11.P(r12, r10, r21) == r1) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[LOOP:0: B:28:0x00c1->B:34:0x00e4, LOOP_START, PHI: r6 r10 
          PHI: (r6v4 int) = (r6v3 int), (r6v5 int) binds: [B:25:0x00bc, B:34:0x00e4] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v5 o.sP0) = (r10v4 o.sP0), (r10v18 o.sP0) binds: [B:25:0x00bc, B:34:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e6 -> B:44:0x0129). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0106 -> B:44:0x0129). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0126 -> B:44:0x0129). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            int length;
            int i;
            byte[] bArr;
            Object[] objArr;
            InterfaceC6728hA interfaceC6728hA;
            Object obj2;
            Object[] objArr2;
            byte[] bArr2;
            int i2;
            int i3;
            C9485sP0 c9485sP0;
            Object l = C7289jT0.l();
            int i4 = this.d1;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2 && i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = this.c1;
                    i2 = this.b1;
                    bArr2 = (byte[]) this.a1;
                    interfaceC6728hA = (InterfaceC6728hA) this.Z0;
                    objArr2 = (Object[]) this.e1;
                    RT1.n(obj);
                    i = i3;
                    length = i2;
                    bArr = bArr2;
                    objArr = objArr2;
                    byte b = (byte) (i + 1);
                    this.e1 = objArr;
                    this.Z0 = interfaceC6728hA;
                    this.a1 = bArr;
                    this.b1 = length;
                    this.c1 = b;
                    this.d1 = 1;
                    obj2 = interfaceC6728hA.D(this);
                    if (obj2 != l) {
                        byte[] bArr3 = bArr;
                        i2 = length;
                        i3 = b;
                        objArr2 = objArr;
                        bArr2 = bArr3;
                        c9485sP0 = (C9485sP0) C10642xA.h(obj2);
                        if (c9485sP0 != null) {
                            return C7458kA2.a;
                        }
                        do {
                            int e = c9485sP0.e();
                            Object obj3 = objArr2[e];
                            objArr2[e] = c9485sP0.f();
                            if (obj3 == C9596ss1.b) {
                                i2--;
                            }
                            if (bArr2[e] == i3) {
                                break;
                            }
                            bArr2[e] = (byte) i3;
                            c9485sP0 = (C9485sP0) C10642xA.h(interfaceC6728hA.U());
                        } while (c9485sP0 != null);
                        if (i2 == 0) {
                            Object[] objArr3 = (Object[]) this.g1.invoke();
                            if (objArr3 == null) {
                                XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> xa0 = this.h1;
                                Object obj4 = this.i1;
                                this.e1 = objArr2;
                                this.Z0 = interfaceC6728hA;
                                this.a1 = bArr2;
                                this.b1 = i2;
                                this.c1 = i3;
                                this.d1 = 2;
                            } else {
                                C4788Ye.K0(objArr2, objArr3, 0, 0, 0, 14, null);
                                XA0<InterfaceC4076Qv0<? super R>, T[], HM<? super C7458kA2>, Object> xa02 = this.h1;
                                Object obj5 = this.i1;
                                this.e1 = objArr2;
                                this.Z0 = interfaceC6728hA;
                                this.a1 = bArr2;
                                this.b1 = i2;
                                this.c1 = i3;
                                this.d1 = 3;
                            }
                            byte b2 = (byte) (i + 1);
                            this.e1 = objArr;
                            this.Z0 = interfaceC6728hA;
                            this.a1 = bArr;
                            this.b1 = length;
                            this.c1 = b2;
                            this.d1 = 1;
                            obj2 = interfaceC6728hA.D(this);
                            if (obj2 != l) {
                            }
                        }
                        i = i3;
                        length = i2;
                        bArr = bArr2;
                        objArr = objArr2;
                        byte b22 = (byte) (i + 1);
                        this.e1 = objArr;
                        this.Z0 = interfaceC6728hA;
                        this.a1 = bArr;
                        this.b1 = length;
                        this.c1 = b22;
                        this.d1 = 1;
                        obj2 = interfaceC6728hA.D(this);
                        if (obj2 != l) {
                        }
                    }
                    return l;
                }
                i3 = this.c1;
                i2 = this.b1;
                bArr2 = (byte[]) this.a1;
                interfaceC6728hA = (InterfaceC6728hA) this.Z0;
                objArr2 = (Object[]) this.e1;
                RT1.n(obj);
                obj2 = ((C10642xA) obj).o();
                c9485sP0 = (C9485sP0) C10642xA.h(obj2);
                if (c9485sP0 != null) {
                }
            } else {
                RT1.n(obj);
                InterfaceC9974uQ interfaceC9974uQ = (InterfaceC9974uQ) this.e1;
                length = this.f1.length;
                if (length == 0) {
                    return C7458kA2.a;
                }
                Object[] objArr4 = new Object[length];
                C4788Ye.V1(objArr4, C9596ss1.b, 0, 0, 6, null);
                InterfaceC6728hA d = C9424sA.d(length, null, null, 6, null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                i = 0;
                int i5 = 0;
                while (i5 < length) {
                    AtomicInteger atomicInteger2 = atomicInteger;
                    C5910dr.f(interfaceC9974uQ, null, null, new C0153a(this.f1, i5, atomicInteger2, d, null), 3, null);
                    i5++;
                    atomicInteger = atomicInteger2;
                }
                bArr = new byte[length];
                objArr = objArr4;
                interfaceC6728hA = d;
                byte b222 = (byte) (i + 1);
                this.e1 = objArr;
                this.Z0 = interfaceC6728hA;
                this.a1 = bArr;
                this.b1 = length;
                this.c1 = b222;
                this.d1 = 1;
                obj2 = interfaceC6728hA.D(this);
                if (obj2 != l) {
                }
                return l;
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.f1, this.g1, this.h1, this.i1, hm);
            aVar.e1 = obj;
            return aVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @InterfaceC8303na2({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt\n*L\n1#1,108:1\n84#2:109\n139#2:110\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b<R> implements InterfaceC3882Ov0<R> {
        public final /* synthetic */ InterfaceC3882Ov0 X;
        public final /* synthetic */ InterfaceC3882Ov0 Y;
        public final /* synthetic */ XA0 Z;

        public b(InterfaceC3882Ov0 interfaceC3882Ov0, InterfaceC3882Ov0 interfaceC3882Ov02, XA0 xa0) {
            this.X = interfaceC3882Ov0;
            this.Y = interfaceC3882Ov02;
            this.Z = xa0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super R> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            Object g = C10217vQ.g(new c(this.X, this.Y, interfaceC4076Qv0, this.Z, null), hm);
            if (g == C7289jT0.l()) {
                return g;
            }
            return C7458kA2.a;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0, 0}, l = {123}, m = "invokeSuspend", n = {C9117qv2.r.f, "collectJob"}, s = {"L$0", "L$1"})
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public Object Z0;
        public int a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ InterfaceC3882Ov0<T2> c1;
        public final /* synthetic */ InterfaceC3882Ov0<T1> d1;
        public final /* synthetic */ InterfaceC4076Qv0<R> e1;
        public final /* synthetic */ XA0<T1, T2, HM<? super R>, Object> f1;

        /* loaded from: classes4.dex */
        public static final class a implements HA0<Throwable, C7458kA2> {
            public final /* synthetic */ MH X;

            public a(MH mh) {
                this.X = mh;
            }

            public final void c(Throwable th) {
                if (this.X.h()) {
                    this.X.i(new H(this.X));
                }
            }

            @Override // o.HA0
            public /* bridge */ /* synthetic */ C7458kA2 invoke(Throwable th) {
                c(th);
                return C7458kA2.a;
            }
        }

        @FV(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC4225Si2 implements VA0<C7458kA2, HM<? super C7458kA2>, Object> {
            public int Z0;
            public final /* synthetic */ InterfaceC3882Ov0<T1> a1;
            public final /* synthetic */ InterfaceC5809dQ b1;
            public final /* synthetic */ Object c1;
            public final /* synthetic */ OO1<Object> d1;
            public final /* synthetic */ InterfaceC4076Qv0<R> e1;
            public final /* synthetic */ XA0<T1, T2, HM<? super R>, Object> f1;
            public final /* synthetic */ MH g1;

            /* loaded from: classes4.dex */
            public static final class a<T> implements InterfaceC4076Qv0 {
                public final /* synthetic */ InterfaceC5809dQ X;
                public final /* synthetic */ Object Y;
                public final /* synthetic */ InterfaceC4076Qv0<R> Y0;
                public final /* synthetic */ OO1<Object> Z;
                public final /* synthetic */ XA0<T1, T2, HM<? super R>, Object> Z0;
                public final /* synthetic */ MH a1;

                @FV(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {126, 129, 129}, m = "invokeSuspend", n = {}, s = {})
                @InterfaceC8303na2({"SMAP\nCombine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,140:1\n516#2:141\n14#3:142\n*S KotlinDebug\n*F\n+ 1 Combine.kt\nkotlinx/coroutines/flow/internal/CombineKt$zipImpl$1$1$2$1$1\n*L\n126#1:141\n129#1:142\n*E\n"})
                /* renamed from: o.BG$c$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0156a extends AbstractC4225Si2 implements VA0<C7458kA2, HM<? super C7458kA2>, Object> {
                    public Object Z0;
                    public int a1;
                    public final /* synthetic */ OO1<Object> b1;
                    public final /* synthetic */ InterfaceC4076Qv0<R> c1;
                    public final /* synthetic */ XA0<T1, T2, HM<? super R>, Object> d1;
                    public final /* synthetic */ T1 e1;
                    public final /* synthetic */ MH f1;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0156a(OO1<? extends Object> oo1, InterfaceC4076Qv0<? super R> interfaceC4076Qv0, XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0, T1 t1, MH mh, HM<? super C0156a> hm) {
                        super(2, hm);
                        this.b1 = oo1;
                        this.c1 = interfaceC4076Qv0;
                        this.d1 = xa0;
                        this.e1 = t1;
                        this.f1 = mh;
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
                        if (r9 == r0) goto L15;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
                        if (r9 == r0) goto L15;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
                        if (r1.c(r9, r8) == r0) goto L15;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
                        return r0;
                     */
                    @Override // o.AbstractC5644cl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object F(Object obj) {
                        Object D;
                        InterfaceC4076Qv0 interfaceC4076Qv0;
                        Object l = C7289jT0.l();
                        int i = this.a1;
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        RT1.n(obj);
                                        return C7458kA2.a;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                RT1.n(obj);
                                interfaceC4076Qv0 = (InterfaceC4076Qv0) this.Z0;
                                this.Z0 = null;
                                this.a1 = 3;
                            } else {
                                RT1.n(obj);
                                D = ((C10642xA) obj).o();
                            }
                        } else {
                            RT1.n(obj);
                            OO1<Object> oo1 = this.b1;
                            this.a1 = 1;
                            D = oo1.D(this);
                        }
                        MH mh = this.f1;
                        if (D instanceof C10642xA.c) {
                            Throwable f = C10642xA.f(D);
                            if (f == null) {
                                throw new H(mh);
                            }
                            throw f;
                        }
                        InterfaceC4076Qv0 interfaceC4076Qv02 = this.c1;
                        XA0<T1, T2, HM<? super R>, Object> xa0 = this.d1;
                        T1 t1 = this.e1;
                        if (D == C9596ss1.a) {
                            D = null;
                        }
                        this.Z0 = interfaceC4076Qv02;
                        this.a1 = 2;
                        obj = xa0.P(t1, D, this);
                        interfaceC4076Qv0 = interfaceC4076Qv02;
                    }

                    public final Object U(C7458kA2 c7458kA2, HM<? super C7458kA2> hm) {
                        return ((C0156a) t(c7458kA2, hm)).F(C7458kA2.a);
                    }

                    @Override // o.VA0
                    public /* bridge */ /* synthetic */ Object i(C7458kA2 c7458kA2, HM<? super C7458kA2> hm) {
                        return U(c7458kA2, hm);
                    }

                    @Override // o.AbstractC5644cl
                    public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                        return new C0156a(this.b1, this.c1, this.d1, this.e1, this.f1, hm);
                    }
                }

                @FV(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", f = "Combine.kt", i = {}, l = {125}, m = "emit", n = {}, s = {})
                /* renamed from: o.BG$c$b$a$b  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0157b extends KM {
                    public /* synthetic */ Object Y0;
                    public final /* synthetic */ a<T> Z0;
                    public int a1;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0157b(a<? super T> aVar, HM<? super C0157b> hm) {
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
                public a(InterfaceC5809dQ interfaceC5809dQ, Object obj, OO1<? extends Object> oo1, InterfaceC4076Qv0<? super R> interfaceC4076Qv0, XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0, MH mh) {
                    this.X = interfaceC5809dQ;
                    this.Y = obj;
                    this.Z = oo1;
                    this.Y0 = interfaceC4076Qv0;
                    this.Z0 = xa0;
                    this.a1 = mh;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // o.InterfaceC4076Qv0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(T1 t1, HM<? super C7458kA2> hm) {
                    C0157b c0157b;
                    int i;
                    if (hm instanceof C0157b) {
                        c0157b = (C0157b) hm;
                        int i2 = c0157b.a1;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0157b.a1 = i2 - Integer.MIN_VALUE;
                            Object obj = c0157b.Y0;
                            Object l = C7289jT0.l();
                            i = c0157b.a1;
                            if (i == 0) {
                                if (i == 1) {
                                    RT1.n(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                RT1.n(obj);
                                InterfaceC5809dQ interfaceC5809dQ = this.X;
                                C7458kA2 c7458kA2 = C7458kA2.a;
                                Object obj2 = this.Y;
                                C0156a c0156a = new C0156a(this.Z, this.Y0, this.Z0, t1, this.a1, null);
                                c0157b.a1 = 1;
                                if (C7959mA.c(interfaceC5809dQ, c7458kA2, obj2, c0156a, c0157b) == l) {
                                    return l;
                                }
                            }
                            return C7458kA2.a;
                        }
                    }
                    c0157b = new C0157b(this, hm);
                    Object obj3 = c0157b.Y0;
                    Object l2 = C7289jT0.l();
                    i = c0157b.a1;
                    if (i == 0) {
                    }
                    return C7458kA2.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, InterfaceC5809dQ interfaceC5809dQ, Object obj, OO1<? extends Object> oo1, InterfaceC4076Qv0<? super R> interfaceC4076Qv0, XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0, MH mh, HM<? super b> hm) {
                super(2, hm);
                this.a1 = interfaceC3882Ov0;
                this.b1 = interfaceC5809dQ;
                this.c1 = obj;
                this.d1 = oo1;
                this.e1 = interfaceC4076Qv0;
                this.f1 = xa0;
                this.g1 = mh;
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
                    InterfaceC3882Ov0<T1> interfaceC3882Ov0 = this.a1;
                    a aVar = new a(this.b1, this.c1, this.d1, this.e1, this.f1, this.g1);
                    this.Z0 = 1;
                    if (interfaceC3882Ov0.a(aVar, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            public final Object U(C7458kA2 c7458kA2, HM<? super C7458kA2> hm) {
                return ((b) t(c7458kA2, hm)).F(C7458kA2.a);
            }

            @Override // o.VA0
            public /* bridge */ /* synthetic */ Object i(C7458kA2 c7458kA2, HM<? super C7458kA2> hm) {
                return U(c7458kA2, hm);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                return new b(this.a1, this.b1, this.c1, this.d1, this.e1, this.f1, this.g1, hm);
            }
        }

        @FV(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1", f = "Combine.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o.BG$c$c  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0158c extends AbstractC4225Si2 implements VA0<AI1<? super Object>, HM<? super C7458kA2>, Object> {
            public int Z0;
            public /* synthetic */ Object a1;
            public final /* synthetic */ InterfaceC3882Ov0<T2> b1;

            /* renamed from: o.BG$c$c$a */
            /* loaded from: classes4.dex */
            public static final class a<T> implements InterfaceC4076Qv0 {
                public final /* synthetic */ AI1<Object> X;

                @FV(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", f = "Combine.kt", i = {}, l = {87}, m = "emit", n = {}, s = {})
                /* renamed from: o.BG$c$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0159a extends KM {
                    public /* synthetic */ Object Y0;
                    public final /* synthetic */ a<T> Z0;
                    public int a1;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0159a(a<? super T> aVar, HM<? super C0159a> hm) {
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

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // o.InterfaceC4076Qv0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object c(T2 t2, HM<? super C7458kA2> hm) {
                    C0159a c0159a;
                    int i;
                    if (hm instanceof C0159a) {
                        c0159a = (C0159a) hm;
                        int i2 = c0159a.a1;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c0159a.a1 = i2 - Integer.MIN_VALUE;
                            Object obj = c0159a.Y0;
                            Object l = C7289jT0.l();
                            i = c0159a.a1;
                            if (i == 0) {
                                if (i == 1) {
                                    RT1.n(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                RT1.n(obj);
                                InterfaceC10362w02<Object> a = this.X.a();
                                C7592kj2 c7592kj2 = t2;
                                if (t2 == 0) {
                                    c7592kj2 = C9596ss1.a;
                                }
                                c0159a.a1 = 1;
                                if (a.d0(c7592kj2, c0159a) == l) {
                                    return l;
                                }
                            }
                            return C7458kA2.a;
                        }
                    }
                    c0159a = new C0159a(this, hm);
                    Object obj2 = c0159a.Y0;
                    Object l2 = C7289jT0.l();
                    i = c0159a.a1;
                    if (i == 0) {
                    }
                    return C7458kA2.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0158c(InterfaceC3882Ov0<? extends T2> interfaceC3882Ov0, HM<? super C0158c> hm) {
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
                    InterfaceC3882Ov0<T2> interfaceC3882Ov0 = this.b1;
                    a aVar = new a((AI1) this.a1);
                    this.Z0 = 1;
                    if (interfaceC3882Ov0.a(aVar, this) == l) {
                        return l;
                    }
                }
                return C7458kA2.a;
            }

            public final Object U(AI1<Object> ai1, HM<? super C7458kA2> hm) {
                return ((C0158c) t(ai1, hm)).F(C7458kA2.a);
            }

            @Override // o.VA0
            public /* bridge */ /* synthetic */ Object i(AI1<? super Object> ai1, HM<? super C7458kA2> hm) {
                return U(ai1, hm);
            }

            @Override // o.AbstractC5644cl
            public final HM<C7458kA2> t(Object obj, HM<?> hm) {
                C0158c c0158c = new C0158c(this.b1, hm);
                c0158c.a1 = obj;
                return c0158c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(InterfaceC3882Ov0<? extends T2> interfaceC3882Ov0, InterfaceC3882Ov0<? extends T1> interfaceC3882Ov02, InterfaceC4076Qv0<? super R> interfaceC4076Qv0, XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0, HM<? super c> hm) {
            super(2, hm);
            this.c1 = interfaceC3882Ov0;
            this.d1 = interfaceC3882Ov02;
            this.e1 = interfaceC4076Qv0;
            this.f1 = xa0;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            MH c;
            OO1 oo1;
            MH mh;
            OO1 oo12;
            MH mh2;
            Object l = C7289jT0.l();
            int i = this.a1;
            if (i != 0) {
                if (i == 1) {
                    mh2 = (MH) this.Z0;
                    oo12 = (OO1) this.b1;
                    try {
                        try {
                            RT1.n(obj);
                        } catch (Throwable th) {
                            th = th;
                            OO1.a.b(oo12, null, 1, null);
                            throw th;
                        }
                    } catch (H e) {
                        e = e;
                        C4370Tv0.b(e, mh2);
                        OO1.a.b(oo12, null, 1, null);
                        return C7458kA2.a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                InterfaceC9974uQ interfaceC9974uQ = (InterfaceC9974uQ) this.b1;
                OO1 j = C10919yI1.j(interfaceC9974uQ, null, 0, new C0158c(this.c1, null), 3, null);
                c = C6314fV0.c(null, 1, null);
                C6562gT0.n(j, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
                ((InterfaceC10362w02) j).c(new a(c));
                try {
                    InterfaceC5809dQ a0 = interfaceC9974uQ.a0();
                    Object g = C10795xn2.g(a0);
                    InterfaceC5809dQ M = interfaceC9974uQ.a0().M(c);
                    try {
                        try {
                            C7458kA2 c7458kA2 = C7458kA2.a;
                            try {
                                b bVar = new b(this.d1, a0, g, j, this.e1, this.f1, c, null);
                                oo1 = j;
                                mh = c;
                                try {
                                    this.b1 = oo1;
                                    this.Z0 = mh;
                                    this.a1 = 1;
                                    if (C7959mA.d(M, c7458kA2, null, bVar, this, 4, null) == l) {
                                        return l;
                                    }
                                    oo12 = oo1;
                                } catch (H e2) {
                                    e = e2;
                                    mh2 = mh;
                                    oo12 = oo1;
                                    C4370Tv0.b(e, mh2);
                                    OO1.a.b(oo12, null, 1, null);
                                    return C7458kA2.a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    oo12 = oo1;
                                    OO1.a.b(oo12, null, 1, null);
                                    throw th;
                                }
                            } catch (H e3) {
                                e = e3;
                                oo1 = j;
                                mh = c;
                            }
                        } catch (H e4) {
                            e = e4;
                            mh = c;
                            oo1 = j;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        oo1 = j;
                    }
                } catch (H e5) {
                    e = e5;
                    oo1 = j;
                    mh = c;
                } catch (Throwable th4) {
                    th = th4;
                    oo1 = j;
                }
            }
            OO1.a.b(oo12, null, 1, null);
            return C7458kA2.a;
        }

        public final Object U(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((c) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return U(interfaceC9974uQ, hm);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            c cVar = new c(this.c1, this.d1, this.e1, this.f1, hm);
            cVar.b1 = obj;
            return cVar;
        }
    }

    @HK1
    @Nullable
    public static final <R, T> Object a(@NotNull InterfaceC4076Qv0<? super R> interfaceC4076Qv0, @NotNull InterfaceC3882Ov0<? extends T>[] interfaceC3882Ov0Arr, @NotNull FA0<T[]> fa0, @NotNull XA0<? super InterfaceC4076Qv0<? super R>, ? super T[], ? super HM<? super C7458kA2>, ? extends Object> xa0, @NotNull HM<? super C7458kA2> hm) {
        Object a2 = C4273Sv0.a(new a(interfaceC3882Ov0Arr, fa0, xa0, interfaceC4076Qv0, null), hm);
        if (a2 == C7289jT0.l()) {
            return a2;
        }
        return C7458kA2.a;
    }

    @NotNull
    public static final <T1, T2, R> InterfaceC3882Ov0<R> b(@NotNull InterfaceC3882Ov0<? extends T1> interfaceC3882Ov0, @NotNull InterfaceC3882Ov0<? extends T2> interfaceC3882Ov02, @NotNull XA0<? super T1, ? super T2, ? super HM<? super R>, ? extends Object> xa0) {
        return new b(interfaceC3882Ov02, interfaceC3882Ov0, xa0);
    }
}
