package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.InterfaceC6728hA;
import o.InterfaceC9181rA;
import o.PT1;
import o.TD0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 6 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 7 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n+ 8 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 9 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 10 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,3116:1\n270#1,6:3119\n277#1,68:3126\n394#1,18:3217\n241#1:3235\n266#1,10:3236\n277#1,48:3247\n415#1:3295\n331#1,14:3296\n419#1,3:3311\n241#1:3324\n266#1,10:3325\n277#1,68:3336\n241#1:3414\n266#1,10:3415\n277#1,68:3426\n241#1:3498\n266#1,10:3499\n277#1,68:3510\n241#1:3579\n266#1,10:3580\n277#1,68:3591\n906#1,52:3661\n984#1,8:3717\n878#1:3725\n902#1,33:3726\n994#1:3759\n936#1,14:3760\n955#1,3:3775\n999#1,6:3778\n906#1,52:3792\n984#1,8:3848\n878#1:3856\n902#1,33:3857\n994#1:3890\n936#1,14:3891\n955#1,3:3906\n999#1,6:3909\n878#1:3924\n902#1,48:3925\n955#1,3:3974\n878#1:3977\n902#1,48:3978\n955#1,3:4027\n241#1:4039\n266#1,10:4040\n277#1,68:4051\n878#1:4120\n902#1,48:4121\n955#1,3:4170\n1#2:3117\n3099#3:3118\n3099#3:3125\n3099#3:3246\n3099#3:3335\n3099#3:3425\n3099#3:3497\n3099#3:3509\n3099#3:3590\n3099#3:3660\n3099#3:3923\n3099#3:4030\n3099#3:4031\n3113#3:4032\n3113#3:4033\n3112#3:4034\n3112#3:4035\n3112#3:4036\n3113#3:4037\n3112#3:4038\n3099#3:4050\n3100#3:4173\n3099#3:4174\n3099#3:4175\n3099#3:4176\n3100#3:4177\n3099#3:4178\n3100#3:4201\n3099#3:4202\n3099#3:4203\n3100#3:4204\n3099#3:4254\n3100#3:4255\n3100#3:4256\n3100#3:4274\n3100#3:4275\n351#4,9:3194\n360#4,2:3211\n369#4,4:3213\n373#4,8:3314\n351#4,9:3405\n360#4,2:3495\n369#4,4:3713\n373#4,8:3784\n369#4,4:3844\n373#4,8:3915\n206#5:3203\n207#5:3206\n206#5:3207\n207#5:3210\n57#6,2:3204\n57#6,2:3208\n57#6,2:3322\n266#7:3310\n266#7:3404\n266#7:3494\n266#7:3578\n266#7:3659\n266#7:4119\n902#8:3774\n902#8:3905\n902#8:3973\n902#8:4026\n902#8:4169\n33#9,11:4179\n33#9,11:4190\n68#10,3:4205\n42#10,8:4208\n68#10,3:4216\n42#10,8:4219\n42#10,8:4227\n68#10,3:4235\n42#10,8:4238\n42#10,8:4246\n774#11:4257\n865#11,2:4258\n2318#11,14:4260\n774#11:4276\n865#11,2:4277\n2318#11,14:4279\n774#11:4293\n865#11,2:4294\n2318#11,14:4296\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n*L\n110#1:3119,6\n110#1:3126,68\n151#1:3217,18\n151#1:3235\n151#1:3236,10\n151#1:3247,48\n151#1:3295\n151#1:3296,14\n151#1:3311,3\n191#1:3324\n191#1:3325,10\n191#1:3336,68\n222#1:3414\n222#1:3415,10\n222#1:3426,68\n353#1:3498\n353#1:3499,10\n353#1:3510,68\n411#1:3579\n411#1:3580,10\n411#1:3591,68\n687#1:3661,52\n716#1:3717,8\n716#1:3725\n716#1:3726,33\n716#1:3759\n716#1:3760,14\n716#1:3775,3\n716#1:3778,6\n752#1:3792,52\n768#1:3848,8\n768#1:3856\n768#1:3857,33\n768#1:3890\n768#1:3891,14\n768#1:3906,3\n768#1:3909,6\n801#1:3924\n801#1:3925,48\n801#1:3974,3\n991#1:3977\n991#1:3978,48\n991#1:4027,3\n1484#1:4039\n1484#1:4040,10\n1484#1:4051,68\n1532#1:4120\n1532#1:4121,48\n1532#1:4170,3\n67#1:3118\n110#1:3125\n151#1:3246\n191#1:3335\n222#1:3425\n275#1:3497\n353#1:3509\n411#1:3590\n626#1:3660\n791#1:3923\n1027#1:4030\n1076#1:4031\n1394#1:4032\n1396#1:4033\n1426#1:4034\n1436#1:4035\n1445#1:4036\n1446#1:4037\n1453#1:4038\n1484#1:4050\n1898#1:4173\n1900#1:4174\n1902#1:4175\n1915#1:4176\n1926#1:4177\n1927#1:4178\n2229#1:4201\n2242#1:4202\n2252#1:4203\n2255#1:4204\n2572#1:4254\n2574#1:4255\n2599#1:4256\n2661#1:4274\n2662#1:4275\n131#1:3194,9\n131#1:3211,2\n150#1:3213,4\n150#1:3314,8\n218#1:3405,9\n218#1:3495,2\n715#1:3713,4\n715#1:3784,8\n766#1:3844,4\n766#1:3915,8\n135#1:3203\n135#1:3206\n138#1:3207\n138#1:3210\n135#1:3204,2\n138#1:3208,2\n180#1:3322,2\n151#1:3310\n191#1:3404\n222#1:3494\n353#1:3578\n411#1:3659\n1484#1:4119\n716#1:3774\n768#1:3905\n801#1:3973\n991#1:4026\n1532#1:4169\n2131#1:4179,11\n2186#1:4190,11\n2394#1:4205,3\n2394#1:4208,8\n2449#1:4216,3\n2449#1:4219,8\n2468#1:4227,8\n2498#1:4235,3\n2498#1:4238,8\n2559#1:4246,8\n2608#1:4257\n2608#1:4258,2\n2609#1:4260,14\n2673#1:4276\n2673#1:4277,2\n2674#1:4279,14\n2714#1:4293\n2714#1:4294,2\n2715#1:4296,14\n*E\n"})
/* renamed from: o.xq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10804xq<E> implements InterfaceC6728hA<E> {
    public static final /* synthetic */ AtomicLongFieldUpdater Y0 = AtomicLongFieldUpdater.newUpdater(C10804xq.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater Z0 = AtomicLongFieldUpdater.newUpdater(C10804xq.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater a1 = AtomicLongFieldUpdater.newUpdater(C10804xq.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater b1 = AtomicLongFieldUpdater.newUpdater(C10804xq.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c1 = AtomicReferenceFieldUpdater.newUpdater(C10804xq.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater d1 = AtomicReferenceFieldUpdater.newUpdater(C10804xq.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e1 = AtomicReferenceFieldUpdater.newUpdater(C10804xq.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1 = AtomicReferenceFieldUpdater.newUpdater(C10804xq.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g1 = AtomicReferenceFieldUpdater.newUpdater(C10804xq.class, Object.class, "closeHandler$volatile");
    public final int X;
    @InterfaceC7058iW0
    @Nullable
    public final HA0<E, C7458kA2> Y;
    @Nullable
    public final XA0<InterfaceC6691h02<?>, Object, Object, XA0<Throwable, Object, InterfaceC5809dQ, C7458kA2>> Z;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    @InterfaceC8303na2({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n+ 2 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$receiveImpl$1\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n906#2,52:3117\n984#2,8:3173\n878#2:3181\n902#2,33:3182\n994#2:3215\n936#2,14:3216\n955#2,3:3231\n999#2,6:3234\n369#3,4:3169\n373#3,8:3240\n902#4:3230\n57#5,2:3248\n57#5,2:3251\n1#6:3250\n*S KotlinDebug\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator\n*L\n1619#1:3117,52\n1657#1:3173,8\n1657#1:3181\n1657#1:3182,33\n1657#1:3215\n1657#1:3216,14\n1657#1:3231,3\n1657#1:3234,6\n1655#1:3169,4\n1655#1:3240,8\n1657#1:3230\n1693#1:3248,2\n1741#1:3251,2\n*E\n"})
    /* renamed from: o.xq$a */
    /* loaded from: classes3.dex */
    public final class a implements InterfaceC9181rA<E>, InterfaceC9220rJ2 {
        @Nullable
        public Object X = C11047yq.m();
        @Nullable
        public C8883py<? super Boolean> Y;

        public a() {
        }

        @Override // o.InterfaceC9181rA
        @Nullable
        public Object a(@NotNull HM<? super Boolean> hm) {
            C10885yA<E> c10885yA;
            boolean z = true;
            if (this.X == C11047yq.m() || this.X == C11047yq.z()) {
                C10804xq<E> c10804xq = C10804xq.this;
                C10885yA<E> c10885yA2 = (C10885yA) C10804xq.p().get(c10804xq);
                while (!c10804xq.b()) {
                    long andIncrement = C10804xq.q().getAndIncrement(c10804xq);
                    int i = C11047yq.b;
                    long j = andIncrement / i;
                    int i2 = (int) (andIncrement % i);
                    if (c10885yA2.Z != j) {
                        c10885yA = c10804xq.o0(j, c10885yA2);
                        if (c10885yA == null) {
                            continue;
                        }
                    } else {
                        c10885yA = c10885yA2;
                    }
                    Object t2 = c10804xq.t2(c10885yA, i2, andIncrement, null);
                    if (t2 != C11047yq.r()) {
                        if (t2 == C11047yq.h()) {
                            if (andIncrement < c10804xq.R0()) {
                                c10885yA.b();
                            }
                            c10885yA2 = c10885yA;
                        } else if (t2 == C11047yq.s()) {
                            return g(c10885yA, i2, andIncrement, hm);
                        } else {
                            c10885yA.b();
                            this.X = t2;
                            return C10557wp.a(z);
                        }
                    } else {
                        throw new IllegalStateException("unreachable");
                    }
                }
                z = h();
            }
            return C10557wp.a(z);
        }

        @Override // o.InterfaceC9181rA
        @InterfaceC8046mW0(name = "next")
        @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ Object b(HM hm) {
            return InterfaceC9181rA.a.a(this, hm);
        }

        public final Object g(C10885yA<E> c10885yA, int i, long j, HM<? super Boolean> hm) {
            Boolean a;
            C10885yA c10885yA2;
            C10804xq<E> c10804xq = C10804xq.this;
            C8883py b = C9375ry.b(C7048iT0.e(hm));
            try {
                this.Y = b;
            } catch (Throwable th) {
                th = th;
            }
            try {
                Object t2 = c10804xq.t2(c10885yA, i, j, this);
                if (t2 == C11047yq.r()) {
                    c10804xq.B1(this, c10885yA, i);
                } else {
                    XA0 xa0 = null;
                    if (t2 == C11047yq.h()) {
                        if (j < c10804xq.R0()) {
                            c10885yA.b();
                        }
                        C10885yA c10885yA3 = (C10885yA) C10804xq.p().get(c10804xq);
                        while (true) {
                            if (c10804xq.b()) {
                                j();
                                break;
                            }
                            long andIncrement = C10804xq.q().getAndIncrement(c10804xq);
                            int i2 = C11047yq.b;
                            long j2 = andIncrement / i2;
                            int i3 = (int) (andIncrement % i2);
                            if (c10885yA3.Z != j2) {
                                c10885yA2 = c10804xq.o0(j2, c10885yA3);
                                if (c10885yA2 == null) {
                                }
                            } else {
                                c10885yA2 = c10885yA3;
                            }
                            Object t22 = c10804xq.t2(c10885yA2, i3, andIncrement, this);
                            if (t22 == C11047yq.r()) {
                                c10804xq.B1(this, c10885yA2, i3);
                                break;
                            } else if (t22 == C11047yq.h()) {
                                if (andIncrement < c10804xq.R0()) {
                                    c10885yA2.b();
                                }
                                c10885yA3 = c10885yA2;
                            } else if (t22 != C11047yq.s()) {
                                c10885yA2.b();
                                this.X = t22;
                                this.Y = null;
                                a = C10557wp.a(true);
                                HA0<E, C7458kA2> ha0 = c10804xq.Y;
                                if (ha0 != null) {
                                    xa0 = c10804xq.S(ha0, t22);
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        }
                    } else {
                        c10885yA.b();
                        this.X = t2;
                        this.Y = null;
                        a = C10557wp.a(true);
                        HA0<E, C7458kA2> ha02 = c10804xq.Y;
                        if (ha02 != null) {
                            xa0 = c10804xq.S(ha02, t2);
                        }
                    }
                    b.K(a, xa0);
                }
                Object A = b.A();
                if (A == C7289jT0.l()) {
                    MV.c(hm);
                }
                return A;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                b.V();
                throw th3;
            }
        }

        public final boolean h() {
            this.X = C11047yq.z();
            Throwable w0 = C10804xq.this.w0();
            if (w0 == null) {
                return false;
            }
            throw C2718Db2.o(w0);
        }

        @Override // o.InterfaceC9220rJ2
        public void i(@NotNull QZ1<?> qz1, int i) {
            C8883py<? super Boolean> c8883py = this.Y;
            if (c8883py != null) {
                c8883py.i(qz1, i);
            }
        }

        public final void j() {
            C8883py<? super Boolean> c8883py = this.Y;
            C6562gT0.m(c8883py);
            this.Y = null;
            this.X = C11047yq.z();
            Throwable w0 = C10804xq.this.w0();
            if (w0 == null) {
                PT1.a aVar = PT1.Y;
                c8883py.q(PT1.b(Boolean.FALSE));
                return;
            }
            PT1.a aVar2 = PT1.Y;
            c8883py.q(PT1.b(RT1.a(w0)));
        }

        public final boolean k(E e) {
            C8883py<? super Boolean> c8883py = this.Y;
            C6562gT0.m(c8883py);
            XA0 xa0 = null;
            this.Y = null;
            this.X = e;
            Boolean bool = Boolean.TRUE;
            C10804xq<E> c10804xq = C10804xq.this;
            HA0<E, C7458kA2> ha0 = c10804xq.Y;
            if (ha0 != null) {
                xa0 = c10804xq.S(ha0, e);
            }
            return C11047yq.u(c8883py, bool, xa0);
        }

        public final void l() {
            C8883py<? super Boolean> c8883py = this.Y;
            C6562gT0.m(c8883py);
            this.Y = null;
            this.X = C11047yq.z();
            Throwable w0 = C10804xq.this.w0();
            if (w0 == null) {
                PT1.a aVar = PT1.Y;
                c8883py.q(PT1.b(Boolean.FALSE));
                return;
            }
            PT1.a aVar2 = PT1.Y;
            c8883py.q(PT1.b(RT1.a(w0)));
        }

        @Override // o.InterfaceC9181rA
        public E next() {
            E e = (E) this.X;
            if (e != C11047yq.m()) {
                this.X = C11047yq.m();
                if (e != C11047yq.z()) {
                    return e;
                }
                throw C2718Db2.o(C10804xq.this.G0());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
    }

    /* renamed from: o.xq$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC9220rJ2 {
        public final /* synthetic */ C8883py<Boolean> X;
        @NotNull
        public final InterfaceC8396ny<Boolean> Y;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@NotNull InterfaceC8396ny<? super Boolean> interfaceC8396ny) {
            C6562gT0.n(interfaceC8396ny, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.X = (C8883py) interfaceC8396ny;
            this.Y = interfaceC8396ny;
        }

        @NotNull
        public final InterfaceC8396ny<Boolean> a() {
            return this.Y;
        }

        @Override // o.InterfaceC9220rJ2
        public void i(@NotNull QZ1<?> qz1, int i) {
            this.X.i(qz1, i);
        }
    }

    /* renamed from: o.xq$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c extends C7964mB0 implements XA0<Throwable, E, InterfaceC5809dQ, C7458kA2> {
        public c(Object obj) {
            super(3, obj, C10804xq.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ C7458kA2 P(Throwable th, Object obj, InterfaceC5809dQ interfaceC5809dQ) {
            u0(th, obj, interfaceC5809dQ);
            return C7458kA2.a;
        }

        public final void u0(Throwable th, E e, InterfaceC5809dQ interfaceC5809dQ) {
            ((C10804xq) this.Y).p1(th, e, interfaceC5809dQ);
        }
    }

    /* renamed from: o.xq$d */
    /* loaded from: classes3.dex */
    public /* synthetic */ class d extends C7964mB0 implements XA0<Throwable, C10642xA<? extends E>, InterfaceC5809dQ, C7458kA2> {
        public d(Object obj) {
            super(3, obj, C10804xq.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ C7458kA2 P(Throwable th, Object obj, InterfaceC5809dQ interfaceC5809dQ) {
            u0(th, ((C10642xA) obj).o(), interfaceC5809dQ);
            return C7458kA2.a;
        }

        public final void u0(Throwable th, Object obj, InterfaceC5809dQ interfaceC5809dQ) {
            ((C10804xq) this.Y).o1(th, obj, interfaceC5809dQ);
        }
    }

    /* renamed from: o.xq$e */
    /* loaded from: classes3.dex */
    public /* synthetic */ class e extends C7964mB0 implements XA0<C10804xq<?>, InterfaceC6691h02<?>, Object, C7458kA2> {
        public static final e e1 = new e();

        public e() {
            super(3, C10804xq.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ C7458kA2 P(C10804xq<?> c10804xq, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            u0(c10804xq, interfaceC6691h02, obj);
            return C7458kA2.a;
        }

        public final void u0(C10804xq<?> c10804xq, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            c10804xq.O1(interfaceC6691h02, obj);
        }
    }

    /* renamed from: o.xq$f */
    /* loaded from: classes3.dex */
    public /* synthetic */ class f extends C7964mB0 implements XA0<C10804xq<?>, Object, Object, Object> {
        public static final f e1 = new f();

        public f() {
            super(3, C10804xq.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // o.XA0
        /* renamed from: u0 */
        public final Object P(C10804xq<?> c10804xq, Object obj, Object obj2) {
            return c10804xq.D1(obj, obj2);
        }
    }

    /* renamed from: o.xq$g */
    /* loaded from: classes3.dex */
    public /* synthetic */ class g extends C7964mB0 implements XA0<C10804xq<?>, InterfaceC6691h02<?>, Object, C7458kA2> {
        public static final g e1 = new g();

        public g() {
            super(3, C10804xq.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ C7458kA2 P(C10804xq<?> c10804xq, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            u0(c10804xq, interfaceC6691h02, obj);
            return C7458kA2.a;
        }

        public final void u0(C10804xq<?> c10804xq, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            c10804xq.O1(interfaceC6691h02, obj);
        }
    }

    /* renamed from: o.xq$h */
    /* loaded from: classes3.dex */
    public /* synthetic */ class h extends C7964mB0 implements XA0<C10804xq<?>, Object, Object, Object> {
        public static final h e1 = new h();

        public h() {
            super(3, C10804xq.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // o.XA0
        /* renamed from: u0 */
        public final Object P(C10804xq<?> c10804xq, Object obj, Object obj2) {
            return c10804xq.E1(obj, obj2);
        }
    }

    /* renamed from: o.xq$i */
    /* loaded from: classes3.dex */
    public /* synthetic */ class i extends C7964mB0 implements XA0<C10804xq<?>, InterfaceC6691h02<?>, Object, C7458kA2> {
        public static final i e1 = new i();

        public i() {
            super(3, C10804xq.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ C7458kA2 P(C10804xq<?> c10804xq, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            u0(c10804xq, interfaceC6691h02, obj);
            return C7458kA2.a;
        }

        public final void u0(C10804xq<?> c10804xq, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            c10804xq.O1(interfaceC6691h02, obj);
        }
    }

    /* renamed from: o.xq$j */
    /* loaded from: classes3.dex */
    public /* synthetic */ class j extends C7964mB0 implements XA0<C10804xq<?>, Object, Object, Object> {
        public static final j e1 = new j();

        public j() {
            super(3, C10804xq.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // o.XA0
        /* renamed from: u0 */
        public final Object P(C10804xq<?> c10804xq, Object obj, Object obj2) {
            return c10804xq.F1(obj, obj2);
        }
    }

    /* renamed from: o.xq$k */
    /* loaded from: classes3.dex */
    public /* synthetic */ class k extends C7964mB0 implements XA0<C10804xq<?>, InterfaceC6691h02<?>, Object, C7458kA2> {
        public static final k e1 = new k();

        public k() {
            super(3, C10804xq.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ C7458kA2 P(C10804xq<?> c10804xq, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            u0(c10804xq, interfaceC6691h02, obj);
            return C7458kA2.a;
        }

        public final void u0(C10804xq<?> c10804xq, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            c10804xq.P1(interfaceC6691h02, obj);
        }
    }

    /* renamed from: o.xq$l */
    /* loaded from: classes3.dex */
    public /* synthetic */ class l extends C7964mB0 implements XA0<C10804xq<?>, Object, Object, Object> {
        public static final l e1 = new l();

        public l() {
            super(3, C10804xq.class, "processResultSelectSend", "processResultSelectSend(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // o.XA0
        /* renamed from: u0 */
        public final Object P(C10804xq<?> c10804xq, Object obj, Object obj2) {
            return c10804xq.G1(obj, obj2);
        }
    }

    @FV(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {}, l = {759}, m = "receiveCatching-JP2dKIU$suspendImpl", n = {}, s = {})
    /* renamed from: o.xq$m */
    /* loaded from: classes3.dex */
    public static final class m<E> extends KM {
        public /* synthetic */ Object Y0;
        public final /* synthetic */ C10804xq<E> Z0;
        public int a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C10804xq<E> c10804xq, HM<? super m> hm) {
            super(hm);
            this.Z0 = c10804xq;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Y0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            Object I1 = C10804xq.I1(this.Z0, this);
            if (I1 == C7289jT0.l()) {
                return I1;
            }
            return C10642xA.b(I1);
        }
    }

    @FV(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", i = {0, 0, 0, 0}, l = {3117}, m = "receiveCatchingOnNoWaiterSuspend-GKJJFZk", n = {"this", "segment", "index", "r"}, s = {"L$0", "L$1", "I$0", "J$0"})
    /* renamed from: o.xq$n */
    /* loaded from: classes3.dex */
    public static final class n extends KM {
        public Object Y0;
        public Object Z0;
        public int a1;
        public long b1;
        public /* synthetic */ Object c1;
        public final /* synthetic */ C10804xq<E> d1;
        public int e1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C10804xq<E> c10804xq, HM<? super n> hm) {
            super(hm);
            this.d1 = c10804xq;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.c1 = obj;
            this.e1 |= Integer.MIN_VALUE;
            Object J1 = this.d1.J1(null, 0, 0L, this);
            if (J1 == C7289jT0.l()) {
                return J1;
            }
            return C10642xA.b(J1);
        }
    }

    /* renamed from: o.xq$o */
    /* loaded from: classes3.dex */
    public static final class o implements XA0 {
        public static final o X = new o();

        @Override // o.XA0
        public /* bridge */ /* synthetic */ Object P(Object obj, Object obj2, Object obj3) {
            return c((C10885yA) obj, ((Number) obj2).intValue(), ((Number) obj3).longValue());
        }

        public final Void c(C10885yA<E> c10885yA, int i, long j) {
            throw new IllegalStateException("unexpected");
        }
    }

    /* renamed from: o.xq$p */
    /* loaded from: classes3.dex */
    public static final class p implements ZA0 {
        public static final p X = new p();

        public final Void c(C10885yA<E> c10885yA, int i, E e, long j) {
            throw new IllegalStateException("unexpected");
        }

        @Override // o.ZA0
        public /* bridge */ /* synthetic */ Object r(Object obj, Object obj2, Object obj3, Object obj4) {
            return c((C10885yA) obj, ((Number) obj2).intValue(), obj3, ((Number) obj4).longValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10804xq(int i2, @Nullable HA0<? super E, C7458kA2> ha0) {
        this.X = i2;
        this.Y = ha0;
        if (i2 >= 0) {
            this.bufferEnd$volatile = C11047yq.t(i2);
            this.completedExpandBuffersAndPauseFlag$volatile = t0();
            C10885yA c10885yA = new C10885yA(0L, null, this, 3);
            this.sendSegment$volatile = c10885yA;
            this.receiveSegment$volatile = c10885yA;
            if (g1()) {
                c10885yA = C11047yq.n();
                C6562gT0.n(c10885yA, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = c10885yA;
            this.Z = ha0 != 0 ? new XA0() { // from class: o.vq
                @Override // o.XA0
                public final Object P(Object obj, Object obj2, Object obj3) {
                    XA0 z1;
                    z1 = C10804xq.z1(C10804xq.this, (InterfaceC6691h02) obj, obj2, obj3);
                    return z1;
                }
            } : null;
            this._closeCause$volatile = C11047yq.l();
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
    }

    public static final C7458kA2 A1(Object obj, C10804xq c10804xq, InterfaceC6691h02 interfaceC6691h02, Throwable th, Object obj2, InterfaceC5809dQ interfaceC5809dQ) {
        if (obj != C11047yq.z()) {
            C8630ov1.a(c10804xq.Y, obj, interfaceC6691h02.getContext());
        }
        return C7458kA2.a;
    }

    public static /* synthetic */ <E> Object H1(C10804xq<E> c10804xq, HM<? super E> hm) {
        C10885yA<E> c10885yA;
        C10885yA<E> c10885yA2 = (C10885yA) p().get(c10804xq);
        while (!c10804xq.b()) {
            long andIncrement = q().getAndIncrement(c10804xq);
            int i2 = C11047yq.b;
            long j2 = andIncrement / i2;
            int i3 = (int) (andIncrement % i2);
            if (c10885yA2.Z != j2) {
                C10885yA<E> o0 = c10804xq.o0(j2, c10885yA2);
                if (o0 == null) {
                    continue;
                } else {
                    c10885yA = o0;
                }
            } else {
                c10885yA = c10885yA2;
            }
            C10804xq<E> c10804xq2 = c10804xq;
            Object t2 = c10804xq2.t2(c10885yA, i3, andIncrement, null);
            if (t2 != C11047yq.r()) {
                if (t2 == C11047yq.h()) {
                    if (andIncrement < c10804xq2.R0()) {
                        c10885yA.b();
                    }
                    c10804xq = c10804xq2;
                    c10885yA2 = c10885yA;
                } else if (t2 == C11047yq.s()) {
                    return c10804xq2.N1(c10885yA, i3, andIncrement, hm);
                } else {
                    c10885yA.b();
                    return t2;
                }
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        throw C2718Db2.o(c10804xq.G0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <E> Object I1(C10804xq<E> c10804xq, HM<? super C10642xA<? extends E>> hm) {
        m mVar;
        int i2;
        C10885yA<E> c10885yA;
        if (hm instanceof m) {
            mVar = (m) hm;
            int i3 = mVar.a1;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mVar.a1 = i3 - Integer.MIN_VALUE;
                m mVar2 = mVar;
                Object obj = mVar2.Y0;
                Object l2 = C7289jT0.l();
                i2 = mVar2.a1;
                if (i2 == 0) {
                    if (i2 == 1) {
                        RT1.n(obj);
                        return ((C10642xA) obj).o();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RT1.n(obj);
                C10885yA<E> c10885yA2 = (C10885yA) p().get(c10804xq);
                while (!c10804xq.b()) {
                    long andIncrement = q().getAndIncrement(c10804xq);
                    int i4 = C11047yq.b;
                    long j2 = andIncrement / i4;
                    int i5 = (int) (andIncrement % i4);
                    if (c10885yA2.Z != j2) {
                        C10885yA<E> o0 = c10804xq.o0(j2, c10885yA2);
                        if (o0 == null) {
                            continue;
                        } else {
                            c10885yA = o0;
                        }
                    } else {
                        c10885yA = c10885yA2;
                    }
                    C10804xq<E> c10804xq2 = c10804xq;
                    Object t2 = c10804xq2.t2(c10885yA, i5, andIncrement, null);
                    if (t2 != C11047yq.r()) {
                        if (t2 == C11047yq.h()) {
                            if (andIncrement < c10804xq2.R0()) {
                                c10885yA.b();
                            }
                            c10804xq = c10804xq2;
                            c10885yA2 = c10885yA;
                        } else if (t2 == C11047yq.s()) {
                            mVar2.a1 = 1;
                            Object J1 = c10804xq2.J1(c10885yA, i5, andIncrement, mVar2);
                            if (J1 == l2) {
                                return l2;
                            }
                            return J1;
                        } else {
                            c10885yA.b();
                            return C10642xA.b.c(t2);
                        }
                    } else {
                        throw new IllegalStateException("unexpected");
                    }
                }
                return C10642xA.b.a(c10804xq.w0());
            }
        }
        mVar = new m(c10804xq, hm);
        m mVar22 = mVar;
        Object obj2 = mVar22.Y0;
        Object l22 = C7289jT0.l();
        i2 = mVar22.a1;
        if (i2 == 0) {
        }
    }

    public static /* synthetic */ Object L1(C10804xq c10804xq, Object obj, HA0 ha0, XA0 xa0, FA0 fa0, XA0 xa02, int i2, Object obj2) {
        C10885yA c10885yA;
        InterfaceC9220rJ2 interfaceC9220rJ2;
        if (obj2 == null) {
            if ((i2 & 16) != 0) {
                xa02 = o.X;
            }
            C10885yA c10885yA2 = (C10885yA) p().get(c10804xq);
            while (!c10804xq.b()) {
                long andIncrement = q().getAndIncrement(c10804xq);
                int i3 = C11047yq.b;
                long j2 = andIncrement / i3;
                int i4 = (int) (andIncrement % i3);
                if (c10885yA2.Z != j2) {
                    C10885yA o0 = c10804xq.o0(j2, c10885yA2);
                    if (o0 == null) {
                        continue;
                    } else {
                        c10885yA = o0;
                    }
                } else {
                    c10885yA = c10885yA2;
                }
                C10804xq c10804xq2 = c10804xq;
                Object obj3 = obj;
                Object t2 = c10804xq2.t2(c10885yA, i4, andIncrement, obj3);
                c10885yA2 = c10885yA;
                if (t2 == C11047yq.r()) {
                    if (obj3 instanceof InterfaceC9220rJ2) {
                        interfaceC9220rJ2 = (InterfaceC9220rJ2) obj3;
                    } else {
                        interfaceC9220rJ2 = null;
                    }
                    if (interfaceC9220rJ2 != null) {
                        c10804xq2.B1(interfaceC9220rJ2, c10885yA2, i4);
                    }
                    return xa0.P(c10885yA2, Integer.valueOf(i4), Long.valueOf(andIncrement));
                } else if (t2 == C11047yq.h()) {
                    if (andIncrement < c10804xq2.R0()) {
                        c10885yA2.b();
                    }
                    c10804xq = c10804xq2;
                    obj = obj3;
                } else if (t2 == C11047yq.s()) {
                    return xa02.P(c10885yA2, Integer.valueOf(i4), Long.valueOf(andIncrement));
                } else {
                    c10885yA2.b();
                    return ha0.invoke(t2);
                }
            }
            return fa0.invoke();
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
    }

    public static /* synthetic */ <E> Object U1(C10804xq<E> c10804xq, E e2, HM<? super C7458kA2> hm) {
        C10885yA<E> c10885yA;
        C10885yA<E> c10885yA2 = (C10885yA) r().get(c10804xq);
        while (true) {
            long andIncrement = s().getAndIncrement(c10804xq);
            long j2 = andIncrement & C11047yq.G;
            boolean d12 = c10804xq.d1(andIncrement);
            int i2 = C11047yq.b;
            long j3 = j2 / i2;
            int i3 = (int) (j2 % i2);
            if (c10885yA2.Z != j3) {
                C10885yA<E> p0 = c10804xq.p0(j3, c10885yA2);
                if (p0 == null) {
                    if (d12) {
                        Object v1 = c10804xq.v1(e2, hm);
                        if (v1 == C7289jT0.l()) {
                            return v1;
                        }
                    }
                } else {
                    c10885yA = p0;
                }
            } else {
                c10885yA = c10885yA2;
            }
            C10804xq<E> c10804xq2 = c10804xq;
            E e3 = e2;
            int v2 = c10804xq2.v2(c10885yA, i3, e3, j2, null, d12);
            if (v2 != 0) {
                if (v2 == 1) {
                    break;
                } else if (v2 != 2) {
                    if (v2 != 3) {
                        if (v2 != 4) {
                            if (v2 == 5) {
                                c10885yA.b();
                            }
                            c10804xq = c10804xq2;
                            c10885yA2 = c10885yA;
                            e2 = e3;
                        } else {
                            if (j2 < c10804xq2.L0()) {
                                c10885yA.b();
                            }
                            Object v12 = c10804xq2.v1(e3, hm);
                            if (v12 == C7289jT0.l()) {
                                return v12;
                            }
                        }
                    } else {
                        Object a2 = c10804xq2.a2(c10885yA, i3, e3, j2, hm);
                        if (a2 == C7289jT0.l()) {
                            return a2;
                        }
                    }
                } else if (d12) {
                    c10885yA.A();
                    Object v13 = c10804xq2.v1(e3, hm);
                    if (v13 == C7289jT0.l()) {
                        return v13;
                    }
                }
            } else {
                c10885yA.b();
                break;
            }
        }
        return C7458kA2.a;
    }

    public static /* synthetic */ void W0(C10804xq c10804xq, long j2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                j2 = 1;
            }
            c10804xq.V0(j2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
        r13 = o.PT1.Y;
        r0.q(o.PT1.b(o.C10557wp.a(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <E> Object W1(C10804xq<E> c10804xq, E e2, HM<? super Boolean> hm) {
        C10885yA c10885yA;
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        if (c10804xq.Y == null) {
            b bVar = new b(c8883py);
            C10885yA c10885yA2 = (C10885yA) r().get(c10804xq);
            while (true) {
                long andIncrement = s().getAndIncrement(c10804xq);
                long j2 = andIncrement & C11047yq.G;
                boolean d12 = c10804xq.d1(andIncrement);
                int i2 = C11047yq.b;
                long j3 = j2 / i2;
                int i3 = (int) (j2 % i2);
                if (c10885yA2.Z != j3) {
                    c10885yA = c10804xq.p0(j3, c10885yA2);
                    if (c10885yA == null) {
                        if (d12) {
                            break;
                        }
                    }
                } else {
                    c10885yA = c10885yA2;
                }
                E e3 = e2;
                C10804xq<E> c10804xq2 = c10804xq;
                int v2 = c10804xq2.v2(c10885yA, i3, e3, j2, bVar, d12);
                c10885yA2 = c10885yA;
                if (v2 != 0) {
                    if (v2 == 1) {
                        break;
                    } else if (v2 != 2) {
                        if (v2 != 3) {
                            if (v2 != 4) {
                                if (v2 == 5) {
                                    c10885yA2.b();
                                }
                                c10804xq = c10804xq2;
                                e2 = e3;
                            } else if (j2 < c10804xq2.L0()) {
                                c10885yA2.b();
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else if (!d12) {
                        c10804xq2.C1(bVar, c10885yA2, i3);
                    } else {
                        c10885yA2.A();
                    }
                } else {
                    c10885yA2.b();
                    break;
                }
            }
            PT1.a aVar = PT1.Y;
            c8883py.q(PT1.b(C10557wp.a(false)));
            Object A = c8883py.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            return A;
        }
        throw new IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`");
    }

    public static final C7458kA2 X(HA0 ha0, Object obj, Throwable th, Object obj2, InterfaceC5809dQ interfaceC5809dQ) {
        C8630ov1.a(ha0, obj, interfaceC5809dQ);
        return C7458kA2.a;
    }

    public static /* synthetic */ Object Y1(C10804xq c10804xq, Object obj, Object obj2, FA0 fa0, VA0 va0, FA0 fa02, ZA0 za0, int i2, Object obj3) {
        p pVar;
        C10804xq c10804xq2;
        Object obj4;
        Object obj5;
        InterfaceC9220rJ2 interfaceC9220rJ2;
        if (obj3 == null) {
            if ((i2 & 32) != 0) {
                pVar = p.X;
            } else {
                pVar = za0;
            }
            C10885yA c10885yA = (C10885yA) r().get(c10804xq);
            while (true) {
                long andIncrement = s().getAndIncrement(c10804xq);
                long j2 = C11047yq.G & andIncrement;
                boolean d12 = c10804xq.d1(andIncrement);
                int i3 = C11047yq.b;
                long j3 = j2 / i3;
                int i4 = (int) (j2 % i3);
                if (c10885yA.Z != j3) {
                    C10885yA p0 = c10804xq.p0(j3, c10885yA);
                    if (p0 == null) {
                        if (d12) {
                            return fa02.invoke();
                        }
                    } else {
                        c10885yA = p0;
                        c10804xq2 = c10804xq;
                        obj5 = obj2;
                        obj4 = obj;
                    }
                } else {
                    c10804xq2 = c10804xq;
                    obj4 = obj;
                    obj5 = obj2;
                }
                int v2 = c10804xq2.v2(c10885yA, i4, obj4, j2, obj5, d12);
                if (v2 != 0) {
                    if (v2 != 1) {
                        if (v2 != 2) {
                            if (v2 != 3) {
                                if (v2 != 4) {
                                    if (v2 == 5) {
                                        c10885yA.b();
                                    }
                                } else {
                                    if (j2 < c10804xq.L0()) {
                                        c10885yA.b();
                                    }
                                    return fa02.invoke();
                                }
                            } else {
                                return pVar.r(c10885yA, Integer.valueOf(i4), obj, Long.valueOf(j2));
                            }
                        } else if (d12) {
                            c10885yA.A();
                            return fa02.invoke();
                        } else {
                            if (obj2 instanceof InterfaceC9220rJ2) {
                                interfaceC9220rJ2 = (InterfaceC9220rJ2) obj2;
                            } else {
                                interfaceC9220rJ2 = null;
                            }
                            if (interfaceC9220rJ2 != null) {
                                c10804xq.C1(interfaceC9220rJ2, c10885yA, i4);
                            }
                            return va0.i(c10885yA, Integer.valueOf(i4));
                        }
                    } else {
                        return fa0.invoke();
                    }
                } else {
                    c10885yA.b();
                    return fa0.invoke();
                }
            }
        } else {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
    }

    private final /* synthetic */ void i1(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, HA0<Object, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater p() {
        return d1;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater q() {
        return Z0;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater r() {
        return c1;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater s() {
        return Y0;
    }

    public static final XA0 z1(final C10804xq c10804xq, final InterfaceC6691h02 interfaceC6691h02, Object obj, final Object obj2) {
        return new XA0() { // from class: o.uq
            @Override // o.XA0
            public final Object P(Object obj3, Object obj4, Object obj5) {
                C7458kA2 A1;
                A1 = C10804xq.A1(obj2, c10804xq, interfaceC6691h02, (Throwable) obj3, obj4, (InterfaceC5809dQ) obj5);
                return A1;
            }
        };
    }

    @Override // o.InterfaceC10362w02
    @NotNull
    public Object B(E e2) {
        E e3;
        int i2;
        C10885yA c10885yA;
        C10804xq<E> c10804xq;
        InterfaceC9220rJ2 interfaceC9220rJ2;
        if (k2(Y0.get(this))) {
            return C10642xA.b.b();
        }
        C7592kj2 j2 = C11047yq.j();
        C10885yA c10885yA2 = (C10885yA) r().get(this);
        while (true) {
            long andIncrement = s().getAndIncrement(this);
            long j3 = andIncrement & C11047yq.G;
            boolean d12 = d1(andIncrement);
            int i3 = C11047yq.b;
            long j4 = j3 / i3;
            int i4 = (int) (j3 % i3);
            if (c10885yA2.Z != j4) {
                C10885yA p0 = p0(j4, c10885yA2);
                if (p0 == null) {
                    if (d12) {
                        return C10642xA.b.a(M0());
                    }
                } else {
                    i2 = i4;
                    c10885yA = p0;
                    c10804xq = this;
                    e3 = e2;
                }
            } else {
                e3 = e2;
                i2 = i4;
                c10885yA = c10885yA2;
                c10804xq = this;
            }
            int v2 = c10804xq.v2(c10885yA, i2, e3, j3, j2, d12);
            c10885yA2 = c10885yA;
            if (v2 != 0) {
                if (v2 != 1) {
                    if (v2 != 2) {
                        if (v2 != 3) {
                            if (v2 != 4) {
                                if (v2 == 5) {
                                    c10885yA2.b();
                                }
                                e2 = e3;
                            } else {
                                if (j3 < L0()) {
                                    c10885yA2.b();
                                }
                                return C10642xA.b.a(M0());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else if (d12) {
                        c10885yA2.A();
                        return C10642xA.b.a(M0());
                    } else {
                        if (j2 instanceof InterfaceC9220rJ2) {
                            interfaceC9220rJ2 = (InterfaceC9220rJ2) j2;
                        } else {
                            interfaceC9220rJ2 = null;
                        }
                        if (interfaceC9220rJ2 != null) {
                            C1(interfaceC9220rJ2, c10885yA2, i2);
                        }
                        c10885yA2.A();
                        return C10642xA.b.b();
                    }
                } else {
                    return C10642xA.b.c(C7458kA2.a);
                }
            } else {
                c10885yA2.b();
                return C10642xA.b.c(C7458kA2.a);
            }
        }
    }

    public final void B1(InterfaceC9220rJ2 interfaceC9220rJ2, C10885yA<E> c10885yA, int i2) {
        y1();
        interfaceC9220rJ2.i(c10885yA, i2);
    }

    public final void C1(InterfaceC9220rJ2 interfaceC9220rJ2, C10885yA<E> c10885yA, int i2) {
        interfaceC9220rJ2.i(c10885yA, i2 + C11047yq.b);
    }

    @Override // o.OO1
    @Nullable
    public Object D(@NotNull HM<? super C10642xA<? extends E>> hm) {
        return I1(this, hm);
    }

    public final Object D1(Object obj, Object obj2) {
        if (obj2 != C11047yq.z()) {
            return obj2;
        }
        throw G0();
    }

    public final Object E1(Object obj, Object obj2) {
        Object c2;
        if (obj2 == C11047yq.z()) {
            c2 = C10642xA.b.a(w0());
        } else {
            c2 = C10642xA.b.c(obj2);
        }
        return C10642xA.b(c2);
    }

    public final Object F1(Object obj, Object obj2) {
        if (obj2 == C11047yq.z()) {
            if (w0() == null) {
                return null;
            }
            throw G0();
        }
        return obj2;
    }

    public final Throwable G0() {
        Throwable w0 = w0();
        if (w0 == null) {
            return new C7471kE(C11128zA.a);
        }
        return w0;
    }

    public final Object G1(Object obj, Object obj2) {
        if (obj2 != C11047yq.z()) {
            return this;
        }
        throw M0();
    }

    public final /* synthetic */ Object H0() {
        return this.receiveSegment$volatile;
    }

    @Override // o.OO1
    @NotNull
    public InterfaceC5223b02<E> J() {
        e eVar = e.e1;
        C6562gT0.n(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        f fVar = f.e1;
        C6562gT0.n(fVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C5465c02(this, (XA0) C11313zv2.q(eVar, 3), (XA0) C11313zv2.q(fVar, 3), this.Z);
    }

    public final /* synthetic */ long J0() {
        return this.receivers$volatile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J1(C10885yA<E> c10885yA, int i2, long j2, HM<? super C10642xA<? extends E>> hm) {
        n nVar;
        int i3;
        C10642xA b2;
        XA0 xa0;
        C10885yA c10885yA2;
        if (hm instanceof n) {
            nVar = (n) hm;
            int i4 = nVar.e1;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nVar.e1 = i4 - Integer.MIN_VALUE;
                Object obj = nVar.c1;
                Object l2 = C7289jT0.l();
                i3 = nVar.e1;
                if (i3 == 0) {
                    if (i3 == 1) {
                        C10885yA c10885yA3 = (C10885yA) nVar.Z0;
                        C10804xq c10804xq = (C10804xq) nVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    nVar.Y0 = this;
                    nVar.Z0 = c10885yA;
                    nVar.a1 = i2;
                    nVar.b1 = j2;
                    nVar.e1 = 1;
                    C8883py b3 = C9375ry.b(C7048iT0.e(nVar));
                    try {
                        C6562gT0.n(b3, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$38>>");
                        NO1 no1 = new NO1(b3);
                        try {
                            Object t2 = t2(c10885yA, i2, j2, no1);
                            if (t2 == C11047yq.r()) {
                                B1(no1, c10885yA, i2);
                            } else {
                                FW0 fw0 = null;
                                if (t2 == C11047yq.h()) {
                                    if (j2 < R0()) {
                                        c10885yA.b();
                                    }
                                    C10885yA c10885yA4 = (C10885yA) p().get(this);
                                    while (true) {
                                        if (b()) {
                                            r1(b3);
                                            break;
                                        }
                                        long andIncrement = q().getAndIncrement(this);
                                        int i5 = C11047yq.b;
                                        long j3 = andIncrement / i5;
                                        int i6 = (int) (andIncrement % i5);
                                        if (c10885yA4.Z != j3) {
                                            C10885yA o0 = o0(j3, c10885yA4);
                                            if (o0 != null) {
                                                c10885yA2 = o0;
                                            }
                                        } else {
                                            c10885yA2 = c10885yA4;
                                        }
                                        Object t22 = t2(c10885yA2, i6, andIncrement, no1);
                                        C10885yA c10885yA5 = c10885yA2;
                                        if (t22 == C11047yq.r()) {
                                            B1(no1, c10885yA5, i6);
                                            break;
                                        } else if (t22 == C11047yq.h()) {
                                            if (andIncrement < R0()) {
                                                c10885yA5.b();
                                            }
                                            c10885yA4 = c10885yA5;
                                        } else if (t22 != C11047yq.s()) {
                                            c10885yA5.b();
                                            b2 = C10642xA.b(C10642xA.b.c(t22));
                                            HA0<E, C7458kA2> ha0 = this.Y;
                                            if (ha0 != null) {
                                                fw0 = Y(ha0);
                                            }
                                            xa0 = (XA0) fw0;
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                } else {
                                    c10885yA.b();
                                    b2 = C10642xA.b(C10642xA.b.c(t2));
                                    HA0<E, C7458kA2> ha02 = this.Y;
                                    if (ha02 != null) {
                                        fw0 = Y(ha02);
                                    }
                                    xa0 = (XA0) fw0;
                                }
                                b3.K(b2, xa0);
                            }
                            obj = b3.A();
                            if (obj == C7289jT0.l()) {
                                MV.c(nVar);
                            }
                            if (obj == l2) {
                                return l2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            b3.V();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return ((C10642xA) obj).o();
            }
        }
        nVar = new n(this, hm);
        Object obj2 = nVar.c1;
        Object l22 = C7289jT0.l();
        i3 = nVar.e1;
        if (i3 == 0) {
        }
        return ((C10642xA) obj2).o();
    }

    public final <R> R K1(Object obj, HA0<? super E, ? extends R> ha0, XA0<? super C10885yA<E>, ? super Integer, ? super Long, ? extends R> xa0, FA0<? extends R> fa0, XA0<? super C10885yA<E>, ? super Integer, ? super Long, ? extends R> xa02) {
        C10885yA c10885yA;
        InterfaceC9220rJ2 interfaceC9220rJ2;
        C10885yA c10885yA2 = (C10885yA) p().get(this);
        while (!b()) {
            long andIncrement = q().getAndIncrement(this);
            int i2 = C11047yq.b;
            long j2 = andIncrement / i2;
            int i3 = (int) (andIncrement % i2);
            if (c10885yA2.Z != j2) {
                C10885yA o0 = o0(j2, c10885yA2);
                if (o0 == null) {
                    continue;
                } else {
                    c10885yA = o0;
                }
            } else {
                c10885yA = c10885yA2;
            }
            Object obj2 = obj;
            Object obj3 = (Object) t2(c10885yA, i3, andIncrement, obj2);
            c10885yA2 = c10885yA;
            if (obj3 == C11047yq.r()) {
                if (obj2 instanceof InterfaceC9220rJ2) {
                    interfaceC9220rJ2 = (InterfaceC9220rJ2) obj2;
                } else {
                    interfaceC9220rJ2 = null;
                }
                if (interfaceC9220rJ2 != null) {
                    B1(interfaceC9220rJ2, c10885yA2, i3);
                }
                return xa0.P(c10885yA2, Integer.valueOf(i3), Long.valueOf(andIncrement));
            } else if (obj3 == C11047yq.h()) {
                if (andIncrement < R0()) {
                    c10885yA2.b();
                }
                obj = obj2;
            } else if (obj3 == C11047yq.s()) {
                return xa02.P(c10885yA2, Integer.valueOf(i3), Long.valueOf(andIncrement));
            } else {
                c10885yA2.b();
                return ha0.invoke(obj3);
            }
        }
        return fa0.invoke();
    }

    @Override // o.OO1
    @NotNull
    public InterfaceC5223b02<C10642xA<E>> L() {
        g gVar = g.e1;
        C6562gT0.n(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        h hVar = h.e1;
        C6562gT0.n(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C5465c02(this, (XA0) C11313zv2.q(gVar, 3), (XA0) C11313zv2.q(hVar, 3), this.Z);
    }

    public final long L0() {
        return Z0.get(this);
    }

    @NotNull
    public final Throwable M0() {
        Throwable w0 = w0();
        if (w0 == null) {
            return new C7714lE(C11128zA.a);
        }
        return w0;
    }

    public final void M1(C10885yA<E> c10885yA, int i2, long j2, InterfaceC9220rJ2 interfaceC9220rJ2, HA0<? super E, C7458kA2> ha0, FA0<C7458kA2> fa0) {
        C10885yA c10885yA2;
        InterfaceC9220rJ2 interfaceC9220rJ22;
        Object obj = (Object) t2(c10885yA, i2, j2, interfaceC9220rJ2);
        C10804xq<E> c10804xq = this;
        if (obj == C11047yq.r()) {
            B1(interfaceC9220rJ2, c10885yA, i2);
        } else if (obj == C11047yq.h()) {
            if (j2 < R0()) {
                c10885yA.b();
            }
            C10885yA c10885yA3 = (C10885yA) p().get(this);
            while (!b()) {
                long andIncrement = q().getAndIncrement(this);
                int i3 = C11047yq.b;
                long j3 = andIncrement / i3;
                int i4 = (int) (andIncrement % i3);
                if (c10885yA3.Z != j3) {
                    C10885yA o0 = o0(j3, c10885yA3);
                    if (o0 == null) {
                        continue;
                    } else {
                        c10885yA2 = o0;
                    }
                } else {
                    c10885yA2 = c10885yA3;
                }
                C10804xq<E> c10804xq2 = c10804xq;
                Object obj2 = (Object) c10804xq2.t2(c10885yA2, i4, andIncrement, interfaceC9220rJ2);
                c10885yA3 = c10885yA2;
                if (obj2 == C11047yq.r()) {
                    if (interfaceC9220rJ2 != null) {
                        interfaceC9220rJ22 = interfaceC9220rJ2;
                    } else {
                        interfaceC9220rJ22 = null;
                    }
                    if (interfaceC9220rJ22 != null) {
                        B1(interfaceC9220rJ22, c10885yA3, i4);
                    }
                    C7458kA2 c7458kA2 = C7458kA2.a;
                    return;
                } else if (obj2 == C11047yq.h()) {
                    if (andIncrement < R0()) {
                        c10885yA3.b();
                    }
                    c10804xq = c10804xq2;
                } else if (obj2 != C11047yq.s()) {
                    c10885yA3.b();
                    ha0.invoke(obj2);
                    return;
                } else {
                    throw new IllegalStateException("unexpected");
                }
            }
            fa0.invoke();
        } else {
            c10885yA.b();
            ha0.invoke(obj);
        }
    }

    public final /* synthetic */ Object N0() {
        return this.sendSegment$volatile;
    }

    public final Object N1(C10885yA<E> c10885yA, int i2, long j2, HM<? super E> hm) {
        XA0 xa0;
        C10885yA c10885yA2;
        C8883py b2 = C9375ry.b(C7048iT0.e(hm));
        try {
            Object t2 = t2(c10885yA, i2, j2, b2);
            if (t2 == C11047yq.r()) {
                B1(b2, c10885yA, i2);
            } else {
                FW0 fw0 = null;
                FW0 fw02 = null;
                C8883py c8883py = null;
                if (t2 == C11047yq.h()) {
                    if (j2 < R0()) {
                        c10885yA.b();
                    }
                    C10885yA c10885yA3 = (C10885yA) p().get(this);
                    while (true) {
                        if (b()) {
                            s1(b2);
                            break;
                        }
                        long andIncrement = q().getAndIncrement(this);
                        int i3 = C11047yq.b;
                        long j3 = andIncrement / i3;
                        int i4 = (int) (andIncrement % i3);
                        if (c10885yA3.Z != j3) {
                            C10885yA o0 = o0(j3, c10885yA3);
                            if (o0 != null) {
                                c10885yA2 = o0;
                            }
                        } else {
                            c10885yA2 = c10885yA3;
                        }
                        t2 = t2(c10885yA2, i4, andIncrement, b2);
                        C10885yA c10885yA4 = c10885yA2;
                        if (t2 == C11047yq.r()) {
                            if (b2 != null) {
                                c8883py = b2;
                            }
                            if (c8883py != null) {
                                B1(c8883py, c10885yA4, i4);
                            }
                        } else if (t2 == C11047yq.h()) {
                            if (andIncrement < R0()) {
                                c10885yA4.b();
                            }
                            c10885yA3 = c10885yA4;
                        } else if (t2 != C11047yq.s()) {
                            c10885yA4.b();
                            HA0<E, C7458kA2> ha0 = this.Y;
                            if (ha0 != null) {
                                fw02 = T(ha0);
                            }
                            xa0 = (XA0) fw02;
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    }
                } else {
                    c10885yA.b();
                    HA0<E, C7458kA2> ha02 = this.Y;
                    if (ha02 != null) {
                        fw0 = T(ha02);
                    }
                    xa0 = (XA0) fw0;
                }
                b2.K(t2, xa0);
            }
            Object A = b2.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            return A;
        } catch (Throwable th) {
            b2.V();
            throw th;
        }
    }

    public final void O1(InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
        C10885yA c10885yA;
        InterfaceC9220rJ2 interfaceC9220rJ2;
        C10885yA c10885yA2 = (C10885yA) p().get(this);
        while (!b()) {
            long andIncrement = q().getAndIncrement(this);
            int i2 = C11047yq.b;
            long j2 = andIncrement / i2;
            int i3 = (int) (andIncrement % i2);
            if (c10885yA2.Z != j2) {
                C10885yA o0 = o0(j2, c10885yA2);
                if (o0 == null) {
                    continue;
                } else {
                    c10885yA = o0;
                }
            } else {
                c10885yA = c10885yA2;
            }
            InterfaceC6691h02<?> interfaceC6691h022 = interfaceC6691h02;
            Object t2 = t2(c10885yA, i3, andIncrement, interfaceC6691h022);
            c10885yA2 = c10885yA;
            if (t2 == C11047yq.r()) {
                if (interfaceC6691h022 instanceof InterfaceC9220rJ2) {
                    interfaceC9220rJ2 = (InterfaceC9220rJ2) interfaceC6691h022;
                } else {
                    interfaceC9220rJ2 = null;
                }
                if (interfaceC9220rJ2 != null) {
                    B1(interfaceC9220rJ2, c10885yA2, i3);
                    return;
                }
                return;
            } else if (t2 == C11047yq.h()) {
                if (andIncrement < R0()) {
                    c10885yA2.b();
                }
                interfaceC6691h02 = interfaceC6691h022;
            } else if (t2 != C11047yq.s()) {
                c10885yA2.b();
                interfaceC6691h022.e(t2);
                return;
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        t1(interfaceC6691h02);
    }

    public final /* synthetic */ long P0() {
        return this.sendersAndCloseStatus$volatile;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void P1(@NotNull InterfaceC6691h02<?> interfaceC6691h02, @Nullable Object obj) {
        C10885yA c10885yA;
        InterfaceC9220rJ2 interfaceC9220rJ2;
        C10885yA c10885yA2 = (C10885yA) r().get(this);
        while (true) {
            long andIncrement = s().getAndIncrement(this);
            long j2 = andIncrement & C11047yq.G;
            boolean d12 = d1(andIncrement);
            int i2 = C11047yq.b;
            long j3 = j2 / i2;
            int i3 = (int) (j2 % i2);
            if (c10885yA2.Z != j3) {
                C10885yA p0 = p0(j3, c10885yA2);
                if (p0 == null) {
                    if (d12) {
                        u1(obj, interfaceC6691h02);
                        return;
                    }
                } else {
                    c10885yA = p0;
                }
            } else {
                c10885yA = c10885yA2;
            }
            InterfaceC6691h02<?> interfaceC6691h022 = interfaceC6691h02;
            Object obj2 = obj;
            int v2 = v2(c10885yA, i3, obj2, j2, interfaceC6691h022, d12);
            c10885yA2 = c10885yA;
            if (v2 != 0) {
                if (v2 != 1) {
                    if (v2 != 2) {
                        if (v2 != 3) {
                            if (v2 != 4) {
                                if (v2 == 5) {
                                    c10885yA2.b();
                                }
                                obj = obj2;
                                interfaceC6691h02 = interfaceC6691h022;
                            } else {
                                if (j2 < L0()) {
                                    c10885yA2.b();
                                }
                                u1(obj2, interfaceC6691h022);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else if (d12) {
                        c10885yA2.A();
                        u1(obj2, interfaceC6691h022);
                        return;
                    } else {
                        if (interfaceC6691h022 instanceof InterfaceC9220rJ2) {
                            interfaceC9220rJ2 = (InterfaceC9220rJ2) interfaceC6691h022;
                        } else {
                            interfaceC9220rJ2 = null;
                        }
                        if (interfaceC9220rJ2 != null) {
                            C1(interfaceC9220rJ2, c10885yA2, i3);
                            return;
                        }
                        return;
                    }
                } else {
                    interfaceC6691h022.e(C7458kA2.a);
                    return;
                }
            } else {
                c10885yA2.b();
                interfaceC6691h022.e(C7458kA2.a);
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
        r12 = (o.C10885yA) r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q1(C10885yA<E> c10885yA) {
        InterfaceC9220rJ2 interfaceC9220rJ2;
        HA0<E, C7458kA2> ha0 = this.Y;
        Iz2 iz2 = null;
        Object c2 = TP0.c(null, 1, null);
        loop0: do {
            int i2 = C11047yq.b - 1;
            while (true) {
                if (-1 >= i2) {
                    break;
                }
                long j2 = (c10885yA.Z * C11047yq.b) + i2;
                while (true) {
                    Object J = c10885yA.J(i2);
                    if (J == C11047yq.f()) {
                        break loop0;
                    } else if (J == C11047yq.f) {
                        if (j2 < L0()) {
                            break loop0;
                        } else if (c10885yA.D(i2, J, C11047yq.z())) {
                            if (ha0 != null) {
                                iz2 = C8630ov1.b(ha0, c10885yA.I(i2), iz2);
                            }
                            c10885yA.E(i2);
                            c10885yA.A();
                        }
                    } else if (J != C11047yq.k() && J != null) {
                        if (!(J instanceof InterfaceC9220rJ2) && !(J instanceof C9463sJ2)) {
                            if (J == C11047yq.p() || J == C11047yq.q()) {
                                break loop0;
                            } else if (J != C11047yq.p()) {
                                break;
                            }
                        } else if (j2 < L0()) {
                            break loop0;
                        } else {
                            if (J instanceof C9463sJ2) {
                                interfaceC9220rJ2 = ((C9463sJ2) J).a;
                            } else {
                                interfaceC9220rJ2 = (InterfaceC9220rJ2) J;
                            }
                            if (c10885yA.D(i2, J, C11047yq.z())) {
                                if (ha0 != null) {
                                    iz2 = C8630ov1.b(ha0, c10885yA.I(i2), iz2);
                                }
                                c2 = TP0.h(c2, interfaceC9220rJ2);
                                c10885yA.E(i2);
                                c10885yA.A();
                            }
                        }
                    } else if (c10885yA.D(i2, J, C11047yq.z())) {
                        c10885yA.A();
                        break;
                    }
                }
                i2--;
            }
        } while (c10885yA != null);
        if (c2 != null) {
            if (!(c2 instanceof ArrayList)) {
                S1((InterfaceC9220rJ2) c2);
            } else {
                C6562gT0.n(c2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                ArrayList arrayList = (ArrayList) c2;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    S1((InterfaceC9220rJ2) arrayList.get(size));
                }
            }
        }
        if (iz2 == null) {
            return;
        }
        throw iz2;
    }

    @Override // o.OO1
    @NotNull
    public InterfaceC5223b02<E> R() {
        i iVar = i.e1;
        C6562gT0.n(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        j jVar = j.e1;
        C6562gT0.n(jVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C5465c02(this, (XA0) C11313zv2.q(iVar, 3), (XA0) C11313zv2.q(jVar, 3), this.Z);
    }

    public final long R0() {
        return Y0.get(this) & C11047yq.G;
    }

    public final void R1(InterfaceC9220rJ2 interfaceC9220rJ2) {
        T1(interfaceC9220rJ2, true);
    }

    public final XA0<Throwable, Object, InterfaceC5809dQ, C7458kA2> S(final HA0<? super E, C7458kA2> ha0, final E e2) {
        return new XA0() { // from class: o.wq
            @Override // o.XA0
            public final Object P(Object obj, Object obj2, Object obj3) {
                C7458kA2 X;
                X = C10804xq.X(HA0.this, e2, (Throwable) obj, obj2, (InterfaceC5809dQ) obj3);
                return X;
            }
        };
    }

    public final /* synthetic */ Object S0() {
        return this._closeCause$volatile;
    }

    public final void S1(InterfaceC9220rJ2 interfaceC9220rJ2) {
        T1(interfaceC9220rJ2, false);
    }

    public final FW0<C7458kA2> T(HA0<? super E, C7458kA2> ha0) {
        return new c(this);
    }

    public final void T1(InterfaceC9220rJ2 interfaceC9220rJ2, boolean z) {
        Throwable M0;
        if (interfaceC9220rJ2 instanceof b) {
            InterfaceC8396ny<Boolean> a2 = ((b) interfaceC9220rJ2).a();
            PT1.a aVar = PT1.Y;
            a2.q(PT1.b(Boolean.FALSE));
        } else if (interfaceC9220rJ2 instanceof InterfaceC8396ny) {
            HM hm = (HM) interfaceC9220rJ2;
            PT1.a aVar2 = PT1.Y;
            if (z) {
                M0 = G0();
            } else {
                M0 = M0();
            }
            hm.q(PT1.b(RT1.a(M0)));
        } else if (interfaceC9220rJ2 instanceof NO1) {
            C8883py<C10642xA<? extends E>> c8883py = ((NO1) interfaceC9220rJ2).X;
            PT1.a aVar3 = PT1.Y;
            c8883py.q(PT1.b(C10642xA.b(C10642xA.b.a(w0()))));
        } else if (interfaceC9220rJ2 instanceof a) {
            ((a) interfaceC9220rJ2).l();
        } else if (interfaceC9220rJ2 instanceof InterfaceC6691h02) {
            ((InterfaceC6691h02) interfaceC9220rJ2).h(this, C11047yq.z());
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC9220rJ2).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.OO1
    @NotNull
    public Object U() {
        C10885yA c10885yA;
        InterfaceC9220rJ2 interfaceC9220rJ2;
        long j2 = Z0.get(this);
        long j3 = Y0.get(this);
        if (b1(j3)) {
            return C10642xA.b.a(w0());
        }
        if (j2 >= (j3 & C11047yq.G)) {
            return C10642xA.b.b();
        }
        C7592kj2 i2 = C11047yq.i();
        C10885yA c10885yA2 = (C10885yA) p().get(this);
        while (!b()) {
            long andIncrement = q().getAndIncrement(this);
            int i3 = C11047yq.b;
            long j4 = andIncrement / i3;
            int i4 = (int) (andIncrement % i3);
            if (c10885yA2.Z != j4) {
                c10885yA = o0(j4, c10885yA2);
                if (c10885yA == null) {
                    continue;
                }
            } else {
                c10885yA = c10885yA2;
            }
            Object t2 = t2(c10885yA, i4, andIncrement, i2);
            if (t2 == C11047yq.r()) {
                if (i2 instanceof InterfaceC9220rJ2) {
                    interfaceC9220rJ2 = (InterfaceC9220rJ2) i2;
                } else {
                    interfaceC9220rJ2 = null;
                }
                if (interfaceC9220rJ2 != null) {
                    B1(interfaceC9220rJ2, c10885yA, i4);
                }
                z2(andIncrement);
                c10885yA.A();
                return C10642xA.b.b();
            } else if (t2 == C11047yq.h()) {
                if (andIncrement < R0()) {
                    c10885yA.b();
                }
                c10885yA2 = c10885yA;
            } else if (t2 != C11047yq.s()) {
                c10885yA.b();
                return C10642xA.b.c(t2);
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        return C10642xA.b.a(w0());
    }

    public final boolean U0() {
        while (true) {
            C10885yA<E> c10885yA = (C10885yA) d1.get(this);
            long L0 = L0();
            if (R0() <= L0) {
                return false;
            }
            int i2 = C11047yq.b;
            long j2 = L0 / i2;
            if (c10885yA.Z != j2 && (c10885yA = o0(j2, c10885yA)) == null) {
                if (((C10885yA) d1.get(this)).Z < j2) {
                    return false;
                }
            } else {
                c10885yA.b();
                if (Y0(c10885yA, (int) (L0 % i2), L0)) {
                    return true;
                }
                Z0.compareAndSet(this, L0, 1 + L0);
            }
        }
    }

    @Override // o.OO1
    @R61
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @IR1(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public Object V(@NotNull HM<? super E> hm) {
        return InterfaceC6728hA.a.e(this, hm);
    }

    public final void V0(long j2) {
        if ((b1.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            do {
            } while ((b1.get(this) & 4611686018427387904L) != 0);
        }
    }

    @Nullable
    public Object V1(E e2, @NotNull HM<? super Boolean> hm) {
        return W1(this, e2, hm);
    }

    @Override // o.InterfaceC10362w02
    public boolean W(@Nullable Throwable th) {
        return f0(th, false);
    }

    public final void X0() {
        Object obj;
        C7592kj2 e2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                e2 = C11047yq.d();
            } else {
                e2 = C11047yq.e();
            }
        } while (!P2.a(atomicReferenceFieldUpdater, this, obj, e2));
        if (obj == null) {
            return;
        }
        HA0 ha0 = (HA0) C11313zv2.q(obj, 1);
        ((HA0) obj).invoke(w0());
    }

    public final <R> R X1(E e2, Object obj, FA0<? extends R> fa0, VA0<? super C10885yA<E>, ? super Integer, ? extends R> va0, FA0<? extends R> fa02, ZA0<? super C10885yA<E>, ? super Integer, ? super E, ? super Long, ? extends R> za0) {
        C10804xq<E> c10804xq;
        E e3;
        Object obj2;
        InterfaceC9220rJ2 interfaceC9220rJ2;
        C10885yA c10885yA = (C10885yA) r().get(this);
        while (true) {
            long andIncrement = s().getAndIncrement(this);
            long j2 = C11047yq.G & andIncrement;
            boolean d12 = d1(andIncrement);
            int i2 = C11047yq.b;
            long j3 = j2 / i2;
            int i3 = (int) (j2 % i2);
            if (c10885yA.Z != j3) {
                C10885yA p0 = p0(j3, c10885yA);
                if (p0 == null) {
                    if (d12) {
                        return fa02.invoke();
                    }
                } else {
                    c10885yA = p0;
                    c10804xq = this;
                    obj2 = obj;
                    e3 = e2;
                }
            } else {
                c10804xq = this;
                e3 = e2;
                obj2 = obj;
            }
            int v2 = c10804xq.v2(c10885yA, i3, e3, j2, obj2, d12);
            if (v2 != 0) {
                if (v2 != 1) {
                    if (v2 != 2) {
                        if (v2 != 3) {
                            if (v2 != 4) {
                                if (v2 == 5) {
                                    c10885yA.b();
                                }
                            } else {
                                if (j2 < L0()) {
                                    c10885yA.b();
                                }
                                return fa02.invoke();
                            }
                        } else {
                            return za0.r(c10885yA, Integer.valueOf(i3), e2, Long.valueOf(j2));
                        }
                    } else if (d12) {
                        c10885yA.A();
                        return fa02.invoke();
                    } else {
                        if (obj instanceof InterfaceC9220rJ2) {
                            interfaceC9220rJ2 = (InterfaceC9220rJ2) obj;
                        } else {
                            interfaceC9220rJ2 = null;
                        }
                        if (interfaceC9220rJ2 != null) {
                            C1(interfaceC9220rJ2, c10885yA, i3);
                        }
                        return va0.i(c10885yA, Integer.valueOf(i3));
                    }
                } else {
                    return fa0.invoke();
                }
            } else {
                c10885yA.b();
                return fa0.invoke();
            }
        }
    }

    public final FW0<C7458kA2> Y(HA0<? super E, C7458kA2> ha0) {
        return new d(this);
    }

    public final boolean Y0(C10885yA<E> c10885yA, int i2, long j2) {
        Object J;
        do {
            J = c10885yA.J(i2);
            if (J != null && J != C11047yq.k()) {
                if (J == C11047yq.f) {
                    return true;
                }
                if (J == C11047yq.j() || J == C11047yq.z() || J == C11047yq.f() || J == C11047yq.o()) {
                    return false;
                }
                if (J == C11047yq.p()) {
                    return true;
                }
                if (J == C11047yq.q() || j2 != L0()) {
                    return false;
                }
                return true;
            }
        } while (!c10885yA.D(i2, J, C11047yq.o()));
        m0();
        return false;
    }

    public final boolean Z(long j2) {
        if (j2 >= t0() && j2 >= L0() + this.X) {
            return false;
        }
        return true;
    }

    public final boolean Z0(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                i0(j2 & C11047yq.G);
                return true;
            }
            throw new IllegalStateException(("unexpected close status: " + i2).toString());
        }
        j0(j2 & C11047yq.G);
        if (z && U0()) {
            return false;
        }
        return true;
    }

    public final void Z1(C10885yA<E> c10885yA, int i2, E e2, long j2, InterfaceC9220rJ2 interfaceC9220rJ2, FA0<C7458kA2> fa0, FA0<C7458kA2> fa02) {
        C10804xq<E> c10804xq;
        E e3;
        InterfaceC9220rJ2 interfaceC9220rJ22;
        C7458kA2 c7458kA2;
        InterfaceC9220rJ2 interfaceC9220rJ23;
        int v2 = v2(c10885yA, i2, e2, j2, interfaceC9220rJ2, false);
        if (v2 != 0) {
            if (v2 != 1) {
                if (v2 == 2) {
                    C1(interfaceC9220rJ2, c10885yA, i2);
                    return;
                } else if (v2 != 4) {
                    String str = "unexpected";
                    if (v2 == 5) {
                        c10885yA.b();
                        C10885yA c10885yA2 = (C10885yA) r().get(this);
                        while (true) {
                            long andIncrement = s().getAndIncrement(this);
                            long j3 = C11047yq.G & andIncrement;
                            boolean d12 = d1(andIncrement);
                            int i3 = C11047yq.b;
                            long j4 = j3 / i3;
                            int i4 = (int) (j3 % i3);
                            String str2 = str;
                            if (c10885yA2.Z != j4) {
                                C10885yA p0 = p0(j4, c10885yA2);
                                if (p0 == null) {
                                    if (d12) {
                                        c7458kA2 = fa02.invoke();
                                        break;
                                    }
                                    str = str2;
                                } else {
                                    c10885yA2 = p0;
                                    c10804xq = this;
                                    interfaceC9220rJ22 = interfaceC9220rJ2;
                                    e3 = e2;
                                }
                            } else {
                                c10804xq = this;
                                e3 = e2;
                                interfaceC9220rJ22 = interfaceC9220rJ2;
                            }
                            int v22 = c10804xq.v2(c10885yA2, i4, e3, j3, interfaceC9220rJ22, d12);
                            if (v22 != 0) {
                                if (v22 != 1) {
                                    if (v22 != 2) {
                                        if (v22 != 3) {
                                            if (v22 != 4) {
                                                if (v22 == 5) {
                                                    c10885yA2.b();
                                                }
                                                str = str2;
                                            } else {
                                                if (j3 < L0()) {
                                                    c10885yA2.b();
                                                }
                                                c7458kA2 = fa02.invoke();
                                            }
                                        } else {
                                            throw new IllegalStateException(str2);
                                        }
                                    } else if (d12) {
                                        c10885yA2.A();
                                        c7458kA2 = fa02.invoke();
                                    } else {
                                        if (interfaceC9220rJ22 != null) {
                                            interfaceC9220rJ23 = interfaceC9220rJ22;
                                        } else {
                                            interfaceC9220rJ23 = null;
                                        }
                                        if (interfaceC9220rJ23 != null) {
                                            C1(interfaceC9220rJ23, c10885yA2, i4);
                                        }
                                        c7458kA2 = C7458kA2.a;
                                    }
                                } else {
                                    c7458kA2 = fa0.invoke();
                                    break;
                                }
                            } else {
                                c10885yA2.b();
                                c7458kA2 = fa0.invoke();
                                break;
                            }
                        }
                        return;
                    }
                    throw new IllegalStateException("unexpected");
                } else {
                    if (j2 < L0()) {
                        c10885yA.b();
                    }
                    fa02.invoke();
                    return;
                }
            }
            fa0.invoke();
            return;
        }
        c10885yA.b();
        fa0.invoke();
    }

    public boolean a0(@Nullable Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return f0(th, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a2(C10885yA<E> c10885yA, int i2, E e2, long j2, HM<? super C7458kA2> hm) {
        Object b2;
        Object A;
        C10885yA c10885yA2;
        C8883py c8883py;
        C8883py b3 = C9375ry.b(C7048iT0.e(hm));
        try {
            int v2 = v2(c10885yA, i2, e2, j2, b3, false);
            if (v2 != 0) {
                if (v2 != 1) {
                    if (v2 == 2) {
                        C1(b3, c10885yA, i2);
                    } else {
                        if (v2 != 4) {
                            String str = "unexpected";
                            if (v2 == 5) {
                                c10885yA.b();
                                C10885yA c10885yA3 = (C10885yA) r().get(this);
                                while (true) {
                                    long andIncrement = s().getAndIncrement(this);
                                    long j3 = C11047yq.G & andIncrement;
                                    boolean d12 = d1(andIncrement);
                                    int i3 = C11047yq.b;
                                    long j4 = j3 / i3;
                                    int i4 = (int) (j3 % i3);
                                    String str2 = str;
                                    if (c10885yA3.Z != j4) {
                                        c10885yA2 = p0(j4, c10885yA3);
                                        if (c10885yA2 == null) {
                                            if (d12) {
                                                break;
                                            }
                                            str = str2;
                                        }
                                    } else {
                                        c10885yA2 = c10885yA3;
                                    }
                                    int v22 = v2(c10885yA2, i4, e2, j3, b3, d12);
                                    if (v22 != 0) {
                                        if (v22 != 1) {
                                            if (v22 != 2) {
                                                if (v22 != 3) {
                                                    if (v22 != 4) {
                                                        if (v22 == 5) {
                                                            c10885yA2.b();
                                                        }
                                                        str = str2;
                                                        c10885yA3 = c10885yA2;
                                                    } else if (j3 < L0()) {
                                                        c10885yA2.b();
                                                    }
                                                } else {
                                                    throw new IllegalStateException(str2);
                                                }
                                            } else if (d12) {
                                                c10885yA2.A();
                                            } else {
                                                if (b3 != null) {
                                                    c8883py = b3;
                                                } else {
                                                    c8883py = null;
                                                }
                                                if (c8883py != null) {
                                                    C1(c8883py, c10885yA2, i4);
                                                }
                                            }
                                        } else {
                                            PT1.a aVar = PT1.Y;
                                            b2 = PT1.b(C7458kA2.a);
                                            break;
                                        }
                                    } else {
                                        c10885yA2.b();
                                        PT1.a aVar2 = PT1.Y;
                                        b2 = PT1.b(C7458kA2.a);
                                        break;
                                    }
                                }
                            } else {
                                throw new IllegalStateException("unexpected");
                            }
                        } else if (j2 < L0()) {
                            c10885yA.b();
                        }
                        w1(e2, b3);
                    }
                    A = b3.A();
                    if (A == C7289jT0.l()) {
                        MV.c(hm);
                    }
                    if (A != C7289jT0.l()) {
                        return A;
                    }
                    return C7458kA2.a;
                }
                PT1.a aVar3 = PT1.Y;
                b2 = PT1.b(C7458kA2.a);
            } else {
                c10885yA.b();
                PT1.a aVar4 = PT1.Y;
                b2 = PT1.b(C7458kA2.a);
            }
            b3.q(b2);
            A = b3.A();
            if (A == C7289jT0.l()) {
            }
            if (A != C7289jT0.l()) {
            }
        } catch (Throwable th) {
            b3.V();
            throw th;
        }
    }

    @Override // o.OO1
    public boolean b() {
        return b1(Y0.get(this));
    }

    public final void b0(C10885yA<E> c10885yA, long j2) {
        Object c2 = TP0.c(null, 1, null);
        loop0: while (c10885yA != null) {
            for (int i2 = C11047yq.b - 1; -1 < i2; i2--) {
                if ((c10885yA.Z * C11047yq.b) + i2 < j2) {
                    break loop0;
                }
                while (true) {
                    Object J = c10885yA.J(i2);
                    if (J != null && J != C11047yq.k()) {
                        if (J instanceof C9463sJ2) {
                            if (c10885yA.D(i2, J, C11047yq.z())) {
                                c2 = TP0.h(c2, ((C9463sJ2) J).a);
                                c10885yA.K(i2, true);
                                break;
                            }
                        } else if (!(J instanceof InterfaceC9220rJ2)) {
                            break;
                        } else if (c10885yA.D(i2, J, C11047yq.z())) {
                            c2 = TP0.h(c2, J);
                            c10885yA.K(i2, true);
                            break;
                        }
                    } else if (c10885yA.D(i2, J, C11047yq.z())) {
                        c10885yA.A();
                        break;
                    }
                }
            }
            c10885yA = (C10885yA) c10885yA.h();
        }
        if (c2 != null) {
            if (!(c2 instanceof ArrayList)) {
                R1((InterfaceC9220rJ2) c2);
                return;
            }
            C6562gT0.n(c2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) c2;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                R1((InterfaceC9220rJ2) arrayList.get(size));
            }
        }
    }

    public final boolean b1(long j2) {
        return Z0(j2, true);
    }

    public final /* synthetic */ void b2(long j2) {
        this.bufferEnd$volatile = j2;
    }

    @Override // o.InterfaceC10362w02
    public void c(@NotNull HA0<? super Throwable, C7458kA2> ha0) {
        if (!P2.a(g1, this, null, ha0)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1;
            do {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != C11047yq.d()) {
                    if (obj == C11047yq.e()) {
                        throw new IllegalStateException("Another handler was already registered and successfully invoked");
                    }
                    throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
            } while (!P2.a(g1, this, C11047yq.d(), C11047yq.e()));
            ha0.invoke(w0());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd A[LOOP:2: B:30:0x00cd->B:81:0x01da, LOOP_START, PHI: r1 
      PHI: (r1v15 o.yA) = (r1v12 o.yA), (r1v17 o.yA) binds: [B:29:0x00cb, B:81:0x01da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        C10885yA c10885yA;
        if (g1()) {
            if (e1.get(this) != C11047yq.n()) {
                throw new IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((C10885yA) d1.get(this)).Z > ((C10885yA) e1.get(this)).Z) {
            throw new IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        C10885yA[] c10885yAArr = {d1.get(this), c1.get(this), e1.get(this)};
        ArrayList arrayList = new ArrayList();
        for (Object obj : C8222nF.O(c10885yAArr)) {
            if (((C10885yA) obj) != C11047yq.n()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j2 = ((C10885yA) next).Z;
                do {
                    Object next2 = it.next();
                    long j3 = ((C10885yA) next2).Z;
                    if (j2 > j3) {
                        next = next2;
                        j2 = j3;
                    }
                } while (it.hasNext());
                c10885yA = (C10885yA) next;
                if (c10885yA.h() != 0) {
                }
            } else {
                c10885yA = (C10885yA) next;
                if (c10885yA.h() != 0) {
                    while (c10885yA.f() != 0) {
                        S f2 = c10885yA.f();
                        C6562gT0.m(f2);
                        if (((C10885yA) f2).h() != 0) {
                            S f3 = c10885yA.f();
                            C6562gT0.m(f3);
                            if (((C10885yA) f3).h() != c10885yA) {
                                throw new IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                            }
                        }
                        int i2 = C11047yq.b;
                        int i3 = 0;
                        for (int i4 = 0; i4 < i2; i4++) {
                            Object J = c10885yA.J(i4);
                            if (!C6562gT0.g(J, C11047yq.f) && !(J instanceof InterfaceC9220rJ2)) {
                                if (!C6562gT0.g(J, C11047yq.i()) && !C6562gT0.g(J, C11047yq.j()) && !C6562gT0.g(J, C11047yq.z())) {
                                    if (!C6562gT0.g(J, C11047yq.o()) && !C6562gT0.g(J, C11047yq.f())) {
                                        throw new IllegalStateException(("Unexpected segment cell state: " + J + ".\nChannel state: " + this).toString());
                                    } else if (c10885yA.I(i4) != null) {
                                        throw new IllegalStateException("Check failed.");
                                    }
                                } else if (c10885yA.I(i4) == null) {
                                    i3++;
                                } else {
                                    throw new IllegalStateException("Check failed.");
                                }
                            }
                        }
                        if (i3 == C11047yq.b && c10885yA != d1.get(this) && c10885yA != c1.get(this) && c10885yA != e1.get(this)) {
                            throw new IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
                        }
                        S f4 = c10885yA.f();
                        C6562gT0.m(f4);
                        c10885yA = (C10885yA) f4;
                    }
                    return;
                }
                throw new IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public final /* synthetic */ void c2(Object obj) {
        this.bufferEndSegment$volatile = obj;
    }

    @Override // o.OO1
    public final void cancel() {
        a0(null);
    }

    @Override // o.OO1
    public final boolean d(@Nullable Throwable th) {
        return a0(th);
    }

    @Override // o.InterfaceC10362w02
    @Nullable
    public Object d0(E e2, @NotNull HM<? super C7458kA2> hm) {
        return U1(this, e2, hm);
    }

    public final boolean d1(long j2) {
        return Z0(j2, false);
    }

    public final /* synthetic */ void d2(Object obj) {
        this.closeHandler$volatile = obj;
    }

    @Override // o.InterfaceC10362w02
    @NotNull
    public InterfaceC5708d02<E, C10804xq<E>> e() {
        k kVar = k.e1;
        C6562gT0.n(kVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        l lVar = l.e1;
        C6562gT0.n(lVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C5950e02(this, (XA0) C11313zv2.q(kVar, 3), (XA0) C11313zv2.q(lVar, 3), null, 8, null);
    }

    public final C10885yA<E> e0() {
        C10885yA c10885yA = e1.get(this);
        C10885yA c10885yA2 = (C10885yA) c1.get(this);
        if (c10885yA2.Z > ((C10885yA) c10885yA).Z) {
            c10885yA = c10885yA2;
        }
        C10885yA c10885yA3 = (C10885yA) d1.get(this);
        if (c10885yA3.Z > ((C10885yA) c10885yA).Z) {
            c10885yA = c10885yA3;
        }
        return (C10885yA) C9703tJ.d((AbstractC9946uJ) c10885yA);
    }

    public boolean e1() {
        return false;
    }

    public final /* synthetic */ void e2(long j2) {
        this.completedExpandBuffersAndPauseFlag$volatile = j2;
    }

    public boolean f0(@Nullable Throwable th, boolean z) {
        if (z) {
            k1();
        }
        boolean a2 = P2.a(f1, this, C11047yq.l(), th);
        if (z) {
            l1();
        } else {
            m1();
        }
        k0();
        q1();
        if (a2) {
            X0();
        }
        return a2;
    }

    public final /* synthetic */ void f2(Object obj) {
        this.receiveSegment$volatile = obj;
    }

    @Override // o.OO1
    @Nullable
    public Object g0(@NotNull HM<? super E> hm) {
        return H1(this, hm);
    }

    public final boolean g1() {
        long t0 = t0();
        if (t0 != 0 && t0 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void g2(long j2) {
        this.receivers$volatile = j2;
    }

    @Override // o.InterfaceC10362w02
    public boolean h0() {
        return d1(Y0.get(this));
    }

    public final /* synthetic */ void h1(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, HA0<? super Long, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ void h2(Object obj) {
        this.sendSegment$volatile = obj;
    }

    @Override // o.OO1
    public final void i(@Nullable CancellationException cancellationException) {
        a0(cancellationException);
    }

    public final void i0(long j2) {
        Q1(j0(j2));
    }

    public final /* synthetic */ void i2(long j2) {
        this.sendersAndCloseStatus$volatile = j2;
    }

    @Override // o.OO1
    public boolean isEmpty() {
        if (b() || U0()) {
            return false;
        }
        return !b();
    }

    @Override // o.OO1
    @NotNull
    public InterfaceC9181rA<E> iterator() {
        return new a();
    }

    public final C10885yA<E> j0(long j2) {
        C10885yA<E> e0 = e0();
        if (e1()) {
            long j1 = j1(e0);
            if (j1 != -1) {
                l0(j1);
            }
        }
        b0(e0, j2);
        return e0;
    }

    public final long j1(C10885yA<E> c10885yA) {
        do {
            int i2 = C11047yq.b;
            while (true) {
                i2--;
                if (-1 < i2) {
                    long j2 = (c10885yA.Z * C11047yq.b) + i2;
                    if (j2 < L0()) {
                        return -1L;
                    }
                    while (true) {
                        Object J = c10885yA.J(i2);
                        if (J != null && J != C11047yq.k()) {
                            if (J == C11047yq.f) {
                                return j2;
                            }
                        } else if (c10885yA.D(i2, J, C11047yq.z())) {
                            c10885yA.A();
                            break;
                        }
                    }
                } else {
                    c10885yA = (C10885yA) c10885yA.h();
                }
            }
        } while (c10885yA != null);
        return -1L;
    }

    public final /* synthetic */ void j2(Object obj) {
        this._closeCause$volatile = obj;
    }

    public final void k0() {
        h0();
    }

    public final void k1() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = Y0;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            if (((int) (j2 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, C11047yq.b(C11047yq.G & j2, 1)));
    }

    public final boolean k2(long j2) {
        if (d1(j2)) {
            return false;
        }
        return !Z(j2 & C11047yq.G);
    }

    public final void l0(long j2) {
        C10885yA<E> c10885yA;
        Iz2 c2;
        C10885yA<E> c10885yA2 = (C10885yA) d1.get(this);
        while (true) {
            long j3 = Z0.get(this);
            if (j2 < Math.max(this.X + j3, t0())) {
                return;
            }
            if (Z0.compareAndSet(this, j3, 1 + j3)) {
                int i2 = C11047yq.b;
                long j4 = j3 / i2;
                int i3 = (int) (j3 % i2);
                if (c10885yA2.Z != j4) {
                    c10885yA = o0(j4, c10885yA2);
                    if (c10885yA == null) {
                        continue;
                    }
                } else {
                    c10885yA = c10885yA2;
                }
                Object t2 = t2(c10885yA, i3, j3, null);
                if (t2 == C11047yq.h()) {
                    if (j3 < R0()) {
                        c10885yA.b();
                    }
                } else {
                    c10885yA.b();
                    HA0<E, C7458kA2> ha0 = this.Y;
                    if (ha0 != null && (c2 = C8630ov1.c(ha0, t2, null, 2, null)) != null) {
                        throw c2;
                    }
                }
                c10885yA2 = c10885yA;
            }
        }
    }

    public final void l1() {
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = Y0;
        do {
            j2 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, C11047yq.b(C11047yq.G & j2, 3)));
    }

    public boolean l2() {
        return k2(Y0.get(this));
    }

    public final void m0() {
        if (g1()) {
            return;
        }
        C10885yA<E> c10885yA = (C10885yA) e1.get(this);
        while (true) {
            long andIncrement = a1.getAndIncrement(this);
            int i2 = C11047yq.b;
            long j2 = andIncrement / i2;
            if (R0() <= andIncrement) {
                if (c10885yA.Z < j2 && c10885yA.f() != 0) {
                    n1(j2, c10885yA);
                }
                W0(this, 0L, 1, null);
                return;
            }
            if (c10885yA.Z != j2) {
                C10885yA<E> n0 = n0(j2, c10885yA, andIncrement);
                if (n0 == null) {
                    continue;
                } else {
                    c10885yA = n0;
                }
            }
            if (r2(c10885yA, (int) (andIncrement % i2), andIncrement)) {
                W0(this, 0L, 1, null);
                return;
            }
            W0(this, 0L, 1, null);
        }
    }

    public final void m1() {
        long j2;
        long b2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = Y0;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            int i2 = (int) (j2 >> 60);
            if (i2 != 0) {
                if (i2 == 1) {
                    b2 = C11047yq.b(C11047yq.G & j2, 3);
                } else {
                    return;
                }
            } else {
                b2 = C11047yq.b(C11047yq.G & j2, 2);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, b2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0224  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2() {
        C10885yA c10885yA;
        String str;
        C10885yA c10885yA2;
        String str2;
        int i2;
        int i3;
        C10885yA c10885yA3;
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("S=" + R0() + ",R=" + L0() + ",B=" + t0() + ",B'=" + b1.get(this) + ",C=" + ((int) (Y0.get(this) >> 60)) + ',');
        int i4 = (int) (Y0.get(this) >> 60);
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    sb.append("CANCELLED,");
                }
            } else {
                sb.append("CLOSED,");
            }
        } else {
            sb.append("CANCELLATION_STARTED,");
        }
        sb.append("SEND_SEGM=" + NV.b(c1.get(this)) + ",RCV_SEGM=" + NV.b(d1.get(this)));
        if (!g1()) {
            sb.append(",EB_SEGM=" + NV.b(e1.get(this)));
        }
        sb.append(TD0.a.Y0);
        C10885yA[] c10885yAArr = {d1.get(this), c1.get(this), e1.get(this)};
        ArrayList arrayList = new ArrayList();
        for (Object obj : C8222nF.O(c10885yAArr)) {
            if (((C10885yA) obj) != C11047yq.n()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j2 = ((C10885yA) next).Z;
                do {
                    Object next2 = it.next();
                    long j3 = ((C10885yA) next2).Z;
                    if (j2 > j3) {
                        next = next2;
                        j2 = j3;
                    }
                } while (it.hasNext());
                c10885yA = (C10885yA) next;
                do {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(NV.b(c10885yA));
                    sb2.append("=[");
                    if (!c10885yA.m()) {
                    }
                    sb2.append(str);
                    sb2.append(c10885yA.Z);
                    sb2.append(",prev=");
                    c10885yA2 = (C10885yA) c10885yA.h();
                    String str3 = null;
                    if (c10885yA2 == null) {
                    }
                    sb2.append(str2);
                    sb2.append(',');
                    sb.append(sb2.toString());
                    i2 = C11047yq.b;
                    while (i3 < i2) {
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("next=");
                    c10885yA3 = (C10885yA) c10885yA.f();
                    if (c10885yA3 != null) {
                    }
                    sb3.append(str3);
                    sb3.append("]  ");
                    sb.append(sb3.toString());
                    c10885yA = (C10885yA) c10885yA.f();
                } while (c10885yA != null);
                return sb.toString();
            }
            c10885yA = (C10885yA) next;
            do {
                StringBuilder sb22 = new StringBuilder();
                sb22.append(NV.b(c10885yA));
                sb22.append("=[");
                if (!c10885yA.m()) {
                    str = "*";
                } else {
                    str = "";
                }
                sb22.append(str);
                sb22.append(c10885yA.Z);
                sb22.append(",prev=");
                c10885yA2 = (C10885yA) c10885yA.h();
                String str32 = null;
                if (c10885yA2 == null) {
                    str2 = NV.b(c10885yA2);
                } else {
                    str2 = null;
                }
                sb22.append(str2);
                sb22.append(',');
                sb.append(sb22.toString());
                i2 = C11047yq.b;
                for (i3 = 0; i3 < i2; i3++) {
                    Object J = c10885yA.J(i3);
                    Object I = c10885yA.I(i3);
                    if (J instanceof InterfaceC8396ny) {
                        valueOf = "cont";
                    } else if (J instanceof InterfaceC6691h02) {
                        valueOf = "select";
                    } else if (J instanceof NO1) {
                        valueOf = "receiveCatching";
                    } else if (J instanceof b) {
                        valueOf = "send(broadcast)";
                    } else if (J instanceof C9463sJ2) {
                        valueOf = "EB(" + J + ')';
                    } else {
                        valueOf = String.valueOf(J);
                    }
                    sb.append('[' + i3 + "]=(" + valueOf + ',' + I + "),");
                }
                StringBuilder sb32 = new StringBuilder();
                sb32.append("next=");
                c10885yA3 = (C10885yA) c10885yA.f();
                if (c10885yA3 != null) {
                    str32 = NV.b(c10885yA3);
                }
                sb32.append(str32);
                sb32.append("]  ");
                sb.append(sb32.toString());
                c10885yA = (C10885yA) c10885yA.f();
            } while (c10885yA != null);
            return sb.toString();
        }
        throw new NoSuchElementException();
    }

    public final C10885yA<E> n0(long j2, C10885yA<E> c10885yA, long j3) {
        Object g2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e1;
        VA0 va0 = (VA0) C11047yq.y();
        loop0: while (true) {
            g2 = C9703tJ.g(c10885yA, j2, va0);
            if (!TZ1.h(g2)) {
                QZ1 f2 = TZ1.f(g2);
                while (true) {
                    QZ1 qz1 = (QZ1) atomicReferenceFieldUpdater.get(this);
                    if (qz1.Z >= f2.Z) {
                        break loop0;
                    } else if (!f2.C()) {
                        break;
                    } else if (P2.a(atomicReferenceFieldUpdater, this, qz1, f2)) {
                        if (qz1.v()) {
                            qz1.q();
                        }
                    } else if (f2.v()) {
                        f2.q();
                    }
                }
            } else {
                break;
            }
        }
        if (TZ1.h(g2)) {
            k0();
            n1(j2, c10885yA);
            W0(this, 0L, 1, null);
            return null;
        }
        C10885yA<E> c10885yA2 = (C10885yA) TZ1.f(g2);
        if (c10885yA2.Z > j2) {
            long j4 = c10885yA2.Z;
            int i2 = C11047yq.b;
            if (a1.compareAndSet(this, j3 + 1, j4 * i2)) {
                V0((c10885yA2.Z * i2) - j3);
            } else {
                W0(this, 0L, 1, null);
            }
            return null;
        }
        return c10885yA2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n1(long j2, C10885yA<E> c10885yA) {
        C10885yA<E> c10885yA2;
        C10885yA<E> c10885yA3;
        while (c10885yA.Z < j2 && (c10885yA3 = (C10885yA) c10885yA.f()) != null) {
            c10885yA = c10885yA3;
        }
        while (true) {
            if (!c10885yA.m() || (c10885yA2 = (C10885yA) c10885yA.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e1;
                while (true) {
                    QZ1 qz1 = (QZ1) atomicReferenceFieldUpdater.get(this);
                    if (qz1.Z >= c10885yA.Z) {
                        return;
                    }
                    if (!c10885yA.C()) {
                        break;
                    } else if (P2.a(atomicReferenceFieldUpdater, this, qz1, c10885yA)) {
                        if (qz1.v()) {
                            qz1.q();
                            return;
                        }
                        return;
                    } else if (c10885yA.v()) {
                        c10885yA.q();
                    }
                }
            } else {
                c10885yA = c10885yA2;
            }
        }
    }

    public final boolean n2(Object obj, E e2) {
        if (obj instanceof InterfaceC6691h02) {
            return ((InterfaceC6691h02) obj).h(this, e2);
        }
        FW0<C7458kA2> fw0 = null;
        if (obj instanceof NO1) {
            C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            C8883py<C10642xA<? extends E>> c8883py = ((NO1) obj).X;
            C10642xA b2 = C10642xA.b(C10642xA.b.c(e2));
            HA0<E, C7458kA2> ha0 = this.Y;
            if (ha0 != null) {
                fw0 = Y(ha0);
            }
            return C11047yq.u(c8883py, b2, (XA0) fw0);
        } else if (obj instanceof a) {
            C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).k(e2);
        } else if (obj instanceof InterfaceC8396ny) {
            C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC8396ny interfaceC8396ny = (InterfaceC8396ny) obj;
            HA0<E, C7458kA2> ha02 = this.Y;
            if (ha02 != null) {
                fw0 = T(ha02);
            }
            return C11047yq.u(interfaceC8396ny, e2, (XA0) fw0);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    public final C10885yA<E> o0(long j2, C10885yA<E> c10885yA) {
        Object g2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d1;
        VA0 va0 = (VA0) C11047yq.y();
        loop0: while (true) {
            g2 = C9703tJ.g(c10885yA, j2, va0);
            if (!TZ1.h(g2)) {
                QZ1 f2 = TZ1.f(g2);
                while (true) {
                    QZ1 qz1 = (QZ1) atomicReferenceFieldUpdater.get(this);
                    if (qz1.Z >= f2.Z) {
                        break loop0;
                    } else if (!f2.C()) {
                        break;
                    } else if (P2.a(atomicReferenceFieldUpdater, this, qz1, f2)) {
                        if (qz1.v()) {
                            qz1.q();
                        }
                    } else if (f2.v()) {
                        f2.q();
                    }
                }
            } else {
                break;
            }
        }
        if (TZ1.h(g2)) {
            k0();
            if (c10885yA.Z * C11047yq.b < R0()) {
                c10885yA.b();
            }
            return null;
        }
        C10885yA<E> c10885yA2 = (C10885yA) TZ1.f(g2);
        if (!g1() && j2 <= t0() / C11047yq.b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = e1;
            while (true) {
                QZ1 qz12 = (QZ1) atomicReferenceFieldUpdater2.get(this);
                if (qz12.Z >= c10885yA2.Z || !c10885yA2.C()) {
                    break;
                } else if (P2.a(atomicReferenceFieldUpdater2, this, qz12, c10885yA2)) {
                    if (qz12.v()) {
                        qz12.q();
                    }
                } else if (c10885yA2.v()) {
                    c10885yA2.q();
                }
            }
        }
        long j3 = c10885yA2.Z;
        if (j3 > j2) {
            int i2 = C11047yq.b;
            x2(j3 * i2);
            if (c10885yA2.Z * i2 < R0()) {
                c10885yA2.b();
            }
            return null;
        }
        return c10885yA2;
    }

    public final void o1(Throwable th, Object obj, InterfaceC5809dQ interfaceC5809dQ) {
        HA0<E, C7458kA2> ha0 = this.Y;
        C6562gT0.m(ha0);
        Object h2 = C10642xA.h(obj);
        C6562gT0.m(h2);
        C8630ov1.a(ha0, h2, interfaceC5809dQ);
    }

    public final boolean o2(Object obj, C10885yA<E> c10885yA, int i2) {
        if (obj instanceof InterfaceC8396ny) {
            C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return C11047yq.G((InterfaceC8396ny) obj, C7458kA2.a, null, 2, null);
        } else if (obj instanceof InterfaceC6691h02) {
            C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            Tu2 L = ((C6436g02) obj).L(this, C7458kA2.a);
            if (L == Tu2.Y) {
                c10885yA.E(i2);
            }
            if (L == Tu2.X) {
                return true;
            }
            return false;
        } else if (obj instanceof b) {
            return C11047yq.G(((b) obj).a(), Boolean.TRUE, null, 2, null);
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
    }

    @Override // o.InterfaceC10362w02
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'trySend' method", replaceWith = @IR1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e2) {
        return InterfaceC6728hA.a.c(this, e2);
    }

    public final C10885yA<E> p0(long j2, C10885yA<E> c10885yA) {
        Object g2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c1;
        VA0 va0 = (VA0) C11047yq.y();
        loop0: while (true) {
            g2 = C9703tJ.g(c10885yA, j2, va0);
            if (!TZ1.h(g2)) {
                QZ1 f2 = TZ1.f(g2);
                while (true) {
                    QZ1 qz1 = (QZ1) atomicReferenceFieldUpdater.get(this);
                    if (qz1.Z >= f2.Z) {
                        break loop0;
                    } else if (!f2.C()) {
                        break;
                    } else if (P2.a(atomicReferenceFieldUpdater, this, qz1, f2)) {
                        if (qz1.v()) {
                            qz1.q();
                        }
                    } else if (f2.v()) {
                        f2.q();
                    }
                }
            } else {
                break;
            }
        }
        if (TZ1.h(g2)) {
            k0();
            if (c10885yA.Z * C11047yq.b < L0()) {
                c10885yA.b();
            }
            return null;
        }
        C10885yA<E> c10885yA2 = (C10885yA) TZ1.f(g2);
        long j3 = c10885yA2.Z;
        if (j3 > j2) {
            int i2 = C11047yq.b;
            y2(j3 * i2);
            if (c10885yA2.Z * i2 < L0()) {
                c10885yA2.b();
            }
            return null;
        }
        return c10885yA2;
    }

    public final void p1(Throwable th, E e2, InterfaceC5809dQ interfaceC5809dQ) {
        HA0<E, C7458kA2> ha0 = this.Y;
        C6562gT0.m(ha0);
        C8630ov1.a(ha0, e2, interfaceC5809dQ);
    }

    @NotNull
    public final Object p2(E e2) {
        C10885yA c10885yA;
        int i2;
        C10804xq<E> c10804xq;
        InterfaceC9220rJ2 interfaceC9220rJ2;
        C7592kj2 c7592kj2 = C11047yq.f;
        C10885yA c10885yA2 = (C10885yA) r().get(this);
        while (true) {
            long andIncrement = s().getAndIncrement(this);
            long j2 = andIncrement & C11047yq.G;
            boolean d12 = d1(andIncrement);
            int i3 = C11047yq.b;
            long j3 = j2 / i3;
            int i4 = (int) (j2 % i3);
            if (c10885yA2.Z != j3) {
                c10885yA = p0(j3, c10885yA2);
                if (c10885yA == null) {
                    if (d12) {
                        return C10642xA.b.a(M0());
                    }
                } else {
                    c10804xq = this;
                    i2 = i4;
                }
            } else {
                c10885yA = c10885yA2;
                i2 = i4;
                c10804xq = this;
            }
            E e3 = e2;
            int v2 = c10804xq.v2(c10885yA, i2, e3, j2, c7592kj2, d12);
            c10885yA2 = c10885yA;
            if (v2 != 0) {
                if (v2 != 1) {
                    if (v2 != 2) {
                        if (v2 != 3) {
                            if (v2 != 4) {
                                if (v2 == 5) {
                                    c10885yA2.b();
                                }
                                e2 = e3;
                            } else {
                                if (j2 < L0()) {
                                    c10885yA2.b();
                                }
                                return C10642xA.b.a(M0());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else if (d12) {
                        c10885yA2.A();
                        return C10642xA.b.a(M0());
                    } else {
                        if (c7592kj2 instanceof InterfaceC9220rJ2) {
                            interfaceC9220rJ2 = (InterfaceC9220rJ2) c7592kj2;
                        } else {
                            interfaceC9220rJ2 = null;
                        }
                        if (interfaceC9220rJ2 != null) {
                            C1(interfaceC9220rJ2, c10885yA2, i2);
                        }
                        l0((c10885yA2.Z * i3) + i2);
                        return C10642xA.b.c(C7458kA2.a);
                    }
                } else {
                    return C10642xA.b.c(C7458kA2.a);
                }
            } else {
                c10885yA2.b();
                return C10642xA.b.c(C7458kA2.a);
            }
        }
    }

    @Override // o.OO1
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @IR1(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return (E) InterfaceC6728hA.a.d(this);
    }

    public final /* synthetic */ Object q0(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, HA0<Object, ? extends Object> ha0) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!P2.a(atomicReferenceFieldUpdater, obj, obj2, ha0.invoke(obj2)));
        return obj2;
    }

    public final /* synthetic */ void q2(Object obj, AtomicLongFieldUpdater atomicLongFieldUpdater, HA0<? super Long, Long> ha0) {
        while (true) {
            long j2 = atomicLongFieldUpdater.get(obj);
            Object obj2 = obj;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j2, ha0.invoke(Long.valueOf(j2)).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    public final /* synthetic */ long r0() {
        return this.bufferEnd$volatile;
    }

    public final void r1(InterfaceC8396ny<? super C10642xA<? extends E>> interfaceC8396ny) {
        PT1.a aVar = PT1.Y;
        interfaceC8396ny.q(PT1.b(C10642xA.b(C10642xA.b.a(w0()))));
    }

    public final boolean r2(C10885yA<E> c10885yA, int i2, long j2) {
        Object J = c10885yA.J(i2);
        if ((J instanceof InterfaceC9220rJ2) && j2 >= Z0.get(this) && c10885yA.D(i2, J, C11047yq.p())) {
            if (o2(J, c10885yA, i2)) {
                c10885yA.N(i2, C11047yq.f);
                return true;
            }
            c10885yA.N(i2, C11047yq.j());
            c10885yA.K(i2, false);
            return false;
        }
        return s2(c10885yA, i2, j2);
    }

    public final void s1(InterfaceC8396ny<? super E> interfaceC8396ny) {
        PT1.a aVar = PT1.Y;
        interfaceC8396ny.q(PT1.b(RT1.a(G0())));
    }

    public final boolean s2(C10885yA<E> c10885yA, int i2, long j2) {
        while (true) {
            Object J = c10885yA.J(i2);
            if (J instanceof InterfaceC9220rJ2) {
                if (j2 < Z0.get(this)) {
                    if (c10885yA.D(i2, J, new C9463sJ2((InterfaceC9220rJ2) J))) {
                        return true;
                    }
                } else if (c10885yA.D(i2, J, C11047yq.p())) {
                    if (o2(J, c10885yA, i2)) {
                        c10885yA.N(i2, C11047yq.f);
                        return true;
                    }
                    c10885yA.N(i2, C11047yq.j());
                    c10885yA.K(i2, false);
                    return false;
                }
            } else if (J == C11047yq.j()) {
                return false;
            } else {
                if (J == null) {
                    if (c10885yA.D(i2, J, C11047yq.k())) {
                        return true;
                    }
                } else if (J == C11047yq.f || J == C11047yq.o() || J == C11047yq.f() || J == C11047yq.i() || J == C11047yq.z()) {
                    return true;
                } else {
                    if (J != C11047yq.q()) {
                        throw new IllegalStateException(("Unexpected cell state: " + J).toString());
                    }
                }
            }
        }
    }

    public final long t0() {
        return a1.get(this);
    }

    public final void t1(InterfaceC6691h02<?> interfaceC6691h02) {
        interfaceC6691h02.e(C11047yq.z());
    }

    public final Object t2(C10885yA<E> c10885yA, int i2, long j2, Object obj) {
        Object J = c10885yA.J(i2);
        if (J == null) {
            if (j2 >= (Y0.get(this) & C11047yq.G)) {
                if (obj == null) {
                    return C11047yq.s();
                }
                if (c10885yA.D(i2, J, obj)) {
                    m0();
                    return C11047yq.r();
                }
            }
        } else if (J == C11047yq.f && c10885yA.D(i2, J, C11047yq.f())) {
            m0();
            return c10885yA.L(i2);
        }
        return u2(c10885yA, i2, j2, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01df, code lost:
        r16 = r7;
        r3 = (o.C10885yA) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e8, code lost:
        if (r3 != null) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01df A[EDGE_INSN: B:106:0x01df->B:88:0x01df ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f0  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        int i2;
        int i3;
        boolean z;
        String str;
        StringBuilder sb = new StringBuilder();
        int i4 = (int) (Y0.get(this) >> 60);
        if (i4 != 2) {
            if (i4 == 3) {
                sb.append("cancelled,");
            }
        } else {
            sb.append("closed,");
        }
        sb.append("capacity=" + this.X + ',');
        sb.append("data=[");
        int i5 = 0;
        boolean z2 = true;
        C10885yA[] c10885yAArr = {d1.get(this), c1.get(this), e1.get(this)};
        ArrayList arrayList = new ArrayList();
        for (Object obj : C8222nF.O(c10885yAArr)) {
            if (((C10885yA) obj) != C11047yq.n()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j2 = ((C10885yA) next).Z;
                do {
                    Object next2 = it.next();
                    long j3 = ((C10885yA) next2).Z;
                    if (j2 > j3) {
                        next = next2;
                        j2 = j3;
                    }
                } while (it.hasNext());
                C10885yA c10885yA = (C10885yA) next;
                long L0 = L0();
                long R0 = R0();
                loop2: while (true) {
                    i2 = C11047yq.b;
                    i3 = i5;
                    while (true) {
                        if (i3 >= i2) {
                        }
                        i3++;
                        z2 = r16;
                    }
                    z2 = z;
                    i5 = 0;
                }
                if (C2832Ef2.W7(sb) == ',') {
                }
                sb.append(C6566gU0.g);
                return sb.toString();
            }
            C10885yA c10885yA2 = (C10885yA) next;
            long L02 = L0();
            long R02 = R0();
            loop2: while (true) {
                i2 = C11047yq.b;
                i3 = i5;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    }
                    long j4 = (c10885yA2.Z * C11047yq.b) + i3;
                    int i6 = (j4 > R02 ? 1 : (j4 == R02 ? 0 : -1));
                    if (i6 >= 0 && j4 >= L02) {
                        break loop2;
                    }
                    Object J = c10885yA2.J(i3);
                    Object I = c10885yA2.I(i3);
                    boolean z3 = z2;
                    if (J instanceof InterfaceC8396ny) {
                        int i7 = (j4 > L02 ? 1 : (j4 == L02 ? 0 : -1));
                        if (i7 < 0 && i6 >= 0) {
                            str = "receive";
                        } else if (i6 < 0 && i7 >= 0) {
                            str = "send";
                        } else {
                            str = "cont";
                        }
                    } else if (J instanceof InterfaceC6691h02) {
                        int i8 = (j4 > L02 ? 1 : (j4 == L02 ? 0 : -1));
                        if (i8 < 0 && i6 >= 0) {
                            str = "onReceive";
                        } else if (i6 < 0 && i8 >= 0) {
                            str = "onSend";
                        } else {
                            str = "select";
                        }
                    } else if (J instanceof NO1) {
                        str = "receiveCatching";
                    } else if (J instanceof b) {
                        str = "sendBroadcast";
                    } else if (J instanceof C9463sJ2) {
                        str = "EB(" + J + ')';
                    } else if (!C6562gT0.g(J, C11047yq.q()) && !C6562gT0.g(J, C11047yq.p())) {
                        if (J != null && !C6562gT0.g(J, C11047yq.k()) && !C6562gT0.g(J, C11047yq.f()) && !C6562gT0.g(J, C11047yq.o()) && !C6562gT0.g(J, C11047yq.i()) && !C6562gT0.g(J, C11047yq.j()) && !C6562gT0.g(J, C11047yq.z())) {
                            str = J.toString();
                        }
                        i3++;
                        z2 = z3;
                    } else {
                        str = "resuming_sender";
                    }
                    if (I != null) {
                        sb.append('(' + str + ',' + I + "),");
                    } else {
                        sb.append(str + ',');
                    }
                    i3++;
                    z2 = z3;
                }
                z2 = z;
                i5 = 0;
            }
            if (C2832Ef2.W7(sb) == ',') {
                C6562gT0.o(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
            }
            sb.append(C6566gU0.g);
            return sb.toString();
        }
        throw new NoSuchElementException();
    }

    public final /* synthetic */ Object u0() {
        return this.bufferEndSegment$volatile;
    }

    public final void u1(E e2, InterfaceC6691h02<?> interfaceC6691h02) {
        HA0<E, C7458kA2> ha0 = this.Y;
        if (ha0 != null) {
            C8630ov1.a(ha0, e2, interfaceC6691h02.getContext());
        }
        interfaceC6691h02.e(C11047yq.z());
    }

    public final Object u2(C10885yA<E> c10885yA, int i2, long j2, Object obj) {
        while (true) {
            Object J = c10885yA.J(i2);
            if (J != null && J != C11047yq.k()) {
                if (J == C11047yq.f) {
                    if (c10885yA.D(i2, J, C11047yq.f())) {
                        m0();
                        return c10885yA.L(i2);
                    }
                } else if (J == C11047yq.j()) {
                    return C11047yq.h();
                } else {
                    if (J == C11047yq.o()) {
                        return C11047yq.h();
                    }
                    if (J == C11047yq.z()) {
                        m0();
                        return C11047yq.h();
                    } else if (J != C11047yq.p() && c10885yA.D(i2, J, C11047yq.q())) {
                        boolean z = J instanceof C9463sJ2;
                        if (z) {
                            J = ((C9463sJ2) J).a;
                        }
                        if (o2(J, c10885yA, i2)) {
                            c10885yA.N(i2, C11047yq.f());
                            m0();
                            return c10885yA.L(i2);
                        }
                        c10885yA.N(i2, C11047yq.j());
                        c10885yA.K(i2, false);
                        if (z) {
                            m0();
                        }
                        return C11047yq.h();
                    }
                }
            } else if (j2 < (Y0.get(this) & C11047yq.G)) {
                if (c10885yA.D(i2, J, C11047yq.o())) {
                    m0();
                    return C11047yq.h();
                }
            } else if (obj == null) {
                return C11047yq.s();
            } else {
                if (c10885yA.D(i2, J, obj)) {
                    m0();
                    return C11047yq.r();
                }
            }
        }
    }

    public final Object v1(E e2, HM<? super C7458kA2> hm) {
        Iz2 c2;
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        HA0<E, C7458kA2> ha0 = this.Y;
        if (ha0 != null && (c2 = C8630ov1.c(ha0, e2, null, 2, null)) != null) {
            C3917Pf0.a(c2, M0());
            PT1.a aVar = PT1.Y;
            c8883py.q(PT1.b(RT1.a(c2)));
        } else {
            Throwable M0 = M0();
            PT1.a aVar2 = PT1.Y;
            c8883py.q(PT1.b(RT1.a(M0)));
        }
        Object A = c8883py.A();
        if (A == C7289jT0.l()) {
            MV.c(hm);
        }
        if (A == C7289jT0.l()) {
            return A;
        }
        return C7458kA2.a;
    }

    public final int v2(C10885yA<E> c10885yA, int i2, E e2, long j2, Object obj, boolean z) {
        c10885yA.O(i2, e2);
        if (z) {
            return w2(c10885yA, i2, e2, j2, obj, z);
        }
        Object J = c10885yA.J(i2);
        if (J == null) {
            if (Z(j2)) {
                if (c10885yA.D(i2, null, C11047yq.f)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (c10885yA.D(i2, null, obj)) {
                    return 2;
                }
            }
        } else if (J instanceof InterfaceC9220rJ2) {
            c10885yA.E(i2);
            if (n2(J, e2)) {
                c10885yA.N(i2, C11047yq.f());
                x1();
                return 0;
            } else if (c10885yA.F(i2, C11047yq.i()) != C11047yq.i()) {
                c10885yA.K(i2, true);
                return 5;
            } else {
                return 5;
            }
        }
        return w2(c10885yA, i2, e2, j2, obj, z);
    }

    @Nullable
    public final Throwable w0() {
        return (Throwable) f1.get(this);
    }

    public final void w1(E e2, InterfaceC8396ny<? super C7458kA2> interfaceC8396ny) {
        HA0<E, C7458kA2> ha0 = this.Y;
        if (ha0 != null) {
            C8630ov1.a(ha0, e2, interfaceC8396ny.getContext());
        }
        Throwable M0 = M0();
        PT1.a aVar = PT1.Y;
        interfaceC8396ny.q(PT1.b(RT1.a(M0)));
    }

    public final int w2(C10885yA<E> c10885yA, int i2, E e2, long j2, Object obj, boolean z) {
        while (true) {
            Object J = c10885yA.J(i2);
            if (J == null) {
                if (Z(j2) && !z) {
                    if (c10885yA.D(i2, null, C11047yq.f)) {
                        return 1;
                    }
                } else if (z) {
                    if (c10885yA.D(i2, null, C11047yq.j())) {
                        c10885yA.K(i2, false);
                        return 4;
                    }
                } else if (obj == null) {
                    return 3;
                } else {
                    if (c10885yA.D(i2, null, obj)) {
                        return 2;
                    }
                }
            } else if (J == C11047yq.k()) {
                if (c10885yA.D(i2, J, C11047yq.f)) {
                    return 1;
                }
            } else if (J == C11047yq.i()) {
                c10885yA.E(i2);
                return 5;
            } else if (J == C11047yq.o()) {
                c10885yA.E(i2);
                return 5;
            } else if (J == C11047yq.z()) {
                c10885yA.E(i2);
                k0();
                return 4;
            } else {
                c10885yA.E(i2);
                if (J instanceof C9463sJ2) {
                    J = ((C9463sJ2) J).a;
                }
                if (n2(J, e2)) {
                    c10885yA.N(i2, C11047yq.f());
                    x1();
                    return 0;
                }
                if (c10885yA.F(i2, C11047yq.i()) != C11047yq.i()) {
                    c10885yA.K(i2, true);
                }
                return 5;
            }
        }
    }

    public final /* synthetic */ Object x0() {
        return this.closeHandler$volatile;
    }

    public final void x2(long j2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = Z0;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            if (j3 < j2) {
                long j4 = j2;
                if (Z0.compareAndSet(this, j3, j4)) {
                    return;
                }
                j2 = j4;
            } else {
                return;
            }
        }
    }

    public final void y2(long j2) {
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = Y0;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            j4 = C11047yq.G & j3;
            if (j4 < j2) {
            } else {
                return;
            }
        } while (!Y0.compareAndSet(this, j3, C11047yq.b(j4, (int) (j3 >> 60))));
    }

    public final /* synthetic */ long z0() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    public final void z2(long j2) {
        boolean z;
        C10804xq<E> c10804xq = this;
        if (!c10804xq.g1()) {
            while (c10804xq.t0() <= j2) {
                c10804xq = this;
            }
            int g2 = C11047yq.g();
            for (int i2 = 0; i2 < g2; i2++) {
                long t0 = c10804xq.t0();
                if (t0 == (4611686018427387903L & b1.get(c10804xq)) && t0 == c10804xq.t0()) {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = b1;
            while (true) {
                long j3 = atomicLongFieldUpdater.get(c10804xq);
                if (atomicLongFieldUpdater.compareAndSet(c10804xq, j3, C11047yq.a(j3 & 4611686018427387903L, true))) {
                    break;
                }
                c10804xq = this;
            }
            while (true) {
                long t02 = c10804xq.t0();
                long j4 = b1.get(c10804xq);
                long j5 = j4 & 4611686018427387903L;
                if ((4611686018427387904L & j4) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (t02 == j5 && t02 == c10804xq.t0()) {
                    break;
                } else if (!z) {
                    c10804xq = this;
                    b1.compareAndSet(c10804xq, j4, C11047yq.a(j5, true));
                } else {
                    c10804xq = this;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b1;
            while (true) {
                long j6 = atomicLongFieldUpdater2.get(c10804xq);
                boolean compareAndSet = atomicLongFieldUpdater2.compareAndSet(c10804xq, j6, C11047yq.a(j6 & 4611686018427387903L, false));
                AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
                if (compareAndSet) {
                    return;
                }
                atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
                c10804xq = this;
            }
        }
    }

    public /* synthetic */ C10804xq(int i2, HA0 ha0, int i3, C9516sY c9516sY) {
        this(i2, (i3 & 2) != 0 ? null : ha0);
    }

    public static /* synthetic */ void B0() {
    }

    public static /* synthetic */ void C0() {
    }

    public static /* synthetic */ void D0() {
    }

    public static /* synthetic */ void E0() {
    }

    public static /* synthetic */ void F0() {
    }

    @InterfaceC2951Fi0
    public static /* synthetic */ void a1() {
    }

    @InterfaceC2951Fi0
    public static /* synthetic */ void c1() {
    }

    @InterfaceC2951Fi0
    public static /* synthetic */ void f1() {
    }

    public void q1() {
    }

    public void x1() {
    }

    public void y1() {
    }
}
