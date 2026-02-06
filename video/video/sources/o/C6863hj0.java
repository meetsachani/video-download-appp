package o;

import java.io.Serializable;
import java.util.List;
import o.AbstractC10587ww1;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* renamed from: o.hj0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6863hj0<T> extends AbstractC10587ww1<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final AbstractC6044eO0<T, Integer> Z;

    public C6863hj0(List<T> list) {
        this(C7935m81.Q(list));
    }

    public final int H(T t) {
        Integer num = this.Z.get(t);
        if (num != null) {
            return num.intValue();
        }
        throw new AbstractC10587ww1.c(t);
    }

    @Override // o.AbstractC10587ww1, java.util.Comparator
    public int compare(T t, T t2) {
        return H(t) - H(t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@MB Object obj) {
        if (obj instanceof C6863hj0) {
            return this.Z.equals(((C6863hj0) obj).Z);
        }
        return false;
    }

    public int hashCode() {
        return this.Z.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.Z.keySet());
        StringBuilder sb = new StringBuilder(valueOf.length() + 19);
        sb.append("Ordering.explicit(");
        sb.append(valueOf);
        sb.append(C9811tl1.d);
        return sb.toString();
    }

    public C6863hj0(AbstractC6044eO0<T, Integer> abstractC6044eO0) {
        this.Z = abstractC6044eO0;
    }
}
