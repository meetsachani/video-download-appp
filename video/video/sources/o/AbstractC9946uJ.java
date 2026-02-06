package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.AbstractC9946uJ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,265:1\n103#1,7:266\n1#2:273\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n111#1:266,7\n*E\n"})
/* renamed from: o.uJ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC9946uJ<N extends AbstractC9946uJ<N>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(AbstractC9946uJ.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater Y = AtomicReferenceFieldUpdater.newUpdater(AbstractC9946uJ.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC9946uJ(@Nullable N n) {
        this._prev$volatile = n;
    }

    private final /* synthetic */ void u(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, HA0<Object, ? extends Object> ha0) {
        Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!P2.a(atomicReferenceFieldUpdater, obj, obj2, ha0.invoke(obj2)));
    }

    public final void b() {
        Y.set(this, null);
    }

    public final N c() {
        N h = h();
        while (h != null && h.m()) {
            h = (N) Y.get(h);
        }
        return h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [o.uJ] */
    public final N e() {
        ?? f;
        N f2 = f();
        C6562gT0.m(f2);
        while (f2.m() && (f = f2.f()) != 0) {
            f2 = f;
        }
        return f2;
    }

    @Nullable
    public final N f() {
        Object g = g();
        if (g == C9703tJ.a()) {
            return null;
        }
        return (N) g;
    }

    public final Object g() {
        return X.get(this);
    }

    @Nullable
    public final N h() {
        return (N) Y.get(this);
    }

    public final /* synthetic */ Object i() {
        return this._next$volatile;
    }

    public final /* synthetic */ Object k() {
        return this._prev$volatile;
    }

    public abstract boolean m();

    public final boolean n() {
        if (f() == null) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        return P2.a(X, this, null, C9703tJ.a());
    }

    @Nullable
    public final N p(@NotNull FA0 fa0) {
        Object g = g();
        if (g != C9703tJ.a()) {
            return (N) g;
        }
        fa0.invoke();
        throw new SX0();
    }

    public final void q() {
        Object obj;
        N n;
        if (n()) {
            return;
        }
        while (true) {
            N c = c();
            N e = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Y;
            do {
                obj = atomicReferenceFieldUpdater.get(e);
                if (((AbstractC9946uJ) obj) == null) {
                    n = null;
                } else {
                    n = c;
                }
            } while (!P2.a(atomicReferenceFieldUpdater, e, obj, n));
            if (c != null) {
                X.set(c, e);
            }
            if (!e.m() || e.n()) {
                if (c == null || !c.m()) {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void r(Object obj) {
        this._next$volatile = obj;
    }

    public final /* synthetic */ void s(Object obj) {
        this._prev$volatile = obj;
    }

    public final boolean t(@NotNull N n) {
        return P2.a(X, this, null, n);
    }
}
