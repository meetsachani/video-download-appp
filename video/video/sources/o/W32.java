package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,746:1\n27#2:747\n27#2:750\n27#2:769\n27#2:773\n27#2:782\n27#2:793\n27#2:804\n16#3:748\n16#3:751\n16#3:770\n16#3:774\n16#3:783\n16#3:794\n16#3:805\n326#4:749\n1#5:752\n91#6,2:753\n93#6,2:756\n95#6:759\n91#6,2:775\n93#6,2:778\n95#6:781\n91#6,2:797\n93#6,2:800\n95#6:803\n13346#7:755\n13347#7:758\n13346#7:777\n13347#7:780\n13346#7:799\n13347#7:802\n351#8,9:760\n360#8,2:771\n351#8,9:784\n360#8,2:795\n*S KotlinDebug\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowImpl\n*L\n366#1:747\n406#1:750\n500#1:769\n521#1:773\n641#1:782\n676#1:793\n704#1:804\n366#1:748\n406#1:751\n500#1:770\n521#1:774\n641#1:783\n676#1:794\n704#1:805\n388#1:749\n468#1:753,2\n468#1:756,2\n468#1:759\n544#1:775,2\n544#1:778,2\n544#1:781\n691#1:797,2\n691#1:800,2\n691#1:803\n468#1:755\n468#1:758\n544#1:777\n544#1:780\n691#1:799\n691#1:802\n498#1:760,9\n498#1:771,2\n675#1:784,9\n675#1:795,2\n*E\n"})
/* loaded from: classes4.dex */
public class W32<T> extends AbstractC5717d3<Y32> implements InterfaceC3950Pn1<T>, InterfaceC9618sy<T>, VB0<T> {
    public final int Z0;
    public final int a1;
    @NotNull
    public final EnumC7132iq b1;
    @Nullable
    public Object[] c1;
    public long d1;
    public long e1;
    public int f1;
    public int g1;

    /* loaded from: classes4.dex */
    public static final class a implements B40 {
        @InterfaceC7058iW0
        @NotNull
        public final W32<?> X;
        @InterfaceC7058iW0
        public long Y;
        @InterfaceC7058iW0
        @NotNull
        public final HM<C7458kA2> Y0;
        @InterfaceC7058iW0
        @Nullable
        public final Object Z;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull W32<?> w32, long j, @Nullable Object obj, @NotNull HM<? super C7458kA2> hm) {
            this.X = w32;
            this.Y = j;
            this.Z = obj;
            this.Y0 = hm;
        }

        @Override // o.B40
        public void e() {
            this.X.E(this);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC7132iq.values().length];
            try {
                iArr[EnumC7132iq.X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7132iq.Z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC7132iq.Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @FV(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {387, 394, 397}, m = "collect$suspendImpl", n = {"$this", "collector", "slot", "$this", "collector", "slot", "collectorJob", "$this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes4.dex */
    public static final class c<T> extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public Object b1;
        public /* synthetic */ Object c1;
        public final /* synthetic */ W32<T> d1;
        public int e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(W32<T> w32, HM<? super c> hm) {
            super(hm);
            this.d1 = w32;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.c1 = obj;
            this.e1 |= Integer.MIN_VALUE;
            return W32.G(this.d1, null, this);
        }
    }

    public W32(int i, int i2, @NotNull EnumC7132iq enumC7132iq) {
        this.Z0 = i;
        this.a1 = i2;
        this.b1 = enumC7132iq;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|(3:(7:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(2:16|(3:28|29|(2:31|32)(2:33|27))(4:18|(1:20)|21|(1:23)(2:26|27)))|24)(4:44|45|46|47)|37|38)(5:53|54|55|(1:57)|60)|48|49|15|(3:16|(0)(0)|27)|24))|63|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)|24) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (((o.C2640Cg2) r9).a(r0) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <T> Object G(W32<T> w32, InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<?> hm) {
        c cVar;
        int i;
        W32<T> w322;
        Throwable th;
        Y32 y32;
        InterfaceC4076Qv0<? super T> interfaceC4076Qv02;
        RU0 ru0;
        InterfaceC4076Qv0<? super T> interfaceC4076Qv03;
        Object obj;
        RU0 ru02;
        InterfaceC4076Qv0<? super T> interfaceC4076Qv04;
        if (hm instanceof c) {
            cVar = (c) hm;
            int i2 = cVar.e1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.e1 = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar.c1;
                Object l = C7289jT0.l();
                i = cVar.e1;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                ru02 = (RU0) cVar.b1;
                                y32 = (Y32) cVar.a1;
                                interfaceC4076Qv04 = (InterfaceC4076Qv0) cVar.Z0;
                                w322 = (W32) cVar.Y0;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ru02 = (RU0) cVar.b1;
                            y32 = (Y32) cVar.a1;
                            interfaceC4076Qv04 = (InterfaceC4076Qv0) cVar.Z0;
                            w322 = (W32) cVar.Y0;
                        }
                        try {
                            RT1.n(obj2);
                            interfaceC4076Qv03 = interfaceC4076Qv04;
                            ru0 = ru02;
                            w32 = w322;
                            while (true) {
                                obj = (Object) w32.b0(y32);
                                if (obj == X32.a) {
                                    cVar.Y0 = w32;
                                    cVar.Z0 = interfaceC4076Qv03;
                                    cVar.a1 = y32;
                                    cVar.b1 = ru0;
                                    cVar.e1 = 2;
                                    if (w32.D(y32, cVar) == l) {
                                        break;
                                    }
                                } else {
                                    if (ru0 != null) {
                                        C5829dV0.z(ru0);
                                    }
                                    cVar.Y0 = w32;
                                    cVar.Z0 = interfaceC4076Qv03;
                                    cVar.a1 = y32;
                                    cVar.b1 = ru0;
                                    cVar.e1 = 3;
                                    if (interfaceC4076Qv03.c(obj, cVar) == l) {
                                        break;
                                    }
                                }
                            }
                            return l;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        y32 = (Y32) cVar.a1;
                        InterfaceC4076Qv0<? super T> interfaceC4076Qv05 = (InterfaceC4076Qv0) cVar.Z0;
                        W32<T> w323 = (W32) cVar.Y0;
                        try {
                            RT1.n(obj2);
                            interfaceC4076Qv02 = interfaceC4076Qv05;
                            w32 = w323;
                        } catch (Throwable th3) {
                            th = th3;
                            w322 = w323;
                        }
                    }
                    w322.l(y32);
                    throw th;
                }
                RT1.n(obj2);
                Y32 h = w32.h();
                try {
                    if (interfaceC4076Qv0 instanceof C2640Cg2) {
                        cVar.Y0 = w32;
                        cVar.Z0 = interfaceC4076Qv0;
                        cVar.a1 = h;
                        cVar.e1 = 1;
                    }
                    interfaceC4076Qv02 = interfaceC4076Qv0;
                    y32 = h;
                } catch (Throwable th4) {
                    w322 = w32;
                    th = th4;
                    y32 = h;
                }
                ru0 = (RU0) cVar.getContext().f(RU0.W);
                interfaceC4076Qv03 = interfaceC4076Qv02;
                while (true) {
                    obj = (Object) w32.b0(y32);
                    if (obj == X32.a) {
                    }
                }
                return l;
            }
        }
        cVar = new c(w32, hm);
        Object obj22 = cVar.c1;
        Object l2 = C7289jT0.l();
        i = cVar.e1;
        if (i == 0) {
        }
        ru0 = (RU0) cVar.getContext().f(RU0.W);
        interfaceC4076Qv03 = interfaceC4076Qv02;
        while (true) {
            obj = (Object) w32.b0(y32);
            if (obj == X32.a) {
            }
        }
        return l2;
    }

    public static /* synthetic */ <T> Object L(W32<T> w32, T t, HM<? super C7458kA2> hm) {
        if (w32.f(t)) {
            return C7458kA2.a;
        }
        Object M = w32.M(t, hm);
        if (M == C7289jT0.l()) {
            return M;
        }
        return C7458kA2.a;
    }

    public final Object D(Y32 y32, HM<? super C7458kA2> hm) {
        C7458kA2 c7458kA2;
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        synchronized (this) {
            try {
                if (a0(y32) < 0) {
                    y32.b = c8883py;
                } else {
                    PT1.a aVar = PT1.Y;
                    c8883py.q(PT1.b(C7458kA2.a));
                }
                c7458kA2 = C7458kA2.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        if (A == C7289jT0.l()) {
            return A;
        }
        return c7458kA2;
    }

    public final void E(a aVar) {
        synchronized (this) {
            if (aVar.Y < Q()) {
                return;
            }
            Object[] objArr = this.c1;
            C6562gT0.m(objArr);
            if (X32.c(objArr, aVar.Y) != aVar) {
                return;
            }
            X32.d(objArr, aVar.Y, X32.a);
            F();
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    public final void F() {
        if (this.a1 != 0 || this.g1 > 1) {
            Object[] objArr = this.c1;
            C6562gT0.m(objArr);
            while (this.g1 > 0 && X32.c(objArr, (Q() + W()) - 1) == X32.a) {
                this.g1--;
                X32.d(objArr, Q() + W(), null);
            }
        }
    }

    public final void H(long j) {
        AbstractC6202f3[] g;
        if (AbstractC5717d3.e(this) != 0 && (g = AbstractC5717d3.g(this)) != null) {
            for (AbstractC6202f3 abstractC6202f3 : g) {
                if (abstractC6202f3 != null) {
                    Y32 y32 = (Y32) abstractC6202f3;
                    long j2 = y32.a;
                    if (j2 >= 0 && j2 < j) {
                        y32.a = j;
                    }
                }
            }
        }
        this.e1 = j;
    }

    @Override // o.AbstractC5717d3
    @NotNull
    /* renamed from: I */
    public Y32 i() {
        return new Y32();
    }

    @Override // o.AbstractC5717d3
    @NotNull
    /* renamed from: J */
    public Y32[] j(int i) {
        return new Y32[i];
    }

    public final void K() {
        Object[] objArr = this.c1;
        C6562gT0.m(objArr);
        X32.d(objArr, Q(), null);
        this.f1--;
        long Q = Q() + 1;
        if (this.d1 < Q) {
            this.d1 = Q;
        }
        if (this.e1 < Q) {
            H(Q);
        }
    }

    public final Object M(T t, HM<? super C7458kA2> hm) {
        Throwable th;
        HM<C7458kA2>[] O;
        a aVar;
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        HM<C7458kA2>[] hmArr = C5959e3.a;
        synchronized (this) {
            try {
                if (Y(t)) {
                    try {
                        PT1.a aVar2 = PT1.Y;
                        c8883py.q(PT1.b(C7458kA2.a));
                        O = O(hmArr);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        aVar = new a(this, Q() + W(), t, c8883py);
                        N(aVar);
                        this.g1++;
                        if (this.a1 == 0) {
                            hmArr = O(hmArr);
                        }
                        O = hmArr;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    C9375ry.a(c8883py, aVar);
                }
                for (HM<C7458kA2> hm2 : O) {
                    if (hm2 != null) {
                        PT1.a aVar3 = PT1.Y;
                        hm2.q(PT1.b(C7458kA2.a));
                    }
                }
                Object A = c8883py.A();
                if (A == C7289jT0.l()) {
                    MV.c(hm);
                }
                if (A == C7289jT0.l()) {
                    return A;
                }
                return C7458kA2.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void N(Object obj) {
        int W = W();
        Object[] objArr = this.c1;
        if (objArr == null) {
            objArr = X(null, 0, 2);
        } else if (W >= objArr.length) {
            objArr = X(objArr, W, objArr.length * 2);
        }
        X32.d(objArr, Q() + W, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final HM<C7458kA2>[] O(HM<C7458kA2>[] hmArr) {
        AbstractC6202f3[] g;
        Y32 y32;
        HM<? super C7458kA2> hm;
        int length = hmArr.length;
        if (AbstractC5717d3.e(this) != 0 && (g = AbstractC5717d3.g(this)) != null) {
            int length2 = g.length;
            int i = 0;
            hmArr = hmArr;
            while (i < length2) {
                AbstractC6202f3 abstractC6202f3 = g[i];
                if (abstractC6202f3 != null && (hm = (y32 = (Y32) abstractC6202f3).b) != null && a0(y32) >= 0) {
                    int length3 = hmArr.length;
                    hmArr = hmArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(hmArr, Math.max(2, hmArr.length * 2));
                        C6562gT0.o(copyOf, "copyOf(...)");
                        hmArr = copyOf;
                    }
                    hmArr[length] = hm;
                    y32.b = null;
                    length++;
                }
                i++;
                hmArr = hmArr;
            }
        }
        return hmArr;
    }

    public final long P() {
        return Q() + this.f1;
    }

    public final long Q() {
        return Math.min(this.e1, this.d1);
    }

    public final T R() {
        Object[] objArr = this.c1;
        C6562gT0.m(objArr);
        return (T) X32.c(objArr, (this.d1 + V()) - 1);
    }

    public final Object T(long j) {
        Object[] objArr = this.c1;
        C6562gT0.m(objArr);
        Object c2 = X32.c(objArr, j);
        if (c2 instanceof a) {
            return ((a) c2).Z;
        }
        return c2;
    }

    public final long U() {
        return Q() + this.f1 + this.g1;
    }

    public final int V() {
        return (int) ((Q() + this.f1) - this.d1);
    }

    public final int W() {
        return this.f1 + this.g1;
    }

    public final Object[] X(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.c1 = objArr2;
            if (objArr != null) {
                long Q = Q();
                for (int i3 = 0; i3 < i; i3++) {
                    long j = i3 + Q;
                    X32.d(objArr2, j, X32.c(objArr, j));
                }
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    public final boolean Y(T t) {
        if (o() == 0) {
            return Z(t);
        }
        if (this.f1 >= this.a1 && this.e1 <= this.d1) {
            int i = b.a[this.b1.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return true;
                }
                if (i != 3) {
                    throw new C3865Oq1();
                }
            } else {
                return false;
            }
        }
        N(t);
        int i2 = this.f1 + 1;
        this.f1 = i2;
        if (i2 > this.a1) {
            K();
        }
        if (V() > this.Z0) {
            c0(this.d1 + 1, this.e1, P(), U());
        }
        return true;
    }

    public final boolean Z(T t) {
        if (this.Z0 == 0) {
            return true;
        }
        N(t);
        int i = this.f1 + 1;
        this.f1 = i;
        if (i > this.Z0) {
            K();
        }
        this.e1 = Q() + this.f1;
        return true;
    }

    @Override // o.V32, o.InterfaceC3882Ov0
    @Nullable
    public Object a(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<?> hm) {
        return G(this, interfaceC4076Qv0, hm);
    }

    public final long a0(Y32 y32) {
        long j = y32.a;
        if (j >= P() && (this.a1 > 0 || j > Q() || this.g1 == 0)) {
            return -1L;
        }
        return j;
    }

    @Override // o.V32
    @NotNull
    public List<T> b() {
        synchronized (this) {
            int V = V();
            if (V == 0) {
                return C8222nF.H();
            }
            ArrayList arrayList = new ArrayList(V);
            Object[] objArr = this.c1;
            C6562gT0.m(objArr);
            for (int i = 0; i < V; i++) {
                arrayList.add(X32.c(objArr, this.d1 + i));
            }
            return arrayList;
        }
    }

    public final Object b0(Y32 y32) {
        Object obj;
        HM<C7458kA2>[] hmArr = C5959e3.a;
        synchronized (this) {
            try {
                long a0 = a0(y32);
                if (a0 < 0) {
                    obj = X32.a;
                } else {
                    long j = y32.a;
                    Object T = T(a0);
                    y32.a = a0 + 1;
                    hmArr = d0(j);
                    obj = T;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (HM<C7458kA2> hm : hmArr) {
            if (hm != null) {
                PT1.a aVar = PT1.Y;
                hm.q(PT1.b(C7458kA2.a));
            }
        }
        return obj;
    }

    @Override // o.InterfaceC3950Pn1, o.InterfaceC4076Qv0
    @Nullable
    public Object c(T t, @NotNull HM<? super C7458kA2> hm) {
        return L(this, t, hm);
    }

    public final void c0(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long Q = Q(); Q < min; Q++) {
            Object[] objArr = this.c1;
            C6562gT0.m(objArr);
            X32.d(objArr, Q, null);
        }
        this.d1 = j;
        this.e1 = j2;
        this.f1 = (int) (j3 - min);
        this.g1 = (int) (j4 - j3);
    }

    @Override // o.VB0
    @NotNull
    public InterfaceC3882Ov0<T> d(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        return X32.e(this, interfaceC5809dQ, i, enumC7132iq);
    }

    @NotNull
    public final HM<C7458kA2>[] d0(long j) {
        int i;
        long j2;
        long j3;
        long j4;
        long j5;
        boolean z;
        AbstractC6202f3[] g;
        if (j > this.e1) {
            return C5959e3.a;
        }
        long Q = Q();
        long j6 = this.f1 + Q;
        if (this.a1 == 0 && this.g1 > 0) {
            j6++;
        }
        if (AbstractC5717d3.e(this) != 0 && (g = AbstractC5717d3.g(this)) != null) {
            for (AbstractC6202f3 abstractC6202f3 : g) {
                if (abstractC6202f3 != null) {
                    long j7 = ((Y32) abstractC6202f3).a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.e1) {
            return C5959e3.a;
        }
        long P = P();
        if (o() > 0) {
            i = Math.min(this.g1, this.a1 - ((int) (P - j6)));
        } else {
            i = this.g1;
        }
        HM<C7458kA2>[] hmArr = C5959e3.a;
        long j8 = this.g1 + P;
        if (i > 0) {
            hmArr = new HM[i];
            Object[] objArr = this.c1;
            C6562gT0.m(objArr);
            j4 = 1;
            long j9 = P;
            int i2 = 0;
            while (true) {
                if (P < j8) {
                    Object c2 = X32.c(objArr, P);
                    j2 = Q;
                    C7592kj2 c7592kj2 = X32.a;
                    if (c2 != c7592kj2) {
                        C6562gT0.n(c2, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        a aVar = (a) c2;
                        int i3 = i2 + 1;
                        j3 = j6;
                        hmArr[i2] = aVar.Y0;
                        X32.d(objArr, P, c7592kj2);
                        X32.d(objArr, j9, aVar.Z);
                        long j10 = j9 + 1;
                        if (i3 < i) {
                            i2 = i3;
                            j9 = j10;
                        } else {
                            P = j10;
                            break;
                        }
                    } else {
                        j3 = j6;
                    }
                    P++;
                    Q = j2;
                    j6 = j3;
                } else {
                    j2 = Q;
                    j3 = j6;
                    P = j9;
                    break;
                }
            }
        } else {
            j2 = Q;
            j3 = j6;
            j4 = 1;
        }
        HM<C7458kA2>[] hmArr2 = hmArr;
        int i4 = (int) (P - j2);
        if (o() == 0) {
            j5 = P;
        } else {
            j5 = j3;
        }
        long max = Math.max(this.d1, P - Math.min(this.Z0, i4));
        if (this.a1 == 0 && max < j8) {
            Object[] objArr2 = this.c1;
            C6562gT0.m(objArr2);
            if (C6562gT0.g(X32.c(objArr2, max), X32.a)) {
                P += j4;
                max += j4;
            }
        }
        c0(max, j5, P, j8);
        F();
        if (hmArr2.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return O(hmArr2);
        }
        return hmArr2;
    }

    public final long e0() {
        long j = this.d1;
        if (j < this.e1) {
            this.e1 = j;
        }
        return j;
    }

    @Override // o.InterfaceC3950Pn1
    public boolean f(T t) {
        int i;
        boolean z;
        HM<C7458kA2>[] hmArr = C5959e3.a;
        synchronized (this) {
            if (Y(t)) {
                hmArr = O(hmArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (HM<C7458kA2> hm : hmArr) {
            if (hm != null) {
                PT1.a aVar = PT1.Y;
                hm.q(PT1.b(C7458kA2.a));
            }
        }
        return z;
    }

    @Override // o.InterfaceC3950Pn1
    public void p() {
        synchronized (this) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                c0(P(), this.e1, P(), U());
                C7458kA2 c7458kA2 = C7458kA2.a;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public static /* synthetic */ void S() {
    }
}
