package o;

import com.facebook.internal.C2356a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.InterfaceC5809dQ;
import o.RP1;
import o.RU0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 9 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1583:1\n732#1,3:1587\n361#1,2:1597\n363#1,5:1602\n368#1,5:1608\n373#1,2:1616\n361#1,2:1618\n363#1,5:1623\n368#1,5:1629\n373#1,2:1637\n169#1,2:1645\n734#1:1647\n536#1:1648\n169#1,2:1649\n537#1,15:1651\n169#1,2:1666\n169#1,2:1668\n169#1,2:1681\n732#1,3:1683\n732#1,3:1686\n169#1,2:1689\n732#1,3:1691\n169#1,2:1694\n169#1,2:1698\n169#1,2:1700\n536#1:1704\n169#1,2:1705\n537#1,15:1707\n1#2:1584\n1#2:1607\n1#2:1628\n27#3:1585\n27#3:1696\n27#3:1702\n16#4:1586\n16#4:1697\n16#4:1703\n295#5,2:1590\n295#5,2:1592\n22#6:1594\n159#7:1595\n159#7:1596\n149#7,4:1722\n275#8,3:1599\n278#8,3:1613\n275#8,3:1620\n278#8,3:1634\n275#8,6:1639\n351#9,11:1670\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n241#1:1587,3\n324#1:1597,2\n324#1:1602,5\n324#1:1608,5\n324#1:1616,2\n357#1:1618,2\n357#1:1623,5\n357#1:1629,5\n357#1:1637,2\n377#1:1645,2\n422#1:1647\n468#1:1648\n468#1:1649,2\n468#1:1651,15\n536#1:1666,2\n579#1:1668,2\n621#1:1681,2\n648#1:1683,3\n657#1:1686,3\n721#1:1689,2\n750#1:1691,3\n763#1:1694,2\n836#1:1698,2\n858#1:1700,2\n1023#1:1704\n1023#1:1705,2\n1023#1:1707,15\n324#1:1607\n357#1:1628\n204#1:1585\n766#1:1696\n911#1:1702\n204#1:1586\n766#1:1697\n911#1:1703\n252#1:1590,2\n256#1:1592,2\n264#1:1594\n270#1:1595\n272#1:1596\n1327#1:1722,4\n324#1:1599,3\n324#1:1613,3\n357#1:1620,3\n357#1:1634,3\n362#1:1639,6\n585#1:1670,11\n*E\n"})
@InterfaceC9150r20(level = EnumC9879u20.Y, message = "This is internal API and may be removed in the future releases")
/* renamed from: o.hV0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6812hV0 implements RU0, InterfaceC5268bC, InterfaceC2805Dy1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(C6812hV0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(C6812hV0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @InterfaceC8303na2({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    /* renamed from: o.hV0$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends C8883py<T> {
        @NotNull
        public final C6812hV0 d1;

        public a(@NotNull HM<? super T> hm, @NotNull C6812hV0 c6812hV0) {
            super(hm, 1);
            this.d1 = c6812hV0;
        }

        @Override // o.C8883py
        @NotNull
        public String T() {
            return "AwaitContinuation";
        }

        @Override // o.C8883py
        @NotNull
        public Throwable y(@NotNull RU0 ru0) {
            Throwable e;
            Object U0 = this.d1.U0();
            if ((U0 instanceof c) && (e = ((c) U0).e()) != null) {
                return e;
            }
            if (U0 instanceof QH) {
                return ((QH) U0).a;
            }
            return ru0.u();
        }
    }

    /* renamed from: o.hV0$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC6569gV0 {
        @NotNull
        public final C6812hV0 Z0;
        @NotNull
        public final c a1;
        @NotNull
        public final C5025aC b1;
        @Nullable
        public final Object c1;

        public b(@NotNull C6812hV0 c6812hV0, @NotNull c cVar, @NotNull C5025aC c5025aC, @Nullable Object obj) {
            this.Z0 = c6812hV0;
            this.a1 = cVar;
            this.b1 = c5025aC;
            this.c1 = obj;
        }

        @Override // o.AbstractC6569gV0
        public boolean E() {
            return false;
        }

        @Override // o.AbstractC6569gV0
        public void F(@Nullable Throwable th) {
            this.Z0.D0(this.a1, this.b1, this.c1);
        }
    }

    @InterfaceC8303na2({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1583:1\n1#2:1584\n*E\n"})
    /* renamed from: o.hV0$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC5563cP0 {
        @NotNull
        public final C4256Sq1 X;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;
        public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater Y0 = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");

        public c(@NotNull C4256Sq1 c4256Sq1, boolean z, @Nullable Throwable th) {
            this.X = c4256Sq1;
            this._isCompleting$volatile = z ? 1 : 0;
            this._rootCause$volatile = th;
        }

        @Override // o.InterfaceC5563cP0
        @NotNull
        public C4256Sq1 a() {
            return this.X;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b(@NotNull Throwable th) {
            Throwable e = e();
            if (e == null) {
                s(th);
            } else if (th != e) {
                Object d = d();
                if (d == null) {
                    r(th);
                } else if (d instanceof Throwable) {
                    if (th == d) {
                        return;
                    }
                    ArrayList<Throwable> c = c();
                    c.add(d);
                    c.add(th);
                    r(c);
                } else if (d instanceof ArrayList) {
                    ((ArrayList) d).add(th);
                } else {
                    throw new IllegalStateException(("State is " + d).toString());
                }
            }
        }

        public final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        public final Object d() {
            return Y0.get(this);
        }

        @Nullable
        public final Throwable e() {
            return (Throwable) Z.get(this);
        }

        public final /* synthetic */ Object f() {
            return this._exceptionsHolder$volatile;
        }

        @Override // o.InterfaceC5563cP0
        public boolean h() {
            if (e() == null) {
                return true;
            }
            return false;
        }

        public final /* synthetic */ int i() {
            return this._isCompleting$volatile;
        }

        public final /* synthetic */ Object k() {
            return this._rootCause$volatile;
        }

        public final boolean m() {
            if (e() != null) {
                return true;
            }
            return false;
        }

        public final boolean n() {
            if (Y.get(this) != 0) {
                return true;
            }
            return false;
        }

        public final boolean o() {
            if (d() == C7055iV0.e()) {
                return true;
            }
            return false;
        }

        @NotNull
        public final List<Throwable> p(@Nullable Throwable th) {
            ArrayList<Throwable> arrayList;
            Object d = d();
            if (d == null) {
                arrayList = c();
            } else if (d instanceof Throwable) {
                ArrayList<Throwable> c = c();
                c.add(d);
                arrayList = c;
            } else if (d instanceof ArrayList) {
                arrayList = (ArrayList) d;
            } else {
                throw new IllegalStateException(("State is " + d).toString());
            }
            Throwable e = e();
            if (e != null) {
                arrayList.add(0, e);
            }
            if (th != null && !C6562gT0.g(th, e)) {
                arrayList.add(th);
            }
            r(C7055iV0.e());
            return arrayList;
        }

        public final void q(boolean z) {
            Y.set(this, z ? 1 : 0);
        }

        public final void r(Object obj) {
            Y0.set(this, obj);
        }

        public final void s(@Nullable Throwable th) {
            Z.set(this, th);
        }

        public final /* synthetic */ void t(Object obj) {
            this._exceptionsHolder$volatile = obj;
        }

        @NotNull
        public String toString() {
            return "Finishing[cancelling=" + m() + ", completing=" + n() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + a() + ']';
        }

        public final /* synthetic */ void u(int i) {
            this._isCompleting$volatile = i;
        }

        public final /* synthetic */ void v(Object obj) {
            this._rootCause$volatile = obj;
        }
    }

    /* renamed from: o.hV0$d */
    /* loaded from: classes3.dex */
    public final class d extends AbstractC6569gV0 {
        @NotNull
        public final InterfaceC6691h02<?> Z0;

        public d(@NotNull InterfaceC6691h02<?> interfaceC6691h02) {
            this.Z0 = interfaceC6691h02;
        }

        @Override // o.AbstractC6569gV0
        public boolean E() {
            return false;
        }

        @Override // o.AbstractC6569gV0
        public void F(@Nullable Throwable th) {
            Object U0 = C6812hV0.this.U0();
            if (!(U0 instanceof QH)) {
                U0 = C7055iV0.h(U0);
            }
            this.Z0.h(C6812hV0.this, U0);
        }
    }

    /* renamed from: o.hV0$e */
    /* loaded from: classes3.dex */
    public final class e extends AbstractC6569gV0 {
        @NotNull
        public final InterfaceC6691h02<?> Z0;

        public e(@NotNull InterfaceC6691h02<?> interfaceC6691h02) {
            this.Z0 = interfaceC6691h02;
        }

        @Override // o.AbstractC6569gV0
        public boolean E() {
            return false;
        }

        @Override // o.AbstractC6569gV0
        public void F(@Nullable Throwable th) {
            this.Z0.h(C6812hV0.this, C7458kA2.a);
        }
    }

    @FV(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {1003, 1005}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    @InterfaceC8303na2({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n+ 2 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n*L\n1#1,1583:1\n275#2,6:1584\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$children$1\n*L\n1005#1:1584,6\n*E\n"})
    /* renamed from: o.hV0$f */
    /* loaded from: classes3.dex */
    public static final class f extends MT1 implements VA0<F02<? super RU0>, HM<? super C7458kA2>, Object> {
        public Object Y0;
        public Object Z;
        public int Z0;
        public /* synthetic */ Object a1;

        public f(HM<? super f> hm) {
            super(2, hm);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
            if (r6.b(r1, r5) == r0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
            if (r4.b(r6, r5) == r0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x006b -> B:27:0x0081). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007e -> B:27:0x0081). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            C8906q31 a;
            C8906q31 c8906q31;
            C8906q31 c8906q312;
            F02 f02;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c8906q312 = (C8906q31) this.Y0;
                        c8906q31 = (C8419o31) this.Z;
                        f02 = (F02) this.a1;
                        RT1.n(obj);
                        c8906q312 = c8906q312.m();
                        if (!C6562gT0.g(c8906q312, c8906q31)) {
                            if (c8906q312 instanceof C5025aC) {
                                InterfaceC5268bC interfaceC5268bC = ((C5025aC) c8906q312).Z0;
                                this.a1 = f02;
                                this.Z = c8906q31;
                                this.Y0 = c8906q312;
                                this.Z0 = 2;
                            }
                            c8906q312 = c8906q312.m();
                            if (!C6562gT0.g(c8906q312, c8906q31)) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                }
            } else {
                RT1.n(obj);
                F02 f022 = (F02) this.a1;
                Object U0 = C6812hV0.this.U0();
                if (U0 instanceof C5025aC) {
                    InterfaceC5268bC interfaceC5268bC2 = ((C5025aC) U0).Z0;
                    this.Z0 = 1;
                } else if ((U0 instanceof InterfaceC5563cP0) && (a = ((InterfaceC5563cP0) U0).a()) != null) {
                    Object l2 = a.l();
                    C6562gT0.n(l2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    C8906q31 c8906q313 = (C8906q31) l2;
                    c8906q31 = a;
                    c8906q312 = c8906q313;
                    f02 = f022;
                    if (!C6562gT0.g(c8906q312, c8906q31)) {
                    }
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: O */
        public final Object i(F02<? super RU0> f02, HM<? super C7458kA2> hm) {
            return ((f) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            f fVar = new f(hm);
            fVar.a1 = obj;
            return fVar;
        }
    }

    /* renamed from: o.hV0$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class g extends C7964mB0 implements XA0<C6812hV0, InterfaceC6691h02<?>, Object, C7458kA2> {
        public static final g e1 = new g();

        public g() {
            super(3, C6812hV0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ C7458kA2 P(C6812hV0 c6812hV0, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            u0(c6812hV0, interfaceC6691h02, obj);
            return C7458kA2.a;
        }

        public final void u0(C6812hV0 c6812hV0, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            c6812hV0.s1(interfaceC6691h02, obj);
        }
    }

    /* renamed from: o.hV0$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class h extends C7964mB0 implements XA0<C6812hV0, Object, Object, Object> {
        public static final h e1 = new h();

        public h() {
            super(3, C6812hV0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // o.XA0
        /* renamed from: u0 */
        public final Object P(C6812hV0 c6812hV0, Object obj, Object obj2) {
            return c6812hV0.r1(obj, obj2);
        }
    }

    /* renamed from: o.hV0$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class i extends C7964mB0 implements XA0<C6812hV0, InterfaceC6691h02<?>, Object, C7458kA2> {
        public static final i e1 = new i();

        public i() {
            super(3, C6812hV0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ C7458kA2 P(C6812hV0 c6812hV0, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            u0(c6812hV0, interfaceC6691h02, obj);
            return C7458kA2.a;
        }

        public final void u0(C6812hV0 c6812hV0, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            c6812hV0.y1(interfaceC6691h02, obj);
        }
    }

    public C6812hV0(boolean z) {
        C3604Ma0 d2;
        if (z) {
            d2 = C7055iV0.c();
        } else {
            d2 = C7055iV0.d();
        }
        this._state$volatile = d2;
    }

    private final /* synthetic */ void B1(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void C1(Object obj) {
        this._state$volatile = obj;
    }

    public static /* synthetic */ SU0 G0(C6812hV0 c6812hV0, String str, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = c6812hV0.A0();
            }
            return new SU0(str, th, c6812hV0);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    public static /* synthetic */ CancellationException G1(C6812hV0 c6812hV0, Throwable th, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            return c6812hV0.F1(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final /* synthetic */ Object V0() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ Object X0() {
        return this._state$volatile;
    }

    @Override // o.RU0
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public RU0 A(@NotNull RU0 ru0) {
        return RU0.a.j(this, ru0);
    }

    @NotNull
    public String A0() {
        return "Job was cancelled";
    }

    public final void A1(@Nullable ZB zb) {
        Y.set(this, zb);
    }

    public boolean B0(@NotNull Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (w0(th) && N0()) {
            return true;
        }
        return false;
    }

    public final void C0(InterfaceC5563cP0 interfaceC5563cP0, Object obj) {
        QH qh;
        ZB T0 = T0();
        if (T0 != null) {
            T0.e();
            A1(C4741Xq1.X);
        }
        Throwable th = null;
        if (obj instanceof QH) {
            qh = (QH) obj;
        } else {
            qh = null;
        }
        if (qh != null) {
            th = qh.a;
        }
        if (interfaceC5563cP0 instanceof AbstractC6569gV0) {
            try {
                ((AbstractC6569gV0) interfaceC5563cP0).F(th);
                return;
            } catch (Throwable th2) {
                a1(new RH("Exception in completion handler " + interfaceC5563cP0 + " for " + this, th2));
                return;
            }
        }
        C4256Sq1 a2 = interfaceC5563cP0.a();
        if (a2 != null) {
            p1(a2, th);
        }
    }

    public final void D0(c cVar, C5025aC c5025aC, Object obj) {
        C5025aC n1 = n1(c5025aC);
        if (n1 == null || !N1(cVar, n1, obj)) {
            cVar.a().f(2);
            C5025aC n12 = n1(c5025aC);
            if (n12 != null && N1(cVar, n12, obj)) {
                return;
            }
            s0(H0(cVar, obj));
        }
    }

    public final int D1(Object obj) {
        if (obj instanceof C3604Ma0) {
            if (((C3604Ma0) obj).h()) {
                return 0;
            }
            if (!P2.a(X, this, obj, C7055iV0.c())) {
                return -1;
            }
            v1();
            return 1;
        } else if (!(obj instanceof YO0)) {
            return 0;
        } else {
            if (!P2.a(X, this, obj, ((YO0) obj).a())) {
                return -1;
            }
            v1();
            return 1;
        }
    }

    public final Throwable E0(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new SU0(A0(), null, this);
            }
            return th;
        }
        C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC2805Dy1) obj).F();
    }

    public final String E1(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.m()) {
                return "Cancelling";
            }
            if (!cVar.n()) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof InterfaceC5563cP0) {
            if (((InterfaceC5563cP0) obj).h()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof QH) {
            return C2356a.u;
        } else {
            return C2356a.s;
        }
    }

    @Override // o.InterfaceC2805Dy1
    @NotNull
    public CancellationException F() {
        Throwable th;
        Object U0 = U0();
        CancellationException cancellationException = null;
        if (U0 instanceof c) {
            th = ((c) U0).e();
        } else if (U0 instanceof QH) {
            th = ((QH) U0).a;
        } else if (!(U0 instanceof InterfaceC5563cP0)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + U0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            return new SU0("Parent job is " + E1(U0), th, this);
        }
        return cancellationException;
    }

    @NotNull
    public final SU0 F0(@Nullable String str, @Nullable Throwable th) {
        if (str == null) {
            str = A0();
        }
        return new SU0(str, th, this);
    }

    @NotNull
    public final CancellationException F1(@NotNull Throwable th, @Nullable String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = A0();
            }
            cancellationException = new SU0(str, th, this);
        }
        return cancellationException;
    }

    public final Object H0(c cVar, Object obj) {
        QH qh;
        Throwable th;
        boolean m;
        Throwable M0;
        if (obj instanceof QH) {
            qh = (QH) obj;
        } else {
            qh = null;
        }
        if (qh != null) {
            th = qh.a;
        } else {
            th = null;
        }
        synchronized (cVar) {
            m = cVar.m();
            List<Throwable> p = cVar.p(th);
            M0 = M0(cVar, p);
            if (M0 != null) {
                r0(M0, p);
            }
        }
        if (M0 != null && M0 != th) {
            obj = new QH(M0, false, 2, null);
        }
        if (M0 != null && (z0(M0) || Z0(M0))) {
            C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((QH) obj).d();
        }
        if (!m) {
            t1(M0);
        }
        u1(obj);
        P2.a(X, this, cVar, C7055iV0.g(obj));
        C0(cVar, obj);
        return obj;
    }

    @InterfaceC10472wS0
    @NotNull
    public final String H1() {
        return m1() + '{' + E1(U0()) + '}';
    }

    @Nullable
    public final Object I0() {
        Object U0 = U0();
        if (!(U0 instanceof InterfaceC5563cP0)) {
            if (!(U0 instanceof QH)) {
                return C7055iV0.h(U0);
            }
            throw ((QH) U0).a;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    public final boolean I1(InterfaceC5563cP0 interfaceC5563cP0, Object obj) {
        if (!P2.a(X, this, interfaceC5563cP0, C7055iV0.g(obj))) {
            return false;
        }
        t1(null);
        u1(obj);
        C0(interfaceC5563cP0, obj);
        return true;
    }

    @Nullable
    public final Throwable J0() {
        Object U0 = U0();
        if (U0 instanceof c) {
            Throwable e2 = ((c) U0).e();
            if (e2 != null) {
                return e2;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(U0 instanceof InterfaceC5563cP0)) {
            if (U0 instanceof QH) {
                return ((QH) U0).a;
            }
            return null;
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public final boolean J1(InterfaceC5563cP0 interfaceC5563cP0, Throwable th) {
        C4256Sq1 S0 = S0(interfaceC5563cP0);
        if (S0 == null) {
            return false;
        }
        if (!P2.a(X, this, interfaceC5563cP0, new c(S0, false, th))) {
            return false;
        }
        o1(S0, th);
        return true;
    }

    public final boolean K0() {
        Object U0 = U0();
        if ((U0 instanceof QH) && ((QH) U0).a()) {
            return true;
        }
        return false;
    }

    public final Object K1(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC5563cP0)) {
            return C7055iV0.a();
        }
        if (((obj instanceof C3604Ma0) || (obj instanceof AbstractC6569gV0)) && !(obj instanceof C5025aC) && !(obj2 instanceof QH)) {
            if (I1((InterfaceC5563cP0) obj, obj2)) {
                return obj2;
            }
            return C7055iV0.b();
        }
        return L1((InterfaceC5563cP0) obj, obj2);
    }

    public final Throwable L0(Object obj) {
        QH qh;
        if (obj instanceof QH) {
            qh = (QH) obj;
        } else {
            qh = null;
        }
        if (qh == null) {
            return null;
        }
        return qh.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Throwable, T] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final Object L1(InterfaceC5563cP0 interfaceC5563cP0, Object obj) {
        c cVar;
        QH qh;
        C4256Sq1 S0 = S0(interfaceC5563cP0);
        if (S0 == null) {
            return C7055iV0.b();
        }
        ?? r2 = 0;
        if (interfaceC5563cP0 instanceof c) {
            cVar = (c) interfaceC5563cP0;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            cVar = new c(S0, false, null);
        }
        RP1.h hVar = new RP1.h();
        synchronized (cVar) {
            if (cVar.n()) {
                return C7055iV0.a();
            }
            cVar.q(true);
            if (cVar != interfaceC5563cP0 && !P2.a(X, this, interfaceC5563cP0, cVar)) {
                return C7055iV0.b();
            }
            boolean m = cVar.m();
            if (obj instanceof QH) {
                qh = (QH) obj;
            } else {
                qh = null;
            }
            if (qh != null) {
                cVar.b(qh.a);
            }
            Throwable e2 = cVar.e();
            if (!m) {
                r2 = e2;
            }
            hVar.X = r2;
            C7458kA2 c7458kA2 = C7458kA2.a;
            if (r2 != 0) {
                o1(S0, r2);
            }
            C5025aC n1 = n1(S0);
            if (n1 != null && N1(cVar, n1, obj)) {
                return C7055iV0.b;
            }
            S0.f(2);
            C5025aC n12 = n1(S0);
            if (n12 != null && N1(cVar, n12, obj)) {
                return C7055iV0.b;
            }
            return H0(cVar, obj);
        }
    }

    @Override // o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ M(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        return RU0.a.i(this, interfaceC5809dQ);
    }

    public final Throwable M0(c cVar, List<? extends Throwable> list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (!cVar.m()) {
                return null;
            }
            return new SU0(A0(), null, this);
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof C8363np2) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof C8363np2)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final boolean M1(AbstractC6569gV0 abstractC6569gV0, VA0<? super InterfaceC5563cP0, ? super C4256Sq1, Boolean> va0) {
        while (true) {
            Object U0 = U0();
            if (U0 instanceof C3604Ma0) {
                C3604Ma0 c3604Ma0 = (C3604Ma0) U0;
                if (c3604Ma0.h()) {
                    if (P2.a(X, this, U0, abstractC6569gV0)) {
                        return true;
                    }
                } else {
                    w1(c3604Ma0);
                }
            } else if (U0 instanceof InterfaceC5563cP0) {
                C4256Sq1 a2 = ((InterfaceC5563cP0) U0).a();
                if (a2 == null) {
                    C6562gT0.n(U0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    x1((AbstractC6569gV0) U0);
                } else if (va0.i(U0, a2).booleanValue()) {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    @Override // o.InterfaceC5268bC
    public final void N(@NotNull InterfaceC2805Dy1 interfaceC2805Dy1) {
        w0(interfaceC2805Dy1);
    }

    public boolean N0() {
        return true;
    }

    public final boolean N1(c cVar, C5025aC c5025aC, Object obj) {
        while (C5829dV0.B(c5025aC.Z0, false, new b(this, cVar, c5025aC, obj)) == C4741Xq1.X) {
            c5025aC = n1(c5025aC);
            if (c5025aC == null) {
                return false;
            }
        }
        return true;
    }

    @Override // o.RU0
    @NotNull
    public final ZB O(@NotNull InterfaceC5268bC interfaceC5268bC) {
        QH qh;
        QH qh2;
        C5025aC c5025aC = new C5025aC(interfaceC5268bC);
        c5025aC.G(this);
        while (true) {
            Object U0 = U0();
            if (U0 instanceof C3604Ma0) {
                C3604Ma0 c3604Ma0 = (C3604Ma0) U0;
                if (c3604Ma0.h()) {
                    if (P2.a(X, this, U0, c5025aC)) {
                        return c5025aC;
                    }
                } else {
                    w1(c3604Ma0);
                }
            } else {
                Throwable th = null;
                if (U0 instanceof InterfaceC5563cP0) {
                    C4256Sq1 a2 = ((InterfaceC5563cP0) U0).a();
                    if (a2 == null) {
                        C6562gT0.n(U0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        x1((AbstractC6569gV0) U0);
                    } else {
                        if (!a2.b(c5025aC, 7)) {
                            boolean b2 = a2.b(c5025aC, 3);
                            Object U02 = U0();
                            if (U02 instanceof c) {
                                th = ((c) U02).e();
                            } else {
                                if (U02 instanceof QH) {
                                    qh2 = (QH) U02;
                                } else {
                                    qh2 = null;
                                }
                                if (qh2 != null) {
                                    th = qh2.a;
                                }
                            }
                            c5025aC.F(th);
                            if (!b2) {
                                return C4741Xq1.X;
                            }
                        }
                        return c5025aC;
                    }
                } else {
                    Object U03 = U0();
                    if (U03 instanceof QH) {
                        qh = (QH) U03;
                    } else {
                        qh = null;
                    }
                    if (qh != null) {
                        th = qh.a;
                    }
                    c5025aC.F(th);
                    return C4741Xq1.X;
                }
            }
        }
    }

    @NotNull
    public final InterfaceC5223b02<?> O0() {
        g gVar = g.e1;
        C6562gT0.n(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        h hVar = h.e1;
        C6562gT0.n(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C5465c02(this, (XA0) C11313zv2.q(gVar, 3), (XA0) C11313zv2.q(hVar, 3), null, 8, null);
    }

    @Override // o.RU0
    @NotNull
    public final B40 Q(boolean z, boolean z2, @NotNull HA0<? super Throwable, C7458kA2> ha0) {
        AbstractC6569gV0 ct0;
        if (z) {
            ct0 = new BT0(ha0);
        } else {
            ct0 = new CT0(ha0);
        }
        return c1(z2, ct0);
    }

    public boolean Q0() {
        return false;
    }

    public final C4256Sq1 S0(InterfaceC5563cP0 interfaceC5563cP0) {
        C4256Sq1 a2 = interfaceC5563cP0.a();
        if (a2 == null) {
            if (interfaceC5563cP0 instanceof C3604Ma0) {
                return new C4256Sq1();
            }
            if (interfaceC5563cP0 instanceof AbstractC6569gV0) {
                x1((AbstractC6569gV0) interfaceC5563cP0);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + interfaceC5563cP0).toString());
        }
        return a2;
    }

    @Override // o.RU0
    @Nullable
    public final Object T(@NotNull HM<? super C7458kA2> hm) {
        if (!g1()) {
            C5829dV0.y(hm.getContext());
            return C7458kA2.a;
        }
        Object h1 = h1(hm);
        if (h1 == C7289jT0.l()) {
            return h1;
        }
        return C7458kA2.a;
    }

    @Nullable
    public final ZB T0() {
        return (ZB) Y.get(this);
    }

    @Nullable
    public final Object U0() {
        return X.get(this);
    }

    public boolean Z0(@NotNull Throwable th) {
        return false;
    }

    public final void b1(@Nullable RU0 ru0) {
        if (ru0 == null) {
            A1(C4741Xq1.X);
            return;
        }
        ru0.start();
        ZB O = ru0.O(this);
        A1(O);
        if (l()) {
            O.e();
            A1(C4741Xq1.X);
        }
    }

    @NotNull
    public final B40 c1(boolean z, @NotNull AbstractC6569gV0 abstractC6569gV0) {
        boolean z2;
        Throwable th;
        QH qh;
        boolean b2;
        c cVar;
        Throwable th2;
        abstractC6569gV0.G(this);
        while (true) {
            Object U0 = U0();
            z2 = true;
            th = null;
            if (U0 instanceof C3604Ma0) {
                C3604Ma0 c3604Ma0 = (C3604Ma0) U0;
                if (c3604Ma0.h()) {
                    if (P2.a(X, this, U0, abstractC6569gV0)) {
                        break;
                    }
                } else {
                    w1(c3604Ma0);
                }
            } else if (U0 instanceof InterfaceC5563cP0) {
                InterfaceC5563cP0 interfaceC5563cP0 = (InterfaceC5563cP0) U0;
                C4256Sq1 a2 = interfaceC5563cP0.a();
                if (a2 == null) {
                    C6562gT0.n(U0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    x1((AbstractC6569gV0) U0);
                } else {
                    if (abstractC6569gV0.E()) {
                        if (interfaceC5563cP0 instanceof c) {
                            cVar = (c) interfaceC5563cP0;
                        } else {
                            cVar = null;
                        }
                        if (cVar != null) {
                            th2 = cVar.e();
                        } else {
                            th2 = null;
                        }
                        if (th2 == null) {
                            b2 = a2.b(abstractC6569gV0, 5);
                        } else {
                            if (z) {
                                abstractC6569gV0.F(th2);
                            }
                            return C4741Xq1.X;
                        }
                    } else {
                        b2 = a2.b(abstractC6569gV0, 1);
                    }
                    if (b2) {
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return abstractC6569gV0;
        }
        if (z) {
            Object U02 = U0();
            if (U02 instanceof QH) {
                qh = (QH) U02;
            } else {
                qh = null;
            }
            if (qh != null) {
                th = qh.a;
            }
            abstractC6569gV0.F(th);
        }
        return C4741Xq1.X;
    }

    @Override // o.RU0
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        i(null);
    }

    @Override // o.RU0, o.InterfaceC10800xp
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean d(Throwable th) {
        Throwable su0;
        if (th == null || (su0 = G1(this, th, null, 1, null)) == null) {
            su0 = new SU0(A0(), null, this);
        }
        x0(su0);
        return true;
    }

    public final boolean d1(InterfaceC5563cP0 interfaceC5563cP0) {
        if ((interfaceC5563cP0 instanceof c) && ((c) interfaceC5563cP0).m()) {
            return true;
        }
        return false;
    }

    @Override // o.RU0
    @NotNull
    public final ZZ1 e0() {
        i iVar = i.e1;
        C6562gT0.n(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new C4980a02(this, (XA0) C11313zv2.q(iVar, 3), null, 4, null);
    }

    public final boolean e1() {
        return U0() instanceof QH;
    }

    @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    @Nullable
    public <E extends InterfaceC5809dQ.b> E f(@NotNull InterfaceC5809dQ.c<E> cVar) {
        return (E) RU0.a.e(this, cVar);
    }

    public boolean f1() {
        return false;
    }

    public final boolean g1() {
        Object U0;
        do {
            U0 = U0();
            if (!(U0 instanceof InterfaceC5563cP0)) {
                return false;
            }
        } while (D1(U0) < 0);
        return true;
    }

    @Override // o.InterfaceC5809dQ.b
    @NotNull
    public final InterfaceC5809dQ.c<?> getKey() {
        return RU0.W;
    }

    @Override // o.RU0
    @Nullable
    public RU0 getParent() {
        ZB T0 = T0();
        if (T0 != null) {
            return T0.getParent();
        }
        return null;
    }

    @Override // o.RU0
    public boolean h() {
        Object U0 = U0();
        if ((U0 instanceof InterfaceC5563cP0) && ((InterfaceC5563cP0) U0).h()) {
            return true;
        }
        return false;
    }

    public final Object h1(HM<? super C7458kA2> hm) {
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        C9375ry.a(c8883py, C5829dV0.C(this, false, new C6567gU1(c8883py), 1, null));
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        if (A == C7289jT0.l()) {
            return A;
        }
        return C7458kA2.a;
    }

    @Override // o.RU0, o.InterfaceC10800xp
    public void i(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new SU0(A0(), null, this);
        }
        x0(cancellationException);
    }

    @Override // o.RU0
    @NotNull
    public final B40 i0(@NotNull HA0<? super Throwable, C7458kA2> ha0) {
        return c1(true, new CT0(ha0));
    }

    public final Void i1(HA0<Object, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(U0());
        }
    }

    @Override // o.RU0
    public final boolean isCancelled() {
        Object U0 = U0();
        if (!(U0 instanceof QH)) {
            if (!(U0 instanceof c) || !((c) U0).m()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    @NotNull
    public InterfaceC5809dQ j(@NotNull InterfaceC5809dQ.c<?> cVar) {
        return RU0.a.h(this, cVar);
    }

    public final Object j1(Object obj) {
        Throwable th = null;
        Throwable th2 = null;
        while (true) {
            Object U0 = U0();
            if (U0 instanceof c) {
                synchronized (U0) {
                    if (((c) U0).o()) {
                        return C7055iV0.f();
                    }
                    boolean m = ((c) U0).m();
                    if (obj != null || !m) {
                        if (th2 == null) {
                            th2 = E0(obj);
                        }
                        ((c) U0).b(th2);
                    }
                    Throwable e2 = ((c) U0).e();
                    if (!m) {
                        th = e2;
                    }
                    if (th != null) {
                        o1(((c) U0).a(), th);
                    }
                    return C7055iV0.a();
                }
            } else if (U0 instanceof InterfaceC5563cP0) {
                if (th2 == null) {
                    th2 = E0(obj);
                }
                InterfaceC5563cP0 interfaceC5563cP0 = (InterfaceC5563cP0) U0;
                if (interfaceC5563cP0.h()) {
                    if (J1(interfaceC5563cP0, th2)) {
                        return C7055iV0.a();
                    }
                } else {
                    Object K1 = K1(U0, new QH(th2, false, 2, null));
                    if (K1 != C7055iV0.a()) {
                        if (K1 != C7055iV0.b()) {
                            return K1;
                        }
                    } else {
                        throw new IllegalStateException(("Cannot happen in " + U0).toString());
                    }
                }
            } else {
                return C7055iV0.f();
            }
        }
    }

    public final boolean k1(@Nullable Object obj) {
        Object K1;
        do {
            K1 = K1(U0(), obj);
            if (K1 == C7055iV0.a()) {
                return false;
            }
            if (K1 == C7055iV0.b) {
                return true;
            }
        } while (K1 == C7055iV0.b());
        s0(K1);
        return true;
    }

    @Override // o.RU0
    public final boolean l() {
        return !(U0() instanceof InterfaceC5563cP0);
    }

    @Nullable
    public final Object l1(@Nullable Object obj) {
        Object K1;
        do {
            K1 = K1(U0(), obj);
            if (K1 == C7055iV0.a()) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, L0(obj));
            }
        } while (K1 == C7055iV0.b());
        return K1;
    }

    @Override // o.InterfaceC5809dQ.b, o.InterfaceC5809dQ
    public <R> R m(R r, @NotNull VA0<? super R, ? super InterfaceC5809dQ.b, ? extends R> va0) {
        return (R) RU0.a.d(this, r, va0);
    }

    @NotNull
    public String m1() {
        return NV.a(this);
    }

    public final C5025aC n1(C8906q31 c8906q31) {
        while (c8906q31.u()) {
            c8906q31 = c8906q31.n();
        }
        while (true) {
            c8906q31 = c8906q31.m();
            if (!c8906q31.u()) {
                if (c8906q31 instanceof C5025aC) {
                    return (C5025aC) c8906q31;
                }
                if (c8906q31 instanceof C4256Sq1) {
                    return null;
                }
            }
        }
    }

    public final void o1(C4256Sq1 c4256Sq1, Throwable th) {
        t1(th);
        c4256Sq1.f(4);
        Object l = c4256Sq1.l();
        C6562gT0.n(l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        RH rh = null;
        for (C8906q31 c8906q31 = (C8906q31) l; !C6562gT0.g(c8906q31, c4256Sq1); c8906q31 = c8906q31.m()) {
            if ((c8906q31 instanceof AbstractC6569gV0) && ((AbstractC6569gV0) c8906q31).E()) {
                try {
                    ((AbstractC6569gV0) c8906q31).F(th);
                } catch (Throwable th2) {
                    if (rh != null) {
                        C3917Pf0.a(rh, th2);
                    } else {
                        rh = new RH("Exception in completion handler " + c8906q31 + " for " + this, th2);
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    }
                }
            }
        }
        if (rh != null) {
            a1(rh);
        }
        z0(th);
    }

    public final void p1(C4256Sq1 c4256Sq1, Throwable th) {
        c4256Sq1.f(1);
        Object l = c4256Sq1.l();
        C6562gT0.n(l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        RH rh = null;
        for (C8906q31 c8906q31 = (C8906q31) l; !C6562gT0.g(c8906q31, c4256Sq1); c8906q31 = c8906q31.m()) {
            if (c8906q31 instanceof AbstractC6569gV0) {
                try {
                    ((AbstractC6569gV0) c8906q31).F(th);
                } catch (Throwable th2) {
                    if (rh != null) {
                        C3917Pf0.a(rh, th2);
                    } else {
                        rh = new RH("Exception in completion handler " + c8906q31 + " for " + this, th2);
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    }
                }
            }
        }
        if (rh != null) {
            a1(rh);
        }
    }

    public final void q1(C4256Sq1 c4256Sq1, Throwable th, HA0<? super AbstractC6569gV0, Boolean> ha0) {
        Object l = c4256Sq1.l();
        C6562gT0.n(l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        RH rh = null;
        for (C8906q31 c8906q31 = (C8906q31) l; !C6562gT0.g(c8906q31, c4256Sq1); c8906q31 = c8906q31.m()) {
            if ((c8906q31 instanceof AbstractC6569gV0) && ha0.invoke(c8906q31).booleanValue()) {
                try {
                    ((AbstractC6569gV0) c8906q31).F(th);
                } catch (Throwable th2) {
                    if (rh != null) {
                        C3917Pf0.a(rh, th2);
                    } else {
                        rh = new RH("Exception in completion handler " + c8906q31 + " for " + this, th2);
                        C7458kA2 c7458kA2 = C7458kA2.a;
                    }
                }
            }
        }
        if (rh != null) {
            a1(rh);
        }
    }

    @Override // o.RU0
    @NotNull
    public final B02<RU0> r() {
        return N02.b(new f(null));
    }

    public final void r0(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th2 : list) {
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C3917Pf0.a(th, th2);
                }
            }
        }
    }

    public final Object r1(Object obj, Object obj2) {
        if (!(obj2 instanceof QH)) {
            return obj2;
        }
        throw ((QH) obj2).a;
    }

    public final void s1(InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
        Object U0;
        do {
            U0 = U0();
            if (!(U0 instanceof InterfaceC5563cP0)) {
                if (!(U0 instanceof QH)) {
                    U0 = C7055iV0.h(U0);
                }
                interfaceC6691h02.e(U0);
                return;
            }
        } while (D1(U0) < 0);
        interfaceC6691h02.f(C5829dV0.C(this, false, new d(interfaceC6691h02), 1, null));
    }

    @Override // o.RU0
    public final boolean start() {
        int D1;
        do {
            D1 = D1(U0());
            if (D1 == 0) {
                return false;
            }
        } while (D1 != 1);
        return true;
    }

    @Nullable
    public final Throwable t() {
        Object U0 = U0();
        if (!(U0 instanceof InterfaceC5563cP0)) {
            return L0(U0);
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Nullable
    public final Object t0(@NotNull HM<Object> hm) {
        Object U0;
        do {
            U0 = U0();
            if (!(U0 instanceof InterfaceC5563cP0)) {
                if (!(U0 instanceof QH)) {
                    return C7055iV0.h(U0);
                }
                throw ((QH) U0).a;
            }
        } while (D1(U0) < 0);
        return u0(hm);
    }

    @NotNull
    public String toString() {
        return H1() + C11304zt1.a + NV.b(this);
    }

    @Override // o.RU0
    @NotNull
    public final CancellationException u() {
        Object U0 = U0();
        if (U0 instanceof c) {
            Throwable e2 = ((c) U0).e();
            if (e2 != null) {
                CancellationException F1 = F1(e2, NV.a(this) + " is cancelling");
                if (F1 != null) {
                    return F1;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(U0 instanceof InterfaceC5563cP0)) {
            if (U0 instanceof QH) {
                return G1(this, ((QH) U0).a, null, 1, null);
            }
            return new SU0(NV.a(this) + " has completed normally", null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public final Object u0(HM<Object> hm) {
        a aVar = new a(C7048iT0.e(hm), this);
        aVar.Z();
        C9375ry.a(aVar, C5829dV0.C(this, false, new C6312fU1(aVar), 1, null));
        Object A = aVar.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        return A;
    }

    public final boolean v0(@Nullable Throwable th) {
        return w0(th);
    }

    public final boolean w0(@Nullable Object obj) {
        Object a2 = C7055iV0.a();
        if (Q0() && (a2 = y0(obj)) == C7055iV0.b) {
            return true;
        }
        if (a2 == C7055iV0.a()) {
            a2 = j1(obj);
        }
        if (a2 == C7055iV0.a() || a2 == C7055iV0.b) {
            return true;
        }
        if (a2 == C7055iV0.f()) {
            return false;
        }
        s0(a2);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [o.YO0] */
    public final void w1(C3604Ma0 c3604Ma0) {
        C4256Sq1 c4256Sq1 = new C4256Sq1();
        if (!c3604Ma0.h()) {
            c4256Sq1 = new YO0(c4256Sq1);
        }
        P2.a(X, this, c3604Ma0, c4256Sq1);
    }

    public void x0(@NotNull Throwable th) {
        w0(th);
    }

    public final void x1(AbstractC6569gV0 abstractC6569gV0) {
        abstractC6569gV0.d(new C4256Sq1());
        P2.a(X, this, abstractC6569gV0, abstractC6569gV0.m());
    }

    public final Object y0(Object obj) {
        Object K1;
        do {
            Object U0 = U0();
            if ((U0 instanceof InterfaceC5563cP0) && (!(U0 instanceof c) || !((c) U0).n())) {
                K1 = K1(U0, new QH(E0(obj), false, 2, null));
            } else {
                return C7055iV0.a();
            }
        } while (K1 == C7055iV0.b());
        return K1;
    }

    public final void y1(InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
        if (!g1()) {
            interfaceC6691h02.e(C7458kA2.a);
        } else {
            interfaceC6691h02.f(C5829dV0.C(this, false, new e(interfaceC6691h02), 1, null));
        }
    }

    public final boolean z0(Throwable th) {
        if (f1()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        ZB T0 = T0();
        if (T0 != null && T0 != C4741Xq1.X) {
            if (T0.g(th) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    public final void z1(@NotNull AbstractC6569gV0 abstractC6569gV0) {
        Object U0;
        do {
            U0 = U0();
            if (U0 instanceof AbstractC6569gV0) {
                if (U0 != abstractC6569gV0) {
                    return;
                }
            } else if ((U0 instanceof InterfaceC5563cP0) && ((InterfaceC5563cP0) U0).a() != null) {
                abstractC6569gV0.w();
                return;
            } else {
                return;
            }
        } while (!P2.a(X, this, U0, C7055iV0.c()));
    }

    public static /* synthetic */ void P0() {
    }

    public static /* synthetic */ void R0() {
    }

    public void v1() {
    }

    public void a1(@NotNull Throwable th) {
        throw th;
    }

    public void s0(@Nullable Object obj) {
    }

    public void t1(@Nullable Throwable th) {
    }

    public void u1(@Nullable Object obj) {
    }
}
