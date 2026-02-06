package o;

import java.io.Serializable;
import java.util.Iterator;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* loaded from: classes3.dex */
public final class GU1<T> extends AbstractC10587ww1<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final AbstractC10587ww1<? super T> Z;

    public GU1(AbstractC10587ww1<? super T> abstractC10587ww1) {
        this.Z = (AbstractC10587ww1) C10664xF1.E(abstractC10587ww1);
    }

    @Override // o.AbstractC10587ww1
    public <S extends T> AbstractC10587ww1<S> E() {
        return (AbstractC10587ww1<? super T>) this.Z;
    }

    @Override // o.AbstractC10587ww1, java.util.Comparator
    public int compare(@InterfaceC7894ly1 T t, @InterfaceC7894ly1 T t2) {
        return this.Z.compare(t2, t);
    }

    @Override // java.util.Comparator
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GU1) {
            return this.Z.equals(((GU1) obj).Z);
        }
        return false;
    }

    public int hashCode() {
        return -this.Z.hashCode();
    }

    @Override // o.AbstractC10587ww1
    public <E extends T> E r(Iterable<E> iterable) {
        return (E) this.Z.v(iterable);
    }

    @Override // o.AbstractC10587ww1
    public <E extends T> E s(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
        return (E) this.Z.w(e, e2);
    }

    @Override // o.AbstractC10587ww1
    public <E extends T> E t(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2, @InterfaceC7894ly1 E e3, E... eArr) {
        return (E) this.Z.x(e, e2, e3, eArr);
    }

    public String toString() {
        String valueOf = String.valueOf(this.Z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 10);
        sb.append(valueOf);
        sb.append(".reverse()");
        return sb.toString();
    }

    @Override // o.AbstractC10587ww1
    public <E extends T> E u(Iterator<E> it) {
        return (E) this.Z.y(it);
    }

    @Override // o.AbstractC10587ww1
    public <E extends T> E v(Iterable<E> iterable) {
        return (E) this.Z.r(iterable);
    }

    @Override // o.AbstractC10587ww1
    public <E extends T> E w(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2) {
        return (E) this.Z.s(e, e2);
    }

    @Override // o.AbstractC10587ww1
    public <E extends T> E x(@InterfaceC7894ly1 E e, @InterfaceC7894ly1 E e2, @InterfaceC7894ly1 E e3, E... eArr) {
        return (E) this.Z.t(e, e2, e3, eArr);
    }

    @Override // o.AbstractC10587ww1
    public <E extends T> E y(Iterator<E> it) {
        return (E) this.Z.u(it);
    }
}
