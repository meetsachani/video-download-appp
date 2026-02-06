package o;

/* loaded from: classes4.dex */
public final class AB2 implements InterfaceC10098uw1, RA2 {
    public InterfaceC10098uw1 X;

    public AB2(InterfaceC10098uw1 interfaceC10098uw1) {
        this.X = interfaceC10098uw1;
    }

    public static InterfaceC10098uw1 b(InterfaceC10098uw1 interfaceC10098uw1) {
        if (interfaceC10098uw1 != null) {
            if (interfaceC10098uw1 instanceof RA2) {
                return interfaceC10098uw1;
            }
            return new AB2(interfaceC10098uw1);
        }
        throw new IllegalArgumentException("OrderedMapIterator must not be null");
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

    @Override // o.InterfaceC10098uw1, o.InterfaceC9127qw1
    public boolean hasPrevious() {
        return this.X.hasPrevious();
    }

    @Override // o.V71, java.util.Iterator
    public Object next() {
        return this.X.next();
    }

    @Override // o.InterfaceC10098uw1, o.InterfaceC9127qw1
    public Object previous() {
        return this.X.previous();
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
