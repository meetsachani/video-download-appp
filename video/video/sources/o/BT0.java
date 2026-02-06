package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class BT0 extends AbstractC6569gV0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a1 = AtomicIntegerFieldUpdater.newUpdater(BT0.class, "_invoked$volatile");
    @NotNull
    public final HA0<Throwable, C7458kA2> Z0;
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public BT0(@NotNull HA0<? super Throwable, C7458kA2> ha0) {
        this.Z0 = ha0;
    }

    @Override // o.AbstractC6569gV0
    public boolean E() {
        return true;
    }

    @Override // o.AbstractC6569gV0
    public void F(@Nullable Throwable th) {
        if (a1.compareAndSet(this, 0, 1)) {
            this.Z0.invoke(th);
        }
    }

    public final /* synthetic */ int H() {
        return this._invoked$volatile;
    }

    public final /* synthetic */ void J(int i) {
        this._invoked$volatile = i;
    }
}
