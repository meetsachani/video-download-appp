package o;

import com.facebook.internal.C2356a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.InterfaceC7406jy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,701:1\n227#1,10:705\n227#1,10:716\n1#2:702\n20#3:703\n20#3:704\n18#3:715\n17#3:726\n18#3,3:727\n17#3:730\n18#3,3:731\n18#3:738\n17#3,4:739\n57#4,2:734\n57#4,2:736\n57#4,2:743\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n239#1:705,10\n244#1:716,10\n69#1:703\n155#1:704\n242#1:715\n271#1:726\n272#1:727,3\n281#1:730\n282#1:731,3\n387#1:738\n390#1:739,4\n323#1:734,2\n333#1:736,2\n614#1:743,2\n*E\n"})
@HK1
/* renamed from: o.py  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C8883py<T> extends AbstractC7918m40<T> implements InterfaceC8396ny<T>, InterfaceC10706xQ, InterfaceC9220rJ2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a1 = AtomicIntegerFieldUpdater.newUpdater(C8883py.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater b1 = AtomicReferenceFieldUpdater.newUpdater(C8883py.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c1 = AtomicReferenceFieldUpdater.newUpdater(C8883py.class, Object.class, "_parentHandle$volatile");
    @NotNull
    public final HM<T> Y0;
    @NotNull
    public final InterfaceC5809dQ Z0;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public C8883py(@NotNull HM<? super T> hm, int i) {
        super(i);
        this.Y0 = hm;
        this.Z0 = hm.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = V4.X;
    }

    public static final C7458kA2 a0(HA0 ha0, Throwable th, Object obj, InterfaceC5809dQ interfaceC5809dQ) {
        ha0.invoke(th);
        return C7458kA2.a;
    }

    public static /* synthetic */ void d0(C8883py c8883py, Object obj, int i, XA0 xa0, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                xa0 = null;
            }
            c8883py.c0(obj, i, xa0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    @HK1
    @Nullable
    public final Object A() {
        RU0 ru0;
        boolean P = P();
        if (m0()) {
            if (z() == null) {
                M();
            }
            if (P) {
                V();
            }
            return C7289jT0.l();
        }
        if (P) {
            V();
        }
        Object B = B();
        if (!(B instanceof QH)) {
            if (C8179n40.c(this.Z) && (ru0 = (RU0) getContext().f(RU0.W)) != null && !ru0.h()) {
                CancellationException u = ru0.u();
                a(B, u);
                throw u;
            }
            return e(B);
        }
        throw ((QH) B).a;
    }

    @Nullable
    public final Object B() {
        return b1.get(this);
    }

    public final String C() {
        Object B = B();
        if (B instanceof InterfaceC8857pr1) {
            return "Active";
        }
        if (B instanceof C10836xy) {
            return C2356a.u;
        }
        return C2356a.s;
    }

    public final /* synthetic */ int D() {
        return this._decisionAndIndex$volatile;
    }

    @Override // o.InterfaceC8396ny
    public void E(@NotNull AbstractC7762lQ abstractC7762lQ, T t) {
        C7189j40 c7189j40;
        int i;
        HM<T> hm = this.Y0;
        AbstractC7762lQ abstractC7762lQ2 = null;
        if (hm instanceof C7189j40) {
            c7189j40 = (C7189j40) hm;
        } else {
            c7189j40 = null;
        }
        if (c7189j40 != null) {
            abstractC7762lQ2 = c7189j40.Y0;
        }
        if (abstractC7762lQ2 == abstractC7762lQ) {
            i = 4;
        } else {
            i = this.Z;
        }
        d0(this, t, i, null, 4, null);
    }

    public final /* synthetic */ Object G() {
        return this._parentHandle$volatile;
    }

    @Override // o.InterfaceC8396ny
    @Nullable
    public <R extends T> Object I(R r, @Nullable Object obj, @Nullable XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0) {
        return l0(r, obj, xa0);
    }

    public final /* synthetic */ Object J() {
        return this._state$volatile;
    }

    @Override // o.InterfaceC8396ny
    public <R extends T> void K(R r, @Nullable XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0) {
        c0(r, this.Z, xa0);
    }

    public final B40 M() {
        RU0 ru0 = (RU0) getContext().f(RU0.W);
        if (ru0 == null) {
            return null;
        }
        B40 C = C5829dV0.C(ru0, false, new YB(this), 1, null);
        P2.a(c1, this, null, C);
        return C;
    }

    public final void N(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof V4) {
                if (P2.a(b1, this, obj2, obj)) {
                    return;
                }
            } else if (!(obj2 instanceof InterfaceC7406jy) && !(obj2 instanceof QZ1)) {
                if (obj2 instanceof QH) {
                    QH qh = (QH) obj2;
                    if (!qh.d()) {
                        S(obj, obj2);
                    }
                    if (obj2 instanceof C10836xy) {
                        Throwable th = null;
                        if (obj2 == null) {
                            qh = null;
                        }
                        if (qh != null) {
                            th = qh.a;
                        }
                        if (obj instanceof InterfaceC7406jy) {
                            n((InterfaceC7406jy) obj, th);
                            return;
                        }
                        C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        s((QZ1) obj, th);
                        return;
                    }
                    return;
                } else if (obj2 instanceof OH) {
                    OH oh = (OH) obj2;
                    if (oh.b != null) {
                        S(obj, obj2);
                    }
                    if (obj instanceof QZ1) {
                        return;
                    }
                    C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC7406jy interfaceC7406jy = (InterfaceC7406jy) obj;
                    if (oh.h()) {
                        n(interfaceC7406jy, oh.e);
                        return;
                    }
                    if (P2.a(b1, this, obj2, OH.g(oh, null, interfaceC7406jy, null, null, null, 29, null))) {
                        return;
                    }
                } else if (obj instanceof QZ1) {
                    return;
                } else {
                    C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    if (P2.a(b1, this, obj2, new OH(obj2, (InterfaceC7406jy) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            } else {
                S(obj, obj2);
            }
        }
    }

    public final void O(@NotNull InterfaceC7406jy interfaceC7406jy) {
        N(interfaceC7406jy);
    }

    public final boolean P() {
        if (C8179n40.d(this.Z)) {
            HM<T> hm = this.Y0;
            C6562gT0.n(hm, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C7189j40) hm).u()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final /* synthetic */ void Q(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, HA0<? super Integer, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ void R(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, HA0<Object, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final void S(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    @NotNull
    public String T() {
        return "CancellableContinuation";
    }

    public final void U(@NotNull Throwable th) {
        if (t(th)) {
            return;
        }
        d(th);
        v();
    }

    public final void V() {
        C7189j40 c7189j40;
        Throwable D;
        HM<T> hm = this.Y0;
        if (hm instanceof C7189j40) {
            c7189j40 = (C7189j40) hm;
        } else {
            c7189j40 = null;
        }
        if (c7189j40 != null && (D = c7189j40.D(this)) != null) {
            u();
            d(D);
        }
    }

    @InterfaceC8046mW0(name = "resetStateReusable")
    public final boolean W() {
        Object obj = b1.get(this);
        if ((obj instanceof OH) && ((OH) obj).d != null) {
            u();
            return false;
        }
        a1.set(this, 536870911);
        b1.set(this, V4.X);
        return true;
    }

    @Override // o.InterfaceC8396ny
    public void X(@NotNull HA0<? super Throwable, C7458kA2> ha0) {
        C9375ry.c(this, new InterfaceC7406jy.a(ha0));
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public StackTraceElement Y() {
        return null;
    }

    @Override // o.InterfaceC8396ny
    public void Z() {
        B40 M = M();
        if (M != null && l()) {
            M.e();
            c1.set(this, C4741Xq1.X);
        }
    }

    @Override // o.AbstractC7918m40
    public void a(@Nullable Object obj, @NotNull Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC8857pr1)) {
                if (!(obj2 instanceof QH)) {
                    if (obj2 instanceof OH) {
                        OH oh = (OH) obj2;
                        if (!oh.h()) {
                            Throwable th3 = th;
                            th2 = th3;
                            if (P2.a(b1, this, obj2, OH.g(oh, null, null, null, null, th3, 15, null))) {
                                oh.i(this, th2);
                                return;
                            }
                        } else {
                            throw new IllegalStateException("Must be called at most once");
                        }
                    } else {
                        th2 = th;
                        if (P2.a(b1, this, obj2, new OH(obj2, null, null, null, th2, 14, null))) {
                            return;
                        }
                    }
                    th = th2;
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    @Override // o.AbstractC7918m40
    @NotNull
    public final HM<T> b() {
        return this.Y0;
    }

    @Override // o.InterfaceC8396ny
    public void b0(T t, @Nullable final HA0<? super Throwable, C7458kA2> ha0) {
        XA0 xa0;
        int i = this.Z;
        if (ha0 != null) {
            xa0 = new XA0() { // from class: o.oy
                @Override // o.XA0
                public final Object P(Object obj, Object obj2, Object obj3) {
                    C7458kA2 a0;
                    a0 = C8883py.a0(HA0.this, (Throwable) obj, obj2, (InterfaceC5809dQ) obj3);
                    return a0;
                }
            };
        } else {
            xa0 = null;
        }
        c0(t, i, xa0);
    }

    @Override // o.AbstractC7918m40
    @Nullable
    public Throwable c(@Nullable Object obj) {
        Throwable c = super.c(obj);
        if (c != null) {
            return c;
        }
        return null;
    }

    public final <R> void c0(R r, int i, @Nullable XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC8857pr1) {
                R r2 = r;
                int i2 = i;
                XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa02 = xa0;
                if (P2.a(b1, this, obj, e0((InterfaceC8857pr1) obj, r2, i2, xa02, null))) {
                    v();
                    x(i2);
                    return;
                }
                r = r2;
                i = i2;
                xa0 = xa02;
            } else {
                R r3 = r;
                XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa03 = xa0;
                if (obj instanceof C10836xy) {
                    C10836xy c10836xy = (C10836xy) obj;
                    if (c10836xy.h()) {
                        if (xa03 != null) {
                            r(xa03, c10836xy.a, r3);
                            return;
                        }
                        return;
                    }
                }
                m(r3);
                throw new SX0();
            }
        }
    }

    @Override // o.InterfaceC8396ny
    public boolean d(@Nullable Throwable th) {
        Object obj;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z = false;
            if (!(obj instanceof InterfaceC8857pr1)) {
                return false;
            }
            if ((obj instanceof InterfaceC7406jy) || (obj instanceof QZ1)) {
                z = true;
            }
        } while (!P2.a(b1, this, obj, new C10836xy(this, th, z)));
        InterfaceC8857pr1 interfaceC8857pr1 = (InterfaceC8857pr1) obj;
        if (interfaceC8857pr1 instanceof InterfaceC7406jy) {
            n((InterfaceC7406jy) obj, th);
        } else if (interfaceC8857pr1 instanceof QZ1) {
            s((QZ1) obj, th);
        }
        v();
        x(this.Z);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7918m40
    public <T> T e(@Nullable Object obj) {
        if (obj instanceof OH) {
            return (T) ((OH) obj).a;
        }
        return obj;
    }

    public final <R> Object e0(InterfaceC8857pr1 interfaceC8857pr1, R r, int i, XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0, Object obj) {
        InterfaceC7406jy interfaceC7406jy;
        if (r instanceof QH) {
            return r;
        }
        if ((!C8179n40.c(i) && obj == null) || (xa0 == null && !(interfaceC8857pr1 instanceof InterfaceC7406jy) && obj == null)) {
            return r;
        }
        if (interfaceC8857pr1 instanceof InterfaceC7406jy) {
            interfaceC7406jy = (InterfaceC7406jy) interfaceC8857pr1;
        } else {
            interfaceC7406jy = null;
        }
        return new OH(r, interfaceC7406jy, xa0, obj, null, 16, null);
    }

    @Override // o.InterfaceC8396ny
    public void f0(@NotNull AbstractC7762lQ abstractC7762lQ, @NotNull Throwable th) {
        C7189j40 c7189j40;
        int i;
        HM<T> hm = this.Y0;
        AbstractC7762lQ abstractC7762lQ2 = null;
        if (hm instanceof C7189j40) {
            c7189j40 = (C7189j40) hm;
        } else {
            c7189j40 = null;
        }
        QH qh = new QH(th, false, 2, null);
        if (c7189j40 != null) {
            abstractC7762lQ2 = c7189j40.Y0;
        }
        if (abstractC7762lQ2 == abstractC7762lQ) {
            i = 4;
        } else {
            i = this.Z;
        }
        d0(this, qh, i, null, 4, null);
    }

    @Override // o.InterfaceC10706xQ
    @Nullable
    public InterfaceC10706xQ g() {
        HM<T> hm = this.Y0;
        if (hm instanceof InterfaceC10706xQ) {
            return (InterfaceC10706xQ) hm;
        }
        return null;
    }

    public final /* synthetic */ void g0(int i) {
        this._decisionAndIndex$volatile = i;
    }

    @Override // o.HM
    @NotNull
    public InterfaceC5809dQ getContext() {
        return this.Z0;
    }

    @Override // o.InterfaceC8396ny
    public boolean h() {
        return B() instanceof InterfaceC8857pr1;
    }

    public final /* synthetic */ void h0(Object obj) {
        this._parentHandle$volatile = obj;
    }

    @Override // o.InterfaceC9220rJ2
    public void i(@NotNull QZ1<?> qz1, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a1;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        N(qz1);
    }

    public final /* synthetic */ void i0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // o.InterfaceC8396ny
    public boolean isCancelled() {
        return B() instanceof C10836xy;
    }

    @Override // o.AbstractC7918m40
    @Nullable
    public Object j() {
        return B();
    }

    @Override // o.InterfaceC8396ny
    public void j0(@NotNull Object obj) {
        x(this.Z);
    }

    public final boolean k0() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a1;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!a1.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    @Override // o.InterfaceC8396ny
    public boolean l() {
        return !(B() instanceof InterfaceC8857pr1);
    }

    public final <R> C7592kj2 l0(R r, Object obj, XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b1;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC8857pr1) {
                R r2 = r;
                Object obj3 = obj;
                XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa02 = xa0;
                if (P2.a(b1, this, obj2, e0((InterfaceC8857pr1) obj2, r2, this.Z, xa02, obj3))) {
                    v();
                    return C9133qy.g;
                }
                r = r2;
                xa0 = xa02;
                obj = obj3;
            } else {
                Object obj4 = obj;
                if (!(obj2 instanceof OH) || obj4 == null || ((OH) obj2).d != obj4) {
                    return null;
                }
                return C9133qy.g;
            }
        }
    }

    public final Void m(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final boolean m0() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = a1;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!a1.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    public final void n(@NotNull InterfaceC7406jy interfaceC7406jy, @Nullable Throwable th) {
        try {
            interfaceC7406jy.d(th);
        } catch (Throwable th2) {
            InterfaceC5809dQ context = getContext();
            C8753pQ.b(context, new RH("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final /* synthetic */ void n0(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, HA0<? super Integer, Integer> ha0) {
        int i;
        do {
            i = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, ha0.invoke(Integer.valueOf(i)).intValue()));
    }

    @Override // o.InterfaceC8396ny
    @Nullable
    public Object o(T t, @Nullable Object obj) {
        return l0(t, obj, null);
    }

    public final void p(FA0<C7458kA2> fa0) {
        try {
            fa0.invoke();
        } catch (Throwable th) {
            InterfaceC5809dQ context = getContext();
            C8753pQ.b(context, new RH("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    @Override // o.HM
    public void q(@NotNull Object obj) {
        d0(this, TH.c(obj, this), this.Z, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void r(@NotNull XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0, @NotNull Throwable th, R r) {
        try {
            xa0.P(th, r, getContext());
        } catch (Throwable th2) {
            InterfaceC5809dQ context = getContext();
            C8753pQ.b(context, new RH("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void s(QZ1<?> qz1, Throwable th) {
        int i = a1.get(this) & 536870911;
        if (i != 536870911) {
            try {
                qz1.z(i, th, getContext());
                return;
            } catch (Throwable th2) {
                InterfaceC5809dQ context = getContext();
                C8753pQ.b(context, new RH("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final boolean t(Throwable th) {
        if (!P()) {
            return false;
        }
        HM<T> hm = this.Y0;
        C6562gT0.n(hm, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C7189j40) hm).x(th);
    }

    @NotNull
    public String toString() {
        return T() + '(' + NV.c(this.Y0) + "){" + C() + "}@" + NV.b(this);
    }

    public final void u() {
        B40 z = z();
        if (z == null) {
            return;
        }
        z.e();
        c1.set(this, C4741Xq1.X);
    }

    public final void v() {
        if (!P()) {
            u();
        }
    }

    @Override // o.InterfaceC8396ny
    @Nullable
    public Object w(@NotNull Throwable th) {
        return l0(new QH(th, false, 2, null), null, null);
    }

    public final void x(int i) {
        if (k0()) {
            return;
        }
        C8179n40.a(this, i);
    }

    @NotNull
    public Throwable y(@NotNull RU0 ru0) {
        return ru0.u();
    }

    public final B40 z() {
        return (B40) c1.get(this);
    }
}
