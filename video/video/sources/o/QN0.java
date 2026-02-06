package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public abstract class QN0<E> extends AbstractC5317bO0<E> {

    @InterfaceC11149zF0
    /* loaded from: classes3.dex */
    public static class a implements Serializable {
        private static final long serialVersionUID = 0;
        public final TN0<?> X;

        public a(TN0<?> tn0) {
            this.X = tn0;
        }

        public Object readResolve() {
            return this.X.d();
        }
    }

    @InterfaceC11149zF0
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // o.AbstractC5317bO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        return p0().contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return p0().isEmpty();
    }

    @Override // o.TN0
    public boolean j() {
        return p0().j();
    }

    public abstract TN0<E> p0();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return p0().size();
    }

    @Override // o.AbstractC5317bO0, o.TN0
    @InterfaceC11149zF0
    public Object writeReplace() {
        return new a(p0());
    }
}
