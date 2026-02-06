package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.tP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9728tP0<T> implements Iterable<C9485sP0<? extends T>>, GW0 {
    @NotNull
    public final FA0<Iterator<T>> X;

    /* JADX WARN: Multi-variable type inference failed */
    public C9728tP0(@NotNull FA0<? extends Iterator<? extends T>> fa0) {
        C6562gT0.p(fa0, "iteratorFactory");
        this.X = fa0;
    }

    @Override // java.lang.Iterable
    @NotNull
    public Iterator<C9485sP0<T>> iterator() {
        return new C9971uP0(this.X.invoke());
    }
}
