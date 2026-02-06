package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.C5900do1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n369#2,12:315\n1#3:327\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n171#1:315,12\n*E\n"})
/* renamed from: o.do1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5900do1 extends C9144r02 implements InterfaceC4826Yn1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(C5900do1.class, Object.class, "owner$volatile");
    @NotNull
    public final XA0<InterfaceC6691h02<?>, Object, Object, XA0<Throwable, Object, InterfaceC5809dQ, C7458kA2>> h;
    private volatile /* synthetic */ Object owner$volatile;

    @InterfaceC8303na2({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    /* renamed from: o.do1$a */
    /* loaded from: classes4.dex */
    public final class a implements InterfaceC8396ny<C7458kA2>, InterfaceC9220rJ2 {
        @InterfaceC7058iW0
        @NotNull
        public final C8883py<C7458kA2> X;
        @InterfaceC7058iW0
        @Nullable
        public final Object Y;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull C8883py<? super C7458kA2> c8883py, @Nullable Object obj) {
            this.X = c8883py;
            this.Y = obj;
        }

        public static final C7458kA2 f(C5900do1 c5900do1, a aVar, Throwable th) {
            c5900do1.h(aVar.Y);
            return C7458kA2.a;
        }

        public static final C7458kA2 m(C5900do1 c5900do1, a aVar, Throwable th, C7458kA2 c7458kA2, InterfaceC5809dQ interfaceC5809dQ) {
            C5900do1.O().set(c5900do1, aVar.Y);
            c5900do1.h(aVar.Y);
            return C7458kA2.a;
        }

        @Override // o.InterfaceC8396ny
        public void X(@NotNull HA0<? super Throwable, C7458kA2> ha0) {
            this.X.X(ha0);
        }

        @Override // o.InterfaceC8396ny
        @InterfaceC10472wS0
        public void Z() {
            this.X.Z();
        }

        @Override // o.InterfaceC8396ny
        @InterfaceC9150r20(level = EnumC9879u20.X, message = "Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith = @IR1(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
        /* renamed from: c */
        public void b0(@NotNull C7458kA2 c7458kA2, @Nullable HA0<? super Throwable, C7458kA2> ha0) {
            this.X.b0(c7458kA2, ha0);
        }

        @Override // o.InterfaceC8396ny
        public boolean d(@Nullable Throwable th) {
            return this.X.d(th);
        }

        @Override // o.InterfaceC8396ny
        /* renamed from: e */
        public <R extends C7458kA2> void K(@NotNull R r, @Nullable XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0) {
            C5900do1.O().set(C5900do1.this, this.Y);
            C8883py<C7458kA2> c8883py = this.X;
            final C5900do1 c5900do1 = C5900do1.this;
            c8883py.b0(r, new HA0() { // from class: o.co1
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    C7458kA2 f;
                    f = C5900do1.a.f(C5900do1.this, this, (Throwable) obj);
                    return f;
                }
            });
        }

        @Override // o.InterfaceC8396ny
        @InterfaceC2951Fi0
        public void f0(@NotNull AbstractC7762lQ abstractC7762lQ, @NotNull Throwable th) {
            this.X.f0(abstractC7762lQ, th);
        }

        @Override // o.InterfaceC8396ny
        @InterfaceC2951Fi0
        /* renamed from: g */
        public void E(@NotNull AbstractC7762lQ abstractC7762lQ, @NotNull C7458kA2 c7458kA2) {
            this.X.E(abstractC7762lQ, c7458kA2);
        }

        @Override // o.HM
        @NotNull
        public InterfaceC5809dQ getContext() {
            return this.X.getContext();
        }

        @Override // o.InterfaceC8396ny
        public boolean h() {
            return this.X.h();
        }

        @Override // o.InterfaceC9220rJ2
        public void i(@NotNull QZ1<?> qz1, int i) {
            this.X.i(qz1, i);
        }

        @Override // o.InterfaceC8396ny
        public boolean isCancelled() {
            return this.X.isCancelled();
        }

        @Override // o.InterfaceC8396ny
        @InterfaceC10472wS0
        @Nullable
        /* renamed from: j */
        public Object o(@NotNull C7458kA2 c7458kA2, @Nullable Object obj) {
            return this.X.o(c7458kA2, obj);
        }

        @Override // o.InterfaceC8396ny
        @InterfaceC10472wS0
        public void j0(@NotNull Object obj) {
            this.X.j0(obj);
        }

        @Override // o.InterfaceC8396ny
        @Nullable
        /* renamed from: k */
        public <R extends C7458kA2> Object I(@NotNull R r, @Nullable Object obj, @Nullable XA0<? super Throwable, ? super R, ? super InterfaceC5809dQ, C7458kA2> xa0) {
            final C5900do1 c5900do1 = C5900do1.this;
            Object I = this.X.I(r, obj, new XA0() { // from class: o.bo1
                @Override // o.XA0
                public final Object P(Object obj2, Object obj3, Object obj4) {
                    C7458kA2 m;
                    m = C5900do1.a.m(C5900do1.this, this, (Throwable) obj2, (C7458kA2) obj3, (InterfaceC5809dQ) obj4);
                    return m;
                }
            });
            if (I != null) {
                C5900do1.O().set(C5900do1.this, this.Y);
            }
            return I;
        }

        @Override // o.InterfaceC8396ny
        public boolean l() {
            return this.X.l();
        }

        @Override // o.HM
        public void q(@NotNull Object obj) {
            this.X.q(obj);
        }

        @Override // o.InterfaceC8396ny
        @InterfaceC10472wS0
        @Nullable
        public Object w(@NotNull Throwable th) {
            return this.X.w(th);
        }
    }

    @InterfaceC8303na2({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n1#2:315\n*E\n"})
    /* renamed from: o.do1$b */
    /* loaded from: classes4.dex */
    public final class b<Q> implements InterfaceC6934i02<Q> {
        @InterfaceC7058iW0
        @NotNull
        public final InterfaceC6934i02<Q> X;
        @InterfaceC7058iW0
        @Nullable
        public final Object Y;

        public b(@NotNull InterfaceC6934i02<Q> interfaceC6934i02, @Nullable Object obj) {
            this.X = interfaceC6934i02;
            this.Y = obj;
        }

        @Override // o.InterfaceC6691h02
        public void e(@Nullable Object obj) {
            C5900do1.O().set(C5900do1.this, this.Y);
            this.X.e(obj);
        }

        @Override // o.InterfaceC6691h02
        public void f(@NotNull B40 b40) {
            this.X.f(b40);
        }

        @Override // o.InterfaceC6691h02
        @NotNull
        public InterfaceC5809dQ getContext() {
            return this.X.getContext();
        }

        @Override // o.InterfaceC6691h02
        public boolean h(@NotNull Object obj, @Nullable Object obj2) {
            boolean h = this.X.h(obj, obj2);
            C5900do1 c5900do1 = C5900do1.this;
            if (h) {
                C5900do1.O().set(c5900do1, this.Y);
            }
            return h;
        }

        @Override // o.InterfaceC9220rJ2
        public void i(@NotNull QZ1<?> qz1, int i) {
            this.X.i(qz1, i);
        }
    }

    /* renamed from: o.do1$c */
    /* loaded from: classes4.dex */
    public /* synthetic */ class c extends C7964mB0 implements XA0<C5900do1, InterfaceC6691h02<?>, Object, C7458kA2> {
        public static final c e1 = new c();

        public c() {
            super(3, C5900do1.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // o.XA0
        public /* bridge */ /* synthetic */ C7458kA2 P(C5900do1 c5900do1, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            u0(c5900do1, interfaceC6691h02, obj);
            return C7458kA2.a;
        }

        public final void u0(C5900do1 c5900do1, InterfaceC6691h02<?> interfaceC6691h02, Object obj) {
            c5900do1.X(interfaceC6691h02, obj);
        }
    }

    /* renamed from: o.do1$d */
    /* loaded from: classes4.dex */
    public /* synthetic */ class d extends C7964mB0 implements XA0<C5900do1, Object, Object, Object> {
        public static final d e1 = new d();

        public d() {
            super(3, C5900do1.class, "onLockProcessResult", "onLockProcessResult(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // o.XA0
        /* renamed from: u0 */
        public final Object P(C5900do1 c5900do1, Object obj, Object obj2) {
            return c5900do1.W(obj, obj2);
        }
    }

    public C5900do1(boolean z) {
        super(1, z ? 1 : 0);
        C7592kj2 c7592kj2;
        if (!z) {
            c7592kj2 = C6143eo1.a;
        } else {
            c7592kj2 = null;
        }
        this.owner$volatile = c7592kj2;
        this.h = new XA0() { // from class: o.ao1
            @Override // o.XA0
            public final Object P(Object obj, Object obj2, Object obj3) {
                XA0 Y;
                Y = C5900do1.Y(C5900do1.this, (InterfaceC6691h02) obj, obj2, obj3);
                return Y;
            }
        };
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater O() {
        return i;
    }

    public static /* synthetic */ Object U(C5900do1 c5900do1, Object obj, HM<? super C7458kA2> hm) {
        if (c5900do1.d(obj)) {
            return C7458kA2.a;
        }
        Object V = c5900do1.V(obj, hm);
        if (V == C7289jT0.l()) {
            return V;
        }
        return C7458kA2.a;
    }

    public static final XA0 Y(final C5900do1 c5900do1, InterfaceC6691h02 interfaceC6691h02, final Object obj, Object obj2) {
        return new XA0() { // from class: o.Zn1
            @Override // o.XA0
            public final Object P(Object obj3, Object obj4, Object obj5) {
                C7458kA2 Z;
                Z = C5900do1.Z(C5900do1.this, obj, (Throwable) obj3, obj4, (InterfaceC5809dQ) obj5);
                return Z;
            }
        };
    }

    public static final C7458kA2 Z(C5900do1 c5900do1, Object obj, Throwable th, Object obj2, InterfaceC5809dQ interfaceC5809dQ) {
        c5900do1.h(obj);
        return C7458kA2.a;
    }

    public final /* synthetic */ Object R() {
        return this.owner$volatile;
    }

    public final int T(Object obj) {
        C7592kj2 c7592kj2;
        while (f()) {
            Object obj2 = i.get(this);
            c7592kj2 = C6143eo1.a;
            if (obj2 != c7592kj2) {
                if (obj2 == obj) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }

    public final Object V(Object obj, HM<? super C7458kA2> hm) {
        C8883py b2 = C9375ry.b(C7048iT0.e(hm));
        try {
            o(new a(b2, obj));
            Object A = b2.A();
            if (A == C7289jT0.l()) {
                MV.c(hm);
            }
            if (A == C7289jT0.l()) {
                return A;
            }
            return C7458kA2.a;
        } catch (Throwable th) {
            b2.V();
            throw th;
        }
    }

    @Nullable
    public Object W(@Nullable Object obj, @Nullable Object obj2) {
        C7592kj2 c7592kj2;
        c7592kj2 = C6143eo1.b;
        if (!C6562gT0.g(obj2, c7592kj2)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public void X(@NotNull InterfaceC6691h02<?> interfaceC6691h02, @Nullable Object obj) {
        C7592kj2 c7592kj2;
        if (obj != null && i(obj)) {
            c7592kj2 = C6143eo1.b;
            interfaceC6691h02.e(c7592kj2);
            return;
        }
        C6562gT0.n(interfaceC6691h02, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
        D(new b((InterfaceC6934i02) interfaceC6691h02, obj), obj);
    }

    public final /* synthetic */ void a0(Object obj) {
        this.owner$volatile = obj;
    }

    public final int b0(Object obj) {
        while (!c()) {
            if (obj == null) {
                return 1;
            }
            int T = T(obj);
            if (T == 1) {
                return 2;
            }
            if (T == 2) {
                return 1;
            }
        }
        i.set(this, obj);
        return 0;
    }

    @Override // o.InterfaceC4826Yn1
    public boolean d(@Nullable Object obj) {
        int b0 = b0(obj);
        if (b0 == 0) {
            return true;
        }
        if (b0 != 1) {
            if (b0 != 2) {
                throw new IllegalStateException("unexpected");
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }

    @Override // o.InterfaceC4826Yn1
    @Nullable
    public Object e(@Nullable Object obj, @NotNull HM<? super C7458kA2> hm) {
        return U(this, obj, hm);
    }

    @Override // o.InterfaceC4826Yn1
    public boolean f() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC4826Yn1
    public void h(@Nullable Object obj) {
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        while (f()) {
            Object obj2 = i.get(this);
            c7592kj2 = C6143eo1.a;
            if (obj2 != c7592kj2) {
                if (obj2 == obj || obj == null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
                    c7592kj22 = C6143eo1.a;
                    if (P2.a(atomicReferenceFieldUpdater, this, obj2, c7592kj22)) {
                        g();
                        return;
                    }
                } else {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // o.InterfaceC4826Yn1
    public boolean i(@NotNull Object obj) {
        if (T(obj) == 1) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC4826Yn1
    @NotNull
    public InterfaceC5708d02<Object, InterfaceC4826Yn1> j() {
        c cVar = c.e1;
        C6562gT0.n(cVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        d dVar = d.e1;
        C6562gT0.n(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new C5950e02(this, (XA0) C11313zv2.q(cVar, 3), (XA0) C11313zv2.q(dVar, 3), this.h);
    }

    @NotNull
    public String toString() {
        return "Mutex@" + NV.b(this) + "[isLocked=" + f() + ",owner=" + i.get(this) + ']';
    }

    public static /* synthetic */ void Q() {
    }
}
