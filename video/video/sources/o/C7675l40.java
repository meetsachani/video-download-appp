package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.l40  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7675l40<T> extends MY1<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Z0 = AtomicIntegerFieldUpdater.newUpdater(C7675l40.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C7675l40(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull HM<? super T> hm) {
        super(interfaceC5809dQ, hm);
    }

    private final /* synthetic */ void W1(Object obj, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, HA0<? super Integer, C7458kA2> ha0) {
        while (true) {
            ha0.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final boolean Y1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Z0;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!Z0.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean Z1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Z0;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!Z0.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // o.MY1, o.AbstractC9384s0
    public void O1(@Nullable Object obj) {
        if (Y1()) {
            return;
        }
        C7432k40.d(C7048iT0.e(this.Y0), TH.a(obj, this.Y0));
    }

    @Nullable
    public final Object T1() {
        if (Z1()) {
            return C7289jT0.l();
        }
        Object h = C7055iV0.h(U0());
        if (!(h instanceof QH)) {
            return h;
        }
        throw ((QH) h).a;
    }

    public final /* synthetic */ int U1() {
        return this._decision$volatile;
    }

    public final /* synthetic */ void X1(int i) {
        this._decision$volatile = i;
    }

    @Override // o.MY1, o.C6812hV0
    public void s0(@Nullable Object obj) {
        O1(obj);
    }
}
