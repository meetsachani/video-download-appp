package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.x42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10621x42 implements Iterator<Short>, GW0 {
    @NotNull
    public final Short b() {
        return Short.valueOf(c());
    }

    public abstract short c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Short next() {
        return Short.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
