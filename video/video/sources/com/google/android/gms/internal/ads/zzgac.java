package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class zzgac extends AbstractSet {
    private zzgac() {
        throw null;
    }

    public static int h(Set set) {
        if (set instanceof zzgac) {
            return ((zzgac) set).d();
        }
        return set.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract int d();

    public abstract int e();

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        int h;
        int size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || (h = h((set = (Set) obj))) < 0) {
            return false;
        }
        if (set instanceof zzgac) {
            ((zzgac) set).e();
            size = 0;
        } else {
            size = set.size();
        }
        if (d() < size) {
            return false;
        }
        zzgai it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
            i++;
        }
        if (i == h) {
            return true;
        }
        if (i < size) {
            return false;
        }
        Iterator it2 = set.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            i2++;
            if (i2 > i) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: f */
    public abstract zzgai iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ zzgac(zzgad zzgadVar) {
    }
}
