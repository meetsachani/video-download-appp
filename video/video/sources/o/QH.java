package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class QH {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(QH.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    @InterfaceC7058iW0
    @NotNull
    public final Throwable a;

    public QH(@NotNull Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }

    public final boolean a() {
        if (b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ int b() {
        return this._handled$volatile;
    }

    public final boolean d() {
        return b.compareAndSet(this, 0, 1);
    }

    public final /* synthetic */ void e(int i) {
        this._handled$volatile = i;
    }

    @NotNull
    public String toString() {
        return NV.a(this) + '[' + this.a + ']';
    }

    public /* synthetic */ QH(Throwable th, boolean z, int i, C9516sY c9516sY) {
        this(th, (i & 2) != 0 ? false : z);
    }
}
