package o;

import java.util.Set;

/* renamed from: o.eG1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6013eG1<E> extends VF1<E> implements Set<E> {
    private static final long serialVersionUID = -684521469108685117L;

    public C6013eG1(Set<E> set, KF1<? super E> kf1) {
        super(set, kf1);
    }

    public static <E> C6013eG1<E> l(Set<E> set, KF1<? super E> kf1) {
        return new C6013eG1<>(set, kf1);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj != this && !d().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return d().hashCode();
    }

    @Override // o.AbstractC8162n0
    /* renamed from: k */
    public Set<E> d() {
        return (Set) super.d();
    }
}
