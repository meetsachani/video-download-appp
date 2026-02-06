package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
@InterfaceC10472wS0
/* renamed from: o.q31  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C8906q31 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(C8906q31.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(C8906q31.class, Object.class, "_prev$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(C8906q31.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final /* synthetic */ void A(Object obj) {
        this._prev$volatile = obj;
    }

    public final /* synthetic */ void B(Object obj) {
        this._removedRef$volatile = obj;
    }

    public final boolean b(@NotNull C8906q31 c8906q31, int i) {
        C8906q31 n;
        do {
            n = n();
            if (n instanceof P01) {
                if ((((P01) n).Y0 & i) == 0 && n.b(c8906q31, i)) {
                    return true;
                }
                return false;
            }
        } while (!n.c(c8906q31, this));
        return true;
    }

    @HK1
    public final boolean c(@NotNull C8906q31 c8906q31, @NotNull C8906q31 c8906q312) {
        Y.set(c8906q31, this);
        X.set(c8906q31, c8906q312);
        if (!P2.a(X, this, c8906q312, c8906q31)) {
            return false;
        }
        c8906q31.k(c8906q312);
        return true;
    }

    public final boolean d(@NotNull C8906q31 c8906q31) {
        Y.set(c8906q31, this);
        X.set(c8906q31, this);
        while (l() == this) {
            if (P2.a(X, this, this, c8906q31)) {
                c8906q31.k(this);
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        b(new P01(i), i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        if (o.P2.a(o.C8906q31.X, r3, r2, ((o.C9980uR1) r4).a) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C8906q31 i() {
        while (true) {
            C8906q31 c8906q31 = (C8906q31) Y.get(this);
            C8906q31 c8906q312 = c8906q31;
            while (true) {
                C8906q31 c8906q313 = null;
                while (true) {
                    Object obj = X.get(c8906q312);
                    if (obj == this) {
                        if (c8906q31 != c8906q312 && !P2.a(Y, this, c8906q31, c8906q312)) {
                        }
                    } else if (u()) {
                        return null;
                    } else {
                        if (obj instanceof C9980uR1) {
                            if (c8906q313 != null) {
                                break;
                            }
                            c8906q312 = (C8906q31) Y.get(c8906q312);
                        } else {
                            C6562gT0.n(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                            c8906q313 = c8906q312;
                            c8906q312 = (C8906q31) obj;
                        }
                    }
                }
                c8906q312 = c8906q313;
            }
        }
    }

    public final C8906q31 j(C8906q31 c8906q31) {
        while (c8906q31.u()) {
            c8906q31 = (C8906q31) Y.get(c8906q31);
        }
        return c8906q31;
    }

    public final void k(C8906q31 c8906q31) {
        C8906q31 c8906q312;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
        do {
            c8906q312 = (C8906q31) atomicReferenceFieldUpdater.get(c8906q31);
            if (l() != c8906q31) {
                return;
            }
        } while (!P2.a(Y, c8906q31, c8906q312, this));
        if (u()) {
            c8906q31.i();
        }
    }

    @NotNull
    public final Object l() {
        return X.get(this);
    }

    @NotNull
    public final C8906q31 m() {
        C9980uR1 c9980uR1;
        C8906q31 c8906q31;
        Object l = l();
        if (l instanceof C9980uR1) {
            c9980uR1 = (C9980uR1) l;
        } else {
            c9980uR1 = null;
        }
        if (c9980uR1 != null && (c8906q31 = c9980uR1.a) != null) {
            return c8906q31;
        }
        C6562gT0.n(l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (C8906q31) l;
    }

    @NotNull
    public final C8906q31 n() {
        C8906q31 i = i();
        if (i == null) {
            return j((C8906q31) Y.get(this));
        }
        return i;
    }

    public final /* synthetic */ Object o() {
        return this._next$volatile;
    }

    public final /* synthetic */ Object q() {
        return this._prev$volatile;
    }

    public final /* synthetic */ Object s() {
        return this._removedRef$volatile;
    }

    @NotNull
    public String toString() {
        return new FJ1(this) { // from class: o.q31.a
            @Override // o.FJ1, o.UW0
            public Object get() {
                return NV.a(this.Y);
            }
        } + C11304zt1.a + NV.b(this);
    }

    public boolean u() {
        return l() instanceof C9980uR1;
    }

    public final /* synthetic */ void v(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, HA0<Object, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public boolean w() {
        if (x() == null) {
            return true;
        }
        return false;
    }

    @HK1
    @Nullable
    public final C8906q31 x() {
        Object l;
        C8906q31 c8906q31;
        do {
            l = l();
            if (l instanceof C9980uR1) {
                return ((C9980uR1) l).a;
            }
            if (l == this) {
                return (C8906q31) l;
            }
            C6562gT0.n(l, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            c8906q31 = (C8906q31) l;
        } while (!P2.a(X, this, l, c8906q31.y()));
        c8906q31.i();
        return null;
    }

    public final C9980uR1 y() {
        C9980uR1 c9980uR1 = (C9980uR1) Z.get(this);
        if (c9980uR1 == null) {
            C9980uR1 c9980uR12 = new C9980uR1(this);
            Z.set(this, c9980uR12);
            return c9980uR12;
        }
        return c9980uR1;
    }

    public final /* synthetic */ void z(Object obj) {
        this._next$volatile = obj;
    }

    public final void C(@NotNull C8906q31 c8906q31, @NotNull C8906q31 c8906q312) {
    }
}
