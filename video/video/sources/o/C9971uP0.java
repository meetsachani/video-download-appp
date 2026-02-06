package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.uP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9971uP0<T> implements Iterator<C9485sP0<? extends T>>, GW0 {
    @NotNull
    public final Iterator<T> X;
    public int Y;

    /* JADX WARN: Multi-variable type inference failed */
    public C9971uP0(@NotNull Iterator<? extends T> it) {
        C6562gT0.p(it, "iterator");
        this.X = it;
    }

    @Override // java.util.Iterator
    @NotNull
    /* renamed from: b */
    public final C9485sP0<T> next() {
        int i = this.Y;
        this.Y = i + 1;
        if (i < 0) {
            C8222nF.Z();
        }
        return new C9485sP0<>(i, this.X.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
