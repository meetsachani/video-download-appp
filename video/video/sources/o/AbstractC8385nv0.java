package o;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.nv0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8385nv0 implements Iterator<Float>, GW0 {
    @NotNull
    public final Float b() {
        return Float.valueOf(c());
    }

    public abstract float c();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Float next() {
        return Float.valueOf(c());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
