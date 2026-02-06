package o;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.r31  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9155r31<E> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(C9155r31.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C9155r31(boolean z) {
        this._cur$volatile = new C9398s31(8, z);
    }

    public final boolean a(@NotNull E e) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            C9398s31 c9398s31 = (C9398s31) atomicReferenceFieldUpdater.get(this);
            int a2 = c9398s31.a(e);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                if (a2 == 2) {
                    return false;
                }
            } else {
                P2.a(a, this, c9398s31, c9398s31.r());
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            C9398s31 c9398s31 = (C9398s31) atomicReferenceFieldUpdater.get(this);
            if (c9398s31.d()) {
                return;
            }
            P2.a(a, this, c9398s31, c9398s31.r());
        }
    }

    public final int c() {
        return ((C9398s31) a.get(this)).g();
    }

    public final /* synthetic */ Object d() {
        return this._cur$volatile;
    }

    public final boolean f() {
        return ((C9398s31) a.get(this)).l();
    }

    public final boolean g() {
        return ((C9398s31) a.get(this)).m();
    }

    public final /* synthetic */ void h(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, HA0<Object, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @NotNull
    public final <R> List<R> i(@NotNull HA0<? super E, ? extends R> ha0) {
        return ((C9398s31) a.get(this)).p(ha0);
    }

    @Nullable
    public final E j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (true) {
            C9398s31 c9398s31 = (C9398s31) atomicReferenceFieldUpdater.get(this);
            E e = (E) c9398s31.s();
            if (e != C9398s31.t) {
                return e;
            }
            P2.a(a, this, c9398s31, c9398s31.r());
        }
    }

    public final /* synthetic */ void k(Object obj) {
        this._cur$volatile = obj;
    }
}
