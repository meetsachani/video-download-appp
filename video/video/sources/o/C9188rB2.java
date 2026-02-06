package o;

/* renamed from: o.rB2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9188rB2 implements V71, RA2 {
    public V71 X;

    public C9188rB2(V71 v71) {
        this.X = v71;
    }

    public static V71 b(V71 v71) {
        if (v71 != null) {
            if (v71 instanceof RA2) {
                return v71;
            }
            return new C9188rB2(v71);
        }
        throw new IllegalArgumentException("MapIterator must not be null");
    }

    @Override // o.V71
    public Object getKey() {
        return this.X.getKey();
    }

    @Override // o.V71
    public Object getValue() {
        return this.X.getValue();
    }

    @Override // o.V71, java.util.Iterator
    public boolean hasNext() {
        return this.X.hasNext();
    }

    @Override // o.V71, java.util.Iterator
    public Object next() {
        return this.X.next();
    }

    @Override // o.V71, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }

    @Override // o.V71
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("setValue() is not supported");
    }
}
