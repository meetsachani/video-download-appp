package o;

import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class F40<T, K> extends AbstractC6692h1<T> {
    @NotNull
    public final HA0<T, K> Y0;
    @NotNull
    public final Iterator<T> Z;
    @NotNull
    public final HashSet<K> Z0;

    /* JADX WARN: Multi-variable type inference failed */
    public F40(@NotNull Iterator<? extends T> it, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(it, "source");
        C6562gT0.p(ha0, "keySelector");
        this.Z = it;
        this.Y0 = ha0;
        this.Z0 = new HashSet<>();
    }

    @Override // o.AbstractC6692h1
    public void b() {
        while (this.Z.hasNext()) {
            T next = this.Z.next();
            if (this.Z0.add(this.Y0.invoke(next))) {
                d(next);
                return;
            }
        }
        c();
    }
}
