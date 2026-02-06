package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.oR0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8515oR0 implements Iterator<Integer>, GW0 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Integer next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public final Integer next() {
        return Integer.valueOf(nextInt());
    }
}
