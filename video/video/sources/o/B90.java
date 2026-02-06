package o;

import java.util.AbstractSet;
import java.util.Map;

@InterfaceC7070ia0
/* loaded from: classes3.dex */
public final class B90<E> extends AbstractSet<E> {
    public final Map<?, E> X;
    public final Object Y;

    public B90(Map<?, E> map, Object obj) {
        this.X = (Map) C10664xF1.E(map);
        this.Y = C10664xF1.E(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        E d = d();
        if (d != null && d.equals(obj)) {
            return true;
        }
        return false;
    }

    @MB
    public final E d() {
        return this.X.get(this.Y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public AbstractC6237fB2<E> iterator() {
        E d = d();
        if (d == null) {
            return AbstractC9481sO0.M().iterator();
        }
        return C7052iU0.Y(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        if (d() == null) {
            return 0;
        }
        return 1;
    }
}
