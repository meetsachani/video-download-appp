package o;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* renamed from: o.yZ0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10981yZ0<T> extends AbstractC10587ww1<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator<? super T> Z;

    public C10981yZ0(Comparator<? super T> comparator) {
        this.Z = comparator;
    }

    @Override // o.AbstractC10587ww1, java.util.Comparator
    /* renamed from: H */
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable2.iterator();
        for (T t : iterable) {
            if (!it.hasNext()) {
                return 1;
            }
            int compare = this.Z.compare(t, it.next());
            if (compare != 0) {
                return compare;
            }
        }
        if (it.hasNext()) {
            return -1;
        }
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C10981yZ0) {
            return this.Z.equals(((C10981yZ0) obj).Z);
        }
        return false;
    }

    public int hashCode() {
        return this.Z.hashCode() ^ 2075626741;
    }

    public String toString() {
        String valueOf = String.valueOf(this.Z);
        StringBuilder sb = new StringBuilder(valueOf.length() + 18);
        sb.append(valueOf);
        sb.append(".lexicographical()");
        return sb.toString();
    }
}
