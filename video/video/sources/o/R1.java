package o;

/* loaded from: classes4.dex */
public class R1 implements V71 {
    public final V71 X;

    public R1(V71 v71) {
        if (v71 != null) {
            this.X = v71;
            return;
        }
        throw new IllegalArgumentException("MapIterator must not be null");
    }

    public V71 b() {
        return this.X;
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
        this.X.remove();
    }

    @Override // o.V71
    public Object setValue(Object obj) {
        return this.X.setValue(obj);
    }
}
