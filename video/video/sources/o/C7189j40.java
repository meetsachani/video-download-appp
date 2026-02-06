package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,297:1\n224#1,8:361\n236#1:369\n237#1,2:380\n239#1:384\n1#2:298\n1#2:304\n1#2:345\n277#3,5:299\n282#3,12:305\n294#3:339\n277#3,5:340\n282#3,12:346\n294#3:399\n186#4,3:317\n189#4,14:325\n186#4,3:358\n189#4,14:385\n91#5,5:320\n103#5,10:370\n114#5,2:382\n103#5,13:400\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n214#1:361,8\n215#1:369\n215#1:380,2\n215#1:384\n195#1:304\n213#1:345\n195#1:299,5\n195#1:305,12\n195#1:339\n213#1:340,5\n213#1:346,12\n213#1:399\n195#1:317,3\n195#1:325,14\n213#1:358,3\n213#1:385,14\n196#1:320,5\n215#1:370,10\n215#1:382,2\n236#1:400,13\n*E\n"})
/* renamed from: o.j40  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7189j40<T> extends AbstractC7918m40<T> implements InterfaceC10706xQ, HM<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c1 = AtomicReferenceFieldUpdater.newUpdater(C7189j40.class, Object.class, "_reusableCancellableContinuation$volatile");
    @InterfaceC7058iW0
    @NotNull
    public final AbstractC7762lQ Y0;
    @InterfaceC7058iW0
    @NotNull
    public final HM<T> Z0;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    @InterfaceC7058iW0
    @Nullable
    public Object a1;
    @InterfaceC7058iW0
    @NotNull
    public final Object b1;

    /* JADX WARN: Multi-variable type inference failed */
    public C7189j40(@NotNull AbstractC7762lQ abstractC7762lQ, @NotNull HM<? super T> hm) {
        super(-1);
        C7592kj2 c7592kj2;
        this.Y0 = abstractC7762lQ;
        this.Z0 = hm;
        c7592kj2 = C7432k40.a;
        this.a1 = c7592kj2;
        this.b1 = C10795xn2.g(getContext());
    }

    private final /* synthetic */ void v(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, HA0<Object, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final boolean A(@Nullable Object obj) {
        RU0 ru0 = (RU0) getContext().f(RU0.W);
        if (ru0 != null && !ru0.h()) {
            CancellationException u = ru0.u();
            a(obj, u);
            PT1.a aVar = PT1.Y;
            q(PT1.b(RT1.a(u)));
            return true;
        }
        return false;
    }

    public final void B(@NotNull Object obj) {
        Qz2<?> qz2;
        HM<T> hm = this.Z0;
        Object obj2 = this.b1;
        InterfaceC5809dQ context = hm.getContext();
        Object i = C10795xn2.i(context, obj2);
        if (i != C10795xn2.a) {
            qz2 = C7035iQ.m(hm, context, i);
        } else {
            qz2 = null;
        }
        try {
            this.Z0.q(obj);
            C7458kA2 c7458kA2 = C7458kA2.a;
        } finally {
            UP0.d(1);
            if (qz2 == null || qz2.T1()) {
                C10795xn2.f(context, i);
            }
            UP0.c(1);
        }
    }

    public final /* synthetic */ void C(Object obj) {
        this._reusableCancellableContinuation$volatile = obj;
    }

    @Nullable
    public final Throwable D(@NotNull InterfaceC8396ny<?> interfaceC8396ny) {
        C7592kj2 c7592kj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c1;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c7592kj2 = C7432k40.b;
            if (obj != c7592kj2) {
                if (obj instanceof Throwable) {
                    if (P2.a(c1, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!P2.a(c1, this, c7592kj2, interfaceC8396ny));
        return null;
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public StackTraceElement Y() {
        return null;
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public InterfaceC10706xQ g() {
        HM<T> hm = this.Z0;
        if (hm instanceof InterfaceC10706xQ) {
            return (InterfaceC10706xQ) hm;
        }
        return null;
    }

    @Override // o.HM
    @NotNull
    public InterfaceC5809dQ getContext() {
        return this.Z0.getContext();
    }

    @Override // o.AbstractC7918m40
    @Nullable
    public Object j() {
        C7592kj2 c7592kj2;
        Object obj = this.a1;
        c7592kj2 = C7432k40.a;
        this.a1 = c7592kj2;
        return obj;
    }

    public final void k() {
        do {
        } while (c1.get(this) == C7432k40.b);
    }

    @Nullable
    public final C8883py<T> m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c1;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                c1.set(this, C7432k40.b);
                return null;
            } else if (obj instanceof C8883py) {
                if (P2.a(c1, this, obj, C7432k40.b)) {
                    return (C8883py) obj;
                }
            } else if (obj != C7432k40.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void n(@NotNull InterfaceC5809dQ interfaceC5809dQ, T t) {
        this.a1 = t;
        this.Z = 1;
        this.Y0.R(interfaceC5809dQ, this);
    }

    public final C8883py<?> p() {
        Object obj = c1.get(this);
        if (obj instanceof C8883py) {
            return (C8883py) obj;
        }
        return null;
    }

    @Override // o.HM
    public void q(@NotNull Object obj) {
        Object b = TH.b(obj);
        if (this.Y0.U(getContext())) {
            this.a1 = b;
            this.Z = 0;
            this.Y0.I(getContext(), this);
            return;
        }
        AbstractC3327Je0 b2 = C2472An2.a.b();
        if (b2.q0()) {
            this.a1 = b;
            this.Z = 0;
            b2.k0(this);
            return;
        }
        b2.m0(true);
        try {
            InterfaceC5809dQ context = getContext();
            Object i = C10795xn2.i(context, this.b1);
            this.Z0.q(obj);
            C7458kA2 c7458kA2 = C7458kA2.a;
            C10795xn2.f(context, i);
            do {
            } while (b2.A0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final /* synthetic */ Object r() {
        return this._reusableCancellableContinuation$volatile;
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.Y0 + C6566gU0.h + NV.c(this.Z0) + ']';
    }

    public final boolean u() {
        if (c1.get(this) != null) {
            return true;
        }
        return false;
    }

    public final boolean x(@NotNull Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c1;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C7592kj2 c7592kj2 = C7432k40.b;
            if (C6562gT0.g(obj, c7592kj2)) {
                if (P2.a(c1, this, c7592kj2, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (P2.a(c1, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void y() {
        k();
        C8883py<?> p = p();
        if (p != null) {
            p.u();
        }
    }

    public final void z(@NotNull Object obj) {
        Qz2<?> qz2;
        Object b = TH.b(obj);
        if (this.Y0.U(getContext())) {
            this.a1 = b;
            this.Z = 1;
            this.Y0.I(getContext(), this);
            return;
        }
        AbstractC3327Je0 b2 = C2472An2.a.b();
        if (b2.q0()) {
            this.a1 = b;
            this.Z = 1;
            b2.k0(this);
            return;
        }
        b2.m0(true);
        try {
            RU0 ru0 = (RU0) getContext().f(RU0.W);
            if (ru0 != null && !ru0.h()) {
                CancellationException u = ru0.u();
                a(b, u);
                PT1.a aVar = PT1.Y;
                q(PT1.b(RT1.a(u)));
            } else {
                HM<T> hm = this.Z0;
                Object obj2 = this.b1;
                InterfaceC5809dQ context = hm.getContext();
                Object i = C10795xn2.i(context, obj2);
                if (i != C10795xn2.a) {
                    qz2 = C7035iQ.m(hm, context, i);
                } else {
                    qz2 = null;
                }
                this.Z0.q(obj);
                C7458kA2 c7458kA2 = C7458kA2.a;
                UP0.d(1);
                if (qz2 == null || qz2.T1()) {
                    C10795xn2.f(context, i);
                }
                UP0.c(1);
            }
            do {
            } while (b2.A0());
            UP0.d(1);
        } catch (Throwable th) {
            try {
                f(th);
                UP0.d(1);
            } catch (Throwable th2) {
                UP0.d(1);
                b2.b0(true);
                UP0.c(1);
                throw th2;
            }
        }
        b2.b0(true);
        UP0.c(1);
    }

    public static /* synthetic */ void t() {
    }

    @Override // o.AbstractC7918m40
    @NotNull
    public HM<T> b() {
        return this;
    }
}
