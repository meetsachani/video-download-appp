package o;

import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

@InterfaceC10420wF0(emulated = true, serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class XN0<E extends Enum<E>> extends AbstractC9481sO0<E> {
    public final transient EnumSet<E> a1;
    @SY0
    public transient int b1;

    /* loaded from: classes3.dex */
    public static class b<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;
        public final EnumSet<E> X;

        public b(EnumSet<E> enumSet) {
            this.X = enumSet;
        }

        public Object readResolve() {
            return new XN0(this.X.clone());
        }
    }

    public static AbstractC9481sO0 d0(EnumSet enumSet) {
        int size = enumSet.size();
        if (size != 0) {
            if (size != 1) {
                return new XN0(enumSet);
            }
            return AbstractC9481sO0.Q(C5098aU0.z(enumSet));
        }
        return AbstractC9481sO0.M();
    }

    @Override // o.AbstractC9481sO0
    public boolean L() {
        return true;
    }

    @Override // o.TN0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@MB Object obj) {
        return this.a1.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof XN0) {
            collection = ((XN0) collection).a1;
        }
        return this.a1.containsAll(collection);
    }

    @Override // o.AbstractC9481sO0, java.util.Collection, java.util.Set
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof XN0) {
            obj = ((XN0) obj).a1;
        }
        return this.a1.equals(obj);
    }

    @Override // o.AbstractC9481sO0, java.util.Collection, java.util.Set
    public int hashCode() {
        int i = this.b1;
        if (i == 0) {
            int hashCode = this.a1.hashCode();
            this.b1 = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.a1.isEmpty();
    }

    @Override // o.TN0
    public boolean j() {
        return false;
    }

    @Override // o.AbstractC9481sO0, o.TN0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: k */
    public AbstractC6237fB2<E> iterator() {
        return C7052iU0.e0(this.a1.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.a1.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.a1.toString();
    }

    @Override // o.AbstractC9481sO0, o.TN0
    public Object writeReplace() {
        return new b(this.a1);
    }

    public XN0(EnumSet<E> enumSet) {
        this.a1 = enumSet;
    }
}
