package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.xy  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10836xy extends QH {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(C10836xy.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10836xy(@NotNull HM<?> hm, @Nullable Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + hm + " was cancelled normally");
        }
        this._resumed$volatile = 0;
    }

    public final /* synthetic */ int f() {
        return this._resumed$volatile;
    }

    public final boolean h() {
        return c.compareAndSet(this, 0, 1);
    }

    public final /* synthetic */ void i(int i) {
        this._resumed$volatile = i;
    }
}
