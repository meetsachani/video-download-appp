package o;

/* renamed from: o.x2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10610x2 implements InterfaceC10098uw1 {
    public final InterfaceC10098uw1 X;

    public C10610x2(InterfaceC10098uw1 interfaceC10098uw1) {
        if (interfaceC10098uw1 != null) {
            this.X = interfaceC10098uw1;
            return;
        }
        throw new IllegalArgumentException("OrderedMapIterator must not be null");
    }

    public InterfaceC10098uw1 b() {
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
        this.X.remove();
    }

    @Override // o.V71
    public Object setValue(Object obj) {
        return this.X.setValue(obj);
    }
}
