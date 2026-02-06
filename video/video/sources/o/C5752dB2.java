package o;

import java.util.Iterator;

/* renamed from: o.dB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5752dB2 implements Iterator, RA2 {
    public Iterator X;

    public C5752dB2(Iterator it) {
        this.X = it;
    }

    public static Iterator b(Iterator it) {
        if (it != null) {
            if (it instanceof RA2) {
                return it;
            }
            return new C5752dB2(it);
        }
        throw new IllegalArgumentException("Iterator must not be null");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // java.util.Iterator
    public Object next() {
        return this.X.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }
}
