package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public abstract class RA implements Iterator<Character>, GW0 {
    @NotNull
    public final Character b() {
        return Character.valueOf(c());
    }

    public abstract char c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Character next() {
        return Character.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
