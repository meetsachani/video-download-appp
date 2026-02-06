package o;

@InterfaceC10420wF0(emulated = true)
@InterfaceC6329fa0
/* renamed from: o.rP0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9242rP0<E> extends AbstractC9481sO0<E> {

    /* renamed from: o.rP0$a */
    /* loaded from: classes3.dex */
    public class a extends AbstractC5317bO0<E> {
        public a() {
        }

        @Override // java.util.List
        public E get(int i) {
            return (E) AbstractC9242rP0.this.get(i);
        }

        @Override // o.TN0
        public boolean j() {
            return AbstractC9242rP0.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return AbstractC9242rP0.this.size();
        }
    }

    @Override // o.AbstractC9481sO0
    public AbstractC5317bO0<E> K() {
        return new a();
    }

    @Override // o.TN0
    @InterfaceC11149zF0
    public int e(Object[] objArr, int i) {
        return d().e(objArr, i);
    }

    public abstract E get(int i);

    @Override // o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<E> iterator() {
        return d().iterator();
    }
}
