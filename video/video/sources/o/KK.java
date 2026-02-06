package o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class KK<T> implements B02<T> {
    @NotNull
    public final AtomicReference<B02<T>> a;

    public KK(@NotNull B02<? extends T> b02) {
        C6562gT0.p(b02, "sequence");
        this.a = new AtomicReference<>(b02);
    }

    @Override // o.B02
    @NotNull
    public Iterator<T> iterator() {
        B02<T> andSet = this.a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
