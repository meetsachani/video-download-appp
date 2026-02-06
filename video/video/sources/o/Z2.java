package o;

import java.util.Set;

/* loaded from: classes4.dex */
public abstract class Z2<E> extends AbstractC8162n0<E> implements Set<E> {
    private static final long serialVersionUID = -4678668309576958546L;

    public Z2() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this && !d().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // o.AbstractC8162n0
    /* renamed from: f */
    public Set<E> d() {
        return (Set) super.d();
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return d().hashCode();
    }

    public Z2(Set<E> set) {
        super(set);
    }
}
