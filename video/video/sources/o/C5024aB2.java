package o;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: o.aB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5024aB2 extends S2 implements RA2 {
    private static final long serialVersionUID = -239892006883819945L;

    public C5024aB2(Collection collection) {
        super(collection);
    }

    public static Collection e(Collection collection) {
        if (collection instanceof RA2) {
            return collection;
        }
        return new C5024aB2(collection);
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return C5752dB2.b(d().iterator());
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // o.AbstractC8405o0, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }
}
