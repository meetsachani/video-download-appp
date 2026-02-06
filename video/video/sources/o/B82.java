package o;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class B82<E> extends AbstractC9481sO0<E> {
    public final transient E a1;

    public B82(E e) {
        this.a1 = (E) C10664xF1.E(e);
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        return this.a1.equals(obj);
    }

    @Override // o.AbstractC9481sO0, o.TN0
    public AbstractC5317bO0<E> d() {
        return AbstractC5317bO0.M(this.a1);
    }

    @Override // o.TN0
    public int e(Object[] objArr, int i) {
        objArr[i] = this.a1;
        return i + 1;
    }

    @Override // o.AbstractC9481sO0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.a1.hashCode();
    }

    @Override // o.TN0
    public boolean j() {
        return false;
    }

    @Override // o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<E> iterator() {
        return C7052iU0.Y(this.a1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.a1.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
