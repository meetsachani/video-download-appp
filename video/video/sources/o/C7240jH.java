package o;

import java.io.Serializable;
import java.util.Comparator;

@InterfaceC10420wF0(serializable = true)
@InterfaceC6329fa0
/* renamed from: o.jH  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7240jH<T> extends AbstractC10587ww1<T> implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator<T> Z;

    public C7240jH(Comparator<T> comparator) {
        this.Z = (Comparator) C10664xF1.E(comparator);
    }

    @Override // o.AbstractC10587ww1, java.util.Comparator
    public int compare(@InterfaceC7894ly1 T t, @InterfaceC7894ly1 T t2) {
        return this.Z.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(@MB Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7240jH) {
            return this.Z.equals(((C7240jH) obj).Z);
        }
        return false;
    }

    public int hashCode() {
        return this.Z.hashCode();
    }

    public String toString() {
        return this.Z.toString();
    }
}
