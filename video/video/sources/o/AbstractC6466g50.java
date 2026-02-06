package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.g50  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6466g50 implements Iterator<Double>, GW0 {
    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Double next() {
        return Double.valueOf(nextDouble());
    }

    public abstract double nextDouble();

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public final Double next() {
        return Double.valueOf(nextDouble());
    }
}
