package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.XZ1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HK1
@InterfaceC8303na2({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,904:1\n1#2:905\n2632#3,3:906\n1863#3,2:918\n1863#3,2:926\n1863#3,2:928\n351#4,9:909\n360#4,2:920\n149#5,4:922\n*S KotlinDebug\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation\n*L\n529#1:906,3\n593#1:918,2\n749#1:926,2\n774#1:928,2\n569#1:909,9\n569#1:920,2\n734#1:922,4\n*E\n"})
/* renamed from: o.g02  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6436g02<R> implements InterfaceC7406jy, XZ1<R>, InterfaceC6934i02<R> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a1 = AtomicReferenceFieldUpdater.newUpdater(C6436g02.class, Object.class, "state$volatile");
    @NotNull
    public final InterfaceC5809dQ X;
    @Nullable
    public List<C6436g02<R>.a> Y;
    public int Y0;
    @Nullable
    public Object Z;
    @Nullable
    public Object Z0;
    private volatile /* synthetic */ Object state$volatile;

    @InterfaceC8303na2({"SMAP\nSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Select.kt\nkotlinx/coroutines/selects/SelectImplementation$ClauseData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,904:1\n1#2:905\n*E\n"})
    /* renamed from: o.g02$a */
    /* loaded from: classes4.dex */
    public final class a {
        @InterfaceC7058iW0
        @NotNull
        public final Object a;
        @NotNull
        public final XA0<Object, InterfaceC6691h02<?>, Object, C7458kA2> b;
        @NotNull
        public final XA0<Object, Object, Object, Object> c;
        @Nullable
        public final Object d;
        @NotNull
        public final Object e;
        @InterfaceC7058iW0
        @Nullable
        public final XA0<InterfaceC6691h02<?>, Object, Object, XA0<Throwable, Object, InterfaceC5809dQ, C7458kA2>> f;
        @InterfaceC7058iW0
        @Nullable
        public Object g;
        @InterfaceC7058iW0
        public int h = -1;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Object obj, @NotNull XA0<Object, ? super InterfaceC6691h02<?>, Object, C7458kA2> xa0, @NotNull XA0<Object, Object, Object, ? extends Object> xa02, @Nullable Object obj2, @NotNull Object obj3, @Nullable XA0<? super InterfaceC6691h02<?>, Object, Object, ? extends XA0<? super Throwable, Object, ? super InterfaceC5809dQ, C7458kA2>> xa03) {
            this.a = obj;
            this.b = xa0;
            this.c = xa02;
            this.d = obj2;
            this.e = obj3;
            this.f = xa03;
        }

        @Nullable
        public final XA0<Throwable, Object, InterfaceC5809dQ, C7458kA2> a(@NotNull InterfaceC6691h02<?> interfaceC6691h02, @Nullable Object obj) {
            XA0<InterfaceC6691h02<?>, Object, Object, XA0<Throwable, Object, InterfaceC5809dQ, C7458kA2>> xa0 = this.f;
            if (xa0 != null) {
                return xa0.P(interfaceC6691h02, this.d, obj);
            }
            return null;
        }

        public final void b() {
            Object obj = this.g;
            C6436g02<R> c6436g02 = C6436g02.this;
            B40 b40 = null;
            if (obj instanceof QZ1) {
                ((QZ1) obj).z(this.h, null, c6436g02.getContext());
                return;
            }
            if (obj instanceof B40) {
                b40 = (B40) obj;
            }
            if (b40 != null) {
                b40.e();
            }
        }

        @Nullable
        public final Object c(@Nullable Object obj, @NotNull HM<? super R> hm) {
            Object obj2 = this.e;
            if (this.d == C7175j02.l()) {
                C6562gT0.n(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
                return ((HA0) obj2).invoke(hm);
            }
            C6562gT0.n(obj2, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((VA0) obj2).i(obj, hm);
        }

        @Nullable
        public final Object d(@Nullable Object obj) {
            return this.c.P(this.a, this.d, obj);
        }

        public final boolean e(@NotNull C6436g02<R> c6436g02) {
            C7592kj2 c7592kj2;
            this.b.P(this.a, c6436g02, this.d);
            Object obj = c6436g02.Z0;
            c7592kj2 = C7175j02.i;
            if (obj == c7592kj2) {
                return true;
            }
            return false;
        }
    }

    @FV(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {0}, l = {453, 456}, m = "doSelectSuspend", n = {"this"}, s = {"L$0"})
    /* renamed from: o.g02$b */
    /* loaded from: classes4.dex */
    public static final class b extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public final /* synthetic */ C6436g02<R> a1;
        public int b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6436g02<R> c6436g02, HM<? super b> hm) {
            super(hm);
            this.a1 = c6436g02;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return this.a1.y(this);
        }
    }

    @FV(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {729}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
    /* renamed from: o.g02$c */
    /* loaded from: classes4.dex */
    public static final class c extends KM {
        public /* synthetic */ Object Y0;
        public final /* synthetic */ C6436g02<R> Z0;
        public int a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6436g02<R> c6436g02, HM<? super c> hm) {
            super(hm);
            this.Z0 = c6436g02;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Y0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return this.Z0.G(null, null, this);
        }
    }

    public C6436g02(@NotNull InterfaceC5809dQ interfaceC5809dQ) {
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        this.X = interfaceC5809dQ;
        c7592kj2 = C7175j02.f;
        this.state$volatile = c7592kj2;
        this.Y = new ArrayList(2);
        this.Y0 = -1;
        c7592kj22 = C7175j02.i;
        this.Z0 = c7592kj22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean D() {
        C7592kj2 c7592kj2;
        Object obj = a1.get(this);
        c7592kj2 = C7175j02.h;
        if (obj == c7592kj2) {
            return true;
        }
        return false;
    }

    private final /* synthetic */ void F(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, HA0<Object, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public static /* synthetic */ void I(C6436g02 c6436g02, a aVar, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            c6436g02.H(aVar, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
    }

    @HK1
    public static /* synthetic */ <R> Object x(C6436g02<R> c6436g02, HM<? super R> hm) {
        if (c6436g02.E()) {
            return c6436g02.v(hm);
        }
        return c6436g02.y(hm);
    }

    public final boolean A() {
        C7592kj2 c7592kj2;
        Object obj = a1.get(this);
        c7592kj2 = C7175j02.f;
        if (obj != c7592kj2 && !(obj instanceof List)) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ Object B() {
        return this.state$volatile;
    }

    public final boolean E() {
        return a1.get(this) instanceof a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(C6436g02<R>.a aVar, Object obj, HM<? super R> hm) {
        c cVar;
        int i;
        if (hm instanceof c) {
            cVar = (c) hm;
            int i2 = cVar.a1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.a1 = i2 - Integer.MIN_VALUE;
                Object obj2 = cVar.Y0;
                Object l = C7289jT0.l();
                i = cVar.a1;
                if (i == 0) {
                    if (i == 1) {
                        RT1.n(obj2);
                        return obj2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                RT1.n(obj2);
                Object d = aVar.d(obj);
                cVar.a1 = 1;
                Object c2 = aVar.c(d, cVar);
                if (c2 == l) {
                    return l;
                }
                return c2;
            }
        }
        cVar = new c(this, hm);
        Object obj22 = cVar.Y0;
        Object l2 = C7289jT0.l();
        i = cVar.a1;
        if (i == 0) {
        }
    }

    @InterfaceC8046mW0(name = "register")
    public final void H(@NotNull C6436g02<R>.a aVar, boolean z) {
        if (a1.get(this) instanceof a) {
            return;
        }
        if (!z) {
            t(aVar.a);
        }
        if (aVar.e(this)) {
            if (!z) {
                List<C6436g02<R>.a> list = this.Y;
                C6562gT0.m(list);
                list.add(aVar);
            }
            aVar.g = this.Z;
            aVar.h = this.Y0;
            this.Z = null;
            this.Y0 = -1;
            return;
        }
        a1.set(this, aVar);
    }

    public final void J(Object obj) {
        C6436g02<R>.a z = z(obj);
        C6562gT0.m(z);
        z.g = null;
        z.h = -1;
        H(z, true);
    }

    public final /* synthetic */ void K(Object obj) {
        this.state$volatile = obj;
    }

    @NotNull
    public final Tu2 L(@NotNull Object obj, @Nullable Object obj2) {
        Tu2 d;
        d = C7175j02.d(M(obj, obj2));
        return d;
    }

    public final int M(Object obj, Object obj2) {
        boolean o2;
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        C7592kj2 c7592kj23;
        C7592kj2 c7592kj24;
        while (true) {
            Object obj3 = a1.get(this);
            if (!(obj3 instanceof InterfaceC8396ny)) {
                c7592kj22 = C7175j02.g;
                if (!C6562gT0.g(obj3, c7592kj22) && !(obj3 instanceof a)) {
                    c7592kj23 = C7175j02.h;
                    if (!C6562gT0.g(obj3, c7592kj23)) {
                        c7592kj24 = C7175j02.f;
                        if (C6562gT0.g(obj3, c7592kj24)) {
                            if (P2.a(a1, this, obj3, C7979mF.k(obj))) {
                                return 1;
                            }
                        } else if (obj3 instanceof List) {
                            if (P2.a(a1, this, obj3, C10662xF.H4((Collection) obj3, obj))) {
                                return 1;
                            }
                        } else {
                            throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                        }
                    } else {
                        return 2;
                    }
                } else {
                    return 3;
                }
            } else {
                C6436g02<R>.a z = z(obj);
                if (z == null) {
                    continue;
                } else {
                    XA0<Throwable, Object, InterfaceC5809dQ, C7458kA2> a2 = z.a(this, obj2);
                    if (P2.a(a1, this, obj3, z)) {
                        this.Z0 = obj2;
                        o2 = C7175j02.o((InterfaceC8396ny) obj3, a2);
                        if (!o2) {
                            c7592kj2 = C7175j02.i;
                            this.Z0 = c7592kj2;
                            return 2;
                        }
                        return 0;
                    }
                }
            }
        }
    }

    public final /* synthetic */ void N(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, HA0<Object, ? extends Object> ha0) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!P2.a(atomicReferenceFieldUpdater, obj, obj2, ha0.invoke(obj2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
        r0 = r0.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        if (r0 != o.C7289jT0.l()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        o.MV.c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r0 != o.C7289jT0.l()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        return o.C7458kA2.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(HM<? super C7458kA2> hm) {
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        C8883py c8883py = new C8883py(C7048iT0.e(hm), 1);
        c8883py.Z();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a1;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c7592kj2 = C7175j02.f;
            if (obj == c7592kj2) {
                if (P2.a(a1, this, obj, c8883py)) {
                    C9375ry.c(c8883py, this);
                    break;
                }
            } else if (obj instanceof List) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a1;
                c7592kj22 = C7175j02.f;
                if (P2.a(atomicReferenceFieldUpdater2, this, obj, c7592kj22)) {
                    for (Object obj2 : (Iterable) obj) {
                        J(obj2);
                    }
                }
            } else if (obj instanceof a) {
                c8883py.K(C7458kA2.a, ((a) obj).a(this, this.Z0));
            } else {
                throw new IllegalStateException(("unexpected state: " + obj).toString());
            }
        }
    }

    @Override // o.XZ1
    public <P, Q> void a(@NotNull InterfaceC5708d02<? super P, ? extends Q> interfaceC5708d02, @NotNull VA0<? super Q, ? super HM<? super R>, ? extends Object> va0) {
        XZ1.a.a(this, interfaceC5708d02, va0);
    }

    @Override // o.XZ1
    @InterfaceC2951Fi0
    @R61
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Replaced with the same extension function", replaceWith = @IR1(expression = "onTimeout", imports = {"kotlinx.coroutines.selects.onTimeout"}))
    public void b(long j, @NotNull HA0<? super HM<? super R>, ? extends Object> ha0) {
        XZ1.a.b(this, j, ha0);
    }

    @Override // o.XZ1
    public <P, Q> void c(@NotNull InterfaceC5708d02<? super P, ? extends Q> interfaceC5708d02, P p, @NotNull VA0<? super Q, ? super HM<? super R>, ? extends Object> va0) {
        I(this, new a(interfaceC5708d02.d(), interfaceC5708d02.a(), interfaceC5708d02.c(), p, va0, interfaceC5708d02.b()), false, 1, null);
    }

    @Override // o.InterfaceC7406jy
    public void d(@Nullable Throwable th) {
        Object obj;
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        C7592kj2 c7592kj23;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a1;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            c7592kj2 = C7175j02.g;
            if (obj != c7592kj2) {
                c7592kj22 = C7175j02.h;
            } else {
                return;
            }
        } while (!P2.a(atomicReferenceFieldUpdater, this, obj, c7592kj22));
        List<C6436g02<R>.a> list = this.Y;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b();
        }
        c7592kj23 = C7175j02.i;
        this.Z0 = c7592kj23;
        this.Y = null;
    }

    @Override // o.InterfaceC6691h02
    public void e(@Nullable Object obj) {
        this.Z0 = obj;
    }

    @Override // o.InterfaceC6691h02
    public void f(@NotNull B40 b40) {
        this.Z = b40;
    }

    @Override // o.XZ1
    public void g(@NotNull ZZ1 zz1, @NotNull HA0<? super HM<? super R>, ? extends Object> ha0) {
        I(this, new a(zz1.d(), zz1.a(), zz1.c(), C7175j02.l(), ha0, zz1.b()), false, 1, null);
    }

    @Override // o.InterfaceC6691h02
    @NotNull
    public InterfaceC5809dQ getContext() {
        return this.X;
    }

    @Override // o.InterfaceC6691h02
    public boolean h(@NotNull Object obj, @Nullable Object obj2) {
        if (M(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC9220rJ2
    public void i(@NotNull QZ1<?> qz1, int i) {
        this.Z = qz1;
        this.Y0 = i;
    }

    @Override // o.XZ1
    public <Q> void j(@NotNull InterfaceC5223b02<? extends Q> interfaceC5223b02, @NotNull VA0<? super Q, ? super HM<? super R>, ? extends Object> va0) {
        I(this, new a(interfaceC5223b02.d(), interfaceC5223b02.a(), interfaceC5223b02.c(), null, va0, interfaceC5223b02.b()), false, 1, null);
    }

    public final void t(Object obj) {
        List<C6436g02<R>.a> list = this.Y;
        C6562gT0.m(list);
        List<C6436g02<R>.a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).a == obj) {
                throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
            }
        }
    }

    public final void u(C6436g02<R>.a aVar) {
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        List<C6436g02<R>.a> list = this.Y;
        if (list == null) {
            return;
        }
        for (C6436g02<R>.a aVar2 : list) {
            if (aVar2 != aVar) {
                aVar2.b();
            }
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a1;
        c7592kj2 = C7175j02.g;
        atomicReferenceFieldUpdater.set(this, c7592kj2);
        c7592kj22 = C7175j02.i;
        this.Z0 = c7592kj22;
        this.Y = null;
    }

    public final Object v(HM<? super R> hm) {
        Object obj = a1.get(this);
        C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        C6436g02<R>.a aVar = (a) obj;
        Object obj2 = this.Z0;
        u(aVar);
        return aVar.c(aVar.d(obj2), hm);
    }

    @HK1
    @Nullable
    public Object w(@NotNull HM<? super R> hm) {
        return x(this, hm);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(HM<? super R> hm) {
        b bVar;
        Object l;
        int i;
        C6436g02<R> c6436g02;
        Object v;
        if (hm instanceof b) {
            bVar = (b) hm;
            int i2 = bVar.b1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.b1 = i2 - Integer.MIN_VALUE;
                Object obj = bVar.Z0;
                l = C7289jT0.l();
                i = bVar.b1;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            RT1.n(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c6436g02 = (C6436g02) bVar.Y0;
                    RT1.n(obj);
                } else {
                    RT1.n(obj);
                    bVar.Y0 = this;
                    bVar.b1 = 1;
                    if (O(bVar) != l) {
                        c6436g02 = this;
                    }
                    return l;
                }
                bVar.Y0 = null;
                bVar.b1 = 2;
                v = c6436g02.v(bVar);
                if (v != l) {
                    return l;
                }
                return v;
            }
        }
        bVar = new b(this, hm);
        Object obj2 = bVar.Z0;
        l = C7289jT0.l();
        i = bVar.b1;
        if (i == 0) {
        }
        bVar.Y0 = null;
        bVar.b1 = 2;
        v = c6436g02.v(bVar);
        if (v != l) {
        }
    }

    public final C6436g02<R>.a z(Object obj) {
        List<C6436g02<R>.a> list = this.Y;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        C6436g02<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }
}
