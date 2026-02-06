package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class G40<T, K> implements B02<T> {
    @NotNull
    public final B02<T> a;
    @NotNull
    public final HA0<T, K> b;

    /* JADX WARN: Multi-variable type inference failed */
    public G40(@NotNull B02<? extends T> b02, @NotNull HA0<? super T, ? extends K> ha0) {
        C6562gT0.p(b02, "source");
        C6562gT0.p(ha0, "keySelector");
        this.a = b02;
        this.b = ha0;
    }

    @Override // o.B02
    @NotNull
    public Iterator<T> iterator() {
        return new F40(this.a.iterator(), this.b);
    }
}
