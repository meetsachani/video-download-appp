package o;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n+ 2 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,433:1\n14#2:434\n14#2:442\n27#3:435\n27#3:439\n16#4:436\n16#4:440\n13346#5,2:437\n326#6:441\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowImpl\n*L\n320#1:434\n401#1:442\n329#1:435\n357#1:439\n329#1:436\n357#1:440\n353#1:437,2\n390#1:441\n*E\n"})
/* renamed from: o.rc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9290rc2<T> extends AbstractC5717d3<C9776tc2> implements InterfaceC4144Rn1<T>, InterfaceC9618sy<T>, VB0<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a1 = AtomicReferenceFieldUpdater.newUpdater(C9290rc2.class, Object.class, "_state$volatile");
    public int Z0;
    private volatile /* synthetic */ Object _state$volatile;

    @FV(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {389, 401, 406}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: o.rc2$a */
    /* loaded from: classes4.dex */
    public static final class a extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public Object b1;
        public Object c1;
        public /* synthetic */ Object d1;
        public final /* synthetic */ C9290rc2<T> e1;
        public int f1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C9290rc2<T> c9290rc2, HM<? super a> hm) {
            super(hm);
            this.e1 = c9290rc2;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.d1 = obj;
            this.f1 |= Integer.MIN_VALUE;
            return this.e1.a(null, this);
        }
    }

    public C9290rc2(@NotNull Object obj) {
        this._state$volatile = obj;
    }

    private final /* synthetic */ Object t() {
        return this._state$volatile;
    }

    private final /* synthetic */ void v(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
        if (((o.C2640Cg2) r11).a(r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
        if (o.C6562gT0.g(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
        if (r12 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:36:0x00ac, B:38:0x00b6, B:40:0x00bb, B:50:0x00dc, B:52:0x00e2, B:42:0x00c1, B:46:0x00c8, B:21:0x0060, B:24:0x0073, B:35:0x009d), top: B:57:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [o.f3] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e0 -> B:36:0x00ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f2 -> B:36:0x00ac). Please submit an issue!!! */
    @Override // o.V32, o.InterfaceC3882Ov0
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<?> hm) {
        a aVar;
        Object l;
        int i;
        C9290rc2<T> c9290rc2;
        C9776tc2 c9776tc2;
        InterfaceC4076Qv0 interfaceC4076Qv02;
        RU0 ru0;
        Object obj;
        InterfaceC4076Qv0<? super T> interfaceC4076Qv03;
        C9776tc2 c9776tc22;
        boolean h;
        Object obj2;
        Object obj3;
        try {
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.f1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.f1 = i2 - Integer.MIN_VALUE;
                    Object obj4 = aVar.d1;
                    l = C7289jT0.l();
                    i = aVar.f1;
                    C9776tc2 c9776tc23 = 1;
                    if (i == 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3) {
                                    obj = aVar.c1;
                                    ru0 = (RU0) aVar.b1;
                                    C9776tc2 c9776tc24 = (C9776tc2) aVar.a1;
                                    InterfaceC4076Qv0 interfaceC4076Qv04 = (InterfaceC4076Qv0) aVar.Z0;
                                    c9290rc2 = (C9290rc2) aVar.Y0;
                                    RT1.n(obj4);
                                    c9776tc23 = c9776tc24;
                                    interfaceC4076Qv02 = interfaceC4076Qv04;
                                    obj2 = a1.get(c9290rc2);
                                    if (ru0 != null) {
                                        C5829dV0.z(ru0);
                                    }
                                    if (obj != null) {
                                        c9776tc22 = c9776tc23;
                                        interfaceC4076Qv03 = interfaceC4076Qv02;
                                    }
                                    if (obj2 == C9596ss1.a) {
                                        obj3 = null;
                                    } else {
                                        obj3 = obj2;
                                    }
                                    aVar.Y0 = c9290rc2;
                                    aVar.Z0 = interfaceC4076Qv02;
                                    aVar.a1 = c9776tc23;
                                    aVar.b1 = ru0;
                                    aVar.c1 = obj2;
                                    aVar.f1 = 2;
                                    if (interfaceC4076Qv02.c(obj3, aVar) != l) {
                                        obj = obj2;
                                        c9776tc22 = c9776tc23;
                                        interfaceC4076Qv03 = interfaceC4076Qv02;
                                        h = c9776tc22.h();
                                        c9776tc23 = c9776tc22;
                                        interfaceC4076Qv02 = interfaceC4076Qv03;
                                        if (!h) {
                                            aVar.Y0 = c9290rc2;
                                            aVar.Z0 = interfaceC4076Qv03;
                                            aVar.a1 = c9776tc22;
                                            aVar.b1 = ru0;
                                            aVar.c1 = obj;
                                            aVar.f1 = 3;
                                            Object e = c9776tc22.e(aVar);
                                            c9776tc23 = c9776tc22;
                                            interfaceC4076Qv02 = interfaceC4076Qv03;
                                        }
                                        obj2 = a1.get(c9290rc2);
                                        if (ru0 != null) {
                                        }
                                        if (obj != null) {
                                        }
                                        if (obj2 == C9596ss1.a) {
                                        }
                                        aVar.Y0 = c9290rc2;
                                        aVar.Z0 = interfaceC4076Qv02;
                                        aVar.a1 = c9776tc23;
                                        aVar.b1 = ru0;
                                        aVar.c1 = obj2;
                                        aVar.f1 = 2;
                                        if (interfaceC4076Qv02.c(obj3, aVar) != l) {
                                        }
                                    } else {
                                        return l;
                                    }
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                obj = aVar.c1;
                                ru0 = (RU0) aVar.b1;
                                C9776tc2 c9776tc25 = (C9776tc2) aVar.a1;
                                InterfaceC4076Qv0<? super T> interfaceC4076Qv05 = (InterfaceC4076Qv0) aVar.Z0;
                                c9290rc2 = (C9290rc2) aVar.Y0;
                                RT1.n(obj4);
                                c9776tc22 = c9776tc25;
                                interfaceC4076Qv03 = interfaceC4076Qv05;
                                h = c9776tc22.h();
                                c9776tc23 = c9776tc22;
                                interfaceC4076Qv02 = interfaceC4076Qv03;
                                if (!h) {
                                }
                                obj2 = a1.get(c9290rc2);
                                if (ru0 != null) {
                                }
                                if (obj != null) {
                                }
                                if (obj2 == C9596ss1.a) {
                                }
                                aVar.Y0 = c9290rc2;
                                aVar.Z0 = interfaceC4076Qv02;
                                aVar.a1 = c9776tc23;
                                aVar.b1 = ru0;
                                aVar.c1 = obj2;
                                aVar.f1 = 2;
                                if (interfaceC4076Qv02.c(obj3, aVar) != l) {
                                }
                            }
                        } else {
                            c9776tc2 = (C9776tc2) aVar.a1;
                            interfaceC4076Qv0 = (InterfaceC4076Qv0) aVar.Z0;
                            c9290rc2 = (C9290rc2) aVar.Y0;
                            RT1.n(obj4);
                        }
                    } else {
                        RT1.n(obj4);
                        C9776tc2 h2 = h();
                        try {
                            if (interfaceC4076Qv0 instanceof C2640Cg2) {
                                aVar.Y0 = this;
                                aVar.Z0 = interfaceC4076Qv0;
                                aVar.a1 = h2;
                                aVar.f1 = 1;
                            }
                            c9290rc2 = this;
                            c9776tc2 = h2;
                        } catch (Throwable th) {
                            th = th;
                            c9290rc2 = this;
                            c9776tc23 = h2;
                            c9290rc2.l(c9776tc23);
                            throw th;
                        }
                    }
                    interfaceC4076Qv02 = interfaceC4076Qv0;
                    ru0 = (RU0) aVar.getContext().f(RU0.W);
                    obj = null;
                    c9776tc23 = c9776tc2;
                    obj2 = a1.get(c9290rc2);
                    if (ru0 != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj2 == C9596ss1.a) {
                    }
                    aVar.Y0 = c9290rc2;
                    aVar.Z0 = interfaceC4076Qv02;
                    aVar.a1 = c9776tc23;
                    aVar.b1 = ru0;
                    aVar.c1 = obj2;
                    aVar.f1 = 2;
                    if (interfaceC4076Qv02.c(obj3, aVar) != l) {
                    }
                }
            }
            if (i == 0) {
            }
            interfaceC4076Qv02 = interfaceC4076Qv0;
            ru0 = (RU0) aVar.getContext().f(RU0.W);
            obj = null;
            c9776tc23 = c9776tc2;
            obj2 = a1.get(c9290rc2);
            if (ru0 != null) {
            }
            if (obj != null) {
            }
            if (obj2 == C9596ss1.a) {
            }
            aVar.Y0 = c9290rc2;
            aVar.Z0 = interfaceC4076Qv02;
            aVar.a1 = c9776tc23;
            aVar.b1 = ru0;
            aVar.c1 = obj2;
            aVar.f1 = 2;
            if (interfaceC4076Qv02.c(obj3, aVar) != l) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        aVar = new a(this, hm);
        Object obj42 = aVar.d1;
        l = C7289jT0.l();
        i = aVar.f1;
        C9776tc2 c9776tc232 = 1;
    }

    @Override // o.V32
    @NotNull
    public List<T> b() {
        return C7979mF.k(getValue());
    }

    @Override // o.InterfaceC3950Pn1, o.InterfaceC4076Qv0
    @Nullable
    public Object c(T t, @NotNull HM<? super C7458kA2> hm) {
        setValue(t);
        return C7458kA2.a;
    }

    @Override // o.VB0
    @NotNull
    public InterfaceC3882Ov0<T> d(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        return C9533sc2.d(this, interfaceC5809dQ, i, enumC7132iq);
    }

    @Override // o.InterfaceC3950Pn1
    public boolean f(T t) {
        setValue(t);
        return true;
    }

    @Override // o.InterfaceC4144Rn1, o.InterfaceC9041qc2
    public T getValue() {
        C7592kj2 c7592kj2 = C9596ss1.a;
        T t = (T) a1.get(this);
        if (t == c7592kj2) {
            return null;
        }
        return t;
    }

    @Override // o.InterfaceC4144Rn1
    public boolean n(T t, T t2) {
        if (t == null) {
            t = (T) C9596ss1.a;
        }
        if (t2 == null) {
            t2 = (T) C9596ss1.a;
        }
        return w(t, t2);
    }

    @Override // o.InterfaceC3950Pn1
    public void p() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // o.AbstractC5717d3
    @NotNull
    /* renamed from: r */
    public C9776tc2 i() {
        return new C9776tc2();
    }

    @Override // o.AbstractC5717d3
    @NotNull
    /* renamed from: s */
    public C9776tc2[] j(int i) {
        return new C9776tc2[i];
    }

    @Override // o.InterfaceC4144Rn1
    public void setValue(T t) {
        if (t == null) {
            t = (T) C9596ss1.a;
        }
        w(null, t);
    }

    public final boolean w(Object obj, Object obj2) {
        int i;
        C9776tc2[] q;
        synchronized (this) {
            Object obj3 = a1.get(this);
            if (obj != null && !C6562gT0.g(obj3, obj)) {
                return false;
            }
            if (C6562gT0.g(obj3, obj2)) {
                return true;
            }
            a1.set(this, obj2);
            int i2 = this.Z0;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.Z0 = i3;
                C9776tc2[] q2 = q();
                C7458kA2 c7458kA2 = C7458kA2.a;
                while (true) {
                    C9776tc2[] c9776tc2Arr = q2;
                    if (c9776tc2Arr != null) {
                        for (C9776tc2 c9776tc2 : c9776tc2Arr) {
                            if (c9776tc2 != null) {
                                c9776tc2.g();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.Z0;
                        if (i == i3) {
                            this.Z0 = i3 + 1;
                            return true;
                        }
                        q = q();
                        C7458kA2 c7458kA22 = C7458kA2.a;
                    }
                    q2 = q;
                    i3 = i;
                }
            } else {
                this.Z0 = i2 + 2;
                return true;
            }
        }
    }
}
