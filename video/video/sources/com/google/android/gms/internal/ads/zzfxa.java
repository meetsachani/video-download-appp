package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class zzfxa extends AbstractCollection {
    public final Collection X;
    public final zzfvd Y;

    public zzfxa(Collection collection, zzfvd zzfvdVar) {
        this.X = collection;
        this.Y = zzfvdVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zzfvc.e(this.Y.b(obj));
        return this.X.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        for (Object obj : collection) {
            zzfvc.e(this.Y.b(obj));
        }
        return this.X.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        zzfyi.b(this.X, this.Y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (zzfxb.a(this.X, obj)) {
            return this.Y.b(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        zzfvd zzfvdVar = this.Y;
        zzfvc.c(zzfvdVar, "predicate");
        int i = 0;
        for (Object obj : this.X) {
            if (zzfvdVar.b(obj)) {
                if (i != -1) {
                    return false;
                }
                return true;
            }
            i++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.X.iterator();
        it.getClass();
        zzfvd zzfvdVar = this.Y;
        zzfvdVar.getClass();
        return new zzfyj(it, zzfvdVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (contains(obj) && this.X.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.X.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.Y.b(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.X.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.Y.b(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = 0;
        for (Object obj : this.X) {
            if (this.Y.b(obj)) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfym.c(arrayList, it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        zzfym.c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
