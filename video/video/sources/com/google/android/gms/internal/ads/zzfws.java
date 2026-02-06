package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfws extends AbstractCollection {
    public final Object X;
    public Collection Y;
    public final Collection Y0;
    public final zzfws Z;
    public final /* synthetic */ zzfwv Z0;

    public zzfws(zzfwv zzfwvVar, Object obj, Collection collection, zzfws zzfwsVar) {
        Collection collection2;
        this.Z0 = zzfwvVar;
        this.X = obj;
        this.Y = collection;
        this.Z = zzfwsVar;
        if (zzfwsVar == null) {
            collection2 = null;
        } else {
            collection2 = zzfwsVar.Y;
        }
        this.Y0 = collection2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        b();
        boolean isEmpty = this.Y.isEmpty();
        boolean add = this.Y.add(obj);
        if (add) {
            zzfwv zzfwvVar = this.Z0;
            i = zzfwvVar.Z0;
            zzfwvVar.Z0 = i + 1;
            if (isEmpty) {
                d();
                return true;
            }
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.Y.addAll(collection);
        if (addAll) {
            int size2 = this.Y.size();
            zzfwv zzfwvVar = this.Z0;
            i = zzfwvVar.Z0;
            zzfwvVar.Z0 = i + (size2 - size);
            if (size == 0) {
                d();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    public final void b() {
        Map map;
        zzfws zzfwsVar = this.Z;
        if (zzfwsVar != null) {
            zzfwsVar.b();
            if (zzfwsVar.Y != this.Y0) {
                throw new ConcurrentModificationException();
            }
        } else if (this.Y.isEmpty()) {
            zzfwv zzfwvVar = this.Z0;
            Object obj = this.X;
            map = zzfwvVar.Y0;
            Collection collection = (Collection) map.get(obj);
            if (collection != null) {
                this.Y = collection;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i;
        int size = size();
        if (size == 0) {
            return;
        }
        this.Y.clear();
        zzfwv zzfwvVar = this.Z0;
        i = zzfwvVar.Z0;
        zzfwvVar.Z0 = i - size;
        e();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.Y.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.Y.containsAll(collection);
    }

    public final void d() {
        Map map;
        zzfws zzfwsVar = this.Z;
        if (zzfwsVar != null) {
            zzfwsVar.d();
            return;
        }
        zzfwv zzfwvVar = this.Z0;
        Object obj = this.X;
        map = zzfwvVar.Y0;
        map.put(obj, this.Y);
    }

    public final void e() {
        Map map;
        zzfws zzfwsVar = this.Z;
        if (zzfwsVar != null) {
            zzfwsVar.e();
        } else if (this.Y.isEmpty()) {
            zzfwv zzfwvVar = this.Z0;
            Object obj = this.X;
            map = zzfwvVar.Y0;
            map.remove(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.Y.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.Y.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new zzfwr(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        b();
        boolean remove = this.Y.remove(obj);
        if (remove) {
            zzfwv zzfwvVar = this.Z0;
            i = zzfwvVar.Z0;
            zzfwvVar.Z0 = i - 1;
            e();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.Y.removeAll(collection);
        if (removeAll) {
            int size2 = this.Y.size();
            zzfwv zzfwvVar = this.Z0;
            int i2 = size2 - size;
            i = zzfwvVar.Z0;
            zzfwvVar.Z0 = i + i2;
            e();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        collection.getClass();
        int size = size();
        boolean retainAll = this.Y.retainAll(collection);
        if (retainAll) {
            int size2 = this.Y.size();
            zzfwv zzfwvVar = this.Z0;
            int i2 = size2 - size;
            i = zzfwvVar.Z0;
            zzfwvVar.Z0 = i + i2;
            e();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.Y.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.Y.toString();
    }
}
