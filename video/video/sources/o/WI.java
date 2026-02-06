package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o.II;

/* loaded from: classes4.dex */
public class WI extends II implements Set {

    /* loaded from: classes4.dex */
    public interface a extends II.a {
        void b(WI wi, Set set, Set set2, Collection collection);
    }

    public WI() {
    }

    @Override // o.II
    public synchronized void d(Collection collection) {
        try {
            if (collection instanceof Set) {
                for (Set set : h()) {
                    Collection w = C6991iF.w(set, collection);
                    if (w.size() > 0) {
                        II.a aVar = this.X;
                        if (aVar != null) {
                            if (aVar instanceof a) {
                                ((a) aVar).b(this, set, (Set) collection, w);
                                if (C6991iF.w(set, collection).size() > 0) {
                                    throw new IllegalArgumentException("Attempt to add illegal entry unresolved by SetMutator.resolveCollision()");
                                }
                            } else {
                                throw new UnsupportedOperationException("Collision adding composited collection to a CompositeSet with a CollectionMutator instead of a SetMutator");
                            }
                        } else {
                            throw new UnsupportedOperationException("Collision adding composited collection with no SetMutator set");
                        }
                    }
                }
                super.f(new Collection[]{collection});
            } else {
                throw new IllegalArgumentException("Collections added must implement java.util.Set");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // o.II
    public synchronized void e(Collection collection, Collection collection2) {
        if (collection instanceof Set) {
            if (collection2 instanceof Set) {
                f(new Set[]{(Set) collection, (Set) collection2});
            } else {
                throw new IllegalArgumentException("Argument must implement java.util.Set");
            }
        } else {
            throw new IllegalArgumentException("Argument must implement java.util.Set");
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (set.containsAll(this) && set.size() == size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.II
    public synchronized void f(Collection[] collectionArr) {
        for (int length = collectionArr.length - 1; length >= 0; length--) {
            d(collectionArr[length]);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int i;
        Iterator it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    @Override // o.II
    public void j(II.a aVar) {
        super.j(aVar);
    }

    @Override // o.II, java.util.Collection
    public boolean remove(Object obj) {
        for (Set set : h()) {
            if (set.contains(obj)) {
                return set.remove(obj);
            }
        }
        return false;
    }

    public WI(Set set) {
        super(set);
    }

    public WI(Set[] setArr) {
        super(setArr);
    }
}
