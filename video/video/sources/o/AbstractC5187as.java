package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.as  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5187as implements Iterator<Byte>, GW0 {
    public abstract byte I0();

    @NotNull
    public final Byte b() {
        return Byte.valueOf(I0());
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Byte next() {
        return Byte.valueOf(I0());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
