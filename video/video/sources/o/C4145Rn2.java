package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Rn2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4145Rn2 extends AbstractC6569gV0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b1 = AtomicIntegerFieldUpdater.newUpdater(C4145Rn2.class, "_state$volatile");
    public final Thread Z0 = Thread.currentThread();
    private volatile /* synthetic */ int _state$volatile;
    @Nullable
    public B40 a1;

    @Override // o.AbstractC6569gV0
    public boolean E() {
        return true;
    }

    @Override // o.AbstractC6569gV0
    public void F(@Nullable Throwable th) {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b1;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1 && i != 2 && i != 3) {
                    K(i);
                    throw new SX0();
                }
                return;
            }
        } while (!b1.compareAndSet(this, i, 2));
        this.Z0.interrupt();
        b1.set(this, 3);
    }

    public final void H() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b1;
        while (true) {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        K(i);
                        throw new SX0();
                    }
                }
            } else if (b1.compareAndSet(this, i, 1)) {
                B40 b40 = this.a1;
                if (b40 != null) {
                    b40.e();
                    return;
                }
                return;
            }
        }
    }

    public final /* synthetic */ int I() {
        return this._state$volatile;
    }

    public final Void K(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    public final /* synthetic */ void L(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, HA0<? super Integer, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    public final /* synthetic */ void M(int i) {
        this._state$volatile = i;
    }

    public final void N(@NotNull RU0 ru0) {
        B40 B;
        int i;
        B = C6314fV0.B(ru0, false, this, 1, null);
        this.a1 = B;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b1;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2 && i != 3) {
                    K(i);
                    throw new SX0();
                }
                return;
            }
        } while (!b1.compareAndSet(this, i, 0));
    }
}
