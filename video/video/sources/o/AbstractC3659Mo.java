package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Mo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3659Mo implements Iterator<Boolean>, GW0 {
    @NotNull
    public final Boolean b() {
        return Boolean.valueOf(c());
    }

    public abstract boolean c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Boolean next() {
        return Boolean.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
